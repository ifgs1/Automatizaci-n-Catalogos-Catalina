package mapper;

import java.util.ArrayList;
import java.util.List;
import entities.Empresa;
import json.EmpresaJson;
import entities.Catalogo;
import entities.Categoria;
import json.CatalogoJson;
import json.CategoriaJson;
import entities.Categoria;
import entities.Producto;
import json.CategoriaJson;
import json.ProductoJson;
import entities.Producto;
import json.ProductoJson;

public class EmpresaJsonMapper {
		public static EmpresaJson convertToEmpresaJson(Empresa e){
			EmpresaJson empresaJson = new EmpresaJson();
			
			empresaJson.setCatalogoId(e.getCatalogo().getId());
			empresaJson.setNombre(e.getNombre());
			empresaJson.setDireccion(e.getDireccion());
			empresaJson.setEmail(e.getEmail());
			empresaJson.setTelefono(e.getTelefono());
			empresaJson.setDescripcion(e.getDescripcion());
			empresaJson.setUrlImagen(e.getUrlImagen());
		return empresaJson;
		}
	
}