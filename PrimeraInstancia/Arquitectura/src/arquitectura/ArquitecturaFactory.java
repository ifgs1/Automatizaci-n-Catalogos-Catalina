/**
 */
package arquitectura;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see arquitectura.ArquitecturaPackage
 * @generated
 */
public interface ArquitecturaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArquitecturaFactory eINSTANCE = arquitectura.impl.ArquitecturaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root Sistema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Sistema</em>'.
	 * @generated
	 */
	RootSistema createRootSistema();

	/**
	 * Returns a new object of class '<em>Capa Presentacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capa Presentacion</em>'.
	 * @generated
	 */
	CapaPresentacion createCapaPresentacion();

	/**
	 * Returns a new object of class '<em>Capa Logica Negocio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capa Logica Negocio</em>'.
	 * @generated
	 */
	CapaLogicaNegocio createCapaLogicaNegocio();

	/**
	 * Returns a new object of class '<em>Capa Persistencia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capa Persistencia</em>'.
	 * @generated
	 */
	CapaPersistencia createCapaPersistencia();

	/**
	 * Returns a new object of class '<em>Capa Servicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capa Servicio</em>'.
	 * @generated
	 */
	CapaServicio createCapaServicio();

	/**
	 * Returns a new object of class '<em>Capa Acceso Datos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capa Acceso Datos</em>'.
	 * @generated
	 */
	CapaAccesoDatos createCapaAccesoDatos();

	/**
	 * Returns a new object of class '<em>Vista</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vista</em>'.
	 * @generated
	 */
	Vista createVista();

	/**
	 * Returns a new object of class '<em>Controlador</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controlador</em>'.
	 * @generated
	 */
	Controlador createControlador();

	/**
	 * Returns a new object of class '<em>Comunicacion Http</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comunicacion Http</em>'.
	 * @generated
	 */
	ComunicacionHttp createComunicacionHttp();

	/**
	 * Returns a new object of class '<em>Entidad Presentacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entidad Presentacion</em>'.
	 * @generated
	 */
	EntidadPresentacion createEntidadPresentacion();

	/**
	 * Returns a new object of class '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributo</em>'.
	 * @generated
	 */
	Atributo createAtributo();

	/**
	 * Returns a new object of class '<em>Servicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Servicio</em>'.
	 * @generated
	 */
	Servicio createServicio();

	/**
	 * Returns a new object of class '<em>Interface Negocio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Negocio</em>'.
	 * @generated
	 */
	InterfaceNegocio createInterfaceNegocio();

	/**
	 * Returns a new object of class '<em>Bean Negocio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bean Negocio</em>'.
	 * @generated
	 */
	BeanNegocio createBeanNegocio();

	/**
	 * Returns a new object of class '<em>Json DTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Json DTO</em>'.
	 * @generated
	 */
	JsonDTO createJsonDTO();

	/**
	 * Returns a new object of class '<em>Interface DAO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface DAO</em>'.
	 * @generated
	 */
	InterfaceDAO createInterfaceDAO();

	/**
	 * Returns a new object of class '<em>Bean DAO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bean DAO</em>'.
	 * @generated
	 */
	BeanDAO createBeanDAO();

	/**
	 * Returns a new object of class '<em>Entidad Persistencia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entidad Persistencia</em>'.
	 * @generated
	 */
	EntidadPersistencia createEntidadPersistencia();

	/**
	 * Returns a new object of class '<em>Insert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insert</em>'.
	 * @generated
	 */
	Insert createInsert();

	/**
	 * Returns a new object of class '<em>Letra</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Letra</em>'.
	 * @generated
	 */
	Letra createLetra();

	/**
	 * Returns a new object of class '<em>Metodo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metodo</em>'.
	 * @generated
	 */
	Metodo createMetodo();

	/**
	 * Returns a new object of class '<em>Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapper</em>'.
	 * @generated
	 */
	Mapper createMapper();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArquitecturaPackage getArquitecturaPackage();

} //ArquitecturaFactory
