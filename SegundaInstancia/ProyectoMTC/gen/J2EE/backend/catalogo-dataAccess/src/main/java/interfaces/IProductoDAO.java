package interfaces;

import java.util.List;

import entities.Empresa;
import entities.Catalogo;
import entities.Categoria;
import entities.Producto;

public interface IProductoDAO {
	
	public List<Producto> getAllProducto();
	
	public Producto getProducto(Long id);
}