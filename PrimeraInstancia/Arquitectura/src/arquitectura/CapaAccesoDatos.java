/**
 */
package arquitectura;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capa Acceso Datos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arquitectura.CapaAccesoDatos#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link arquitectura.CapaAccesoDatos#getBeans <em>Beans</em>}</li>
 * </ul>
 * </p>
 *
 * @see arquitectura.ArquitecturaPackage#getCapaAccesoDatos()
 * @model
 * @generated
 */
public interface CapaAccesoDatos extends EObject {
	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link arquitectura.InterfaceDAO}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see arquitectura.ArquitecturaPackage#getCapaAccesoDatos_Interfaces()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InterfaceDAO> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Beans</b></em>' containment reference list.
	 * The list contents are of type {@link arquitectura.BeanDAO}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beans</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beans</em>' containment reference list.
	 * @see arquitectura.ArquitecturaPackage#getCapaAccesoDatos_Beans()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BeanDAO> getBeans();

} // CapaAccesoDatos
