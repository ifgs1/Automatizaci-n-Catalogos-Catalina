package com.android.catalogo.fragments;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.catalogo.R;
import com.android.catalogo.application.CatalogoApplication;
import com.android.catalogo.asynctasks.EmpresaAsyncTask;
import com.android.catalogo.model.Empresa;
import com.android.catalogo.utilities.Utilities;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.ImageSize;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;

/**
 * Acerca de la empresa que ofrece el catálogo de productos
 */
public class AcercaDeFragment extends Fragment {

    CatalogoApplication catalogoApplication;

    View view;
    ImageView imageViewEmpresa;
    TextView textViewDescripcion;
    TextView textViewDireccion;
    TextView textViewTelefono;
    TextView textViewEmail;

    int size;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.acerca_de_fragment, container, false);
        catalogoApplication = (CatalogoApplication) getActivity().getApplication();
        cargarImagenReferencia();
        cargarEmpresa();
        return view;
    }

    private void cargarEmpresa() {
        if(catalogoApplication.getEmpresa() == null){
            new EmpresaAsyncTask(AcercaDeFragment.this).execute();
        }else{
            cargarInterfazGrafica(catalogoApplication.getEmpresa());
        }
    }

    public void cargarInterfazGrafica(Empresa empresa) {
        if(empresa != null){
            catalogoApplication.setEmpresa(empresa);

            textViewDescripcion = (TextView) view.findViewById(R.id.Acerca_De_Descripcion);
            textViewDescripcion.setText(empresa.getdescripcion());
            Utilities.cargarLetra(getActivity(),textViewDescripcion);

            textViewDireccion = (TextView) view.findViewById(R.id.Acerca_De_Direccion);
            textViewDireccion.setText(empresa.getdireccion());
            Utilities.cargarLetra(getActivity(),textViewDireccion);

            textViewTelefono = (TextView) view.findViewById(R.id.Acerca_De_Telefono);
            textViewTelefono.setText(empresa.gettelefono());
            Utilities.cargarLetra(getActivity(),textViewTelefono);

            textViewEmail = (TextView) view.findViewById(R.id.Acerca_De_Email);
            textViewEmail.setText(empresa.getemail());
            Utilities.cargarLetra(getActivity(),textViewEmail);

            imageViewEmpresa = (ImageView) view.findViewById(R.id.Acerca_De_ImageView);

            DisplayImageOptions displayImageOptions = new DisplayImageOptions.Builder()
                    .showImageOnLoading(R.mipmap.ic_launcher)
                    .showImageForEmptyUri(R.mipmap.ic_launcher)
                    .showImageOnFail(R.mipmap.ic_launcher)
                    .cacheInMemory(true)
                    .cacheOnDisk(true)
                    .considerExifParams(true).build();
            ImageSize targetSize = new ImageSize(size, size);
            ImageLoader.getInstance().loadImage(empresa.geturlImagen(), targetSize, displayImageOptions, new SimpleImageLoadingListener() {
                @Override
                public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
                    imageViewEmpresa.setImageBitmap(loadedImage);
                }
            });

        }

    }

    private void cargarImagenReferencia() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher, options);
        size = 3*options.outWidth;
    }
}
