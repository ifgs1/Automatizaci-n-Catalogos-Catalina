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

public class ProductoJsonMapper {
		public static ProductoJson convertToProductoJson(Producto p){
			ProductoJson productoJson = new ProductoJson();
			productoJson.setId(p.getId()); 
			
			productoJson.setCategoriaId(p.getCategoria().getId());
			productoJson.setNombre(p.getNombre());
			productoJson.setPrecio(p.getPrecio());
			productoJson.setImagen(p.getImagen());
			productoJson.setPromocion(p.getPromocion());
		return productoJson;
		}
	
}