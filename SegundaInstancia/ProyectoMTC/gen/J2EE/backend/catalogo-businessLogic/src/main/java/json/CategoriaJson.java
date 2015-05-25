package json;

import java.util.List;

public class CategoriaJson{
	
	private Long id;
	
	private Long getId(){
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	private Long catalogoId;
	
	private List<ProductoJson> productos;
	
	public Long getCatalogoId() {
		return catalogoId;
	}

	public void setCatalogoId(Long catalogoId) {
		this.catalogoId = catalogoId;
	}

	public List<ProductoJson> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoJson> productos) {
		this.productos = productos;
	}
		
		private String nombre;
	
		public String getNombre(){
			return nombre;
		}
		public void setNombre(String nombre){
		this.nombre = nombre;
		}

}