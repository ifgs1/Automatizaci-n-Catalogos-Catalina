
package interfaces;

import java.util.List;

import json.CatalogoJson;
import json.EmpresaJson;
import json.CategoriaJson;
import json.ProductoJson;

public interface ICatalogo{

			
			 
			public List<EmpresaJson> getAllEmpresas();
			
			 
			public EmpresaJson getEmpresaById(Long id);
			
			 
			public List<CatalogoJson> getAllCatalogos();
			
			 
			public CatalogoJson getCatalogoById(Long id);
			
			 
			public List<CategoriaJson> getAllCategorias();
			
			 
			public CategoriaJson getCategoriaById(Long id);
			
			 
			public List<ProductoJson> getAllProductos();
			
			 
			public ProductoJson getProductoById(Long id);

	
}

