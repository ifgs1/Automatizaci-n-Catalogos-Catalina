package interfaces;

import java.util.List;

import entities.Empresa;
import entities.Catalogo;
import entities.Categoria;
import entities.Producto;

public interface ICatalogoDAO {
	
	public List<Catalogo> getAllCatalogo();
	
	public Catalogo getCatalogo(Long id);
}