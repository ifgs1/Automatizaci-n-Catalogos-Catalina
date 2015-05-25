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
public class CatalogoDAO implements ICatalogoDAO{
	
	@PersistenceContext(unitName = "catalogoPU", type = PersistenceContextType.TRANSACTION)
    private EntityManager em;
    
   
    @SuppressWarnings("unchecked")
	public List<Catalogo> getAllCatalogo() {
		List<Catalogo> catalogos = em.createNamedQuery("Catalogo.findAll")
				.getResultList();
		for(Catalogo catalogo : catalogos){
			for(Categoria c:catalogo.getCategorias()){
				c.setProductos(em.createNamedQuery("Producto.findByCategoria")
						.setParameter("categoria", c)
						.getResultList());
			}
		}
		return catalogos;
	}
	
	public Catalogo getCatalogo(Long id) {
		Catalogo catalogo =  em.find(Catalogo.class, id);
		for(Categoria c:catalogo.getCategorias()){
			c.setProductos(em.createNamedQuery("Producto.findByCategoria")
					.setParameter("categoria", c)
					.getResultList());
		}
		return catalogo;
	}
   
   
    
    }