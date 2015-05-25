/**
 */
package catalogo.impl;

import catalogo.Atributo;
import catalogo.CatalogoPackage;
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
 * An implementation of the model object '<em><b>Producto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link catalogo.impl.ProductoImpl#getIdProducto <em>Id Producto</em>}</li>
 *   <li>{@link catalogo.impl.ProductoImpl#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link catalogo.impl.ProductoImpl#getNombre <em>Nombre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductoImpl extends MinimalEObjectImpl.Container implements Producto {
	/**
	 * The default value of the '{@link #getIdProducto() <em>Id Producto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdProducto()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_PRODUCTO_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getIdProducto() <em>Id Producto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdProducto()
	 * @generated
	 * @ordered
	 */
	protected long idProducto = ID_PRODUCTO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAtributos() <em>Atributos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributos()
	 * @generated
	 * @ordered
	 */
	protected EList<Atributo> atributos;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatalogoPackage.Literals.PRODUCTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getIdProducto() {
		return idProducto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdProducto(long newIdProducto) {
		long oldIdProducto = idProducto;
		idProducto = newIdProducto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogoPackage.PRODUCTO__ID_PRODUCTO, oldIdProducto, idProducto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Atributo> getAtributos() {
		if (atributos == null) {
			atributos = new EObjectContainmentEList<Atributo>(Atributo.class, this, CatalogoPackage.PRODUCTO__ATRIBUTOS);
		}
		return atributos;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogoPackage.PRODUCTO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CatalogoPackage.PRODUCTO__ATRIBUTOS:
				return ((InternalEList<?>)getAtributos()).basicRemove(otherEnd, msgs);
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
			case CatalogoPackage.PRODUCTO__ID_PRODUCTO:
				return getIdProducto();
			case CatalogoPackage.PRODUCTO__ATRIBUTOS:
				return getAtributos();
			case CatalogoPackage.PRODUCTO__NOMBRE:
				return getNombre();
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
			case CatalogoPackage.PRODUCTO__ID_PRODUCTO:
				setIdProducto((Long)newValue);
				return;
			case CatalogoPackage.PRODUCTO__ATRIBUTOS:
				getAtributos().clear();
				getAtributos().addAll((Collection<? extends Atributo>)newValue);
				return;
			case CatalogoPackage.PRODUCTO__NOMBRE:
				setNombre((String)newValue);
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
			case CatalogoPackage.PRODUCTO__ID_PRODUCTO:
				setIdProducto(ID_PRODUCTO_EDEFAULT);
				return;
			case CatalogoPackage.PRODUCTO__ATRIBUTOS:
				getAtributos().clear();
				return;
			case CatalogoPackage.PRODUCTO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
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
			case CatalogoPackage.PRODUCTO__ID_PRODUCTO:
				return idProducto != ID_PRODUCTO_EDEFAULT;
			case CatalogoPackage.PRODUCTO__ATRIBUTOS:
				return atributos != null && !atributos.isEmpty();
			case CatalogoPackage.PRODUCTO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
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
		result.append(" (idProducto: ");
		result.append(idProducto);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //ProductoImpl
