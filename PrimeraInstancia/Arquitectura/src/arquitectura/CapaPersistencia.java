/**
 */
package arquitectura;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capa Persistencia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arquitectura.CapaPersistencia#getEntidades <em>Entidades</em>}</li>
 *   <li>{@link arquitectura.CapaPersistencia#getInserts <em>Inserts</em>}</li>
 * </ul>
 * </p>
 *
 * @see arquitectura.ArquitecturaPackage#getCapaPersistencia()
 * @model
 * @generated
 */
public interface CapaPersistencia extends EObject {
	/**
	 * Returns the value of the '<em><b>Entidades</b></em>' containment reference list.
	 * The list contents are of type {@link arquitectura.EntidadPersistencia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidades</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidades</em>' containment reference list.
	 * @see arquitectura.ArquitecturaPackage#getCapaPersistencia_Entidades()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EntidadPersistencia> getEntidades();

	/**
	 * Returns the value of the '<em><b>Inserts</b></em>' containment reference list.
	 * The list contents are of type {@link arquitectura.Insert}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inserts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inserts</em>' containment reference list.
	 * @see arquitectura.ArquitecturaPackage#getCapaPersistencia_Inserts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Insert> getInserts();

} // CapaPersistencia
