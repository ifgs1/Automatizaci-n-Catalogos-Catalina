package com.android.catalogo.activities;

import android.os.Bundle;

import com.android.catalogo.R;
import com.android.catalogo.fragments.CategoriasFragment;
import com.android.catalogo.fragments.ProductosFragment;
import com.android.catalogo.model.Categoria;
import com.android.catalogo.utilities.Utilities;

public class ProductosActivity extends BaseActivity {

    Categoria categoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.productos_activity);
        categoria = (Categoria) getIntent().getSerializableExtra(CategoriasFragment.CATEGORIA_KEY);
        Utilities.replaceFragment(getSupportFragmentManager(),new ProductosFragment(),R.id.Productos_FrameLayout);
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
