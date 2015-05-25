package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity

@NamedQueries({
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p"),
@NamedQuery(name="Producto.findByCategoria", query="SELECT p FROM Producto p where p.categoria=:categoria")
})
public class Producto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long id;
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
	    this.id = id;
	}
	
	
	private String nombre;
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	  	
	
	private double precio;
	
	public double getPrecio(){
		return precio;
	}
	
	public void setPrecio(double precio){
		this.precio = precio;
	}
	  	
	
	private String imagen;
	
	public String getImagen(){
		return imagen;
	}
	
	public void setImagen(String imagen){
		this.imagen = imagen;
	}
	  	
	@ManyToOne(fetch=FetchType.EAGER)
	private Categoria categoria;
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}