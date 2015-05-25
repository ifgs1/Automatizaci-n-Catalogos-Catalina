/**
 */
package estilos.impl;

import estilos.EstilosFactory;
import estilos.EstilosPackage;
import estilos.Letra;
import estilos.RootSistema;
import estilos.TamanoLetra;
import estilos.Tecnologia;
import estilos.Vista;

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
public class EstilosPackageImpl extends EPackageImpl implements EstilosPackage {
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
	private EClass rootSistemaEClass = null;

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
	private EEnum tecnologiaEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tamanoLetraEEnum = null;

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
	 * @see estilos.EstilosPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EstilosPackageImpl() {
		super(eNS_URI, EstilosFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EstilosPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EstilosPackage init() {
		if (isInited) return (EstilosPackage)EPackage.Registry.INSTANCE.getEPackage(EstilosPackage.eNS_URI);

		// Obtain or create and register package
		EstilosPackageImpl theEstilosPackage = (EstilosPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EstilosPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EstilosPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEstilosPackage.createPackageContents();

		// Initialize created meta-data
		theEstilosPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEstilosPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EstilosPackage.eNS_URI, theEstilosPackage);
		return theEstilosPackage;
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
	public EAttribute getLetra_ColorLetra() {
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
	public EClass getRootSistema() {
		return rootSistemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootSistema_Vistas() {
		return (EReference)rootSistemaEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getVista_ColorFondo() {
		return (EAttribute)vistaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVista_BarraBusqueda() {
		return (EAttribute)vistaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVista_Letra() {
		return (EReference)vistaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVista_Tecnologia() {
		return (EAttribute)vistaEClass.getEStructuralFeatures().get(3);
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
	public EEnum getTamanoLetra() {
		return tamanoLetraEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstilosFactory getEstilosFactory() {
		return (EstilosFactory)getEFactoryInstance();
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
		letraEClass = createEClass(LETRA);
		createEAttribute(letraEClass, LETRA__COLOR_LETRA);
		createEAttribute(letraEClass, LETRA__FUENTE);
		createEAttribute(letraEClass, LETRA__TAMANO);

		rootSistemaEClass = createEClass(ROOT_SISTEMA);
		createEReference(rootSistemaEClass, ROOT_SISTEMA__VISTAS);

		vistaEClass = createEClass(VISTA);
		createEAttribute(vistaEClass, VISTA__COLOR_FONDO);
		createEAttribute(vistaEClass, VISTA__BARRA_BUSQUEDA);
		createEReference(vistaEClass, VISTA__LETRA);
		createEAttribute(vistaEClass, VISTA__TECNOLOGIA);

		// Create enums
		tecnologiaEEnum = createEEnum(TECNOLOGIA);
		tamanoLetraEEnum = createEEnum(TAMANO_LETRA);
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
		initEClass(letraEClass, Letra.class, "Letra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLetra_ColorLetra(), ecorePackage.getEString(), "colorLetra", null, 0, 1, Letra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLetra_Fuente(), ecorePackage.getEString(), "fuente", null, 0, 1, Letra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLetra_Tamano(), this.getTamanoLetra(), "tamano", null, 0, 1, Letra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootSistemaEClass, RootSistema.class, "RootSistema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRootSistema_Vistas(), this.getVista(), null, "vistas", null, 1, -1, RootSistema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vistaEClass, Vista.class, "Vista", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVista_ColorFondo(), ecorePackage.getEString(), "colorFondo", null, 0, 1, Vista.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVista_BarraBusqueda(), ecorePackage.getEBoolean(), "barraBusqueda", null, 0, 1, Vista.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVista_Letra(), this.getLetra(), null, "letra", null, 1, 1, Vista.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVista_Tecnologia(), this.getTecnologia(), "tecnologia", null, 0, 1, Vista.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tecnologiaEEnum, Tecnologia.class, "Tecnologia");
		addEEnumLiteral(tecnologiaEEnum, Tecnologia.ANDROID);
		addEEnumLiteral(tecnologiaEEnum, Tecnologia.IOS);
		addEEnumLiteral(tecnologiaEEnum, Tecnologia.WEB);

		initEEnum(tamanoLetraEEnum, TamanoLetra.class, "TamanoLetra");
		addEEnumLiteral(tamanoLetraEEnum, TamanoLetra.SMALL);
		addEEnumLiteral(tamanoLetraEEnum, TamanoLetra.MEDIUM);
		addEEnumLiteral(tamanoLetraEEnum, TamanoLetra.LARGE);

		// Create resource
		createResource(eNS_URI);
	}

} //EstilosPackageImpl
