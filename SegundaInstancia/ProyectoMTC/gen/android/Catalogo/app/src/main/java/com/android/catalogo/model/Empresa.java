 
package com.android.catalogo.model;

import org.json.JSONObject;

import java.io.Serializable;

/**
 * Empresa que ofrece el catálogo
 */
public class Empresa implements Serializable {

	private static final String NOMBRE = "nombre";
	
	private static final String DIRECCION = "direccion";
	
	private static final String EMAIL = "email";
	
	private static final String TELEFONO = "telefono";
	
	private static final String DESCRIPCION = "descripcion";
	
	private static final String URLIMAGEN = "urlImagen";
	
	private String nombre;
	private String direccion;
	private String email;
	private String telefono;
	private String descripcion;
	private String urlImagen;

    public Empresa( String nombre ,  String direccion ,  String email ,  String telefono ,  String descripcion ,  String urlImagen) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.email = email;
		this.telefono = telefono;
		this.descripcion = descripcion;
		this.urlImagen = urlImagen;
    }

	
	public String getnombre() {
        return nombre;
    }
    
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
		
	
	public String getdireccion() {
        return direccion;
    }
    
    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }
		
	
	public String getemail() {
        return email;
    }
    
    public void setemail(String email) {
        this.email = email;
    }
		
	
	public String gettelefono() {
        return telefono;
    }
    
    public void settelefono(String telefono) {
        this.telefono = telefono;
    }
		
	
	public String getdescripcion() {
        return descripcion;
    }
    
    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
		
	
	public String geturlImagen() {
        return urlImagen;
    }
    
    public void seturlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
		
	
	
	public static Empresa jsonToEmpresa(JSONObject jsonObject) throws Exception{
		String nombre = "";
		String direccion = "";
		String email = "";
		String telefono = "";
		String descripcion = "";
		String urlImagen = "";
	
		if (jsonObject.has(NOMBRE) && jsonObject.get(NOMBRE) != JSONObject.NULL) {
            nombre = jsonObject.getString(NOMBRE);
        }
		if (jsonObject.has(DIRECCION) && jsonObject.get(DIRECCION) != JSONObject.NULL) {
            direccion = jsonObject.getString(DIRECCION);
        }
		if (jsonObject.has(EMAIL) && jsonObject.get(EMAIL) != JSONObject.NULL) {
            email = jsonObject.getString(EMAIL);
        }
		if (jsonObject.has(TELEFONO) && jsonObject.get(TELEFONO) != JSONObject.NULL) {
            telefono = jsonObject.getString(TELEFONO);
        }
		if (jsonObject.has(DESCRIPCION) && jsonObject.get(DESCRIPCION) != JSONObject.NULL) {
            descripcion = jsonObject.getString(DESCRIPCION);
        }
		if (jsonObject.has(URLIMAGEN) && jsonObject.get(URLIMAGEN) != JSONObject.NULL) {
            urlImagen = jsonObject.getString(URLIMAGEN);
        }

        return new Empresa( nombre ,  direccion ,  email ,  telefono ,  descripcion ,  urlImagen);
    }
	
} 