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
public class ProductoDAO implements IProductoDAO{
	
	@PersistenceContext(unitName = "catalogoPU", type = PersistenceContextType.TRANSACTION)
    private EntityManager em;
    
   
   
   
    @SuppressWarnings("unchecked")
	public List<Producto> getAllProducto() {
		return em.createNamedQuery("Producto.findAll")
				.getResultList();
	}
	
	public Producto getProducto(Long id) {
		return em.find(Producto.class, id);
	}
    
    }