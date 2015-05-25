/**
 */
package arquitectura.impl;

import arquitectura.ArquitecturaPackage;
import arquitectura.BeanDAO;
import arquitectura.CapaAccesoDatos;
import arquitectura.InterfaceDAO;

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
 * An implementation of the model object '<em><b>Capa Acceso Datos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arquitectura.impl.CapaAccesoDatosImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link arquitectura.impl.CapaAccesoDatosImpl#getBeans <em>Beans</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapaAccesoDatosImpl extends MinimalEObjectImpl.Container implements CapaAccesoDatos {
	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceDAO> interfaces;

	/**
	 * The cached value of the '{@link #getBeans() <em>Beans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeans()
	 * @generated
	 * @ordered
	 */
	protected EList<BeanDAO> beans;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapaAccesoDatosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArquitecturaPackage.Literals.CAPA_ACCESO_DATOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceDAO> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentEList<InterfaceDAO>(InterfaceDAO.class, this, ArquitecturaPackage.CAPA_ACCESO_DATOS__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BeanDAO> getBeans() {
		if (beans == null) {
			beans = new EObjectContainmentEList<BeanDAO>(BeanDAO.class, this, ArquitecturaPackage.CAPA_ACCESO_DATOS__BEANS);
		}
		return beans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArquitecturaPackage.CAPA_ACCESO_DATOS__INTERFACES:
				return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
			case ArquitecturaPackage.CAPA_ACCESO_DATOS__BEANS:
				return ((InternalEList<?>)getBeans()).basicRemove(otherEnd, msgs);
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
			case ArquitecturaPackage.CAPA_ACCESO_DATOS__INTERFACES:
				return getInterfaces();
			case ArquitecturaPackage.CAPA_ACCESO_DATOS__BEANS:
				return getBeans();
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
			case ArquitecturaPackage.CAPA_ACCESO_DATOS__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends InterfaceDAO>)newValue);
				return;
			case ArquitecturaPackage.CAPA_ACCESO_DATOS__BEANS:
				getBeans().clear();
				getBeans().addAll((Collection<? extends BeanDAO>)newValue);
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
			case ArquitecturaPackage.CAPA_ACCESO_DATOS__INTERFACES:
				getInterfaces().clear();
				return;
			case ArquitecturaPackage.CAPA_ACCESO_DATOS__BEANS:
				getBeans().clear();
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
			case ArquitecturaPackage.CAPA_ACCESO_DATOS__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case ArquitecturaPackage.CAPA_ACCESO_DATOS__BEANS:
				return beans != null && !beans.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapaAccesoDatosImpl
