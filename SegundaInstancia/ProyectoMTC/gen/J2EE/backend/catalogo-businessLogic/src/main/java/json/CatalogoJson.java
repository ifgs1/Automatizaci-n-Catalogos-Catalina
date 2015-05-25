package json;

import java.util.List;

public class CatalogoJson{
	
	private Long id;
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	private Long empresaId;
	
	private List<CategoriaJson> categorias;
		
	public Long getEmpresaId() {
		return empresaId;
	}

	public void setEmpresaId(Long empresaId) {
		this.empresaId = empresaId;
	}

	public List<CategoriaJson> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<CategoriaJson> categorias) {
		this.categorias = categorias;
	}
		
		private String nombre;
	
		public String getNombre(){
			return nombre;
		}
		public void setNombre(String nombre){
		this.nombre = nombre;
		}

}