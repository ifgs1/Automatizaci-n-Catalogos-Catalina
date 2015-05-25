/**
 */
package catalogo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see catalogo.CatalogoFactory
 * @model kind="package"
 * @generated
 */
public interface CatalogoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "catalogo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/catalogo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "catalogo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CatalogoPackage eINSTANCE = catalogo.impl.CatalogoPackageImpl.init();

	/**
	 * The meta object id for the '{@link catalogo.impl.CategoriaImpl <em>Categoria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogo.impl.CategoriaImpl
	 * @see catalogo.impl.CatalogoPackageImpl#getCategoria()
	 * @generated
	 */
	int CATEGORIA = 0;

	/**
	 * The feature id for the '<em><b>Id Categoria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA__ID_CATEGORIA = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Productos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA__PRODUCTOS = 2;

	/**
	 * The number of structural features of the '<em>Categoria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Categoria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link catalogo.impl.RootSistemaImpl <em>Root Sistema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogo.impl.RootSistemaImpl
	 * @see catalogo.impl.CatalogoPackageImpl#getRootSistema()
	 * @generated
	 */
	int ROOT_SISTEMA = 1;

	/**
	 * The feature id for the '<em><b>Empresa</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_SISTEMA__EMPRESA = 0;

	/**
	 * The number of structural features of the '<em>Root Sistema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_SISTEMA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root Sistema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_SISTEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link catalogo.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogo.impl.AtributoImpl
	 * @see catalogo.impl.CatalogoPackageImpl#getAtributo()
	 * @generated
	 */
	int ATRIBUTO = 2;

	/**
	 * The feature id for the '<em><b>Id Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__ID_ATRIBUTO = 0;

	/**
	 * The feature id for the '<em><b>Nombre Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NOMBRE_ATRIBUTO = 1;

	/**
	 * The feature id for the '<em><b>Valor Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__VALOR_ATRIBUTO = 2;

	/**
	 * The feature id for the '<em><b>Tipo Dato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__TIPO_DATO = 3;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link catalogo.impl.ProductoImpl <em>Producto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogo.impl.ProductoImpl
	 * @see catalogo.impl.CatalogoPackageImpl#getProducto()
	 * @generated
	 */
	int PRODUCTO = 3;

	/**
	 * The feature id for the '<em><b>Id Producto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__ID_PRODUCTO = 0;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__ATRIBUTOS = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__NOMBRE = 2;

	/**
	 * The number of structural features of the '<em>Producto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Producto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link catalogo.impl.CatalogoImpl <em>Catalogo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogo.impl.CatalogoImpl
	 * @see catalogo.impl.CatalogoPackageImpl#getCatalogo()
	 * @generated
	 */
	int CATALOGO = 4;

	/**
	 * The feature id for the '<em><b>Id Catalogo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGO__ID_CATALOGO = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGO__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Categorias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGO__CATEGORIAS = 2;

	/**
	 * The number of structural features of the '<em>Catalogo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Catalogo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link catalogo.impl.EmpresaImpl <em>Empresa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogo.impl.EmpresaImpl
	 * @see catalogo.impl.CatalogoPackageImpl#getEmpresa()
	 * @generated
	 */
	int EMPRESA = 5;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Direccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESA__DIRECCION = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESA__EMAIL = 2;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESA__TELEFONO = 3;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESA__DESCRIPCION = 4;

	/**
	 * The feature id for the '<em><b>Catalogo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESA__CATALOGO = 5;

	/**
	 * The feature id for the '<em><b>Url Imagen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESA__URL_IMAGEN = 6;

	/**
	 * The number of structural features of the '<em>Empresa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESA_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Empresa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESA_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link catalogo.Categoria <em>Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categoria</em>'.
	 * @see catalogo.Categoria
	 * @generated
	 */
	EClass getCategoria();

	/**
	 * Returns the meta object for the attribute '{@link catalogo.Categoria#getIdCategoria <em>Id Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Categoria</em>'.
	 * @see catalogo.Categoria#getIdCategoria()
	 * @see #getCategoria()
	 * @generated
	 */
	EAttribute getCategoria_IdCategoria();

	/**
	 * Returns the meta object for the attribute '{@link catalogo.Categoria#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see catalogo.Categoria#getNombre()
	 * @see #getCategoria()
	 * @generated
	 */
	EAttribute getCategoria_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link catalogo.Categoria#getProductos <em>Productos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Productos</em>'.
	 * @see catalogo.Categoria#getProductos()
	 * @see #getCategoria()
	 * @generated
	 */
	EReference getCategoria_Productos();

	/**
	 * Returns the meta object for class '{@link catalogo.RootSistema <em>Root Sistema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Sistema</em>'.
	 * @see catalogo.RootSistema
	 * @generated
	 */
	EClass getRootSistema();

	/**
	 * Returns the meta object for the containment reference '{@link catalogo.RootSistema#getEmpresa <em>Empresa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Empresa</em>'.
	 * @see catalogo.RootSistema#getEmpresa()
	 * @see #getRootSistema()
	 * @generated
	 */
	EReference getRootSistema_Empresa();

	/**
	 * Returns the meta object for class '{@link catalogo.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo</em>'.
	 * @see catalogo.Atributo
	 * @generated
	 */
	EClass getAtributo();

	/**
	 * Returns the meta object for the attribute '{@link catalogo.Atributo#getIdAtributo <em>Id Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Atributo</em>'.
	 * @see catalogo.Atributo#getIdAtributo()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_IdAtributo();

	/**
	 * Returns the meta object for the attribute '{@link catalogo.Atributo#getNombreAtributo <em>Nombre Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Atributo</em>'.
	 * @see catalogo.Atributo#getNombreAtributo()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_NombreAtributo();

	/**
	 * Returns the meta object for the attribute '{@link catalogo.Atributo#getValorAtributo <em>Valor Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Atributo</em>'.
	 * @see catalogo.Atributo#getValorAtributo()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_ValorAtributo();

	/**
	 * Returns the meta object for the attribute '{@link catalogo.Atributo#getTipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Dato</em>'.
	 * @see catalogo.Atributo#getTipoDato()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_TipoDato();

	/**
	 * Returns the meta object for class '{@link catalogo.Producto <em>Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Producto</em>'.
	 * @see catalogo.Producto
	 * @generated
	 */
	EClass getProducto();

	/**
	 * Returns the meta object for the attribute '{@link catalogo.Producto#getIdProducto <em>Id Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Producto</em>'.
	 * @see catalogo.Producto#getIdProducto()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_IdProducto();

	/**
	 * Returns the meta object for the containment reference list '{@link catalogo.Producto#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos</em>'.
	 * @see catalogo.Producto#getAtributos()
	 * @see #getProducto()
	 * @generated
	 */
	EReference getProducto_Atributos();

	/**
	 * Returns the meta object for the attribute '{@link catalogo.Producto#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see catalogo.Producto#getNombre()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_Nombre();

	/**
	 * Returns the meta object for class '{@link catalogo.Catalogo <em>Catalogo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalogo</em>'.
	 * @see catalogo.Catalogo
	 * @generated
	 */
	EClass getCatalogo();

	/**
	 * Returns the meta object for the attribute '{@link catalogo.Catalogo#getIdCatalogo <em>Id Catalogo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Catalogo</em>'.
	 * @see catalogo.Catalogo#getIdCatalogo()
	 * @see #getCatalogo()
	 * @generated
	 */
	EAttribute getCatalogo_IdCatalogo();

	/**
	 * Returns the meta object for the attribute '{@link catalogo.Catalogo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see catalogo.Catalogo#getNombre()
	 * @see #getCatalogo()
	 * @generated
	 */
	EAttribute getCatalogo_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link catalogo.Catalogo#getCategorias <em>Categorias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categorias</em>'.
	 * @see catalogo.Catalogo#getCategorias()
	 * @see #getCatalogo()
	 * @generated
	 */
	EReference getCatalogo_Categorias();

	/**
	 * Returns the meta object for class '{@link catalogo.Empresa <em>Empresa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empresa</em>'.
	 * @see catalogo.Empresa
	 * @generated
	 */
	EClass getEmpresa();

	/**
	 * Returns the meta object for the attribute '{@link catalogo.Empresa#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see catalogo.Empresa#getNombre()
	 * @see #getEmpresa()
	 * @generated
	 */
	EAttribute getEmpresa_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link catalogo.Empresa#getDireccion <em>Direccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direccion</em>'.
	 * @see catalogo.Empresa#getDireccion()
	 * @see #getEmpresa()
	 * @generated
	 */
	EAttribute getEmpresa_Direccion();

	/**
	 * Returns the meta object for the attribute '{@link catalogo.Empresa#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see catalogo.Empresa#getEmail()
	 * @see #getEmpresa()
	 * @generated
	 */
	EAttribute getEmpresa_Email();

	/**
	 * Returns the meta object for the attribute '{@link catalogo.Empresa#getTelefono <em>Telefono</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefono</em>'.
	 * @see catalogo.Empresa#getTelefono()
	 * @see #getEmpresa()
	 * @generated
	 */
	EAttribute getEmpresa_Telefono();

	/**
	 * Returns the meta object for the attribute '{@link catalogo.Empresa#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see catalogo.Empresa#getDescripcion()
	 * @see #getEmpresa()
	 * @generated
	 */
	EAttribute getEmpresa_Descripcion();

	/**
	 * Returns the meta object for the containment reference '{@link catalogo.Empresa#getCatalogo <em>Catalogo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catalogo</em>'.
	 * @see catalogo.Empresa#getCatalogo()
	 * @see #getEmpresa()
	 * @generated
	 */
	EReference getEmpresa_Catalogo();

	/**
	 * Returns the meta object for the attribute '{@link catalogo.Empresa#getUrlImagen <em>Url Imagen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url Imagen</em>'.
	 * @see catalogo.Empresa#getUrlImagen()
	 * @see #getEmpresa()
	 * @generated
	 */
	EAttribute getEmpresa_UrlImagen();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CatalogoFactory getCatalogoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link catalogo.impl.CategoriaImpl <em>Categoria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogo.impl.CategoriaImpl
		 * @see catalogo.impl.CatalogoPackageImpl#getCategoria()
		 * @generated
		 */
		EClass CATEGORIA = eINSTANCE.getCategoria();

		/**
		 * The meta object literal for the '<em><b>Id Categoria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORIA__ID_CATEGORIA = eINSTANCE.getCategoria_IdCategoria();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORIA__NOMBRE = eINSTANCE.getCategoria_Nombre();

		/**
		 * The meta object literal for the '<em><b>Productos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIA__PRODUCTOS = eINSTANCE.getCategoria_Productos();

		/**
		 * The meta object literal for the '{@link catalogo.impl.RootSistemaImpl <em>Root Sistema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogo.impl.RootSistemaImpl
		 * @see catalogo.impl.CatalogoPackageImpl#getRootSistema()
		 * @generated
		 */
		EClass ROOT_SISTEMA = eINSTANCE.getRootSistema();

		/**
		 * The meta object literal for the '<em><b>Empresa</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_SISTEMA__EMPRESA = eINSTANCE.getRootSistema_Empresa();

		/**
		 * The meta object literal for the '{@link catalogo.impl.AtributoImpl <em>Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogo.impl.AtributoImpl
		 * @see catalogo.impl.CatalogoPackageImpl#getAtributo()
		 * @generated
		 */
		EClass ATRIBUTO = eINSTANCE.getAtributo();

		/**
		 * The meta object literal for the '<em><b>Id Atributo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__ID_ATRIBUTO = eINSTANCE.getAtributo_IdAtributo();

		/**
		 * The meta object literal for the '<em><b>Nombre Atributo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__NOMBRE_ATRIBUTO = eINSTANCE.getAtributo_NombreAtributo();

		/**
		 * The meta object literal for the '<em><b>Valor Atributo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__VALOR_ATRIBUTO = eINSTANCE.getAtributo_ValorAtributo();

		/**
		 * The meta object literal for the '<em><b>Tipo Dato</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__TIPO_DATO = eINSTANCE.getAtributo_TipoDato();

		/**
		 * The meta object literal for the '{@link catalogo.impl.ProductoImpl <em>Producto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogo.impl.ProductoImpl
		 * @see catalogo.impl.CatalogoPackageImpl#getProducto()
		 * @generated
		 */
		EClass PRODUCTO = eINSTANCE.getProducto();

		/**
		 * The meta object literal for the '<em><b>Id Producto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__ID_PRODUCTO = eINSTANCE.getProducto_IdProducto();

		/**
		 * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTO__ATRIBUTOS = eINSTANCE.getProducto_Atributos();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__NOMBRE = eINSTANCE.getProducto_Nombre();

		/**
		 * The meta object literal for the '{@link catalogo.impl.CatalogoImpl <em>Catalogo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogo.impl.CatalogoImpl
		 * @see catalogo.impl.CatalogoPackageImpl#getCatalogo()
		 * @generated
		 */
		EClass CATALOGO = eINSTANCE.getCatalogo();

		/**
		 * The meta object literal for the '<em><b>Id Catalogo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOGO__ID_CATALOGO = eINSTANCE.getCatalogo_IdCatalogo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOGO__NOMBRE = eINSTANCE.getCatalogo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Categorias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGO__CATEGORIAS = eINSTANCE.getCatalogo_Categorias();

		/**
		 * The meta object literal for the '{@link catalogo.impl.EmpresaImpl <em>Empresa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogo.impl.EmpresaImpl
		 * @see catalogo.impl.CatalogoPackageImpl#getEmpresa()
		 * @generated
		 */
		EClass EMPRESA = eINSTANCE.getEmpresa();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPRESA__NOMBRE = eINSTANCE.getEmpresa_Nombre();

		/**
		 * The meta object literal for the '<em><b>Direccion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPRESA__DIRECCION = eINSTANCE.getEmpresa_Direccion();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPRESA__EMAIL = eINSTANCE.getEmpresa_Email();

		/**
		 * The meta object literal for the '<em><b>Telefono</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPRESA__TELEFONO = eINSTANCE.getEmpresa_Telefono();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPRESA__DESCRIPCION = eINSTANCE.getEmpresa_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Catalogo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPRESA__CATALOGO = eINSTANCE.getEmpresa_Catalogo();

		/**
		 * The meta object literal for the '<em><b>Url Imagen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPRESA__URL_IMAGEN = eINSTANCE.getEmpresa_UrlImagen();

	}

} //CatalogoPackage
