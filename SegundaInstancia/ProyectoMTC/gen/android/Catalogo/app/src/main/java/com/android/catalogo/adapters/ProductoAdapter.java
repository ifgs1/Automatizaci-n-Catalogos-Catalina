package com.android.catalogo.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.catalogo.R;
import com.android.catalogo.model.Producto;
import com.android.catalogo.utilities.Utilities;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.ImageSize;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Clase que se encarga de pintar un producto
 */
public class ProductoAdapter extends ArrayAdapter<Producto>  implements Filterable {

    private ProductoFilter productoFilter = new ProductoFilter();
    private List<Producto> productos;
    private List<Producto> productosFiltrados;
    private LayoutInflater layoutInflater;
    int size;

    public ProductoAdapter(Context context, List<Producto> productos) {
        super(context, 0, productos);
        cargarImagenReferencia();
        if (productos != null) {
            this.productos = productos;
            this.productosFiltrados = productos;
        } else {
            this.productos = new ArrayList<>();
            this.productosFiltrados = new ArrayList<>();
        }
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return productosFiltrados.size();
    }

    @Override
    public Producto getItem(int position) {
        return productosFiltrados.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Filter getFilter() {
        return productoFilter;
    }


    @SuppressLint("InflateParams")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            view = layoutInflater.inflate(R.layout.producto_item, null);

			ViewHolder viewHolder = new ViewHolder();
			viewHolder.textViewnombre = (TextView) view.findViewById(R.id.Producto_TextView_Item_nombre);
			viewHolder.imageViewProducto = (ImageView) view.findViewById(R.id.Producto_Item_ImageView);

            
            view.setTag(viewHolder);
        }

        Producto producto = getItem(position);

        final ViewHolder holder = (ViewHolder) view.getTag();

				holder.textViewnombre.setText(producto.getnombre());
				Utilities.cargarLetra(getContext(),holder.textViewnombre);	
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
                holder.imageViewProducto.setImageBitmap(loadedImage);
            }
        });		
		

        return view;
    }

    private void cargarImagenReferencia() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getContext().getResources(), R.mipmap.ic_launcher, options);
        size = options.outWidth;
    }

    static class ViewHolder {
			TextView textViewnombre;		
			ImageView imageViewProducto;
        
    }

    class ProductoFilter extends Filter {

        protected FilterResults performFiltering(CharSequence textoBuscadoChar) {

            String textoBuscado = textoBuscadoChar.toString().toUpperCase(Locale.getDefault());
            FilterResults results = new FilterResults();

            final List<Producto> productosBuscados = new ArrayList<>();

            for (Producto p : productos) {
                String nombre = p.getnombre().toUpperCase(Locale.getDefault());
                if (nombre.contains(textoBuscado)){
                    productosBuscados.add(p);
                }
            }

            results.values = productosBuscados;
            results.count = productosBuscados.size();

            return results;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void publishResults(CharSequence textoBuscado, FilterResults results) {
            productosFiltrados = (List<Producto>) results.values;
            notifyDataSetChanged();
        }
    }
}