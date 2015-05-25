/**
 */
package estilos.impl;

import estilos.EstilosPackage;
import estilos.Letra;
import estilos.TamanoLetra;

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
 *   <li>{@link estilos.impl.LetraImpl#getColorLetra <em>Color Letra</em>}</li>
 *   <li>{@link estilos.impl.LetraImpl#getFuente <em>Fuente</em>}</li>
 *   <li>{@link estilos.impl.LetraImpl#getTamano <em>Tamano</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LetraImpl extends MinimalEObjectImpl.Container implements Letra {
	/**
	 * The default value of the '{@link #getColorLetra() <em>Color Letra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorLetra()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_LETRA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColorLetra() <em>Color Letra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorLetra()
	 * @generated
	 * @ordered
	 */
	protected String colorLetra = COLOR_LETRA_EDEFAULT;

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
	protected static final TamanoLetra TAMANO_EDEFAULT = TamanoLetra.SMALL;

	/**
	 * The cached value of the '{@link #getTamano() <em>Tamano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTamano()
	 * @generated
	 * @ordered
	 */
	protected TamanoLetra tamano = TAMANO_EDEFAULT;

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
		return EstilosPackage.Literals.LETRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColorLetra() {
		return colorLetra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorLetra(String newColorLetra) {
		String oldColorLetra = colorLetra;
		colorLetra = newColorLetra;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EstilosPackage.LETRA__COLOR_LETRA, oldColorLetra, colorLetra));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EstilosPackage.LETRA__FUENTE, oldFuente, fuente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TamanoLetra getTamano() {
		return tamano;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTamano(TamanoLetra newTamano) {
		TamanoLetra oldTamano = tamano;
		tamano = newTamano == null ? TAMANO_EDEFAULT : newTamano;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EstilosPackage.LETRA__TAMANO, oldTamano, tamano));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EstilosPackage.LETRA__COLOR_LETRA:
				return getColorLetra();
			case EstilosPackage.LETRA__FUENTE:
				return getFuente();
			case EstilosPackage.LETRA__TAMANO:
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
			case EstilosPackage.LETRA__COLOR_LETRA:
				setColorLetra((String)newValue);
				return;
			case EstilosPackage.LETRA__FUENTE:
				setFuente((String)newValue);
				return;
			case EstilosPackage.LETRA__TAMANO:
				setTamano((TamanoLetra)newValue);
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
			case EstilosPackage.LETRA__COLOR_LETRA:
				setColorLetra(COLOR_LETRA_EDEFAULT);
				return;
			case EstilosPackage.LETRA__FUENTE:
				setFuente(FUENTE_EDEFAULT);
				return;
			case EstilosPackage.LETRA__TAMANO:
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
			case EstilosPackage.LETRA__COLOR_LETRA:
				return COLOR_LETRA_EDEFAULT == null ? colorLetra != null : !COLOR_LETRA_EDEFAULT.equals(colorLetra);
			case EstilosPackage.LETRA__FUENTE:
				return FUENTE_EDEFAULT == null ? fuente != null : !FUENTE_EDEFAULT.equals(fuente);
			case EstilosPackage.LETRA__TAMANO:
				return tamano != TAMANO_EDEFAULT;
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
		result.append(" (colorLetra: ");
		result.append(colorLetra);
		result.append(", fuente: ");
		result.append(fuente);
		result.append(", tamano: ");
		result.append(tamano);
		result.append(')');
		return result.toString();
	}

} //LetraImpl
