package com.android.catalogo.application;

import android.app.Application;

import com.android.catalogo.model.Categoria;
import com.android.catalogo.model.Empresa;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.util.List;

/**
 * Aplicación global de catálogo
 */
public class CatalogoApplication extends Application{

    private Empresa empresa;
    private List<Categoria> catalogo;


    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoader.getInstance().init(ImageLoaderConfiguration.createDefault(this));
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Categoria> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(List<Categoria> catalogo) {
        this.catalogo = catalogo;
    }
}
