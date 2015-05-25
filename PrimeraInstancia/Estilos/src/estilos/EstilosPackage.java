/**
 */
package estilos;

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
 * @see estilos.EstilosFactory
 * @model kind="package"
 * @generated
 */
public interface EstilosPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "estilos";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/estilos";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "estilos";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EstilosPackage eINSTANCE = estilos.impl.EstilosPackageImpl.init();

	/**
	 * The meta object id for the '{@link estilos.impl.LetraImpl <em>Letra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see estilos.impl.LetraImpl
	 * @see estilos.impl.EstilosPackageImpl#getLetra()
	 * @generated
	 */
	int LETRA = 0;

	/**
	 * The feature id for the '<em><b>Color Letra</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETRA__COLOR_LETRA = 0;

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
	 * The meta object id for the '{@link estilos.impl.RootSistemaImpl <em>Root Sistema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see estilos.impl.RootSistemaImpl
	 * @see estilos.impl.EstilosPackageImpl#getRootSistema()
	 * @generated
	 */
	int ROOT_SISTEMA = 1;

	/**
	 * The feature id for the '<em><b>Vistas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_SISTEMA__VISTAS = 0;

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
	 * The meta object id for the '{@link estilos.impl.VistaImpl <em>Vista</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see estilos.impl.VistaImpl
	 * @see estilos.impl.EstilosPackageImpl#getVista()
	 * @generated
	 */
	int VISTA = 2;

	/**
	 * The feature id for the '<em><b>Color Fondo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISTA__COLOR_FONDO = 0;

	/**
	 * The feature id for the '<em><b>Barra Busqueda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISTA__BARRA_BUSQUEDA = 1;

	/**
	 * The feature id for the '<em><b>Letra</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISTA__LETRA = 2;

	/**
	 * The feature id for the '<em><b>Tecnologia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISTA__TECNOLOGIA = 3;

	/**
	 * The number of structural features of the '<em>Vista</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISTA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Vista</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link estilos.Tecnologia <em>Tecnologia</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see estilos.Tecnologia
	 * @see estilos.impl.EstilosPackageImpl#getTecnologia()
	 * @generated
	 */
	int TECNOLOGIA = 3;

	/**
	 * The meta object id for the '{@link estilos.TamanoLetra <em>Tamano Letra</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see estilos.TamanoLetra
	 * @see estilos.impl.EstilosPackageImpl#getTamanoLetra()
	 * @generated
	 */
	int TAMANO_LETRA = 4;


	/**
	 * Returns the meta object for class '{@link estilos.Letra <em>Letra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Letra</em>'.
	 * @see estilos.Letra
	 * @generated
	 */
	EClass getLetra();

	/**
	 * Returns the meta object for the attribute '{@link estilos.Letra#getColorLetra <em>Color Letra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Letra</em>'.
	 * @see estilos.Letra#getColorLetra()
	 * @see #getLetra()
	 * @generated
	 */
	EAttribute getLetra_ColorLetra();

	/**
	 * Returns the meta object for the attribute '{@link estilos.Letra#getFuente <em>Fuente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuente</em>'.
	 * @see estilos.Letra#getFuente()
	 * @see #getLetra()
	 * @generated
	 */
	EAttribute getLetra_Fuente();

	/**
	 * Returns the meta object for the attribute '{@link estilos.Letra#getTamano <em>Tamano</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tamano</em>'.
	 * @see estilos.Letra#getTamano()
	 * @see #getLetra()
	 * @generated
	 */
	EAttribute getLetra_Tamano();

	/**
	 * Returns the meta object for class '{@link estilos.RootSistema <em>Root Sistema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Sistema</em>'.
	 * @see estilos.RootSistema
	 * @generated
	 */
	EClass getRootSistema();

	/**
	 * Returns the meta object for the containment reference list '{@link estilos.RootSistema#getVistas <em>Vistas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vistas</em>'.
	 * @see estilos.RootSistema#getVistas()
	 * @see #getRootSistema()
	 * @generated
	 */
	EReference getRootSistema_Vistas();

	/**
	 * Returns the meta object for class '{@link estilos.Vista <em>Vista</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vista</em>'.
	 * @see estilos.Vista
	 * @generated
	 */
	EClass getVista();

	/**
	 * Returns the meta object for the attribute '{@link estilos.Vista#getColorFondo <em>Color Fondo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Fondo</em>'.
	 * @see estilos.Vista#getColorFondo()
	 * @see #getVista()
	 * @generated
	 */
	EAttribute getVista_ColorFondo();

	/**
	 * Returns the meta object for the attribute '{@link estilos.Vista#isBarraBusqueda <em>Barra Busqueda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Barra Busqueda</em>'.
	 * @see estilos.Vista#isBarraBusqueda()
	 * @see #getVista()
	 * @generated
	 */
	EAttribute getVista_BarraBusqueda();

	/**
	 * Returns the meta object for the containment reference '{@link estilos.Vista#getLetra <em>Letra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Letra</em>'.
	 * @see estilos.Vista#getLetra()
	 * @see #getVista()
	 * @generated
	 */
	EReference getVista_Letra();

	/**
	 * Returns the meta object for the attribute '{@link estilos.Vista#getTecnologia <em>Tecnologia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tecnologia</em>'.
	 * @see estilos.Vista#getTecnologia()
	 * @see #getVista()
	 * @generated
	 */
	EAttribute getVista_Tecnologia();

	/**
	 * Returns the meta object for enum '{@link estilos.Tecnologia <em>Tecnologia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tecnologia</em>'.
	 * @see estilos.Tecnologia
	 * @generated
	 */
	EEnum getTecnologia();

	/**
	 * Returns the meta object for enum '{@link estilos.TamanoLetra <em>Tamano Letra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tamano Letra</em>'.
	 * @see estilos.TamanoLetra
	 * @generated
	 */
	EEnum getTamanoLetra();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EstilosFactory getEstilosFactory();

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
		 * The meta object literal for the '{@link estilos.impl.LetraImpl <em>Letra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see estilos.impl.LetraImpl
		 * @see estilos.impl.EstilosPackageImpl#getLetra()
		 * @generated
		 */
		EClass LETRA = eINSTANCE.getLetra();

		/**
		 * The meta object literal for the '<em><b>Color Letra</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LETRA__COLOR_LETRA = eINSTANCE.getLetra_ColorLetra();

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
		 * The meta object literal for the '{@link estilos.impl.RootSistemaImpl <em>Root Sistema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see estilos.impl.RootSistemaImpl
		 * @see estilos.impl.EstilosPackageImpl#getRootSistema()
		 * @generated
		 */
		EClass ROOT_SISTEMA = eINSTANCE.getRootSistema();

		/**
		 * The meta object literal for the '<em><b>Vistas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_SISTEMA__VISTAS = eINSTANCE.getRootSistema_Vistas();

		/**
		 * The meta object literal for the '{@link estilos.impl.VistaImpl <em>Vista</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see estilos.impl.VistaImpl
		 * @see estilos.impl.EstilosPackageImpl#getVista()
		 * @generated
		 */
		EClass VISTA = eINSTANCE.getVista();

		/**
		 * The meta object literal for the '<em><b>Color Fondo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISTA__COLOR_FONDO = eINSTANCE.getVista_ColorFondo();

		/**
		 * The meta object literal for the '<em><b>Barra Busqueda</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISTA__BARRA_BUSQUEDA = eINSTANCE.getVista_BarraBusqueda();

		/**
		 * The meta object literal for the '<em><b>Letra</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISTA__LETRA = eINSTANCE.getVista_Letra();

		/**
		 * The meta object literal for the '<em><b>Tecnologia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISTA__TECNOLOGIA = eINSTANCE.getVista_Tecnologia();

		/**
		 * The meta object literal for the '{@link estilos.Tecnologia <em>Tecnologia</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see estilos.Tecnologia
		 * @see estilos.impl.EstilosPackageImpl#getTecnologia()
		 * @generated
		 */
		EEnum TECNOLOGIA = eINSTANCE.getTecnologia();

		/**
		 * The meta object literal for the '{@link estilos.TamanoLetra <em>Tamano Letra</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see estilos.TamanoLetra
		 * @see estilos.impl.EstilosPackageImpl#getTamanoLetra()
		 * @generated
		 */
		EEnum TAMANO_LETRA = eINSTANCE.getTamanoLetra();

	}

} //EstilosPackage
