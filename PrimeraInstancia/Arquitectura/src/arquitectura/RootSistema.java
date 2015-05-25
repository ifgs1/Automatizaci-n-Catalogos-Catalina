/**
 */
package arquitectura;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Sistema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arquitectura.RootSistema#getPresentaciones <em>Presentaciones</em>}</li>
 *   <li>{@link arquitectura.RootSistema#getCapaLogicaNegocio <em>Capa Logica Negocio</em>}</li>
 *   <li>{@link arquitectura.RootSistema#getCapaServicio <em>Capa Servicio</em>}</li>
 *   <li>{@link arquitectura.RootSistema#getCapaAccesoDatos <em>Capa Acceso Datos</em>}</li>
 *   <li>{@link arquitectura.RootSistema#getCapaPersistencia <em>Capa Persistencia</em>}</li>
 * </ul>
 * </p>
 *
 * @see arquitectura.ArquitecturaPackage#getRootSistema()
 * @model
 * @generated
 */
public interface RootSistema extends EObject {
	/**
	 * Returns the value of the '<em><b>Presentaciones</b></em>' containment reference list.
	 * The list contents are of type {@link arquitectura.CapaPresentacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentaciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentaciones</em>' containment reference list.
	 * @see arquitectura.ArquitecturaPackage#getRootSistema_Presentaciones()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CapaPresentacion> getPresentaciones();

	/**
	 * Returns the value of the '<em><b>Capa Logica Negocio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capa Logica Negocio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capa Logica Negocio</em>' containment reference.
	 * @see #setCapaLogicaNegocio(CapaLogicaNegocio)
	 * @see arquitectura.ArquitecturaPackage#getRootSistema_CapaLogicaNegocio()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CapaLogicaNegocio getCapaLogicaNegocio();

	/**
	 * Sets the value of the '{@link arquitectura.RootSistema#getCapaLogicaNegocio <em>Capa Logica Negocio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capa Logica Negocio</em>' containment reference.
	 * @see #getCapaLogicaNegocio()
	 * @generated
	 */
	void setCapaLogicaNegocio(CapaLogicaNegocio value);

	/**
	 * Returns the value of the '<em><b>Capa Servicio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capa Servicio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capa Servicio</em>' containment reference.
	 * @see #setCapaServicio(CapaServicio)
	 * @see arquitectura.ArquitecturaPackage#getRootSistema_CapaServicio()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CapaServicio getCapaServicio();

	/**
	 * Sets the value of the '{@link arquitectura.RootSistema#getCapaServicio <em>Capa Servicio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capa Servicio</em>' containment reference.
	 * @see #getCapaServicio()
	 * @generated
	 */
	void setCapaServicio(CapaServicio value);

	/**
	 * Returns the value of the '<em><b>Capa Acceso Datos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capa Acceso Datos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capa Acceso Datos</em>' containment reference.
	 * @see #setCapaAccesoDatos(CapaAccesoDatos)
	 * @see arquitectura.ArquitecturaPackage#getRootSistema_CapaAccesoDatos()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CapaAccesoDatos getCapaAccesoDatos();

	/**
	 * Sets the value of the '{@link arquitectura.RootSistema#getCapaAccesoDatos <em>Capa Acceso Datos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capa Acceso Datos</em>' containment reference.
	 * @see #getCapaAccesoDatos()
	 * @generated
	 */
	void setCapaAccesoDatos(CapaAccesoDatos value);

	/**
	 * Returns the value of the '<em><b>Capa Persistencia</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capa Persistencia</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capa Persistencia</em>' containment reference.
	 * @see #setCapaPersistencia(CapaPersistencia)
	 * @see arquitectura.ArquitecturaPackage#getRootSistema_CapaPersistencia()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CapaPersistencia getCapaPersistencia();

	/**
	 * Sets the value of the '{@link arquitectura.RootSistema#getCapaPersistencia <em>Capa Persistencia</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capa Persistencia</em>' containment reference.
	 * @see #getCapaPersistencia()
	 * @generated
	 */
	void setCapaPersistencia(CapaPersistencia value);

} // RootSistema
