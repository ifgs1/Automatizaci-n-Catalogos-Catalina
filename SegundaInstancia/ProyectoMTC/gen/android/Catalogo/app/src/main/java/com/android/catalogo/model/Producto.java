 
package com.android.catalogo.model;

import java.io.Serializable;

/**
 * Producto del catálogo de la empresa
 */
public class Producto  implements Serializable {

	private String nombre;
	private Double precio;
	private String imagen;
	private String promocion;

    public Producto( String nombre ,  Double precio ,  String imagen ,  String promocion) {
		this.nombre = nombre;
		this.precio = precio;
		this.imagen = imagen;
		this.promocion = promocion;
    }

	
	public String getnombre() {
        return nombre;
    }
    
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
		
	
	public Double getprecio() {
        return precio;
    }
    
    public void setprecio(Double precio) {
        this.precio = precio;
    }
		
	
	public String getimagen() {
        return imagen;
    }
    
    public void setimagen(String imagen) {
        this.imagen = imagen;
    }
		
	
	public String getpromocion() {
        return promocion;
    }
    
    public void setpromocion(String promocion) {
        this.promocion = promocion;
    }
		
	
} 