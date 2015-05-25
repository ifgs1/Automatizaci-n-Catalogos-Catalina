package impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import entities.Catalogo;
import mapper.CatalogoJsonMapper;
import json.CatalogoJson;
import interfaces.ICatalogo;
import interfaces.ICatalogoDAO;
import entities.Empresa;
import mapper.EmpresaJsonMapper;
import json.EmpresaJson;
import interfaces.IEmpresaDAO;
import interfaces.ICategoriaDAO;
import json.CategoriaJson;
import mapper.CategoriaJsonMapper;
import entities.Categoria;
import interfaces.IProductoDAO;
import json.ProductoJson;
import mapper.ProductoJsonMapper;
import entities.Producto;

@Stateless
public class CatalogoBean implements ICatalogo{

		@EJB
		private IEmpresaDAO empresaDAO;
		@EJB
		private ICatalogoDAO catalogoDAO;
		@EJB
		private ICategoriaDAO categoriaDAO;
		@EJB
		private IProductoDAO productoDAO;
	public List<CatalogoJson> getAllCatalogos() {
		List<CatalogoJson> catalogos = new ArrayList<CatalogoJson>();
		for(Catalogo c : catalogoDAO.getAllCatalogo()){
			catalogos.add(CatalogoJsonMapper.convertToCatalogoJson(c));
		}
		return catalogos;
	}
	
	public CatalogoJson getCatalogoById(Long id) {
		return CatalogoJsonMapper.convertToCatalogoJson(catalogoDAO.getCatalogo(id));
	}
	
	public List<EmpresaJson> getAllEmpresas() {
		List<EmpresaJson> empresas = new ArrayList<EmpresaJson>();
		for(Empresa e:empresaDAO.getAllEmpresa()){
			empresas.add(EmpresaJsonMapper.convertToEmpresaJson(e));
		}
		return empresas;
	}
	
	public EmpresaJson getEmpresaById(Long id) {
		return EmpresaJsonMapper.convertToEmpresaJson(empresaDAO.getEmpresa(id));
	}
	
	public List<CategoriaJson> getAllCategorias() {
		List<CategoriaJson> categorias = new ArrayList<CategoriaJson>();
		for(Categoria c:categoriaDAO.getAllCategoria()){
			categorias.add(CategoriaJsonMapper.convertToCategoriaJson(c));
		}
		return categorias;
	}
	
	public CategoriaJson getCategoriaById(Long id) {
		return CategoriaJsonMapper.convertToCategoriaJson(categoriaDAO.getCategoria(id));
	}
	
	public List<ProductoJson> getAllProductos() {
		List<ProductoJson> productos = new ArrayList<ProductoJson>();
		for(Producto p:productoDAO.getAllProducto()){
			productos.add(ProductoJsonMapper.convertToProductoJson(p));
		}
		return productos;
	}
	
	public ProductoJson getProductoById(Long id) {
		return ProductoJsonMapper.convertToProductoJson(productoDAO.getProducto(id));
	}

}