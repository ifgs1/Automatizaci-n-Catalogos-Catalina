/**
 */
package arquitectura.impl;

import arquitectura.ArquitecturaPackage;
import arquitectura.CapaServicio;
import arquitectura.Servicio;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capa Servicio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arquitectura.impl.CapaServicioImpl#getServicios <em>Servicios</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapaServicioImpl extends MinimalEObjectImpl.Container implements CapaServicio {
	/**
	 * The cached value of the '{@link #getServicios() <em>Servicios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicios()
	 * @generated
	 * @ordered
	 */
	protected EList<Servicio> servicios;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapaServicioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArquitecturaPackage.Literals.CAPA_SERVICIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Servicio> getServicios() {
		if (servicios == null) {
			servicios = new EObjectContainmentEList<Servicio>(Servicio.class, this, ArquitecturaPackage.CAPA_SERVICIO__SERVICIOS);
		}
		return servicios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArquitecturaPackage.CAPA_SERVICIO__SERVICIOS:
				return ((InternalEList<?>)getServicios()).basicRemove(otherEnd, msgs);
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
			case ArquitecturaPackage.CAPA_SERVICIO__SERVICIOS:
				return getServicios();
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
			case ArquitecturaPackage.CAPA_SERVICIO__SERVICIOS:
				getServicios().clear();
				getServicios().addAll((Collection<? extends Servicio>)newValue);
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
			case ArquitecturaPackage.CAPA_SERVICIO__SERVICIOS:
				getServicios().clear();
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
			case ArquitecturaPackage.CAPA_SERVICIO__SERVICIOS:
				return servicios != null && !servicios.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapaServicioImpl
