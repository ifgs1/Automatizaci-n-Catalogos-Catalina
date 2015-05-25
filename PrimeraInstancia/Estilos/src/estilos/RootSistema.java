/**
 */
package estilos;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Sistema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link estilos.RootSistema#getVistas <em>Vistas</em>}</li>
 * </ul>
 * </p>
 *
 * @see estilos.EstilosPackage#getRootSistema()
 * @model
 * @generated
 */
public interface RootSistema extends EObject {
	/**
	 * Returns the value of the '<em><b>Vistas</b></em>' containment reference list.
	 * The list contents are of type {@link estilos.Vista}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vistas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vistas</em>' containment reference list.
	 * @see estilos.EstilosPackage#getRootSistema_Vistas()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Vista> getVistas();

} // RootSistema
