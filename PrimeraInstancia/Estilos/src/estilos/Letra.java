/**
 */
package estilos;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Letra</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link estilos.Letra#getColorLetra <em>Color Letra</em>}</li>
 *   <li>{@link estilos.Letra#getFuente <em>Fuente</em>}</li>
 *   <li>{@link estilos.Letra#getTamano <em>Tamano</em>}</li>
 * </ul>
 * </p>
 *
 * @see estilos.EstilosPackage#getLetra()
 * @model
 * @generated
 */
public interface Letra extends EObject {
	/**
	 * Returns the value of the '<em><b>Color Letra</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Letra</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Letra</em>' attribute.
	 * @see #setColorLetra(String)
	 * @see estilos.EstilosPackage#getLetra_ColorLetra()
	 * @model
	 * @generated
	 */
	String getColorLetra();

	/**
	 * Sets the value of the '{@link estilos.Letra#getColorLetra <em>Color Letra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Letra</em>' attribute.
	 * @see #getColorLetra()
	 * @generated
	 */
	void setColorLetra(String value);

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
	 * @see estilos.EstilosPackage#getLetra_Fuente()
	 * @model
	 * @generated
	 */
	String getFuente();

	/**
	 * Sets the value of the '{@link estilos.Letra#getFuente <em>Fuente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuente</em>' attribute.
	 * @see #getFuente()
	 * @generated
	 */
	void setFuente(String value);

	/**
	 * Returns the value of the '<em><b>Tamano</b></em>' attribute.
	 * The literals are from the enumeration {@link estilos.TamanoLetra}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tamano</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tamano</em>' attribute.
	 * @see estilos.TamanoLetra
	 * @see #setTamano(TamanoLetra)
	 * @see estilos.EstilosPackage#getLetra_Tamano()
	 * @model
	 * @generated
	 */
	TamanoLetra getTamano();

	/**
	 * Sets the value of the '{@link estilos.Letra#getTamano <em>Tamano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tamano</em>' attribute.
	 * @see estilos.TamanoLetra
	 * @see #getTamano()
	 * @generated
	 */
	void setTamano(TamanoLetra value);

} // Letra
