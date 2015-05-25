/**
 */
package catalogo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Producto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link catalogo.Producto#getIdProducto <em>Id Producto</em>}</li>
 *   <li>{@link catalogo.Producto#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link catalogo.Producto#getNombre <em>Nombre</em>}</li>
 * </ul>
 * </p>
 *
 * @see catalogo.CatalogoPackage#getProducto()
 * @model
 * @generated
 */
public interface Producto extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Producto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Producto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Producto</em>' attribute.
	 * @see #setIdProducto(long)
	 * @see catalogo.CatalogoPackage#getProducto_IdProducto()
	 * @model
	 * @generated
	 */
	long getIdProducto();

	/**
	 * Sets the value of the '{@link catalogo.Producto#getIdProducto <em>Id Producto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Producto</em>' attribute.
	 * @see #getIdProducto()
	 * @generated
	 */
	void setIdProducto(long value);

	/**
	 * Returns the value of the '<em><b>Atributos</b></em>' containment reference list.
	 * The list contents are of type {@link catalogo.Atributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos</em>' containment reference list.
	 * @see catalogo.CatalogoPackage#getProducto_Atributos()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Atributo> getAtributos();

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
	 * @see catalogo.CatalogoPackage#getProducto_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link catalogo.Producto#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // Producto
