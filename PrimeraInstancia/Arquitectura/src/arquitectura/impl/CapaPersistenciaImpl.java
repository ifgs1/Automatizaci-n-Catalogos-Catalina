/**
 */
package arquitectura.impl;

import arquitectura.ArquitecturaPackage;
import arquitectura.CapaPersistencia;
import arquitectura.EntidadPersistencia;
import arquitectura.Insert;

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
 * An implementation of the model object '<em><b>Capa Persistencia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arquitectura.impl.CapaPersistenciaImpl#getEntidades <em>Entidades</em>}</li>
 *   <li>{@link arquitectura.impl.CapaPersistenciaImpl#getInserts <em>Inserts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapaPersistenciaImpl extends MinimalEObjectImpl.Container implements CapaPersistencia {
	/**
	 * The cached value of the '{@link #getEntidades() <em>Entidades</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidades()
	 * @generated
	 * @ordered
	 */
	protected EList<EntidadPersistencia> entidades;

	/**
	 * The cached value of the '{@link #getInserts() <em>Inserts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInserts()
	 * @generated
	 * @ordered
	 */
	protected EList<Insert> inserts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapaPersistenciaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArquitecturaPackage.Literals.CAPA_PERSISTENCIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntidadPersistencia> getEntidades() {
		if (entidades == null) {
			entidades = new EObjectContainmentEList<EntidadPersistencia>(EntidadPersistencia.class, this, ArquitecturaPackage.CAPA_PERSISTENCIA__ENTIDADES);
		}
		return entidades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Insert> getInserts() {
		if (inserts == null) {
			inserts = new EObjectContainmentEList<Insert>(Insert.class, this, ArquitecturaPackage.CAPA_PERSISTENCIA__INSERTS);
		}
		return inserts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArquitecturaPackage.CAPA_PERSISTENCIA__ENTIDADES:
				return ((InternalEList<?>)getEntidades()).basicRemove(otherEnd, msgs);
			case ArquitecturaPackage.CAPA_PERSISTENCIA__INSERTS:
				return ((InternalEList<?>)getInserts()).basicRemove(otherEnd, msgs);
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
			case ArquitecturaPackage.CAPA_PERSISTENCIA__ENTIDADES:
				return getEntidades();
			case ArquitecturaPackage.CAPA_PERSISTENCIA__INSERTS:
				return getInserts();
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
			case ArquitecturaPackage.CAPA_PERSISTENCIA__ENTIDADES:
				getEntidades().clear();
				getEntidades().addAll((Collection<? extends EntidadPersistencia>)newValue);
				return;
			case ArquitecturaPackage.CAPA_PERSISTENCIA__INSERTS:
				getInserts().clear();
				getInserts().addAll((Collection<? extends Insert>)newValue);
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
			case ArquitecturaPackage.CAPA_PERSISTENCIA__ENTIDADES:
				getEntidades().clear();
				return;
			case ArquitecturaPackage.CAPA_PERSISTENCIA__INSERTS:
				getInserts().clear();
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
			case ArquitecturaPackage.CAPA_PERSISTENCIA__ENTIDADES:
				return entidades != null && !entidades.isEmpty();
			case ArquitecturaPackage.CAPA_PERSISTENCIA__INSERTS:
				return inserts != null && !inserts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapaPersistenciaImpl
