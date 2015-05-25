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
import org.xtext.services.EstilosGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEstilosParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'android'", "'iOS'", "'web'", "'small'", "'medium'", "'large'", "'RootSistema'", "'{'", "'vistas'", "'}'", "','", "'Vista'", "'letra'", "'colorFondo'", "'tecnologia'", "'Letra'", "'colorLetra'", "'fuente'", "'tamano'", "'barraBusqueda'"
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
    public String getGrammarFileName() { return "../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g"; }


     
     	private EstilosGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EstilosGrammarAccess grammarAccess) {
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
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:60:1: entryRuleRootSistema : ruleRootSistema EOF ;
    public final void entryRuleRootSistema() throws RecognitionException {
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:61:1: ( ruleRootSistema EOF )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:62:1: ruleRootSistema EOF
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
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:69:1: ruleRootSistema : ( ( rule__RootSistema__Group__0 ) ) ;
    public final void ruleRootSistema() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:73:2: ( ( ( rule__RootSistema__Group__0 ) ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:74:1: ( ( rule__RootSistema__Group__0 ) )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:74:1: ( ( rule__RootSistema__Group__0 ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:75:1: ( rule__RootSistema__Group__0 )
            {
             before(grammarAccess.getRootSistemaAccess().getGroup()); 
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:76:1: ( rule__RootSistema__Group__0 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:76:2: rule__RootSistema__Group__0
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


    // $ANTLR start "entryRuleVista"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:88:1: entryRuleVista : ruleVista EOF ;
    public final void entryRuleVista() throws RecognitionException {
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:89:1: ( ruleVista EOF )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:90:1: ruleVista EOF
            {
             before(grammarAccess.getVistaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVista_in_entryRuleVista121);
            ruleVista();

            state._fsp--;

             after(grammarAccess.getVistaRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVista128); 

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
    // $ANTLR end "entryRuleVista"


    // $ANTLR start "ruleVista"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:97:1: ruleVista : ( ( rule__Vista__Group__0 ) ) ;
    public final void ruleVista() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:101:2: ( ( ( rule__Vista__Group__0 ) ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:102:1: ( ( rule__Vista__Group__0 ) )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:102:1: ( ( rule__Vista__Group__0 ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:103:1: ( rule__Vista__Group__0 )
            {
             before(grammarAccess.getVistaAccess().getGroup()); 
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:104:1: ( rule__Vista__Group__0 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:104:2: rule__Vista__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vista__Group__0_in_ruleVista154);
            rule__Vista__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVistaAccess().getGroup()); 

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
    // $ANTLR end "ruleVista"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:116:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:117:1: ( ruleEString EOF )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:118:1: ruleEString EOF
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
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:125:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:129:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:130:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:130:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:131:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:132:1: ( rule__EString__Alternatives )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:132:2: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleLetra"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:146:1: entryRuleLetra : ruleLetra EOF ;
    public final void entryRuleLetra() throws RecognitionException {
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:147:1: ( ruleLetra EOF )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:148:1: ruleLetra EOF
            {
             before(grammarAccess.getLetraRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLetra_in_entryRuleLetra243);
            ruleLetra();

            state._fsp--;

             after(grammarAccess.getLetraRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetra250); 

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
    // $ANTLR end "entryRuleLetra"


    // $ANTLR start "ruleLetra"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:155:1: ruleLetra : ( ( rule__Letra__Group__0 ) ) ;
    public final void ruleLetra() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:159:2: ( ( ( rule__Letra__Group__0 ) ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:160:1: ( ( rule__Letra__Group__0 ) )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:160:1: ( ( rule__Letra__Group__0 ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:161:1: ( rule__Letra__Group__0 )
            {
             before(grammarAccess.getLetraAccess().getGroup()); 
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:162:1: ( rule__Letra__Group__0 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:162:2: rule__Letra__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Letra__Group__0_in_ruleLetra276);
            rule__Letra__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLetraAccess().getGroup()); 

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
    // $ANTLR end "ruleLetra"


    // $ANTLR start "ruleTecnologia"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:175:1: ruleTecnologia : ( ( rule__Tecnologia__Alternatives ) ) ;
    public final void ruleTecnologia() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:179:1: ( ( ( rule__Tecnologia__Alternatives ) ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:180:1: ( ( rule__Tecnologia__Alternatives ) )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:180:1: ( ( rule__Tecnologia__Alternatives ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:181:1: ( rule__Tecnologia__Alternatives )
            {
             before(grammarAccess.getTecnologiaAccess().getAlternatives()); 
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:182:1: ( rule__Tecnologia__Alternatives )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:182:2: rule__Tecnologia__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Tecnologia__Alternatives_in_ruleTecnologia313);
            rule__Tecnologia__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTecnologiaAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTecnologia"


    // $ANTLR start "ruleTamanoLetra"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:194:1: ruleTamanoLetra : ( ( rule__TamanoLetra__Alternatives ) ) ;
    public final void ruleTamanoLetra() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:198:1: ( ( ( rule__TamanoLetra__Alternatives ) ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:199:1: ( ( rule__TamanoLetra__Alternatives ) )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:199:1: ( ( rule__TamanoLetra__Alternatives ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:200:1: ( rule__TamanoLetra__Alternatives )
            {
             before(grammarAccess.getTamanoLetraAccess().getAlternatives()); 
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:201:1: ( rule__TamanoLetra__Alternatives )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:201:2: rule__TamanoLetra__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__TamanoLetra__Alternatives_in_ruleTamanoLetra349);
            rule__TamanoLetra__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTamanoLetraAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTamanoLetra"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:212:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:216:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:217:1: ( RULE_STRING )
                    {
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:217:1: ( RULE_STRING )
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:218:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives384); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:223:6: ( RULE_ID )
                    {
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:223:6: ( RULE_ID )
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:224:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives401); 
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


    // $ANTLR start "rule__Tecnologia__Alternatives"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:235:1: rule__Tecnologia__Alternatives : ( ( ( 'android' ) ) | ( ( 'iOS' ) ) | ( ( 'web' ) ) );
    public final void rule__Tecnologia__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:239:1: ( ( ( 'android' ) ) | ( ( 'iOS' ) ) | ( ( 'web' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:240:1: ( ( 'android' ) )
                    {
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:240:1: ( ( 'android' ) )
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:241:1: ( 'android' )
                    {
                     before(grammarAccess.getTecnologiaAccess().getAndroidEnumLiteralDeclaration_0()); 
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:242:1: ( 'android' )
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:242:3: 'android'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__Tecnologia__Alternatives435); 

                    }

                     after(grammarAccess.getTecnologiaAccess().getAndroidEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:247:6: ( ( 'iOS' ) )
                    {
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:247:6: ( ( 'iOS' ) )
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:248:1: ( 'iOS' )
                    {
                     before(grammarAccess.getTecnologiaAccess().getIOSEnumLiteralDeclaration_1()); 
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:249:1: ( 'iOS' )
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:249:3: 'iOS'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__Tecnologia__Alternatives456); 

                    }

                     after(grammarAccess.getTecnologiaAccess().getIOSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:254:6: ( ( 'web' ) )
                    {
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:254:6: ( ( 'web' ) )
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:255:1: ( 'web' )
                    {
                     before(grammarAccess.getTecnologiaAccess().getWebEnumLiteralDeclaration_2()); 
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:256:1: ( 'web' )
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:256:3: 'web'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__Tecnologia__Alternatives477); 

                    }

                     after(grammarAccess.getTecnologiaAccess().getWebEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Tecnologia__Alternatives"


    // $ANTLR start "rule__TamanoLetra__Alternatives"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:266:1: rule__TamanoLetra__Alternatives : ( ( ( 'small' ) ) | ( ( 'medium' ) ) | ( ( 'large' ) ) );
    public final void rule__TamanoLetra__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:270:1: ( ( ( 'small' ) ) | ( ( 'medium' ) ) | ( ( 'large' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:271:1: ( ( 'small' ) )
                    {
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:271:1: ( ( 'small' ) )
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:272:1: ( 'small' )
                    {
                     before(grammarAccess.getTamanoLetraAccess().getSmallEnumLiteralDeclaration_0()); 
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:273:1: ( 'small' )
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:273:3: 'small'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__TamanoLetra__Alternatives513); 

                    }

                     after(grammarAccess.getTamanoLetraAccess().getSmallEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:278:6: ( ( 'medium' ) )
                    {
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:278:6: ( ( 'medium' ) )
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:279:1: ( 'medium' )
                    {
                     before(grammarAccess.getTamanoLetraAccess().getMediumEnumLiteralDeclaration_1()); 
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:280:1: ( 'medium' )
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:280:3: 'medium'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__TamanoLetra__Alternatives534); 

                    }

                     after(grammarAccess.getTamanoLetraAccess().getMediumEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:285:6: ( ( 'large' ) )
                    {
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:285:6: ( ( 'large' ) )
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:286:1: ( 'large' )
                    {
                     before(grammarAccess.getTamanoLetraAccess().getLargeEnumLiteralDeclaration_2()); 
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:287:1: ( 'large' )
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:287:3: 'large'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__TamanoLetra__Alternatives555); 

                    }

                     after(grammarAccess.getTamanoLetraAccess().getLargeEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__TamanoLetra__Alternatives"


    // $ANTLR start "rule__RootSistema__Group__0"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:299:1: rule__RootSistema__Group__0 : rule__RootSistema__Group__0__Impl rule__RootSistema__Group__1 ;
    public final void rule__RootSistema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:303:1: ( rule__RootSistema__Group__0__Impl rule__RootSistema__Group__1 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:304:2: rule__RootSistema__Group__0__Impl rule__RootSistema__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group__0__Impl_in_rule__RootSistema__Group__0588);
            rule__RootSistema__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group__1_in_rule__RootSistema__Group__0591);
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
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:311:1: rule__RootSistema__Group__0__Impl : ( 'RootSistema' ) ;
    public final void rule__RootSistema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:315:1: ( ( 'RootSistema' ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:316:1: ( 'RootSistema' )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:316:1: ( 'RootSistema' )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:317:1: 'RootSistema'
            {
             before(grammarAccess.getRootSistemaAccess().getRootSistemaKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__RootSistema__Group__0__Impl619); 
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
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:330:1: rule__RootSistema__Group__1 : rule__RootSistema__Group__1__Impl rule__RootSistema__Group__2 ;
    public final void rule__RootSistema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:334:1: ( rule__RootSistema__Group__1__Impl rule__RootSistema__Group__2 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:335:2: rule__RootSistema__Group__1__Impl rule__RootSistema__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group__1__Impl_in_rule__RootSistema__Group__1650);
            rule__RootSistema__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group__2_in_rule__RootSistema__Group__1653);
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
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:342:1: rule__RootSistema__Group__1__Impl : ( '{' ) ;
    public final void rule__RootSistema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:346:1: ( ( '{' ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:347:1: ( '{' )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:347:1: ( '{' )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:348:1: '{'
            {
             before(grammarAccess.getRootSistemaAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__RootSistema__Group__1__Impl681); 
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
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:361:1: rule__RootSistema__Group__2 : rule__RootSistema__Group__2__Impl rule__RootSistema__Group__3 ;
    public final void rule__RootSistema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:365:1: ( rule__RootSistema__Group__2__Impl rule__RootSistema__Group__3 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:366:2: rule__RootSistema__Group__2__Impl rule__RootSistema__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group__2__Impl_in_rule__RootSistema__Group__2712);
            rule__RootSistema__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group__3_in_rule__RootSistema__Group__2715);
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
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:373:1: rule__RootSistema__Group__2__Impl : ( 'vistas' ) ;
    public final void rule__RootSistema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:377:1: ( ( 'vistas' ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:378:1: ( 'vistas' )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:378:1: ( 'vistas' )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:379:1: 'vistas'
            {
             before(grammarAccess.getRootSistemaAccess().getVistasKeyword_2()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__RootSistema__Group__2__Impl743); 
             after(grammarAccess.getRootSistemaAccess().getVistasKeyword_2()); 

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
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:392:1: rule__RootSistema__Group__3 : rule__RootSistema__Group__3__Impl rule__RootSistema__Group__4 ;
    public final void rule__RootSistema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:396:1: ( rule__RootSistema__Group__3__Impl rule__RootSistema__Group__4 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:397:2: rule__RootSistema__Group__3__Impl rule__RootSistema__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group__3__Impl_in_rule__RootSistema__Group__3774);
            rule__RootSistema__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group__4_in_rule__RootSistema__Group__3777);
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
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:404:1: rule__RootSistema__Group__3__Impl : ( '{' ) ;
    public final void rule__RootSistema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:408:1: ( ( '{' ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:409:1: ( '{' )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:409:1: ( '{' )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:410:1: '{'
            {
             before(grammarAccess.getRootSistemaAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__RootSistema__Group__3__Impl805); 
             after(grammarAccess.getRootSistemaAccess().getLeftCurlyBracketKeyword_3()); 

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
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:423:1: rule__RootSistema__Group__4 : rule__RootSistema__Group__4__Impl rule__RootSistema__Group__5 ;
    public final void rule__RootSistema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:427:1: ( rule__RootSistema__Group__4__Impl rule__RootSistema__Group__5 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:428:2: rule__RootSistema__Group__4__Impl rule__RootSistema__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group__4__Impl_in_rule__RootSistema__Group__4836);
            rule__RootSistema__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group__5_in_rule__RootSistema__Group__4839);
            rule__RootSistema__Group__5();

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
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:435:1: rule__RootSistema__Group__4__Impl : ( ( rule__RootSistema__VistasAssignment_4 ) ) ;
    public final void rule__RootSistema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:439:1: ( ( ( rule__RootSistema__VistasAssignment_4 ) ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:440:1: ( ( rule__RootSistema__VistasAssignment_4 ) )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:440:1: ( ( rule__RootSistema__VistasAssignment_4 ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:441:1: ( rule__RootSistema__VistasAssignment_4 )
            {
             before(grammarAccess.getRootSistemaAccess().getVistasAssignment_4()); 
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:442:1: ( rule__RootSistema__VistasAssignment_4 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:442:2: rule__RootSistema__VistasAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__VistasAssignment_4_in_rule__RootSistema__Group__4__Impl866);
            rule__RootSistema__VistasAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRootSistemaAccess().getVistasAssignment_4()); 

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


    // $ANTLR start "rule__RootSistema__Group__5"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:452:1: rule__RootSistema__Group__5 : rule__RootSistema__Group__5__Impl rule__RootSistema__Group__6 ;
    public final void rule__RootSistema__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:456:1: ( rule__RootSistema__Group__5__Impl rule__RootSistema__Group__6 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:457:2: rule__RootSistema__Group__5__Impl rule__RootSistema__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group__5__Impl_in_rule__RootSistema__Group__5896);
            rule__RootSistema__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group__6_in_rule__RootSistema__Group__5899);
            rule__RootSistema__Group__6();

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
    // $ANTLR end "rule__RootSistema__Group__5"


    // $ANTLR start "rule__RootSistema__Group__5__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:464:1: rule__RootSistema__Group__5__Impl : ( ( rule__RootSistema__Group_5__0 )* ) ;
    public final void rule__RootSistema__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:468:1: ( ( ( rule__RootSistema__Group_5__0 )* ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:469:1: ( ( rule__RootSistema__Group_5__0 )* )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:469:1: ( ( rule__RootSistema__Group_5__0 )* )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:470:1: ( rule__RootSistema__Group_5__0 )*
            {
             before(grammarAccess.getRootSistemaAccess().getGroup_5()); 
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:471:1: ( rule__RootSistema__Group_5__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:471:2: rule__RootSistema__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group_5__0_in_rule__RootSistema__Group__5__Impl926);
            	    rule__RootSistema__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRootSistemaAccess().getGroup_5()); 

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
    // $ANTLR end "rule__RootSistema__Group__5__Impl"


    // $ANTLR start "rule__RootSistema__Group__6"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:481:1: rule__RootSistema__Group__6 : rule__RootSistema__Group__6__Impl rule__RootSistema__Group__7 ;
    public final void rule__RootSistema__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:485:1: ( rule__RootSistema__Group__6__Impl rule__RootSistema__Group__7 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:486:2: rule__RootSistema__Group__6__Impl rule__RootSistema__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group__6__Impl_in_rule__RootSistema__Group__6957);
            rule__RootSistema__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group__7_in_rule__RootSistema__Group__6960);
            rule__RootSistema__Group__7();

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
    // $ANTLR end "rule__RootSistema__Group__6"


    // $ANTLR start "rule__RootSistema__Group__6__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:493:1: rule__RootSistema__Group__6__Impl : ( '}' ) ;
    public final void rule__RootSistema__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:497:1: ( ( '}' ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:498:1: ( '}' )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:498:1: ( '}' )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:499:1: '}'
            {
             before(grammarAccess.getRootSistemaAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__RootSistema__Group__6__Impl988); 
             after(grammarAccess.getRootSistemaAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__RootSistema__Group__6__Impl"


    // $ANTLR start "rule__RootSistema__Group__7"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:512:1: rule__RootSistema__Group__7 : rule__RootSistema__Group__7__Impl ;
    public final void rule__RootSistema__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:516:1: ( rule__RootSistema__Group__7__Impl )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:517:2: rule__RootSistema__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group__7__Impl_in_rule__RootSistema__Group__71019);
            rule__RootSistema__Group__7__Impl();

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
    // $ANTLR end "rule__RootSistema__Group__7"


    // $ANTLR start "rule__RootSistema__Group__7__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:523:1: rule__RootSistema__Group__7__Impl : ( '}' ) ;
    public final void rule__RootSistema__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:527:1: ( ( '}' ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:528:1: ( '}' )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:528:1: ( '}' )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:529:1: '}'
            {
             before(grammarAccess.getRootSistemaAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__RootSistema__Group__7__Impl1047); 
             after(grammarAccess.getRootSistemaAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__RootSistema__Group__7__Impl"


    // $ANTLR start "rule__RootSistema__Group_5__0"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:558:1: rule__RootSistema__Group_5__0 : rule__RootSistema__Group_5__0__Impl rule__RootSistema__Group_5__1 ;
    public final void rule__RootSistema__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:562:1: ( rule__RootSistema__Group_5__0__Impl rule__RootSistema__Group_5__1 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:563:2: rule__RootSistema__Group_5__0__Impl rule__RootSistema__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group_5__0__Impl_in_rule__RootSistema__Group_5__01094);
            rule__RootSistema__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group_5__1_in_rule__RootSistema__Group_5__01097);
            rule__RootSistema__Group_5__1();

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
    // $ANTLR end "rule__RootSistema__Group_5__0"


    // $ANTLR start "rule__RootSistema__Group_5__0__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:570:1: rule__RootSistema__Group_5__0__Impl : ( ',' ) ;
    public final void rule__RootSistema__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:574:1: ( ( ',' ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:575:1: ( ',' )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:575:1: ( ',' )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:576:1: ','
            {
             before(grammarAccess.getRootSistemaAccess().getCommaKeyword_5_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__RootSistema__Group_5__0__Impl1125); 
             after(grammarAccess.getRootSistemaAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__RootSistema__Group_5__0__Impl"


    // $ANTLR start "rule__RootSistema__Group_5__1"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:589:1: rule__RootSistema__Group_5__1 : rule__RootSistema__Group_5__1__Impl ;
    public final void rule__RootSistema__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:593:1: ( rule__RootSistema__Group_5__1__Impl )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:594:2: rule__RootSistema__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__Group_5__1__Impl_in_rule__RootSistema__Group_5__11156);
            rule__RootSistema__Group_5__1__Impl();

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
    // $ANTLR end "rule__RootSistema__Group_5__1"


    // $ANTLR start "rule__RootSistema__Group_5__1__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:600:1: rule__RootSistema__Group_5__1__Impl : ( ( rule__RootSistema__VistasAssignment_5_1 ) ) ;
    public final void rule__RootSistema__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:604:1: ( ( ( rule__RootSistema__VistasAssignment_5_1 ) ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:605:1: ( ( rule__RootSistema__VistasAssignment_5_1 ) )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:605:1: ( ( rule__RootSistema__VistasAssignment_5_1 ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:606:1: ( rule__RootSistema__VistasAssignment_5_1 )
            {
             before(grammarAccess.getRootSistemaAccess().getVistasAssignment_5_1()); 
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:607:1: ( rule__RootSistema__VistasAssignment_5_1 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:607:2: rule__RootSistema__VistasAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootSistema__VistasAssignment_5_1_in_rule__RootSistema__Group_5__1__Impl1183);
            rule__RootSistema__VistasAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRootSistemaAccess().getVistasAssignment_5_1()); 

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
    // $ANTLR end "rule__RootSistema__Group_5__1__Impl"


    // $ANTLR start "rule__Vista__Group__0"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:621:1: rule__Vista__Group__0 : rule__Vista__Group__0__Impl rule__Vista__Group__1 ;
    public final void rule__Vista__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:625:1: ( rule__Vista__Group__0__Impl rule__Vista__Group__1 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:626:2: rule__Vista__Group__0__Impl rule__Vista__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vista__Group__0__Impl_in_rule__Vista__Group__01217);
            rule__Vista__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Vista__Group__1_in_rule__Vista__Group__01220);
            rule__Vista__Group__1();

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
    // $ANTLR end "rule__Vista__Group__0"


    // $ANTLR start "rule__Vista__Group__0__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:633:1: rule__Vista__Group__0__Impl : ( ( rule__Vista__BarraBusquedaAssignment_0 )? ) ;
    public final void rule__Vista__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:637:1: ( ( ( rule__Vista__BarraBusquedaAssignment_0 )? ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:638:1: ( ( rule__Vista__BarraBusquedaAssignment_0 )? )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:638:1: ( ( rule__Vista__BarraBusquedaAssignment_0 )? )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:639:1: ( rule__Vista__BarraBusquedaAssignment_0 )?
            {
             before(grammarAccess.getVistaAccess().getBarraBusquedaAssignment_0()); 
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:640:1: ( rule__Vista__BarraBusquedaAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:640:2: rule__Vista__BarraBusquedaAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Vista__BarraBusquedaAssignment_0_in_rule__Vista__Group__0__Impl1247);
                    rule__Vista__BarraBusquedaAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVistaAccess().getBarraBusquedaAssignment_0()); 

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
    // $ANTLR end "rule__Vista__Group__0__Impl"


    // $ANTLR start "rule__Vista__Group__1"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:650:1: rule__Vista__Group__1 : rule__Vista__Group__1__Impl rule__Vista__Group__2 ;
    public final void rule__Vista__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:654:1: ( rule__Vista__Group__1__Impl rule__Vista__Group__2 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:655:2: rule__Vista__Group__1__Impl rule__Vista__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vista__Group__1__Impl_in_rule__Vista__Group__11278);
            rule__Vista__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Vista__Group__2_in_rule__Vista__Group__11281);
            rule__Vista__Group__2();

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
    // $ANTLR end "rule__Vista__Group__1"


    // $ANTLR start "rule__Vista__Group__1__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:662:1: rule__Vista__Group__1__Impl : ( 'Vista' ) ;
    public final void rule__Vista__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:666:1: ( ( 'Vista' ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:667:1: ( 'Vista' )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:667:1: ( 'Vista' )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:668:1: 'Vista'
            {
             before(grammarAccess.getVistaAccess().getVistaKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Vista__Group__1__Impl1309); 
             after(grammarAccess.getVistaAccess().getVistaKeyword_1()); 

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
    // $ANTLR end "rule__Vista__Group__1__Impl"


    // $ANTLR start "rule__Vista__Group__2"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:681:1: rule__Vista__Group__2 : rule__Vista__Group__2__Impl rule__Vista__Group__3 ;
    public final void rule__Vista__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:685:1: ( rule__Vista__Group__2__Impl rule__Vista__Group__3 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:686:2: rule__Vista__Group__2__Impl rule__Vista__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vista__Group__2__Impl_in_rule__Vista__Group__21340);
            rule__Vista__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Vista__Group__3_in_rule__Vista__Group__21343);
            rule__Vista__Group__3();

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
    // $ANTLR end "rule__Vista__Group__2"


    // $ANTLR start "rule__Vista__Group__2__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:693:1: rule__Vista__Group__2__Impl : ( '{' ) ;
    public final void rule__Vista__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:697:1: ( ( '{' ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:698:1: ( '{' )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:698:1: ( '{' )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:699:1: '{'
            {
             before(grammarAccess.getVistaAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Vista__Group__2__Impl1371); 
             after(grammarAccess.getVistaAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Vista__Group__2__Impl"


    // $ANTLR start "rule__Vista__Group__3"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:712:1: rule__Vista__Group__3 : rule__Vista__Group__3__Impl rule__Vista__Group__4 ;
    public final void rule__Vista__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:716:1: ( rule__Vista__Group__3__Impl rule__Vista__Group__4 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:717:2: rule__Vista__Group__3__Impl rule__Vista__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vista__Group__3__Impl_in_rule__Vista__Group__31402);
            rule__Vista__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Vista__Group__4_in_rule__Vista__Group__31405);
            rule__Vista__Group__4();

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
    // $ANTLR end "rule__Vista__Group__3"


    // $ANTLR start "rule__Vista__Group__3__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:724:1: rule__Vista__Group__3__Impl : ( ( rule__Vista__Group_3__0 )? ) ;
    public final void rule__Vista__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:728:1: ( ( ( rule__Vista__Group_3__0 )? ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:729:1: ( ( rule__Vista__Group_3__0 )? )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:729:1: ( ( rule__Vista__Group_3__0 )? )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:730:1: ( rule__Vista__Group_3__0 )?
            {
             before(grammarAccess.getVistaAccess().getGroup_3()); 
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:731:1: ( rule__Vista__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:731:2: rule__Vista__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Vista__Group_3__0_in_rule__Vista__Group__3__Impl1432);
                    rule__Vista__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVistaAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Vista__Group__3__Impl"


    // $ANTLR start "rule__Vista__Group__4"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:741:1: rule__Vista__Group__4 : rule__Vista__Group__4__Impl rule__Vista__Group__5 ;
    public final void rule__Vista__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:745:1: ( rule__Vista__Group__4__Impl rule__Vista__Group__5 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:746:2: rule__Vista__Group__4__Impl rule__Vista__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vista__Group__4__Impl_in_rule__Vista__Group__41463);
            rule__Vista__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Vista__Group__5_in_rule__Vista__Group__41466);
            rule__Vista__Group__5();

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
    // $ANTLR end "rule__Vista__Group__4"


    // $ANTLR start "rule__Vista__Group__4__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:753:1: rule__Vista__Group__4__Impl : ( ( rule__Vista__Group_4__0 )? ) ;
    public final void rule__Vista__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:757:1: ( ( ( rule__Vista__Group_4__0 )? ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:758:1: ( ( rule__Vista__Group_4__0 )? )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:758:1: ( ( rule__Vista__Group_4__0 )? )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:759:1: ( rule__Vista__Group_4__0 )?
            {
             before(grammarAccess.getVistaAccess().getGroup_4()); 
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:760:1: ( rule__Vista__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:760:2: rule__Vista__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Vista__Group_4__0_in_rule__Vista__Group__4__Impl1493);
                    rule__Vista__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVistaAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Vista__Group__4__Impl"


    // $ANTLR start "rule__Vista__Group__5"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:770:1: rule__Vista__Group__5 : rule__Vista__Group__5__Impl rule__Vista__Group__6 ;
    public final void rule__Vista__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:774:1: ( rule__Vista__Group__5__Impl rule__Vista__Group__6 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:775:2: rule__Vista__Group__5__Impl rule__Vista__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vista__Group__5__Impl_in_rule__Vista__Group__51524);
            rule__Vista__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Vista__Group__6_in_rule__Vista__Group__51527);
            rule__Vista__Group__6();

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
    // $ANTLR end "rule__Vista__Group__5"


    // $ANTLR start "rule__Vista__Group__5__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:782:1: rule__Vista__Group__5__Impl : ( 'letra' ) ;
    public final void rule__Vista__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:786:1: ( ( 'letra' ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:787:1: ( 'letra' )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:787:1: ( 'letra' )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:788:1: 'letra'
            {
             before(grammarAccess.getVistaAccess().getLetraKeyword_5()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Vista__Group__5__Impl1555); 
             after(grammarAccess.getVistaAccess().getLetraKeyword_5()); 

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
    // $ANTLR end "rule__Vista__Group__5__Impl"


    // $ANTLR start "rule__Vista__Group__6"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:801:1: rule__Vista__Group__6 : rule__Vista__Group__6__Impl rule__Vista__Group__7 ;
    public final void rule__Vista__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:805:1: ( rule__Vista__Group__6__Impl rule__Vista__Group__7 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:806:2: rule__Vista__Group__6__Impl rule__Vista__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vista__Group__6__Impl_in_rule__Vista__Group__61586);
            rule__Vista__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Vista__Group__7_in_rule__Vista__Group__61589);
            rule__Vista__Group__7();

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
    // $ANTLR end "rule__Vista__Group__6"


    // $ANTLR start "rule__Vista__Group__6__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:813:1: rule__Vista__Group__6__Impl : ( ( rule__Vista__LetraAssignment_6 ) ) ;
    public final void rule__Vista__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:817:1: ( ( ( rule__Vista__LetraAssignment_6 ) ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:818:1: ( ( rule__Vista__LetraAssignment_6 ) )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:818:1: ( ( rule__Vista__LetraAssignment_6 ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:819:1: ( rule__Vista__LetraAssignment_6 )
            {
             before(grammarAccess.getVistaAccess().getLetraAssignment_6()); 
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:820:1: ( rule__Vista__LetraAssignment_6 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:820:2: rule__Vista__LetraAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vista__LetraAssignment_6_in_rule__Vista__Group__6__Impl1616);
            rule__Vista__LetraAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getVistaAccess().getLetraAssignment_6()); 

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
    // $ANTLR end "rule__Vista__Group__6__Impl"


    // $ANTLR start "rule__Vista__Group__7"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:830:1: rule__Vista__Group__7 : rule__Vista__Group__7__Impl ;
    public final void rule__Vista__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:834:1: ( rule__Vista__Group__7__Impl )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:835:2: rule__Vista__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vista__Group__7__Impl_in_rule__Vista__Group__71646);
            rule__Vista__Group__7__Impl();

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
    // $ANTLR end "rule__Vista__Group__7"


    // $ANTLR start "rule__Vista__Group__7__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:841:1: rule__Vista__Group__7__Impl : ( '}' ) ;
    public final void rule__Vista__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:845:1: ( ( '}' ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:846:1: ( '}' )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:846:1: ( '}' )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:847:1: '}'
            {
             before(grammarAccess.getVistaAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Vista__Group__7__Impl1674); 
             after(grammarAccess.getVistaAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Vista__Group__7__Impl"


    // $ANTLR start "rule__Vista__Group_3__0"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:876:1: rule__Vista__Group_3__0 : rule__Vista__Group_3__0__Impl rule__Vista__Group_3__1 ;
    public final void rule__Vista__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:880:1: ( rule__Vista__Group_3__0__Impl rule__Vista__Group_3__1 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:881:2: rule__Vista__Group_3__0__Impl rule__Vista__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vista__Group_3__0__Impl_in_rule__Vista__Group_3__01721);
            rule__Vista__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Vista__Group_3__1_in_rule__Vista__Group_3__01724);
            rule__Vista__Group_3__1();

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
    // $ANTLR end "rule__Vista__Group_3__0"


    // $ANTLR start "rule__Vista__Group_3__0__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:888:1: rule__Vista__Group_3__0__Impl : ( 'colorFondo' ) ;
    public final void rule__Vista__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:892:1: ( ( 'colorFondo' ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:893:1: ( 'colorFondo' )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:893:1: ( 'colorFondo' )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:894:1: 'colorFondo'
            {
             before(grammarAccess.getVistaAccess().getColorFondoKeyword_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Vista__Group_3__0__Impl1752); 
             after(grammarAccess.getVistaAccess().getColorFondoKeyword_3_0()); 

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
    // $ANTLR end "rule__Vista__Group_3__0__Impl"


    // $ANTLR start "rule__Vista__Group_3__1"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:907:1: rule__Vista__Group_3__1 : rule__Vista__Group_3__1__Impl ;
    public final void rule__Vista__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:911:1: ( rule__Vista__Group_3__1__Impl )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:912:2: rule__Vista__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vista__Group_3__1__Impl_in_rule__Vista__Group_3__11783);
            rule__Vista__Group_3__1__Impl();

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
    // $ANTLR end "rule__Vista__Group_3__1"


    // $ANTLR start "rule__Vista__Group_3__1__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:918:1: rule__Vista__Group_3__1__Impl : ( ( rule__Vista__ColorFondoAssignment_3_1 ) ) ;
    public final void rule__Vista__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:922:1: ( ( ( rule__Vista__ColorFondoAssignment_3_1 ) ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:923:1: ( ( rule__Vista__ColorFondoAssignment_3_1 ) )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:923:1: ( ( rule__Vista__ColorFondoAssignment_3_1 ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:924:1: ( rule__Vista__ColorFondoAssignment_3_1 )
            {
             before(grammarAccess.getVistaAccess().getColorFondoAssignment_3_1()); 
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:925:1: ( rule__Vista__ColorFondoAssignment_3_1 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:925:2: rule__Vista__ColorFondoAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vista__ColorFondoAssignment_3_1_in_rule__Vista__Group_3__1__Impl1810);
            rule__Vista__ColorFondoAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVistaAccess().getColorFondoAssignment_3_1()); 

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
    // $ANTLR end "rule__Vista__Group_3__1__Impl"


    // $ANTLR start "rule__Vista__Group_4__0"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:939:1: rule__Vista__Group_4__0 : rule__Vista__Group_4__0__Impl rule__Vista__Group_4__1 ;
    public final void rule__Vista__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:943:1: ( rule__Vista__Group_4__0__Impl rule__Vista__Group_4__1 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:944:2: rule__Vista__Group_4__0__Impl rule__Vista__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vista__Group_4__0__Impl_in_rule__Vista__Group_4__01844);
            rule__Vista__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Vista__Group_4__1_in_rule__Vista__Group_4__01847);
            rule__Vista__Group_4__1();

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
    // $ANTLR end "rule__Vista__Group_4__0"


    // $ANTLR start "rule__Vista__Group_4__0__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:951:1: rule__Vista__Group_4__0__Impl : ( 'tecnologia' ) ;
    public final void rule__Vista__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:955:1: ( ( 'tecnologia' ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:956:1: ( 'tecnologia' )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:956:1: ( 'tecnologia' )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:957:1: 'tecnologia'
            {
             before(grammarAccess.getVistaAccess().getTecnologiaKeyword_4_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Vista__Group_4__0__Impl1875); 
             after(grammarAccess.getVistaAccess().getTecnologiaKeyword_4_0()); 

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
    // $ANTLR end "rule__Vista__Group_4__0__Impl"


    // $ANTLR start "rule__Vista__Group_4__1"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:970:1: rule__Vista__Group_4__1 : rule__Vista__Group_4__1__Impl ;
    public final void rule__Vista__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:974:1: ( rule__Vista__Group_4__1__Impl )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:975:2: rule__Vista__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vista__Group_4__1__Impl_in_rule__Vista__Group_4__11906);
            rule__Vista__Group_4__1__Impl();

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
    // $ANTLR end "rule__Vista__Group_4__1"


    // $ANTLR start "rule__Vista__Group_4__1__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:981:1: rule__Vista__Group_4__1__Impl : ( ( rule__Vista__TecnologiaAssignment_4_1 ) ) ;
    public final void rule__Vista__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:985:1: ( ( ( rule__Vista__TecnologiaAssignment_4_1 ) ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:986:1: ( ( rule__Vista__TecnologiaAssignment_4_1 ) )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:986:1: ( ( rule__Vista__TecnologiaAssignment_4_1 ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:987:1: ( rule__Vista__TecnologiaAssignment_4_1 )
            {
             before(grammarAccess.getVistaAccess().getTecnologiaAssignment_4_1()); 
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:988:1: ( rule__Vista__TecnologiaAssignment_4_1 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:988:2: rule__Vista__TecnologiaAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Vista__TecnologiaAssignment_4_1_in_rule__Vista__Group_4__1__Impl1933);
            rule__Vista__TecnologiaAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVistaAccess().getTecnologiaAssignment_4_1()); 

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
    // $ANTLR end "rule__Vista__Group_4__1__Impl"


    // $ANTLR start "rule__Letra__Group__0"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1002:1: rule__Letra__Group__0 : rule__Letra__Group__0__Impl rule__Letra__Group__1 ;
    public final void rule__Letra__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1006:1: ( rule__Letra__Group__0__Impl rule__Letra__Group__1 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1007:2: rule__Letra__Group__0__Impl rule__Letra__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Letra__Group__0__Impl_in_rule__Letra__Group__01967);
            rule__Letra__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Letra__Group__1_in_rule__Letra__Group__01970);
            rule__Letra__Group__1();

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
    // $ANTLR end "rule__Letra__Group__0"


    // $ANTLR start "rule__Letra__Group__0__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1014:1: rule__Letra__Group__0__Impl : ( () ) ;
    public final void rule__Letra__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1018:1: ( ( () ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1019:1: ( () )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1019:1: ( () )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1020:1: ()
            {
             before(grammarAccess.getLetraAccess().getLetraAction_0()); 
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1021:1: ()
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1023:1: 
            {
            }

             after(grammarAccess.getLetraAccess().getLetraAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Letra__Group__0__Impl"


    // $ANTLR start "rule__Letra__Group__1"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1033:1: rule__Letra__Group__1 : rule__Letra__Group__1__Impl rule__Letra__Group__2 ;
    public final void rule__Letra__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1037:1: ( rule__Letra__Group__1__Impl rule__Letra__Group__2 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1038:2: rule__Letra__Group__1__Impl rule__Letra__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Letra__Group__1__Impl_in_rule__Letra__Group__12028);
            rule__Letra__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Letra__Group__2_in_rule__Letra__Group__12031);
            rule__Letra__Group__2();

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
    // $ANTLR end "rule__Letra__Group__1"


    // $ANTLR start "rule__Letra__Group__1__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1045:1: rule__Letra__Group__1__Impl : ( 'Letra' ) ;
    public final void rule__Letra__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1049:1: ( ( 'Letra' ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1050:1: ( 'Letra' )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1050:1: ( 'Letra' )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1051:1: 'Letra'
            {
             before(grammarAccess.getLetraAccess().getLetraKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Letra__Group__1__Impl2059); 
             after(grammarAccess.getLetraAccess().getLetraKeyword_1()); 

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
    // $ANTLR end "rule__Letra__Group__1__Impl"


    // $ANTLR start "rule__Letra__Group__2"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1064:1: rule__Letra__Group__2 : rule__Letra__Group__2__Impl rule__Letra__Group__3 ;
    public final void rule__Letra__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1068:1: ( rule__Letra__Group__2__Impl rule__Letra__Group__3 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1069:2: rule__Letra__Group__2__Impl rule__Letra__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Letra__Group__2__Impl_in_rule__Letra__Group__22090);
            rule__Letra__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Letra__Group__3_in_rule__Letra__Group__22093);
            rule__Letra__Group__3();

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
    // $ANTLR end "rule__Letra__Group__2"


    // $ANTLR start "rule__Letra__Group__2__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1076:1: rule__Letra__Group__2__Impl : ( '{' ) ;
    public final void rule__Letra__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1080:1: ( ( '{' ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1081:1: ( '{' )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1081:1: ( '{' )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1082:1: '{'
            {
             before(grammarAccess.getLetraAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Letra__Group__2__Impl2121); 
             after(grammarAccess.getLetraAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Letra__Group__2__Impl"


    // $ANTLR start "rule__Letra__Group__3"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1095:1: rule__Letra__Group__3 : rule__Letra__Group__3__Impl rule__Letra__Group__4 ;
    public final void rule__Letra__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1099:1: ( rule__Letra__Group__3__Impl rule__Letra__Group__4 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1100:2: rule__Letra__Group__3__Impl rule__Letra__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Letra__Group__3__Impl_in_rule__Letra__Group__32152);
            rule__Letra__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Letra__Group__4_in_rule__Letra__Group__32155);
            rule__Letra__Group__4();

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
    // $ANTLR end "rule__Letra__Group__3"


    // $ANTLR start "rule__Letra__Group__3__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1107:1: rule__Letra__Group__3__Impl : ( ( rule__Letra__Group_3__0 )? ) ;
    public final void rule__Letra__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1111:1: ( ( ( rule__Letra__Group_3__0 )? ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1112:1: ( ( rule__Letra__Group_3__0 )? )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1112:1: ( ( rule__Letra__Group_3__0 )? )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1113:1: ( rule__Letra__Group_3__0 )?
            {
             before(grammarAccess.getLetraAccess().getGroup_3()); 
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1114:1: ( rule__Letra__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1114:2: rule__Letra__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Letra__Group_3__0_in_rule__Letra__Group__3__Impl2182);
                    rule__Letra__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLetraAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Letra__Group__3__Impl"


    // $ANTLR start "rule__Letra__Group__4"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1124:1: rule__Letra__Group__4 : rule__Letra__Group__4__Impl rule__Letra__Group__5 ;
    public final void rule__Letra__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1128:1: ( rule__Letra__Group__4__Impl rule__Letra__Group__5 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1129:2: rule__Letra__Group__4__Impl rule__Letra__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Letra__Group__4__Impl_in_rule__Letra__Group__42213);
            rule__Letra__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Letra__Group__5_in_rule__Letra__Group__42216);
            rule__Letra__Group__5();

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
    // $ANTLR end "rule__Letra__Group__4"


    // $ANTLR start "rule__Letra__Group__4__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1136:1: rule__Letra__Group__4__Impl : ( ( rule__Letra__Group_4__0 )? ) ;
    public final void rule__Letra__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1140:1: ( ( ( rule__Letra__Group_4__0 )? ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1141:1: ( ( rule__Letra__Group_4__0 )? )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1141:1: ( ( rule__Letra__Group_4__0 )? )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1142:1: ( rule__Letra__Group_4__0 )?
            {
             before(grammarAccess.getLetraAccess().getGroup_4()); 
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1143:1: ( rule__Letra__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1143:2: rule__Letra__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Letra__Group_4__0_in_rule__Letra__Group__4__Impl2243);
                    rule__Letra__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLetraAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Letra__Group__4__Impl"


    // $ANTLR start "rule__Letra__Group__5"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1153:1: rule__Letra__Group__5 : rule__Letra__Group__5__Impl rule__Letra__Group__6 ;
    public final void rule__Letra__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1157:1: ( rule__Letra__Group__5__Impl rule__Letra__Group__6 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1158:2: rule__Letra__Group__5__Impl rule__Letra__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Letra__Group__5__Impl_in_rule__Letra__Group__52274);
            rule__Letra__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Letra__Group__6_in_rule__Letra__Group__52277);
            rule__Letra__Group__6();

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
    // $ANTLR end "rule__Letra__Group__5"


    // $ANTLR start "rule__Letra__Group__5__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1165:1: rule__Letra__Group__5__Impl : ( ( rule__Letra__Group_5__0 )? ) ;
    public final void rule__Letra__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1169:1: ( ( ( rule__Letra__Group_5__0 )? ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1170:1: ( ( rule__Letra__Group_5__0 )? )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1170:1: ( ( rule__Letra__Group_5__0 )? )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1171:1: ( rule__Letra__Group_5__0 )?
            {
             before(grammarAccess.getLetraAccess().getGroup_5()); 
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1172:1: ( rule__Letra__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1172:2: rule__Letra__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Letra__Group_5__0_in_rule__Letra__Group__5__Impl2304);
                    rule__Letra__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLetraAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Letra__Group__5__Impl"


    // $ANTLR start "rule__Letra__Group__6"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1182:1: rule__Letra__Group__6 : rule__Letra__Group__6__Impl ;
    public final void rule__Letra__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1186:1: ( rule__Letra__Group__6__Impl )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1187:2: rule__Letra__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Letra__Group__6__Impl_in_rule__Letra__Group__62335);
            rule__Letra__Group__6__Impl();

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
    // $ANTLR end "rule__Letra__Group__6"


    // $ANTLR start "rule__Letra__Group__6__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1193:1: rule__Letra__Group__6__Impl : ( '}' ) ;
    public final void rule__Letra__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1197:1: ( ( '}' ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1198:1: ( '}' )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1198:1: ( '}' )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1199:1: '}'
            {
             before(grammarAccess.getLetraAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Letra__Group__6__Impl2363); 
             after(grammarAccess.getLetraAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Letra__Group__6__Impl"


    // $ANTLR start "rule__Letra__Group_3__0"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1226:1: rule__Letra__Group_3__0 : rule__Letra__Group_3__0__Impl rule__Letra__Group_3__1 ;
    public final void rule__Letra__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1230:1: ( rule__Letra__Group_3__0__Impl rule__Letra__Group_3__1 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1231:2: rule__Letra__Group_3__0__Impl rule__Letra__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Letra__Group_3__0__Impl_in_rule__Letra__Group_3__02408);
            rule__Letra__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Letra__Group_3__1_in_rule__Letra__Group_3__02411);
            rule__Letra__Group_3__1();

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
    // $ANTLR end "rule__Letra__Group_3__0"


    // $ANTLR start "rule__Letra__Group_3__0__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1238:1: rule__Letra__Group_3__0__Impl : ( 'colorLetra' ) ;
    public final void rule__Letra__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1242:1: ( ( 'colorLetra' ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1243:1: ( 'colorLetra' )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1243:1: ( 'colorLetra' )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1244:1: 'colorLetra'
            {
             before(grammarAccess.getLetraAccess().getColorLetraKeyword_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Letra__Group_3__0__Impl2439); 
             after(grammarAccess.getLetraAccess().getColorLetraKeyword_3_0()); 

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
    // $ANTLR end "rule__Letra__Group_3__0__Impl"


    // $ANTLR start "rule__Letra__Group_3__1"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1257:1: rule__Letra__Group_3__1 : rule__Letra__Group_3__1__Impl ;
    public final void rule__Letra__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1261:1: ( rule__Letra__Group_3__1__Impl )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1262:2: rule__Letra__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Letra__Group_3__1__Impl_in_rule__Letra__Group_3__12470);
            rule__Letra__Group_3__1__Impl();

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
    // $ANTLR end "rule__Letra__Group_3__1"


    // $ANTLR start "rule__Letra__Group_3__1__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1268:1: rule__Letra__Group_3__1__Impl : ( ( rule__Letra__ColorLetraAssignment_3_1 ) ) ;
    public final void rule__Letra__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1272:1: ( ( ( rule__Letra__ColorLetraAssignment_3_1 ) ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1273:1: ( ( rule__Letra__ColorLetraAssignment_3_1 ) )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1273:1: ( ( rule__Letra__ColorLetraAssignment_3_1 ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1274:1: ( rule__Letra__ColorLetraAssignment_3_1 )
            {
             before(grammarAccess.getLetraAccess().getColorLetraAssignment_3_1()); 
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1275:1: ( rule__Letra__ColorLetraAssignment_3_1 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1275:2: rule__Letra__ColorLetraAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Letra__ColorLetraAssignment_3_1_in_rule__Letra__Group_3__1__Impl2497);
            rule__Letra__ColorLetraAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLetraAccess().getColorLetraAssignment_3_1()); 

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
    // $ANTLR end "rule__Letra__Group_3__1__Impl"


    // $ANTLR start "rule__Letra__Group_4__0"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1289:1: rule__Letra__Group_4__0 : rule__Letra__Group_4__0__Impl rule__Letra__Group_4__1 ;
    public final void rule__Letra__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1293:1: ( rule__Letra__Group_4__0__Impl rule__Letra__Group_4__1 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1294:2: rule__Letra__Group_4__0__Impl rule__Letra__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Letra__Group_4__0__Impl_in_rule__Letra__Group_4__02531);
            rule__Letra__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Letra__Group_4__1_in_rule__Letra__Group_4__02534);
            rule__Letra__Group_4__1();

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
    // $ANTLR end "rule__Letra__Group_4__0"


    // $ANTLR start "rule__Letra__Group_4__0__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1301:1: rule__Letra__Group_4__0__Impl : ( 'fuente' ) ;
    public final void rule__Letra__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1305:1: ( ( 'fuente' ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1306:1: ( 'fuente' )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1306:1: ( 'fuente' )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1307:1: 'fuente'
            {
             before(grammarAccess.getLetraAccess().getFuenteKeyword_4_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Letra__Group_4__0__Impl2562); 
             after(grammarAccess.getLetraAccess().getFuenteKeyword_4_0()); 

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
    // $ANTLR end "rule__Letra__Group_4__0__Impl"


    // $ANTLR start "rule__Letra__Group_4__1"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1320:1: rule__Letra__Group_4__1 : rule__Letra__Group_4__1__Impl ;
    public final void rule__Letra__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1324:1: ( rule__Letra__Group_4__1__Impl )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1325:2: rule__Letra__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Letra__Group_4__1__Impl_in_rule__Letra__Group_4__12593);
            rule__Letra__Group_4__1__Impl();

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
    // $ANTLR end "rule__Letra__Group_4__1"


    // $ANTLR start "rule__Letra__Group_4__1__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1331:1: rule__Letra__Group_4__1__Impl : ( ( rule__Letra__FuenteAssignment_4_1 ) ) ;
    public final void rule__Letra__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1335:1: ( ( ( rule__Letra__FuenteAssignment_4_1 ) ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1336:1: ( ( rule__Letra__FuenteAssignment_4_1 ) )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1336:1: ( ( rule__Letra__FuenteAssignment_4_1 ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1337:1: ( rule__Letra__FuenteAssignment_4_1 )
            {
             before(grammarAccess.getLetraAccess().getFuenteAssignment_4_1()); 
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1338:1: ( rule__Letra__FuenteAssignment_4_1 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1338:2: rule__Letra__FuenteAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Letra__FuenteAssignment_4_1_in_rule__Letra__Group_4__1__Impl2620);
            rule__Letra__FuenteAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLetraAccess().getFuenteAssignment_4_1()); 

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
    // $ANTLR end "rule__Letra__Group_4__1__Impl"


    // $ANTLR start "rule__Letra__Group_5__0"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1352:1: rule__Letra__Group_5__0 : rule__Letra__Group_5__0__Impl rule__Letra__Group_5__1 ;
    public final void rule__Letra__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1356:1: ( rule__Letra__Group_5__0__Impl rule__Letra__Group_5__1 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1357:2: rule__Letra__Group_5__0__Impl rule__Letra__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Letra__Group_5__0__Impl_in_rule__Letra__Group_5__02654);
            rule__Letra__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Letra__Group_5__1_in_rule__Letra__Group_5__02657);
            rule__Letra__Group_5__1();

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
    // $ANTLR end "rule__Letra__Group_5__0"


    // $ANTLR start "rule__Letra__Group_5__0__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1364:1: rule__Letra__Group_5__0__Impl : ( 'tamano' ) ;
    public final void rule__Letra__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1368:1: ( ( 'tamano' ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1369:1: ( 'tamano' )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1369:1: ( 'tamano' )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1370:1: 'tamano'
            {
             before(grammarAccess.getLetraAccess().getTamanoKeyword_5_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Letra__Group_5__0__Impl2685); 
             after(grammarAccess.getLetraAccess().getTamanoKeyword_5_0()); 

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
    // $ANTLR end "rule__Letra__Group_5__0__Impl"


    // $ANTLR start "rule__Letra__Group_5__1"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1383:1: rule__Letra__Group_5__1 : rule__Letra__Group_5__1__Impl ;
    public final void rule__Letra__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1387:1: ( rule__Letra__Group_5__1__Impl )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1388:2: rule__Letra__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Letra__Group_5__1__Impl_in_rule__Letra__Group_5__12716);
            rule__Letra__Group_5__1__Impl();

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
    // $ANTLR end "rule__Letra__Group_5__1"


    // $ANTLR start "rule__Letra__Group_5__1__Impl"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1394:1: rule__Letra__Group_5__1__Impl : ( ( rule__Letra__TamanoAssignment_5_1 ) ) ;
    public final void rule__Letra__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1398:1: ( ( ( rule__Letra__TamanoAssignment_5_1 ) ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1399:1: ( ( rule__Letra__TamanoAssignment_5_1 ) )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1399:1: ( ( rule__Letra__TamanoAssignment_5_1 ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1400:1: ( rule__Letra__TamanoAssignment_5_1 )
            {
             before(grammarAccess.getLetraAccess().getTamanoAssignment_5_1()); 
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1401:1: ( rule__Letra__TamanoAssignment_5_1 )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1401:2: rule__Letra__TamanoAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Letra__TamanoAssignment_5_1_in_rule__Letra__Group_5__1__Impl2743);
            rule__Letra__TamanoAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLetraAccess().getTamanoAssignment_5_1()); 

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
    // $ANTLR end "rule__Letra__Group_5__1__Impl"


    // $ANTLR start "rule__RootSistema__VistasAssignment_4"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1416:1: rule__RootSistema__VistasAssignment_4 : ( ruleVista ) ;
    public final void rule__RootSistema__VistasAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1420:1: ( ( ruleVista ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1421:1: ( ruleVista )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1421:1: ( ruleVista )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1422:1: ruleVista
            {
             before(grammarAccess.getRootSistemaAccess().getVistasVistaParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVista_in_rule__RootSistema__VistasAssignment_42782);
            ruleVista();

            state._fsp--;

             after(grammarAccess.getRootSistemaAccess().getVistasVistaParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__RootSistema__VistasAssignment_4"


    // $ANTLR start "rule__RootSistema__VistasAssignment_5_1"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1431:1: rule__RootSistema__VistasAssignment_5_1 : ( ruleVista ) ;
    public final void rule__RootSistema__VistasAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1435:1: ( ( ruleVista ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1436:1: ( ruleVista )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1436:1: ( ruleVista )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1437:1: ruleVista
            {
             before(grammarAccess.getRootSistemaAccess().getVistasVistaParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVista_in_rule__RootSistema__VistasAssignment_5_12813);
            ruleVista();

            state._fsp--;

             after(grammarAccess.getRootSistemaAccess().getVistasVistaParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__RootSistema__VistasAssignment_5_1"


    // $ANTLR start "rule__Vista__BarraBusquedaAssignment_0"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1446:1: rule__Vista__BarraBusquedaAssignment_0 : ( ( 'barraBusqueda' ) ) ;
    public final void rule__Vista__BarraBusquedaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1450:1: ( ( ( 'barraBusqueda' ) ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1451:1: ( ( 'barraBusqueda' ) )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1451:1: ( ( 'barraBusqueda' ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1452:1: ( 'barraBusqueda' )
            {
             before(grammarAccess.getVistaAccess().getBarraBusquedaBarraBusquedaKeyword_0_0()); 
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1453:1: ( 'barraBusqueda' )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1454:1: 'barraBusqueda'
            {
             before(grammarAccess.getVistaAccess().getBarraBusquedaBarraBusquedaKeyword_0_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Vista__BarraBusquedaAssignment_02849); 
             after(grammarAccess.getVistaAccess().getBarraBusquedaBarraBusquedaKeyword_0_0()); 

            }

             after(grammarAccess.getVistaAccess().getBarraBusquedaBarraBusquedaKeyword_0_0()); 

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
    // $ANTLR end "rule__Vista__BarraBusquedaAssignment_0"


    // $ANTLR start "rule__Vista__ColorFondoAssignment_3_1"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1469:1: rule__Vista__ColorFondoAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Vista__ColorFondoAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1473:1: ( ( ruleEString ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1474:1: ( ruleEString )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1474:1: ( ruleEString )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1475:1: ruleEString
            {
             before(grammarAccess.getVistaAccess().getColorFondoEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Vista__ColorFondoAssignment_3_12888);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVistaAccess().getColorFondoEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Vista__ColorFondoAssignment_3_1"


    // $ANTLR start "rule__Vista__TecnologiaAssignment_4_1"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1484:1: rule__Vista__TecnologiaAssignment_4_1 : ( ruleTecnologia ) ;
    public final void rule__Vista__TecnologiaAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1488:1: ( ( ruleTecnologia ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1489:1: ( ruleTecnologia )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1489:1: ( ruleTecnologia )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1490:1: ruleTecnologia
            {
             before(grammarAccess.getVistaAccess().getTecnologiaTecnologiaEnumRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTecnologia_in_rule__Vista__TecnologiaAssignment_4_12919);
            ruleTecnologia();

            state._fsp--;

             after(grammarAccess.getVistaAccess().getTecnologiaTecnologiaEnumRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Vista__TecnologiaAssignment_4_1"


    // $ANTLR start "rule__Vista__LetraAssignment_6"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1499:1: rule__Vista__LetraAssignment_6 : ( ruleLetra ) ;
    public final void rule__Vista__LetraAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1503:1: ( ( ruleLetra ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1504:1: ( ruleLetra )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1504:1: ( ruleLetra )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1505:1: ruleLetra
            {
             before(grammarAccess.getVistaAccess().getLetraLetraParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLetra_in_rule__Vista__LetraAssignment_62950);
            ruleLetra();

            state._fsp--;

             after(grammarAccess.getVistaAccess().getLetraLetraParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Vista__LetraAssignment_6"


    // $ANTLR start "rule__Letra__ColorLetraAssignment_3_1"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1514:1: rule__Letra__ColorLetraAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Letra__ColorLetraAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1518:1: ( ( ruleEString ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1519:1: ( ruleEString )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1519:1: ( ruleEString )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1520:1: ruleEString
            {
             before(grammarAccess.getLetraAccess().getColorLetraEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Letra__ColorLetraAssignment_3_12981);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLetraAccess().getColorLetraEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Letra__ColorLetraAssignment_3_1"


    // $ANTLR start "rule__Letra__FuenteAssignment_4_1"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1529:1: rule__Letra__FuenteAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Letra__FuenteAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1533:1: ( ( ruleEString ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1534:1: ( ruleEString )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1534:1: ( ruleEString )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1535:1: ruleEString
            {
             before(grammarAccess.getLetraAccess().getFuenteEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Letra__FuenteAssignment_4_13012);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLetraAccess().getFuenteEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Letra__FuenteAssignment_4_1"


    // $ANTLR start "rule__Letra__TamanoAssignment_5_1"
    // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1544:1: rule__Letra__TamanoAssignment_5_1 : ( ruleTamanoLetra ) ;
    public final void rule__Letra__TamanoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1548:1: ( ( ruleTamanoLetra ) )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1549:1: ( ruleTamanoLetra )
            {
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1549:1: ( ruleTamanoLetra )
            // ../org.xtext.estilos.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalEstilos.g:1550:1: ruleTamanoLetra
            {
             before(grammarAccess.getLetraAccess().getTamanoTamanoLetraEnumRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTamanoLetra_in_rule__Letra__TamanoAssignment_5_13043);
            ruleTamanoLetra();

            state._fsp--;

             after(grammarAccess.getLetraAccess().getTamanoTamanoLetraEnumRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Letra__TamanoAssignment_5_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRootSistema_in_entryRuleRootSistema61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRootSistema68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootSistema__Group__0_in_ruleRootSistema94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVista_in_entryRuleVista121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVista128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vista__Group__0_in_ruleVista154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetra_in_entryRuleLetra243 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetra250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Letra__Group__0_in_ruleLetra276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Tecnologia__Alternatives_in_ruleTecnologia313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TamanoLetra__Alternatives_in_ruleTamanoLetra349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Tecnologia__Alternatives435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Tecnologia__Alternatives456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Tecnologia__Alternatives477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TamanoLetra__Alternatives513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TamanoLetra__Alternatives534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TamanoLetra__Alternatives555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootSistema__Group__0__Impl_in_rule__RootSistema__Group__0588 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__RootSistema__Group__1_in_rule__RootSistema__Group__0591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__RootSistema__Group__0__Impl619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootSistema__Group__1__Impl_in_rule__RootSistema__Group__1650 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__RootSistema__Group__2_in_rule__RootSistema__Group__1653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__RootSistema__Group__1__Impl681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootSistema__Group__2__Impl_in_rule__RootSistema__Group__2712 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__RootSistema__Group__3_in_rule__RootSistema__Group__2715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__RootSistema__Group__2__Impl743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootSistema__Group__3__Impl_in_rule__RootSistema__Group__3774 = new BitSet(new long[]{0x0000000040400000L});
        public static final BitSet FOLLOW_rule__RootSistema__Group__4_in_rule__RootSistema__Group__3777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__RootSistema__Group__3__Impl805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootSistema__Group__4__Impl_in_rule__RootSistema__Group__4836 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_rule__RootSistema__Group__5_in_rule__RootSistema__Group__4839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootSistema__VistasAssignment_4_in_rule__RootSistema__Group__4__Impl866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootSistema__Group__5__Impl_in_rule__RootSistema__Group__5896 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_rule__RootSistema__Group__6_in_rule__RootSistema__Group__5899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootSistema__Group_5__0_in_rule__RootSistema__Group__5__Impl926 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_rule__RootSistema__Group__6__Impl_in_rule__RootSistema__Group__6957 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__RootSistema__Group__7_in_rule__RootSistema__Group__6960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__RootSistema__Group__6__Impl988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootSistema__Group__7__Impl_in_rule__RootSistema__Group__71019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__RootSistema__Group__7__Impl1047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootSistema__Group_5__0__Impl_in_rule__RootSistema__Group_5__01094 = new BitSet(new long[]{0x0000000040400000L});
        public static final BitSet FOLLOW_rule__RootSistema__Group_5__1_in_rule__RootSistema__Group_5__01097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__RootSistema__Group_5__0__Impl1125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootSistema__Group_5__1__Impl_in_rule__RootSistema__Group_5__11156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootSistema__VistasAssignment_5_1_in_rule__RootSistema__Group_5__1__Impl1183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vista__Group__0__Impl_in_rule__Vista__Group__01217 = new BitSet(new long[]{0x0000000040400000L});
        public static final BitSet FOLLOW_rule__Vista__Group__1_in_rule__Vista__Group__01220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vista__BarraBusquedaAssignment_0_in_rule__Vista__Group__0__Impl1247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vista__Group__1__Impl_in_rule__Vista__Group__11278 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Vista__Group__2_in_rule__Vista__Group__11281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Vista__Group__1__Impl1309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vista__Group__2__Impl_in_rule__Vista__Group__21340 = new BitSet(new long[]{0x0000000003800000L});
        public static final BitSet FOLLOW_rule__Vista__Group__3_in_rule__Vista__Group__21343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Vista__Group__2__Impl1371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vista__Group__3__Impl_in_rule__Vista__Group__31402 = new BitSet(new long[]{0x0000000003800000L});
        public static final BitSet FOLLOW_rule__Vista__Group__4_in_rule__Vista__Group__31405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vista__Group_3__0_in_rule__Vista__Group__3__Impl1432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vista__Group__4__Impl_in_rule__Vista__Group__41463 = new BitSet(new long[]{0x0000000003800000L});
        public static final BitSet FOLLOW_rule__Vista__Group__5_in_rule__Vista__Group__41466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vista__Group_4__0_in_rule__Vista__Group__4__Impl1493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vista__Group__5__Impl_in_rule__Vista__Group__51524 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Vista__Group__6_in_rule__Vista__Group__51527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Vista__Group__5__Impl1555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vista__Group__6__Impl_in_rule__Vista__Group__61586 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Vista__Group__7_in_rule__Vista__Group__61589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vista__LetraAssignment_6_in_rule__Vista__Group__6__Impl1616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vista__Group__7__Impl_in_rule__Vista__Group__71646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Vista__Group__7__Impl1674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vista__Group_3__0__Impl_in_rule__Vista__Group_3__01721 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Vista__Group_3__1_in_rule__Vista__Group_3__01724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Vista__Group_3__0__Impl1752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vista__Group_3__1__Impl_in_rule__Vista__Group_3__11783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vista__ColorFondoAssignment_3_1_in_rule__Vista__Group_3__1__Impl1810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vista__Group_4__0__Impl_in_rule__Vista__Group_4__01844 = new BitSet(new long[]{0x0000000000003800L});
        public static final BitSet FOLLOW_rule__Vista__Group_4__1_in_rule__Vista__Group_4__01847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Vista__Group_4__0__Impl1875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vista__Group_4__1__Impl_in_rule__Vista__Group_4__11906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Vista__TecnologiaAssignment_4_1_in_rule__Vista__Group_4__1__Impl1933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Letra__Group__0__Impl_in_rule__Letra__Group__01967 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Letra__Group__1_in_rule__Letra__Group__01970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Letra__Group__1__Impl_in_rule__Letra__Group__12028 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Letra__Group__2_in_rule__Letra__Group__12031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Letra__Group__1__Impl2059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Letra__Group__2__Impl_in_rule__Letra__Group__22090 = new BitSet(new long[]{0x0000000038100000L});
        public static final BitSet FOLLOW_rule__Letra__Group__3_in_rule__Letra__Group__22093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Letra__Group__2__Impl2121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Letra__Group__3__Impl_in_rule__Letra__Group__32152 = new BitSet(new long[]{0x0000000038100000L});
        public static final BitSet FOLLOW_rule__Letra__Group__4_in_rule__Letra__Group__32155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Letra__Group_3__0_in_rule__Letra__Group__3__Impl2182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Letra__Group__4__Impl_in_rule__Letra__Group__42213 = new BitSet(new long[]{0x0000000038100000L});
        public static final BitSet FOLLOW_rule__Letra__Group__5_in_rule__Letra__Group__42216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Letra__Group_4__0_in_rule__Letra__Group__4__Impl2243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Letra__Group__5__Impl_in_rule__Letra__Group__52274 = new BitSet(new long[]{0x0000000038100000L});
        public static final BitSet FOLLOW_rule__Letra__Group__6_in_rule__Letra__Group__52277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Letra__Group_5__0_in_rule__Letra__Group__5__Impl2304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Letra__Group__6__Impl_in_rule__Letra__Group__62335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Letra__Group__6__Impl2363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Letra__Group_3__0__Impl_in_rule__Letra__Group_3__02408 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Letra__Group_3__1_in_rule__Letra__Group_3__02411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Letra__Group_3__0__Impl2439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Letra__Group_3__1__Impl_in_rule__Letra__Group_3__12470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Letra__ColorLetraAssignment_3_1_in_rule__Letra__Group_3__1__Impl2497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Letra__Group_4__0__Impl_in_rule__Letra__Group_4__02531 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Letra__Group_4__1_in_rule__Letra__Group_4__02534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Letra__Group_4__0__Impl2562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Letra__Group_4__1__Impl_in_rule__Letra__Group_4__12593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Letra__FuenteAssignment_4_1_in_rule__Letra__Group_4__1__Impl2620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Letra__Group_5__0__Impl_in_rule__Letra__Group_5__02654 = new BitSet(new long[]{0x000000000001C000L});
        public static final BitSet FOLLOW_rule__Letra__Group_5__1_in_rule__Letra__Group_5__02657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Letra__Group_5__0__Impl2685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Letra__Group_5__1__Impl_in_rule__Letra__Group_5__12716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Letra__TamanoAssignment_5_1_in_rule__Letra__Group_5__1__Impl2743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVista_in_rule__RootSistema__VistasAssignment_42782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVista_in_rule__RootSistema__VistasAssignment_5_12813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Vista__BarraBusquedaAssignment_02849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Vista__ColorFondoAssignment_3_12888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTecnologia_in_rule__Vista__TecnologiaAssignment_4_12919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetra_in_rule__Vista__LetraAssignment_62950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Letra__ColorLetraAssignment_3_12981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Letra__FuenteAssignment_4_13012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTamanoLetra_in_rule__Letra__TamanoAssignment_5_13043 = new BitSet(new long[]{0x0000000000000002L});
    }


}