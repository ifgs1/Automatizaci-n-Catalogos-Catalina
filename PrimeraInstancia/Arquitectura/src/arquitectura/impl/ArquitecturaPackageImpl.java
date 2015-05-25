/**
 */
package arquitectura.impl;

import arquitectura.ArquitecturaFactory;
import arquitectura.ArquitecturaPackage;
import arquitectura.Atributo;
import arquitectura.BeanDAO;
import arquitectura.BeanNegocio;
import arquitectura.CapaAccesoDatos;
import arquitectura.CapaLogicaNegocio;
import arquitectura.CapaPersistencia;
import arquitectura.CapaPresentacion;
import arquitectura.CapaServicio;
import arquitectura.ComunicacionHttp;
import arquitectura.Controlador;
import arquitectura.EntidadPersistencia;
import arquitectura.EntidadPresentacion;
import arquitectura.Insert;
import arquitectura.InterfaceDAO;
import arquitectura.InterfaceNegocio;
import arquitectura.JsonDTO;
import arquitectura.Letra;
import arquitectura.Mapper;
import arquitectura.Metodo;
import arquitectura.RootSistema;
import arquitectura.Servicio;
import arquitectura.Tecnologia;
import arquitectura.Vista;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArquitecturaPackageImpl extends EPackageImpl implements ArquitecturaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootSistemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capaPresentacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capaLogicaNegocioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capaPersistenciaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capaServicioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capaAccesoDatosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vistaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controladorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comunicacionHttpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entidadPresentacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atributoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceNegocioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beanNegocioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceDAOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beanDAOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entidadPersistenciaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass letraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metodoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tecnologiaEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see arquitectura.ArquitecturaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArquitecturaPackageImpl() {
		super(eNS_URI, ArquitecturaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ArquitecturaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArquitecturaPackage init() {
		if (isInited) return (ArquitecturaPackage)EPackage.Registry.INSTANCE.getEPackage(ArquitecturaPackage.eNS_URI);

		// Obtain or create and register package
		ArquitecturaPackageImpl theArquitecturaPackage = (ArquitecturaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArquitecturaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArquitecturaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theArquitecturaPackage.createPackageContents();

		// Initialize created meta-data
		theArquitecturaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArquitecturaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArquitecturaPackage.eNS_URI, theArquitecturaPackage);
		return theArquitecturaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootSistema() {
		return rootSistemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootSistema_Presentaciones() {
		return (EReference)rootSistemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootSistema_CapaLogicaNegocio() {
		return (EReference)rootSistemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootSistema_CapaServicio() {
		return (EReference)rootSistemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootSistema_CapaAccesoDatos() {
		return (EReference)rootSistemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootSistema_CapaPersistencia() {
		return (EReference)rootSistemaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapaPresentacion() {
		return capaPresentacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapaPresentacion_Vistas() {
		return (EReference)capaPresentacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapaPresentacion_Controladores() {
		return (EReference)capaPresentacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapaPresentacion_ComunicacionesHttp() {
		return (EReference)capaPresentacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapaPresentacion_Entidades() {
		return (EReference)capaPresentacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapaPresentacion_Tecnologia() {
		return (EAttribute)capaPresentacionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapaPresentacion_BarraBusqueda() {
		return (EAttribute)capaPresentacionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapaLogicaNegocio() {
		return capaLogicaNegocioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapaLogicaNegocio_Interfaces() {
		return (EReference)capaLogicaNegocioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapaLogicaNegocio_Beans() {
		return (EReference)capaLogicaNegocioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapaLogicaNegocio_JsonsDTO() {
		return (EReference)capaLogicaNegocioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapaLogicaNegocio_Mappers() {
		return (EReference)capaLogicaNegocioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapaPersistencia() {
		return capaPersistenciaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapaPersistencia_Entidades() {
		return (EReference)capaPersistenciaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapaPersistencia_Inserts() {
		return (EReference)capaPersistenciaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapaServicio() {
		return capaServicioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapaServicio_Servicios() {
		return (EReference)capaServicioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapaAccesoDatos() {
		return capaAccesoDatosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapaAccesoDatos_Interfaces() {
		return (EReference)capaAccesoDatosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapaAccesoDatos_Beans() {
		return (EReference)capaAccesoDatosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVista() {
		return vistaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVista_Letra() {
		return (EReference)vistaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVista_ColorFondo() {
		return (EAttribute)vistaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVista_Titulo() {
		return (EAttribute)vistaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlador() {
		return controladorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlador_Nombre() {
		return (EAttribute)controladorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComunicacionHttp() {
		return comunicacionHttpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComunicacionHttp_Url() {
		return (EAttribute)comunicacionHttpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComunicacionHttp_Nombre() {
		return (EAttribute)comunicacionHttpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntidadPresentacion() {
		return entidadPresentacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntidadPresentacion_Atributos() {
		return (EReference)entidadPresentacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntidadPresentacion_Nombre() {
		return (EAttribute)entidadPresentacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtributo() {
		return atributoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributo_Nombre() {
		return (EAttribute)atributoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributo_TipoDato() {
		return (EAttribute)atributoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServicio() {
		return servicioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServicio_Path() {
		return (EAttribute)servicioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServicio_Metodos() {
		return (EReference)servicioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceNegocio() {
		return interfaceNegocioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceNegocio_Metodos() {
		return (EReference)interfaceNegocioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceNegocio_Nombre() {
		return (EAttribute)interfaceNegocioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBeanNegocio() {
		return beanNegocioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeanNegocio_Implementa() {
		return (EReference)beanNegocioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanNegocio_Nombre() {
		return (EAttribute)beanNegocioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsonDTO() {
		return jsonDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJsonDTO_Nombre() {
		return (EAttribute)jsonDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJsonDTO_Atributos() {
		return (EReference)jsonDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceDAO() {
		return interfaceDAOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceDAO_Metodos() {
		return (EReference)interfaceDAOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDAO_Nombre() {
		return (EAttribute)interfaceDAOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBeanDAO() {
		return beanDAOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeanDAO_Implementa() {
		return (EReference)beanDAOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanDAO_Nombre() {
		return (EAttribute)beanDAOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntidadPersistencia() {
		return entidadPersistenciaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntidadPersistencia_Atributos() {
		return (EReference)entidadPersistenciaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntidadPersistencia_Nombre() {
		return (EAttribute)entidadPersistenciaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsert() {
		return insertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsert_Table() {
		return (EAttribute)insertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsert_Values() {
		return (EAttribute)insertEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLetra() {
		return letraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLetra_Color() {
		return (EAttribute)letraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLetra_Fuente() {
		return (EAttribute)letraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLetra_Tamano() {
		return (EAttribute)letraEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetodo() {
		return metodoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetodo_Path() {
		return (EAttribute)metodoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetodo_TipoRetorno() {
		return (EAttribute)metodoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetodo_Argumentos() {
		return (EAttribute)metodoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapper() {
		return mapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapper_Nombre() {
		return (EAttribute)mapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapper_Metodos() {
		return (EReference)mapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTecnologia() {
		return tecnologiaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArquitecturaFactory getArquitecturaFactory() {
		return (ArquitecturaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rootSistemaEClass = createEClass(ROOT_SISTEMA);
		createEReference(rootSistemaEClass, ROOT_SISTEMA__PRESENTACIONES);
		createEReference(rootSistemaEClass, ROOT_SISTEMA__CAPA_LOGICA_NEGOCIO);
		createEReference(rootSistemaEClass, ROOT_SISTEMA__CAPA_SERVICIO);
		createEReference(rootSistemaEClass, ROOT_SISTEMA__CAPA_ACCESO_DATOS);
		createEReference(rootSistemaEClass, ROOT_SISTEMA__CAPA_PERSISTENCIA);

		capaPresentacionEClass = createEClass(CAPA_PRESENTACION);
		createEReference(capaPresentacionEClass, CAPA_PRESENTACION__VISTAS);
		createEReference(capaPresentacionEClass, CAPA_PRESENTACION__CONTROLADORES);
		createEReference(capaPresentacionEClass, CAPA_PRESENTACION__COMUNICACIONES_HTTP);
		createEReference(capaPresentacionEClass, CAPA_PRESENTACION__ENTIDADES);
		createEAttribute(capaPresentacionEClass, CAPA_PRESENTACION__TECNOLOGIA);
		createEAttribute(capaPresentacionEClass, CAPA_PRESENTACION__BARRA_BUSQUEDA);

		capaLogicaNegocioEClass = createEClass(CAPA_LOGICA_NEGOCIO);
		createEReference(capaLogicaNegocioEClass, CAPA_LOGICA_NEGOCIO__INTERFACES);
		createEReference(capaLogicaNegocioEClass, CAPA_LOGICA_NEGOCIO__BEANS);
		createEReference(capaLogicaNegocioEClass, CAPA_LOGICA_NEGOCIO__JSONS_DTO);
		createEReference(capaLogicaNegocioEClass, CAPA_LOGICA_NEGOCIO__MAPPERS);

		capaPersistenciaEClass = createEClass(CAPA_PERSISTENCIA);
		createEReference(capaPersistenciaEClass, CAPA_PERSISTENCIA__ENTIDADES);
		createEReference(capaPersistenciaEClass, CAPA_PERSISTENCIA__INSERTS);

		capaServicioEClass = createEClass(CAPA_SERVICIO);
		createEReference(capaServicioEClass, CAPA_SERVICIO__SERVICIOS);

		capaAccesoDatosEClass = createEClass(CAPA_ACCESO_DATOS);
		createEReference(capaAccesoDatosEClass, CAPA_ACCESO_DATOS__INTERFACES);
		createEReference(capaAccesoDatosEClass, CAPA_ACCESO_DATOS__BEANS);

		vistaEClass = createEClass(VISTA);
		createEReference(vistaEClass, VISTA__LETRA);
		createEAttribute(vistaEClass, VISTA__COLOR_FONDO);
		createEAttribute(vistaEClass, VISTA__TITULO);

		controladorEClass = createEClass(CONTROLADOR);
		createEAttribute(controladorEClass, CONTROLADOR__NOMBRE);

		comunicacionHttpEClass = createEClass(COMUNICACION_HTTP);
		createEAttribute(comunicacionHttpEClass, COMUNICACION_HTTP__URL);
		createEAttribute(comunicacionHttpEClass, COMUNICACION_HTTP__NOMBRE);

		entidadPresentacionEClass = createEClass(ENTIDAD_PRESENTACION);
		createEReference(entidadPresentacionEClass, ENTIDAD_PRESENTACION__ATRIBUTOS);
		createEAttribute(entidadPresentacionEClass, ENTIDAD_PRESENTACION__NOMBRE);

		atributoEClass = createEClass(ATRIBUTO);
		createEAttribute(atributoEClass, ATRIBUTO__NOMBRE);
		createEAttribute(atributoEClass, ATRIBUTO__TIPO_DATO);

		servicioEClass = createEClass(SERVICIO);
		createEAttribute(servicioEClass, SERVICIO__PATH);
		createEReference(servicioEClass, SERVICIO__METODOS);

		interfaceNegocioEClass = createEClass(INTERFACE_NEGOCIO);
		createEReference(interfaceNegocioEClass, INTERFACE_NEGOCIO__METODOS);
		createEAttribute(interfaceNegocioEClass, INTERFACE_NEGOCIO__NOMBRE);

		beanNegocioEClass = createEClass(BEAN_NEGOCIO);
		createEReference(beanNegocioEClass, BEAN_NEGOCIO__IMPLEMENTA);
		createEAttribute(beanNegocioEClass, BEAN_NEGOCIO__NOMBRE);

		jsonDTOEClass = createEClass(JSON_DTO);
		createEAttribute(jsonDTOEClass, JSON_DTO__NOMBRE);
		createEReference(jsonDTOEClass, JSON_DTO__ATRIBUTOS);

		interfaceDAOEClass = createEClass(INTERFACE_DAO);
		createEReference(interfaceDAOEClass, INTERFACE_DAO__METODOS);
		createEAttribute(interfaceDAOEClass, INTERFACE_DAO__NOMBRE);

		beanDAOEClass = createEClass(BEAN_DAO);
		createEReference(beanDAOEClass, BEAN_DAO__IMPLEMENTA);
		createEAttribute(beanDAOEClass, BEAN_DAO__NOMBRE);

		entidadPersistenciaEClass = createEClass(ENTIDAD_PERSISTENCIA);
		createEReference(entidadPersistenciaEClass, ENTIDAD_PERSISTENCIA__ATRIBUTOS);
		createEAttribute(entidadPersistenciaEClass, ENTIDAD_PERSISTENCIA__NOMBRE);

		insertEClass = createEClass(INSERT);
		createEAttribute(insertEClass, INSERT__TABLE);
		createEAttribute(insertEClass, INSERT__VALUES);

		letraEClass = createEClass(LETRA);
		createEAttribute(letraEClass, LETRA__COLOR);
		createEAttribute(letraEClass, LETRA__FUENTE);
		createEAttribute(letraEClass, LETRA__TAMANO);

		metodoEClass = createEClass(METODO);
		createEAttribute(metodoEClass, METODO__PATH);
		createEAttribute(metodoEClass, METODO__TIPO_RETORNO);
		createEAttribute(metodoEClass, METODO__ARGUMENTOS);

		mapperEClass = createEClass(MAPPER);
		createEAttribute(mapperEClass, MAPPER__NOMBRE);
		createEReference(mapperEClass, MAPPER__METODOS);

		// Create enums
		tecnologiaEEnum = createEEnum(TECNOLOGIA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(rootSistemaEClass, RootSistema.class, "RootSistema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRootSistema_Presentaciones(), this.getCapaPresentacion(), null, "presentaciones", null, 1, -1, RootSistema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootSistema_CapaLogicaNegocio(), this.getCapaLogicaNegocio(), null, "capaLogicaNegocio", null, 1, 1, RootSistema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootSistema_CapaServicio(), this.getCapaServicio(), null, "capaServicio", null, 1, 1, RootSistema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootSistema_CapaAccesoDatos(), this.getCapaAccesoDatos(), null, "capaAccesoDatos", null, 1, 1, RootSistema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootSistema_CapaPersistencia(), this.getCapaPersistencia(), null, "capaPersistencia", null, 1, 1, RootSistema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capaPresentacionEClass, CapaPresentacion.class, "CapaPresentacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapaPresentacion_Vistas(), this.getVista(), null, "vistas", null, 1, -1, CapaPresentacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapaPresentacion_Controladores(), this.getControlador(), null, "controladores", null, 1, -1, CapaPresentacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapaPresentacion_ComunicacionesHttp(), this.getComunicacionHttp(), null, "comunicacionesHttp", null, 1, -1, CapaPresentacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapaPresentacion_Entidades(), this.getEntidadPresentacion(), null, "entidades", null, 1, -1, CapaPresentacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapaPresentacion_Tecnologia(), this.getTecnologia(), "tecnologia", null, 0, 1, CapaPresentacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapaPresentacion_BarraBusqueda(), ecorePackage.getEBoolean(), "barraBusqueda", null, 0, 1, CapaPresentacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capaLogicaNegocioEClass, CapaLogicaNegocio.class, "CapaLogicaNegocio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapaLogicaNegocio_Interfaces(), this.getInterfaceNegocio(), null, "interfaces", null, 1, -1, CapaLogicaNegocio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapaLogicaNegocio_Beans(), this.getBeanNegocio(), null, "beans", null, 1, -1, CapaLogicaNegocio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapaLogicaNegocio_JsonsDTO(), this.getJsonDTO(), null, "jsonsDTO", null, 1, -1, CapaLogicaNegocio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapaLogicaNegocio_Mappers(), this.getMapper(), null, "mappers", null, 1, -1, CapaLogicaNegocio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capaPersistenciaEClass, CapaPersistencia.class, "CapaPersistencia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapaPersistencia_Entidades(), this.getEntidadPersistencia(), null, "entidades", null, 1, -1, CapaPersistencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapaPersistencia_Inserts(), this.getInsert(), null, "inserts", null, 1, -1, CapaPersistencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capaServicioEClass, CapaServicio.class, "CapaServicio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapaServicio_Servicios(), this.getServicio(), null, "servicios", null, 1, -1, CapaServicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capaAccesoDatosEClass, CapaAccesoDatos.class, "CapaAccesoDatos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapaAccesoDatos_Interfaces(), this.getInterfaceDAO(), null, "interfaces", null, 1, -1, CapaAccesoDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapaAccesoDatos_Beans(), this.getBeanDAO(), null, "beans", null, 1, -1, CapaAccesoDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vistaEClass, Vista.class, "Vista", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVista_Letra(), this.getLetra(), null, "letra", null, 1, 1, Vista.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVista_ColorFondo(), ecorePackage.getEString(), "colorFondo", null, 0, 1, Vista.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVista_Titulo(), ecorePackage.getEString(), "titulo", null, 0, 1, Vista.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controladorEClass, Controlador.class, "Controlador", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlador_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Controlador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comunicacionHttpEClass, ComunicacionHttp.class, "ComunicacionHttp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComunicacionHttp_Url(), ecorePackage.getEString(), "url", null, 0, 1, ComunicacionHttp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComunicacionHttp_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, ComunicacionHttp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entidadPresentacionEClass, EntidadPresentacion.class, "EntidadPresentacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntidadPresentacion_Atributos(), this.getAtributo(), null, "atributos", null, 1, -1, EntidadPresentacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntidadPresentacion_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, EntidadPresentacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atributoEClass, Atributo.class, "Atributo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtributo_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributo_TipoDato(), ecorePackage.getEString(), "tipoDato", null, 0, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servicioEClass, Servicio.class, "Servicio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServicio_Path(), ecorePackage.getEString(), "path", null, 0, 1, Servicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServicio_Metodos(), this.getMetodo(), null, "metodos", null, 1, -1, Servicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceNegocioEClass, InterfaceNegocio.class, "InterfaceNegocio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceNegocio_Metodos(), this.getMetodo(), null, "metodos", null, 1, -1, InterfaceNegocio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceNegocio_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, InterfaceNegocio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beanNegocioEClass, BeanNegocio.class, "BeanNegocio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBeanNegocio_Implementa(), this.getInterfaceNegocio(), null, "implementa", null, 1, 1, BeanNegocio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeanNegocio_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, BeanNegocio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonDTOEClass, JsonDTO.class, "JsonDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJsonDTO_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, JsonDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJsonDTO_Atributos(), this.getAtributo(), null, "atributos", null, 1, -1, JsonDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceDAOEClass, InterfaceDAO.class, "InterfaceDAO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceDAO_Metodos(), this.getMetodo(), null, "metodos", null, 1, -1, InterfaceDAO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceDAO_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, InterfaceDAO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beanDAOEClass, BeanDAO.class, "BeanDAO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBeanDAO_Implementa(), this.getInterfaceDAO(), null, "implementa", null, 1, 1, BeanDAO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeanDAO_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, BeanDAO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entidadPersistenciaEClass, EntidadPersistencia.class, "EntidadPersistencia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntidadPersistencia_Atributos(), this.getAtributo(), null, "atributos", null, 1, -1, EntidadPersistencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntidadPersistencia_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, EntidadPersistencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insertEClass, Insert.class, "Insert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInsert_Table(), ecorePackage.getEString(), "table", null, 0, 1, Insert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsert_Values(), ecorePackage.getEString(), "values", null, 0, 1, Insert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(letraEClass, Letra.class, "Letra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLetra_Color(), ecorePackage.getEString(), "color", null, 0, 1, Letra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLetra_Fuente(), ecorePackage.getEString(), "fuente", null, 0, 1, Letra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLetra_Tamano(), ecorePackage.getEString(), "tamano", null, 0, 1, Letra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metodoEClass, Metodo.class, "Metodo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetodo_Path(), ecorePackage.getEString(), "path", null, 0, 1, Metodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetodo_TipoRetorno(), ecorePackage.getEString(), "tipoRetorno", null, 0, 1, Metodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetodo_Argumentos(), ecorePackage.getEString(), "argumentos", null, 0, 1, Metodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapperEClass, Mapper.class, "Mapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapper_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Mapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapper_Metodos(), this.getMetodo(), null, "metodos", null, 1, -1, Mapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tecnologiaEEnum, Tecnologia.class, "Tecnologia");
		addEEnumLiteral(tecnologiaEEnum, Tecnologia.ANDROID);
		addEEnumLiteral(tecnologiaEEnum, Tecnologia.IOS);
		addEEnumLiteral(tecnologiaEEnum, Tecnologia.WEB);

		// Create resource
		createResource(eNS_URI);
	}

} //ArquitecturaPackageImpl
