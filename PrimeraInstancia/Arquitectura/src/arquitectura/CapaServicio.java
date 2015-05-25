/**
 */
package arquitectura;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capa Servicio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arquitectura.CapaServicio#getServicios <em>Servicios</em>}</li>
 * </ul>
 * </p>
 *
 * @see arquitectura.ArquitecturaPackage#getCapaServicio()
 * @model
 * @generated
 */
public interface CapaServicio extends EObject {
	/**
	 * Returns the value of the '<em><b>Servicios</b></em>' containment reference list.
	 * The list contents are of type {@link arquitectura.Servicio}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicios</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicios</em>' containment reference list.
	 * @see arquitectura.ArquitecturaPackage#getCapaServicio_Servicios()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Servicio> getServicios();

} // CapaServicio
