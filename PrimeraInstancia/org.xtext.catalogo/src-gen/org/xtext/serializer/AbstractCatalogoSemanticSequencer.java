package org.xtext.serializer;

import catalogo.Atributo;
import catalogo.Catalogo;
import catalogo.CatalogoPackage;
import catalogo.Categoria;
import catalogo.Empresa;
import catalogo.Producto;
import catalogo.RootSistema;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.services.CatalogoGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractCatalogoSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CatalogoGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CatalogoPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CatalogoPackage.ATRIBUTO:
				if(context == grammarAccess.getAtributoRule()) {
					sequence_Atributo(context, (Atributo) semanticObject); 
					return; 
				}
				else break;
			case CatalogoPackage.CATALOGO:
				if(context == grammarAccess.getCatalogoRule()) {
					sequence_Catalogo(context, (Catalogo) semanticObject); 
					return; 
				}
				else break;
			case CatalogoPackage.CATEGORIA:
				if(context == grammarAccess.getCategoriaRule()) {
					sequence_Categoria(context, (Categoria) semanticObject); 
					return; 
				}
				else break;
			case CatalogoPackage.EMPRESA:
				if(context == grammarAccess.getEmpresaRule()) {
					sequence_Empresa(context, (Empresa) semanticObject); 
					return; 
				}
				else break;
			case CatalogoPackage.PRODUCTO:
				if(context == grammarAccess.getProductoRule()) {
					sequence_Producto(context, (Producto) semanticObject); 
					return; 
				}
				else break;
			case CatalogoPackage.ROOT_SISTEMA:
				if(context == grammarAccess.getRootSistemaRule()) {
					sequence_RootSistema(context, (RootSistema) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (idAtributo=ELong? nombreAtributo=EString? valorAtributo=EString? tipoDato=EString?)
	 */
	protected void sequence_Atributo(EObject context, Atributo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (idCatalogo=ELong? nombre=EString? categorias+=Categoria categorias+=Categoria*)
	 */
	protected void sequence_Catalogo(EObject context, Catalogo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (idCategoria=ELong? nombre=EString? productos+=Producto productos+=Producto*)
	 */
	protected void sequence_Categoria(EObject context, Categoria semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         nombre=EString? 
	 *         direccion=EString? 
	 *         email=EString? 
	 *         telefono=EString? 
	 *         descripcion=EString? 
	 *         urlImagen=EString? 
	 *         catalogo=Catalogo
	 *     )
	 */
	protected void sequence_Empresa(EObject context, Empresa semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (idProducto=ELong? nombre=EString? atributos+=Atributo atributos+=Atributo*)
	 */
	protected void sequence_Producto(EObject context, Producto semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     empresa=Empresa
	 */
	protected void sequence_RootSistema(EObject context, RootSistema semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CatalogoPackage.Literals.ROOT_SISTEMA__EMPRESA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CatalogoPackage.Literals.ROOT_SISTEMA__EMPRESA));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRootSistemaAccess().getEmpresaEmpresaParserRuleCall_3_0(), semanticObject.getEmpresa());
		feeder.finish();
	}
}
