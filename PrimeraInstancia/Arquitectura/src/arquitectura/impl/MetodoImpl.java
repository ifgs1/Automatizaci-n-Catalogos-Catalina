/**
 */
package arquitectura.impl;

import arquitectura.ArquitecturaPackage;
import arquitectura.Metodo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metodo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arquitectura.impl.MetodoImpl#getPath <em>Path</em>}</li>
 *   <li>{@link arquitectura.impl.MetodoImpl#getTipoRetorno <em>Tipo Retorno</em>}</li>
 *   <li>{@link arquitectura.impl.MetodoImpl#getArgumentos <em>Argumentos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetodoImpl extends MinimalEObjectImpl.Container implements Metodo {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoRetorno() <em>Tipo Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoRetorno()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_RETORNO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipoRetorno() <em>Tipo Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoRetorno()
	 * @generated
	 * @ordered
	 */
	protected String tipoRetorno = TIPO_RETORNO_EDEFAULT;

	/**
	 * The default value of the '{@link #getArgumentos() <em>Argumentos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentos()
	 * @generated
	 * @ordered
	 */
	protected static final String ARGUMENTOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArgumentos() <em>Argumentos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentos()
	 * @generated
	 * @ordered
	 */
	protected String argumentos = ARGUMENTOS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetodoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArquitecturaPackage.Literals.METODO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArquitecturaPackage.METODO__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipoRetorno() {
		return tipoRetorno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoRetorno(String newTipoRetorno) {
		String oldTipoRetorno = tipoRetorno;
		tipoRetorno = newTipoRetorno;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArquitecturaPackage.METODO__TIPO_RETORNO, oldTipoRetorno, tipoRetorno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArgumentos() {
		return argumentos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgumentos(String newArgumentos) {
		String oldArgumentos = argumentos;
		argumentos = newArgumentos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArquitecturaPackage.METODO__ARGUMENTOS, oldArgumentos, argumentos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArquitecturaPackage.METODO__PATH:
				return getPath();
			case ArquitecturaPackage.METODO__TIPO_RETORNO:
				return getTipoRetorno();
			case ArquitecturaPackage.METODO__ARGUMENTOS:
				return getArgumentos();
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
			case ArquitecturaPackage.METODO__PATH:
				setPath((String)newValue);
				return;
			case ArquitecturaPackage.METODO__TIPO_RETORNO:
				setTipoRetorno((String)newValue);
				return;
			case ArquitecturaPackage.METODO__ARGUMENTOS:
				setArgumentos((String)newValue);
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
			case ArquitecturaPackage.METODO__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case ArquitecturaPackage.METODO__TIPO_RETORNO:
				setTipoRetorno(TIPO_RETORNO_EDEFAULT);
				return;
			case ArquitecturaPackage.METODO__ARGUMENTOS:
				setArgumentos(ARGUMENTOS_EDEFAULT);
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
			case ArquitecturaPackage.METODO__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case ArquitecturaPackage.METODO__TIPO_RETORNO:
				return TIPO_RETORNO_EDEFAULT == null ? tipoRetorno != null : !TIPO_RETORNO_EDEFAULT.equals(tipoRetorno);
			case ArquitecturaPackage.METODO__ARGUMENTOS:
				return ARGUMENTOS_EDEFAULT == null ? argumentos != null : !ARGUMENTOS_EDEFAULT.equals(argumentos);
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
		result.append(" (path: ");
		result.append(path);
		result.append(", tipoRetorno: ");
		result.append(tipoRetorno);
		result.append(", argumentos: ");
		result.append(argumentos);
		result.append(')');
		return result.toString();
	}

} //MetodoImpl
