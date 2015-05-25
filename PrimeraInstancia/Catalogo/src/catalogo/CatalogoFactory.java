/**
 */
package catalogo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see catalogo.CatalogoPackage
 * @generated
 */
public interface CatalogoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CatalogoFactory eINSTANCE = catalogo.impl.CatalogoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Categoria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Categoria</em>'.
	 * @generated
	 */
	Categoria createCategoria();

	/**
	 * Returns a new object of class '<em>Root Sistema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Sistema</em>'.
	 * @generated
	 */
	RootSistema createRootSistema();

	/**
	 * Returns a new object of class '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributo</em>'.
	 * @generated
	 */
	Atributo createAtributo();

	/**
	 * Returns a new object of class '<em>Producto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Producto</em>'.
	 * @generated
	 */
	Producto createProducto();

	/**
	 * Returns a new object of class '<em>Catalogo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catalogo</em>'.
	 * @generated
	 */
	Catalogo createCatalogo();

	/**
	 * Returns a new object of class '<em>Empresa</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empresa</em>'.
	 * @generated
	 */
	Empresa createEmpresa();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CatalogoPackage getCatalogoPackage();

} //CatalogoFactory
