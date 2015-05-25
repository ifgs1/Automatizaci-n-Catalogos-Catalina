/**
 */
package catalogo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Sistema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link catalogo.RootSistema#getEmpresa <em>Empresa</em>}</li>
 * </ul>
 * </p>
 *
 * @see catalogo.CatalogoPackage#getRootSistema()
 * @model
 * @generated
 */
public interface RootSistema extends EObject {
	/**
	 * Returns the value of the '<em><b>Empresa</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empresa</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empresa</em>' containment reference.
	 * @see #setEmpresa(Empresa)
	 * @see catalogo.CatalogoPackage#getRootSistema_Empresa()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Empresa getEmpresa();

	/**
	 * Sets the value of the '{@link catalogo.RootSistema#getEmpresa <em>Empresa</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empresa</em>' containment reference.
	 * @see #getEmpresa()
	 * @generated
	 */
	void setEmpresa(Empresa value);

} // RootSistema
