package com.epistimis.uddl.query.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.epistimis.uddl.query.services.QueryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQueryParser extends AbstractInternalAntlrParser {
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

        public InternalQueryParser(TokenStream input, QueryGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "QuerySpecification";
       	}

       	@Override
       	protected QueryGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleQuerySpecification"
    // InternalQueryParser.g:60:1: entryRuleQuerySpecification returns [EObject current=null] : iv_ruleQuerySpecification= ruleQuerySpecification EOF ;
    public final EObject entryRuleQuerySpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuerySpecification = null;


        try {
            // InternalQueryParser.g:60:59: (iv_ruleQuerySpecification= ruleQuerySpecification EOF )
            // InternalQueryParser.g:61:2: iv_ruleQuerySpecification= ruleQuerySpecification EOF
            {
             newCompositeNode(grammarAccess.getQuerySpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuerySpecification=ruleQuerySpecification();

            state._fsp--;

             current =iv_ruleQuerySpecification; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuerySpecification"


    // $ANTLR start "ruleQuerySpecification"
    // InternalQueryParser.g:67:1: ruleQuerySpecification returns [EObject current=null] : this_QueryStatement_0= ruleQueryStatement ;
    public final EObject ruleQuerySpecification() throws RecognitionException {
        EObject current = null;

        EObject this_QueryStatement_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:73:2: (this_QueryStatement_0= ruleQueryStatement )
            // InternalQueryParser.g:74:2: this_QueryStatement_0= ruleQueryStatement
            {

            		newCompositeNode(grammarAccess.getQuerySpecificationAccess().getQueryStatementParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_QueryStatement_0=ruleQueryStatement();

            state._fsp--;


            		current = this_QueryStatement_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleQuerySpecification"


    // $ANTLR start "entryRuleQueryStatement"
    // InternalQueryParser.g:85:1: entryRuleQueryStatement returns [EObject current=null] : iv_ruleQueryStatement= ruleQueryStatement EOF ;
    public final EObject entryRuleQueryStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryStatement = null;


        try {
            // InternalQueryParser.g:85:55: (iv_ruleQueryStatement= ruleQueryStatement EOF )
            // InternalQueryParser.g:86:2: iv_ruleQueryStatement= ruleQueryStatement EOF
            {
             newCompositeNode(grammarAccess.getQueryStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQueryStatement=ruleQueryStatement();

            state._fsp--;

             current =iv_ruleQueryStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQueryStatement"


    // $ANTLR start "ruleQueryStatement"
    // InternalQueryParser.g:92:1: ruleQueryStatement returns [EObject current=null] : (otherlv_0= Select ( (lv_qualifier_1_0= ruleSetQualifier ) )? ( (lv_projectedCharacteristicList_2_0= ruleProjectedCharacteristicList ) ) ( (lv_selectedEntityExpression_3_0= ruleSelectedEntityExpression ) ) (otherlv_4= Semicolon )? ) ;
    public final EObject ruleQueryStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_qualifier_1_0 = null;

        EObject lv_projectedCharacteristicList_2_0 = null;

        EObject lv_selectedEntityExpression_3_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:98:2: ( (otherlv_0= Select ( (lv_qualifier_1_0= ruleSetQualifier ) )? ( (lv_projectedCharacteristicList_2_0= ruleProjectedCharacteristicList ) ) ( (lv_selectedEntityExpression_3_0= ruleSelectedEntityExpression ) ) (otherlv_4= Semicolon )? ) )
            // InternalQueryParser.g:99:2: (otherlv_0= Select ( (lv_qualifier_1_0= ruleSetQualifier ) )? ( (lv_projectedCharacteristicList_2_0= ruleProjectedCharacteristicList ) ) ( (lv_selectedEntityExpression_3_0= ruleSelectedEntityExpression ) ) (otherlv_4= Semicolon )? )
            {
            // InternalQueryParser.g:99:2: (otherlv_0= Select ( (lv_qualifier_1_0= ruleSetQualifier ) )? ( (lv_projectedCharacteristicList_2_0= ruleProjectedCharacteristicList ) ) ( (lv_selectedEntityExpression_3_0= ruleSelectedEntityExpression ) ) (otherlv_4= Semicolon )? )
            // InternalQueryParser.g:100:3: otherlv_0= Select ( (lv_qualifier_1_0= ruleSetQualifier ) )? ( (lv_projectedCharacteristicList_2_0= ruleProjectedCharacteristicList ) ) ( (lv_selectedEntityExpression_3_0= ruleSelectedEntityExpression ) ) (otherlv_4= Semicolon )?
            {
            otherlv_0=(Token)match(input,Select,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getQueryStatementAccess().getSelectKeyword_0());
            		
            // InternalQueryParser.g:104:3: ( (lv_qualifier_1_0= ruleSetQualifier ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_KW_ALL||LA1_0==RULE_KW_DISTINCT) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalQueryParser.g:105:4: (lv_qualifier_1_0= ruleSetQualifier )
                    {
                    // InternalQueryParser.g:105:4: (lv_qualifier_1_0= ruleSetQualifier )
                    // InternalQueryParser.g:106:5: lv_qualifier_1_0= ruleSetQualifier
                    {

                    					newCompositeNode(grammarAccess.getQueryStatementAccess().getQualifierSetQualifierParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_qualifier_1_0=ruleSetQualifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQueryStatementRule());
                    					}
                    					set(
                    						current,
                    						"qualifier",
                    						lv_qualifier_1_0,
                    						"com.epistimis.uddl.query.Query.SetQualifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalQueryParser.g:123:3: ( (lv_projectedCharacteristicList_2_0= ruleProjectedCharacteristicList ) )
            // InternalQueryParser.g:124:4: (lv_projectedCharacteristicList_2_0= ruleProjectedCharacteristicList )
            {
            // InternalQueryParser.g:124:4: (lv_projectedCharacteristicList_2_0= ruleProjectedCharacteristicList )
            // InternalQueryParser.g:125:5: lv_projectedCharacteristicList_2_0= ruleProjectedCharacteristicList
            {

            					newCompositeNode(grammarAccess.getQueryStatementAccess().getProjectedCharacteristicListProjectedCharacteristicListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_projectedCharacteristicList_2_0=ruleProjectedCharacteristicList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryStatementRule());
            					}
            					set(
            						current,
            						"projectedCharacteristicList",
            						lv_projectedCharacteristicList_2_0,
            						"com.epistimis.uddl.query.Query.ProjectedCharacteristicList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryParser.g:142:3: ( (lv_selectedEntityExpression_3_0= ruleSelectedEntityExpression ) )
            // InternalQueryParser.g:143:4: (lv_selectedEntityExpression_3_0= ruleSelectedEntityExpression )
            {
            // InternalQueryParser.g:143:4: (lv_selectedEntityExpression_3_0= ruleSelectedEntityExpression )
            // InternalQueryParser.g:144:5: lv_selectedEntityExpression_3_0= ruleSelectedEntityExpression
            {

            					newCompositeNode(grammarAccess.getQueryStatementAccess().getSelectedEntityExpressionSelectedEntityExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_selectedEntityExpression_3_0=ruleSelectedEntityExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryStatementRule());
            					}
            					set(
            						current,
            						"selectedEntityExpression",
            						lv_selectedEntityExpression_3_0,
            						"com.epistimis.uddl.query.Query.SelectedEntityExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryParser.g:161:3: (otherlv_4= Semicolon )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Semicolon) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalQueryParser.g:162:4: otherlv_4= Semicolon
                    {
                    otherlv_4=(Token)match(input,Semicolon,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getQueryStatementAccess().getSemicolonKeyword_4());
                    			

                    }
                    break;

            }


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
    // $ANTLR end "ruleQueryStatement"


    // $ANTLR start "entryRuleSetQualifier"
    // InternalQueryParser.g:171:1: entryRuleSetQualifier returns [String current=null] : iv_ruleSetQualifier= ruleSetQualifier EOF ;
    public final String entryRuleSetQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSetQualifier = null;


        try {
            // InternalQueryParser.g:171:52: (iv_ruleSetQualifier= ruleSetQualifier EOF )
            // InternalQueryParser.g:172:2: iv_ruleSetQualifier= ruleSetQualifier EOF
            {
             newCompositeNode(grammarAccess.getSetQualifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetQualifier=ruleSetQualifier();

            state._fsp--;

             current =iv_ruleSetQualifier.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSetQualifier"


    // $ANTLR start "ruleSetQualifier"
    // InternalQueryParser.g:178:1: ruleSetQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_KW_DISTINCT_0= RULE_KW_DISTINCT | this_KW_ALL_1= RULE_KW_ALL ) ;
    public final AntlrDatatypeRuleToken ruleSetQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_KW_DISTINCT_0=null;
        Token this_KW_ALL_1=null;


        	enterRule();

        try {
            // InternalQueryParser.g:184:2: ( (this_KW_DISTINCT_0= RULE_KW_DISTINCT | this_KW_ALL_1= RULE_KW_ALL ) )
            // InternalQueryParser.g:185:2: (this_KW_DISTINCT_0= RULE_KW_DISTINCT | this_KW_ALL_1= RULE_KW_ALL )
            {
            // InternalQueryParser.g:185:2: (this_KW_DISTINCT_0= RULE_KW_DISTINCT | this_KW_ALL_1= RULE_KW_ALL )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_KW_DISTINCT) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_KW_ALL) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalQueryParser.g:186:3: this_KW_DISTINCT_0= RULE_KW_DISTINCT
                    {
                    this_KW_DISTINCT_0=(Token)match(input,RULE_KW_DISTINCT,FOLLOW_2); 

                    			current.merge(this_KW_DISTINCT_0);
                    		

                    			newLeafNode(this_KW_DISTINCT_0, grammarAccess.getSetQualifierAccess().getKW_DISTINCTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQueryParser.g:194:3: this_KW_ALL_1= RULE_KW_ALL
                    {
                    this_KW_ALL_1=(Token)match(input,RULE_KW_ALL,FOLLOW_2); 

                    			current.merge(this_KW_ALL_1);
                    		

                    			newLeafNode(this_KW_ALL_1, grammarAccess.getSetQualifierAccess().getKW_ALLTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleSetQualifier"


    // $ANTLR start "entryRuleProjectedCharacteristicList"
    // InternalQueryParser.g:205:1: entryRuleProjectedCharacteristicList returns [EObject current=null] : iv_ruleProjectedCharacteristicList= ruleProjectedCharacteristicList EOF ;
    public final EObject entryRuleProjectedCharacteristicList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectedCharacteristicList = null;


        try {
            // InternalQueryParser.g:205:68: (iv_ruleProjectedCharacteristicList= ruleProjectedCharacteristicList EOF )
            // InternalQueryParser.g:206:2: iv_ruleProjectedCharacteristicList= ruleProjectedCharacteristicList EOF
            {
             newCompositeNode(grammarAccess.getProjectedCharacteristicListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjectedCharacteristicList=ruleProjectedCharacteristicList();

            state._fsp--;

             current =iv_ruleProjectedCharacteristicList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProjectedCharacteristicList"


    // $ANTLR start "ruleProjectedCharacteristicList"
    // InternalQueryParser.g:212:1: ruleProjectedCharacteristicList returns [EObject current=null] : ( ( (lv_all_0_0= RULE_ALL_CHARACTERISTICS ) ) | ( ( (lv_characteristic_1_0= ruleProjectedCharacteristicExpression ) ) (this_COMMA_2= RULE_COMMA ( (lv_characteristic_3_0= ruleProjectedCharacteristicExpression ) ) )* ) ) ;
    public final EObject ruleProjectedCharacteristicList() throws RecognitionException {
        EObject current = null;

        Token lv_all_0_0=null;
        Token this_COMMA_2=null;
        EObject lv_characteristic_1_0 = null;

        EObject lv_characteristic_3_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:218:2: ( ( ( (lv_all_0_0= RULE_ALL_CHARACTERISTICS ) ) | ( ( (lv_characteristic_1_0= ruleProjectedCharacteristicExpression ) ) (this_COMMA_2= RULE_COMMA ( (lv_characteristic_3_0= ruleProjectedCharacteristicExpression ) ) )* ) ) )
            // InternalQueryParser.g:219:2: ( ( (lv_all_0_0= RULE_ALL_CHARACTERISTICS ) ) | ( ( (lv_characteristic_1_0= ruleProjectedCharacteristicExpression ) ) (this_COMMA_2= RULE_COMMA ( (lv_characteristic_3_0= ruleProjectedCharacteristicExpression ) ) )* ) )
            {
            // InternalQueryParser.g:219:2: ( ( (lv_all_0_0= RULE_ALL_CHARACTERISTICS ) ) | ( ( (lv_characteristic_1_0= ruleProjectedCharacteristicExpression ) ) (this_COMMA_2= RULE_COMMA ( (lv_characteristic_3_0= ruleProjectedCharacteristicExpression ) ) )* ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ALL_CHARACTERISTICS) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_IDENTIFIER) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalQueryParser.g:220:3: ( (lv_all_0_0= RULE_ALL_CHARACTERISTICS ) )
                    {
                    // InternalQueryParser.g:220:3: ( (lv_all_0_0= RULE_ALL_CHARACTERISTICS ) )
                    // InternalQueryParser.g:221:4: (lv_all_0_0= RULE_ALL_CHARACTERISTICS )
                    {
                    // InternalQueryParser.g:221:4: (lv_all_0_0= RULE_ALL_CHARACTERISTICS )
                    // InternalQueryParser.g:222:5: lv_all_0_0= RULE_ALL_CHARACTERISTICS
                    {
                    lv_all_0_0=(Token)match(input,RULE_ALL_CHARACTERISTICS,FOLLOW_2); 

                    					newLeafNode(lv_all_0_0, grammarAccess.getProjectedCharacteristicListAccess().getAllALL_CHARACTERISTICSTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getProjectedCharacteristicListRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"all",
                    						lv_all_0_0,
                    						"com.epistimis.uddl.query.Query.ALL_CHARACTERISTICS");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalQueryParser.g:239:3: ( ( (lv_characteristic_1_0= ruleProjectedCharacteristicExpression ) ) (this_COMMA_2= RULE_COMMA ( (lv_characteristic_3_0= ruleProjectedCharacteristicExpression ) ) )* )
                    {
                    // InternalQueryParser.g:239:3: ( ( (lv_characteristic_1_0= ruleProjectedCharacteristicExpression ) ) (this_COMMA_2= RULE_COMMA ( (lv_characteristic_3_0= ruleProjectedCharacteristicExpression ) ) )* )
                    // InternalQueryParser.g:240:4: ( (lv_characteristic_1_0= ruleProjectedCharacteristicExpression ) ) (this_COMMA_2= RULE_COMMA ( (lv_characteristic_3_0= ruleProjectedCharacteristicExpression ) ) )*
                    {
                    // InternalQueryParser.g:240:4: ( (lv_characteristic_1_0= ruleProjectedCharacteristicExpression ) )
                    // InternalQueryParser.g:241:5: (lv_characteristic_1_0= ruleProjectedCharacteristicExpression )
                    {
                    // InternalQueryParser.g:241:5: (lv_characteristic_1_0= ruleProjectedCharacteristicExpression )
                    // InternalQueryParser.g:242:6: lv_characteristic_1_0= ruleProjectedCharacteristicExpression
                    {

                    						newCompositeNode(grammarAccess.getProjectedCharacteristicListAccess().getCharacteristicProjectedCharacteristicExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_characteristic_1_0=ruleProjectedCharacteristicExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProjectedCharacteristicListRule());
                    						}
                    						add(
                    							current,
                    							"characteristic",
                    							lv_characteristic_1_0,
                    							"com.epistimis.uddl.query.Query.ProjectedCharacteristicExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQueryParser.g:259:4: (this_COMMA_2= RULE_COMMA ( (lv_characteristic_3_0= ruleProjectedCharacteristicExpression ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_COMMA) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalQueryParser.g:260:5: this_COMMA_2= RULE_COMMA ( (lv_characteristic_3_0= ruleProjectedCharacteristicExpression ) )
                    	    {
                    	    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_3); 

                    	    					newLeafNode(this_COMMA_2, grammarAccess.getProjectedCharacteristicListAccess().getCOMMATerminalRuleCall_1_1_0());
                    	    				
                    	    // InternalQueryParser.g:264:5: ( (lv_characteristic_3_0= ruleProjectedCharacteristicExpression ) )
                    	    // InternalQueryParser.g:265:6: (lv_characteristic_3_0= ruleProjectedCharacteristicExpression )
                    	    {
                    	    // InternalQueryParser.g:265:6: (lv_characteristic_3_0= ruleProjectedCharacteristicExpression )
                    	    // InternalQueryParser.g:266:7: lv_characteristic_3_0= ruleProjectedCharacteristicExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getProjectedCharacteristicListAccess().getCharacteristicProjectedCharacteristicExpressionParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_characteristic_3_0=ruleProjectedCharacteristicExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProjectedCharacteristicListRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"characteristic",
                    	    								lv_characteristic_3_0,
                    	    								"com.epistimis.uddl.query.Query.ProjectedCharacteristicExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


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
    // $ANTLR end "ruleProjectedCharacteristicList"


    // $ANTLR start "entryRuleProjectedCharacteristicExpression"
    // InternalQueryParser.g:289:1: entryRuleProjectedCharacteristicExpression returns [EObject current=null] : iv_ruleProjectedCharacteristicExpression= ruleProjectedCharacteristicExpression EOF ;
    public final EObject entryRuleProjectedCharacteristicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectedCharacteristicExpression = null;


        try {
            // InternalQueryParser.g:289:74: (iv_ruleProjectedCharacteristicExpression= ruleProjectedCharacteristicExpression EOF )
            // InternalQueryParser.g:290:2: iv_ruleProjectedCharacteristicExpression= ruleProjectedCharacteristicExpression EOF
            {
             newCompositeNode(grammarAccess.getProjectedCharacteristicExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjectedCharacteristicExpression=ruleProjectedCharacteristicExpression();

            state._fsp--;

             current =iv_ruleProjectedCharacteristicExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProjectedCharacteristicExpression"


    // $ANTLR start "ruleProjectedCharacteristicExpression"
    // InternalQueryParser.g:296:1: ruleProjectedCharacteristicExpression returns [EObject current=null] : (this_SelectedEntityCharacteristicWildcardReference_0= ruleSelectedEntityCharacteristicWildcardReference | this_ExplicitSelectedEntityCharacteristicReference_1= ruleExplicitSelectedEntityCharacteristicReference ) ;
    public final EObject ruleProjectedCharacteristicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SelectedEntityCharacteristicWildcardReference_0 = null;

        EObject this_ExplicitSelectedEntityCharacteristicReference_1 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:302:2: ( (this_SelectedEntityCharacteristicWildcardReference_0= ruleSelectedEntityCharacteristicWildcardReference | this_ExplicitSelectedEntityCharacteristicReference_1= ruleExplicitSelectedEntityCharacteristicReference ) )
            // InternalQueryParser.g:303:2: (this_SelectedEntityCharacteristicWildcardReference_0= ruleSelectedEntityCharacteristicWildcardReference | this_ExplicitSelectedEntityCharacteristicReference_1= ruleExplicitSelectedEntityCharacteristicReference )
            {
            // InternalQueryParser.g:303:2: (this_SelectedEntityCharacteristicWildcardReference_0= ruleSelectedEntityCharacteristicWildcardReference | this_ExplicitSelectedEntityCharacteristicReference_1= ruleExplicitSelectedEntityCharacteristicReference )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_IDENTIFIER) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||LA6_1==From||LA6_1==RULE_KW_AS||LA6_1==RULE_COMMA||LA6_1==RULE_IDENTIFIER) ) {
                    alt6=2;
                }
                else if ( (LA6_1==RULE_PERIOD) ) {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==RULE_IDENTIFIER) ) {
                        alt6=2;
                    }
                    else if ( (LA6_3==RULE_ALL_CHARACTERISTICS) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalQueryParser.g:304:3: this_SelectedEntityCharacteristicWildcardReference_0= ruleSelectedEntityCharacteristicWildcardReference
                    {

                    			newCompositeNode(grammarAccess.getProjectedCharacteristicExpressionAccess().getSelectedEntityCharacteristicWildcardReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelectedEntityCharacteristicWildcardReference_0=ruleSelectedEntityCharacteristicWildcardReference();

                    state._fsp--;


                    			current = this_SelectedEntityCharacteristicWildcardReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQueryParser.g:313:3: this_ExplicitSelectedEntityCharacteristicReference_1= ruleExplicitSelectedEntityCharacteristicReference
                    {

                    			newCompositeNode(grammarAccess.getProjectedCharacteristicExpressionAccess().getExplicitSelectedEntityCharacteristicReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExplicitSelectedEntityCharacteristicReference_1=ruleExplicitSelectedEntityCharacteristicReference();

                    state._fsp--;


                    			current = this_ExplicitSelectedEntityCharacteristicReference_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleProjectedCharacteristicExpression"


    // $ANTLR start "entryRuleSelectedEntityCharacteristicWildcardReference"
    // InternalQueryParser.g:325:1: entryRuleSelectedEntityCharacteristicWildcardReference returns [EObject current=null] : iv_ruleSelectedEntityCharacteristicWildcardReference= ruleSelectedEntityCharacteristicWildcardReference EOF ;
    public final EObject entryRuleSelectedEntityCharacteristicWildcardReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectedEntityCharacteristicWildcardReference = null;


        try {
            // InternalQueryParser.g:325:86: (iv_ruleSelectedEntityCharacteristicWildcardReference= ruleSelectedEntityCharacteristicWildcardReference EOF )
            // InternalQueryParser.g:326:2: iv_ruleSelectedEntityCharacteristicWildcardReference= ruleSelectedEntityCharacteristicWildcardReference EOF
            {
             newCompositeNode(grammarAccess.getSelectedEntityCharacteristicWildcardReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectedEntityCharacteristicWildcardReference=ruleSelectedEntityCharacteristicWildcardReference();

            state._fsp--;

             current =iv_ruleSelectedEntityCharacteristicWildcardReference; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectedEntityCharacteristicWildcardReference"


    // $ANTLR start "ruleSelectedEntityCharacteristicWildcardReference"
    // InternalQueryParser.g:332:1: ruleSelectedEntityCharacteristicWildcardReference returns [EObject current=null] : ( ( (lv_selectedEntity_0_0= ruleSelectedEntityReference ) ) this_PERIOD_1= RULE_PERIOD this_ALL_CHARACTERISTICS_2= RULE_ALL_CHARACTERISTICS ) ;
    public final EObject ruleSelectedEntityCharacteristicWildcardReference() throws RecognitionException {
        EObject current = null;

        Token this_PERIOD_1=null;
        Token this_ALL_CHARACTERISTICS_2=null;
        EObject lv_selectedEntity_0_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:338:2: ( ( ( (lv_selectedEntity_0_0= ruleSelectedEntityReference ) ) this_PERIOD_1= RULE_PERIOD this_ALL_CHARACTERISTICS_2= RULE_ALL_CHARACTERISTICS ) )
            // InternalQueryParser.g:339:2: ( ( (lv_selectedEntity_0_0= ruleSelectedEntityReference ) ) this_PERIOD_1= RULE_PERIOD this_ALL_CHARACTERISTICS_2= RULE_ALL_CHARACTERISTICS )
            {
            // InternalQueryParser.g:339:2: ( ( (lv_selectedEntity_0_0= ruleSelectedEntityReference ) ) this_PERIOD_1= RULE_PERIOD this_ALL_CHARACTERISTICS_2= RULE_ALL_CHARACTERISTICS )
            // InternalQueryParser.g:340:3: ( (lv_selectedEntity_0_0= ruleSelectedEntityReference ) ) this_PERIOD_1= RULE_PERIOD this_ALL_CHARACTERISTICS_2= RULE_ALL_CHARACTERISTICS
            {
            // InternalQueryParser.g:340:3: ( (lv_selectedEntity_0_0= ruleSelectedEntityReference ) )
            // InternalQueryParser.g:341:4: (lv_selectedEntity_0_0= ruleSelectedEntityReference )
            {
            // InternalQueryParser.g:341:4: (lv_selectedEntity_0_0= ruleSelectedEntityReference )
            // InternalQueryParser.g:342:5: lv_selectedEntity_0_0= ruleSelectedEntityReference
            {

            					newCompositeNode(grammarAccess.getSelectedEntityCharacteristicWildcardReferenceAccess().getSelectedEntitySelectedEntityReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_selectedEntity_0_0=ruleSelectedEntityReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectedEntityCharacteristicWildcardReferenceRule());
            					}
            					set(
            						current,
            						"selectedEntity",
            						lv_selectedEntity_0_0,
            						"com.epistimis.uddl.query.Query.SelectedEntityReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_PERIOD_1=(Token)match(input,RULE_PERIOD,FOLLOW_8); 

            			newLeafNode(this_PERIOD_1, grammarAccess.getSelectedEntityCharacteristicWildcardReferenceAccess().getPERIODTerminalRuleCall_1());
            		
            this_ALL_CHARACTERISTICS_2=(Token)match(input,RULE_ALL_CHARACTERISTICS,FOLLOW_2); 

            			newLeafNode(this_ALL_CHARACTERISTICS_2, grammarAccess.getSelectedEntityCharacteristicWildcardReferenceAccess().getALL_CHARACTERISTICSTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleSelectedEntityCharacteristicWildcardReference"


    // $ANTLR start "entryRuleExplicitSelectedEntityCharacteristicReference"
    // InternalQueryParser.g:371:1: entryRuleExplicitSelectedEntityCharacteristicReference returns [EObject current=null] : iv_ruleExplicitSelectedEntityCharacteristicReference= ruleExplicitSelectedEntityCharacteristicReference EOF ;
    public final EObject entryRuleExplicitSelectedEntityCharacteristicReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplicitSelectedEntityCharacteristicReference = null;


        try {
            // InternalQueryParser.g:371:86: (iv_ruleExplicitSelectedEntityCharacteristicReference= ruleExplicitSelectedEntityCharacteristicReference EOF )
            // InternalQueryParser.g:372:2: iv_ruleExplicitSelectedEntityCharacteristicReference= ruleExplicitSelectedEntityCharacteristicReference EOF
            {
             newCompositeNode(grammarAccess.getExplicitSelectedEntityCharacteristicReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExplicitSelectedEntityCharacteristicReference=ruleExplicitSelectedEntityCharacteristicReference();

            state._fsp--;

             current =iv_ruleExplicitSelectedEntityCharacteristicReference; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExplicitSelectedEntityCharacteristicReference"


    // $ANTLR start "ruleExplicitSelectedEntityCharacteristicReference"
    // InternalQueryParser.g:378:1: ruleExplicitSelectedEntityCharacteristicReference returns [EObject current=null] : ( ( (lv_selectedEntityCharacteristicReference_0_0= ruleSelectedEntityCharacteristicReference ) ) ( (this_KW_AS_1= RULE_KW_AS )? ( (lv_projectedCharacteristicAlias_2_0= ruleProjectedCharacteristicAlias ) ) )? ) ;
    public final EObject ruleExplicitSelectedEntityCharacteristicReference() throws RecognitionException {
        EObject current = null;

        Token this_KW_AS_1=null;
        EObject lv_selectedEntityCharacteristicReference_0_0 = null;

        EObject lv_projectedCharacteristicAlias_2_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:384:2: ( ( ( (lv_selectedEntityCharacteristicReference_0_0= ruleSelectedEntityCharacteristicReference ) ) ( (this_KW_AS_1= RULE_KW_AS )? ( (lv_projectedCharacteristicAlias_2_0= ruleProjectedCharacteristicAlias ) ) )? ) )
            // InternalQueryParser.g:385:2: ( ( (lv_selectedEntityCharacteristicReference_0_0= ruleSelectedEntityCharacteristicReference ) ) ( (this_KW_AS_1= RULE_KW_AS )? ( (lv_projectedCharacteristicAlias_2_0= ruleProjectedCharacteristicAlias ) ) )? )
            {
            // InternalQueryParser.g:385:2: ( ( (lv_selectedEntityCharacteristicReference_0_0= ruleSelectedEntityCharacteristicReference ) ) ( (this_KW_AS_1= RULE_KW_AS )? ( (lv_projectedCharacteristicAlias_2_0= ruleProjectedCharacteristicAlias ) ) )? )
            // InternalQueryParser.g:386:3: ( (lv_selectedEntityCharacteristicReference_0_0= ruleSelectedEntityCharacteristicReference ) ) ( (this_KW_AS_1= RULE_KW_AS )? ( (lv_projectedCharacteristicAlias_2_0= ruleProjectedCharacteristicAlias ) ) )?
            {
            // InternalQueryParser.g:386:3: ( (lv_selectedEntityCharacteristicReference_0_0= ruleSelectedEntityCharacteristicReference ) )
            // InternalQueryParser.g:387:4: (lv_selectedEntityCharacteristicReference_0_0= ruleSelectedEntityCharacteristicReference )
            {
            // InternalQueryParser.g:387:4: (lv_selectedEntityCharacteristicReference_0_0= ruleSelectedEntityCharacteristicReference )
            // InternalQueryParser.g:388:5: lv_selectedEntityCharacteristicReference_0_0= ruleSelectedEntityCharacteristicReference
            {

            					newCompositeNode(grammarAccess.getExplicitSelectedEntityCharacteristicReferenceAccess().getSelectedEntityCharacteristicReferenceSelectedEntityCharacteristicReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_selectedEntityCharacteristicReference_0_0=ruleSelectedEntityCharacteristicReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExplicitSelectedEntityCharacteristicReferenceRule());
            					}
            					set(
            						current,
            						"selectedEntityCharacteristicReference",
            						lv_selectedEntityCharacteristicReference_0_0,
            						"com.epistimis.uddl.query.Query.SelectedEntityCharacteristicReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryParser.g:405:3: ( (this_KW_AS_1= RULE_KW_AS )? ( (lv_projectedCharacteristicAlias_2_0= ruleProjectedCharacteristicAlias ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_KW_AS||LA8_0==RULE_IDENTIFIER) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalQueryParser.g:406:4: (this_KW_AS_1= RULE_KW_AS )? ( (lv_projectedCharacteristicAlias_2_0= ruleProjectedCharacteristicAlias ) )
                    {
                    // InternalQueryParser.g:406:4: (this_KW_AS_1= RULE_KW_AS )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_KW_AS) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalQueryParser.g:407:5: this_KW_AS_1= RULE_KW_AS
                            {
                            this_KW_AS_1=(Token)match(input,RULE_KW_AS,FOLLOW_10); 

                            					newLeafNode(this_KW_AS_1, grammarAccess.getExplicitSelectedEntityCharacteristicReferenceAccess().getKW_ASTerminalRuleCall_1_0());
                            				

                            }
                            break;

                    }

                    // InternalQueryParser.g:412:4: ( (lv_projectedCharacteristicAlias_2_0= ruleProjectedCharacteristicAlias ) )
                    // InternalQueryParser.g:413:5: (lv_projectedCharacteristicAlias_2_0= ruleProjectedCharacteristicAlias )
                    {
                    // InternalQueryParser.g:413:5: (lv_projectedCharacteristicAlias_2_0= ruleProjectedCharacteristicAlias )
                    // InternalQueryParser.g:414:6: lv_projectedCharacteristicAlias_2_0= ruleProjectedCharacteristicAlias
                    {

                    						newCompositeNode(grammarAccess.getExplicitSelectedEntityCharacteristicReferenceAccess().getProjectedCharacteristicAliasProjectedCharacteristicAliasParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_projectedCharacteristicAlias_2_0=ruleProjectedCharacteristicAlias();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExplicitSelectedEntityCharacteristicReferenceRule());
                    						}
                    						set(
                    							current,
                    							"projectedCharacteristicAlias",
                    							lv_projectedCharacteristicAlias_2_0,
                    							"com.epistimis.uddl.query.Query.ProjectedCharacteristicAlias");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleExplicitSelectedEntityCharacteristicReference"


    // $ANTLR start "entryRuleSelectedEntityExpression"
    // InternalQueryParser.g:436:1: entryRuleSelectedEntityExpression returns [EObject current=null] : iv_ruleSelectedEntityExpression= ruleSelectedEntityExpression EOF ;
    public final EObject entryRuleSelectedEntityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectedEntityExpression = null;


        try {
            // InternalQueryParser.g:436:65: (iv_ruleSelectedEntityExpression= ruleSelectedEntityExpression EOF )
            // InternalQueryParser.g:437:2: iv_ruleSelectedEntityExpression= ruleSelectedEntityExpression EOF
            {
             newCompositeNode(grammarAccess.getSelectedEntityExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectedEntityExpression=ruleSelectedEntityExpression();

            state._fsp--;

             current =iv_ruleSelectedEntityExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectedEntityExpression"


    // $ANTLR start "ruleSelectedEntityExpression"
    // InternalQueryParser.g:443:1: ruleSelectedEntityExpression returns [EObject current=null] : ( ( (lv_from_0_0= ruleFromClause ) ) ( (lv_where_1_0= ruleWhereClause ) )? ( (lv_orderBy_2_0= ruleOrderByClause ) )? ) ;
    public final EObject ruleSelectedEntityExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_from_0_0 = null;

        EObject lv_where_1_0 = null;

        EObject lv_orderBy_2_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:449:2: ( ( ( (lv_from_0_0= ruleFromClause ) ) ( (lv_where_1_0= ruleWhereClause ) )? ( (lv_orderBy_2_0= ruleOrderByClause ) )? ) )
            // InternalQueryParser.g:450:2: ( ( (lv_from_0_0= ruleFromClause ) ) ( (lv_where_1_0= ruleWhereClause ) )? ( (lv_orderBy_2_0= ruleOrderByClause ) )? )
            {
            // InternalQueryParser.g:450:2: ( ( (lv_from_0_0= ruleFromClause ) ) ( (lv_where_1_0= ruleWhereClause ) )? ( (lv_orderBy_2_0= ruleOrderByClause ) )? )
            // InternalQueryParser.g:451:3: ( (lv_from_0_0= ruleFromClause ) ) ( (lv_where_1_0= ruleWhereClause ) )? ( (lv_orderBy_2_0= ruleOrderByClause ) )?
            {
            // InternalQueryParser.g:451:3: ( (lv_from_0_0= ruleFromClause ) )
            // InternalQueryParser.g:452:4: (lv_from_0_0= ruleFromClause )
            {
            // InternalQueryParser.g:452:4: (lv_from_0_0= ruleFromClause )
            // InternalQueryParser.g:453:5: lv_from_0_0= ruleFromClause
            {

            					newCompositeNode(grammarAccess.getSelectedEntityExpressionAccess().getFromFromClauseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_from_0_0=ruleFromClause();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectedEntityExpressionRule());
            					}
            					set(
            						current,
            						"from",
            						lv_from_0_0,
            						"com.epistimis.uddl.query.Query.FromClause");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryParser.g:470:3: ( (lv_where_1_0= ruleWhereClause ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_KW_WHERE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalQueryParser.g:471:4: (lv_where_1_0= ruleWhereClause )
                    {
                    // InternalQueryParser.g:471:4: (lv_where_1_0= ruleWhereClause )
                    // InternalQueryParser.g:472:5: lv_where_1_0= ruleWhereClause
                    {

                    					newCompositeNode(grammarAccess.getSelectedEntityExpressionAccess().getWhereWhereClauseParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_where_1_0=ruleWhereClause();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectedEntityExpressionRule());
                    					}
                    					set(
                    						current,
                    						"where",
                    						lv_where_1_0,
                    						"com.epistimis.uddl.query.Query.WhereClause");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalQueryParser.g:489:3: ( (lv_orderBy_2_0= ruleOrderByClause ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_KW_ORDER) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalQueryParser.g:490:4: (lv_orderBy_2_0= ruleOrderByClause )
                    {
                    // InternalQueryParser.g:490:4: (lv_orderBy_2_0= ruleOrderByClause )
                    // InternalQueryParser.g:491:5: lv_orderBy_2_0= ruleOrderByClause
                    {

                    					newCompositeNode(grammarAccess.getSelectedEntityExpressionAccess().getOrderByOrderByClauseParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_orderBy_2_0=ruleOrderByClause();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectedEntityExpressionRule());
                    					}
                    					set(
                    						current,
                    						"orderBy",
                    						lv_orderBy_2_0,
                    						"com.epistimis.uddl.query.Query.OrderByClause");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleSelectedEntityExpression"


    // $ANTLR start "entryRuleFromClause"
    // InternalQueryParser.g:512:1: entryRuleFromClause returns [EObject current=null] : iv_ruleFromClause= ruleFromClause EOF ;
    public final EObject entryRuleFromClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClause = null;


        try {
            // InternalQueryParser.g:512:51: (iv_ruleFromClause= ruleFromClause EOF )
            // InternalQueryParser.g:513:2: iv_ruleFromClause= ruleFromClause EOF
            {
             newCompositeNode(grammarAccess.getFromClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFromClause=ruleFromClause();

            state._fsp--;

             current =iv_ruleFromClause; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFromClause"


    // $ANTLR start "ruleFromClause"
    // InternalQueryParser.g:519:1: ruleFromClause returns [EObject current=null] : (otherlv_0= From ( (lv_entity_1_0= ruleEntityExpression ) ) ) ;
    public final EObject ruleFromClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_entity_1_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:525:2: ( (otherlv_0= From ( (lv_entity_1_0= ruleEntityExpression ) ) ) )
            // InternalQueryParser.g:526:2: (otherlv_0= From ( (lv_entity_1_0= ruleEntityExpression ) ) )
            {
            // InternalQueryParser.g:526:2: (otherlv_0= From ( (lv_entity_1_0= ruleEntityExpression ) ) )
            // InternalQueryParser.g:527:3: otherlv_0= From ( (lv_entity_1_0= ruleEntityExpression ) )
            {
            otherlv_0=(Token)match(input,From,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFromClauseAccess().getFromKeyword_0());
            		
            // InternalQueryParser.g:531:3: ( (lv_entity_1_0= ruleEntityExpression ) )
            // InternalQueryParser.g:532:4: (lv_entity_1_0= ruleEntityExpression )
            {
            // InternalQueryParser.g:532:4: (lv_entity_1_0= ruleEntityExpression )
            // InternalQueryParser.g:533:5: lv_entity_1_0= ruleEntityExpression
            {

            					newCompositeNode(grammarAccess.getFromClauseAccess().getEntityEntityExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_entity_1_0=ruleEntityExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFromClauseRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_1_0,
            						"com.epistimis.uddl.query.Query.EntityExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleFromClause"


    // $ANTLR start "entryRuleEntityExpression"
    // InternalQueryParser.g:554:1: entryRuleEntityExpression returns [EObject current=null] : iv_ruleEntityExpression= ruleEntityExpression EOF ;
    public final EObject entryRuleEntityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityExpression = null;


        try {
            // InternalQueryParser.g:554:57: (iv_ruleEntityExpression= ruleEntityExpression EOF )
            // InternalQueryParser.g:555:2: iv_ruleEntityExpression= ruleEntityExpression EOF
            {
             newCompositeNode(grammarAccess.getEntityExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityExpression=ruleEntityExpression();

            state._fsp--;

             current =iv_ruleEntityExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntityExpression"


    // $ANTLR start "ruleEntityExpression"
    // InternalQueryParser.g:561:1: ruleEntityExpression returns [EObject current=null] : ( ( (lv_selectedEntity_0_0= ruleSelectedEntity ) ) ( (lv_eje_1_0= ruleEntityJoinExpression ) )* ) ;
    public final EObject ruleEntityExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_selectedEntity_0_0 = null;

        EObject lv_eje_1_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:567:2: ( ( ( (lv_selectedEntity_0_0= ruleSelectedEntity ) ) ( (lv_eje_1_0= ruleEntityJoinExpression ) )* ) )
            // InternalQueryParser.g:568:2: ( ( (lv_selectedEntity_0_0= ruleSelectedEntity ) ) ( (lv_eje_1_0= ruleEntityJoinExpression ) )* )
            {
            // InternalQueryParser.g:568:2: ( ( (lv_selectedEntity_0_0= ruleSelectedEntity ) ) ( (lv_eje_1_0= ruleEntityJoinExpression ) )* )
            // InternalQueryParser.g:569:3: ( (lv_selectedEntity_0_0= ruleSelectedEntity ) ) ( (lv_eje_1_0= ruleEntityJoinExpression ) )*
            {
            // InternalQueryParser.g:569:3: ( (lv_selectedEntity_0_0= ruleSelectedEntity ) )
            // InternalQueryParser.g:570:4: (lv_selectedEntity_0_0= ruleSelectedEntity )
            {
            // InternalQueryParser.g:570:4: (lv_selectedEntity_0_0= ruleSelectedEntity )
            // InternalQueryParser.g:571:5: lv_selectedEntity_0_0= ruleSelectedEntity
            {

            					newCompositeNode(grammarAccess.getEntityExpressionAccess().getSelectedEntitySelectedEntityParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_selectedEntity_0_0=ruleSelectedEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityExpressionRule());
            					}
            					set(
            						current,
            						"selectedEntity",
            						lv_selectedEntity_0_0,
            						"com.epistimis.uddl.query.Query.SelectedEntity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryParser.g:588:3: ( (lv_eje_1_0= ruleEntityJoinExpression ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_KW_JOIN) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalQueryParser.g:589:4: (lv_eje_1_0= ruleEntityJoinExpression )
            	    {
            	    // InternalQueryParser.g:589:4: (lv_eje_1_0= ruleEntityJoinExpression )
            	    // InternalQueryParser.g:590:5: lv_eje_1_0= ruleEntityJoinExpression
            	    {

            	    					newCompositeNode(grammarAccess.getEntityExpressionAccess().getEjeEntityJoinExpressionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_eje_1_0=ruleEntityJoinExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityExpressionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"eje",
            	    						lv_eje_1_0,
            	    						"com.epistimis.uddl.query.Query.EntityJoinExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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
    // $ANTLR end "ruleEntityExpression"


    // $ANTLR start "entryRuleSelectedEntity"
    // InternalQueryParser.g:611:1: entryRuleSelectedEntity returns [EObject current=null] : iv_ruleSelectedEntity= ruleSelectedEntity EOF ;
    public final EObject entryRuleSelectedEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectedEntity = null;


        try {
            // InternalQueryParser.g:611:55: (iv_ruleSelectedEntity= ruleSelectedEntity EOF )
            // InternalQueryParser.g:612:2: iv_ruleSelectedEntity= ruleSelectedEntity EOF
            {
             newCompositeNode(grammarAccess.getSelectedEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectedEntity=ruleSelectedEntity();

            state._fsp--;

             current =iv_ruleSelectedEntity; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectedEntity"


    // $ANTLR start "ruleSelectedEntity"
    // InternalQueryParser.g:618:1: ruleSelectedEntity returns [EObject current=null] : ( ( (lv_entityType_0_0= ruleEntityTypeReference ) ) ( (this_KW_AS_1= RULE_KW_AS )? ( (lv_selectedEntityAlias_2_0= ruleSelectedEntityAlias ) ) )? ) ;
    public final EObject ruleSelectedEntity() throws RecognitionException {
        EObject current = null;

        Token this_KW_AS_1=null;
        EObject lv_entityType_0_0 = null;

        EObject lv_selectedEntityAlias_2_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:624:2: ( ( ( (lv_entityType_0_0= ruleEntityTypeReference ) ) ( (this_KW_AS_1= RULE_KW_AS )? ( (lv_selectedEntityAlias_2_0= ruleSelectedEntityAlias ) ) )? ) )
            // InternalQueryParser.g:625:2: ( ( (lv_entityType_0_0= ruleEntityTypeReference ) ) ( (this_KW_AS_1= RULE_KW_AS )? ( (lv_selectedEntityAlias_2_0= ruleSelectedEntityAlias ) ) )? )
            {
            // InternalQueryParser.g:625:2: ( ( (lv_entityType_0_0= ruleEntityTypeReference ) ) ( (this_KW_AS_1= RULE_KW_AS )? ( (lv_selectedEntityAlias_2_0= ruleSelectedEntityAlias ) ) )? )
            // InternalQueryParser.g:626:3: ( (lv_entityType_0_0= ruleEntityTypeReference ) ) ( (this_KW_AS_1= RULE_KW_AS )? ( (lv_selectedEntityAlias_2_0= ruleSelectedEntityAlias ) ) )?
            {
            // InternalQueryParser.g:626:3: ( (lv_entityType_0_0= ruleEntityTypeReference ) )
            // InternalQueryParser.g:627:4: (lv_entityType_0_0= ruleEntityTypeReference )
            {
            // InternalQueryParser.g:627:4: (lv_entityType_0_0= ruleEntityTypeReference )
            // InternalQueryParser.g:628:5: lv_entityType_0_0= ruleEntityTypeReference
            {

            					newCompositeNode(grammarAccess.getSelectedEntityAccess().getEntityTypeEntityTypeReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_entityType_0_0=ruleEntityTypeReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectedEntityRule());
            					}
            					set(
            						current,
            						"entityType",
            						lv_entityType_0_0,
            						"com.epistimis.uddl.query.Query.EntityTypeReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryParser.g:645:3: ( (this_KW_AS_1= RULE_KW_AS )? ( (lv_selectedEntityAlias_2_0= ruleSelectedEntityAlias ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_KW_AS||LA13_0==RULE_IDENTIFIER) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalQueryParser.g:646:4: (this_KW_AS_1= RULE_KW_AS )? ( (lv_selectedEntityAlias_2_0= ruleSelectedEntityAlias ) )
                    {
                    // InternalQueryParser.g:646:4: (this_KW_AS_1= RULE_KW_AS )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_KW_AS) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalQueryParser.g:647:5: this_KW_AS_1= RULE_KW_AS
                            {
                            this_KW_AS_1=(Token)match(input,RULE_KW_AS,FOLLOW_10); 

                            					newLeafNode(this_KW_AS_1, grammarAccess.getSelectedEntityAccess().getKW_ASTerminalRuleCall_1_0());
                            				

                            }
                            break;

                    }

                    // InternalQueryParser.g:652:4: ( (lv_selectedEntityAlias_2_0= ruleSelectedEntityAlias ) )
                    // InternalQueryParser.g:653:5: (lv_selectedEntityAlias_2_0= ruleSelectedEntityAlias )
                    {
                    // InternalQueryParser.g:653:5: (lv_selectedEntityAlias_2_0= ruleSelectedEntityAlias )
                    // InternalQueryParser.g:654:6: lv_selectedEntityAlias_2_0= ruleSelectedEntityAlias
                    {

                    						newCompositeNode(grammarAccess.getSelectedEntityAccess().getSelectedEntityAliasSelectedEntityAliasParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_selectedEntityAlias_2_0=ruleSelectedEntityAlias();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectedEntityRule());
                    						}
                    						set(
                    							current,
                    							"selectedEntityAlias",
                    							lv_selectedEntityAlias_2_0,
                    							"com.epistimis.uddl.query.Query.SelectedEntityAlias");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleSelectedEntity"


    // $ANTLR start "entryRuleEntityJoinExpression"
    // InternalQueryParser.g:676:1: entryRuleEntityJoinExpression returns [EObject current=null] : iv_ruleEntityJoinExpression= ruleEntityJoinExpression EOF ;
    public final EObject entryRuleEntityJoinExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityJoinExpression = null;


        try {
            // InternalQueryParser.g:676:61: (iv_ruleEntityJoinExpression= ruleEntityJoinExpression EOF )
            // InternalQueryParser.g:677:2: iv_ruleEntityJoinExpression= ruleEntityJoinExpression EOF
            {
             newCompositeNode(grammarAccess.getEntityJoinExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityJoinExpression=ruleEntityJoinExpression();

            state._fsp--;

             current =iv_ruleEntityJoinExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntityJoinExpression"


    // $ANTLR start "ruleEntityJoinExpression"
    // InternalQueryParser.g:683:1: ruleEntityJoinExpression returns [EObject current=null] : (this_KW_JOIN_0= RULE_KW_JOIN ( (lv_joinEntity_1_0= ruleJoinEntity ) ) this_KW_ON_2= RULE_KW_ON ( (lv_entityJoinCriteria_3_0= ruleEntityJoinCriteria ) ) ) ;
    public final EObject ruleEntityJoinExpression() throws RecognitionException {
        EObject current = null;

        Token this_KW_JOIN_0=null;
        Token this_KW_ON_2=null;
        EObject lv_joinEntity_1_0 = null;

        EObject lv_entityJoinCriteria_3_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:689:2: ( (this_KW_JOIN_0= RULE_KW_JOIN ( (lv_joinEntity_1_0= ruleJoinEntity ) ) this_KW_ON_2= RULE_KW_ON ( (lv_entityJoinCriteria_3_0= ruleEntityJoinCriteria ) ) ) )
            // InternalQueryParser.g:690:2: (this_KW_JOIN_0= RULE_KW_JOIN ( (lv_joinEntity_1_0= ruleJoinEntity ) ) this_KW_ON_2= RULE_KW_ON ( (lv_entityJoinCriteria_3_0= ruleEntityJoinCriteria ) ) )
            {
            // InternalQueryParser.g:690:2: (this_KW_JOIN_0= RULE_KW_JOIN ( (lv_joinEntity_1_0= ruleJoinEntity ) ) this_KW_ON_2= RULE_KW_ON ( (lv_entityJoinCriteria_3_0= ruleEntityJoinCriteria ) ) )
            // InternalQueryParser.g:691:3: this_KW_JOIN_0= RULE_KW_JOIN ( (lv_joinEntity_1_0= ruleJoinEntity ) ) this_KW_ON_2= RULE_KW_ON ( (lv_entityJoinCriteria_3_0= ruleEntityJoinCriteria ) )
            {
            this_KW_JOIN_0=(Token)match(input,RULE_KW_JOIN,FOLLOW_13); 

            			newLeafNode(this_KW_JOIN_0, grammarAccess.getEntityJoinExpressionAccess().getKW_JOINTerminalRuleCall_0());
            		
            // InternalQueryParser.g:695:3: ( (lv_joinEntity_1_0= ruleJoinEntity ) )
            // InternalQueryParser.g:696:4: (lv_joinEntity_1_0= ruleJoinEntity )
            {
            // InternalQueryParser.g:696:4: (lv_joinEntity_1_0= ruleJoinEntity )
            // InternalQueryParser.g:697:5: lv_joinEntity_1_0= ruleJoinEntity
            {

            					newCompositeNode(grammarAccess.getEntityJoinExpressionAccess().getJoinEntityJoinEntityParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_joinEntity_1_0=ruleJoinEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityJoinExpressionRule());
            					}
            					set(
            						current,
            						"joinEntity",
            						lv_joinEntity_1_0,
            						"com.epistimis.uddl.query.Query.JoinEntity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_KW_ON_2=(Token)match(input,RULE_KW_ON,FOLLOW_3); 

            			newLeafNode(this_KW_ON_2, grammarAccess.getEntityJoinExpressionAccess().getKW_ONTerminalRuleCall_2());
            		
            // InternalQueryParser.g:718:3: ( (lv_entityJoinCriteria_3_0= ruleEntityJoinCriteria ) )
            // InternalQueryParser.g:719:4: (lv_entityJoinCriteria_3_0= ruleEntityJoinCriteria )
            {
            // InternalQueryParser.g:719:4: (lv_entityJoinCriteria_3_0= ruleEntityJoinCriteria )
            // InternalQueryParser.g:720:5: lv_entityJoinCriteria_3_0= ruleEntityJoinCriteria
            {

            					newCompositeNode(grammarAccess.getEntityJoinExpressionAccess().getEntityJoinCriteriaEntityJoinCriteriaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_entityJoinCriteria_3_0=ruleEntityJoinCriteria();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityJoinExpressionRule());
            					}
            					set(
            						current,
            						"entityJoinCriteria",
            						lv_entityJoinCriteria_3_0,
            						"com.epistimis.uddl.query.Query.EntityJoinCriteria");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleEntityJoinExpression"


    // $ANTLR start "entryRuleJoinEntity"
    // InternalQueryParser.g:741:1: entryRuleJoinEntity returns [EObject current=null] : iv_ruleJoinEntity= ruleJoinEntity EOF ;
    public final EObject entryRuleJoinEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinEntity = null;


        try {
            // InternalQueryParser.g:741:51: (iv_ruleJoinEntity= ruleJoinEntity EOF )
            // InternalQueryParser.g:742:2: iv_ruleJoinEntity= ruleJoinEntity EOF
            {
             newCompositeNode(grammarAccess.getJoinEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoinEntity=ruleJoinEntity();

            state._fsp--;

             current =iv_ruleJoinEntity; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJoinEntity"


    // $ANTLR start "ruleJoinEntity"
    // InternalQueryParser.g:748:1: ruleJoinEntity returns [EObject current=null] : this_SelectedEntity_0= ruleSelectedEntity ;
    public final EObject ruleJoinEntity() throws RecognitionException {
        EObject current = null;

        EObject this_SelectedEntity_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:754:2: (this_SelectedEntity_0= ruleSelectedEntity )
            // InternalQueryParser.g:755:2: this_SelectedEntity_0= ruleSelectedEntity
            {

            		newCompositeNode(grammarAccess.getJoinEntityAccess().getSelectedEntityParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_SelectedEntity_0=ruleSelectedEntity();

            state._fsp--;


            		current = this_SelectedEntity_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleJoinEntity"


    // $ANTLR start "entryRuleEntityJoinCriteria"
    // InternalQueryParser.g:766:1: entryRuleEntityJoinCriteria returns [EObject current=null] : iv_ruleEntityJoinCriteria= ruleEntityJoinCriteria EOF ;
    public final EObject entryRuleEntityJoinCriteria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityJoinCriteria = null;


        try {
            // InternalQueryParser.g:766:59: (iv_ruleEntityJoinCriteria= ruleEntityJoinCriteria EOF )
            // InternalQueryParser.g:767:2: iv_ruleEntityJoinCriteria= ruleEntityJoinCriteria EOF
            {
             newCompositeNode(grammarAccess.getEntityJoinCriteriaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityJoinCriteria=ruleEntityJoinCriteria();

            state._fsp--;

             current =iv_ruleEntityJoinCriteria; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntityJoinCriteria"


    // $ANTLR start "ruleEntityJoinCriteria"
    // InternalQueryParser.g:773:1: ruleEntityJoinCriteria returns [EObject current=null] : ( ( (lv_etcee_0_0= ruleEntityTypeCharacteristicEquivalenceExpression ) ) (this_KW_AND_1= RULE_KW_AND ( (lv_etcee_2_0= ruleEntityTypeCharacteristicEquivalenceExpression ) ) )* ) ;
    public final EObject ruleEntityJoinCriteria() throws RecognitionException {
        EObject current = null;

        Token this_KW_AND_1=null;
        EObject lv_etcee_0_0 = null;

        EObject lv_etcee_2_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:779:2: ( ( ( (lv_etcee_0_0= ruleEntityTypeCharacteristicEquivalenceExpression ) ) (this_KW_AND_1= RULE_KW_AND ( (lv_etcee_2_0= ruleEntityTypeCharacteristicEquivalenceExpression ) ) )* ) )
            // InternalQueryParser.g:780:2: ( ( (lv_etcee_0_0= ruleEntityTypeCharacteristicEquivalenceExpression ) ) (this_KW_AND_1= RULE_KW_AND ( (lv_etcee_2_0= ruleEntityTypeCharacteristicEquivalenceExpression ) ) )* )
            {
            // InternalQueryParser.g:780:2: ( ( (lv_etcee_0_0= ruleEntityTypeCharacteristicEquivalenceExpression ) ) (this_KW_AND_1= RULE_KW_AND ( (lv_etcee_2_0= ruleEntityTypeCharacteristicEquivalenceExpression ) ) )* )
            // InternalQueryParser.g:781:3: ( (lv_etcee_0_0= ruleEntityTypeCharacteristicEquivalenceExpression ) ) (this_KW_AND_1= RULE_KW_AND ( (lv_etcee_2_0= ruleEntityTypeCharacteristicEquivalenceExpression ) ) )*
            {
            // InternalQueryParser.g:781:3: ( (lv_etcee_0_0= ruleEntityTypeCharacteristicEquivalenceExpression ) )
            // InternalQueryParser.g:782:4: (lv_etcee_0_0= ruleEntityTypeCharacteristicEquivalenceExpression )
            {
            // InternalQueryParser.g:782:4: (lv_etcee_0_0= ruleEntityTypeCharacteristicEquivalenceExpression )
            // InternalQueryParser.g:783:5: lv_etcee_0_0= ruleEntityTypeCharacteristicEquivalenceExpression
            {

            					newCompositeNode(grammarAccess.getEntityJoinCriteriaAccess().getEtceeEntityTypeCharacteristicEquivalenceExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_etcee_0_0=ruleEntityTypeCharacteristicEquivalenceExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityJoinCriteriaRule());
            					}
            					add(
            						current,
            						"etcee",
            						lv_etcee_0_0,
            						"com.epistimis.uddl.query.Query.EntityTypeCharacteristicEquivalenceExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryParser.g:800:3: (this_KW_AND_1= RULE_KW_AND ( (lv_etcee_2_0= ruleEntityTypeCharacteristicEquivalenceExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_KW_AND) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalQueryParser.g:801:4: this_KW_AND_1= RULE_KW_AND ( (lv_etcee_2_0= ruleEntityTypeCharacteristicEquivalenceExpression ) )
            	    {
            	    this_KW_AND_1=(Token)match(input,RULE_KW_AND,FOLLOW_3); 

            	    				newLeafNode(this_KW_AND_1, grammarAccess.getEntityJoinCriteriaAccess().getKW_ANDTerminalRuleCall_1_0());
            	    			
            	    // InternalQueryParser.g:805:4: ( (lv_etcee_2_0= ruleEntityTypeCharacteristicEquivalenceExpression ) )
            	    // InternalQueryParser.g:806:5: (lv_etcee_2_0= ruleEntityTypeCharacteristicEquivalenceExpression )
            	    {
            	    // InternalQueryParser.g:806:5: (lv_etcee_2_0= ruleEntityTypeCharacteristicEquivalenceExpression )
            	    // InternalQueryParser.g:807:6: lv_etcee_2_0= ruleEntityTypeCharacteristicEquivalenceExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEntityJoinCriteriaAccess().getEtceeEntityTypeCharacteristicEquivalenceExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_etcee_2_0=ruleEntityTypeCharacteristicEquivalenceExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEntityJoinCriteriaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"etcee",
            	    							lv_etcee_2_0,
            	    							"com.epistimis.uddl.query.Query.EntityTypeCharacteristicEquivalenceExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


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
    // $ANTLR end "ruleEntityJoinCriteria"


    // $ANTLR start "entryRuleEntityTypeCharacteristicEquivalenceExpression"
    // InternalQueryParser.g:829:1: entryRuleEntityTypeCharacteristicEquivalenceExpression returns [EObject current=null] : iv_ruleEntityTypeCharacteristicEquivalenceExpression= ruleEntityTypeCharacteristicEquivalenceExpression EOF ;
    public final EObject entryRuleEntityTypeCharacteristicEquivalenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityTypeCharacteristicEquivalenceExpression = null;


        try {
            // InternalQueryParser.g:829:86: (iv_ruleEntityTypeCharacteristicEquivalenceExpression= ruleEntityTypeCharacteristicEquivalenceExpression EOF )
            // InternalQueryParser.g:830:2: iv_ruleEntityTypeCharacteristicEquivalenceExpression= ruleEntityTypeCharacteristicEquivalenceExpression EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeCharacteristicEquivalenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityTypeCharacteristicEquivalenceExpression=ruleEntityTypeCharacteristicEquivalenceExpression();

            state._fsp--;

             current =iv_ruleEntityTypeCharacteristicEquivalenceExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntityTypeCharacteristicEquivalenceExpression"


    // $ANTLR start "ruleEntityTypeCharacteristicEquivalenceExpression"
    // InternalQueryParser.g:836:1: ruleEntityTypeCharacteristicEquivalenceExpression returns [EObject current=null] : ( ( (lv_secr_0_0= ruleSelectedEntityCharacteristicReference ) ) (this_EQUALS_OPERATOR_1= RULE_EQUALS_OPERATOR ( (lv_selectedEntity_2_0= ruleSelectedEntityReference ) ) )? ) ;
    public final EObject ruleEntityTypeCharacteristicEquivalenceExpression() throws RecognitionException {
        EObject current = null;

        Token this_EQUALS_OPERATOR_1=null;
        EObject lv_secr_0_0 = null;

        EObject lv_selectedEntity_2_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:842:2: ( ( ( (lv_secr_0_0= ruleSelectedEntityCharacteristicReference ) ) (this_EQUALS_OPERATOR_1= RULE_EQUALS_OPERATOR ( (lv_selectedEntity_2_0= ruleSelectedEntityReference ) ) )? ) )
            // InternalQueryParser.g:843:2: ( ( (lv_secr_0_0= ruleSelectedEntityCharacteristicReference ) ) (this_EQUALS_OPERATOR_1= RULE_EQUALS_OPERATOR ( (lv_selectedEntity_2_0= ruleSelectedEntityReference ) ) )? )
            {
            // InternalQueryParser.g:843:2: ( ( (lv_secr_0_0= ruleSelectedEntityCharacteristicReference ) ) (this_EQUALS_OPERATOR_1= RULE_EQUALS_OPERATOR ( (lv_selectedEntity_2_0= ruleSelectedEntityReference ) ) )? )
            // InternalQueryParser.g:844:3: ( (lv_secr_0_0= ruleSelectedEntityCharacteristicReference ) ) (this_EQUALS_OPERATOR_1= RULE_EQUALS_OPERATOR ( (lv_selectedEntity_2_0= ruleSelectedEntityReference ) ) )?
            {
            // InternalQueryParser.g:844:3: ( (lv_secr_0_0= ruleSelectedEntityCharacteristicReference ) )
            // InternalQueryParser.g:845:4: (lv_secr_0_0= ruleSelectedEntityCharacteristicReference )
            {
            // InternalQueryParser.g:845:4: (lv_secr_0_0= ruleSelectedEntityCharacteristicReference )
            // InternalQueryParser.g:846:5: lv_secr_0_0= ruleSelectedEntityCharacteristicReference
            {

            					newCompositeNode(grammarAccess.getEntityTypeCharacteristicEquivalenceExpressionAccess().getSecrSelectedEntityCharacteristicReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_secr_0_0=ruleSelectedEntityCharacteristicReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityTypeCharacteristicEquivalenceExpressionRule());
            					}
            					set(
            						current,
            						"secr",
            						lv_secr_0_0,
            						"com.epistimis.uddl.query.Query.SelectedEntityCharacteristicReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryParser.g:863:3: (this_EQUALS_OPERATOR_1= RULE_EQUALS_OPERATOR ( (lv_selectedEntity_2_0= ruleSelectedEntityReference ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_EQUALS_OPERATOR) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalQueryParser.g:864:4: this_EQUALS_OPERATOR_1= RULE_EQUALS_OPERATOR ( (lv_selectedEntity_2_0= ruleSelectedEntityReference ) )
                    {
                    this_EQUALS_OPERATOR_1=(Token)match(input,RULE_EQUALS_OPERATOR,FOLLOW_13); 

                    				newLeafNode(this_EQUALS_OPERATOR_1, grammarAccess.getEntityTypeCharacteristicEquivalenceExpressionAccess().getEQUALS_OPERATORTerminalRuleCall_1_0());
                    			
                    // InternalQueryParser.g:868:4: ( (lv_selectedEntity_2_0= ruleSelectedEntityReference ) )
                    // InternalQueryParser.g:869:5: (lv_selectedEntity_2_0= ruleSelectedEntityReference )
                    {
                    // InternalQueryParser.g:869:5: (lv_selectedEntity_2_0= ruleSelectedEntityReference )
                    // InternalQueryParser.g:870:6: lv_selectedEntity_2_0= ruleSelectedEntityReference
                    {

                    						newCompositeNode(grammarAccess.getEntityTypeCharacteristicEquivalenceExpressionAccess().getSelectedEntitySelectedEntityReferenceParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_selectedEntity_2_0=ruleSelectedEntityReference();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityTypeCharacteristicEquivalenceExpressionRule());
                    						}
                    						set(
                    							current,
                    							"selectedEntity",
                    							lv_selectedEntity_2_0,
                    							"com.epistimis.uddl.query.Query.SelectedEntityReference");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleEntityTypeCharacteristicEquivalenceExpression"


    // $ANTLR start "entryRuleSelectedEntityCharacteristicReference"
    // InternalQueryParser.g:892:1: entryRuleSelectedEntityCharacteristicReference returns [EObject current=null] : iv_ruleSelectedEntityCharacteristicReference= ruleSelectedEntityCharacteristicReference EOF ;
    public final EObject entryRuleSelectedEntityCharacteristicReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectedEntityCharacteristicReference = null;


        try {
            // InternalQueryParser.g:892:78: (iv_ruleSelectedEntityCharacteristicReference= ruleSelectedEntityCharacteristicReference EOF )
            // InternalQueryParser.g:893:2: iv_ruleSelectedEntityCharacteristicReference= ruleSelectedEntityCharacteristicReference EOF
            {
             newCompositeNode(grammarAccess.getSelectedEntityCharacteristicReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectedEntityCharacteristicReference=ruleSelectedEntityCharacteristicReference();

            state._fsp--;

             current =iv_ruleSelectedEntityCharacteristicReference; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectedEntityCharacteristicReference"


    // $ANTLR start "ruleSelectedEntityCharacteristicReference"
    // InternalQueryParser.g:899:1: ruleSelectedEntityCharacteristicReference returns [EObject current=null] : ( ( ( (lv_selectedEntity_0_0= ruleSelectedEntityReference ) ) this_PERIOD_1= RULE_PERIOD )? ( (lv_characteristic_2_0= ruleCharacteristicReference ) ) ) ;
    public final EObject ruleSelectedEntityCharacteristicReference() throws RecognitionException {
        EObject current = null;

        Token this_PERIOD_1=null;
        EObject lv_selectedEntity_0_0 = null;

        EObject lv_characteristic_2_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:905:2: ( ( ( ( (lv_selectedEntity_0_0= ruleSelectedEntityReference ) ) this_PERIOD_1= RULE_PERIOD )? ( (lv_characteristic_2_0= ruleCharacteristicReference ) ) ) )
            // InternalQueryParser.g:906:2: ( ( ( (lv_selectedEntity_0_0= ruleSelectedEntityReference ) ) this_PERIOD_1= RULE_PERIOD )? ( (lv_characteristic_2_0= ruleCharacteristicReference ) ) )
            {
            // InternalQueryParser.g:906:2: ( ( ( (lv_selectedEntity_0_0= ruleSelectedEntityReference ) ) this_PERIOD_1= RULE_PERIOD )? ( (lv_characteristic_2_0= ruleCharacteristicReference ) ) )
            // InternalQueryParser.g:907:3: ( ( (lv_selectedEntity_0_0= ruleSelectedEntityReference ) ) this_PERIOD_1= RULE_PERIOD )? ( (lv_characteristic_2_0= ruleCharacteristicReference ) )
            {
            // InternalQueryParser.g:907:3: ( ( (lv_selectedEntity_0_0= ruleSelectedEntityReference ) ) this_PERIOD_1= RULE_PERIOD )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_IDENTIFIER) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==RULE_PERIOD) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalQueryParser.g:908:4: ( (lv_selectedEntity_0_0= ruleSelectedEntityReference ) ) this_PERIOD_1= RULE_PERIOD
                    {
                    // InternalQueryParser.g:908:4: ( (lv_selectedEntity_0_0= ruleSelectedEntityReference ) )
                    // InternalQueryParser.g:909:5: (lv_selectedEntity_0_0= ruleSelectedEntityReference )
                    {
                    // InternalQueryParser.g:909:5: (lv_selectedEntity_0_0= ruleSelectedEntityReference )
                    // InternalQueryParser.g:910:6: lv_selectedEntity_0_0= ruleSelectedEntityReference
                    {

                    						newCompositeNode(grammarAccess.getSelectedEntityCharacteristicReferenceAccess().getSelectedEntitySelectedEntityReferenceParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_selectedEntity_0_0=ruleSelectedEntityReference();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectedEntityCharacteristicReferenceRule());
                    						}
                    						set(
                    							current,
                    							"selectedEntity",
                    							lv_selectedEntity_0_0,
                    							"com.epistimis.uddl.query.Query.SelectedEntityReference");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_PERIOD_1=(Token)match(input,RULE_PERIOD,FOLLOW_3); 

                    				newLeafNode(this_PERIOD_1, grammarAccess.getSelectedEntityCharacteristicReferenceAccess().getPERIODTerminalRuleCall_0_1());
                    			

                    }
                    break;

            }

            // InternalQueryParser.g:932:3: ( (lv_characteristic_2_0= ruleCharacteristicReference ) )
            // InternalQueryParser.g:933:4: (lv_characteristic_2_0= ruleCharacteristicReference )
            {
            // InternalQueryParser.g:933:4: (lv_characteristic_2_0= ruleCharacteristicReference )
            // InternalQueryParser.g:934:5: lv_characteristic_2_0= ruleCharacteristicReference
            {

            					newCompositeNode(grammarAccess.getSelectedEntityCharacteristicReferenceAccess().getCharacteristicCharacteristicReferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_characteristic_2_0=ruleCharacteristicReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectedEntityCharacteristicReferenceRule());
            					}
            					set(
            						current,
            						"characteristic",
            						lv_characteristic_2_0,
            						"com.epistimis.uddl.query.Query.CharacteristicReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleSelectedEntityCharacteristicReference"


    // $ANTLR start "entryRuleSelectedEntityReference"
    // InternalQueryParser.g:955:1: entryRuleSelectedEntityReference returns [EObject current=null] : iv_ruleSelectedEntityReference= ruleSelectedEntityReference EOF ;
    public final EObject entryRuleSelectedEntityReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectedEntityReference = null;


        try {
            // InternalQueryParser.g:955:64: (iv_ruleSelectedEntityReference= ruleSelectedEntityReference EOF )
            // InternalQueryParser.g:956:2: iv_ruleSelectedEntityReference= ruleSelectedEntityReference EOF
            {
             newCompositeNode(grammarAccess.getSelectedEntityReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectedEntityReference=ruleSelectedEntityReference();

            state._fsp--;

             current =iv_ruleSelectedEntityReference; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectedEntityReference"


    // $ANTLR start "ruleSelectedEntityReference"
    // InternalQueryParser.g:962:1: ruleSelectedEntityReference returns [EObject current=null] : this_QueryIdentifier_0= ruleQueryIdentifier ;
    public final EObject ruleSelectedEntityReference() throws RecognitionException {
        EObject current = null;

        EObject this_QueryIdentifier_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:968:2: (this_QueryIdentifier_0= ruleQueryIdentifier )
            // InternalQueryParser.g:969:2: this_QueryIdentifier_0= ruleQueryIdentifier
            {

            		newCompositeNode(grammarAccess.getSelectedEntityReferenceAccess().getQueryIdentifierParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_QueryIdentifier_0=ruleQueryIdentifier();

            state._fsp--;


            		current = this_QueryIdentifier_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleSelectedEntityReference"


    // $ANTLR start "entryRuleWhereClause"
    // InternalQueryParser.g:980:1: entryRuleWhereClause returns [EObject current=null] : iv_ruleWhereClause= ruleWhereClause EOF ;
    public final EObject entryRuleWhereClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereClause = null;


        try {
            // InternalQueryParser.g:980:52: (iv_ruleWhereClause= ruleWhereClause EOF )
            // InternalQueryParser.g:981:2: iv_ruleWhereClause= ruleWhereClause EOF
            {
             newCompositeNode(grammarAccess.getWhereClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhereClause=ruleWhereClause();

            state._fsp--;

             current =iv_ruleWhereClause; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWhereClause"


    // $ANTLR start "ruleWhereClause"
    // InternalQueryParser.g:987:1: ruleWhereClause returns [EObject current=null] : (this_KW_WHERE_0= RULE_KW_WHERE ( (lv_criteria_1_0= ruleCriteria ) ) ) ;
    public final EObject ruleWhereClause() throws RecognitionException {
        EObject current = null;

        Token this_KW_WHERE_0=null;
        EObject lv_criteria_1_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:993:2: ( (this_KW_WHERE_0= RULE_KW_WHERE ( (lv_criteria_1_0= ruleCriteria ) ) ) )
            // InternalQueryParser.g:994:2: (this_KW_WHERE_0= RULE_KW_WHERE ( (lv_criteria_1_0= ruleCriteria ) ) )
            {
            // InternalQueryParser.g:994:2: (this_KW_WHERE_0= RULE_KW_WHERE ( (lv_criteria_1_0= ruleCriteria ) ) )
            // InternalQueryParser.g:995:3: this_KW_WHERE_0= RULE_KW_WHERE ( (lv_criteria_1_0= ruleCriteria ) )
            {
            this_KW_WHERE_0=(Token)match(input,RULE_KW_WHERE,FOLLOW_18); 

            			newLeafNode(this_KW_WHERE_0, grammarAccess.getWhereClauseAccess().getKW_WHERETerminalRuleCall_0());
            		
            // InternalQueryParser.g:999:3: ( (lv_criteria_1_0= ruleCriteria ) )
            // InternalQueryParser.g:1000:4: (lv_criteria_1_0= ruleCriteria )
            {
            // InternalQueryParser.g:1000:4: (lv_criteria_1_0= ruleCriteria )
            // InternalQueryParser.g:1001:5: lv_criteria_1_0= ruleCriteria
            {

            					newCompositeNode(grammarAccess.getWhereClauseAccess().getCriteriaCriteriaParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_criteria_1_0=ruleCriteria();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhereClauseRule());
            					}
            					set(
            						current,
            						"criteria",
            						lv_criteria_1_0,
            						"com.epistimis.uddl.query.Query.Criteria");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleWhereClause"


    // $ANTLR start "entryRuleCriteria"
    // InternalQueryParser.g:1022:1: entryRuleCriteria returns [EObject current=null] : iv_ruleCriteria= ruleCriteria EOF ;
    public final EObject entryRuleCriteria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCriteria = null;


        try {
            // InternalQueryParser.g:1022:49: (iv_ruleCriteria= ruleCriteria EOF )
            // InternalQueryParser.g:1023:2: iv_ruleCriteria= ruleCriteria EOF
            {
             newCompositeNode(grammarAccess.getCriteriaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCriteria=ruleCriteria();

            state._fsp--;

             current =iv_ruleCriteria; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCriteria"


    // $ANTLR start "ruleCriteria"
    // InternalQueryParser.g:1029:1: ruleCriteria returns [EObject current=null] : this_BooleanExpression_0= ruleBooleanExpression ;
    public final EObject ruleCriteria() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanExpression_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:1035:2: (this_BooleanExpression_0= ruleBooleanExpression )
            // InternalQueryParser.g:1036:2: this_BooleanExpression_0= ruleBooleanExpression
            {

            		newCompositeNode(grammarAccess.getCriteriaAccess().getBooleanExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_BooleanExpression_0=ruleBooleanExpression();

            state._fsp--;


            		current = this_BooleanExpression_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleCriteria"


    // $ANTLR start "entryRuleOrderByClause"
    // InternalQueryParser.g:1047:1: entryRuleOrderByClause returns [EObject current=null] : iv_ruleOrderByClause= ruleOrderByClause EOF ;
    public final EObject entryRuleOrderByClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderByClause = null;


        try {
            // InternalQueryParser.g:1047:54: (iv_ruleOrderByClause= ruleOrderByClause EOF )
            // InternalQueryParser.g:1048:2: iv_ruleOrderByClause= ruleOrderByClause EOF
            {
             newCompositeNode(grammarAccess.getOrderByClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrderByClause=ruleOrderByClause();

            state._fsp--;

             current =iv_ruleOrderByClause; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrderByClause"


    // $ANTLR start "ruleOrderByClause"
    // InternalQueryParser.g:1054:1: ruleOrderByClause returns [EObject current=null] : (this_KW_ORDER_0= RULE_KW_ORDER this_KW_BY_1= RULE_KW_BY ( (lv_orderingExpression_2_0= ruleOrderingExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_orderingExpression_4_0= ruleOrderingExpression ) ) )* ) ;
    public final EObject ruleOrderByClause() throws RecognitionException {
        EObject current = null;

        Token this_KW_ORDER_0=null;
        Token this_KW_BY_1=null;
        Token this_COMMA_3=null;
        EObject lv_orderingExpression_2_0 = null;

        EObject lv_orderingExpression_4_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:1060:2: ( (this_KW_ORDER_0= RULE_KW_ORDER this_KW_BY_1= RULE_KW_BY ( (lv_orderingExpression_2_0= ruleOrderingExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_orderingExpression_4_0= ruleOrderingExpression ) ) )* ) )
            // InternalQueryParser.g:1061:2: (this_KW_ORDER_0= RULE_KW_ORDER this_KW_BY_1= RULE_KW_BY ( (lv_orderingExpression_2_0= ruleOrderingExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_orderingExpression_4_0= ruleOrderingExpression ) ) )* )
            {
            // InternalQueryParser.g:1061:2: (this_KW_ORDER_0= RULE_KW_ORDER this_KW_BY_1= RULE_KW_BY ( (lv_orderingExpression_2_0= ruleOrderingExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_orderingExpression_4_0= ruleOrderingExpression ) ) )* )
            // InternalQueryParser.g:1062:3: this_KW_ORDER_0= RULE_KW_ORDER this_KW_BY_1= RULE_KW_BY ( (lv_orderingExpression_2_0= ruleOrderingExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_orderingExpression_4_0= ruleOrderingExpression ) ) )*
            {
            this_KW_ORDER_0=(Token)match(input,RULE_KW_ORDER,FOLLOW_19); 

            			newLeafNode(this_KW_ORDER_0, grammarAccess.getOrderByClauseAccess().getKW_ORDERTerminalRuleCall_0());
            		
            this_KW_BY_1=(Token)match(input,RULE_KW_BY,FOLLOW_13); 

            			newLeafNode(this_KW_BY_1, grammarAccess.getOrderByClauseAccess().getKW_BYTerminalRuleCall_1());
            		
            // InternalQueryParser.g:1070:3: ( (lv_orderingExpression_2_0= ruleOrderingExpression ) )
            // InternalQueryParser.g:1071:4: (lv_orderingExpression_2_0= ruleOrderingExpression )
            {
            // InternalQueryParser.g:1071:4: (lv_orderingExpression_2_0= ruleOrderingExpression )
            // InternalQueryParser.g:1072:5: lv_orderingExpression_2_0= ruleOrderingExpression
            {

            					newCompositeNode(grammarAccess.getOrderByClauseAccess().getOrderingExpressionOrderingExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_orderingExpression_2_0=ruleOrderingExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderByClauseRule());
            					}
            					add(
            						current,
            						"orderingExpression",
            						lv_orderingExpression_2_0,
            						"com.epistimis.uddl.query.Query.OrderingExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryParser.g:1089:3: (this_COMMA_3= RULE_COMMA ( (lv_orderingExpression_4_0= ruleOrderingExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalQueryParser.g:1090:4: this_COMMA_3= RULE_COMMA ( (lv_orderingExpression_4_0= ruleOrderingExpression ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_13); 

            	    				newLeafNode(this_COMMA_3, grammarAccess.getOrderByClauseAccess().getCOMMATerminalRuleCall_3_0());
            	    			
            	    // InternalQueryParser.g:1094:4: ( (lv_orderingExpression_4_0= ruleOrderingExpression ) )
            	    // InternalQueryParser.g:1095:5: (lv_orderingExpression_4_0= ruleOrderingExpression )
            	    {
            	    // InternalQueryParser.g:1095:5: (lv_orderingExpression_4_0= ruleOrderingExpression )
            	    // InternalQueryParser.g:1096:6: lv_orderingExpression_4_0= ruleOrderingExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrderByClauseAccess().getOrderingExpressionOrderingExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_orderingExpression_4_0=ruleOrderingExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrderByClauseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"orderingExpression",
            	    							lv_orderingExpression_4_0,
            	    							"com.epistimis.uddl.query.Query.OrderingExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


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
    // $ANTLR end "ruleOrderByClause"


    // $ANTLR start "entryRuleOrderingExpression"
    // InternalQueryParser.g:1118:1: entryRuleOrderingExpression returns [EObject current=null] : iv_ruleOrderingExpression= ruleOrderingExpression EOF ;
    public final EObject entryRuleOrderingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderingExpression = null;


        try {
            // InternalQueryParser.g:1118:59: (iv_ruleOrderingExpression= ruleOrderingExpression EOF )
            // InternalQueryParser.g:1119:2: iv_ruleOrderingExpression= ruleOrderingExpression EOF
            {
             newCompositeNode(grammarAccess.getOrderingExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrderingExpression=ruleOrderingExpression();

            state._fsp--;

             current =iv_ruleOrderingExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrderingExpression"


    // $ANTLR start "ruleOrderingExpression"
    // InternalQueryParser.g:1125:1: ruleOrderingExpression returns [EObject current=null] : ( ( (lv_characteristic_0_0= ruleProjectedCharacteristicReference ) ) ( (lv_orderingType_1_0= ruleOrderingType ) )? ) ;
    public final EObject ruleOrderingExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_characteristic_0_0 = null;

        AntlrDatatypeRuleToken lv_orderingType_1_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:1131:2: ( ( ( (lv_characteristic_0_0= ruleProjectedCharacteristicReference ) ) ( (lv_orderingType_1_0= ruleOrderingType ) )? ) )
            // InternalQueryParser.g:1132:2: ( ( (lv_characteristic_0_0= ruleProjectedCharacteristicReference ) ) ( (lv_orderingType_1_0= ruleOrderingType ) )? )
            {
            // InternalQueryParser.g:1132:2: ( ( (lv_characteristic_0_0= ruleProjectedCharacteristicReference ) ) ( (lv_orderingType_1_0= ruleOrderingType ) )? )
            // InternalQueryParser.g:1133:3: ( (lv_characteristic_0_0= ruleProjectedCharacteristicReference ) ) ( (lv_orderingType_1_0= ruleOrderingType ) )?
            {
            // InternalQueryParser.g:1133:3: ( (lv_characteristic_0_0= ruleProjectedCharacteristicReference ) )
            // InternalQueryParser.g:1134:4: (lv_characteristic_0_0= ruleProjectedCharacteristicReference )
            {
            // InternalQueryParser.g:1134:4: (lv_characteristic_0_0= ruleProjectedCharacteristicReference )
            // InternalQueryParser.g:1135:5: lv_characteristic_0_0= ruleProjectedCharacteristicReference
            {

            					newCompositeNode(grammarAccess.getOrderingExpressionAccess().getCharacteristicProjectedCharacteristicReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_characteristic_0_0=ruleProjectedCharacteristicReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderingExpressionRule());
            					}
            					set(
            						current,
            						"characteristic",
            						lv_characteristic_0_0,
            						"com.epistimis.uddl.query.Query.ProjectedCharacteristicReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryParser.g:1152:3: ( (lv_orderingType_1_0= ruleOrderingType ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_KW_ASC && LA18_0<=RULE_KW_DESC)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalQueryParser.g:1153:4: (lv_orderingType_1_0= ruleOrderingType )
                    {
                    // InternalQueryParser.g:1153:4: (lv_orderingType_1_0= ruleOrderingType )
                    // InternalQueryParser.g:1154:5: lv_orderingType_1_0= ruleOrderingType
                    {

                    					newCompositeNode(grammarAccess.getOrderingExpressionAccess().getOrderingTypeOrderingTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_orderingType_1_0=ruleOrderingType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOrderingExpressionRule());
                    					}
                    					set(
                    						current,
                    						"orderingType",
                    						lv_orderingType_1_0,
                    						"com.epistimis.uddl.query.Query.OrderingType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleOrderingExpression"


    // $ANTLR start "entryRuleProjectedCharacteristicReference"
    // InternalQueryParser.g:1175:1: entryRuleProjectedCharacteristicReference returns [EObject current=null] : iv_ruleProjectedCharacteristicReference= ruleProjectedCharacteristicReference EOF ;
    public final EObject entryRuleProjectedCharacteristicReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectedCharacteristicReference = null;


        try {
            // InternalQueryParser.g:1175:73: (iv_ruleProjectedCharacteristicReference= ruleProjectedCharacteristicReference EOF )
            // InternalQueryParser.g:1176:2: iv_ruleProjectedCharacteristicReference= ruleProjectedCharacteristicReference EOF
            {
             newCompositeNode(grammarAccess.getProjectedCharacteristicReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjectedCharacteristicReference=ruleProjectedCharacteristicReference();

            state._fsp--;

             current =iv_ruleProjectedCharacteristicReference; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProjectedCharacteristicReference"


    // $ANTLR start "ruleProjectedCharacteristicReference"
    // InternalQueryParser.g:1182:1: ruleProjectedCharacteristicReference returns [EObject current=null] : (this_QualifiedProjectedCharacteristicReference_0= ruleQualifiedProjectedCharacteristicReference | this_UnqualifiedProjectedCharacteristicReferenceOrAlias_1= ruleUnqualifiedProjectedCharacteristicReferenceOrAlias ) ;
    public final EObject ruleProjectedCharacteristicReference() throws RecognitionException {
        EObject current = null;

        EObject this_QualifiedProjectedCharacteristicReference_0 = null;

        EObject this_UnqualifiedProjectedCharacteristicReferenceOrAlias_1 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:1188:2: ( (this_QualifiedProjectedCharacteristicReference_0= ruleQualifiedProjectedCharacteristicReference | this_UnqualifiedProjectedCharacteristicReferenceOrAlias_1= ruleUnqualifiedProjectedCharacteristicReferenceOrAlias ) )
            // InternalQueryParser.g:1189:2: (this_QualifiedProjectedCharacteristicReference_0= ruleQualifiedProjectedCharacteristicReference | this_UnqualifiedProjectedCharacteristicReferenceOrAlias_1= ruleUnqualifiedProjectedCharacteristicReferenceOrAlias )
            {
            // InternalQueryParser.g:1189:2: (this_QualifiedProjectedCharacteristicReference_0= ruleQualifiedProjectedCharacteristicReference | this_UnqualifiedProjectedCharacteristicReferenceOrAlias_1= ruleUnqualifiedProjectedCharacteristicReferenceOrAlias )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_IDENTIFIER) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==EOF||LA19_1==Semicolon||(LA19_1>=RULE_KW_ASC && LA19_1<=RULE_KW_DESC)||LA19_1==RULE_COMMA||LA19_1==RULE_RIGHT_PAREN) ) {
                    alt19=2;
                }
                else if ( (LA19_1==RULE_PERIOD) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalQueryParser.g:1190:3: this_QualifiedProjectedCharacteristicReference_0= ruleQualifiedProjectedCharacteristicReference
                    {

                    			newCompositeNode(grammarAccess.getProjectedCharacteristicReferenceAccess().getQualifiedProjectedCharacteristicReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_QualifiedProjectedCharacteristicReference_0=ruleQualifiedProjectedCharacteristicReference();

                    state._fsp--;


                    			current = this_QualifiedProjectedCharacteristicReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQueryParser.g:1199:3: this_UnqualifiedProjectedCharacteristicReferenceOrAlias_1= ruleUnqualifiedProjectedCharacteristicReferenceOrAlias
                    {

                    			newCompositeNode(grammarAccess.getProjectedCharacteristicReferenceAccess().getUnqualifiedProjectedCharacteristicReferenceOrAliasParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnqualifiedProjectedCharacteristicReferenceOrAlias_1=ruleUnqualifiedProjectedCharacteristicReferenceOrAlias();

                    state._fsp--;


                    			current = this_UnqualifiedProjectedCharacteristicReferenceOrAlias_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleProjectedCharacteristicReference"


    // $ANTLR start "entryRuleQualifiedProjectedCharacteristicReference"
    // InternalQueryParser.g:1211:1: entryRuleQualifiedProjectedCharacteristicReference returns [EObject current=null] : iv_ruleQualifiedProjectedCharacteristicReference= ruleQualifiedProjectedCharacteristicReference EOF ;
    public final EObject entryRuleQualifiedProjectedCharacteristicReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedProjectedCharacteristicReference = null;


        try {
            // InternalQueryParser.g:1211:82: (iv_ruleQualifiedProjectedCharacteristicReference= ruleQualifiedProjectedCharacteristicReference EOF )
            // InternalQueryParser.g:1212:2: iv_ruleQualifiedProjectedCharacteristicReference= ruleQualifiedProjectedCharacteristicReference EOF
            {
             newCompositeNode(grammarAccess.getQualifiedProjectedCharacteristicReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedProjectedCharacteristicReference=ruleQualifiedProjectedCharacteristicReference();

            state._fsp--;

             current =iv_ruleQualifiedProjectedCharacteristicReference; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedProjectedCharacteristicReference"


    // $ANTLR start "ruleQualifiedProjectedCharacteristicReference"
    // InternalQueryParser.g:1218:1: ruleQualifiedProjectedCharacteristicReference returns [EObject current=null] : ( ( (lv_selectedEntityReference_0_0= ruleSelectedEntityReference ) ) this_PERIOD_1= RULE_PERIOD ( (lv_characteristic_2_0= ruleCharacteristicReference ) ) ) ;
    public final EObject ruleQualifiedProjectedCharacteristicReference() throws RecognitionException {
        EObject current = null;

        Token this_PERIOD_1=null;
        EObject lv_selectedEntityReference_0_0 = null;

        EObject lv_characteristic_2_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:1224:2: ( ( ( (lv_selectedEntityReference_0_0= ruleSelectedEntityReference ) ) this_PERIOD_1= RULE_PERIOD ( (lv_characteristic_2_0= ruleCharacteristicReference ) ) ) )
            // InternalQueryParser.g:1225:2: ( ( (lv_selectedEntityReference_0_0= ruleSelectedEntityReference ) ) this_PERIOD_1= RULE_PERIOD ( (lv_characteristic_2_0= ruleCharacteristicReference ) ) )
            {
            // InternalQueryParser.g:1225:2: ( ( (lv_selectedEntityReference_0_0= ruleSelectedEntityReference ) ) this_PERIOD_1= RULE_PERIOD ( (lv_characteristic_2_0= ruleCharacteristicReference ) ) )
            // InternalQueryParser.g:1226:3: ( (lv_selectedEntityReference_0_0= ruleSelectedEntityReference ) ) this_PERIOD_1= RULE_PERIOD ( (lv_characteristic_2_0= ruleCharacteristicReference ) )
            {
            // InternalQueryParser.g:1226:3: ( (lv_selectedEntityReference_0_0= ruleSelectedEntityReference ) )
            // InternalQueryParser.g:1227:4: (lv_selectedEntityReference_0_0= ruleSelectedEntityReference )
            {
            // InternalQueryParser.g:1227:4: (lv_selectedEntityReference_0_0= ruleSelectedEntityReference )
            // InternalQueryParser.g:1228:5: lv_selectedEntityReference_0_0= ruleSelectedEntityReference
            {

            					newCompositeNode(grammarAccess.getQualifiedProjectedCharacteristicReferenceAccess().getSelectedEntityReferenceSelectedEntityReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_selectedEntityReference_0_0=ruleSelectedEntityReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualifiedProjectedCharacteristicReferenceRule());
            					}
            					set(
            						current,
            						"selectedEntityReference",
            						lv_selectedEntityReference_0_0,
            						"com.epistimis.uddl.query.Query.SelectedEntityReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_PERIOD_1=(Token)match(input,RULE_PERIOD,FOLLOW_3); 

            			newLeafNode(this_PERIOD_1, grammarAccess.getQualifiedProjectedCharacteristicReferenceAccess().getPERIODTerminalRuleCall_1());
            		
            // InternalQueryParser.g:1249:3: ( (lv_characteristic_2_0= ruleCharacteristicReference ) )
            // InternalQueryParser.g:1250:4: (lv_characteristic_2_0= ruleCharacteristicReference )
            {
            // InternalQueryParser.g:1250:4: (lv_characteristic_2_0= ruleCharacteristicReference )
            // InternalQueryParser.g:1251:5: lv_characteristic_2_0= ruleCharacteristicReference
            {

            					newCompositeNode(grammarAccess.getQualifiedProjectedCharacteristicReferenceAccess().getCharacteristicCharacteristicReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_characteristic_2_0=ruleCharacteristicReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualifiedProjectedCharacteristicReferenceRule());
            					}
            					set(
            						current,
            						"characteristic",
            						lv_characteristic_2_0,
            						"com.epistimis.uddl.query.Query.CharacteristicReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleQualifiedProjectedCharacteristicReference"


    // $ANTLR start "entryRuleUnqualifiedProjectedCharacteristicReferenceOrAlias"
    // InternalQueryParser.g:1272:1: entryRuleUnqualifiedProjectedCharacteristicReferenceOrAlias returns [EObject current=null] : iv_ruleUnqualifiedProjectedCharacteristicReferenceOrAlias= ruleUnqualifiedProjectedCharacteristicReferenceOrAlias EOF ;
    public final EObject entryRuleUnqualifiedProjectedCharacteristicReferenceOrAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnqualifiedProjectedCharacteristicReferenceOrAlias = null;


        try {
            // InternalQueryParser.g:1272:91: (iv_ruleUnqualifiedProjectedCharacteristicReferenceOrAlias= ruleUnqualifiedProjectedCharacteristicReferenceOrAlias EOF )
            // InternalQueryParser.g:1273:2: iv_ruleUnqualifiedProjectedCharacteristicReferenceOrAlias= ruleUnqualifiedProjectedCharacteristicReferenceOrAlias EOF
            {
             newCompositeNode(grammarAccess.getUnqualifiedProjectedCharacteristicReferenceOrAliasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnqualifiedProjectedCharacteristicReferenceOrAlias=ruleUnqualifiedProjectedCharacteristicReferenceOrAlias();

            state._fsp--;

             current =iv_ruleUnqualifiedProjectedCharacteristicReferenceOrAlias; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnqualifiedProjectedCharacteristicReferenceOrAlias"


    // $ANTLR start "ruleUnqualifiedProjectedCharacteristicReferenceOrAlias"
    // InternalQueryParser.g:1279:1: ruleUnqualifiedProjectedCharacteristicReferenceOrAlias returns [EObject current=null] : this_QueryIdentifier_0= ruleQueryIdentifier ;
    public final EObject ruleUnqualifiedProjectedCharacteristicReferenceOrAlias() throws RecognitionException {
        EObject current = null;

        EObject this_QueryIdentifier_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:1285:2: (this_QueryIdentifier_0= ruleQueryIdentifier )
            // InternalQueryParser.g:1286:2: this_QueryIdentifier_0= ruleQueryIdentifier
            {

            		newCompositeNode(grammarAccess.getUnqualifiedProjectedCharacteristicReferenceOrAliasAccess().getQueryIdentifierParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_QueryIdentifier_0=ruleQueryIdentifier();

            state._fsp--;


            		current = this_QueryIdentifier_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleUnqualifiedProjectedCharacteristicReferenceOrAlias"


    // $ANTLR start "entryRuleOrderingType"
    // InternalQueryParser.g:1297:1: entryRuleOrderingType returns [String current=null] : iv_ruleOrderingType= ruleOrderingType EOF ;
    public final String entryRuleOrderingType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrderingType = null;


        try {
            // InternalQueryParser.g:1297:52: (iv_ruleOrderingType= ruleOrderingType EOF )
            // InternalQueryParser.g:1298:2: iv_ruleOrderingType= ruleOrderingType EOF
            {
             newCompositeNode(grammarAccess.getOrderingTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrderingType=ruleOrderingType();

            state._fsp--;

             current =iv_ruleOrderingType.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrderingType"


    // $ANTLR start "ruleOrderingType"
    // InternalQueryParser.g:1304:1: ruleOrderingType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_KW_ASC_0= RULE_KW_ASC | this_KW_DESC_1= RULE_KW_DESC ) ;
    public final AntlrDatatypeRuleToken ruleOrderingType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_KW_ASC_0=null;
        Token this_KW_DESC_1=null;


        	enterRule();

        try {
            // InternalQueryParser.g:1310:2: ( (this_KW_ASC_0= RULE_KW_ASC | this_KW_DESC_1= RULE_KW_DESC ) )
            // InternalQueryParser.g:1311:2: (this_KW_ASC_0= RULE_KW_ASC | this_KW_DESC_1= RULE_KW_DESC )
            {
            // InternalQueryParser.g:1311:2: (this_KW_ASC_0= RULE_KW_ASC | this_KW_DESC_1= RULE_KW_DESC )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_KW_ASC) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_KW_DESC) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalQueryParser.g:1312:3: this_KW_ASC_0= RULE_KW_ASC
                    {
                    this_KW_ASC_0=(Token)match(input,RULE_KW_ASC,FOLLOW_2); 

                    			current.merge(this_KW_ASC_0);
                    		

                    			newLeafNode(this_KW_ASC_0, grammarAccess.getOrderingTypeAccess().getKW_ASCTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQueryParser.g:1320:3: this_KW_DESC_1= RULE_KW_DESC
                    {
                    this_KW_DESC_1=(Token)match(input,RULE_KW_DESC,FOLLOW_2); 

                    			current.merge(this_KW_DESC_1);
                    		

                    			newLeafNode(this_KW_DESC_1, grammarAccess.getOrderingTypeAccess().getKW_DESCTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleOrderingType"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalQueryParser.g:1331:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalQueryParser.g:1331:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalQueryParser.g:1332:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;

             current =iv_ruleBooleanExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalQueryParser.g:1338:1: ruleBooleanExpression returns [EObject current=null] : ( ( (lv_term_0_0= ruleBooleanTerm ) ) (this_KW_OR_1= RULE_KW_OR ( (lv_term_2_0= ruleBooleanTerm ) ) )* ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token this_KW_OR_1=null;
        EObject lv_term_0_0 = null;

        EObject lv_term_2_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:1344:2: ( ( ( (lv_term_0_0= ruleBooleanTerm ) ) (this_KW_OR_1= RULE_KW_OR ( (lv_term_2_0= ruleBooleanTerm ) ) )* ) )
            // InternalQueryParser.g:1345:2: ( ( (lv_term_0_0= ruleBooleanTerm ) ) (this_KW_OR_1= RULE_KW_OR ( (lv_term_2_0= ruleBooleanTerm ) ) )* )
            {
            // InternalQueryParser.g:1345:2: ( ( (lv_term_0_0= ruleBooleanTerm ) ) (this_KW_OR_1= RULE_KW_OR ( (lv_term_2_0= ruleBooleanTerm ) ) )* )
            // InternalQueryParser.g:1346:3: ( (lv_term_0_0= ruleBooleanTerm ) ) (this_KW_OR_1= RULE_KW_OR ( (lv_term_2_0= ruleBooleanTerm ) ) )*
            {
            // InternalQueryParser.g:1346:3: ( (lv_term_0_0= ruleBooleanTerm ) )
            // InternalQueryParser.g:1347:4: (lv_term_0_0= ruleBooleanTerm )
            {
            // InternalQueryParser.g:1347:4: (lv_term_0_0= ruleBooleanTerm )
            // InternalQueryParser.g:1348:5: lv_term_0_0= ruleBooleanTerm
            {

            					newCompositeNode(grammarAccess.getBooleanExpressionAccess().getTermBooleanTermParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_term_0_0=ruleBooleanTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
            					}
            					add(
            						current,
            						"term",
            						lv_term_0_0,
            						"com.epistimis.uddl.query.Query.BooleanTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryParser.g:1365:3: (this_KW_OR_1= RULE_KW_OR ( (lv_term_2_0= ruleBooleanTerm ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_KW_OR) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalQueryParser.g:1366:4: this_KW_OR_1= RULE_KW_OR ( (lv_term_2_0= ruleBooleanTerm ) )
            	    {
            	    this_KW_OR_1=(Token)match(input,RULE_KW_OR,FOLLOW_18); 

            	    				newLeafNode(this_KW_OR_1, grammarAccess.getBooleanExpressionAccess().getKW_ORTerminalRuleCall_1_0());
            	    			
            	    // InternalQueryParser.g:1370:4: ( (lv_term_2_0= ruleBooleanTerm ) )
            	    // InternalQueryParser.g:1371:5: (lv_term_2_0= ruleBooleanTerm )
            	    {
            	    // InternalQueryParser.g:1371:5: (lv_term_2_0= ruleBooleanTerm )
            	    // InternalQueryParser.g:1372:6: lv_term_2_0= ruleBooleanTerm
            	    {

            	    						newCompositeNode(grammarAccess.getBooleanExpressionAccess().getTermBooleanTermParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_term_2_0=ruleBooleanTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"term",
            	    							lv_term_2_0,
            	    							"com.epistimis.uddl.query.Query.BooleanTerm");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleBooleanTerm"
    // InternalQueryParser.g:1394:1: entryRuleBooleanTerm returns [EObject current=null] : iv_ruleBooleanTerm= ruleBooleanTerm EOF ;
    public final EObject entryRuleBooleanTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanTerm = null;


        try {
            // InternalQueryParser.g:1394:52: (iv_ruleBooleanTerm= ruleBooleanTerm EOF )
            // InternalQueryParser.g:1395:2: iv_ruleBooleanTerm= ruleBooleanTerm EOF
            {
             newCompositeNode(grammarAccess.getBooleanTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanTerm=ruleBooleanTerm();

            state._fsp--;

             current =iv_ruleBooleanTerm; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanTerm"


    // $ANTLR start "ruleBooleanTerm"
    // InternalQueryParser.g:1401:1: ruleBooleanTerm returns [EObject current=null] : ( ( (lv_factor_0_0= ruleBooleanFactor ) ) (this_KW_AND_1= RULE_KW_AND ( (lv_factor_2_0= ruleBooleanFactor ) ) )* ) ;
    public final EObject ruleBooleanTerm() throws RecognitionException {
        EObject current = null;

        Token this_KW_AND_1=null;
        EObject lv_factor_0_0 = null;

        EObject lv_factor_2_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:1407:2: ( ( ( (lv_factor_0_0= ruleBooleanFactor ) ) (this_KW_AND_1= RULE_KW_AND ( (lv_factor_2_0= ruleBooleanFactor ) ) )* ) )
            // InternalQueryParser.g:1408:2: ( ( (lv_factor_0_0= ruleBooleanFactor ) ) (this_KW_AND_1= RULE_KW_AND ( (lv_factor_2_0= ruleBooleanFactor ) ) )* )
            {
            // InternalQueryParser.g:1408:2: ( ( (lv_factor_0_0= ruleBooleanFactor ) ) (this_KW_AND_1= RULE_KW_AND ( (lv_factor_2_0= ruleBooleanFactor ) ) )* )
            // InternalQueryParser.g:1409:3: ( (lv_factor_0_0= ruleBooleanFactor ) ) (this_KW_AND_1= RULE_KW_AND ( (lv_factor_2_0= ruleBooleanFactor ) ) )*
            {
            // InternalQueryParser.g:1409:3: ( (lv_factor_0_0= ruleBooleanFactor ) )
            // InternalQueryParser.g:1410:4: (lv_factor_0_0= ruleBooleanFactor )
            {
            // InternalQueryParser.g:1410:4: (lv_factor_0_0= ruleBooleanFactor )
            // InternalQueryParser.g:1411:5: lv_factor_0_0= ruleBooleanFactor
            {

            					newCompositeNode(grammarAccess.getBooleanTermAccess().getFactorBooleanFactorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_factor_0_0=ruleBooleanFactor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanTermRule());
            					}
            					add(
            						current,
            						"factor",
            						lv_factor_0_0,
            						"com.epistimis.uddl.query.Query.BooleanFactor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryParser.g:1428:3: (this_KW_AND_1= RULE_KW_AND ( (lv_factor_2_0= ruleBooleanFactor ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_KW_AND) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalQueryParser.g:1429:4: this_KW_AND_1= RULE_KW_AND ( (lv_factor_2_0= ruleBooleanFactor ) )
            	    {
            	    this_KW_AND_1=(Token)match(input,RULE_KW_AND,FOLLOW_18); 

            	    				newLeafNode(this_KW_AND_1, grammarAccess.getBooleanTermAccess().getKW_ANDTerminalRuleCall_1_0());
            	    			
            	    // InternalQueryParser.g:1433:4: ( (lv_factor_2_0= ruleBooleanFactor ) )
            	    // InternalQueryParser.g:1434:5: (lv_factor_2_0= ruleBooleanFactor )
            	    {
            	    // InternalQueryParser.g:1434:5: (lv_factor_2_0= ruleBooleanFactor )
            	    // InternalQueryParser.g:1435:6: lv_factor_2_0= ruleBooleanFactor
            	    {

            	    						newCompositeNode(grammarAccess.getBooleanTermAccess().getFactorBooleanFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_factor_2_0=ruleBooleanFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBooleanTermRule());
            	    						}
            	    						add(
            	    							current,
            	    							"factor",
            	    							lv_factor_2_0,
            	    							"com.epistimis.uddl.query.Query.BooleanFactor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


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
    // $ANTLR end "ruleBooleanTerm"


    // $ANTLR start "entryRuleBooleanFactor"
    // InternalQueryParser.g:1457:1: entryRuleBooleanFactor returns [EObject current=null] : iv_ruleBooleanFactor= ruleBooleanFactor EOF ;
    public final EObject entryRuleBooleanFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanFactor = null;


        try {
            // InternalQueryParser.g:1457:54: (iv_ruleBooleanFactor= ruleBooleanFactor EOF )
            // InternalQueryParser.g:1458:2: iv_ruleBooleanFactor= ruleBooleanFactor EOF
            {
             newCompositeNode(grammarAccess.getBooleanFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanFactor=ruleBooleanFactor();

            state._fsp--;

             current =iv_ruleBooleanFactor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanFactor"


    // $ANTLR start "ruleBooleanFactor"
    // InternalQueryParser.g:1464:1: ruleBooleanFactor returns [EObject current=null] : ( ( (lv_not_0_0= RULE_KW_NOT ) )? ( (lv_pred_1_0= ruleBooleanPredicate ) ) ) ;
    public final EObject ruleBooleanFactor() throws RecognitionException {
        EObject current = null;

        Token lv_not_0_0=null;
        EObject lv_pred_1_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:1470:2: ( ( ( (lv_not_0_0= RULE_KW_NOT ) )? ( (lv_pred_1_0= ruleBooleanPredicate ) ) ) )
            // InternalQueryParser.g:1471:2: ( ( (lv_not_0_0= RULE_KW_NOT ) )? ( (lv_pred_1_0= ruleBooleanPredicate ) ) )
            {
            // InternalQueryParser.g:1471:2: ( ( (lv_not_0_0= RULE_KW_NOT ) )? ( (lv_pred_1_0= ruleBooleanPredicate ) ) )
            // InternalQueryParser.g:1472:3: ( (lv_not_0_0= RULE_KW_NOT ) )? ( (lv_pred_1_0= ruleBooleanPredicate ) )
            {
            // InternalQueryParser.g:1472:3: ( (lv_not_0_0= RULE_KW_NOT ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_KW_NOT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalQueryParser.g:1473:4: (lv_not_0_0= RULE_KW_NOT )
                    {
                    // InternalQueryParser.g:1473:4: (lv_not_0_0= RULE_KW_NOT )
                    // InternalQueryParser.g:1474:5: lv_not_0_0= RULE_KW_NOT
                    {
                    lv_not_0_0=(Token)match(input,RULE_KW_NOT,FOLLOW_18); 

                    					newLeafNode(lv_not_0_0, grammarAccess.getBooleanFactorAccess().getNotKW_NOTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanFactorRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"not",
                    						lv_not_0_0 != null,
                    						"com.epistimis.uddl.query.Query.KW_NOT");
                    				

                    }


                    }
                    break;

            }

            // InternalQueryParser.g:1490:3: ( (lv_pred_1_0= ruleBooleanPredicate ) )
            // InternalQueryParser.g:1491:4: (lv_pred_1_0= ruleBooleanPredicate )
            {
            // InternalQueryParser.g:1491:4: (lv_pred_1_0= ruleBooleanPredicate )
            // InternalQueryParser.g:1492:5: lv_pred_1_0= ruleBooleanPredicate
            {

            					newCompositeNode(grammarAccess.getBooleanFactorAccess().getPredBooleanPredicateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_pred_1_0=ruleBooleanPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanFactorRule());
            					}
            					set(
            						current,
            						"pred",
            						lv_pred_1_0,
            						"com.epistimis.uddl.query.Query.BooleanPredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleBooleanFactor"


    // $ANTLR start "entryRuleBooleanPredicate"
    // InternalQueryParser.g:1513:1: entryRuleBooleanPredicate returns [EObject current=null] : iv_ruleBooleanPredicate= ruleBooleanPredicate EOF ;
    public final EObject entryRuleBooleanPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanPredicate = null;


        try {
            // InternalQueryParser.g:1513:57: (iv_ruleBooleanPredicate= ruleBooleanPredicate EOF )
            // InternalQueryParser.g:1514:2: iv_ruleBooleanPredicate= ruleBooleanPredicate EOF
            {
             newCompositeNode(grammarAccess.getBooleanPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanPredicate=ruleBooleanPredicate();

            state._fsp--;

             current =iv_ruleBooleanPredicate; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanPredicate"


    // $ANTLR start "ruleBooleanPredicate"
    // InternalQueryParser.g:1520:1: ruleBooleanPredicate returns [EObject current=null] : (this_ScalarComparePredicate_0= ruleScalarComparePredicate | this_ExistsPredicate_1= ruleExistsPredicate | (this_LEFT_PAREN_2= RULE_LEFT_PAREN this_BooleanExpression_3= ruleBooleanExpression this_RIGHT_PAREN_4= RULE_RIGHT_PAREN ) ) ;
    public final EObject ruleBooleanPredicate() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_PAREN_2=null;
        Token this_RIGHT_PAREN_4=null;
        EObject this_ScalarComparePredicate_0 = null;

        EObject this_ExistsPredicate_1 = null;

        EObject this_BooleanExpression_3 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:1526:2: ( (this_ScalarComparePredicate_0= ruleScalarComparePredicate | this_ExistsPredicate_1= ruleExistsPredicate | (this_LEFT_PAREN_2= RULE_LEFT_PAREN this_BooleanExpression_3= ruleBooleanExpression this_RIGHT_PAREN_4= RULE_RIGHT_PAREN ) ) )
            // InternalQueryParser.g:1527:2: (this_ScalarComparePredicate_0= ruleScalarComparePredicate | this_ExistsPredicate_1= ruleExistsPredicate | (this_LEFT_PAREN_2= RULE_LEFT_PAREN this_BooleanExpression_3= ruleBooleanExpression this_RIGHT_PAREN_4= RULE_RIGHT_PAREN ) )
            {
            // InternalQueryParser.g:1527:2: (this_ScalarComparePredicate_0= ruleScalarComparePredicate | this_ExistsPredicate_1= ruleExistsPredicate | (this_LEFT_PAREN_2= RULE_LEFT_PAREN this_BooleanExpression_3= ruleBooleanExpression this_RIGHT_PAREN_4= RULE_RIGHT_PAREN ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case RULE_LEFT_BRACE:
            case RULE_IDENTIFIER:
                {
                alt24=1;
                }
                break;
            case RULE_LEFT_PAREN:
                {
                int LA24_2 = input.LA(2);

                if ( (LA24_2==Select) ) {
                    alt24=1;
                }
                else if ( ((LA24_2>=RULE_KW_EXISTS && LA24_2<=RULE_KW_NOT)||LA24_2==RULE_LEFT_PAREN||LA24_2==RULE_LEFT_BRACE||LA24_2==RULE_IDENTIFIER) ) {
                    alt24=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_KW_EXISTS:
                {
                alt24=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalQueryParser.g:1528:3: this_ScalarComparePredicate_0= ruleScalarComparePredicate
                    {

                    			newCompositeNode(grammarAccess.getBooleanPredicateAccess().getScalarComparePredicateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScalarComparePredicate_0=ruleScalarComparePredicate();

                    state._fsp--;


                    			current = this_ScalarComparePredicate_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQueryParser.g:1537:3: this_ExistsPredicate_1= ruleExistsPredicate
                    {

                    			newCompositeNode(grammarAccess.getBooleanPredicateAccess().getExistsPredicateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExistsPredicate_1=ruleExistsPredicate();

                    state._fsp--;


                    			current = this_ExistsPredicate_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQueryParser.g:1546:3: (this_LEFT_PAREN_2= RULE_LEFT_PAREN this_BooleanExpression_3= ruleBooleanExpression this_RIGHT_PAREN_4= RULE_RIGHT_PAREN )
                    {
                    // InternalQueryParser.g:1546:3: (this_LEFT_PAREN_2= RULE_LEFT_PAREN this_BooleanExpression_3= ruleBooleanExpression this_RIGHT_PAREN_4= RULE_RIGHT_PAREN )
                    // InternalQueryParser.g:1547:4: this_LEFT_PAREN_2= RULE_LEFT_PAREN this_BooleanExpression_3= ruleBooleanExpression this_RIGHT_PAREN_4= RULE_RIGHT_PAREN
                    {
                    this_LEFT_PAREN_2=(Token)match(input,RULE_LEFT_PAREN,FOLLOW_18); 

                    				newLeafNode(this_LEFT_PAREN_2, grammarAccess.getBooleanPredicateAccess().getLEFT_PARENTerminalRuleCall_2_0());
                    			

                    				newCompositeNode(grammarAccess.getBooleanPredicateAccess().getBooleanExpressionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_22);
                    this_BooleanExpression_3=ruleBooleanExpression();

                    state._fsp--;


                    				current = this_BooleanExpression_3;
                    				afterParserOrEnumRuleCall();
                    			
                    this_RIGHT_PAREN_4=(Token)match(input,RULE_RIGHT_PAREN,FOLLOW_2); 

                    				newLeafNode(this_RIGHT_PAREN_4, grammarAccess.getBooleanPredicateAccess().getRIGHT_PARENTerminalRuleCall_2_2());
                    			

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
    // $ANTLR end "ruleBooleanPredicate"


    // $ANTLR start "entryRuleScalarComparePredicate"
    // InternalQueryParser.g:1568:1: entryRuleScalarComparePredicate returns [EObject current=null] : iv_ruleScalarComparePredicate= ruleScalarComparePredicate EOF ;
    public final EObject entryRuleScalarComparePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarComparePredicate = null;


        try {
            // InternalQueryParser.g:1568:63: (iv_ruleScalarComparePredicate= ruleScalarComparePredicate EOF )
            // InternalQueryParser.g:1569:2: iv_ruleScalarComparePredicate= ruleScalarComparePredicate EOF
            {
             newCompositeNode(grammarAccess.getScalarComparePredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScalarComparePredicate=ruleScalarComparePredicate();

            state._fsp--;

             current =iv_ruleScalarComparePredicate; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleScalarComparePredicate"


    // $ANTLR start "ruleScalarComparePredicate"
    // InternalQueryParser.g:1575:1: ruleScalarComparePredicate returns [EObject current=null] : ( ( (lv_left_0_0= rulePredicateTerm ) ) ( (lv_op_1_0= ruleCompareOperator ) ) ( (lv_right_2_0= rulePredicateTerm ) ) ) ;
    public final EObject ruleScalarComparePredicate() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:1581:2: ( ( ( (lv_left_0_0= rulePredicateTerm ) ) ( (lv_op_1_0= ruleCompareOperator ) ) ( (lv_right_2_0= rulePredicateTerm ) ) ) )
            // InternalQueryParser.g:1582:2: ( ( (lv_left_0_0= rulePredicateTerm ) ) ( (lv_op_1_0= ruleCompareOperator ) ) ( (lv_right_2_0= rulePredicateTerm ) ) )
            {
            // InternalQueryParser.g:1582:2: ( ( (lv_left_0_0= rulePredicateTerm ) ) ( (lv_op_1_0= ruleCompareOperator ) ) ( (lv_right_2_0= rulePredicateTerm ) ) )
            // InternalQueryParser.g:1583:3: ( (lv_left_0_0= rulePredicateTerm ) ) ( (lv_op_1_0= ruleCompareOperator ) ) ( (lv_right_2_0= rulePredicateTerm ) )
            {
            // InternalQueryParser.g:1583:3: ( (lv_left_0_0= rulePredicateTerm ) )
            // InternalQueryParser.g:1584:4: (lv_left_0_0= rulePredicateTerm )
            {
            // InternalQueryParser.g:1584:4: (lv_left_0_0= rulePredicateTerm )
            // InternalQueryParser.g:1585:5: lv_left_0_0= rulePredicateTerm
            {

            					newCompositeNode(grammarAccess.getScalarComparePredicateAccess().getLeftPredicateTermParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_left_0_0=rulePredicateTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScalarComparePredicateRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"com.epistimis.uddl.query.Query.PredicateTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryParser.g:1602:3: ( (lv_op_1_0= ruleCompareOperator ) )
            // InternalQueryParser.g:1603:4: (lv_op_1_0= ruleCompareOperator )
            {
            // InternalQueryParser.g:1603:4: (lv_op_1_0= ruleCompareOperator )
            // InternalQueryParser.g:1604:5: lv_op_1_0= ruleCompareOperator
            {

            					newCompositeNode(grammarAccess.getScalarComparePredicateAccess().getOpCompareOperatorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_op_1_0=ruleCompareOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScalarComparePredicateRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"com.epistimis.uddl.query.Query.CompareOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryParser.g:1621:3: ( (lv_right_2_0= rulePredicateTerm ) )
            // InternalQueryParser.g:1622:4: (lv_right_2_0= rulePredicateTerm )
            {
            // InternalQueryParser.g:1622:4: (lv_right_2_0= rulePredicateTerm )
            // InternalQueryParser.g:1623:5: lv_right_2_0= rulePredicateTerm
            {

            					newCompositeNode(grammarAccess.getScalarComparePredicateAccess().getRightPredicateTermParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=rulePredicateTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScalarComparePredicateRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"com.epistimis.uddl.query.Query.PredicateTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleScalarComparePredicate"


    // $ANTLR start "entryRuleLogicalSet"
    // InternalQueryParser.g:1644:1: entryRuleLogicalSet returns [EObject current=null] : iv_ruleLogicalSet= ruleLogicalSet EOF ;
    public final EObject entryRuleLogicalSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalSet = null;


        try {
            // InternalQueryParser.g:1644:51: (iv_ruleLogicalSet= ruleLogicalSet EOF )
            // InternalQueryParser.g:1645:2: iv_ruleLogicalSet= ruleLogicalSet EOF
            {
             newCompositeNode(grammarAccess.getLogicalSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalSet=ruleLogicalSet();

            state._fsp--;

             current =iv_ruleLogicalSet; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLogicalSet"


    // $ANTLR start "ruleLogicalSet"
    // InternalQueryParser.g:1651:1: ruleLogicalSet returns [EObject current=null] : (this_Subquery_0= ruleSubquery | this_CharacteristicBasisSet_1= ruleCharacteristicBasisSet | this_EnumLiteralSet_2= ruleEnumLiteralSet ) ;
    public final EObject ruleLogicalSet() throws RecognitionException {
        EObject current = null;

        EObject this_Subquery_0 = null;

        EObject this_CharacteristicBasisSet_1 = null;

        EObject this_EnumLiteralSet_2 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:1657:2: ( (this_Subquery_0= ruleSubquery | this_CharacteristicBasisSet_1= ruleCharacteristicBasisSet | this_EnumLiteralSet_2= ruleEnumLiteralSet ) )
            // InternalQueryParser.g:1658:2: (this_Subquery_0= ruleSubquery | this_CharacteristicBasisSet_1= ruleCharacteristicBasisSet | this_EnumLiteralSet_2= ruleEnumLiteralSet )
            {
            // InternalQueryParser.g:1658:2: (this_Subquery_0= ruleSubquery | this_CharacteristicBasisSet_1= ruleCharacteristicBasisSet | this_EnumLiteralSet_2= ruleEnumLiteralSet )
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_LEFT_PAREN) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==RULE_LEFT_PAREN||LA25_1==RULE_IDENTIFIER) ) {
                    alt25=2;
                }
                else if ( (LA25_1==Select) ) {
                    alt25=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA25_0==RULE_LEFT_BRACE) ) {
                alt25=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalQueryParser.g:1659:3: this_Subquery_0= ruleSubquery
                    {

                    			newCompositeNode(grammarAccess.getLogicalSetAccess().getSubqueryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Subquery_0=ruleSubquery();

                    state._fsp--;


                    			current = this_Subquery_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQueryParser.g:1668:3: this_CharacteristicBasisSet_1= ruleCharacteristicBasisSet
                    {

                    			newCompositeNode(grammarAccess.getLogicalSetAccess().getCharacteristicBasisSetParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CharacteristicBasisSet_1=ruleCharacteristicBasisSet();

                    state._fsp--;


                    			current = this_CharacteristicBasisSet_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQueryParser.g:1677:3: this_EnumLiteralSet_2= ruleEnumLiteralSet
                    {

                    			newCompositeNode(grammarAccess.getLogicalSetAccess().getEnumLiteralSetParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumLiteralSet_2=ruleEnumLiteralSet();

                    state._fsp--;


                    			current = this_EnumLiteralSet_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleLogicalSet"


    // $ANTLR start "entryRuleCharacteristicBasisSet"
    // InternalQueryParser.g:1689:1: entryRuleCharacteristicBasisSet returns [EObject current=null] : iv_ruleCharacteristicBasisSet= ruleCharacteristicBasisSet EOF ;
    public final EObject entryRuleCharacteristicBasisSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicBasisSet = null;


        try {
            // InternalQueryParser.g:1689:63: (iv_ruleCharacteristicBasisSet= ruleCharacteristicBasisSet EOF )
            // InternalQueryParser.g:1690:2: iv_ruleCharacteristicBasisSet= ruleCharacteristicBasisSet EOF
            {
             newCompositeNode(grammarAccess.getCharacteristicBasisSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacteristicBasisSet=ruleCharacteristicBasisSet();

            state._fsp--;

             current =iv_ruleCharacteristicBasisSet; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCharacteristicBasisSet"


    // $ANTLR start "ruleCharacteristicBasisSet"
    // InternalQueryParser.g:1696:1: ruleCharacteristicBasisSet returns [EObject current=null] : (this_LEFT_PAREN_0= RULE_LEFT_PAREN ( (lv_characteristicBasis_1_0= ruleCharacteristicBasis ) ) (this_COMMA_2= RULE_COMMA ( (lv_characteristicBasis_3_0= ruleCharacteristicBasis ) ) )* this_RIGHT_PAREN_4= RULE_RIGHT_PAREN ) ;
    public final EObject ruleCharacteristicBasisSet() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_PAREN_0=null;
        Token this_COMMA_2=null;
        Token this_RIGHT_PAREN_4=null;
        EObject lv_characteristicBasis_1_0 = null;

        EObject lv_characteristicBasis_3_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:1702:2: ( (this_LEFT_PAREN_0= RULE_LEFT_PAREN ( (lv_characteristicBasis_1_0= ruleCharacteristicBasis ) ) (this_COMMA_2= RULE_COMMA ( (lv_characteristicBasis_3_0= ruleCharacteristicBasis ) ) )* this_RIGHT_PAREN_4= RULE_RIGHT_PAREN ) )
            // InternalQueryParser.g:1703:2: (this_LEFT_PAREN_0= RULE_LEFT_PAREN ( (lv_characteristicBasis_1_0= ruleCharacteristicBasis ) ) (this_COMMA_2= RULE_COMMA ( (lv_characteristicBasis_3_0= ruleCharacteristicBasis ) ) )* this_RIGHT_PAREN_4= RULE_RIGHT_PAREN )
            {
            // InternalQueryParser.g:1703:2: (this_LEFT_PAREN_0= RULE_LEFT_PAREN ( (lv_characteristicBasis_1_0= ruleCharacteristicBasis ) ) (this_COMMA_2= RULE_COMMA ( (lv_characteristicBasis_3_0= ruleCharacteristicBasis ) ) )* this_RIGHT_PAREN_4= RULE_RIGHT_PAREN )
            // InternalQueryParser.g:1704:3: this_LEFT_PAREN_0= RULE_LEFT_PAREN ( (lv_characteristicBasis_1_0= ruleCharacteristicBasis ) ) (this_COMMA_2= RULE_COMMA ( (lv_characteristicBasis_3_0= ruleCharacteristicBasis ) ) )* this_RIGHT_PAREN_4= RULE_RIGHT_PAREN
            {
            this_LEFT_PAREN_0=(Token)match(input,RULE_LEFT_PAREN,FOLLOW_25); 

            			newLeafNode(this_LEFT_PAREN_0, grammarAccess.getCharacteristicBasisSetAccess().getLEFT_PARENTerminalRuleCall_0());
            		
            // InternalQueryParser.g:1708:3: ( (lv_characteristicBasis_1_0= ruleCharacteristicBasis ) )
            // InternalQueryParser.g:1709:4: (lv_characteristicBasis_1_0= ruleCharacteristicBasis )
            {
            // InternalQueryParser.g:1709:4: (lv_characteristicBasis_1_0= ruleCharacteristicBasis )
            // InternalQueryParser.g:1710:5: lv_characteristicBasis_1_0= ruleCharacteristicBasis
            {

            					newCompositeNode(grammarAccess.getCharacteristicBasisSetAccess().getCharacteristicBasisCharacteristicBasisParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_characteristicBasis_1_0=ruleCharacteristicBasis();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCharacteristicBasisSetRule());
            					}
            					add(
            						current,
            						"characteristicBasis",
            						lv_characteristicBasis_1_0,
            						"com.epistimis.uddl.query.Query.CharacteristicBasis");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryParser.g:1727:3: (this_COMMA_2= RULE_COMMA ( (lv_characteristicBasis_3_0= ruleCharacteristicBasis ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_COMMA) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalQueryParser.g:1728:4: this_COMMA_2= RULE_COMMA ( (lv_characteristicBasis_3_0= ruleCharacteristicBasis ) )
            	    {
            	    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_25); 

            	    				newLeafNode(this_COMMA_2, grammarAccess.getCharacteristicBasisSetAccess().getCOMMATerminalRuleCall_2_0());
            	    			
            	    // InternalQueryParser.g:1732:4: ( (lv_characteristicBasis_3_0= ruleCharacteristicBasis ) )
            	    // InternalQueryParser.g:1733:5: (lv_characteristicBasis_3_0= ruleCharacteristicBasis )
            	    {
            	    // InternalQueryParser.g:1733:5: (lv_characteristicBasis_3_0= ruleCharacteristicBasis )
            	    // InternalQueryParser.g:1734:6: lv_characteristicBasis_3_0= ruleCharacteristicBasis
            	    {

            	    						newCompositeNode(grammarAccess.getCharacteristicBasisSetAccess().getCharacteristicBasisCharacteristicBasisParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_characteristicBasis_3_0=ruleCharacteristicBasis();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCharacteristicBasisSetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"characteristicBasis",
            	    							lv_characteristicBasis_3_0,
            	    							"com.epistimis.uddl.query.Query.CharacteristicBasis");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            this_RIGHT_PAREN_4=(Token)match(input,RULE_RIGHT_PAREN,FOLLOW_2); 

            			newLeafNode(this_RIGHT_PAREN_4, grammarAccess.getCharacteristicBasisSetAccess().getRIGHT_PARENTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleCharacteristicBasisSet"


    // $ANTLR start "entryRuleCompareSet"
    // InternalQueryParser.g:1760:1: entryRuleCompareSet returns [EObject current=null] : iv_ruleCompareSet= ruleCompareSet EOF ;
    public final EObject entryRuleCompareSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareSet = null;


        try {
            // InternalQueryParser.g:1760:51: (iv_ruleCompareSet= ruleCompareSet EOF )
            // InternalQueryParser.g:1761:2: iv_ruleCompareSet= ruleCompareSet EOF
            {
             newCompositeNode(grammarAccess.getCompareSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompareSet=ruleCompareSet();

            state._fsp--;

             current =iv_ruleCompareSet; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCompareSet"


    // $ANTLR start "ruleCompareSet"
    // InternalQueryParser.g:1767:1: ruleCompareSet returns [EObject current=null] : this_Subquery_0= ruleSubquery ;
    public final EObject ruleCompareSet() throws RecognitionException {
        EObject current = null;

        EObject this_Subquery_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:1773:2: (this_Subquery_0= ruleSubquery )
            // InternalQueryParser.g:1774:2: this_Subquery_0= ruleSubquery
            {

            		newCompositeNode(grammarAccess.getCompareSetAccess().getSubqueryParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Subquery_0=ruleSubquery();

            state._fsp--;


            		current = this_Subquery_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleCompareSet"


    // $ANTLR start "entryRuleCompareOperator"
    // InternalQueryParser.g:1785:1: entryRuleCompareOperator returns [String current=null] : iv_ruleCompareOperator= ruleCompareOperator EOF ;
    public final String entryRuleCompareOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompareOperator = null;


        try {
            // InternalQueryParser.g:1785:55: (iv_ruleCompareOperator= ruleCompareOperator EOF )
            // InternalQueryParser.g:1786:2: iv_ruleCompareOperator= ruleCompareOperator EOF
            {
             newCompositeNode(grammarAccess.getCompareOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompareOperator=ruleCompareOperator();

            state._fsp--;

             current =iv_ruleCompareOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCompareOperator"


    // $ANTLR start "ruleCompareOperator"
    // InternalQueryParser.g:1792:1: ruleCompareOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EQUALS_OPERATOR_0= RULE_EQUALS_OPERATOR | this_NOT_EQUALS_OPERATOR_1= RULE_NOT_EQUALS_OPERATOR | this_LESS_THAN_OPERATOR_2= RULE_LESS_THAN_OPERATOR | this_GREATER_THAN_OPERATOR_3= RULE_GREATER_THAN_OPERATOR | this_LESS_THAN_OR_EQUALS_OPERATOR_4= RULE_LESS_THAN_OR_EQUALS_OPERATOR | this_GREATER_THAN_OR_EQUALS_OPERATOR_5= RULE_GREATER_THAN_OR_EQUALS_OPERATOR ) ;
    public final AntlrDatatypeRuleToken ruleCompareOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EQUALS_OPERATOR_0=null;
        Token this_NOT_EQUALS_OPERATOR_1=null;
        Token this_LESS_THAN_OPERATOR_2=null;
        Token this_GREATER_THAN_OPERATOR_3=null;
        Token this_LESS_THAN_OR_EQUALS_OPERATOR_4=null;
        Token this_GREATER_THAN_OR_EQUALS_OPERATOR_5=null;


        	enterRule();

        try {
            // InternalQueryParser.g:1798:2: ( (this_EQUALS_OPERATOR_0= RULE_EQUALS_OPERATOR | this_NOT_EQUALS_OPERATOR_1= RULE_NOT_EQUALS_OPERATOR | this_LESS_THAN_OPERATOR_2= RULE_LESS_THAN_OPERATOR | this_GREATER_THAN_OPERATOR_3= RULE_GREATER_THAN_OPERATOR | this_LESS_THAN_OR_EQUALS_OPERATOR_4= RULE_LESS_THAN_OR_EQUALS_OPERATOR | this_GREATER_THAN_OR_EQUALS_OPERATOR_5= RULE_GREATER_THAN_OR_EQUALS_OPERATOR ) )
            // InternalQueryParser.g:1799:2: (this_EQUALS_OPERATOR_0= RULE_EQUALS_OPERATOR | this_NOT_EQUALS_OPERATOR_1= RULE_NOT_EQUALS_OPERATOR | this_LESS_THAN_OPERATOR_2= RULE_LESS_THAN_OPERATOR | this_GREATER_THAN_OPERATOR_3= RULE_GREATER_THAN_OPERATOR | this_LESS_THAN_OR_EQUALS_OPERATOR_4= RULE_LESS_THAN_OR_EQUALS_OPERATOR | this_GREATER_THAN_OR_EQUALS_OPERATOR_5= RULE_GREATER_THAN_OR_EQUALS_OPERATOR )
            {
            // InternalQueryParser.g:1799:2: (this_EQUALS_OPERATOR_0= RULE_EQUALS_OPERATOR | this_NOT_EQUALS_OPERATOR_1= RULE_NOT_EQUALS_OPERATOR | this_LESS_THAN_OPERATOR_2= RULE_LESS_THAN_OPERATOR | this_GREATER_THAN_OPERATOR_3= RULE_GREATER_THAN_OPERATOR | this_LESS_THAN_OR_EQUALS_OPERATOR_4= RULE_LESS_THAN_OR_EQUALS_OPERATOR | this_GREATER_THAN_OR_EQUALS_OPERATOR_5= RULE_GREATER_THAN_OR_EQUALS_OPERATOR )
            int alt27=6;
            switch ( input.LA(1) ) {
            case RULE_EQUALS_OPERATOR:
                {
                alt27=1;
                }
                break;
            case RULE_NOT_EQUALS_OPERATOR:
                {
                alt27=2;
                }
                break;
            case RULE_LESS_THAN_OPERATOR:
                {
                alt27=3;
                }
                break;
            case RULE_GREATER_THAN_OPERATOR:
                {
                alt27=4;
                }
                break;
            case RULE_LESS_THAN_OR_EQUALS_OPERATOR:
                {
                alt27=5;
                }
                break;
            case RULE_GREATER_THAN_OR_EQUALS_OPERATOR:
                {
                alt27=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalQueryParser.g:1800:3: this_EQUALS_OPERATOR_0= RULE_EQUALS_OPERATOR
                    {
                    this_EQUALS_OPERATOR_0=(Token)match(input,RULE_EQUALS_OPERATOR,FOLLOW_2); 

                    			current.merge(this_EQUALS_OPERATOR_0);
                    		

                    			newLeafNode(this_EQUALS_OPERATOR_0, grammarAccess.getCompareOperatorAccess().getEQUALS_OPERATORTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQueryParser.g:1808:3: this_NOT_EQUALS_OPERATOR_1= RULE_NOT_EQUALS_OPERATOR
                    {
                    this_NOT_EQUALS_OPERATOR_1=(Token)match(input,RULE_NOT_EQUALS_OPERATOR,FOLLOW_2); 

                    			current.merge(this_NOT_EQUALS_OPERATOR_1);
                    		

                    			newLeafNode(this_NOT_EQUALS_OPERATOR_1, grammarAccess.getCompareOperatorAccess().getNOT_EQUALS_OPERATORTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalQueryParser.g:1816:3: this_LESS_THAN_OPERATOR_2= RULE_LESS_THAN_OPERATOR
                    {
                    this_LESS_THAN_OPERATOR_2=(Token)match(input,RULE_LESS_THAN_OPERATOR,FOLLOW_2); 

                    			current.merge(this_LESS_THAN_OPERATOR_2);
                    		

                    			newLeafNode(this_LESS_THAN_OPERATOR_2, grammarAccess.getCompareOperatorAccess().getLESS_THAN_OPERATORTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalQueryParser.g:1824:3: this_GREATER_THAN_OPERATOR_3= RULE_GREATER_THAN_OPERATOR
                    {
                    this_GREATER_THAN_OPERATOR_3=(Token)match(input,RULE_GREATER_THAN_OPERATOR,FOLLOW_2); 

                    			current.merge(this_GREATER_THAN_OPERATOR_3);
                    		

                    			newLeafNode(this_GREATER_THAN_OPERATOR_3, grammarAccess.getCompareOperatorAccess().getGREATER_THAN_OPERATORTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalQueryParser.g:1832:3: this_LESS_THAN_OR_EQUALS_OPERATOR_4= RULE_LESS_THAN_OR_EQUALS_OPERATOR
                    {
                    this_LESS_THAN_OR_EQUALS_OPERATOR_4=(Token)match(input,RULE_LESS_THAN_OR_EQUALS_OPERATOR,FOLLOW_2); 

                    			current.merge(this_LESS_THAN_OR_EQUALS_OPERATOR_4);
                    		

                    			newLeafNode(this_LESS_THAN_OR_EQUALS_OPERATOR_4, grammarAccess.getCompareOperatorAccess().getLESS_THAN_OR_EQUALS_OPERATORTerminalRuleCall_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalQueryParser.g:1840:3: this_GREATER_THAN_OR_EQUALS_OPERATOR_5= RULE_GREATER_THAN_OR_EQUALS_OPERATOR
                    {
                    this_GREATER_THAN_OR_EQUALS_OPERATOR_5=(Token)match(input,RULE_GREATER_THAN_OR_EQUALS_OPERATOR,FOLLOW_2); 

                    			current.merge(this_GREATER_THAN_OR_EQUALS_OPERATOR_5);
                    		

                    			newLeafNode(this_GREATER_THAN_OR_EQUALS_OPERATOR_5, grammarAccess.getCompareOperatorAccess().getGREATER_THAN_OR_EQUALS_OPERATORTerminalRuleCall_5());
                    		

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
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "entryRuleSetCompareQuantifier"
    // InternalQueryParser.g:1851:1: entryRuleSetCompareQuantifier returns [String current=null] : iv_ruleSetCompareQuantifier= ruleSetCompareQuantifier EOF ;
    public final String entryRuleSetCompareQuantifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSetCompareQuantifier = null;


        try {
            // InternalQueryParser.g:1851:60: (iv_ruleSetCompareQuantifier= ruleSetCompareQuantifier EOF )
            // InternalQueryParser.g:1852:2: iv_ruleSetCompareQuantifier= ruleSetCompareQuantifier EOF
            {
             newCompositeNode(grammarAccess.getSetCompareQuantifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetCompareQuantifier=ruleSetCompareQuantifier();

            state._fsp--;

             current =iv_ruleSetCompareQuantifier.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSetCompareQuantifier"


    // $ANTLR start "ruleSetCompareQuantifier"
    // InternalQueryParser.g:1858:1: ruleSetCompareQuantifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_KW_ALL_0= RULE_KW_ALL | this_KW_SOME_1= RULE_KW_SOME ) ;
    public final AntlrDatatypeRuleToken ruleSetCompareQuantifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_KW_ALL_0=null;
        Token this_KW_SOME_1=null;


        	enterRule();

        try {
            // InternalQueryParser.g:1864:2: ( (this_KW_ALL_0= RULE_KW_ALL | this_KW_SOME_1= RULE_KW_SOME ) )
            // InternalQueryParser.g:1865:2: (this_KW_ALL_0= RULE_KW_ALL | this_KW_SOME_1= RULE_KW_SOME )
            {
            // InternalQueryParser.g:1865:2: (this_KW_ALL_0= RULE_KW_ALL | this_KW_SOME_1= RULE_KW_SOME )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_KW_ALL) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_KW_SOME) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalQueryParser.g:1866:3: this_KW_ALL_0= RULE_KW_ALL
                    {
                    this_KW_ALL_0=(Token)match(input,RULE_KW_ALL,FOLLOW_2); 

                    			current.merge(this_KW_ALL_0);
                    		

                    			newLeafNode(this_KW_ALL_0, grammarAccess.getSetCompareQuantifierAccess().getKW_ALLTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQueryParser.g:1874:3: this_KW_SOME_1= RULE_KW_SOME
                    {
                    this_KW_SOME_1=(Token)match(input,RULE_KW_SOME,FOLLOW_2); 

                    			current.merge(this_KW_SOME_1);
                    		

                    			newLeafNode(this_KW_SOME_1, grammarAccess.getSetCompareQuantifierAccess().getKW_SOMETerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleSetCompareQuantifier"


    // $ANTLR start "entryRuleExistsPredicate"
    // InternalQueryParser.g:1885:1: entryRuleExistsPredicate returns [EObject current=null] : iv_ruleExistsPredicate= ruleExistsPredicate EOF ;
    public final EObject entryRuleExistsPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistsPredicate = null;


        try {
            // InternalQueryParser.g:1885:56: (iv_ruleExistsPredicate= ruleExistsPredicate EOF )
            // InternalQueryParser.g:1886:2: iv_ruleExistsPredicate= ruleExistsPredicate EOF
            {
             newCompositeNode(grammarAccess.getExistsPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistsPredicate=ruleExistsPredicate();

            state._fsp--;

             current =iv_ruleExistsPredicate; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExistsPredicate"


    // $ANTLR start "ruleExistsPredicate"
    // InternalQueryParser.g:1892:1: ruleExistsPredicate returns [EObject current=null] : (this_KW_EXISTS_0= RULE_KW_EXISTS ( (lv_sub_1_0= ruleSubquery ) ) ) ;
    public final EObject ruleExistsPredicate() throws RecognitionException {
        EObject current = null;

        Token this_KW_EXISTS_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:1898:2: ( (this_KW_EXISTS_0= RULE_KW_EXISTS ( (lv_sub_1_0= ruleSubquery ) ) ) )
            // InternalQueryParser.g:1899:2: (this_KW_EXISTS_0= RULE_KW_EXISTS ( (lv_sub_1_0= ruleSubquery ) ) )
            {
            // InternalQueryParser.g:1899:2: (this_KW_EXISTS_0= RULE_KW_EXISTS ( (lv_sub_1_0= ruleSubquery ) ) )
            // InternalQueryParser.g:1900:3: this_KW_EXISTS_0= RULE_KW_EXISTS ( (lv_sub_1_0= ruleSubquery ) )
            {
            this_KW_EXISTS_0=(Token)match(input,RULE_KW_EXISTS,FOLLOW_25); 

            			newLeafNode(this_KW_EXISTS_0, grammarAccess.getExistsPredicateAccess().getKW_EXISTSTerminalRuleCall_0());
            		
            // InternalQueryParser.g:1904:3: ( (lv_sub_1_0= ruleSubquery ) )
            // InternalQueryParser.g:1905:4: (lv_sub_1_0= ruleSubquery )
            {
            // InternalQueryParser.g:1905:4: (lv_sub_1_0= ruleSubquery )
            // InternalQueryParser.g:1906:5: lv_sub_1_0= ruleSubquery
            {

            					newCompositeNode(grammarAccess.getExistsPredicateAccess().getSubSubqueryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_sub_1_0=ruleSubquery();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExistsPredicateRule());
            					}
            					set(
            						current,
            						"sub",
            						lv_sub_1_0,
            						"com.epistimis.uddl.query.Query.Subquery");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleExistsPredicate"


    // $ANTLR start "entryRulePredicateTerm"
    // InternalQueryParser.g:1927:1: entryRulePredicateTerm returns [EObject current=null] : iv_rulePredicateTerm= rulePredicateTerm EOF ;
    public final EObject entryRulePredicateTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateTerm = null;


        try {
            // InternalQueryParser.g:1927:54: (iv_rulePredicateTerm= rulePredicateTerm EOF )
            // InternalQueryParser.g:1928:2: iv_rulePredicateTerm= rulePredicateTerm EOF
            {
             newCompositeNode(grammarAccess.getPredicateTermRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicateTerm=rulePredicateTerm();

            state._fsp--;

             current =iv_rulePredicateTerm; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePredicateTerm"


    // $ANTLR start "rulePredicateTerm"
    // InternalQueryParser.g:1934:1: rulePredicateTerm returns [EObject current=null] : (this_CharacteristicBasis_0= ruleCharacteristicBasis | this_EnumLiteralReferenceExpression_1= ruleEnumLiteralReferenceExpression ) ;
    public final EObject rulePredicateTerm() throws RecognitionException {
        EObject current = null;

        EObject this_CharacteristicBasis_0 = null;

        EObject this_EnumLiteralReferenceExpression_1 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:1940:2: ( (this_CharacteristicBasis_0= ruleCharacteristicBasis | this_EnumLiteralReferenceExpression_1= ruleEnumLiteralReferenceExpression ) )
            // InternalQueryParser.g:1941:2: (this_CharacteristicBasis_0= ruleCharacteristicBasis | this_EnumLiteralReferenceExpression_1= ruleEnumLiteralReferenceExpression )
            {
            // InternalQueryParser.g:1941:2: (this_CharacteristicBasis_0= ruleCharacteristicBasis | this_EnumLiteralReferenceExpression_1= ruleEnumLiteralReferenceExpression )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_LEFT_PAREN||LA29_0==RULE_IDENTIFIER) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_LEFT_BRACE) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalQueryParser.g:1942:3: this_CharacteristicBasis_0= ruleCharacteristicBasis
                    {

                    			newCompositeNode(grammarAccess.getPredicateTermAccess().getCharacteristicBasisParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CharacteristicBasis_0=ruleCharacteristicBasis();

                    state._fsp--;


                    			current = this_CharacteristicBasis_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQueryParser.g:1951:3: this_EnumLiteralReferenceExpression_1= ruleEnumLiteralReferenceExpression
                    {

                    			newCompositeNode(grammarAccess.getPredicateTermAccess().getEnumLiteralReferenceExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumLiteralReferenceExpression_1=ruleEnumLiteralReferenceExpression();

                    state._fsp--;


                    			current = this_EnumLiteralReferenceExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "rulePredicateTerm"


    // $ANTLR start "entryRuleCharacteristicBasis"
    // InternalQueryParser.g:1963:1: entryRuleCharacteristicBasis returns [EObject current=null] : iv_ruleCharacteristicBasis= ruleCharacteristicBasis EOF ;
    public final EObject entryRuleCharacteristicBasis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicBasis = null;


        try {
            // InternalQueryParser.g:1963:60: (iv_ruleCharacteristicBasis= ruleCharacteristicBasis EOF )
            // InternalQueryParser.g:1964:2: iv_ruleCharacteristicBasis= ruleCharacteristicBasis EOF
            {
             newCompositeNode(grammarAccess.getCharacteristicBasisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacteristicBasis=ruleCharacteristicBasis();

            state._fsp--;

             current =iv_ruleCharacteristicBasis; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCharacteristicBasis"


    // $ANTLR start "ruleCharacteristicBasis"
    // InternalQueryParser.g:1970:1: ruleCharacteristicBasis returns [EObject current=null] : (this_SelectedEntityCharacteristicReference_0= ruleSelectedEntityCharacteristicReference | this_Subquery_1= ruleSubquery ) ;
    public final EObject ruleCharacteristicBasis() throws RecognitionException {
        EObject current = null;

        EObject this_SelectedEntityCharacteristicReference_0 = null;

        EObject this_Subquery_1 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:1976:2: ( (this_SelectedEntityCharacteristicReference_0= ruleSelectedEntityCharacteristicReference | this_Subquery_1= ruleSubquery ) )
            // InternalQueryParser.g:1977:2: (this_SelectedEntityCharacteristicReference_0= ruleSelectedEntityCharacteristicReference | this_Subquery_1= ruleSubquery )
            {
            // InternalQueryParser.g:1977:2: (this_SelectedEntityCharacteristicReference_0= ruleSelectedEntityCharacteristicReference | this_Subquery_1= ruleSubquery )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_IDENTIFIER) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_LEFT_PAREN) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalQueryParser.g:1978:3: this_SelectedEntityCharacteristicReference_0= ruleSelectedEntityCharacteristicReference
                    {

                    			newCompositeNode(grammarAccess.getCharacteristicBasisAccess().getSelectedEntityCharacteristicReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelectedEntityCharacteristicReference_0=ruleSelectedEntityCharacteristicReference();

                    state._fsp--;


                    			current = this_SelectedEntityCharacteristicReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQueryParser.g:1987:3: this_Subquery_1= ruleSubquery
                    {

                    			newCompositeNode(grammarAccess.getCharacteristicBasisAccess().getSubqueryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Subquery_1=ruleSubquery();

                    state._fsp--;


                    			current = this_Subquery_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleCharacteristicBasis"


    // $ANTLR start "entryRuleSubquery"
    // InternalQueryParser.g:1999:1: entryRuleSubquery returns [EObject current=null] : iv_ruleSubquery= ruleSubquery EOF ;
    public final EObject entryRuleSubquery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubquery = null;


        try {
            // InternalQueryParser.g:1999:49: (iv_ruleSubquery= ruleSubquery EOF )
            // InternalQueryParser.g:2000:2: iv_ruleSubquery= ruleSubquery EOF
            {
             newCompositeNode(grammarAccess.getSubqueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubquery=ruleSubquery();

            state._fsp--;

             current =iv_ruleSubquery; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSubquery"


    // $ANTLR start "ruleSubquery"
    // InternalQueryParser.g:2006:1: ruleSubquery returns [EObject current=null] : (this_LEFT_PAREN_0= RULE_LEFT_PAREN ( (lv_query_1_0= ruleQueryStatement ) ) this_RIGHT_PAREN_2= RULE_RIGHT_PAREN ) ;
    public final EObject ruleSubquery() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_PAREN_0=null;
        Token this_RIGHT_PAREN_2=null;
        EObject lv_query_1_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:2012:2: ( (this_LEFT_PAREN_0= RULE_LEFT_PAREN ( (lv_query_1_0= ruleQueryStatement ) ) this_RIGHT_PAREN_2= RULE_RIGHT_PAREN ) )
            // InternalQueryParser.g:2013:2: (this_LEFT_PAREN_0= RULE_LEFT_PAREN ( (lv_query_1_0= ruleQueryStatement ) ) this_RIGHT_PAREN_2= RULE_RIGHT_PAREN )
            {
            // InternalQueryParser.g:2013:2: (this_LEFT_PAREN_0= RULE_LEFT_PAREN ( (lv_query_1_0= ruleQueryStatement ) ) this_RIGHT_PAREN_2= RULE_RIGHT_PAREN )
            // InternalQueryParser.g:2014:3: this_LEFT_PAREN_0= RULE_LEFT_PAREN ( (lv_query_1_0= ruleQueryStatement ) ) this_RIGHT_PAREN_2= RULE_RIGHT_PAREN
            {
            this_LEFT_PAREN_0=(Token)match(input,RULE_LEFT_PAREN,FOLLOW_27); 

            			newLeafNode(this_LEFT_PAREN_0, grammarAccess.getSubqueryAccess().getLEFT_PARENTerminalRuleCall_0());
            		
            // InternalQueryParser.g:2018:3: ( (lv_query_1_0= ruleQueryStatement ) )
            // InternalQueryParser.g:2019:4: (lv_query_1_0= ruleQueryStatement )
            {
            // InternalQueryParser.g:2019:4: (lv_query_1_0= ruleQueryStatement )
            // InternalQueryParser.g:2020:5: lv_query_1_0= ruleQueryStatement
            {

            					newCompositeNode(grammarAccess.getSubqueryAccess().getQueryQueryStatementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_query_1_0=ruleQueryStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubqueryRule());
            					}
            					set(
            						current,
            						"query",
            						lv_query_1_0,
            						"com.epistimis.uddl.query.Query.QueryStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RIGHT_PAREN_2=(Token)match(input,RULE_RIGHT_PAREN,FOLLOW_2); 

            			newLeafNode(this_RIGHT_PAREN_2, grammarAccess.getSubqueryAccess().getRIGHT_PARENTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleSubquery"


    // $ANTLR start "entryRuleCharacteristicReference"
    // InternalQueryParser.g:2045:1: entryRuleCharacteristicReference returns [EObject current=null] : iv_ruleCharacteristicReference= ruleCharacteristicReference EOF ;
    public final EObject entryRuleCharacteristicReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicReference = null;


        try {
            // InternalQueryParser.g:2045:64: (iv_ruleCharacteristicReference= ruleCharacteristicReference EOF )
            // InternalQueryParser.g:2046:2: iv_ruleCharacteristicReference= ruleCharacteristicReference EOF
            {
             newCompositeNode(grammarAccess.getCharacteristicReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacteristicReference=ruleCharacteristicReference();

            state._fsp--;

             current =iv_ruleCharacteristicReference; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCharacteristicReference"


    // $ANTLR start "ruleCharacteristicReference"
    // InternalQueryParser.g:2052:1: ruleCharacteristicReference returns [EObject current=null] : this_QueryIdentifier_0= ruleQueryIdentifier ;
    public final EObject ruleCharacteristicReference() throws RecognitionException {
        EObject current = null;

        EObject this_QueryIdentifier_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:2058:2: (this_QueryIdentifier_0= ruleQueryIdentifier )
            // InternalQueryParser.g:2059:2: this_QueryIdentifier_0= ruleQueryIdentifier
            {

            		newCompositeNode(grammarAccess.getCharacteristicReferenceAccess().getQueryIdentifierParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_QueryIdentifier_0=ruleQueryIdentifier();

            state._fsp--;


            		current = this_QueryIdentifier_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleCharacteristicReference"


    // $ANTLR start "entryRuleEntityTypeReference"
    // InternalQueryParser.g:2070:1: entryRuleEntityTypeReference returns [EObject current=null] : iv_ruleEntityTypeReference= ruleEntityTypeReference EOF ;
    public final EObject entryRuleEntityTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityTypeReference = null;


        try {
            // InternalQueryParser.g:2070:60: (iv_ruleEntityTypeReference= ruleEntityTypeReference EOF )
            // InternalQueryParser.g:2071:2: iv_ruleEntityTypeReference= ruleEntityTypeReference EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityTypeReference=ruleEntityTypeReference();

            state._fsp--;

             current =iv_ruleEntityTypeReference; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntityTypeReference"


    // $ANTLR start "ruleEntityTypeReference"
    // InternalQueryParser.g:2077:1: ruleEntityTypeReference returns [EObject current=null] : this_QueryIdentifier_0= ruleQueryIdentifier ;
    public final EObject ruleEntityTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_QueryIdentifier_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:2083:2: (this_QueryIdentifier_0= ruleQueryIdentifier )
            // InternalQueryParser.g:2084:2: this_QueryIdentifier_0= ruleQueryIdentifier
            {

            		newCompositeNode(grammarAccess.getEntityTypeReferenceAccess().getQueryIdentifierParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_QueryIdentifier_0=ruleQueryIdentifier();

            state._fsp--;


            		current = this_QueryIdentifier_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleEntityTypeReference"


    // $ANTLR start "entryRuleEnumLiteralSet"
    // InternalQueryParser.g:2095:1: entryRuleEnumLiteralSet returns [EObject current=null] : iv_ruleEnumLiteralSet= ruleEnumLiteralSet EOF ;
    public final EObject entryRuleEnumLiteralSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteralSet = null;


        try {
            // InternalQueryParser.g:2095:55: (iv_ruleEnumLiteralSet= ruleEnumLiteralSet EOF )
            // InternalQueryParser.g:2096:2: iv_ruleEnumLiteralSet= ruleEnumLiteralSet EOF
            {
             newCompositeNode(grammarAccess.getEnumLiteralSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumLiteralSet=ruleEnumLiteralSet();

            state._fsp--;

             current =iv_ruleEnumLiteralSet; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumLiteralSet"


    // $ANTLR start "ruleEnumLiteralSet"
    // InternalQueryParser.g:2102:1: ruleEnumLiteralSet returns [EObject current=null] : (this_LEFT_BRACE_0= RULE_LEFT_BRACE ( (lv_type_1_0= ruleEnumerationTypeReference ) ) this_COLON_2= RULE_COLON ( (lv_literal_3_0= ruleEnumerationLiteralReference ) ) (this_COMMA_4= RULE_COMMA ( (lv_literal_5_0= ruleEnumerationLiteralReference ) ) )* this_RIGHT_BRACE_6= RULE_RIGHT_BRACE ) ;
    public final EObject ruleEnumLiteralSet() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_BRACE_0=null;
        Token this_COLON_2=null;
        Token this_COMMA_4=null;
        Token this_RIGHT_BRACE_6=null;
        EObject lv_type_1_0 = null;

        EObject lv_literal_3_0 = null;

        EObject lv_literal_5_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:2108:2: ( (this_LEFT_BRACE_0= RULE_LEFT_BRACE ( (lv_type_1_0= ruleEnumerationTypeReference ) ) this_COLON_2= RULE_COLON ( (lv_literal_3_0= ruleEnumerationLiteralReference ) ) (this_COMMA_4= RULE_COMMA ( (lv_literal_5_0= ruleEnumerationLiteralReference ) ) )* this_RIGHT_BRACE_6= RULE_RIGHT_BRACE ) )
            // InternalQueryParser.g:2109:2: (this_LEFT_BRACE_0= RULE_LEFT_BRACE ( (lv_type_1_0= ruleEnumerationTypeReference ) ) this_COLON_2= RULE_COLON ( (lv_literal_3_0= ruleEnumerationLiteralReference ) ) (this_COMMA_4= RULE_COMMA ( (lv_literal_5_0= ruleEnumerationLiteralReference ) ) )* this_RIGHT_BRACE_6= RULE_RIGHT_BRACE )
            {
            // InternalQueryParser.g:2109:2: (this_LEFT_BRACE_0= RULE_LEFT_BRACE ( (lv_type_1_0= ruleEnumerationTypeReference ) ) this_COLON_2= RULE_COLON ( (lv_literal_3_0= ruleEnumerationLiteralReference ) ) (this_COMMA_4= RULE_COMMA ( (lv_literal_5_0= ruleEnumerationLiteralReference ) ) )* this_RIGHT_BRACE_6= RULE_RIGHT_BRACE )
            // InternalQueryParser.g:2110:3: this_LEFT_BRACE_0= RULE_LEFT_BRACE ( (lv_type_1_0= ruleEnumerationTypeReference ) ) this_COLON_2= RULE_COLON ( (lv_literal_3_0= ruleEnumerationLiteralReference ) ) (this_COMMA_4= RULE_COMMA ( (lv_literal_5_0= ruleEnumerationLiteralReference ) ) )* this_RIGHT_BRACE_6= RULE_RIGHT_BRACE
            {
            this_LEFT_BRACE_0=(Token)match(input,RULE_LEFT_BRACE,FOLLOW_13); 

            			newLeafNode(this_LEFT_BRACE_0, grammarAccess.getEnumLiteralSetAccess().getLEFT_BRACETerminalRuleCall_0());
            		
            // InternalQueryParser.g:2114:3: ( (lv_type_1_0= ruleEnumerationTypeReference ) )
            // InternalQueryParser.g:2115:4: (lv_type_1_0= ruleEnumerationTypeReference )
            {
            // InternalQueryParser.g:2115:4: (lv_type_1_0= ruleEnumerationTypeReference )
            // InternalQueryParser.g:2116:5: lv_type_1_0= ruleEnumerationTypeReference
            {

            					newCompositeNode(grammarAccess.getEnumLiteralSetAccess().getTypeEnumerationTypeReferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_type_1_0=ruleEnumerationTypeReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumLiteralSetRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"com.epistimis.uddl.query.Query.EnumerationTypeReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_13); 

            			newLeafNode(this_COLON_2, grammarAccess.getEnumLiteralSetAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalQueryParser.g:2137:3: ( (lv_literal_3_0= ruleEnumerationLiteralReference ) )
            // InternalQueryParser.g:2138:4: (lv_literal_3_0= ruleEnumerationLiteralReference )
            {
            // InternalQueryParser.g:2138:4: (lv_literal_3_0= ruleEnumerationLiteralReference )
            // InternalQueryParser.g:2139:5: lv_literal_3_0= ruleEnumerationLiteralReference
            {

            					newCompositeNode(grammarAccess.getEnumLiteralSetAccess().getLiteralEnumerationLiteralReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_literal_3_0=ruleEnumerationLiteralReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumLiteralSetRule());
            					}
            					add(
            						current,
            						"literal",
            						lv_literal_3_0,
            						"com.epistimis.uddl.query.Query.EnumerationLiteralReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryParser.g:2156:3: (this_COMMA_4= RULE_COMMA ( (lv_literal_5_0= ruleEnumerationLiteralReference ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_COMMA) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalQueryParser.g:2157:4: this_COMMA_4= RULE_COMMA ( (lv_literal_5_0= ruleEnumerationLiteralReference ) )
            	    {
            	    this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_13); 

            	    				newLeafNode(this_COMMA_4, grammarAccess.getEnumLiteralSetAccess().getCOMMATerminalRuleCall_4_0());
            	    			
            	    // InternalQueryParser.g:2161:4: ( (lv_literal_5_0= ruleEnumerationLiteralReference ) )
            	    // InternalQueryParser.g:2162:5: (lv_literal_5_0= ruleEnumerationLiteralReference )
            	    {
            	    // InternalQueryParser.g:2162:5: (lv_literal_5_0= ruleEnumerationLiteralReference )
            	    // InternalQueryParser.g:2163:6: lv_literal_5_0= ruleEnumerationLiteralReference
            	    {

            	    						newCompositeNode(grammarAccess.getEnumLiteralSetAccess().getLiteralEnumerationLiteralReferenceParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_literal_5_0=ruleEnumerationLiteralReference();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnumLiteralSetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"literal",
            	    							lv_literal_5_0,
            	    							"com.epistimis.uddl.query.Query.EnumerationLiteralReference");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            this_RIGHT_BRACE_6=(Token)match(input,RULE_RIGHT_BRACE,FOLLOW_2); 

            			newLeafNode(this_RIGHT_BRACE_6, grammarAccess.getEnumLiteralSetAccess().getRIGHT_BRACETerminalRuleCall_5());
            		

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
    // $ANTLR end "ruleEnumLiteralSet"


    // $ANTLR start "entryRuleEnumLiteralReferenceExpression"
    // InternalQueryParser.g:2189:1: entryRuleEnumLiteralReferenceExpression returns [EObject current=null] : iv_ruleEnumLiteralReferenceExpression= ruleEnumLiteralReferenceExpression EOF ;
    public final EObject entryRuleEnumLiteralReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteralReferenceExpression = null;


        try {
            // InternalQueryParser.g:2189:71: (iv_ruleEnumLiteralReferenceExpression= ruleEnumLiteralReferenceExpression EOF )
            // InternalQueryParser.g:2190:2: iv_ruleEnumLiteralReferenceExpression= ruleEnumLiteralReferenceExpression EOF
            {
             newCompositeNode(grammarAccess.getEnumLiteralReferenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumLiteralReferenceExpression=ruleEnumLiteralReferenceExpression();

            state._fsp--;

             current =iv_ruleEnumLiteralReferenceExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumLiteralReferenceExpression"


    // $ANTLR start "ruleEnumLiteralReferenceExpression"
    // InternalQueryParser.g:2196:1: ruleEnumLiteralReferenceExpression returns [EObject current=null] : (this_LEFT_BRACE_0= RULE_LEFT_BRACE ( (lv_typ_1_0= ruleEnumerationTypeReference ) ) this_COLON_2= RULE_COLON ( (lv_literal_3_0= ruleEnumerationLiteralReference ) ) this_RIGHT_BRACE_4= RULE_RIGHT_BRACE ) ;
    public final EObject ruleEnumLiteralReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_BRACE_0=null;
        Token this_COLON_2=null;
        Token this_RIGHT_BRACE_4=null;
        EObject lv_typ_1_0 = null;

        EObject lv_literal_3_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:2202:2: ( (this_LEFT_BRACE_0= RULE_LEFT_BRACE ( (lv_typ_1_0= ruleEnumerationTypeReference ) ) this_COLON_2= RULE_COLON ( (lv_literal_3_0= ruleEnumerationLiteralReference ) ) this_RIGHT_BRACE_4= RULE_RIGHT_BRACE ) )
            // InternalQueryParser.g:2203:2: (this_LEFT_BRACE_0= RULE_LEFT_BRACE ( (lv_typ_1_0= ruleEnumerationTypeReference ) ) this_COLON_2= RULE_COLON ( (lv_literal_3_0= ruleEnumerationLiteralReference ) ) this_RIGHT_BRACE_4= RULE_RIGHT_BRACE )
            {
            // InternalQueryParser.g:2203:2: (this_LEFT_BRACE_0= RULE_LEFT_BRACE ( (lv_typ_1_0= ruleEnumerationTypeReference ) ) this_COLON_2= RULE_COLON ( (lv_literal_3_0= ruleEnumerationLiteralReference ) ) this_RIGHT_BRACE_4= RULE_RIGHT_BRACE )
            // InternalQueryParser.g:2204:3: this_LEFT_BRACE_0= RULE_LEFT_BRACE ( (lv_typ_1_0= ruleEnumerationTypeReference ) ) this_COLON_2= RULE_COLON ( (lv_literal_3_0= ruleEnumerationLiteralReference ) ) this_RIGHT_BRACE_4= RULE_RIGHT_BRACE
            {
            this_LEFT_BRACE_0=(Token)match(input,RULE_LEFT_BRACE,FOLLOW_13); 

            			newLeafNode(this_LEFT_BRACE_0, grammarAccess.getEnumLiteralReferenceExpressionAccess().getLEFT_BRACETerminalRuleCall_0());
            		
            // InternalQueryParser.g:2208:3: ( (lv_typ_1_0= ruleEnumerationTypeReference ) )
            // InternalQueryParser.g:2209:4: (lv_typ_1_0= ruleEnumerationTypeReference )
            {
            // InternalQueryParser.g:2209:4: (lv_typ_1_0= ruleEnumerationTypeReference )
            // InternalQueryParser.g:2210:5: lv_typ_1_0= ruleEnumerationTypeReference
            {

            					newCompositeNode(grammarAccess.getEnumLiteralReferenceExpressionAccess().getTypEnumerationTypeReferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_typ_1_0=ruleEnumerationTypeReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumLiteralReferenceExpressionRule());
            					}
            					set(
            						current,
            						"typ",
            						lv_typ_1_0,
            						"com.epistimis.uddl.query.Query.EnumerationTypeReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_13); 

            			newLeafNode(this_COLON_2, grammarAccess.getEnumLiteralReferenceExpressionAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalQueryParser.g:2231:3: ( (lv_literal_3_0= ruleEnumerationLiteralReference ) )
            // InternalQueryParser.g:2232:4: (lv_literal_3_0= ruleEnumerationLiteralReference )
            {
            // InternalQueryParser.g:2232:4: (lv_literal_3_0= ruleEnumerationLiteralReference )
            // InternalQueryParser.g:2233:5: lv_literal_3_0= ruleEnumerationLiteralReference
            {

            					newCompositeNode(grammarAccess.getEnumLiteralReferenceExpressionAccess().getLiteralEnumerationLiteralReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
            lv_literal_3_0=ruleEnumerationLiteralReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumLiteralReferenceExpressionRule());
            					}
            					set(
            						current,
            						"literal",
            						lv_literal_3_0,
            						"com.epistimis.uddl.query.Query.EnumerationLiteralReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RIGHT_BRACE_4=(Token)match(input,RULE_RIGHT_BRACE,FOLLOW_2); 

            			newLeafNode(this_RIGHT_BRACE_4, grammarAccess.getEnumLiteralReferenceExpressionAccess().getRIGHT_BRACETerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleEnumLiteralReferenceExpression"


    // $ANTLR start "entryRuleEnumerationTypeReference"
    // InternalQueryParser.g:2258:1: entryRuleEnumerationTypeReference returns [EObject current=null] : iv_ruleEnumerationTypeReference= ruleEnumerationTypeReference EOF ;
    public final EObject entryRuleEnumerationTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationTypeReference = null;


        try {
            // InternalQueryParser.g:2258:65: (iv_ruleEnumerationTypeReference= ruleEnumerationTypeReference EOF )
            // InternalQueryParser.g:2259:2: iv_ruleEnumerationTypeReference= ruleEnumerationTypeReference EOF
            {
             newCompositeNode(grammarAccess.getEnumerationTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationTypeReference=ruleEnumerationTypeReference();

            state._fsp--;

             current =iv_ruleEnumerationTypeReference; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumerationTypeReference"


    // $ANTLR start "ruleEnumerationTypeReference"
    // InternalQueryParser.g:2265:1: ruleEnumerationTypeReference returns [EObject current=null] : this_QueryIdentifier_0= ruleQueryIdentifier ;
    public final EObject ruleEnumerationTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_QueryIdentifier_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:2271:2: (this_QueryIdentifier_0= ruleQueryIdentifier )
            // InternalQueryParser.g:2272:2: this_QueryIdentifier_0= ruleQueryIdentifier
            {

            		newCompositeNode(grammarAccess.getEnumerationTypeReferenceAccess().getQueryIdentifierParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_QueryIdentifier_0=ruleQueryIdentifier();

            state._fsp--;


            		current = this_QueryIdentifier_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleEnumerationTypeReference"


    // $ANTLR start "entryRuleEnumerationLiteralReference"
    // InternalQueryParser.g:2283:1: entryRuleEnumerationLiteralReference returns [EObject current=null] : iv_ruleEnumerationLiteralReference= ruleEnumerationLiteralReference EOF ;
    public final EObject entryRuleEnumerationLiteralReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteralReference = null;


        try {
            // InternalQueryParser.g:2283:68: (iv_ruleEnumerationLiteralReference= ruleEnumerationLiteralReference EOF )
            // InternalQueryParser.g:2284:2: iv_ruleEnumerationLiteralReference= ruleEnumerationLiteralReference EOF
            {
             newCompositeNode(grammarAccess.getEnumerationLiteralReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationLiteralReference=ruleEnumerationLiteralReference();

            state._fsp--;

             current =iv_ruleEnumerationLiteralReference; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumerationLiteralReference"


    // $ANTLR start "ruleEnumerationLiteralReference"
    // InternalQueryParser.g:2290:1: ruleEnumerationLiteralReference returns [EObject current=null] : this_QueryIdentifier_0= ruleQueryIdentifier ;
    public final EObject ruleEnumerationLiteralReference() throws RecognitionException {
        EObject current = null;

        EObject this_QueryIdentifier_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:2296:2: (this_QueryIdentifier_0= ruleQueryIdentifier )
            // InternalQueryParser.g:2297:2: this_QueryIdentifier_0= ruleQueryIdentifier
            {

            		newCompositeNode(grammarAccess.getEnumerationLiteralReferenceAccess().getQueryIdentifierParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_QueryIdentifier_0=ruleQueryIdentifier();

            state._fsp--;


            		current = this_QueryIdentifier_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleEnumerationLiteralReference"


    // $ANTLR start "entryRuleSelectedEntityAlias"
    // InternalQueryParser.g:2308:1: entryRuleSelectedEntityAlias returns [EObject current=null] : iv_ruleSelectedEntityAlias= ruleSelectedEntityAlias EOF ;
    public final EObject entryRuleSelectedEntityAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectedEntityAlias = null;


        try {
            // InternalQueryParser.g:2308:60: (iv_ruleSelectedEntityAlias= ruleSelectedEntityAlias EOF )
            // InternalQueryParser.g:2309:2: iv_ruleSelectedEntityAlias= ruleSelectedEntityAlias EOF
            {
             newCompositeNode(grammarAccess.getSelectedEntityAliasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectedEntityAlias=ruleSelectedEntityAlias();

            state._fsp--;

             current =iv_ruleSelectedEntityAlias; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectedEntityAlias"


    // $ANTLR start "ruleSelectedEntityAlias"
    // InternalQueryParser.g:2315:1: ruleSelectedEntityAlias returns [EObject current=null] : this_QueryIdentifier_0= ruleQueryIdentifier ;
    public final EObject ruleSelectedEntityAlias() throws RecognitionException {
        EObject current = null;

        EObject this_QueryIdentifier_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:2321:2: (this_QueryIdentifier_0= ruleQueryIdentifier )
            // InternalQueryParser.g:2322:2: this_QueryIdentifier_0= ruleQueryIdentifier
            {

            		newCompositeNode(grammarAccess.getSelectedEntityAliasAccess().getQueryIdentifierParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_QueryIdentifier_0=ruleQueryIdentifier();

            state._fsp--;


            		current = this_QueryIdentifier_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleSelectedEntityAlias"


    // $ANTLR start "entryRuleProjectedCharacteristicAlias"
    // InternalQueryParser.g:2333:1: entryRuleProjectedCharacteristicAlias returns [EObject current=null] : iv_ruleProjectedCharacteristicAlias= ruleProjectedCharacteristicAlias EOF ;
    public final EObject entryRuleProjectedCharacteristicAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectedCharacteristicAlias = null;


        try {
            // InternalQueryParser.g:2333:69: (iv_ruleProjectedCharacteristicAlias= ruleProjectedCharacteristicAlias EOF )
            // InternalQueryParser.g:2334:2: iv_ruleProjectedCharacteristicAlias= ruleProjectedCharacteristicAlias EOF
            {
             newCompositeNode(grammarAccess.getProjectedCharacteristicAliasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjectedCharacteristicAlias=ruleProjectedCharacteristicAlias();

            state._fsp--;

             current =iv_ruleProjectedCharacteristicAlias; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProjectedCharacteristicAlias"


    // $ANTLR start "ruleProjectedCharacteristicAlias"
    // InternalQueryParser.g:2340:1: ruleProjectedCharacteristicAlias returns [EObject current=null] : this_QueryIdentifier_0= ruleQueryIdentifier ;
    public final EObject ruleProjectedCharacteristicAlias() throws RecognitionException {
        EObject current = null;

        EObject this_QueryIdentifier_0 = null;



        	enterRule();

        try {
            // InternalQueryParser.g:2346:2: (this_QueryIdentifier_0= ruleQueryIdentifier )
            // InternalQueryParser.g:2347:2: this_QueryIdentifier_0= ruleQueryIdentifier
            {

            		newCompositeNode(grammarAccess.getProjectedCharacteristicAliasAccess().getQueryIdentifierParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_QueryIdentifier_0=ruleQueryIdentifier();

            state._fsp--;


            		current = this_QueryIdentifier_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleProjectedCharacteristicAlias"


    // $ANTLR start "entryRuleQueryIdentifier"
    // InternalQueryParser.g:2358:1: entryRuleQueryIdentifier returns [EObject current=null] : iv_ruleQueryIdentifier= ruleQueryIdentifier EOF ;
    public final EObject entryRuleQueryIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryIdentifier = null;


        try {
            // InternalQueryParser.g:2358:56: (iv_ruleQueryIdentifier= ruleQueryIdentifier EOF )
            // InternalQueryParser.g:2359:2: iv_ruleQueryIdentifier= ruleQueryIdentifier EOF
            {
             newCompositeNode(grammarAccess.getQueryIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQueryIdentifier=ruleQueryIdentifier();

            state._fsp--;

             current =iv_ruleQueryIdentifier; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQueryIdentifier"


    // $ANTLR start "ruleQueryIdentifier"
    // InternalQueryParser.g:2365:1: ruleQueryIdentifier returns [EObject current=null] : ( (lv_id_0_0= RULE_IDENTIFIER ) ) ;
    public final EObject ruleQueryIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalQueryParser.g:2371:2: ( ( (lv_id_0_0= RULE_IDENTIFIER ) ) )
            // InternalQueryParser.g:2372:2: ( (lv_id_0_0= RULE_IDENTIFIER ) )
            {
            // InternalQueryParser.g:2372:2: ( (lv_id_0_0= RULE_IDENTIFIER ) )
            // InternalQueryParser.g:2373:3: (lv_id_0_0= RULE_IDENTIFIER )
            {
            // InternalQueryParser.g:2373:3: (lv_id_0_0= RULE_IDENTIFIER )
            // InternalQueryParser.g:2374:4: lv_id_0_0= RULE_IDENTIFIER
            {
            lv_id_0_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); 

            				newLeafNode(lv_id_0_0, grammarAccess.getQueryIdentifierAccess().getIdIDENTIFIERTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getQueryIdentifierRule());
            				}
            				setWithLastConsumed(
            					current,
            					"id",
            					lv_id_0_0,
            					"com.epistimis.uddl.query.Query.IDENTIFIER");
            			

            }


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
    // $ANTLR end "ruleQueryIdentifier"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000008000010180L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000008000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000008000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000220002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008480010D80L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008480010180L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008080010180L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});

}