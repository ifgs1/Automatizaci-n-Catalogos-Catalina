/**
 */
package catalogo.impl;

import catalogo.Catalogo;
import catalogo.CatalogoPackage;
import catalogo.Empresa;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empresa</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link catalogo.impl.EmpresaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link catalogo.impl.EmpresaImpl#getDireccion <em>Direccion</em>}</li>
 *   <li>{@link catalogo.impl.EmpresaImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link catalogo.impl.EmpresaImpl#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link catalogo.impl.EmpresaImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link catalogo.impl.EmpresaImpl#getCatalogo <em>Catalogo</em>}</li>
 *   <li>{@link catalogo.impl.EmpresaImpl#getUrlImagen <em>Url Imagen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmpresaImpl extends MinimalEObjectImpl.Container implements Empresa {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDireccion() <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDireccion()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDireccion() <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDireccion()
	 * @generated
	 * @ordered
	 */
	protected String direccion = DIRECCION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefono()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEFONO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefono()
	 * @generated
	 * @ordered
	 */
	protected String telefono = TELEFONO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCatalogo() <em>Catalogo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogo()
	 * @generated
	 * @ordered
	 */
	protected Catalogo catalogo;

	/**
	 * The default value of the '{@link #getUrlImagen() <em>Url Imagen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlImagen()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_IMAGEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrlImagen() <em>Url Imagen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlImagen()
	 * @generated
	 * @ordered
	 */
	protected String urlImagen = URL_IMAGEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmpresaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatalogoPackage.Literals.EMPRESA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogoPackage.EMPRESA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDireccion(String newDireccion) {
		String oldDireccion = direccion;
		direccion = newDireccion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogoPackage.EMPRESA__DIRECCION, oldDireccion, direccion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogoPackage.EMPRESA__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelefono(String newTelefono) {
		String oldTelefono = telefono;
		telefono = newTelefono;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogoPackage.EMPRESA__TELEFONO, oldTelefono, telefono));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogoPackage.EMPRESA__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catalogo getCatalogo() {
		return catalogo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatalogo(Catalogo newCatalogo, NotificationChain msgs) {
		Catalogo oldCatalogo = catalogo;
		catalogo = newCatalogo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CatalogoPackage.EMPRESA__CATALOGO, oldCatalogo, newCatalogo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalogo(Catalogo newCatalogo) {
		if (newCatalogo != catalogo) {
			NotificationChain msgs = null;
			if (catalogo != null)
				msgs = ((InternalEObject)catalogo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CatalogoPackage.EMPRESA__CATALOGO, null, msgs);
			if (newCatalogo != null)
				msgs = ((InternalEObject)newCatalogo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CatalogoPackage.EMPRESA__CATALOGO, null, msgs);
			msgs = basicSetCatalogo(newCatalogo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogoPackage.EMPRESA__CATALOGO, newCatalogo, newCatalogo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrlImagen() {
		return urlImagen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrlImagen(String newUrlImagen) {
		String oldUrlImagen = urlImagen;
		urlImagen = newUrlImagen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogoPackage.EMPRESA__URL_IMAGEN, oldUrlImagen, urlImagen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CatalogoPackage.EMPRESA__CATALOGO:
				return basicSetCatalogo(null, msgs);
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
			case CatalogoPackage.EMPRESA__NOMBRE:
				return getNombre();
			case CatalogoPackage.EMPRESA__DIRECCION:
				return getDireccion();
			case CatalogoPackage.EMPRESA__EMAIL:
				return getEmail();
			case CatalogoPackage.EMPRESA__TELEFONO:
				return getTelefono();
			case CatalogoPackage.EMPRESA__DESCRIPCION:
				return getDescripcion();
			case CatalogoPackage.EMPRESA__CATALOGO:
				return getCatalogo();
			case CatalogoPackage.EMPRESA__URL_IMAGEN:
				return getUrlImagen();
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
			case CatalogoPackage.EMPRESA__NOMBRE:
				setNombre((String)newValue);
				return;
			case CatalogoPackage.EMPRESA__DIRECCION:
				setDireccion((String)newValue);
				return;
			case CatalogoPackage.EMPRESA__EMAIL:
				setEmail((String)newValue);
				return;
			case CatalogoPackage.EMPRESA__TELEFONO:
				setTelefono((String)newValue);
				return;
			case CatalogoPackage.EMPRESA__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case CatalogoPackage.EMPRESA__CATALOGO:
				setCatalogo((Catalogo)newValue);
				return;
			case CatalogoPackage.EMPRESA__URL_IMAGEN:
				setUrlImagen((String)newValue);
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
			case CatalogoPackage.EMPRESA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case CatalogoPackage.EMPRESA__DIRECCION:
				setDireccion(DIRECCION_EDEFAULT);
				return;
			case CatalogoPackage.EMPRESA__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case CatalogoPackage.EMPRESA__TELEFONO:
				setTelefono(TELEFONO_EDEFAULT);
				return;
			case CatalogoPackage.EMPRESA__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case CatalogoPackage.EMPRESA__CATALOGO:
				setCatalogo((Catalogo)null);
				return;
			case CatalogoPackage.EMPRESA__URL_IMAGEN:
				setUrlImagen(URL_IMAGEN_EDEFAULT);
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
			case CatalogoPackage.EMPRESA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case CatalogoPackage.EMPRESA__DIRECCION:
				return DIRECCION_EDEFAULT == null ? direccion != null : !DIRECCION_EDEFAULT.equals(direccion);
			case CatalogoPackage.EMPRESA__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case CatalogoPackage.EMPRESA__TELEFONO:
				return TELEFONO_EDEFAULT == null ? telefono != null : !TELEFONO_EDEFAULT.equals(telefono);
			case CatalogoPackage.EMPRESA__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case CatalogoPackage.EMPRESA__CATALOGO:
				return catalogo != null;
			case CatalogoPackage.EMPRESA__URL_IMAGEN:
				return URL_IMAGEN_EDEFAULT == null ? urlImagen != null : !URL_IMAGEN_EDEFAULT.equals(urlImagen);
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", direccion: ");
		result.append(direccion);
		result.append(", email: ");
		result.append(email);
		result.append(", telefono: ");
		result.append(telefono);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(", urlImagen: ");
		result.append(urlImagen);
		result.append(')');
		return result.toString();
	}

} //EmpresaImpl
