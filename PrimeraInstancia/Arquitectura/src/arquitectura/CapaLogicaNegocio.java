/**
 */
package arquitectura;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capa Logica Negocio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arquitectura.CapaLogicaNegocio#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link arquitectura.CapaLogicaNegocio#getBeans <em>Beans</em>}</li>
 *   <li>{@link arquitectura.CapaLogicaNegocio#getJsonsDTO <em>Jsons DTO</em>}</li>
 *   <li>{@link arquitectura.CapaLogicaNegocio#getMappers <em>Mappers</em>}</li>
 * </ul>
 * </p>
 *
 * @see arquitectura.ArquitecturaPackage#getCapaLogicaNegocio()
 * @model
 * @generated
 */
public interface CapaLogicaNegocio extends EObject {
	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link arquitectura.InterfaceNegocio}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see arquitectura.ArquitecturaPackage#getCapaLogicaNegocio_Interfaces()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InterfaceNegocio> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Beans</b></em>' containment reference list.
	 * The list contents are of type {@link arquitectura.BeanNegocio}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beans</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beans</em>' containment reference list.
	 * @see arquitectura.ArquitecturaPackage#getCapaLogicaNegocio_Beans()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BeanNegocio> getBeans();

	/**
	 * Returns the value of the '<em><b>Jsons DTO</b></em>' containment reference list.
	 * The list contents are of type {@link arquitectura.JsonDTO}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsons DTO</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsons DTO</em>' containment reference list.
	 * @see arquitectura.ArquitecturaPackage#getCapaLogicaNegocio_JsonsDTO()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<JsonDTO> getJsonsDTO();

	/**
	 * Returns the value of the '<em><b>Mappers</b></em>' containment reference list.
	 * The list contents are of type {@link arquitectura.Mapper}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappers</em>' containment reference list.
	 * @see arquitectura.ArquitecturaPackage#getCapaLogicaNegocio_Mappers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Mapper> getMappers();

} // CapaLogicaNegocio
