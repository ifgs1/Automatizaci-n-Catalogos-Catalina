/**
 */
package catalogo.impl;

import catalogo.Catalogo;
import catalogo.CatalogoPackage;
import catalogo.Categoria;

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
 * An implementation of the model object '<em><b>Catalogo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link catalogo.impl.CatalogoImpl#getIdCatalogo <em>Id Catalogo</em>}</li>
 *   <li>{@link catalogo.impl.CatalogoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link catalogo.impl.CatalogoImpl#getCategorias <em>Categorias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CatalogoImpl extends MinimalEObjectImpl.Container implements Catalogo {
	/**
	 * The default value of the '{@link #getIdCatalogo() <em>Id Catalogo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCatalogo()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_CATALOGO_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getIdCatalogo() <em>Id Catalogo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCatalogo()
	 * @generated
	 * @ordered
	 */
	protected long idCatalogo = ID_CATALOGO_EDEFAULT;

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
	 * The cached value of the '{@link #getCategorias() <em>Categorias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorias()
	 * @generated
	 * @ordered
	 */
	protected EList<Categoria> categorias;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatalogoPackage.Literals.CATALOGO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getIdCatalogo() {
		return idCatalogo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdCatalogo(long newIdCatalogo) {
		long oldIdCatalogo = idCatalogo;
		idCatalogo = newIdCatalogo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogoPackage.CATALOGO__ID_CATALOGO, oldIdCatalogo, idCatalogo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogoPackage.CATALOGO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Categoria> getCategorias() {
		if (categorias == null) {
			categorias = new EObjectContainmentEList<Categoria>(Categoria.class, this, CatalogoPackage.CATALOGO__CATEGORIAS);
		}
		return categorias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CatalogoPackage.CATALOGO__CATEGORIAS:
				return ((InternalEList<?>)getCategorias()).basicRemove(otherEnd, msgs);
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
			case CatalogoPackage.CATALOGO__ID_CATALOGO:
				return getIdCatalogo();
			case CatalogoPackage.CATALOGO__NOMBRE:
				return getNombre();
			case CatalogoPackage.CATALOGO__CATEGORIAS:
				return getCategorias();
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
			case CatalogoPackage.CATALOGO__ID_CATALOGO:
				setIdCatalogo((Long)newValue);
				return;
			case CatalogoPackage.CATALOGO__NOMBRE:
				setNombre((String)newValue);
				return;
			case CatalogoPackage.CATALOGO__CATEGORIAS:
				getCategorias().clear();
				getCategorias().addAll((Collection<? extends Categoria>)newValue);
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
			case CatalogoPackage.CATALOGO__ID_CATALOGO:
				setIdCatalogo(ID_CATALOGO_EDEFAULT);
				return;
			case CatalogoPackage.CATALOGO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case CatalogoPackage.CATALOGO__CATEGORIAS:
				getCategorias().clear();
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
			case CatalogoPackage.CATALOGO__ID_CATALOGO:
				return idCatalogo != ID_CATALOGO_EDEFAULT;
			case CatalogoPackage.CATALOGO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case CatalogoPackage.CATALOGO__CATEGORIAS:
				return categorias != null && !categorias.isEmpty();
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
		result.append(" (idCatalogo: ");
		result.append(idCatalogo);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //CatalogoImpl
