/**
 */
package arquitectura;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metodo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arquitectura.Metodo#getPath <em>Path</em>}</li>
 *   <li>{@link arquitectura.Metodo#getTipoRetorno <em>Tipo Retorno</em>}</li>
 *   <li>{@link arquitectura.Metodo#getArgumentos <em>Argumentos</em>}</li>
 * </ul>
 * </p>
 *
 * @see arquitectura.ArquitecturaPackage#getMetodo()
 * @model
 * @generated
 */
public interface Metodo extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see arquitectura.ArquitecturaPackage#getMetodo_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link arquitectura.Metodo#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Tipo Retorno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Retorno</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Retorno</em>' attribute.
	 * @see #setTipoRetorno(String)
	 * @see arquitectura.ArquitecturaPackage#getMetodo_TipoRetorno()
	 * @model
	 * @generated
	 */
	String getTipoRetorno();

	/**
	 * Sets the value of the '{@link arquitectura.Metodo#getTipoRetorno <em>Tipo Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Retorno</em>' attribute.
	 * @see #getTipoRetorno()
	 * @generated
	 */
	void setTipoRetorno(String value);

	/**
	 * Returns the value of the '<em><b>Argumentos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argumentos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argumentos</em>' attribute.
	 * @see #setArgumentos(String)
	 * @see arquitectura.ArquitecturaPackage#getMetodo_Argumentos()
	 * @model
	 * @generated
	 */
	String getArgumentos();

	/**
	 * Sets the value of the '{@link arquitectura.Metodo#getArgumentos <em>Argumentos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argumentos</em>' attribute.
	 * @see #getArgumentos()
	 * @generated
	 */
	void setArgumentos(String value);

} // Metodo
