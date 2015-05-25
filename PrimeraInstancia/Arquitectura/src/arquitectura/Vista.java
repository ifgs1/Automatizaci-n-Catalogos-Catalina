/**
 */
package arquitectura;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vista</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arquitectura.Vista#getLetra <em>Letra</em>}</li>
 *   <li>{@link arquitectura.Vista#getColorFondo <em>Color Fondo</em>}</li>
 *   <li>{@link arquitectura.Vista#getTitulo <em>Titulo</em>}</li>
 * </ul>
 * </p>
 *
 * @see arquitectura.ArquitecturaPackage#getVista()
 * @model
 * @generated
 */
public interface Vista extends EObject {
	/**
	 * Returns the value of the '<em><b>Letra</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Letra</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Letra</em>' containment reference.
	 * @see #setLetra(Letra)
	 * @see arquitectura.ArquitecturaPackage#getVista_Letra()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Letra getLetra();

	/**
	 * Sets the value of the '{@link arquitectura.Vista#getLetra <em>Letra</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Letra</em>' containment reference.
	 * @see #getLetra()
	 * @generated
	 */
	void setLetra(Letra value);

	/**
	 * Returns the value of the '<em><b>Color Fondo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Fondo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Fondo</em>' attribute.
	 * @see #setColorFondo(String)
	 * @see arquitectura.ArquitecturaPackage#getVista_ColorFondo()
	 * @model
	 * @generated
	 */
	String getColorFondo();

	/**
	 * Sets the value of the '{@link arquitectura.Vista#getColorFondo <em>Color Fondo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Fondo</em>' attribute.
	 * @see #getColorFondo()
	 * @generated
	 */
	void setColorFondo(String value);

	/**
	 * Returns the value of the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titulo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titulo</em>' attribute.
	 * @see #setTitulo(String)
	 * @see arquitectura.ArquitecturaPackage#getVista_Titulo()
	 * @model
	 * @generated
	 */
	String getTitulo();

	/**
	 * Sets the value of the '{@link arquitectura.Vista#getTitulo <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titulo</em>' attribute.
	 * @see #getTitulo()
	 * @generated
	 */
	void setTitulo(String value);

} // Vista
