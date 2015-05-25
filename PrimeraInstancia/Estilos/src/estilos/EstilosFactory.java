/**
 */
package estilos;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see estilos.EstilosPackage
 * @generated
 */
public interface EstilosFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EstilosFactory eINSTANCE = estilos.impl.EstilosFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Letra</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Letra</em>'.
	 * @generated
	 */
	Letra createLetra();

	/**
	 * Returns a new object of class '<em>Root Sistema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Sistema</em>'.
	 * @generated
	 */
	RootSistema createRootSistema();

	/**
	 * Returns a new object of class '<em>Vista</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vista</em>'.
	 * @generated
	 */
	Vista createVista();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EstilosPackage getEstilosPackage();

} //EstilosFactory
