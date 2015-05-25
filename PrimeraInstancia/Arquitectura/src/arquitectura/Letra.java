/**
 */
package arquitectura;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Letra</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arquitectura.Letra#getColor <em>Color</em>}</li>
 *   <li>{@link arquitectura.Letra#getFuente <em>Fuente</em>}</li>
 *   <li>{@link arquitectura.Letra#getTamano <em>Tamano</em>}</li>
 * </ul>
 * </p>
 *
 * @see arquitectura.ArquitecturaPackage#getLetra()
 * @model
 * @generated
 */
public interface Letra extends EObject {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see arquitectura.ArquitecturaPackage#getLetra_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link arquitectura.Letra#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Fuente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuente</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuente</em>' attribute.
	 * @see #setFuente(String)
	 * @see arquitectura.ArquitecturaPackage#getLetra_Fuente()
	 * @model
	 * @generated
	 */
	String getFuente();

	/**
	 * Sets the value of the '{@link arquitectura.Letra#getFuente <em>Fuente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuente</em>' attribute.
	 * @see #getFuente()
	 * @generated
	 */
	void setFuente(String value);

	/**
	 * Returns the value of the '<em><b>Tamano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tamano</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tamano</em>' attribute.
	 * @see #setTamano(String)
	 * @see arquitectura.ArquitecturaPackage#getLetra_Tamano()
	 * @model
	 * @generated
	 */
	String getTamano();

	/**
	 * Sets the value of the '{@link arquitectura.Letra#getTamano <em>Tamano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tamano</em>' attribute.
	 * @see #getTamano()
	 * @generated
	 */
	void setTamano(String value);

} // Letra
