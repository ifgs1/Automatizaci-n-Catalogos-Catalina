/**
 */
package estilos.impl;

import estilos.EstilosPackage;
import estilos.Letra;
import estilos.Tecnologia;
import estilos.Vista;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vista</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link estilos.impl.VistaImpl#getColorFondo <em>Color Fondo</em>}</li>
 *   <li>{@link estilos.impl.VistaImpl#isBarraBusqueda <em>Barra Busqueda</em>}</li>
 *   <li>{@link estilos.impl.VistaImpl#getLetra <em>Letra</em>}</li>
 *   <li>{@link estilos.impl.VistaImpl#getTecnologia <em>Tecnologia</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VistaImpl extends MinimalEObjectImpl.Container implements Vista {
	/**
	 * The default value of the '{@link #getColorFondo() <em>Color Fondo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorFondo()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_FONDO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColorFondo() <em>Color Fondo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorFondo()
	 * @generated
	 * @ordered
	 */
	protected String colorFondo = COLOR_FONDO_EDEFAULT;

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
	 * The cached value of the '{@link #getLetra() <em>Letra</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLetra()
	 * @generated
	 * @ordered
	 */
	protected Letra letra;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VistaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EstilosPackage.Literals.VISTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColorFondo() {
		return colorFondo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorFondo(String newColorFondo) {
		String oldColorFondo = colorFondo;
		colorFondo = newColorFondo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EstilosPackage.VISTA__COLOR_FONDO, oldColorFondo, colorFondo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EstilosPackage.VISTA__BARRA_BUSQUEDA, oldBarraBusqueda, barraBusqueda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Letra getLetra() {
		return letra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLetra(Letra newLetra, NotificationChain msgs) {
		Letra oldLetra = letra;
		letra = newLetra;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EstilosPackage.VISTA__LETRA, oldLetra, newLetra);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLetra(Letra newLetra) {
		if (newLetra != letra) {
			NotificationChain msgs = null;
			if (letra != null)
				msgs = ((InternalEObject)letra).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EstilosPackage.VISTA__LETRA, null, msgs);
			if (newLetra != null)
				msgs = ((InternalEObject)newLetra).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EstilosPackage.VISTA__LETRA, null, msgs);
			msgs = basicSetLetra(newLetra, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EstilosPackage.VISTA__LETRA, newLetra, newLetra));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EstilosPackage.VISTA__TECNOLOGIA, oldTecnologia, tecnologia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EstilosPackage.VISTA__LETRA:
				return basicSetLetra(null, msgs);
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
			case EstilosPackage.VISTA__COLOR_FONDO:
				return getColorFondo();
			case EstilosPackage.VISTA__BARRA_BUSQUEDA:
				return isBarraBusqueda();
			case EstilosPackage.VISTA__LETRA:
				return getLetra();
			case EstilosPackage.VISTA__TECNOLOGIA:
				return getTecnologia();
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
			case EstilosPackage.VISTA__COLOR_FONDO:
				setColorFondo((String)newValue);
				return;
			case EstilosPackage.VISTA__BARRA_BUSQUEDA:
				setBarraBusqueda((Boolean)newValue);
				return;
			case EstilosPackage.VISTA__LETRA:
				setLetra((Letra)newValue);
				return;
			case EstilosPackage.VISTA__TECNOLOGIA:
				setTecnologia((Tecnologia)newValue);
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
			case EstilosPackage.VISTA__COLOR_FONDO:
				setColorFondo(COLOR_FONDO_EDEFAULT);
				return;
			case EstilosPackage.VISTA__BARRA_BUSQUEDA:
				setBarraBusqueda(BARRA_BUSQUEDA_EDEFAULT);
				return;
			case EstilosPackage.VISTA__LETRA:
				setLetra((Letra)null);
				return;
			case EstilosPackage.VISTA__TECNOLOGIA:
				setTecnologia(TECNOLOGIA_EDEFAULT);
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
			case EstilosPackage.VISTA__COLOR_FONDO:
				return COLOR_FONDO_EDEFAULT == null ? colorFondo != null : !COLOR_FONDO_EDEFAULT.equals(colorFondo);
			case EstilosPackage.VISTA__BARRA_BUSQUEDA:
				return barraBusqueda != BARRA_BUSQUEDA_EDEFAULT;
			case EstilosPackage.VISTA__LETRA:
				return letra != null;
			case EstilosPackage.VISTA__TECNOLOGIA:
				return tecnologia != TECNOLOGIA_EDEFAULT;
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
		result.append(" (colorFondo: ");
		result.append(colorFondo);
		result.append(", barraBusqueda: ");
		result.append(barraBusqueda);
		result.append(", tecnologia: ");
		result.append(tecnologia);
		result.append(')');
		return result.toString();
	}

} //VistaImpl
