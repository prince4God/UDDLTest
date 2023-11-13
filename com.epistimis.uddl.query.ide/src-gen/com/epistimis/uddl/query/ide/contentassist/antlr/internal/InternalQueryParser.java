package com.epistimis.uddl.query.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.epistimis.uddl.query.services.QueryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQueryParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Select", "From", "Semicolon", "RULE_ALL_CHARACTERISTICS", "RULE_KW_ALL", "RULE_KW_SOME", "RULE_KW_EXISTS", "RULE_KW_NOT", "RULE_KW_IN", "RULE_KW_AND", "RULE_KW_OR", "RULE_KW_AS", "RULE_KW_DISTINCT", "RULE_KW_WHERE", "RULE_KW_BY", "RULE_KW_JOIN", "RULE_KW_ON", "RULE_KW_ORDER", "RULE_KW_ASC", "RULE_KW_DESC", "RULE_EQUALS_OPERATOR", "RULE_NOT_EQUALS_OPERATOR", "RULE_LESS_THAN_OPERATOR", "RULE_GREATER_THAN_OPERATOR", "RULE_GREATER_THAN_OR_EQUALS_OPERATOR", "RULE_LESS_THAN_OR_EQUALS_OPERATOR", "RULE_COMMA", "RULE_LEFT_PAREN", "RULE_RIGHT_PAREN", "RULE_PERIOD", "RULE_LEFT_BRACE", "RULE_RIGHT_BRACE", "RULE_COLON", "RULE_LETTER", "RULE_DIGITAL_LITERAL", "RULE_IDENTIFIER", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_KW_AND=13;
    public static final int RULE_KW_ON=20;
    public static final int RULE_KW_NOT=11;
    public static final int RULE_LESS_THAN_OPERATOR=26;
    public static final int RULE_KW_BY=18;
    public static final int RULE_ALL_CHARACTERISTICS=7;
    public static final int RULE_EQUALS_OPERATOR=24;
    public static final int RULE_KW_OR=14;
    public static final int RULE_ID=40;
    public static final int RULE_KW_ORDER=21;
    public static final int RULE_COMMA=30;
    public static final int RULE_KW_ASC=22;
    public static final int RULE_KW_DESC=23;
    public static final int RULE_COLON=36;
    public static final int RULE_LEFT_BRACE=34;
    public static final int RULE_KW_JOIN=19;
    public static final int RULE_INT=41;
    public static final int RULE_ML_COMMENT=43;
    public static final int RULE_NOT_EQUALS_OPERATOR=25;
    public static final int RULE_LEFT_PAREN=31;
    public static final int RULE_IDENTIFIER=39;
    public static final int RULE_GREATER_THAN_OPERATOR=27;
    public static final int RULE_STRING=42;
    public static final int RULE_LESS_THAN_OR_EQUALS_OPERATOR=29;
    public static final int RULE_SL_COMMENT=44;
    public static final int RULE_KW_SOME=9;
    public static final int RULE_KW_ALL=8;
    public static final int RULE_RIGHT_BRACE=35;
    public static final int RULE_KW_IN=12;
    public static final int EOF=-1;
    public static final int RULE_KW_WHERE=17;
    public static final int RULE_DIGITAL_LITERAL=38;
    public static final int RULE_KW_EXISTS=10;
    public static final int RULE_WS=45;
    public static final int RULE_PERIOD=33;
    public static final int From=5;
    public static final int RULE_ANY_OTHER=46;
    public static final int RULE_KW_AS=15;
    public static final int Semicolon=6;
    public static final int RULE_LETTER=37;
    public static final int RULE_GREATER_THAN_OR_EQUALS_OPERATOR=28;
    public static final int RULE_KW_DISTINCT=16;
    public static final int Select=4;
    public static final int RULE_RIGHT_PAREN=32;

    // delegates
    // delegators


        public InternalQueryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQueryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQueryParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQueryParser.g"; }


    	private QueryGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Semicolon", "';'");
    		tokenNameToValue.put("From", "'from'");
    		tokenNameToValue.put("Select", "'select'");
    	}

    	public void setGrammarAccess(QueryGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleQuerySpecification"
    // InternalQueryParser.g:61:1: entryRuleQuerySpecification : ruleQuerySpecification EOF ;
    public final void entryRuleQuerySpecification() throws RecognitionException {
        try {
            // InternalQueryParser.g:62:1: ( ruleQuerySpecification EOF )
            // InternalQueryParser.g:63:1: ruleQuerySpecification EOF
            {
             before(grammarAccess.getQuerySpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleQuerySpecification();

            state._fsp--;

             after(grammarAccess.getQuerySpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuerySpecification"


    // $ANTLR start "ruleQuerySpecification"
    // InternalQueryParser.g:70:1: ruleQuerySpecification : ( ruleQueryStatement ) ;
    public final void ruleQuerySpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:74:2: ( ( ruleQueryStatement ) )
            // InternalQueryParser.g:75:2: ( ruleQueryStatement )
            {
            // InternalQueryParser.g:75:2: ( ruleQueryStatement )
            // InternalQueryParser.g:76:3: ruleQueryStatement
            {
             before(grammarAccess.getQuerySpecificationAccess().getQueryStatementParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleQueryStatement();

            state._fsp--;

             after(grammarAccess.getQuerySpecificationAccess().getQueryStatementParserRuleCall()); 

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
    // $ANTLR end "ruleQuerySpecification"


    // $ANTLR start "entryRuleQueryStatement"
    // InternalQueryParser.g:86:1: entryRuleQueryStatement : ruleQueryStatement EOF ;
    public final void entryRuleQueryStatement() throws RecognitionException {
        try {
            // InternalQueryParser.g:87:1: ( ruleQueryStatement EOF )
            // InternalQueryParser.g:88:1: ruleQueryStatement EOF
            {
             before(grammarAccess.getQueryStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleQueryStatement();

            state._fsp--;

             after(grammarAccess.getQueryStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQueryStatement"


    // $ANTLR start "ruleQueryStatement"
    // InternalQueryParser.g:95:1: ruleQueryStatement : ( ( rule__QueryStatement__Group__0 ) ) ;
    public final void ruleQueryStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:99:2: ( ( ( rule__QueryStatement__Group__0 ) ) )
            // InternalQueryParser.g:100:2: ( ( rule__QueryStatement__Group__0 ) )
            {
            // InternalQueryParser.g:100:2: ( ( rule__QueryStatement__Group__0 ) )
            // InternalQueryParser.g:101:3: ( rule__QueryStatement__Group__0 )
            {
             before(grammarAccess.getQueryStatementAccess().getGroup()); 
            // InternalQueryParser.g:102:3: ( rule__QueryStatement__Group__0 )
            // InternalQueryParser.g:102:4: rule__QueryStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QueryStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleQueryStatement"


    // $ANTLR start "entryRuleSetQualifier"
    // InternalQueryParser.g:111:1: entryRuleSetQualifier : ruleSetQualifier EOF ;
    public final void entryRuleSetQualifier() throws RecognitionException {
        try {
            // InternalQueryParser.g:112:1: ( ruleSetQualifier EOF )
            // InternalQueryParser.g:113:1: ruleSetQualifier EOF
            {
             before(grammarAccess.getSetQualifierRule()); 
            pushFollow(FOLLOW_1);
            ruleSetQualifier();

            state._fsp--;

             after(grammarAccess.getSetQualifierRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSetQualifier"


    // $ANTLR start "ruleSetQualifier"
    // InternalQueryParser.g:120:1: ruleSetQualifier : ( ( rule__SetQualifier__Alternatives ) ) ;
    public final void ruleSetQualifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:124:2: ( ( ( rule__SetQualifier__Alternatives ) ) )
            // InternalQueryParser.g:125:2: ( ( rule__SetQualifier__Alternatives ) )
            {
            // InternalQueryParser.g:125:2: ( ( rule__SetQualifier__Alternatives ) )
            // InternalQueryParser.g:126:3: ( rule__SetQualifier__Alternatives )
            {
             before(grammarAccess.getSetQualifierAccess().getAlternatives()); 
            // InternalQueryParser.g:127:3: ( rule__SetQualifier__Alternatives )
            // InternalQueryParser.g:127:4: rule__SetQualifier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SetQualifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSetQualifierAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSetQualifier"


    // $ANTLR start "entryRuleProjectedCharacteristicList"
    // InternalQueryParser.g:136:1: entryRuleProjectedCharacteristicList : ruleProjectedCharacteristicList EOF ;
    public final void entryRuleProjectedCharacteristicList() throws RecognitionException {
        try {
            // InternalQueryParser.g:137:1: ( ruleProjectedCharacteristicList EOF )
            // InternalQueryParser.g:138:1: ruleProjectedCharacteristicList EOF
            {
             before(grammarAccess.getProjectedCharacteristicListRule()); 
            pushFollow(FOLLOW_1);
            ruleProjectedCharacteristicList();

            state._fsp--;

             after(grammarAccess.getProjectedCharacteristicListRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProjectedCharacteristicList"


    // $ANTLR start "ruleProjectedCharacteristicList"
    // InternalQueryParser.g:145:1: ruleProjectedCharacteristicList : ( ( rule__ProjectedCharacteristicList__Alternatives ) ) ;
    public final void ruleProjectedCharacteristicList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:149:2: ( ( ( rule__ProjectedCharacteristicList__Alternatives ) ) )
            // InternalQueryParser.g:150:2: ( ( rule__ProjectedCharacteristicList__Alternatives ) )
            {
            // InternalQueryParser.g:150:2: ( ( rule__ProjectedCharacteristicList__Alternatives ) )
            // InternalQueryParser.g:151:3: ( rule__ProjectedCharacteristicList__Alternatives )
            {
             before(grammarAccess.getProjectedCharacteristicListAccess().getAlternatives()); 
            // InternalQueryParser.g:152:3: ( rule__ProjectedCharacteristicList__Alternatives )
            // InternalQueryParser.g:152:4: rule__ProjectedCharacteristicList__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProjectedCharacteristicList__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProjectedCharacteristicListAccess().getAlternatives()); 

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
    // $ANTLR end "ruleProjectedCharacteristicList"


    // $ANTLR start "entryRuleProjectedCharacteristicExpression"
    // InternalQueryParser.g:161:1: entryRuleProjectedCharacteristicExpression : ruleProjectedCharacteristicExpression EOF ;
    public final void entryRuleProjectedCharacteristicExpression() throws RecognitionException {
        try {
            // InternalQueryParser.g:162:1: ( ruleProjectedCharacteristicExpression EOF )
            // InternalQueryParser.g:163:1: ruleProjectedCharacteristicExpression EOF
            {
             before(grammarAccess.getProjectedCharacteristicExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleProjectedCharacteristicExpression();

            state._fsp--;

             after(grammarAccess.getProjectedCharacteristicExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProjectedCharacteristicExpression"


    // $ANTLR start "ruleProjectedCharacteristicExpression"
    // InternalQueryParser.g:170:1: ruleProjectedCharacteristicExpression : ( ( rule__ProjectedCharacteristicExpression__Alternatives ) ) ;
    public final void ruleProjectedCharacteristicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:174:2: ( ( ( rule__ProjectedCharacteristicExpression__Alternatives ) ) )
            // InternalQueryParser.g:175:2: ( ( rule__ProjectedCharacteristicExpression__Alternatives ) )
            {
            // InternalQueryParser.g:175:2: ( ( rule__ProjectedCharacteristicExpression__Alternatives ) )
            // InternalQueryParser.g:176:3: ( rule__ProjectedCharacteristicExpression__Alternatives )
            {
             before(grammarAccess.getProjectedCharacteristicExpressionAccess().getAlternatives()); 
            // InternalQueryParser.g:177:3: ( rule__ProjectedCharacteristicExpression__Alternatives )
            // InternalQueryParser.g:177:4: rule__ProjectedCharacteristicExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProjectedCharacteristicExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProjectedCharacteristicExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleProjectedCharacteristicExpression"


    // $ANTLR start "entryRuleSelectedEntityCharacteristicWildcardReference"
    // InternalQueryParser.g:186:1: entryRuleSelectedEntityCharacteristicWildcardReference : ruleSelectedEntityCharacteristicWildcardReference EOF ;
    public final void entryRuleSelectedEntityCharacteristicWildcardReference() throws RecognitionException {
        try {
            // InternalQueryParser.g:187:1: ( ruleSelectedEntityCharacteristicWildcardReference EOF )
            // InternalQueryParser.g:188:1: ruleSelectedEntityCharacteristicWildcardReference EOF
            {
             before(grammarAccess.getSelectedEntityCharacteristicWildcardReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectedEntityCharacteristicWildcardReference();

            state._fsp--;

             after(grammarAccess.getSelectedEntityCharacteristicWildcardReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectedEntityCharacteristicWildcardReference"


    // $ANTLR start "ruleSelectedEntityCharacteristicWildcardReference"
    // InternalQueryParser.g:195:1: ruleSelectedEntityCharacteristicWildcardReference : ( ( rule__SelectedEntityCharacteristicWildcardReference__Group__0 ) ) ;
    public final void ruleSelectedEntityCharacteristicWildcardReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:199:2: ( ( ( rule__SelectedEntityCharacteristicWildcardReference__Group__0 ) ) )
            // InternalQueryParser.g:200:2: ( ( rule__SelectedEntityCharacteristicWildcardReference__Group__0 ) )
            {
            // InternalQueryParser.g:200:2: ( ( rule__SelectedEntityCharacteristicWildcardReference__Group__0 ) )
            // InternalQueryParser.g:201:3: ( rule__SelectedEntityCharacteristicWildcardReference__Group__0 )
            {
             before(grammarAccess.getSelectedEntityCharacteristicWildcardReferenceAccess().getGroup()); 
            // InternalQueryParser.g:202:3: ( rule__SelectedEntityCharacteristicWildcardReference__Group__0 )
            // InternalQueryParser.g:202:4: rule__SelectedEntityCharacteristicWildcardReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectedEntityCharacteristicWildcardReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectedEntityCharacteristicWildcardReferenceAccess().getGroup()); 

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
    // $ANTLR end "ruleSelectedEntityCharacteristicWildcardReference"


    // $ANTLR start "entryRuleExplicitSelectedEntityCharacteristicReference"
    // InternalQueryParser.g:211:1: entryRuleExplicitSelectedEntityCharacteristicReference : ruleExplicitSelectedEntityCharacteristicReference EOF ;
    public final void entryRuleExplicitSelectedEntityCharacteristicReference() throws RecognitionException {
        try {
            // InternalQueryParser.g:212:1: ( ruleExplicitSelectedEntityCharacteristicReference EOF )
            // InternalQueryParser.g:213:1: ruleExplicitSelectedEntityCharacteristicReference EOF
            {
             before(grammarAccess.getExplicitSelectedEntityCharacteristicReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleExplicitSelectedEntityCharacteristicReference();

            state._fsp--;

             after(grammarAccess.getExplicitSelectedEntityCharacteristicReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExplicitSelectedEntityCharacteristicReference"


    // $ANTLR start "ruleExplicitSelectedEntityCharacteristicReference"
    // InternalQueryParser.g:220:1: ruleExplicitSelectedEntityCharacteristicReference : ( ( rule__ExplicitSelectedEntityCharacteristicReference__Group__0 ) ) ;
    public final void ruleExplicitSelectedEntityCharacteristicReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:224:2: ( ( ( rule__ExplicitSelectedEntityCharacteristicReference__Group__0 ) ) )
            // InternalQueryParser.g:225:2: ( ( rule__ExplicitSelectedEntityCharacteristicReference__Group__0 ) )
            {
            // InternalQueryParser.g:225:2: ( ( rule__ExplicitSelectedEntityCharacteristicReference__Group__0 ) )
            // InternalQueryParser.g:226:3: ( rule__ExplicitSelectedEntityCharacteristicReference__Group__0 )
            {
             before(grammarAccess.getExplicitSelectedEntityCharacteristicReferenceAccess().getGroup()); 
            // InternalQueryParser.g:227:3: ( rule__ExplicitSelectedEntityCharacteristicReference__Group__0 )
            // InternalQueryParser.g:227:4: rule__ExplicitSelectedEntityCharacteristicReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExplicitSelectedEntityCharacteristicReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExplicitSelectedEntityCharacteristicReferenceAccess().getGroup()); 

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
    // $ANTLR end "ruleExplicitSelectedEntityCharacteristicReference"


    // $ANTLR start "entryRuleSelectedEntityExpression"
    // InternalQueryParser.g:236:1: entryRuleSelectedEntityExpression : ruleSelectedEntityExpression EOF ;
    public final void entryRuleSelectedEntityExpression() throws RecognitionException {
        try {
            // InternalQueryParser.g:237:1: ( ruleSelectedEntityExpression EOF )
            // InternalQueryParser.g:238:1: ruleSelectedEntityExpression EOF
            {
             before(grammarAccess.getSelectedEntityExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectedEntityExpression();

            state._fsp--;

             after(grammarAccess.getSelectedEntityExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectedEntityExpression"


    // $ANTLR start "ruleSelectedEntityExpression"
    // InternalQueryParser.g:245:1: ruleSelectedEntityExpression : ( ( rule__SelectedEntityExpression__Group__0 ) ) ;
    public final void ruleSelectedEntityExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:249:2: ( ( ( rule__SelectedEntityExpression__Group__0 ) ) )
            // InternalQueryParser.g:250:2: ( ( rule__SelectedEntityExpression__Group__0 ) )
            {
            // InternalQueryParser.g:250:2: ( ( rule__SelectedEntityExpression__Group__0 ) )
            // InternalQueryParser.g:251:3: ( rule__SelectedEntityExpression__Group__0 )
            {
             before(grammarAccess.getSelectedEntityExpressionAccess().getGroup()); 
            // InternalQueryParser.g:252:3: ( rule__SelectedEntityExpression__Group__0 )
            // InternalQueryParser.g:252:4: rule__SelectedEntityExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectedEntityExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectedEntityExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleSelectedEntityExpression"


    // $ANTLR start "entryRuleFromClause"
    // InternalQueryParser.g:261:1: entryRuleFromClause : ruleFromClause EOF ;
    public final void entryRuleFromClause() throws RecognitionException {
        try {
            // InternalQueryParser.g:262:1: ( ruleFromClause EOF )
            // InternalQueryParser.g:263:1: ruleFromClause EOF
            {
             before(grammarAccess.getFromClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleFromClause();

            state._fsp--;

             after(grammarAccess.getFromClauseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFromClause"


    // $ANTLR start "ruleFromClause"
    // InternalQueryParser.g:270:1: ruleFromClause : ( ( rule__FromClause__Group__0 ) ) ;
    public final void ruleFromClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:274:2: ( ( ( rule__FromClause__Group__0 ) ) )
            // InternalQueryParser.g:275:2: ( ( rule__FromClause__Group__0 ) )
            {
            // InternalQueryParser.g:275:2: ( ( rule__FromClause__Group__0 ) )
            // InternalQueryParser.g:276:3: ( rule__FromClause__Group__0 )
            {
             before(grammarAccess.getFromClauseAccess().getGroup()); 
            // InternalQueryParser.g:277:3: ( rule__FromClause__Group__0 )
            // InternalQueryParser.g:277:4: rule__FromClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FromClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFromClauseAccess().getGroup()); 

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
    // $ANTLR end "ruleFromClause"


    // $ANTLR start "entryRuleEntityExpression"
    // InternalQueryParser.g:286:1: entryRuleEntityExpression : ruleEntityExpression EOF ;
    public final void entryRuleEntityExpression() throws RecognitionException {
        try {
            // InternalQueryParser.g:287:1: ( ruleEntityExpression EOF )
            // InternalQueryParser.g:288:1: ruleEntityExpression EOF
            {
             before(grammarAccess.getEntityExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityExpression();

            state._fsp--;

             after(grammarAccess.getEntityExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntityExpression"


    // $ANTLR start "ruleEntityExpression"
    // InternalQueryParser.g:295:1: ruleEntityExpression : ( ( rule__EntityExpression__Group__0 ) ) ;
    public final void ruleEntityExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:299:2: ( ( ( rule__EntityExpression__Group__0 ) ) )
            // InternalQueryParser.g:300:2: ( ( rule__EntityExpression__Group__0 ) )
            {
            // InternalQueryParser.g:300:2: ( ( rule__EntityExpression__Group__0 ) )
            // InternalQueryParser.g:301:3: ( rule__EntityExpression__Group__0 )
            {
             before(grammarAccess.getEntityExpressionAccess().getGroup()); 
            // InternalQueryParser.g:302:3: ( rule__EntityExpression__Group__0 )
            // InternalQueryParser.g:302:4: rule__EntityExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleEntityExpression"


    // $ANTLR start "entryRuleSelectedEntity"
    // InternalQueryParser.g:311:1: entryRuleSelectedEntity : ruleSelectedEntity EOF ;
    public final void entryRuleSelectedEntity() throws RecognitionException {
        try {
            // InternalQueryParser.g:312:1: ( ruleSelectedEntity EOF )
            // InternalQueryParser.g:313:1: ruleSelectedEntity EOF
            {
             before(grammarAccess.getSelectedEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectedEntity();

            state._fsp--;

             after(grammarAccess.getSelectedEntityRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectedEntity"


    // $ANTLR start "ruleSelectedEntity"
    // InternalQueryParser.g:320:1: ruleSelectedEntity : ( ( rule__SelectedEntity__Group__0 ) ) ;
    public final void ruleSelectedEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:324:2: ( ( ( rule__SelectedEntity__Group__0 ) ) )
            // InternalQueryParser.g:325:2: ( ( rule__SelectedEntity__Group__0 ) )
            {
            // InternalQueryParser.g:325:2: ( ( rule__SelectedEntity__Group__0 ) )
            // InternalQueryParser.g:326:3: ( rule__SelectedEntity__Group__0 )
            {
             before(grammarAccess.getSelectedEntityAccess().getGroup()); 
            // InternalQueryParser.g:327:3: ( rule__SelectedEntity__Group__0 )
            // InternalQueryParser.g:327:4: rule__SelectedEntity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectedEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectedEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleSelectedEntity"


    // $ANTLR start "entryRuleEntityJoinExpression"
    // InternalQueryParser.g:336:1: entryRuleEntityJoinExpression : ruleEntityJoinExpression EOF ;
    public final void entryRuleEntityJoinExpression() throws RecognitionException {
        try {
            // InternalQueryParser.g:337:1: ( ruleEntityJoinExpression EOF )
            // InternalQueryParser.g:338:1: ruleEntityJoinExpression EOF
            {
             before(grammarAccess.getEntityJoinExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityJoinExpression();

            state._fsp--;

             after(grammarAccess.getEntityJoinExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntityJoinExpression"


    // $ANTLR start "ruleEntityJoinExpression"
    // InternalQueryParser.g:345:1: ruleEntityJoinExpression : ( ( rule__EntityJoinExpression__Group__0 ) ) ;
    public final void ruleEntityJoinExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:349:2: ( ( ( rule__EntityJoinExpression__Group__0 ) ) )
            // InternalQueryParser.g:350:2: ( ( rule__EntityJoinExpression__Group__0 ) )
            {
            // InternalQueryParser.g:350:2: ( ( rule__EntityJoinExpression__Group__0 ) )
            // InternalQueryParser.g:351:3: ( rule__EntityJoinExpression__Group__0 )
            {
             before(grammarAccess.getEntityJoinExpressionAccess().getGroup()); 
            // InternalQueryParser.g:352:3: ( rule__EntityJoinExpression__Group__0 )
            // InternalQueryParser.g:352:4: rule__EntityJoinExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityJoinExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityJoinExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleEntityJoinExpression"


    // $ANTLR start "entryRuleJoinEntity"
    // InternalQueryParser.g:361:1: entryRuleJoinEntity : ruleJoinEntity EOF ;
    public final void entryRuleJoinEntity() throws RecognitionException {
        try {
            // InternalQueryParser.g:362:1: ( ruleJoinEntity EOF )
            // InternalQueryParser.g:363:1: ruleJoinEntity EOF
            {
             before(grammarAccess.getJoinEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleJoinEntity();

            state._fsp--;

             after(grammarAccess.getJoinEntityRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJoinEntity"


    // $ANTLR start "ruleJoinEntity"
    // InternalQueryParser.g:370:1: ruleJoinEntity : ( ruleSelectedEntity ) ;
    public final void ruleJoinEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:374:2: ( ( ruleSelectedEntity ) )
            // InternalQueryParser.g:375:2: ( ruleSelectedEntity )
            {
            // InternalQueryParser.g:375:2: ( ruleSelectedEntity )
            // InternalQueryParser.g:376:3: ruleSelectedEntity
            {
             before(grammarAccess.getJoinEntityAccess().getSelectedEntityParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleSelectedEntity();

            state._fsp--;

             after(grammarAccess.getJoinEntityAccess().getSelectedEntityParserRuleCall()); 

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
    // $ANTLR end "ruleJoinEntity"


    // $ANTLR start "entryRuleEntityJoinCriteria"
    // InternalQueryParser.g:386:1: entryRuleEntityJoinCriteria : ruleEntityJoinCriteria EOF ;
    public final void entryRuleEntityJoinCriteria() throws RecognitionException {
        try {
            // InternalQueryParser.g:387:1: ( ruleEntityJoinCriteria EOF )
            // InternalQueryParser.g:388:1: ruleEntityJoinCriteria EOF
            {
             before(grammarAccess.getEntityJoinCriteriaRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityJoinCriteria();

            state._fsp--;

             after(grammarAccess.getEntityJoinCriteriaRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntityJoinCriteria"


    // $ANTLR start "ruleEntityJoinCriteria"
    // InternalQueryParser.g:395:1: ruleEntityJoinCriteria : ( ( rule__EntityJoinCriteria__Group__0 ) ) ;
    public final void ruleEntityJoinCriteria() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:399:2: ( ( ( rule__EntityJoinCriteria__Group__0 ) ) )
            // InternalQueryParser.g:400:2: ( ( rule__EntityJoinCriteria__Group__0 ) )
            {
            // InternalQueryParser.g:400:2: ( ( rule__EntityJoinCriteria__Group__0 ) )
            // InternalQueryParser.g:401:3: ( rule__EntityJoinCriteria__Group__0 )
            {
             before(grammarAccess.getEntityJoinCriteriaAccess().getGroup()); 
            // InternalQueryParser.g:402:3: ( rule__EntityJoinCriteria__Group__0 )
            // InternalQueryParser.g:402:4: rule__EntityJoinCriteria__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityJoinCriteria__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityJoinCriteriaAccess().getGroup()); 

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
    // $ANTLR end "ruleEntityJoinCriteria"


    // $ANTLR start "entryRuleEntityTypeCharacteristicEquivalenceExpression"
    // InternalQueryParser.g:411:1: entryRuleEntityTypeCharacteristicEquivalenceExpression : ruleEntityTypeCharacteristicEquivalenceExpression EOF ;
    public final void entryRuleEntityTypeCharacteristicEquivalenceExpression() throws RecognitionException {
        try {
            // InternalQueryParser.g:412:1: ( ruleEntityTypeCharacteristicEquivalenceExpression EOF )
            // InternalQueryParser.g:413:1: ruleEntityTypeCharacteristicEquivalenceExpression EOF
            {
             before(grammarAccess.getEntityTypeCharacteristicEquivalenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityTypeCharacteristicEquivalenceExpression();

            state._fsp--;

             after(grammarAccess.getEntityTypeCharacteristicEquivalenceExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntityTypeCharacteristicEquivalenceExpression"


    // $ANTLR start "ruleEntityTypeCharacteristicEquivalenceExpression"
    // InternalQueryParser.g:420:1: ruleEntityTypeCharacteristicEquivalenceExpression : ( ( rule__EntityTypeCharacteristicEquivalenceExpression__Group__0 ) ) ;
    public final void ruleEntityTypeCharacteristicEquivalenceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:424:2: ( ( ( rule__EntityTypeCharacteristicEquivalenceExpression__Group__0 ) ) )
            // InternalQueryParser.g:425:2: ( ( rule__EntityTypeCharacteristicEquivalenceExpression__Group__0 ) )
            {
            // InternalQueryParser.g:425:2: ( ( rule__EntityTypeCharacteristicEquivalenceExpression__Group__0 ) )
            // InternalQueryParser.g:426:3: ( rule__EntityTypeCharacteristicEquivalenceExpression__Group__0 )
            {
             before(grammarAccess.getEntityTypeCharacteristicEquivalenceExpressionAccess().getGroup()); 
            // InternalQueryParser.g:427:3: ( rule__EntityTypeCharacteristicEquivalenceExpression__Group__0 )
            // InternalQueryParser.g:427:4: rule__EntityTypeCharacteristicEquivalenceExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityTypeCharacteristicEquivalenceExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeCharacteristicEquivalenceExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleEntityTypeCharacteristicEquivalenceExpression"


    // $ANTLR start "entryRuleSelectedEntityCharacteristicReference"
    // InternalQueryParser.g:436:1: entryRuleSelectedEntityCharacteristicReference : ruleSelectedEntityCharacteristicReference EOF ;
    public final void entryRuleSelectedEntityCharacteristicReference() throws RecognitionException {
        try {
            // InternalQueryParser.g:437:1: ( ruleSelectedEntityCharacteristicReference EOF )
            // InternalQueryParser.g:438:1: ruleSelectedEntityCharacteristicReference EOF
            {
             before(grammarAccess.getSelectedEntityCharacteristicReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectedEntityCharacteristicReference();

            state._fsp--;

             after(grammarAccess.getSelectedEntityCharacteristicReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectedEntityCharacteristicReference"


    // $ANTLR start "ruleSelectedEntityCharacteristicReference"
    // InternalQueryParser.g:445:1: ruleSelectedEntityCharacteristicReference : ( ( rule__SelectedEntityCharacteristicReference__Group__0 ) ) ;
    public final void ruleSelectedEntityCharacteristicReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:449:2: ( ( ( rule__SelectedEntityCharacteristicReference__Group__0 ) ) )
            // InternalQueryParser.g:450:2: ( ( rule__SelectedEntityCharacteristicReference__Group__0 ) )
            {
            // InternalQueryParser.g:450:2: ( ( rule__SelectedEntityCharacteristicReference__Group__0 ) )
            // InternalQueryParser.g:451:3: ( rule__SelectedEntityCharacteristicReference__Group__0 )
            {
             before(grammarAccess.getSelectedEntityCharacteristicReferenceAccess().getGroup()); 
            // InternalQueryParser.g:452:3: ( rule__SelectedEntityCharacteristicReference__Group__0 )
            // InternalQueryParser.g:452:4: rule__SelectedEntityCharacteristicReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectedEntityCharacteristicReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectedEntityCharacteristicReferenceAccess().getGroup()); 

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
    // $ANTLR end "ruleSelectedEntityCharacteristicReference"


    // $ANTLR start "entryRuleSelectedEntityReference"
    // InternalQueryParser.g:461:1: entryRuleSelectedEntityReference : ruleSelectedEntityReference EOF ;
    public final void entryRuleSelectedEntityReference() throws RecognitionException {
        try {
            // InternalQueryParser.g:462:1: ( ruleSelectedEntityReference EOF )
            // InternalQueryParser.g:463:1: ruleSelectedEntityReference EOF
            {
             before(grammarAccess.getSelectedEntityReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectedEntityReference();

            state._fsp--;

             after(grammarAccess.getSelectedEntityReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectedEntityReference"


    // $ANTLR start "ruleSelectedEntityReference"
    // InternalQueryParser.g:470:1: ruleSelectedEntityReference : ( ruleQueryIdentifier ) ;
    public final void ruleSelectedEntityReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:474:2: ( ( ruleQueryIdentifier ) )
            // InternalQueryParser.g:475:2: ( ruleQueryIdentifier )
            {
            // InternalQueryParser.g:475:2: ( ruleQueryIdentifier )
            // InternalQueryParser.g:476:3: ruleQueryIdentifier
            {
             before(grammarAccess.getSelectedEntityReferenceAccess().getQueryIdentifierParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleQueryIdentifier();

            state._fsp--;

             after(grammarAccess.getSelectedEntityReferenceAccess().getQueryIdentifierParserRuleCall()); 

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
    // $ANTLR end "ruleSelectedEntityReference"


    // $ANTLR start "entryRuleWhereClause"
    // InternalQueryParser.g:486:1: entryRuleWhereClause : ruleWhereClause EOF ;
    public final void entryRuleWhereClause() throws RecognitionException {
        try {
            // InternalQueryParser.g:487:1: ( ruleWhereClause EOF )
            // InternalQueryParser.g:488:1: ruleWhereClause EOF
            {
             before(grammarAccess.getWhereClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleWhereClause();

            state._fsp--;

             after(grammarAccess.getWhereClauseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWhereClause"


    // $ANTLR start "ruleWhereClause"
    // InternalQueryParser.g:495:1: ruleWhereClause : ( ( rule__WhereClause__Group__0 ) ) ;
    public final void ruleWhereClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:499:2: ( ( ( rule__WhereClause__Group__0 ) ) )
            // InternalQueryParser.g:500:2: ( ( rule__WhereClause__Group__0 ) )
            {
            // InternalQueryParser.g:500:2: ( ( rule__WhereClause__Group__0 ) )
            // InternalQueryParser.g:501:3: ( rule__WhereClause__Group__0 )
            {
             before(grammarAccess.getWhereClauseAccess().getGroup()); 
            // InternalQueryParser.g:502:3: ( rule__WhereClause__Group__0 )
            // InternalQueryParser.g:502:4: rule__WhereClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhereClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhereClauseAccess().getGroup()); 

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
    // $ANTLR end "ruleWhereClause"


    // $ANTLR start "entryRuleCriteria"
    // InternalQueryParser.g:511:1: entryRuleCriteria : ruleCriteria EOF ;
    public final void entryRuleCriteria() throws RecognitionException {
        try {
            // InternalQueryParser.g:512:1: ( ruleCriteria EOF )
            // InternalQueryParser.g:513:1: ruleCriteria EOF
            {
             before(grammarAccess.getCriteriaRule()); 
            pushFollow(FOLLOW_1);
            ruleCriteria();

            state._fsp--;

             after(grammarAccess.getCriteriaRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCriteria"


    // $ANTLR start "ruleCriteria"
    // InternalQueryParser.g:520:1: ruleCriteria : ( ruleBooleanExpression ) ;
    public final void ruleCriteria() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:524:2: ( ( ruleBooleanExpression ) )
            // InternalQueryParser.g:525:2: ( ruleBooleanExpression )
            {
            // InternalQueryParser.g:525:2: ( ruleBooleanExpression )
            // InternalQueryParser.g:526:3: ruleBooleanExpression
            {
             before(grammarAccess.getCriteriaAccess().getBooleanExpressionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleBooleanExpression();

            state._fsp--;

             after(grammarAccess.getCriteriaAccess().getBooleanExpressionParserRuleCall()); 

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
    // $ANTLR end "ruleCriteria"


    // $ANTLR start "entryRuleOrderByClause"
    // InternalQueryParser.g:536:1: entryRuleOrderByClause : ruleOrderByClause EOF ;
    public final void entryRuleOrderByClause() throws RecognitionException {
        try {
            // InternalQueryParser.g:537:1: ( ruleOrderByClause EOF )
            // InternalQueryParser.g:538:1: ruleOrderByClause EOF
            {
             before(grammarAccess.getOrderByClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleOrderByClause();

            state._fsp--;

             after(grammarAccess.getOrderByClauseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrderByClause"


    // $ANTLR start "ruleOrderByClause"
    // InternalQueryParser.g:545:1: ruleOrderByClause : ( ( rule__OrderByClause__Group__0 ) ) ;
    public final void ruleOrderByClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:549:2: ( ( ( rule__OrderByClause__Group__0 ) ) )
            // InternalQueryParser.g:550:2: ( ( rule__OrderByClause__Group__0 ) )
            {
            // InternalQueryParser.g:550:2: ( ( rule__OrderByClause__Group__0 ) )
            // InternalQueryParser.g:551:3: ( rule__OrderByClause__Group__0 )
            {
             before(grammarAccess.getOrderByClauseAccess().getGroup()); 
            // InternalQueryParser.g:552:3: ( rule__OrderByClause__Group__0 )
            // InternalQueryParser.g:552:4: rule__OrderByClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrderByClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderByClauseAccess().getGroup()); 

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
    // $ANTLR end "ruleOrderByClause"


    // $ANTLR start "entryRuleOrderingExpression"
    // InternalQueryParser.g:561:1: entryRuleOrderingExpression : ruleOrderingExpression EOF ;
    public final void entryRuleOrderingExpression() throws RecognitionException {
        try {
            // InternalQueryParser.g:562:1: ( ruleOrderingExpression EOF )
            // InternalQueryParser.g:563:1: ruleOrderingExpression EOF
            {
             before(grammarAccess.getOrderingExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleOrderingExpression();

            state._fsp--;

             after(grammarAccess.getOrderingExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrderingExpression"


    // $ANTLR start "ruleOrderingExpression"
    // InternalQueryParser.g:570:1: ruleOrderingExpression : ( ( rule__OrderingExpression__Group__0 ) ) ;
    public final void ruleOrderingExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:574:2: ( ( ( rule__OrderingExpression__Group__0 ) ) )
            // InternalQueryParser.g:575:2: ( ( rule__OrderingExpression__Group__0 ) )
            {
            // InternalQueryParser.g:575:2: ( ( rule__OrderingExpression__Group__0 ) )
            // InternalQueryParser.g:576:3: ( rule__OrderingExpression__Group__0 )
            {
             before(grammarAccess.getOrderingExpressionAccess().getGroup()); 
            // InternalQueryParser.g:577:3: ( rule__OrderingExpression__Group__0 )
            // InternalQueryParser.g:577:4: rule__OrderingExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrderingExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderingExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleOrderingExpression"


    // $ANTLR start "entryRuleProjectedCharacteristicReference"
    // InternalQueryParser.g:586:1: entryRuleProjectedCharacteristicReference : ruleProjectedCharacteristicReference EOF ;
    public final void entryRuleProjectedCharacteristicReference() throws RecognitionException {
        try {
            // InternalQueryParser.g:587:1: ( ruleProjectedCharacteristicReference EOF )
            // InternalQueryParser.g:588:1: ruleProjectedCharacteristicReference EOF
            {
             before(grammarAccess.getProjectedCharacteristicReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleProjectedCharacteristicReference();

            state._fsp--;

             after(grammarAccess.getProjectedCharacteristicReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProjectedCharacteristicReference"


    // $ANTLR start "ruleProjectedCharacteristicReference"
    // InternalQueryParser.g:595:1: ruleProjectedCharacteristicReference : ( ( rule__ProjectedCharacteristicReference__Alternatives ) ) ;
    public final void ruleProjectedCharacteristicReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:599:2: ( ( ( rule__ProjectedCharacteristicReference__Alternatives ) ) )
            // InternalQueryParser.g:600:2: ( ( rule__ProjectedCharacteristicReference__Alternatives ) )
            {
            // InternalQueryParser.g:600:2: ( ( rule__ProjectedCharacteristicReference__Alternatives ) )
            // InternalQueryParser.g:601:3: ( rule__ProjectedCharacteristicReference__Alternatives )
            {
             before(grammarAccess.getProjectedCharacteristicReferenceAccess().getAlternatives()); 
            // InternalQueryParser.g:602:3: ( rule__ProjectedCharacteristicReference__Alternatives )
            // InternalQueryParser.g:602:4: rule__ProjectedCharacteristicReference__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProjectedCharacteristicReference__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProjectedCharacteristicReferenceAccess().getAlternatives()); 

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
    // $ANTLR end "ruleProjectedCharacteristicReference"


    // $ANTLR start "entryRuleQualifiedProjectedCharacteristicReference"
    // InternalQueryParser.g:611:1: entryRuleQualifiedProjectedCharacteristicReference : ruleQualifiedProjectedCharacteristicReference EOF ;
    public final void entryRuleQualifiedProjectedCharacteristicReference() throws RecognitionException {
        try {
            // InternalQueryParser.g:612:1: ( ruleQualifiedProjectedCharacteristicReference EOF )
            // InternalQueryParser.g:613:1: ruleQualifiedProjectedCharacteristicReference EOF
            {
             before(grammarAccess.getQualifiedProjectedCharacteristicReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedProjectedCharacteristicReference();

            state._fsp--;

             after(grammarAccess.getQualifiedProjectedCharacteristicReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedProjectedCharacteristicReference"


    // $ANTLR start "ruleQualifiedProjectedCharacteristicReference"
    // InternalQueryParser.g:620:1: ruleQualifiedProjectedCharacteristicReference : ( ( rule__QualifiedProjectedCharacteristicReference__Group__0 ) ) ;
    public final void ruleQualifiedProjectedCharacteristicReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:624:2: ( ( ( rule__QualifiedProjectedCharacteristicReference__Group__0 ) ) )
            // InternalQueryParser.g:625:2: ( ( rule__QualifiedProjectedCharacteristicReference__Group__0 ) )
            {
            // InternalQueryParser.g:625:2: ( ( rule__QualifiedProjectedCharacteristicReference__Group__0 ) )
            // InternalQueryParser.g:626:3: ( rule__QualifiedProjectedCharacteristicReference__Group__0 )
            {
             before(grammarAccess.getQualifiedProjectedCharacteristicReferenceAccess().getGroup()); 
            // InternalQueryParser.g:627:3: ( rule__QualifiedProjectedCharacteristicReference__Group__0 )
            // InternalQueryParser.g:627:4: rule__QualifiedProjectedCharacteristicReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedProjectedCharacteristicReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedProjectedCharacteristicReferenceAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedProjectedCharacteristicReference"


    // $ANTLR start "entryRuleUnqualifiedProjectedCharacteristicReferenceOrAlias"
    // InternalQueryParser.g:636:1: entryRuleUnqualifiedProjectedCharacteristicReferenceOrAlias : ruleUnqualifiedProjectedCharacteristicReferenceOrAlias EOF ;
    public final void entryRuleUnqualifiedProjectedCharacteristicReferenceOrAlias() throws RecognitionException {
        try {
            // InternalQueryParser.g:637:1: ( ruleUnqualifiedProjectedCharacteristicReferenceOrAlias EOF )
            // InternalQueryParser.g:638:1: ruleUnqualifiedProjectedCharacteristicReferenceOrAlias EOF
            {
             before(grammarAccess.getUnqualifiedProjectedCharacteristicReferenceOrAliasRule()); 
            pushFollow(FOLLOW_1);
            ruleUnqualifiedProjectedCharacteristicReferenceOrAlias();

            state._fsp--;

             after(grammarAccess.getUnqualifiedProjectedCharacteristicReferenceOrAliasRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnqualifiedProjectedCharacteristicReferenceOrAlias"


    // $ANTLR start "ruleUnqualifiedProjectedCharacteristicReferenceOrAlias"
    // InternalQueryParser.g:645:1: ruleUnqualifiedProjectedCharacteristicReferenceOrAlias : ( ruleQueryIdentifier ) ;
    public final void ruleUnqualifiedProjectedCharacteristicReferenceOrAlias() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:649:2: ( ( ruleQueryIdentifier ) )
            // InternalQueryParser.g:650:2: ( ruleQueryIdentifier )
            {
            // InternalQueryParser.g:650:2: ( ruleQueryIdentifier )
            // InternalQueryParser.g:651:3: ruleQueryIdentifier
            {
             before(grammarAccess.getUnqualifiedProjectedCharacteristicReferenceOrAliasAccess().getQueryIdentifierParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleQueryIdentifier();

            state._fsp--;

             after(grammarAccess.getUnqualifiedProjectedCharacteristicReferenceOrAliasAccess().getQueryIdentifierParserRuleCall()); 

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
    // $ANTLR end "ruleUnqualifiedProjectedCharacteristicReferenceOrAlias"


    // $ANTLR start "entryRuleOrderingType"
    // InternalQueryParser.g:661:1: entryRuleOrderingType : ruleOrderingType EOF ;
    public final void entryRuleOrderingType() throws RecognitionException {
        try {
            // InternalQueryParser.g:662:1: ( ruleOrderingType EOF )
            // InternalQueryParser.g:663:1: ruleOrderingType EOF
            {
             before(grammarAccess.getOrderingTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleOrderingType();

            state._fsp--;

             after(grammarAccess.getOrderingTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrderingType"


    // $ANTLR start "ruleOrderingType"
    // InternalQueryParser.g:670:1: ruleOrderingType : ( ( rule__OrderingType__Alternatives ) ) ;
    public final void ruleOrderingType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:674:2: ( ( ( rule__OrderingType__Alternatives ) ) )
            // InternalQueryParser.g:675:2: ( ( rule__OrderingType__Alternatives ) )
            {
            // InternalQueryParser.g:675:2: ( ( rule__OrderingType__Alternatives ) )
            // InternalQueryParser.g:676:3: ( rule__OrderingType__Alternatives )
            {
             before(grammarAccess.getOrderingTypeAccess().getAlternatives()); 
            // InternalQueryParser.g:677:3: ( rule__OrderingType__Alternatives )
            // InternalQueryParser.g:677:4: rule__OrderingType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OrderingType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOrderingTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOrderingType"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalQueryParser.g:686:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // InternalQueryParser.g:687:1: ( ruleBooleanExpression EOF )
            // InternalQueryParser.g:688:1: ruleBooleanExpression EOF
            {
             before(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanExpression();

            state._fsp--;

             after(grammarAccess.getBooleanExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalQueryParser.g:695:1: ruleBooleanExpression : ( ( rule__BooleanExpression__Group__0 ) ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:699:2: ( ( ( rule__BooleanExpression__Group__0 ) ) )
            // InternalQueryParser.g:700:2: ( ( rule__BooleanExpression__Group__0 ) )
            {
            // InternalQueryParser.g:700:2: ( ( rule__BooleanExpression__Group__0 ) )
            // InternalQueryParser.g:701:3: ( rule__BooleanExpression__Group__0 )
            {
             before(grammarAccess.getBooleanExpressionAccess().getGroup()); 
            // InternalQueryParser.g:702:3: ( rule__BooleanExpression__Group__0 )
            // InternalQueryParser.g:702:4: rule__BooleanExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleBooleanTerm"
    // InternalQueryParser.g:711:1: entryRuleBooleanTerm : ruleBooleanTerm EOF ;
    public final void entryRuleBooleanTerm() throws RecognitionException {
        try {
            // InternalQueryParser.g:712:1: ( ruleBooleanTerm EOF )
            // InternalQueryParser.g:713:1: ruleBooleanTerm EOF
            {
             before(grammarAccess.getBooleanTermRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanTerm();

            state._fsp--;

             after(grammarAccess.getBooleanTermRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanTerm"


    // $ANTLR start "ruleBooleanTerm"
    // InternalQueryParser.g:720:1: ruleBooleanTerm : ( ( rule__BooleanTerm__Group__0 ) ) ;
    public final void ruleBooleanTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:724:2: ( ( ( rule__BooleanTerm__Group__0 ) ) )
            // InternalQueryParser.g:725:2: ( ( rule__BooleanTerm__Group__0 ) )
            {
            // InternalQueryParser.g:725:2: ( ( rule__BooleanTerm__Group__0 ) )
            // InternalQueryParser.g:726:3: ( rule__BooleanTerm__Group__0 )
            {
             before(grammarAccess.getBooleanTermAccess().getGroup()); 
            // InternalQueryParser.g:727:3: ( rule__BooleanTerm__Group__0 )
            // InternalQueryParser.g:727:4: rule__BooleanTerm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanTerm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanTermAccess().getGroup()); 

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
    // $ANTLR end "ruleBooleanTerm"


    // $ANTLR start "entryRuleBooleanFactor"
    // InternalQueryParser.g:736:1: entryRuleBooleanFactor : ruleBooleanFactor EOF ;
    public final void entryRuleBooleanFactor() throws RecognitionException {
        try {
            // InternalQueryParser.g:737:1: ( ruleBooleanFactor EOF )
            // InternalQueryParser.g:738:1: ruleBooleanFactor EOF
            {
             before(grammarAccess.getBooleanFactorRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanFactor();

            state._fsp--;

             after(grammarAccess.getBooleanFactorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanFactor"


    // $ANTLR start "ruleBooleanFactor"
    // InternalQueryParser.g:745:1: ruleBooleanFactor : ( ( rule__BooleanFactor__Group__0 ) ) ;
    public final void ruleBooleanFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:749:2: ( ( ( rule__BooleanFactor__Group__0 ) ) )
            // InternalQueryParser.g:750:2: ( ( rule__BooleanFactor__Group__0 ) )
            {
            // InternalQueryParser.g:750:2: ( ( rule__BooleanFactor__Group__0 ) )
            // InternalQueryParser.g:751:3: ( rule__BooleanFactor__Group__0 )
            {
             before(grammarAccess.getBooleanFactorAccess().getGroup()); 
            // InternalQueryParser.g:752:3: ( rule__BooleanFactor__Group__0 )
            // InternalQueryParser.g:752:4: rule__BooleanFactor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanFactor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanFactorAccess().getGroup()); 

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
    // $ANTLR end "ruleBooleanFactor"


    // $ANTLR start "entryRuleBooleanPredicate"
    // InternalQueryParser.g:761:1: entryRuleBooleanPredicate : ruleBooleanPredicate EOF ;
    public final void entryRuleBooleanPredicate() throws RecognitionException {
        try {
            // InternalQueryParser.g:762:1: ( ruleBooleanPredicate EOF )
            // InternalQueryParser.g:763:1: ruleBooleanPredicate EOF
            {
             before(grammarAccess.getBooleanPredicateRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanPredicate();

            state._fsp--;

             after(grammarAccess.getBooleanPredicateRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanPredicate"


    // $ANTLR start "ruleBooleanPredicate"
    // InternalQueryParser.g:770:1: ruleBooleanPredicate : ( ( rule__BooleanPredicate__Alternatives ) ) ;
    public final void ruleBooleanPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:774:2: ( ( ( rule__BooleanPredicate__Alternatives ) ) )
            // InternalQueryParser.g:775:2: ( ( rule__BooleanPredicate__Alternatives ) )
            {
            // InternalQueryParser.g:775:2: ( ( rule__BooleanPredicate__Alternatives ) )
            // InternalQueryParser.g:776:3: ( rule__BooleanPredicate__Alternatives )
            {
             before(grammarAccess.getBooleanPredicateAccess().getAlternatives()); 
            // InternalQueryParser.g:777:3: ( rule__BooleanPredicate__Alternatives )
            // InternalQueryParser.g:777:4: rule__BooleanPredicate__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanPredicate__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanPredicateAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBooleanPredicate"


    // $ANTLR start "entryRuleScalarComparePredicate"
    // InternalQueryParser.g:786:1: entryRuleScalarComparePredicate : ruleScalarComparePredicate EOF ;
    public final void entryRuleScalarComparePredicate() throws RecognitionException {
        try {
            // InternalQueryParser.g:787:1: ( ruleScalarComparePredicate EOF )
            // InternalQueryParser.g:788:1: ruleScalarComparePredicate EOF
            {
             before(grammarAccess.getScalarComparePredicateRule()); 
            pushFollow(FOLLOW_1);
            ruleScalarComparePredicate();

            state._fsp--;

             after(grammarAccess.getScalarComparePredicateRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleScalarComparePredicate"


    // $ANTLR start "ruleScalarComparePredicate"
    // InternalQueryParser.g:795:1: ruleScalarComparePredicate : ( ( rule__ScalarComparePredicate__Group__0 ) ) ;
    public final void ruleScalarComparePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:799:2: ( ( ( rule__ScalarComparePredicate__Group__0 ) ) )
            // InternalQueryParser.g:800:2: ( ( rule__ScalarComparePredicate__Group__0 ) )
            {
            // InternalQueryParser.g:800:2: ( ( rule__ScalarComparePredicate__Group__0 ) )
            // InternalQueryParser.g:801:3: ( rule__ScalarComparePredicate__Group__0 )
            {
             before(grammarAccess.getScalarComparePredicateAccess().getGroup()); 
            // InternalQueryParser.g:802:3: ( rule__ScalarComparePredicate__Group__0 )
            // InternalQueryParser.g:802:4: rule__ScalarComparePredicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScalarComparePredicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScalarComparePredicateAccess().getGroup()); 

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
    // $ANTLR end "ruleScalarComparePredicate"


    // $ANTLR start "entryRuleLogicalSet"
    // InternalQueryParser.g:811:1: entryRuleLogicalSet : ruleLogicalSet EOF ;
    public final void entryRuleLogicalSet() throws RecognitionException {
        try {
            // InternalQueryParser.g:812:1: ( ruleLogicalSet EOF )
            // InternalQueryParser.g:813:1: ruleLogicalSet EOF
            {
             before(grammarAccess.getLogicalSetRule()); 
            pushFollow(FOLLOW_1);
            ruleLogicalSet();

            state._fsp--;

             after(grammarAccess.getLogicalSetRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLogicalSet"


    // $ANTLR start "ruleLogicalSet"
    // InternalQueryParser.g:820:1: ruleLogicalSet : ( ( rule__LogicalSet__Alternatives ) ) ;
    public final void ruleLogicalSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:824:2: ( ( ( rule__LogicalSet__Alternatives ) ) )
            // InternalQueryParser.g:825:2: ( ( rule__LogicalSet__Alternatives ) )
            {
            // InternalQueryParser.g:825:2: ( ( rule__LogicalSet__Alternatives ) )
            // InternalQueryParser.g:826:3: ( rule__LogicalSet__Alternatives )
            {
             before(grammarAccess.getLogicalSetAccess().getAlternatives()); 
            // InternalQueryParser.g:827:3: ( rule__LogicalSet__Alternatives )
            // InternalQueryParser.g:827:4: rule__LogicalSet__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LogicalSet__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLogicalSetAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLogicalSet"


    // $ANTLR start "entryRuleCharacteristicBasisSet"
    // InternalQueryParser.g:836:1: entryRuleCharacteristicBasisSet : ruleCharacteristicBasisSet EOF ;
    public final void entryRuleCharacteristicBasisSet() throws RecognitionException {
        try {
            // InternalQueryParser.g:837:1: ( ruleCharacteristicBasisSet EOF )
            // InternalQueryParser.g:838:1: ruleCharacteristicBasisSet EOF
            {
             before(grammarAccess.getCharacteristicBasisSetRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristicBasisSet();

            state._fsp--;

             after(grammarAccess.getCharacteristicBasisSetRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCharacteristicBasisSet"


    // $ANTLR start "ruleCharacteristicBasisSet"
    // InternalQueryParser.g:845:1: ruleCharacteristicBasisSet : ( ( rule__CharacteristicBasisSet__Group__0 ) ) ;
    public final void ruleCharacteristicBasisSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:849:2: ( ( ( rule__CharacteristicBasisSet__Group__0 ) ) )
            // InternalQueryParser.g:850:2: ( ( rule__CharacteristicBasisSet__Group__0 ) )
            {
            // InternalQueryParser.g:850:2: ( ( rule__CharacteristicBasisSet__Group__0 ) )
            // InternalQueryParser.g:851:3: ( rule__CharacteristicBasisSet__Group__0 )
            {
             before(grammarAccess.getCharacteristicBasisSetAccess().getGroup()); 
            // InternalQueryParser.g:852:3: ( rule__CharacteristicBasisSet__Group__0 )
            // InternalQueryParser.g:852:4: rule__CharacteristicBasisSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicBasisSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicBasisSetAccess().getGroup()); 

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
    // $ANTLR end "ruleCharacteristicBasisSet"


    // $ANTLR start "entryRuleCompareSet"
    // InternalQueryParser.g:861:1: entryRuleCompareSet : ruleCompareSet EOF ;
    public final void entryRuleCompareSet() throws RecognitionException {
        try {
            // InternalQueryParser.g:862:1: ( ruleCompareSet EOF )
            // InternalQueryParser.g:863:1: ruleCompareSet EOF
            {
             before(grammarAccess.getCompareSetRule()); 
            pushFollow(FOLLOW_1);
            ruleCompareSet();

            state._fsp--;

             after(grammarAccess.getCompareSetRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCompareSet"


    // $ANTLR start "ruleCompareSet"
    // InternalQueryParser.g:870:1: ruleCompareSet : ( ruleSubquery ) ;
    public final void ruleCompareSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:874:2: ( ( ruleSubquery ) )
            // InternalQueryParser.g:875:2: ( ruleSubquery )
            {
            // InternalQueryParser.g:875:2: ( ruleSubquery )
            // InternalQueryParser.g:876:3: ruleSubquery
            {
             before(grammarAccess.getCompareSetAccess().getSubqueryParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleSubquery();

            state._fsp--;

             after(grammarAccess.getCompareSetAccess().getSubqueryParserRuleCall()); 

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
    // $ANTLR end "ruleCompareSet"


    // $ANTLR start "entryRuleCompareOperator"
    // InternalQueryParser.g:886:1: entryRuleCompareOperator : ruleCompareOperator EOF ;
    public final void entryRuleCompareOperator() throws RecognitionException {
        try {
            // InternalQueryParser.g:887:1: ( ruleCompareOperator EOF )
            // InternalQueryParser.g:888:1: ruleCompareOperator EOF
            {
             before(grammarAccess.getCompareOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleCompareOperator();

            state._fsp--;

             after(grammarAccess.getCompareOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCompareOperator"


    // $ANTLR start "ruleCompareOperator"
    // InternalQueryParser.g:895:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:899:2: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // InternalQueryParser.g:900:2: ( ( rule__CompareOperator__Alternatives ) )
            {
            // InternalQueryParser.g:900:2: ( ( rule__CompareOperator__Alternatives ) )
            // InternalQueryParser.g:901:3: ( rule__CompareOperator__Alternatives )
            {
             before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            // InternalQueryParser.g:902:3: ( rule__CompareOperator__Alternatives )
            // InternalQueryParser.g:902:4: rule__CompareOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompareOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "entryRuleSetCompareQuantifier"
    // InternalQueryParser.g:911:1: entryRuleSetCompareQuantifier : ruleSetCompareQuantifier EOF ;
    public final void entryRuleSetCompareQuantifier() throws RecognitionException {
        try {
            // InternalQueryParser.g:912:1: ( ruleSetCompareQuantifier EOF )
            // InternalQueryParser.g:913:1: ruleSetCompareQuantifier EOF
            {
             before(grammarAccess.getSetCompareQuantifierRule()); 
            pushFollow(FOLLOW_1);
            ruleSetCompareQuantifier();

            state._fsp--;

             after(grammarAccess.getSetCompareQuantifierRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSetCompareQuantifier"


    // $ANTLR start "ruleSetCompareQuantifier"
    // InternalQueryParser.g:920:1: ruleSetCompareQuantifier : ( ( rule__SetCompareQuantifier__Alternatives ) ) ;
    public final void ruleSetCompareQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:924:2: ( ( ( rule__SetCompareQuantifier__Alternatives ) ) )
            // InternalQueryParser.g:925:2: ( ( rule__SetCompareQuantifier__Alternatives ) )
            {
            // InternalQueryParser.g:925:2: ( ( rule__SetCompareQuantifier__Alternatives ) )
            // InternalQueryParser.g:926:3: ( rule__SetCompareQuantifier__Alternatives )
            {
             before(grammarAccess.getSetCompareQuantifierAccess().getAlternatives()); 
            // InternalQueryParser.g:927:3: ( rule__SetCompareQuantifier__Alternatives )
            // InternalQueryParser.g:927:4: rule__SetCompareQuantifier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SetCompareQuantifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSetCompareQuantifierAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSetCompareQuantifier"


    // $ANTLR start "entryRuleExistsPredicate"
    // InternalQueryParser.g:936:1: entryRuleExistsPredicate : ruleExistsPredicate EOF ;
    public final void entryRuleExistsPredicate() throws RecognitionException {
        try {
            // InternalQueryParser.g:937:1: ( ruleExistsPredicate EOF )
            // InternalQueryParser.g:938:1: ruleExistsPredicate EOF
            {
             before(grammarAccess.getExistsPredicateRule()); 
            pushFollow(FOLLOW_1);
            ruleExistsPredicate();

            state._fsp--;

             after(grammarAccess.getExistsPredicateRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExistsPredicate"


    // $ANTLR start "ruleExistsPredicate"
    // InternalQueryParser.g:945:1: ruleExistsPredicate : ( ( rule__ExistsPredicate__Group__0 ) ) ;
    public final void ruleExistsPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:949:2: ( ( ( rule__ExistsPredicate__Group__0 ) ) )
            // InternalQueryParser.g:950:2: ( ( rule__ExistsPredicate__Group__0 ) )
            {
            // InternalQueryParser.g:950:2: ( ( rule__ExistsPredicate__Group__0 ) )
            // InternalQueryParser.g:951:3: ( rule__ExistsPredicate__Group__0 )
            {
             before(grammarAccess.getExistsPredicateAccess().getGroup()); 
            // InternalQueryParser.g:952:3: ( rule__ExistsPredicate__Group__0 )
            // InternalQueryParser.g:952:4: rule__ExistsPredicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExistsPredicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExistsPredicateAccess().getGroup()); 

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
    // $ANTLR end "ruleExistsPredicate"


    // $ANTLR start "entryRulePredicateTerm"
    // InternalQueryParser.g:961:1: entryRulePredicateTerm : rulePredicateTerm EOF ;
    public final void entryRulePredicateTerm() throws RecognitionException {
        try {
            // InternalQueryParser.g:962:1: ( rulePredicateTerm EOF )
            // InternalQueryParser.g:963:1: rulePredicateTerm EOF
            {
             before(grammarAccess.getPredicateTermRule()); 
            pushFollow(FOLLOW_1);
            rulePredicateTerm();

            state._fsp--;

             after(grammarAccess.getPredicateTermRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePredicateTerm"


    // $ANTLR start "rulePredicateTerm"
    // InternalQueryParser.g:970:1: rulePredicateTerm : ( ( rule__PredicateTerm__Alternatives ) ) ;
    public final void rulePredicateTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:974:2: ( ( ( rule__PredicateTerm__Alternatives ) ) )
            // InternalQueryParser.g:975:2: ( ( rule__PredicateTerm__Alternatives ) )
            {
            // InternalQueryParser.g:975:2: ( ( rule__PredicateTerm__Alternatives ) )
            // InternalQueryParser.g:976:3: ( rule__PredicateTerm__Alternatives )
            {
             before(grammarAccess.getPredicateTermAccess().getAlternatives()); 
            // InternalQueryParser.g:977:3: ( rule__PredicateTerm__Alternatives )
            // InternalQueryParser.g:977:4: rule__PredicateTerm__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PredicateTerm__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPredicateTermAccess().getAlternatives()); 

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
    // $ANTLR end "rulePredicateTerm"


    // $ANTLR start "entryRuleCharacteristicBasis"
    // InternalQueryParser.g:986:1: entryRuleCharacteristicBasis : ruleCharacteristicBasis EOF ;
    public final void entryRuleCharacteristicBasis() throws RecognitionException {
        try {
            // InternalQueryParser.g:987:1: ( ruleCharacteristicBasis EOF )
            // InternalQueryParser.g:988:1: ruleCharacteristicBasis EOF
            {
             before(grammarAccess.getCharacteristicBasisRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristicBasis();

            state._fsp--;

             after(grammarAccess.getCharacteristicBasisRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCharacteristicBasis"


    // $ANTLR start "ruleCharacteristicBasis"
    // InternalQueryParser.g:995:1: ruleCharacteristicBasis : ( ( rule__CharacteristicBasis__Alternatives ) ) ;
    public final void ruleCharacteristicBasis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:999:2: ( ( ( rule__CharacteristicBasis__Alternatives ) ) )
            // InternalQueryParser.g:1000:2: ( ( rule__CharacteristicBasis__Alternatives ) )
            {
            // InternalQueryParser.g:1000:2: ( ( rule__CharacteristicBasis__Alternatives ) )
            // InternalQueryParser.g:1001:3: ( rule__CharacteristicBasis__Alternatives )
            {
             before(grammarAccess.getCharacteristicBasisAccess().getAlternatives()); 
            // InternalQueryParser.g:1002:3: ( rule__CharacteristicBasis__Alternatives )
            // InternalQueryParser.g:1002:4: rule__CharacteristicBasis__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicBasis__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicBasisAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCharacteristicBasis"


    // $ANTLR start "entryRuleSubquery"
    // InternalQueryParser.g:1011:1: entryRuleSubquery : ruleSubquery EOF ;
    public final void entryRuleSubquery() throws RecognitionException {
        try {
            // InternalQueryParser.g:1012:1: ( ruleSubquery EOF )
            // InternalQueryParser.g:1013:1: ruleSubquery EOF
            {
             before(grammarAccess.getSubqueryRule()); 
            pushFollow(FOLLOW_1);
            ruleSubquery();

            state._fsp--;

             after(grammarAccess.getSubqueryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSubquery"


    // $ANTLR start "ruleSubquery"
    // InternalQueryParser.g:1020:1: ruleSubquery : ( ( rule__Subquery__Group__0 ) ) ;
    public final void ruleSubquery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1024:2: ( ( ( rule__Subquery__Group__0 ) ) )
            // InternalQueryParser.g:1025:2: ( ( rule__Subquery__Group__0 ) )
            {
            // InternalQueryParser.g:1025:2: ( ( rule__Subquery__Group__0 ) )
            // InternalQueryParser.g:1026:3: ( rule__Subquery__Group__0 )
            {
             before(grammarAccess.getSubqueryAccess().getGroup()); 
            // InternalQueryParser.g:1027:3: ( rule__Subquery__Group__0 )
            // InternalQueryParser.g:1027:4: rule__Subquery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subquery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubqueryAccess().getGroup()); 

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
    // $ANTLR end "ruleSubquery"


    // $ANTLR start "entryRuleCharacteristicReference"
    // InternalQueryParser.g:1036:1: entryRuleCharacteristicReference : ruleCharacteristicReference EOF ;
    public final void entryRuleCharacteristicReference() throws RecognitionException {
        try {
            // InternalQueryParser.g:1037:1: ( ruleCharacteristicReference EOF )
            // InternalQueryParser.g:1038:1: ruleCharacteristicReference EOF
            {
             before(grammarAccess.getCharacteristicReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristicReference();

            state._fsp--;

             after(grammarAccess.getCharacteristicReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCharacteristicReference"


    // $ANTLR start "ruleCharacteristicReference"
    // InternalQueryParser.g:1045:1: ruleCharacteristicReference : ( ruleQueryIdentifier ) ;
    public final void ruleCharacteristicReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1049:2: ( ( ruleQueryIdentifier ) )
            // InternalQueryParser.g:1050:2: ( ruleQueryIdentifier )
            {
            // InternalQueryParser.g:1050:2: ( ruleQueryIdentifier )
            // InternalQueryParser.g:1051:3: ruleQueryIdentifier
            {
             before(grammarAccess.getCharacteristicReferenceAccess().getQueryIdentifierParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleQueryIdentifier();

            state._fsp--;

             after(grammarAccess.getCharacteristicReferenceAccess().getQueryIdentifierParserRuleCall()); 

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
    // $ANTLR end "ruleCharacteristicReference"


    // $ANTLR start "entryRuleEntityTypeReference"
    // InternalQueryParser.g:1061:1: entryRuleEntityTypeReference : ruleEntityTypeReference EOF ;
    public final void entryRuleEntityTypeReference() throws RecognitionException {
        try {
            // InternalQueryParser.g:1062:1: ( ruleEntityTypeReference EOF )
            // InternalQueryParser.g:1063:1: ruleEntityTypeReference EOF
            {
             before(grammarAccess.getEntityTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityTypeReference();

            state._fsp--;

             after(grammarAccess.getEntityTypeReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntityTypeReference"


    // $ANTLR start "ruleEntityTypeReference"
    // InternalQueryParser.g:1070:1: ruleEntityTypeReference : ( ruleQueryIdentifier ) ;
    public final void ruleEntityTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1074:2: ( ( ruleQueryIdentifier ) )
            // InternalQueryParser.g:1075:2: ( ruleQueryIdentifier )
            {
            // InternalQueryParser.g:1075:2: ( ruleQueryIdentifier )
            // InternalQueryParser.g:1076:3: ruleQueryIdentifier
            {
             before(grammarAccess.getEntityTypeReferenceAccess().getQueryIdentifierParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleQueryIdentifier();

            state._fsp--;

             after(grammarAccess.getEntityTypeReferenceAccess().getQueryIdentifierParserRuleCall()); 

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
    // $ANTLR end "ruleEntityTypeReference"


    // $ANTLR start "entryRuleEnumLiteralSet"
    // InternalQueryParser.g:1086:1: entryRuleEnumLiteralSet : ruleEnumLiteralSet EOF ;
    public final void entryRuleEnumLiteralSet() throws RecognitionException {
        try {
            // InternalQueryParser.g:1087:1: ( ruleEnumLiteralSet EOF )
            // InternalQueryParser.g:1088:1: ruleEnumLiteralSet EOF
            {
             before(grammarAccess.getEnumLiteralSetRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumLiteralSet();

            state._fsp--;

             after(grammarAccess.getEnumLiteralSetRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumLiteralSet"


    // $ANTLR start "ruleEnumLiteralSet"
    // InternalQueryParser.g:1095:1: ruleEnumLiteralSet : ( ( rule__EnumLiteralSet__Group__0 ) ) ;
    public final void ruleEnumLiteralSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1099:2: ( ( ( rule__EnumLiteralSet__Group__0 ) ) )
            // InternalQueryParser.g:1100:2: ( ( rule__EnumLiteralSet__Group__0 ) )
            {
            // InternalQueryParser.g:1100:2: ( ( rule__EnumLiteralSet__Group__0 ) )
            // InternalQueryParser.g:1101:3: ( rule__EnumLiteralSet__Group__0 )
            {
             before(grammarAccess.getEnumLiteralSetAccess().getGroup()); 
            // InternalQueryParser.g:1102:3: ( rule__EnumLiteralSet__Group__0 )
            // InternalQueryParser.g:1102:4: rule__EnumLiteralSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteralSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralSetAccess().getGroup()); 

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
    // $ANTLR end "ruleEnumLiteralSet"


    // $ANTLR start "entryRuleEnumLiteralReferenceExpression"
    // InternalQueryParser.g:1111:1: entryRuleEnumLiteralReferenceExpression : ruleEnumLiteralReferenceExpression EOF ;
    public final void entryRuleEnumLiteralReferenceExpression() throws RecognitionException {
        try {
            // InternalQueryParser.g:1112:1: ( ruleEnumLiteralReferenceExpression EOF )
            // InternalQueryParser.g:1113:1: ruleEnumLiteralReferenceExpression EOF
            {
             before(grammarAccess.getEnumLiteralReferenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumLiteralReferenceExpression();

            state._fsp--;

             after(grammarAccess.getEnumLiteralReferenceExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumLiteralReferenceExpression"


    // $ANTLR start "ruleEnumLiteralReferenceExpression"
    // InternalQueryParser.g:1120:1: ruleEnumLiteralReferenceExpression : ( ( rule__EnumLiteralReferenceExpression__Group__0 ) ) ;
    public final void ruleEnumLiteralReferenceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1124:2: ( ( ( rule__EnumLiteralReferenceExpression__Group__0 ) ) )
            // InternalQueryParser.g:1125:2: ( ( rule__EnumLiteralReferenceExpression__Group__0 ) )
            {
            // InternalQueryParser.g:1125:2: ( ( rule__EnumLiteralReferenceExpression__Group__0 ) )
            // InternalQueryParser.g:1126:3: ( rule__EnumLiteralReferenceExpression__Group__0 )
            {
             before(grammarAccess.getEnumLiteralReferenceExpressionAccess().getGroup()); 
            // InternalQueryParser.g:1127:3: ( rule__EnumLiteralReferenceExpression__Group__0 )
            // InternalQueryParser.g:1127:4: rule__EnumLiteralReferenceExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteralReferenceExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralReferenceExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleEnumLiteralReferenceExpression"


    // $ANTLR start "entryRuleEnumerationTypeReference"
    // InternalQueryParser.g:1136:1: entryRuleEnumerationTypeReference : ruleEnumerationTypeReference EOF ;
    public final void entryRuleEnumerationTypeReference() throws RecognitionException {
        try {
            // InternalQueryParser.g:1137:1: ( ruleEnumerationTypeReference EOF )
            // InternalQueryParser.g:1138:1: ruleEnumerationTypeReference EOF
            {
             before(grammarAccess.getEnumerationTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumerationTypeReference();

            state._fsp--;

             after(grammarAccess.getEnumerationTypeReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumerationTypeReference"


    // $ANTLR start "ruleEnumerationTypeReference"
    // InternalQueryParser.g:1145:1: ruleEnumerationTypeReference : ( ruleQueryIdentifier ) ;
    public final void ruleEnumerationTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1149:2: ( ( ruleQueryIdentifier ) )
            // InternalQueryParser.g:1150:2: ( ruleQueryIdentifier )
            {
            // InternalQueryParser.g:1150:2: ( ruleQueryIdentifier )
            // InternalQueryParser.g:1151:3: ruleQueryIdentifier
            {
             before(grammarAccess.getEnumerationTypeReferenceAccess().getQueryIdentifierParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleQueryIdentifier();

            state._fsp--;

             after(grammarAccess.getEnumerationTypeReferenceAccess().getQueryIdentifierParserRuleCall()); 

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
    // $ANTLR end "ruleEnumerationTypeReference"


    // $ANTLR start "entryRuleEnumerationLiteralReference"
    // InternalQueryParser.g:1161:1: entryRuleEnumerationLiteralReference : ruleEnumerationLiteralReference EOF ;
    public final void entryRuleEnumerationLiteralReference() throws RecognitionException {
        try {
            // InternalQueryParser.g:1162:1: ( ruleEnumerationLiteralReference EOF )
            // InternalQueryParser.g:1163:1: ruleEnumerationLiteralReference EOF
            {
             before(grammarAccess.getEnumerationLiteralReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumerationLiteralReference();

            state._fsp--;

             after(grammarAccess.getEnumerationLiteralReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumerationLiteralReference"


    // $ANTLR start "ruleEnumerationLiteralReference"
    // InternalQueryParser.g:1170:1: ruleEnumerationLiteralReference : ( ruleQueryIdentifier ) ;
    public final void ruleEnumerationLiteralReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1174:2: ( ( ruleQueryIdentifier ) )
            // InternalQueryParser.g:1175:2: ( ruleQueryIdentifier )
            {
            // InternalQueryParser.g:1175:2: ( ruleQueryIdentifier )
            // InternalQueryParser.g:1176:3: ruleQueryIdentifier
            {
             before(grammarAccess.getEnumerationLiteralReferenceAccess().getQueryIdentifierParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleQueryIdentifier();

            state._fsp--;

             after(grammarAccess.getEnumerationLiteralReferenceAccess().getQueryIdentifierParserRuleCall()); 

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
    // $ANTLR end "ruleEnumerationLiteralReference"


    // $ANTLR start "entryRuleSelectedEntityAlias"
    // InternalQueryParser.g:1186:1: entryRuleSelectedEntityAlias : ruleSelectedEntityAlias EOF ;
    public final void entryRuleSelectedEntityAlias() throws RecognitionException {
        try {
            // InternalQueryParser.g:1187:1: ( ruleSelectedEntityAlias EOF )
            // InternalQueryParser.g:1188:1: ruleSelectedEntityAlias EOF
            {
             before(grammarAccess.getSelectedEntityAliasRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectedEntityAlias();

            state._fsp--;

             after(grammarAccess.getSelectedEntityAliasRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectedEntityAlias"


    // $ANTLR start "ruleSelectedEntityAlias"
    // InternalQueryParser.g:1195:1: ruleSelectedEntityAlias : ( ruleQueryIdentifier ) ;
    public final void ruleSelectedEntityAlias() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1199:2: ( ( ruleQueryIdentifier ) )
            // InternalQueryParser.g:1200:2: ( ruleQueryIdentifier )
            {
            // InternalQueryParser.g:1200:2: ( ruleQueryIdentifier )
            // InternalQueryParser.g:1201:3: ruleQueryIdentifier
            {
             before(grammarAccess.getSelectedEntityAliasAccess().getQueryIdentifierParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleQueryIdentifier();

            state._fsp--;

             after(grammarAccess.getSelectedEntityAliasAccess().getQueryIdentifierParserRuleCall()); 

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
    // $ANTLR end "ruleSelectedEntityAlias"


    // $ANTLR start "entryRuleProjectedCharacteristicAlias"
    // InternalQueryParser.g:1211:1: entryRuleProjectedCharacteristicAlias : ruleProjectedCharacteristicAlias EOF ;
    public final void entryRuleProjectedCharacteristicAlias() throws RecognitionException {
        try {
            // InternalQueryParser.g:1212:1: ( ruleProjectedCharacteristicAlias EOF )
            // InternalQueryParser.g:1213:1: ruleProjectedCharacteristicAlias EOF
            {
             before(grammarAccess.getProjectedCharacteristicAliasRule()); 
            pushFollow(FOLLOW_1);
            ruleProjectedCharacteristicAlias();

            state._fsp--;

             after(grammarAccess.getProjectedCharacteristicAliasRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProjectedCharacteristicAlias"


    // $ANTLR start "ruleProjectedCharacteristicAlias"
    // InternalQueryParser.g:1220:1: ruleProjectedCharacteristicAlias : ( ruleQueryIdentifier ) ;
    public final void ruleProjectedCharacteristicAlias() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1224:2: ( ( ruleQueryIdentifier ) )
            // InternalQueryParser.g:1225:2: ( ruleQueryIdentifier )
            {
            // InternalQueryParser.g:1225:2: ( ruleQueryIdentifier )
            // InternalQueryParser.g:1226:3: ruleQueryIdentifier
            {
             before(grammarAccess.getProjectedCharacteristicAliasAccess().getQueryIdentifierParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleQueryIdentifier();

            state._fsp--;

             after(grammarAccess.getProjectedCharacteristicAliasAccess().getQueryIdentifierParserRuleCall()); 

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
    // $ANTLR end "ruleProjectedCharacteristicAlias"


    // $ANTLR start "entryRuleQueryIdentifier"
    // InternalQueryParser.g:1236:1: entryRuleQueryIdentifier : ruleQueryIdentifier EOF ;
    public final void entryRuleQueryIdentifier() throws RecognitionException {
        try {
            // InternalQueryParser.g:1237:1: ( ruleQueryIdentifier EOF )
            // InternalQueryParser.g:1238:1: ruleQueryIdentifier EOF
            {
             before(grammarAccess.getQueryIdentifierRule()); 
            pushFollow(FOLLOW_1);
            ruleQueryIdentifier();

            state._fsp--;

             after(grammarAccess.getQueryIdentifierRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQueryIdentifier"


    // $ANTLR start "ruleQueryIdentifier"
    // InternalQueryParser.g:1245:1: ruleQueryIdentifier : ( ( rule__QueryIdentifier__IdAssignment ) ) ;
    public final void ruleQueryIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1249:2: ( ( ( rule__QueryIdentifier__IdAssignment ) ) )
            // InternalQueryParser.g:1250:2: ( ( rule__QueryIdentifier__IdAssignment ) )
            {
            // InternalQueryParser.g:1250:2: ( ( rule__QueryIdentifier__IdAssignment ) )
            // InternalQueryParser.g:1251:3: ( rule__QueryIdentifier__IdAssignment )
            {
             before(grammarAccess.getQueryIdentifierAccess().getIdAssignment()); 
            // InternalQueryParser.g:1252:3: ( rule__QueryIdentifier__IdAssignment )
            // InternalQueryParser.g:1252:4: rule__QueryIdentifier__IdAssignment
            {
            pushFollow(FOLLOW_2);
            rule__QueryIdentifier__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getQueryIdentifierAccess().getIdAssignment()); 

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
    // $ANTLR end "ruleQueryIdentifier"


    // $ANTLR start "rule__SetQualifier__Alternatives"
    // InternalQueryParser.g:1260:1: rule__SetQualifier__Alternatives : ( ( RULE_KW_DISTINCT ) | ( RULE_KW_ALL ) );
    public final void rule__SetQualifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1264:1: ( ( RULE_KW_DISTINCT ) | ( RULE_KW_ALL ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_KW_DISTINCT) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_KW_ALL) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalQueryParser.g:1265:2: ( RULE_KW_DISTINCT )
                    {
                    // InternalQueryParser.g:1265:2: ( RULE_KW_DISTINCT )
                    // InternalQueryParser.g:1266:3: RULE_KW_DISTINCT
                    {
                     before(grammarAccess.getSetQualifierAccess().getKW_DISTINCTTerminalRuleCall_0()); 
                    match(input,RULE_KW_DISTINCT,FOLLOW_2); 
                     after(grammarAccess.getSetQualifierAccess().getKW_DISTINCTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryParser.g:1271:2: ( RULE_KW_ALL )
                    {
                    // InternalQueryParser.g:1271:2: ( RULE_KW_ALL )
                    // InternalQueryParser.g:1272:3: RULE_KW_ALL
                    {
                     before(grammarAccess.getSetQualifierAccess().getKW_ALLTerminalRuleCall_1()); 
                    match(input,RULE_KW_ALL,FOLLOW_2); 
                     after(grammarAccess.getSetQualifierAccess().getKW_ALLTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__SetQualifier__Alternatives"


    // $ANTLR start "rule__ProjectedCharacteristicList__Alternatives"
    // InternalQueryParser.g:1281:1: rule__ProjectedCharacteristicList__Alternatives : ( ( ( rule__ProjectedCharacteristicList__AllAssignment_0 ) ) | ( ( rule__ProjectedCharacteristicList__Group_1__0 ) ) );
    public final void rule__ProjectedCharacteristicList__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1285:1: ( ( ( rule__ProjectedCharacteristicList__AllAssignment_0 ) ) | ( ( rule__ProjectedCharacteristicList__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ALL_CHARACTERISTICS) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_IDENTIFIER) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalQueryParser.g:1286:2: ( ( rule__ProjectedCharacteristicList__AllAssignment_0 ) )
                    {
                    // InternalQueryParser.g:1286:2: ( ( rule__ProjectedCharacteristicList__AllAssignment_0 ) )
                    // InternalQueryParser.g:1287:3: ( rule__ProjectedCharacteristicList__AllAssignment_0 )
                    {
                     before(grammarAccess.getProjectedCharacteristicListAccess().getAllAssignment_0()); 
                    // InternalQueryParser.g:1288:3: ( rule__ProjectedCharacteristicList__AllAssignment_0 )
                    // InternalQueryParser.g:1288:4: rule__ProjectedCharacteristicList__AllAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectedCharacteristicList__AllAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProjectedCharacteristicListAccess().getAllAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryParser.g:1292:2: ( ( rule__ProjectedCharacteristicList__Group_1__0 ) )
                    {
                    // InternalQueryParser.g:1292:2: ( ( rule__ProjectedCharacteristicList__Group_1__0 ) )
                    // InternalQueryParser.g:1293:3: ( rule__ProjectedCharacteristicList__Group_1__0 )
                    {
                     before(grammarAccess.getProjectedCharacteristicListAccess().getGroup_1()); 
                    // InternalQueryParser.g:1294:3: ( rule__ProjectedCharacteristicList__Group_1__0 )
                    // InternalQueryParser.g:1294:4: rule__ProjectedCharacteristicList__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectedCharacteristicList__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProjectedCharacteristicListAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ProjectedCharacteristicList__Alternatives"


    // $ANTLR start "rule__ProjectedCharacteristicExpression__Alternatives"
    // InternalQueryParser.g:1302:1: rule__ProjectedCharacteristicExpression__Alternatives : ( ( ruleSelectedEntityCharacteristicWildcardReference ) | ( ruleExplicitSelectedEntityCharacteristicReference ) );
    public final void rule__ProjectedCharacteristicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1306:1: ( ( ruleSelectedEntityCharacteristicWildcardReference ) | ( ruleExplicitSelectedEntityCharacteristicReference ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_IDENTIFIER) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==From||LA3_1==RULE_KW_AS||LA3_1==RULE_COMMA||LA3_1==RULE_IDENTIFIER) ) {
                    alt3=2;
                }
                else if ( (LA3_1==RULE_PERIOD) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==RULE_ALL_CHARACTERISTICS) ) {
                        alt3=1;
                    }
                    else if ( (LA3_3==RULE_IDENTIFIER) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalQueryParser.g:1307:2: ( ruleSelectedEntityCharacteristicWildcardReference )
                    {
                    // InternalQueryParser.g:1307:2: ( ruleSelectedEntityCharacteristicWildcardReference )
                    // InternalQueryParser.g:1308:3: ruleSelectedEntityCharacteristicWildcardReference
                    {
                     before(grammarAccess.getProjectedCharacteristicExpressionAccess().getSelectedEntityCharacteristicWildcardReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectedEntityCharacteristicWildcardReference();

                    state._fsp--;

                     after(grammarAccess.getProjectedCharacteristicExpressionAccess().getSelectedEntityCharacteristicWildcardReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryParser.g:1313:2: ( ruleExplicitSelectedEntityCharacteristicReference )
                    {
                    // InternalQueryParser.g:1313:2: ( ruleExplicitSelectedEntityCharacteristicReference )
                    // InternalQueryParser.g:1314:3: ruleExplicitSelectedEntityCharacteristicReference
                    {
                     before(grammarAccess.getProjectedCharacteristicExpressionAccess().getExplicitSelectedEntityCharacteristicReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExplicitSelectedEntityCharacteristicReference();

                    state._fsp--;

                     after(grammarAccess.getProjectedCharacteristicExpressionAccess().getExplicitSelectedEntityCharacteristicReferenceParserRuleCall_1()); 

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
    // $ANTLR end "rule__ProjectedCharacteristicExpression__Alternatives"


    // $ANTLR start "rule__ProjectedCharacteristicReference__Alternatives"
    // InternalQueryParser.g:1323:1: rule__ProjectedCharacteristicReference__Alternatives : ( ( ruleQualifiedProjectedCharacteristicReference ) | ( ruleUnqualifiedProjectedCharacteristicReferenceOrAlias ) );
    public final void rule__ProjectedCharacteristicReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1327:1: ( ( ruleQualifiedProjectedCharacteristicReference ) | ( ruleUnqualifiedProjectedCharacteristicReferenceOrAlias ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_IDENTIFIER) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==Semicolon||(LA4_1>=RULE_KW_ASC && LA4_1<=RULE_KW_DESC)||LA4_1==RULE_COMMA||LA4_1==RULE_RIGHT_PAREN) ) {
                    alt4=2;
                }
                else if ( (LA4_1==RULE_PERIOD) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalQueryParser.g:1328:2: ( ruleQualifiedProjectedCharacteristicReference )
                    {
                    // InternalQueryParser.g:1328:2: ( ruleQualifiedProjectedCharacteristicReference )
                    // InternalQueryParser.g:1329:3: ruleQualifiedProjectedCharacteristicReference
                    {
                     before(grammarAccess.getProjectedCharacteristicReferenceAccess().getQualifiedProjectedCharacteristicReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleQualifiedProjectedCharacteristicReference();

                    state._fsp--;

                     after(grammarAccess.getProjectedCharacteristicReferenceAccess().getQualifiedProjectedCharacteristicReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryParser.g:1334:2: ( ruleUnqualifiedProjectedCharacteristicReferenceOrAlias )
                    {
                    // InternalQueryParser.g:1334:2: ( ruleUnqualifiedProjectedCharacteristicReferenceOrAlias )
                    // InternalQueryParser.g:1335:3: ruleUnqualifiedProjectedCharacteristicReferenceOrAlias
                    {
                     before(grammarAccess.getProjectedCharacteristicReferenceAccess().getUnqualifiedProjectedCharacteristicReferenceOrAliasParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnqualifiedProjectedCharacteristicReferenceOrAlias();

                    state._fsp--;

                     after(grammarAccess.getProjectedCharacteristicReferenceAccess().getUnqualifiedProjectedCharacteristicReferenceOrAliasParserRuleCall_1()); 

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
    // $ANTLR end "rule__ProjectedCharacteristicReference__Alternatives"


    // $ANTLR start "rule__OrderingType__Alternatives"
    // InternalQueryParser.g:1344:1: rule__OrderingType__Alternatives : ( ( RULE_KW_ASC ) | ( RULE_KW_DESC ) );
    public final void rule__OrderingType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1348:1: ( ( RULE_KW_ASC ) | ( RULE_KW_DESC ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_KW_ASC) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_KW_DESC) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalQueryParser.g:1349:2: ( RULE_KW_ASC )
                    {
                    // InternalQueryParser.g:1349:2: ( RULE_KW_ASC )
                    // InternalQueryParser.g:1350:3: RULE_KW_ASC
                    {
                     before(grammarAccess.getOrderingTypeAccess().getKW_ASCTerminalRuleCall_0()); 
                    match(input,RULE_KW_ASC,FOLLOW_2); 
                     after(grammarAccess.getOrderingTypeAccess().getKW_ASCTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryParser.g:1355:2: ( RULE_KW_DESC )
                    {
                    // InternalQueryParser.g:1355:2: ( RULE_KW_DESC )
                    // InternalQueryParser.g:1356:3: RULE_KW_DESC
                    {
                     before(grammarAccess.getOrderingTypeAccess().getKW_DESCTerminalRuleCall_1()); 
                    match(input,RULE_KW_DESC,FOLLOW_2); 
                     after(grammarAccess.getOrderingTypeAccess().getKW_DESCTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__OrderingType__Alternatives"


    // $ANTLR start "rule__BooleanPredicate__Alternatives"
    // InternalQueryParser.g:1365:1: rule__BooleanPredicate__Alternatives : ( ( ruleScalarComparePredicate ) | ( ruleExistsPredicate ) | ( ( rule__BooleanPredicate__Group_2__0 ) ) );
    public final void rule__BooleanPredicate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1369:1: ( ( ruleScalarComparePredicate ) | ( ruleExistsPredicate ) | ( ( rule__BooleanPredicate__Group_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_LEFT_BRACE:
            case RULE_IDENTIFIER:
                {
                alt6=1;
                }
                break;
            case RULE_LEFT_PAREN:
                {
                int LA6_2 = input.LA(2);

                if ( ((LA6_2>=RULE_KW_EXISTS && LA6_2<=RULE_KW_NOT)||LA6_2==RULE_LEFT_PAREN||LA6_2==RULE_LEFT_BRACE||LA6_2==RULE_IDENTIFIER) ) {
                    alt6=3;
                }
                else if ( (LA6_2==Select) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_KW_EXISTS:
                {
                alt6=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalQueryParser.g:1370:2: ( ruleScalarComparePredicate )
                    {
                    // InternalQueryParser.g:1370:2: ( ruleScalarComparePredicate )
                    // InternalQueryParser.g:1371:3: ruleScalarComparePredicate
                    {
                     before(grammarAccess.getBooleanPredicateAccess().getScalarComparePredicateParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleScalarComparePredicate();

                    state._fsp--;

                     after(grammarAccess.getBooleanPredicateAccess().getScalarComparePredicateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryParser.g:1376:2: ( ruleExistsPredicate )
                    {
                    // InternalQueryParser.g:1376:2: ( ruleExistsPredicate )
                    // InternalQueryParser.g:1377:3: ruleExistsPredicate
                    {
                     before(grammarAccess.getBooleanPredicateAccess().getExistsPredicateParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExistsPredicate();

                    state._fsp--;

                     after(grammarAccess.getBooleanPredicateAccess().getExistsPredicateParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryParser.g:1382:2: ( ( rule__BooleanPredicate__Group_2__0 ) )
                    {
                    // InternalQueryParser.g:1382:2: ( ( rule__BooleanPredicate__Group_2__0 ) )
                    // InternalQueryParser.g:1383:3: ( rule__BooleanPredicate__Group_2__0 )
                    {
                     before(grammarAccess.getBooleanPredicateAccess().getGroup_2()); 
                    // InternalQueryParser.g:1384:3: ( rule__BooleanPredicate__Group_2__0 )
                    // InternalQueryParser.g:1384:4: rule__BooleanPredicate__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanPredicate__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanPredicateAccess().getGroup_2()); 

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
    // $ANTLR end "rule__BooleanPredicate__Alternatives"


    // $ANTLR start "rule__LogicalSet__Alternatives"
    // InternalQueryParser.g:1392:1: rule__LogicalSet__Alternatives : ( ( ruleSubquery ) | ( ruleCharacteristicBasisSet ) | ( ruleEnumLiteralSet ) );
    public final void rule__LogicalSet__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1396:1: ( ( ruleSubquery ) | ( ruleCharacteristicBasisSet ) | ( ruleEnumLiteralSet ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_LEFT_PAREN) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==Select) ) {
                    alt7=1;
                }
                else if ( (LA7_1==RULE_LEFT_PAREN||LA7_1==RULE_IDENTIFIER) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_LEFT_BRACE) ) {
                alt7=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalQueryParser.g:1397:2: ( ruleSubquery )
                    {
                    // InternalQueryParser.g:1397:2: ( ruleSubquery )
                    // InternalQueryParser.g:1398:3: ruleSubquery
                    {
                     before(grammarAccess.getLogicalSetAccess().getSubqueryParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSubquery();

                    state._fsp--;

                     after(grammarAccess.getLogicalSetAccess().getSubqueryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryParser.g:1403:2: ( ruleCharacteristicBasisSet )
                    {
                    // InternalQueryParser.g:1403:2: ( ruleCharacteristicBasisSet )
                    // InternalQueryParser.g:1404:3: ruleCharacteristicBasisSet
                    {
                     before(grammarAccess.getLogicalSetAccess().getCharacteristicBasisSetParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCharacteristicBasisSet();

                    state._fsp--;

                     after(grammarAccess.getLogicalSetAccess().getCharacteristicBasisSetParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryParser.g:1409:2: ( ruleEnumLiteralSet )
                    {
                    // InternalQueryParser.g:1409:2: ( ruleEnumLiteralSet )
                    // InternalQueryParser.g:1410:3: ruleEnumLiteralSet
                    {
                     before(grammarAccess.getLogicalSetAccess().getEnumLiteralSetParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumLiteralSet();

                    state._fsp--;

                     after(grammarAccess.getLogicalSetAccess().getEnumLiteralSetParserRuleCall_2()); 

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
    // $ANTLR end "rule__LogicalSet__Alternatives"


    // $ANTLR start "rule__CompareOperator__Alternatives"
    // InternalQueryParser.g:1419:1: rule__CompareOperator__Alternatives : ( ( RULE_EQUALS_OPERATOR ) | ( RULE_NOT_EQUALS_OPERATOR ) | ( RULE_LESS_THAN_OPERATOR ) | ( RULE_GREATER_THAN_OPERATOR ) | ( RULE_LESS_THAN_OR_EQUALS_OPERATOR ) | ( RULE_GREATER_THAN_OR_EQUALS_OPERATOR ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1423:1: ( ( RULE_EQUALS_OPERATOR ) | ( RULE_NOT_EQUALS_OPERATOR ) | ( RULE_LESS_THAN_OPERATOR ) | ( RULE_GREATER_THAN_OPERATOR ) | ( RULE_LESS_THAN_OR_EQUALS_OPERATOR ) | ( RULE_GREATER_THAN_OR_EQUALS_OPERATOR ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case RULE_EQUALS_OPERATOR:
                {
                alt8=1;
                }
                break;
            case RULE_NOT_EQUALS_OPERATOR:
                {
                alt8=2;
                }
                break;
            case RULE_LESS_THAN_OPERATOR:
                {
                alt8=3;
                }
                break;
            case RULE_GREATER_THAN_OPERATOR:
                {
                alt8=4;
                }
                break;
            case RULE_LESS_THAN_OR_EQUALS_OPERATOR:
                {
                alt8=5;
                }
                break;
            case RULE_GREATER_THAN_OR_EQUALS_OPERATOR:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalQueryParser.g:1424:2: ( RULE_EQUALS_OPERATOR )
                    {
                    // InternalQueryParser.g:1424:2: ( RULE_EQUALS_OPERATOR )
                    // InternalQueryParser.g:1425:3: RULE_EQUALS_OPERATOR
                    {
                     before(grammarAccess.getCompareOperatorAccess().getEQUALS_OPERATORTerminalRuleCall_0()); 
                    match(input,RULE_EQUALS_OPERATOR,FOLLOW_2); 
                     after(grammarAccess.getCompareOperatorAccess().getEQUALS_OPERATORTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryParser.g:1430:2: ( RULE_NOT_EQUALS_OPERATOR )
                    {
                    // InternalQueryParser.g:1430:2: ( RULE_NOT_EQUALS_OPERATOR )
                    // InternalQueryParser.g:1431:3: RULE_NOT_EQUALS_OPERATOR
                    {
                     before(grammarAccess.getCompareOperatorAccess().getNOT_EQUALS_OPERATORTerminalRuleCall_1()); 
                    match(input,RULE_NOT_EQUALS_OPERATOR,FOLLOW_2); 
                     after(grammarAccess.getCompareOperatorAccess().getNOT_EQUALS_OPERATORTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryParser.g:1436:2: ( RULE_LESS_THAN_OPERATOR )
                    {
                    // InternalQueryParser.g:1436:2: ( RULE_LESS_THAN_OPERATOR )
                    // InternalQueryParser.g:1437:3: RULE_LESS_THAN_OPERATOR
                    {
                     before(grammarAccess.getCompareOperatorAccess().getLESS_THAN_OPERATORTerminalRuleCall_2()); 
                    match(input,RULE_LESS_THAN_OPERATOR,FOLLOW_2); 
                     after(grammarAccess.getCompareOperatorAccess().getLESS_THAN_OPERATORTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQueryParser.g:1442:2: ( RULE_GREATER_THAN_OPERATOR )
                    {
                    // InternalQueryParser.g:1442:2: ( RULE_GREATER_THAN_OPERATOR )
                    // InternalQueryParser.g:1443:3: RULE_GREATER_THAN_OPERATOR
                    {
                     before(grammarAccess.getCompareOperatorAccess().getGREATER_THAN_OPERATORTerminalRuleCall_3()); 
                    match(input,RULE_GREATER_THAN_OPERATOR,FOLLOW_2); 
                     after(grammarAccess.getCompareOperatorAccess().getGREATER_THAN_OPERATORTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQueryParser.g:1448:2: ( RULE_LESS_THAN_OR_EQUALS_OPERATOR )
                    {
                    // InternalQueryParser.g:1448:2: ( RULE_LESS_THAN_OR_EQUALS_OPERATOR )
                    // InternalQueryParser.g:1449:3: RULE_LESS_THAN_OR_EQUALS_OPERATOR
                    {
                     before(grammarAccess.getCompareOperatorAccess().getLESS_THAN_OR_EQUALS_OPERATORTerminalRuleCall_4()); 
                    match(input,RULE_LESS_THAN_OR_EQUALS_OPERATOR,FOLLOW_2); 
                     after(grammarAccess.getCompareOperatorAccess().getLESS_THAN_OR_EQUALS_OPERATORTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQueryParser.g:1454:2: ( RULE_GREATER_THAN_OR_EQUALS_OPERATOR )
                    {
                    // InternalQueryParser.g:1454:2: ( RULE_GREATER_THAN_OR_EQUALS_OPERATOR )
                    // InternalQueryParser.g:1455:3: RULE_GREATER_THAN_OR_EQUALS_OPERATOR
                    {
                     before(grammarAccess.getCompareOperatorAccess().getGREATER_THAN_OR_EQUALS_OPERATORTerminalRuleCall_5()); 
                    match(input,RULE_GREATER_THAN_OR_EQUALS_OPERATOR,FOLLOW_2); 
                     after(grammarAccess.getCompareOperatorAccess().getGREATER_THAN_OR_EQUALS_OPERATORTerminalRuleCall_5()); 

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
    // $ANTLR end "rule__CompareOperator__Alternatives"


    // $ANTLR start "rule__SetCompareQuantifier__Alternatives"
    // InternalQueryParser.g:1464:1: rule__SetCompareQuantifier__Alternatives : ( ( RULE_KW_ALL ) | ( RULE_KW_SOME ) );
    public final void rule__SetCompareQuantifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1468:1: ( ( RULE_KW_ALL ) | ( RULE_KW_SOME ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_KW_ALL) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_KW_SOME) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalQueryParser.g:1469:2: ( RULE_KW_ALL )
                    {
                    // InternalQueryParser.g:1469:2: ( RULE_KW_ALL )
                    // InternalQueryParser.g:1470:3: RULE_KW_ALL
                    {
                     before(grammarAccess.getSetCompareQuantifierAccess().getKW_ALLTerminalRuleCall_0()); 
                    match(input,RULE_KW_ALL,FOLLOW_2); 
                     after(grammarAccess.getSetCompareQuantifierAccess().getKW_ALLTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryParser.g:1475:2: ( RULE_KW_SOME )
                    {
                    // InternalQueryParser.g:1475:2: ( RULE_KW_SOME )
                    // InternalQueryParser.g:1476:3: RULE_KW_SOME
                    {
                     before(grammarAccess.getSetCompareQuantifierAccess().getKW_SOMETerminalRuleCall_1()); 
                    match(input,RULE_KW_SOME,FOLLOW_2); 
                     after(grammarAccess.getSetCompareQuantifierAccess().getKW_SOMETerminalRuleCall_1()); 

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
    // $ANTLR end "rule__SetCompareQuantifier__Alternatives"


    // $ANTLR start "rule__PredicateTerm__Alternatives"
    // InternalQueryParser.g:1485:1: rule__PredicateTerm__Alternatives : ( ( ruleCharacteristicBasis ) | ( ruleEnumLiteralReferenceExpression ) );
    public final void rule__PredicateTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1489:1: ( ( ruleCharacteristicBasis ) | ( ruleEnumLiteralReferenceExpression ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_LEFT_PAREN||LA10_0==RULE_IDENTIFIER) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_LEFT_BRACE) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalQueryParser.g:1490:2: ( ruleCharacteristicBasis )
                    {
                    // InternalQueryParser.g:1490:2: ( ruleCharacteristicBasis )
                    // InternalQueryParser.g:1491:3: ruleCharacteristicBasis
                    {
                     before(grammarAccess.getPredicateTermAccess().getCharacteristicBasisParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCharacteristicBasis();

                    state._fsp--;

                     after(grammarAccess.getPredicateTermAccess().getCharacteristicBasisParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryParser.g:1496:2: ( ruleEnumLiteralReferenceExpression )
                    {
                    // InternalQueryParser.g:1496:2: ( ruleEnumLiteralReferenceExpression )
                    // InternalQueryParser.g:1497:3: ruleEnumLiteralReferenceExpression
                    {
                     before(grammarAccess.getPredicateTermAccess().getEnumLiteralReferenceExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumLiteralReferenceExpression();

                    state._fsp--;

                     after(grammarAccess.getPredicateTermAccess().getEnumLiteralReferenceExpressionParserRuleCall_1()); 

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
    // $ANTLR end "rule__PredicateTerm__Alternatives"


    // $ANTLR start "rule__CharacteristicBasis__Alternatives"
    // InternalQueryParser.g:1506:1: rule__CharacteristicBasis__Alternatives : ( ( ruleSelectedEntityCharacteristicReference ) | ( ruleSubquery ) );
    public final void rule__CharacteristicBasis__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1510:1: ( ( ruleSelectedEntityCharacteristicReference ) | ( ruleSubquery ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_IDENTIFIER) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_LEFT_PAREN) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalQueryParser.g:1511:2: ( ruleSelectedEntityCharacteristicReference )
                    {
                    // InternalQueryParser.g:1511:2: ( ruleSelectedEntityCharacteristicReference )
                    // InternalQueryParser.g:1512:3: ruleSelectedEntityCharacteristicReference
                    {
                     before(grammarAccess.getCharacteristicBasisAccess().getSelectedEntityCharacteristicReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectedEntityCharacteristicReference();

                    state._fsp--;

                     after(grammarAccess.getCharacteristicBasisAccess().getSelectedEntityCharacteristicReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryParser.g:1517:2: ( ruleSubquery )
                    {
                    // InternalQueryParser.g:1517:2: ( ruleSubquery )
                    // InternalQueryParser.g:1518:3: ruleSubquery
                    {
                     before(grammarAccess.getCharacteristicBasisAccess().getSubqueryParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSubquery();

                    state._fsp--;

                     after(grammarAccess.getCharacteristicBasisAccess().getSubqueryParserRuleCall_1()); 

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
    // $ANTLR end "rule__CharacteristicBasis__Alternatives"


    // $ANTLR start "rule__QueryStatement__Group__0"
    // InternalQueryParser.g:1527:1: rule__QueryStatement__Group__0 : rule__QueryStatement__Group__0__Impl rule__QueryStatement__Group__1 ;
    public final void rule__QueryStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1531:1: ( rule__QueryStatement__Group__0__Impl rule__QueryStatement__Group__1 )
            // InternalQueryParser.g:1532:2: rule__QueryStatement__Group__0__Impl rule__QueryStatement__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__QueryStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryStatement__Group__1();

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
    // $ANTLR end "rule__QueryStatement__Group__0"


    // $ANTLR start "rule__QueryStatement__Group__0__Impl"
    // InternalQueryParser.g:1539:1: rule__QueryStatement__Group__0__Impl : ( Select ) ;
    public final void rule__QueryStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1543:1: ( ( Select ) )
            // InternalQueryParser.g:1544:1: ( Select )
            {
            // InternalQueryParser.g:1544:1: ( Select )
            // InternalQueryParser.g:1545:2: Select
            {
             before(grammarAccess.getQueryStatementAccess().getSelectKeyword_0()); 
            match(input,Select,FOLLOW_2); 
             after(grammarAccess.getQueryStatementAccess().getSelectKeyword_0()); 

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
    // $ANTLR end "rule__QueryStatement__Group__0__Impl"


    // $ANTLR start "rule__QueryStatement__Group__1"
    // InternalQueryParser.g:1554:1: rule__QueryStatement__Group__1 : rule__QueryStatement__Group__1__Impl rule__QueryStatement__Group__2 ;
    public final void rule__QueryStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1558:1: ( rule__QueryStatement__Group__1__Impl rule__QueryStatement__Group__2 )
            // InternalQueryParser.g:1559:2: rule__QueryStatement__Group__1__Impl rule__QueryStatement__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__QueryStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryStatement__Group__2();

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
    // $ANTLR end "rule__QueryStatement__Group__1"


    // $ANTLR start "rule__QueryStatement__Group__1__Impl"
    // InternalQueryParser.g:1566:1: rule__QueryStatement__Group__1__Impl : ( ( rule__QueryStatement__QualifierAssignment_1 )? ) ;
    public final void rule__QueryStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1570:1: ( ( ( rule__QueryStatement__QualifierAssignment_1 )? ) )
            // InternalQueryParser.g:1571:1: ( ( rule__QueryStatement__QualifierAssignment_1 )? )
            {
            // InternalQueryParser.g:1571:1: ( ( rule__QueryStatement__QualifierAssignment_1 )? )
            // InternalQueryParser.g:1572:2: ( rule__QueryStatement__QualifierAssignment_1 )?
            {
             before(grammarAccess.getQueryStatementAccess().getQualifierAssignment_1()); 
            // InternalQueryParser.g:1573:2: ( rule__QueryStatement__QualifierAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_KW_ALL||LA12_0==RULE_KW_DISTINCT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalQueryParser.g:1573:3: rule__QueryStatement__QualifierAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__QueryStatement__QualifierAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryStatementAccess().getQualifierAssignment_1()); 

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
    // $ANTLR end "rule__QueryStatement__Group__1__Impl"


    // $ANTLR start "rule__QueryStatement__Group__2"
    // InternalQueryParser.g:1581:1: rule__QueryStatement__Group__2 : rule__QueryStatement__Group__2__Impl rule__QueryStatement__Group__3 ;
    public final void rule__QueryStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1585:1: ( rule__QueryStatement__Group__2__Impl rule__QueryStatement__Group__3 )
            // InternalQueryParser.g:1586:2: rule__QueryStatement__Group__2__Impl rule__QueryStatement__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__QueryStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryStatement__Group__3();

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
    // $ANTLR end "rule__QueryStatement__Group__2"


    // $ANTLR start "rule__QueryStatement__Group__2__Impl"
    // InternalQueryParser.g:1593:1: rule__QueryStatement__Group__2__Impl : ( ( rule__QueryStatement__ProjectedCharacteristicListAssignment_2 ) ) ;
    public final void rule__QueryStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1597:1: ( ( ( rule__QueryStatement__ProjectedCharacteristicListAssignment_2 ) ) )
            // InternalQueryParser.g:1598:1: ( ( rule__QueryStatement__ProjectedCharacteristicListAssignment_2 ) )
            {
            // InternalQueryParser.g:1598:1: ( ( rule__QueryStatement__ProjectedCharacteristicListAssignment_2 ) )
            // InternalQueryParser.g:1599:2: ( rule__QueryStatement__ProjectedCharacteristicListAssignment_2 )
            {
             before(grammarAccess.getQueryStatementAccess().getProjectedCharacteristicListAssignment_2()); 
            // InternalQueryParser.g:1600:2: ( rule__QueryStatement__ProjectedCharacteristicListAssignment_2 )
            // InternalQueryParser.g:1600:3: rule__QueryStatement__ProjectedCharacteristicListAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__QueryStatement__ProjectedCharacteristicListAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQueryStatementAccess().getProjectedCharacteristicListAssignment_2()); 

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
    // $ANTLR end "rule__QueryStatement__Group__2__Impl"


    // $ANTLR start "rule__QueryStatement__Group__3"
    // InternalQueryParser.g:1608:1: rule__QueryStatement__Group__3 : rule__QueryStatement__Group__3__Impl rule__QueryStatement__Group__4 ;
    public final void rule__QueryStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1612:1: ( rule__QueryStatement__Group__3__Impl rule__QueryStatement__Group__4 )
            // InternalQueryParser.g:1613:2: rule__QueryStatement__Group__3__Impl rule__QueryStatement__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__QueryStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryStatement__Group__4();

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
    // $ANTLR end "rule__QueryStatement__Group__3"


    // $ANTLR start "rule__QueryStatement__Group__3__Impl"
    // InternalQueryParser.g:1620:1: rule__QueryStatement__Group__3__Impl : ( ( rule__QueryStatement__SelectedEntityExpressionAssignment_3 ) ) ;
    public final void rule__QueryStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1624:1: ( ( ( rule__QueryStatement__SelectedEntityExpressionAssignment_3 ) ) )
            // InternalQueryParser.g:1625:1: ( ( rule__QueryStatement__SelectedEntityExpressionAssignment_3 ) )
            {
            // InternalQueryParser.g:1625:1: ( ( rule__QueryStatement__SelectedEntityExpressionAssignment_3 ) )
            // InternalQueryParser.g:1626:2: ( rule__QueryStatement__SelectedEntityExpressionAssignment_3 )
            {
             before(grammarAccess.getQueryStatementAccess().getSelectedEntityExpressionAssignment_3()); 
            // InternalQueryParser.g:1627:2: ( rule__QueryStatement__SelectedEntityExpressionAssignment_3 )
            // InternalQueryParser.g:1627:3: rule__QueryStatement__SelectedEntityExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__QueryStatement__SelectedEntityExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQueryStatementAccess().getSelectedEntityExpressionAssignment_3()); 

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
    // $ANTLR end "rule__QueryStatement__Group__3__Impl"


    // $ANTLR start "rule__QueryStatement__Group__4"
    // InternalQueryParser.g:1635:1: rule__QueryStatement__Group__4 : rule__QueryStatement__Group__4__Impl ;
    public final void rule__QueryStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1639:1: ( rule__QueryStatement__Group__4__Impl )
            // InternalQueryParser.g:1640:2: rule__QueryStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QueryStatement__Group__4__Impl();

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
    // $ANTLR end "rule__QueryStatement__Group__4"


    // $ANTLR start "rule__QueryStatement__Group__4__Impl"
    // InternalQueryParser.g:1646:1: rule__QueryStatement__Group__4__Impl : ( ( Semicolon )? ) ;
    public final void rule__QueryStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1650:1: ( ( ( Semicolon )? ) )
            // InternalQueryParser.g:1651:1: ( ( Semicolon )? )
            {
            // InternalQueryParser.g:1651:1: ( ( Semicolon )? )
            // InternalQueryParser.g:1652:2: ( Semicolon )?
            {
             before(grammarAccess.getQueryStatementAccess().getSemicolonKeyword_4()); 
            // InternalQueryParser.g:1653:2: ( Semicolon )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Semicolon) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalQueryParser.g:1653:3: Semicolon
                    {
                    match(input,Semicolon,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQueryStatementAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__QueryStatement__Group__4__Impl"


    // $ANTLR start "rule__ProjectedCharacteristicList__Group_1__0"
    // InternalQueryParser.g:1662:1: rule__ProjectedCharacteristicList__Group_1__0 : rule__ProjectedCharacteristicList__Group_1__0__Impl rule__ProjectedCharacteristicList__Group_1__1 ;
    public final void rule__ProjectedCharacteristicList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1666:1: ( rule__ProjectedCharacteristicList__Group_1__0__Impl rule__ProjectedCharacteristicList__Group_1__1 )
            // InternalQueryParser.g:1667:2: rule__ProjectedCharacteristicList__Group_1__0__Impl rule__ProjectedCharacteristicList__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__ProjectedCharacteristicList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectedCharacteristicList__Group_1__1();

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
    // $ANTLR end "rule__ProjectedCharacteristicList__Group_1__0"


    // $ANTLR start "rule__ProjectedCharacteristicList__Group_1__0__Impl"
    // InternalQueryParser.g:1674:1: rule__ProjectedCharacteristicList__Group_1__0__Impl : ( ( rule__ProjectedCharacteristicList__CharacteristicAssignment_1_0 ) ) ;
    public final void rule__ProjectedCharacteristicList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1678:1: ( ( ( rule__ProjectedCharacteristicList__CharacteristicAssignment_1_0 ) ) )
            // InternalQueryParser.g:1679:1: ( ( rule__ProjectedCharacteristicList__CharacteristicAssignment_1_0 ) )
            {
            // InternalQueryParser.g:1679:1: ( ( rule__ProjectedCharacteristicList__CharacteristicAssignment_1_0 ) )
            // InternalQueryParser.g:1680:2: ( rule__ProjectedCharacteristicList__CharacteristicAssignment_1_0 )
            {
             before(grammarAccess.getProjectedCharacteristicListAccess().getCharacteristicAssignment_1_0()); 
            // InternalQueryParser.g:1681:2: ( rule__ProjectedCharacteristicList__CharacteristicAssignment_1_0 )
            // InternalQueryParser.g:1681:3: rule__ProjectedCharacteristicList__CharacteristicAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ProjectedCharacteristicList__CharacteristicAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getProjectedCharacteristicListAccess().getCharacteristicAssignment_1_0()); 

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
    // $ANTLR end "rule__ProjectedCharacteristicList__Group_1__0__Impl"


    // $ANTLR start "rule__ProjectedCharacteristicList__Group_1__1"
    // InternalQueryParser.g:1689:1: rule__ProjectedCharacteristicList__Group_1__1 : rule__ProjectedCharacteristicList__Group_1__1__Impl ;
    public final void rule__ProjectedCharacteristicList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1693:1: ( rule__ProjectedCharacteristicList__Group_1__1__Impl )
            // InternalQueryParser.g:1694:2: rule__ProjectedCharacteristicList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectedCharacteristicList__Group_1__1__Impl();

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
    // $ANTLR end "rule__ProjectedCharacteristicList__Group_1__1"


    // $ANTLR start "rule__ProjectedCharacteristicList__Group_1__1__Impl"
    // InternalQueryParser.g:1700:1: rule__ProjectedCharacteristicList__Group_1__1__Impl : ( ( rule__ProjectedCharacteristicList__Group_1_1__0 )* ) ;
    public final void rule__ProjectedCharacteristicList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1704:1: ( ( ( rule__ProjectedCharacteristicList__Group_1_1__0 )* ) )
            // InternalQueryParser.g:1705:1: ( ( rule__ProjectedCharacteristicList__Group_1_1__0 )* )
            {
            // InternalQueryParser.g:1705:1: ( ( rule__ProjectedCharacteristicList__Group_1_1__0 )* )
            // InternalQueryParser.g:1706:2: ( rule__ProjectedCharacteristicList__Group_1_1__0 )*
            {
             before(grammarAccess.getProjectedCharacteristicListAccess().getGroup_1_1()); 
            // InternalQueryParser.g:1707:2: ( rule__ProjectedCharacteristicList__Group_1_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalQueryParser.g:1707:3: rule__ProjectedCharacteristicList__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ProjectedCharacteristicList__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getProjectedCharacteristicListAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__ProjectedCharacteristicList__Group_1__1__Impl"


    // $ANTLR start "rule__ProjectedCharacteristicList__Group_1_1__0"
    // InternalQueryParser.g:1716:1: rule__ProjectedCharacteristicList__Group_1_1__0 : rule__ProjectedCharacteristicList__Group_1_1__0__Impl rule__ProjectedCharacteristicList__Group_1_1__1 ;
    public final void rule__ProjectedCharacteristicList__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1720:1: ( rule__ProjectedCharacteristicList__Group_1_1__0__Impl rule__ProjectedCharacteristicList__Group_1_1__1 )
            // InternalQueryParser.g:1721:2: rule__ProjectedCharacteristicList__Group_1_1__0__Impl rule__ProjectedCharacteristicList__Group_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ProjectedCharacteristicList__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectedCharacteristicList__Group_1_1__1();

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
    // $ANTLR end "rule__ProjectedCharacteristicList__Group_1_1__0"


    // $ANTLR start "rule__ProjectedCharacteristicList__Group_1_1__0__Impl"
    // InternalQueryParser.g:1728:1: rule__ProjectedCharacteristicList__Group_1_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__ProjectedCharacteristicList__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1732:1: ( ( RULE_COMMA ) )
            // InternalQueryParser.g:1733:1: ( RULE_COMMA )
            {
            // InternalQueryParser.g:1733:1: ( RULE_COMMA )
            // InternalQueryParser.g:1734:2: RULE_COMMA
            {
             before(grammarAccess.getProjectedCharacteristicListAccess().getCOMMATerminalRuleCall_1_1_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getProjectedCharacteristicListAccess().getCOMMATerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ProjectedCharacteristicList__Group_1_1__0__Impl"


    // $ANTLR start "rule__ProjectedCharacteristicList__Group_1_1__1"
    // InternalQueryParser.g:1743:1: rule__ProjectedCharacteristicList__Group_1_1__1 : rule__ProjectedCharacteristicList__Group_1_1__1__Impl ;
    public final void rule__ProjectedCharacteristicList__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1747:1: ( rule__ProjectedCharacteristicList__Group_1_1__1__Impl )
            // InternalQueryParser.g:1748:2: rule__ProjectedCharacteristicList__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectedCharacteristicList__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__ProjectedCharacteristicList__Group_1_1__1"


    // $ANTLR start "rule__ProjectedCharacteristicList__Group_1_1__1__Impl"
    // InternalQueryParser.g:1754:1: rule__ProjectedCharacteristicList__Group_1_1__1__Impl : ( ( rule__ProjectedCharacteristicList__CharacteristicAssignment_1_1_1 ) ) ;
    public final void rule__ProjectedCharacteristicList__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1758:1: ( ( ( rule__ProjectedCharacteristicList__CharacteristicAssignment_1_1_1 ) ) )
            // InternalQueryParser.g:1759:1: ( ( rule__ProjectedCharacteristicList__CharacteristicAssignment_1_1_1 ) )
            {
            // InternalQueryParser.g:1759:1: ( ( rule__ProjectedCharacteristicList__CharacteristicAssignment_1_1_1 ) )
            // InternalQueryParser.g:1760:2: ( rule__ProjectedCharacteristicList__CharacteristicAssignment_1_1_1 )
            {
             before(grammarAccess.getProjectedCharacteristicListAccess().getCharacteristicAssignment_1_1_1()); 
            // InternalQueryParser.g:1761:2: ( rule__ProjectedCharacteristicList__CharacteristicAssignment_1_1_1 )
            // InternalQueryParser.g:1761:3: rule__ProjectedCharacteristicList__CharacteristicAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ProjectedCharacteristicList__CharacteristicAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectedCharacteristicListAccess().getCharacteristicAssignment_1_1_1()); 

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
    // $ANTLR end "rule__ProjectedCharacteristicList__Group_1_1__1__Impl"


    // $ANTLR start "rule__SelectedEntityCharacteristicWildcardReference__Group__0"
    // InternalQueryParser.g:1770:1: rule__SelectedEntityCharacteristicWildcardReference__Group__0 : rule__SelectedEntityCharacteristicWildcardReference__Group__0__Impl rule__SelectedEntityCharacteristicWildcardReference__Group__1 ;
    public final void rule__SelectedEntityCharacteristicWildcardReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1774:1: ( rule__SelectedEntityCharacteristicWildcardReference__Group__0__Impl rule__SelectedEntityCharacteristicWildcardReference__Group__1 )
            // InternalQueryParser.g:1775:2: rule__SelectedEntityCharacteristicWildcardReference__Group__0__Impl rule__SelectedEntityCharacteristicWildcardReference__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SelectedEntityCharacteristicWildcardReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectedEntityCharacteristicWildcardReference__Group__1();

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
    // $ANTLR end "rule__SelectedEntityCharacteristicWildcardReference__Group__0"


    // $ANTLR start "rule__SelectedEntityCharacteristicWildcardReference__Group__0__Impl"
    // InternalQueryParser.g:1782:1: rule__SelectedEntityCharacteristicWildcardReference__Group__0__Impl : ( ( rule__SelectedEntityCharacteristicWildcardReference__SelectedEntityAssignment_0 ) ) ;
    public final void rule__SelectedEntityCharacteristicWildcardReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1786:1: ( ( ( rule__SelectedEntityCharacteristicWildcardReference__SelectedEntityAssignment_0 ) ) )
            // InternalQueryParser.g:1787:1: ( ( rule__SelectedEntityCharacteristicWildcardReference__SelectedEntityAssignment_0 ) )
            {
            // InternalQueryParser.g:1787:1: ( ( rule__SelectedEntityCharacteristicWildcardReference__SelectedEntityAssignment_0 ) )
            // InternalQueryParser.g:1788:2: ( rule__SelectedEntityCharacteristicWildcardReference__SelectedEntityAssignment_0 )
            {
             before(grammarAccess.getSelectedEntityCharacteristicWildcardReferenceAccess().getSelectedEntityAssignment_0()); 
            // InternalQueryParser.g:1789:2: ( rule__SelectedEntityCharacteristicWildcardReference__SelectedEntityAssignment_0 )
            // InternalQueryParser.g:1789:3: rule__SelectedEntityCharacteristicWildcardReference__SelectedEntityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectedEntityCharacteristicWildcardReference__SelectedEntityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectedEntityCharacteristicWildcardReferenceAccess().getSelectedEntityAssignment_0()); 

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
    // $ANTLR end "rule__SelectedEntityCharacteristicWildcardReference__Group__0__Impl"


    // $ANTLR start "rule__SelectedEntityCharacteristicWildcardReference__Group__1"
    // InternalQueryParser.g:1797:1: rule__SelectedEntityCharacteristicWildcardReference__Group__1 : rule__SelectedEntityCharacteristicWildcardReference__Group__1__Impl rule__SelectedEntityCharacteristicWildcardReference__Group__2 ;
    public final void rule__SelectedEntityCharacteristicWildcardReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1801:1: ( rule__SelectedEntityCharacteristicWildcardReference__Group__1__Impl rule__SelectedEntityCharacteristicWildcardReference__Group__2 )
            // InternalQueryParser.g:1802:2: rule__SelectedEntityCharacteristicWildcardReference__Group__1__Impl rule__SelectedEntityCharacteristicWildcardReference__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__SelectedEntityCharacteristicWildcardReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectedEntityCharacteristicWildcardReference__Group__2();

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
    // $ANTLR end "rule__SelectedEntityCharacteristicWildcardReference__Group__1"


    // $ANTLR start "rule__SelectedEntityCharacteristicWildcardReference__Group__1__Impl"
    // InternalQueryParser.g:1809:1: rule__SelectedEntityCharacteristicWildcardReference__Group__1__Impl : ( RULE_PERIOD ) ;
    public final void rule__SelectedEntityCharacteristicWildcardReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1813:1: ( ( RULE_PERIOD ) )
            // InternalQueryParser.g:1814:1: ( RULE_PERIOD )
            {
            // InternalQueryParser.g:1814:1: ( RULE_PERIOD )
            // InternalQueryParser.g:1815:2: RULE_PERIOD
            {
             before(grammarAccess.getSelectedEntityCharacteristicWildcardReferenceAccess().getPERIODTerminalRuleCall_1()); 
            match(input,RULE_PERIOD,FOLLOW_2); 
             after(grammarAccess.getSelectedEntityCharacteristicWildcardReferenceAccess().getPERIODTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__SelectedEntityCharacteristicWildcardReference__Group__1__Impl"


    // $ANTLR start "rule__SelectedEntityCharacteristicWildcardReference__Group__2"
    // InternalQueryParser.g:1824:1: rule__SelectedEntityCharacteristicWildcardReference__Group__2 : rule__SelectedEntityCharacteristicWildcardReference__Group__2__Impl ;
    public final void rule__SelectedEntityCharacteristicWildcardReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1828:1: ( rule__SelectedEntityCharacteristicWildcardReference__Group__2__Impl )
            // InternalQueryParser.g:1829:2: rule__SelectedEntityCharacteristicWildcardReference__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectedEntityCharacteristicWildcardReference__Group__2__Impl();

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
    // $ANTLR end "rule__SelectedEntityCharacteristicWildcardReference__Group__2"


    // $ANTLR start "rule__SelectedEntityCharacteristicWildcardReference__Group__2__Impl"
    // InternalQueryParser.g:1835:1: rule__SelectedEntityCharacteristicWildcardReference__Group__2__Impl : ( RULE_ALL_CHARACTERISTICS ) ;
    public final void rule__SelectedEntityCharacteristicWildcardReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1839:1: ( ( RULE_ALL_CHARACTERISTICS ) )
            // InternalQueryParser.g:1840:1: ( RULE_ALL_CHARACTERISTICS )
            {
            // InternalQueryParser.g:1840:1: ( RULE_ALL_CHARACTERISTICS )
            // InternalQueryParser.g:1841:2: RULE_ALL_CHARACTERISTICS
            {
             before(grammarAccess.getSelectedEntityCharacteristicWildcardReferenceAccess().getALL_CHARACTERISTICSTerminalRuleCall_2()); 
            match(input,RULE_ALL_CHARACTERISTICS,FOLLOW_2); 
             after(grammarAccess.getSelectedEntityCharacteristicWildcardReferenceAccess().getALL_CHARACTERISTICSTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__SelectedEntityCharacteristicWildcardReference__Group__2__Impl"


    // $ANTLR start "rule__ExplicitSelectedEntityCharacteristicReference__Group__0"
    // InternalQueryParser.g:1851:1: rule__ExplicitSelectedEntityCharacteristicReference__Group__0 : rule__ExplicitSelectedEntityCharacteristicReference__Group__0__Impl rule__ExplicitSelectedEntityCharacteristicReference__Group__1 ;
    public final void rule__ExplicitSelectedEntityCharacteristicReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1855:1: ( rule__ExplicitSelectedEntityCharacteristicReference__Group__0__Impl rule__ExplicitSelectedEntityCharacteristicReference__Group__1 )
            // InternalQueryParser.g:1856:2: rule__ExplicitSelectedEntityCharacteristicReference__Group__0__Impl rule__ExplicitSelectedEntityCharacteristicReference__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ExplicitSelectedEntityCharacteristicReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExplicitSelectedEntityCharacteristicReference__Group__1();

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
    // $ANTLR end "rule__ExplicitSelectedEntityCharacteristicReference__Group__0"


    // $ANTLR start "rule__ExplicitSelectedEntityCharacteristicReference__Group__0__Impl"
    // InternalQueryParser.g:1863:1: rule__ExplicitSelectedEntityCharacteristicReference__Group__0__Impl : ( ( rule__ExplicitSelectedEntityCharacteristicReference__SelectedEntityCharacteristicReferenceAssignment_0 ) ) ;
    public final void rule__ExplicitSelectedEntityCharacteristicReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1867:1: ( ( ( rule__ExplicitSelectedEntityCharacteristicReference__SelectedEntityCharacteristicReferenceAssignment_0 ) ) )
            // InternalQueryParser.g:1868:1: ( ( rule__ExplicitSelectedEntityCharacteristicReference__SelectedEntityCharacteristicReferenceAssignment_0 ) )
            {
            // InternalQueryParser.g:1868:1: ( ( rule__ExplicitSelectedEntityCharacteristicReference__SelectedEntityCharacteristicReferenceAssignment_0 ) )
            // InternalQueryParser.g:1869:2: ( rule__ExplicitSelectedEntityCharacteristicReference__SelectedEntityCharacteristicReferenceAssignment_0 )
            {
             before(grammarAccess.getExplicitSelectedEntityCharacteristicReferenceAccess().getSelectedEntityCharacteristicReferenceAssignment_0()); 
            // InternalQueryParser.g:1870:2: ( rule__ExplicitSelectedEntityCharacteristicReference__SelectedEntityCharacteristicReferenceAssignment_0 )
            // InternalQueryParser.g:1870:3: rule__ExplicitSelectedEntityCharacteristicReference__SelectedEntityCharacteristicReferenceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExplicitSelectedEntityCharacteristicReference__SelectedEntityCharacteristicReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExplicitSelectedEntityCharacteristicReferenceAccess().getSelectedEntityCharacteristicReferenceAssignment_0()); 

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
    // $ANTLR end "rule__ExplicitSelectedEntityCharacteristicReference__Group__0__Impl"


    // $ANTLR start "rule__ExplicitSelectedEntityCharacteristicReference__Group__1"
    // InternalQueryParser.g:1878:1: rule__ExplicitSelectedEntityCharacteristicReference__Group__1 : rule__ExplicitSelectedEntityCharacteristicReference__Group__1__Impl ;
    public final void rule__ExplicitSelectedEntityCharacteristicReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1882:1: ( rule__ExplicitSelectedEntityCharacteristicReference__Group__1__Impl )
            // InternalQueryParser.g:1883:2: rule__ExplicitSelectedEntityCharacteristicReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExplicitSelectedEntityCharacteristicReference__Group__1__Impl();

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
    // $ANTLR end "rule__ExplicitSelectedEntityCharacteristicReference__Group__1"


    // $ANTLR start "rule__ExplicitSelectedEntityCharacteristicReference__Group__1__Impl"
    // InternalQueryParser.g:1889:1: rule__ExplicitSelectedEntityCharacteristicReference__Group__1__Impl : ( ( rule__ExplicitSelectedEntityCharacteristicReference__Group_1__0 )? ) ;
    public final void rule__ExplicitSelectedEntityCharacteristicReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1893:1: ( ( ( rule__ExplicitSelectedEntityCharacteristicReference__Group_1__0 )? ) )
            // InternalQueryParser.g:1894:1: ( ( rule__ExplicitSelectedEntityCharacteristicReference__Group_1__0 )? )
            {
            // InternalQueryParser.g:1894:1: ( ( rule__ExplicitSelectedEntityCharacteristicReference__Group_1__0 )? )
            // InternalQueryParser.g:1895:2: ( rule__ExplicitSelectedEntityCharacteristicReference__Group_1__0 )?
            {
             before(grammarAccess.getExplicitSelectedEntityCharacteristicReferenceAccess().getGroup_1()); 
            // InternalQueryParser.g:1896:2: ( rule__ExplicitSelectedEntityCharacteristicReference__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_KW_AS||LA15_0==RULE_IDENTIFIER) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalQueryParser.g:1896:3: rule__ExplicitSelectedEntityCharacteristicReference__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExplicitSelectedEntityCharacteristicReference__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExplicitSelectedEntityCharacteristicReferenceAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ExplicitSelectedEntityCharacteristicReference__Group__1__Impl"


    // $ANTLR start "rule__ExplicitSelectedEntityCharacteristicReference__Group_1__0"
    // InternalQueryParser.g:1905:1: rule__ExplicitSelectedEntityCharacteristicReference__Group_1__0 : rule__ExplicitSelectedEntityCharacteristicReference__Group_1__0__Impl rule__ExplicitSelectedEntityCharacteristicReference__Group_1__1 ;
    public final void rule__ExplicitSelectedEntityCharacteristicReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1909:1: ( rule__ExplicitSelectedEntityCharacteristicReference__Group_1__0__Impl rule__ExplicitSelectedEntityCharacteristicReference__Group_1__1 )
            // InternalQueryParser.g:1910:2: rule__ExplicitSelectedEntityCharacteristicReference__Group_1__0__Impl rule__ExplicitSelectedEntityCharacteristicReference__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__ExplicitSelectedEntityCharacteristicReference__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExplicitSelectedEntityCharacteristicReference__Group_1__1();

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
    // $ANTLR end "rule__ExplicitSelectedEntityCharacteristicReference__Group_1__0"


    // $ANTLR start "rule__ExplicitSelectedEntityCharacteristicReference__Group_1__0__Impl"
    // InternalQueryParser.g:1917:1: rule__ExplicitSelectedEntityCharacteristicReference__Group_1__0__Impl : ( ( RULE_KW_AS )? ) ;
    public final void rule__ExplicitSelectedEntityCharacteristicReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1921:1: ( ( ( RULE_KW_AS )? ) )
            // InternalQueryParser.g:1922:1: ( ( RULE_KW_AS )? )
            {
            // InternalQueryParser.g:1922:1: ( ( RULE_KW_AS )? )
            // InternalQueryParser.g:1923:2: ( RULE_KW_AS )?
            {
             before(grammarAccess.getExplicitSelectedEntityCharacteristicReferenceAccess().getKW_ASTerminalRuleCall_1_0()); 
            // InternalQueryParser.g:1924:2: ( RULE_KW_AS )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_KW_AS) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalQueryParser.g:1924:3: RULE_KW_AS
                    {
                    match(input,RULE_KW_AS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExplicitSelectedEntityCharacteristicReferenceAccess().getKW_ASTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ExplicitSelectedEntityCharacteristicReference__Group_1__0__Impl"


    // $ANTLR start "rule__ExplicitSelectedEntityCharacteristicReference__Group_1__1"
    // InternalQueryParser.g:1932:1: rule__ExplicitSelectedEntityCharacteristicReference__Group_1__1 : rule__ExplicitSelectedEntityCharacteristicReference__Group_1__1__Impl ;
    public final void rule__ExplicitSelectedEntityCharacteristicReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1936:1: ( rule__ExplicitSelectedEntityCharacteristicReference__Group_1__1__Impl )
            // InternalQueryParser.g:1937:2: rule__ExplicitSelectedEntityCharacteristicReference__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExplicitSelectedEntityCharacteristicReference__Group_1__1__Impl();

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
    // $ANTLR end "rule__ExplicitSelectedEntityCharacteristicReference__Group_1__1"


    // $ANTLR start "rule__ExplicitSelectedEntityCharacteristicReference__Group_1__1__Impl"
    // InternalQueryParser.g:1943:1: rule__ExplicitSelectedEntityCharacteristicReference__Group_1__1__Impl : ( ( rule__ExplicitSelectedEntityCharacteristicReference__ProjectedCharacteristicAliasAssignment_1_1 ) ) ;
    public final void rule__ExplicitSelectedEntityCharacteristicReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1947:1: ( ( ( rule__ExplicitSelectedEntityCharacteristicReference__ProjectedCharacteristicAliasAssignment_1_1 ) ) )
            // InternalQueryParser.g:1948:1: ( ( rule__ExplicitSelectedEntityCharacteristicReference__ProjectedCharacteristicAliasAssignment_1_1 ) )
            {
            // InternalQueryParser.g:1948:1: ( ( rule__ExplicitSelectedEntityCharacteristicReference__ProjectedCharacteristicAliasAssignment_1_1 ) )
            // InternalQueryParser.g:1949:2: ( rule__ExplicitSelectedEntityCharacteristicReference__ProjectedCharacteristicAliasAssignment_1_1 )
            {
             before(grammarAccess.getExplicitSelectedEntityCharacteristicReferenceAccess().getProjectedCharacteristicAliasAssignment_1_1()); 
            // InternalQueryParser.g:1950:2: ( rule__ExplicitSelectedEntityCharacteristicReference__ProjectedCharacteristicAliasAssignment_1_1 )
            // InternalQueryParser.g:1950:3: rule__ExplicitSelectedEntityCharacteristicReference__ProjectedCharacteristicAliasAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExplicitSelectedEntityCharacteristicReference__ProjectedCharacteristicAliasAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExplicitSelectedEntityCharacteristicReferenceAccess().getProjectedCharacteristicAliasAssignment_1_1()); 

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
    // $ANTLR end "rule__ExplicitSelectedEntityCharacteristicReference__Group_1__1__Impl"


    // $ANTLR start "rule__SelectedEntityExpression__Group__0"
    // InternalQueryParser.g:1959:1: rule__SelectedEntityExpression__Group__0 : rule__SelectedEntityExpression__Group__0__Impl rule__SelectedEntityExpression__Group__1 ;
    public final void rule__SelectedEntityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1963:1: ( rule__SelectedEntityExpression__Group__0__Impl rule__SelectedEntityExpression__Group__1 )
            // InternalQueryParser.g:1964:2: rule__SelectedEntityExpression__Group__0__Impl rule__SelectedEntityExpression__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__SelectedEntityExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectedEntityExpression__Group__1();

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
    // $ANTLR end "rule__SelectedEntityExpression__Group__0"


    // $ANTLR start "rule__SelectedEntityExpression__Group__0__Impl"
    // InternalQueryParser.g:1971:1: rule__SelectedEntityExpression__Group__0__Impl : ( ( rule__SelectedEntityExpression__FromAssignment_0 ) ) ;
    public final void rule__SelectedEntityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1975:1: ( ( ( rule__SelectedEntityExpression__FromAssignment_0 ) ) )
            // InternalQueryParser.g:1976:1: ( ( rule__SelectedEntityExpression__FromAssignment_0 ) )
            {
            // InternalQueryParser.g:1976:1: ( ( rule__SelectedEntityExpression__FromAssignment_0 ) )
            // InternalQueryParser.g:1977:2: ( rule__SelectedEntityExpression__FromAssignment_0 )
            {
             before(grammarAccess.getSelectedEntityExpressionAccess().getFromAssignment_0()); 
            // InternalQueryParser.g:1978:2: ( rule__SelectedEntityExpression__FromAssignment_0 )
            // InternalQueryParser.g:1978:3: rule__SelectedEntityExpression__FromAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectedEntityExpression__FromAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectedEntityExpressionAccess().getFromAssignment_0()); 

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
    // $ANTLR end "rule__SelectedEntityExpression__Group__0__Impl"


    // $ANTLR start "rule__SelectedEntityExpression__Group__1"
    // InternalQueryParser.g:1986:1: rule__SelectedEntityExpression__Group__1 : rule__SelectedEntityExpression__Group__1__Impl rule__SelectedEntityExpression__Group__2 ;
    public final void rule__SelectedEntityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:1990:1: ( rule__SelectedEntityExpression__Group__1__Impl rule__SelectedEntityExpression__Group__2 )
            // InternalQueryParser.g:1991:2: rule__SelectedEntityExpression__Group__1__Impl rule__SelectedEntityExpression__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__SelectedEntityExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectedEntityExpression__Group__2();

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
    // $ANTLR end "rule__SelectedEntityExpression__Group__1"


    // $ANTLR start "rule__SelectedEntityExpression__Group__1__Impl"
    // InternalQueryParser.g:1998:1: rule__SelectedEntityExpression__Group__1__Impl : ( ( rule__SelectedEntityExpression__WhereAssignment_1 )? ) ;
    public final void rule__SelectedEntityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2002:1: ( ( ( rule__SelectedEntityExpression__WhereAssignment_1 )? ) )
            // InternalQueryParser.g:2003:1: ( ( rule__SelectedEntityExpression__WhereAssignment_1 )? )
            {
            // InternalQueryParser.g:2003:1: ( ( rule__SelectedEntityExpression__WhereAssignment_1 )? )
            // InternalQueryParser.g:2004:2: ( rule__SelectedEntityExpression__WhereAssignment_1 )?
            {
             before(grammarAccess.getSelectedEntityExpressionAccess().getWhereAssignment_1()); 
            // InternalQueryParser.g:2005:2: ( rule__SelectedEntityExpression__WhereAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_KW_WHERE) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalQueryParser.g:2005:3: rule__SelectedEntityExpression__WhereAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectedEntityExpression__WhereAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectedEntityExpressionAccess().getWhereAssignment_1()); 

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
    // $ANTLR end "rule__SelectedEntityExpression__Group__1__Impl"


    // $ANTLR start "rule__SelectedEntityExpression__Group__2"
    // InternalQueryParser.g:2013:1: rule__SelectedEntityExpression__Group__2 : rule__SelectedEntityExpression__Group__2__Impl ;
    public final void rule__SelectedEntityExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2017:1: ( rule__SelectedEntityExpression__Group__2__Impl )
            // InternalQueryParser.g:2018:2: rule__SelectedEntityExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectedEntityExpression__Group__2__Impl();

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
    // $ANTLR end "rule__SelectedEntityExpression__Group__2"


    // $ANTLR start "rule__SelectedEntityExpression__Group__2__Impl"
    // InternalQueryParser.g:2024:1: rule__SelectedEntityExpression__Group__2__Impl : ( ( rule__SelectedEntityExpression__OrderByAssignment_2 )? ) ;
    public final void rule__SelectedEntityExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2028:1: ( ( ( rule__SelectedEntityExpression__OrderByAssignment_2 )? ) )
            // InternalQueryParser.g:2029:1: ( ( rule__SelectedEntityExpression__OrderByAssignment_2 )? )
            {
            // InternalQueryParser.g:2029:1: ( ( rule__SelectedEntityExpression__OrderByAssignment_2 )? )
            // InternalQueryParser.g:2030:2: ( rule__SelectedEntityExpression__OrderByAssignment_2 )?
            {
             before(grammarAccess.getSelectedEntityExpressionAccess().getOrderByAssignment_2()); 
            // InternalQueryParser.g:2031:2: ( rule__SelectedEntityExpression__OrderByAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_KW_ORDER) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalQueryParser.g:2031:3: rule__SelectedEntityExpression__OrderByAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectedEntityExpression__OrderByAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectedEntityExpressionAccess().getOrderByAssignment_2()); 

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
    // $ANTLR end "rule__SelectedEntityExpression__Group__2__Impl"


    // $ANTLR start "rule__FromClause__Group__0"
    // InternalQueryParser.g:2040:1: rule__FromClause__Group__0 : rule__FromClause__Group__0__Impl rule__FromClause__Group__1 ;
    public final void rule__FromClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2044:1: ( rule__FromClause__Group__0__Impl rule__FromClause__Group__1 )
            // InternalQueryParser.g:2045:2: rule__FromClause__Group__0__Impl rule__FromClause__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__FromClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FromClause__Group__1();

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
    // $ANTLR end "rule__FromClause__Group__0"


    // $ANTLR start "rule__FromClause__Group__0__Impl"
    // InternalQueryParser.g:2052:1: rule__FromClause__Group__0__Impl : ( From ) ;
    public final void rule__FromClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2056:1: ( ( From ) )
            // InternalQueryParser.g:2057:1: ( From )
            {
            // InternalQueryParser.g:2057:1: ( From )
            // InternalQueryParser.g:2058:2: From
            {
             before(grammarAccess.getFromClauseAccess().getFromKeyword_0()); 
            match(input,From,FOLLOW_2); 
             after(grammarAccess.getFromClauseAccess().getFromKeyword_0()); 

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
    // $ANTLR end "rule__FromClause__Group__0__Impl"


    // $ANTLR start "rule__FromClause__Group__1"
    // InternalQueryParser.g:2067:1: rule__FromClause__Group__1 : rule__FromClause__Group__1__Impl ;
    public final void rule__FromClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2071:1: ( rule__FromClause__Group__1__Impl )
            // InternalQueryParser.g:2072:2: rule__FromClause__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FromClause__Group__1__Impl();

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
    // $ANTLR end "rule__FromClause__Group__1"


    // $ANTLR start "rule__FromClause__Group__1__Impl"
    // InternalQueryParser.g:2078:1: rule__FromClause__Group__1__Impl : ( ( rule__FromClause__EntityAssignment_1 ) ) ;
    public final void rule__FromClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2082:1: ( ( ( rule__FromClause__EntityAssignment_1 ) ) )
            // InternalQueryParser.g:2083:1: ( ( rule__FromClause__EntityAssignment_1 ) )
            {
            // InternalQueryParser.g:2083:1: ( ( rule__FromClause__EntityAssignment_1 ) )
            // InternalQueryParser.g:2084:2: ( rule__FromClause__EntityAssignment_1 )
            {
             before(grammarAccess.getFromClauseAccess().getEntityAssignment_1()); 
            // InternalQueryParser.g:2085:2: ( rule__FromClause__EntityAssignment_1 )
            // InternalQueryParser.g:2085:3: rule__FromClause__EntityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FromClause__EntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFromClauseAccess().getEntityAssignment_1()); 

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
    // $ANTLR end "rule__FromClause__Group__1__Impl"


    // $ANTLR start "rule__EntityExpression__Group__0"
    // InternalQueryParser.g:2094:1: rule__EntityExpression__Group__0 : rule__EntityExpression__Group__0__Impl rule__EntityExpression__Group__1 ;
    public final void rule__EntityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2098:1: ( rule__EntityExpression__Group__0__Impl rule__EntityExpression__Group__1 )
            // InternalQueryParser.g:2099:2: rule__EntityExpression__Group__0__Impl rule__EntityExpression__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__EntityExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityExpression__Group__1();

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
    // $ANTLR end "rule__EntityExpression__Group__0"


    // $ANTLR start "rule__EntityExpression__Group__0__Impl"
    // InternalQueryParser.g:2106:1: rule__EntityExpression__Group__0__Impl : ( ( rule__EntityExpression__SelectedEntityAssignment_0 ) ) ;
    public final void rule__EntityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2110:1: ( ( ( rule__EntityExpression__SelectedEntityAssignment_0 ) ) )
            // InternalQueryParser.g:2111:1: ( ( rule__EntityExpression__SelectedEntityAssignment_0 ) )
            {
            // InternalQueryParser.g:2111:1: ( ( rule__EntityExpression__SelectedEntityAssignment_0 ) )
            // InternalQueryParser.g:2112:2: ( rule__EntityExpression__SelectedEntityAssignment_0 )
            {
             before(grammarAccess.getEntityExpressionAccess().getSelectedEntityAssignment_0()); 
            // InternalQueryParser.g:2113:2: ( rule__EntityExpression__SelectedEntityAssignment_0 )
            // InternalQueryParser.g:2113:3: rule__EntityExpression__SelectedEntityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EntityExpression__SelectedEntityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityExpressionAccess().getSelectedEntityAssignment_0()); 

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
    // $ANTLR end "rule__EntityExpression__Group__0__Impl"


    // $ANTLR start "rule__EntityExpression__Group__1"
    // InternalQueryParser.g:2121:1: rule__EntityExpression__Group__1 : rule__EntityExpression__Group__1__Impl ;
    public final void rule__EntityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2125:1: ( rule__EntityExpression__Group__1__Impl )
            // InternalQueryParser.g:2126:2: rule__EntityExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityExpression__Group__1__Impl();

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
    // $ANTLR end "rule__EntityExpression__Group__1"


    // $ANTLR start "rule__EntityExpression__Group__1__Impl"
    // InternalQueryParser.g:2132:1: rule__EntityExpression__Group__1__Impl : ( ( rule__EntityExpression__EjeAssignment_1 )* ) ;
    public final void rule__EntityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2136:1: ( ( ( rule__EntityExpression__EjeAssignment_1 )* ) )
            // InternalQueryParser.g:2137:1: ( ( rule__EntityExpression__EjeAssignment_1 )* )
            {
            // InternalQueryParser.g:2137:1: ( ( rule__EntityExpression__EjeAssignment_1 )* )
            // InternalQueryParser.g:2138:2: ( rule__EntityExpression__EjeAssignment_1 )*
            {
             before(grammarAccess.getEntityExpressionAccess().getEjeAssignment_1()); 
            // InternalQueryParser.g:2139:2: ( rule__EntityExpression__EjeAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_KW_JOIN) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalQueryParser.g:2139:3: rule__EntityExpression__EjeAssignment_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__EntityExpression__EjeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getEntityExpressionAccess().getEjeAssignment_1()); 

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
    // $ANTLR end "rule__EntityExpression__Group__1__Impl"


    // $ANTLR start "rule__SelectedEntity__Group__0"
    // InternalQueryParser.g:2148:1: rule__SelectedEntity__Group__0 : rule__SelectedEntity__Group__0__Impl rule__SelectedEntity__Group__1 ;
    public final void rule__SelectedEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2152:1: ( rule__SelectedEntity__Group__0__Impl rule__SelectedEntity__Group__1 )
            // InternalQueryParser.g:2153:2: rule__SelectedEntity__Group__0__Impl rule__SelectedEntity__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__SelectedEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectedEntity__Group__1();

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
    // $ANTLR end "rule__SelectedEntity__Group__0"


    // $ANTLR start "rule__SelectedEntity__Group__0__Impl"
    // InternalQueryParser.g:2160:1: rule__SelectedEntity__Group__0__Impl : ( ( rule__SelectedEntity__EntityTypeAssignment_0 ) ) ;
    public final void rule__SelectedEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2164:1: ( ( ( rule__SelectedEntity__EntityTypeAssignment_0 ) ) )
            // InternalQueryParser.g:2165:1: ( ( rule__SelectedEntity__EntityTypeAssignment_0 ) )
            {
            // InternalQueryParser.g:2165:1: ( ( rule__SelectedEntity__EntityTypeAssignment_0 ) )
            // InternalQueryParser.g:2166:2: ( rule__SelectedEntity__EntityTypeAssignment_0 )
            {
             before(grammarAccess.getSelectedEntityAccess().getEntityTypeAssignment_0()); 
            // InternalQueryParser.g:2167:2: ( rule__SelectedEntity__EntityTypeAssignment_0 )
            // InternalQueryParser.g:2167:3: rule__SelectedEntity__EntityTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectedEntity__EntityTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectedEntityAccess().getEntityTypeAssignment_0()); 

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
    // $ANTLR end "rule__SelectedEntity__Group__0__Impl"


    // $ANTLR start "rule__SelectedEntity__Group__1"
    // InternalQueryParser.g:2175:1: rule__SelectedEntity__Group__1 : rule__SelectedEntity__Group__1__Impl ;
    public final void rule__SelectedEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2179:1: ( rule__SelectedEntity__Group__1__Impl )
            // InternalQueryParser.g:2180:2: rule__SelectedEntity__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectedEntity__Group__1__Impl();

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
    // $ANTLR end "rule__SelectedEntity__Group__1"


    // $ANTLR start "rule__SelectedEntity__Group__1__Impl"
    // InternalQueryParser.g:2186:1: rule__SelectedEntity__Group__1__Impl : ( ( rule__SelectedEntity__Group_1__0 )? ) ;
    public final void rule__SelectedEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2190:1: ( ( ( rule__SelectedEntity__Group_1__0 )? ) )
            // InternalQueryParser.g:2191:1: ( ( rule__SelectedEntity__Group_1__0 )? )
            {
            // InternalQueryParser.g:2191:1: ( ( rule__SelectedEntity__Group_1__0 )? )
            // InternalQueryParser.g:2192:2: ( rule__SelectedEntity__Group_1__0 )?
            {
             before(grammarAccess.getSelectedEntityAccess().getGroup_1()); 
            // InternalQueryParser.g:2193:2: ( rule__SelectedEntity__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_KW_AS||LA20_0==RULE_IDENTIFIER) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalQueryParser.g:2193:3: rule__SelectedEntity__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectedEntity__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectedEntityAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SelectedEntity__Group__1__Impl"


    // $ANTLR start "rule__SelectedEntity__Group_1__0"
    // InternalQueryParser.g:2202:1: rule__SelectedEntity__Group_1__0 : rule__SelectedEntity__Group_1__0__Impl rule__SelectedEntity__Group_1__1 ;
    public final void rule__SelectedEntity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2206:1: ( rule__SelectedEntity__Group_1__0__Impl rule__SelectedEntity__Group_1__1 )
            // InternalQueryParser.g:2207:2: rule__SelectedEntity__Group_1__0__Impl rule__SelectedEntity__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__SelectedEntity__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectedEntity__Group_1__1();

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
    // $ANTLR end "rule__SelectedEntity__Group_1__0"


    // $ANTLR start "rule__SelectedEntity__Group_1__0__Impl"
    // InternalQueryParser.g:2214:1: rule__SelectedEntity__Group_1__0__Impl : ( ( RULE_KW_AS )? ) ;
    public final void rule__SelectedEntity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2218:1: ( ( ( RULE_KW_AS )? ) )
            // InternalQueryParser.g:2219:1: ( ( RULE_KW_AS )? )
            {
            // InternalQueryParser.g:2219:1: ( ( RULE_KW_AS )? )
            // InternalQueryParser.g:2220:2: ( RULE_KW_AS )?
            {
             before(grammarAccess.getSelectedEntityAccess().getKW_ASTerminalRuleCall_1_0()); 
            // InternalQueryParser.g:2221:2: ( RULE_KW_AS )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_KW_AS) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalQueryParser.g:2221:3: RULE_KW_AS
                    {
                    match(input,RULE_KW_AS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSelectedEntityAccess().getKW_ASTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SelectedEntity__Group_1__0__Impl"


    // $ANTLR start "rule__SelectedEntity__Group_1__1"
    // InternalQueryParser.g:2229:1: rule__SelectedEntity__Group_1__1 : rule__SelectedEntity__Group_1__1__Impl ;
    public final void rule__SelectedEntity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2233:1: ( rule__SelectedEntity__Group_1__1__Impl )
            // InternalQueryParser.g:2234:2: rule__SelectedEntity__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectedEntity__Group_1__1__Impl();

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
    // $ANTLR end "rule__SelectedEntity__Group_1__1"


    // $ANTLR start "rule__SelectedEntity__Group_1__1__Impl"
    // InternalQueryParser.g:2240:1: rule__SelectedEntity__Group_1__1__Impl : ( ( rule__SelectedEntity__SelectedEntityAliasAssignment_1_1 ) ) ;
    public final void rule__SelectedEntity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2244:1: ( ( ( rule__SelectedEntity__SelectedEntityAliasAssignment_1_1 ) ) )
            // InternalQueryParser.g:2245:1: ( ( rule__SelectedEntity__SelectedEntityAliasAssignment_1_1 ) )
            {
            // InternalQueryParser.g:2245:1: ( ( rule__SelectedEntity__SelectedEntityAliasAssignment_1_1 ) )
            // InternalQueryParser.g:2246:2: ( rule__SelectedEntity__SelectedEntityAliasAssignment_1_1 )
            {
             before(grammarAccess.getSelectedEntityAccess().getSelectedEntityAliasAssignment_1_1()); 
            // InternalQueryParser.g:2247:2: ( rule__SelectedEntity__SelectedEntityAliasAssignment_1_1 )
            // InternalQueryParser.g:2247:3: rule__SelectedEntity__SelectedEntityAliasAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectedEntity__SelectedEntityAliasAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectedEntityAccess().getSelectedEntityAliasAssignment_1_1()); 

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
    // $ANTLR end "rule__SelectedEntity__Group_1__1__Impl"


    // $ANTLR start "rule__EntityJoinExpression__Group__0"
    // InternalQueryParser.g:2256:1: rule__EntityJoinExpression__Group__0 : rule__EntityJoinExpression__Group__0__Impl rule__EntityJoinExpression__Group__1 ;
    public final void rule__EntityJoinExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2260:1: ( rule__EntityJoinExpression__Group__0__Impl rule__EntityJoinExpression__Group__1 )
            // InternalQueryParser.g:2261:2: rule__EntityJoinExpression__Group__0__Impl rule__EntityJoinExpression__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__EntityJoinExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityJoinExpression__Group__1();

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
    // $ANTLR end "rule__EntityJoinExpression__Group__0"


    // $ANTLR start "rule__EntityJoinExpression__Group__0__Impl"
    // InternalQueryParser.g:2268:1: rule__EntityJoinExpression__Group__0__Impl : ( RULE_KW_JOIN ) ;
    public final void rule__EntityJoinExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2272:1: ( ( RULE_KW_JOIN ) )
            // InternalQueryParser.g:2273:1: ( RULE_KW_JOIN )
            {
            // InternalQueryParser.g:2273:1: ( RULE_KW_JOIN )
            // InternalQueryParser.g:2274:2: RULE_KW_JOIN
            {
             before(grammarAccess.getEntityJoinExpressionAccess().getKW_JOINTerminalRuleCall_0()); 
            match(input,RULE_KW_JOIN,FOLLOW_2); 
             after(grammarAccess.getEntityJoinExpressionAccess().getKW_JOINTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__EntityJoinExpression__Group__0__Impl"


    // $ANTLR start "rule__EntityJoinExpression__Group__1"
    // InternalQueryParser.g:2283:1: rule__EntityJoinExpression__Group__1 : rule__EntityJoinExpression__Group__1__Impl rule__EntityJoinExpression__Group__2 ;
    public final void rule__EntityJoinExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2287:1: ( rule__EntityJoinExpression__Group__1__Impl rule__EntityJoinExpression__Group__2 )
            // InternalQueryParser.g:2288:2: rule__EntityJoinExpression__Group__1__Impl rule__EntityJoinExpression__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__EntityJoinExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityJoinExpression__Group__2();

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
    // $ANTLR end "rule__EntityJoinExpression__Group__1"


    // $ANTLR start "rule__EntityJoinExpression__Group__1__Impl"
    // InternalQueryParser.g:2295:1: rule__EntityJoinExpression__Group__1__Impl : ( ( rule__EntityJoinExpression__JoinEntityAssignment_1 ) ) ;
    public final void rule__EntityJoinExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2299:1: ( ( ( rule__EntityJoinExpression__JoinEntityAssignment_1 ) ) )
            // InternalQueryParser.g:2300:1: ( ( rule__EntityJoinExpression__JoinEntityAssignment_1 ) )
            {
            // InternalQueryParser.g:2300:1: ( ( rule__EntityJoinExpression__JoinEntityAssignment_1 ) )
            // InternalQueryParser.g:2301:2: ( rule__EntityJoinExpression__JoinEntityAssignment_1 )
            {
             before(grammarAccess.getEntityJoinExpressionAccess().getJoinEntityAssignment_1()); 
            // InternalQueryParser.g:2302:2: ( rule__EntityJoinExpression__JoinEntityAssignment_1 )
            // InternalQueryParser.g:2302:3: rule__EntityJoinExpression__JoinEntityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EntityJoinExpression__JoinEntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityJoinExpressionAccess().getJoinEntityAssignment_1()); 

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
    // $ANTLR end "rule__EntityJoinExpression__Group__1__Impl"


    // $ANTLR start "rule__EntityJoinExpression__Group__2"
    // InternalQueryParser.g:2310:1: rule__EntityJoinExpression__Group__2 : rule__EntityJoinExpression__Group__2__Impl rule__EntityJoinExpression__Group__3 ;
    public final void rule__EntityJoinExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2314:1: ( rule__EntityJoinExpression__Group__2__Impl rule__EntityJoinExpression__Group__3 )
            // InternalQueryParser.g:2315:2: rule__EntityJoinExpression__Group__2__Impl rule__EntityJoinExpression__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__EntityJoinExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityJoinExpression__Group__3();

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
    // $ANTLR end "rule__EntityJoinExpression__Group__2"


    // $ANTLR start "rule__EntityJoinExpression__Group__2__Impl"
    // InternalQueryParser.g:2322:1: rule__EntityJoinExpression__Group__2__Impl : ( RULE_KW_ON ) ;
    public final void rule__EntityJoinExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2326:1: ( ( RULE_KW_ON ) )
            // InternalQueryParser.g:2327:1: ( RULE_KW_ON )
            {
            // InternalQueryParser.g:2327:1: ( RULE_KW_ON )
            // InternalQueryParser.g:2328:2: RULE_KW_ON
            {
             before(grammarAccess.getEntityJoinExpressionAccess().getKW_ONTerminalRuleCall_2()); 
            match(input,RULE_KW_ON,FOLLOW_2); 
             after(grammarAccess.getEntityJoinExpressionAccess().getKW_ONTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__EntityJoinExpression__Group__2__Impl"


    // $ANTLR start "rule__EntityJoinExpression__Group__3"
    // InternalQueryParser.g:2337:1: rule__EntityJoinExpression__Group__3 : rule__EntityJoinExpression__Group__3__Impl ;
    public final void rule__EntityJoinExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2341:1: ( rule__EntityJoinExpression__Group__3__Impl )
            // InternalQueryParser.g:2342:2: rule__EntityJoinExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityJoinExpression__Group__3__Impl();

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
    // $ANTLR end "rule__EntityJoinExpression__Group__3"


    // $ANTLR start "rule__EntityJoinExpression__Group__3__Impl"
    // InternalQueryParser.g:2348:1: rule__EntityJoinExpression__Group__3__Impl : ( ( rule__EntityJoinExpression__EntityJoinCriteriaAssignment_3 ) ) ;
    public final void rule__EntityJoinExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2352:1: ( ( ( rule__EntityJoinExpression__EntityJoinCriteriaAssignment_3 ) ) )
            // InternalQueryParser.g:2353:1: ( ( rule__EntityJoinExpression__EntityJoinCriteriaAssignment_3 ) )
            {
            // InternalQueryParser.g:2353:1: ( ( rule__EntityJoinExpression__EntityJoinCriteriaAssignment_3 ) )
            // InternalQueryParser.g:2354:2: ( rule__EntityJoinExpression__EntityJoinCriteriaAssignment_3 )
            {
             before(grammarAccess.getEntityJoinExpressionAccess().getEntityJoinCriteriaAssignment_3()); 
            // InternalQueryParser.g:2355:2: ( rule__EntityJoinExpression__EntityJoinCriteriaAssignment_3 )
            // InternalQueryParser.g:2355:3: rule__EntityJoinExpression__EntityJoinCriteriaAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EntityJoinExpression__EntityJoinCriteriaAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityJoinExpressionAccess().getEntityJoinCriteriaAssignment_3()); 

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
    // $ANTLR end "rule__EntityJoinExpression__Group__3__Impl"


    // $ANTLR start "rule__EntityJoinCriteria__Group__0"
    // InternalQueryParser.g:2364:1: rule__EntityJoinCriteria__Group__0 : rule__EntityJoinCriteria__Group__0__Impl rule__EntityJoinCriteria__Group__1 ;
    public final void rule__EntityJoinCriteria__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2368:1: ( rule__EntityJoinCriteria__Group__0__Impl rule__EntityJoinCriteria__Group__1 )
            // InternalQueryParser.g:2369:2: rule__EntityJoinCriteria__Group__0__Impl rule__EntityJoinCriteria__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__EntityJoinCriteria__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityJoinCriteria__Group__1();

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
    // $ANTLR end "rule__EntityJoinCriteria__Group__0"


    // $ANTLR start "rule__EntityJoinCriteria__Group__0__Impl"
    // InternalQueryParser.g:2376:1: rule__EntityJoinCriteria__Group__0__Impl : ( ( rule__EntityJoinCriteria__EtceeAssignment_0 ) ) ;
    public final void rule__EntityJoinCriteria__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2380:1: ( ( ( rule__EntityJoinCriteria__EtceeAssignment_0 ) ) )
            // InternalQueryParser.g:2381:1: ( ( rule__EntityJoinCriteria__EtceeAssignment_0 ) )
            {
            // InternalQueryParser.g:2381:1: ( ( rule__EntityJoinCriteria__EtceeAssignment_0 ) )
            // InternalQueryParser.g:2382:2: ( rule__EntityJoinCriteria__EtceeAssignment_0 )
            {
             before(grammarAccess.getEntityJoinCriteriaAccess().getEtceeAssignment_0()); 
            // InternalQueryParser.g:2383:2: ( rule__EntityJoinCriteria__EtceeAssignment_0 )
            // InternalQueryParser.g:2383:3: rule__EntityJoinCriteria__EtceeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EntityJoinCriteria__EtceeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityJoinCriteriaAccess().getEtceeAssignment_0()); 

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
    // $ANTLR end "rule__EntityJoinCriteria__Group__0__Impl"


    // $ANTLR start "rule__EntityJoinCriteria__Group__1"
    // InternalQueryParser.g:2391:1: rule__EntityJoinCriteria__Group__1 : rule__EntityJoinCriteria__Group__1__Impl ;
    public final void rule__EntityJoinCriteria__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2395:1: ( rule__EntityJoinCriteria__Group__1__Impl )
            // InternalQueryParser.g:2396:2: rule__EntityJoinCriteria__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityJoinCriteria__Group__1__Impl();

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
    // $ANTLR end "rule__EntityJoinCriteria__Group__1"


    // $ANTLR start "rule__EntityJoinCriteria__Group__1__Impl"
    // InternalQueryParser.g:2402:1: rule__EntityJoinCriteria__Group__1__Impl : ( ( rule__EntityJoinCriteria__Group_1__0 )* ) ;
    public final void rule__EntityJoinCriteria__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2406:1: ( ( ( rule__EntityJoinCriteria__Group_1__0 )* ) )
            // InternalQueryParser.g:2407:1: ( ( rule__EntityJoinCriteria__Group_1__0 )* )
            {
            // InternalQueryParser.g:2407:1: ( ( rule__EntityJoinCriteria__Group_1__0 )* )
            // InternalQueryParser.g:2408:2: ( rule__EntityJoinCriteria__Group_1__0 )*
            {
             before(grammarAccess.getEntityJoinCriteriaAccess().getGroup_1()); 
            // InternalQueryParser.g:2409:2: ( rule__EntityJoinCriteria__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_KW_AND) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalQueryParser.g:2409:3: rule__EntityJoinCriteria__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__EntityJoinCriteria__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getEntityJoinCriteriaAccess().getGroup_1()); 

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
    // $ANTLR end "rule__EntityJoinCriteria__Group__1__Impl"


    // $ANTLR start "rule__EntityJoinCriteria__Group_1__0"
    // InternalQueryParser.g:2418:1: rule__EntityJoinCriteria__Group_1__0 : rule__EntityJoinCriteria__Group_1__0__Impl rule__EntityJoinCriteria__Group_1__1 ;
    public final void rule__EntityJoinCriteria__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2422:1: ( rule__EntityJoinCriteria__Group_1__0__Impl rule__EntityJoinCriteria__Group_1__1 )
            // InternalQueryParser.g:2423:2: rule__EntityJoinCriteria__Group_1__0__Impl rule__EntityJoinCriteria__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__EntityJoinCriteria__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityJoinCriteria__Group_1__1();

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
    // $ANTLR end "rule__EntityJoinCriteria__Group_1__0"


    // $ANTLR start "rule__EntityJoinCriteria__Group_1__0__Impl"
    // InternalQueryParser.g:2430:1: rule__EntityJoinCriteria__Group_1__0__Impl : ( RULE_KW_AND ) ;
    public final void rule__EntityJoinCriteria__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2434:1: ( ( RULE_KW_AND ) )
            // InternalQueryParser.g:2435:1: ( RULE_KW_AND )
            {
            // InternalQueryParser.g:2435:1: ( RULE_KW_AND )
            // InternalQueryParser.g:2436:2: RULE_KW_AND
            {
             before(grammarAccess.getEntityJoinCriteriaAccess().getKW_ANDTerminalRuleCall_1_0()); 
            match(input,RULE_KW_AND,FOLLOW_2); 
             after(grammarAccess.getEntityJoinCriteriaAccess().getKW_ANDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__EntityJoinCriteria__Group_1__0__Impl"


    // $ANTLR start "rule__EntityJoinCriteria__Group_1__1"
    // InternalQueryParser.g:2445:1: rule__EntityJoinCriteria__Group_1__1 : rule__EntityJoinCriteria__Group_1__1__Impl ;
    public final void rule__EntityJoinCriteria__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2449:1: ( rule__EntityJoinCriteria__Group_1__1__Impl )
            // InternalQueryParser.g:2450:2: rule__EntityJoinCriteria__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityJoinCriteria__Group_1__1__Impl();

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
    // $ANTLR end "rule__EntityJoinCriteria__Group_1__1"


    // $ANTLR start "rule__EntityJoinCriteria__Group_1__1__Impl"
    // InternalQueryParser.g:2456:1: rule__EntityJoinCriteria__Group_1__1__Impl : ( ( rule__EntityJoinCriteria__EtceeAssignment_1_1 ) ) ;
    public final void rule__EntityJoinCriteria__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2460:1: ( ( ( rule__EntityJoinCriteria__EtceeAssignment_1_1 ) ) )
            // InternalQueryParser.g:2461:1: ( ( rule__EntityJoinCriteria__EtceeAssignment_1_1 ) )
            {
            // InternalQueryParser.g:2461:1: ( ( rule__EntityJoinCriteria__EtceeAssignment_1_1 ) )
            // InternalQueryParser.g:2462:2: ( rule__EntityJoinCriteria__EtceeAssignment_1_1 )
            {
             before(grammarAccess.getEntityJoinCriteriaAccess().getEtceeAssignment_1_1()); 
            // InternalQueryParser.g:2463:2: ( rule__EntityJoinCriteria__EtceeAssignment_1_1 )
            // InternalQueryParser.g:2463:3: rule__EntityJoinCriteria__EtceeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EntityJoinCriteria__EtceeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityJoinCriteriaAccess().getEtceeAssignment_1_1()); 

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
    // $ANTLR end "rule__EntityJoinCriteria__Group_1__1__Impl"


    // $ANTLR start "rule__EntityTypeCharacteristicEquivalenceExpression__Group__0"
    // InternalQueryParser.g:2472:1: rule__EntityTypeCharacteristicEquivalenceExpression__Group__0 : rule__EntityTypeCharacteristicEquivalenceExpression__Group__0__Impl rule__EntityTypeCharacteristicEquivalenceExpression__Group__1 ;
    public final void rule__EntityTypeCharacteristicEquivalenceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2476:1: ( rule__EntityTypeCharacteristicEquivalenceExpression__Group__0__Impl rule__EntityTypeCharacteristicEquivalenceExpression__Group__1 )
            // InternalQueryParser.g:2477:2: rule__EntityTypeCharacteristicEquivalenceExpression__Group__0__Impl rule__EntityTypeCharacteristicEquivalenceExpression__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__EntityTypeCharacteristicEquivalenceExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityTypeCharacteristicEquivalenceExpression__Group__1();

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
    // $ANTLR end "rule__EntityTypeCharacteristicEquivalenceExpression__Group__0"


    // $ANTLR start "rule__EntityTypeCharacteristicEquivalenceExpression__Group__0__Impl"
    // InternalQueryParser.g:2484:1: rule__EntityTypeCharacteristicEquivalenceExpression__Group__0__Impl : ( ( rule__EntityTypeCharacteristicEquivalenceExpression__SecrAssignment_0 ) ) ;
    public final void rule__EntityTypeCharacteristicEquivalenceExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2488:1: ( ( ( rule__EntityTypeCharacteristicEquivalenceExpression__SecrAssignment_0 ) ) )
            // InternalQueryParser.g:2489:1: ( ( rule__EntityTypeCharacteristicEquivalenceExpression__SecrAssignment_0 ) )
            {
            // InternalQueryParser.g:2489:1: ( ( rule__EntityTypeCharacteristicEquivalenceExpression__SecrAssignment_0 ) )
            // InternalQueryParser.g:2490:2: ( rule__EntityTypeCharacteristicEquivalenceExpression__SecrAssignment_0 )
            {
             before(grammarAccess.getEntityTypeCharacteristicEquivalenceExpressionAccess().getSecrAssignment_0()); 
            // InternalQueryParser.g:2491:2: ( rule__EntityTypeCharacteristicEquivalenceExpression__SecrAssignment_0 )
            // InternalQueryParser.g:2491:3: rule__EntityTypeCharacteristicEquivalenceExpression__SecrAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EntityTypeCharacteristicEquivalenceExpression__SecrAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeCharacteristicEquivalenceExpressionAccess().getSecrAssignment_0()); 

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
    // $ANTLR end "rule__EntityTypeCharacteristicEquivalenceExpression__Group__0__Impl"


    // $ANTLR start "rule__EntityTypeCharacteristicEquivalenceExpression__Group__1"
    // InternalQueryParser.g:2499:1: rule__EntityTypeCharacteristicEquivalenceExpression__Group__1 : rule__EntityTypeCharacteristicEquivalenceExpression__Group__1__Impl ;
    public final void rule__EntityTypeCharacteristicEquivalenceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2503:1: ( rule__EntityTypeCharacteristicEquivalenceExpression__Group__1__Impl )
            // InternalQueryParser.g:2504:2: rule__EntityTypeCharacteristicEquivalenceExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityTypeCharacteristicEquivalenceExpression__Group__1__Impl();

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
    // $ANTLR end "rule__EntityTypeCharacteristicEquivalenceExpression__Group__1"


    // $ANTLR start "rule__EntityTypeCharacteristicEquivalenceExpression__Group__1__Impl"
    // InternalQueryParser.g:2510:1: rule__EntityTypeCharacteristicEquivalenceExpression__Group__1__Impl : ( ( rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__0 )? ) ;
    public final void rule__EntityTypeCharacteristicEquivalenceExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2514:1: ( ( ( rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__0 )? ) )
            // InternalQueryParser.g:2515:1: ( ( rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__0 )? )
            {
            // InternalQueryParser.g:2515:1: ( ( rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__0 )? )
            // InternalQueryParser.g:2516:2: ( rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__0 )?
            {
             before(grammarAccess.getEntityTypeCharacteristicEquivalenceExpressionAccess().getGroup_1()); 
            // InternalQueryParser.g:2517:2: ( rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_EQUALS_OPERATOR) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalQueryParser.g:2517:3: rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityTypeCharacteristicEquivalenceExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__EntityTypeCharacteristicEquivalenceExpression__Group__1__Impl"


    // $ANTLR start "rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__0"
    // InternalQueryParser.g:2526:1: rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__0 : rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__0__Impl rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__1 ;
    public final void rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2530:1: ( rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__0__Impl rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__1 )
            // InternalQueryParser.g:2531:2: rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__0__Impl rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__1();

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
    // $ANTLR end "rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__0"


    // $ANTLR start "rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__0__Impl"
    // InternalQueryParser.g:2538:1: rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__0__Impl : ( RULE_EQUALS_OPERATOR ) ;
    public final void rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2542:1: ( ( RULE_EQUALS_OPERATOR ) )
            // InternalQueryParser.g:2543:1: ( RULE_EQUALS_OPERATOR )
            {
            // InternalQueryParser.g:2543:1: ( RULE_EQUALS_OPERATOR )
            // InternalQueryParser.g:2544:2: RULE_EQUALS_OPERATOR
            {
             before(grammarAccess.getEntityTypeCharacteristicEquivalenceExpressionAccess().getEQUALS_OPERATORTerminalRuleCall_1_0()); 
            match(input,RULE_EQUALS_OPERATOR,FOLLOW_2); 
             after(grammarAccess.getEntityTypeCharacteristicEquivalenceExpressionAccess().getEQUALS_OPERATORTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__0__Impl"


    // $ANTLR start "rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__1"
    // InternalQueryParser.g:2553:1: rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__1 : rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__1__Impl ;
    public final void rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2557:1: ( rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__1__Impl )
            // InternalQueryParser.g:2558:2: rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__1__Impl();

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
    // $ANTLR end "rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__1"


    // $ANTLR start "rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__1__Impl"
    // InternalQueryParser.g:2564:1: rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__1__Impl : ( ( rule__EntityTypeCharacteristicEquivalenceExpression__SelectedEntityAssignment_1_1 ) ) ;
    public final void rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2568:1: ( ( ( rule__EntityTypeCharacteristicEquivalenceExpression__SelectedEntityAssignment_1_1 ) ) )
            // InternalQueryParser.g:2569:1: ( ( rule__EntityTypeCharacteristicEquivalenceExpression__SelectedEntityAssignment_1_1 ) )
            {
            // InternalQueryParser.g:2569:1: ( ( rule__EntityTypeCharacteristicEquivalenceExpression__SelectedEntityAssignment_1_1 ) )
            // InternalQueryParser.g:2570:2: ( rule__EntityTypeCharacteristicEquivalenceExpression__SelectedEntityAssignment_1_1 )
            {
             before(grammarAccess.getEntityTypeCharacteristicEquivalenceExpressionAccess().getSelectedEntityAssignment_1_1()); 
            // InternalQueryParser.g:2571:2: ( rule__EntityTypeCharacteristicEquivalenceExpression__SelectedEntityAssignment_1_1 )
            // InternalQueryParser.g:2571:3: rule__EntityTypeCharacteristicEquivalenceExpression__SelectedEntityAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EntityTypeCharacteristicEquivalenceExpression__SelectedEntityAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeCharacteristicEquivalenceExpressionAccess().getSelectedEntityAssignment_1_1()); 

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
    // $ANTLR end "rule__EntityTypeCharacteristicEquivalenceExpression__Group_1__1__Impl"


    // $ANTLR start "rule__SelectedEntityCharacteristicReference__Group__0"
    // InternalQueryParser.g:2580:1: rule__SelectedEntityCharacteristicReference__Group__0 : rule__SelectedEntityCharacteristicReference__Group__0__Impl rule__SelectedEntityCharacteristicReference__Group__1 ;
    public final void rule__SelectedEntityCharacteristicReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2584:1: ( rule__SelectedEntityCharacteristicReference__Group__0__Impl rule__SelectedEntityCharacteristicReference__Group__1 )
            // InternalQueryParser.g:2585:2: rule__SelectedEntityCharacteristicReference__Group__0__Impl rule__SelectedEntityCharacteristicReference__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SelectedEntityCharacteristicReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectedEntityCharacteristicReference__Group__1();

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
    // $ANTLR end "rule__SelectedEntityCharacteristicReference__Group__0"


    // $ANTLR start "rule__SelectedEntityCharacteristicReference__Group__0__Impl"
    // InternalQueryParser.g:2592:1: rule__SelectedEntityCharacteristicReference__Group__0__Impl : ( ( rule__SelectedEntityCharacteristicReference__Group_0__0 )? ) ;
    public final void rule__SelectedEntityCharacteristicReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2596:1: ( ( ( rule__SelectedEntityCharacteristicReference__Group_0__0 )? ) )
            // InternalQueryParser.g:2597:1: ( ( rule__SelectedEntityCharacteristicReference__Group_0__0 )? )
            {
            // InternalQueryParser.g:2597:1: ( ( rule__SelectedEntityCharacteristicReference__Group_0__0 )? )
            // InternalQueryParser.g:2598:2: ( rule__SelectedEntityCharacteristicReference__Group_0__0 )?
            {
             before(grammarAccess.getSelectedEntityCharacteristicReferenceAccess().getGroup_0()); 
            // InternalQueryParser.g:2599:2: ( rule__SelectedEntityCharacteristicReference__Group_0__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_IDENTIFIER) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==RULE_PERIOD) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalQueryParser.g:2599:3: rule__SelectedEntityCharacteristicReference__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectedEntityCharacteristicReference__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectedEntityCharacteristicReferenceAccess().getGroup_0()); 

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
    // $ANTLR end "rule__SelectedEntityCharacteristicReference__Group__0__Impl"


    // $ANTLR start "rule__SelectedEntityCharacteristicReference__Group__1"
    // InternalQueryParser.g:2607:1: rule__SelectedEntityCharacteristicReference__Group__1 : rule__SelectedEntityCharacteristicReference__Group__1__Impl ;
    public final void rule__SelectedEntityCharacteristicReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2611:1: ( rule__SelectedEntityCharacteristicReference__Group__1__Impl )
            // InternalQueryParser.g:2612:2: rule__SelectedEntityCharacteristicReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectedEntityCharacteristicReference__Group__1__Impl();

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
    // $ANTLR end "rule__SelectedEntityCharacteristicReference__Group__1"


    // $ANTLR start "rule__SelectedEntityCharacteristicReference__Group__1__Impl"
    // InternalQueryParser.g:2618:1: rule__SelectedEntityCharacteristicReference__Group__1__Impl : ( ( rule__SelectedEntityCharacteristicReference__CharacteristicAssignment_1 ) ) ;
    public final void rule__SelectedEntityCharacteristicReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2622:1: ( ( ( rule__SelectedEntityCharacteristicReference__CharacteristicAssignment_1 ) ) )
            // InternalQueryParser.g:2623:1: ( ( rule__SelectedEntityCharacteristicReference__CharacteristicAssignment_1 ) )
            {
            // InternalQueryParser.g:2623:1: ( ( rule__SelectedEntityCharacteristicReference__CharacteristicAssignment_1 ) )
            // InternalQueryParser.g:2624:2: ( rule__SelectedEntityCharacteristicReference__CharacteristicAssignment_1 )
            {
             before(grammarAccess.getSelectedEntityCharacteristicReferenceAccess().getCharacteristicAssignment_1()); 
            // InternalQueryParser.g:2625:2: ( rule__SelectedEntityCharacteristicReference__CharacteristicAssignment_1 )
            // InternalQueryParser.g:2625:3: rule__SelectedEntityCharacteristicReference__CharacteristicAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectedEntityCharacteristicReference__CharacteristicAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectedEntityCharacteristicReferenceAccess().getCharacteristicAssignment_1()); 

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
    // $ANTLR end "rule__SelectedEntityCharacteristicReference__Group__1__Impl"


    // $ANTLR start "rule__SelectedEntityCharacteristicReference__Group_0__0"
    // InternalQueryParser.g:2634:1: rule__SelectedEntityCharacteristicReference__Group_0__0 : rule__SelectedEntityCharacteristicReference__Group_0__0__Impl rule__SelectedEntityCharacteristicReference__Group_0__1 ;
    public final void rule__SelectedEntityCharacteristicReference__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2638:1: ( rule__SelectedEntityCharacteristicReference__Group_0__0__Impl rule__SelectedEntityCharacteristicReference__Group_0__1 )
            // InternalQueryParser.g:2639:2: rule__SelectedEntityCharacteristicReference__Group_0__0__Impl rule__SelectedEntityCharacteristicReference__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__SelectedEntityCharacteristicReference__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectedEntityCharacteristicReference__Group_0__1();

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
    // $ANTLR end "rule__SelectedEntityCharacteristicReference__Group_0__0"


    // $ANTLR start "rule__SelectedEntityCharacteristicReference__Group_0__0__Impl"
    // InternalQueryParser.g:2646:1: rule__SelectedEntityCharacteristicReference__Group_0__0__Impl : ( ( rule__SelectedEntityCharacteristicReference__SelectedEntityAssignment_0_0 ) ) ;
    public final void rule__SelectedEntityCharacteristicReference__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2650:1: ( ( ( rule__SelectedEntityCharacteristicReference__SelectedEntityAssignment_0_0 ) ) )
            // InternalQueryParser.g:2651:1: ( ( rule__SelectedEntityCharacteristicReference__SelectedEntityAssignment_0_0 ) )
            {
            // InternalQueryParser.g:2651:1: ( ( rule__SelectedEntityCharacteristicReference__SelectedEntityAssignment_0_0 ) )
            // InternalQueryParser.g:2652:2: ( rule__SelectedEntityCharacteristicReference__SelectedEntityAssignment_0_0 )
            {
             before(grammarAccess.getSelectedEntityCharacteristicReferenceAccess().getSelectedEntityAssignment_0_0()); 
            // InternalQueryParser.g:2653:2: ( rule__SelectedEntityCharacteristicReference__SelectedEntityAssignment_0_0 )
            // InternalQueryParser.g:2653:3: rule__SelectedEntityCharacteristicReference__SelectedEntityAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectedEntityCharacteristicReference__SelectedEntityAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectedEntityCharacteristicReferenceAccess().getSelectedEntityAssignment_0_0()); 

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
    // $ANTLR end "rule__SelectedEntityCharacteristicReference__Group_0__0__Impl"


    // $ANTLR start "rule__SelectedEntityCharacteristicReference__Group_0__1"
    // InternalQueryParser.g:2661:1: rule__SelectedEntityCharacteristicReference__Group_0__1 : rule__SelectedEntityCharacteristicReference__Group_0__1__Impl ;
    public final void rule__SelectedEntityCharacteristicReference__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2665:1: ( rule__SelectedEntityCharacteristicReference__Group_0__1__Impl )
            // InternalQueryParser.g:2666:2: rule__SelectedEntityCharacteristicReference__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectedEntityCharacteristicReference__Group_0__1__Impl();

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
    // $ANTLR end "rule__SelectedEntityCharacteristicReference__Group_0__1"


    // $ANTLR start "rule__SelectedEntityCharacteristicReference__Group_0__1__Impl"
    // InternalQueryParser.g:2672:1: rule__SelectedEntityCharacteristicReference__Group_0__1__Impl : ( RULE_PERIOD ) ;
    public final void rule__SelectedEntityCharacteristicReference__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2676:1: ( ( RULE_PERIOD ) )
            // InternalQueryParser.g:2677:1: ( RULE_PERIOD )
            {
            // InternalQueryParser.g:2677:1: ( RULE_PERIOD )
            // InternalQueryParser.g:2678:2: RULE_PERIOD
            {
             before(grammarAccess.getSelectedEntityCharacteristicReferenceAccess().getPERIODTerminalRuleCall_0_1()); 
            match(input,RULE_PERIOD,FOLLOW_2); 
             after(grammarAccess.getSelectedEntityCharacteristicReferenceAccess().getPERIODTerminalRuleCall_0_1()); 

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
    // $ANTLR end "rule__SelectedEntityCharacteristicReference__Group_0__1__Impl"


    // $ANTLR start "rule__WhereClause__Group__0"
    // InternalQueryParser.g:2688:1: rule__WhereClause__Group__0 : rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1 ;
    public final void rule__WhereClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2692:1: ( rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1 )
            // InternalQueryParser.g:2693:2: rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__WhereClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereClause__Group__1();

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
    // $ANTLR end "rule__WhereClause__Group__0"


    // $ANTLR start "rule__WhereClause__Group__0__Impl"
    // InternalQueryParser.g:2700:1: rule__WhereClause__Group__0__Impl : ( RULE_KW_WHERE ) ;
    public final void rule__WhereClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2704:1: ( ( RULE_KW_WHERE ) )
            // InternalQueryParser.g:2705:1: ( RULE_KW_WHERE )
            {
            // InternalQueryParser.g:2705:1: ( RULE_KW_WHERE )
            // InternalQueryParser.g:2706:2: RULE_KW_WHERE
            {
             before(grammarAccess.getWhereClauseAccess().getKW_WHERETerminalRuleCall_0()); 
            match(input,RULE_KW_WHERE,FOLLOW_2); 
             after(grammarAccess.getWhereClauseAccess().getKW_WHERETerminalRuleCall_0()); 

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
    // $ANTLR end "rule__WhereClause__Group__0__Impl"


    // $ANTLR start "rule__WhereClause__Group__1"
    // InternalQueryParser.g:2715:1: rule__WhereClause__Group__1 : rule__WhereClause__Group__1__Impl ;
    public final void rule__WhereClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2719:1: ( rule__WhereClause__Group__1__Impl )
            // InternalQueryParser.g:2720:2: rule__WhereClause__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhereClause__Group__1__Impl();

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
    // $ANTLR end "rule__WhereClause__Group__1"


    // $ANTLR start "rule__WhereClause__Group__1__Impl"
    // InternalQueryParser.g:2726:1: rule__WhereClause__Group__1__Impl : ( ( rule__WhereClause__CriteriaAssignment_1 ) ) ;
    public final void rule__WhereClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2730:1: ( ( ( rule__WhereClause__CriteriaAssignment_1 ) ) )
            // InternalQueryParser.g:2731:1: ( ( rule__WhereClause__CriteriaAssignment_1 ) )
            {
            // InternalQueryParser.g:2731:1: ( ( rule__WhereClause__CriteriaAssignment_1 ) )
            // InternalQueryParser.g:2732:2: ( rule__WhereClause__CriteriaAssignment_1 )
            {
             before(grammarAccess.getWhereClauseAccess().getCriteriaAssignment_1()); 
            // InternalQueryParser.g:2733:2: ( rule__WhereClause__CriteriaAssignment_1 )
            // InternalQueryParser.g:2733:3: rule__WhereClause__CriteriaAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WhereClause__CriteriaAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhereClauseAccess().getCriteriaAssignment_1()); 

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
    // $ANTLR end "rule__WhereClause__Group__1__Impl"


    // $ANTLR start "rule__OrderByClause__Group__0"
    // InternalQueryParser.g:2742:1: rule__OrderByClause__Group__0 : rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1 ;
    public final void rule__OrderByClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2746:1: ( rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1 )
            // InternalQueryParser.g:2747:2: rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__OrderByClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderByClause__Group__1();

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
    // $ANTLR end "rule__OrderByClause__Group__0"


    // $ANTLR start "rule__OrderByClause__Group__0__Impl"
    // InternalQueryParser.g:2754:1: rule__OrderByClause__Group__0__Impl : ( RULE_KW_ORDER ) ;
    public final void rule__OrderByClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2758:1: ( ( RULE_KW_ORDER ) )
            // InternalQueryParser.g:2759:1: ( RULE_KW_ORDER )
            {
            // InternalQueryParser.g:2759:1: ( RULE_KW_ORDER )
            // InternalQueryParser.g:2760:2: RULE_KW_ORDER
            {
             before(grammarAccess.getOrderByClauseAccess().getKW_ORDERTerminalRuleCall_0()); 
            match(input,RULE_KW_ORDER,FOLLOW_2); 
             after(grammarAccess.getOrderByClauseAccess().getKW_ORDERTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__OrderByClause__Group__0__Impl"


    // $ANTLR start "rule__OrderByClause__Group__1"
    // InternalQueryParser.g:2769:1: rule__OrderByClause__Group__1 : rule__OrderByClause__Group__1__Impl rule__OrderByClause__Group__2 ;
    public final void rule__OrderByClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2773:1: ( rule__OrderByClause__Group__1__Impl rule__OrderByClause__Group__2 )
            // InternalQueryParser.g:2774:2: rule__OrderByClause__Group__1__Impl rule__OrderByClause__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__OrderByClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderByClause__Group__2();

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
    // $ANTLR end "rule__OrderByClause__Group__1"


    // $ANTLR start "rule__OrderByClause__Group__1__Impl"
    // InternalQueryParser.g:2781:1: rule__OrderByClause__Group__1__Impl : ( RULE_KW_BY ) ;
    public final void rule__OrderByClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2785:1: ( ( RULE_KW_BY ) )
            // InternalQueryParser.g:2786:1: ( RULE_KW_BY )
            {
            // InternalQueryParser.g:2786:1: ( RULE_KW_BY )
            // InternalQueryParser.g:2787:2: RULE_KW_BY
            {
             before(grammarAccess.getOrderByClauseAccess().getKW_BYTerminalRuleCall_1()); 
            match(input,RULE_KW_BY,FOLLOW_2); 
             after(grammarAccess.getOrderByClauseAccess().getKW_BYTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__OrderByClause__Group__1__Impl"


    // $ANTLR start "rule__OrderByClause__Group__2"
    // InternalQueryParser.g:2796:1: rule__OrderByClause__Group__2 : rule__OrderByClause__Group__2__Impl rule__OrderByClause__Group__3 ;
    public final void rule__OrderByClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2800:1: ( rule__OrderByClause__Group__2__Impl rule__OrderByClause__Group__3 )
            // InternalQueryParser.g:2801:2: rule__OrderByClause__Group__2__Impl rule__OrderByClause__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__OrderByClause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderByClause__Group__3();

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
    // $ANTLR end "rule__OrderByClause__Group__2"


    // $ANTLR start "rule__OrderByClause__Group__2__Impl"
    // InternalQueryParser.g:2808:1: rule__OrderByClause__Group__2__Impl : ( ( rule__OrderByClause__OrderingExpressionAssignment_2 ) ) ;
    public final void rule__OrderByClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2812:1: ( ( ( rule__OrderByClause__OrderingExpressionAssignment_2 ) ) )
            // InternalQueryParser.g:2813:1: ( ( rule__OrderByClause__OrderingExpressionAssignment_2 ) )
            {
            // InternalQueryParser.g:2813:1: ( ( rule__OrderByClause__OrderingExpressionAssignment_2 ) )
            // InternalQueryParser.g:2814:2: ( rule__OrderByClause__OrderingExpressionAssignment_2 )
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderingExpressionAssignment_2()); 
            // InternalQueryParser.g:2815:2: ( rule__OrderByClause__OrderingExpressionAssignment_2 )
            // InternalQueryParser.g:2815:3: rule__OrderByClause__OrderingExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OrderByClause__OrderingExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOrderByClauseAccess().getOrderingExpressionAssignment_2()); 

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
    // $ANTLR end "rule__OrderByClause__Group__2__Impl"


    // $ANTLR start "rule__OrderByClause__Group__3"
    // InternalQueryParser.g:2823:1: rule__OrderByClause__Group__3 : rule__OrderByClause__Group__3__Impl ;
    public final void rule__OrderByClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2827:1: ( rule__OrderByClause__Group__3__Impl )
            // InternalQueryParser.g:2828:2: rule__OrderByClause__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderByClause__Group__3__Impl();

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
    // $ANTLR end "rule__OrderByClause__Group__3"


    // $ANTLR start "rule__OrderByClause__Group__3__Impl"
    // InternalQueryParser.g:2834:1: rule__OrderByClause__Group__3__Impl : ( ( rule__OrderByClause__Group_3__0 )* ) ;
    public final void rule__OrderByClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2838:1: ( ( ( rule__OrderByClause__Group_3__0 )* ) )
            // InternalQueryParser.g:2839:1: ( ( rule__OrderByClause__Group_3__0 )* )
            {
            // InternalQueryParser.g:2839:1: ( ( rule__OrderByClause__Group_3__0 )* )
            // InternalQueryParser.g:2840:2: ( rule__OrderByClause__Group_3__0 )*
            {
             before(grammarAccess.getOrderByClauseAccess().getGroup_3()); 
            // InternalQueryParser.g:2841:2: ( rule__OrderByClause__Group_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_COMMA) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalQueryParser.g:2841:3: rule__OrderByClause__Group_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__OrderByClause__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getOrderByClauseAccess().getGroup_3()); 

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
    // $ANTLR end "rule__OrderByClause__Group__3__Impl"


    // $ANTLR start "rule__OrderByClause__Group_3__0"
    // InternalQueryParser.g:2850:1: rule__OrderByClause__Group_3__0 : rule__OrderByClause__Group_3__0__Impl rule__OrderByClause__Group_3__1 ;
    public final void rule__OrderByClause__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2854:1: ( rule__OrderByClause__Group_3__0__Impl rule__OrderByClause__Group_3__1 )
            // InternalQueryParser.g:2855:2: rule__OrderByClause__Group_3__0__Impl rule__OrderByClause__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__OrderByClause__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderByClause__Group_3__1();

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
    // $ANTLR end "rule__OrderByClause__Group_3__0"


    // $ANTLR start "rule__OrderByClause__Group_3__0__Impl"
    // InternalQueryParser.g:2862:1: rule__OrderByClause__Group_3__0__Impl : ( RULE_COMMA ) ;
    public final void rule__OrderByClause__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2866:1: ( ( RULE_COMMA ) )
            // InternalQueryParser.g:2867:1: ( RULE_COMMA )
            {
            // InternalQueryParser.g:2867:1: ( RULE_COMMA )
            // InternalQueryParser.g:2868:2: RULE_COMMA
            {
             before(grammarAccess.getOrderByClauseAccess().getCOMMATerminalRuleCall_3_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getOrderByClauseAccess().getCOMMATerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__OrderByClause__Group_3__0__Impl"


    // $ANTLR start "rule__OrderByClause__Group_3__1"
    // InternalQueryParser.g:2877:1: rule__OrderByClause__Group_3__1 : rule__OrderByClause__Group_3__1__Impl ;
    public final void rule__OrderByClause__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2881:1: ( rule__OrderByClause__Group_3__1__Impl )
            // InternalQueryParser.g:2882:2: rule__OrderByClause__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderByClause__Group_3__1__Impl();

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
    // $ANTLR end "rule__OrderByClause__Group_3__1"


    // $ANTLR start "rule__OrderByClause__Group_3__1__Impl"
    // InternalQueryParser.g:2888:1: rule__OrderByClause__Group_3__1__Impl : ( ( rule__OrderByClause__OrderingExpressionAssignment_3_1 ) ) ;
    public final void rule__OrderByClause__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2892:1: ( ( ( rule__OrderByClause__OrderingExpressionAssignment_3_1 ) ) )
            // InternalQueryParser.g:2893:1: ( ( rule__OrderByClause__OrderingExpressionAssignment_3_1 ) )
            {
            // InternalQueryParser.g:2893:1: ( ( rule__OrderByClause__OrderingExpressionAssignment_3_1 ) )
            // InternalQueryParser.g:2894:2: ( rule__OrderByClause__OrderingExpressionAssignment_3_1 )
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderingExpressionAssignment_3_1()); 
            // InternalQueryParser.g:2895:2: ( rule__OrderByClause__OrderingExpressionAssignment_3_1 )
            // InternalQueryParser.g:2895:3: rule__OrderByClause__OrderingExpressionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OrderByClause__OrderingExpressionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderByClauseAccess().getOrderingExpressionAssignment_3_1()); 

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
    // $ANTLR end "rule__OrderByClause__Group_3__1__Impl"


    // $ANTLR start "rule__OrderingExpression__Group__0"
    // InternalQueryParser.g:2904:1: rule__OrderingExpression__Group__0 : rule__OrderingExpression__Group__0__Impl rule__OrderingExpression__Group__1 ;
    public final void rule__OrderingExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2908:1: ( rule__OrderingExpression__Group__0__Impl rule__OrderingExpression__Group__1 )
            // InternalQueryParser.g:2909:2: rule__OrderingExpression__Group__0__Impl rule__OrderingExpression__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__OrderingExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderingExpression__Group__1();

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
    // $ANTLR end "rule__OrderingExpression__Group__0"


    // $ANTLR start "rule__OrderingExpression__Group__0__Impl"
    // InternalQueryParser.g:2916:1: rule__OrderingExpression__Group__0__Impl : ( ( rule__OrderingExpression__CharacteristicAssignment_0 ) ) ;
    public final void rule__OrderingExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2920:1: ( ( ( rule__OrderingExpression__CharacteristicAssignment_0 ) ) )
            // InternalQueryParser.g:2921:1: ( ( rule__OrderingExpression__CharacteristicAssignment_0 ) )
            {
            // InternalQueryParser.g:2921:1: ( ( rule__OrderingExpression__CharacteristicAssignment_0 ) )
            // InternalQueryParser.g:2922:2: ( rule__OrderingExpression__CharacteristicAssignment_0 )
            {
             before(grammarAccess.getOrderingExpressionAccess().getCharacteristicAssignment_0()); 
            // InternalQueryParser.g:2923:2: ( rule__OrderingExpression__CharacteristicAssignment_0 )
            // InternalQueryParser.g:2923:3: rule__OrderingExpression__CharacteristicAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OrderingExpression__CharacteristicAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOrderingExpressionAccess().getCharacteristicAssignment_0()); 

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
    // $ANTLR end "rule__OrderingExpression__Group__0__Impl"


    // $ANTLR start "rule__OrderingExpression__Group__1"
    // InternalQueryParser.g:2931:1: rule__OrderingExpression__Group__1 : rule__OrderingExpression__Group__1__Impl ;
    public final void rule__OrderingExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2935:1: ( rule__OrderingExpression__Group__1__Impl )
            // InternalQueryParser.g:2936:2: rule__OrderingExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderingExpression__Group__1__Impl();

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
    // $ANTLR end "rule__OrderingExpression__Group__1"


    // $ANTLR start "rule__OrderingExpression__Group__1__Impl"
    // InternalQueryParser.g:2942:1: rule__OrderingExpression__Group__1__Impl : ( ( rule__OrderingExpression__OrderingTypeAssignment_1 )? ) ;
    public final void rule__OrderingExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2946:1: ( ( ( rule__OrderingExpression__OrderingTypeAssignment_1 )? ) )
            // InternalQueryParser.g:2947:1: ( ( rule__OrderingExpression__OrderingTypeAssignment_1 )? )
            {
            // InternalQueryParser.g:2947:1: ( ( rule__OrderingExpression__OrderingTypeAssignment_1 )? )
            // InternalQueryParser.g:2948:2: ( rule__OrderingExpression__OrderingTypeAssignment_1 )?
            {
             before(grammarAccess.getOrderingExpressionAccess().getOrderingTypeAssignment_1()); 
            // InternalQueryParser.g:2949:2: ( rule__OrderingExpression__OrderingTypeAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_KW_ASC && LA26_0<=RULE_KW_DESC)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalQueryParser.g:2949:3: rule__OrderingExpression__OrderingTypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__OrderingExpression__OrderingTypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderingExpressionAccess().getOrderingTypeAssignment_1()); 

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
    // $ANTLR end "rule__OrderingExpression__Group__1__Impl"


    // $ANTLR start "rule__QualifiedProjectedCharacteristicReference__Group__0"
    // InternalQueryParser.g:2958:1: rule__QualifiedProjectedCharacteristicReference__Group__0 : rule__QualifiedProjectedCharacteristicReference__Group__0__Impl rule__QualifiedProjectedCharacteristicReference__Group__1 ;
    public final void rule__QualifiedProjectedCharacteristicReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2962:1: ( rule__QualifiedProjectedCharacteristicReference__Group__0__Impl rule__QualifiedProjectedCharacteristicReference__Group__1 )
            // InternalQueryParser.g:2963:2: rule__QualifiedProjectedCharacteristicReference__Group__0__Impl rule__QualifiedProjectedCharacteristicReference__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__QualifiedProjectedCharacteristicReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedProjectedCharacteristicReference__Group__1();

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
    // $ANTLR end "rule__QualifiedProjectedCharacteristicReference__Group__0"


    // $ANTLR start "rule__QualifiedProjectedCharacteristicReference__Group__0__Impl"
    // InternalQueryParser.g:2970:1: rule__QualifiedProjectedCharacteristicReference__Group__0__Impl : ( ( rule__QualifiedProjectedCharacteristicReference__SelectedEntityReferenceAssignment_0 ) ) ;
    public final void rule__QualifiedProjectedCharacteristicReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2974:1: ( ( ( rule__QualifiedProjectedCharacteristicReference__SelectedEntityReferenceAssignment_0 ) ) )
            // InternalQueryParser.g:2975:1: ( ( rule__QualifiedProjectedCharacteristicReference__SelectedEntityReferenceAssignment_0 ) )
            {
            // InternalQueryParser.g:2975:1: ( ( rule__QualifiedProjectedCharacteristicReference__SelectedEntityReferenceAssignment_0 ) )
            // InternalQueryParser.g:2976:2: ( rule__QualifiedProjectedCharacteristicReference__SelectedEntityReferenceAssignment_0 )
            {
             before(grammarAccess.getQualifiedProjectedCharacteristicReferenceAccess().getSelectedEntityReferenceAssignment_0()); 
            // InternalQueryParser.g:2977:2: ( rule__QualifiedProjectedCharacteristicReference__SelectedEntityReferenceAssignment_0 )
            // InternalQueryParser.g:2977:3: rule__QualifiedProjectedCharacteristicReference__SelectedEntityReferenceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedProjectedCharacteristicReference__SelectedEntityReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedProjectedCharacteristicReferenceAccess().getSelectedEntityReferenceAssignment_0()); 

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
    // $ANTLR end "rule__QualifiedProjectedCharacteristicReference__Group__0__Impl"


    // $ANTLR start "rule__QualifiedProjectedCharacteristicReference__Group__1"
    // InternalQueryParser.g:2985:1: rule__QualifiedProjectedCharacteristicReference__Group__1 : rule__QualifiedProjectedCharacteristicReference__Group__1__Impl rule__QualifiedProjectedCharacteristicReference__Group__2 ;
    public final void rule__QualifiedProjectedCharacteristicReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:2989:1: ( rule__QualifiedProjectedCharacteristicReference__Group__1__Impl rule__QualifiedProjectedCharacteristicReference__Group__2 )
            // InternalQueryParser.g:2990:2: rule__QualifiedProjectedCharacteristicReference__Group__1__Impl rule__QualifiedProjectedCharacteristicReference__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedProjectedCharacteristicReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedProjectedCharacteristicReference__Group__2();

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
    // $ANTLR end "rule__QualifiedProjectedCharacteristicReference__Group__1"


    // $ANTLR start "rule__QualifiedProjectedCharacteristicReference__Group__1__Impl"
    // InternalQueryParser.g:2997:1: rule__QualifiedProjectedCharacteristicReference__Group__1__Impl : ( RULE_PERIOD ) ;
    public final void rule__QualifiedProjectedCharacteristicReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3001:1: ( ( RULE_PERIOD ) )
            // InternalQueryParser.g:3002:1: ( RULE_PERIOD )
            {
            // InternalQueryParser.g:3002:1: ( RULE_PERIOD )
            // InternalQueryParser.g:3003:2: RULE_PERIOD
            {
             before(grammarAccess.getQualifiedProjectedCharacteristicReferenceAccess().getPERIODTerminalRuleCall_1()); 
            match(input,RULE_PERIOD,FOLLOW_2); 
             after(grammarAccess.getQualifiedProjectedCharacteristicReferenceAccess().getPERIODTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__QualifiedProjectedCharacteristicReference__Group__1__Impl"


    // $ANTLR start "rule__QualifiedProjectedCharacteristicReference__Group__2"
    // InternalQueryParser.g:3012:1: rule__QualifiedProjectedCharacteristicReference__Group__2 : rule__QualifiedProjectedCharacteristicReference__Group__2__Impl ;
    public final void rule__QualifiedProjectedCharacteristicReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3016:1: ( rule__QualifiedProjectedCharacteristicReference__Group__2__Impl )
            // InternalQueryParser.g:3017:2: rule__QualifiedProjectedCharacteristicReference__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedProjectedCharacteristicReference__Group__2__Impl();

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
    // $ANTLR end "rule__QualifiedProjectedCharacteristicReference__Group__2"


    // $ANTLR start "rule__QualifiedProjectedCharacteristicReference__Group__2__Impl"
    // InternalQueryParser.g:3023:1: rule__QualifiedProjectedCharacteristicReference__Group__2__Impl : ( ( rule__QualifiedProjectedCharacteristicReference__CharacteristicAssignment_2 ) ) ;
    public final void rule__QualifiedProjectedCharacteristicReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3027:1: ( ( ( rule__QualifiedProjectedCharacteristicReference__CharacteristicAssignment_2 ) ) )
            // InternalQueryParser.g:3028:1: ( ( rule__QualifiedProjectedCharacteristicReference__CharacteristicAssignment_2 ) )
            {
            // InternalQueryParser.g:3028:1: ( ( rule__QualifiedProjectedCharacteristicReference__CharacteristicAssignment_2 ) )
            // InternalQueryParser.g:3029:2: ( rule__QualifiedProjectedCharacteristicReference__CharacteristicAssignment_2 )
            {
             before(grammarAccess.getQualifiedProjectedCharacteristicReferenceAccess().getCharacteristicAssignment_2()); 
            // InternalQueryParser.g:3030:2: ( rule__QualifiedProjectedCharacteristicReference__CharacteristicAssignment_2 )
            // InternalQueryParser.g:3030:3: rule__QualifiedProjectedCharacteristicReference__CharacteristicAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedProjectedCharacteristicReference__CharacteristicAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedProjectedCharacteristicReferenceAccess().getCharacteristicAssignment_2()); 

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
    // $ANTLR end "rule__QualifiedProjectedCharacteristicReference__Group__2__Impl"


    // $ANTLR start "rule__BooleanExpression__Group__0"
    // InternalQueryParser.g:3039:1: rule__BooleanExpression__Group__0 : rule__BooleanExpression__Group__0__Impl rule__BooleanExpression__Group__1 ;
    public final void rule__BooleanExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3043:1: ( rule__BooleanExpression__Group__0__Impl rule__BooleanExpression__Group__1 )
            // InternalQueryParser.g:3044:2: rule__BooleanExpression__Group__0__Impl rule__BooleanExpression__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__BooleanExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanExpression__Group__1();

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
    // $ANTLR end "rule__BooleanExpression__Group__0"


    // $ANTLR start "rule__BooleanExpression__Group__0__Impl"
    // InternalQueryParser.g:3051:1: rule__BooleanExpression__Group__0__Impl : ( ( rule__BooleanExpression__TermAssignment_0 ) ) ;
    public final void rule__BooleanExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3055:1: ( ( ( rule__BooleanExpression__TermAssignment_0 ) ) )
            // InternalQueryParser.g:3056:1: ( ( rule__BooleanExpression__TermAssignment_0 ) )
            {
            // InternalQueryParser.g:3056:1: ( ( rule__BooleanExpression__TermAssignment_0 ) )
            // InternalQueryParser.g:3057:2: ( rule__BooleanExpression__TermAssignment_0 )
            {
             before(grammarAccess.getBooleanExpressionAccess().getTermAssignment_0()); 
            // InternalQueryParser.g:3058:2: ( rule__BooleanExpression__TermAssignment_0 )
            // InternalQueryParser.g:3058:3: rule__BooleanExpression__TermAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpression__TermAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanExpressionAccess().getTermAssignment_0()); 

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
    // $ANTLR end "rule__BooleanExpression__Group__0__Impl"


    // $ANTLR start "rule__BooleanExpression__Group__1"
    // InternalQueryParser.g:3066:1: rule__BooleanExpression__Group__1 : rule__BooleanExpression__Group__1__Impl ;
    public final void rule__BooleanExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3070:1: ( rule__BooleanExpression__Group__1__Impl )
            // InternalQueryParser.g:3071:2: rule__BooleanExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpression__Group__1__Impl();

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
    // $ANTLR end "rule__BooleanExpression__Group__1"


    // $ANTLR start "rule__BooleanExpression__Group__1__Impl"
    // InternalQueryParser.g:3077:1: rule__BooleanExpression__Group__1__Impl : ( ( rule__BooleanExpression__Group_1__0 )* ) ;
    public final void rule__BooleanExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3081:1: ( ( ( rule__BooleanExpression__Group_1__0 )* ) )
            // InternalQueryParser.g:3082:1: ( ( rule__BooleanExpression__Group_1__0 )* )
            {
            // InternalQueryParser.g:3082:1: ( ( rule__BooleanExpression__Group_1__0 )* )
            // InternalQueryParser.g:3083:2: ( rule__BooleanExpression__Group_1__0 )*
            {
             before(grammarAccess.getBooleanExpressionAccess().getGroup_1()); 
            // InternalQueryParser.g:3084:2: ( rule__BooleanExpression__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_KW_OR) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalQueryParser.g:3084:3: rule__BooleanExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__BooleanExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getBooleanExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__BooleanExpression__Group__1__Impl"


    // $ANTLR start "rule__BooleanExpression__Group_1__0"
    // InternalQueryParser.g:3093:1: rule__BooleanExpression__Group_1__0 : rule__BooleanExpression__Group_1__0__Impl rule__BooleanExpression__Group_1__1 ;
    public final void rule__BooleanExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3097:1: ( rule__BooleanExpression__Group_1__0__Impl rule__BooleanExpression__Group_1__1 )
            // InternalQueryParser.g:3098:2: rule__BooleanExpression__Group_1__0__Impl rule__BooleanExpression__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__BooleanExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanExpression__Group_1__1();

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
    // $ANTLR end "rule__BooleanExpression__Group_1__0"


    // $ANTLR start "rule__BooleanExpression__Group_1__0__Impl"
    // InternalQueryParser.g:3105:1: rule__BooleanExpression__Group_1__0__Impl : ( RULE_KW_OR ) ;
    public final void rule__BooleanExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3109:1: ( ( RULE_KW_OR ) )
            // InternalQueryParser.g:3110:1: ( RULE_KW_OR )
            {
            // InternalQueryParser.g:3110:1: ( RULE_KW_OR )
            // InternalQueryParser.g:3111:2: RULE_KW_OR
            {
             before(grammarAccess.getBooleanExpressionAccess().getKW_ORTerminalRuleCall_1_0()); 
            match(input,RULE_KW_OR,FOLLOW_2); 
             after(grammarAccess.getBooleanExpressionAccess().getKW_ORTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__BooleanExpression__Group_1__0__Impl"


    // $ANTLR start "rule__BooleanExpression__Group_1__1"
    // InternalQueryParser.g:3120:1: rule__BooleanExpression__Group_1__1 : rule__BooleanExpression__Group_1__1__Impl ;
    public final void rule__BooleanExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3124:1: ( rule__BooleanExpression__Group_1__1__Impl )
            // InternalQueryParser.g:3125:2: rule__BooleanExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpression__Group_1__1__Impl();

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
    // $ANTLR end "rule__BooleanExpression__Group_1__1"


    // $ANTLR start "rule__BooleanExpression__Group_1__1__Impl"
    // InternalQueryParser.g:3131:1: rule__BooleanExpression__Group_1__1__Impl : ( ( rule__BooleanExpression__TermAssignment_1_1 ) ) ;
    public final void rule__BooleanExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3135:1: ( ( ( rule__BooleanExpression__TermAssignment_1_1 ) ) )
            // InternalQueryParser.g:3136:1: ( ( rule__BooleanExpression__TermAssignment_1_1 ) )
            {
            // InternalQueryParser.g:3136:1: ( ( rule__BooleanExpression__TermAssignment_1_1 ) )
            // InternalQueryParser.g:3137:2: ( rule__BooleanExpression__TermAssignment_1_1 )
            {
             before(grammarAccess.getBooleanExpressionAccess().getTermAssignment_1_1()); 
            // InternalQueryParser.g:3138:2: ( rule__BooleanExpression__TermAssignment_1_1 )
            // InternalQueryParser.g:3138:3: rule__BooleanExpression__TermAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpression__TermAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanExpressionAccess().getTermAssignment_1_1()); 

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
    // $ANTLR end "rule__BooleanExpression__Group_1__1__Impl"


    // $ANTLR start "rule__BooleanTerm__Group__0"
    // InternalQueryParser.g:3147:1: rule__BooleanTerm__Group__0 : rule__BooleanTerm__Group__0__Impl rule__BooleanTerm__Group__1 ;
    public final void rule__BooleanTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3151:1: ( rule__BooleanTerm__Group__0__Impl rule__BooleanTerm__Group__1 )
            // InternalQueryParser.g:3152:2: rule__BooleanTerm__Group__0__Impl rule__BooleanTerm__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__BooleanTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanTerm__Group__1();

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
    // $ANTLR end "rule__BooleanTerm__Group__0"


    // $ANTLR start "rule__BooleanTerm__Group__0__Impl"
    // InternalQueryParser.g:3159:1: rule__BooleanTerm__Group__0__Impl : ( ( rule__BooleanTerm__FactorAssignment_0 ) ) ;
    public final void rule__BooleanTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3163:1: ( ( ( rule__BooleanTerm__FactorAssignment_0 ) ) )
            // InternalQueryParser.g:3164:1: ( ( rule__BooleanTerm__FactorAssignment_0 ) )
            {
            // InternalQueryParser.g:3164:1: ( ( rule__BooleanTerm__FactorAssignment_0 ) )
            // InternalQueryParser.g:3165:2: ( rule__BooleanTerm__FactorAssignment_0 )
            {
             before(grammarAccess.getBooleanTermAccess().getFactorAssignment_0()); 
            // InternalQueryParser.g:3166:2: ( rule__BooleanTerm__FactorAssignment_0 )
            // InternalQueryParser.g:3166:3: rule__BooleanTerm__FactorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanTerm__FactorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanTermAccess().getFactorAssignment_0()); 

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
    // $ANTLR end "rule__BooleanTerm__Group__0__Impl"


    // $ANTLR start "rule__BooleanTerm__Group__1"
    // InternalQueryParser.g:3174:1: rule__BooleanTerm__Group__1 : rule__BooleanTerm__Group__1__Impl ;
    public final void rule__BooleanTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3178:1: ( rule__BooleanTerm__Group__1__Impl )
            // InternalQueryParser.g:3179:2: rule__BooleanTerm__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanTerm__Group__1__Impl();

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
    // $ANTLR end "rule__BooleanTerm__Group__1"


    // $ANTLR start "rule__BooleanTerm__Group__1__Impl"
    // InternalQueryParser.g:3185:1: rule__BooleanTerm__Group__1__Impl : ( ( rule__BooleanTerm__Group_1__0 )* ) ;
    public final void rule__BooleanTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3189:1: ( ( ( rule__BooleanTerm__Group_1__0 )* ) )
            // InternalQueryParser.g:3190:1: ( ( rule__BooleanTerm__Group_1__0 )* )
            {
            // InternalQueryParser.g:3190:1: ( ( rule__BooleanTerm__Group_1__0 )* )
            // InternalQueryParser.g:3191:2: ( rule__BooleanTerm__Group_1__0 )*
            {
             before(grammarAccess.getBooleanTermAccess().getGroup_1()); 
            // InternalQueryParser.g:3192:2: ( rule__BooleanTerm__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_KW_AND) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalQueryParser.g:3192:3: rule__BooleanTerm__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__BooleanTerm__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getBooleanTermAccess().getGroup_1()); 

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
    // $ANTLR end "rule__BooleanTerm__Group__1__Impl"


    // $ANTLR start "rule__BooleanTerm__Group_1__0"
    // InternalQueryParser.g:3201:1: rule__BooleanTerm__Group_1__0 : rule__BooleanTerm__Group_1__0__Impl rule__BooleanTerm__Group_1__1 ;
    public final void rule__BooleanTerm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3205:1: ( rule__BooleanTerm__Group_1__0__Impl rule__BooleanTerm__Group_1__1 )
            // InternalQueryParser.g:3206:2: rule__BooleanTerm__Group_1__0__Impl rule__BooleanTerm__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__BooleanTerm__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanTerm__Group_1__1();

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
    // $ANTLR end "rule__BooleanTerm__Group_1__0"


    // $ANTLR start "rule__BooleanTerm__Group_1__0__Impl"
    // InternalQueryParser.g:3213:1: rule__BooleanTerm__Group_1__0__Impl : ( RULE_KW_AND ) ;
    public final void rule__BooleanTerm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3217:1: ( ( RULE_KW_AND ) )
            // InternalQueryParser.g:3218:1: ( RULE_KW_AND )
            {
            // InternalQueryParser.g:3218:1: ( RULE_KW_AND )
            // InternalQueryParser.g:3219:2: RULE_KW_AND
            {
             before(grammarAccess.getBooleanTermAccess().getKW_ANDTerminalRuleCall_1_0()); 
            match(input,RULE_KW_AND,FOLLOW_2); 
             after(grammarAccess.getBooleanTermAccess().getKW_ANDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__BooleanTerm__Group_1__0__Impl"


    // $ANTLR start "rule__BooleanTerm__Group_1__1"
    // InternalQueryParser.g:3228:1: rule__BooleanTerm__Group_1__1 : rule__BooleanTerm__Group_1__1__Impl ;
    public final void rule__BooleanTerm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3232:1: ( rule__BooleanTerm__Group_1__1__Impl )
            // InternalQueryParser.g:3233:2: rule__BooleanTerm__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanTerm__Group_1__1__Impl();

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
    // $ANTLR end "rule__BooleanTerm__Group_1__1"


    // $ANTLR start "rule__BooleanTerm__Group_1__1__Impl"
    // InternalQueryParser.g:3239:1: rule__BooleanTerm__Group_1__1__Impl : ( ( rule__BooleanTerm__FactorAssignment_1_1 ) ) ;
    public final void rule__BooleanTerm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3243:1: ( ( ( rule__BooleanTerm__FactorAssignment_1_1 ) ) )
            // InternalQueryParser.g:3244:1: ( ( rule__BooleanTerm__FactorAssignment_1_1 ) )
            {
            // InternalQueryParser.g:3244:1: ( ( rule__BooleanTerm__FactorAssignment_1_1 ) )
            // InternalQueryParser.g:3245:2: ( rule__BooleanTerm__FactorAssignment_1_1 )
            {
             before(grammarAccess.getBooleanTermAccess().getFactorAssignment_1_1()); 
            // InternalQueryParser.g:3246:2: ( rule__BooleanTerm__FactorAssignment_1_1 )
            // InternalQueryParser.g:3246:3: rule__BooleanTerm__FactorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanTerm__FactorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanTermAccess().getFactorAssignment_1_1()); 

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
    // $ANTLR end "rule__BooleanTerm__Group_1__1__Impl"


    // $ANTLR start "rule__BooleanFactor__Group__0"
    // InternalQueryParser.g:3255:1: rule__BooleanFactor__Group__0 : rule__BooleanFactor__Group__0__Impl rule__BooleanFactor__Group__1 ;
    public final void rule__BooleanFactor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3259:1: ( rule__BooleanFactor__Group__0__Impl rule__BooleanFactor__Group__1 )
            // InternalQueryParser.g:3260:2: rule__BooleanFactor__Group__0__Impl rule__BooleanFactor__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__BooleanFactor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanFactor__Group__1();

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
    // $ANTLR end "rule__BooleanFactor__Group__0"


    // $ANTLR start "rule__BooleanFactor__Group__0__Impl"
    // InternalQueryParser.g:3267:1: rule__BooleanFactor__Group__0__Impl : ( ( rule__BooleanFactor__NotAssignment_0 )? ) ;
    public final void rule__BooleanFactor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3271:1: ( ( ( rule__BooleanFactor__NotAssignment_0 )? ) )
            // InternalQueryParser.g:3272:1: ( ( rule__BooleanFactor__NotAssignment_0 )? )
            {
            // InternalQueryParser.g:3272:1: ( ( rule__BooleanFactor__NotAssignment_0 )? )
            // InternalQueryParser.g:3273:2: ( rule__BooleanFactor__NotAssignment_0 )?
            {
             before(grammarAccess.getBooleanFactorAccess().getNotAssignment_0()); 
            // InternalQueryParser.g:3274:2: ( rule__BooleanFactor__NotAssignment_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_KW_NOT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalQueryParser.g:3274:3: rule__BooleanFactor__NotAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanFactor__NotAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBooleanFactorAccess().getNotAssignment_0()); 

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
    // $ANTLR end "rule__BooleanFactor__Group__0__Impl"


    // $ANTLR start "rule__BooleanFactor__Group__1"
    // InternalQueryParser.g:3282:1: rule__BooleanFactor__Group__1 : rule__BooleanFactor__Group__1__Impl ;
    public final void rule__BooleanFactor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3286:1: ( rule__BooleanFactor__Group__1__Impl )
            // InternalQueryParser.g:3287:2: rule__BooleanFactor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanFactor__Group__1__Impl();

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
    // $ANTLR end "rule__BooleanFactor__Group__1"


    // $ANTLR start "rule__BooleanFactor__Group__1__Impl"
    // InternalQueryParser.g:3293:1: rule__BooleanFactor__Group__1__Impl : ( ( rule__BooleanFactor__PredAssignment_1 ) ) ;
    public final void rule__BooleanFactor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3297:1: ( ( ( rule__BooleanFactor__PredAssignment_1 ) ) )
            // InternalQueryParser.g:3298:1: ( ( rule__BooleanFactor__PredAssignment_1 ) )
            {
            // InternalQueryParser.g:3298:1: ( ( rule__BooleanFactor__PredAssignment_1 ) )
            // InternalQueryParser.g:3299:2: ( rule__BooleanFactor__PredAssignment_1 )
            {
             before(grammarAccess.getBooleanFactorAccess().getPredAssignment_1()); 
            // InternalQueryParser.g:3300:2: ( rule__BooleanFactor__PredAssignment_1 )
            // InternalQueryParser.g:3300:3: rule__BooleanFactor__PredAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanFactor__PredAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanFactorAccess().getPredAssignment_1()); 

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
    // $ANTLR end "rule__BooleanFactor__Group__1__Impl"


    // $ANTLR start "rule__BooleanPredicate__Group_2__0"
    // InternalQueryParser.g:3309:1: rule__BooleanPredicate__Group_2__0 : rule__BooleanPredicate__Group_2__0__Impl rule__BooleanPredicate__Group_2__1 ;
    public final void rule__BooleanPredicate__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3313:1: ( rule__BooleanPredicate__Group_2__0__Impl rule__BooleanPredicate__Group_2__1 )
            // InternalQueryParser.g:3314:2: rule__BooleanPredicate__Group_2__0__Impl rule__BooleanPredicate__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__BooleanPredicate__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanPredicate__Group_2__1();

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
    // $ANTLR end "rule__BooleanPredicate__Group_2__0"


    // $ANTLR start "rule__BooleanPredicate__Group_2__0__Impl"
    // InternalQueryParser.g:3321:1: rule__BooleanPredicate__Group_2__0__Impl : ( RULE_LEFT_PAREN ) ;
    public final void rule__BooleanPredicate__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3325:1: ( ( RULE_LEFT_PAREN ) )
            // InternalQueryParser.g:3326:1: ( RULE_LEFT_PAREN )
            {
            // InternalQueryParser.g:3326:1: ( RULE_LEFT_PAREN )
            // InternalQueryParser.g:3327:2: RULE_LEFT_PAREN
            {
             before(grammarAccess.getBooleanPredicateAccess().getLEFT_PARENTerminalRuleCall_2_0()); 
            match(input,RULE_LEFT_PAREN,FOLLOW_2); 
             after(grammarAccess.getBooleanPredicateAccess().getLEFT_PARENTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__BooleanPredicate__Group_2__0__Impl"


    // $ANTLR start "rule__BooleanPredicate__Group_2__1"
    // InternalQueryParser.g:3336:1: rule__BooleanPredicate__Group_2__1 : rule__BooleanPredicate__Group_2__1__Impl rule__BooleanPredicate__Group_2__2 ;
    public final void rule__BooleanPredicate__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3340:1: ( rule__BooleanPredicate__Group_2__1__Impl rule__BooleanPredicate__Group_2__2 )
            // InternalQueryParser.g:3341:2: rule__BooleanPredicate__Group_2__1__Impl rule__BooleanPredicate__Group_2__2
            {
            pushFollow(FOLLOW_24);
            rule__BooleanPredicate__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanPredicate__Group_2__2();

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
    // $ANTLR end "rule__BooleanPredicate__Group_2__1"


    // $ANTLR start "rule__BooleanPredicate__Group_2__1__Impl"
    // InternalQueryParser.g:3348:1: rule__BooleanPredicate__Group_2__1__Impl : ( ruleBooleanExpression ) ;
    public final void rule__BooleanPredicate__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3352:1: ( ( ruleBooleanExpression ) )
            // InternalQueryParser.g:3353:1: ( ruleBooleanExpression )
            {
            // InternalQueryParser.g:3353:1: ( ruleBooleanExpression )
            // InternalQueryParser.g:3354:2: ruleBooleanExpression
            {
             before(grammarAccess.getBooleanPredicateAccess().getBooleanExpressionParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleBooleanExpression();

            state._fsp--;

             after(grammarAccess.getBooleanPredicateAccess().getBooleanExpressionParserRuleCall_2_1()); 

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
    // $ANTLR end "rule__BooleanPredicate__Group_2__1__Impl"


    // $ANTLR start "rule__BooleanPredicate__Group_2__2"
    // InternalQueryParser.g:3363:1: rule__BooleanPredicate__Group_2__2 : rule__BooleanPredicate__Group_2__2__Impl ;
    public final void rule__BooleanPredicate__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3367:1: ( rule__BooleanPredicate__Group_2__2__Impl )
            // InternalQueryParser.g:3368:2: rule__BooleanPredicate__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanPredicate__Group_2__2__Impl();

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
    // $ANTLR end "rule__BooleanPredicate__Group_2__2"


    // $ANTLR start "rule__BooleanPredicate__Group_2__2__Impl"
    // InternalQueryParser.g:3374:1: rule__BooleanPredicate__Group_2__2__Impl : ( RULE_RIGHT_PAREN ) ;
    public final void rule__BooleanPredicate__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3378:1: ( ( RULE_RIGHT_PAREN ) )
            // InternalQueryParser.g:3379:1: ( RULE_RIGHT_PAREN )
            {
            // InternalQueryParser.g:3379:1: ( RULE_RIGHT_PAREN )
            // InternalQueryParser.g:3380:2: RULE_RIGHT_PAREN
            {
             before(grammarAccess.getBooleanPredicateAccess().getRIGHT_PARENTerminalRuleCall_2_2()); 
            match(input,RULE_RIGHT_PAREN,FOLLOW_2); 
             after(grammarAccess.getBooleanPredicateAccess().getRIGHT_PARENTerminalRuleCall_2_2()); 

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
    // $ANTLR end "rule__BooleanPredicate__Group_2__2__Impl"


    // $ANTLR start "rule__ScalarComparePredicate__Group__0"
    // InternalQueryParser.g:3390:1: rule__ScalarComparePredicate__Group__0 : rule__ScalarComparePredicate__Group__0__Impl rule__ScalarComparePredicate__Group__1 ;
    public final void rule__ScalarComparePredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3394:1: ( rule__ScalarComparePredicate__Group__0__Impl rule__ScalarComparePredicate__Group__1 )
            // InternalQueryParser.g:3395:2: rule__ScalarComparePredicate__Group__0__Impl rule__ScalarComparePredicate__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ScalarComparePredicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScalarComparePredicate__Group__1();

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
    // $ANTLR end "rule__ScalarComparePredicate__Group__0"


    // $ANTLR start "rule__ScalarComparePredicate__Group__0__Impl"
    // InternalQueryParser.g:3402:1: rule__ScalarComparePredicate__Group__0__Impl : ( ( rule__ScalarComparePredicate__LeftAssignment_0 ) ) ;
    public final void rule__ScalarComparePredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3406:1: ( ( ( rule__ScalarComparePredicate__LeftAssignment_0 ) ) )
            // InternalQueryParser.g:3407:1: ( ( rule__ScalarComparePredicate__LeftAssignment_0 ) )
            {
            // InternalQueryParser.g:3407:1: ( ( rule__ScalarComparePredicate__LeftAssignment_0 ) )
            // InternalQueryParser.g:3408:2: ( rule__ScalarComparePredicate__LeftAssignment_0 )
            {
             before(grammarAccess.getScalarComparePredicateAccess().getLeftAssignment_0()); 
            // InternalQueryParser.g:3409:2: ( rule__ScalarComparePredicate__LeftAssignment_0 )
            // InternalQueryParser.g:3409:3: rule__ScalarComparePredicate__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ScalarComparePredicate__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getScalarComparePredicateAccess().getLeftAssignment_0()); 

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
    // $ANTLR end "rule__ScalarComparePredicate__Group__0__Impl"


    // $ANTLR start "rule__ScalarComparePredicate__Group__1"
    // InternalQueryParser.g:3417:1: rule__ScalarComparePredicate__Group__1 : rule__ScalarComparePredicate__Group__1__Impl rule__ScalarComparePredicate__Group__2 ;
    public final void rule__ScalarComparePredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3421:1: ( rule__ScalarComparePredicate__Group__1__Impl rule__ScalarComparePredicate__Group__2 )
            // InternalQueryParser.g:3422:2: rule__ScalarComparePredicate__Group__1__Impl rule__ScalarComparePredicate__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__ScalarComparePredicate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScalarComparePredicate__Group__2();

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
    // $ANTLR end "rule__ScalarComparePredicate__Group__1"


    // $ANTLR start "rule__ScalarComparePredicate__Group__1__Impl"
    // InternalQueryParser.g:3429:1: rule__ScalarComparePredicate__Group__1__Impl : ( ( rule__ScalarComparePredicate__OpAssignment_1 ) ) ;
    public final void rule__ScalarComparePredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3433:1: ( ( ( rule__ScalarComparePredicate__OpAssignment_1 ) ) )
            // InternalQueryParser.g:3434:1: ( ( rule__ScalarComparePredicate__OpAssignment_1 ) )
            {
            // InternalQueryParser.g:3434:1: ( ( rule__ScalarComparePredicate__OpAssignment_1 ) )
            // InternalQueryParser.g:3435:2: ( rule__ScalarComparePredicate__OpAssignment_1 )
            {
             before(grammarAccess.getScalarComparePredicateAccess().getOpAssignment_1()); 
            // InternalQueryParser.g:3436:2: ( rule__ScalarComparePredicate__OpAssignment_1 )
            // InternalQueryParser.g:3436:3: rule__ScalarComparePredicate__OpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ScalarComparePredicate__OpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScalarComparePredicateAccess().getOpAssignment_1()); 

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
    // $ANTLR end "rule__ScalarComparePredicate__Group__1__Impl"


    // $ANTLR start "rule__ScalarComparePredicate__Group__2"
    // InternalQueryParser.g:3444:1: rule__ScalarComparePredicate__Group__2 : rule__ScalarComparePredicate__Group__2__Impl ;
    public final void rule__ScalarComparePredicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3448:1: ( rule__ScalarComparePredicate__Group__2__Impl )
            // InternalQueryParser.g:3449:2: rule__ScalarComparePredicate__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScalarComparePredicate__Group__2__Impl();

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
    // $ANTLR end "rule__ScalarComparePredicate__Group__2"


    // $ANTLR start "rule__ScalarComparePredicate__Group__2__Impl"
    // InternalQueryParser.g:3455:1: rule__ScalarComparePredicate__Group__2__Impl : ( ( rule__ScalarComparePredicate__RightAssignment_2 ) ) ;
    public final void rule__ScalarComparePredicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3459:1: ( ( ( rule__ScalarComparePredicate__RightAssignment_2 ) ) )
            // InternalQueryParser.g:3460:1: ( ( rule__ScalarComparePredicate__RightAssignment_2 ) )
            {
            // InternalQueryParser.g:3460:1: ( ( rule__ScalarComparePredicate__RightAssignment_2 ) )
            // InternalQueryParser.g:3461:2: ( rule__ScalarComparePredicate__RightAssignment_2 )
            {
             before(grammarAccess.getScalarComparePredicateAccess().getRightAssignment_2()); 
            // InternalQueryParser.g:3462:2: ( rule__ScalarComparePredicate__RightAssignment_2 )
            // InternalQueryParser.g:3462:3: rule__ScalarComparePredicate__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ScalarComparePredicate__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScalarComparePredicateAccess().getRightAssignment_2()); 

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
    // $ANTLR end "rule__ScalarComparePredicate__Group__2__Impl"


    // $ANTLR start "rule__CharacteristicBasisSet__Group__0"
    // InternalQueryParser.g:3471:1: rule__CharacteristicBasisSet__Group__0 : rule__CharacteristicBasisSet__Group__0__Impl rule__CharacteristicBasisSet__Group__1 ;
    public final void rule__CharacteristicBasisSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3475:1: ( rule__CharacteristicBasisSet__Group__0__Impl rule__CharacteristicBasisSet__Group__1 )
            // InternalQueryParser.g:3476:2: rule__CharacteristicBasisSet__Group__0__Impl rule__CharacteristicBasisSet__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__CharacteristicBasisSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicBasisSet__Group__1();

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
    // $ANTLR end "rule__CharacteristicBasisSet__Group__0"


    // $ANTLR start "rule__CharacteristicBasisSet__Group__0__Impl"
    // InternalQueryParser.g:3483:1: rule__CharacteristicBasisSet__Group__0__Impl : ( RULE_LEFT_PAREN ) ;
    public final void rule__CharacteristicBasisSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3487:1: ( ( RULE_LEFT_PAREN ) )
            // InternalQueryParser.g:3488:1: ( RULE_LEFT_PAREN )
            {
            // InternalQueryParser.g:3488:1: ( RULE_LEFT_PAREN )
            // InternalQueryParser.g:3489:2: RULE_LEFT_PAREN
            {
             before(grammarAccess.getCharacteristicBasisSetAccess().getLEFT_PARENTerminalRuleCall_0()); 
            match(input,RULE_LEFT_PAREN,FOLLOW_2); 
             after(grammarAccess.getCharacteristicBasisSetAccess().getLEFT_PARENTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__CharacteristicBasisSet__Group__0__Impl"


    // $ANTLR start "rule__CharacteristicBasisSet__Group__1"
    // InternalQueryParser.g:3498:1: rule__CharacteristicBasisSet__Group__1 : rule__CharacteristicBasisSet__Group__1__Impl rule__CharacteristicBasisSet__Group__2 ;
    public final void rule__CharacteristicBasisSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3502:1: ( rule__CharacteristicBasisSet__Group__1__Impl rule__CharacteristicBasisSet__Group__2 )
            // InternalQueryParser.g:3503:2: rule__CharacteristicBasisSet__Group__1__Impl rule__CharacteristicBasisSet__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__CharacteristicBasisSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicBasisSet__Group__2();

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
    // $ANTLR end "rule__CharacteristicBasisSet__Group__1"


    // $ANTLR start "rule__CharacteristicBasisSet__Group__1__Impl"
    // InternalQueryParser.g:3510:1: rule__CharacteristicBasisSet__Group__1__Impl : ( ( rule__CharacteristicBasisSet__CharacteristicBasisAssignment_1 ) ) ;
    public final void rule__CharacteristicBasisSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3514:1: ( ( ( rule__CharacteristicBasisSet__CharacteristicBasisAssignment_1 ) ) )
            // InternalQueryParser.g:3515:1: ( ( rule__CharacteristicBasisSet__CharacteristicBasisAssignment_1 ) )
            {
            // InternalQueryParser.g:3515:1: ( ( rule__CharacteristicBasisSet__CharacteristicBasisAssignment_1 ) )
            // InternalQueryParser.g:3516:2: ( rule__CharacteristicBasisSet__CharacteristicBasisAssignment_1 )
            {
             before(grammarAccess.getCharacteristicBasisSetAccess().getCharacteristicBasisAssignment_1()); 
            // InternalQueryParser.g:3517:2: ( rule__CharacteristicBasisSet__CharacteristicBasisAssignment_1 )
            // InternalQueryParser.g:3517:3: rule__CharacteristicBasisSet__CharacteristicBasisAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicBasisSet__CharacteristicBasisAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicBasisSetAccess().getCharacteristicBasisAssignment_1()); 

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
    // $ANTLR end "rule__CharacteristicBasisSet__Group__1__Impl"


    // $ANTLR start "rule__CharacteristicBasisSet__Group__2"
    // InternalQueryParser.g:3525:1: rule__CharacteristicBasisSet__Group__2 : rule__CharacteristicBasisSet__Group__2__Impl rule__CharacteristicBasisSet__Group__3 ;
    public final void rule__CharacteristicBasisSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3529:1: ( rule__CharacteristicBasisSet__Group__2__Impl rule__CharacteristicBasisSet__Group__3 )
            // InternalQueryParser.g:3530:2: rule__CharacteristicBasisSet__Group__2__Impl rule__CharacteristicBasisSet__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__CharacteristicBasisSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicBasisSet__Group__3();

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
    // $ANTLR end "rule__CharacteristicBasisSet__Group__2"


    // $ANTLR start "rule__CharacteristicBasisSet__Group__2__Impl"
    // InternalQueryParser.g:3537:1: rule__CharacteristicBasisSet__Group__2__Impl : ( ( rule__CharacteristicBasisSet__Group_2__0 )* ) ;
    public final void rule__CharacteristicBasisSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3541:1: ( ( ( rule__CharacteristicBasisSet__Group_2__0 )* ) )
            // InternalQueryParser.g:3542:1: ( ( rule__CharacteristicBasisSet__Group_2__0 )* )
            {
            // InternalQueryParser.g:3542:1: ( ( rule__CharacteristicBasisSet__Group_2__0 )* )
            // InternalQueryParser.g:3543:2: ( rule__CharacteristicBasisSet__Group_2__0 )*
            {
             before(grammarAccess.getCharacteristicBasisSetAccess().getGroup_2()); 
            // InternalQueryParser.g:3544:2: ( rule__CharacteristicBasisSet__Group_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_COMMA) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalQueryParser.g:3544:3: rule__CharacteristicBasisSet__Group_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__CharacteristicBasisSet__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getCharacteristicBasisSetAccess().getGroup_2()); 

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
    // $ANTLR end "rule__CharacteristicBasisSet__Group__2__Impl"


    // $ANTLR start "rule__CharacteristicBasisSet__Group__3"
    // InternalQueryParser.g:3552:1: rule__CharacteristicBasisSet__Group__3 : rule__CharacteristicBasisSet__Group__3__Impl ;
    public final void rule__CharacteristicBasisSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3556:1: ( rule__CharacteristicBasisSet__Group__3__Impl )
            // InternalQueryParser.g:3557:2: rule__CharacteristicBasisSet__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicBasisSet__Group__3__Impl();

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
    // $ANTLR end "rule__CharacteristicBasisSet__Group__3"


    // $ANTLR start "rule__CharacteristicBasisSet__Group__3__Impl"
    // InternalQueryParser.g:3563:1: rule__CharacteristicBasisSet__Group__3__Impl : ( RULE_RIGHT_PAREN ) ;
    public final void rule__CharacteristicBasisSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3567:1: ( ( RULE_RIGHT_PAREN ) )
            // InternalQueryParser.g:3568:1: ( RULE_RIGHT_PAREN )
            {
            // InternalQueryParser.g:3568:1: ( RULE_RIGHT_PAREN )
            // InternalQueryParser.g:3569:2: RULE_RIGHT_PAREN
            {
             before(grammarAccess.getCharacteristicBasisSetAccess().getRIGHT_PARENTerminalRuleCall_3()); 
            match(input,RULE_RIGHT_PAREN,FOLLOW_2); 
             after(grammarAccess.getCharacteristicBasisSetAccess().getRIGHT_PARENTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__CharacteristicBasisSet__Group__3__Impl"


    // $ANTLR start "rule__CharacteristicBasisSet__Group_2__0"
    // InternalQueryParser.g:3579:1: rule__CharacteristicBasisSet__Group_2__0 : rule__CharacteristicBasisSet__Group_2__0__Impl rule__CharacteristicBasisSet__Group_2__1 ;
    public final void rule__CharacteristicBasisSet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3583:1: ( rule__CharacteristicBasisSet__Group_2__0__Impl rule__CharacteristicBasisSet__Group_2__1 )
            // InternalQueryParser.g:3584:2: rule__CharacteristicBasisSet__Group_2__0__Impl rule__CharacteristicBasisSet__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__CharacteristicBasisSet__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicBasisSet__Group_2__1();

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
    // $ANTLR end "rule__CharacteristicBasisSet__Group_2__0"


    // $ANTLR start "rule__CharacteristicBasisSet__Group_2__0__Impl"
    // InternalQueryParser.g:3591:1: rule__CharacteristicBasisSet__Group_2__0__Impl : ( RULE_COMMA ) ;
    public final void rule__CharacteristicBasisSet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3595:1: ( ( RULE_COMMA ) )
            // InternalQueryParser.g:3596:1: ( RULE_COMMA )
            {
            // InternalQueryParser.g:3596:1: ( RULE_COMMA )
            // InternalQueryParser.g:3597:2: RULE_COMMA
            {
             before(grammarAccess.getCharacteristicBasisSetAccess().getCOMMATerminalRuleCall_2_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getCharacteristicBasisSetAccess().getCOMMATerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__CharacteristicBasisSet__Group_2__0__Impl"


    // $ANTLR start "rule__CharacteristicBasisSet__Group_2__1"
    // InternalQueryParser.g:3606:1: rule__CharacteristicBasisSet__Group_2__1 : rule__CharacteristicBasisSet__Group_2__1__Impl ;
    public final void rule__CharacteristicBasisSet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3610:1: ( rule__CharacteristicBasisSet__Group_2__1__Impl )
            // InternalQueryParser.g:3611:2: rule__CharacteristicBasisSet__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicBasisSet__Group_2__1__Impl();

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
    // $ANTLR end "rule__CharacteristicBasisSet__Group_2__1"


    // $ANTLR start "rule__CharacteristicBasisSet__Group_2__1__Impl"
    // InternalQueryParser.g:3617:1: rule__CharacteristicBasisSet__Group_2__1__Impl : ( ( rule__CharacteristicBasisSet__CharacteristicBasisAssignment_2_1 ) ) ;
    public final void rule__CharacteristicBasisSet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3621:1: ( ( ( rule__CharacteristicBasisSet__CharacteristicBasisAssignment_2_1 ) ) )
            // InternalQueryParser.g:3622:1: ( ( rule__CharacteristicBasisSet__CharacteristicBasisAssignment_2_1 ) )
            {
            // InternalQueryParser.g:3622:1: ( ( rule__CharacteristicBasisSet__CharacteristicBasisAssignment_2_1 ) )
            // InternalQueryParser.g:3623:2: ( rule__CharacteristicBasisSet__CharacteristicBasisAssignment_2_1 )
            {
             before(grammarAccess.getCharacteristicBasisSetAccess().getCharacteristicBasisAssignment_2_1()); 
            // InternalQueryParser.g:3624:2: ( rule__CharacteristicBasisSet__CharacteristicBasisAssignment_2_1 )
            // InternalQueryParser.g:3624:3: rule__CharacteristicBasisSet__CharacteristicBasisAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicBasisSet__CharacteristicBasisAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicBasisSetAccess().getCharacteristicBasisAssignment_2_1()); 

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
    // $ANTLR end "rule__CharacteristicBasisSet__Group_2__1__Impl"


    // $ANTLR start "rule__ExistsPredicate__Group__0"
    // InternalQueryParser.g:3633:1: rule__ExistsPredicate__Group__0 : rule__ExistsPredicate__Group__0__Impl rule__ExistsPredicate__Group__1 ;
    public final void rule__ExistsPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3637:1: ( rule__ExistsPredicate__Group__0__Impl rule__ExistsPredicate__Group__1 )
            // InternalQueryParser.g:3638:2: rule__ExistsPredicate__Group__0__Impl rule__ExistsPredicate__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__ExistsPredicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExistsPredicate__Group__1();

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
    // $ANTLR end "rule__ExistsPredicate__Group__0"


    // $ANTLR start "rule__ExistsPredicate__Group__0__Impl"
    // InternalQueryParser.g:3645:1: rule__ExistsPredicate__Group__0__Impl : ( RULE_KW_EXISTS ) ;
    public final void rule__ExistsPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3649:1: ( ( RULE_KW_EXISTS ) )
            // InternalQueryParser.g:3650:1: ( RULE_KW_EXISTS )
            {
            // InternalQueryParser.g:3650:1: ( RULE_KW_EXISTS )
            // InternalQueryParser.g:3651:2: RULE_KW_EXISTS
            {
             before(grammarAccess.getExistsPredicateAccess().getKW_EXISTSTerminalRuleCall_0()); 
            match(input,RULE_KW_EXISTS,FOLLOW_2); 
             after(grammarAccess.getExistsPredicateAccess().getKW_EXISTSTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__ExistsPredicate__Group__0__Impl"


    // $ANTLR start "rule__ExistsPredicate__Group__1"
    // InternalQueryParser.g:3660:1: rule__ExistsPredicate__Group__1 : rule__ExistsPredicate__Group__1__Impl ;
    public final void rule__ExistsPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3664:1: ( rule__ExistsPredicate__Group__1__Impl )
            // InternalQueryParser.g:3665:2: rule__ExistsPredicate__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExistsPredicate__Group__1__Impl();

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
    // $ANTLR end "rule__ExistsPredicate__Group__1"


    // $ANTLR start "rule__ExistsPredicate__Group__1__Impl"
    // InternalQueryParser.g:3671:1: rule__ExistsPredicate__Group__1__Impl : ( ( rule__ExistsPredicate__SubAssignment_1 ) ) ;
    public final void rule__ExistsPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3675:1: ( ( ( rule__ExistsPredicate__SubAssignment_1 ) ) )
            // InternalQueryParser.g:3676:1: ( ( rule__ExistsPredicate__SubAssignment_1 ) )
            {
            // InternalQueryParser.g:3676:1: ( ( rule__ExistsPredicate__SubAssignment_1 ) )
            // InternalQueryParser.g:3677:2: ( rule__ExistsPredicate__SubAssignment_1 )
            {
             before(grammarAccess.getExistsPredicateAccess().getSubAssignment_1()); 
            // InternalQueryParser.g:3678:2: ( rule__ExistsPredicate__SubAssignment_1 )
            // InternalQueryParser.g:3678:3: rule__ExistsPredicate__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExistsPredicate__SubAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExistsPredicateAccess().getSubAssignment_1()); 

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
    // $ANTLR end "rule__ExistsPredicate__Group__1__Impl"


    // $ANTLR start "rule__Subquery__Group__0"
    // InternalQueryParser.g:3687:1: rule__Subquery__Group__0 : rule__Subquery__Group__0__Impl rule__Subquery__Group__1 ;
    public final void rule__Subquery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3691:1: ( rule__Subquery__Group__0__Impl rule__Subquery__Group__1 )
            // InternalQueryParser.g:3692:2: rule__Subquery__Group__0__Impl rule__Subquery__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Subquery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subquery__Group__1();

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
    // $ANTLR end "rule__Subquery__Group__0"


    // $ANTLR start "rule__Subquery__Group__0__Impl"
    // InternalQueryParser.g:3699:1: rule__Subquery__Group__0__Impl : ( RULE_LEFT_PAREN ) ;
    public final void rule__Subquery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3703:1: ( ( RULE_LEFT_PAREN ) )
            // InternalQueryParser.g:3704:1: ( RULE_LEFT_PAREN )
            {
            // InternalQueryParser.g:3704:1: ( RULE_LEFT_PAREN )
            // InternalQueryParser.g:3705:2: RULE_LEFT_PAREN
            {
             before(grammarAccess.getSubqueryAccess().getLEFT_PARENTerminalRuleCall_0()); 
            match(input,RULE_LEFT_PAREN,FOLLOW_2); 
             after(grammarAccess.getSubqueryAccess().getLEFT_PARENTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Subquery__Group__0__Impl"


    // $ANTLR start "rule__Subquery__Group__1"
    // InternalQueryParser.g:3714:1: rule__Subquery__Group__1 : rule__Subquery__Group__1__Impl rule__Subquery__Group__2 ;
    public final void rule__Subquery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3718:1: ( rule__Subquery__Group__1__Impl rule__Subquery__Group__2 )
            // InternalQueryParser.g:3719:2: rule__Subquery__Group__1__Impl rule__Subquery__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Subquery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subquery__Group__2();

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
    // $ANTLR end "rule__Subquery__Group__1"


    // $ANTLR start "rule__Subquery__Group__1__Impl"
    // InternalQueryParser.g:3726:1: rule__Subquery__Group__1__Impl : ( ( rule__Subquery__QueryAssignment_1 ) ) ;
    public final void rule__Subquery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3730:1: ( ( ( rule__Subquery__QueryAssignment_1 ) ) )
            // InternalQueryParser.g:3731:1: ( ( rule__Subquery__QueryAssignment_1 ) )
            {
            // InternalQueryParser.g:3731:1: ( ( rule__Subquery__QueryAssignment_1 ) )
            // InternalQueryParser.g:3732:2: ( rule__Subquery__QueryAssignment_1 )
            {
             before(grammarAccess.getSubqueryAccess().getQueryAssignment_1()); 
            // InternalQueryParser.g:3733:2: ( rule__Subquery__QueryAssignment_1 )
            // InternalQueryParser.g:3733:3: rule__Subquery__QueryAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Subquery__QueryAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubqueryAccess().getQueryAssignment_1()); 

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
    // $ANTLR end "rule__Subquery__Group__1__Impl"


    // $ANTLR start "rule__Subquery__Group__2"
    // InternalQueryParser.g:3741:1: rule__Subquery__Group__2 : rule__Subquery__Group__2__Impl ;
    public final void rule__Subquery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3745:1: ( rule__Subquery__Group__2__Impl )
            // InternalQueryParser.g:3746:2: rule__Subquery__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subquery__Group__2__Impl();

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
    // $ANTLR end "rule__Subquery__Group__2"


    // $ANTLR start "rule__Subquery__Group__2__Impl"
    // InternalQueryParser.g:3752:1: rule__Subquery__Group__2__Impl : ( RULE_RIGHT_PAREN ) ;
    public final void rule__Subquery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3756:1: ( ( RULE_RIGHT_PAREN ) )
            // InternalQueryParser.g:3757:1: ( RULE_RIGHT_PAREN )
            {
            // InternalQueryParser.g:3757:1: ( RULE_RIGHT_PAREN )
            // InternalQueryParser.g:3758:2: RULE_RIGHT_PAREN
            {
             before(grammarAccess.getSubqueryAccess().getRIGHT_PARENTerminalRuleCall_2()); 
            match(input,RULE_RIGHT_PAREN,FOLLOW_2); 
             after(grammarAccess.getSubqueryAccess().getRIGHT_PARENTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Subquery__Group__2__Impl"


    // $ANTLR start "rule__EnumLiteralSet__Group__0"
    // InternalQueryParser.g:3768:1: rule__EnumLiteralSet__Group__0 : rule__EnumLiteralSet__Group__0__Impl rule__EnumLiteralSet__Group__1 ;
    public final void rule__EnumLiteralSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3772:1: ( rule__EnumLiteralSet__Group__0__Impl rule__EnumLiteralSet__Group__1 )
            // InternalQueryParser.g:3773:2: rule__EnumLiteralSet__Group__0__Impl rule__EnumLiteralSet__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__EnumLiteralSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumLiteralSet__Group__1();

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
    // $ANTLR end "rule__EnumLiteralSet__Group__0"


    // $ANTLR start "rule__EnumLiteralSet__Group__0__Impl"
    // InternalQueryParser.g:3780:1: rule__EnumLiteralSet__Group__0__Impl : ( RULE_LEFT_BRACE ) ;
    public final void rule__EnumLiteralSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3784:1: ( ( RULE_LEFT_BRACE ) )
            // InternalQueryParser.g:3785:1: ( RULE_LEFT_BRACE )
            {
            // InternalQueryParser.g:3785:1: ( RULE_LEFT_BRACE )
            // InternalQueryParser.g:3786:2: RULE_LEFT_BRACE
            {
             before(grammarAccess.getEnumLiteralSetAccess().getLEFT_BRACETerminalRuleCall_0()); 
            match(input,RULE_LEFT_BRACE,FOLLOW_2); 
             after(grammarAccess.getEnumLiteralSetAccess().getLEFT_BRACETerminalRuleCall_0()); 

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
    // $ANTLR end "rule__EnumLiteralSet__Group__0__Impl"


    // $ANTLR start "rule__EnumLiteralSet__Group__1"
    // InternalQueryParser.g:3795:1: rule__EnumLiteralSet__Group__1 : rule__EnumLiteralSet__Group__1__Impl rule__EnumLiteralSet__Group__2 ;
    public final void rule__EnumLiteralSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3799:1: ( rule__EnumLiteralSet__Group__1__Impl rule__EnumLiteralSet__Group__2 )
            // InternalQueryParser.g:3800:2: rule__EnumLiteralSet__Group__1__Impl rule__EnumLiteralSet__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__EnumLiteralSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumLiteralSet__Group__2();

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
    // $ANTLR end "rule__EnumLiteralSet__Group__1"


    // $ANTLR start "rule__EnumLiteralSet__Group__1__Impl"
    // InternalQueryParser.g:3807:1: rule__EnumLiteralSet__Group__1__Impl : ( ( rule__EnumLiteralSet__TypeAssignment_1 ) ) ;
    public final void rule__EnumLiteralSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3811:1: ( ( ( rule__EnumLiteralSet__TypeAssignment_1 ) ) )
            // InternalQueryParser.g:3812:1: ( ( rule__EnumLiteralSet__TypeAssignment_1 ) )
            {
            // InternalQueryParser.g:3812:1: ( ( rule__EnumLiteralSet__TypeAssignment_1 ) )
            // InternalQueryParser.g:3813:2: ( rule__EnumLiteralSet__TypeAssignment_1 )
            {
             before(grammarAccess.getEnumLiteralSetAccess().getTypeAssignment_1()); 
            // InternalQueryParser.g:3814:2: ( rule__EnumLiteralSet__TypeAssignment_1 )
            // InternalQueryParser.g:3814:3: rule__EnumLiteralSet__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteralSet__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralSetAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__EnumLiteralSet__Group__1__Impl"


    // $ANTLR start "rule__EnumLiteralSet__Group__2"
    // InternalQueryParser.g:3822:1: rule__EnumLiteralSet__Group__2 : rule__EnumLiteralSet__Group__2__Impl rule__EnumLiteralSet__Group__3 ;
    public final void rule__EnumLiteralSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3826:1: ( rule__EnumLiteralSet__Group__2__Impl rule__EnumLiteralSet__Group__3 )
            // InternalQueryParser.g:3827:2: rule__EnumLiteralSet__Group__2__Impl rule__EnumLiteralSet__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__EnumLiteralSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumLiteralSet__Group__3();

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
    // $ANTLR end "rule__EnumLiteralSet__Group__2"


    // $ANTLR start "rule__EnumLiteralSet__Group__2__Impl"
    // InternalQueryParser.g:3834:1: rule__EnumLiteralSet__Group__2__Impl : ( RULE_COLON ) ;
    public final void rule__EnumLiteralSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3838:1: ( ( RULE_COLON ) )
            // InternalQueryParser.g:3839:1: ( RULE_COLON )
            {
            // InternalQueryParser.g:3839:1: ( RULE_COLON )
            // InternalQueryParser.g:3840:2: RULE_COLON
            {
             before(grammarAccess.getEnumLiteralSetAccess().getCOLONTerminalRuleCall_2()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getEnumLiteralSetAccess().getCOLONTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__EnumLiteralSet__Group__2__Impl"


    // $ANTLR start "rule__EnumLiteralSet__Group__3"
    // InternalQueryParser.g:3849:1: rule__EnumLiteralSet__Group__3 : rule__EnumLiteralSet__Group__3__Impl rule__EnumLiteralSet__Group__4 ;
    public final void rule__EnumLiteralSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3853:1: ( rule__EnumLiteralSet__Group__3__Impl rule__EnumLiteralSet__Group__4 )
            // InternalQueryParser.g:3854:2: rule__EnumLiteralSet__Group__3__Impl rule__EnumLiteralSet__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__EnumLiteralSet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumLiteralSet__Group__4();

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
    // $ANTLR end "rule__EnumLiteralSet__Group__3"


    // $ANTLR start "rule__EnumLiteralSet__Group__3__Impl"
    // InternalQueryParser.g:3861:1: rule__EnumLiteralSet__Group__3__Impl : ( ( rule__EnumLiteralSet__LiteralAssignment_3 ) ) ;
    public final void rule__EnumLiteralSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3865:1: ( ( ( rule__EnumLiteralSet__LiteralAssignment_3 ) ) )
            // InternalQueryParser.g:3866:1: ( ( rule__EnumLiteralSet__LiteralAssignment_3 ) )
            {
            // InternalQueryParser.g:3866:1: ( ( rule__EnumLiteralSet__LiteralAssignment_3 ) )
            // InternalQueryParser.g:3867:2: ( rule__EnumLiteralSet__LiteralAssignment_3 )
            {
             before(grammarAccess.getEnumLiteralSetAccess().getLiteralAssignment_3()); 
            // InternalQueryParser.g:3868:2: ( rule__EnumLiteralSet__LiteralAssignment_3 )
            // InternalQueryParser.g:3868:3: rule__EnumLiteralSet__LiteralAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteralSet__LiteralAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralSetAccess().getLiteralAssignment_3()); 

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
    // $ANTLR end "rule__EnumLiteralSet__Group__3__Impl"


    // $ANTLR start "rule__EnumLiteralSet__Group__4"
    // InternalQueryParser.g:3876:1: rule__EnumLiteralSet__Group__4 : rule__EnumLiteralSet__Group__4__Impl rule__EnumLiteralSet__Group__5 ;
    public final void rule__EnumLiteralSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3880:1: ( rule__EnumLiteralSet__Group__4__Impl rule__EnumLiteralSet__Group__5 )
            // InternalQueryParser.g:3881:2: rule__EnumLiteralSet__Group__4__Impl rule__EnumLiteralSet__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__EnumLiteralSet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumLiteralSet__Group__5();

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
    // $ANTLR end "rule__EnumLiteralSet__Group__4"


    // $ANTLR start "rule__EnumLiteralSet__Group__4__Impl"
    // InternalQueryParser.g:3888:1: rule__EnumLiteralSet__Group__4__Impl : ( ( rule__EnumLiteralSet__Group_4__0 )* ) ;
    public final void rule__EnumLiteralSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3892:1: ( ( ( rule__EnumLiteralSet__Group_4__0 )* ) )
            // InternalQueryParser.g:3893:1: ( ( rule__EnumLiteralSet__Group_4__0 )* )
            {
            // InternalQueryParser.g:3893:1: ( ( rule__EnumLiteralSet__Group_4__0 )* )
            // InternalQueryParser.g:3894:2: ( rule__EnumLiteralSet__Group_4__0 )*
            {
             before(grammarAccess.getEnumLiteralSetAccess().getGroup_4()); 
            // InternalQueryParser.g:3895:2: ( rule__EnumLiteralSet__Group_4__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_COMMA) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalQueryParser.g:3895:3: rule__EnumLiteralSet__Group_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__EnumLiteralSet__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getEnumLiteralSetAccess().getGroup_4()); 

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
    // $ANTLR end "rule__EnumLiteralSet__Group__4__Impl"


    // $ANTLR start "rule__EnumLiteralSet__Group__5"
    // InternalQueryParser.g:3903:1: rule__EnumLiteralSet__Group__5 : rule__EnumLiteralSet__Group__5__Impl ;
    public final void rule__EnumLiteralSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3907:1: ( rule__EnumLiteralSet__Group__5__Impl )
            // InternalQueryParser.g:3908:2: rule__EnumLiteralSet__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteralSet__Group__5__Impl();

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
    // $ANTLR end "rule__EnumLiteralSet__Group__5"


    // $ANTLR start "rule__EnumLiteralSet__Group__5__Impl"
    // InternalQueryParser.g:3914:1: rule__EnumLiteralSet__Group__5__Impl : ( RULE_RIGHT_BRACE ) ;
    public final void rule__EnumLiteralSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3918:1: ( ( RULE_RIGHT_BRACE ) )
            // InternalQueryParser.g:3919:1: ( RULE_RIGHT_BRACE )
            {
            // InternalQueryParser.g:3919:1: ( RULE_RIGHT_BRACE )
            // InternalQueryParser.g:3920:2: RULE_RIGHT_BRACE
            {
             before(grammarAccess.getEnumLiteralSetAccess().getRIGHT_BRACETerminalRuleCall_5()); 
            match(input,RULE_RIGHT_BRACE,FOLLOW_2); 
             after(grammarAccess.getEnumLiteralSetAccess().getRIGHT_BRACETerminalRuleCall_5()); 

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
    // $ANTLR end "rule__EnumLiteralSet__Group__5__Impl"


    // $ANTLR start "rule__EnumLiteralSet__Group_4__0"
    // InternalQueryParser.g:3930:1: rule__EnumLiteralSet__Group_4__0 : rule__EnumLiteralSet__Group_4__0__Impl rule__EnumLiteralSet__Group_4__1 ;
    public final void rule__EnumLiteralSet__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3934:1: ( rule__EnumLiteralSet__Group_4__0__Impl rule__EnumLiteralSet__Group_4__1 )
            // InternalQueryParser.g:3935:2: rule__EnumLiteralSet__Group_4__0__Impl rule__EnumLiteralSet__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__EnumLiteralSet__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumLiteralSet__Group_4__1();

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
    // $ANTLR end "rule__EnumLiteralSet__Group_4__0"


    // $ANTLR start "rule__EnumLiteralSet__Group_4__0__Impl"
    // InternalQueryParser.g:3942:1: rule__EnumLiteralSet__Group_4__0__Impl : ( RULE_COMMA ) ;
    public final void rule__EnumLiteralSet__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3946:1: ( ( RULE_COMMA ) )
            // InternalQueryParser.g:3947:1: ( RULE_COMMA )
            {
            // InternalQueryParser.g:3947:1: ( RULE_COMMA )
            // InternalQueryParser.g:3948:2: RULE_COMMA
            {
             before(grammarAccess.getEnumLiteralSetAccess().getCOMMATerminalRuleCall_4_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getEnumLiteralSetAccess().getCOMMATerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__EnumLiteralSet__Group_4__0__Impl"


    // $ANTLR start "rule__EnumLiteralSet__Group_4__1"
    // InternalQueryParser.g:3957:1: rule__EnumLiteralSet__Group_4__1 : rule__EnumLiteralSet__Group_4__1__Impl ;
    public final void rule__EnumLiteralSet__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3961:1: ( rule__EnumLiteralSet__Group_4__1__Impl )
            // InternalQueryParser.g:3962:2: rule__EnumLiteralSet__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteralSet__Group_4__1__Impl();

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
    // $ANTLR end "rule__EnumLiteralSet__Group_4__1"


    // $ANTLR start "rule__EnumLiteralSet__Group_4__1__Impl"
    // InternalQueryParser.g:3968:1: rule__EnumLiteralSet__Group_4__1__Impl : ( ( rule__EnumLiteralSet__LiteralAssignment_4_1 ) ) ;
    public final void rule__EnumLiteralSet__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3972:1: ( ( ( rule__EnumLiteralSet__LiteralAssignment_4_1 ) ) )
            // InternalQueryParser.g:3973:1: ( ( rule__EnumLiteralSet__LiteralAssignment_4_1 ) )
            {
            // InternalQueryParser.g:3973:1: ( ( rule__EnumLiteralSet__LiteralAssignment_4_1 ) )
            // InternalQueryParser.g:3974:2: ( rule__EnumLiteralSet__LiteralAssignment_4_1 )
            {
             before(grammarAccess.getEnumLiteralSetAccess().getLiteralAssignment_4_1()); 
            // InternalQueryParser.g:3975:2: ( rule__EnumLiteralSet__LiteralAssignment_4_1 )
            // InternalQueryParser.g:3975:3: rule__EnumLiteralSet__LiteralAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteralSet__LiteralAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralSetAccess().getLiteralAssignment_4_1()); 

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
    // $ANTLR end "rule__EnumLiteralSet__Group_4__1__Impl"


    // $ANTLR start "rule__EnumLiteralReferenceExpression__Group__0"
    // InternalQueryParser.g:3984:1: rule__EnumLiteralReferenceExpression__Group__0 : rule__EnumLiteralReferenceExpression__Group__0__Impl rule__EnumLiteralReferenceExpression__Group__1 ;
    public final void rule__EnumLiteralReferenceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:3988:1: ( rule__EnumLiteralReferenceExpression__Group__0__Impl rule__EnumLiteralReferenceExpression__Group__1 )
            // InternalQueryParser.g:3989:2: rule__EnumLiteralReferenceExpression__Group__0__Impl rule__EnumLiteralReferenceExpression__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__EnumLiteralReferenceExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumLiteralReferenceExpression__Group__1();

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
    // $ANTLR end "rule__EnumLiteralReferenceExpression__Group__0"


    // $ANTLR start "rule__EnumLiteralReferenceExpression__Group__0__Impl"
    // InternalQueryParser.g:3996:1: rule__EnumLiteralReferenceExpression__Group__0__Impl : ( RULE_LEFT_BRACE ) ;
    public final void rule__EnumLiteralReferenceExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4000:1: ( ( RULE_LEFT_BRACE ) )
            // InternalQueryParser.g:4001:1: ( RULE_LEFT_BRACE )
            {
            // InternalQueryParser.g:4001:1: ( RULE_LEFT_BRACE )
            // InternalQueryParser.g:4002:2: RULE_LEFT_BRACE
            {
             before(grammarAccess.getEnumLiteralReferenceExpressionAccess().getLEFT_BRACETerminalRuleCall_0()); 
            match(input,RULE_LEFT_BRACE,FOLLOW_2); 
             after(grammarAccess.getEnumLiteralReferenceExpressionAccess().getLEFT_BRACETerminalRuleCall_0()); 

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
    // $ANTLR end "rule__EnumLiteralReferenceExpression__Group__0__Impl"


    // $ANTLR start "rule__EnumLiteralReferenceExpression__Group__1"
    // InternalQueryParser.g:4011:1: rule__EnumLiteralReferenceExpression__Group__1 : rule__EnumLiteralReferenceExpression__Group__1__Impl rule__EnumLiteralReferenceExpression__Group__2 ;
    public final void rule__EnumLiteralReferenceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4015:1: ( rule__EnumLiteralReferenceExpression__Group__1__Impl rule__EnumLiteralReferenceExpression__Group__2 )
            // InternalQueryParser.g:4016:2: rule__EnumLiteralReferenceExpression__Group__1__Impl rule__EnumLiteralReferenceExpression__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__EnumLiteralReferenceExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumLiteralReferenceExpression__Group__2();

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
    // $ANTLR end "rule__EnumLiteralReferenceExpression__Group__1"


    // $ANTLR start "rule__EnumLiteralReferenceExpression__Group__1__Impl"
    // InternalQueryParser.g:4023:1: rule__EnumLiteralReferenceExpression__Group__1__Impl : ( ( rule__EnumLiteralReferenceExpression__TypAssignment_1 ) ) ;
    public final void rule__EnumLiteralReferenceExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4027:1: ( ( ( rule__EnumLiteralReferenceExpression__TypAssignment_1 ) ) )
            // InternalQueryParser.g:4028:1: ( ( rule__EnumLiteralReferenceExpression__TypAssignment_1 ) )
            {
            // InternalQueryParser.g:4028:1: ( ( rule__EnumLiteralReferenceExpression__TypAssignment_1 ) )
            // InternalQueryParser.g:4029:2: ( rule__EnumLiteralReferenceExpression__TypAssignment_1 )
            {
             before(grammarAccess.getEnumLiteralReferenceExpressionAccess().getTypAssignment_1()); 
            // InternalQueryParser.g:4030:2: ( rule__EnumLiteralReferenceExpression__TypAssignment_1 )
            // InternalQueryParser.g:4030:3: rule__EnumLiteralReferenceExpression__TypAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteralReferenceExpression__TypAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralReferenceExpressionAccess().getTypAssignment_1()); 

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
    // $ANTLR end "rule__EnumLiteralReferenceExpression__Group__1__Impl"


    // $ANTLR start "rule__EnumLiteralReferenceExpression__Group__2"
    // InternalQueryParser.g:4038:1: rule__EnumLiteralReferenceExpression__Group__2 : rule__EnumLiteralReferenceExpression__Group__2__Impl rule__EnumLiteralReferenceExpression__Group__3 ;
    public final void rule__EnumLiteralReferenceExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4042:1: ( rule__EnumLiteralReferenceExpression__Group__2__Impl rule__EnumLiteralReferenceExpression__Group__3 )
            // InternalQueryParser.g:4043:2: rule__EnumLiteralReferenceExpression__Group__2__Impl rule__EnumLiteralReferenceExpression__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__EnumLiteralReferenceExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumLiteralReferenceExpression__Group__3();

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
    // $ANTLR end "rule__EnumLiteralReferenceExpression__Group__2"


    // $ANTLR start "rule__EnumLiteralReferenceExpression__Group__2__Impl"
    // InternalQueryParser.g:4050:1: rule__EnumLiteralReferenceExpression__Group__2__Impl : ( RULE_COLON ) ;
    public final void rule__EnumLiteralReferenceExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4054:1: ( ( RULE_COLON ) )
            // InternalQueryParser.g:4055:1: ( RULE_COLON )
            {
            // InternalQueryParser.g:4055:1: ( RULE_COLON )
            // InternalQueryParser.g:4056:2: RULE_COLON
            {
             before(grammarAccess.getEnumLiteralReferenceExpressionAccess().getCOLONTerminalRuleCall_2()); 
            match(input,RULE_COLON,FOLLOW_2); 
             after(grammarAccess.getEnumLiteralReferenceExpressionAccess().getCOLONTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__EnumLiteralReferenceExpression__Group__2__Impl"


    // $ANTLR start "rule__EnumLiteralReferenceExpression__Group__3"
    // InternalQueryParser.g:4065:1: rule__EnumLiteralReferenceExpression__Group__3 : rule__EnumLiteralReferenceExpression__Group__3__Impl rule__EnumLiteralReferenceExpression__Group__4 ;
    public final void rule__EnumLiteralReferenceExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4069:1: ( rule__EnumLiteralReferenceExpression__Group__3__Impl rule__EnumLiteralReferenceExpression__Group__4 )
            // InternalQueryParser.g:4070:2: rule__EnumLiteralReferenceExpression__Group__3__Impl rule__EnumLiteralReferenceExpression__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__EnumLiteralReferenceExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumLiteralReferenceExpression__Group__4();

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
    // $ANTLR end "rule__EnumLiteralReferenceExpression__Group__3"


    // $ANTLR start "rule__EnumLiteralReferenceExpression__Group__3__Impl"
    // InternalQueryParser.g:4077:1: rule__EnumLiteralReferenceExpression__Group__3__Impl : ( ( rule__EnumLiteralReferenceExpression__LiteralAssignment_3 ) ) ;
    public final void rule__EnumLiteralReferenceExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4081:1: ( ( ( rule__EnumLiteralReferenceExpression__LiteralAssignment_3 ) ) )
            // InternalQueryParser.g:4082:1: ( ( rule__EnumLiteralReferenceExpression__LiteralAssignment_3 ) )
            {
            // InternalQueryParser.g:4082:1: ( ( rule__EnumLiteralReferenceExpression__LiteralAssignment_3 ) )
            // InternalQueryParser.g:4083:2: ( rule__EnumLiteralReferenceExpression__LiteralAssignment_3 )
            {
             before(grammarAccess.getEnumLiteralReferenceExpressionAccess().getLiteralAssignment_3()); 
            // InternalQueryParser.g:4084:2: ( rule__EnumLiteralReferenceExpression__LiteralAssignment_3 )
            // InternalQueryParser.g:4084:3: rule__EnumLiteralReferenceExpression__LiteralAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteralReferenceExpression__LiteralAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralReferenceExpressionAccess().getLiteralAssignment_3()); 

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
    // $ANTLR end "rule__EnumLiteralReferenceExpression__Group__3__Impl"


    // $ANTLR start "rule__EnumLiteralReferenceExpression__Group__4"
    // InternalQueryParser.g:4092:1: rule__EnumLiteralReferenceExpression__Group__4 : rule__EnumLiteralReferenceExpression__Group__4__Impl ;
    public final void rule__EnumLiteralReferenceExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4096:1: ( rule__EnumLiteralReferenceExpression__Group__4__Impl )
            // InternalQueryParser.g:4097:2: rule__EnumLiteralReferenceExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteralReferenceExpression__Group__4__Impl();

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
    // $ANTLR end "rule__EnumLiteralReferenceExpression__Group__4"


    // $ANTLR start "rule__EnumLiteralReferenceExpression__Group__4__Impl"
    // InternalQueryParser.g:4103:1: rule__EnumLiteralReferenceExpression__Group__4__Impl : ( RULE_RIGHT_BRACE ) ;
    public final void rule__EnumLiteralReferenceExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4107:1: ( ( RULE_RIGHT_BRACE ) )
            // InternalQueryParser.g:4108:1: ( RULE_RIGHT_BRACE )
            {
            // InternalQueryParser.g:4108:1: ( RULE_RIGHT_BRACE )
            // InternalQueryParser.g:4109:2: RULE_RIGHT_BRACE
            {
             before(grammarAccess.getEnumLiteralReferenceExpressionAccess().getRIGHT_BRACETerminalRuleCall_4()); 
            match(input,RULE_RIGHT_BRACE,FOLLOW_2); 
             after(grammarAccess.getEnumLiteralReferenceExpressionAccess().getRIGHT_BRACETerminalRuleCall_4()); 

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
    // $ANTLR end "rule__EnumLiteralReferenceExpression__Group__4__Impl"


    // $ANTLR start "rule__QueryStatement__QualifierAssignment_1"
    // InternalQueryParser.g:4119:1: rule__QueryStatement__QualifierAssignment_1 : ( ruleSetQualifier ) ;
    public final void rule__QueryStatement__QualifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4123:1: ( ( ruleSetQualifier ) )
            // InternalQueryParser.g:4124:2: ( ruleSetQualifier )
            {
            // InternalQueryParser.g:4124:2: ( ruleSetQualifier )
            // InternalQueryParser.g:4125:3: ruleSetQualifier
            {
             before(grammarAccess.getQueryStatementAccess().getQualifierSetQualifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSetQualifier();

            state._fsp--;

             after(grammarAccess.getQueryStatementAccess().getQualifierSetQualifierParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__QueryStatement__QualifierAssignment_1"


    // $ANTLR start "rule__QueryStatement__ProjectedCharacteristicListAssignment_2"
    // InternalQueryParser.g:4134:1: rule__QueryStatement__ProjectedCharacteristicListAssignment_2 : ( ruleProjectedCharacteristicList ) ;
    public final void rule__QueryStatement__ProjectedCharacteristicListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4138:1: ( ( ruleProjectedCharacteristicList ) )
            // InternalQueryParser.g:4139:2: ( ruleProjectedCharacteristicList )
            {
            // InternalQueryParser.g:4139:2: ( ruleProjectedCharacteristicList )
            // InternalQueryParser.g:4140:3: ruleProjectedCharacteristicList
            {
             before(grammarAccess.getQueryStatementAccess().getProjectedCharacteristicListProjectedCharacteristicListParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProjectedCharacteristicList();

            state._fsp--;

             after(grammarAccess.getQueryStatementAccess().getProjectedCharacteristicListProjectedCharacteristicListParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__QueryStatement__ProjectedCharacteristicListAssignment_2"


    // $ANTLR start "rule__QueryStatement__SelectedEntityExpressionAssignment_3"
    // InternalQueryParser.g:4149:1: rule__QueryStatement__SelectedEntityExpressionAssignment_3 : ( ruleSelectedEntityExpression ) ;
    public final void rule__QueryStatement__SelectedEntityExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4153:1: ( ( ruleSelectedEntityExpression ) )
            // InternalQueryParser.g:4154:2: ( ruleSelectedEntityExpression )
            {
            // InternalQueryParser.g:4154:2: ( ruleSelectedEntityExpression )
            // InternalQueryParser.g:4155:3: ruleSelectedEntityExpression
            {
             before(grammarAccess.getQueryStatementAccess().getSelectedEntityExpressionSelectedEntityExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectedEntityExpression();

            state._fsp--;

             after(grammarAccess.getQueryStatementAccess().getSelectedEntityExpressionSelectedEntityExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__QueryStatement__SelectedEntityExpressionAssignment_3"


    // $ANTLR start "rule__ProjectedCharacteristicList__AllAssignment_0"
    // InternalQueryParser.g:4164:1: rule__ProjectedCharacteristicList__AllAssignment_0 : ( RULE_ALL_CHARACTERISTICS ) ;
    public final void rule__ProjectedCharacteristicList__AllAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4168:1: ( ( RULE_ALL_CHARACTERISTICS ) )
            // InternalQueryParser.g:4169:2: ( RULE_ALL_CHARACTERISTICS )
            {
            // InternalQueryParser.g:4169:2: ( RULE_ALL_CHARACTERISTICS )
            // InternalQueryParser.g:4170:3: RULE_ALL_CHARACTERISTICS
            {
             before(grammarAccess.getProjectedCharacteristicListAccess().getAllALL_CHARACTERISTICSTerminalRuleCall_0_0()); 
            match(input,RULE_ALL_CHARACTERISTICS,FOLLOW_2); 
             after(grammarAccess.getProjectedCharacteristicListAccess().getAllALL_CHARACTERISTICSTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ProjectedCharacteristicList__AllAssignment_0"


    // $ANTLR start "rule__ProjectedCharacteristicList__CharacteristicAssignment_1_0"
    // InternalQueryParser.g:4179:1: rule__ProjectedCharacteristicList__CharacteristicAssignment_1_0 : ( ruleProjectedCharacteristicExpression ) ;
    public final void rule__ProjectedCharacteristicList__CharacteristicAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4183:1: ( ( ruleProjectedCharacteristicExpression ) )
            // InternalQueryParser.g:4184:2: ( ruleProjectedCharacteristicExpression )
            {
            // InternalQueryParser.g:4184:2: ( ruleProjectedCharacteristicExpression )
            // InternalQueryParser.g:4185:3: ruleProjectedCharacteristicExpression
            {
             before(grammarAccess.getProjectedCharacteristicListAccess().getCharacteristicProjectedCharacteristicExpressionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProjectedCharacteristicExpression();

            state._fsp--;

             after(grammarAccess.getProjectedCharacteristicListAccess().getCharacteristicProjectedCharacteristicExpressionParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__ProjectedCharacteristicList__CharacteristicAssignment_1_0"


    // $ANTLR start "rule__ProjectedCharacteristicList__CharacteristicAssignment_1_1_1"
    // InternalQueryParser.g:4194:1: rule__ProjectedCharacteristicList__CharacteristicAssignment_1_1_1 : ( ruleProjectedCharacteristicExpression ) ;
    public final void rule__ProjectedCharacteristicList__CharacteristicAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4198:1: ( ( ruleProjectedCharacteristicExpression ) )
            // InternalQueryParser.g:4199:2: ( ruleProjectedCharacteristicExpression )
            {
            // InternalQueryParser.g:4199:2: ( ruleProjectedCharacteristicExpression )
            // InternalQueryParser.g:4200:3: ruleProjectedCharacteristicExpression
            {
             before(grammarAccess.getProjectedCharacteristicListAccess().getCharacteristicProjectedCharacteristicExpressionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProjectedCharacteristicExpression();

            state._fsp--;

             after(grammarAccess.getProjectedCharacteristicListAccess().getCharacteristicProjectedCharacteristicExpressionParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__ProjectedCharacteristicList__CharacteristicAssignment_1_1_1"


    // $ANTLR start "rule__SelectedEntityCharacteristicWildcardReference__SelectedEntityAssignment_0"
    // InternalQueryParser.g:4209:1: rule__SelectedEntityCharacteristicWildcardReference__SelectedEntityAssignment_0 : ( ruleSelectedEntityReference ) ;
    public final void rule__SelectedEntityCharacteristicWildcardReference__SelectedEntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4213:1: ( ( ruleSelectedEntityReference ) )
            // InternalQueryParser.g:4214:2: ( ruleSelectedEntityReference )
            {
            // InternalQueryParser.g:4214:2: ( ruleSelectedEntityReference )
            // InternalQueryParser.g:4215:3: ruleSelectedEntityReference
            {
             before(grammarAccess.getSelectedEntityCharacteristicWildcardReferenceAccess().getSelectedEntitySelectedEntityReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectedEntityReference();

            state._fsp--;

             after(grammarAccess.getSelectedEntityCharacteristicWildcardReferenceAccess().getSelectedEntitySelectedEntityReferenceParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__SelectedEntityCharacteristicWildcardReference__SelectedEntityAssignment_0"


    // $ANTLR start "rule__ExplicitSelectedEntityCharacteristicReference__SelectedEntityCharacteristicReferenceAssignment_0"
    // InternalQueryParser.g:4224:1: rule__ExplicitSelectedEntityCharacteristicReference__SelectedEntityCharacteristicReferenceAssignment_0 : ( ruleSelectedEntityCharacteristicReference ) ;
    public final void rule__ExplicitSelectedEntityCharacteristicReference__SelectedEntityCharacteristicReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4228:1: ( ( ruleSelectedEntityCharacteristicReference ) )
            // InternalQueryParser.g:4229:2: ( ruleSelectedEntityCharacteristicReference )
            {
            // InternalQueryParser.g:4229:2: ( ruleSelectedEntityCharacteristicReference )
            // InternalQueryParser.g:4230:3: ruleSelectedEntityCharacteristicReference
            {
             before(grammarAccess.getExplicitSelectedEntityCharacteristicReferenceAccess().getSelectedEntityCharacteristicReferenceSelectedEntityCharacteristicReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectedEntityCharacteristicReference();

            state._fsp--;

             after(grammarAccess.getExplicitSelectedEntityCharacteristicReferenceAccess().getSelectedEntityCharacteristicReferenceSelectedEntityCharacteristicReferenceParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ExplicitSelectedEntityCharacteristicReference__SelectedEntityCharacteristicReferenceAssignment_0"


    // $ANTLR start "rule__ExplicitSelectedEntityCharacteristicReference__ProjectedCharacteristicAliasAssignment_1_1"
    // InternalQueryParser.g:4239:1: rule__ExplicitSelectedEntityCharacteristicReference__ProjectedCharacteristicAliasAssignment_1_1 : ( ruleProjectedCharacteristicAlias ) ;
    public final void rule__ExplicitSelectedEntityCharacteristicReference__ProjectedCharacteristicAliasAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4243:1: ( ( ruleProjectedCharacteristicAlias ) )
            // InternalQueryParser.g:4244:2: ( ruleProjectedCharacteristicAlias )
            {
            // InternalQueryParser.g:4244:2: ( ruleProjectedCharacteristicAlias )
            // InternalQueryParser.g:4245:3: ruleProjectedCharacteristicAlias
            {
             before(grammarAccess.getExplicitSelectedEntityCharacteristicReferenceAccess().getProjectedCharacteristicAliasProjectedCharacteristicAliasParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProjectedCharacteristicAlias();

            state._fsp--;

             after(grammarAccess.getExplicitSelectedEntityCharacteristicReferenceAccess().getProjectedCharacteristicAliasProjectedCharacteristicAliasParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ExplicitSelectedEntityCharacteristicReference__ProjectedCharacteristicAliasAssignment_1_1"


    // $ANTLR start "rule__SelectedEntityExpression__FromAssignment_0"
    // InternalQueryParser.g:4254:1: rule__SelectedEntityExpression__FromAssignment_0 : ( ruleFromClause ) ;
    public final void rule__SelectedEntityExpression__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4258:1: ( ( ruleFromClause ) )
            // InternalQueryParser.g:4259:2: ( ruleFromClause )
            {
            // InternalQueryParser.g:4259:2: ( ruleFromClause )
            // InternalQueryParser.g:4260:3: ruleFromClause
            {
             before(grammarAccess.getSelectedEntityExpressionAccess().getFromFromClauseParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFromClause();

            state._fsp--;

             after(grammarAccess.getSelectedEntityExpressionAccess().getFromFromClauseParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__SelectedEntityExpression__FromAssignment_0"


    // $ANTLR start "rule__SelectedEntityExpression__WhereAssignment_1"
    // InternalQueryParser.g:4269:1: rule__SelectedEntityExpression__WhereAssignment_1 : ( ruleWhereClause ) ;
    public final void rule__SelectedEntityExpression__WhereAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4273:1: ( ( ruleWhereClause ) )
            // InternalQueryParser.g:4274:2: ( ruleWhereClause )
            {
            // InternalQueryParser.g:4274:2: ( ruleWhereClause )
            // InternalQueryParser.g:4275:3: ruleWhereClause
            {
             before(grammarAccess.getSelectedEntityExpressionAccess().getWhereWhereClauseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWhereClause();

            state._fsp--;

             after(grammarAccess.getSelectedEntityExpressionAccess().getWhereWhereClauseParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SelectedEntityExpression__WhereAssignment_1"


    // $ANTLR start "rule__SelectedEntityExpression__OrderByAssignment_2"
    // InternalQueryParser.g:4284:1: rule__SelectedEntityExpression__OrderByAssignment_2 : ( ruleOrderByClause ) ;
    public final void rule__SelectedEntityExpression__OrderByAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4288:1: ( ( ruleOrderByClause ) )
            // InternalQueryParser.g:4289:2: ( ruleOrderByClause )
            {
            // InternalQueryParser.g:4289:2: ( ruleOrderByClause )
            // InternalQueryParser.g:4290:3: ruleOrderByClause
            {
             before(grammarAccess.getSelectedEntityExpressionAccess().getOrderByOrderByClauseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOrderByClause();

            state._fsp--;

             after(grammarAccess.getSelectedEntityExpressionAccess().getOrderByOrderByClauseParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SelectedEntityExpression__OrderByAssignment_2"


    // $ANTLR start "rule__FromClause__EntityAssignment_1"
    // InternalQueryParser.g:4299:1: rule__FromClause__EntityAssignment_1 : ( ruleEntityExpression ) ;
    public final void rule__FromClause__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4303:1: ( ( ruleEntityExpression ) )
            // InternalQueryParser.g:4304:2: ( ruleEntityExpression )
            {
            // InternalQueryParser.g:4304:2: ( ruleEntityExpression )
            // InternalQueryParser.g:4305:3: ruleEntityExpression
            {
             before(grammarAccess.getFromClauseAccess().getEntityEntityExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityExpression();

            state._fsp--;

             after(grammarAccess.getFromClauseAccess().getEntityEntityExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FromClause__EntityAssignment_1"


    // $ANTLR start "rule__EntityExpression__SelectedEntityAssignment_0"
    // InternalQueryParser.g:4314:1: rule__EntityExpression__SelectedEntityAssignment_0 : ( ruleSelectedEntity ) ;
    public final void rule__EntityExpression__SelectedEntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4318:1: ( ( ruleSelectedEntity ) )
            // InternalQueryParser.g:4319:2: ( ruleSelectedEntity )
            {
            // InternalQueryParser.g:4319:2: ( ruleSelectedEntity )
            // InternalQueryParser.g:4320:3: ruleSelectedEntity
            {
             before(grammarAccess.getEntityExpressionAccess().getSelectedEntitySelectedEntityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectedEntity();

            state._fsp--;

             after(grammarAccess.getEntityExpressionAccess().getSelectedEntitySelectedEntityParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__EntityExpression__SelectedEntityAssignment_0"


    // $ANTLR start "rule__EntityExpression__EjeAssignment_1"
    // InternalQueryParser.g:4329:1: rule__EntityExpression__EjeAssignment_1 : ( ruleEntityJoinExpression ) ;
    public final void rule__EntityExpression__EjeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4333:1: ( ( ruleEntityJoinExpression ) )
            // InternalQueryParser.g:4334:2: ( ruleEntityJoinExpression )
            {
            // InternalQueryParser.g:4334:2: ( ruleEntityJoinExpression )
            // InternalQueryParser.g:4335:3: ruleEntityJoinExpression
            {
             before(grammarAccess.getEntityExpressionAccess().getEjeEntityJoinExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityJoinExpression();

            state._fsp--;

             after(grammarAccess.getEntityExpressionAccess().getEjeEntityJoinExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EntityExpression__EjeAssignment_1"


    // $ANTLR start "rule__SelectedEntity__EntityTypeAssignment_0"
    // InternalQueryParser.g:4344:1: rule__SelectedEntity__EntityTypeAssignment_0 : ( ruleEntityTypeReference ) ;
    public final void rule__SelectedEntity__EntityTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4348:1: ( ( ruleEntityTypeReference ) )
            // InternalQueryParser.g:4349:2: ( ruleEntityTypeReference )
            {
            // InternalQueryParser.g:4349:2: ( ruleEntityTypeReference )
            // InternalQueryParser.g:4350:3: ruleEntityTypeReference
            {
             before(grammarAccess.getSelectedEntityAccess().getEntityTypeEntityTypeReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityTypeReference();

            state._fsp--;

             after(grammarAccess.getSelectedEntityAccess().getEntityTypeEntityTypeReferenceParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__SelectedEntity__EntityTypeAssignment_0"


    // $ANTLR start "rule__SelectedEntity__SelectedEntityAliasAssignment_1_1"
    // InternalQueryParser.g:4359:1: rule__SelectedEntity__SelectedEntityAliasAssignment_1_1 : ( ruleSelectedEntityAlias ) ;
    public final void rule__SelectedEntity__SelectedEntityAliasAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4363:1: ( ( ruleSelectedEntityAlias ) )
            // InternalQueryParser.g:4364:2: ( ruleSelectedEntityAlias )
            {
            // InternalQueryParser.g:4364:2: ( ruleSelectedEntityAlias )
            // InternalQueryParser.g:4365:3: ruleSelectedEntityAlias
            {
             before(grammarAccess.getSelectedEntityAccess().getSelectedEntityAliasSelectedEntityAliasParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectedEntityAlias();

            state._fsp--;

             after(grammarAccess.getSelectedEntityAccess().getSelectedEntityAliasSelectedEntityAliasParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__SelectedEntity__SelectedEntityAliasAssignment_1_1"


    // $ANTLR start "rule__EntityJoinExpression__JoinEntityAssignment_1"
    // InternalQueryParser.g:4374:1: rule__EntityJoinExpression__JoinEntityAssignment_1 : ( ruleJoinEntity ) ;
    public final void rule__EntityJoinExpression__JoinEntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4378:1: ( ( ruleJoinEntity ) )
            // InternalQueryParser.g:4379:2: ( ruleJoinEntity )
            {
            // InternalQueryParser.g:4379:2: ( ruleJoinEntity )
            // InternalQueryParser.g:4380:3: ruleJoinEntity
            {
             before(grammarAccess.getEntityJoinExpressionAccess().getJoinEntityJoinEntityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJoinEntity();

            state._fsp--;

             after(grammarAccess.getEntityJoinExpressionAccess().getJoinEntityJoinEntityParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EntityJoinExpression__JoinEntityAssignment_1"


    // $ANTLR start "rule__EntityJoinExpression__EntityJoinCriteriaAssignment_3"
    // InternalQueryParser.g:4389:1: rule__EntityJoinExpression__EntityJoinCriteriaAssignment_3 : ( ruleEntityJoinCriteria ) ;
    public final void rule__EntityJoinExpression__EntityJoinCriteriaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4393:1: ( ( ruleEntityJoinCriteria ) )
            // InternalQueryParser.g:4394:2: ( ruleEntityJoinCriteria )
            {
            // InternalQueryParser.g:4394:2: ( ruleEntityJoinCriteria )
            // InternalQueryParser.g:4395:3: ruleEntityJoinCriteria
            {
             before(grammarAccess.getEntityJoinExpressionAccess().getEntityJoinCriteriaEntityJoinCriteriaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityJoinCriteria();

            state._fsp--;

             after(grammarAccess.getEntityJoinExpressionAccess().getEntityJoinCriteriaEntityJoinCriteriaParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__EntityJoinExpression__EntityJoinCriteriaAssignment_3"


    // $ANTLR start "rule__EntityJoinCriteria__EtceeAssignment_0"
    // InternalQueryParser.g:4404:1: rule__EntityJoinCriteria__EtceeAssignment_0 : ( ruleEntityTypeCharacteristicEquivalenceExpression ) ;
    public final void rule__EntityJoinCriteria__EtceeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4408:1: ( ( ruleEntityTypeCharacteristicEquivalenceExpression ) )
            // InternalQueryParser.g:4409:2: ( ruleEntityTypeCharacteristicEquivalenceExpression )
            {
            // InternalQueryParser.g:4409:2: ( ruleEntityTypeCharacteristicEquivalenceExpression )
            // InternalQueryParser.g:4410:3: ruleEntityTypeCharacteristicEquivalenceExpression
            {
             before(grammarAccess.getEntityJoinCriteriaAccess().getEtceeEntityTypeCharacteristicEquivalenceExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityTypeCharacteristicEquivalenceExpression();

            state._fsp--;

             after(grammarAccess.getEntityJoinCriteriaAccess().getEtceeEntityTypeCharacteristicEquivalenceExpressionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__EntityJoinCriteria__EtceeAssignment_0"


    // $ANTLR start "rule__EntityJoinCriteria__EtceeAssignment_1_1"
    // InternalQueryParser.g:4419:1: rule__EntityJoinCriteria__EtceeAssignment_1_1 : ( ruleEntityTypeCharacteristicEquivalenceExpression ) ;
    public final void rule__EntityJoinCriteria__EtceeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4423:1: ( ( ruleEntityTypeCharacteristicEquivalenceExpression ) )
            // InternalQueryParser.g:4424:2: ( ruleEntityTypeCharacteristicEquivalenceExpression )
            {
            // InternalQueryParser.g:4424:2: ( ruleEntityTypeCharacteristicEquivalenceExpression )
            // InternalQueryParser.g:4425:3: ruleEntityTypeCharacteristicEquivalenceExpression
            {
             before(grammarAccess.getEntityJoinCriteriaAccess().getEtceeEntityTypeCharacteristicEquivalenceExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityTypeCharacteristicEquivalenceExpression();

            state._fsp--;

             after(grammarAccess.getEntityJoinCriteriaAccess().getEtceeEntityTypeCharacteristicEquivalenceExpressionParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__EntityJoinCriteria__EtceeAssignment_1_1"


    // $ANTLR start "rule__EntityTypeCharacteristicEquivalenceExpression__SecrAssignment_0"
    // InternalQueryParser.g:4434:1: rule__EntityTypeCharacteristicEquivalenceExpression__SecrAssignment_0 : ( ruleSelectedEntityCharacteristicReference ) ;
    public final void rule__EntityTypeCharacteristicEquivalenceExpression__SecrAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4438:1: ( ( ruleSelectedEntityCharacteristicReference ) )
            // InternalQueryParser.g:4439:2: ( ruleSelectedEntityCharacteristicReference )
            {
            // InternalQueryParser.g:4439:2: ( ruleSelectedEntityCharacteristicReference )
            // InternalQueryParser.g:4440:3: ruleSelectedEntityCharacteristicReference
            {
             before(grammarAccess.getEntityTypeCharacteristicEquivalenceExpressionAccess().getSecrSelectedEntityCharacteristicReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectedEntityCharacteristicReference();

            state._fsp--;

             after(grammarAccess.getEntityTypeCharacteristicEquivalenceExpressionAccess().getSecrSelectedEntityCharacteristicReferenceParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__EntityTypeCharacteristicEquivalenceExpression__SecrAssignment_0"


    // $ANTLR start "rule__EntityTypeCharacteristicEquivalenceExpression__SelectedEntityAssignment_1_1"
    // InternalQueryParser.g:4449:1: rule__EntityTypeCharacteristicEquivalenceExpression__SelectedEntityAssignment_1_1 : ( ruleSelectedEntityReference ) ;
    public final void rule__EntityTypeCharacteristicEquivalenceExpression__SelectedEntityAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4453:1: ( ( ruleSelectedEntityReference ) )
            // InternalQueryParser.g:4454:2: ( ruleSelectedEntityReference )
            {
            // InternalQueryParser.g:4454:2: ( ruleSelectedEntityReference )
            // InternalQueryParser.g:4455:3: ruleSelectedEntityReference
            {
             before(grammarAccess.getEntityTypeCharacteristicEquivalenceExpressionAccess().getSelectedEntitySelectedEntityReferenceParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectedEntityReference();

            state._fsp--;

             after(grammarAccess.getEntityTypeCharacteristicEquivalenceExpressionAccess().getSelectedEntitySelectedEntityReferenceParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__EntityTypeCharacteristicEquivalenceExpression__SelectedEntityAssignment_1_1"


    // $ANTLR start "rule__SelectedEntityCharacteristicReference__SelectedEntityAssignment_0_0"
    // InternalQueryParser.g:4464:1: rule__SelectedEntityCharacteristicReference__SelectedEntityAssignment_0_0 : ( ruleSelectedEntityReference ) ;
    public final void rule__SelectedEntityCharacteristicReference__SelectedEntityAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4468:1: ( ( ruleSelectedEntityReference ) )
            // InternalQueryParser.g:4469:2: ( ruleSelectedEntityReference )
            {
            // InternalQueryParser.g:4469:2: ( ruleSelectedEntityReference )
            // InternalQueryParser.g:4470:3: ruleSelectedEntityReference
            {
             before(grammarAccess.getSelectedEntityCharacteristicReferenceAccess().getSelectedEntitySelectedEntityReferenceParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectedEntityReference();

            state._fsp--;

             after(grammarAccess.getSelectedEntityCharacteristicReferenceAccess().getSelectedEntitySelectedEntityReferenceParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__SelectedEntityCharacteristicReference__SelectedEntityAssignment_0_0"


    // $ANTLR start "rule__SelectedEntityCharacteristicReference__CharacteristicAssignment_1"
    // InternalQueryParser.g:4479:1: rule__SelectedEntityCharacteristicReference__CharacteristicAssignment_1 : ( ruleCharacteristicReference ) ;
    public final void rule__SelectedEntityCharacteristicReference__CharacteristicAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4483:1: ( ( ruleCharacteristicReference ) )
            // InternalQueryParser.g:4484:2: ( ruleCharacteristicReference )
            {
            // InternalQueryParser.g:4484:2: ( ruleCharacteristicReference )
            // InternalQueryParser.g:4485:3: ruleCharacteristicReference
            {
             before(grammarAccess.getSelectedEntityCharacteristicReferenceAccess().getCharacteristicCharacteristicReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicReference();

            state._fsp--;

             after(grammarAccess.getSelectedEntityCharacteristicReferenceAccess().getCharacteristicCharacteristicReferenceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SelectedEntityCharacteristicReference__CharacteristicAssignment_1"


    // $ANTLR start "rule__WhereClause__CriteriaAssignment_1"
    // InternalQueryParser.g:4494:1: rule__WhereClause__CriteriaAssignment_1 : ( ruleCriteria ) ;
    public final void rule__WhereClause__CriteriaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4498:1: ( ( ruleCriteria ) )
            // InternalQueryParser.g:4499:2: ( ruleCriteria )
            {
            // InternalQueryParser.g:4499:2: ( ruleCriteria )
            // InternalQueryParser.g:4500:3: ruleCriteria
            {
             before(grammarAccess.getWhereClauseAccess().getCriteriaCriteriaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCriteria();

            state._fsp--;

             after(grammarAccess.getWhereClauseAccess().getCriteriaCriteriaParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__WhereClause__CriteriaAssignment_1"


    // $ANTLR start "rule__OrderByClause__OrderingExpressionAssignment_2"
    // InternalQueryParser.g:4509:1: rule__OrderByClause__OrderingExpressionAssignment_2 : ( ruleOrderingExpression ) ;
    public final void rule__OrderByClause__OrderingExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4513:1: ( ( ruleOrderingExpression ) )
            // InternalQueryParser.g:4514:2: ( ruleOrderingExpression )
            {
            // InternalQueryParser.g:4514:2: ( ruleOrderingExpression )
            // InternalQueryParser.g:4515:3: ruleOrderingExpression
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderingExpressionOrderingExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOrderingExpression();

            state._fsp--;

             after(grammarAccess.getOrderByClauseAccess().getOrderingExpressionOrderingExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__OrderByClause__OrderingExpressionAssignment_2"


    // $ANTLR start "rule__OrderByClause__OrderingExpressionAssignment_3_1"
    // InternalQueryParser.g:4524:1: rule__OrderByClause__OrderingExpressionAssignment_3_1 : ( ruleOrderingExpression ) ;
    public final void rule__OrderByClause__OrderingExpressionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4528:1: ( ( ruleOrderingExpression ) )
            // InternalQueryParser.g:4529:2: ( ruleOrderingExpression )
            {
            // InternalQueryParser.g:4529:2: ( ruleOrderingExpression )
            // InternalQueryParser.g:4530:3: ruleOrderingExpression
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderingExpressionOrderingExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrderingExpression();

            state._fsp--;

             after(grammarAccess.getOrderByClauseAccess().getOrderingExpressionOrderingExpressionParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__OrderByClause__OrderingExpressionAssignment_3_1"


    // $ANTLR start "rule__OrderingExpression__CharacteristicAssignment_0"
    // InternalQueryParser.g:4539:1: rule__OrderingExpression__CharacteristicAssignment_0 : ( ruleProjectedCharacteristicReference ) ;
    public final void rule__OrderingExpression__CharacteristicAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4543:1: ( ( ruleProjectedCharacteristicReference ) )
            // InternalQueryParser.g:4544:2: ( ruleProjectedCharacteristicReference )
            {
            // InternalQueryParser.g:4544:2: ( ruleProjectedCharacteristicReference )
            // InternalQueryParser.g:4545:3: ruleProjectedCharacteristicReference
            {
             before(grammarAccess.getOrderingExpressionAccess().getCharacteristicProjectedCharacteristicReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProjectedCharacteristicReference();

            state._fsp--;

             after(grammarAccess.getOrderingExpressionAccess().getCharacteristicProjectedCharacteristicReferenceParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__OrderingExpression__CharacteristicAssignment_0"


    // $ANTLR start "rule__OrderingExpression__OrderingTypeAssignment_1"
    // InternalQueryParser.g:4554:1: rule__OrderingExpression__OrderingTypeAssignment_1 : ( ruleOrderingType ) ;
    public final void rule__OrderingExpression__OrderingTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4558:1: ( ( ruleOrderingType ) )
            // InternalQueryParser.g:4559:2: ( ruleOrderingType )
            {
            // InternalQueryParser.g:4559:2: ( ruleOrderingType )
            // InternalQueryParser.g:4560:3: ruleOrderingType
            {
             before(grammarAccess.getOrderingExpressionAccess().getOrderingTypeOrderingTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrderingType();

            state._fsp--;

             after(grammarAccess.getOrderingExpressionAccess().getOrderingTypeOrderingTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__OrderingExpression__OrderingTypeAssignment_1"


    // $ANTLR start "rule__QualifiedProjectedCharacteristicReference__SelectedEntityReferenceAssignment_0"
    // InternalQueryParser.g:4569:1: rule__QualifiedProjectedCharacteristicReference__SelectedEntityReferenceAssignment_0 : ( ruleSelectedEntityReference ) ;
    public final void rule__QualifiedProjectedCharacteristicReference__SelectedEntityReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4573:1: ( ( ruleSelectedEntityReference ) )
            // InternalQueryParser.g:4574:2: ( ruleSelectedEntityReference )
            {
            // InternalQueryParser.g:4574:2: ( ruleSelectedEntityReference )
            // InternalQueryParser.g:4575:3: ruleSelectedEntityReference
            {
             before(grammarAccess.getQualifiedProjectedCharacteristicReferenceAccess().getSelectedEntityReferenceSelectedEntityReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectedEntityReference();

            state._fsp--;

             after(grammarAccess.getQualifiedProjectedCharacteristicReferenceAccess().getSelectedEntityReferenceSelectedEntityReferenceParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__QualifiedProjectedCharacteristicReference__SelectedEntityReferenceAssignment_0"


    // $ANTLR start "rule__QualifiedProjectedCharacteristicReference__CharacteristicAssignment_2"
    // InternalQueryParser.g:4584:1: rule__QualifiedProjectedCharacteristicReference__CharacteristicAssignment_2 : ( ruleCharacteristicReference ) ;
    public final void rule__QualifiedProjectedCharacteristicReference__CharacteristicAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4588:1: ( ( ruleCharacteristicReference ) )
            // InternalQueryParser.g:4589:2: ( ruleCharacteristicReference )
            {
            // InternalQueryParser.g:4589:2: ( ruleCharacteristicReference )
            // InternalQueryParser.g:4590:3: ruleCharacteristicReference
            {
             before(grammarAccess.getQualifiedProjectedCharacteristicReferenceAccess().getCharacteristicCharacteristicReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicReference();

            state._fsp--;

             after(grammarAccess.getQualifiedProjectedCharacteristicReferenceAccess().getCharacteristicCharacteristicReferenceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__QualifiedProjectedCharacteristicReference__CharacteristicAssignment_2"


    // $ANTLR start "rule__BooleanExpression__TermAssignment_0"
    // InternalQueryParser.g:4599:1: rule__BooleanExpression__TermAssignment_0 : ( ruleBooleanTerm ) ;
    public final void rule__BooleanExpression__TermAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4603:1: ( ( ruleBooleanTerm ) )
            // InternalQueryParser.g:4604:2: ( ruleBooleanTerm )
            {
            // InternalQueryParser.g:4604:2: ( ruleBooleanTerm )
            // InternalQueryParser.g:4605:3: ruleBooleanTerm
            {
             before(grammarAccess.getBooleanExpressionAccess().getTermBooleanTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanTerm();

            state._fsp--;

             after(grammarAccess.getBooleanExpressionAccess().getTermBooleanTermParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__BooleanExpression__TermAssignment_0"


    // $ANTLR start "rule__BooleanExpression__TermAssignment_1_1"
    // InternalQueryParser.g:4614:1: rule__BooleanExpression__TermAssignment_1_1 : ( ruleBooleanTerm ) ;
    public final void rule__BooleanExpression__TermAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4618:1: ( ( ruleBooleanTerm ) )
            // InternalQueryParser.g:4619:2: ( ruleBooleanTerm )
            {
            // InternalQueryParser.g:4619:2: ( ruleBooleanTerm )
            // InternalQueryParser.g:4620:3: ruleBooleanTerm
            {
             before(grammarAccess.getBooleanExpressionAccess().getTermBooleanTermParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanTerm();

            state._fsp--;

             after(grammarAccess.getBooleanExpressionAccess().getTermBooleanTermParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__BooleanExpression__TermAssignment_1_1"


    // $ANTLR start "rule__BooleanTerm__FactorAssignment_0"
    // InternalQueryParser.g:4629:1: rule__BooleanTerm__FactorAssignment_0 : ( ruleBooleanFactor ) ;
    public final void rule__BooleanTerm__FactorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4633:1: ( ( ruleBooleanFactor ) )
            // InternalQueryParser.g:4634:2: ( ruleBooleanFactor )
            {
            // InternalQueryParser.g:4634:2: ( ruleBooleanFactor )
            // InternalQueryParser.g:4635:3: ruleBooleanFactor
            {
             before(grammarAccess.getBooleanTermAccess().getFactorBooleanFactorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanFactor();

            state._fsp--;

             after(grammarAccess.getBooleanTermAccess().getFactorBooleanFactorParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__BooleanTerm__FactorAssignment_0"


    // $ANTLR start "rule__BooleanTerm__FactorAssignment_1_1"
    // InternalQueryParser.g:4644:1: rule__BooleanTerm__FactorAssignment_1_1 : ( ruleBooleanFactor ) ;
    public final void rule__BooleanTerm__FactorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4648:1: ( ( ruleBooleanFactor ) )
            // InternalQueryParser.g:4649:2: ( ruleBooleanFactor )
            {
            // InternalQueryParser.g:4649:2: ( ruleBooleanFactor )
            // InternalQueryParser.g:4650:3: ruleBooleanFactor
            {
             before(grammarAccess.getBooleanTermAccess().getFactorBooleanFactorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanFactor();

            state._fsp--;

             after(grammarAccess.getBooleanTermAccess().getFactorBooleanFactorParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__BooleanTerm__FactorAssignment_1_1"


    // $ANTLR start "rule__BooleanFactor__NotAssignment_0"
    // InternalQueryParser.g:4659:1: rule__BooleanFactor__NotAssignment_0 : ( RULE_KW_NOT ) ;
    public final void rule__BooleanFactor__NotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4663:1: ( ( RULE_KW_NOT ) )
            // InternalQueryParser.g:4664:2: ( RULE_KW_NOT )
            {
            // InternalQueryParser.g:4664:2: ( RULE_KW_NOT )
            // InternalQueryParser.g:4665:3: RULE_KW_NOT
            {
             before(grammarAccess.getBooleanFactorAccess().getNotKW_NOTTerminalRuleCall_0_0()); 
            match(input,RULE_KW_NOT,FOLLOW_2); 
             after(grammarAccess.getBooleanFactorAccess().getNotKW_NOTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__BooleanFactor__NotAssignment_0"


    // $ANTLR start "rule__BooleanFactor__PredAssignment_1"
    // InternalQueryParser.g:4674:1: rule__BooleanFactor__PredAssignment_1 : ( ruleBooleanPredicate ) ;
    public final void rule__BooleanFactor__PredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4678:1: ( ( ruleBooleanPredicate ) )
            // InternalQueryParser.g:4679:2: ( ruleBooleanPredicate )
            {
            // InternalQueryParser.g:4679:2: ( ruleBooleanPredicate )
            // InternalQueryParser.g:4680:3: ruleBooleanPredicate
            {
             before(grammarAccess.getBooleanFactorAccess().getPredBooleanPredicateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanPredicate();

            state._fsp--;

             after(grammarAccess.getBooleanFactorAccess().getPredBooleanPredicateParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__BooleanFactor__PredAssignment_1"


    // $ANTLR start "rule__ScalarComparePredicate__LeftAssignment_0"
    // InternalQueryParser.g:4689:1: rule__ScalarComparePredicate__LeftAssignment_0 : ( rulePredicateTerm ) ;
    public final void rule__ScalarComparePredicate__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4693:1: ( ( rulePredicateTerm ) )
            // InternalQueryParser.g:4694:2: ( rulePredicateTerm )
            {
            // InternalQueryParser.g:4694:2: ( rulePredicateTerm )
            // InternalQueryParser.g:4695:3: rulePredicateTerm
            {
             before(grammarAccess.getScalarComparePredicateAccess().getLeftPredicateTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePredicateTerm();

            state._fsp--;

             after(grammarAccess.getScalarComparePredicateAccess().getLeftPredicateTermParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ScalarComparePredicate__LeftAssignment_0"


    // $ANTLR start "rule__ScalarComparePredicate__OpAssignment_1"
    // InternalQueryParser.g:4704:1: rule__ScalarComparePredicate__OpAssignment_1 : ( ruleCompareOperator ) ;
    public final void rule__ScalarComparePredicate__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4708:1: ( ( ruleCompareOperator ) )
            // InternalQueryParser.g:4709:2: ( ruleCompareOperator )
            {
            // InternalQueryParser.g:4709:2: ( ruleCompareOperator )
            // InternalQueryParser.g:4710:3: ruleCompareOperator
            {
             before(grammarAccess.getScalarComparePredicateAccess().getOpCompareOperatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCompareOperator();

            state._fsp--;

             after(grammarAccess.getScalarComparePredicateAccess().getOpCompareOperatorParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ScalarComparePredicate__OpAssignment_1"


    // $ANTLR start "rule__ScalarComparePredicate__RightAssignment_2"
    // InternalQueryParser.g:4719:1: rule__ScalarComparePredicate__RightAssignment_2 : ( rulePredicateTerm ) ;
    public final void rule__ScalarComparePredicate__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4723:1: ( ( rulePredicateTerm ) )
            // InternalQueryParser.g:4724:2: ( rulePredicateTerm )
            {
            // InternalQueryParser.g:4724:2: ( rulePredicateTerm )
            // InternalQueryParser.g:4725:3: rulePredicateTerm
            {
             before(grammarAccess.getScalarComparePredicateAccess().getRightPredicateTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePredicateTerm();

            state._fsp--;

             after(grammarAccess.getScalarComparePredicateAccess().getRightPredicateTermParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ScalarComparePredicate__RightAssignment_2"


    // $ANTLR start "rule__CharacteristicBasisSet__CharacteristicBasisAssignment_1"
    // InternalQueryParser.g:4734:1: rule__CharacteristicBasisSet__CharacteristicBasisAssignment_1 : ( ruleCharacteristicBasis ) ;
    public final void rule__CharacteristicBasisSet__CharacteristicBasisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4738:1: ( ( ruleCharacteristicBasis ) )
            // InternalQueryParser.g:4739:2: ( ruleCharacteristicBasis )
            {
            // InternalQueryParser.g:4739:2: ( ruleCharacteristicBasis )
            // InternalQueryParser.g:4740:3: ruleCharacteristicBasis
            {
             before(grammarAccess.getCharacteristicBasisSetAccess().getCharacteristicBasisCharacteristicBasisParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicBasis();

            state._fsp--;

             after(grammarAccess.getCharacteristicBasisSetAccess().getCharacteristicBasisCharacteristicBasisParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__CharacteristicBasisSet__CharacteristicBasisAssignment_1"


    // $ANTLR start "rule__CharacteristicBasisSet__CharacteristicBasisAssignment_2_1"
    // InternalQueryParser.g:4749:1: rule__CharacteristicBasisSet__CharacteristicBasisAssignment_2_1 : ( ruleCharacteristicBasis ) ;
    public final void rule__CharacteristicBasisSet__CharacteristicBasisAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4753:1: ( ( ruleCharacteristicBasis ) )
            // InternalQueryParser.g:4754:2: ( ruleCharacteristicBasis )
            {
            // InternalQueryParser.g:4754:2: ( ruleCharacteristicBasis )
            // InternalQueryParser.g:4755:3: ruleCharacteristicBasis
            {
             before(grammarAccess.getCharacteristicBasisSetAccess().getCharacteristicBasisCharacteristicBasisParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicBasis();

            state._fsp--;

             after(grammarAccess.getCharacteristicBasisSetAccess().getCharacteristicBasisCharacteristicBasisParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__CharacteristicBasisSet__CharacteristicBasisAssignment_2_1"


    // $ANTLR start "rule__ExistsPredicate__SubAssignment_1"
    // InternalQueryParser.g:4764:1: rule__ExistsPredicate__SubAssignment_1 : ( ruleSubquery ) ;
    public final void rule__ExistsPredicate__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4768:1: ( ( ruleSubquery ) )
            // InternalQueryParser.g:4769:2: ( ruleSubquery )
            {
            // InternalQueryParser.g:4769:2: ( ruleSubquery )
            // InternalQueryParser.g:4770:3: ruleSubquery
            {
             before(grammarAccess.getExistsPredicateAccess().getSubSubqueryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSubquery();

            state._fsp--;

             after(grammarAccess.getExistsPredicateAccess().getSubSubqueryParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ExistsPredicate__SubAssignment_1"


    // $ANTLR start "rule__Subquery__QueryAssignment_1"
    // InternalQueryParser.g:4779:1: rule__Subquery__QueryAssignment_1 : ( ruleQueryStatement ) ;
    public final void rule__Subquery__QueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4783:1: ( ( ruleQueryStatement ) )
            // InternalQueryParser.g:4784:2: ( ruleQueryStatement )
            {
            // InternalQueryParser.g:4784:2: ( ruleQueryStatement )
            // InternalQueryParser.g:4785:3: ruleQueryStatement
            {
             before(grammarAccess.getSubqueryAccess().getQueryQueryStatementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQueryStatement();

            state._fsp--;

             after(grammarAccess.getSubqueryAccess().getQueryQueryStatementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Subquery__QueryAssignment_1"


    // $ANTLR start "rule__EnumLiteralSet__TypeAssignment_1"
    // InternalQueryParser.g:4794:1: rule__EnumLiteralSet__TypeAssignment_1 : ( ruleEnumerationTypeReference ) ;
    public final void rule__EnumLiteralSet__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4798:1: ( ( ruleEnumerationTypeReference ) )
            // InternalQueryParser.g:4799:2: ( ruleEnumerationTypeReference )
            {
            // InternalQueryParser.g:4799:2: ( ruleEnumerationTypeReference )
            // InternalQueryParser.g:4800:3: ruleEnumerationTypeReference
            {
             before(grammarAccess.getEnumLiteralSetAccess().getTypeEnumerationTypeReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationTypeReference();

            state._fsp--;

             after(grammarAccess.getEnumLiteralSetAccess().getTypeEnumerationTypeReferenceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EnumLiteralSet__TypeAssignment_1"


    // $ANTLR start "rule__EnumLiteralSet__LiteralAssignment_3"
    // InternalQueryParser.g:4809:1: rule__EnumLiteralSet__LiteralAssignment_3 : ( ruleEnumerationLiteralReference ) ;
    public final void rule__EnumLiteralSet__LiteralAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4813:1: ( ( ruleEnumerationLiteralReference ) )
            // InternalQueryParser.g:4814:2: ( ruleEnumerationLiteralReference )
            {
            // InternalQueryParser.g:4814:2: ( ruleEnumerationLiteralReference )
            // InternalQueryParser.g:4815:3: ruleEnumerationLiteralReference
            {
             before(grammarAccess.getEnumLiteralSetAccess().getLiteralEnumerationLiteralReferenceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationLiteralReference();

            state._fsp--;

             after(grammarAccess.getEnumLiteralSetAccess().getLiteralEnumerationLiteralReferenceParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__EnumLiteralSet__LiteralAssignment_3"


    // $ANTLR start "rule__EnumLiteralSet__LiteralAssignment_4_1"
    // InternalQueryParser.g:4824:1: rule__EnumLiteralSet__LiteralAssignment_4_1 : ( ruleEnumerationLiteralReference ) ;
    public final void rule__EnumLiteralSet__LiteralAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4828:1: ( ( ruleEnumerationLiteralReference ) )
            // InternalQueryParser.g:4829:2: ( ruleEnumerationLiteralReference )
            {
            // InternalQueryParser.g:4829:2: ( ruleEnumerationLiteralReference )
            // InternalQueryParser.g:4830:3: ruleEnumerationLiteralReference
            {
             before(grammarAccess.getEnumLiteralSetAccess().getLiteralEnumerationLiteralReferenceParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationLiteralReference();

            state._fsp--;

             after(grammarAccess.getEnumLiteralSetAccess().getLiteralEnumerationLiteralReferenceParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__EnumLiteralSet__LiteralAssignment_4_1"


    // $ANTLR start "rule__EnumLiteralReferenceExpression__TypAssignment_1"
    // InternalQueryParser.g:4839:1: rule__EnumLiteralReferenceExpression__TypAssignment_1 : ( ruleEnumerationTypeReference ) ;
    public final void rule__EnumLiteralReferenceExpression__TypAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4843:1: ( ( ruleEnumerationTypeReference ) )
            // InternalQueryParser.g:4844:2: ( ruleEnumerationTypeReference )
            {
            // InternalQueryParser.g:4844:2: ( ruleEnumerationTypeReference )
            // InternalQueryParser.g:4845:3: ruleEnumerationTypeReference
            {
             before(grammarAccess.getEnumLiteralReferenceExpressionAccess().getTypEnumerationTypeReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationTypeReference();

            state._fsp--;

             after(grammarAccess.getEnumLiteralReferenceExpressionAccess().getTypEnumerationTypeReferenceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EnumLiteralReferenceExpression__TypAssignment_1"


    // $ANTLR start "rule__EnumLiteralReferenceExpression__LiteralAssignment_3"
    // InternalQueryParser.g:4854:1: rule__EnumLiteralReferenceExpression__LiteralAssignment_3 : ( ruleEnumerationLiteralReference ) ;
    public final void rule__EnumLiteralReferenceExpression__LiteralAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4858:1: ( ( ruleEnumerationLiteralReference ) )
            // InternalQueryParser.g:4859:2: ( ruleEnumerationLiteralReference )
            {
            // InternalQueryParser.g:4859:2: ( ruleEnumerationLiteralReference )
            // InternalQueryParser.g:4860:3: ruleEnumerationLiteralReference
            {
             before(grammarAccess.getEnumLiteralReferenceExpressionAccess().getLiteralEnumerationLiteralReferenceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationLiteralReference();

            state._fsp--;

             after(grammarAccess.getEnumLiteralReferenceExpressionAccess().getLiteralEnumerationLiteralReferenceParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__EnumLiteralReferenceExpression__LiteralAssignment_3"


    // $ANTLR start "rule__QueryIdentifier__IdAssignment"
    // InternalQueryParser.g:4869:1: rule__QueryIdentifier__IdAssignment : ( RULE_IDENTIFIER ) ;
    public final void rule__QueryIdentifier__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryParser.g:4873:1: ( ( RULE_IDENTIFIER ) )
            // InternalQueryParser.g:4874:2: ( RULE_IDENTIFIER )
            {
            // InternalQueryParser.g:4874:2: ( RULE_IDENTIFIER )
            // InternalQueryParser.g:4875:3: RULE_IDENTIFIER
            {
             before(grammarAccess.getQueryIdentifierAccess().getIdIDENTIFIERTerminalRuleCall_0()); 
            match(input,RULE_IDENTIFIER,FOLLOW_2); 
             after(grammarAccess.getQueryIdentifierAccess().getIdIDENTIFIERTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QueryIdentifier__IdAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000008000010180L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000008000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008480010D80L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008480010180L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008080010180L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});

}