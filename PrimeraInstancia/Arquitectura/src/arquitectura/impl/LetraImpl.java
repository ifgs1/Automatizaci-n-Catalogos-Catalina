/**
 */
package arquitectura.impl;

import arquitectura.ArquitecturaPackage;
import arquitectura.Letra;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Letra</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arquitectura.impl.LetraImpl#getColor <em>Color</em>}</li>
 *   <li>{@link arquitectura.impl.LetraImpl#getFuente <em>Fuente</em>}</li>
 *   <li>{@link arquitectura.impl.LetraImpl#getTamano <em>Tamano</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LetraImpl extends MinimalEObjectImpl.Container implements Letra {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFuente() <em>Fuente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuente()
	 * @generated
	 * @ordered
	 */
	protected static final String FUENTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFuente() <em>Fuente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuente()
	 * @generated
	 * @ordered
	 */
	protected String fuente = FUENTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTamano() <em>Tamano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTamano()
	 * @generated
	 * @ordered
	 */
	protected static final String TAMANO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTamano() <em>Tamano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTamano()
	 * @generated
	 * @ordered
	 */
	protected String tamano = TAMANO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LetraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArquitecturaPackage.Literals.LETRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArquitecturaPackage.LETRA__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFuente() {
		return fuente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuente(String newFuente) {
		String oldFuente = fuente;
		fuente = newFuente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArquitecturaPackage.LETRA__FUENTE, oldFuente, fuente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTamano() {
		return tamano;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTamano(String newTamano) {
		String oldTamano = tamano;
		tamano = newTamano;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArquitecturaPackage.LETRA__TAMANO, oldTamano, tamano));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArquitecturaPackage.LETRA__COLOR:
				return getColor();
			case ArquitecturaPackage.LETRA__FUENTE:
				return getFuente();
			case ArquitecturaPackage.LETRA__TAMANO:
				return getTamano();
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
			case ArquitecturaPackage.LETRA__COLOR:
				setColor((String)newValue);
				return;
			case ArquitecturaPackage.LETRA__FUENTE:
				setFuente((String)newValue);
				return;
			case ArquitecturaPackage.LETRA__TAMANO:
				setTamano((String)newValue);
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
			case ArquitecturaPackage.LETRA__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case ArquitecturaPackage.LETRA__FUENTE:
				setFuente(FUENTE_EDEFAULT);
				return;
			case ArquitecturaPackage.LETRA__TAMANO:
				setTamano(TAMANO_EDEFAULT);
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
			case ArquitecturaPackage.LETRA__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case ArquitecturaPackage.LETRA__FUENTE:
				return FUENTE_EDEFAULT == null ? fuente != null : !FUENTE_EDEFAULT.equals(fuente);
			case ArquitecturaPackage.LETRA__TAMANO:
				return TAMANO_EDEFAULT == null ? tamano != null : !TAMANO_EDEFAULT.equals(tamano);
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
		result.append(" (color: ");
		result.append(color);
		result.append(", fuente: ");
		result.append(fuente);
		result.append(", tamano: ");
		result.append(tamano);
		result.append(')');
		return result.toString();
	}

} //LetraImpl
