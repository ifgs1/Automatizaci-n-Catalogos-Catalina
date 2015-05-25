package services;

import interfaces.ICatalogo;


import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Stateless
@Path("/services")
public class CatalogoService {
	
	@EJB
	private ICatalogo catalogoBean;

	/*Catalogos*/
	@GET
	@Path("/catalogo")
	@Produces("application/json")
	public Response getAllCatalogos(){
		return Response.ok(catalogoBean.getAllCatalogos()).build();
	}
	
	@GET
	@Path("/catalogo/{catalogoId}")
	@Produces("application/json")
	public Response getCatalogoById(@PathParam("catalogoId") Long id){
		return Response.ok(catalogoBean.getCatalogoById(id)).build();
	}
	
	/*Categorias*/
	@GET
	@Path("/categoria")
	@Produces("application/json")
	public Response getAllCategorias(){
		return Response.ok(catalogoBean.getAllCategorias()).build();
	}
	
	@GET
	@Path("/categoria/{categoriaId}")
	@Produces("application/json")
	public Response getCategoriaById(@PathParam("categoriaId") Long id){
		return Response.ok(catalogoBean.getCategoriaById(id)).build();
	}
	
	/*Empresa*/
	@GET
	@Path("/empresa")
	@Produces("application/json")
	public Response getAllEmpresas(){
		return Response.ok(catalogoBean.getAllEmpresas()).build();
	}
	
	@GET
	@Path("/empresa/{empresaId}")
	@Produces("application/json")
	public Response getEmpresaById(@PathParam("empresaId") Long id){
		return Response.ok(catalogoBean.getEmpresaById(id)).build();
	}
	
	/*Producto*/
	@GET
	@Path("/producto")
	@Produces("application/json")
	public Response getAllProductos(){
		return Response.ok(catalogoBean.getAllProductos()).build();
	}
	
	@GET
	@Path("/producto/{productoId}")
	@Produces("application/json")
	public Response getProductoById(@PathParam("productoId") Long id){
		return Response.ok(catalogoBean.getProductoById(id)).build();
	}
	
	

}