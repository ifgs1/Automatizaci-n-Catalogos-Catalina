/**
 */
package catalogo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Empresa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link catalogo.Empresa#getNombre <em>Nombre</em>}</li>
 *   <li>{@link catalogo.Empresa#getDireccion <em>Direccion</em>}</li>
 *   <li>{@link catalogo.Empresa#getEmail <em>Email</em>}</li>
 *   <li>{@link catalogo.Empresa#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link catalogo.Empresa#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link catalogo.Empresa#getCatalogo <em>Catalogo</em>}</li>
 *   <li>{@link catalogo.Empresa#getUrlImagen <em>Url Imagen</em>}</li>
 * </ul>
 * </p>
 *
 * @see catalogo.CatalogoPackage#getEmpresa()
 * @model
 * @generated
 */
public interface Empresa extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see catalogo.CatalogoPackage#getEmpresa_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link catalogo.Empresa#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Direccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direccion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direccion</em>' attribute.
	 * @see #setDireccion(String)
	 * @see catalogo.CatalogoPackage#getEmpresa_Direccion()
	 * @model
	 * @generated
	 */
	String getDireccion();

	/**
	 * Sets the value of the '{@link catalogo.Empresa#getDireccion <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direccion</em>' attribute.
	 * @see #getDireccion()
	 * @generated
	 */
	void setDireccion(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see catalogo.CatalogoPackage#getEmpresa_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link catalogo.Empresa#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telefono</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telefono</em>' attribute.
	 * @see #setTelefono(String)
	 * @see catalogo.CatalogoPackage#getEmpresa_Telefono()
	 * @model
	 * @generated
	 */
	String getTelefono();

	/**
	 * Sets the value of the '{@link catalogo.Empresa#getTelefono <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefono</em>' attribute.
	 * @see #getTelefono()
	 * @generated
	 */
	void setTelefono(String value);

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see catalogo.CatalogoPackage#getEmpresa_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link catalogo.Empresa#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Catalogo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalogo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalogo</em>' containment reference.
	 * @see #setCatalogo(Catalogo)
	 * @see catalogo.CatalogoPackage#getEmpresa_Catalogo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Catalogo getCatalogo();

	/**
	 * Sets the value of the '{@link catalogo.Empresa#getCatalogo <em>Catalogo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalogo</em>' containment reference.
	 * @see #getCatalogo()
	 * @generated
	 */
	void setCatalogo(Catalogo value);

	/**
	 * Returns the value of the '<em><b>Url Imagen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url Imagen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Imagen</em>' attribute.
	 * @see #setUrlImagen(String)
	 * @see catalogo.CatalogoPackage#getEmpresa_UrlImagen()
	 * @model
	 * @generated
	 */
	String getUrlImagen();

	/**
	 * Sets the value of the '{@link catalogo.Empresa#getUrlImagen <em>Url Imagen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Imagen</em>' attribute.
	 * @see #getUrlImagen()
	 * @generated
	 */
	void setUrlImagen(String value);

} // Empresa
