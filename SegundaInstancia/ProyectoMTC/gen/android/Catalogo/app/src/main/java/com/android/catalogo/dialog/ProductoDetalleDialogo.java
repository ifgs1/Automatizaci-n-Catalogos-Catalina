package com.android.catalogo.dialog;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.catalogo.R;
import com.android.catalogo.model.Producto;
import com.android.catalogo.utilities.Utilities;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.ImageSize;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;

/**
 * Clase que muestra el detalle de in producto
 */
@SuppressLint("InflateParams")
public class ProductoDetalleDialogo {

    private Activity activity;
    private Producto producto;
    private int size;

    public ProductoDetalleDialogo(Activity activity, Producto producto) {
        this.activity = activity;
        this.producto = producto;
        cargarImagenReferencia();
    }

    public void mostrarDetalleProducto(){
        LayoutInflater inflater = activity.getLayoutInflater();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        View view = inflater.inflate(R.layout.producto_detalle_dialogo, null);
        builder.setView(view);

        

        
        
			
		TextView textViewnombre = (TextView) view.findViewById(R.id.Producto_TextView_Detalle_nombre);
        textViewnombre.setText(producto.getnombre());
        Utilities.cargarLetra(activity,textViewnombre);	
			
	    TextView textViewprecio = (TextView) view.findViewById(R.id.Producto_TextView_Detalle_precio);
        textViewprecio.setText(Utilities.doubleToMoneyFormat(producto.getprecio()));
        		    

				
        final ImageView imageViewProducto = (ImageView) view.findViewById(R.id.Producto_Detalle_ImageView);
        DisplayImageOptions displayImageOptions = new DisplayImageOptions.Builder()
                .showImageOnLoading(R.mipmap.ic_launcher)
                .showImageForEmptyUri(R.mipmap.ic_launcher)
                .showImageOnFail(R.mipmap.ic_launcher)
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .considerExifParams(true).build();

        ImageSize targetSize = new ImageSize(size, size);
        ImageLoader.getInstance().loadImage(producto.getimagen(), targetSize, displayImageOptions, new SimpleImageLoadingListener() {
            @Override
            public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
                imageViewProducto.setImageBitmap(loadedImage);
            }
        });

        builder.setNeutralButton(R.string.ok,
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

        builder.create().show();
    }

    private void cargarImagenReferencia() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(activity.getResources(), R.mipmap.ic_launcher, options);
        size = 3*options.outWidth;
    }
}
