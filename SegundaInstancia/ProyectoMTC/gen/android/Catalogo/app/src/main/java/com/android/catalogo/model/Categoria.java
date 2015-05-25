package com.android.catalogo.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Categoría del catálogo de la empresa
 */
public class Categoria implements Serializable{

	private static final String CATEGORIAS = "categorias";
    private static final String PRODUCTOS = "productos";
    
	private static final String PRODUCTO_NOMBRE = "nombre";
	
	private static final String PRODUCTO_PRECIO = "precio";
	
	private static final String PRODUCTO_IMAGEN = "imagen";
	

	private static final String CATEGORIA_ID = "id";
	
	private static final String CATEGORIA_NOMBRE = "nombre";
	
	
	private List<Producto> productoList = new ArrayList<>();
	
	private Long id;
	private String nombre;

    public Categoria(List<Producto> productoList, Long id ,  String nombre) {
		this.productoList = productoList;
		this.id = id;
		this.nombre = nombre;
    }

	public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

	
	public Long getid() {
        return id;
    }
    
    public void setid(Long id) {
        this.id = id;
    }
		
	
	public String getnombre() {
        return nombre;
    }
    
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
		

    public static List<Categoria> jsonToCatalogo(JSONObject jsonObject) throws Exception{

        List<Categoria> catalogo = new ArrayList<>();

        JSONArray jsonArrayCategorias = jsonObject.getJSONArray(CATEGORIAS);
        for(int i = 0; i<jsonArrayCategorias.length();i++){
            JSONObject jsonObjectCategoria = jsonArrayCategorias.getJSONObject(i);
            
		    	Long categoria_id = jsonObjectCategoria.getLong(CATEGORIA_ID);
		    	String categoria_nombre = jsonObjectCategoria.getString(CATEGORIA_NOMBRE);

            List<Producto> productoList = new ArrayList<>();
            JSONArray jsonArrayProductos =  jsonObjectCategoria.getJSONArray(PRODUCTOS);
            for(int j = 0; j<jsonArrayProductos.length();j++){
                JSONObject jsonObjectProducto = jsonArrayProductos.getJSONObject(j);
                
				String producto_nombre =  jsonObjectProducto.getString(PRODUCTO_NOMBRE);
				Double producto_precio =  jsonObjectProducto.getDouble(PRODUCTO_PRECIO);
				String producto_imagen =  jsonObjectProducto.getString(PRODUCTO_IMAGEN);
			
                productoList.add(new Producto( producto_nombre ,  producto_precio ,  producto_imagen));

            }
            Categoria categoria = new Categoria(productoList, categoria_id ,  categoria_nombre);
            catalogo.add(categoria);
        }

        return catalogo;
    }
}
