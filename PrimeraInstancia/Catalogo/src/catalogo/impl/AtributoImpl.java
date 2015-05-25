/**
 */
package catalogo.impl;

import catalogo.Atributo;
import catalogo.CatalogoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link catalogo.impl.AtributoImpl#getIdAtributo <em>Id Atributo</em>}</li>
 *   <li>{@link catalogo.impl.AtributoImpl#getNombreAtributo <em>Nombre Atributo</em>}</li>
 *   <li>{@link catalogo.impl.AtributoImpl#getValorAtributo <em>Valor Atributo</em>}</li>
 *   <li>{@link catalogo.impl.AtributoImpl#getTipoDato <em>Tipo Dato</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtributoImpl extends MinimalEObjectImpl.Container implements Atributo {
	/**
	 * The default value of the '{@link #getIdAtributo() <em>Id Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdAtributo()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_ATRIBUTO_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getIdAtributo() <em>Id Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdAtributo()
	 * @generated
	 * @ordered
	 */
	protected long idAtributo = ID_ATRIBUTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreAtributo() <em>Nombre Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreAtributo()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_ATRIBUTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreAtributo() <em>Nombre Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreAtributo()
	 * @generated
	 * @ordered
	 */
	protected String nombreAtributo = NOMBRE_ATRIBUTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getValorAtributo() <em>Valor Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorAtributo()
	 * @generated
	 * @ordered
	 */
	protected static final String VALOR_ATRIBUTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValorAtributo() <em>Valor Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorAtributo()
	 * @generated
	 * @ordered
	 */
	protected String valorAtributo = VALOR_ATRIBUTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoDato() <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDato()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_DATO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipoDato() <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDato()
	 * @generated
	 * @ordered
	 */
	protected String tipoDato = TIPO_DATO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatalogoPackage.Literals.ATRIBUTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getIdAtributo() {
		return idAtributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdAtributo(long newIdAtributo) {
		long oldIdAtributo = idAtributo;
		idAtributo = newIdAtributo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogoPackage.ATRIBUTO__ID_ATRIBUTO, oldIdAtributo, idAtributo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreAtributo() {
		return nombreAtributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreAtributo(String newNombreAtributo) {
		String oldNombreAtributo = nombreAtributo;
		nombreAtributo = newNombreAtributo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogoPackage.ATRIBUTO__NOMBRE_ATRIBUTO, oldNombreAtributo, nombreAtributo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValorAtributo() {
		return valorAtributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValorAtributo(String newValorAtributo) {
		String oldValorAtributo = valorAtributo;
		valorAtributo = newValorAtributo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogoPackage.ATRIBUTO__VALOR_ATRIBUTO, oldValorAtributo, valorAtributo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipoDato() {
		return tipoDato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoDato(String newTipoDato) {
		String oldTipoDato = tipoDato;
		tipoDato = newTipoDato;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogoPackage.ATRIBUTO__TIPO_DATO, oldTipoDato, tipoDato));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CatalogoPackage.ATRIBUTO__ID_ATRIBUTO:
				return getIdAtributo();
			case CatalogoPackage.ATRIBUTO__NOMBRE_ATRIBUTO:
				return getNombreAtributo();
			case CatalogoPackage.ATRIBUTO__VALOR_ATRIBUTO:
				return getValorAtributo();
			case CatalogoPackage.ATRIBUTO__TIPO_DATO:
				return getTipoDato();
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
			case CatalogoPackage.ATRIBUTO__ID_ATRIBUTO:
				setIdAtributo((Long)newValue);
				return;
			case CatalogoPackage.ATRIBUTO__NOMBRE_ATRIBUTO:
				setNombreAtributo((String)newValue);
				return;
			case CatalogoPackage.ATRIBUTO__VALOR_ATRIBUTO:
				setValorAtributo((String)newValue);
				return;
			case CatalogoPackage.ATRIBUTO__TIPO_DATO:
				setTipoDato((String)newValue);
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
			case CatalogoPackage.ATRIBUTO__ID_ATRIBUTO:
				setIdAtributo(ID_ATRIBUTO_EDEFAULT);
				return;
			case CatalogoPackage.ATRIBUTO__NOMBRE_ATRIBUTO:
				setNombreAtributo(NOMBRE_ATRIBUTO_EDEFAULT);
				return;
			case CatalogoPackage.ATRIBUTO__VALOR_ATRIBUTO:
				setValorAtributo(VALOR_ATRIBUTO_EDEFAULT);
				return;
			case CatalogoPackage.ATRIBUTO__TIPO_DATO:
				setTipoDato(TIPO_DATO_EDEFAULT);
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
			case CatalogoPackage.ATRIBUTO__ID_ATRIBUTO:
				return idAtributo != ID_ATRIBUTO_EDEFAULT;
			case CatalogoPackage.ATRIBUTO__NOMBRE_ATRIBUTO:
				return NOMBRE_ATRIBUTO_EDEFAULT == null ? nombreAtributo != null : !NOMBRE_ATRIBUTO_EDEFAULT.equals(nombreAtributo);
			case CatalogoPackage.ATRIBUTO__VALOR_ATRIBUTO:
				return VALOR_ATRIBUTO_EDEFAULT == null ? valorAtributo != null : !VALOR_ATRIBUTO_EDEFAULT.equals(valorAtributo);
			case CatalogoPackage.ATRIBUTO__TIPO_DATO:
				return TIPO_DATO_EDEFAULT == null ? tipoDato != null : !TIPO_DATO_EDEFAULT.equals(tipoDato);
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
		result.append(" (idAtributo: ");
		result.append(idAtributo);
		result.append(", nombreAtributo: ");
		result.append(nombreAtributo);
		result.append(", valorAtributo: ");
		result.append(valorAtributo);
		result.append(", tipoDato: ");
		result.append(tipoDato);
		result.append(')');
		return result.toString();
	}

} //AtributoImpl
