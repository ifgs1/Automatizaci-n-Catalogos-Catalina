/**
 */
package arquitectura.impl;

import arquitectura.ArquitecturaPackage;
import arquitectura.CapaAccesoDatos;
import arquitectura.CapaLogicaNegocio;
import arquitectura.CapaPersistencia;
import arquitectura.CapaPresentacion;
import arquitectura.CapaServicio;
import arquitectura.RootSistema;

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
 * An implementation of the model object '<em><b>Root Sistema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arquitectura.impl.RootSistemaImpl#getPresentaciones <em>Presentaciones</em>}</li>
 *   <li>{@link arquitectura.impl.RootSistemaImpl#getCapaLogicaNegocio <em>Capa Logica Negocio</em>}</li>
 *   <li>{@link arquitectura.impl.RootSistemaImpl#getCapaServicio <em>Capa Servicio</em>}</li>
 *   <li>{@link arquitectura.impl.RootSistemaImpl#getCapaAccesoDatos <em>Capa Acceso Datos</em>}</li>
 *   <li>{@link arquitectura.impl.RootSistemaImpl#getCapaPersistencia <em>Capa Persistencia</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootSistemaImpl extends MinimalEObjectImpl.Container implements RootSistema {
	/**
	 * The cached value of the '{@link #getPresentaciones() <em>Presentaciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentaciones()
	 * @generated
	 * @ordered
	 */
	protected EList<CapaPresentacion> presentaciones;

	/**
	 * The cached value of the '{@link #getCapaLogicaNegocio() <em>Capa Logica Negocio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaLogicaNegocio()
	 * @generated
	 * @ordered
	 */
	protected CapaLogicaNegocio capaLogicaNegocio;

	/**
	 * The cached value of the '{@link #getCapaServicio() <em>Capa Servicio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaServicio()
	 * @generated
	 * @ordered
	 */
	protected CapaServicio capaServicio;

	/**
	 * The cached value of the '{@link #getCapaAccesoDatos() <em>Capa Acceso Datos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaAccesoDatos()
	 * @generated
	 * @ordered
	 */
	protected CapaAccesoDatos capaAccesoDatos;

	/**
	 * The cached value of the '{@link #getCapaPersistencia() <em>Capa Persistencia</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaPersistencia()
	 * @generated
	 * @ordered
	 */
	protected CapaPersistencia capaPersistencia;

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
		return ArquitecturaPackage.Literals.ROOT_SISTEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapaPresentacion> getPresentaciones() {
		if (presentaciones == null) {
			presentaciones = new EObjectContainmentEList<CapaPresentacion>(CapaPresentacion.class, this, ArquitecturaPackage.ROOT_SISTEMA__PRESENTACIONES);
		}
		return presentaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapaLogicaNegocio getCapaLogicaNegocio() {
		return capaLogicaNegocio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapaLogicaNegocio(CapaLogicaNegocio newCapaLogicaNegocio, NotificationChain msgs) {
		CapaLogicaNegocio oldCapaLogicaNegocio = capaLogicaNegocio;
		capaLogicaNegocio = newCapaLogicaNegocio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArquitecturaPackage.ROOT_SISTEMA__CAPA_LOGICA_NEGOCIO, oldCapaLogicaNegocio, newCapaLogicaNegocio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaLogicaNegocio(CapaLogicaNegocio newCapaLogicaNegocio) {
		if (newCapaLogicaNegocio != capaLogicaNegocio) {
			NotificationChain msgs = null;
			if (capaLogicaNegocio != null)
				msgs = ((InternalEObject)capaLogicaNegocio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArquitecturaPackage.ROOT_SISTEMA__CAPA_LOGICA_NEGOCIO, null, msgs);
			if (newCapaLogicaNegocio != null)
				msgs = ((InternalEObject)newCapaLogicaNegocio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArquitecturaPackage.ROOT_SISTEMA__CAPA_LOGICA_NEGOCIO, null, msgs);
			msgs = basicSetCapaLogicaNegocio(newCapaLogicaNegocio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArquitecturaPackage.ROOT_SISTEMA__CAPA_LOGICA_NEGOCIO, newCapaLogicaNegocio, newCapaLogicaNegocio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapaServicio getCapaServicio() {
		return capaServicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapaServicio(CapaServicio newCapaServicio, NotificationChain msgs) {
		CapaServicio oldCapaServicio = capaServicio;
		capaServicio = newCapaServicio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArquitecturaPackage.ROOT_SISTEMA__CAPA_SERVICIO, oldCapaServicio, newCapaServicio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaServicio(CapaServicio newCapaServicio) {
		if (newCapaServicio != capaServicio) {
			NotificationChain msgs = null;
			if (capaServicio != null)
				msgs = ((InternalEObject)capaServicio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArquitecturaPackage.ROOT_SISTEMA__CAPA_SERVICIO, null, msgs);
			if (newCapaServicio != null)
				msgs = ((InternalEObject)newCapaServicio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArquitecturaPackage.ROOT_SISTEMA__CAPA_SERVICIO, null, msgs);
			msgs = basicSetCapaServicio(newCapaServicio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArquitecturaPackage.ROOT_SISTEMA__CAPA_SERVICIO, newCapaServicio, newCapaServicio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapaAccesoDatos getCapaAccesoDatos() {
		return capaAccesoDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapaAccesoDatos(CapaAccesoDatos newCapaAccesoDatos, NotificationChain msgs) {
		CapaAccesoDatos oldCapaAccesoDatos = capaAccesoDatos;
		capaAccesoDatos = newCapaAccesoDatos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArquitecturaPackage.ROOT_SISTEMA__CAPA_ACCESO_DATOS, oldCapaAccesoDatos, newCapaAccesoDatos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaAccesoDatos(CapaAccesoDatos newCapaAccesoDatos) {
		if (newCapaAccesoDatos != capaAccesoDatos) {
			NotificationChain msgs = null;
			if (capaAccesoDatos != null)
				msgs = ((InternalEObject)capaAccesoDatos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArquitecturaPackage.ROOT_SISTEMA__CAPA_ACCESO_DATOS, null, msgs);
			if (newCapaAccesoDatos != null)
				msgs = ((InternalEObject)newCapaAccesoDatos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArquitecturaPackage.ROOT_SISTEMA__CAPA_ACCESO_DATOS, null, msgs);
			msgs = basicSetCapaAccesoDatos(newCapaAccesoDatos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArquitecturaPackage.ROOT_SISTEMA__CAPA_ACCESO_DATOS, newCapaAccesoDatos, newCapaAccesoDatos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapaPersistencia getCapaPersistencia() {
		return capaPersistencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapaPersistencia(CapaPersistencia newCapaPersistencia, NotificationChain msgs) {
		CapaPersistencia oldCapaPersistencia = capaPersistencia;
		capaPersistencia = newCapaPersistencia;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArquitecturaPackage.ROOT_SISTEMA__CAPA_PERSISTENCIA, oldCapaPersistencia, newCapaPersistencia);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaPersistencia(CapaPersistencia newCapaPersistencia) {
		if (newCapaPersistencia != capaPersistencia) {
			NotificationChain msgs = null;
			if (capaPersistencia != null)
				msgs = ((InternalEObject)capaPersistencia).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArquitecturaPackage.ROOT_SISTEMA__CAPA_PERSISTENCIA, null, msgs);
			if (newCapaPersistencia != null)
				msgs = ((InternalEObject)newCapaPersistencia).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArquitecturaPackage.ROOT_SISTEMA__CAPA_PERSISTENCIA, null, msgs);
			msgs = basicSetCapaPersistencia(newCapaPersistencia, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArquitecturaPackage.ROOT_SISTEMA__CAPA_PERSISTENCIA, newCapaPersistencia, newCapaPersistencia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArquitecturaPackage.ROOT_SISTEMA__PRESENTACIONES:
				return ((InternalEList<?>)getPresentaciones()).basicRemove(otherEnd, msgs);
			case ArquitecturaPackage.ROOT_SISTEMA__CAPA_LOGICA_NEGOCIO:
				return basicSetCapaLogicaNegocio(null, msgs);
			case ArquitecturaPackage.ROOT_SISTEMA__CAPA_SERVICIO:
				return basicSetCapaServicio(null, msgs);
			case ArquitecturaPackage.ROOT_SISTEMA__CAPA_ACCESO_DATOS:
				return basicSetCapaAccesoDatos(null, msgs);
			case ArquitecturaPackage.ROOT_SISTEMA__CAPA_PERSISTENCIA:
				return basicSetCapaPersistencia(null, msgs);
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
			case ArquitecturaPackage.ROOT_SISTEMA__PRESENTACIONES:
				return getPresentaciones();
			case ArquitecturaPackage.ROOT_SISTEMA__CAPA_LOGICA_NEGOCIO:
				return getCapaLogicaNegocio();
			case ArquitecturaPackage.ROOT_SISTEMA__CAPA_SERVICIO:
				return getCapaServicio();
			case ArquitecturaPackage.ROOT_SISTEMA__CAPA_ACCESO_DATOS:
				return getCapaAccesoDatos();
			case ArquitecturaPackage.ROOT_SISTEMA__CAPA_PERSISTENCIA:
				return getCapaPersistencia();
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
			case ArquitecturaPackage.ROOT_SISTEMA__PRESENTACIONES:
				getPresentaciones().clear();
				getPresentaciones().addAll((Collection<? extends CapaPresentacion>)newValue);
				return;
			case ArquitecturaPackage.ROOT_SISTEMA__CAPA_LOGICA_NEGOCIO:
				setCapaLogicaNegocio((CapaLogicaNegocio)newValue);
				return;
			case ArquitecturaPackage.ROOT_SISTEMA__CAPA_SERVICIO:
				setCapaServicio((CapaServicio)newValue);
				return;
			case ArquitecturaPackage.ROOT_SISTEMA__CAPA_ACCESO_DATOS:
				setCapaAccesoDatos((CapaAccesoDatos)newValue);
				return;
			case ArquitecturaPackage.ROOT_SISTEMA__CAPA_PERSISTENCIA:
				setCapaPersistencia((CapaPersistencia)newValue);
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
			case ArquitecturaPackage.ROOT_SISTEMA__PRESENTACIONES:
				getPresentaciones().clear();
				return;
			case ArquitecturaPackage.ROOT_SISTEMA__CAPA_LOGICA_NEGOCIO:
				setCapaLogicaNegocio((CapaLogicaNegocio)null);
				return;
			case ArquitecturaPackage.ROOT_SISTEMA__CAPA_SERVICIO:
				setCapaServicio((CapaServicio)null);
				return;
			case ArquitecturaPackage.ROOT_SISTEMA__CAPA_ACCESO_DATOS:
				setCapaAccesoDatos((CapaAccesoDatos)null);
				return;
			case ArquitecturaPackage.ROOT_SISTEMA__CAPA_PERSISTENCIA:
				setCapaPersistencia((CapaPersistencia)null);
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
			case ArquitecturaPackage.ROOT_SISTEMA__PRESENTACIONES:
				return presentaciones != null && !presentaciones.isEmpty();
			case ArquitecturaPackage.ROOT_SISTEMA__CAPA_LOGICA_NEGOCIO:
				return capaLogicaNegocio != null;
			case ArquitecturaPackage.ROOT_SISTEMA__CAPA_SERVICIO:
				return capaServicio != null;
			case ArquitecturaPackage.ROOT_SISTEMA__CAPA_ACCESO_DATOS:
				return capaAccesoDatos != null;
			case ArquitecturaPackage.ROOT_SISTEMA__CAPA_PERSISTENCIA:
				return capaPersistencia != null;
		}
		return super.eIsSet(featureID);
	}

} //RootSistemaImpl
