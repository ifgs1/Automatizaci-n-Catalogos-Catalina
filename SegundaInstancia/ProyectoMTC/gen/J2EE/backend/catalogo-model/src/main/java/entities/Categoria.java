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
@NamedQuery(name="Categoria.findAll", query="SELECT c FROM Categoria c")
})
public class Categoria implements Serializable{

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
	  	
	@ManyToOne(fetch=FetchType.EAGER)
	private Catalogo catalogo;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="categoria")
	private List<Producto> productos;
	
	public Catalogo getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(Catalogo catalogo) {
		this.catalogo = catalogo;
	}

	public List<Producto> getProductos() {
		if(productos == null){
			productos = new ArrayList<Producto>();
		}
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

}