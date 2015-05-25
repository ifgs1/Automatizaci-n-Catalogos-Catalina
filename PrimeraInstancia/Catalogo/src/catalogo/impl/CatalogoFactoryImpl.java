/**
 */
package catalogo.impl;

import catalogo.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CatalogoFactoryImpl extends EFactoryImpl implements CatalogoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CatalogoFactory init() {
		try {
			CatalogoFactory theCatalogoFactory = (CatalogoFactory)EPackage.Registry.INSTANCE.getEFactory(CatalogoPackage.eNS_URI);
			if (theCatalogoFactory != null) {
				return theCatalogoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CatalogoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CatalogoPackage.CATEGORIA: return createCategoria();
			case CatalogoPackage.ROOT_SISTEMA: return createRootSistema();
			case CatalogoPackage.ATRIBUTO: return createAtributo();
			case CatalogoPackage.PRODUCTO: return createProducto();
			case CatalogoPackage.CATALOGO: return createCatalogo();
			case CatalogoPackage.EMPRESA: return createEmpresa();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categoria createCategoria() {
		CategoriaImpl categoria = new CategoriaImpl();
		return categoria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootSistema createRootSistema() {
		RootSistemaImpl rootSistema = new RootSistemaImpl();
		return rootSistema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atributo createAtributo() {
		AtributoImpl atributo = new AtributoImpl();
		return atributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Producto createProducto() {
		ProductoImpl producto = new ProductoImpl();
		return producto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catalogo createCatalogo() {
		CatalogoImpl catalogo = new CatalogoImpl();
		return catalogo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Empresa createEmpresa() {
		EmpresaImpl empresa = new EmpresaImpl();
		return empresa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogoPackage getCatalogoPackage() {
		return (CatalogoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CatalogoPackage getPackage() {
		return CatalogoPackage.eINSTANCE;
	}

} //CatalogoFactoryImpl
