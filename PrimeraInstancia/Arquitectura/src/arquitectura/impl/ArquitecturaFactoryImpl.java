/**
 */
package arquitectura.impl;

import arquitectura.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArquitecturaFactoryImpl extends EFactoryImpl implements ArquitecturaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArquitecturaFactory init() {
		try {
			ArquitecturaFactory theArquitecturaFactory = (ArquitecturaFactory)EPackage.Registry.INSTANCE.getEFactory(ArquitecturaPackage.eNS_URI);
			if (theArquitecturaFactory != null) {
				return theArquitecturaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArquitecturaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArquitecturaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ArquitecturaPackage.ROOT_SISTEMA: return createRootSistema();
			case ArquitecturaPackage.CAPA_PRESENTACION: return createCapaPresentacion();
			case ArquitecturaPackage.CAPA_LOGICA_NEGOCIO: return createCapaLogicaNegocio();
			case ArquitecturaPackage.CAPA_PERSISTENCIA: return createCapaPersistencia();
			case ArquitecturaPackage.CAPA_SERVICIO: return createCapaServicio();
			case ArquitecturaPackage.CAPA_ACCESO_DATOS: return createCapaAccesoDatos();
			case ArquitecturaPackage.VISTA: return createVista();
			case ArquitecturaPackage.CONTROLADOR: return createControlador();
			case ArquitecturaPackage.COMUNICACION_HTTP: return createComunicacionHttp();
			case ArquitecturaPackage.ENTIDAD_PRESENTACION: return createEntidadPresentacion();
			case ArquitecturaPackage.ATRIBUTO: return createAtributo();
			case ArquitecturaPackage.SERVICIO: return createServicio();
			case ArquitecturaPackage.INTERFACE_NEGOCIO: return createInterfaceNegocio();
			case ArquitecturaPackage.BEAN_NEGOCIO: return createBeanNegocio();
			case ArquitecturaPackage.JSON_DTO: return createJsonDTO();
			case ArquitecturaPackage.INTERFACE_DAO: return createInterfaceDAO();
			case ArquitecturaPackage.BEAN_DAO: return createBeanDAO();
			case ArquitecturaPackage.ENTIDAD_PERSISTENCIA: return createEntidadPersistencia();
			case ArquitecturaPackage.INSERT: return createInsert();
			case ArquitecturaPackage.LETRA: return createLetra();
			case ArquitecturaPackage.METODO: return createMetodo();
			case ArquitecturaPackage.MAPPER: return createMapper();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ArquitecturaPackage.TECNOLOGIA:
				return createTecnologiaFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ArquitecturaPackage.TECNOLOGIA:
				return convertTecnologiaToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootSistema createRootSistema() {
		RootSistemaImpl rootSistema = new RootSistemaImpl();
		return rootSistema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapaPresentacion createCapaPresentacion() {
		CapaPresentacionImpl capaPresentacion = new CapaPresentacionImpl();
		return capaPresentacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapaLogicaNegocio createCapaLogicaNegocio() {
		CapaLogicaNegocioImpl capaLogicaNegocio = new CapaLogicaNegocioImpl();
		return capaLogicaNegocio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapaPersistencia createCapaPersistencia() {
		CapaPersistenciaImpl capaPersistencia = new CapaPersistenciaImpl();
		return capaPersistencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapaServicio createCapaServicio() {
		CapaServicioImpl capaServicio = new CapaServicioImpl();
		return capaServicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapaAccesoDatos createCapaAccesoDatos() {
		CapaAccesoDatosImpl capaAccesoDatos = new CapaAccesoDatosImpl();
		return capaAccesoDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vista createVista() {
		VistaImpl vista = new VistaImpl();
		return vista;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controlador createControlador() {
		ControladorImpl controlador = new ControladorImpl();
		return controlador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComunicacionHttp createComunicacionHttp() {
		ComunicacionHttpImpl comunicacionHttp = new ComunicacionHttpImpl();
		return comunicacionHttp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntidadPresentacion createEntidadPresentacion() {
		EntidadPresentacionImpl entidadPresentacion = new EntidadPresentacionImpl();
		return entidadPresentacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atributo createAtributo() {
		AtributoImpl atributo = new AtributoImpl();
		return atributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Servicio createServicio() {
		ServicioImpl servicio = new ServicioImpl();
		return servicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceNegocio createInterfaceNegocio() {
		InterfaceNegocioImpl interfaceNegocio = new InterfaceNegocioImpl();
		return interfaceNegocio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeanNegocio createBeanNegocio() {
		BeanNegocioImpl beanNegocio = new BeanNegocioImpl();
		return beanNegocio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonDTO createJsonDTO() {
		JsonDTOImpl jsonDTO = new JsonDTOImpl();
		return jsonDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDAO createInterfaceDAO() {
		InterfaceDAOImpl interfaceDAO = new InterfaceDAOImpl();
		return interfaceDAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeanDAO createBeanDAO() {
		BeanDAOImpl beanDAO = new BeanDAOImpl();
		return beanDAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntidadPersistencia createEntidadPersistencia() {
		EntidadPersistenciaImpl entidadPersistencia = new EntidadPersistenciaImpl();
		return entidadPersistencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Insert createInsert() {
		InsertImpl insert = new InsertImpl();
		return insert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Letra createLetra() {
		LetraImpl letra = new LetraImpl();
		return letra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metodo createMetodo() {
		MetodoImpl metodo = new MetodoImpl();
		return metodo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapper createMapper() {
		MapperImpl mapper = new MapperImpl();
		return mapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tecnologia createTecnologiaFromString(EDataType eDataType, String initialValue) {
		Tecnologia result = Tecnologia.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTecnologiaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArquitecturaPackage getArquitecturaPackage() {
		return (ArquitecturaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArquitecturaPackage getPackage() {
		return ArquitecturaPackage.eINSTANCE;
	}

} //ArquitecturaFactoryImpl
