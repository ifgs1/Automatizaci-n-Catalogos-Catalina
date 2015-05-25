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
public class EmpresaDAO implements IEmpresaDAO{
	
	@PersistenceContext(unitName = "catalogoPU", type = PersistenceContextType.TRANSACTION)
    private EntityManager em;
    
    	@SuppressWarnings("unchecked")
	public List<Empresa> getAllEmpresa() {
		return em.createNamedQuery("Empresa.findAll")
				.getResultList();
	}
	
	public Empresa getEmpresa(Long id) {
		return em.find(Empresa.class, id);
	}
   
   
   
    
    }