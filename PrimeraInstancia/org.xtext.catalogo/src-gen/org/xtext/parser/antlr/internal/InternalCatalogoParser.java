package org.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.CatalogoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCatalogoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RootSistema'", "'{'", "'empresa'", "'}'", "'Empresa'", "'nombre'", "'direccion'", "'email'", "'telefono'", "'descripcion'", "'urlImagen'", "'catalogo'", "'Catalogo'", "'idCatalogo'", "'categorias'", "','", "'-'", "'Categoria'", "'idCategoria'", "'productos'", "'Producto'", "'idProducto'", "'atributos'", "'Atributo'", "'idAtributo'", "'nombreAtributo'", "'valorAtributo'", "'tipoDato'"
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
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalCatalogoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCatalogoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCatalogoParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g"; }



     	private CatalogoGrammarAccess grammarAccess;
     	
        public InternalCatalogoParser(TokenStream input, CatalogoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "RootSistema";	
       	}
       	
       	@Override
       	protected CatalogoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRootSistema"
    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:67:1: entryRuleRootSistema returns [EObject current=null] : iv_ruleRootSistema= ruleRootSistema EOF ;
    public final EObject entryRuleRootSistema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootSistema = null;


        try {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:68:2: (iv_ruleRootSistema= ruleRootSistema EOF )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:69:2: iv_ruleRootSistema= ruleRootSistema EOF
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
    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:76:1: ruleRootSistema returns [EObject current=null] : (otherlv_0= 'RootSistema' otherlv_1= '{' otherlv_2= 'empresa' ( (lv_empresa_3_0= ruleEmpresa ) ) otherlv_4= '}' ) ;
    public final EObject ruleRootSistema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_empresa_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:79:28: ( (otherlv_0= 'RootSistema' otherlv_1= '{' otherlv_2= 'empresa' ( (lv_empresa_3_0= ruleEmpresa ) ) otherlv_4= '}' ) )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:80:1: (otherlv_0= 'RootSistema' otherlv_1= '{' otherlv_2= 'empresa' ( (lv_empresa_3_0= ruleEmpresa ) ) otherlv_4= '}' )
            {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:80:1: (otherlv_0= 'RootSistema' otherlv_1= '{' otherlv_2= 'empresa' ( (lv_empresa_3_0= ruleEmpresa ) ) otherlv_4= '}' )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:80:3: otherlv_0= 'RootSistema' otherlv_1= '{' otherlv_2= 'empresa' ( (lv_empresa_3_0= ruleEmpresa ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRootSistema122); 

                	newLeafNode(otherlv_0, grammarAccess.getRootSistemaAccess().getRootSistemaKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRootSistema134); 

                	newLeafNode(otherlv_1, grammarAccess.getRootSistemaAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRootSistema146); 

                	newLeafNode(otherlv_2, grammarAccess.getRootSistemaAccess().getEmpresaKeyword_2());
                
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:92:1: ( (lv_empresa_3_0= ruleEmpresa ) )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:93:1: (lv_empresa_3_0= ruleEmpresa )
            {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:93:1: (lv_empresa_3_0= ruleEmpresa )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:94:3: lv_empresa_3_0= ruleEmpresa
            {
             
            	        newCompositeNode(grammarAccess.getRootSistemaAccess().getEmpresaEmpresaParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEmpresa_in_ruleRootSistema167);
            lv_empresa_3_0=ruleEmpresa();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRootSistemaRule());
            	        }
                   		set(
                   			current, 
                   			"empresa",
                    		lv_empresa_3_0, 
                    		"Empresa");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRootSistema179); 

                	newLeafNode(otherlv_4, grammarAccess.getRootSistemaAccess().getRightCurlyBracketKeyword_4());
                

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


    // $ANTLR start "entryRuleEmpresa"
    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:122:1: entryRuleEmpresa returns [EObject current=null] : iv_ruleEmpresa= ruleEmpresa EOF ;
    public final EObject entryRuleEmpresa() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmpresa = null;


        try {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:123:2: (iv_ruleEmpresa= ruleEmpresa EOF )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:124:2: iv_ruleEmpresa= ruleEmpresa EOF
            {
             newCompositeNode(grammarAccess.getEmpresaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEmpresa_in_entryRuleEmpresa215);
            iv_ruleEmpresa=ruleEmpresa();

            state._fsp--;

             current =iv_ruleEmpresa; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmpresa225); 

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
    // $ANTLR end "entryRuleEmpresa"


    // $ANTLR start "ruleEmpresa"
    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:131:1: ruleEmpresa returns [EObject current=null] : (otherlv_0= 'Empresa' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'direccion' ( (lv_direccion_5_0= ruleEString ) ) )? (otherlv_6= 'email' ( (lv_email_7_0= ruleEString ) ) )? (otherlv_8= 'telefono' ( (lv_telefono_9_0= ruleEString ) ) )? (otherlv_10= 'descripcion' ( (lv_descripcion_11_0= ruleEString ) ) )? (otherlv_12= 'urlImagen' ( (lv_urlImagen_13_0= ruleEString ) ) )? otherlv_14= 'catalogo' ( (lv_catalogo_15_0= ruleCatalogo ) ) otherlv_16= '}' ) ;
    public final EObject ruleEmpresa() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_nombre_3_0 = null;

        AntlrDatatypeRuleToken lv_direccion_5_0 = null;

        AntlrDatatypeRuleToken lv_email_7_0 = null;

        AntlrDatatypeRuleToken lv_telefono_9_0 = null;

        AntlrDatatypeRuleToken lv_descripcion_11_0 = null;

        AntlrDatatypeRuleToken lv_urlImagen_13_0 = null;

        EObject lv_catalogo_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:134:28: ( (otherlv_0= 'Empresa' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'direccion' ( (lv_direccion_5_0= ruleEString ) ) )? (otherlv_6= 'email' ( (lv_email_7_0= ruleEString ) ) )? (otherlv_8= 'telefono' ( (lv_telefono_9_0= ruleEString ) ) )? (otherlv_10= 'descripcion' ( (lv_descripcion_11_0= ruleEString ) ) )? (otherlv_12= 'urlImagen' ( (lv_urlImagen_13_0= ruleEString ) ) )? otherlv_14= 'catalogo' ( (lv_catalogo_15_0= ruleCatalogo ) ) otherlv_16= '}' ) )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:135:1: (otherlv_0= 'Empresa' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'direccion' ( (lv_direccion_5_0= ruleEString ) ) )? (otherlv_6= 'email' ( (lv_email_7_0= ruleEString ) ) )? (otherlv_8= 'telefono' ( (lv_telefono_9_0= ruleEString ) ) )? (otherlv_10= 'descripcion' ( (lv_descripcion_11_0= ruleEString ) ) )? (otherlv_12= 'urlImagen' ( (lv_urlImagen_13_0= ruleEString ) ) )? otherlv_14= 'catalogo' ( (lv_catalogo_15_0= ruleCatalogo ) ) otherlv_16= '}' )
            {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:135:1: (otherlv_0= 'Empresa' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'direccion' ( (lv_direccion_5_0= ruleEString ) ) )? (otherlv_6= 'email' ( (lv_email_7_0= ruleEString ) ) )? (otherlv_8= 'telefono' ( (lv_telefono_9_0= ruleEString ) ) )? (otherlv_10= 'descripcion' ( (lv_descripcion_11_0= ruleEString ) ) )? (otherlv_12= 'urlImagen' ( (lv_urlImagen_13_0= ruleEString ) ) )? otherlv_14= 'catalogo' ( (lv_catalogo_15_0= ruleCatalogo ) ) otherlv_16= '}' )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:135:3: otherlv_0= 'Empresa' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'direccion' ( (lv_direccion_5_0= ruleEString ) ) )? (otherlv_6= 'email' ( (lv_email_7_0= ruleEString ) ) )? (otherlv_8= 'telefono' ( (lv_telefono_9_0= ruleEString ) ) )? (otherlv_10= 'descripcion' ( (lv_descripcion_11_0= ruleEString ) ) )? (otherlv_12= 'urlImagen' ( (lv_urlImagen_13_0= ruleEString ) ) )? otherlv_14= 'catalogo' ( (lv_catalogo_15_0= ruleCatalogo ) ) otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEmpresa262); 

                	newLeafNode(otherlv_0, grammarAccess.getEmpresaAccess().getEmpresaKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEmpresa274); 

                	newLeafNode(otherlv_1, grammarAccess.getEmpresaAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:143:1: (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:143:3: otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEmpresa287); 

                        	newLeafNode(otherlv_2, grammarAccess.getEmpresaAccess().getNombreKeyword_2_0());
                        
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:147:1: ( (lv_nombre_3_0= ruleEString ) )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:148:1: (lv_nombre_3_0= ruleEString )
                    {
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:148:1: (lv_nombre_3_0= ruleEString )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:149:3: lv_nombre_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEmpresaAccess().getNombreEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEmpresa308);
                    lv_nombre_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEmpresaRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre",
                            		lv_nombre_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:165:4: (otherlv_4= 'direccion' ( (lv_direccion_5_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:165:6: otherlv_4= 'direccion' ( (lv_direccion_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEmpresa323); 

                        	newLeafNode(otherlv_4, grammarAccess.getEmpresaAccess().getDireccionKeyword_3_0());
                        
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:169:1: ( (lv_direccion_5_0= ruleEString ) )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:170:1: (lv_direccion_5_0= ruleEString )
                    {
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:170:1: (lv_direccion_5_0= ruleEString )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:171:3: lv_direccion_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEmpresaAccess().getDireccionEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEmpresa344);
                    lv_direccion_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEmpresaRule());
                    	        }
                           		set(
                           			current, 
                           			"direccion",
                            		lv_direccion_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:187:4: (otherlv_6= 'email' ( (lv_email_7_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:187:6: otherlv_6= 'email' ( (lv_email_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEmpresa359); 

                        	newLeafNode(otherlv_6, grammarAccess.getEmpresaAccess().getEmailKeyword_4_0());
                        
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:191:1: ( (lv_email_7_0= ruleEString ) )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:192:1: (lv_email_7_0= ruleEString )
                    {
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:192:1: (lv_email_7_0= ruleEString )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:193:3: lv_email_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEmpresaAccess().getEmailEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEmpresa380);
                    lv_email_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEmpresaRule());
                    	        }
                           		set(
                           			current, 
                           			"email",
                            		lv_email_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:209:4: (otherlv_8= 'telefono' ( (lv_telefono_9_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:209:6: otherlv_8= 'telefono' ( (lv_telefono_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEmpresa395); 

                        	newLeafNode(otherlv_8, grammarAccess.getEmpresaAccess().getTelefonoKeyword_5_0());
                        
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:213:1: ( (lv_telefono_9_0= ruleEString ) )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:214:1: (lv_telefono_9_0= ruleEString )
                    {
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:214:1: (lv_telefono_9_0= ruleEString )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:215:3: lv_telefono_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEmpresaAccess().getTelefonoEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEmpresa416);
                    lv_telefono_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEmpresaRule());
                    	        }
                           		set(
                           			current, 
                           			"telefono",
                            		lv_telefono_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:231:4: (otherlv_10= 'descripcion' ( (lv_descripcion_11_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:231:6: otherlv_10= 'descripcion' ( (lv_descripcion_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEmpresa431); 

                        	newLeafNode(otherlv_10, grammarAccess.getEmpresaAccess().getDescripcionKeyword_6_0());
                        
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:235:1: ( (lv_descripcion_11_0= ruleEString ) )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:236:1: (lv_descripcion_11_0= ruleEString )
                    {
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:236:1: (lv_descripcion_11_0= ruleEString )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:237:3: lv_descripcion_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEmpresaAccess().getDescripcionEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEmpresa452);
                    lv_descripcion_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEmpresaRule());
                    	        }
                           		set(
                           			current, 
                           			"descripcion",
                            		lv_descripcion_11_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:253:4: (otherlv_12= 'urlImagen' ( (lv_urlImagen_13_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:253:6: otherlv_12= 'urlImagen' ( (lv_urlImagen_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEmpresa467); 

                        	newLeafNode(otherlv_12, grammarAccess.getEmpresaAccess().getUrlImagenKeyword_7_0());
                        
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:257:1: ( (lv_urlImagen_13_0= ruleEString ) )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:258:1: (lv_urlImagen_13_0= ruleEString )
                    {
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:258:1: (lv_urlImagen_13_0= ruleEString )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:259:3: lv_urlImagen_13_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEmpresaAccess().getUrlImagenEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEmpresa488);
                    lv_urlImagen_13_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEmpresaRule());
                    	        }
                           		set(
                           			current, 
                           			"urlImagen",
                            		lv_urlImagen_13_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEmpresa502); 

                	newLeafNode(otherlv_14, grammarAccess.getEmpresaAccess().getCatalogoKeyword_8());
                
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:279:1: ( (lv_catalogo_15_0= ruleCatalogo ) )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:280:1: (lv_catalogo_15_0= ruleCatalogo )
            {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:280:1: (lv_catalogo_15_0= ruleCatalogo )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:281:3: lv_catalogo_15_0= ruleCatalogo
            {
             
            	        newCompositeNode(grammarAccess.getEmpresaAccess().getCatalogoCatalogoParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleCatalogo_in_ruleEmpresa523);
            lv_catalogo_15_0=ruleCatalogo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEmpresaRule());
            	        }
                   		set(
                   			current, 
                   			"catalogo",
                    		lv_catalogo_15_0, 
                    		"Catalogo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEmpresa535); 

                	newLeafNode(otherlv_16, grammarAccess.getEmpresaAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleEmpresa"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:309:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:310:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:311:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString572);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString583); 

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
    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:318:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:321:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:322:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:322:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:322:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString623); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:330:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString649); 

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


    // $ANTLR start "entryRuleCatalogo"
    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:345:1: entryRuleCatalogo returns [EObject current=null] : iv_ruleCatalogo= ruleCatalogo EOF ;
    public final EObject entryRuleCatalogo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCatalogo = null;


        try {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:346:2: (iv_ruleCatalogo= ruleCatalogo EOF )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:347:2: iv_ruleCatalogo= ruleCatalogo EOF
            {
             newCompositeNode(grammarAccess.getCatalogoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCatalogo_in_entryRuleCatalogo694);
            iv_ruleCatalogo=ruleCatalogo();

            state._fsp--;

             current =iv_ruleCatalogo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCatalogo704); 

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
    // $ANTLR end "entryRuleCatalogo"


    // $ANTLR start "ruleCatalogo"
    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:354:1: ruleCatalogo returns [EObject current=null] : (otherlv_0= 'Catalogo' otherlv_1= '{' (otherlv_2= 'idCatalogo' ( (lv_idCatalogo_3_0= ruleELong ) ) )? (otherlv_4= 'nombre' ( (lv_nombre_5_0= ruleEString ) ) )? otherlv_6= 'categorias' otherlv_7= '{' ( (lv_categorias_8_0= ruleCategoria ) ) (otherlv_9= ',' ( (lv_categorias_10_0= ruleCategoria ) ) )* otherlv_11= '}' otherlv_12= '}' ) ;
    public final EObject ruleCatalogo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_idCatalogo_3_0 = null;

        AntlrDatatypeRuleToken lv_nombre_5_0 = null;

        EObject lv_categorias_8_0 = null;

        EObject lv_categorias_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:357:28: ( (otherlv_0= 'Catalogo' otherlv_1= '{' (otherlv_2= 'idCatalogo' ( (lv_idCatalogo_3_0= ruleELong ) ) )? (otherlv_4= 'nombre' ( (lv_nombre_5_0= ruleEString ) ) )? otherlv_6= 'categorias' otherlv_7= '{' ( (lv_categorias_8_0= ruleCategoria ) ) (otherlv_9= ',' ( (lv_categorias_10_0= ruleCategoria ) ) )* otherlv_11= '}' otherlv_12= '}' ) )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:358:1: (otherlv_0= 'Catalogo' otherlv_1= '{' (otherlv_2= 'idCatalogo' ( (lv_idCatalogo_3_0= ruleELong ) ) )? (otherlv_4= 'nombre' ( (lv_nombre_5_0= ruleEString ) ) )? otherlv_6= 'categorias' otherlv_7= '{' ( (lv_categorias_8_0= ruleCategoria ) ) (otherlv_9= ',' ( (lv_categorias_10_0= ruleCategoria ) ) )* otherlv_11= '}' otherlv_12= '}' )
            {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:358:1: (otherlv_0= 'Catalogo' otherlv_1= '{' (otherlv_2= 'idCatalogo' ( (lv_idCatalogo_3_0= ruleELong ) ) )? (otherlv_4= 'nombre' ( (lv_nombre_5_0= ruleEString ) ) )? otherlv_6= 'categorias' otherlv_7= '{' ( (lv_categorias_8_0= ruleCategoria ) ) (otherlv_9= ',' ( (lv_categorias_10_0= ruleCategoria ) ) )* otherlv_11= '}' otherlv_12= '}' )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:358:3: otherlv_0= 'Catalogo' otherlv_1= '{' (otherlv_2= 'idCatalogo' ( (lv_idCatalogo_3_0= ruleELong ) ) )? (otherlv_4= 'nombre' ( (lv_nombre_5_0= ruleEString ) ) )? otherlv_6= 'categorias' otherlv_7= '{' ( (lv_categorias_8_0= ruleCategoria ) ) (otherlv_9= ',' ( (lv_categorias_10_0= ruleCategoria ) ) )* otherlv_11= '}' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCatalogo741); 

                	newLeafNode(otherlv_0, grammarAccess.getCatalogoAccess().getCatalogoKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCatalogo753); 

                	newLeafNode(otherlv_1, grammarAccess.getCatalogoAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:366:1: (otherlv_2= 'idCatalogo' ( (lv_idCatalogo_3_0= ruleELong ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:366:3: otherlv_2= 'idCatalogo' ( (lv_idCatalogo_3_0= ruleELong ) )
                    {
                    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCatalogo766); 

                        	newLeafNode(otherlv_2, grammarAccess.getCatalogoAccess().getIdCatalogoKeyword_2_0());
                        
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:370:1: ( (lv_idCatalogo_3_0= ruleELong ) )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:371:1: (lv_idCatalogo_3_0= ruleELong )
                    {
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:371:1: (lv_idCatalogo_3_0= ruleELong )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:372:3: lv_idCatalogo_3_0= ruleELong
                    {
                     
                    	        newCompositeNode(grammarAccess.getCatalogoAccess().getIdCatalogoELongParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleELong_in_ruleCatalogo787);
                    lv_idCatalogo_3_0=ruleELong();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCatalogoRule());
                    	        }
                           		set(
                           			current, 
                           			"idCatalogo",
                            		lv_idCatalogo_3_0, 
                            		"ELong");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:388:4: (otherlv_4= 'nombre' ( (lv_nombre_5_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:388:6: otherlv_4= 'nombre' ( (lv_nombre_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCatalogo802); 

                        	newLeafNode(otherlv_4, grammarAccess.getCatalogoAccess().getNombreKeyword_3_0());
                        
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:392:1: ( (lv_nombre_5_0= ruleEString ) )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:393:1: (lv_nombre_5_0= ruleEString )
                    {
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:393:1: (lv_nombre_5_0= ruleEString )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:394:3: lv_nombre_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCatalogoAccess().getNombreEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCatalogo823);
                    lv_nombre_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCatalogoRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre",
                            		lv_nombre_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleCatalogo837); 

                	newLeafNode(otherlv_6, grammarAccess.getCatalogoAccess().getCategoriasKeyword_4());
                
            otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCatalogo849); 

                	newLeafNode(otherlv_7, grammarAccess.getCatalogoAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:418:1: ( (lv_categorias_8_0= ruleCategoria ) )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:419:1: (lv_categorias_8_0= ruleCategoria )
            {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:419:1: (lv_categorias_8_0= ruleCategoria )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:420:3: lv_categorias_8_0= ruleCategoria
            {
             
            	        newCompositeNode(grammarAccess.getCatalogoAccess().getCategoriasCategoriaParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleCategoria_in_ruleCatalogo870);
            lv_categorias_8_0=ruleCategoria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCatalogoRule());
            	        }
                   		add(
                   			current, 
                   			"categorias",
                    		lv_categorias_8_0, 
                    		"Categoria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:436:2: (otherlv_9= ',' ( (lv_categorias_10_0= ruleCategoria ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:436:4: otherlv_9= ',' ( (lv_categorias_10_0= ruleCategoria ) )
            	    {
            	    otherlv_9=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCatalogo883); 

            	        	newLeafNode(otherlv_9, grammarAccess.getCatalogoAccess().getCommaKeyword_7_0());
            	        
            	    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:440:1: ( (lv_categorias_10_0= ruleCategoria ) )
            	    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:441:1: (lv_categorias_10_0= ruleCategoria )
            	    {
            	    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:441:1: (lv_categorias_10_0= ruleCategoria )
            	    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:442:3: lv_categorias_10_0= ruleCategoria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCatalogoAccess().getCategoriasCategoriaParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCategoria_in_ruleCatalogo904);
            	    lv_categorias_10_0=ruleCategoria();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCatalogoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"categorias",
            	            		lv_categorias_10_0, 
            	            		"Categoria");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCatalogo918); 

                	newLeafNode(otherlv_11, grammarAccess.getCatalogoAccess().getRightCurlyBracketKeyword_8());
                
            otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCatalogo930); 

                	newLeafNode(otherlv_12, grammarAccess.getCatalogoAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleCatalogo"


    // $ANTLR start "entryRuleELong"
    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:474:1: entryRuleELong returns [String current=null] : iv_ruleELong= ruleELong EOF ;
    public final String entryRuleELong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELong = null;


        try {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:475:2: (iv_ruleELong= ruleELong EOF )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:476:2: iv_ruleELong= ruleELong EOF
            {
             newCompositeNode(grammarAccess.getELongRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleELong_in_entryRuleELong967);
            iv_ruleELong=ruleELong();

            state._fsp--;

             current =iv_ruleELong.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleELong978); 

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
    // $ANTLR end "entryRuleELong"


    // $ANTLR start "ruleELong"
    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:483:1: ruleELong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleELong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:486:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:487:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:487:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:487:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:487:2: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:488:2: kw= '-'
                    {
                    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleELong1017); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getELongAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleELong1034); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getELongAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleELong"


    // $ANTLR start "entryRuleCategoria"
    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:508:1: entryRuleCategoria returns [EObject current=null] : iv_ruleCategoria= ruleCategoria EOF ;
    public final EObject entryRuleCategoria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategoria = null;


        try {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:509:2: (iv_ruleCategoria= ruleCategoria EOF )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:510:2: iv_ruleCategoria= ruleCategoria EOF
            {
             newCompositeNode(grammarAccess.getCategoriaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCategoria_in_entryRuleCategoria1079);
            iv_ruleCategoria=ruleCategoria();

            state._fsp--;

             current =iv_ruleCategoria; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCategoria1089); 

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
    // $ANTLR end "entryRuleCategoria"


    // $ANTLR start "ruleCategoria"
    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:517:1: ruleCategoria returns [EObject current=null] : (otherlv_0= 'Categoria' otherlv_1= '{' (otherlv_2= 'idCategoria' ( (lv_idCategoria_3_0= ruleELong ) ) )? (otherlv_4= 'nombre' ( (lv_nombre_5_0= ruleEString ) ) )? otherlv_6= 'productos' otherlv_7= '{' ( (lv_productos_8_0= ruleProducto ) ) (otherlv_9= ',' ( (lv_productos_10_0= ruleProducto ) ) )* otherlv_11= '}' otherlv_12= '}' ) ;
    public final EObject ruleCategoria() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_idCategoria_3_0 = null;

        AntlrDatatypeRuleToken lv_nombre_5_0 = null;

        EObject lv_productos_8_0 = null;

        EObject lv_productos_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:520:28: ( (otherlv_0= 'Categoria' otherlv_1= '{' (otherlv_2= 'idCategoria' ( (lv_idCategoria_3_0= ruleELong ) ) )? (otherlv_4= 'nombre' ( (lv_nombre_5_0= ruleEString ) ) )? otherlv_6= 'productos' otherlv_7= '{' ( (lv_productos_8_0= ruleProducto ) ) (otherlv_9= ',' ( (lv_productos_10_0= ruleProducto ) ) )* otherlv_11= '}' otherlv_12= '}' ) )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:521:1: (otherlv_0= 'Categoria' otherlv_1= '{' (otherlv_2= 'idCategoria' ( (lv_idCategoria_3_0= ruleELong ) ) )? (otherlv_4= 'nombre' ( (lv_nombre_5_0= ruleEString ) ) )? otherlv_6= 'productos' otherlv_7= '{' ( (lv_productos_8_0= ruleProducto ) ) (otherlv_9= ',' ( (lv_productos_10_0= ruleProducto ) ) )* otherlv_11= '}' otherlv_12= '}' )
            {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:521:1: (otherlv_0= 'Categoria' otherlv_1= '{' (otherlv_2= 'idCategoria' ( (lv_idCategoria_3_0= ruleELong ) ) )? (otherlv_4= 'nombre' ( (lv_nombre_5_0= ruleEString ) ) )? otherlv_6= 'productos' otherlv_7= '{' ( (lv_productos_8_0= ruleProducto ) ) (otherlv_9= ',' ( (lv_productos_10_0= ruleProducto ) ) )* otherlv_11= '}' otherlv_12= '}' )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:521:3: otherlv_0= 'Categoria' otherlv_1= '{' (otherlv_2= 'idCategoria' ( (lv_idCategoria_3_0= ruleELong ) ) )? (otherlv_4= 'nombre' ( (lv_nombre_5_0= ruleEString ) ) )? otherlv_6= 'productos' otherlv_7= '{' ( (lv_productos_8_0= ruleProducto ) ) (otherlv_9= ',' ( (lv_productos_10_0= ruleProducto ) ) )* otherlv_11= '}' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleCategoria1126); 

                	newLeafNode(otherlv_0, grammarAccess.getCategoriaAccess().getCategoriaKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCategoria1138); 

                	newLeafNode(otherlv_1, grammarAccess.getCategoriaAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:529:1: (otherlv_2= 'idCategoria' ( (lv_idCategoria_3_0= ruleELong ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:529:3: otherlv_2= 'idCategoria' ( (lv_idCategoria_3_0= ruleELong ) )
                    {
                    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCategoria1151); 

                        	newLeafNode(otherlv_2, grammarAccess.getCategoriaAccess().getIdCategoriaKeyword_2_0());
                        
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:533:1: ( (lv_idCategoria_3_0= ruleELong ) )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:534:1: (lv_idCategoria_3_0= ruleELong )
                    {
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:534:1: (lv_idCategoria_3_0= ruleELong )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:535:3: lv_idCategoria_3_0= ruleELong
                    {
                     
                    	        newCompositeNode(grammarAccess.getCategoriaAccess().getIdCategoriaELongParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleELong_in_ruleCategoria1172);
                    lv_idCategoria_3_0=ruleELong();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCategoriaRule());
                    	        }
                           		set(
                           			current, 
                           			"idCategoria",
                            		lv_idCategoria_3_0, 
                            		"ELong");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:551:4: (otherlv_4= 'nombre' ( (lv_nombre_5_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:551:6: otherlv_4= 'nombre' ( (lv_nombre_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCategoria1187); 

                        	newLeafNode(otherlv_4, grammarAccess.getCategoriaAccess().getNombreKeyword_3_0());
                        
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:555:1: ( (lv_nombre_5_0= ruleEString ) )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:556:1: (lv_nombre_5_0= ruleEString )
                    {
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:556:1: (lv_nombre_5_0= ruleEString )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:557:3: lv_nombre_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCategoriaAccess().getNombreEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCategoria1208);
                    lv_nombre_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCategoriaRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre",
                            		lv_nombre_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCategoria1222); 

                	newLeafNode(otherlv_6, grammarAccess.getCategoriaAccess().getProductosKeyword_4());
                
            otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCategoria1234); 

                	newLeafNode(otherlv_7, grammarAccess.getCategoriaAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:581:1: ( (lv_productos_8_0= ruleProducto ) )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:582:1: (lv_productos_8_0= ruleProducto )
            {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:582:1: (lv_productos_8_0= ruleProducto )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:583:3: lv_productos_8_0= ruleProducto
            {
             
            	        newCompositeNode(grammarAccess.getCategoriaAccess().getProductosProductoParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleProducto_in_ruleCategoria1255);
            lv_productos_8_0=ruleProducto();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCategoriaRule());
            	        }
                   		add(
                   			current, 
                   			"productos",
                    		lv_productos_8_0, 
                    		"Producto");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:599:2: (otherlv_9= ',' ( (lv_productos_10_0= ruleProducto ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:599:4: otherlv_9= ',' ( (lv_productos_10_0= ruleProducto ) )
            	    {
            	    otherlv_9=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCategoria1268); 

            	        	newLeafNode(otherlv_9, grammarAccess.getCategoriaAccess().getCommaKeyword_7_0());
            	        
            	    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:603:1: ( (lv_productos_10_0= ruleProducto ) )
            	    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:604:1: (lv_productos_10_0= ruleProducto )
            	    {
            	    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:604:1: (lv_productos_10_0= ruleProducto )
            	    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:605:3: lv_productos_10_0= ruleProducto
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCategoriaAccess().getProductosProductoParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleProducto_in_ruleCategoria1289);
            	    lv_productos_10_0=ruleProducto();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCategoriaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"productos",
            	            		lv_productos_10_0, 
            	            		"Producto");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCategoria1303); 

                	newLeafNode(otherlv_11, grammarAccess.getCategoriaAccess().getRightCurlyBracketKeyword_8());
                
            otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCategoria1315); 

                	newLeafNode(otherlv_12, grammarAccess.getCategoriaAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleCategoria"


    // $ANTLR start "entryRuleProducto"
    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:637:1: entryRuleProducto returns [EObject current=null] : iv_ruleProducto= ruleProducto EOF ;
    public final EObject entryRuleProducto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProducto = null;


        try {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:638:2: (iv_ruleProducto= ruleProducto EOF )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:639:2: iv_ruleProducto= ruleProducto EOF
            {
             newCompositeNode(grammarAccess.getProductoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProducto_in_entryRuleProducto1351);
            iv_ruleProducto=ruleProducto();

            state._fsp--;

             current =iv_ruleProducto; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProducto1361); 

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
    // $ANTLR end "entryRuleProducto"


    // $ANTLR start "ruleProducto"
    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:646:1: ruleProducto returns [EObject current=null] : (otherlv_0= 'Producto' otherlv_1= '{' (otherlv_2= 'idProducto' ( (lv_idProducto_3_0= ruleELong ) ) )? (otherlv_4= 'nombre' ( (lv_nombre_5_0= ruleEString ) ) )? otherlv_6= 'atributos' otherlv_7= '{' ( (lv_atributos_8_0= ruleAtributo ) ) (otherlv_9= ',' ( (lv_atributos_10_0= ruleAtributo ) ) )* otherlv_11= '}' otherlv_12= '}' ) ;
    public final EObject ruleProducto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_idProducto_3_0 = null;

        AntlrDatatypeRuleToken lv_nombre_5_0 = null;

        EObject lv_atributos_8_0 = null;

        EObject lv_atributos_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:649:28: ( (otherlv_0= 'Producto' otherlv_1= '{' (otherlv_2= 'idProducto' ( (lv_idProducto_3_0= ruleELong ) ) )? (otherlv_4= 'nombre' ( (lv_nombre_5_0= ruleEString ) ) )? otherlv_6= 'atributos' otherlv_7= '{' ( (lv_atributos_8_0= ruleAtributo ) ) (otherlv_9= ',' ( (lv_atributos_10_0= ruleAtributo ) ) )* otherlv_11= '}' otherlv_12= '}' ) )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:650:1: (otherlv_0= 'Producto' otherlv_1= '{' (otherlv_2= 'idProducto' ( (lv_idProducto_3_0= ruleELong ) ) )? (otherlv_4= 'nombre' ( (lv_nombre_5_0= ruleEString ) ) )? otherlv_6= 'atributos' otherlv_7= '{' ( (lv_atributos_8_0= ruleAtributo ) ) (otherlv_9= ',' ( (lv_atributos_10_0= ruleAtributo ) ) )* otherlv_11= '}' otherlv_12= '}' )
            {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:650:1: (otherlv_0= 'Producto' otherlv_1= '{' (otherlv_2= 'idProducto' ( (lv_idProducto_3_0= ruleELong ) ) )? (otherlv_4= 'nombre' ( (lv_nombre_5_0= ruleEString ) ) )? otherlv_6= 'atributos' otherlv_7= '{' ( (lv_atributos_8_0= ruleAtributo ) ) (otherlv_9= ',' ( (lv_atributos_10_0= ruleAtributo ) ) )* otherlv_11= '}' otherlv_12= '}' )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:650:3: otherlv_0= 'Producto' otherlv_1= '{' (otherlv_2= 'idProducto' ( (lv_idProducto_3_0= ruleELong ) ) )? (otherlv_4= 'nombre' ( (lv_nombre_5_0= ruleEString ) ) )? otherlv_6= 'atributos' otherlv_7= '{' ( (lv_atributos_8_0= ruleAtributo ) ) (otherlv_9= ',' ( (lv_atributos_10_0= ruleAtributo ) ) )* otherlv_11= '}' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleProducto1398); 

                	newLeafNode(otherlv_0, grammarAccess.getProductoAccess().getProductoKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleProducto1410); 

                	newLeafNode(otherlv_1, grammarAccess.getProductoAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:658:1: (otherlv_2= 'idProducto' ( (lv_idProducto_3_0= ruleELong ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:658:3: otherlv_2= 'idProducto' ( (lv_idProducto_3_0= ruleELong ) )
                    {
                    otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleProducto1423); 

                        	newLeafNode(otherlv_2, grammarAccess.getProductoAccess().getIdProductoKeyword_2_0());
                        
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:662:1: ( (lv_idProducto_3_0= ruleELong ) )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:663:1: (lv_idProducto_3_0= ruleELong )
                    {
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:663:1: (lv_idProducto_3_0= ruleELong )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:664:3: lv_idProducto_3_0= ruleELong
                    {
                     
                    	        newCompositeNode(grammarAccess.getProductoAccess().getIdProductoELongParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleELong_in_ruleProducto1444);
                    lv_idProducto_3_0=ruleELong();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProductoRule());
                    	        }
                           		set(
                           			current, 
                           			"idProducto",
                            		lv_idProducto_3_0, 
                            		"ELong");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:680:4: (otherlv_4= 'nombre' ( (lv_nombre_5_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:680:6: otherlv_4= 'nombre' ( (lv_nombre_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleProducto1459); 

                        	newLeafNode(otherlv_4, grammarAccess.getProductoAccess().getNombreKeyword_3_0());
                        
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:684:1: ( (lv_nombre_5_0= ruleEString ) )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:685:1: (lv_nombre_5_0= ruleEString )
                    {
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:685:1: (lv_nombre_5_0= ruleEString )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:686:3: lv_nombre_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getProductoAccess().getNombreEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProducto1480);
                    lv_nombre_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProductoRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre",
                            		lv_nombre_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleProducto1494); 

                	newLeafNode(otherlv_6, grammarAccess.getProductoAccess().getAtributosKeyword_4());
                
            otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleProducto1506); 

                	newLeafNode(otherlv_7, grammarAccess.getProductoAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:710:1: ( (lv_atributos_8_0= ruleAtributo ) )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:711:1: (lv_atributos_8_0= ruleAtributo )
            {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:711:1: (lv_atributos_8_0= ruleAtributo )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:712:3: lv_atributos_8_0= ruleAtributo
            {
             
            	        newCompositeNode(grammarAccess.getProductoAccess().getAtributosAtributoParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAtributo_in_ruleProducto1527);
            lv_atributos_8_0=ruleAtributo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProductoRule());
            	        }
                   		add(
                   			current, 
                   			"atributos",
                    		lv_atributos_8_0, 
                    		"Atributo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:728:2: (otherlv_9= ',' ( (lv_atributos_10_0= ruleAtributo ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:728:4: otherlv_9= ',' ( (lv_atributos_10_0= ruleAtributo ) )
            	    {
            	    otherlv_9=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleProducto1540); 

            	        	newLeafNode(otherlv_9, grammarAccess.getProductoAccess().getCommaKeyword_7_0());
            	        
            	    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:732:1: ( (lv_atributos_10_0= ruleAtributo ) )
            	    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:733:1: (lv_atributos_10_0= ruleAtributo )
            	    {
            	    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:733:1: (lv_atributos_10_0= ruleAtributo )
            	    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:734:3: lv_atributos_10_0= ruleAtributo
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProductoAccess().getAtributosAtributoParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAtributo_in_ruleProducto1561);
            	    lv_atributos_10_0=ruleAtributo();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProductoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"atributos",
            	            		lv_atributos_10_0, 
            	            		"Atributo");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProducto1575); 

                	newLeafNode(otherlv_11, grammarAccess.getProductoAccess().getRightCurlyBracketKeyword_8());
                
            otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProducto1587); 

                	newLeafNode(otherlv_12, grammarAccess.getProductoAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleProducto"


    // $ANTLR start "entryRuleAtributo"
    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:766:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:767:2: (iv_ruleAtributo= ruleAtributo EOF )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:768:2: iv_ruleAtributo= ruleAtributo EOF
            {
             newCompositeNode(grammarAccess.getAtributoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtributo_in_entryRuleAtributo1623);
            iv_ruleAtributo=ruleAtributo();

            state._fsp--;

             current =iv_ruleAtributo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtributo1633); 

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
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:775:1: ruleAtributo returns [EObject current=null] : ( () otherlv_1= 'Atributo' otherlv_2= '{' (otherlv_3= 'idAtributo' ( (lv_idAtributo_4_0= ruleELong ) ) )? (otherlv_5= 'nombreAtributo' ( (lv_nombreAtributo_6_0= ruleEString ) ) )? (otherlv_7= 'valorAtributo' ( (lv_valorAtributo_8_0= ruleEString ) ) )? (otherlv_9= 'tipoDato' ( (lv_tipoDato_10_0= ruleEString ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_idAtributo_4_0 = null;

        AntlrDatatypeRuleToken lv_nombreAtributo_6_0 = null;

        AntlrDatatypeRuleToken lv_valorAtributo_8_0 = null;

        AntlrDatatypeRuleToken lv_tipoDato_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:778:28: ( ( () otherlv_1= 'Atributo' otherlv_2= '{' (otherlv_3= 'idAtributo' ( (lv_idAtributo_4_0= ruleELong ) ) )? (otherlv_5= 'nombreAtributo' ( (lv_nombreAtributo_6_0= ruleEString ) ) )? (otherlv_7= 'valorAtributo' ( (lv_valorAtributo_8_0= ruleEString ) ) )? (otherlv_9= 'tipoDato' ( (lv_tipoDato_10_0= ruleEString ) ) )? otherlv_11= '}' ) )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:779:1: ( () otherlv_1= 'Atributo' otherlv_2= '{' (otherlv_3= 'idAtributo' ( (lv_idAtributo_4_0= ruleELong ) ) )? (otherlv_5= 'nombreAtributo' ( (lv_nombreAtributo_6_0= ruleEString ) ) )? (otherlv_7= 'valorAtributo' ( (lv_valorAtributo_8_0= ruleEString ) ) )? (otherlv_9= 'tipoDato' ( (lv_tipoDato_10_0= ruleEString ) ) )? otherlv_11= '}' )
            {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:779:1: ( () otherlv_1= 'Atributo' otherlv_2= '{' (otherlv_3= 'idAtributo' ( (lv_idAtributo_4_0= ruleELong ) ) )? (otherlv_5= 'nombreAtributo' ( (lv_nombreAtributo_6_0= ruleEString ) ) )? (otherlv_7= 'valorAtributo' ( (lv_valorAtributo_8_0= ruleEString ) ) )? (otherlv_9= 'tipoDato' ( (lv_tipoDato_10_0= ruleEString ) ) )? otherlv_11= '}' )
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:779:2: () otherlv_1= 'Atributo' otherlv_2= '{' (otherlv_3= 'idAtributo' ( (lv_idAtributo_4_0= ruleELong ) ) )? (otherlv_5= 'nombreAtributo' ( (lv_nombreAtributo_6_0= ruleEString ) ) )? (otherlv_7= 'valorAtributo' ( (lv_valorAtributo_8_0= ruleEString ) ) )? (otherlv_9= 'tipoDato' ( (lv_tipoDato_10_0= ruleEString ) ) )? otherlv_11= '}'
            {
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:779:2: ()
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:780:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtributoAccess().getAtributoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAtributo1679); 

                	newLeafNode(otherlv_1, grammarAccess.getAtributoAccess().getAtributoKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAtributo1691); 

                	newLeafNode(otherlv_2, grammarAccess.getAtributoAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:793:1: (otherlv_3= 'idAtributo' ( (lv_idAtributo_4_0= ruleELong ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:793:3: otherlv_3= 'idAtributo' ( (lv_idAtributo_4_0= ruleELong ) )
                    {
                    otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleAtributo1704); 

                        	newLeafNode(otherlv_3, grammarAccess.getAtributoAccess().getIdAtributoKeyword_3_0());
                        
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:797:1: ( (lv_idAtributo_4_0= ruleELong ) )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:798:1: (lv_idAtributo_4_0= ruleELong )
                    {
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:798:1: (lv_idAtributo_4_0= ruleELong )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:799:3: lv_idAtributo_4_0= ruleELong
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtributoAccess().getIdAtributoELongParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleELong_in_ruleAtributo1725);
                    lv_idAtributo_4_0=ruleELong();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtributoRule());
                    	        }
                           		set(
                           			current, 
                           			"idAtributo",
                            		lv_idAtributo_4_0, 
                            		"ELong");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:815:4: (otherlv_5= 'nombreAtributo' ( (lv_nombreAtributo_6_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:815:6: otherlv_5= 'nombreAtributo' ( (lv_nombreAtributo_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleAtributo1740); 

                        	newLeafNode(otherlv_5, grammarAccess.getAtributoAccess().getNombreAtributoKeyword_4_0());
                        
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:819:1: ( (lv_nombreAtributo_6_0= ruleEString ) )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:820:1: (lv_nombreAtributo_6_0= ruleEString )
                    {
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:820:1: (lv_nombreAtributo_6_0= ruleEString )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:821:3: lv_nombreAtributo_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtributoAccess().getNombreAtributoEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAtributo1761);
                    lv_nombreAtributo_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtributoRule());
                    	        }
                           		set(
                           			current, 
                           			"nombreAtributo",
                            		lv_nombreAtributo_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:837:4: (otherlv_7= 'valorAtributo' ( (lv_valorAtributo_8_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:837:6: otherlv_7= 'valorAtributo' ( (lv_valorAtributo_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAtributo1776); 

                        	newLeafNode(otherlv_7, grammarAccess.getAtributoAccess().getValorAtributoKeyword_5_0());
                        
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:841:1: ( (lv_valorAtributo_8_0= ruleEString ) )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:842:1: (lv_valorAtributo_8_0= ruleEString )
                    {
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:842:1: (lv_valorAtributo_8_0= ruleEString )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:843:3: lv_valorAtributo_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtributoAccess().getValorAtributoEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAtributo1797);
                    lv_valorAtributo_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtributoRule());
                    	        }
                           		set(
                           			current, 
                           			"valorAtributo",
                            		lv_valorAtributo_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:859:4: (otherlv_9= 'tipoDato' ( (lv_tipoDato_10_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:859:6: otherlv_9= 'tipoDato' ( (lv_tipoDato_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleAtributo1812); 

                        	newLeafNode(otherlv_9, grammarAccess.getAtributoAccess().getTipoDatoKeyword_6_0());
                        
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:863:1: ( (lv_tipoDato_10_0= ruleEString ) )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:864:1: (lv_tipoDato_10_0= ruleEString )
                    {
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:864:1: (lv_tipoDato_10_0= ruleEString )
                    // ../org.xtext.catalogo/src-gen/org/xtext/parser/antlr/internal/InternalCatalogo.g:865:3: lv_tipoDato_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtributoAccess().getTipoDatoEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAtributo1833);
                    lv_tipoDato_10_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtributoRule());
                    	        }
                           		set(
                           			current, 
                           			"tipoDato",
                            		lv_tipoDato_10_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAtributo1847); 

                	newLeafNode(otherlv_11, grammarAccess.getAtributoAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleAtributo"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRootSistema_in_entryRuleRootSistema75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRootSistema85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleRootSistema122 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRootSistema134 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRootSistema146 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleEmpresa_in_ruleRootSistema167 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRootSistema179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmpresa_in_entryRuleEmpresa215 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmpresa225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleEmpresa262 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEmpresa274 = new BitSet(new long[]{0x00000000007F0000L});
        public static final BitSet FOLLOW_16_in_ruleEmpresa287 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEmpresa308 = new BitSet(new long[]{0x00000000007E0000L});
        public static final BitSet FOLLOW_17_in_ruleEmpresa323 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEmpresa344 = new BitSet(new long[]{0x00000000007C0000L});
        public static final BitSet FOLLOW_18_in_ruleEmpresa359 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEmpresa380 = new BitSet(new long[]{0x0000000000780000L});
        public static final BitSet FOLLOW_19_in_ruleEmpresa395 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEmpresa416 = new BitSet(new long[]{0x0000000000700000L});
        public static final BitSet FOLLOW_20_in_ruleEmpresa431 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEmpresa452 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_21_in_ruleEmpresa467 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEmpresa488 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleEmpresa502 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleCatalogo_in_ruleEmpresa523 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleEmpresa535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString572 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCatalogo_in_entryRuleCatalogo694 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCatalogo704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleCatalogo741 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCatalogo753 = new BitSet(new long[]{0x0000000003010000L});
        public static final BitSet FOLLOW_24_in_ruleCatalogo766 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleELong_in_ruleCatalogo787 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_16_in_ruleCatalogo802 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCatalogo823 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleCatalogo837 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCatalogo849 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleCategoria_in_ruleCatalogo870 = new BitSet(new long[]{0x0000000004004000L});
        public static final BitSet FOLLOW_26_in_ruleCatalogo883 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleCategoria_in_ruleCatalogo904 = new BitSet(new long[]{0x0000000004004000L});
        public static final BitSet FOLLOW_14_in_ruleCatalogo918 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleCatalogo930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleELong_in_entryRuleELong967 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleELong978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleELong1017 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleELong1034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCategoria_in_entryRuleCategoria1079 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCategoria1089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleCategoria1126 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCategoria1138 = new BitSet(new long[]{0x0000000060010000L});
        public static final BitSet FOLLOW_29_in_ruleCategoria1151 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleELong_in_ruleCategoria1172 = new BitSet(new long[]{0x0000000040010000L});
        public static final BitSet FOLLOW_16_in_ruleCategoria1187 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCategoria1208 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleCategoria1222 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCategoria1234 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleProducto_in_ruleCategoria1255 = new BitSet(new long[]{0x0000000004004000L});
        public static final BitSet FOLLOW_26_in_ruleCategoria1268 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleProducto_in_ruleCategoria1289 = new BitSet(new long[]{0x0000000004004000L});
        public static final BitSet FOLLOW_14_in_ruleCategoria1303 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleCategoria1315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProducto_in_entryRuleProducto1351 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProducto1361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleProducto1398 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleProducto1410 = new BitSet(new long[]{0x0000000300010000L});
        public static final BitSet FOLLOW_32_in_ruleProducto1423 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleELong_in_ruleProducto1444 = new BitSet(new long[]{0x0000000200010000L});
        public static final BitSet FOLLOW_16_in_ruleProducto1459 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProducto1480 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleProducto1494 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleProducto1506 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleAtributo_in_ruleProducto1527 = new BitSet(new long[]{0x0000000004004000L});
        public static final BitSet FOLLOW_26_in_ruleProducto1540 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleAtributo_in_ruleProducto1561 = new BitSet(new long[]{0x0000000004004000L});
        public static final BitSet FOLLOW_14_in_ruleProducto1575 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleProducto1587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtributo_in_entryRuleAtributo1623 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtributo1633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleAtributo1679 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAtributo1691 = new BitSet(new long[]{0x0000007800004000L});
        public static final BitSet FOLLOW_35_in_ruleAtributo1704 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleELong_in_ruleAtributo1725 = new BitSet(new long[]{0x0000007000004000L});
        public static final BitSet FOLLOW_36_in_ruleAtributo1740 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAtributo1761 = new BitSet(new long[]{0x0000006000004000L});
        public static final BitSet FOLLOW_37_in_ruleAtributo1776 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAtributo1797 = new BitSet(new long[]{0x0000004000004000L});
        public static final BitSet FOLLOW_38_in_ruleAtributo1812 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAtributo1833 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAtributo1847 = new BitSet(new long[]{0x0000000000000002L});
    }


}