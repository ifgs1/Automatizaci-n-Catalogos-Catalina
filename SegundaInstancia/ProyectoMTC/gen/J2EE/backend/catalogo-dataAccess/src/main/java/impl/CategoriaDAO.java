package impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import entities.Empresa;
import interfaces.IEmpresaDAO;
import entities.Catalogo;
import entities.Categoria;
import interfaces.ICatalogoDAO;
import interfaces.ICategoriaDAO;
import entities.Producto;
import interfaces.IProductoDAO;

@Stateless
public class CategoriaDAO implements ICategoriaDAO{
	
	@PersistenceContext(unitName = "catalogoPU", type = PersistenceContextType.TRANSACTION)
    private EntityManager em;
    
   
   
    @SuppressWarnings("unchecked")
	public List<Categoria> getAllCategoria() {
		List<Categoria> categorias = em.createNamedQuery("Categoria.findAll")
				.getResultList();
		for(Categoria c : categorias){
			c.setProductos(em.createNamedQuery("Producto.findByCategoria")
					.setParameter("categoria", c)
					.getResultList());
		}
		return categorias;
	}
	
	public Categoria getCategoria(Long id) {
		Categoria categoria = em.find(Categoria.class, id);
		categoria.setProductos(em.createNamedQuery("Producto.findByCategoria")
					.setParameter("categoria", categoria)
					.getResultList());
		return categoria;
	}
   
    
    }