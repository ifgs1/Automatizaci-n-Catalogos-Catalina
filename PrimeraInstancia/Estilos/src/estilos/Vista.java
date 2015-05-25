/**
 */
package estilos;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vista</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link estilos.Vista#getColorFondo <em>Color Fondo</em>}</li>
 *   <li>{@link estilos.Vista#isBarraBusqueda <em>Barra Busqueda</em>}</li>
 *   <li>{@link estilos.Vista#getLetra <em>Letra</em>}</li>
 *   <li>{@link estilos.Vista#getTecnologia <em>Tecnologia</em>}</li>
 * </ul>
 * </p>
 *
 * @see estilos.EstilosPackage#getVista()
 * @model
 * @generated
 */
public interface Vista extends EObject {
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
	 * @see estilos.EstilosPackage#getVista_ColorFondo()
	 * @model
	 * @generated
	 */
	String getColorFondo();

	/**
	 * Sets the value of the '{@link estilos.Vista#getColorFondo <em>Color Fondo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Fondo</em>' attribute.
	 * @see #getColorFondo()
	 * @generated
	 */
	void setColorFondo(String value);

	/**
	 * Returns the value of the '<em><b>Barra Busqueda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Barra Busqueda</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Barra Busqueda</em>' attribute.
	 * @see #setBarraBusqueda(boolean)
	 * @see estilos.EstilosPackage#getVista_BarraBusqueda()
	 * @model
	 * @generated
	 */
	boolean isBarraBusqueda();

	/**
	 * Sets the value of the '{@link estilos.Vista#isBarraBusqueda <em>Barra Busqueda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Barra Busqueda</em>' attribute.
	 * @see #isBarraBusqueda()
	 * @generated
	 */
	void setBarraBusqueda(boolean value);

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
	 * @see estilos.EstilosPackage#getVista_Letra()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Letra getLetra();

	/**
	 * Sets the value of the '{@link estilos.Vista#getLetra <em>Letra</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Letra</em>' containment reference.
	 * @see #getLetra()
	 * @generated
	 */
	void setLetra(Letra value);

	/**
	 * Returns the value of the '<em><b>Tecnologia</b></em>' attribute.
	 * The literals are from the enumeration {@link estilos.Tecnologia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tecnologia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tecnologia</em>' attribute.
	 * @see estilos.Tecnologia
	 * @see #setTecnologia(Tecnologia)
	 * @see estilos.EstilosPackage#getVista_Tecnologia()
	 * @model
	 * @generated
	 */
	Tecnologia getTecnologia();

	/**
	 * Sets the value of the '{@link estilos.Vista#getTecnologia <em>Tecnologia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tecnologia</em>' attribute.
	 * @see estilos.Tecnologia
	 * @see #getTecnologia()
	 * @generated
	 */
	void setTecnologia(Tecnologia value);

} // Vista
