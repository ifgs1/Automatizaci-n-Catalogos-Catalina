/**
 */
package arquitectura.util;

import arquitectura.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see arquitectura.ArquitecturaPackage
 * @generated
 */
public class ArquitecturaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArquitecturaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArquitecturaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArquitecturaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArquitecturaSwitch<Adapter> modelSwitch =
		new ArquitecturaSwitch<Adapter>() {
			@Override
			public Adapter caseRootSistema(RootSistema object) {
				return createRootSistemaAdapter();
			}
			@Override
			public Adapter caseCapaPresentacion(CapaPresentacion object) {
				return createCapaPresentacionAdapter();
			}
			@Override
			public Adapter caseCapaLogicaNegocio(CapaLogicaNegocio object) {
				return createCapaLogicaNegocioAdapter();
			}
			@Override
			public Adapter caseCapaPersistencia(CapaPersistencia object) {
				return createCapaPersistenciaAdapter();
			}
			@Override
			public Adapter caseCapaServicio(CapaServicio object) {
				return createCapaServicioAdapter();
			}
			@Override
			public Adapter caseCapaAccesoDatos(CapaAccesoDatos object) {
				return createCapaAccesoDatosAdapter();
			}
			@Override
			public Adapter caseVista(Vista object) {
				return createVistaAdapter();
			}
			@Override
			public Adapter caseControlador(Controlador object) {
				return createControladorAdapter();
			}
			@Override
			public Adapter caseComunicacionHttp(ComunicacionHttp object) {
				return createComunicacionHttpAdapter();
			}
			@Override
			public Adapter caseEntidadPresentacion(EntidadPresentacion object) {
				return createEntidadPresentacionAdapter();
			}
			@Override
			public Adapter caseAtributo(Atributo object) {
				return createAtributoAdapter();
			}
			@Override
			public Adapter caseServicio(Servicio object) {
				return createServicioAdapter();
			}
			@Override
			public Adapter caseInterfaceNegocio(InterfaceNegocio object) {
				return createInterfaceNegocioAdapter();
			}
			@Override
			public Adapter caseBeanNegocio(BeanNegocio object) {
				return createBeanNegocioAdapter();
			}
			@Override
			public Adapter caseJsonDTO(JsonDTO object) {
				return createJsonDTOAdapter();
			}
			@Override
			public Adapter caseInterfaceDAO(InterfaceDAO object) {
				return createInterfaceDAOAdapter();
			}
			@Override
			public Adapter caseBeanDAO(BeanDAO object) {
				return createBeanDAOAdapter();
			}
			@Override
			public Adapter caseEntidadPersistencia(EntidadPersistencia object) {
				return createEntidadPersistenciaAdapter();
			}
			@Override
			public Adapter caseInsert(Insert object) {
				return createInsertAdapter();
			}
			@Override
			public Adapter caseLetra(Letra object) {
				return createLetraAdapter();
			}
			@Override
			public Adapter caseMetodo(Metodo object) {
				return createMetodoAdapter();
			}
			@Override
			public Adapter caseMapper(Mapper object) {
				return createMapperAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link arquitectura.RootSistema <em>Root Sistema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arquitectura.RootSistema
	 * @generated
	 */
	public Adapter createRootSistemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arquitectura.CapaPresentacion <em>Capa Presentacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arquitectura.CapaPresentacion
	 * @generated
	 */
	public Adapter createCapaPresentacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arquitectura.CapaLogicaNegocio <em>Capa Logica Negocio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arquitectura.CapaLogicaNegocio
	 * @generated
	 */
	public Adapter createCapaLogicaNegocioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arquitectura.CapaPersistencia <em>Capa Persistencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arquitectura.CapaPersistencia
	 * @generated
	 */
	public Adapter createCapaPersistenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arquitectura.CapaServicio <em>Capa Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arquitectura.CapaServicio
	 * @generated
	 */
	public Adapter createCapaServicioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arquitectura.CapaAccesoDatos <em>Capa Acceso Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arquitectura.CapaAccesoDatos
	 * @generated
	 */
	public Adapter createCapaAccesoDatosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arquitectura.Vista <em>Vista</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arquitectura.Vista
	 * @generated
	 */
	public Adapter createVistaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arquitectura.Controlador <em>Controlador</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arquitectura.Controlador
	 * @generated
	 */
	public Adapter createControladorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arquitectura.ComunicacionHttp <em>Comunicacion Http</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arquitectura.ComunicacionHttp
	 * @generated
	 */
	public Adapter createComunicacionHttpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arquitectura.EntidadPresentacion <em>Entidad Presentacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arquitectura.EntidadPresentacion
	 * @generated
	 */
	public Adapter createEntidadPresentacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arquitectura.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arquitectura.Atributo
	 * @generated
	 */
	public Adapter createAtributoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arquitectura.Servicio <em>Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arquitectura.Servicio
	 * @generated
	 */
	public Adapter createServicioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arquitectura.InterfaceNegocio <em>Interface Negocio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arquitectura.InterfaceNegocio
	 * @generated
	 */
	public Adapter createInterfaceNegocioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arquitectura.BeanNegocio <em>Bean Negocio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arquitectura.BeanNegocio
	 * @generated
	 */
	public Adapter createBeanNegocioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arquitectura.JsonDTO <em>Json DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arquitectura.JsonDTO
	 * @generated
	 */
	public Adapter createJsonDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arquitectura.InterfaceDAO <em>Interface DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arquitectura.InterfaceDAO
	 * @generated
	 */
	public Adapter createInterfaceDAOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arquitectura.BeanDAO <em>Bean DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arquitectura.BeanDAO
	 * @generated
	 */
	public Adapter createBeanDAOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arquitectura.EntidadPersistencia <em>Entidad Persistencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arquitectura.EntidadPersistencia
	 * @generated
	 */
	public Adapter createEntidadPersistenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arquitectura.Insert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arquitectura.Insert
	 * @generated
	 */
	public Adapter createInsertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arquitectura.Letra <em>Letra</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arquitectura.Letra
	 * @generated
	 */
	public Adapter createLetraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arquitectura.Metodo <em>Metodo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arquitectura.Metodo
	 * @generated
	 */
	public Adapter createMetodoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arquitectura.Mapper <em>Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arquitectura.Mapper
	 * @generated
	 */
	public Adapter createMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ArquitecturaAdapterFactory
