/**
 */
package catalogo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link catalogo.Atributo#getIdAtributo <em>Id Atributo</em>}</li>
 *   <li>{@link catalogo.Atributo#getNombreAtributo <em>Nombre Atributo</em>}</li>
 *   <li>{@link catalogo.Atributo#getValorAtributo <em>Valor Atributo</em>}</li>
 *   <li>{@link catalogo.Atributo#getTipoDato <em>Tipo Dato</em>}</li>
 * </ul>
 * </p>
 *
 * @see catalogo.CatalogoPackage#getAtributo()
 * @model
 * @generated
 */
public interface Atributo extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Atributo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Atributo</em>' attribute.
	 * @see #setIdAtributo(long)
	 * @see catalogo.CatalogoPackage#getAtributo_IdAtributo()
	 * @model
	 * @generated
	 */
	long getIdAtributo();

	/**
	 * Sets the value of the '{@link catalogo.Atributo#getIdAtributo <em>Id Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Atributo</em>' attribute.
	 * @see #getIdAtributo()
	 * @generated
	 */
	void setIdAtributo(long value);

	/**
	 * Returns the value of the '<em><b>Nombre Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Atributo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Atributo</em>' attribute.
	 * @see #setNombreAtributo(String)
	 * @see catalogo.CatalogoPackage#getAtributo_NombreAtributo()
	 * @model
	 * @generated
	 */
	String getNombreAtributo();

	/**
	 * Sets the value of the '{@link catalogo.Atributo#getNombreAtributo <em>Nombre Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Atributo</em>' attribute.
	 * @see #getNombreAtributo()
	 * @generated
	 */
	void setNombreAtributo(String value);

	/**
	 * Returns the value of the '<em><b>Valor Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor Atributo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor Atributo</em>' attribute.
	 * @see #setValorAtributo(String)
	 * @see catalogo.CatalogoPackage#getAtributo_ValorAtributo()
	 * @model
	 * @generated
	 */
	String getValorAtributo();

	/**
	 * Sets the value of the '{@link catalogo.Atributo#getValorAtributo <em>Valor Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Atributo</em>' attribute.
	 * @see #getValorAtributo()
	 * @generated
	 */
	void setValorAtributo(String value);

	/**
	 * Returns the value of the '<em><b>Tipo Dato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Dato</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Dato</em>' attribute.
	 * @see #setTipoDato(String)
	 * @see catalogo.CatalogoPackage#getAtributo_TipoDato()
	 * @model
	 * @generated
	 */
	String getTipoDato();

	/**
	 * Sets the value of the '{@link catalogo.Atributo#getTipoDato <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Dato</em>' attribute.
	 * @see #getTipoDato()
	 * @generated
	 */
	void setTipoDato(String value);

} // Atributo
