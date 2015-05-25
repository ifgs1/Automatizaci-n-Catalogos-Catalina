/**
 */
package arquitectura;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bean Negocio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arquitectura.BeanNegocio#getImplementa <em>Implementa</em>}</li>
 *   <li>{@link arquitectura.BeanNegocio#getNombre <em>Nombre</em>}</li>
 * </ul>
 * </p>
 *
 * @see arquitectura.ArquitecturaPackage#getBeanNegocio()
 * @model
 * @generated
 */
public interface BeanNegocio extends EObject {
	/**
	 * Returns the value of the '<em><b>Implementa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementa</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementa</em>' reference.
	 * @see #setImplementa(InterfaceNegocio)
	 * @see arquitectura.ArquitecturaPackage#getBeanNegocio_Implementa()
	 * @model required="true"
	 * @generated
	 */
	InterfaceNegocio getImplementa();

	/**
	 * Sets the value of the '{@link arquitectura.BeanNegocio#getImplementa <em>Implementa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementa</em>' reference.
	 * @see #getImplementa()
	 * @generated
	 */
	void setImplementa(InterfaceNegocio value);

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
	 * @see arquitectura.ArquitecturaPackage#getBeanNegocio_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link arquitectura.BeanNegocio#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // BeanNegocio
