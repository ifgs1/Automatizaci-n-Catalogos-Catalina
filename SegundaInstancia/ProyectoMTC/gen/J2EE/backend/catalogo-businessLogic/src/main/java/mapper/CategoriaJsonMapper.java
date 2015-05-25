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

public class CategoriaJsonMapper {
		public static CategoriaJson convertToCategoriaJson(Categoria c){
			CategoriaJson categoriaJson = new CategoriaJson();
			categoriaJson.setId(c.getId()); 
			
			List<ProductoJson> productos = new ArrayList<ProductoJson>();
			for(Producto p1 : c.getProductos()){
				productos.add(ProductoJsonMapper.convertToProductoJson(p1));
			}
			categoriaJson.setProductos(productos);
			categoriaJson.setCatalogoId(c.getCatalogo().getId());
			categoriaJson.setId(c.getId());
			categoriaJson.setNombre(c.getNombre());
		return categoriaJson;
		}
	
}