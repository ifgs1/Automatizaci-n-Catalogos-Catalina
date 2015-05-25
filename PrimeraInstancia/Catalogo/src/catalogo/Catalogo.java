/**
 */
package catalogo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalogo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link catalogo.Catalogo#getIdCatalogo <em>Id Catalogo</em>}</li>
 *   <li>{@link catalogo.Catalogo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link catalogo.Catalogo#getCategorias <em>Categorias</em>}</li>
 * </ul>
 * </p>
 *
 * @see catalogo.CatalogoPackage#getCatalogo()
 * @model
 * @generated
 */
public interface Catalogo extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Catalogo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Catalogo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Catalogo</em>' attribute.
	 * @see #setIdCatalogo(long)
	 * @see catalogo.CatalogoPackage#getCatalogo_IdCatalogo()
	 * @model
	 * @generated
	 */
	long getIdCatalogo();

	/**
	 * Sets the value of the '{@link catalogo.Catalogo#getIdCatalogo <em>Id Catalogo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Catalogo</em>' attribute.
	 * @see #getIdCatalogo()
	 * @generated
	 */
	void setIdCatalogo(long value);

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
	 * @see catalogo.CatalogoPackage#getCatalogo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link catalogo.Catalogo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Categorias</b></em>' containment reference list.
	 * The list contents are of type {@link catalogo.Categoria}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorias</em>' containment reference list.
	 * @see catalogo.CatalogoPackage#getCatalogo_Categorias()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Categoria> getCategorias();

} // Catalogo
