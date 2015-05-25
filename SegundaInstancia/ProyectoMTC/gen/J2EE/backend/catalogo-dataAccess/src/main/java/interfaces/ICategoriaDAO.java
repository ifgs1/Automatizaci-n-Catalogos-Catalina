package interfaces;

import java.util.List;

import entities.Empresa;
import entities.Catalogo;
import entities.Categoria;
import entities.Producto;

public interface ICategoriaDAO {
	
	public List<Categoria> getAllCategoria();
	
	public Categoria getCategoria(Long id);
}