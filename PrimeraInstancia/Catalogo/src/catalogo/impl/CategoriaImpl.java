/**
 */
package catalogo.impl;

import catalogo.CatalogoPackage;
import catalogo.Categoria;
import catalogo.Producto;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Categoria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link catalogo.impl.CategoriaImpl#getIdCategoria <em>Id Categoria</em>}</li>
 *   <li>{@link catalogo.impl.CategoriaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link catalogo.impl.CategoriaImpl#getProductos <em>Productos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoriaImpl extends MinimalEObjectImpl.Container implements Categoria {
	/**
	 * The default value of the '{@link #getIdCategoria() <em>Id Categoria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCategoria()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_CATEGORIA_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getIdCategoria() <em>Id Categoria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCategoria()
	 * @generated
	 * @ordered
	 */
	protected long idCategoria = ID_CATEGORIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductos() <em>Productos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductos()
	 * @generated
	 * @ordered
	 */
	protected EList<Producto> productos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoriaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatalogoPackage.Literals.CATEGORIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getIdCategoria() {
		return idCategoria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdCategoria(long newIdCategoria) {
		long oldIdCategoria = idCategoria;
		idCategoria = newIdCategoria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogoPackage.CATEGORIA__ID_CATEGORIA, oldIdCategoria, idCategoria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogoPackage.CATEGORIA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Producto> getProductos() {
		if (productos == null) {
			productos = new EObjectContainmentEList<Producto>(Producto.class, this, CatalogoPackage.CATEGORIA__PRODUCTOS);
		}
		return productos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CatalogoPackage.CATEGORIA__PRODUCTOS:
				return ((InternalEList<?>)getProductos()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CatalogoPackage.CATEGORIA__ID_CATEGORIA:
				return getIdCategoria();
			case CatalogoPackage.CATEGORIA__NOMBRE:
				return getNombre();
			case CatalogoPackage.CATEGORIA__PRODUCTOS:
				return getProductos();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CatalogoPackage.CATEGORIA__ID_CATEGORIA:
				setIdCategoria((Long)newValue);
				return;
			case CatalogoPackage.CATEGORIA__NOMBRE:
				setNombre((String)newValue);
				return;
			case CatalogoPackage.CATEGORIA__PRODUCTOS:
				getProductos().clear();
				getProductos().addAll((Collection<? extends Producto>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CatalogoPackage.CATEGORIA__ID_CATEGORIA:
				setIdCategoria(ID_CATEGORIA_EDEFAULT);
				return;
			case CatalogoPackage.CATEGORIA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case CatalogoPackage.CATEGORIA__PRODUCTOS:
				getProductos().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CatalogoPackage.CATEGORIA__ID_CATEGORIA:
				return idCategoria != ID_CATEGORIA_EDEFAULT;
			case CatalogoPackage.CATEGORIA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case CatalogoPackage.CATEGORIA__PRODUCTOS:
				return productos != null && !productos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (idCategoria: ");
		result.append(idCategoria);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //CategoriaImpl
