/**
 */
package estilos.impl;

import estilos.EstilosPackage;
import estilos.RootSistema;
import estilos.Vista;

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
 * An implementation of the model object '<em><b>Root Sistema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link estilos.impl.RootSistemaImpl#getVistas <em>Vistas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootSistemaImpl extends MinimalEObjectImpl.Container implements RootSistema {
	/**
	 * The cached value of the '{@link #getVistas() <em>Vistas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVistas()
	 * @generated
	 * @ordered
	 */
	protected EList<Vista> vistas;

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
		return EstilosPackage.Literals.ROOT_SISTEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vista> getVistas() {
		if (vistas == null) {
			vistas = new EObjectContainmentEList<Vista>(Vista.class, this, EstilosPackage.ROOT_SISTEMA__VISTAS);
		}
		return vistas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EstilosPackage.ROOT_SISTEMA__VISTAS:
				return ((InternalEList<?>)getVistas()).basicRemove(otherEnd, msgs);
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
			case EstilosPackage.ROOT_SISTEMA__VISTAS:
				return getVistas();
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
			case EstilosPackage.ROOT_SISTEMA__VISTAS:
				getVistas().clear();
				getVistas().addAll((Collection<? extends Vista>)newValue);
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
			case EstilosPackage.ROOT_SISTEMA__VISTAS:
				getVistas().clear();
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
			case EstilosPackage.ROOT_SISTEMA__VISTAS:
				return vistas != null && !vistas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RootSistemaImpl
