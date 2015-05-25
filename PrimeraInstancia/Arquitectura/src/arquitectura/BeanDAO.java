/**
 */
package arquitectura;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bean DAO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arquitectura.BeanDAO#getImplementa <em>Implementa</em>}</li>
 *   <li>{@link arquitectura.BeanDAO#getNombre <em>Nombre</em>}</li>
 * </ul>
 * </p>
 *
 * @see arquitectura.ArquitecturaPackage#getBeanDAO()
 * @model
 * @generated
 */
public interface BeanDAO extends EObject {
	/**
	 * Returns the value of the '<em><b>Implementa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementa</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementa</em>' reference.
	 * @see #setImplementa(InterfaceDAO)
	 * @see arquitectura.ArquitecturaPackage#getBeanDAO_Implementa()
	 * @model required="true"
	 * @generated
	 */
	InterfaceDAO getImplementa();

	/**
	 * Sets the value of the '{@link arquitectura.BeanDAO#getImplementa <em>Implementa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementa</em>' reference.
	 * @see #getImplementa()
	 * @generated
	 */
	void setImplementa(InterfaceDAO value);

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see arquitectura.ArquitecturaPackage#getBeanDAO_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link arquitectura.BeanDAO#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // BeanDAO
