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
@NamedQuery(name="Catalogo.findAll", query="SELECT c FROM Catalogo c")
})
public class Catalogo implements Serializable{

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
	  	
	@OneToOne(mappedBy="catalogo")
	private Empresa empresa;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="catalogo")
	private List<Categoria> categorias;
	
	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		if(categorias == null){
			categorias = new ArrayList<Categoria>();
		}
		this.categorias = categorias;
	}

}