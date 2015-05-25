/**
 */
package arquitectura;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capa Presentacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arquitectura.CapaPresentacion#getVistas <em>Vistas</em>}</li>
 *   <li>{@link arquitectura.CapaPresentacion#getControladores <em>Controladores</em>}</li>
 *   <li>{@link arquitectura.CapaPresentacion#getComunicacionesHttp <em>Comunicaciones Http</em>}</li>
 *   <li>{@link arquitectura.CapaPresentacion#getEntidades <em>Entidades</em>}</li>
 *   <li>{@link arquitectura.CapaPresentacion#getTecnologia <em>Tecnologia</em>}</li>
 *   <li>{@link arquitectura.CapaPresentacion#isBarraBusqueda <em>Barra Busqueda</em>}</li>
 * </ul>
 * </p>
 *
 * @see arquitectura.ArquitecturaPackage#getCapaPresentacion()
 * @model
 * @generated
 */
public interface CapaPresentacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Vistas</b></em>' containment reference list.
	 * The list contents are of type {@link arquitectura.Vista}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vistas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vistas</em>' containment reference list.
	 * @see arquitectura.ArquitecturaPackage#getCapaPresentacion_Vistas()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Vista> getVistas();

	/**
	 * Returns the value of the '<em><b>Controladores</b></em>' containment reference list.
	 * The list contents are of type {@link arquitectura.Controlador}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controladores</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controladores</em>' containment reference list.
	 * @see arquitectura.ArquitecturaPackage#getCapaPresentacion_Controladores()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Controlador> getControladores();

	/**
	 * Returns the value of the '<em><b>Comunicaciones Http</b></em>' containment reference list.
	 * The list contents are of type {@link arquitectura.ComunicacionHttp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comunicaciones Http</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comunicaciones Http</em>' containment reference list.
	 * @see arquitectura.ArquitecturaPackage#getCapaPresentacion_ComunicacionesHttp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ComunicacionHttp> getComunicacionesHttp();

	/**
	 * Returns the value of the '<em><b>Entidades</b></em>' containment reference list.
	 * The list contents are of type {@link arquitectura.EntidadPresentacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidades</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidades</em>' containment reference list.
	 * @see arquitectura.ArquitecturaPackage#getCapaPresentacion_Entidades()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EntidadPresentacion> getEntidades();

	/**
	 * Returns the value of the '<em><b>Tecnologia</b></em>' attribute.
	 * The literals are from the enumeration {@link arquitectura.Tecnologia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tecnologia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tecnologia</em>' attribute.
	 * @see arquitectura.Tecnologia
	 * @see #setTecnologia(Tecnologia)
	 * @see arquitectura.ArquitecturaPackage#getCapaPresentacion_Tecnologia()
	 * @model
	 * @generated
	 */
	Tecnologia getTecnologia();

	/**
	 * Sets the value of the '{@link arquitectura.CapaPresentacion#getTecnologia <em>Tecnologia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tecnologia</em>' attribute.
	 * @see arquitectura.Tecnologia
	 * @see #getTecnologia()
	 * @generated
	 */
	void setTecnologia(Tecnologia value);

	/**
	 * Returns the value of the '<em><b>Barra Busqueda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Barra Busqueda</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Barra Busqueda</em>' attribute.
	 * @see #setBarraBusqueda(boolean)
	 * @see arquitectura.ArquitecturaPackage#getCapaPresentacion_BarraBusqueda()
	 * @model
	 * @generated
	 */
	boolean isBarraBusqueda();

	/**
	 * Sets the value of the '{@link arquitectura.CapaPresentacion#isBarraBusqueda <em>Barra Busqueda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Barra Busqueda</em>' attribute.
	 * @see #isBarraBusqueda()
	 * @generated
	 */
	void setBarraBusqueda(boolean value);

} // CapaPresentacion
