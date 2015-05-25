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

public class CatalogoJsonMapper {
		public static CatalogoJson convertToCatalogoJson(Catalogo c){
			CatalogoJson catalogoJson = new CatalogoJson();
			catalogoJson.setId(c.getId()); 
			
			List<CategoriaJson> categorias = new ArrayList<CategoriaJson>();
			for(Categoria c1:c.getCategorias()){
				categorias.add(CategoriaJsonMapper.convertToCategoriaJson(c1));
			}
			catalogoJson.setCategorias(categorias);
			catalogoJson.setEmpresaId(c.getEmpresa().getId());
			catalogoJson.setNombre(c.getNombre());
		return catalogoJson;
		}
	
}