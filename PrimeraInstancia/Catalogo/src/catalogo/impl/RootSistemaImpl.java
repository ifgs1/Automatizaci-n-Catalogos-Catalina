/**
 */
package catalogo.impl;

import catalogo.CatalogoPackage;
import catalogo.Empresa;
import catalogo.RootSistema;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Sistema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link catalogo.impl.RootSistemaImpl#getEmpresa <em>Empresa</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootSistemaImpl extends MinimalEObjectImpl.Container implements RootSistema {
	/**
	 * The cached value of the '{@link #getEmpresa() <em>Empresa</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpresa()
	 * @generated
	 * @ordered
	 */
	protected Empresa empresa;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootSistemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatalogoPackage.Literals.ROOT_SISTEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Empresa getEmpresa() {
		return empresa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmpresa(Empresa newEmpresa, NotificationChain msgs) {
		Empresa oldEmpresa = empresa;
		empresa = newEmpresa;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CatalogoPackage.ROOT_SISTEMA__EMPRESA, oldEmpresa, newEmpresa);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpresa(Empresa newEmpresa) {
		if (newEmpresa != empresa) {
			NotificationChain msgs = null;
			if (empresa != null)
				msgs = ((InternalEObject)empresa).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CatalogoPackage.ROOT_SISTEMA__EMPRESA, null, msgs);
			if (newEmpresa != null)
				msgs = ((InternalEObject)newEmpresa).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CatalogoPackage.ROOT_SISTEMA__EMPRESA, null, msgs);
			msgs = basicSetEmpresa(newEmpresa, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogoPackage.ROOT_SISTEMA__EMPRESA, newEmpresa, newEmpresa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CatalogoPackage.ROOT_SISTEMA__EMPRESA:
				return basicSetEmpresa(null, msgs);
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
			case CatalogoPackage.ROOT_SISTEMA__EMPRESA:
				return getEmpresa();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CatalogoPackage.ROOT_SISTEMA__EMPRESA:
				setEmpresa((Empresa)newValue);
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
			case CatalogoPackage.ROOT_SISTEMA__EMPRESA:
				setEmpresa((Empresa)null);
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
			case CatalogoPackage.ROOT_SISTEMA__EMPRESA:
				return empresa != null;
		}
		return super.eIsSet(featureID);
	}

} //RootSistemaImpl
