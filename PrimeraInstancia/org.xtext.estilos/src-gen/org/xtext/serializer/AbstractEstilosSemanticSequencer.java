package org.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import estilos.EstilosPackage;
import estilos.Letra;
import estilos.RootSistema;
import estilos.Vista;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.xtext.services.EstilosGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractEstilosSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EstilosGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == EstilosPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EstilosPackage.LETRA:
				if(context == grammarAccess.getLetraRule()) {
					sequence_Letra(context, (Letra) semanticObject); 
					return; 
				}
				else break;
			case EstilosPackage.ROOT_SISTEMA:
				if(context == grammarAccess.getRootSistemaRule()) {
					sequence_RootSistema(context, (RootSistema) semanticObject); 
					return; 
				}
				else break;
			case EstilosPackage.VISTA:
				if(context == grammarAccess.getVistaRule()) {
					sequence_Vista(context, (Vista) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (colorLetra=EString? fuente=EString? tamano=TamanoLetra?)
	 */
	protected void sequence_Letra(EObject context, Letra semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (vistas+=Vista vistas+=Vista*)
	 */
	protected void sequence_RootSistema(EObject context, RootSistema semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (barraBusqueda?='barraBusqueda'? colorFondo=EString? tecnologia=Tecnologia? letra=Letra)
	 */
	protected void sequence_Vista(EObject context, Vista semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
