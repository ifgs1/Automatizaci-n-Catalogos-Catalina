/**
 */
package arquitectura;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see arquitectura.ArquitecturaFactory
 * @model kind="package"
 * @generated
 */
public interface ArquitecturaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arquitectura";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/arquitectura";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "arquitectura";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArquitecturaPackage eINSTANCE = arquitectura.impl.ArquitecturaPackageImpl.init();

	/**
	 * The meta object id for the '{@link arquitectura.impl.RootSistemaImpl <em>Root Sistema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arquitectura.impl.RootSistemaImpl
	 * @see arquitectura.impl.ArquitecturaPackageImpl#getRootSistema()
	 * @generated
	 */
	int ROOT_SISTEMA = 0;

	/**
	 * The feature id for the '<em><b>Presentaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_SISTEMA__PRESENTACIONES = 0;

	/**
	 * The feature id for the '<em><b>Capa Logica Negocio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_SISTEMA__CAPA_LOGICA_NEGOCIO = 1;

	/**
	 * The feature id for the '<em><b>Capa Servicio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_SISTEMA__CAPA_SERVICIO = 2;

	/**
	 * The feature id for the '<em><b>Capa Acceso Datos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_SISTEMA__CAPA_ACCESO_DATOS = 3;

	/**
	 * The feature id for the '<em><b>Capa Persistencia</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_SISTEMA__CAPA_PERSISTENCIA = 4;

	/**
	 * The number of structural features of the '<em>Root Sistema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_SISTEMA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Root Sistema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_SISTEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arquitectura.impl.CapaPresentacionImpl <em>Capa Presentacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arquitectura.impl.CapaPresentacionImpl
	 * @see arquitectura.impl.ArquitecturaPackageImpl#getCapaPresentacion()
	 * @generated
	 */
	int CAPA_PRESENTACION = 1;

	/**
	 * The feature id for the '<em><b>Vistas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_PRESENTACION__VISTAS = 0;

	/**
	 * The feature id for the '<em><b>Controladores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_PRESENTACION__CONTROLADORES = 1;

	/**
	 * The feature id for the '<em><b>Comunicaciones Http</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_PRESENTACION__COMUNICACIONES_HTTP = 2;

	/**
	 * The feature id for the '<em><b>Entidades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_PRESENTACION__ENTIDADES = 3;

	/**
	 * The feature id for the '<em><b>Tecnologia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_PRESENTACION__TECNOLOGIA = 4;

	/**
	 * The feature id for the '<em><b>Barra Busqueda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_PRESENTACION__BARRA_BUSQUEDA = 5;

	/**
	 * The number of structural features of the '<em>Capa Presentacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_PRESENTACION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Capa Presentacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_PRESENTACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arquitectura.impl.CapaLogicaNegocioImpl <em>Capa Logica Negocio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arquitectura.impl.CapaLogicaNegocioImpl
	 * @see arquitectura.impl.ArquitecturaPackageImpl#getCapaLogicaNegocio()
	 * @generated
	 */
	int CAPA_LOGICA_NEGOCIO = 2;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_LOGICA_NEGOCIO__INTERFACES = 0;

	/**
	 * The feature id for the '<em><b>Beans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_LOGICA_NEGOCIO__BEANS = 1;

	/**
	 * The feature id for the '<em><b>Jsons DTO</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_LOGICA_NEGOCIO__JSONS_DTO = 2;

	/**
	 * The feature id for the '<em><b>Mappers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_LOGICA_NEGOCIO__MAPPERS = 3;

	/**
	 * The number of structural features of the '<em>Capa Logica Negocio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_LOGICA_NEGOCIO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Capa Logica Negocio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_LOGICA_NEGOCIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arquitectura.impl.CapaPersistenciaImpl <em>Capa Persistencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arquitectura.impl.CapaPersistenciaImpl
	 * @see arquitectura.impl.ArquitecturaPackageImpl#getCapaPersistencia()
	 * @generated
	 */
	int CAPA_PERSISTENCIA = 3;

	/**
	 * The feature id for the '<em><b>Entidades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_PERSISTENCIA__ENTIDADES = 0;

	/**
	 * The feature id for the '<em><b>Inserts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_PERSISTENCIA__INSERTS = 1;

	/**
	 * The number of structural features of the '<em>Capa Persistencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_PERSISTENCIA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Capa Persistencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_PERSISTENCIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arquitectura.impl.CapaServicioImpl <em>Capa Servicio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arquitectura.impl.CapaServicioImpl
	 * @see arquitectura.impl.ArquitecturaPackageImpl#getCapaServicio()
	 * @generated
	 */
	int CAPA_SERVICIO = 4;

	/**
	 * The feature id for the '<em><b>Servicios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_SERVICIO__SERVICIOS = 0;

	/**
	 * The number of structural features of the '<em>Capa Servicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_SERVICIO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Capa Servicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_SERVICIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arquitectura.impl.CapaAccesoDatosImpl <em>Capa Acceso Datos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arquitectura.impl.CapaAccesoDatosImpl
	 * @see arquitectura.impl.ArquitecturaPackageImpl#getCapaAccesoDatos()
	 * @generated
	 */
	int CAPA_ACCESO_DATOS = 5;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_ACCESO_DATOS__INTERFACES = 0;

	/**
	 * The feature id for the '<em><b>Beans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_ACCESO_DATOS__BEANS = 1;

	/**
	 * The number of structural features of the '<em>Capa Acceso Datos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_ACCESO_DATOS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Capa Acceso Datos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPA_ACCESO_DATOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arquitectura.impl.VistaImpl <em>Vista</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arquitectura.impl.VistaImpl
	 * @see arquitectura.impl.ArquitecturaPackageImpl#getVista()
	 * @generated
	 */
	int VISTA = 6;

	/**
	 * The feature id for the '<em><b>Letra</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISTA__LETRA = 0;

	/**
	 * The feature id for the '<em><b>Color Fondo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISTA__COLOR_FONDO = 1;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISTA__TITULO = 2;

	/**
	 * The number of structural features of the '<em>Vista</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISTA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Vista</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arquitectura.impl.ControladorImpl <em>Controlador</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arquitectura.impl.ControladorImpl
	 * @see arquitectura.impl.ArquitecturaPackageImpl#getControlador()
	 * @generated
	 */
	int CONTROLADOR = 7;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR__NOMBRE = 0;

	/**
	 * The number of structural features of the '<em>Controlador</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Controlador</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arquitectura.impl.ComunicacionHttpImpl <em>Comunicacion Http</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arquitectura.impl.ComunicacionHttpImpl
	 * @see arquitectura.impl.ArquitecturaPackageImpl#getComunicacionHttp()
	 * @generated
	 */
	int COMUNICACION_HTTP = 8;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION_HTTP__URL = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION_HTTP__NOMBRE = 1;

	/**
	 * The number of structural features of the '<em>Comunicacion Http</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION_HTTP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Comunicacion Http</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMUNICACION_HTTP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arquitectura.impl.EntidadPresentacionImpl <em>Entidad Presentacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arquitectura.impl.EntidadPresentacionImpl
	 * @see arquitectura.impl.ArquitecturaPackageImpl#getEntidadPresentacion()
	 * @generated
	 */
	int ENTIDAD_PRESENTACION = 9;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_PRESENTACION__ATRIBUTOS = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_PRESENTACION__NOMBRE = 1;

	/**
	 * The number of structural features of the '<em>Entidad Presentacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_PRESENTACION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entidad Presentacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_PRESENTACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arquitectura.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arquitectura.impl.AtributoImpl
	 * @see arquitectura.impl.ArquitecturaPackageImpl#getAtributo()
	 * @generated
	 */
	int ATRIBUTO = 10;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tipo Dato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__TIPO_DATO = 1;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arquitectura.impl.ServicioImpl <em>Servicio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arquitectura.impl.ServicioImpl
	 * @see arquitectura.impl.ArquitecturaPackageImpl#getServicio()
	 * @generated
	 */
	int SERVICIO = 11;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__PATH = 0;

	/**
	 * The feature id for the '<em><b>Metodos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__METODOS = 1;

	/**
	 * The number of structural features of the '<em>Servicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Servicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arquitectura.impl.InterfaceNegocioImpl <em>Interface Negocio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arquitectura.impl.InterfaceNegocioImpl
	 * @see arquitectura.impl.ArquitecturaPackageImpl#getInterfaceNegocio()
	 * @generated
	 */
	int INTERFACE_NEGOCIO = 12;

	/**
	 * The feature id for the '<em><b>Metodos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NEGOCIO__METODOS = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NEGOCIO__NOMBRE = 1;

	/**
	 * The number of structural features of the '<em>Interface Negocio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NEGOCIO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interface Negocio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NEGOCIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arquitectura.impl.BeanNegocioImpl <em>Bean Negocio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arquitectura.impl.BeanNegocioImpl
	 * @see arquitectura.impl.ArquitecturaPackageImpl#getBeanNegocio()
	 * @generated
	 */
	int BEAN_NEGOCIO = 13;

	/**
	 * The feature id for the '<em><b>Implementa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_NEGOCIO__IMPLEMENTA = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_NEGOCIO__NOMBRE = 1;

	/**
	 * The number of structural features of the '<em>Bean Negocio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_NEGOCIO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bean Negocio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_NEGOCIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arquitectura.impl.JsonDTOImpl <em>Json DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arquitectura.impl.JsonDTOImpl
	 * @see arquitectura.impl.ArquitecturaPackageImpl#getJsonDTO()
	 * @generated
	 */
	int JSON_DTO = 14;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_DTO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_DTO__ATRIBUTOS = 1;

	/**
	 * The number of structural features of the '<em>Json DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_DTO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Json DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_DTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arquitectura.impl.InterfaceDAOImpl <em>Interface DAO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arquitectura.impl.InterfaceDAOImpl
	 * @see arquitectura.impl.ArquitecturaPackageImpl#getInterfaceDAO()
	 * @generated
	 */
	int INTERFACE_DAO = 15;

	/**
	 * The feature id for the '<em><b>Metodos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DAO__METODOS = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DAO__NOMBRE = 1;

	/**
	 * The number of structural features of the '<em>Interface DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DAO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interface DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DAO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arquitectura.impl.BeanDAOImpl <em>Bean DAO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arquitectura.impl.BeanDAOImpl
	 * @see arquitectura.impl.ArquitecturaPackageImpl#getBeanDAO()
	 * @generated
	 */
	int BEAN_DAO = 16;

	/**
	 * The feature id for the '<em><b>Implementa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_DAO__IMPLEMENTA = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_DAO__NOMBRE = 1;

	/**
	 * The number of structural features of the '<em>Bean DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_DAO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bean DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_DAO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arquitectura.impl.EntidadPersistenciaImpl <em>Entidad Persistencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arquitectura.impl.EntidadPersistenciaImpl
	 * @see arquitectura.impl.ArquitecturaPackageImpl#getEntidadPersistencia()
	 * @generated
	 */
	int ENTIDAD_PERSISTENCIA = 17;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_PERSISTENCIA__ATRIBUTOS = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_PERSISTENCIA__NOMBRE = 1;

	/**
	 * The number of structural features of the '<em>Entidad Persistencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_PERSISTENCIA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entidad Persistencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_PERSISTENCIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arquitectura.impl.InsertImpl <em>Insert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arquitectura.impl.InsertImpl
	 * @see arquitectura.impl.ArquitecturaPackageImpl#getInsert()
	 * @generated
	 */
	int INSERT = 18;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__TABLE = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__VALUES = 1;

	/**
	 * The number of structural features of the '<em>Insert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Insert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arquitectura.impl.LetraImpl <em>Letra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arquitectura.impl.LetraImpl
	 * @see arquitectura.impl.ArquitecturaPackageImpl#getLetra()
	 * @generated
	 */
	int LETRA = 19;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETRA__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Fuente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETRA__FUENTE = 1;

	/**
	 * The feature id for the '<em><b>Tamano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETRA__TAMANO = 2;

	/**
	 * The number of structural features of the '<em>Letra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETRA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Letra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETRA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arquitectura.impl.MetodoImpl <em>Metodo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arquitectura.impl.MetodoImpl
	 * @see arquitectura.impl.ArquitecturaPackageImpl#getMetodo()
	 * @generated
	 */
	int METODO = 20;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODO__PATH = 0;

	/**
	 * The feature id for the '<em><b>Tipo Retorno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODO__TIPO_RETORNO = 1;

	/**
	 * The feature id for the '<em><b>Argumentos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODO__ARGUMENTOS = 2;

	/**
	 * The number of structural features of the '<em>Metodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Metodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arquitectura.impl.MapperImpl <em>Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arquitectura.impl.MapperImpl
	 * @see arquitectura.impl.ArquitecturaPackageImpl#getMapper()
	 * @generated
	 */
	int MAPPER = 21;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPER__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Metodos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPER__METODOS = 1;

	/**
	 * The number of structural features of the '<em>Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arquitectura.Tecnologia <em>Tecnologia</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arquitectura.Tecnologia
	 * @see arquitectura.impl.ArquitecturaPackageImpl#getTecnologia()
	 * @generated
	 */
	int TECNOLOGIA = 22;


	/**
	 * Returns the meta object for class '{@link arquitectura.RootSistema <em>Root Sistema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Sistema</em>'.
	 * @see arquitectura.RootSistema
	 * @generated
	 */
	EClass getRootSistema();

	/**
	 * Returns the meta object for the containment reference list '{@link arquitectura.RootSistema#getPresentaciones <em>Presentaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Presentaciones</em>'.
	 * @see arquitectura.RootSistema#getPresentaciones()
	 * @see #getRootSistema()
	 * @generated
	 */
	EReference getRootSistema_Presentaciones();

	/**
	 * Returns the meta object for the containment reference '{@link arquitectura.RootSistema#getCapaLogicaNegocio <em>Capa Logica Negocio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capa Logica Negocio</em>'.
	 * @see arquitectura.RootSistema#getCapaLogicaNegocio()
	 * @see #getRootSistema()
	 * @generated
	 */
	EReference getRootSistema_CapaLogicaNegocio();

	/**
	 * Returns the meta object for the containment reference '{@link arquitectura.RootSistema#getCapaServicio <em>Capa Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capa Servicio</em>'.
	 * @see arquitectura.RootSistema#getCapaServicio()
	 * @see #getRootSistema()
	 * @generated
	 */
	EReference getRootSistema_CapaServicio();

	/**
	 * Returns the meta object for the containment reference '{@link arquitectura.RootSistema#getCapaAccesoDatos <em>Capa Acceso Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capa Acceso Datos</em>'.
	 * @see arquitectura.RootSistema#getCapaAccesoDatos()
	 * @see #getRootSistema()
	 * @generated
	 */
	EReference getRootSistema_CapaAccesoDatos();

	/**
	 * Returns the meta object for the containment reference '{@link arquitectura.RootSistema#getCapaPersistencia <em>Capa Persistencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capa Persistencia</em>'.
	 * @see arquitectura.RootSistema#getCapaPersistencia()
	 * @see #getRootSistema()
	 * @generated
	 */
	EReference getRootSistema_CapaPersistencia();

	/**
	 * Returns the meta object for class '{@link arquitectura.CapaPresentacion <em>Capa Presentacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capa Presentacion</em>'.
	 * @see arquitectura.CapaPresentacion
	 * @generated
	 */
	EClass getCapaPresentacion();

	/**
	 * Returns the meta object for the containment reference list '{@link arquitectura.CapaPresentacion#getVistas <em>Vistas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vistas</em>'.
	 * @see arquitectura.CapaPresentacion#getVistas()
	 * @see #getCapaPresentacion()
	 * @generated
	 */
	EReference getCapaPresentacion_Vistas();

	/**
	 * Returns the meta object for the containment reference list '{@link arquitectura.CapaPresentacion#getControladores <em>Controladores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controladores</em>'.
	 * @see arquitectura.CapaPresentacion#getControladores()
	 * @see #getCapaPresentacion()
	 * @generated
	 */
	EReference getCapaPresentacion_Controladores();

	/**
	 * Returns the meta object for the containment reference list '{@link arquitectura.CapaPresentacion#getComunicacionesHttp <em>Comunicaciones Http</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comunicaciones Http</em>'.
	 * @see arquitectura.CapaPresentacion#getComunicacionesHttp()
	 * @see #getCapaPresentacion()
	 * @generated
	 */
	EReference getCapaPresentacion_ComunicacionesHttp();

	/**
	 * Returns the meta object for the containment reference list '{@link arquitectura.CapaPresentacion#getEntidades <em>Entidades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entidades</em>'.
	 * @see arquitectura.CapaPresentacion#getEntidades()
	 * @see #getCapaPresentacion()
	 * @generated
	 */
	EReference getCapaPresentacion_Entidades();

	/**
	 * Returns the meta object for the attribute '{@link arquitectura.CapaPresentacion#getTecnologia <em>Tecnologia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tecnologia</em>'.
	 * @see arquitectura.CapaPresentacion#getTecnologia()
	 * @see #getCapaPresentacion()
	 * @generated
	 */
	EAttribute getCapaPresentacion_Tecnologia();

	/**
	 * Returns the meta object for the attribute '{@link arquitectura.CapaPresentacion#isBarraBusqueda <em>Barra Busqueda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Barra Busqueda</em>'.
	 * @see arquitectura.CapaPresentacion#isBarraBusqueda()
	 * @see #getCapaPresentacion()
	 * @generated
	 */
	EAttribute getCapaPresentacion_BarraBusqueda();

	/**
	 * Returns the meta object for class '{@link arquitectura.CapaLogicaNegocio <em>Capa Logica Negocio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capa Logica Negocio</em>'.
	 * @see arquitectura.CapaLogicaNegocio
	 * @generated
	 */
	EClass getCapaLogicaNegocio();

	/**
	 * Returns the meta object for the containment reference list '{@link arquitectura.CapaLogicaNegocio#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see arquitectura.CapaLogicaNegocio#getInterfaces()
	 * @see #getCapaLogicaNegocio()
	 * @generated
	 */
	EReference getCapaLogicaNegocio_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link arquitectura.CapaLogicaNegocio#getBeans <em>Beans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Beans</em>'.
	 * @see arquitectura.CapaLogicaNegocio#getBeans()
	 * @see #getCapaLogicaNegocio()
	 * @generated
	 */
	EReference getCapaLogicaNegocio_Beans();

	/**
	 * Returns the meta object for the containment reference list '{@link arquitectura.CapaLogicaNegocio#getJsonsDTO <em>Jsons DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jsons DTO</em>'.
	 * @see arquitectura.CapaLogicaNegocio#getJsonsDTO()
	 * @see #getCapaLogicaNegocio()
	 * @generated
	 */
	EReference getCapaLogicaNegocio_JsonsDTO();

	/**
	 * Returns the meta object for the containment reference list '{@link arquitectura.CapaLogicaNegocio#getMappers <em>Mappers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappers</em>'.
	 * @see arquitectura.CapaLogicaNegocio#getMappers()
	 * @see #getCapaLogicaNegocio()
	 * @generated
	 */
	EReference getCapaLogicaNegocio_Mappers();

	/**
	 * Returns the meta object for class '{@link arquitectura.CapaPersistencia <em>Capa Persistencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capa Persistencia</em>'.
	 * @see arquitectura.CapaPersistencia
	 * @generated
	 */
	EClass getCapaPersistencia();

	/**
	 * Returns the meta object for the containment reference list '{@link arquitectura.CapaPersistencia#getEntidades <em>Entidades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entidades</em>'.
	 * @see arquitectura.CapaPersistencia#getEntidades()
	 * @see #getCapaPersistencia()
	 * @generated
	 */
	EReference getCapaPersistencia_Entidades();

	/**
	 * Returns the meta object for the containment reference list '{@link arquitectura.CapaPersistencia#getInserts <em>Inserts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inserts</em>'.
	 * @see arquitectura.CapaPersistencia#getInserts()
	 * @see #getCapaPersistencia()
	 * @generated
	 */
	EReference getCapaPersistencia_Inserts();

	/**
	 * Returns the meta object for class '{@link arquitectura.CapaServicio <em>Capa Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capa Servicio</em>'.
	 * @see arquitectura.CapaServicio
	 * @generated
	 */
	EClass getCapaServicio();

	/**
	 * Returns the meta object for the containment reference list '{@link arquitectura.CapaServicio#getServicios <em>Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servicios</em>'.
	 * @see arquitectura.CapaServicio#getServicios()
	 * @see #getCapaServicio()
	 * @generated
	 */
	EReference getCapaServicio_Servicios();

	/**
	 * Returns the meta object for class '{@link arquitectura.CapaAccesoDatos <em>Capa Acceso Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capa Acceso Datos</em>'.
	 * @see arquitectura.CapaAccesoDatos
	 * @generated
	 */
	EClass getCapaAccesoDatos();

	/**
	 * Returns the meta object for the containment reference list '{@link arquitectura.CapaAccesoDatos#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see arquitectura.CapaAccesoDatos#getInterfaces()
	 * @see #getCapaAccesoDatos()
	 * @generated
	 */
	EReference getCapaAccesoDatos_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link arquitectura.CapaAccesoDatos#getBeans <em>Beans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Beans</em>'.
	 * @see arquitectura.CapaAccesoDatos#getBeans()
	 * @see #getCapaAccesoDatos()
	 * @generated
	 */
	EReference getCapaAccesoDatos_Beans();

	/**
	 * Returns the meta object for class '{@link arquitectura.Vista <em>Vista</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vista</em>'.
	 * @see arquitectura.Vista
	 * @generated
	 */
	EClass getVista();

	/**
	 * Returns the meta object for the containment reference '{@link arquitectura.Vista#getLetra <em>Letra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Letra</em>'.
	 * @see arquitectura.Vista#getLetra()
	 * @see #getVista()
	 * @generated
	 */
	EReference getVista_Letra();

	/**
	 * Returns the meta object for the attribute '{@link arquitectura.Vista#getColorFondo <em>Color Fondo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Fondo</em>'.
	 * @see arquitectura.Vista#getColorFondo()
	 * @see #getVista()
	 * @generated
	 */
	EAttribute getVista_ColorFondo();

	/**
	 * Returns the meta object for the attribute '{@link arquitectura.Vista#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see arquitectura.Vista#getTitulo()
	 * @see #getVista()
	 * @generated
	 */
	EAttribute getVista_Titulo();

	/**
	 * Returns the meta object for class '{@link arquitectura.Controlador <em>Controlador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controlador</em>'.
	 * @see arquitectura.Controlador
	 * @generated
	 */
	EClass getControlador();

	/**
	 * Returns the meta object for the attribute '{@link arquitectura.Controlador#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see arquitectura.Controlador#getNombre()
	 * @see #getControlador()
	 * @generated
	 */
	EAttribute getControlador_Nombre();

	/**
	 * Returns the meta object for class '{@link arquitectura.ComunicacionHttp <em>Comunicacion Http</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comunicacion Http</em>'.
	 * @see arquitectura.ComunicacionHttp
	 * @generated
	 */
	EClass getComunicacionHttp();

	/**
	 * Returns the meta object for the attribute '{@link arquitectura.ComunicacionHttp#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see arquitectura.ComunicacionHttp#getUrl()
	 * @see #getComunicacionHttp()
	 * @generated
	 */
	EAttribute getComunicacionHttp_Url();

	/**
	 * Returns the meta object for the attribute '{@link arquitectura.ComunicacionHttp#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see arquitectura.ComunicacionHttp#getNombre()
	 * @see #getComunicacionHttp()
	 * @generated
	 */
	EAttribute getComunicacionHttp_Nombre();

	/**
	 * Returns the meta object for class '{@link arquitectura.EntidadPresentacion <em>Entidad Presentacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidad Presentacion</em>'.
	 * @see arquitectura.EntidadPresentacion
	 * @generated
	 */
	EClass getEntidadPresentacion();

	/**
	 * Returns the meta object for the containment reference list '{@link arquitectura.EntidadPresentacion#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos</em>'.
	 * @see arquitectura.EntidadPresentacion#getAtributos()
	 * @see #getEntidadPresentacion()
	 * @generated
	 */
	EReference getEntidadPresentacion_Atributos();

	/**
	 * Returns the meta object for the attribute '{@link arquitectura.EntidadPresentacion#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see arquitectura.EntidadPresentacion#getNombre()
	 * @see #getEntidadPresentacion()
	 * @generated
	 */
	EAttribute getEntidadPresentacion_Nombre();

	/**
	 * Returns the meta object for class '{@link arquitectura.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo</em>'.
	 * @see arquitectura.Atributo
	 * @generated
	 */
	EClass getAtributo();

	/**
	 * Returns the meta object for the attribute '{@link arquitectura.Atributo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see arquitectura.Atributo#getNombre()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link arquitectura.Atributo#getTipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Dato</em>'.
	 * @see arquitectura.Atributo#getTipoDato()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_TipoDato();

	/**
	 * Returns the meta object for class '{@link arquitectura.Servicio <em>Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servicio</em>'.
	 * @see arquitectura.Servicio
	 * @generated
	 */
	EClass getServicio();

	/**
	 * Returns the meta object for the attribute '{@link arquitectura.Servicio#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see arquitectura.Servicio#getPath()
	 * @see #getServicio()
	 * @generated
	 */
	EAttribute getServicio_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link arquitectura.Servicio#getMetodos <em>Metodos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metodos</em>'.
	 * @see arquitectura.Servicio#getMetodos()
	 * @see #getServicio()
	 * @generated
	 */
	EReference getServicio_Metodos();

	/**
	 * Returns the meta object for class '{@link arquitectura.InterfaceNegocio <em>Interface Negocio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Negocio</em>'.
	 * @see arquitectura.InterfaceNegocio
	 * @generated
	 */
	EClass getInterfaceNegocio();

	/**
	 * Returns the meta object for the containment reference list '{@link arquitectura.InterfaceNegocio#getMetodos <em>Metodos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metodos</em>'.
	 * @see arquitectura.InterfaceNegocio#getMetodos()
	 * @see #getInterfaceNegocio()
	 * @generated
	 */
	EReference getInterfaceNegocio_Metodos();

	/**
	 * Returns the meta object for the attribute '{@link arquitectura.InterfaceNegocio#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see arquitectura.InterfaceNegocio#getNombre()
	 * @see #getInterfaceNegocio()
	 * @generated
	 */
	EAttribute getInterfaceNegocio_Nombre();

	/**
	 * Returns the meta object for class '{@link arquitectura.BeanNegocio <em>Bean Negocio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bean Negocio</em>'.
	 * @see arquitectura.BeanNegocio
	 * @generated
	 */
	EClass getBeanNegocio();

	/**
	 * Returns the meta object for the reference '{@link arquitectura.BeanNegocio#getImplementa <em>Implementa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementa</em>'.
	 * @see arquitectura.BeanNegocio#getImplementa()
	 * @see #getBeanNegocio()
	 * @generated
	 */
	EReference getBeanNegocio_Implementa();

	/**
	 * Returns the meta object for the attribute '{@link arquitectura.BeanNegocio#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see arquitectura.BeanNegocio#getNombre()
	 * @see #getBeanNegocio()
	 * @generated
	 */
	EAttribute getBeanNegocio_Nombre();

	/**
	 * Returns the meta object for class '{@link arquitectura.JsonDTO <em>Json DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json DTO</em>'.
	 * @see arquitectura.JsonDTO
	 * @generated
	 */
	EClass getJsonDTO();

	/**
	 * Returns the meta object for the attribute '{@link arquitectura.JsonDTO#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see arquitectura.JsonDTO#getNombre()
	 * @see #getJsonDTO()
	 * @generated
	 */
	EAttribute getJsonDTO_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link arquitectura.JsonDTO#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos</em>'.
	 * @see arquitectura.JsonDTO#getAtributos()
	 * @see #getJsonDTO()
	 * @generated
	 */
	EReference getJsonDTO_Atributos();

	/**
	 * Returns the meta object for class '{@link arquitectura.InterfaceDAO <em>Interface DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface DAO</em>'.
	 * @see arquitectura.InterfaceDAO
	 * @generated
	 */
	EClass getInterfaceDAO();

	/**
	 * Returns the meta object for the containment reference list '{@link arquitectura.InterfaceDAO#getMetodos <em>Metodos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metodos</em>'.
	 * @see arquitectura.InterfaceDAO#getMetodos()
	 * @see #getInterfaceDAO()
	 * @generated
	 */
	EReference getInterfaceDAO_Metodos();

	/**
	 * Returns the meta object for the attribute '{@link arquitectura.InterfaceDAO#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see arquitectura.InterfaceDAO#getNombre()
	 * @see #getInterfaceDAO()
	 * @generated
	 */
	EAttribute getInterfaceDAO_Nombre();

	/**
	 * Returns the meta object for class '{@link arquitectura.BeanDAO <em>Bean DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bean DAO</em>'.
	 * @see arquitectura.BeanDAO
	 * @generated
	 */
	EClass getBeanDAO();

	/**
	 * Returns the meta object for the reference '{@link arquitectura.BeanDAO#getImplementa <em>Implementa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementa</em>'.
	 * @see arquitectura.BeanDAO#getImplementa()
	 * @see #getBeanDAO()
	 * @generated
	 */
	EReference getBeanDAO_Implementa();

	/**
	 * Returns the meta object for the attribute '{@link arquitectura.BeanDAO#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see arquitectura.BeanDAO#getNombre()
	 * @see #getBeanDAO()
	 * @generated
	 */
	EAttribute getBeanDAO_Nombre();

	/**
	 * Returns the meta object for class '{@link arquitectura.EntidadPersistencia <em>Entidad Persistencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidad Persistencia</em>'.
	 * @see arquitectura.EntidadPersistencia
	 * @generated
	 */
	EClass getEntidadPersistencia();

	/**
	 * Returns the meta object for the containment reference list '{@link arquitectura.EntidadPersistencia#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos</em>'.
	 * @see arquitectura.EntidadPersistencia#getAtributos()
	 * @see #getEntidadPersistencia()
	 * @generated
	 */
	EReference getEntidadPersistencia_Atributos();

	/**
	 * Returns the meta object for the attribute '{@link arquitectura.EntidadPersistencia#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see arquitectura.EntidadPersistencia#getNombre()
	 * @see #getEntidadPersistencia()
	 * @generated
	 */
	EAttribute getEntidadPersistencia_Nombre();

	/**
	 * Returns the meta object for class '{@link arquitectura.Insert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert</em>'.
	 * @see arquitectura.Insert
	 * @generated
	 */
	EClass getInsert();

	/**
	 * Returns the meta object for the attribute '{@link arquitectura.Insert#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see arquitectura.Insert#getTable()
	 * @see #getInsert()
	 * @generated
	 */
	EAttribute getInsert_Table();

	/**
	 * Returns the meta object for the attribute '{@link arquitectura.Insert#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see arquitectura.Insert#getValues()
	 * @see #getInsert()
	 * @generated
	 */
	EAttribute getInsert_Values();

	/**
	 * Returns the meta object for class '{@link arquitectura.Letra <em>Letra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Letra</em>'.
	 * @see arquitectura.Letra
	 * @generated
	 */
	EClass getLetra();

	/**
	 * Returns the meta object for the attribute '{@link arquitectura.Letra#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see arquitectura.Letra#getColor()
	 * @see #getLetra()
	 * @generated
	 */
	EAttribute getLetra_Color();

	/**
	 * Returns the meta object for the attribute '{@link arquitectura.Letra#getFuente <em>Fuente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuente</em>'.
	 * @see arquitectura.Letra#getFuente()
	 * @see #getLetra()
	 * @generated
	 */
	EAttribute getLetra_Fuente();

	/**
	 * Returns the meta object for the attribute '{@link arquitectura.Letra#getTamano <em>Tamano</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tamano</em>'.
	 * @see arquitectura.Letra#getTamano()
	 * @see #getLetra()
	 * @generated
	 */
	EAttribute getLetra_Tamano();

	/**
	 * Returns the meta object for class '{@link arquitectura.Metodo <em>Metodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metodo</em>'.
	 * @see arquitectura.Metodo
	 * @generated
	 */
	EClass getMetodo();

	/**
	 * Returns the meta object for the attribute '{@link arquitectura.Metodo#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see arquitectura.Metodo#getPath()
	 * @see #getMetodo()
	 * @generated
	 */
	EAttribute getMetodo_Path();

	/**
	 * Returns the meta object for the attribute '{@link arquitectura.Metodo#getTipoRetorno <em>Tipo Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Retorno</em>'.
	 * @see arquitectura.Metodo#getTipoRetorno()
	 * @see #getMetodo()
	 * @generated
	 */
	EAttribute getMetodo_TipoRetorno();

	/**
	 * Returns the meta object for the attribute '{@link arquitectura.Metodo#getArgumentos <em>Argumentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Argumentos</em>'.
	 * @see arquitectura.Metodo#getArgumentos()
	 * @see #getMetodo()
	 * @generated
	 */
	EAttribute getMetodo_Argumentos();

	/**
	 * Returns the meta object for class '{@link arquitectura.Mapper <em>Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapper</em>'.
	 * @see arquitectura.Mapper
	 * @generated
	 */
	EClass getMapper();

	/**
	 * Returns the meta object for the attribute '{@link arquitectura.Mapper#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see arquitectura.Mapper#getNombre()
	 * @see #getMapper()
	 * @generated
	 */
	EAttribute getMapper_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link arquitectura.Mapper#getMetodos <em>Metodos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metodos</em>'.
	 * @see arquitectura.Mapper#getMetodos()
	 * @see #getMapper()
	 * @generated
	 */
	EReference getMapper_Metodos();

	/**
	 * Returns the meta object for enum '{@link arquitectura.Tecnologia <em>Tecnologia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tecnologia</em>'.
	 * @see arquitectura.Tecnologia
	 * @generated
	 */
	EEnum getTecnologia();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArquitecturaFactory getArquitecturaFactory();

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
		 * The meta object literal for the '{@link arquitectura.impl.RootSistemaImpl <em>Root Sistema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arquitectura.impl.RootSistemaImpl
		 * @see arquitectura.impl.ArquitecturaPackageImpl#getRootSistema()
		 * @generated
		 */
		EClass ROOT_SISTEMA = eINSTANCE.getRootSistema();

		/**
		 * The meta object literal for the '<em><b>Presentaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_SISTEMA__PRESENTACIONES = eINSTANCE.getRootSistema_Presentaciones();

		/**
		 * The meta object literal for the '<em><b>Capa Logica Negocio</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_SISTEMA__CAPA_LOGICA_NEGOCIO = eINSTANCE.getRootSistema_CapaLogicaNegocio();

		/**
		 * The meta object literal for the '<em><b>Capa Servicio</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_SISTEMA__CAPA_SERVICIO = eINSTANCE.getRootSistema_CapaServicio();

		/**
		 * The meta object literal for the '<em><b>Capa Acceso Datos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_SISTEMA__CAPA_ACCESO_DATOS = eINSTANCE.getRootSistema_CapaAccesoDatos();

		/**
		 * The meta object literal for the '<em><b>Capa Persistencia</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_SISTEMA__CAPA_PERSISTENCIA = eINSTANCE.getRootSistema_CapaPersistencia();

		/**
		 * The meta object literal for the '{@link arquitectura.impl.CapaPresentacionImpl <em>Capa Presentacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arquitectura.impl.CapaPresentacionImpl
		 * @see arquitectura.impl.ArquitecturaPackageImpl#getCapaPresentacion()
		 * @generated
		 */
		EClass CAPA_PRESENTACION = eINSTANCE.getCapaPresentacion();

		/**
		 * The meta object literal for the '<em><b>Vistas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPA_PRESENTACION__VISTAS = eINSTANCE.getCapaPresentacion_Vistas();

		/**
		 * The meta object literal for the '<em><b>Controladores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPA_PRESENTACION__CONTROLADORES = eINSTANCE.getCapaPresentacion_Controladores();

		/**
		 * The meta object literal for the '<em><b>Comunicaciones Http</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPA_PRESENTACION__COMUNICACIONES_HTTP = eINSTANCE.getCapaPresentacion_ComunicacionesHttp();

		/**
		 * The meta object literal for the '<em><b>Entidades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPA_PRESENTACION__ENTIDADES = eINSTANCE.getCapaPresentacion_Entidades();

		/**
		 * The meta object literal for the '<em><b>Tecnologia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPA_PRESENTACION__TECNOLOGIA = eINSTANCE.getCapaPresentacion_Tecnologia();

		/**
		 * The meta object literal for the '<em><b>Barra Busqueda</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPA_PRESENTACION__BARRA_BUSQUEDA = eINSTANCE.getCapaPresentacion_BarraBusqueda();

		/**
		 * The meta object literal for the '{@link arquitectura.impl.CapaLogicaNegocioImpl <em>Capa Logica Negocio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arquitectura.impl.CapaLogicaNegocioImpl
		 * @see arquitectura.impl.ArquitecturaPackageImpl#getCapaLogicaNegocio()
		 * @generated
		 */
		EClass CAPA_LOGICA_NEGOCIO = eINSTANCE.getCapaLogicaNegocio();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPA_LOGICA_NEGOCIO__INTERFACES = eINSTANCE.getCapaLogicaNegocio_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Beans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPA_LOGICA_NEGOCIO__BEANS = eINSTANCE.getCapaLogicaNegocio_Beans();

		/**
		 * The meta object literal for the '<em><b>Jsons DTO</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPA_LOGICA_NEGOCIO__JSONS_DTO = eINSTANCE.getCapaLogicaNegocio_JsonsDTO();

		/**
		 * The meta object literal for the '<em><b>Mappers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPA_LOGICA_NEGOCIO__MAPPERS = eINSTANCE.getCapaLogicaNegocio_Mappers();

		/**
		 * The meta object literal for the '{@link arquitectura.impl.CapaPersistenciaImpl <em>Capa Persistencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arquitectura.impl.CapaPersistenciaImpl
		 * @see arquitectura.impl.ArquitecturaPackageImpl#getCapaPersistencia()
		 * @generated
		 */
		EClass CAPA_PERSISTENCIA = eINSTANCE.getCapaPersistencia();

		/**
		 * The meta object literal for the '<em><b>Entidades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPA_PERSISTENCIA__ENTIDADES = eINSTANCE.getCapaPersistencia_Entidades();

		/**
		 * The meta object literal for the '<em><b>Inserts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPA_PERSISTENCIA__INSERTS = eINSTANCE.getCapaPersistencia_Inserts();

		/**
		 * The meta object literal for the '{@link arquitectura.impl.CapaServicioImpl <em>Capa Servicio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arquitectura.impl.CapaServicioImpl
		 * @see arquitectura.impl.ArquitecturaPackageImpl#getCapaServicio()
		 * @generated
		 */
		EClass CAPA_SERVICIO = eINSTANCE.getCapaServicio();

		/**
		 * The meta object literal for the '<em><b>Servicios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPA_SERVICIO__SERVICIOS = eINSTANCE.getCapaServicio_Servicios();

		/**
		 * The meta object literal for the '{@link arquitectura.impl.CapaAccesoDatosImpl <em>Capa Acceso Datos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arquitectura.impl.CapaAccesoDatosImpl
		 * @see arquitectura.impl.ArquitecturaPackageImpl#getCapaAccesoDatos()
		 * @generated
		 */
		EClass CAPA_ACCESO_DATOS = eINSTANCE.getCapaAccesoDatos();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPA_ACCESO_DATOS__INTERFACES = eINSTANCE.getCapaAccesoDatos_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Beans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPA_ACCESO_DATOS__BEANS = eINSTANCE.getCapaAccesoDatos_Beans();

		/**
		 * The meta object literal for the '{@link arquitectura.impl.VistaImpl <em>Vista</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arquitectura.impl.VistaImpl
		 * @see arquitectura.impl.ArquitecturaPackageImpl#getVista()
		 * @generated
		 */
		EClass VISTA = eINSTANCE.getVista();

		/**
		 * The meta object literal for the '<em><b>Letra</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISTA__LETRA = eINSTANCE.getVista_Letra();

		/**
		 * The meta object literal for the '<em><b>Color Fondo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISTA__COLOR_FONDO = eINSTANCE.getVista_ColorFondo();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISTA__TITULO = eINSTANCE.getVista_Titulo();

		/**
		 * The meta object literal for the '{@link arquitectura.impl.ControladorImpl <em>Controlador</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arquitectura.impl.ControladorImpl
		 * @see arquitectura.impl.ArquitecturaPackageImpl#getControlador()
		 * @generated
		 */
		EClass CONTROLADOR = eINSTANCE.getControlador();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLADOR__NOMBRE = eINSTANCE.getControlador_Nombre();

		/**
		 * The meta object literal for the '{@link arquitectura.impl.ComunicacionHttpImpl <em>Comunicacion Http</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arquitectura.impl.ComunicacionHttpImpl
		 * @see arquitectura.impl.ArquitecturaPackageImpl#getComunicacionHttp()
		 * @generated
		 */
		EClass COMUNICACION_HTTP = eINSTANCE.getComunicacionHttp();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMUNICACION_HTTP__URL = eINSTANCE.getComunicacionHttp_Url();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMUNICACION_HTTP__NOMBRE = eINSTANCE.getComunicacionHttp_Nombre();

		/**
		 * The meta object literal for the '{@link arquitectura.impl.EntidadPresentacionImpl <em>Entidad Presentacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arquitectura.impl.EntidadPresentacionImpl
		 * @see arquitectura.impl.ArquitecturaPackageImpl#getEntidadPresentacion()
		 * @generated
		 */
		EClass ENTIDAD_PRESENTACION = eINSTANCE.getEntidadPresentacion();

		/**
		 * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD_PRESENTACION__ATRIBUTOS = eINSTANCE.getEntidadPresentacion_Atributos();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTIDAD_PRESENTACION__NOMBRE = eINSTANCE.getEntidadPresentacion_Nombre();

		/**
		 * The meta object literal for the '{@link arquitectura.impl.AtributoImpl <em>Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arquitectura.impl.AtributoImpl
		 * @see arquitectura.impl.ArquitecturaPackageImpl#getAtributo()
		 * @generated
		 */
		EClass ATRIBUTO = eINSTANCE.getAtributo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__NOMBRE = eINSTANCE.getAtributo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipo Dato</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__TIPO_DATO = eINSTANCE.getAtributo_TipoDato();

		/**
		 * The meta object literal for the '{@link arquitectura.impl.ServicioImpl <em>Servicio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arquitectura.impl.ServicioImpl
		 * @see arquitectura.impl.ArquitecturaPackageImpl#getServicio()
		 * @generated
		 */
		EClass SERVICIO = eINSTANCE.getServicio();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICIO__PATH = eINSTANCE.getServicio_Path();

		/**
		 * The meta object literal for the '<em><b>Metodos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICIO__METODOS = eINSTANCE.getServicio_Metodos();

		/**
		 * The meta object literal for the '{@link arquitectura.impl.InterfaceNegocioImpl <em>Interface Negocio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arquitectura.impl.InterfaceNegocioImpl
		 * @see arquitectura.impl.ArquitecturaPackageImpl#getInterfaceNegocio()
		 * @generated
		 */
		EClass INTERFACE_NEGOCIO = eINSTANCE.getInterfaceNegocio();

		/**
		 * The meta object literal for the '<em><b>Metodos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_NEGOCIO__METODOS = eINSTANCE.getInterfaceNegocio_Metodos();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_NEGOCIO__NOMBRE = eINSTANCE.getInterfaceNegocio_Nombre();

		/**
		 * The meta object literal for the '{@link arquitectura.impl.BeanNegocioImpl <em>Bean Negocio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arquitectura.impl.BeanNegocioImpl
		 * @see arquitectura.impl.ArquitecturaPackageImpl#getBeanNegocio()
		 * @generated
		 */
		EClass BEAN_NEGOCIO = eINSTANCE.getBeanNegocio();

		/**
		 * The meta object literal for the '<em><b>Implementa</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEAN_NEGOCIO__IMPLEMENTA = eINSTANCE.getBeanNegocio_Implementa();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_NEGOCIO__NOMBRE = eINSTANCE.getBeanNegocio_Nombre();

		/**
		 * The meta object literal for the '{@link arquitectura.impl.JsonDTOImpl <em>Json DTO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arquitectura.impl.JsonDTOImpl
		 * @see arquitectura.impl.ArquitecturaPackageImpl#getJsonDTO()
		 * @generated
		 */
		EClass JSON_DTO = eINSTANCE.getJsonDTO();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_DTO__NOMBRE = eINSTANCE.getJsonDTO_Nombre();

		/**
		 * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSON_DTO__ATRIBUTOS = eINSTANCE.getJsonDTO_Atributos();

		/**
		 * The meta object literal for the '{@link arquitectura.impl.InterfaceDAOImpl <em>Interface DAO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arquitectura.impl.InterfaceDAOImpl
		 * @see arquitectura.impl.ArquitecturaPackageImpl#getInterfaceDAO()
		 * @generated
		 */
		EClass INTERFACE_DAO = eINSTANCE.getInterfaceDAO();

		/**
		 * The meta object literal for the '<em><b>Metodos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DAO__METODOS = eINSTANCE.getInterfaceDAO_Metodos();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_DAO__NOMBRE = eINSTANCE.getInterfaceDAO_Nombre();

		/**
		 * The meta object literal for the '{@link arquitectura.impl.BeanDAOImpl <em>Bean DAO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arquitectura.impl.BeanDAOImpl
		 * @see arquitectura.impl.ArquitecturaPackageImpl#getBeanDAO()
		 * @generated
		 */
		EClass BEAN_DAO = eINSTANCE.getBeanDAO();

		/**
		 * The meta object literal for the '<em><b>Implementa</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEAN_DAO__IMPLEMENTA = eINSTANCE.getBeanDAO_Implementa();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_DAO__NOMBRE = eINSTANCE.getBeanDAO_Nombre();

		/**
		 * The meta object literal for the '{@link arquitectura.impl.EntidadPersistenciaImpl <em>Entidad Persistencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arquitectura.impl.EntidadPersistenciaImpl
		 * @see arquitectura.impl.ArquitecturaPackageImpl#getEntidadPersistencia()
		 * @generated
		 */
		EClass ENTIDAD_PERSISTENCIA = eINSTANCE.getEntidadPersistencia();

		/**
		 * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD_PERSISTENCIA__ATRIBUTOS = eINSTANCE.getEntidadPersistencia_Atributos();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTIDAD_PERSISTENCIA__NOMBRE = eINSTANCE.getEntidadPersistencia_Nombre();

		/**
		 * The meta object literal for the '{@link arquitectura.impl.InsertImpl <em>Insert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arquitectura.impl.InsertImpl
		 * @see arquitectura.impl.ArquitecturaPackageImpl#getInsert()
		 * @generated
		 */
		EClass INSERT = eINSTANCE.getInsert();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT__TABLE = eINSTANCE.getInsert_Table();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT__VALUES = eINSTANCE.getInsert_Values();

		/**
		 * The meta object literal for the '{@link arquitectura.impl.LetraImpl <em>Letra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arquitectura.impl.LetraImpl
		 * @see arquitectura.impl.ArquitecturaPackageImpl#getLetra()
		 * @generated
		 */
		EClass LETRA = eINSTANCE.getLetra();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LETRA__COLOR = eINSTANCE.getLetra_Color();

		/**
		 * The meta object literal for the '<em><b>Fuente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LETRA__FUENTE = eINSTANCE.getLetra_Fuente();

		/**
		 * The meta object literal for the '<em><b>Tamano</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LETRA__TAMANO = eINSTANCE.getLetra_Tamano();

		/**
		 * The meta object literal for the '{@link arquitectura.impl.MetodoImpl <em>Metodo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arquitectura.impl.MetodoImpl
		 * @see arquitectura.impl.ArquitecturaPackageImpl#getMetodo()
		 * @generated
		 */
		EClass METODO = eINSTANCE.getMetodo();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METODO__PATH = eINSTANCE.getMetodo_Path();

		/**
		 * The meta object literal for the '<em><b>Tipo Retorno</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METODO__TIPO_RETORNO = eINSTANCE.getMetodo_TipoRetorno();

		/**
		 * The meta object literal for the '<em><b>Argumentos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METODO__ARGUMENTOS = eINSTANCE.getMetodo_Argumentos();

		/**
		 * The meta object literal for the '{@link arquitectura.impl.MapperImpl <em>Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arquitectura.impl.MapperImpl
		 * @see arquitectura.impl.ArquitecturaPackageImpl#getMapper()
		 * @generated
		 */
		EClass MAPPER = eINSTANCE.getMapper();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPER__NOMBRE = eINSTANCE.getMapper_Nombre();

		/**
		 * The meta object literal for the '<em><b>Metodos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPER__METODOS = eINSTANCE.getMapper_Metodos();

		/**
		 * The meta object literal for the '{@link arquitectura.Tecnologia <em>Tecnologia</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arquitectura.Tecnologia
		 * @see arquitectura.impl.ArquitecturaPackageImpl#getTecnologia()
		 * @generated
		 */
		EEnum TECNOLOGIA = eINSTANCE.getTecnologia();

	}

} //ArquitecturaPackage
