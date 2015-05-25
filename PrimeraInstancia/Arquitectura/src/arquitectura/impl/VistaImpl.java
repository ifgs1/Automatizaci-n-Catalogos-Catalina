/**
 */
package arquitectura.impl;

import arquitectura.ArquitecturaPackage;
import arquitectura.Letra;
import arquitectura.Vista;

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
 *   <li>{@link arquitectura.impl.VistaImpl#getLetra <em>Letra</em>}</li>
 *   <li>{@link arquitectura.impl.VistaImpl#getColorFondo <em>Color Fondo</em>}</li>
 *   <li>{@link arquitectura.impl.VistaImpl#getTitulo <em>Titulo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VistaImpl extends MinimalEObjectImpl.Container implements Vista {
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
	 * The default value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected static final String TITULO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected String titulo = TITULO_EDEFAULT;

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
		return ArquitecturaPackage.Literals.VISTA;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArquitecturaPackage.VISTA__LETRA, oldLetra, newLetra);
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
				msgs = ((InternalEObject)letra).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArquitecturaPackage.VISTA__LETRA, null, msgs);
			if (newLetra != null)
				msgs = ((InternalEObject)newLetra).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArquitecturaPackage.VISTA__LETRA, null, msgs);
			msgs = basicSetLetra(newLetra, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArquitecturaPackage.VISTA__LETRA, newLetra, newLetra));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArquitecturaPackage.VISTA__COLOR_FONDO, oldColorFondo, colorFondo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitulo(String newTitulo) {
		String oldTitulo = titulo;
		titulo = newTitulo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArquitecturaPackage.VISTA__TITULO, oldTitulo, titulo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArquitecturaPackage.VISTA__LETRA:
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
			case ArquitecturaPackage.VISTA__LETRA:
				return getLetra();
			case ArquitecturaPackage.VISTA__COLOR_FONDO:
				return getColorFondo();
			case ArquitecturaPackage.VISTA__TITULO:
				return getTitulo();
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
			case ArquitecturaPackage.VISTA__LETRA:
				setLetra((Letra)newValue);
				return;
			case ArquitecturaPackage.VISTA__COLOR_FONDO:
				setColorFondo((String)newValue);
				return;
			case ArquitecturaPackage.VISTA__TITULO:
				setTitulo((String)newValue);
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
			case ArquitecturaPackage.VISTA__LETRA:
				setLetra((Letra)null);
				return;
			case ArquitecturaPackage.VISTA__COLOR_FONDO:
				setColorFondo(COLOR_FONDO_EDEFAULT);
				return;
			case ArquitecturaPackage.VISTA__TITULO:
				setTitulo(TITULO_EDEFAULT);
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
			case ArquitecturaPackage.VISTA__LETRA:
				return letra != null;
			case ArquitecturaPackage.VISTA__COLOR_FONDO:
				return COLOR_FONDO_EDEFAULT == null ? colorFondo != null : !COLOR_FONDO_EDEFAULT.equals(colorFondo);
			case ArquitecturaPackage.VISTA__TITULO:
				return TITULO_EDEFAULT == null ? titulo != null : !TITULO_EDEFAULT.equals(titulo);
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
		result.append(", titulo: ");
		result.append(titulo);
		result.append(')');
		return result.toString();
	}

} //VistaImpl
