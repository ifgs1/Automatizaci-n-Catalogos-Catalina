package com.android.catalogo.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import com.android.catalogo.R;
import com.android.catalogo.model.Categoria;
import com.android.catalogo.utilities.Utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Clase que se encarga de pintar una categoría
 */
public class CategoriaAdapter extends ArrayAdapter<Categoria> implements Filterable {

    private CategoriaFilter categoriaFilter = new CategoriaFilter();
    private List<Categoria> categorias;
    private List<Categoria> categoriasFiltradas;
    private LayoutInflater layoutInflater;

    public CategoriaAdapter(Context context, List<Categoria> categorias) {
        super(context, 0, categorias);
        if (categorias != null) {
            this.categorias = categorias;
            this.categoriasFiltradas = categorias;
        } else {
            this.categorias = new ArrayList<>();
            this.categoriasFiltradas = new ArrayList<>();
        }
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return categoriasFiltradas.size();
    }

    @Override
    public Categoria getItem(int position) {
        return categoriasFiltradas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Filter getFilter() {
        return categoriaFilter;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.categoria_item, null);

            ViewHolder viewHolder = new ViewHolder();
            viewHolder.textViewCategoria = (TextView) view.findViewById(R.id.Categoria_Item_TextView_Nombre);
            view.setTag(viewHolder);
        }

        ViewHolder holder = (ViewHolder) view.getTag();
        Categoria categoria = getItem(position);

        holder.textViewCategoria.setText(categoria.getnombre());
        Utilities.cargarLetra(getContext(),holder.textViewCategoria);
        return view;
    }

    static class ViewHolder {
        TextView textViewCategoria;
    }

    class CategoriaFilter extends Filter {

        protected FilterResults performFiltering(CharSequence textoBuscadoChar) {

            String textoBuscado = textoBuscadoChar.toString().toUpperCase(Locale.getDefault());
            FilterResults results = new FilterResults();

            final List<Categoria> categoriasBuscadas = new ArrayList<>();

            for (Categoria c : categorias) {
                String nombre = c.getnombre().toUpperCase(Locale.getDefault());
                if (nombre.contains(textoBuscado)){
                    categoriasBuscadas.add(c);
                }
            }

            results.values = categoriasBuscadas;
            results.count = categoriasBuscadas.size();

            return results;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void publishResults(CharSequence textoBuscado, FilterResults results) {
            categoriasFiltradas = (List<Categoria>) results.values;
            notifyDataSetChanged();
        }
    }
}


