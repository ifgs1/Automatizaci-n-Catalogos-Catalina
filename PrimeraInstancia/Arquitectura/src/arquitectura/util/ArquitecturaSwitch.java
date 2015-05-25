/**
 */
package arquitectura.util;

import arquitectura.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see arquitectura.ArquitecturaPackage
 * @generated
 */
public class ArquitecturaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArquitecturaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArquitecturaSwitch() {
		if (modelPackage == null) {
			modelPackage = ArquitecturaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ArquitecturaPackage.ROOT_SISTEMA: {
				RootSistema rootSistema = (RootSistema)theEObject;
				T result = caseRootSistema(rootSistema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArquitecturaPackage.CAPA_PRESENTACION: {
				CapaPresentacion capaPresentacion = (CapaPresentacion)theEObject;
				T result = caseCapaPresentacion(capaPresentacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArquitecturaPackage.CAPA_LOGICA_NEGOCIO: {
				CapaLogicaNegocio capaLogicaNegocio = (CapaLogicaNegocio)theEObject;
				T result = caseCapaLogicaNegocio(capaLogicaNegocio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArquitecturaPackage.CAPA_PERSISTENCIA: {
				CapaPersistencia capaPersistencia = (CapaPersistencia)theEObject;
				T result = caseCapaPersistencia(capaPersistencia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArquitecturaPackage.CAPA_SERVICIO: {
				CapaServicio capaServicio = (CapaServicio)theEObject;
				T result = caseCapaServicio(capaServicio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArquitecturaPackage.CAPA_ACCESO_DATOS: {
				CapaAccesoDatos capaAccesoDatos = (CapaAccesoDatos)theEObject;
				T result = caseCapaAccesoDatos(capaAccesoDatos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArquitecturaPackage.VISTA: {
				Vista vista = (Vista)theEObject;
				T result = caseVista(vista);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArquitecturaPackage.CONTROLADOR: {
				Controlador controlador = (Controlador)theEObject;
				T result = caseControlador(controlador);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArquitecturaPackage.COMUNICACION_HTTP: {
				ComunicacionHttp comunicacionHttp = (ComunicacionHttp)theEObject;
				T result = caseComunicacionHttp(comunicacionHttp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArquitecturaPackage.ENTIDAD_PRESENTACION: {
				EntidadPresentacion entidadPresentacion = (EntidadPresentacion)theEObject;
				T result = caseEntidadPresentacion(entidadPresentacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArquitecturaPackage.ATRIBUTO: {
				Atributo atributo = (Atributo)theEObject;
				T result = caseAtributo(atributo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArquitecturaPackage.SERVICIO: {
				Servicio servicio = (Servicio)theEObject;
				T result = caseServicio(servicio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArquitecturaPackage.INTERFACE_NEGOCIO: {
				InterfaceNegocio interfaceNegocio = (InterfaceNegocio)theEObject;
				T result = caseInterfaceNegocio(interfaceNegocio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArquitecturaPackage.BEAN_NEGOCIO: {
				BeanNegocio beanNegocio = (BeanNegocio)theEObject;
				T result = caseBeanNegocio(beanNegocio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArquitecturaPackage.JSON_DTO: {
				JsonDTO jsonDTO = (JsonDTO)theEObject;
				T result = caseJsonDTO(jsonDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArquitecturaPackage.INTERFACE_DAO: {
				InterfaceDAO interfaceDAO = (InterfaceDAO)theEObject;
				T result = caseInterfaceDAO(interfaceDAO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArquitecturaPackage.BEAN_DAO: {
				BeanDAO beanDAO = (BeanDAO)theEObject;
				T result = caseBeanDAO(beanDAO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArquitecturaPackage.ENTIDAD_PERSISTENCIA: {
				EntidadPersistencia entidadPersistencia = (EntidadPersistencia)theEObject;
				T result = caseEntidadPersistencia(entidadPersistencia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArquitecturaPackage.INSERT: {
				Insert insert = (Insert)theEObject;
				T result = caseInsert(insert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArquitecturaPackage.LETRA: {
				Letra letra = (Letra)theEObject;
				T result = caseLetra(letra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArquitecturaPackage.METODO: {
				Metodo metodo = (Metodo)theEObject;
				T result = caseMetodo(metodo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArquitecturaPackage.MAPPER: {
				Mapper mapper = (Mapper)theEObject;
				T result = caseMapper(mapper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Sistema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Sistema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootSistema(RootSistema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capa Presentacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capa Presentacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapaPresentacion(CapaPresentacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capa Logica Negocio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capa Logica Negocio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapaLogicaNegocio(CapaLogicaNegocio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capa Persistencia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capa Persistencia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapaPersistencia(CapaPersistencia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capa Servicio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capa Servicio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapaServicio(CapaServicio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capa Acceso Datos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capa Acceso Datos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapaAccesoDatos(CapaAccesoDatos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vista</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vista</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVista(Vista object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controlador</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controlador</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlador(Controlador object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comunicacion Http</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comunicacion Http</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComunicacionHttp(ComunicacionHttp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entidad Presentacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entidad Presentacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntidadPresentacion(EntidadPresentacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atributo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtributo(Atributo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Servicio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Servicio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServicio(Servicio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Negocio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Negocio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceNegocio(InterfaceNegocio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bean Negocio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bean Negocio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeanNegocio(BeanNegocio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Json DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Json DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsonDTO(JsonDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface DAO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface DAO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceDAO(InterfaceDAO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bean DAO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bean DAO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeanDAO(BeanDAO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entidad Persistencia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entidad Persistencia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntidadPersistencia(EntidadPersistencia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsert(Insert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Letra</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Letra</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLetra(Letra object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metodo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metodo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetodo(Metodo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapper(Mapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ArquitecturaSwitch
