package org.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.EstilosGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEstilosParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RootSistema'", "'{'", "'vistas'", "','", "'}'", "'barraBusqueda'", "'Vista'", "'colorFondo'", "'tecnologia'", "'letra'", "'Letra'", "'colorLetra'", "'fuente'", "'tamano'", "'android'", "'iOS'", "'web'", "'small'", "'medium'", "'large'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalEstilosParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEstilosParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEstilosParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g"; }



     	private EstilosGrammarAccess grammarAccess;
     	
        public InternalEstilosParser(TokenStream input, EstilosGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "RootSistema";	
       	}
       	
       	@Override
       	protected EstilosGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRootSistema"
    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:68:1: entryRuleRootSistema returns [EObject current=null] : iv_ruleRootSistema= ruleRootSistema EOF ;
    public final EObject entryRuleRootSistema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootSistema = null;


        try {
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:69:2: (iv_ruleRootSistema= ruleRootSistema EOF )
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:70:2: iv_ruleRootSistema= ruleRootSistema EOF
            {
             newCompositeNode(grammarAccess.getRootSistemaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRootSistema_in_entryRuleRootSistema75);
            iv_ruleRootSistema=ruleRootSistema();

            state._fsp--;

             current =iv_ruleRootSistema; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRootSistema85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRootSistema"


    // $ANTLR start "ruleRootSistema"
    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:77:1: ruleRootSistema returns [EObject current=null] : (otherlv_0= 'RootSistema' otherlv_1= '{' otherlv_2= 'vistas' otherlv_3= '{' ( (lv_vistas_4_0= ruleVista ) ) (otherlv_5= ',' ( (lv_vistas_6_0= ruleVista ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleRootSistema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_vistas_4_0 = null;

        EObject lv_vistas_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:80:28: ( (otherlv_0= 'RootSistema' otherlv_1= '{' otherlv_2= 'vistas' otherlv_3= '{' ( (lv_vistas_4_0= ruleVista ) ) (otherlv_5= ',' ( (lv_vistas_6_0= ruleVista ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:81:1: (otherlv_0= 'RootSistema' otherlv_1= '{' otherlv_2= 'vistas' otherlv_3= '{' ( (lv_vistas_4_0= ruleVista ) ) (otherlv_5= ',' ( (lv_vistas_6_0= ruleVista ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:81:1: (otherlv_0= 'RootSistema' otherlv_1= '{' otherlv_2= 'vistas' otherlv_3= '{' ( (lv_vistas_4_0= ruleVista ) ) (otherlv_5= ',' ( (lv_vistas_6_0= ruleVista ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:81:3: otherlv_0= 'RootSistema' otherlv_1= '{' otherlv_2= 'vistas' otherlv_3= '{' ( (lv_vistas_4_0= ruleVista ) ) (otherlv_5= ',' ( (lv_vistas_6_0= ruleVista ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRootSistema122); 

                	newLeafNode(otherlv_0, grammarAccess.getRootSistemaAccess().getRootSistemaKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRootSistema134); 

                	newLeafNode(otherlv_1, grammarAccess.getRootSistemaAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRootSistema146); 

                	newLeafNode(otherlv_2, grammarAccess.getRootSistemaAccess().getVistasKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRootSistema158); 

                	newLeafNode(otherlv_3, grammarAccess.getRootSistemaAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:97:1: ( (lv_vistas_4_0= ruleVista ) )
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:98:1: (lv_vistas_4_0= ruleVista )
            {
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:98:1: (lv_vistas_4_0= ruleVista )
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:99:3: lv_vistas_4_0= ruleVista
            {
             
            	        newCompositeNode(grammarAccess.getRootSistemaAccess().getVistasVistaParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVista_in_ruleRootSistema179);
            lv_vistas_4_0=ruleVista();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRootSistemaRule());
            	        }
                   		add(
                   			current, 
                   			"vistas",
                    		lv_vistas_4_0, 
                    		"Vista");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:115:2: (otherlv_5= ',' ( (lv_vistas_6_0= ruleVista ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:115:4: otherlv_5= ',' ( (lv_vistas_6_0= ruleVista ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRootSistema192); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRootSistemaAccess().getCommaKeyword_5_0());
            	        
            	    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:119:1: ( (lv_vistas_6_0= ruleVista ) )
            	    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:120:1: (lv_vistas_6_0= ruleVista )
            	    {
            	    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:120:1: (lv_vistas_6_0= ruleVista )
            	    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:121:3: lv_vistas_6_0= ruleVista
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRootSistemaAccess().getVistasVistaParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVista_in_ruleRootSistema213);
            	    lv_vistas_6_0=ruleVista();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRootSistemaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"vistas",
            	            		lv_vistas_6_0, 
            	            		"Vista");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRootSistema227); 

                	newLeafNode(otherlv_7, grammarAccess.getRootSistemaAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRootSistema239); 

                	newLeafNode(otherlv_8, grammarAccess.getRootSistemaAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRootSistema"


    // $ANTLR start "entryRuleVista"
    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:153:1: entryRuleVista returns [EObject current=null] : iv_ruleVista= ruleVista EOF ;
    public final EObject entryRuleVista() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVista = null;


        try {
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:154:2: (iv_ruleVista= ruleVista EOF )
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:155:2: iv_ruleVista= ruleVista EOF
            {
             newCompositeNode(grammarAccess.getVistaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVista_in_entryRuleVista275);
            iv_ruleVista=ruleVista();

            state._fsp--;

             current =iv_ruleVista; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVista285); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVista"


    // $ANTLR start "ruleVista"
    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:162:1: ruleVista returns [EObject current=null] : ( ( (lv_barraBusqueda_0_0= 'barraBusqueda' ) )? otherlv_1= 'Vista' otherlv_2= '{' (otherlv_3= 'colorFondo' ( (lv_colorFondo_4_0= ruleEString ) ) )? (otherlv_5= 'tecnologia' ( (lv_tecnologia_6_0= ruleTecnologia ) ) )? otherlv_7= 'letra' ( (lv_letra_8_0= ruleLetra ) ) otherlv_9= '}' ) ;
    public final EObject ruleVista() throws RecognitionException {
        EObject current = null;

        Token lv_barraBusqueda_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_colorFondo_4_0 = null;

        Enumerator lv_tecnologia_6_0 = null;

        EObject lv_letra_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:165:28: ( ( ( (lv_barraBusqueda_0_0= 'barraBusqueda' ) )? otherlv_1= 'Vista' otherlv_2= '{' (otherlv_3= 'colorFondo' ( (lv_colorFondo_4_0= ruleEString ) ) )? (otherlv_5= 'tecnologia' ( (lv_tecnologia_6_0= ruleTecnologia ) ) )? otherlv_7= 'letra' ( (lv_letra_8_0= ruleLetra ) ) otherlv_9= '}' ) )
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:166:1: ( ( (lv_barraBusqueda_0_0= 'barraBusqueda' ) )? otherlv_1= 'Vista' otherlv_2= '{' (otherlv_3= 'colorFondo' ( (lv_colorFondo_4_0= ruleEString ) ) )? (otherlv_5= 'tecnologia' ( (lv_tecnologia_6_0= ruleTecnologia ) ) )? otherlv_7= 'letra' ( (lv_letra_8_0= ruleLetra ) ) otherlv_9= '}' )
            {
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:166:1: ( ( (lv_barraBusqueda_0_0= 'barraBusqueda' ) )? otherlv_1= 'Vista' otherlv_2= '{' (otherlv_3= 'colorFondo' ( (lv_colorFondo_4_0= ruleEString ) ) )? (otherlv_5= 'tecnologia' ( (lv_tecnologia_6_0= ruleTecnologia ) ) )? otherlv_7= 'letra' ( (lv_letra_8_0= ruleLetra ) ) otherlv_9= '}' )
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:166:2: ( (lv_barraBusqueda_0_0= 'barraBusqueda' ) )? otherlv_1= 'Vista' otherlv_2= '{' (otherlv_3= 'colorFondo' ( (lv_colorFondo_4_0= ruleEString ) ) )? (otherlv_5= 'tecnologia' ( (lv_tecnologia_6_0= ruleTecnologia ) ) )? otherlv_7= 'letra' ( (lv_letra_8_0= ruleLetra ) ) otherlv_9= '}'
            {
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:166:2: ( (lv_barraBusqueda_0_0= 'barraBusqueda' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:167:1: (lv_barraBusqueda_0_0= 'barraBusqueda' )
                    {
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:167:1: (lv_barraBusqueda_0_0= 'barraBusqueda' )
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:168:3: lv_barraBusqueda_0_0= 'barraBusqueda'
                    {
                    lv_barraBusqueda_0_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleVista328); 

                            newLeafNode(lv_barraBusqueda_0_0, grammarAccess.getVistaAccess().getBarraBusquedaBarraBusquedaKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVistaRule());
                    	        }
                           		setWithLastConsumed(current, "barraBusqueda", true, "barraBusqueda");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleVista354); 

                	newLeafNode(otherlv_1, grammarAccess.getVistaAccess().getVistaKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleVista366); 

                	newLeafNode(otherlv_2, grammarAccess.getVistaAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:189:1: (otherlv_3= 'colorFondo' ( (lv_colorFondo_4_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:189:3: otherlv_3= 'colorFondo' ( (lv_colorFondo_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleVista379); 

                        	newLeafNode(otherlv_3, grammarAccess.getVistaAccess().getColorFondoKeyword_3_0());
                        
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:193:1: ( (lv_colorFondo_4_0= ruleEString ) )
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:194:1: (lv_colorFondo_4_0= ruleEString )
                    {
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:194:1: (lv_colorFondo_4_0= ruleEString )
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:195:3: lv_colorFondo_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVistaAccess().getColorFondoEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVista400);
                    lv_colorFondo_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVistaRule());
                    	        }
                           		set(
                           			current, 
                           			"colorFondo",
                            		lv_colorFondo_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:211:4: (otherlv_5= 'tecnologia' ( (lv_tecnologia_6_0= ruleTecnologia ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:211:6: otherlv_5= 'tecnologia' ( (lv_tecnologia_6_0= ruleTecnologia ) )
                    {
                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleVista415); 

                        	newLeafNode(otherlv_5, grammarAccess.getVistaAccess().getTecnologiaKeyword_4_0());
                        
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:215:1: ( (lv_tecnologia_6_0= ruleTecnologia ) )
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:216:1: (lv_tecnologia_6_0= ruleTecnologia )
                    {
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:216:1: (lv_tecnologia_6_0= ruleTecnologia )
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:217:3: lv_tecnologia_6_0= ruleTecnologia
                    {
                     
                    	        newCompositeNode(grammarAccess.getVistaAccess().getTecnologiaTecnologiaEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTecnologia_in_ruleVista436);
                    lv_tecnologia_6_0=ruleTecnologia();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVistaRule());
                    	        }
                           		set(
                           			current, 
                           			"tecnologia",
                            		lv_tecnologia_6_0, 
                            		"Tecnologia");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleVista450); 

                	newLeafNode(otherlv_7, grammarAccess.getVistaAccess().getLetraKeyword_5());
                
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:237:1: ( (lv_letra_8_0= ruleLetra ) )
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:238:1: (lv_letra_8_0= ruleLetra )
            {
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:238:1: (lv_letra_8_0= ruleLetra )
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:239:3: lv_letra_8_0= ruleLetra
            {
             
            	        newCompositeNode(grammarAccess.getVistaAccess().getLetraLetraParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLetra_in_ruleVista471);
            lv_letra_8_0=ruleLetra();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVistaRule());
            	        }
                   		set(
                   			current, 
                   			"letra",
                    		lv_letra_8_0, 
                    		"Letra");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleVista483); 

                	newLeafNode(otherlv_9, grammarAccess.getVistaAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVista"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:267:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:268:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:269:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString520);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString531); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:276:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:279:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:280:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:280:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:280:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString571); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:288:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString597); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleLetra"
    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:305:1: entryRuleLetra returns [EObject current=null] : iv_ruleLetra= ruleLetra EOF ;
    public final EObject entryRuleLetra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetra = null;


        try {
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:306:2: (iv_ruleLetra= ruleLetra EOF )
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:307:2: iv_ruleLetra= ruleLetra EOF
            {
             newCompositeNode(grammarAccess.getLetraRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLetra_in_entryRuleLetra644);
            iv_ruleLetra=ruleLetra();

            state._fsp--;

             current =iv_ruleLetra; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetra654); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetra"


    // $ANTLR start "ruleLetra"
    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:314:1: ruleLetra returns [EObject current=null] : ( () otherlv_1= 'Letra' otherlv_2= '{' (otherlv_3= 'colorLetra' ( (lv_colorLetra_4_0= ruleEString ) ) )? (otherlv_5= 'fuente' ( (lv_fuente_6_0= ruleEString ) ) )? (otherlv_7= 'tamano' ( (lv_tamano_8_0= ruleTamanoLetra ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleLetra() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_colorLetra_4_0 = null;

        AntlrDatatypeRuleToken lv_fuente_6_0 = null;

        Enumerator lv_tamano_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:317:28: ( ( () otherlv_1= 'Letra' otherlv_2= '{' (otherlv_3= 'colorLetra' ( (lv_colorLetra_4_0= ruleEString ) ) )? (otherlv_5= 'fuente' ( (lv_fuente_6_0= ruleEString ) ) )? (otherlv_7= 'tamano' ( (lv_tamano_8_0= ruleTamanoLetra ) ) )? otherlv_9= '}' ) )
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:318:1: ( () otherlv_1= 'Letra' otherlv_2= '{' (otherlv_3= 'colorLetra' ( (lv_colorLetra_4_0= ruleEString ) ) )? (otherlv_5= 'fuente' ( (lv_fuente_6_0= ruleEString ) ) )? (otherlv_7= 'tamano' ( (lv_tamano_8_0= ruleTamanoLetra ) ) )? otherlv_9= '}' )
            {
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:318:1: ( () otherlv_1= 'Letra' otherlv_2= '{' (otherlv_3= 'colorLetra' ( (lv_colorLetra_4_0= ruleEString ) ) )? (otherlv_5= 'fuente' ( (lv_fuente_6_0= ruleEString ) ) )? (otherlv_7= 'tamano' ( (lv_tamano_8_0= ruleTamanoLetra ) ) )? otherlv_9= '}' )
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:318:2: () otherlv_1= 'Letra' otherlv_2= '{' (otherlv_3= 'colorLetra' ( (lv_colorLetra_4_0= ruleEString ) ) )? (otherlv_5= 'fuente' ( (lv_fuente_6_0= ruleEString ) ) )? (otherlv_7= 'tamano' ( (lv_tamano_8_0= ruleTamanoLetra ) ) )? otherlv_9= '}'
            {
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:318:2: ()
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:319:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLetraAccess().getLetraAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleLetra700); 

                	newLeafNode(otherlv_1, grammarAccess.getLetraAccess().getLetraKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLetra712); 

                	newLeafNode(otherlv_2, grammarAccess.getLetraAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:332:1: (otherlv_3= 'colorLetra' ( (lv_colorLetra_4_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:332:3: otherlv_3= 'colorLetra' ( (lv_colorLetra_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleLetra725); 

                        	newLeafNode(otherlv_3, grammarAccess.getLetraAccess().getColorLetraKeyword_3_0());
                        
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:336:1: ( (lv_colorLetra_4_0= ruleEString ) )
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:337:1: (lv_colorLetra_4_0= ruleEString )
                    {
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:337:1: (lv_colorLetra_4_0= ruleEString )
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:338:3: lv_colorLetra_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getLetraAccess().getColorLetraEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLetra746);
                    lv_colorLetra_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLetraRule());
                    	        }
                           		set(
                           			current, 
                           			"colorLetra",
                            		lv_colorLetra_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:354:4: (otherlv_5= 'fuente' ( (lv_fuente_6_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:354:6: otherlv_5= 'fuente' ( (lv_fuente_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleLetra761); 

                        	newLeafNode(otherlv_5, grammarAccess.getLetraAccess().getFuenteKeyword_4_0());
                        
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:358:1: ( (lv_fuente_6_0= ruleEString ) )
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:359:1: (lv_fuente_6_0= ruleEString )
                    {
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:359:1: (lv_fuente_6_0= ruleEString )
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:360:3: lv_fuente_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getLetraAccess().getFuenteEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLetra782);
                    lv_fuente_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLetraRule());
                    	        }
                           		set(
                           			current, 
                           			"fuente",
                            		lv_fuente_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:376:4: (otherlv_7= 'tamano' ( (lv_tamano_8_0= ruleTamanoLetra ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:376:6: otherlv_7= 'tamano' ( (lv_tamano_8_0= ruleTamanoLetra ) )
                    {
                    otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleLetra797); 

                        	newLeafNode(otherlv_7, grammarAccess.getLetraAccess().getTamanoKeyword_5_0());
                        
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:380:1: ( (lv_tamano_8_0= ruleTamanoLetra ) )
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:381:1: (lv_tamano_8_0= ruleTamanoLetra )
                    {
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:381:1: (lv_tamano_8_0= ruleTamanoLetra )
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:382:3: lv_tamano_8_0= ruleTamanoLetra
                    {
                     
                    	        newCompositeNode(grammarAccess.getLetraAccess().getTamanoTamanoLetraEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTamanoLetra_in_ruleLetra818);
                    lv_tamano_8_0=ruleTamanoLetra();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLetraRule());
                    	        }
                           		set(
                           			current, 
                           			"tamano",
                            		lv_tamano_8_0, 
                            		"TamanoLetra");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLetra832); 

                	newLeafNode(otherlv_9, grammarAccess.getLetraAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLetra"


    // $ANTLR start "ruleTecnologia"
    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:410:1: ruleTecnologia returns [Enumerator current=null] : ( (enumLiteral_0= 'android' ) | (enumLiteral_1= 'iOS' ) | (enumLiteral_2= 'web' ) ) ;
    public final Enumerator ruleTecnologia() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:412:28: ( ( (enumLiteral_0= 'android' ) | (enumLiteral_1= 'iOS' ) | (enumLiteral_2= 'web' ) ) )
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:413:1: ( (enumLiteral_0= 'android' ) | (enumLiteral_1= 'iOS' ) | (enumLiteral_2= 'web' ) )
            {
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:413:1: ( (enumLiteral_0= 'android' ) | (enumLiteral_1= 'iOS' ) | (enumLiteral_2= 'web' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt9=1;
                }
                break;
            case 26:
                {
                alt9=2;
                }
                break;
            case 27:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:413:2: (enumLiteral_0= 'android' )
                    {
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:413:2: (enumLiteral_0= 'android' )
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:413:4: enumLiteral_0= 'android'
                    {
                    enumLiteral_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTecnologia882); 

                            current = grammarAccess.getTecnologiaAccess().getAndroidEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTecnologiaAccess().getAndroidEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:419:6: (enumLiteral_1= 'iOS' )
                    {
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:419:6: (enumLiteral_1= 'iOS' )
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:419:8: enumLiteral_1= 'iOS'
                    {
                    enumLiteral_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTecnologia899); 

                            current = grammarAccess.getTecnologiaAccess().getIOSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTecnologiaAccess().getIOSEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:425:6: (enumLiteral_2= 'web' )
                    {
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:425:6: (enumLiteral_2= 'web' )
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:425:8: enumLiteral_2= 'web'
                    {
                    enumLiteral_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTecnologia916); 

                            current = grammarAccess.getTecnologiaAccess().getWebEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTecnologiaAccess().getWebEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTecnologia"


    // $ANTLR start "ruleTamanoLetra"
    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:435:1: ruleTamanoLetra returns [Enumerator current=null] : ( (enumLiteral_0= 'small' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'large' ) ) ;
    public final Enumerator ruleTamanoLetra() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:437:28: ( ( (enumLiteral_0= 'small' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'large' ) ) )
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:438:1: ( (enumLiteral_0= 'small' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'large' ) )
            {
            // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:438:1: ( (enumLiteral_0= 'small' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'large' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt10=1;
                }
                break;
            case 29:
                {
                alt10=2;
                }
                break;
            case 30:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:438:2: (enumLiteral_0= 'small' )
                    {
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:438:2: (enumLiteral_0= 'small' )
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:438:4: enumLiteral_0= 'small'
                    {
                    enumLiteral_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleTamanoLetra961); 

                            current = grammarAccess.getTamanoLetraAccess().getSmallEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTamanoLetraAccess().getSmallEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:444:6: (enumLiteral_1= 'medium' )
                    {
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:444:6: (enumLiteral_1= 'medium' )
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:444:8: enumLiteral_1= 'medium'
                    {
                    enumLiteral_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTamanoLetra978); 

                            current = grammarAccess.getTamanoLetraAccess().getMediumEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTamanoLetraAccess().getMediumEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:450:6: (enumLiteral_2= 'large' )
                    {
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:450:6: (enumLiteral_2= 'large' )
                    // ../org.xtext.estilos/src-gen/org/xtext/parser/antlr/internal/InternalEstilos.g:450:8: enumLiteral_2= 'large'
                    {
                    enumLiteral_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTamanoLetra995); 

                            current = grammarAccess.getTamanoLetraAccess().getLargeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTamanoLetraAccess().getLargeEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTamanoLetra"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRootSistema_in_entryRuleRootSistema75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRootSistema85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleRootSistema122 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRootSistema134 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRootSistema146 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRootSistema158 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_ruleVista_in_ruleRootSistema179 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleRootSistema192 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_ruleVista_in_ruleRootSistema213 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleRootSistema227 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRootSistema239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVista_in_entryRuleVista275 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVista285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleVista328 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleVista354 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleVista366 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_18_in_ruleVista379 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVista400 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleVista415 = new BitSet(new long[]{0x000000000E000000L});
        public static final BitSet FOLLOW_ruleTecnologia_in_ruleVista436 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleVista450 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleLetra_in_ruleVista471 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleVista483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString520 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetra_in_entryRuleLetra644 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetra654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleLetra700 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLetra712 = new BitSet(new long[]{0x0000000001C08000L});
        public static final BitSet FOLLOW_22_in_ruleLetra725 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLetra746 = new BitSet(new long[]{0x0000000001808000L});
        public static final BitSet FOLLOW_23_in_ruleLetra761 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLetra782 = new BitSet(new long[]{0x0000000001008000L});
        public static final BitSet FOLLOW_24_in_ruleLetra797 = new BitSet(new long[]{0x0000000070000000L});
        public static final BitSet FOLLOW_ruleTamanoLetra_in_ruleLetra818 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleLetra832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleTecnologia882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleTecnologia899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleTecnologia916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleTamanoLetra961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleTamanoLetra978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleTamanoLetra995 = new BitSet(new long[]{0x0000000000000002L});
    }


}