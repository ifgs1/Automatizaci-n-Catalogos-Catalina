/**
 */
package arquitectura.impl;

import arquitectura.ArquitecturaPackage;
import arquitectura.CapaPresentacion;
import arquitectura.ComunicacionHttp;
import arquitectura.Controlador;
import arquitectura.EntidadPresentacion;
import arquitectura.Tecnologia;
import arquitectura.Vista;

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
 * An implementation of the model object '<em><b>Capa Presentacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arquitectura.impl.CapaPresentacionImpl#getVistas <em>Vistas</em>}</li>
 *   <li>{@link arquitectura.impl.CapaPresentacionImpl#getControladores <em>Controladores</em>}</li>
 *   <li>{@link arquitectura.impl.CapaPresentacionImpl#getComunicacionesHttp <em>Comunicaciones Http</em>}</li>
 *   <li>{@link arquitectura.impl.CapaPresentacionImpl#getEntidades <em>Entidades</em>}</li>
 *   <li>{@link arquitectura.impl.CapaPresentacionImpl#getTecnologia <em>Tecnologia</em>}</li>
 *   <li>{@link arquitectura.impl.CapaPresentacionImpl#isBarraBusqueda <em>Barra Busqueda</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapaPresentacionImpl extends MinimalEObjectImpl.Container implements CapaPresentacion {
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
	 * The cached value of the '{@link #getControladores() <em>Controladores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControladores()
	 * @generated
	 * @ordered
	 */
	protected EList<Controlador> controladores;

	/**
	 * The cached value of the '{@link #getComunicacionesHttp() <em>Comunicaciones Http</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComunicacionesHttp()
	 * @generated
	 * @ordered
	 */
	protected EList<ComunicacionHttp> comunicacionesHttp;

	/**
	 * The cached value of the '{@link #getEntidades() <em>Entidades</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidades()
	 * @generated
	 * @ordered
	 */
	protected EList<EntidadPresentacion> entidades;

	/**
	 * The default value of the '{@link #getTecnologia() <em>Tecnologia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTecnologia()
	 * @generated
	 * @ordered
	 */
	protected static final Tecnologia TECNOLOGIA_EDEFAULT = Tecnologia.ANDROID;

	/**
	 * The cached value of the '{@link #getTecnologia() <em>Tecnologia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTecnologia()
	 * @generated
	 * @ordered
	 */
	protected Tecnologia tecnologia = TECNOLOGIA_EDEFAULT;

	/**
	 * The default value of the '{@link #isBarraBusqueda() <em>Barra Busqueda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBarraBusqueda()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BARRA_BUSQUEDA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBarraBusqueda() <em>Barra Busqueda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBarraBusqueda()
	 * @generated
	 * @ordered
	 */
	protected boolean barraBusqueda = BARRA_BUSQUEDA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapaPresentacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArquitecturaPackage.Literals.CAPA_PRESENTACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vista> getVistas() {
		if (vistas == null) {
			vistas = new EObjectContainmentEList<Vista>(Vista.class, this, ArquitecturaPackage.CAPA_PRESENTACION__VISTAS);
		}
		return vistas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Controlador> getControladores() {
		if (controladores == null) {
			controladores = new EObjectContainmentEList<Controlador>(Controlador.class, this, ArquitecturaPackage.CAPA_PRESENTACION__CONTROLADORES);
		}
		return controladores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComunicacionHttp> getComunicacionesHttp() {
		if (comunicacionesHttp == null) {
			comunicacionesHttp = new EObjectContainmentEList<ComunicacionHttp>(ComunicacionHttp.class, this, ArquitecturaPackage.CAPA_PRESENTACION__COMUNICACIONES_HTTP);
		}
		return comunicacionesHttp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntidadPresentacion> getEntidades() {
		if (entidades == null) {
			entidades = new EObjectContainmentEList<EntidadPresentacion>(EntidadPresentacion.class, this, ArquitecturaPackage.CAPA_PRESENTACION__ENTIDADES);
		}
		return entidades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tecnologia getTecnologia() {
		return tecnologia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTecnologia(Tecnologia newTecnologia) {
		Tecnologia oldTecnologia = tecnologia;
		tecnologia = newTecnologia == null ? TECNOLOGIA_EDEFAULT : newTecnologia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArquitecturaPackage.CAPA_PRESENTACION__TECNOLOGIA, oldTecnologia, tecnologia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBarraBusqueda() {
		return barraBusqueda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarraBusqueda(boolean newBarraBusqueda) {
		boolean oldBarraBusqueda = barraBusqueda;
		barraBusqueda = newBarraBusqueda;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArquitecturaPackage.CAPA_PRESENTACION__BARRA_BUSQUEDA, oldBarraBusqueda, barraBusqueda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArquitecturaPackage.CAPA_PRESENTACION__VISTAS:
				return ((InternalEList<?>)getVistas()).basicRemove(otherEnd, msgs);
			case ArquitecturaPackage.CAPA_PRESENTACION__CONTROLADORES:
				return ((InternalEList<?>)getControladores()).basicRemove(otherEnd, msgs);
			case ArquitecturaPackage.CAPA_PRESENTACION__COMUNICACIONES_HTTP:
				return ((InternalEList<?>)getComunicacionesHttp()).basicRemove(otherEnd, msgs);
			case ArquitecturaPackage.CAPA_PRESENTACION__ENTIDADES:
				return ((InternalEList<?>)getEntidades()).basicRemove(otherEnd, msgs);
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
			case ArquitecturaPackage.CAPA_PRESENTACION__VISTAS:
				return getVistas();
			case ArquitecturaPackage.CAPA_PRESENTACION__CONTROLADORES:
				return getControladores();
			case ArquitecturaPackage.CAPA_PRESENTACION__COMUNICACIONES_HTTP:
				return getComunicacionesHttp();
			case ArquitecturaPackage.CAPA_PRESENTACION__ENTIDADES:
				return getEntidades();
			case ArquitecturaPackage.CAPA_PRESENTACION__TECNOLOGIA:
				return getTecnologia();
			case ArquitecturaPackage.CAPA_PRESENTACION__BARRA_BUSQUEDA:
				return isBarraBusqueda();
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
			case ArquitecturaPackage.CAPA_PRESENTACION__VISTAS:
				getVistas().clear();
				getVistas().addAll((Collection<? extends Vista>)newValue);
				return;
			case ArquitecturaPackage.CAPA_PRESENTACION__CONTROLADORES:
				getControladores().clear();
				getControladores().addAll((Collection<? extends Controlador>)newValue);
				return;
			case ArquitecturaPackage.CAPA_PRESENTACION__COMUNICACIONES_HTTP:
				getComunicacionesHttp().clear();
				getComunicacionesHttp().addAll((Collection<? extends ComunicacionHttp>)newValue);
				return;
			case ArquitecturaPackage.CAPA_PRESENTACION__ENTIDADES:
				getEntidades().clear();
				getEntidades().addAll((Collection<? extends EntidadPresentacion>)newValue);
				return;
			case ArquitecturaPackage.CAPA_PRESENTACION__TECNOLOGIA:
				setTecnologia((Tecnologia)newValue);
				return;
			case ArquitecturaPackage.CAPA_PRESENTACION__BARRA_BUSQUEDA:
				setBarraBusqueda((Boolean)newValue);
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
			case ArquitecturaPackage.CAPA_PRESENTACION__VISTAS:
				getVistas().clear();
				return;
			case ArquitecturaPackage.CAPA_PRESENTACION__CONTROLADORES:
				getControladores().clear();
				return;
			case ArquitecturaPackage.CAPA_PRESENTACION__COMUNICACIONES_HTTP:
				getComunicacionesHttp().clear();
				return;
			case ArquitecturaPackage.CAPA_PRESENTACION__ENTIDADES:
				getEntidades().clear();
				return;
			case ArquitecturaPackage.CAPA_PRESENTACION__TECNOLOGIA:
				setTecnologia(TECNOLOGIA_EDEFAULT);
				return;
			case ArquitecturaPackage.CAPA_PRESENTACION__BARRA_BUSQUEDA:
				setBarraBusqueda(BARRA_BUSQUEDA_EDEFAULT);
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
			case ArquitecturaPackage.CAPA_PRESENTACION__VISTAS:
				return vistas != null && !vistas.isEmpty();
			case ArquitecturaPackage.CAPA_PRESENTACION__CONTROLADORES:
				return controladores != null && !controladores.isEmpty();
			case ArquitecturaPackage.CAPA_PRESENTACION__COMUNICACIONES_HTTP:
				return comunicacionesHttp != null && !comunicacionesHttp.isEmpty();
			case ArquitecturaPackage.CAPA_PRESENTACION__ENTIDADES:
				return entidades != null && !entidades.isEmpty();
			case ArquitecturaPackage.CAPA_PRESENTACION__TECNOLOGIA:
				return tecnologia != TECNOLOGIA_EDEFAULT;
			case ArquitecturaPackage.CAPA_PRESENTACION__BARRA_BUSQUEDA:
				return barraBusqueda != BARRA_BUSQUEDA_EDEFAULT;
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
		result.append(" (tecnologia: ");
		result.append(tecnologia);
		result.append(", barraBusqueda: ");
		result.append(barraBusqueda);
		result.append(')');
		return result.toString();
	}

} //CapaPresentacionImpl
