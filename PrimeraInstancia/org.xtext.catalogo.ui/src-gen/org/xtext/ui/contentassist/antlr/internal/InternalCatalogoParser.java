package org.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.services.CatalogoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCatalogoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RootSistema'", "'{'", "'empresa'", "'}'", "'Empresa'", "'catalogo'", "'nombre'", "'direccion'", "'email'", "'telefono'", "'descripcion'", "'urlImagen'", "'Catalogo'", "'categorias'", "'idCatalogo'", "','", "'-'", "'Categoria'", "'productos'", "'idCategoria'", "'Producto'", "'atributos'", "'idProducto'", "'Atributo'", "'idAtributo'", "'nombreAtributo'", "'valorAtributo'", "'tipoDato'"
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
    public String getGrammarFileName() { return "../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g"; }


     
     	private CatalogoGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CatalogoGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleRootSistema"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:60:1: entryRuleRootSistema : ruleRootSistema EOF ;
    public final void entryRuleRootSistema() throws RecognitionException {
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:61:1: ( ruleRootSistema EOF )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:62:1: ruleRootSistema EOF
            {
             before(grammarAccess.getRootSistemaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRootSistema_in_entryRuleRootSistema61);
            ruleRootSistema();

            state._fsp--;

             after(grammarAccess.getRootSistemaRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRootSistema68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRootSistema"


    // $ANTLR start "ruleRootSistema"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:69:1: ruleRootSistema : ( ( rule__RootSistema__Group__0 ) ) ;
    public final void ruleRootSistema() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:73:2: ( ( ( rule__RootSistema__Group__0 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:74:1: ( ( rule__RootSistema__Group__0 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:74:1: ( ( rule__RootSistema__Group__0 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:75:1: ( rule__RootSistema__Group__0 )
            {
             before(grammarAccess.getRootSistemaAccess().getGroup()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:76:1: ( rule__RootSistema__Group__0 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:76:2: rule__RootSistema__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group__0_in_ruleRootSistema94);
            rule__RootSistema__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootSistemaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRootSistema"


    // $ANTLR start "entryRuleEmpresa"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:88:1: entryRuleEmpresa : ruleEmpresa EOF ;
    public final void entryRuleEmpresa() throws RecognitionException {
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:89:1: ( ruleEmpresa EOF )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:90:1: ruleEmpresa EOF
            {
             before(grammarAccess.getEmpresaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEmpresa_in_entryRuleEmpresa121);
            ruleEmpresa();

            state._fsp--;

             after(grammarAccess.getEmpresaRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmpresa128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEmpresa"


    // $ANTLR start "ruleEmpresa"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:97:1: ruleEmpresa : ( ( rule__Empresa__Group__0 ) ) ;
    public final void ruleEmpresa() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:101:2: ( ( ( rule__Empresa__Group__0 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:102:1: ( ( rule__Empresa__Group__0 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:102:1: ( ( rule__Empresa__Group__0 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:103:1: ( rule__Empresa__Group__0 )
            {
             before(grammarAccess.getEmpresaAccess().getGroup()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:104:1: ( rule__Empresa__Group__0 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:104:2: rule__Empresa__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group__0_in_ruleEmpresa154);
            rule__Empresa__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmpresaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmpresa"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:116:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:117:1: ( ruleEString EOF )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:118:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString181);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:125:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:129:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:130:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:130:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:131:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:132:1: ( rule__EString__Alternatives )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:132:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString214);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleCatalogo"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:144:1: entryRuleCatalogo : ruleCatalogo EOF ;
    public final void entryRuleCatalogo() throws RecognitionException {
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:145:1: ( ruleCatalogo EOF )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:146:1: ruleCatalogo EOF
            {
             before(grammarAccess.getCatalogoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCatalogo_in_entryRuleCatalogo241);
            ruleCatalogo();

            state._fsp--;

             after(grammarAccess.getCatalogoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCatalogo248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCatalogo"


    // $ANTLR start "ruleCatalogo"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:153:1: ruleCatalogo : ( ( rule__Catalogo__Group__0 ) ) ;
    public final void ruleCatalogo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:157:2: ( ( ( rule__Catalogo__Group__0 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:158:1: ( ( rule__Catalogo__Group__0 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:158:1: ( ( rule__Catalogo__Group__0 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:159:1: ( rule__Catalogo__Group__0 )
            {
             before(grammarAccess.getCatalogoAccess().getGroup()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:160:1: ( rule__Catalogo__Group__0 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:160:2: rule__Catalogo__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__0_in_ruleCatalogo274);
            rule__Catalogo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCatalogoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCatalogo"


    // $ANTLR start "entryRuleELong"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:172:1: entryRuleELong : ruleELong EOF ;
    public final void entryRuleELong() throws RecognitionException {
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:173:1: ( ruleELong EOF )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:174:1: ruleELong EOF
            {
             before(grammarAccess.getELongRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleELong_in_entryRuleELong301);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getELongRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleELong308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleELong"


    // $ANTLR start "ruleELong"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:181:1: ruleELong : ( ( rule__ELong__Group__0 ) ) ;
    public final void ruleELong() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:185:2: ( ( ( rule__ELong__Group__0 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:186:1: ( ( rule__ELong__Group__0 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:186:1: ( ( rule__ELong__Group__0 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:187:1: ( rule__ELong__Group__0 )
            {
             before(grammarAccess.getELongAccess().getGroup()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:188:1: ( rule__ELong__Group__0 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:188:2: rule__ELong__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ELong__Group__0_in_ruleELong334);
            rule__ELong__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getELongAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleELong"


    // $ANTLR start "entryRuleCategoria"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:200:1: entryRuleCategoria : ruleCategoria EOF ;
    public final void entryRuleCategoria() throws RecognitionException {
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:201:1: ( ruleCategoria EOF )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:202:1: ruleCategoria EOF
            {
             before(grammarAccess.getCategoriaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCategoria_in_entryRuleCategoria361);
            ruleCategoria();

            state._fsp--;

             after(grammarAccess.getCategoriaRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCategoria368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCategoria"


    // $ANTLR start "ruleCategoria"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:209:1: ruleCategoria : ( ( rule__Categoria__Group__0 ) ) ;
    public final void ruleCategoria() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:213:2: ( ( ( rule__Categoria__Group__0 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:214:1: ( ( rule__Categoria__Group__0 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:214:1: ( ( rule__Categoria__Group__0 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:215:1: ( rule__Categoria__Group__0 )
            {
             before(grammarAccess.getCategoriaAccess().getGroup()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:216:1: ( rule__Categoria__Group__0 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:216:2: rule__Categoria__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group__0_in_ruleCategoria394);
            rule__Categoria__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCategoriaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCategoria"


    // $ANTLR start "entryRuleProducto"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:228:1: entryRuleProducto : ruleProducto EOF ;
    public final void entryRuleProducto() throws RecognitionException {
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:229:1: ( ruleProducto EOF )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:230:1: ruleProducto EOF
            {
             before(grammarAccess.getProductoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProducto_in_entryRuleProducto421);
            ruleProducto();

            state._fsp--;

             after(grammarAccess.getProductoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProducto428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProducto"


    // $ANTLR start "ruleProducto"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:237:1: ruleProducto : ( ( rule__Producto__Group__0 ) ) ;
    public final void ruleProducto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:241:2: ( ( ( rule__Producto__Group__0 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:242:1: ( ( rule__Producto__Group__0 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:242:1: ( ( rule__Producto__Group__0 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:243:1: ( rule__Producto__Group__0 )
            {
             before(grammarAccess.getProductoAccess().getGroup()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:244:1: ( rule__Producto__Group__0 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:244:2: rule__Producto__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group__0_in_ruleProducto454);
            rule__Producto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProductoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProducto"


    // $ANTLR start "entryRuleAtributo"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:256:1: entryRuleAtributo : ruleAtributo EOF ;
    public final void entryRuleAtributo() throws RecognitionException {
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:257:1: ( ruleAtributo EOF )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:258:1: ruleAtributo EOF
            {
             before(grammarAccess.getAtributoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtributo_in_entryRuleAtributo481);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtributo488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:265:1: ruleAtributo : ( ( rule__Atributo__Group__0 ) ) ;
    public final void ruleAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:269:2: ( ( ( rule__Atributo__Group__0 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:270:1: ( ( rule__Atributo__Group__0 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:270:1: ( ( rule__Atributo__Group__0 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:271:1: ( rule__Atributo__Group__0 )
            {
             before(grammarAccess.getAtributoAccess().getGroup()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:272:1: ( rule__Atributo__Group__0 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:272:2: rule__Atributo__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group__0_in_ruleAtributo514);
            rule__Atributo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:284:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:288:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:289:1: ( RULE_STRING )
                    {
                    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:289:1: ( RULE_STRING )
                    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:290:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives550); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:295:6: ( RULE_ID )
                    {
                    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:295:6: ( RULE_ID )
                    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:296:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives567); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__RootSistema__Group__0"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:308:1: rule__RootSistema__Group__0 : rule__RootSistema__Group__0__Impl rule__RootSistema__Group__1 ;
    public final void rule__RootSistema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:312:1: ( rule__RootSistema__Group__0__Impl rule__RootSistema__Group__1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:313:2: rule__RootSistema__Group__0__Impl rule__RootSistema__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group__0__Impl_in_rule__RootSistema__Group__0597);
            rule__RootSistema__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group__1_in_rule__RootSistema__Group__0600);
            rule__RootSistema__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootSistema__Group__0"


    // $ANTLR start "rule__RootSistema__Group__0__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:320:1: rule__RootSistema__Group__0__Impl : ( 'RootSistema' ) ;
    public final void rule__RootSistema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:324:1: ( ( 'RootSistema' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:325:1: ( 'RootSistema' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:325:1: ( 'RootSistema' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:326:1: 'RootSistema'
            {
             before(grammarAccess.getRootSistemaAccess().getRootSistemaKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__RootSistema__Group__0__Impl628); 
             after(grammarAccess.getRootSistemaAccess().getRootSistemaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootSistema__Group__0__Impl"


    // $ANTLR start "rule__RootSistema__Group__1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:339:1: rule__RootSistema__Group__1 : rule__RootSistema__Group__1__Impl rule__RootSistema__Group__2 ;
    public final void rule__RootSistema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:343:1: ( rule__RootSistema__Group__1__Impl rule__RootSistema__Group__2 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:344:2: rule__RootSistema__Group__1__Impl rule__RootSistema__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group__1__Impl_in_rule__RootSistema__Group__1659);
            rule__RootSistema__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group__2_in_rule__RootSistema__Group__1662);
            rule__RootSistema__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootSistema__Group__1"


    // $ANTLR start "rule__RootSistema__Group__1__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:351:1: rule__RootSistema__Group__1__Impl : ( '{' ) ;
    public final void rule__RootSistema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:355:1: ( ( '{' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:356:1: ( '{' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:356:1: ( '{' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:357:1: '{'
            {
             before(grammarAccess.getRootSistemaAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__RootSistema__Group__1__Impl690); 
             after(grammarAccess.getRootSistemaAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootSistema__Group__1__Impl"


    // $ANTLR start "rule__RootSistema__Group__2"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:370:1: rule__RootSistema__Group__2 : rule__RootSistema__Group__2__Impl rule__RootSistema__Group__3 ;
    public final void rule__RootSistema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:374:1: ( rule__RootSistema__Group__2__Impl rule__RootSistema__Group__3 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:375:2: rule__RootSistema__Group__2__Impl rule__RootSistema__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group__2__Impl_in_rule__RootSistema__Group__2721);
            rule__RootSistema__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group__3_in_rule__RootSistema__Group__2724);
            rule__RootSistema__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootSistema__Group__2"


    // $ANTLR start "rule__RootSistema__Group__2__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:382:1: rule__RootSistema__Group__2__Impl : ( 'empresa' ) ;
    public final void rule__RootSistema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:386:1: ( ( 'empresa' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:387:1: ( 'empresa' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:387:1: ( 'empresa' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:388:1: 'empresa'
            {
             before(grammarAccess.getRootSistemaAccess().getEmpresaKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__RootSistema__Group__2__Impl752); 
             after(grammarAccess.getRootSistemaAccess().getEmpresaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootSistema__Group__2__Impl"


    // $ANTLR start "rule__RootSistema__Group__3"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:401:1: rule__RootSistema__Group__3 : rule__RootSistema__Group__3__Impl rule__RootSistema__Group__4 ;
    public final void rule__RootSistema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:405:1: ( rule__RootSistema__Group__3__Impl rule__RootSistema__Group__4 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:406:2: rule__RootSistema__Group__3__Impl rule__RootSistema__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group__3__Impl_in_rule__RootSistema__Group__3783);
            rule__RootSistema__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group__4_in_rule__RootSistema__Group__3786);
            rule__RootSistema__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootSistema__Group__3"


    // $ANTLR start "rule__RootSistema__Group__3__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:413:1: rule__RootSistema__Group__3__Impl : ( ( rule__RootSistema__EmpresaAssignment_3 ) ) ;
    public final void rule__RootSistema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:417:1: ( ( ( rule__RootSistema__EmpresaAssignment_3 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:418:1: ( ( rule__RootSistema__EmpresaAssignment_3 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:418:1: ( ( rule__RootSistema__EmpresaAssignment_3 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:419:1: ( rule__RootSistema__EmpresaAssignment_3 )
            {
             before(grammarAccess.getRootSistemaAccess().getEmpresaAssignment_3()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:420:1: ( rule__RootSistema__EmpresaAssignment_3 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:420:2: rule__RootSistema__EmpresaAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__EmpresaAssignment_3_in_rule__RootSistema__Group__3__Impl813);
            rule__RootSistema__EmpresaAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRootSistemaAccess().getEmpresaAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootSistema__Group__3__Impl"


    // $ANTLR start "rule__RootSistema__Group__4"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:430:1: rule__RootSistema__Group__4 : rule__RootSistema__Group__4__Impl ;
    public final void rule__RootSistema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:434:1: ( rule__RootSistema__Group__4__Impl )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:435:2: rule__RootSistema__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group__4__Impl_in_rule__RootSistema__Group__4843);
            rule__RootSistema__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootSistema__Group__4"


    // $ANTLR start "rule__RootSistema__Group__4__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:441:1: rule__RootSistema__Group__4__Impl : ( '}' ) ;
    public final void rule__RootSistema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:445:1: ( ( '}' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:446:1: ( '}' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:446:1: ( '}' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:447:1: '}'
            {
             before(grammarAccess.getRootSistemaAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RootSistema__Group__4__Impl871); 
             after(grammarAccess.getRootSistemaAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootSistema__Group__4__Impl"


    // $ANTLR start "rule__Empresa__Group__0"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:470:1: rule__Empresa__Group__0 : rule__Empresa__Group__0__Impl rule__Empresa__Group__1 ;
    public final void rule__Empresa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:474:1: ( rule__Empresa__Group__0__Impl rule__Empresa__Group__1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:475:2: rule__Empresa__Group__0__Impl rule__Empresa__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group__0__Impl_in_rule__Empresa__Group__0912);
            rule__Empresa__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group__1_in_rule__Empresa__Group__0915);
            rule__Empresa__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group__0"


    // $ANTLR start "rule__Empresa__Group__0__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:482:1: rule__Empresa__Group__0__Impl : ( 'Empresa' ) ;
    public final void rule__Empresa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:486:1: ( ( 'Empresa' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:487:1: ( 'Empresa' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:487:1: ( 'Empresa' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:488:1: 'Empresa'
            {
             before(grammarAccess.getEmpresaAccess().getEmpresaKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Empresa__Group__0__Impl943); 
             after(grammarAccess.getEmpresaAccess().getEmpresaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group__0__Impl"


    // $ANTLR start "rule__Empresa__Group__1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:501:1: rule__Empresa__Group__1 : rule__Empresa__Group__1__Impl rule__Empresa__Group__2 ;
    public final void rule__Empresa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:505:1: ( rule__Empresa__Group__1__Impl rule__Empresa__Group__2 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:506:2: rule__Empresa__Group__1__Impl rule__Empresa__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group__1__Impl_in_rule__Empresa__Group__1974);
            rule__Empresa__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group__2_in_rule__Empresa__Group__1977);
            rule__Empresa__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group__1"


    // $ANTLR start "rule__Empresa__Group__1__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:513:1: rule__Empresa__Group__1__Impl : ( '{' ) ;
    public final void rule__Empresa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:517:1: ( ( '{' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:518:1: ( '{' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:518:1: ( '{' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:519:1: '{'
            {
             before(grammarAccess.getEmpresaAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Empresa__Group__1__Impl1005); 
             after(grammarAccess.getEmpresaAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group__1__Impl"


    // $ANTLR start "rule__Empresa__Group__2"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:532:1: rule__Empresa__Group__2 : rule__Empresa__Group__2__Impl rule__Empresa__Group__3 ;
    public final void rule__Empresa__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:536:1: ( rule__Empresa__Group__2__Impl rule__Empresa__Group__3 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:537:2: rule__Empresa__Group__2__Impl rule__Empresa__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group__2__Impl_in_rule__Empresa__Group__21036);
            rule__Empresa__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group__3_in_rule__Empresa__Group__21039);
            rule__Empresa__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group__2"


    // $ANTLR start "rule__Empresa__Group__2__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:544:1: rule__Empresa__Group__2__Impl : ( ( rule__Empresa__Group_2__0 )? ) ;
    public final void rule__Empresa__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:548:1: ( ( ( rule__Empresa__Group_2__0 )? ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:549:1: ( ( rule__Empresa__Group_2__0 )? )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:549:1: ( ( rule__Empresa__Group_2__0 )? )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:550:1: ( rule__Empresa__Group_2__0 )?
            {
             before(grammarAccess.getEmpresaAccess().getGroup_2()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:551:1: ( rule__Empresa__Group_2__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:551:2: rule__Empresa__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group_2__0_in_rule__Empresa__Group__2__Impl1066);
                    rule__Empresa__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEmpresaAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group__2__Impl"


    // $ANTLR start "rule__Empresa__Group__3"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:561:1: rule__Empresa__Group__3 : rule__Empresa__Group__3__Impl rule__Empresa__Group__4 ;
    public final void rule__Empresa__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:565:1: ( rule__Empresa__Group__3__Impl rule__Empresa__Group__4 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:566:2: rule__Empresa__Group__3__Impl rule__Empresa__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group__3__Impl_in_rule__Empresa__Group__31097);
            rule__Empresa__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group__4_in_rule__Empresa__Group__31100);
            rule__Empresa__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group__3"


    // $ANTLR start "rule__Empresa__Group__3__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:573:1: rule__Empresa__Group__3__Impl : ( ( rule__Empresa__Group_3__0 )? ) ;
    public final void rule__Empresa__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:577:1: ( ( ( rule__Empresa__Group_3__0 )? ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:578:1: ( ( rule__Empresa__Group_3__0 )? )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:578:1: ( ( rule__Empresa__Group_3__0 )? )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:579:1: ( rule__Empresa__Group_3__0 )?
            {
             before(grammarAccess.getEmpresaAccess().getGroup_3()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:580:1: ( rule__Empresa__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:580:2: rule__Empresa__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group_3__0_in_rule__Empresa__Group__3__Impl1127);
                    rule__Empresa__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEmpresaAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group__3__Impl"


    // $ANTLR start "rule__Empresa__Group__4"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:590:1: rule__Empresa__Group__4 : rule__Empresa__Group__4__Impl rule__Empresa__Group__5 ;
    public final void rule__Empresa__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:594:1: ( rule__Empresa__Group__4__Impl rule__Empresa__Group__5 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:595:2: rule__Empresa__Group__4__Impl rule__Empresa__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group__4__Impl_in_rule__Empresa__Group__41158);
            rule__Empresa__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group__5_in_rule__Empresa__Group__41161);
            rule__Empresa__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group__4"


    // $ANTLR start "rule__Empresa__Group__4__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:602:1: rule__Empresa__Group__4__Impl : ( ( rule__Empresa__Group_4__0 )? ) ;
    public final void rule__Empresa__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:606:1: ( ( ( rule__Empresa__Group_4__0 )? ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:607:1: ( ( rule__Empresa__Group_4__0 )? )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:607:1: ( ( rule__Empresa__Group_4__0 )? )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:608:1: ( rule__Empresa__Group_4__0 )?
            {
             before(grammarAccess.getEmpresaAccess().getGroup_4()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:609:1: ( rule__Empresa__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:609:2: rule__Empresa__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group_4__0_in_rule__Empresa__Group__4__Impl1188);
                    rule__Empresa__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEmpresaAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group__4__Impl"


    // $ANTLR start "rule__Empresa__Group__5"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:619:1: rule__Empresa__Group__5 : rule__Empresa__Group__5__Impl rule__Empresa__Group__6 ;
    public final void rule__Empresa__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:623:1: ( rule__Empresa__Group__5__Impl rule__Empresa__Group__6 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:624:2: rule__Empresa__Group__5__Impl rule__Empresa__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group__5__Impl_in_rule__Empresa__Group__51219);
            rule__Empresa__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group__6_in_rule__Empresa__Group__51222);
            rule__Empresa__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group__5"


    // $ANTLR start "rule__Empresa__Group__5__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:631:1: rule__Empresa__Group__5__Impl : ( ( rule__Empresa__Group_5__0 )? ) ;
    public final void rule__Empresa__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:635:1: ( ( ( rule__Empresa__Group_5__0 )? ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:636:1: ( ( rule__Empresa__Group_5__0 )? )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:636:1: ( ( rule__Empresa__Group_5__0 )? )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:637:1: ( rule__Empresa__Group_5__0 )?
            {
             before(grammarAccess.getEmpresaAccess().getGroup_5()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:638:1: ( rule__Empresa__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:638:2: rule__Empresa__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group_5__0_in_rule__Empresa__Group__5__Impl1249);
                    rule__Empresa__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEmpresaAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group__5__Impl"


    // $ANTLR start "rule__Empresa__Group__6"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:648:1: rule__Empresa__Group__6 : rule__Empresa__Group__6__Impl rule__Empresa__Group__7 ;
    public final void rule__Empresa__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:652:1: ( rule__Empresa__Group__6__Impl rule__Empresa__Group__7 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:653:2: rule__Empresa__Group__6__Impl rule__Empresa__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group__6__Impl_in_rule__Empresa__Group__61280);
            rule__Empresa__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group__7_in_rule__Empresa__Group__61283);
            rule__Empresa__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group__6"


    // $ANTLR start "rule__Empresa__Group__6__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:660:1: rule__Empresa__Group__6__Impl : ( ( rule__Empresa__Group_6__0 )? ) ;
    public final void rule__Empresa__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:664:1: ( ( ( rule__Empresa__Group_6__0 )? ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:665:1: ( ( rule__Empresa__Group_6__0 )? )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:665:1: ( ( rule__Empresa__Group_6__0 )? )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:666:1: ( rule__Empresa__Group_6__0 )?
            {
             before(grammarAccess.getEmpresaAccess().getGroup_6()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:667:1: ( rule__Empresa__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:667:2: rule__Empresa__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group_6__0_in_rule__Empresa__Group__6__Impl1310);
                    rule__Empresa__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEmpresaAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group__6__Impl"


    // $ANTLR start "rule__Empresa__Group__7"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:677:1: rule__Empresa__Group__7 : rule__Empresa__Group__7__Impl rule__Empresa__Group__8 ;
    public final void rule__Empresa__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:681:1: ( rule__Empresa__Group__7__Impl rule__Empresa__Group__8 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:682:2: rule__Empresa__Group__7__Impl rule__Empresa__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group__7__Impl_in_rule__Empresa__Group__71341);
            rule__Empresa__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group__8_in_rule__Empresa__Group__71344);
            rule__Empresa__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group__7"


    // $ANTLR start "rule__Empresa__Group__7__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:689:1: rule__Empresa__Group__7__Impl : ( ( rule__Empresa__Group_7__0 )? ) ;
    public final void rule__Empresa__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:693:1: ( ( ( rule__Empresa__Group_7__0 )? ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:694:1: ( ( rule__Empresa__Group_7__0 )? )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:694:1: ( ( rule__Empresa__Group_7__0 )? )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:695:1: ( rule__Empresa__Group_7__0 )?
            {
             before(grammarAccess.getEmpresaAccess().getGroup_7()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:696:1: ( rule__Empresa__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:696:2: rule__Empresa__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group_7__0_in_rule__Empresa__Group__7__Impl1371);
                    rule__Empresa__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEmpresaAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group__7__Impl"


    // $ANTLR start "rule__Empresa__Group__8"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:706:1: rule__Empresa__Group__8 : rule__Empresa__Group__8__Impl rule__Empresa__Group__9 ;
    public final void rule__Empresa__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:710:1: ( rule__Empresa__Group__8__Impl rule__Empresa__Group__9 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:711:2: rule__Empresa__Group__8__Impl rule__Empresa__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group__8__Impl_in_rule__Empresa__Group__81402);
            rule__Empresa__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group__9_in_rule__Empresa__Group__81405);
            rule__Empresa__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group__8"


    // $ANTLR start "rule__Empresa__Group__8__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:718:1: rule__Empresa__Group__8__Impl : ( 'catalogo' ) ;
    public final void rule__Empresa__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:722:1: ( ( 'catalogo' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:723:1: ( 'catalogo' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:723:1: ( 'catalogo' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:724:1: 'catalogo'
            {
             before(grammarAccess.getEmpresaAccess().getCatalogoKeyword_8()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Empresa__Group__8__Impl1433); 
             after(grammarAccess.getEmpresaAccess().getCatalogoKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group__8__Impl"


    // $ANTLR start "rule__Empresa__Group__9"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:737:1: rule__Empresa__Group__9 : rule__Empresa__Group__9__Impl rule__Empresa__Group__10 ;
    public final void rule__Empresa__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:741:1: ( rule__Empresa__Group__9__Impl rule__Empresa__Group__10 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:742:2: rule__Empresa__Group__9__Impl rule__Empresa__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group__9__Impl_in_rule__Empresa__Group__91464);
            rule__Empresa__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group__10_in_rule__Empresa__Group__91467);
            rule__Empresa__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group__9"


    // $ANTLR start "rule__Empresa__Group__9__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:749:1: rule__Empresa__Group__9__Impl : ( ( rule__Empresa__CatalogoAssignment_9 ) ) ;
    public final void rule__Empresa__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:753:1: ( ( ( rule__Empresa__CatalogoAssignment_9 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:754:1: ( ( rule__Empresa__CatalogoAssignment_9 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:754:1: ( ( rule__Empresa__CatalogoAssignment_9 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:755:1: ( rule__Empresa__CatalogoAssignment_9 )
            {
             before(grammarAccess.getEmpresaAccess().getCatalogoAssignment_9()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:756:1: ( rule__Empresa__CatalogoAssignment_9 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:756:2: rule__Empresa__CatalogoAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__CatalogoAssignment_9_in_rule__Empresa__Group__9__Impl1494);
            rule__Empresa__CatalogoAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getEmpresaAccess().getCatalogoAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group__9__Impl"


    // $ANTLR start "rule__Empresa__Group__10"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:766:1: rule__Empresa__Group__10 : rule__Empresa__Group__10__Impl ;
    public final void rule__Empresa__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:770:1: ( rule__Empresa__Group__10__Impl )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:771:2: rule__Empresa__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group__10__Impl_in_rule__Empresa__Group__101524);
            rule__Empresa__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group__10"


    // $ANTLR start "rule__Empresa__Group__10__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:777:1: rule__Empresa__Group__10__Impl : ( '}' ) ;
    public final void rule__Empresa__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:781:1: ( ( '}' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:782:1: ( '}' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:782:1: ( '}' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:783:1: '}'
            {
             before(grammarAccess.getEmpresaAccess().getRightCurlyBracketKeyword_10()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Empresa__Group__10__Impl1552); 
             after(grammarAccess.getEmpresaAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group__10__Impl"


    // $ANTLR start "rule__Empresa__Group_2__0"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:818:1: rule__Empresa__Group_2__0 : rule__Empresa__Group_2__0__Impl rule__Empresa__Group_2__1 ;
    public final void rule__Empresa__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:822:1: ( rule__Empresa__Group_2__0__Impl rule__Empresa__Group_2__1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:823:2: rule__Empresa__Group_2__0__Impl rule__Empresa__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group_2__0__Impl_in_rule__Empresa__Group_2__01605);
            rule__Empresa__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group_2__1_in_rule__Empresa__Group_2__01608);
            rule__Empresa__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group_2__0"


    // $ANTLR start "rule__Empresa__Group_2__0__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:830:1: rule__Empresa__Group_2__0__Impl : ( 'nombre' ) ;
    public final void rule__Empresa__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:834:1: ( ( 'nombre' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:835:1: ( 'nombre' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:835:1: ( 'nombre' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:836:1: 'nombre'
            {
             before(grammarAccess.getEmpresaAccess().getNombreKeyword_2_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Empresa__Group_2__0__Impl1636); 
             after(grammarAccess.getEmpresaAccess().getNombreKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group_2__0__Impl"


    // $ANTLR start "rule__Empresa__Group_2__1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:849:1: rule__Empresa__Group_2__1 : rule__Empresa__Group_2__1__Impl ;
    public final void rule__Empresa__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:853:1: ( rule__Empresa__Group_2__1__Impl )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:854:2: rule__Empresa__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group_2__1__Impl_in_rule__Empresa__Group_2__11667);
            rule__Empresa__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group_2__1"


    // $ANTLR start "rule__Empresa__Group_2__1__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:860:1: rule__Empresa__Group_2__1__Impl : ( ( rule__Empresa__NombreAssignment_2_1 ) ) ;
    public final void rule__Empresa__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:864:1: ( ( ( rule__Empresa__NombreAssignment_2_1 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:865:1: ( ( rule__Empresa__NombreAssignment_2_1 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:865:1: ( ( rule__Empresa__NombreAssignment_2_1 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:866:1: ( rule__Empresa__NombreAssignment_2_1 )
            {
             before(grammarAccess.getEmpresaAccess().getNombreAssignment_2_1()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:867:1: ( rule__Empresa__NombreAssignment_2_1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:867:2: rule__Empresa__NombreAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__NombreAssignment_2_1_in_rule__Empresa__Group_2__1__Impl1694);
            rule__Empresa__NombreAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEmpresaAccess().getNombreAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group_2__1__Impl"


    // $ANTLR start "rule__Empresa__Group_3__0"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:881:1: rule__Empresa__Group_3__0 : rule__Empresa__Group_3__0__Impl rule__Empresa__Group_3__1 ;
    public final void rule__Empresa__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:885:1: ( rule__Empresa__Group_3__0__Impl rule__Empresa__Group_3__1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:886:2: rule__Empresa__Group_3__0__Impl rule__Empresa__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group_3__0__Impl_in_rule__Empresa__Group_3__01728);
            rule__Empresa__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group_3__1_in_rule__Empresa__Group_3__01731);
            rule__Empresa__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group_3__0"


    // $ANTLR start "rule__Empresa__Group_3__0__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:893:1: rule__Empresa__Group_3__0__Impl : ( 'direccion' ) ;
    public final void rule__Empresa__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:897:1: ( ( 'direccion' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:898:1: ( 'direccion' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:898:1: ( 'direccion' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:899:1: 'direccion'
            {
             before(grammarAccess.getEmpresaAccess().getDireccionKeyword_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Empresa__Group_3__0__Impl1759); 
             after(grammarAccess.getEmpresaAccess().getDireccionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group_3__0__Impl"


    // $ANTLR start "rule__Empresa__Group_3__1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:912:1: rule__Empresa__Group_3__1 : rule__Empresa__Group_3__1__Impl ;
    public final void rule__Empresa__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:916:1: ( rule__Empresa__Group_3__1__Impl )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:917:2: rule__Empresa__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group_3__1__Impl_in_rule__Empresa__Group_3__11790);
            rule__Empresa__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group_3__1"


    // $ANTLR start "rule__Empresa__Group_3__1__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:923:1: rule__Empresa__Group_3__1__Impl : ( ( rule__Empresa__DireccionAssignment_3_1 ) ) ;
    public final void rule__Empresa__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:927:1: ( ( ( rule__Empresa__DireccionAssignment_3_1 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:928:1: ( ( rule__Empresa__DireccionAssignment_3_1 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:928:1: ( ( rule__Empresa__DireccionAssignment_3_1 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:929:1: ( rule__Empresa__DireccionAssignment_3_1 )
            {
             before(grammarAccess.getEmpresaAccess().getDireccionAssignment_3_1()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:930:1: ( rule__Empresa__DireccionAssignment_3_1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:930:2: rule__Empresa__DireccionAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__DireccionAssignment_3_1_in_rule__Empresa__Group_3__1__Impl1817);
            rule__Empresa__DireccionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEmpresaAccess().getDireccionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group_3__1__Impl"


    // $ANTLR start "rule__Empresa__Group_4__0"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:944:1: rule__Empresa__Group_4__0 : rule__Empresa__Group_4__0__Impl rule__Empresa__Group_4__1 ;
    public final void rule__Empresa__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:948:1: ( rule__Empresa__Group_4__0__Impl rule__Empresa__Group_4__1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:949:2: rule__Empresa__Group_4__0__Impl rule__Empresa__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group_4__0__Impl_in_rule__Empresa__Group_4__01851);
            rule__Empresa__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group_4__1_in_rule__Empresa__Group_4__01854);
            rule__Empresa__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group_4__0"


    // $ANTLR start "rule__Empresa__Group_4__0__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:956:1: rule__Empresa__Group_4__0__Impl : ( 'email' ) ;
    public final void rule__Empresa__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:960:1: ( ( 'email' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:961:1: ( 'email' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:961:1: ( 'email' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:962:1: 'email'
            {
             before(grammarAccess.getEmpresaAccess().getEmailKeyword_4_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Empresa__Group_4__0__Impl1882); 
             after(grammarAccess.getEmpresaAccess().getEmailKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group_4__0__Impl"


    // $ANTLR start "rule__Empresa__Group_4__1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:975:1: rule__Empresa__Group_4__1 : rule__Empresa__Group_4__1__Impl ;
    public final void rule__Empresa__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:979:1: ( rule__Empresa__Group_4__1__Impl )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:980:2: rule__Empresa__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group_4__1__Impl_in_rule__Empresa__Group_4__11913);
            rule__Empresa__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group_4__1"


    // $ANTLR start "rule__Empresa__Group_4__1__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:986:1: rule__Empresa__Group_4__1__Impl : ( ( rule__Empresa__EmailAssignment_4_1 ) ) ;
    public final void rule__Empresa__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:990:1: ( ( ( rule__Empresa__EmailAssignment_4_1 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:991:1: ( ( rule__Empresa__EmailAssignment_4_1 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:991:1: ( ( rule__Empresa__EmailAssignment_4_1 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:992:1: ( rule__Empresa__EmailAssignment_4_1 )
            {
             before(grammarAccess.getEmpresaAccess().getEmailAssignment_4_1()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:993:1: ( rule__Empresa__EmailAssignment_4_1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:993:2: rule__Empresa__EmailAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__EmailAssignment_4_1_in_rule__Empresa__Group_4__1__Impl1940);
            rule__Empresa__EmailAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEmpresaAccess().getEmailAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group_4__1__Impl"


    // $ANTLR start "rule__Empresa__Group_5__0"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1007:1: rule__Empresa__Group_5__0 : rule__Empresa__Group_5__0__Impl rule__Empresa__Group_5__1 ;
    public final void rule__Empresa__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1011:1: ( rule__Empresa__Group_5__0__Impl rule__Empresa__Group_5__1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1012:2: rule__Empresa__Group_5__0__Impl rule__Empresa__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group_5__0__Impl_in_rule__Empresa__Group_5__01974);
            rule__Empresa__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group_5__1_in_rule__Empresa__Group_5__01977);
            rule__Empresa__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group_5__0"


    // $ANTLR start "rule__Empresa__Group_5__0__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1019:1: rule__Empresa__Group_5__0__Impl : ( 'telefono' ) ;
    public final void rule__Empresa__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1023:1: ( ( 'telefono' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1024:1: ( 'telefono' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1024:1: ( 'telefono' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1025:1: 'telefono'
            {
             before(grammarAccess.getEmpresaAccess().getTelefonoKeyword_5_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Empresa__Group_5__0__Impl2005); 
             after(grammarAccess.getEmpresaAccess().getTelefonoKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group_5__0__Impl"


    // $ANTLR start "rule__Empresa__Group_5__1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1038:1: rule__Empresa__Group_5__1 : rule__Empresa__Group_5__1__Impl ;
    public final void rule__Empresa__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1042:1: ( rule__Empresa__Group_5__1__Impl )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1043:2: rule__Empresa__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group_5__1__Impl_in_rule__Empresa__Group_5__12036);
            rule__Empresa__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group_5__1"


    // $ANTLR start "rule__Empresa__Group_5__1__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1049:1: rule__Empresa__Group_5__1__Impl : ( ( rule__Empresa__TelefonoAssignment_5_1 ) ) ;
    public final void rule__Empresa__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1053:1: ( ( ( rule__Empresa__TelefonoAssignment_5_1 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1054:1: ( ( rule__Empresa__TelefonoAssignment_5_1 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1054:1: ( ( rule__Empresa__TelefonoAssignment_5_1 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1055:1: ( rule__Empresa__TelefonoAssignment_5_1 )
            {
             before(grammarAccess.getEmpresaAccess().getTelefonoAssignment_5_1()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1056:1: ( rule__Empresa__TelefonoAssignment_5_1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1056:2: rule__Empresa__TelefonoAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__TelefonoAssignment_5_1_in_rule__Empresa__Group_5__1__Impl2063);
            rule__Empresa__TelefonoAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEmpresaAccess().getTelefonoAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group_5__1__Impl"


    // $ANTLR start "rule__Empresa__Group_6__0"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1070:1: rule__Empresa__Group_6__0 : rule__Empresa__Group_6__0__Impl rule__Empresa__Group_6__1 ;
    public final void rule__Empresa__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1074:1: ( rule__Empresa__Group_6__0__Impl rule__Empresa__Group_6__1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1075:2: rule__Empresa__Group_6__0__Impl rule__Empresa__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group_6__0__Impl_in_rule__Empresa__Group_6__02097);
            rule__Empresa__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group_6__1_in_rule__Empresa__Group_6__02100);
            rule__Empresa__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group_6__0"


    // $ANTLR start "rule__Empresa__Group_6__0__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1082:1: rule__Empresa__Group_6__0__Impl : ( 'descripcion' ) ;
    public final void rule__Empresa__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1086:1: ( ( 'descripcion' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1087:1: ( 'descripcion' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1087:1: ( 'descripcion' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1088:1: 'descripcion'
            {
             before(grammarAccess.getEmpresaAccess().getDescripcionKeyword_6_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Empresa__Group_6__0__Impl2128); 
             after(grammarAccess.getEmpresaAccess().getDescripcionKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group_6__0__Impl"


    // $ANTLR start "rule__Empresa__Group_6__1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1101:1: rule__Empresa__Group_6__1 : rule__Empresa__Group_6__1__Impl ;
    public final void rule__Empresa__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1105:1: ( rule__Empresa__Group_6__1__Impl )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1106:2: rule__Empresa__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group_6__1__Impl_in_rule__Empresa__Group_6__12159);
            rule__Empresa__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group_6__1"


    // $ANTLR start "rule__Empresa__Group_6__1__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1112:1: rule__Empresa__Group_6__1__Impl : ( ( rule__Empresa__DescripcionAssignment_6_1 ) ) ;
    public final void rule__Empresa__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1116:1: ( ( ( rule__Empresa__DescripcionAssignment_6_1 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1117:1: ( ( rule__Empresa__DescripcionAssignment_6_1 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1117:1: ( ( rule__Empresa__DescripcionAssignment_6_1 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1118:1: ( rule__Empresa__DescripcionAssignment_6_1 )
            {
             before(grammarAccess.getEmpresaAccess().getDescripcionAssignment_6_1()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1119:1: ( rule__Empresa__DescripcionAssignment_6_1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1119:2: rule__Empresa__DescripcionAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__DescripcionAssignment_6_1_in_rule__Empresa__Group_6__1__Impl2186);
            rule__Empresa__DescripcionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getEmpresaAccess().getDescripcionAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group_6__1__Impl"


    // $ANTLR start "rule__Empresa__Group_7__0"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1133:1: rule__Empresa__Group_7__0 : rule__Empresa__Group_7__0__Impl rule__Empresa__Group_7__1 ;
    public final void rule__Empresa__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1137:1: ( rule__Empresa__Group_7__0__Impl rule__Empresa__Group_7__1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1138:2: rule__Empresa__Group_7__0__Impl rule__Empresa__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group_7__0__Impl_in_rule__Empresa__Group_7__02220);
            rule__Empresa__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group_7__1_in_rule__Empresa__Group_7__02223);
            rule__Empresa__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group_7__0"


    // $ANTLR start "rule__Empresa__Group_7__0__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1145:1: rule__Empresa__Group_7__0__Impl : ( 'urlImagen' ) ;
    public final void rule__Empresa__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1149:1: ( ( 'urlImagen' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1150:1: ( 'urlImagen' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1150:1: ( 'urlImagen' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1151:1: 'urlImagen'
            {
             before(grammarAccess.getEmpresaAccess().getUrlImagenKeyword_7_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Empresa__Group_7__0__Impl2251); 
             after(grammarAccess.getEmpresaAccess().getUrlImagenKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group_7__0__Impl"


    // $ANTLR start "rule__Empresa__Group_7__1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1164:1: rule__Empresa__Group_7__1 : rule__Empresa__Group_7__1__Impl ;
    public final void rule__Empresa__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1168:1: ( rule__Empresa__Group_7__1__Impl )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1169:2: rule__Empresa__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__Group_7__1__Impl_in_rule__Empresa__Group_7__12282);
            rule__Empresa__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group_7__1"


    // $ANTLR start "rule__Empresa__Group_7__1__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1175:1: rule__Empresa__Group_7__1__Impl : ( ( rule__Empresa__UrlImagenAssignment_7_1 ) ) ;
    public final void rule__Empresa__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1179:1: ( ( ( rule__Empresa__UrlImagenAssignment_7_1 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1180:1: ( ( rule__Empresa__UrlImagenAssignment_7_1 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1180:1: ( ( rule__Empresa__UrlImagenAssignment_7_1 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1181:1: ( rule__Empresa__UrlImagenAssignment_7_1 )
            {
             before(grammarAccess.getEmpresaAccess().getUrlImagenAssignment_7_1()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1182:1: ( rule__Empresa__UrlImagenAssignment_7_1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1182:2: rule__Empresa__UrlImagenAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Empresa__UrlImagenAssignment_7_1_in_rule__Empresa__Group_7__1__Impl2309);
            rule__Empresa__UrlImagenAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getEmpresaAccess().getUrlImagenAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__Group_7__1__Impl"


    // $ANTLR start "rule__Catalogo__Group__0"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1196:1: rule__Catalogo__Group__0 : rule__Catalogo__Group__0__Impl rule__Catalogo__Group__1 ;
    public final void rule__Catalogo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1200:1: ( rule__Catalogo__Group__0__Impl rule__Catalogo__Group__1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1201:2: rule__Catalogo__Group__0__Impl rule__Catalogo__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__0__Impl_in_rule__Catalogo__Group__02343);
            rule__Catalogo__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__1_in_rule__Catalogo__Group__02346);
            rule__Catalogo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group__0"


    // $ANTLR start "rule__Catalogo__Group__0__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1208:1: rule__Catalogo__Group__0__Impl : ( 'Catalogo' ) ;
    public final void rule__Catalogo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1212:1: ( ( 'Catalogo' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1213:1: ( 'Catalogo' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1213:1: ( 'Catalogo' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1214:1: 'Catalogo'
            {
             before(grammarAccess.getCatalogoAccess().getCatalogoKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Catalogo__Group__0__Impl2374); 
             after(grammarAccess.getCatalogoAccess().getCatalogoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group__0__Impl"


    // $ANTLR start "rule__Catalogo__Group__1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1227:1: rule__Catalogo__Group__1 : rule__Catalogo__Group__1__Impl rule__Catalogo__Group__2 ;
    public final void rule__Catalogo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1231:1: ( rule__Catalogo__Group__1__Impl rule__Catalogo__Group__2 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1232:2: rule__Catalogo__Group__1__Impl rule__Catalogo__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__1__Impl_in_rule__Catalogo__Group__12405);
            rule__Catalogo__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__2_in_rule__Catalogo__Group__12408);
            rule__Catalogo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group__1"


    // $ANTLR start "rule__Catalogo__Group__1__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1239:1: rule__Catalogo__Group__1__Impl : ( '{' ) ;
    public final void rule__Catalogo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1243:1: ( ( '{' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1244:1: ( '{' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1244:1: ( '{' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1245:1: '{'
            {
             before(grammarAccess.getCatalogoAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Catalogo__Group__1__Impl2436); 
             after(grammarAccess.getCatalogoAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group__1__Impl"


    // $ANTLR start "rule__Catalogo__Group__2"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1258:1: rule__Catalogo__Group__2 : rule__Catalogo__Group__2__Impl rule__Catalogo__Group__3 ;
    public final void rule__Catalogo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1262:1: ( rule__Catalogo__Group__2__Impl rule__Catalogo__Group__3 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1263:2: rule__Catalogo__Group__2__Impl rule__Catalogo__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__2__Impl_in_rule__Catalogo__Group__22467);
            rule__Catalogo__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__3_in_rule__Catalogo__Group__22470);
            rule__Catalogo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group__2"


    // $ANTLR start "rule__Catalogo__Group__2__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1270:1: rule__Catalogo__Group__2__Impl : ( ( rule__Catalogo__Group_2__0 )? ) ;
    public final void rule__Catalogo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1274:1: ( ( ( rule__Catalogo__Group_2__0 )? ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1275:1: ( ( rule__Catalogo__Group_2__0 )? )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1275:1: ( ( rule__Catalogo__Group_2__0 )? )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1276:1: ( rule__Catalogo__Group_2__0 )?
            {
             before(grammarAccess.getCatalogoAccess().getGroup_2()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1277:1: ( rule__Catalogo__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1277:2: rule__Catalogo__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group_2__0_in_rule__Catalogo__Group__2__Impl2497);
                    rule__Catalogo__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCatalogoAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group__2__Impl"


    // $ANTLR start "rule__Catalogo__Group__3"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1287:1: rule__Catalogo__Group__3 : rule__Catalogo__Group__3__Impl rule__Catalogo__Group__4 ;
    public final void rule__Catalogo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1291:1: ( rule__Catalogo__Group__3__Impl rule__Catalogo__Group__4 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1292:2: rule__Catalogo__Group__3__Impl rule__Catalogo__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__3__Impl_in_rule__Catalogo__Group__32528);
            rule__Catalogo__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__4_in_rule__Catalogo__Group__32531);
            rule__Catalogo__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group__3"


    // $ANTLR start "rule__Catalogo__Group__3__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1299:1: rule__Catalogo__Group__3__Impl : ( ( rule__Catalogo__Group_3__0 )? ) ;
    public final void rule__Catalogo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1303:1: ( ( ( rule__Catalogo__Group_3__0 )? ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1304:1: ( ( rule__Catalogo__Group_3__0 )? )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1304:1: ( ( rule__Catalogo__Group_3__0 )? )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1305:1: ( rule__Catalogo__Group_3__0 )?
            {
             before(grammarAccess.getCatalogoAccess().getGroup_3()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1306:1: ( rule__Catalogo__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1306:2: rule__Catalogo__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group_3__0_in_rule__Catalogo__Group__3__Impl2558);
                    rule__Catalogo__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCatalogoAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group__3__Impl"


    // $ANTLR start "rule__Catalogo__Group__4"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1316:1: rule__Catalogo__Group__4 : rule__Catalogo__Group__4__Impl rule__Catalogo__Group__5 ;
    public final void rule__Catalogo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1320:1: ( rule__Catalogo__Group__4__Impl rule__Catalogo__Group__5 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1321:2: rule__Catalogo__Group__4__Impl rule__Catalogo__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__4__Impl_in_rule__Catalogo__Group__42589);
            rule__Catalogo__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__5_in_rule__Catalogo__Group__42592);
            rule__Catalogo__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group__4"


    // $ANTLR start "rule__Catalogo__Group__4__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1328:1: rule__Catalogo__Group__4__Impl : ( 'categorias' ) ;
    public final void rule__Catalogo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1332:1: ( ( 'categorias' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1333:1: ( 'categorias' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1333:1: ( 'categorias' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1334:1: 'categorias'
            {
             before(grammarAccess.getCatalogoAccess().getCategoriasKeyword_4()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Catalogo__Group__4__Impl2620); 
             after(grammarAccess.getCatalogoAccess().getCategoriasKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group__4__Impl"


    // $ANTLR start "rule__Catalogo__Group__5"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1347:1: rule__Catalogo__Group__5 : rule__Catalogo__Group__5__Impl rule__Catalogo__Group__6 ;
    public final void rule__Catalogo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1351:1: ( rule__Catalogo__Group__5__Impl rule__Catalogo__Group__6 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1352:2: rule__Catalogo__Group__5__Impl rule__Catalogo__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__5__Impl_in_rule__Catalogo__Group__52651);
            rule__Catalogo__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__6_in_rule__Catalogo__Group__52654);
            rule__Catalogo__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group__5"


    // $ANTLR start "rule__Catalogo__Group__5__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1359:1: rule__Catalogo__Group__5__Impl : ( '{' ) ;
    public final void rule__Catalogo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1363:1: ( ( '{' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1364:1: ( '{' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1364:1: ( '{' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1365:1: '{'
            {
             before(grammarAccess.getCatalogoAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Catalogo__Group__5__Impl2682); 
             after(grammarAccess.getCatalogoAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group__5__Impl"


    // $ANTLR start "rule__Catalogo__Group__6"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1378:1: rule__Catalogo__Group__6 : rule__Catalogo__Group__6__Impl rule__Catalogo__Group__7 ;
    public final void rule__Catalogo__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1382:1: ( rule__Catalogo__Group__6__Impl rule__Catalogo__Group__7 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1383:2: rule__Catalogo__Group__6__Impl rule__Catalogo__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__6__Impl_in_rule__Catalogo__Group__62713);
            rule__Catalogo__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__7_in_rule__Catalogo__Group__62716);
            rule__Catalogo__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group__6"


    // $ANTLR start "rule__Catalogo__Group__6__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1390:1: rule__Catalogo__Group__6__Impl : ( ( rule__Catalogo__CategoriasAssignment_6 ) ) ;
    public final void rule__Catalogo__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1394:1: ( ( ( rule__Catalogo__CategoriasAssignment_6 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1395:1: ( ( rule__Catalogo__CategoriasAssignment_6 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1395:1: ( ( rule__Catalogo__CategoriasAssignment_6 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1396:1: ( rule__Catalogo__CategoriasAssignment_6 )
            {
             before(grammarAccess.getCatalogoAccess().getCategoriasAssignment_6()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1397:1: ( rule__Catalogo__CategoriasAssignment_6 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1397:2: rule__Catalogo__CategoriasAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__CategoriasAssignment_6_in_rule__Catalogo__Group__6__Impl2743);
            rule__Catalogo__CategoriasAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCatalogoAccess().getCategoriasAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group__6__Impl"


    // $ANTLR start "rule__Catalogo__Group__7"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1407:1: rule__Catalogo__Group__7 : rule__Catalogo__Group__7__Impl rule__Catalogo__Group__8 ;
    public final void rule__Catalogo__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1411:1: ( rule__Catalogo__Group__7__Impl rule__Catalogo__Group__8 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1412:2: rule__Catalogo__Group__7__Impl rule__Catalogo__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__7__Impl_in_rule__Catalogo__Group__72773);
            rule__Catalogo__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__8_in_rule__Catalogo__Group__72776);
            rule__Catalogo__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group__7"


    // $ANTLR start "rule__Catalogo__Group__7__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1419:1: rule__Catalogo__Group__7__Impl : ( ( rule__Catalogo__Group_7__0 )* ) ;
    public final void rule__Catalogo__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1423:1: ( ( ( rule__Catalogo__Group_7__0 )* ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1424:1: ( ( rule__Catalogo__Group_7__0 )* )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1424:1: ( ( rule__Catalogo__Group_7__0 )* )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1425:1: ( rule__Catalogo__Group_7__0 )*
            {
             before(grammarAccess.getCatalogoAccess().getGroup_7()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1426:1: ( rule__Catalogo__Group_7__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1426:2: rule__Catalogo__Group_7__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group_7__0_in_rule__Catalogo__Group__7__Impl2803);
            	    rule__Catalogo__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCatalogoAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group__7__Impl"


    // $ANTLR start "rule__Catalogo__Group__8"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1436:1: rule__Catalogo__Group__8 : rule__Catalogo__Group__8__Impl rule__Catalogo__Group__9 ;
    public final void rule__Catalogo__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1440:1: ( rule__Catalogo__Group__8__Impl rule__Catalogo__Group__9 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1441:2: rule__Catalogo__Group__8__Impl rule__Catalogo__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__8__Impl_in_rule__Catalogo__Group__82834);
            rule__Catalogo__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__9_in_rule__Catalogo__Group__82837);
            rule__Catalogo__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group__8"


    // $ANTLR start "rule__Catalogo__Group__8__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1448:1: rule__Catalogo__Group__8__Impl : ( '}' ) ;
    public final void rule__Catalogo__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1452:1: ( ( '}' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1453:1: ( '}' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1453:1: ( '}' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1454:1: '}'
            {
             before(grammarAccess.getCatalogoAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Catalogo__Group__8__Impl2865); 
             after(grammarAccess.getCatalogoAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group__8__Impl"


    // $ANTLR start "rule__Catalogo__Group__9"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1467:1: rule__Catalogo__Group__9 : rule__Catalogo__Group__9__Impl ;
    public final void rule__Catalogo__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1471:1: ( rule__Catalogo__Group__9__Impl )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1472:2: rule__Catalogo__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group__9__Impl_in_rule__Catalogo__Group__92896);
            rule__Catalogo__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group__9"


    // $ANTLR start "rule__Catalogo__Group__9__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1478:1: rule__Catalogo__Group__9__Impl : ( '}' ) ;
    public final void rule__Catalogo__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1482:1: ( ( '}' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1483:1: ( '}' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1483:1: ( '}' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1484:1: '}'
            {
             before(grammarAccess.getCatalogoAccess().getRightCurlyBracketKeyword_9()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Catalogo__Group__9__Impl2924); 
             after(grammarAccess.getCatalogoAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group__9__Impl"


    // $ANTLR start "rule__Catalogo__Group_2__0"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1517:1: rule__Catalogo__Group_2__0 : rule__Catalogo__Group_2__0__Impl rule__Catalogo__Group_2__1 ;
    public final void rule__Catalogo__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1521:1: ( rule__Catalogo__Group_2__0__Impl rule__Catalogo__Group_2__1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1522:2: rule__Catalogo__Group_2__0__Impl rule__Catalogo__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group_2__0__Impl_in_rule__Catalogo__Group_2__02975);
            rule__Catalogo__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group_2__1_in_rule__Catalogo__Group_2__02978);
            rule__Catalogo__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group_2__0"


    // $ANTLR start "rule__Catalogo__Group_2__0__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1529:1: rule__Catalogo__Group_2__0__Impl : ( 'idCatalogo' ) ;
    public final void rule__Catalogo__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1533:1: ( ( 'idCatalogo' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1534:1: ( 'idCatalogo' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1534:1: ( 'idCatalogo' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1535:1: 'idCatalogo'
            {
             before(grammarAccess.getCatalogoAccess().getIdCatalogoKeyword_2_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Catalogo__Group_2__0__Impl3006); 
             after(grammarAccess.getCatalogoAccess().getIdCatalogoKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group_2__0__Impl"


    // $ANTLR start "rule__Catalogo__Group_2__1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1548:1: rule__Catalogo__Group_2__1 : rule__Catalogo__Group_2__1__Impl ;
    public final void rule__Catalogo__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1552:1: ( rule__Catalogo__Group_2__1__Impl )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1553:2: rule__Catalogo__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group_2__1__Impl_in_rule__Catalogo__Group_2__13037);
            rule__Catalogo__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group_2__1"


    // $ANTLR start "rule__Catalogo__Group_2__1__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1559:1: rule__Catalogo__Group_2__1__Impl : ( ( rule__Catalogo__IdCatalogoAssignment_2_1 ) ) ;
    public final void rule__Catalogo__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1563:1: ( ( ( rule__Catalogo__IdCatalogoAssignment_2_1 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1564:1: ( ( rule__Catalogo__IdCatalogoAssignment_2_1 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1564:1: ( ( rule__Catalogo__IdCatalogoAssignment_2_1 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1565:1: ( rule__Catalogo__IdCatalogoAssignment_2_1 )
            {
             before(grammarAccess.getCatalogoAccess().getIdCatalogoAssignment_2_1()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1566:1: ( rule__Catalogo__IdCatalogoAssignment_2_1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1566:2: rule__Catalogo__IdCatalogoAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__IdCatalogoAssignment_2_1_in_rule__Catalogo__Group_2__1__Impl3064);
            rule__Catalogo__IdCatalogoAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCatalogoAccess().getIdCatalogoAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group_2__1__Impl"


    // $ANTLR start "rule__Catalogo__Group_3__0"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1580:1: rule__Catalogo__Group_3__0 : rule__Catalogo__Group_3__0__Impl rule__Catalogo__Group_3__1 ;
    public final void rule__Catalogo__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1584:1: ( rule__Catalogo__Group_3__0__Impl rule__Catalogo__Group_3__1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1585:2: rule__Catalogo__Group_3__0__Impl rule__Catalogo__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group_3__0__Impl_in_rule__Catalogo__Group_3__03098);
            rule__Catalogo__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group_3__1_in_rule__Catalogo__Group_3__03101);
            rule__Catalogo__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group_3__0"


    // $ANTLR start "rule__Catalogo__Group_3__0__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1592:1: rule__Catalogo__Group_3__0__Impl : ( 'nombre' ) ;
    public final void rule__Catalogo__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1596:1: ( ( 'nombre' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1597:1: ( 'nombre' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1597:1: ( 'nombre' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1598:1: 'nombre'
            {
             before(grammarAccess.getCatalogoAccess().getNombreKeyword_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Catalogo__Group_3__0__Impl3129); 
             after(grammarAccess.getCatalogoAccess().getNombreKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group_3__0__Impl"


    // $ANTLR start "rule__Catalogo__Group_3__1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1611:1: rule__Catalogo__Group_3__1 : rule__Catalogo__Group_3__1__Impl ;
    public final void rule__Catalogo__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1615:1: ( rule__Catalogo__Group_3__1__Impl )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1616:2: rule__Catalogo__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group_3__1__Impl_in_rule__Catalogo__Group_3__13160);
            rule__Catalogo__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group_3__1"


    // $ANTLR start "rule__Catalogo__Group_3__1__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1622:1: rule__Catalogo__Group_3__1__Impl : ( ( rule__Catalogo__NombreAssignment_3_1 ) ) ;
    public final void rule__Catalogo__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1626:1: ( ( ( rule__Catalogo__NombreAssignment_3_1 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1627:1: ( ( rule__Catalogo__NombreAssignment_3_1 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1627:1: ( ( rule__Catalogo__NombreAssignment_3_1 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1628:1: ( rule__Catalogo__NombreAssignment_3_1 )
            {
             before(grammarAccess.getCatalogoAccess().getNombreAssignment_3_1()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1629:1: ( rule__Catalogo__NombreAssignment_3_1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1629:2: rule__Catalogo__NombreAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__NombreAssignment_3_1_in_rule__Catalogo__Group_3__1__Impl3187);
            rule__Catalogo__NombreAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCatalogoAccess().getNombreAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group_3__1__Impl"


    // $ANTLR start "rule__Catalogo__Group_7__0"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1643:1: rule__Catalogo__Group_7__0 : rule__Catalogo__Group_7__0__Impl rule__Catalogo__Group_7__1 ;
    public final void rule__Catalogo__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1647:1: ( rule__Catalogo__Group_7__0__Impl rule__Catalogo__Group_7__1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1648:2: rule__Catalogo__Group_7__0__Impl rule__Catalogo__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group_7__0__Impl_in_rule__Catalogo__Group_7__03221);
            rule__Catalogo__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group_7__1_in_rule__Catalogo__Group_7__03224);
            rule__Catalogo__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group_7__0"


    // $ANTLR start "rule__Catalogo__Group_7__0__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1655:1: rule__Catalogo__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Catalogo__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1659:1: ( ( ',' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1660:1: ( ',' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1660:1: ( ',' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1661:1: ','
            {
             before(grammarAccess.getCatalogoAccess().getCommaKeyword_7_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Catalogo__Group_7__0__Impl3252); 
             after(grammarAccess.getCatalogoAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group_7__0__Impl"


    // $ANTLR start "rule__Catalogo__Group_7__1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1674:1: rule__Catalogo__Group_7__1 : rule__Catalogo__Group_7__1__Impl ;
    public final void rule__Catalogo__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1678:1: ( rule__Catalogo__Group_7__1__Impl )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1679:2: rule__Catalogo__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__Group_7__1__Impl_in_rule__Catalogo__Group_7__13283);
            rule__Catalogo__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group_7__1"


    // $ANTLR start "rule__Catalogo__Group_7__1__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1685:1: rule__Catalogo__Group_7__1__Impl : ( ( rule__Catalogo__CategoriasAssignment_7_1 ) ) ;
    public final void rule__Catalogo__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1689:1: ( ( ( rule__Catalogo__CategoriasAssignment_7_1 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1690:1: ( ( rule__Catalogo__CategoriasAssignment_7_1 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1690:1: ( ( rule__Catalogo__CategoriasAssignment_7_1 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1691:1: ( rule__Catalogo__CategoriasAssignment_7_1 )
            {
             before(grammarAccess.getCatalogoAccess().getCategoriasAssignment_7_1()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1692:1: ( rule__Catalogo__CategoriasAssignment_7_1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1692:2: rule__Catalogo__CategoriasAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Catalogo__CategoriasAssignment_7_1_in_rule__Catalogo__Group_7__1__Impl3310);
            rule__Catalogo__CategoriasAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCatalogoAccess().getCategoriasAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__Group_7__1__Impl"


    // $ANTLR start "rule__ELong__Group__0"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1706:1: rule__ELong__Group__0 : rule__ELong__Group__0__Impl rule__ELong__Group__1 ;
    public final void rule__ELong__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1710:1: ( rule__ELong__Group__0__Impl rule__ELong__Group__1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1711:2: rule__ELong__Group__0__Impl rule__ELong__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ELong__Group__0__Impl_in_rule__ELong__Group__03344);
            rule__ELong__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ELong__Group__1_in_rule__ELong__Group__03347);
            rule__ELong__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELong__Group__0"


    // $ANTLR start "rule__ELong__Group__0__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1718:1: rule__ELong__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ELong__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1722:1: ( ( ( '-' )? ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1723:1: ( ( '-' )? )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1723:1: ( ( '-' )? )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1724:1: ( '-' )?
            {
             before(grammarAccess.getELongAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1725:1: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1726:2: '-'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__ELong__Group__0__Impl3376); 

                    }
                    break;

            }

             after(grammarAccess.getELongAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELong__Group__0__Impl"


    // $ANTLR start "rule__ELong__Group__1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1737:1: rule__ELong__Group__1 : rule__ELong__Group__1__Impl ;
    public final void rule__ELong__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1741:1: ( rule__ELong__Group__1__Impl )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1742:2: rule__ELong__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ELong__Group__1__Impl_in_rule__ELong__Group__13409);
            rule__ELong__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELong__Group__1"


    // $ANTLR start "rule__ELong__Group__1__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1748:1: rule__ELong__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ELong__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1752:1: ( ( RULE_INT ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1753:1: ( RULE_INT )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1753:1: ( RULE_INT )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1754:1: RULE_INT
            {
             before(grammarAccess.getELongAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__ELong__Group__1__Impl3436); 
             after(grammarAccess.getELongAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELong__Group__1__Impl"


    // $ANTLR start "rule__Categoria__Group__0"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1769:1: rule__Categoria__Group__0 : rule__Categoria__Group__0__Impl rule__Categoria__Group__1 ;
    public final void rule__Categoria__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1773:1: ( rule__Categoria__Group__0__Impl rule__Categoria__Group__1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1774:2: rule__Categoria__Group__0__Impl rule__Categoria__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group__0__Impl_in_rule__Categoria__Group__03469);
            rule__Categoria__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group__1_in_rule__Categoria__Group__03472);
            rule__Categoria__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__0"


    // $ANTLR start "rule__Categoria__Group__0__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1781:1: rule__Categoria__Group__0__Impl : ( 'Categoria' ) ;
    public final void rule__Categoria__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1785:1: ( ( 'Categoria' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1786:1: ( 'Categoria' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1786:1: ( 'Categoria' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1787:1: 'Categoria'
            {
             before(grammarAccess.getCategoriaAccess().getCategoriaKeyword_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Categoria__Group__0__Impl3500); 
             after(grammarAccess.getCategoriaAccess().getCategoriaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__0__Impl"


    // $ANTLR start "rule__Categoria__Group__1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1800:1: rule__Categoria__Group__1 : rule__Categoria__Group__1__Impl rule__Categoria__Group__2 ;
    public final void rule__Categoria__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1804:1: ( rule__Categoria__Group__1__Impl rule__Categoria__Group__2 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1805:2: rule__Categoria__Group__1__Impl rule__Categoria__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group__1__Impl_in_rule__Categoria__Group__13531);
            rule__Categoria__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group__2_in_rule__Categoria__Group__13534);
            rule__Categoria__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__1"


    // $ANTLR start "rule__Categoria__Group__1__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1812:1: rule__Categoria__Group__1__Impl : ( '{' ) ;
    public final void rule__Categoria__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1816:1: ( ( '{' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1817:1: ( '{' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1817:1: ( '{' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1818:1: '{'
            {
             before(grammarAccess.getCategoriaAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Categoria__Group__1__Impl3562); 
             after(grammarAccess.getCategoriaAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__1__Impl"


    // $ANTLR start "rule__Categoria__Group__2"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1831:1: rule__Categoria__Group__2 : rule__Categoria__Group__2__Impl rule__Categoria__Group__3 ;
    public final void rule__Categoria__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1835:1: ( rule__Categoria__Group__2__Impl rule__Categoria__Group__3 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1836:2: rule__Categoria__Group__2__Impl rule__Categoria__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group__2__Impl_in_rule__Categoria__Group__23593);
            rule__Categoria__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group__3_in_rule__Categoria__Group__23596);
            rule__Categoria__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__2"


    // $ANTLR start "rule__Categoria__Group__2__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1843:1: rule__Categoria__Group__2__Impl : ( ( rule__Categoria__Group_2__0 )? ) ;
    public final void rule__Categoria__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1847:1: ( ( ( rule__Categoria__Group_2__0 )? ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1848:1: ( ( rule__Categoria__Group_2__0 )? )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1848:1: ( ( rule__Categoria__Group_2__0 )? )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1849:1: ( rule__Categoria__Group_2__0 )?
            {
             before(grammarAccess.getCategoriaAccess().getGroup_2()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1850:1: ( rule__Categoria__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1850:2: rule__Categoria__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group_2__0_in_rule__Categoria__Group__2__Impl3623);
                    rule__Categoria__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCategoriaAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__2__Impl"


    // $ANTLR start "rule__Categoria__Group__3"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1860:1: rule__Categoria__Group__3 : rule__Categoria__Group__3__Impl rule__Categoria__Group__4 ;
    public final void rule__Categoria__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1864:1: ( rule__Categoria__Group__3__Impl rule__Categoria__Group__4 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1865:2: rule__Categoria__Group__3__Impl rule__Categoria__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group__3__Impl_in_rule__Categoria__Group__33654);
            rule__Categoria__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group__4_in_rule__Categoria__Group__33657);
            rule__Categoria__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__3"


    // $ANTLR start "rule__Categoria__Group__3__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1872:1: rule__Categoria__Group__3__Impl : ( ( rule__Categoria__Group_3__0 )? ) ;
    public final void rule__Categoria__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1876:1: ( ( ( rule__Categoria__Group_3__0 )? ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1877:1: ( ( rule__Categoria__Group_3__0 )? )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1877:1: ( ( rule__Categoria__Group_3__0 )? )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1878:1: ( rule__Categoria__Group_3__0 )?
            {
             before(grammarAccess.getCategoriaAccess().getGroup_3()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1879:1: ( rule__Categoria__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1879:2: rule__Categoria__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group_3__0_in_rule__Categoria__Group__3__Impl3684);
                    rule__Categoria__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCategoriaAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__3__Impl"


    // $ANTLR start "rule__Categoria__Group__4"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1889:1: rule__Categoria__Group__4 : rule__Categoria__Group__4__Impl rule__Categoria__Group__5 ;
    public final void rule__Categoria__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1893:1: ( rule__Categoria__Group__4__Impl rule__Categoria__Group__5 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1894:2: rule__Categoria__Group__4__Impl rule__Categoria__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group__4__Impl_in_rule__Categoria__Group__43715);
            rule__Categoria__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group__5_in_rule__Categoria__Group__43718);
            rule__Categoria__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__4"


    // $ANTLR start "rule__Categoria__Group__4__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1901:1: rule__Categoria__Group__4__Impl : ( 'productos' ) ;
    public final void rule__Categoria__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1905:1: ( ( 'productos' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1906:1: ( 'productos' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1906:1: ( 'productos' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1907:1: 'productos'
            {
             before(grammarAccess.getCategoriaAccess().getProductosKeyword_4()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Categoria__Group__4__Impl3746); 
             after(grammarAccess.getCategoriaAccess().getProductosKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__4__Impl"


    // $ANTLR start "rule__Categoria__Group__5"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1920:1: rule__Categoria__Group__5 : rule__Categoria__Group__5__Impl rule__Categoria__Group__6 ;
    public final void rule__Categoria__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1924:1: ( rule__Categoria__Group__5__Impl rule__Categoria__Group__6 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1925:2: rule__Categoria__Group__5__Impl rule__Categoria__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group__5__Impl_in_rule__Categoria__Group__53777);
            rule__Categoria__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group__6_in_rule__Categoria__Group__53780);
            rule__Categoria__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__5"


    // $ANTLR start "rule__Categoria__Group__5__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1932:1: rule__Categoria__Group__5__Impl : ( '{' ) ;
    public final void rule__Categoria__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1936:1: ( ( '{' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1937:1: ( '{' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1937:1: ( '{' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1938:1: '{'
            {
             before(grammarAccess.getCategoriaAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Categoria__Group__5__Impl3808); 
             after(grammarAccess.getCategoriaAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__5__Impl"


    // $ANTLR start "rule__Categoria__Group__6"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1951:1: rule__Categoria__Group__6 : rule__Categoria__Group__6__Impl rule__Categoria__Group__7 ;
    public final void rule__Categoria__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1955:1: ( rule__Categoria__Group__6__Impl rule__Categoria__Group__7 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1956:2: rule__Categoria__Group__6__Impl rule__Categoria__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group__6__Impl_in_rule__Categoria__Group__63839);
            rule__Categoria__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group__7_in_rule__Categoria__Group__63842);
            rule__Categoria__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__6"


    // $ANTLR start "rule__Categoria__Group__6__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1963:1: rule__Categoria__Group__6__Impl : ( ( rule__Categoria__ProductosAssignment_6 ) ) ;
    public final void rule__Categoria__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1967:1: ( ( ( rule__Categoria__ProductosAssignment_6 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1968:1: ( ( rule__Categoria__ProductosAssignment_6 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1968:1: ( ( rule__Categoria__ProductosAssignment_6 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1969:1: ( rule__Categoria__ProductosAssignment_6 )
            {
             before(grammarAccess.getCategoriaAccess().getProductosAssignment_6()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1970:1: ( rule__Categoria__ProductosAssignment_6 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1970:2: rule__Categoria__ProductosAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Categoria__ProductosAssignment_6_in_rule__Categoria__Group__6__Impl3869);
            rule__Categoria__ProductosAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCategoriaAccess().getProductosAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__6__Impl"


    // $ANTLR start "rule__Categoria__Group__7"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1980:1: rule__Categoria__Group__7 : rule__Categoria__Group__7__Impl rule__Categoria__Group__8 ;
    public final void rule__Categoria__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1984:1: ( rule__Categoria__Group__7__Impl rule__Categoria__Group__8 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1985:2: rule__Categoria__Group__7__Impl rule__Categoria__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group__7__Impl_in_rule__Categoria__Group__73899);
            rule__Categoria__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group__8_in_rule__Categoria__Group__73902);
            rule__Categoria__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__7"


    // $ANTLR start "rule__Categoria__Group__7__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1992:1: rule__Categoria__Group__7__Impl : ( ( rule__Categoria__Group_7__0 )* ) ;
    public final void rule__Categoria__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1996:1: ( ( ( rule__Categoria__Group_7__0 )* ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1997:1: ( ( rule__Categoria__Group_7__0 )* )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1997:1: ( ( rule__Categoria__Group_7__0 )* )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1998:1: ( rule__Categoria__Group_7__0 )*
            {
             before(grammarAccess.getCategoriaAccess().getGroup_7()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1999:1: ( rule__Categoria__Group_7__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:1999:2: rule__Categoria__Group_7__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group_7__0_in_rule__Categoria__Group__7__Impl3929);
            	    rule__Categoria__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getCategoriaAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__7__Impl"


    // $ANTLR start "rule__Categoria__Group__8"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2009:1: rule__Categoria__Group__8 : rule__Categoria__Group__8__Impl rule__Categoria__Group__9 ;
    public final void rule__Categoria__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2013:1: ( rule__Categoria__Group__8__Impl rule__Categoria__Group__9 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2014:2: rule__Categoria__Group__8__Impl rule__Categoria__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group__8__Impl_in_rule__Categoria__Group__83960);
            rule__Categoria__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group__9_in_rule__Categoria__Group__83963);
            rule__Categoria__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__8"


    // $ANTLR start "rule__Categoria__Group__8__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2021:1: rule__Categoria__Group__8__Impl : ( '}' ) ;
    public final void rule__Categoria__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2025:1: ( ( '}' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2026:1: ( '}' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2026:1: ( '}' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2027:1: '}'
            {
             before(grammarAccess.getCategoriaAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Categoria__Group__8__Impl3991); 
             after(grammarAccess.getCategoriaAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__8__Impl"


    // $ANTLR start "rule__Categoria__Group__9"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2040:1: rule__Categoria__Group__9 : rule__Categoria__Group__9__Impl ;
    public final void rule__Categoria__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2044:1: ( rule__Categoria__Group__9__Impl )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2045:2: rule__Categoria__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group__9__Impl_in_rule__Categoria__Group__94022);
            rule__Categoria__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__9"


    // $ANTLR start "rule__Categoria__Group__9__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2051:1: rule__Categoria__Group__9__Impl : ( '}' ) ;
    public final void rule__Categoria__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2055:1: ( ( '}' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2056:1: ( '}' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2056:1: ( '}' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2057:1: '}'
            {
             before(grammarAccess.getCategoriaAccess().getRightCurlyBracketKeyword_9()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Categoria__Group__9__Impl4050); 
             after(grammarAccess.getCategoriaAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__9__Impl"


    // $ANTLR start "rule__Categoria__Group_2__0"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2090:1: rule__Categoria__Group_2__0 : rule__Categoria__Group_2__0__Impl rule__Categoria__Group_2__1 ;
    public final void rule__Categoria__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2094:1: ( rule__Categoria__Group_2__0__Impl rule__Categoria__Group_2__1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2095:2: rule__Categoria__Group_2__0__Impl rule__Categoria__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group_2__0__Impl_in_rule__Categoria__Group_2__04101);
            rule__Categoria__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group_2__1_in_rule__Categoria__Group_2__04104);
            rule__Categoria__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group_2__0"


    // $ANTLR start "rule__Categoria__Group_2__0__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2102:1: rule__Categoria__Group_2__0__Impl : ( 'idCategoria' ) ;
    public final void rule__Categoria__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2106:1: ( ( 'idCategoria' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2107:1: ( 'idCategoria' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2107:1: ( 'idCategoria' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2108:1: 'idCategoria'
            {
             before(grammarAccess.getCategoriaAccess().getIdCategoriaKeyword_2_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Categoria__Group_2__0__Impl4132); 
             after(grammarAccess.getCategoriaAccess().getIdCategoriaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group_2__0__Impl"


    // $ANTLR start "rule__Categoria__Group_2__1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2121:1: rule__Categoria__Group_2__1 : rule__Categoria__Group_2__1__Impl ;
    public final void rule__Categoria__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2125:1: ( rule__Categoria__Group_2__1__Impl )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2126:2: rule__Categoria__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group_2__1__Impl_in_rule__Categoria__Group_2__14163);
            rule__Categoria__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group_2__1"


    // $ANTLR start "rule__Categoria__Group_2__1__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2132:1: rule__Categoria__Group_2__1__Impl : ( ( rule__Categoria__IdCategoriaAssignment_2_1 ) ) ;
    public final void rule__Categoria__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2136:1: ( ( ( rule__Categoria__IdCategoriaAssignment_2_1 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2137:1: ( ( rule__Categoria__IdCategoriaAssignment_2_1 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2137:1: ( ( rule__Categoria__IdCategoriaAssignment_2_1 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2138:1: ( rule__Categoria__IdCategoriaAssignment_2_1 )
            {
             before(grammarAccess.getCategoriaAccess().getIdCategoriaAssignment_2_1()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2139:1: ( rule__Categoria__IdCategoriaAssignment_2_1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2139:2: rule__Categoria__IdCategoriaAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Categoria__IdCategoriaAssignment_2_1_in_rule__Categoria__Group_2__1__Impl4190);
            rule__Categoria__IdCategoriaAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoriaAccess().getIdCategoriaAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group_2__1__Impl"


    // $ANTLR start "rule__Categoria__Group_3__0"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2153:1: rule__Categoria__Group_3__0 : rule__Categoria__Group_3__0__Impl rule__Categoria__Group_3__1 ;
    public final void rule__Categoria__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2157:1: ( rule__Categoria__Group_3__0__Impl rule__Categoria__Group_3__1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2158:2: rule__Categoria__Group_3__0__Impl rule__Categoria__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group_3__0__Impl_in_rule__Categoria__Group_3__04224);
            rule__Categoria__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group_3__1_in_rule__Categoria__Group_3__04227);
            rule__Categoria__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group_3__0"


    // $ANTLR start "rule__Categoria__Group_3__0__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2165:1: rule__Categoria__Group_3__0__Impl : ( 'nombre' ) ;
    public final void rule__Categoria__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2169:1: ( ( 'nombre' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2170:1: ( 'nombre' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2170:1: ( 'nombre' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2171:1: 'nombre'
            {
             before(grammarAccess.getCategoriaAccess().getNombreKeyword_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Categoria__Group_3__0__Impl4255); 
             after(grammarAccess.getCategoriaAccess().getNombreKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group_3__0__Impl"


    // $ANTLR start "rule__Categoria__Group_3__1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2184:1: rule__Categoria__Group_3__1 : rule__Categoria__Group_3__1__Impl ;
    public final void rule__Categoria__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2188:1: ( rule__Categoria__Group_3__1__Impl )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2189:2: rule__Categoria__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group_3__1__Impl_in_rule__Categoria__Group_3__14286);
            rule__Categoria__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group_3__1"


    // $ANTLR start "rule__Categoria__Group_3__1__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2195:1: rule__Categoria__Group_3__1__Impl : ( ( rule__Categoria__NombreAssignment_3_1 ) ) ;
    public final void rule__Categoria__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2199:1: ( ( ( rule__Categoria__NombreAssignment_3_1 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2200:1: ( ( rule__Categoria__NombreAssignment_3_1 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2200:1: ( ( rule__Categoria__NombreAssignment_3_1 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2201:1: ( rule__Categoria__NombreAssignment_3_1 )
            {
             before(grammarAccess.getCategoriaAccess().getNombreAssignment_3_1()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2202:1: ( rule__Categoria__NombreAssignment_3_1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2202:2: rule__Categoria__NombreAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Categoria__NombreAssignment_3_1_in_rule__Categoria__Group_3__1__Impl4313);
            rule__Categoria__NombreAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoriaAccess().getNombreAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group_3__1__Impl"


    // $ANTLR start "rule__Categoria__Group_7__0"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2216:1: rule__Categoria__Group_7__0 : rule__Categoria__Group_7__0__Impl rule__Categoria__Group_7__1 ;
    public final void rule__Categoria__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2220:1: ( rule__Categoria__Group_7__0__Impl rule__Categoria__Group_7__1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2221:2: rule__Categoria__Group_7__0__Impl rule__Categoria__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group_7__0__Impl_in_rule__Categoria__Group_7__04347);
            rule__Categoria__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group_7__1_in_rule__Categoria__Group_7__04350);
            rule__Categoria__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group_7__0"


    // $ANTLR start "rule__Categoria__Group_7__0__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2228:1: rule__Categoria__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Categoria__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2232:1: ( ( ',' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2233:1: ( ',' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2233:1: ( ',' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2234:1: ','
            {
             before(grammarAccess.getCategoriaAccess().getCommaKeyword_7_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Categoria__Group_7__0__Impl4378); 
             after(grammarAccess.getCategoriaAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group_7__0__Impl"


    // $ANTLR start "rule__Categoria__Group_7__1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2247:1: rule__Categoria__Group_7__1 : rule__Categoria__Group_7__1__Impl ;
    public final void rule__Categoria__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2251:1: ( rule__Categoria__Group_7__1__Impl )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2252:2: rule__Categoria__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Categoria__Group_7__1__Impl_in_rule__Categoria__Group_7__14409);
            rule__Categoria__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group_7__1"


    // $ANTLR start "rule__Categoria__Group_7__1__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2258:1: rule__Categoria__Group_7__1__Impl : ( ( rule__Categoria__ProductosAssignment_7_1 ) ) ;
    public final void rule__Categoria__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2262:1: ( ( ( rule__Categoria__ProductosAssignment_7_1 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2263:1: ( ( rule__Categoria__ProductosAssignment_7_1 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2263:1: ( ( rule__Categoria__ProductosAssignment_7_1 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2264:1: ( rule__Categoria__ProductosAssignment_7_1 )
            {
             before(grammarAccess.getCategoriaAccess().getProductosAssignment_7_1()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2265:1: ( rule__Categoria__ProductosAssignment_7_1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2265:2: rule__Categoria__ProductosAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Categoria__ProductosAssignment_7_1_in_rule__Categoria__Group_7__1__Impl4436);
            rule__Categoria__ProductosAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoriaAccess().getProductosAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group_7__1__Impl"


    // $ANTLR start "rule__Producto__Group__0"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2279:1: rule__Producto__Group__0 : rule__Producto__Group__0__Impl rule__Producto__Group__1 ;
    public final void rule__Producto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2283:1: ( rule__Producto__Group__0__Impl rule__Producto__Group__1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2284:2: rule__Producto__Group__0__Impl rule__Producto__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group__0__Impl_in_rule__Producto__Group__04470);
            rule__Producto__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group__1_in_rule__Producto__Group__04473);
            rule__Producto__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group__0"


    // $ANTLR start "rule__Producto__Group__0__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2291:1: rule__Producto__Group__0__Impl : ( 'Producto' ) ;
    public final void rule__Producto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2295:1: ( ( 'Producto' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2296:1: ( 'Producto' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2296:1: ( 'Producto' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2297:1: 'Producto'
            {
             before(grammarAccess.getProductoAccess().getProductoKeyword_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Producto__Group__0__Impl4501); 
             after(grammarAccess.getProductoAccess().getProductoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group__0__Impl"


    // $ANTLR start "rule__Producto__Group__1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2310:1: rule__Producto__Group__1 : rule__Producto__Group__1__Impl rule__Producto__Group__2 ;
    public final void rule__Producto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2314:1: ( rule__Producto__Group__1__Impl rule__Producto__Group__2 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2315:2: rule__Producto__Group__1__Impl rule__Producto__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group__1__Impl_in_rule__Producto__Group__14532);
            rule__Producto__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group__2_in_rule__Producto__Group__14535);
            rule__Producto__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group__1"


    // $ANTLR start "rule__Producto__Group__1__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2322:1: rule__Producto__Group__1__Impl : ( '{' ) ;
    public final void rule__Producto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2326:1: ( ( '{' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2327:1: ( '{' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2327:1: ( '{' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2328:1: '{'
            {
             before(grammarAccess.getProductoAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Producto__Group__1__Impl4563); 
             after(grammarAccess.getProductoAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group__1__Impl"


    // $ANTLR start "rule__Producto__Group__2"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2341:1: rule__Producto__Group__2 : rule__Producto__Group__2__Impl rule__Producto__Group__3 ;
    public final void rule__Producto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2345:1: ( rule__Producto__Group__2__Impl rule__Producto__Group__3 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2346:2: rule__Producto__Group__2__Impl rule__Producto__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group__2__Impl_in_rule__Producto__Group__24594);
            rule__Producto__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group__3_in_rule__Producto__Group__24597);
            rule__Producto__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group__2"


    // $ANTLR start "rule__Producto__Group__2__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2353:1: rule__Producto__Group__2__Impl : ( ( rule__Producto__Group_2__0 )? ) ;
    public final void rule__Producto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2357:1: ( ( ( rule__Producto__Group_2__0 )? ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2358:1: ( ( rule__Producto__Group_2__0 )? )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2358:1: ( ( rule__Producto__Group_2__0 )? )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2359:1: ( rule__Producto__Group_2__0 )?
            {
             before(grammarAccess.getProductoAccess().getGroup_2()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2360:1: ( rule__Producto__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2360:2: rule__Producto__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Producto__Group_2__0_in_rule__Producto__Group__2__Impl4624);
                    rule__Producto__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProductoAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group__2__Impl"


    // $ANTLR start "rule__Producto__Group__3"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2370:1: rule__Producto__Group__3 : rule__Producto__Group__3__Impl rule__Producto__Group__4 ;
    public final void rule__Producto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2374:1: ( rule__Producto__Group__3__Impl rule__Producto__Group__4 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2375:2: rule__Producto__Group__3__Impl rule__Producto__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group__3__Impl_in_rule__Producto__Group__34655);
            rule__Producto__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group__4_in_rule__Producto__Group__34658);
            rule__Producto__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group__3"


    // $ANTLR start "rule__Producto__Group__3__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2382:1: rule__Producto__Group__3__Impl : ( ( rule__Producto__Group_3__0 )? ) ;
    public final void rule__Producto__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2386:1: ( ( ( rule__Producto__Group_3__0 )? ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2387:1: ( ( rule__Producto__Group_3__0 )? )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2387:1: ( ( rule__Producto__Group_3__0 )? )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2388:1: ( rule__Producto__Group_3__0 )?
            {
             before(grammarAccess.getProductoAccess().getGroup_3()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2389:1: ( rule__Producto__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2389:2: rule__Producto__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Producto__Group_3__0_in_rule__Producto__Group__3__Impl4685);
                    rule__Producto__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProductoAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group__3__Impl"


    // $ANTLR start "rule__Producto__Group__4"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2399:1: rule__Producto__Group__4 : rule__Producto__Group__4__Impl rule__Producto__Group__5 ;
    public final void rule__Producto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2403:1: ( rule__Producto__Group__4__Impl rule__Producto__Group__5 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2404:2: rule__Producto__Group__4__Impl rule__Producto__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group__4__Impl_in_rule__Producto__Group__44716);
            rule__Producto__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group__5_in_rule__Producto__Group__44719);
            rule__Producto__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group__4"


    // $ANTLR start "rule__Producto__Group__4__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2411:1: rule__Producto__Group__4__Impl : ( 'atributos' ) ;
    public final void rule__Producto__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2415:1: ( ( 'atributos' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2416:1: ( 'atributos' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2416:1: ( 'atributos' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2417:1: 'atributos'
            {
             before(grammarAccess.getProductoAccess().getAtributosKeyword_4()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Producto__Group__4__Impl4747); 
             after(grammarAccess.getProductoAccess().getAtributosKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group__4__Impl"


    // $ANTLR start "rule__Producto__Group__5"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2430:1: rule__Producto__Group__5 : rule__Producto__Group__5__Impl rule__Producto__Group__6 ;
    public final void rule__Producto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2434:1: ( rule__Producto__Group__5__Impl rule__Producto__Group__6 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2435:2: rule__Producto__Group__5__Impl rule__Producto__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group__5__Impl_in_rule__Producto__Group__54778);
            rule__Producto__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group__6_in_rule__Producto__Group__54781);
            rule__Producto__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group__5"


    // $ANTLR start "rule__Producto__Group__5__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2442:1: rule__Producto__Group__5__Impl : ( '{' ) ;
    public final void rule__Producto__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2446:1: ( ( '{' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2447:1: ( '{' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2447:1: ( '{' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2448:1: '{'
            {
             before(grammarAccess.getProductoAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Producto__Group__5__Impl4809); 
             after(grammarAccess.getProductoAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group__5__Impl"


    // $ANTLR start "rule__Producto__Group__6"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2461:1: rule__Producto__Group__6 : rule__Producto__Group__6__Impl rule__Producto__Group__7 ;
    public final void rule__Producto__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2465:1: ( rule__Producto__Group__6__Impl rule__Producto__Group__7 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2466:2: rule__Producto__Group__6__Impl rule__Producto__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group__6__Impl_in_rule__Producto__Group__64840);
            rule__Producto__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group__7_in_rule__Producto__Group__64843);
            rule__Producto__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group__6"


    // $ANTLR start "rule__Producto__Group__6__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2473:1: rule__Producto__Group__6__Impl : ( ( rule__Producto__AtributosAssignment_6 ) ) ;
    public final void rule__Producto__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2477:1: ( ( ( rule__Producto__AtributosAssignment_6 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2478:1: ( ( rule__Producto__AtributosAssignment_6 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2478:1: ( ( rule__Producto__AtributosAssignment_6 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2479:1: ( rule__Producto__AtributosAssignment_6 )
            {
             before(grammarAccess.getProductoAccess().getAtributosAssignment_6()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2480:1: ( rule__Producto__AtributosAssignment_6 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2480:2: rule__Producto__AtributosAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Producto__AtributosAssignment_6_in_rule__Producto__Group__6__Impl4870);
            rule__Producto__AtributosAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getProductoAccess().getAtributosAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group__6__Impl"


    // $ANTLR start "rule__Producto__Group__7"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2490:1: rule__Producto__Group__7 : rule__Producto__Group__7__Impl rule__Producto__Group__8 ;
    public final void rule__Producto__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2494:1: ( rule__Producto__Group__7__Impl rule__Producto__Group__8 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2495:2: rule__Producto__Group__7__Impl rule__Producto__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group__7__Impl_in_rule__Producto__Group__74900);
            rule__Producto__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group__8_in_rule__Producto__Group__74903);
            rule__Producto__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group__7"


    // $ANTLR start "rule__Producto__Group__7__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2502:1: rule__Producto__Group__7__Impl : ( ( rule__Producto__Group_7__0 )* ) ;
    public final void rule__Producto__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2506:1: ( ( ( rule__Producto__Group_7__0 )* ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2507:1: ( ( rule__Producto__Group_7__0 )* )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2507:1: ( ( rule__Producto__Group_7__0 )* )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2508:1: ( rule__Producto__Group_7__0 )*
            {
             before(grammarAccess.getProductoAccess().getGroup_7()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2509:1: ( rule__Producto__Group_7__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2509:2: rule__Producto__Group_7__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Producto__Group_7__0_in_rule__Producto__Group__7__Impl4930);
            	    rule__Producto__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getProductoAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group__7__Impl"


    // $ANTLR start "rule__Producto__Group__8"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2519:1: rule__Producto__Group__8 : rule__Producto__Group__8__Impl rule__Producto__Group__9 ;
    public final void rule__Producto__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2523:1: ( rule__Producto__Group__8__Impl rule__Producto__Group__9 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2524:2: rule__Producto__Group__8__Impl rule__Producto__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group__8__Impl_in_rule__Producto__Group__84961);
            rule__Producto__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group__9_in_rule__Producto__Group__84964);
            rule__Producto__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group__8"


    // $ANTLR start "rule__Producto__Group__8__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2531:1: rule__Producto__Group__8__Impl : ( '}' ) ;
    public final void rule__Producto__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2535:1: ( ( '}' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2536:1: ( '}' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2536:1: ( '}' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2537:1: '}'
            {
             before(grammarAccess.getProductoAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Producto__Group__8__Impl4992); 
             after(grammarAccess.getProductoAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group__8__Impl"


    // $ANTLR start "rule__Producto__Group__9"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2550:1: rule__Producto__Group__9 : rule__Producto__Group__9__Impl ;
    public final void rule__Producto__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2554:1: ( rule__Producto__Group__9__Impl )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2555:2: rule__Producto__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group__9__Impl_in_rule__Producto__Group__95023);
            rule__Producto__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group__9"


    // $ANTLR start "rule__Producto__Group__9__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2561:1: rule__Producto__Group__9__Impl : ( '}' ) ;
    public final void rule__Producto__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2565:1: ( ( '}' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2566:1: ( '}' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2566:1: ( '}' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2567:1: '}'
            {
             before(grammarAccess.getProductoAccess().getRightCurlyBracketKeyword_9()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Producto__Group__9__Impl5051); 
             after(grammarAccess.getProductoAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group__9__Impl"


    // $ANTLR start "rule__Producto__Group_2__0"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2600:1: rule__Producto__Group_2__0 : rule__Producto__Group_2__0__Impl rule__Producto__Group_2__1 ;
    public final void rule__Producto__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2604:1: ( rule__Producto__Group_2__0__Impl rule__Producto__Group_2__1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2605:2: rule__Producto__Group_2__0__Impl rule__Producto__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group_2__0__Impl_in_rule__Producto__Group_2__05102);
            rule__Producto__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group_2__1_in_rule__Producto__Group_2__05105);
            rule__Producto__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group_2__0"


    // $ANTLR start "rule__Producto__Group_2__0__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2612:1: rule__Producto__Group_2__0__Impl : ( 'idProducto' ) ;
    public final void rule__Producto__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2616:1: ( ( 'idProducto' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2617:1: ( 'idProducto' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2617:1: ( 'idProducto' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2618:1: 'idProducto'
            {
             before(grammarAccess.getProductoAccess().getIdProductoKeyword_2_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Producto__Group_2__0__Impl5133); 
             after(grammarAccess.getProductoAccess().getIdProductoKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group_2__0__Impl"


    // $ANTLR start "rule__Producto__Group_2__1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2631:1: rule__Producto__Group_2__1 : rule__Producto__Group_2__1__Impl ;
    public final void rule__Producto__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2635:1: ( rule__Producto__Group_2__1__Impl )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2636:2: rule__Producto__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group_2__1__Impl_in_rule__Producto__Group_2__15164);
            rule__Producto__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group_2__1"


    // $ANTLR start "rule__Producto__Group_2__1__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2642:1: rule__Producto__Group_2__1__Impl : ( ( rule__Producto__IdProductoAssignment_2_1 ) ) ;
    public final void rule__Producto__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2646:1: ( ( ( rule__Producto__IdProductoAssignment_2_1 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2647:1: ( ( rule__Producto__IdProductoAssignment_2_1 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2647:1: ( ( rule__Producto__IdProductoAssignment_2_1 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2648:1: ( rule__Producto__IdProductoAssignment_2_1 )
            {
             before(grammarAccess.getProductoAccess().getIdProductoAssignment_2_1()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2649:1: ( rule__Producto__IdProductoAssignment_2_1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2649:2: rule__Producto__IdProductoAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Producto__IdProductoAssignment_2_1_in_rule__Producto__Group_2__1__Impl5191);
            rule__Producto__IdProductoAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getProductoAccess().getIdProductoAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group_2__1__Impl"


    // $ANTLR start "rule__Producto__Group_3__0"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2663:1: rule__Producto__Group_3__0 : rule__Producto__Group_3__0__Impl rule__Producto__Group_3__1 ;
    public final void rule__Producto__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2667:1: ( rule__Producto__Group_3__0__Impl rule__Producto__Group_3__1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2668:2: rule__Producto__Group_3__0__Impl rule__Producto__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group_3__0__Impl_in_rule__Producto__Group_3__05225);
            rule__Producto__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group_3__1_in_rule__Producto__Group_3__05228);
            rule__Producto__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group_3__0"


    // $ANTLR start "rule__Producto__Group_3__0__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2675:1: rule__Producto__Group_3__0__Impl : ( 'nombre' ) ;
    public final void rule__Producto__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2679:1: ( ( 'nombre' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2680:1: ( 'nombre' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2680:1: ( 'nombre' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2681:1: 'nombre'
            {
             before(grammarAccess.getProductoAccess().getNombreKeyword_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Producto__Group_3__0__Impl5256); 
             after(grammarAccess.getProductoAccess().getNombreKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group_3__0__Impl"


    // $ANTLR start "rule__Producto__Group_3__1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2694:1: rule__Producto__Group_3__1 : rule__Producto__Group_3__1__Impl ;
    public final void rule__Producto__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2698:1: ( rule__Producto__Group_3__1__Impl )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2699:2: rule__Producto__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group_3__1__Impl_in_rule__Producto__Group_3__15287);
            rule__Producto__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group_3__1"


    // $ANTLR start "rule__Producto__Group_3__1__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2705:1: rule__Producto__Group_3__1__Impl : ( ( rule__Producto__NombreAssignment_3_1 ) ) ;
    public final void rule__Producto__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2709:1: ( ( ( rule__Producto__NombreAssignment_3_1 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2710:1: ( ( rule__Producto__NombreAssignment_3_1 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2710:1: ( ( rule__Producto__NombreAssignment_3_1 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2711:1: ( rule__Producto__NombreAssignment_3_1 )
            {
             before(grammarAccess.getProductoAccess().getNombreAssignment_3_1()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2712:1: ( rule__Producto__NombreAssignment_3_1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2712:2: rule__Producto__NombreAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Producto__NombreAssignment_3_1_in_rule__Producto__Group_3__1__Impl5314);
            rule__Producto__NombreAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProductoAccess().getNombreAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group_3__1__Impl"


    // $ANTLR start "rule__Producto__Group_7__0"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2726:1: rule__Producto__Group_7__0 : rule__Producto__Group_7__0__Impl rule__Producto__Group_7__1 ;
    public final void rule__Producto__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2730:1: ( rule__Producto__Group_7__0__Impl rule__Producto__Group_7__1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2731:2: rule__Producto__Group_7__0__Impl rule__Producto__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group_7__0__Impl_in_rule__Producto__Group_7__05348);
            rule__Producto__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group_7__1_in_rule__Producto__Group_7__05351);
            rule__Producto__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group_7__0"


    // $ANTLR start "rule__Producto__Group_7__0__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2738:1: rule__Producto__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Producto__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2742:1: ( ( ',' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2743:1: ( ',' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2743:1: ( ',' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2744:1: ','
            {
             before(grammarAccess.getProductoAccess().getCommaKeyword_7_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Producto__Group_7__0__Impl5379); 
             after(grammarAccess.getProductoAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group_7__0__Impl"


    // $ANTLR start "rule__Producto__Group_7__1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2757:1: rule__Producto__Group_7__1 : rule__Producto__Group_7__1__Impl ;
    public final void rule__Producto__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2761:1: ( rule__Producto__Group_7__1__Impl )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2762:2: rule__Producto__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Producto__Group_7__1__Impl_in_rule__Producto__Group_7__15410);
            rule__Producto__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group_7__1"


    // $ANTLR start "rule__Producto__Group_7__1__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2768:1: rule__Producto__Group_7__1__Impl : ( ( rule__Producto__AtributosAssignment_7_1 ) ) ;
    public final void rule__Producto__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2772:1: ( ( ( rule__Producto__AtributosAssignment_7_1 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2773:1: ( ( rule__Producto__AtributosAssignment_7_1 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2773:1: ( ( rule__Producto__AtributosAssignment_7_1 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2774:1: ( rule__Producto__AtributosAssignment_7_1 )
            {
             before(grammarAccess.getProductoAccess().getAtributosAssignment_7_1()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2775:1: ( rule__Producto__AtributosAssignment_7_1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2775:2: rule__Producto__AtributosAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Producto__AtributosAssignment_7_1_in_rule__Producto__Group_7__1__Impl5437);
            rule__Producto__AtributosAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getProductoAccess().getAtributosAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group_7__1__Impl"


    // $ANTLR start "rule__Atributo__Group__0"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2789:1: rule__Atributo__Group__0 : rule__Atributo__Group__0__Impl rule__Atributo__Group__1 ;
    public final void rule__Atributo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2793:1: ( rule__Atributo__Group__0__Impl rule__Atributo__Group__1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2794:2: rule__Atributo__Group__0__Impl rule__Atributo__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group__0__Impl_in_rule__Atributo__Group__05471);
            rule__Atributo__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group__1_in_rule__Atributo__Group__05474);
            rule__Atributo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__0"


    // $ANTLR start "rule__Atributo__Group__0__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2801:1: rule__Atributo__Group__0__Impl : ( () ) ;
    public final void rule__Atributo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2805:1: ( ( () ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2806:1: ( () )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2806:1: ( () )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2807:1: ()
            {
             before(grammarAccess.getAtributoAccess().getAtributoAction_0()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2808:1: ()
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2810:1: 
            {
            }

             after(grammarAccess.getAtributoAccess().getAtributoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__0__Impl"


    // $ANTLR start "rule__Atributo__Group__1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2820:1: rule__Atributo__Group__1 : rule__Atributo__Group__1__Impl rule__Atributo__Group__2 ;
    public final void rule__Atributo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2824:1: ( rule__Atributo__Group__1__Impl rule__Atributo__Group__2 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2825:2: rule__Atributo__Group__1__Impl rule__Atributo__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group__1__Impl_in_rule__Atributo__Group__15532);
            rule__Atributo__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group__2_in_rule__Atributo__Group__15535);
            rule__Atributo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__1"


    // $ANTLR start "rule__Atributo__Group__1__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2832:1: rule__Atributo__Group__1__Impl : ( 'Atributo' ) ;
    public final void rule__Atributo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2836:1: ( ( 'Atributo' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2837:1: ( 'Atributo' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2837:1: ( 'Atributo' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2838:1: 'Atributo'
            {
             before(grammarAccess.getAtributoAccess().getAtributoKeyword_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Atributo__Group__1__Impl5563); 
             after(grammarAccess.getAtributoAccess().getAtributoKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__1__Impl"


    // $ANTLR start "rule__Atributo__Group__2"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2851:1: rule__Atributo__Group__2 : rule__Atributo__Group__2__Impl rule__Atributo__Group__3 ;
    public final void rule__Atributo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2855:1: ( rule__Atributo__Group__2__Impl rule__Atributo__Group__3 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2856:2: rule__Atributo__Group__2__Impl rule__Atributo__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group__2__Impl_in_rule__Atributo__Group__25594);
            rule__Atributo__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group__3_in_rule__Atributo__Group__25597);
            rule__Atributo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__2"


    // $ANTLR start "rule__Atributo__Group__2__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2863:1: rule__Atributo__Group__2__Impl : ( '{' ) ;
    public final void rule__Atributo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2867:1: ( ( '{' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2868:1: ( '{' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2868:1: ( '{' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2869:1: '{'
            {
             before(grammarAccess.getAtributoAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Atributo__Group__2__Impl5625); 
             after(grammarAccess.getAtributoAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__2__Impl"


    // $ANTLR start "rule__Atributo__Group__3"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2882:1: rule__Atributo__Group__3 : rule__Atributo__Group__3__Impl rule__Atributo__Group__4 ;
    public final void rule__Atributo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2886:1: ( rule__Atributo__Group__3__Impl rule__Atributo__Group__4 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2887:2: rule__Atributo__Group__3__Impl rule__Atributo__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group__3__Impl_in_rule__Atributo__Group__35656);
            rule__Atributo__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group__4_in_rule__Atributo__Group__35659);
            rule__Atributo__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__3"


    // $ANTLR start "rule__Atributo__Group__3__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2894:1: rule__Atributo__Group__3__Impl : ( ( rule__Atributo__Group_3__0 )? ) ;
    public final void rule__Atributo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2898:1: ( ( ( rule__Atributo__Group_3__0 )? ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2899:1: ( ( rule__Atributo__Group_3__0 )? )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2899:1: ( ( rule__Atributo__Group_3__0 )? )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2900:1: ( rule__Atributo__Group_3__0 )?
            {
             before(grammarAccess.getAtributoAccess().getGroup_3()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2901:1: ( rule__Atributo__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2901:2: rule__Atributo__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_3__0_in_rule__Atributo__Group__3__Impl5686);
                    rule__Atributo__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtributoAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__3__Impl"


    // $ANTLR start "rule__Atributo__Group__4"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2911:1: rule__Atributo__Group__4 : rule__Atributo__Group__4__Impl rule__Atributo__Group__5 ;
    public final void rule__Atributo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2915:1: ( rule__Atributo__Group__4__Impl rule__Atributo__Group__5 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2916:2: rule__Atributo__Group__4__Impl rule__Atributo__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group__4__Impl_in_rule__Atributo__Group__45717);
            rule__Atributo__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group__5_in_rule__Atributo__Group__45720);
            rule__Atributo__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__4"


    // $ANTLR start "rule__Atributo__Group__4__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2923:1: rule__Atributo__Group__4__Impl : ( ( rule__Atributo__Group_4__0 )? ) ;
    public final void rule__Atributo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2927:1: ( ( ( rule__Atributo__Group_4__0 )? ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2928:1: ( ( rule__Atributo__Group_4__0 )? )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2928:1: ( ( rule__Atributo__Group_4__0 )? )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2929:1: ( rule__Atributo__Group_4__0 )?
            {
             before(grammarAccess.getAtributoAccess().getGroup_4()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2930:1: ( rule__Atributo__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2930:2: rule__Atributo__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_4__0_in_rule__Atributo__Group__4__Impl5747);
                    rule__Atributo__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtributoAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__4__Impl"


    // $ANTLR start "rule__Atributo__Group__5"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2940:1: rule__Atributo__Group__5 : rule__Atributo__Group__5__Impl rule__Atributo__Group__6 ;
    public final void rule__Atributo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2944:1: ( rule__Atributo__Group__5__Impl rule__Atributo__Group__6 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2945:2: rule__Atributo__Group__5__Impl rule__Atributo__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group__5__Impl_in_rule__Atributo__Group__55778);
            rule__Atributo__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group__6_in_rule__Atributo__Group__55781);
            rule__Atributo__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__5"


    // $ANTLR start "rule__Atributo__Group__5__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2952:1: rule__Atributo__Group__5__Impl : ( ( rule__Atributo__Group_5__0 )? ) ;
    public final void rule__Atributo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2956:1: ( ( ( rule__Atributo__Group_5__0 )? ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2957:1: ( ( rule__Atributo__Group_5__0 )? )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2957:1: ( ( rule__Atributo__Group_5__0 )? )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2958:1: ( rule__Atributo__Group_5__0 )?
            {
             before(grammarAccess.getAtributoAccess().getGroup_5()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2959:1: ( rule__Atributo__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2959:2: rule__Atributo__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_5__0_in_rule__Atributo__Group__5__Impl5808);
                    rule__Atributo__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtributoAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__5__Impl"


    // $ANTLR start "rule__Atributo__Group__6"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2969:1: rule__Atributo__Group__6 : rule__Atributo__Group__6__Impl rule__Atributo__Group__7 ;
    public final void rule__Atributo__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2973:1: ( rule__Atributo__Group__6__Impl rule__Atributo__Group__7 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2974:2: rule__Atributo__Group__6__Impl rule__Atributo__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group__6__Impl_in_rule__Atributo__Group__65839);
            rule__Atributo__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group__7_in_rule__Atributo__Group__65842);
            rule__Atributo__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__6"


    // $ANTLR start "rule__Atributo__Group__6__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2981:1: rule__Atributo__Group__6__Impl : ( ( rule__Atributo__Group_6__0 )? ) ;
    public final void rule__Atributo__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2985:1: ( ( ( rule__Atributo__Group_6__0 )? ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2986:1: ( ( rule__Atributo__Group_6__0 )? )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2986:1: ( ( rule__Atributo__Group_6__0 )? )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2987:1: ( rule__Atributo__Group_6__0 )?
            {
             before(grammarAccess.getAtributoAccess().getGroup_6()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2988:1: ( rule__Atributo__Group_6__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2988:2: rule__Atributo__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_6__0_in_rule__Atributo__Group__6__Impl5869);
                    rule__Atributo__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtributoAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__6__Impl"


    // $ANTLR start "rule__Atributo__Group__7"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:2998:1: rule__Atributo__Group__7 : rule__Atributo__Group__7__Impl ;
    public final void rule__Atributo__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3002:1: ( rule__Atributo__Group__7__Impl )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3003:2: rule__Atributo__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group__7__Impl_in_rule__Atributo__Group__75900);
            rule__Atributo__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__7"


    // $ANTLR start "rule__Atributo__Group__7__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3009:1: rule__Atributo__Group__7__Impl : ( '}' ) ;
    public final void rule__Atributo__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3013:1: ( ( '}' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3014:1: ( '}' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3014:1: ( '}' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3015:1: '}'
            {
             before(grammarAccess.getAtributoAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Atributo__Group__7__Impl5928); 
             after(grammarAccess.getAtributoAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__7__Impl"


    // $ANTLR start "rule__Atributo__Group_3__0"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3044:1: rule__Atributo__Group_3__0 : rule__Atributo__Group_3__0__Impl rule__Atributo__Group_3__1 ;
    public final void rule__Atributo__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3048:1: ( rule__Atributo__Group_3__0__Impl rule__Atributo__Group_3__1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3049:2: rule__Atributo__Group_3__0__Impl rule__Atributo__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_3__0__Impl_in_rule__Atributo__Group_3__05975);
            rule__Atributo__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_3__1_in_rule__Atributo__Group_3__05978);
            rule__Atributo__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group_3__0"


    // $ANTLR start "rule__Atributo__Group_3__0__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3056:1: rule__Atributo__Group_3__0__Impl : ( 'idAtributo' ) ;
    public final void rule__Atributo__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3060:1: ( ( 'idAtributo' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3061:1: ( 'idAtributo' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3061:1: ( 'idAtributo' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3062:1: 'idAtributo'
            {
             before(grammarAccess.getAtributoAccess().getIdAtributoKeyword_3_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Atributo__Group_3__0__Impl6006); 
             after(grammarAccess.getAtributoAccess().getIdAtributoKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group_3__0__Impl"


    // $ANTLR start "rule__Atributo__Group_3__1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3075:1: rule__Atributo__Group_3__1 : rule__Atributo__Group_3__1__Impl ;
    public final void rule__Atributo__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3079:1: ( rule__Atributo__Group_3__1__Impl )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3080:2: rule__Atributo__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_3__1__Impl_in_rule__Atributo__Group_3__16037);
            rule__Atributo__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group_3__1"


    // $ANTLR start "rule__Atributo__Group_3__1__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3086:1: rule__Atributo__Group_3__1__Impl : ( ( rule__Atributo__IdAtributoAssignment_3_1 ) ) ;
    public final void rule__Atributo__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3090:1: ( ( ( rule__Atributo__IdAtributoAssignment_3_1 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3091:1: ( ( rule__Atributo__IdAtributoAssignment_3_1 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3091:1: ( ( rule__Atributo__IdAtributoAssignment_3_1 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3092:1: ( rule__Atributo__IdAtributoAssignment_3_1 )
            {
             before(grammarAccess.getAtributoAccess().getIdAtributoAssignment_3_1()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3093:1: ( rule__Atributo__IdAtributoAssignment_3_1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3093:2: rule__Atributo__IdAtributoAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__IdAtributoAssignment_3_1_in_rule__Atributo__Group_3__1__Impl6064);
            rule__Atributo__IdAtributoAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getIdAtributoAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group_3__1__Impl"


    // $ANTLR start "rule__Atributo__Group_4__0"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3107:1: rule__Atributo__Group_4__0 : rule__Atributo__Group_4__0__Impl rule__Atributo__Group_4__1 ;
    public final void rule__Atributo__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3111:1: ( rule__Atributo__Group_4__0__Impl rule__Atributo__Group_4__1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3112:2: rule__Atributo__Group_4__0__Impl rule__Atributo__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_4__0__Impl_in_rule__Atributo__Group_4__06098);
            rule__Atributo__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_4__1_in_rule__Atributo__Group_4__06101);
            rule__Atributo__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group_4__0"


    // $ANTLR start "rule__Atributo__Group_4__0__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3119:1: rule__Atributo__Group_4__0__Impl : ( 'nombreAtributo' ) ;
    public final void rule__Atributo__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3123:1: ( ( 'nombreAtributo' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3124:1: ( 'nombreAtributo' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3124:1: ( 'nombreAtributo' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3125:1: 'nombreAtributo'
            {
             before(grammarAccess.getAtributoAccess().getNombreAtributoKeyword_4_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Atributo__Group_4__0__Impl6129); 
             after(grammarAccess.getAtributoAccess().getNombreAtributoKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group_4__0__Impl"


    // $ANTLR start "rule__Atributo__Group_4__1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3138:1: rule__Atributo__Group_4__1 : rule__Atributo__Group_4__1__Impl ;
    public final void rule__Atributo__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3142:1: ( rule__Atributo__Group_4__1__Impl )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3143:2: rule__Atributo__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_4__1__Impl_in_rule__Atributo__Group_4__16160);
            rule__Atributo__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group_4__1"


    // $ANTLR start "rule__Atributo__Group_4__1__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3149:1: rule__Atributo__Group_4__1__Impl : ( ( rule__Atributo__NombreAtributoAssignment_4_1 ) ) ;
    public final void rule__Atributo__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3153:1: ( ( ( rule__Atributo__NombreAtributoAssignment_4_1 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3154:1: ( ( rule__Atributo__NombreAtributoAssignment_4_1 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3154:1: ( ( rule__Atributo__NombreAtributoAssignment_4_1 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3155:1: ( rule__Atributo__NombreAtributoAssignment_4_1 )
            {
             before(grammarAccess.getAtributoAccess().getNombreAtributoAssignment_4_1()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3156:1: ( rule__Atributo__NombreAtributoAssignment_4_1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3156:2: rule__Atributo__NombreAtributoAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__NombreAtributoAssignment_4_1_in_rule__Atributo__Group_4__1__Impl6187);
            rule__Atributo__NombreAtributoAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getNombreAtributoAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group_4__1__Impl"


    // $ANTLR start "rule__Atributo__Group_5__0"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3170:1: rule__Atributo__Group_5__0 : rule__Atributo__Group_5__0__Impl rule__Atributo__Group_5__1 ;
    public final void rule__Atributo__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3174:1: ( rule__Atributo__Group_5__0__Impl rule__Atributo__Group_5__1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3175:2: rule__Atributo__Group_5__0__Impl rule__Atributo__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_5__0__Impl_in_rule__Atributo__Group_5__06221);
            rule__Atributo__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_5__1_in_rule__Atributo__Group_5__06224);
            rule__Atributo__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group_5__0"


    // $ANTLR start "rule__Atributo__Group_5__0__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3182:1: rule__Atributo__Group_5__0__Impl : ( 'valorAtributo' ) ;
    public final void rule__Atributo__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3186:1: ( ( 'valorAtributo' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3187:1: ( 'valorAtributo' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3187:1: ( 'valorAtributo' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3188:1: 'valorAtributo'
            {
             before(grammarAccess.getAtributoAccess().getValorAtributoKeyword_5_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Atributo__Group_5__0__Impl6252); 
             after(grammarAccess.getAtributoAccess().getValorAtributoKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group_5__0__Impl"


    // $ANTLR start "rule__Atributo__Group_5__1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3201:1: rule__Atributo__Group_5__1 : rule__Atributo__Group_5__1__Impl ;
    public final void rule__Atributo__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3205:1: ( rule__Atributo__Group_5__1__Impl )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3206:2: rule__Atributo__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_5__1__Impl_in_rule__Atributo__Group_5__16283);
            rule__Atributo__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group_5__1"


    // $ANTLR start "rule__Atributo__Group_5__1__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3212:1: rule__Atributo__Group_5__1__Impl : ( ( rule__Atributo__ValorAtributoAssignment_5_1 ) ) ;
    public final void rule__Atributo__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3216:1: ( ( ( rule__Atributo__ValorAtributoAssignment_5_1 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3217:1: ( ( rule__Atributo__ValorAtributoAssignment_5_1 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3217:1: ( ( rule__Atributo__ValorAtributoAssignment_5_1 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3218:1: ( rule__Atributo__ValorAtributoAssignment_5_1 )
            {
             before(grammarAccess.getAtributoAccess().getValorAtributoAssignment_5_1()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3219:1: ( rule__Atributo__ValorAtributoAssignment_5_1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3219:2: rule__Atributo__ValorAtributoAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__ValorAtributoAssignment_5_1_in_rule__Atributo__Group_5__1__Impl6310);
            rule__Atributo__ValorAtributoAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getValorAtributoAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group_5__1__Impl"


    // $ANTLR start "rule__Atributo__Group_6__0"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3233:1: rule__Atributo__Group_6__0 : rule__Atributo__Group_6__0__Impl rule__Atributo__Group_6__1 ;
    public final void rule__Atributo__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3237:1: ( rule__Atributo__Group_6__0__Impl rule__Atributo__Group_6__1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3238:2: rule__Atributo__Group_6__0__Impl rule__Atributo__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_6__0__Impl_in_rule__Atributo__Group_6__06344);
            rule__Atributo__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_6__1_in_rule__Atributo__Group_6__06347);
            rule__Atributo__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group_6__0"


    // $ANTLR start "rule__Atributo__Group_6__0__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3245:1: rule__Atributo__Group_6__0__Impl : ( 'tipoDato' ) ;
    public final void rule__Atributo__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3249:1: ( ( 'tipoDato' ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3250:1: ( 'tipoDato' )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3250:1: ( 'tipoDato' )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3251:1: 'tipoDato'
            {
             before(grammarAccess.getAtributoAccess().getTipoDatoKeyword_6_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Atributo__Group_6__0__Impl6375); 
             after(grammarAccess.getAtributoAccess().getTipoDatoKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group_6__0__Impl"


    // $ANTLR start "rule__Atributo__Group_6__1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3264:1: rule__Atributo__Group_6__1 : rule__Atributo__Group_6__1__Impl ;
    public final void rule__Atributo__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3268:1: ( rule__Atributo__Group_6__1__Impl )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3269:2: rule__Atributo__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__Group_6__1__Impl_in_rule__Atributo__Group_6__16406);
            rule__Atributo__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group_6__1"


    // $ANTLR start "rule__Atributo__Group_6__1__Impl"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3275:1: rule__Atributo__Group_6__1__Impl : ( ( rule__Atributo__TipoDatoAssignment_6_1 ) ) ;
    public final void rule__Atributo__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3279:1: ( ( ( rule__Atributo__TipoDatoAssignment_6_1 ) ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3280:1: ( ( rule__Atributo__TipoDatoAssignment_6_1 ) )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3280:1: ( ( rule__Atributo__TipoDatoAssignment_6_1 ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3281:1: ( rule__Atributo__TipoDatoAssignment_6_1 )
            {
             before(grammarAccess.getAtributoAccess().getTipoDatoAssignment_6_1()); 
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3282:1: ( rule__Atributo__TipoDatoAssignment_6_1 )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3282:2: rule__Atributo__TipoDatoAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atributo__TipoDatoAssignment_6_1_in_rule__Atributo__Group_6__1__Impl6433);
            rule__Atributo__TipoDatoAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getTipoDatoAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group_6__1__Impl"


    // $ANTLR start "rule__RootSistema__EmpresaAssignment_3"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3297:1: rule__RootSistema__EmpresaAssignment_3 : ( ruleEmpresa ) ;
    public final void rule__RootSistema__EmpresaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3301:1: ( ( ruleEmpresa ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3302:1: ( ruleEmpresa )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3302:1: ( ruleEmpresa )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3303:1: ruleEmpresa
            {
             before(grammarAccess.getRootSistemaAccess().getEmpresaEmpresaParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEmpresa_in_rule__RootSistema__EmpresaAssignment_36472);
            ruleEmpresa();

            state._fsp--;

             after(grammarAccess.getRootSistemaAccess().getEmpresaEmpresaParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootSistema__EmpresaAssignment_3"


    // $ANTLR start "rule__Empresa__NombreAssignment_2_1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3312:1: rule__Empresa__NombreAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Empresa__NombreAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3316:1: ( ( ruleEString ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3317:1: ( ruleEString )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3317:1: ( ruleEString )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3318:1: ruleEString
            {
             before(grammarAccess.getEmpresaAccess().getNombreEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Empresa__NombreAssignment_2_16503);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEmpresaAccess().getNombreEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__NombreAssignment_2_1"


    // $ANTLR start "rule__Empresa__DireccionAssignment_3_1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3327:1: rule__Empresa__DireccionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Empresa__DireccionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3331:1: ( ( ruleEString ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3332:1: ( ruleEString )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3332:1: ( ruleEString )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3333:1: ruleEString
            {
             before(grammarAccess.getEmpresaAccess().getDireccionEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Empresa__DireccionAssignment_3_16534);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEmpresaAccess().getDireccionEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__DireccionAssignment_3_1"


    // $ANTLR start "rule__Empresa__EmailAssignment_4_1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3342:1: rule__Empresa__EmailAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Empresa__EmailAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3346:1: ( ( ruleEString ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3347:1: ( ruleEString )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3347:1: ( ruleEString )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3348:1: ruleEString
            {
             before(grammarAccess.getEmpresaAccess().getEmailEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Empresa__EmailAssignment_4_16565);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEmpresaAccess().getEmailEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__EmailAssignment_4_1"


    // $ANTLR start "rule__Empresa__TelefonoAssignment_5_1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3357:1: rule__Empresa__TelefonoAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Empresa__TelefonoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3361:1: ( ( ruleEString ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3362:1: ( ruleEString )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3362:1: ( ruleEString )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3363:1: ruleEString
            {
             before(grammarAccess.getEmpresaAccess().getTelefonoEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Empresa__TelefonoAssignment_5_16596);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEmpresaAccess().getTelefonoEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__TelefonoAssignment_5_1"


    // $ANTLR start "rule__Empresa__DescripcionAssignment_6_1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3372:1: rule__Empresa__DescripcionAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Empresa__DescripcionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3376:1: ( ( ruleEString ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3377:1: ( ruleEString )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3377:1: ( ruleEString )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3378:1: ruleEString
            {
             before(grammarAccess.getEmpresaAccess().getDescripcionEStringParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Empresa__DescripcionAssignment_6_16627);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEmpresaAccess().getDescripcionEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__DescripcionAssignment_6_1"


    // $ANTLR start "rule__Empresa__UrlImagenAssignment_7_1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3387:1: rule__Empresa__UrlImagenAssignment_7_1 : ( ruleEString ) ;
    public final void rule__Empresa__UrlImagenAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3391:1: ( ( ruleEString ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3392:1: ( ruleEString )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3392:1: ( ruleEString )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3393:1: ruleEString
            {
             before(grammarAccess.getEmpresaAccess().getUrlImagenEStringParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Empresa__UrlImagenAssignment_7_16658);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEmpresaAccess().getUrlImagenEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__UrlImagenAssignment_7_1"


    // $ANTLR start "rule__Empresa__CatalogoAssignment_9"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3402:1: rule__Empresa__CatalogoAssignment_9 : ( ruleCatalogo ) ;
    public final void rule__Empresa__CatalogoAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3406:1: ( ( ruleCatalogo ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3407:1: ( ruleCatalogo )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3407:1: ( ruleCatalogo )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3408:1: ruleCatalogo
            {
             before(grammarAccess.getEmpresaAccess().getCatalogoCatalogoParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCatalogo_in_rule__Empresa__CatalogoAssignment_96689);
            ruleCatalogo();

            state._fsp--;

             after(grammarAccess.getEmpresaAccess().getCatalogoCatalogoParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empresa__CatalogoAssignment_9"


    // $ANTLR start "rule__Catalogo__IdCatalogoAssignment_2_1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3417:1: rule__Catalogo__IdCatalogoAssignment_2_1 : ( ruleELong ) ;
    public final void rule__Catalogo__IdCatalogoAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3421:1: ( ( ruleELong ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3422:1: ( ruleELong )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3422:1: ( ruleELong )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3423:1: ruleELong
            {
             before(grammarAccess.getCatalogoAccess().getIdCatalogoELongParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleELong_in_rule__Catalogo__IdCatalogoAssignment_2_16720);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getCatalogoAccess().getIdCatalogoELongParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__IdCatalogoAssignment_2_1"


    // $ANTLR start "rule__Catalogo__NombreAssignment_3_1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3432:1: rule__Catalogo__NombreAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Catalogo__NombreAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3436:1: ( ( ruleEString ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3437:1: ( ruleEString )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3437:1: ( ruleEString )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3438:1: ruleEString
            {
             before(grammarAccess.getCatalogoAccess().getNombreEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Catalogo__NombreAssignment_3_16751);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCatalogoAccess().getNombreEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__NombreAssignment_3_1"


    // $ANTLR start "rule__Catalogo__CategoriasAssignment_6"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3447:1: rule__Catalogo__CategoriasAssignment_6 : ( ruleCategoria ) ;
    public final void rule__Catalogo__CategoriasAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3451:1: ( ( ruleCategoria ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3452:1: ( ruleCategoria )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3452:1: ( ruleCategoria )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3453:1: ruleCategoria
            {
             before(grammarAccess.getCatalogoAccess().getCategoriasCategoriaParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCategoria_in_rule__Catalogo__CategoriasAssignment_66782);
            ruleCategoria();

            state._fsp--;

             after(grammarAccess.getCatalogoAccess().getCategoriasCategoriaParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__CategoriasAssignment_6"


    // $ANTLR start "rule__Catalogo__CategoriasAssignment_7_1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3462:1: rule__Catalogo__CategoriasAssignment_7_1 : ( ruleCategoria ) ;
    public final void rule__Catalogo__CategoriasAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3466:1: ( ( ruleCategoria ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3467:1: ( ruleCategoria )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3467:1: ( ruleCategoria )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3468:1: ruleCategoria
            {
             before(grammarAccess.getCatalogoAccess().getCategoriasCategoriaParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCategoria_in_rule__Catalogo__CategoriasAssignment_7_16813);
            ruleCategoria();

            state._fsp--;

             after(grammarAccess.getCatalogoAccess().getCategoriasCategoriaParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogo__CategoriasAssignment_7_1"


    // $ANTLR start "rule__Categoria__IdCategoriaAssignment_2_1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3477:1: rule__Categoria__IdCategoriaAssignment_2_1 : ( ruleELong ) ;
    public final void rule__Categoria__IdCategoriaAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3481:1: ( ( ruleELong ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3482:1: ( ruleELong )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3482:1: ( ruleELong )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3483:1: ruleELong
            {
             before(grammarAccess.getCategoriaAccess().getIdCategoriaELongParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleELong_in_rule__Categoria__IdCategoriaAssignment_2_16844);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getCategoriaAccess().getIdCategoriaELongParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__IdCategoriaAssignment_2_1"


    // $ANTLR start "rule__Categoria__NombreAssignment_3_1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3492:1: rule__Categoria__NombreAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Categoria__NombreAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3496:1: ( ( ruleEString ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3497:1: ( ruleEString )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3497:1: ( ruleEString )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3498:1: ruleEString
            {
             before(grammarAccess.getCategoriaAccess().getNombreEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Categoria__NombreAssignment_3_16875);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCategoriaAccess().getNombreEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__NombreAssignment_3_1"


    // $ANTLR start "rule__Categoria__ProductosAssignment_6"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3507:1: rule__Categoria__ProductosAssignment_6 : ( ruleProducto ) ;
    public final void rule__Categoria__ProductosAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3511:1: ( ( ruleProducto ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3512:1: ( ruleProducto )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3512:1: ( ruleProducto )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3513:1: ruleProducto
            {
             before(grammarAccess.getCategoriaAccess().getProductosProductoParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProducto_in_rule__Categoria__ProductosAssignment_66906);
            ruleProducto();

            state._fsp--;

             after(grammarAccess.getCategoriaAccess().getProductosProductoParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__ProductosAssignment_6"


    // $ANTLR start "rule__Categoria__ProductosAssignment_7_1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3522:1: rule__Categoria__ProductosAssignment_7_1 : ( ruleProducto ) ;
    public final void rule__Categoria__ProductosAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3526:1: ( ( ruleProducto ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3527:1: ( ruleProducto )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3527:1: ( ruleProducto )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3528:1: ruleProducto
            {
             before(grammarAccess.getCategoriaAccess().getProductosProductoParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProducto_in_rule__Categoria__ProductosAssignment_7_16937);
            ruleProducto();

            state._fsp--;

             after(grammarAccess.getCategoriaAccess().getProductosProductoParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__ProductosAssignment_7_1"


    // $ANTLR start "rule__Producto__IdProductoAssignment_2_1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3537:1: rule__Producto__IdProductoAssignment_2_1 : ( ruleELong ) ;
    public final void rule__Producto__IdProductoAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3541:1: ( ( ruleELong ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3542:1: ( ruleELong )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3542:1: ( ruleELong )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3543:1: ruleELong
            {
             before(grammarAccess.getProductoAccess().getIdProductoELongParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleELong_in_rule__Producto__IdProductoAssignment_2_16968);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getProductoAccess().getIdProductoELongParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__IdProductoAssignment_2_1"


    // $ANTLR start "rule__Producto__NombreAssignment_3_1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3552:1: rule__Producto__NombreAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Producto__NombreAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3556:1: ( ( ruleEString ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3557:1: ( ruleEString )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3557:1: ( ruleEString )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3558:1: ruleEString
            {
             before(grammarAccess.getProductoAccess().getNombreEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Producto__NombreAssignment_3_16999);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProductoAccess().getNombreEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__NombreAssignment_3_1"


    // $ANTLR start "rule__Producto__AtributosAssignment_6"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3567:1: rule__Producto__AtributosAssignment_6 : ( ruleAtributo ) ;
    public final void rule__Producto__AtributosAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3571:1: ( ( ruleAtributo ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3572:1: ( ruleAtributo )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3572:1: ( ruleAtributo )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3573:1: ruleAtributo
            {
             before(grammarAccess.getProductoAccess().getAtributosAtributoParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtributo_in_rule__Producto__AtributosAssignment_67030);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getProductoAccess().getAtributosAtributoParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__AtributosAssignment_6"


    // $ANTLR start "rule__Producto__AtributosAssignment_7_1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3582:1: rule__Producto__AtributosAssignment_7_1 : ( ruleAtributo ) ;
    public final void rule__Producto__AtributosAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3586:1: ( ( ruleAtributo ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3587:1: ( ruleAtributo )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3587:1: ( ruleAtributo )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3588:1: ruleAtributo
            {
             before(grammarAccess.getProductoAccess().getAtributosAtributoParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtributo_in_rule__Producto__AtributosAssignment_7_17061);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getProductoAccess().getAtributosAtributoParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__AtributosAssignment_7_1"


    // $ANTLR start "rule__Atributo__IdAtributoAssignment_3_1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3597:1: rule__Atributo__IdAtributoAssignment_3_1 : ( ruleELong ) ;
    public final void rule__Atributo__IdAtributoAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3601:1: ( ( ruleELong ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3602:1: ( ruleELong )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3602:1: ( ruleELong )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3603:1: ruleELong
            {
             before(grammarAccess.getAtributoAccess().getIdAtributoELongParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleELong_in_rule__Atributo__IdAtributoAssignment_3_17092);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getAtributoAccess().getIdAtributoELongParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__IdAtributoAssignment_3_1"


    // $ANTLR start "rule__Atributo__NombreAtributoAssignment_4_1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3612:1: rule__Atributo__NombreAtributoAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Atributo__NombreAtributoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3616:1: ( ( ruleEString ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3617:1: ( ruleEString )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3617:1: ( ruleEString )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3618:1: ruleEString
            {
             before(grammarAccess.getAtributoAccess().getNombreAtributoEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Atributo__NombreAtributoAssignment_4_17123);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtributoAccess().getNombreAtributoEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__NombreAtributoAssignment_4_1"


    // $ANTLR start "rule__Atributo__ValorAtributoAssignment_5_1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3627:1: rule__Atributo__ValorAtributoAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Atributo__ValorAtributoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3631:1: ( ( ruleEString ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3632:1: ( ruleEString )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3632:1: ( ruleEString )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3633:1: ruleEString
            {
             before(grammarAccess.getAtributoAccess().getValorAtributoEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Atributo__ValorAtributoAssignment_5_17154);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtributoAccess().getValorAtributoEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__ValorAtributoAssignment_5_1"


    // $ANTLR start "rule__Atributo__TipoDatoAssignment_6_1"
    // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3642:1: rule__Atributo__TipoDatoAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Atributo__TipoDatoAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3646:1: ( ( ruleEString ) )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3647:1: ( ruleEString )
            {
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3647:1: ( ruleEString )
            // ../org.xtext.catalogo.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCatalogo.g:3648:1: ruleEString
            {
             before(grammarAccess.getAtributoAccess().getTipoDatoEStringParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Atributo__TipoDatoAssignment_6_17185);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtributoAccess().getTipoDatoEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__TipoDatoAssignment_6_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRootSistema_in_entryRuleRootSistema61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRootSistema68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootSistema__Group__0_in_ruleRootSistema94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmpresa_in_entryRuleEmpresa121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmpresa128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group__0_in_ruleEmpresa154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCatalogo_in_entryRuleCatalogo241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCatalogo248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__0_in_ruleCatalogo274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleELong_in_entryRuleELong301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleELong308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ELong__Group__0_in_ruleELong334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCategoria_in_entryRuleCategoria361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCategoria368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Categoria__Group__0_in_ruleCategoria394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProducto_in_entryRuleProducto421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProducto428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Producto__Group__0_in_ruleProducto454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtributo_in_entryRuleAtributo481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtributo488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group__0_in_ruleAtributo514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootSistema__Group__0__Impl_in_rule__RootSistema__Group__0597 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__RootSistema__Group__1_in_rule__RootSistema__Group__0600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__RootSistema__Group__0__Impl628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootSistema__Group__1__Impl_in_rule__RootSistema__Group__1659 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__RootSistema__Group__2_in_rule__RootSistema__Group__1662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__RootSistema__Group__1__Impl690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootSistema__Group__2__Impl_in_rule__RootSistema__Group__2721 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__RootSistema__Group__3_in_rule__RootSistema__Group__2724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__RootSistema__Group__2__Impl752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootSistema__Group__3__Impl_in_rule__RootSistema__Group__3783 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__RootSistema__Group__4_in_rule__RootSistema__Group__3786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootSistema__EmpresaAssignment_3_in_rule__RootSistema__Group__3__Impl813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootSistema__Group__4__Impl_in_rule__RootSistema__Group__4843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RootSistema__Group__4__Impl871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group__0__Impl_in_rule__Empresa__Group__0912 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Empresa__Group__1_in_rule__Empresa__Group__0915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Empresa__Group__0__Impl943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group__1__Impl_in_rule__Empresa__Group__1974 = new BitSet(new long[]{0x00000000007F0000L});
        public static final BitSet FOLLOW_rule__Empresa__Group__2_in_rule__Empresa__Group__1977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Empresa__Group__1__Impl1005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group__2__Impl_in_rule__Empresa__Group__21036 = new BitSet(new long[]{0x00000000007F0000L});
        public static final BitSet FOLLOW_rule__Empresa__Group__3_in_rule__Empresa__Group__21039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group_2__0_in_rule__Empresa__Group__2__Impl1066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group__3__Impl_in_rule__Empresa__Group__31097 = new BitSet(new long[]{0x00000000007F0000L});
        public static final BitSet FOLLOW_rule__Empresa__Group__4_in_rule__Empresa__Group__31100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group_3__0_in_rule__Empresa__Group__3__Impl1127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group__4__Impl_in_rule__Empresa__Group__41158 = new BitSet(new long[]{0x00000000007F0000L});
        public static final BitSet FOLLOW_rule__Empresa__Group__5_in_rule__Empresa__Group__41161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group_4__0_in_rule__Empresa__Group__4__Impl1188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group__5__Impl_in_rule__Empresa__Group__51219 = new BitSet(new long[]{0x00000000007F0000L});
        public static final BitSet FOLLOW_rule__Empresa__Group__6_in_rule__Empresa__Group__51222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group_5__0_in_rule__Empresa__Group__5__Impl1249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group__6__Impl_in_rule__Empresa__Group__61280 = new BitSet(new long[]{0x00000000007F0000L});
        public static final BitSet FOLLOW_rule__Empresa__Group__7_in_rule__Empresa__Group__61283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group_6__0_in_rule__Empresa__Group__6__Impl1310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group__7__Impl_in_rule__Empresa__Group__71341 = new BitSet(new long[]{0x00000000007F0000L});
        public static final BitSet FOLLOW_rule__Empresa__Group__8_in_rule__Empresa__Group__71344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group_7__0_in_rule__Empresa__Group__7__Impl1371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group__8__Impl_in_rule__Empresa__Group__81402 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Empresa__Group__9_in_rule__Empresa__Group__81405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Empresa__Group__8__Impl1433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group__9__Impl_in_rule__Empresa__Group__91464 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Empresa__Group__10_in_rule__Empresa__Group__91467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__CatalogoAssignment_9_in_rule__Empresa__Group__9__Impl1494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group__10__Impl_in_rule__Empresa__Group__101524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Empresa__Group__10__Impl1552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group_2__0__Impl_in_rule__Empresa__Group_2__01605 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Empresa__Group_2__1_in_rule__Empresa__Group_2__01608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Empresa__Group_2__0__Impl1636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group_2__1__Impl_in_rule__Empresa__Group_2__11667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__NombreAssignment_2_1_in_rule__Empresa__Group_2__1__Impl1694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group_3__0__Impl_in_rule__Empresa__Group_3__01728 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Empresa__Group_3__1_in_rule__Empresa__Group_3__01731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Empresa__Group_3__0__Impl1759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group_3__1__Impl_in_rule__Empresa__Group_3__11790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__DireccionAssignment_3_1_in_rule__Empresa__Group_3__1__Impl1817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group_4__0__Impl_in_rule__Empresa__Group_4__01851 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Empresa__Group_4__1_in_rule__Empresa__Group_4__01854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Empresa__Group_4__0__Impl1882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group_4__1__Impl_in_rule__Empresa__Group_4__11913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__EmailAssignment_4_1_in_rule__Empresa__Group_4__1__Impl1940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group_5__0__Impl_in_rule__Empresa__Group_5__01974 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Empresa__Group_5__1_in_rule__Empresa__Group_5__01977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Empresa__Group_5__0__Impl2005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group_5__1__Impl_in_rule__Empresa__Group_5__12036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__TelefonoAssignment_5_1_in_rule__Empresa__Group_5__1__Impl2063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group_6__0__Impl_in_rule__Empresa__Group_6__02097 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Empresa__Group_6__1_in_rule__Empresa__Group_6__02100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Empresa__Group_6__0__Impl2128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group_6__1__Impl_in_rule__Empresa__Group_6__12159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__DescripcionAssignment_6_1_in_rule__Empresa__Group_6__1__Impl2186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group_7__0__Impl_in_rule__Empresa__Group_7__02220 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Empresa__Group_7__1_in_rule__Empresa__Group_7__02223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Empresa__Group_7__0__Impl2251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__Group_7__1__Impl_in_rule__Empresa__Group_7__12282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Empresa__UrlImagenAssignment_7_1_in_rule__Empresa__Group_7__1__Impl2309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__0__Impl_in_rule__Catalogo__Group__02343 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__1_in_rule__Catalogo__Group__02346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Catalogo__Group__0__Impl2374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__1__Impl_in_rule__Catalogo__Group__12405 = new BitSet(new long[]{0x0000000003020000L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__2_in_rule__Catalogo__Group__12408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Catalogo__Group__1__Impl2436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__2__Impl_in_rule__Catalogo__Group__22467 = new BitSet(new long[]{0x0000000003020000L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__3_in_rule__Catalogo__Group__22470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group_2__0_in_rule__Catalogo__Group__2__Impl2497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__3__Impl_in_rule__Catalogo__Group__32528 = new BitSet(new long[]{0x0000000003020000L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__4_in_rule__Catalogo__Group__32531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group_3__0_in_rule__Catalogo__Group__3__Impl2558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__4__Impl_in_rule__Catalogo__Group__42589 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__5_in_rule__Catalogo__Group__42592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Catalogo__Group__4__Impl2620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__5__Impl_in_rule__Catalogo__Group__52651 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__6_in_rule__Catalogo__Group__52654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Catalogo__Group__5__Impl2682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__6__Impl_in_rule__Catalogo__Group__62713 = new BitSet(new long[]{0x0000000004004000L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__7_in_rule__Catalogo__Group__62716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__CategoriasAssignment_6_in_rule__Catalogo__Group__6__Impl2743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__7__Impl_in_rule__Catalogo__Group__72773 = new BitSet(new long[]{0x0000000004004000L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__8_in_rule__Catalogo__Group__72776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group_7__0_in_rule__Catalogo__Group__7__Impl2803 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__8__Impl_in_rule__Catalogo__Group__82834 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__9_in_rule__Catalogo__Group__82837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Catalogo__Group__8__Impl2865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group__9__Impl_in_rule__Catalogo__Group__92896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Catalogo__Group__9__Impl2924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group_2__0__Impl_in_rule__Catalogo__Group_2__02975 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_rule__Catalogo__Group_2__1_in_rule__Catalogo__Group_2__02978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Catalogo__Group_2__0__Impl3006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group_2__1__Impl_in_rule__Catalogo__Group_2__13037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__IdCatalogoAssignment_2_1_in_rule__Catalogo__Group_2__1__Impl3064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group_3__0__Impl_in_rule__Catalogo__Group_3__03098 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Catalogo__Group_3__1_in_rule__Catalogo__Group_3__03101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Catalogo__Group_3__0__Impl3129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group_3__1__Impl_in_rule__Catalogo__Group_3__13160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__NombreAssignment_3_1_in_rule__Catalogo__Group_3__1__Impl3187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group_7__0__Impl_in_rule__Catalogo__Group_7__03221 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Catalogo__Group_7__1_in_rule__Catalogo__Group_7__03224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Catalogo__Group_7__0__Impl3252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__Group_7__1__Impl_in_rule__Catalogo__Group_7__13283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Catalogo__CategoriasAssignment_7_1_in_rule__Catalogo__Group_7__1__Impl3310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ELong__Group__0__Impl_in_rule__ELong__Group__03344 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_rule__ELong__Group__1_in_rule__ELong__Group__03347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ELong__Group__0__Impl3376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ELong__Group__1__Impl_in_rule__ELong__Group__13409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__ELong__Group__1__Impl3436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Categoria__Group__0__Impl_in_rule__Categoria__Group__03469 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Categoria__Group__1_in_rule__Categoria__Group__03472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Categoria__Group__0__Impl3500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Categoria__Group__1__Impl_in_rule__Categoria__Group__13531 = new BitSet(new long[]{0x0000000060020000L});
        public static final BitSet FOLLOW_rule__Categoria__Group__2_in_rule__Categoria__Group__13534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Categoria__Group__1__Impl3562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Categoria__Group__2__Impl_in_rule__Categoria__Group__23593 = new BitSet(new long[]{0x0000000060020000L});
        public static final BitSet FOLLOW_rule__Categoria__Group__3_in_rule__Categoria__Group__23596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Categoria__Group_2__0_in_rule__Categoria__Group__2__Impl3623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Categoria__Group__3__Impl_in_rule__Categoria__Group__33654 = new BitSet(new long[]{0x0000000060020000L});
        public static final BitSet FOLLOW_rule__Categoria__Group__4_in_rule__Categoria__Group__33657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Categoria__Group_3__0_in_rule__Categoria__Group__3__Impl3684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Categoria__Group__4__Impl_in_rule__Categoria__Group__43715 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Categoria__Group__5_in_rule__Categoria__Group__43718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Categoria__Group__4__Impl3746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Categoria__Group__5__Impl_in_rule__Categoria__Group__53777 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Categoria__Group__6_in_rule__Categoria__Group__53780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Categoria__Group__5__Impl3808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Categoria__Group__6__Impl_in_rule__Categoria__Group__63839 = new BitSet(new long[]{0x0000000004004000L});
        public static final BitSet FOLLOW_rule__Categoria__Group__7_in_rule__Categoria__Group__63842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Categoria__ProductosAssignment_6_in_rule__Categoria__Group__6__Impl3869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Categoria__Group__7__Impl_in_rule__Categoria__Group__73899 = new BitSet(new long[]{0x0000000004004000L});
        public static final BitSet FOLLOW_rule__Categoria__Group__8_in_rule__Categoria__Group__73902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Categoria__Group_7__0_in_rule__Categoria__Group__7__Impl3929 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Categoria__Group__8__Impl_in_rule__Categoria__Group__83960 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Categoria__Group__9_in_rule__Categoria__Group__83963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Categoria__Group__8__Impl3991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Categoria__Group__9__Impl_in_rule__Categoria__Group__94022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Categoria__Group__9__Impl4050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Categoria__Group_2__0__Impl_in_rule__Categoria__Group_2__04101 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_rule__Categoria__Group_2__1_in_rule__Categoria__Group_2__04104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Categoria__Group_2__0__Impl4132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Categoria__Group_2__1__Impl_in_rule__Categoria__Group_2__14163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Categoria__IdCategoriaAssignment_2_1_in_rule__Categoria__Group_2__1__Impl4190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Categoria__Group_3__0__Impl_in_rule__Categoria__Group_3__04224 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Categoria__Group_3__1_in_rule__Categoria__Group_3__04227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Categoria__Group_3__0__Impl4255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Categoria__Group_3__1__Impl_in_rule__Categoria__Group_3__14286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Categoria__NombreAssignment_3_1_in_rule__Categoria__Group_3__1__Impl4313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Categoria__Group_7__0__Impl_in_rule__Categoria__Group_7__04347 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Categoria__Group_7__1_in_rule__Categoria__Group_7__04350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Categoria__Group_7__0__Impl4378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Categoria__Group_7__1__Impl_in_rule__Categoria__Group_7__14409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Categoria__ProductosAssignment_7_1_in_rule__Categoria__Group_7__1__Impl4436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Producto__Group__0__Impl_in_rule__Producto__Group__04470 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Producto__Group__1_in_rule__Producto__Group__04473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Producto__Group__0__Impl4501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Producto__Group__1__Impl_in_rule__Producto__Group__14532 = new BitSet(new long[]{0x0000000300020000L});
        public static final BitSet FOLLOW_rule__Producto__Group__2_in_rule__Producto__Group__14535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Producto__Group__1__Impl4563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Producto__Group__2__Impl_in_rule__Producto__Group__24594 = new BitSet(new long[]{0x0000000300020000L});
        public static final BitSet FOLLOW_rule__Producto__Group__3_in_rule__Producto__Group__24597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Producto__Group_2__0_in_rule__Producto__Group__2__Impl4624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Producto__Group__3__Impl_in_rule__Producto__Group__34655 = new BitSet(new long[]{0x0000000300020000L});
        public static final BitSet FOLLOW_rule__Producto__Group__4_in_rule__Producto__Group__34658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Producto__Group_3__0_in_rule__Producto__Group__3__Impl4685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Producto__Group__4__Impl_in_rule__Producto__Group__44716 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Producto__Group__5_in_rule__Producto__Group__44719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Producto__Group__4__Impl4747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Producto__Group__5__Impl_in_rule__Producto__Group__54778 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Producto__Group__6_in_rule__Producto__Group__54781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Producto__Group__5__Impl4809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Producto__Group__6__Impl_in_rule__Producto__Group__64840 = new BitSet(new long[]{0x0000000004004000L});
        public static final BitSet FOLLOW_rule__Producto__Group__7_in_rule__Producto__Group__64843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Producto__AtributosAssignment_6_in_rule__Producto__Group__6__Impl4870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Producto__Group__7__Impl_in_rule__Producto__Group__74900 = new BitSet(new long[]{0x0000000004004000L});
        public static final BitSet FOLLOW_rule__Producto__Group__8_in_rule__Producto__Group__74903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Producto__Group_7__0_in_rule__Producto__Group__7__Impl4930 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Producto__Group__8__Impl_in_rule__Producto__Group__84961 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Producto__Group__9_in_rule__Producto__Group__84964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Producto__Group__8__Impl4992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Producto__Group__9__Impl_in_rule__Producto__Group__95023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Producto__Group__9__Impl5051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Producto__Group_2__0__Impl_in_rule__Producto__Group_2__05102 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_rule__Producto__Group_2__1_in_rule__Producto__Group_2__05105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Producto__Group_2__0__Impl5133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Producto__Group_2__1__Impl_in_rule__Producto__Group_2__15164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Producto__IdProductoAssignment_2_1_in_rule__Producto__Group_2__1__Impl5191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Producto__Group_3__0__Impl_in_rule__Producto__Group_3__05225 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Producto__Group_3__1_in_rule__Producto__Group_3__05228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Producto__Group_3__0__Impl5256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Producto__Group_3__1__Impl_in_rule__Producto__Group_3__15287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Producto__NombreAssignment_3_1_in_rule__Producto__Group_3__1__Impl5314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Producto__Group_7__0__Impl_in_rule__Producto__Group_7__05348 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Producto__Group_7__1_in_rule__Producto__Group_7__05351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Producto__Group_7__0__Impl5379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Producto__Group_7__1__Impl_in_rule__Producto__Group_7__15410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Producto__AtributosAssignment_7_1_in_rule__Producto__Group_7__1__Impl5437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group__0__Impl_in_rule__Atributo__Group__05471 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Atributo__Group__1_in_rule__Atributo__Group__05474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group__1__Impl_in_rule__Atributo__Group__15532 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Atributo__Group__2_in_rule__Atributo__Group__15535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Atributo__Group__1__Impl5563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group__2__Impl_in_rule__Atributo__Group__25594 = new BitSet(new long[]{0x0000007800004000L});
        public static final BitSet FOLLOW_rule__Atributo__Group__3_in_rule__Atributo__Group__25597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Atributo__Group__2__Impl5625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group__3__Impl_in_rule__Atributo__Group__35656 = new BitSet(new long[]{0x0000007800004000L});
        public static final BitSet FOLLOW_rule__Atributo__Group__4_in_rule__Atributo__Group__35659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group_3__0_in_rule__Atributo__Group__3__Impl5686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group__4__Impl_in_rule__Atributo__Group__45717 = new BitSet(new long[]{0x0000007800004000L});
        public static final BitSet FOLLOW_rule__Atributo__Group__5_in_rule__Atributo__Group__45720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group_4__0_in_rule__Atributo__Group__4__Impl5747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group__5__Impl_in_rule__Atributo__Group__55778 = new BitSet(new long[]{0x0000007800004000L});
        public static final BitSet FOLLOW_rule__Atributo__Group__6_in_rule__Atributo__Group__55781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group_5__0_in_rule__Atributo__Group__5__Impl5808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group__6__Impl_in_rule__Atributo__Group__65839 = new BitSet(new long[]{0x0000007800004000L});
        public static final BitSet FOLLOW_rule__Atributo__Group__7_in_rule__Atributo__Group__65842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group_6__0_in_rule__Atributo__Group__6__Impl5869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group__7__Impl_in_rule__Atributo__Group__75900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Atributo__Group__7__Impl5928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group_3__0__Impl_in_rule__Atributo__Group_3__05975 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_rule__Atributo__Group_3__1_in_rule__Atributo__Group_3__05978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Atributo__Group_3__0__Impl6006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group_3__1__Impl_in_rule__Atributo__Group_3__16037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__IdAtributoAssignment_3_1_in_rule__Atributo__Group_3__1__Impl6064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group_4__0__Impl_in_rule__Atributo__Group_4__06098 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Atributo__Group_4__1_in_rule__Atributo__Group_4__06101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Atributo__Group_4__0__Impl6129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group_4__1__Impl_in_rule__Atributo__Group_4__16160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__NombreAtributoAssignment_4_1_in_rule__Atributo__Group_4__1__Impl6187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group_5__0__Impl_in_rule__Atributo__Group_5__06221 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Atributo__Group_5__1_in_rule__Atributo__Group_5__06224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Atributo__Group_5__0__Impl6252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group_5__1__Impl_in_rule__Atributo__Group_5__16283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__ValorAtributoAssignment_5_1_in_rule__Atributo__Group_5__1__Impl6310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group_6__0__Impl_in_rule__Atributo__Group_6__06344 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Atributo__Group_6__1_in_rule__Atributo__Group_6__06347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Atributo__Group_6__0__Impl6375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__Group_6__1__Impl_in_rule__Atributo__Group_6__16406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atributo__TipoDatoAssignment_6_1_in_rule__Atributo__Group_6__1__Impl6433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmpresa_in_rule__RootSistema__EmpresaAssignment_36472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Empresa__NombreAssignment_2_16503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Empresa__DireccionAssignment_3_16534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Empresa__EmailAssignment_4_16565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Empresa__TelefonoAssignment_5_16596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Empresa__DescripcionAssignment_6_16627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Empresa__UrlImagenAssignment_7_16658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCatalogo_in_rule__Empresa__CatalogoAssignment_96689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleELong_in_rule__Catalogo__IdCatalogoAssignment_2_16720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Catalogo__NombreAssignment_3_16751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCategoria_in_rule__Catalogo__CategoriasAssignment_66782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCategoria_in_rule__Catalogo__CategoriasAssignment_7_16813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleELong_in_rule__Categoria__IdCategoriaAssignment_2_16844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Categoria__NombreAssignment_3_16875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProducto_in_rule__Categoria__ProductosAssignment_66906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProducto_in_rule__Categoria__ProductosAssignment_7_16937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleELong_in_rule__Producto__IdProductoAssignment_2_16968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Producto__NombreAssignment_3_16999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtributo_in_rule__Producto__AtributosAssignment_67030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtributo_in_rule__Producto__AtributosAssignment_7_17061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleELong_in_rule__Atributo__IdAtributoAssignment_3_17092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Atributo__NombreAtributoAssignment_4_17123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Atributo__ValorAtributoAssignment_5_17154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Atributo__TipoDatoAssignment_6_17185 = new BitSet(new long[]{0x0000000000000002L});
    }


}