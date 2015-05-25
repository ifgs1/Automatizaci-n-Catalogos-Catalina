package com.android.catalogo.fragments;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.android.catalogo.R;
import com.android.catalogo.activities.ProductosActivity;
import com.android.catalogo.adapters.ProductoAdapter;
import com.android.catalogo.dialog.ProductoDetalleDialogo;
import com.android.catalogo.model.Producto;

/**
 * Fragmento con la lista de productos de una categoría
 */
public class ProductosFragment extends Fragment implements SearchView.OnQueryTextListener, SearchView.OnCloseListener{

    View view;
    ListView listViewProductos;
    ProductoAdapter productoAdapter;

    ProductosActivity productosActivity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }
    

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Menu_Search_Productos:
                SearchView searchView = (SearchView) MenuItemCompat.getActionView(item);
                SearchManager searchManager = (SearchManager) getActivity().getSystemService(Context.SEARCH_SERVICE);
                searchView.setSearchableInfo(searchManager.getSearchableInfo(getActivity().getComponentName()));
                searchView.setQueryHint(getResources().getString(R.string.hint_search));
                searchView.setOnQueryTextListener(this);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onClose() {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String texto) {
        productoAdapter.getFilter().filter(texto);
        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String texto) {
        productoAdapter.getFilter().filter(texto);
        return true;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.productos_fragment, container, false);
        productosActivity = (ProductosActivity) getActivity();
        cargarProductos();
        cargarListeners();
        return view;
    }


    private void cargarProductos() {
        if(productosActivity.getCategoria() != null){
            cargarInterfazGrafica();
        }
    }

    private void cargarInterfazGrafica() {
        listViewProductos = (ListView) view.findViewById(R.id.Productos_ListView);
        productoAdapter = new ProductoAdapter(getActivity(), productosActivity.getCategoria().getProductoList());
        listViewProductos.setAdapter(productoAdapter);
    }

    private void cargarListeners() {
        listViewProductos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Producto producto = productoAdapter.getItem(position);
                ProductoDetalleDialogo productoDetalleDialogo = new ProductoDetalleDialogo(getActivity(),producto);
                productoDetalleDialogo.mostrarDetalleProducto();
            }
        });
    }
}

