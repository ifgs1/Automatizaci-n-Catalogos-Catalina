package json;

import java.util.List;

public class EmpresaJson{
	
	private Long id;
	
	private Long getId(){
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	private Long catalogoId;
		
	public Long getCatalogoId() {
		return catalogoId;
	}

	public void setCatalogoId(Long catalogoId) {
		this.catalogoId = catalogoId;
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

}