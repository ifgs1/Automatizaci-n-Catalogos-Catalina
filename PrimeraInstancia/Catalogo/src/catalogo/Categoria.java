/**
 */
package catalogo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categoria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link catalogo.Categoria#getIdCategoria <em>Id Categoria</em>}</li>
 *   <li>{@link catalogo.Categoria#getNombre <em>Nombre</em>}</li>
 *   <li>{@link catalogo.Categoria#getProductos <em>Productos</em>}</li>
 * </ul>
 * </p>
 *
 * @see catalogo.CatalogoPackage#getCategoria()
 * @model
 * @generated
 */
public interface Categoria extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Categoria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Categoria</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Categoria</em>' attribute.
	 * @see #setIdCategoria(long)
	 * @see catalogo.CatalogoPackage#getCategoria_IdCategoria()
	 * @model
	 * @generated
	 */
	long getIdCategoria();

	/**
	 * Sets the value of the '{@link catalogo.Categoria#getIdCategoria <em>Id Categoria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Categoria</em>' attribute.
	 * @see #getIdCategoria()
	 * @generated
	 */
	void setIdCategoria(long value);

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
	 * @see catalogo.CatalogoPackage#getCategoria_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link catalogo.Categoria#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Productos</b></em>' containment reference list.
	 * The list contents are of type {@link catalogo.Producto}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Productos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productos</em>' containment reference list.
	 * @see catalogo.CatalogoPackage#getCategoria_Productos()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Producto> getProductos();

} // Categoria
