/**
 */
package arquitectura.impl;

import arquitectura.ArquitecturaPackage;
import arquitectura.BeanNegocio;
import arquitectura.CapaLogicaNegocio;
import arquitectura.InterfaceNegocio;
import arquitectura.JsonDTO;
import arquitectura.Mapper;

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
 * An implementation of the model object '<em><b>Capa Logica Negocio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arquitectura.impl.CapaLogicaNegocioImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link arquitectura.impl.CapaLogicaNegocioImpl#getBeans <em>Beans</em>}</li>
 *   <li>{@link arquitectura.impl.CapaLogicaNegocioImpl#getJsonsDTO <em>Jsons DTO</em>}</li>
 *   <li>{@link arquitectura.impl.CapaLogicaNegocioImpl#getMappers <em>Mappers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapaLogicaNegocioImpl extends MinimalEObjectImpl.Container implements CapaLogicaNegocio {
	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceNegocio> interfaces;

	/**
	 * The cached value of the '{@link #getBeans() <em>Beans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeans()
	 * @generated
	 * @ordered
	 */
	protected EList<BeanNegocio> beans;

	/**
	 * The cached value of the '{@link #getJsonsDTO() <em>Jsons DTO</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonsDTO()
	 * @generated
	 * @ordered
	 */
	protected EList<JsonDTO> jsonsDTO;

	/**
	 * The cached value of the '{@link #getMappers() <em>Mappers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappers()
	 * @generated
	 * @ordered
	 */
	protected EList<Mapper> mappers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapaLogicaNegocioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArquitecturaPackage.Literals.CAPA_LOGICA_NEGOCIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceNegocio> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentEList<InterfaceNegocio>(InterfaceNegocio.class, this, ArquitecturaPackage.CAPA_LOGICA_NEGOCIO__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BeanNegocio> getBeans() {
		if (beans == null) {
			beans = new EObjectContainmentEList<BeanNegocio>(BeanNegocio.class, this, ArquitecturaPackage.CAPA_LOGICA_NEGOCIO__BEANS);
		}
		return beans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JsonDTO> getJsonsDTO() {
		if (jsonsDTO == null) {
			jsonsDTO = new EObjectContainmentEList<JsonDTO>(JsonDTO.class, this, ArquitecturaPackage.CAPA_LOGICA_NEGOCIO__JSONS_DTO);
		}
		return jsonsDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mapper> getMappers() {
		if (mappers == null) {
			mappers = new EObjectContainmentEList<Mapper>(Mapper.class, this, ArquitecturaPackage.CAPA_LOGICA_NEGOCIO__MAPPERS);
		}
		return mappers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArquitecturaPackage.CAPA_LOGICA_NEGOCIO__INTERFACES:
				return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
			case ArquitecturaPackage.CAPA_LOGICA_NEGOCIO__BEANS:
				return ((InternalEList<?>)getBeans()).basicRemove(otherEnd, msgs);
			case ArquitecturaPackage.CAPA_LOGICA_NEGOCIO__JSONS_DTO:
				return ((InternalEList<?>)getJsonsDTO()).basicRemove(otherEnd, msgs);
			case ArquitecturaPackage.CAPA_LOGICA_NEGOCIO__MAPPERS:
				return ((InternalEList<?>)getMappers()).basicRemove(otherEnd, msgs);
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
			case ArquitecturaPackage.CAPA_LOGICA_NEGOCIO__INTERFACES:
				return getInterfaces();
			case ArquitecturaPackage.CAPA_LOGICA_NEGOCIO__BEANS:
				return getBeans();
			case ArquitecturaPackage.CAPA_LOGICA_NEGOCIO__JSONS_DTO:
				return getJsonsDTO();
			case ArquitecturaPackage.CAPA_LOGICA_NEGOCIO__MAPPERS:
				return getMappers();
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
			case ArquitecturaPackage.CAPA_LOGICA_NEGOCIO__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends InterfaceNegocio>)newValue);
				return;
			case ArquitecturaPackage.CAPA_LOGICA_NEGOCIO__BEANS:
				getBeans().clear();
				getBeans().addAll((Collection<? extends BeanNegocio>)newValue);
				return;
			case ArquitecturaPackage.CAPA_LOGICA_NEGOCIO__JSONS_DTO:
				getJsonsDTO().clear();
				getJsonsDTO().addAll((Collection<? extends JsonDTO>)newValue);
				return;
			case ArquitecturaPackage.CAPA_LOGICA_NEGOCIO__MAPPERS:
				getMappers().clear();
				getMappers().addAll((Collection<? extends Mapper>)newValue);
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
			case ArquitecturaPackage.CAPA_LOGICA_NEGOCIO__INTERFACES:
				getInterfaces().clear();
				return;
			case ArquitecturaPackage.CAPA_LOGICA_NEGOCIO__BEANS:
				getBeans().clear();
				return;
			case ArquitecturaPackage.CAPA_LOGICA_NEGOCIO__JSONS_DTO:
				getJsonsDTO().clear();
				return;
			case ArquitecturaPackage.CAPA_LOGICA_NEGOCIO__MAPPERS:
				getMappers().clear();
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
			case ArquitecturaPackage.CAPA_LOGICA_NEGOCIO__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case ArquitecturaPackage.CAPA_LOGICA_NEGOCIO__BEANS:
				return beans != null && !beans.isEmpty();
			case ArquitecturaPackage.CAPA_LOGICA_NEGOCIO__JSONS_DTO:
				return jsonsDTO != null && !jsonsDTO.isEmpty();
			case ArquitecturaPackage.CAPA_LOGICA_NEGOCIO__MAPPERS:
				return mappers != null && !mappers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapaLogicaNegocioImpl
