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
@NamedQuery(name="Empresa.findAll", query="SELECT e FROM Empresa e")
})
public class Empresa implements Serializable{

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
	  	
	
	private String direccion;
	
	public String getDireccion(){
		return direccion;
	}
	
	public void setDireccion(String direccion){
		this.direccion = direccion;
	}
	  	
	
	private String email;
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	  	
	
	private String telefono;
	
	public String getTelefono(){
		return telefono;
	}
	
	public void setTelefono(String telefono){
		this.telefono = telefono;
	}
	  	
	
	private String descripcion;
	
	public String getDescripcion(){
		return descripcion;
	}
	
	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}
	  	
	
	private String urlImagen;
	
	public String getUrlImagen(){
		return urlImagen;
	}
	
	public void setUrlImagen(String urlImagen){
		this.urlImagen = urlImagen;
	}
	  	
	@OneToOne(fetch=FetchType.EAGER)
	private Catalogo catalogo;
	
	public Catalogo getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(Catalogo catalogo) {
		this.catalogo = catalogo;
	}

}