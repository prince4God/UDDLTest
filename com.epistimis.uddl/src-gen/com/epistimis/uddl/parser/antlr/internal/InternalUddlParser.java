package com.epistimis.uddl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.epistimis.uddl.services.UddlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUddlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_DEC", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'dm'", "'{'", "'}'", "'.'", "'.*'", "'cdm'", "'ldm'", "'pdm'", "'basis'", "';'", "'domain'", "'observable'", "'centity'", "':'", "'basis:'", "'['", "']'", "'};'", "'cassoc'", "'participants:'", "'src:'", "'path:'", "'/'", "'#'", "'cquery'", "'spec:'", "'ccquery'", "'isUnion'", "'lunit'", "'conv'", "'-()>'", "'aconv'", "'-('", "'m:'", "'b:'", "')->'", "'str'", "'ch'", "'bool'", "'int'", "'nat'", "'real'", "'real+'", "'enum'", "'stdRef:'", "','", "'('", "')'", "'coord'", "'axis:'", "'angleEq:'", "'distanceEq:'", "'csa'", "'smsys'", "'refStd:'", "'landmark'", "'msys'", "'maxis:'", "'coord:'", "'extRefStd:'", "'orient:'", "'refPt:'", "'!['", "'msa'", "'vtu:'", "'landmark:'", "'vtu'", "'!'", "'irc'", "'rrc'", "'rec'", "'flsc'", "'ec'", "'msc'", "')>'", "'loss:'", "'meas'", "'->'", "'sys:'", "'maxis'", "'msaxis:'", "'mc'", "'lentity'", "'lassoc'", "'source:'", "'lquery'", "'lcquery'", "'octet'", "'char'", "'string'", "'string['", "'char['", "'short'", "'long'", "'llong'", "'double'", "'ldouble'", "'float'", "'fixed['", "'ushort'", "'ulong'", "'ullong'", "'seq'", "'arr'", "'struct'", "'pentity'", "'prec:'", "'passoc'", "'pquery'", "'pcquery'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_DEC=8;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=7;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__120=120;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalUddlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUddlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUddlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUddl.g"; }



     	private UddlGrammarAccess grammarAccess;

        public InternalUddlParser(TokenStream input, UddlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DataModel";
       	}

       	@Override
       	protected UddlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDataModel"
    // InternalUddl.g:67:1: entryRuleDataModel returns [EObject current=null] : iv_ruleDataModel= ruleDataModel EOF ;
    public final EObject entryRuleDataModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataModel = null;


        try {
            // InternalUddl.g:67:50: (iv_ruleDataModel= ruleDataModel EOF )
            // InternalUddl.g:68:2: iv_ruleDataModel= ruleDataModel EOF
            {
             newCompositeNode(grammarAccess.getDataModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataModel=ruleDataModel();

            state._fsp--;

             current =iv_ruleDataModel; 
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
    // $ANTLR end "entryRuleDataModel"


    // $ANTLR start "ruleDataModel"
    // InternalUddl.g:74:1: ruleDataModel returns [EObject current=null] : (otherlv_0= 'dm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_cdm_4_0= ruleConceptualDataModel ) ) | ( (lv_ldm_5_0= ruleLogicalDataModel ) ) | ( (lv_pdm_6_0= rulePlatformDataModel ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleDataModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_cdm_4_0 = null;

        EObject lv_ldm_5_0 = null;

        EObject lv_pdm_6_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:80:2: ( (otherlv_0= 'dm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_cdm_4_0= ruleConceptualDataModel ) ) | ( (lv_ldm_5_0= ruleLogicalDataModel ) ) | ( (lv_pdm_6_0= rulePlatformDataModel ) ) )* otherlv_7= '}' ) )
            // InternalUddl.g:81:2: (otherlv_0= 'dm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_cdm_4_0= ruleConceptualDataModel ) ) | ( (lv_ldm_5_0= ruleLogicalDataModel ) ) | ( (lv_pdm_6_0= rulePlatformDataModel ) ) )* otherlv_7= '}' )
            {
            // InternalUddl.g:81:2: (otherlv_0= 'dm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_cdm_4_0= ruleConceptualDataModel ) ) | ( (lv_ldm_5_0= ruleLogicalDataModel ) ) | ( (lv_pdm_6_0= rulePlatformDataModel ) ) )* otherlv_7= '}' )
            // InternalUddl.g:82:3: otherlv_0= 'dm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_cdm_4_0= ruleConceptualDataModel ) ) | ( (lv_ldm_5_0= ruleLogicalDataModel ) ) | ( (lv_pdm_6_0= rulePlatformDataModel ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDataModelAccess().getDmKeyword_0());
            		
            // InternalUddl.g:86:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:87:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:87:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:88:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:104:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalUddl.g:105:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:105:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:106:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getDataModelAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDataModelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUddl.g:126:3: ( ( (lv_cdm_4_0= ruleConceptualDataModel ) ) | ( (lv_ldm_5_0= ruleLogicalDataModel ) ) | ( (lv_pdm_6_0= rulePlatformDataModel ) ) )*
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    alt2=1;
                    }
                    break;
                case 19:
                    {
                    alt2=2;
                    }
                    break;
                case 20:
                    {
                    alt2=3;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalUddl.g:127:4: ( (lv_cdm_4_0= ruleConceptualDataModel ) )
            	    {
            	    // InternalUddl.g:127:4: ( (lv_cdm_4_0= ruleConceptualDataModel ) )
            	    // InternalUddl.g:128:5: (lv_cdm_4_0= ruleConceptualDataModel )
            	    {
            	    // InternalUddl.g:128:5: (lv_cdm_4_0= ruleConceptualDataModel )
            	    // InternalUddl.g:129:6: lv_cdm_4_0= ruleConceptualDataModel
            	    {

            	    						newCompositeNode(grammarAccess.getDataModelAccess().getCdmConceptualDataModelParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_cdm_4_0=ruleConceptualDataModel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDataModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"cdm",
            	    							lv_cdm_4_0,
            	    							"com.epistimis.uddl.Uddl.ConceptualDataModel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUddl.g:147:4: ( (lv_ldm_5_0= ruleLogicalDataModel ) )
            	    {
            	    // InternalUddl.g:147:4: ( (lv_ldm_5_0= ruleLogicalDataModel ) )
            	    // InternalUddl.g:148:5: (lv_ldm_5_0= ruleLogicalDataModel )
            	    {
            	    // InternalUddl.g:148:5: (lv_ldm_5_0= ruleLogicalDataModel )
            	    // InternalUddl.g:149:6: lv_ldm_5_0= ruleLogicalDataModel
            	    {

            	    						newCompositeNode(grammarAccess.getDataModelAccess().getLdmLogicalDataModelParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_ldm_5_0=ruleLogicalDataModel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDataModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ldm",
            	    							lv_ldm_5_0,
            	    							"com.epistimis.uddl.Uddl.LogicalDataModel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalUddl.g:167:4: ( (lv_pdm_6_0= rulePlatformDataModel ) )
            	    {
            	    // InternalUddl.g:167:4: ( (lv_pdm_6_0= rulePlatformDataModel ) )
            	    // InternalUddl.g:168:5: (lv_pdm_6_0= rulePlatformDataModel )
            	    {
            	    // InternalUddl.g:168:5: (lv_pdm_6_0= rulePlatformDataModel )
            	    // InternalUddl.g:169:6: lv_pdm_6_0= rulePlatformDataModel
            	    {

            	    						newCompositeNode(grammarAccess.getDataModelAccess().getPdmPlatformDataModelParserRuleCall_4_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_pdm_6_0=rulePlatformDataModel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDataModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pdm",
            	    							lv_pdm_6_0,
            	    							"com.epistimis.uddl.Uddl.PlatformDataModel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleDataModel"


    // $ANTLR start "entryRuleQN"
    // InternalUddl.g:195:1: entryRuleQN returns [String current=null] : iv_ruleQN= ruleQN EOF ;
    public final String entryRuleQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQN = null;


        try {
            // InternalUddl.g:195:42: (iv_ruleQN= ruleQN EOF )
            // InternalUddl.g:196:2: iv_ruleQN= ruleQN EOF
            {
             newCompositeNode(grammarAccess.getQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQN=ruleQN();

            state._fsp--;

             current =iv_ruleQN.getText(); 
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
    // $ANTLR end "entryRuleQN"


    // $ANTLR start "ruleQN"
    // InternalUddl.g:202:1: ruleQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalUddl.g:208:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalUddl.g:209:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalUddl.g:209:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalUddl.g:210:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalUddl.g:217:3: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUddl.g:218:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,16,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleQN"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalUddl.g:235:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalUddl.g:235:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalUddl.g:236:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalUddl.g:242:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QN_0= ruleQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QN_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:248:2: ( (this_QN_0= ruleQN (kw= '.*' )? ) )
            // InternalUddl.g:249:2: (this_QN_0= ruleQN (kw= '.*' )? )
            {
            // InternalUddl.g:249:2: (this_QN_0= ruleQN (kw= '.*' )? )
            // InternalUddl.g:250:3: this_QN_0= ruleQN (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQNParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_QN_0=ruleQN();

            state._fsp--;


            			current.merge(this_QN_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalUddl.g:260:3: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalUddl.g:261:4: kw= '.*'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleConceptualDataModel"
    // InternalUddl.g:271:1: entryRuleConceptualDataModel returns [EObject current=null] : iv_ruleConceptualDataModel= ruleConceptualDataModel EOF ;
    public final EObject entryRuleConceptualDataModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualDataModel = null;


        try {
            // InternalUddl.g:271:60: (iv_ruleConceptualDataModel= ruleConceptualDataModel EOF )
            // InternalUddl.g:272:2: iv_ruleConceptualDataModel= ruleConceptualDataModel EOF
            {
             newCompositeNode(grammarAccess.getConceptualDataModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualDataModel=ruleConceptualDataModel();

            state._fsp--;

             current =iv_ruleConceptualDataModel; 
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
    // $ANTLR end "entryRuleConceptualDataModel"


    // $ANTLR start "ruleConceptualDataModel"
    // InternalUddl.g:278:1: ruleConceptualDataModel returns [EObject current=null] : (otherlv_0= 'cdm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= ruleConceptualElement ) ) | ( (lv_cdm_5_0= ruleConceptualDataModel ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleConceptualDataModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_element_4_0 = null;

        EObject lv_cdm_5_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:284:2: ( (otherlv_0= 'cdm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= ruleConceptualElement ) ) | ( (lv_cdm_5_0= ruleConceptualDataModel ) ) )* otherlv_6= '}' ) )
            // InternalUddl.g:285:2: (otherlv_0= 'cdm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= ruleConceptualElement ) ) | ( (lv_cdm_5_0= ruleConceptualDataModel ) ) )* otherlv_6= '}' )
            {
            // InternalUddl.g:285:2: (otherlv_0= 'cdm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= ruleConceptualElement ) ) | ( (lv_cdm_5_0= ruleConceptualDataModel ) ) )* otherlv_6= '}' )
            // InternalUddl.g:286:3: otherlv_0= 'cdm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= ruleConceptualElement ) ) | ( (lv_cdm_5_0= ruleConceptualDataModel ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConceptualDataModelAccess().getCdmKeyword_0());
            		
            // InternalUddl.g:290:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:291:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:291:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:292:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConceptualDataModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualDataModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:308:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUddl.g:309:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:309:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:310:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getConceptualDataModelAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConceptualDataModelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getConceptualDataModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUddl.g:330:3: ( ( (lv_element_4_0= ruleConceptualElement ) ) | ( (lv_cdm_5_0= ruleConceptualDataModel ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21||(LA6_0>=23 && LA6_0<=25)||LA6_0==31||LA6_0==37||LA6_0==39) ) {
                    alt6=1;
                }
                else if ( (LA6_0==18) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalUddl.g:331:4: ( (lv_element_4_0= ruleConceptualElement ) )
            	    {
            	    // InternalUddl.g:331:4: ( (lv_element_4_0= ruleConceptualElement ) )
            	    // InternalUddl.g:332:5: (lv_element_4_0= ruleConceptualElement )
            	    {
            	    // InternalUddl.g:332:5: (lv_element_4_0= ruleConceptualElement )
            	    // InternalUddl.g:333:6: lv_element_4_0= ruleConceptualElement
            	    {

            	    						newCompositeNode(grammarAccess.getConceptualDataModelAccess().getElementConceptualElementParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_element_4_0=ruleConceptualElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConceptualDataModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"element",
            	    							lv_element_4_0,
            	    							"com.epistimis.uddl.Uddl.ConceptualElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUddl.g:351:4: ( (lv_cdm_5_0= ruleConceptualDataModel ) )
            	    {
            	    // InternalUddl.g:351:4: ( (lv_cdm_5_0= ruleConceptualDataModel ) )
            	    // InternalUddl.g:352:5: (lv_cdm_5_0= ruleConceptualDataModel )
            	    {
            	    // InternalUddl.g:352:5: (lv_cdm_5_0= ruleConceptualDataModel )
            	    // InternalUddl.g:353:6: lv_cdm_5_0= ruleConceptualDataModel
            	    {

            	    						newCompositeNode(grammarAccess.getConceptualDataModelAccess().getCdmConceptualDataModelParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_cdm_5_0=ruleConceptualDataModel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConceptualDataModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"cdm",
            	    							lv_cdm_5_0,
            	    							"com.epistimis.uddl.Uddl.ConceptualDataModel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getConceptualDataModelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleConceptualDataModel"


    // $ANTLR start "entryRuleLogicalDataModel"
    // InternalUddl.g:379:1: entryRuleLogicalDataModel returns [EObject current=null] : iv_ruleLogicalDataModel= ruleLogicalDataModel EOF ;
    public final EObject entryRuleLogicalDataModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalDataModel = null;


        try {
            // InternalUddl.g:379:57: (iv_ruleLogicalDataModel= ruleLogicalDataModel EOF )
            // InternalUddl.g:380:2: iv_ruleLogicalDataModel= ruleLogicalDataModel EOF
            {
             newCompositeNode(grammarAccess.getLogicalDataModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalDataModel=ruleLogicalDataModel();

            state._fsp--;

             current =iv_ruleLogicalDataModel; 
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
    // $ANTLR end "entryRuleLogicalDataModel"


    // $ANTLR start "ruleLogicalDataModel"
    // InternalUddl.g:386:1: ruleLogicalDataModel returns [EObject current=null] : (otherlv_0= 'ldm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= ruleLogicalElement ) ) | ( (lv_ldm_5_0= ruleLogicalDataModel ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleLogicalDataModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_element_4_0 = null;

        EObject lv_ldm_5_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:392:2: ( (otherlv_0= 'ldm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= ruleLogicalElement ) ) | ( (lv_ldm_5_0= ruleLogicalDataModel ) ) )* otherlv_6= '}' ) )
            // InternalUddl.g:393:2: (otherlv_0= 'ldm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= ruleLogicalElement ) ) | ( (lv_ldm_5_0= ruleLogicalDataModel ) ) )* otherlv_6= '}' )
            {
            // InternalUddl.g:393:2: (otherlv_0= 'ldm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= ruleLogicalElement ) ) | ( (lv_ldm_5_0= ruleLogicalDataModel ) ) )* otherlv_6= '}' )
            // InternalUddl.g:394:3: otherlv_0= 'ldm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= ruleLogicalElement ) ) | ( (lv_ldm_5_0= ruleLogicalDataModel ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalDataModelAccess().getLdmKeyword_0());
            		
            // InternalUddl.g:398:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:399:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:399:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:400:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalDataModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalDataModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:416:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUddl.g:417:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:417:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:418:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalDataModelAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalDataModelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalDataModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUddl.g:438:3: ( ( (lv_element_4_0= ruleLogicalElement ) ) | ( (lv_ldm_5_0= ruleLogicalDataModel ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=41 && LA8_0<=42)||LA8_0==44||(LA8_0>=49 && LA8_0<=56)||LA8_0==59||LA8_0==61||(LA8_0>=65 && LA8_0<=66)||(LA8_0>=68 && LA8_0<=69)||LA8_0==76||LA8_0==79||LA8_0==86||LA8_0==89||LA8_0==92||(LA8_0>=94 && LA8_0<=96)||(LA8_0>=98 && LA8_0<=99)) ) {
                    alt8=1;
                }
                else if ( (LA8_0==19) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUddl.g:439:4: ( (lv_element_4_0= ruleLogicalElement ) )
            	    {
            	    // InternalUddl.g:439:4: ( (lv_element_4_0= ruleLogicalElement ) )
            	    // InternalUddl.g:440:5: (lv_element_4_0= ruleLogicalElement )
            	    {
            	    // InternalUddl.g:440:5: (lv_element_4_0= ruleLogicalElement )
            	    // InternalUddl.g:441:6: lv_element_4_0= ruleLogicalElement
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalDataModelAccess().getElementLogicalElementParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_element_4_0=ruleLogicalElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogicalDataModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"element",
            	    							lv_element_4_0,
            	    							"com.epistimis.uddl.Uddl.LogicalElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUddl.g:459:4: ( (lv_ldm_5_0= ruleLogicalDataModel ) )
            	    {
            	    // InternalUddl.g:459:4: ( (lv_ldm_5_0= ruleLogicalDataModel ) )
            	    // InternalUddl.g:460:5: (lv_ldm_5_0= ruleLogicalDataModel )
            	    {
            	    // InternalUddl.g:460:5: (lv_ldm_5_0= ruleLogicalDataModel )
            	    // InternalUddl.g:461:6: lv_ldm_5_0= ruleLogicalDataModel
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalDataModelAccess().getLdmLogicalDataModelParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_ldm_5_0=ruleLogicalDataModel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogicalDataModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ldm",
            	    							lv_ldm_5_0,
            	    							"com.epistimis.uddl.Uddl.LogicalDataModel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLogicalDataModelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleLogicalDataModel"


    // $ANTLR start "entryRulePlatformDataModel"
    // InternalUddl.g:487:1: entryRulePlatformDataModel returns [EObject current=null] : iv_rulePlatformDataModel= rulePlatformDataModel EOF ;
    public final EObject entryRulePlatformDataModel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformDataModel = null;


        try {
            // InternalUddl.g:487:58: (iv_rulePlatformDataModel= rulePlatformDataModel EOF )
            // InternalUddl.g:488:2: iv_rulePlatformDataModel= rulePlatformDataModel EOF
            {
             newCompositeNode(grammarAccess.getPlatformDataModelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformDataModel=rulePlatformDataModel();

            state._fsp--;

             current =iv_rulePlatformDataModel; 
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
    // $ANTLR end "entryRulePlatformDataModel"


    // $ANTLR start "rulePlatformDataModel"
    // InternalUddl.g:494:1: rulePlatformDataModel returns [EObject current=null] : (otherlv_0= 'pdm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= rulePlatformElement ) ) | ( (lv_pdm_5_0= rulePlatformDataModel ) ) )* otherlv_6= '}' ) ;
    public final EObject rulePlatformDataModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_element_4_0 = null;

        EObject lv_pdm_5_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:500:2: ( (otherlv_0= 'pdm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= rulePlatformElement ) ) | ( (lv_pdm_5_0= rulePlatformDataModel ) ) )* otherlv_6= '}' ) )
            // InternalUddl.g:501:2: (otherlv_0= 'pdm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= rulePlatformElement ) ) | ( (lv_pdm_5_0= rulePlatformDataModel ) ) )* otherlv_6= '}' )
            {
            // InternalUddl.g:501:2: (otherlv_0= 'pdm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= rulePlatformElement ) ) | ( (lv_pdm_5_0= rulePlatformDataModel ) ) )* otherlv_6= '}' )
            // InternalUddl.g:502:3: otherlv_0= 'pdm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= rulePlatformElement ) ) | ( (lv_pdm_5_0= rulePlatformDataModel ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformDataModelAccess().getPdmKeyword_0());
            		
            // InternalUddl.g:506:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:507:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:507:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:508:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformDataModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformDataModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:524:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalUddl.g:525:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:525:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:526:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformDataModelAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformDataModelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformDataModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUddl.g:546:3: ( ( (lv_element_4_0= rulePlatformElement ) ) | ( (lv_pdm_5_0= rulePlatformDataModel ) ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==51||LA10_0==56||(LA10_0>=100 && LA10_0<=118)||(LA10_0>=120 && LA10_0<=122)) ) {
                    alt10=1;
                }
                else if ( (LA10_0==20) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUddl.g:547:4: ( (lv_element_4_0= rulePlatformElement ) )
            	    {
            	    // InternalUddl.g:547:4: ( (lv_element_4_0= rulePlatformElement ) )
            	    // InternalUddl.g:548:5: (lv_element_4_0= rulePlatformElement )
            	    {
            	    // InternalUddl.g:548:5: (lv_element_4_0= rulePlatformElement )
            	    // InternalUddl.g:549:6: lv_element_4_0= rulePlatformElement
            	    {

            	    						newCompositeNode(grammarAccess.getPlatformDataModelAccess().getElementPlatformElementParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_element_4_0=rulePlatformElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlatformDataModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"element",
            	    							lv_element_4_0,
            	    							"com.epistimis.uddl.Uddl.PlatformElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUddl.g:567:4: ( (lv_pdm_5_0= rulePlatformDataModel ) )
            	    {
            	    // InternalUddl.g:567:4: ( (lv_pdm_5_0= rulePlatformDataModel ) )
            	    // InternalUddl.g:568:5: (lv_pdm_5_0= rulePlatformDataModel )
            	    {
            	    // InternalUddl.g:568:5: (lv_pdm_5_0= rulePlatformDataModel )
            	    // InternalUddl.g:569:6: lv_pdm_5_0= rulePlatformDataModel
            	    {

            	    						newCompositeNode(grammarAccess.getPlatformDataModelAccess().getPdmPlatformDataModelParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_pdm_5_0=rulePlatformDataModel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlatformDataModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pdm",
            	    							lv_pdm_5_0,
            	    							"com.epistimis.uddl.Uddl.PlatformDataModel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPlatformDataModelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulePlatformDataModel"


    // $ANTLR start "entryRuleConceptualElement"
    // InternalUddl.g:595:1: entryRuleConceptualElement returns [EObject current=null] : iv_ruleConceptualElement= ruleConceptualElement EOF ;
    public final EObject entryRuleConceptualElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualElement = null;


        try {
            // InternalUddl.g:595:58: (iv_ruleConceptualElement= ruleConceptualElement EOF )
            // InternalUddl.g:596:2: iv_ruleConceptualElement= ruleConceptualElement EOF
            {
             newCompositeNode(grammarAccess.getConceptualElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualElement=ruleConceptualElement();

            state._fsp--;

             current =iv_ruleConceptualElement; 
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
    // $ANTLR end "entryRuleConceptualElement"


    // $ANTLR start "ruleConceptualElement"
    // InternalUddl.g:602:1: ruleConceptualElement returns [EObject current=null] : (this_ConceptualDomain_0= ruleConceptualDomain | this_ConceptualBasisEntity_1= ruleConceptualBasisEntity | this_ConceptualComposableElement_2= ruleConceptualComposableElement | this_ConceptualView_3= ruleConceptualView ) ;
    public final EObject ruleConceptualElement() throws RecognitionException {
        EObject current = null;

        EObject this_ConceptualDomain_0 = null;

        EObject this_ConceptualBasisEntity_1 = null;

        EObject this_ConceptualComposableElement_2 = null;

        EObject this_ConceptualView_3 = null;



        	enterRule();

        try {
            // InternalUddl.g:608:2: ( (this_ConceptualDomain_0= ruleConceptualDomain | this_ConceptualBasisEntity_1= ruleConceptualBasisEntity | this_ConceptualComposableElement_2= ruleConceptualComposableElement | this_ConceptualView_3= ruleConceptualView ) )
            // InternalUddl.g:609:2: (this_ConceptualDomain_0= ruleConceptualDomain | this_ConceptualBasisEntity_1= ruleConceptualBasisEntity | this_ConceptualComposableElement_2= ruleConceptualComposableElement | this_ConceptualView_3= ruleConceptualView )
            {
            // InternalUddl.g:609:2: (this_ConceptualDomain_0= ruleConceptualDomain | this_ConceptualBasisEntity_1= ruleConceptualBasisEntity | this_ConceptualComposableElement_2= ruleConceptualComposableElement | this_ConceptualView_3= ruleConceptualView )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt11=1;
                }
                break;
            case 21:
                {
                alt11=2;
                }
                break;
            case 24:
            case 25:
            case 31:
                {
                alt11=3;
                }
                break;
            case 37:
            case 39:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalUddl.g:610:3: this_ConceptualDomain_0= ruleConceptualDomain
                    {

                    			newCompositeNode(grammarAccess.getConceptualElementAccess().getConceptualDomainParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptualDomain_0=ruleConceptualDomain();

                    state._fsp--;


                    			current = this_ConceptualDomain_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:619:3: this_ConceptualBasisEntity_1= ruleConceptualBasisEntity
                    {

                    			newCompositeNode(grammarAccess.getConceptualElementAccess().getConceptualBasisEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptualBasisEntity_1=ruleConceptualBasisEntity();

                    state._fsp--;


                    			current = this_ConceptualBasisEntity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUddl.g:628:3: this_ConceptualComposableElement_2= ruleConceptualComposableElement
                    {

                    			newCompositeNode(grammarAccess.getConceptualElementAccess().getConceptualComposableElementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptualComposableElement_2=ruleConceptualComposableElement();

                    state._fsp--;


                    			current = this_ConceptualComposableElement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUddl.g:637:3: this_ConceptualView_3= ruleConceptualView
                    {

                    			newCompositeNode(grammarAccess.getConceptualElementAccess().getConceptualViewParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptualView_3=ruleConceptualView();

                    state._fsp--;


                    			current = this_ConceptualView_3;
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
    // $ANTLR end "ruleConceptualElement"


    // $ANTLR start "entryRuleConceptualComposableElement"
    // InternalUddl.g:649:1: entryRuleConceptualComposableElement returns [EObject current=null] : iv_ruleConceptualComposableElement= ruleConceptualComposableElement EOF ;
    public final EObject entryRuleConceptualComposableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualComposableElement = null;


        try {
            // InternalUddl.g:649:68: (iv_ruleConceptualComposableElement= ruleConceptualComposableElement EOF )
            // InternalUddl.g:650:2: iv_ruleConceptualComposableElement= ruleConceptualComposableElement EOF
            {
             newCompositeNode(grammarAccess.getConceptualComposableElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualComposableElement=ruleConceptualComposableElement();

            state._fsp--;

             current =iv_ruleConceptualComposableElement; 
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
    // $ANTLR end "entryRuleConceptualComposableElement"


    // $ANTLR start "ruleConceptualComposableElement"
    // InternalUddl.g:656:1: ruleConceptualComposableElement returns [EObject current=null] : (this_ConceptualEntity_0= ruleConceptualEntity | this_ConceptualObservable_1= ruleConceptualObservable ) ;
    public final EObject ruleConceptualComposableElement() throws RecognitionException {
        EObject current = null;

        EObject this_ConceptualEntity_0 = null;

        EObject this_ConceptualObservable_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:662:2: ( (this_ConceptualEntity_0= ruleConceptualEntity | this_ConceptualObservable_1= ruleConceptualObservable ) )
            // InternalUddl.g:663:2: (this_ConceptualEntity_0= ruleConceptualEntity | this_ConceptualObservable_1= ruleConceptualObservable )
            {
            // InternalUddl.g:663:2: (this_ConceptualEntity_0= ruleConceptualEntity | this_ConceptualObservable_1= ruleConceptualObservable )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25||LA12_0==31) ) {
                alt12=1;
            }
            else if ( (LA12_0==24) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalUddl.g:664:3: this_ConceptualEntity_0= ruleConceptualEntity
                    {

                    			newCompositeNode(grammarAccess.getConceptualComposableElementAccess().getConceptualEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptualEntity_0=ruleConceptualEntity();

                    state._fsp--;


                    			current = this_ConceptualEntity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:673:3: this_ConceptualObservable_1= ruleConceptualObservable
                    {

                    			newCompositeNode(grammarAccess.getConceptualComposableElementAccess().getConceptualObservableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptualObservable_1=ruleConceptualObservable();

                    state._fsp--;


                    			current = this_ConceptualObservable_1;
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
    // $ANTLR end "ruleConceptualComposableElement"


    // $ANTLR start "entryRuleConceptualBasisEntity"
    // InternalUddl.g:685:1: entryRuleConceptualBasisEntity returns [EObject current=null] : iv_ruleConceptualBasisEntity= ruleConceptualBasisEntity EOF ;
    public final EObject entryRuleConceptualBasisEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualBasisEntity = null;


        try {
            // InternalUddl.g:685:62: (iv_ruleConceptualBasisEntity= ruleConceptualBasisEntity EOF )
            // InternalUddl.g:686:2: iv_ruleConceptualBasisEntity= ruleConceptualBasisEntity EOF
            {
             newCompositeNode(grammarAccess.getConceptualBasisEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualBasisEntity=ruleConceptualBasisEntity();

            state._fsp--;

             current =iv_ruleConceptualBasisEntity; 
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
    // $ANTLR end "entryRuleConceptualBasisEntity"


    // $ANTLR start "ruleConceptualBasisEntity"
    // InternalUddl.g:692:1: ruleConceptualBasisEntity returns [EObject current=null] : (otherlv_0= 'basis' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleConceptualBasisEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUddl.g:698:2: ( (otherlv_0= 'basis' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalUddl.g:699:2: (otherlv_0= 'basis' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalUddl.g:699:2: (otherlv_0= 'basis' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalUddl.g:700:3: otherlv_0= 'basis' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConceptualBasisEntityAccess().getBasisKeyword_0());
            		
            // InternalUddl.g:704:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:705:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:705:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:706:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConceptualBasisEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualBasisEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:722:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUddl.g:723:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:723:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:724:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getConceptualBasisEntityAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConceptualBasisEntityRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConceptualBasisEntityAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleConceptualBasisEntity"


    // $ANTLR start "entryRuleConceptualDomain"
    // InternalUddl.g:748:1: entryRuleConceptualDomain returns [EObject current=null] : iv_ruleConceptualDomain= ruleConceptualDomain EOF ;
    public final EObject entryRuleConceptualDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualDomain = null;


        try {
            // InternalUddl.g:748:57: (iv_ruleConceptualDomain= ruleConceptualDomain EOF )
            // InternalUddl.g:749:2: iv_ruleConceptualDomain= ruleConceptualDomain EOF
            {
             newCompositeNode(grammarAccess.getConceptualDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualDomain=ruleConceptualDomain();

            state._fsp--;

             current =iv_ruleConceptualDomain; 
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
    // $ANTLR end "entryRuleConceptualDomain"


    // $ANTLR start "ruleConceptualDomain"
    // InternalUddl.g:755:1: ruleConceptualDomain returns [EObject current=null] : (otherlv_0= 'domain' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleConceptualDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUddl.g:761:2: ( (otherlv_0= 'domain' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalUddl.g:762:2: (otherlv_0= 'domain' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalUddl.g:762:2: (otherlv_0= 'domain' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalUddl.g:763:3: otherlv_0= 'domain' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConceptualDomainAccess().getDomainKeyword_0());
            		
            // InternalUddl.g:767:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:768:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:768:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:769:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConceptualDomainAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualDomainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:785:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUddl.g:786:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:786:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:787:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getConceptualDomainAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConceptualDomainRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConceptualDomainAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleConceptualDomain"


    // $ANTLR start "entryRuleConceptualObservable"
    // InternalUddl.g:811:1: entryRuleConceptualObservable returns [EObject current=null] : iv_ruleConceptualObservable= ruleConceptualObservable EOF ;
    public final EObject entryRuleConceptualObservable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualObservable = null;


        try {
            // InternalUddl.g:811:61: (iv_ruleConceptualObservable= ruleConceptualObservable EOF )
            // InternalUddl.g:812:2: iv_ruleConceptualObservable= ruleConceptualObservable EOF
            {
             newCompositeNode(grammarAccess.getConceptualObservableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualObservable=ruleConceptualObservable();

            state._fsp--;

             current =iv_ruleConceptualObservable; 
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
    // $ANTLR end "entryRuleConceptualObservable"


    // $ANTLR start "ruleConceptualObservable"
    // InternalUddl.g:818:1: ruleConceptualObservable returns [EObject current=null] : (otherlv_0= 'observable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleConceptualObservable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUddl.g:824:2: ( (otherlv_0= 'observable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalUddl.g:825:2: (otherlv_0= 'observable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalUddl.g:825:2: (otherlv_0= 'observable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalUddl.g:826:3: otherlv_0= 'observable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConceptualObservableAccess().getObservableKeyword_0());
            		
            // InternalUddl.g:830:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:831:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:831:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:832:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConceptualObservableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualObservableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:848:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUddl.g:849:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:849:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:850:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getConceptualObservableAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConceptualObservableRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConceptualObservableAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleConceptualObservable"


    // $ANTLR start "entryRuleConceptualEntity"
    // InternalUddl.g:874:1: entryRuleConceptualEntity returns [EObject current=null] : iv_ruleConceptualEntity= ruleConceptualEntity EOF ;
    public final EObject entryRuleConceptualEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualEntity = null;


        try {
            // InternalUddl.g:874:57: (iv_ruleConceptualEntity= ruleConceptualEntity EOF )
            // InternalUddl.g:875:2: iv_ruleConceptualEntity= ruleConceptualEntity EOF
            {
             newCompositeNode(grammarAccess.getConceptualEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualEntity=ruleConceptualEntity();

            state._fsp--;

             current =iv_ruleConceptualEntity; 
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
    // $ANTLR end "entryRuleConceptualEntity"


    // $ANTLR start "ruleConceptualEntity"
    // InternalUddl.g:881:1: ruleConceptualEntity returns [EObject current=null] : (this_ConceptualAssociation_0= ruleConceptualAssociation | (otherlv_1= 'centity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= ':' ( ( ruleQN ) ) )? otherlv_6= '{' ( (lv_composition_7_0= ruleConceptualComposition ) )* (otherlv_8= 'basis:' otherlv_9= '[' ( ( ruleQN ) )+ otherlv_11= ']' )? otherlv_12= '};' ) ) ;
    public final EObject ruleConceptualEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject this_ConceptualAssociation_0 = null;

        EObject lv_composition_7_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:887:2: ( (this_ConceptualAssociation_0= ruleConceptualAssociation | (otherlv_1= 'centity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= ':' ( ( ruleQN ) ) )? otherlv_6= '{' ( (lv_composition_7_0= ruleConceptualComposition ) )* (otherlv_8= 'basis:' otherlv_9= '[' ( ( ruleQN ) )+ otherlv_11= ']' )? otherlv_12= '};' ) ) )
            // InternalUddl.g:888:2: (this_ConceptualAssociation_0= ruleConceptualAssociation | (otherlv_1= 'centity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= ':' ( ( ruleQN ) ) )? otherlv_6= '{' ( (lv_composition_7_0= ruleConceptualComposition ) )* (otherlv_8= 'basis:' otherlv_9= '[' ( ( ruleQN ) )+ otherlv_11= ']' )? otherlv_12= '};' ) )
            {
            // InternalUddl.g:888:2: (this_ConceptualAssociation_0= ruleConceptualAssociation | (otherlv_1= 'centity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= ':' ( ( ruleQN ) ) )? otherlv_6= '{' ( (lv_composition_7_0= ruleConceptualComposition ) )* (otherlv_8= 'basis:' otherlv_9= '[' ( ( ruleQN ) )+ otherlv_11= ']' )? otherlv_12= '};' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            else if ( (LA21_0==25) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalUddl.g:889:3: this_ConceptualAssociation_0= ruleConceptualAssociation
                    {

                    			newCompositeNode(grammarAccess.getConceptualEntityAccess().getConceptualAssociationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptualAssociation_0=ruleConceptualAssociation();

                    state._fsp--;


                    			current = this_ConceptualAssociation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:898:3: (otherlv_1= 'centity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= ':' ( ( ruleQN ) ) )? otherlv_6= '{' ( (lv_composition_7_0= ruleConceptualComposition ) )* (otherlv_8= 'basis:' otherlv_9= '[' ( ( ruleQN ) )+ otherlv_11= ']' )? otherlv_12= '};' )
                    {
                    // InternalUddl.g:898:3: (otherlv_1= 'centity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= ':' ( ( ruleQN ) ) )? otherlv_6= '{' ( (lv_composition_7_0= ruleConceptualComposition ) )* (otherlv_8= 'basis:' otherlv_9= '[' ( ( ruleQN ) )+ otherlv_11= ']' )? otherlv_12= '};' )
                    // InternalUddl.g:899:4: otherlv_1= 'centity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= ':' ( ( ruleQN ) ) )? otherlv_6= '{' ( (lv_composition_7_0= ruleConceptualComposition ) )* (otherlv_8= 'basis:' otherlv_9= '[' ( ( ruleQN ) )+ otherlv_11= ']' )? otherlv_12= '};'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getConceptualEntityAccess().getCentityKeyword_1_0());
                    			
                    // InternalUddl.g:903:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalUddl.g:904:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalUddl.g:904:5: (lv_name_2_0= RULE_ID )
                    // InternalUddl.g:905:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getConceptualEntityAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConceptualEntityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalUddl.g:921:4: ( (lv_description_3_0= RULE_STRING ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_STRING) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalUddl.g:922:5: (lv_description_3_0= RULE_STRING )
                            {
                            // InternalUddl.g:922:5: (lv_description_3_0= RULE_STRING )
                            // InternalUddl.g:923:6: lv_description_3_0= RULE_STRING
                            {
                            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                            						newLeafNode(lv_description_3_0, grammarAccess.getConceptualEntityAccess().getDescriptionSTRINGTerminalRuleCall_1_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getConceptualEntityRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"description",
                            							lv_description_3_0,
                            							"org.eclipse.xtext.common.Terminals.STRING");
                            					

                            }


                            }
                            break;

                    }

                    // InternalUddl.g:939:4: (otherlv_4= ':' ( ( ruleQN ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==26) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalUddl.g:940:5: otherlv_4= ':' ( ( ruleQN ) )
                            {
                            otherlv_4=(Token)match(input,26,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getConceptualEntityAccess().getColonKeyword_1_3_0());
                            				
                            // InternalUddl.g:944:5: ( ( ruleQN ) )
                            // InternalUddl.g:945:6: ( ruleQN )
                            {
                            // InternalUddl.g:945:6: ( ruleQN )
                            // InternalUddl.g:946:7: ruleQN
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConceptualEntityRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getConceptualEntityAccess().getSpecializesConceptualEntityCrossReference_1_3_1_0());
                            						
                            pushFollow(FOLLOW_5);
                            ruleQN();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,14,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getConceptualEntityAccess().getLeftCurlyBracketKeyword_1_4());
                    			
                    // InternalUddl.g:965:4: ( (lv_composition_7_0= ruleConceptualComposition ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalUddl.g:966:5: (lv_composition_7_0= ruleConceptualComposition )
                    	    {
                    	    // InternalUddl.g:966:5: (lv_composition_7_0= ruleConceptualComposition )
                    	    // InternalUddl.g:967:6: lv_composition_7_0= ruleConceptualComposition
                    	    {

                    	    						newCompositeNode(grammarAccess.getConceptualEntityAccess().getCompositionConceptualCompositionParserRuleCall_1_5_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_composition_7_0=ruleConceptualComposition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getConceptualEntityRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"composition",
                    	    							lv_composition_7_0,
                    	    							"com.epistimis.uddl.Uddl.ConceptualComposition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    // InternalUddl.g:984:4: (otherlv_8= 'basis:' otherlv_9= '[' ( ( ruleQN ) )+ otherlv_11= ']' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==27) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalUddl.g:985:5: otherlv_8= 'basis:' otherlv_9= '[' ( ( ruleQN ) )+ otherlv_11= ']'
                            {
                            otherlv_8=(Token)match(input,27,FOLLOW_17); 

                            					newLeafNode(otherlv_8, grammarAccess.getConceptualEntityAccess().getBasisKeyword_1_6_0());
                            				
                            otherlv_9=(Token)match(input,28,FOLLOW_3); 

                            					newLeafNode(otherlv_9, grammarAccess.getConceptualEntityAccess().getLeftSquareBracketKeyword_1_6_1());
                            				
                            // InternalUddl.g:993:5: ( ( ruleQN ) )+
                            int cnt19=0;
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==RULE_ID) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // InternalUddl.g:994:6: ( ruleQN )
                            	    {
                            	    // InternalUddl.g:994:6: ( ruleQN )
                            	    // InternalUddl.g:995:7: ruleQN
                            	    {

                            	    							if (current==null) {
                            	    								current = createModelElement(grammarAccess.getConceptualEntityRule());
                            	    							}
                            	    						

                            	    							newCompositeNode(grammarAccess.getConceptualEntityAccess().getBasisEntityConceptualBasisEntityCrossReference_1_6_2_0());
                            	    						
                            	    pushFollow(FOLLOW_18);
                            	    ruleQN();

                            	    state._fsp--;


                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt19 >= 1 ) break loop19;
                                        EarlyExitException eee =
                                            new EarlyExitException(19, input);
                                        throw eee;
                                }
                                cnt19++;
                            } while (true);

                            otherlv_11=(Token)match(input,29,FOLLOW_19); 

                            					newLeafNode(otherlv_11, grammarAccess.getConceptualEntityAccess().getRightSquareBracketKeyword_1_6_3());
                            				

                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getConceptualEntityAccess().getRightCurlyBracketSemicolonKeyword_1_7());
                    			

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
    // $ANTLR end "ruleConceptualEntity"


    // $ANTLR start "entryRuleConceptualComposition"
    // InternalUddl.g:1023:1: entryRuleConceptualComposition returns [EObject current=null] : iv_ruleConceptualComposition= ruleConceptualComposition EOF ;
    public final EObject entryRuleConceptualComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualComposition = null;


        try {
            // InternalUddl.g:1023:62: (iv_ruleConceptualComposition= ruleConceptualComposition EOF )
            // InternalUddl.g:1024:2: iv_ruleConceptualComposition= ruleConceptualComposition EOF
            {
             newCompositeNode(grammarAccess.getConceptualCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualComposition=ruleConceptualComposition();

            state._fsp--;

             current =iv_ruleConceptualComposition; 
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
    // $ANTLR end "entryRuleConceptualComposition"


    // $ANTLR start "ruleConceptualComposition"
    // InternalUddl.g:1030:1: ruleConceptualComposition returns [EObject current=null] : ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) )? otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= ';' ) ;
    public final EObject ruleConceptualComposition() throws RecognitionException {
        EObject current = null;

        Token lv_rolename_1_0=null;
        Token otherlv_2=null;
        Token lv_lowerBound_3_0=null;
        Token otherlv_4=null;
        Token lv_upperBound_5_0=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalUddl.g:1036:2: ( ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) )? otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= ';' ) )
            // InternalUddl.g:1037:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) )? otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= ';' )
            {
            // InternalUddl.g:1037:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) )? otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= ';' )
            // InternalUddl.g:1038:3: ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) )? otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= ';'
            {
            // InternalUddl.g:1038:3: ( ( ruleQN ) )
            // InternalUddl.g:1039:4: ( ruleQN )
            {
            // InternalUddl.g:1039:4: ( ruleQN )
            // InternalUddl.g:1040:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualCompositionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConceptualCompositionAccess().getTypeConceptualComposableElementCrossReference_0_0());
            				
            pushFollow(FOLLOW_3);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:1054:3: ( (lv_rolename_1_0= RULE_ID ) )
            // InternalUddl.g:1055:4: (lv_rolename_1_0= RULE_ID )
            {
            // InternalUddl.g:1055:4: (lv_rolename_1_0= RULE_ID )
            // InternalUddl.g:1056:5: lv_rolename_1_0= RULE_ID
            {
            lv_rolename_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_rolename_1_0, grammarAccess.getConceptualCompositionAccess().getRolenameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualCompositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rolename",
            						lv_rolename_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:1072:3: (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) )? otherlv_6= ']' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUddl.g:1073:4: otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) )? otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getConceptualCompositionAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalUddl.g:1077:4: ( (lv_lowerBound_3_0= RULE_INT ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_INT) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalUddl.g:1078:5: (lv_lowerBound_3_0= RULE_INT )
                            {
                            // InternalUddl.g:1078:5: (lv_lowerBound_3_0= RULE_INT )
                            // InternalUddl.g:1079:6: lv_lowerBound_3_0= RULE_INT
                            {
                            lv_lowerBound_3_0=(Token)match(input,RULE_INT,FOLLOW_22); 

                            						newLeafNode(lv_lowerBound_3_0, grammarAccess.getConceptualCompositionAccess().getLowerBoundINTTerminalRuleCall_2_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getConceptualCompositionRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"lowerBound",
                            							lv_lowerBound_3_0,
                            							"com.epistimis.uddl.Uddl.INT");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,26,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getConceptualCompositionAccess().getColonKeyword_2_2());
                    			
                    // InternalUddl.g:1099:4: ( (lv_upperBound_5_0= RULE_INT ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_INT) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalUddl.g:1100:5: (lv_upperBound_5_0= RULE_INT )
                            {
                            // InternalUddl.g:1100:5: (lv_upperBound_5_0= RULE_INT )
                            // InternalUddl.g:1101:6: lv_upperBound_5_0= RULE_INT
                            {
                            lv_upperBound_5_0=(Token)match(input,RULE_INT,FOLLOW_24); 

                            						newLeafNode(lv_upperBound_5_0, grammarAccess.getConceptualCompositionAccess().getUpperBoundINTTerminalRuleCall_2_3_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getConceptualCompositionRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"upperBound",
                            							lv_upperBound_5_0,
                            							"com.epistimis.uddl.Uddl.INT");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,29,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getConceptualCompositionAccess().getRightSquareBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalUddl.g:1122:3: ( (lv_description_7_0= RULE_STRING ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUddl.g:1123:4: (lv_description_7_0= RULE_STRING )
                    {
                    // InternalUddl.g:1123:4: (lv_description_7_0= RULE_STRING )
                    // InternalUddl.g:1124:5: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

                    					newLeafNode(lv_description_7_0, grammarAccess.getConceptualCompositionAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConceptualCompositionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_7_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:1140:3: (otherlv_8= ':' ( ( ruleQN ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==26) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUddl.g:1141:4: otherlv_8= ':' ( ( ruleQN ) )
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getConceptualCompositionAccess().getColonKeyword_4_0());
                    			
                    // InternalUddl.g:1145:4: ( ( ruleQN ) )
                    // InternalUddl.g:1146:5: ( ruleQN )
                    {
                    // InternalUddl.g:1146:5: ( ruleQN )
                    // InternalUddl.g:1147:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConceptualCompositionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConceptualCompositionAccess().getSpecializesConceptualCharacteristicCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getConceptualCompositionAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleConceptualComposition"


    // $ANTLR start "entryRuleConceptualAssociation"
    // InternalUddl.g:1170:1: entryRuleConceptualAssociation returns [EObject current=null] : iv_ruleConceptualAssociation= ruleConceptualAssociation EOF ;
    public final EObject entryRuleConceptualAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualAssociation = null;


        try {
            // InternalUddl.g:1170:62: (iv_ruleConceptualAssociation= ruleConceptualAssociation EOF )
            // InternalUddl.g:1171:2: iv_ruleConceptualAssociation= ruleConceptualAssociation EOF
            {
             newCompositeNode(grammarAccess.getConceptualAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualAssociation=ruleConceptualAssociation();

            state._fsp--;

             current =iv_ruleConceptualAssociation; 
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
    // $ANTLR end "entryRuleConceptualAssociation"


    // $ANTLR start "ruleConceptualAssociation"
    // InternalUddl.g:1177:1: ruleConceptualAssociation returns [EObject current=null] : (otherlv_0= 'cassoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_composition_6_0= ruleConceptualComposition ) )* (otherlv_7= 'basis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']' )? (otherlv_11= 'participants:' otherlv_12= '[' ( (lv_participant_13_0= ruleConceptualParticipant ) )+ otherlv_14= ']' )? otherlv_15= '};' ) ;
    public final EObject ruleConceptualAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_composition_6_0 = null;

        EObject lv_participant_13_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:1183:2: ( (otherlv_0= 'cassoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_composition_6_0= ruleConceptualComposition ) )* (otherlv_7= 'basis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']' )? (otherlv_11= 'participants:' otherlv_12= '[' ( (lv_participant_13_0= ruleConceptualParticipant ) )+ otherlv_14= ']' )? otherlv_15= '};' ) )
            // InternalUddl.g:1184:2: (otherlv_0= 'cassoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_composition_6_0= ruleConceptualComposition ) )* (otherlv_7= 'basis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']' )? (otherlv_11= 'participants:' otherlv_12= '[' ( (lv_participant_13_0= ruleConceptualParticipant ) )+ otherlv_14= ']' )? otherlv_15= '};' )
            {
            // InternalUddl.g:1184:2: (otherlv_0= 'cassoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_composition_6_0= ruleConceptualComposition ) )* (otherlv_7= 'basis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']' )? (otherlv_11= 'participants:' otherlv_12= '[' ( (lv_participant_13_0= ruleConceptualParticipant ) )+ otherlv_14= ']' )? otherlv_15= '};' )
            // InternalUddl.g:1185:3: otherlv_0= 'cassoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_composition_6_0= ruleConceptualComposition ) )* (otherlv_7= 'basis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']' )? (otherlv_11= 'participants:' otherlv_12= '[' ( (lv_participant_13_0= ruleConceptualParticipant ) )+ otherlv_14= ']' )? otherlv_15= '};'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConceptualAssociationAccess().getCassocKeyword_0());
            		
            // InternalUddl.g:1189:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:1190:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:1190:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:1191:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConceptualAssociationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualAssociationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:1207:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUddl.g:1208:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:1208:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:1209:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getConceptualAssociationAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConceptualAssociationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:1225:3: (otherlv_3= ':' ( ( ruleQN ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==26) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUddl.g:1226:4: otherlv_3= ':' ( ( ruleQN ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getConceptualAssociationAccess().getColonKeyword_3_0());
                    			
                    // InternalUddl.g:1230:4: ( ( ruleQN ) )
                    // InternalUddl.g:1231:5: ( ruleQN )
                    {
                    // InternalUddl.g:1231:5: ( ruleQN )
                    // InternalUddl.g:1232:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConceptualAssociationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConceptualAssociationAccess().getSpecializesConceptualEntityCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_27); 

            			newLeafNode(otherlv_5, grammarAccess.getConceptualAssociationAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalUddl.g:1251:3: ( (lv_composition_6_0= ruleConceptualComposition ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalUddl.g:1252:4: (lv_composition_6_0= ruleConceptualComposition )
            	    {
            	    // InternalUddl.g:1252:4: (lv_composition_6_0= ruleConceptualComposition )
            	    // InternalUddl.g:1253:5: lv_composition_6_0= ruleConceptualComposition
            	    {

            	    					newCompositeNode(grammarAccess.getConceptualAssociationAccess().getCompositionConceptualCompositionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_composition_6_0=ruleConceptualComposition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConceptualAssociationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"composition",
            	    						lv_composition_6_0,
            	    						"com.epistimis.uddl.Uddl.ConceptualComposition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // InternalUddl.g:1270:3: (otherlv_7= 'basis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==27) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUddl.g:1271:4: otherlv_7= 'basis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']'
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getConceptualAssociationAccess().getBasisKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getConceptualAssociationAccess().getLeftSquareBracketKeyword_6_1());
                    			
                    // InternalUddl.g:1279:4: ( ( ruleQN ) )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_ID) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalUddl.g:1280:5: ( ruleQN )
                    	    {
                    	    // InternalUddl.g:1280:5: ( ruleQN )
                    	    // InternalUddl.g:1281:6: ruleQN
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getConceptualAssociationRule());
                    	    						}
                    	    					

                    	    						newCompositeNode(grammarAccess.getConceptualAssociationAccess().getConceptualBasisEntityConceptualBasisEntityCrossReference_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    ruleQN();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
                    } while (true);

                    otherlv_10=(Token)match(input,29,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getConceptualAssociationAccess().getRightSquareBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            // InternalUddl.g:1300:3: (otherlv_11= 'participants:' otherlv_12= '[' ( (lv_participant_13_0= ruleConceptualParticipant ) )+ otherlv_14= ']' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUddl.g:1301:4: otherlv_11= 'participants:' otherlv_12= '[' ( (lv_participant_13_0= ruleConceptualParticipant ) )+ otherlv_14= ']'
                    {
                    otherlv_11=(Token)match(input,32,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getConceptualAssociationAccess().getParticipantsKeyword_7_0());
                    			
                    otherlv_12=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getConceptualAssociationAccess().getLeftSquareBracketKeyword_7_1());
                    			
                    // InternalUddl.g:1309:4: ( (lv_participant_13_0= ruleConceptualParticipant ) )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_ID) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalUddl.g:1310:5: (lv_participant_13_0= ruleConceptualParticipant )
                    	    {
                    	    // InternalUddl.g:1310:5: (lv_participant_13_0= ruleConceptualParticipant )
                    	    // InternalUddl.g:1311:6: lv_participant_13_0= ruleConceptualParticipant
                    	    {

                    	    						newCompositeNode(grammarAccess.getConceptualAssociationAccess().getParticipantConceptualParticipantParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    lv_participant_13_0=ruleConceptualParticipant();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getConceptualAssociationRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"participant",
                    	    							lv_participant_13_0,
                    	    							"com.epistimis.uddl.Uddl.ConceptualParticipant");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);

                    otherlv_14=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_14, grammarAccess.getConceptualAssociationAccess().getRightSquareBracketKeyword_7_3());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getConceptualAssociationAccess().getRightCurlyBracketSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleConceptualAssociation"


    // $ANTLR start "entryRuleConceptualParticipant"
    // InternalUddl.g:1341:1: entryRuleConceptualParticipant returns [EObject current=null] : iv_ruleConceptualParticipant= ruleConceptualParticipant EOF ;
    public final EObject entryRuleConceptualParticipant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualParticipant = null;


        try {
            // InternalUddl.g:1341:62: (iv_ruleConceptualParticipant= ruleConceptualParticipant EOF )
            // InternalUddl.g:1342:2: iv_ruleConceptualParticipant= ruleConceptualParticipant EOF
            {
             newCompositeNode(grammarAccess.getConceptualParticipantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualParticipant=ruleConceptualParticipant();

            state._fsp--;

             current =iv_ruleConceptualParticipant; 
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
    // $ANTLR end "entryRuleConceptualParticipant"


    // $ANTLR start "ruleConceptualParticipant"
    // InternalUddl.g:1348:1: ruleConceptualParticipant returns [EObject current=null] : ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) )? otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '{' otherlv_11= 'src:' otherlv_12= '[' ( (lv_sourceLowerBound_13_0= RULE_INT ) ) otherlv_14= ':' ( (lv_sourceUpperBound_15_0= RULE_INT ) ) otherlv_16= ']' (otherlv_17= 'path:' ( (lv_path_18_0= ruleConceptualPathNode ) ) )? otherlv_19= '}' otherlv_20= ';' ) ;
    public final EObject ruleConceptualParticipant() throws RecognitionException {
        EObject current = null;

        Token lv_rolename_1_0=null;
        Token otherlv_2=null;
        Token lv_lowerBound_3_0=null;
        Token otherlv_4=null;
        Token lv_upperBound_5_0=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_sourceLowerBound_13_0=null;
        Token otherlv_14=null;
        Token lv_sourceUpperBound_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_path_18_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:1354:2: ( ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) )? otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '{' otherlv_11= 'src:' otherlv_12= '[' ( (lv_sourceLowerBound_13_0= RULE_INT ) ) otherlv_14= ':' ( (lv_sourceUpperBound_15_0= RULE_INT ) ) otherlv_16= ']' (otherlv_17= 'path:' ( (lv_path_18_0= ruleConceptualPathNode ) ) )? otherlv_19= '}' otherlv_20= ';' ) )
            // InternalUddl.g:1355:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) )? otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '{' otherlv_11= 'src:' otherlv_12= '[' ( (lv_sourceLowerBound_13_0= RULE_INT ) ) otherlv_14= ':' ( (lv_sourceUpperBound_15_0= RULE_INT ) ) otherlv_16= ']' (otherlv_17= 'path:' ( (lv_path_18_0= ruleConceptualPathNode ) ) )? otherlv_19= '}' otherlv_20= ';' )
            {
            // InternalUddl.g:1355:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) )? otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '{' otherlv_11= 'src:' otherlv_12= '[' ( (lv_sourceLowerBound_13_0= RULE_INT ) ) otherlv_14= ':' ( (lv_sourceUpperBound_15_0= RULE_INT ) ) otherlv_16= ']' (otherlv_17= 'path:' ( (lv_path_18_0= ruleConceptualPathNode ) ) )? otherlv_19= '}' otherlv_20= ';' )
            // InternalUddl.g:1356:3: ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) )? otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '{' otherlv_11= 'src:' otherlv_12= '[' ( (lv_sourceLowerBound_13_0= RULE_INT ) ) otherlv_14= ':' ( (lv_sourceUpperBound_15_0= RULE_INT ) ) otherlv_16= ']' (otherlv_17= 'path:' ( (lv_path_18_0= ruleConceptualPathNode ) ) )? otherlv_19= '}' otherlv_20= ';'
            {
            // InternalUddl.g:1356:3: ( ( ruleQN ) )
            // InternalUddl.g:1357:4: ( ruleQN )
            {
            // InternalUddl.g:1357:4: ( ruleQN )
            // InternalUddl.g:1358:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualParticipantRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConceptualParticipantAccess().getTypeConceptualEntityCrossReference_0_0());
            				
            pushFollow(FOLLOW_3);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:1372:3: ( (lv_rolename_1_0= RULE_ID ) )
            // InternalUddl.g:1373:4: (lv_rolename_1_0= RULE_ID )
            {
            // InternalUddl.g:1373:4: (lv_rolename_1_0= RULE_ID )
            // InternalUddl.g:1374:5: lv_rolename_1_0= RULE_ID
            {
            lv_rolename_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_rolename_1_0, grammarAccess.getConceptualParticipantAccess().getRolenameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualParticipantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rolename",
            						lv_rolename_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:1390:3: (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) )? otherlv_6= ']' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==28) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalUddl.g:1391:4: otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) )? otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getConceptualParticipantAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalUddl.g:1395:4: ( (lv_lowerBound_3_0= RULE_INT ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_INT) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalUddl.g:1396:5: (lv_lowerBound_3_0= RULE_INT )
                            {
                            // InternalUddl.g:1396:5: (lv_lowerBound_3_0= RULE_INT )
                            // InternalUddl.g:1397:6: lv_lowerBound_3_0= RULE_INT
                            {
                            lv_lowerBound_3_0=(Token)match(input,RULE_INT,FOLLOW_22); 

                            						newLeafNode(lv_lowerBound_3_0, grammarAccess.getConceptualParticipantAccess().getLowerBoundINTTerminalRuleCall_2_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getConceptualParticipantRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"lowerBound",
                            							lv_lowerBound_3_0,
                            							"com.epistimis.uddl.Uddl.INT");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,26,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getConceptualParticipantAccess().getColonKeyword_2_2());
                    			
                    // InternalUddl.g:1417:4: ( (lv_upperBound_5_0= RULE_INT ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_INT) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalUddl.g:1418:5: (lv_upperBound_5_0= RULE_INT )
                            {
                            // InternalUddl.g:1418:5: (lv_upperBound_5_0= RULE_INT )
                            // InternalUddl.g:1419:6: lv_upperBound_5_0= RULE_INT
                            {
                            lv_upperBound_5_0=(Token)match(input,RULE_INT,FOLLOW_24); 

                            						newLeafNode(lv_upperBound_5_0, grammarAccess.getConceptualParticipantAccess().getUpperBoundINTTerminalRuleCall_2_3_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getConceptualParticipantRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"upperBound",
                            							lv_upperBound_5_0,
                            							"com.epistimis.uddl.Uddl.INT");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,29,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getConceptualParticipantAccess().getRightSquareBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalUddl.g:1440:3: ( (lv_description_7_0= RULE_STRING ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUddl.g:1441:4: (lv_description_7_0= RULE_STRING )
                    {
                    // InternalUddl.g:1441:4: (lv_description_7_0= RULE_STRING )
                    // InternalUddl.g:1442:5: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    					newLeafNode(lv_description_7_0, grammarAccess.getConceptualParticipantAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConceptualParticipantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_7_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:1458:3: (otherlv_8= ':' ( ( ruleQN ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==26) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalUddl.g:1459:4: otherlv_8= ':' ( ( ruleQN ) )
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getConceptualParticipantAccess().getColonKeyword_4_0());
                    			
                    // InternalUddl.g:1463:4: ( ( ruleQN ) )
                    // InternalUddl.g:1464:5: ( ruleQN )
                    {
                    // InternalUddl.g:1464:5: ( ruleQN )
                    // InternalUddl.g:1465:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConceptualParticipantRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConceptualParticipantAccess().getSpecializesConceptualCharacteristicCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_30); 

            			newLeafNode(otherlv_10, grammarAccess.getConceptualParticipantAccess().getLeftCurlyBracketKeyword_5());
            		
            otherlv_11=(Token)match(input,33,FOLLOW_17); 

            			newLeafNode(otherlv_11, grammarAccess.getConceptualParticipantAccess().getSrcKeyword_6());
            		
            otherlv_12=(Token)match(input,28,FOLLOW_31); 

            			newLeafNode(otherlv_12, grammarAccess.getConceptualParticipantAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalUddl.g:1492:3: ( (lv_sourceLowerBound_13_0= RULE_INT ) )
            // InternalUddl.g:1493:4: (lv_sourceLowerBound_13_0= RULE_INT )
            {
            // InternalUddl.g:1493:4: (lv_sourceLowerBound_13_0= RULE_INT )
            // InternalUddl.g:1494:5: lv_sourceLowerBound_13_0= RULE_INT
            {
            lv_sourceLowerBound_13_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_sourceLowerBound_13_0, grammarAccess.getConceptualParticipantAccess().getSourceLowerBoundINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualParticipantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sourceLowerBound",
            						lv_sourceLowerBound_13_0,
            						"com.epistimis.uddl.Uddl.INT");
            				

            }


            }

            otherlv_14=(Token)match(input,26,FOLLOW_31); 

            			newLeafNode(otherlv_14, grammarAccess.getConceptualParticipantAccess().getColonKeyword_9());
            		
            // InternalUddl.g:1514:3: ( (lv_sourceUpperBound_15_0= RULE_INT ) )
            // InternalUddl.g:1515:4: (lv_sourceUpperBound_15_0= RULE_INT )
            {
            // InternalUddl.g:1515:4: (lv_sourceUpperBound_15_0= RULE_INT )
            // InternalUddl.g:1516:5: lv_sourceUpperBound_15_0= RULE_INT
            {
            lv_sourceUpperBound_15_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_sourceUpperBound_15_0, grammarAccess.getConceptualParticipantAccess().getSourceUpperBoundINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualParticipantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sourceUpperBound",
            						lv_sourceUpperBound_15_0,
            						"com.epistimis.uddl.Uddl.INT");
            				

            }


            }

            otherlv_16=(Token)match(input,29,FOLLOW_32); 

            			newLeafNode(otherlv_16, grammarAccess.getConceptualParticipantAccess().getRightSquareBracketKeyword_11());
            		
            // InternalUddl.g:1536:3: (otherlv_17= 'path:' ( (lv_path_18_0= ruleConceptualPathNode ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==34) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalUddl.g:1537:4: otherlv_17= 'path:' ( (lv_path_18_0= ruleConceptualPathNode ) )
                    {
                    otherlv_17=(Token)match(input,34,FOLLOW_33); 

                    				newLeafNode(otherlv_17, grammarAccess.getConceptualParticipantAccess().getPathKeyword_12_0());
                    			
                    // InternalUddl.g:1541:4: ( (lv_path_18_0= ruleConceptualPathNode ) )
                    // InternalUddl.g:1542:5: (lv_path_18_0= ruleConceptualPathNode )
                    {
                    // InternalUddl.g:1542:5: (lv_path_18_0= ruleConceptualPathNode )
                    // InternalUddl.g:1543:6: lv_path_18_0= ruleConceptualPathNode
                    {

                    						newCompositeNode(grammarAccess.getConceptualParticipantAccess().getPathConceptualPathNodeParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_path_18_0=ruleConceptualPathNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConceptualParticipantRule());
                    						}
                    						set(
                    							current,
                    							"path",
                    							lv_path_18_0,
                    							"com.epistimis.uddl.Uddl.ConceptualPathNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_19, grammarAccess.getConceptualParticipantAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_20=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getConceptualParticipantAccess().getSemicolonKeyword_14());
            		

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
    // $ANTLR end "ruleConceptualParticipant"


    // $ANTLR start "entryRuleConceptualPathNode"
    // InternalUddl.g:1573:1: entryRuleConceptualPathNode returns [EObject current=null] : iv_ruleConceptualPathNode= ruleConceptualPathNode EOF ;
    public final EObject entryRuleConceptualPathNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualPathNode = null;


        try {
            // InternalUddl.g:1573:59: (iv_ruleConceptualPathNode= ruleConceptualPathNode EOF )
            // InternalUddl.g:1574:2: iv_ruleConceptualPathNode= ruleConceptualPathNode EOF
            {
             newCompositeNode(grammarAccess.getConceptualPathNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualPathNode=ruleConceptualPathNode();

            state._fsp--;

             current =iv_ruleConceptualPathNode; 
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
    // $ANTLR end "entryRuleConceptualPathNode"


    // $ANTLR start "ruleConceptualPathNode"
    // InternalUddl.g:1580:1: ruleConceptualPathNode returns [EObject current=null] : (this_ConceptualParticipantPathNode_0= ruleConceptualParticipantPathNode | this_ConceptualCharacteristicPathNode_1= ruleConceptualCharacteristicPathNode ) ;
    public final EObject ruleConceptualPathNode() throws RecognitionException {
        EObject current = null;

        EObject this_ConceptualParticipantPathNode_0 = null;

        EObject this_ConceptualCharacteristicPathNode_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:1586:2: ( (this_ConceptualParticipantPathNode_0= ruleConceptualParticipantPathNode | this_ConceptualCharacteristicPathNode_1= ruleConceptualCharacteristicPathNode ) )
            // InternalUddl.g:1587:2: (this_ConceptualParticipantPathNode_0= ruleConceptualParticipantPathNode | this_ConceptualCharacteristicPathNode_1= ruleConceptualCharacteristicPathNode )
            {
            // InternalUddl.g:1587:2: (this_ConceptualParticipantPathNode_0= ruleConceptualParticipantPathNode | this_ConceptualCharacteristicPathNode_1= ruleConceptualCharacteristicPathNode )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==35) ) {
                alt40=1;
            }
            else if ( (LA40_0==36) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalUddl.g:1588:3: this_ConceptualParticipantPathNode_0= ruleConceptualParticipantPathNode
                    {

                    			newCompositeNode(grammarAccess.getConceptualPathNodeAccess().getConceptualParticipantPathNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptualParticipantPathNode_0=ruleConceptualParticipantPathNode();

                    state._fsp--;


                    			current = this_ConceptualParticipantPathNode_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:1597:3: this_ConceptualCharacteristicPathNode_1= ruleConceptualCharacteristicPathNode
                    {

                    			newCompositeNode(grammarAccess.getConceptualPathNodeAccess().getConceptualCharacteristicPathNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptualCharacteristicPathNode_1=ruleConceptualCharacteristicPathNode();

                    state._fsp--;


                    			current = this_ConceptualCharacteristicPathNode_1;
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
    // $ANTLR end "ruleConceptualPathNode"


    // $ANTLR start "entryRuleConceptualParticipantPathNode"
    // InternalUddl.g:1609:1: entryRuleConceptualParticipantPathNode returns [EObject current=null] : iv_ruleConceptualParticipantPathNode= ruleConceptualParticipantPathNode EOF ;
    public final EObject entryRuleConceptualParticipantPathNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualParticipantPathNode = null;


        try {
            // InternalUddl.g:1609:70: (iv_ruleConceptualParticipantPathNode= ruleConceptualParticipantPathNode EOF )
            // InternalUddl.g:1610:2: iv_ruleConceptualParticipantPathNode= ruleConceptualParticipantPathNode EOF
            {
             newCompositeNode(grammarAccess.getConceptualParticipantPathNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualParticipantPathNode=ruleConceptualParticipantPathNode();

            state._fsp--;

             current =iv_ruleConceptualParticipantPathNode; 
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
    // $ANTLR end "entryRuleConceptualParticipantPathNode"


    // $ANTLR start "ruleConceptualParticipantPathNode"
    // InternalUddl.g:1616:1: ruleConceptualParticipantPathNode returns [EObject current=null] : (otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= ruleConceptualPathNode ) )? ) ;
    public final EObject ruleConceptualParticipantPathNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_node_2_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:1622:2: ( (otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= ruleConceptualPathNode ) )? ) )
            // InternalUddl.g:1623:2: (otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= ruleConceptualPathNode ) )? )
            {
            // InternalUddl.g:1623:2: (otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= ruleConceptualPathNode ) )? )
            // InternalUddl.g:1624:3: otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= ruleConceptualPathNode ) )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConceptualParticipantPathNodeAccess().getSolidusKeyword_0());
            		
            // InternalUddl.g:1628:3: ( ( ruleQN ) )
            // InternalUddl.g:1629:4: ( ruleQN )
            {
            // InternalUddl.g:1629:4: ( ruleQN )
            // InternalUddl.g:1630:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualParticipantPathNodeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConceptualParticipantPathNodeAccess().getProjectedParticipantConceptualParticipantCrossReference_1_0());
            				
            pushFollow(FOLLOW_35);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:1644:3: ( (lv_node_2_0= ruleConceptualPathNode ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=35 && LA41_0<=36)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalUddl.g:1645:4: (lv_node_2_0= ruleConceptualPathNode )
                    {
                    // InternalUddl.g:1645:4: (lv_node_2_0= ruleConceptualPathNode )
                    // InternalUddl.g:1646:5: lv_node_2_0= ruleConceptualPathNode
                    {

                    					newCompositeNode(grammarAccess.getConceptualParticipantPathNodeAccess().getNodeConceptualPathNodeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_node_2_0=ruleConceptualPathNode();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConceptualParticipantPathNodeRule());
                    					}
                    					set(
                    						current,
                    						"node",
                    						lv_node_2_0,
                    						"com.epistimis.uddl.Uddl.ConceptualPathNode");
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
    // $ANTLR end "ruleConceptualParticipantPathNode"


    // $ANTLR start "entryRuleConceptualCharacteristicPathNode"
    // InternalUddl.g:1667:1: entryRuleConceptualCharacteristicPathNode returns [EObject current=null] : iv_ruleConceptualCharacteristicPathNode= ruleConceptualCharacteristicPathNode EOF ;
    public final EObject entryRuleConceptualCharacteristicPathNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualCharacteristicPathNode = null;


        try {
            // InternalUddl.g:1667:73: (iv_ruleConceptualCharacteristicPathNode= ruleConceptualCharacteristicPathNode EOF )
            // InternalUddl.g:1668:2: iv_ruleConceptualCharacteristicPathNode= ruleConceptualCharacteristicPathNode EOF
            {
             newCompositeNode(grammarAccess.getConceptualCharacteristicPathNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualCharacteristicPathNode=ruleConceptualCharacteristicPathNode();

            state._fsp--;

             current =iv_ruleConceptualCharacteristicPathNode; 
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
    // $ANTLR end "entryRuleConceptualCharacteristicPathNode"


    // $ANTLR start "ruleConceptualCharacteristicPathNode"
    // InternalUddl.g:1674:1: ruleConceptualCharacteristicPathNode returns [EObject current=null] : (otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= ruleConceptualPathNode ) )? ) ;
    public final EObject ruleConceptualCharacteristicPathNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_node_2_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:1680:2: ( (otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= ruleConceptualPathNode ) )? ) )
            // InternalUddl.g:1681:2: (otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= ruleConceptualPathNode ) )? )
            {
            // InternalUddl.g:1681:2: (otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= ruleConceptualPathNode ) )? )
            // InternalUddl.g:1682:3: otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= ruleConceptualPathNode ) )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConceptualCharacteristicPathNodeAccess().getNumberSignKeyword_0());
            		
            // InternalUddl.g:1686:3: ( ( ruleQN ) )
            // InternalUddl.g:1687:4: ( ruleQN )
            {
            // InternalUddl.g:1687:4: ( ruleQN )
            // InternalUddl.g:1688:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualCharacteristicPathNodeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConceptualCharacteristicPathNodeAccess().getProjectedCharacteristicConceptualCharacteristicCrossReference_1_0());
            				
            pushFollow(FOLLOW_35);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:1702:3: ( (lv_node_2_0= ruleConceptualPathNode ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=35 && LA42_0<=36)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalUddl.g:1703:4: (lv_node_2_0= ruleConceptualPathNode )
                    {
                    // InternalUddl.g:1703:4: (lv_node_2_0= ruleConceptualPathNode )
                    // InternalUddl.g:1704:5: lv_node_2_0= ruleConceptualPathNode
                    {

                    					newCompositeNode(grammarAccess.getConceptualCharacteristicPathNodeAccess().getNodeConceptualPathNodeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_node_2_0=ruleConceptualPathNode();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConceptualCharacteristicPathNodeRule());
                    					}
                    					set(
                    						current,
                    						"node",
                    						lv_node_2_0,
                    						"com.epistimis.uddl.Uddl.ConceptualPathNode");
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
    // $ANTLR end "ruleConceptualCharacteristicPathNode"


    // $ANTLR start "entryRuleConceptualView"
    // InternalUddl.g:1725:1: entryRuleConceptualView returns [EObject current=null] : iv_ruleConceptualView= ruleConceptualView EOF ;
    public final EObject entryRuleConceptualView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualView = null;


        try {
            // InternalUddl.g:1725:55: (iv_ruleConceptualView= ruleConceptualView EOF )
            // InternalUddl.g:1726:2: iv_ruleConceptualView= ruleConceptualView EOF
            {
             newCompositeNode(grammarAccess.getConceptualViewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualView=ruleConceptualView();

            state._fsp--;

             current =iv_ruleConceptualView; 
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
    // $ANTLR end "entryRuleConceptualView"


    // $ANTLR start "ruleConceptualView"
    // InternalUddl.g:1732:1: ruleConceptualView returns [EObject current=null] : (this_ConceptualQuery_0= ruleConceptualQuery | this_ConceptualCompositeQuery_1= ruleConceptualCompositeQuery ) ;
    public final EObject ruleConceptualView() throws RecognitionException {
        EObject current = null;

        EObject this_ConceptualQuery_0 = null;

        EObject this_ConceptualCompositeQuery_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:1738:2: ( (this_ConceptualQuery_0= ruleConceptualQuery | this_ConceptualCompositeQuery_1= ruleConceptualCompositeQuery ) )
            // InternalUddl.g:1739:2: (this_ConceptualQuery_0= ruleConceptualQuery | this_ConceptualCompositeQuery_1= ruleConceptualCompositeQuery )
            {
            // InternalUddl.g:1739:2: (this_ConceptualQuery_0= ruleConceptualQuery | this_ConceptualCompositeQuery_1= ruleConceptualCompositeQuery )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==37) ) {
                alt43=1;
            }
            else if ( (LA43_0==39) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalUddl.g:1740:3: this_ConceptualQuery_0= ruleConceptualQuery
                    {

                    			newCompositeNode(grammarAccess.getConceptualViewAccess().getConceptualQueryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptualQuery_0=ruleConceptualQuery();

                    state._fsp--;


                    			current = this_ConceptualQuery_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:1749:3: this_ConceptualCompositeQuery_1= ruleConceptualCompositeQuery
                    {

                    			newCompositeNode(grammarAccess.getConceptualViewAccess().getConceptualCompositeQueryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptualCompositeQuery_1=ruleConceptualCompositeQuery();

                    state._fsp--;


                    			current = this_ConceptualCompositeQuery_1;
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
    // $ANTLR end "ruleConceptualView"


    // $ANTLR start "entryRuleConceptualQuery"
    // InternalUddl.g:1761:1: entryRuleConceptualQuery returns [EObject current=null] : iv_ruleConceptualQuery= ruleConceptualQuery EOF ;
    public final EObject entryRuleConceptualQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualQuery = null;


        try {
            // InternalUddl.g:1761:56: (iv_ruleConceptualQuery= ruleConceptualQuery EOF )
            // InternalUddl.g:1762:2: iv_ruleConceptualQuery= ruleConceptualQuery EOF
            {
             newCompositeNode(grammarAccess.getConceptualQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualQuery=ruleConceptualQuery();

            state._fsp--;

             current =iv_ruleConceptualQuery; 
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
    // $ANTLR end "entryRuleConceptualQuery"


    // $ANTLR start "ruleConceptualQuery"
    // InternalUddl.g:1768:1: ruleConceptualQuery returns [EObject current=null] : (otherlv_0= 'cquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'spec:' ( (lv_specification_5_0= RULE_STRING ) ) otherlv_6= '};' ) ;
    public final EObject ruleConceptualQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_specification_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalUddl.g:1774:2: ( (otherlv_0= 'cquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'spec:' ( (lv_specification_5_0= RULE_STRING ) ) otherlv_6= '};' ) )
            // InternalUddl.g:1775:2: (otherlv_0= 'cquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'spec:' ( (lv_specification_5_0= RULE_STRING ) ) otherlv_6= '};' )
            {
            // InternalUddl.g:1775:2: (otherlv_0= 'cquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'spec:' ( (lv_specification_5_0= RULE_STRING ) ) otherlv_6= '};' )
            // InternalUddl.g:1776:3: otherlv_0= 'cquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'spec:' ( (lv_specification_5_0= RULE_STRING ) ) otherlv_6= '};'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConceptualQueryAccess().getCqueryKeyword_0());
            		
            // InternalUddl.g:1780:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:1781:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:1781:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:1782:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConceptualQueryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:1798:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_STRING) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalUddl.g:1799:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:1799:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:1800:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getConceptualQueryAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConceptualQueryRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getConceptualQueryAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,38,FOLLOW_37); 

            			newLeafNode(otherlv_4, grammarAccess.getConceptualQueryAccess().getSpecKeyword_4());
            		
            // InternalUddl.g:1824:3: ( (lv_specification_5_0= RULE_STRING ) )
            // InternalUddl.g:1825:4: (lv_specification_5_0= RULE_STRING )
            {
            // InternalUddl.g:1825:4: (lv_specification_5_0= RULE_STRING )
            // InternalUddl.g:1826:5: lv_specification_5_0= RULE_STRING
            {
            lv_specification_5_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_specification_5_0, grammarAccess.getConceptualQueryAccess().getSpecificationSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"specification",
            						lv_specification_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getConceptualQueryAccess().getRightCurlyBracketSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleConceptualQuery"


    // $ANTLR start "entryRuleConceptualCompositeQuery"
    // InternalUddl.g:1850:1: entryRuleConceptualCompositeQuery returns [EObject current=null] : iv_ruleConceptualCompositeQuery= ruleConceptualCompositeQuery EOF ;
    public final EObject entryRuleConceptualCompositeQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualCompositeQuery = null;


        try {
            // InternalUddl.g:1850:65: (iv_ruleConceptualCompositeQuery= ruleConceptualCompositeQuery EOF )
            // InternalUddl.g:1851:2: iv_ruleConceptualCompositeQuery= ruleConceptualCompositeQuery EOF
            {
             newCompositeNode(grammarAccess.getConceptualCompositeQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualCompositeQuery=ruleConceptualCompositeQuery();

            state._fsp--;

             current =iv_ruleConceptualCompositeQuery; 
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
    // $ANTLR end "entryRuleConceptualCompositeQuery"


    // $ANTLR start "ruleConceptualCompositeQuery"
    // InternalUddl.g:1857:1: ruleConceptualCompositeQuery returns [EObject current=null] : (otherlv_0= 'ccquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_isUnion_4_0= 'isUnion' ) ) ( (lv_composition_5_0= ruleConceptualQueryComposition ) ) ( (lv_composition_6_0= ruleConceptualQueryComposition ) )+ otherlv_7= '};' ) ;
    public final EObject ruleConceptualCompositeQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token lv_isUnion_4_0=null;
        Token otherlv_7=null;
        EObject lv_composition_5_0 = null;

        EObject lv_composition_6_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:1863:2: ( (otherlv_0= 'ccquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_isUnion_4_0= 'isUnion' ) ) ( (lv_composition_5_0= ruleConceptualQueryComposition ) ) ( (lv_composition_6_0= ruleConceptualQueryComposition ) )+ otherlv_7= '};' ) )
            // InternalUddl.g:1864:2: (otherlv_0= 'ccquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_isUnion_4_0= 'isUnion' ) ) ( (lv_composition_5_0= ruleConceptualQueryComposition ) ) ( (lv_composition_6_0= ruleConceptualQueryComposition ) )+ otherlv_7= '};' )
            {
            // InternalUddl.g:1864:2: (otherlv_0= 'ccquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_isUnion_4_0= 'isUnion' ) ) ( (lv_composition_5_0= ruleConceptualQueryComposition ) ) ( (lv_composition_6_0= ruleConceptualQueryComposition ) )+ otherlv_7= '};' )
            // InternalUddl.g:1865:3: otherlv_0= 'ccquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_isUnion_4_0= 'isUnion' ) ) ( (lv_composition_5_0= ruleConceptualQueryComposition ) ) ( (lv_composition_6_0= ruleConceptualQueryComposition ) )+ otherlv_7= '};'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConceptualCompositeQueryAccess().getCcqueryKeyword_0());
            		
            // InternalUddl.g:1869:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:1870:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:1870:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:1871:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConceptualCompositeQueryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualCompositeQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:1887:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_STRING) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalUddl.g:1888:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:1888:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:1889:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getConceptualCompositeQueryAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConceptualCompositeQueryRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getConceptualCompositeQueryAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUddl.g:1909:3: ( (lv_isUnion_4_0= 'isUnion' ) )
            // InternalUddl.g:1910:4: (lv_isUnion_4_0= 'isUnion' )
            {
            // InternalUddl.g:1910:4: (lv_isUnion_4_0= 'isUnion' )
            // InternalUddl.g:1911:5: lv_isUnion_4_0= 'isUnion'
            {
            lv_isUnion_4_0=(Token)match(input,40,FOLLOW_3); 

            					newLeafNode(lv_isUnion_4_0, grammarAccess.getConceptualCompositeQueryAccess().getIsUnionIsUnionKeyword_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualCompositeQueryRule());
            					}
            					setWithLastConsumed(current, "isUnion", lv_isUnion_4_0 != null, "isUnion");
            				

            }


            }

            // InternalUddl.g:1923:3: ( (lv_composition_5_0= ruleConceptualQueryComposition ) )
            // InternalUddl.g:1924:4: (lv_composition_5_0= ruleConceptualQueryComposition )
            {
            // InternalUddl.g:1924:4: (lv_composition_5_0= ruleConceptualQueryComposition )
            // InternalUddl.g:1925:5: lv_composition_5_0= ruleConceptualQueryComposition
            {

            					newCompositeNode(grammarAccess.getConceptualCompositeQueryAccess().getCompositionConceptualQueryCompositionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_3);
            lv_composition_5_0=ruleConceptualQueryComposition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConceptualCompositeQueryRule());
            					}
            					add(
            						current,
            						"composition",
            						lv_composition_5_0,
            						"com.epistimis.uddl.Uddl.ConceptualQueryComposition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:1942:3: ( (lv_composition_6_0= ruleConceptualQueryComposition ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalUddl.g:1943:4: (lv_composition_6_0= ruleConceptualQueryComposition )
            	    {
            	    // InternalUddl.g:1943:4: (lv_composition_6_0= ruleConceptualQueryComposition )
            	    // InternalUddl.g:1944:5: lv_composition_6_0= ruleConceptualQueryComposition
            	    {

            	    					newCompositeNode(grammarAccess.getConceptualCompositeQueryAccess().getCompositionConceptualQueryCompositionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_composition_6_0=ruleConceptualQueryComposition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConceptualCompositeQueryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"composition",
            	    						lv_composition_6_0,
            	    						"com.epistimis.uddl.Uddl.ConceptualQueryComposition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);

            otherlv_7=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getConceptualCompositeQueryAccess().getRightCurlyBracketSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleConceptualCompositeQuery"


    // $ANTLR start "entryRuleConceptualQueryComposition"
    // InternalUddl.g:1969:1: entryRuleConceptualQueryComposition returns [EObject current=null] : iv_ruleConceptualQueryComposition= ruleConceptualQueryComposition EOF ;
    public final EObject entryRuleConceptualQueryComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualQueryComposition = null;


        try {
            // InternalUddl.g:1969:67: (iv_ruleConceptualQueryComposition= ruleConceptualQueryComposition EOF )
            // InternalUddl.g:1970:2: iv_ruleConceptualQueryComposition= ruleConceptualQueryComposition EOF
            {
             newCompositeNode(grammarAccess.getConceptualQueryCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualQueryComposition=ruleConceptualQueryComposition();

            state._fsp--;

             current =iv_ruleConceptualQueryComposition; 
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
    // $ANTLR end "entryRuleConceptualQueryComposition"


    // $ANTLR start "ruleConceptualQueryComposition"
    // InternalUddl.g:1976:1: ruleConceptualQueryComposition returns [EObject current=null] : ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleConceptualQueryComposition() throws RecognitionException {
        EObject current = null;

        Token lv_rolename_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalUddl.g:1982:2: ( ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalUddl.g:1983:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalUddl.g:1983:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalUddl.g:1984:3: ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // InternalUddl.g:1984:3: ( ( ruleQN ) )
            // InternalUddl.g:1985:4: ( ruleQN )
            {
            // InternalUddl.g:1985:4: ( ruleQN )
            // InternalUddl.g:1986:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualQueryCompositionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConceptualQueryCompositionAccess().getTypeConceptualViewCrossReference_0_0());
            				
            pushFollow(FOLLOW_3);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:2000:3: ( (lv_rolename_1_0= RULE_ID ) )
            // InternalUddl.g:2001:4: (lv_rolename_1_0= RULE_ID )
            {
            // InternalUddl.g:2001:4: (lv_rolename_1_0= RULE_ID )
            // InternalUddl.g:2002:5: lv_rolename_1_0= RULE_ID
            {
            lv_rolename_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_rolename_1_0, grammarAccess.getConceptualQueryCompositionAccess().getRolenameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualQueryCompositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rolename",
            						lv_rolename_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getConceptualQueryCompositionAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleConceptualQueryComposition"


    // $ANTLR start "entryRuleLogicalElement"
    // InternalUddl.g:2026:1: entryRuleLogicalElement returns [EObject current=null] : iv_ruleLogicalElement= ruleLogicalElement EOF ;
    public final EObject entryRuleLogicalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalElement = null;


        try {
            // InternalUddl.g:2026:55: (iv_ruleLogicalElement= ruleLogicalElement EOF )
            // InternalUddl.g:2027:2: iv_ruleLogicalElement= ruleLogicalElement EOF
            {
             newCompositeNode(grammarAccess.getLogicalElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalElement=ruleLogicalElement();

            state._fsp--;

             current =iv_ruleLogicalElement; 
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
    // $ANTLR end "entryRuleLogicalElement"


    // $ANTLR start "ruleLogicalElement"
    // InternalUddl.g:2033:1: ruleLogicalElement returns [EObject current=null] : (this_LogicalComposableElement_0= ruleLogicalComposableElement | this_LogicalConversion_1= ruleLogicalConversion | this_LogicalUnit_2= ruleLogicalUnit | this_LogicalCoordinateSystem_3= ruleLogicalCoordinateSystem | this_LogicalCoordinateSystemAxis_4= ruleLogicalCoordinateSystemAxis | this_LogicalMeasurementConversion_5= ruleLogicalMeasurementConversion | this_LogicalMeasurementSystemConversion_6= ruleLogicalMeasurementSystemConversion | this_LogicalMeasurementAxis_7= ruleLogicalMeasurementAxis | this_LogicalAbstractMeasurementSystem_8= ruleLogicalAbstractMeasurementSystem | this_LogicalMeasurementSystemAxis_9= ruleLogicalMeasurementSystemAxis | this_LogicalValueType_10= ruleLogicalValueType | this_LogicalView_11= ruleLogicalView | this_LogicalLandmark_12= ruleLogicalLandmark | this_LogicalValueTypeUnit_13= ruleLogicalValueTypeUnit ) ;
    public final EObject ruleLogicalElement() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalComposableElement_0 = null;

        EObject this_LogicalConversion_1 = null;

        EObject this_LogicalUnit_2 = null;

        EObject this_LogicalCoordinateSystem_3 = null;

        EObject this_LogicalCoordinateSystemAxis_4 = null;

        EObject this_LogicalMeasurementConversion_5 = null;

        EObject this_LogicalMeasurementSystemConversion_6 = null;

        EObject this_LogicalMeasurementAxis_7 = null;

        EObject this_LogicalAbstractMeasurementSystem_8 = null;

        EObject this_LogicalMeasurementSystemAxis_9 = null;

        EObject this_LogicalValueType_10 = null;

        EObject this_LogicalView_11 = null;

        EObject this_LogicalLandmark_12 = null;

        EObject this_LogicalValueTypeUnit_13 = null;



        	enterRule();

        try {
            // InternalUddl.g:2039:2: ( (this_LogicalComposableElement_0= ruleLogicalComposableElement | this_LogicalConversion_1= ruleLogicalConversion | this_LogicalUnit_2= ruleLogicalUnit | this_LogicalCoordinateSystem_3= ruleLogicalCoordinateSystem | this_LogicalCoordinateSystemAxis_4= ruleLogicalCoordinateSystemAxis | this_LogicalMeasurementConversion_5= ruleLogicalMeasurementConversion | this_LogicalMeasurementSystemConversion_6= ruleLogicalMeasurementSystemConversion | this_LogicalMeasurementAxis_7= ruleLogicalMeasurementAxis | this_LogicalAbstractMeasurementSystem_8= ruleLogicalAbstractMeasurementSystem | this_LogicalMeasurementSystemAxis_9= ruleLogicalMeasurementSystemAxis | this_LogicalValueType_10= ruleLogicalValueType | this_LogicalView_11= ruleLogicalView | this_LogicalLandmark_12= ruleLogicalLandmark | this_LogicalValueTypeUnit_13= ruleLogicalValueTypeUnit ) )
            // InternalUddl.g:2040:2: (this_LogicalComposableElement_0= ruleLogicalComposableElement | this_LogicalConversion_1= ruleLogicalConversion | this_LogicalUnit_2= ruleLogicalUnit | this_LogicalCoordinateSystem_3= ruleLogicalCoordinateSystem | this_LogicalCoordinateSystemAxis_4= ruleLogicalCoordinateSystemAxis | this_LogicalMeasurementConversion_5= ruleLogicalMeasurementConversion | this_LogicalMeasurementSystemConversion_6= ruleLogicalMeasurementSystemConversion | this_LogicalMeasurementAxis_7= ruleLogicalMeasurementAxis | this_LogicalAbstractMeasurementSystem_8= ruleLogicalAbstractMeasurementSystem | this_LogicalMeasurementSystemAxis_9= ruleLogicalMeasurementSystemAxis | this_LogicalValueType_10= ruleLogicalValueType | this_LogicalView_11= ruleLogicalView | this_LogicalLandmark_12= ruleLogicalLandmark | this_LogicalValueTypeUnit_13= ruleLogicalValueTypeUnit )
            {
            // InternalUddl.g:2040:2: (this_LogicalComposableElement_0= ruleLogicalComposableElement | this_LogicalConversion_1= ruleLogicalConversion | this_LogicalUnit_2= ruleLogicalUnit | this_LogicalCoordinateSystem_3= ruleLogicalCoordinateSystem | this_LogicalCoordinateSystemAxis_4= ruleLogicalCoordinateSystemAxis | this_LogicalMeasurementConversion_5= ruleLogicalMeasurementConversion | this_LogicalMeasurementSystemConversion_6= ruleLogicalMeasurementSystemConversion | this_LogicalMeasurementAxis_7= ruleLogicalMeasurementAxis | this_LogicalAbstractMeasurementSystem_8= ruleLogicalAbstractMeasurementSystem | this_LogicalMeasurementSystemAxis_9= ruleLogicalMeasurementSystemAxis | this_LogicalValueType_10= ruleLogicalValueType | this_LogicalView_11= ruleLogicalView | this_LogicalLandmark_12= ruleLogicalLandmark | this_LogicalValueTypeUnit_13= ruleLogicalValueTypeUnit )
            int alt47=14;
            switch ( input.LA(1) ) {
            case 89:
            case 95:
            case 96:
                {
                alt47=1;
                }
                break;
            case 42:
            case 44:
                {
                alt47=2;
                }
                break;
            case 41:
                {
                alt47=3;
                }
                break;
            case 61:
                {
                alt47=4;
                }
                break;
            case 65:
                {
                alt47=5;
                }
                break;
            case 94:
                {
                alt47=6;
                }
                break;
            case 86:
                {
                alt47=7;
                }
                break;
            case 92:
                {
                alt47=8;
                }
                break;
            case 66:
            case 69:
                {
                alt47=9;
                }
                break;
            case 76:
                {
                alt47=10;
                }
                break;
            case RULE_ID:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 59:
                {
                alt47=11;
                }
                break;
            case 98:
            case 99:
                {
                alt47=12;
                }
                break;
            case 68:
                {
                alt47=13;
                }
                break;
            case 79:
                {
                alt47=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalUddl.g:2041:3: this_LogicalComposableElement_0= ruleLogicalComposableElement
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalComposableElementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalComposableElement_0=ruleLogicalComposableElement();

                    state._fsp--;


                    			current = this_LogicalComposableElement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:2050:3: this_LogicalConversion_1= ruleLogicalConversion
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalConversionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalConversion_1=ruleLogicalConversion();

                    state._fsp--;


                    			current = this_LogicalConversion_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUddl.g:2059:3: this_LogicalUnit_2= ruleLogicalUnit
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalUnitParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalUnit_2=ruleLogicalUnit();

                    state._fsp--;


                    			current = this_LogicalUnit_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUddl.g:2068:3: this_LogicalCoordinateSystem_3= ruleLogicalCoordinateSystem
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalCoordinateSystemParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalCoordinateSystem_3=ruleLogicalCoordinateSystem();

                    state._fsp--;


                    			current = this_LogicalCoordinateSystem_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalUddl.g:2077:3: this_LogicalCoordinateSystemAxis_4= ruleLogicalCoordinateSystemAxis
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalCoordinateSystemAxisParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalCoordinateSystemAxis_4=ruleLogicalCoordinateSystemAxis();

                    state._fsp--;


                    			current = this_LogicalCoordinateSystemAxis_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalUddl.g:2086:3: this_LogicalMeasurementConversion_5= ruleLogicalMeasurementConversion
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalMeasurementConversionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalMeasurementConversion_5=ruleLogicalMeasurementConversion();

                    state._fsp--;


                    			current = this_LogicalMeasurementConversion_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalUddl.g:2095:3: this_LogicalMeasurementSystemConversion_6= ruleLogicalMeasurementSystemConversion
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalMeasurementSystemConversionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalMeasurementSystemConversion_6=ruleLogicalMeasurementSystemConversion();

                    state._fsp--;


                    			current = this_LogicalMeasurementSystemConversion_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalUddl.g:2104:3: this_LogicalMeasurementAxis_7= ruleLogicalMeasurementAxis
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalMeasurementAxisParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalMeasurementAxis_7=ruleLogicalMeasurementAxis();

                    state._fsp--;


                    			current = this_LogicalMeasurementAxis_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalUddl.g:2113:3: this_LogicalAbstractMeasurementSystem_8= ruleLogicalAbstractMeasurementSystem
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalAbstractMeasurementSystemParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalAbstractMeasurementSystem_8=ruleLogicalAbstractMeasurementSystem();

                    state._fsp--;


                    			current = this_LogicalAbstractMeasurementSystem_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalUddl.g:2122:3: this_LogicalMeasurementSystemAxis_9= ruleLogicalMeasurementSystemAxis
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalMeasurementSystemAxisParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalMeasurementSystemAxis_9=ruleLogicalMeasurementSystemAxis();

                    state._fsp--;


                    			current = this_LogicalMeasurementSystemAxis_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalUddl.g:2131:3: this_LogicalValueType_10= ruleLogicalValueType
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalValueTypeParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalValueType_10=ruleLogicalValueType();

                    state._fsp--;


                    			current = this_LogicalValueType_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalUddl.g:2140:3: this_LogicalView_11= ruleLogicalView
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalViewParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalView_11=ruleLogicalView();

                    state._fsp--;


                    			current = this_LogicalView_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalUddl.g:2149:3: this_LogicalLandmark_12= ruleLogicalLandmark
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalLandmarkParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalLandmark_12=ruleLogicalLandmark();

                    state._fsp--;


                    			current = this_LogicalLandmark_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalUddl.g:2158:3: this_LogicalValueTypeUnit_13= ruleLogicalValueTypeUnit
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalValueTypeUnitParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalValueTypeUnit_13=ruleLogicalValueTypeUnit();

                    state._fsp--;


                    			current = this_LogicalValueTypeUnit_13;
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
    // $ANTLR end "ruleLogicalElement"


    // $ANTLR start "entryRuleLogicalUnit"
    // InternalUddl.g:2170:1: entryRuleLogicalUnit returns [EObject current=null] : iv_ruleLogicalUnit= ruleLogicalUnit EOF ;
    public final EObject entryRuleLogicalUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalUnit = null;


        try {
            // InternalUddl.g:2170:52: (iv_ruleLogicalUnit= ruleLogicalUnit EOF )
            // InternalUddl.g:2171:2: iv_ruleLogicalUnit= ruleLogicalUnit EOF
            {
             newCompositeNode(grammarAccess.getLogicalUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalUnit=ruleLogicalUnit();

            state._fsp--;

             current =iv_ruleLogicalUnit; 
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
    // $ANTLR end "entryRuleLogicalUnit"


    // $ANTLR start "ruleLogicalUnit"
    // InternalUddl.g:2177:1: ruleLogicalUnit returns [EObject current=null] : (otherlv_0= 'lunit' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleLogicalUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUddl.g:2183:2: ( (otherlv_0= 'lunit' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalUddl.g:2184:2: (otherlv_0= 'lunit' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalUddl.g:2184:2: (otherlv_0= 'lunit' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalUddl.g:2185:3: otherlv_0= 'lunit' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalUnitAccess().getLunitKeyword_0());
            		
            // InternalUddl.g:2189:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:2190:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:2190:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:2191:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalUnitAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalUnitRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:2207:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_STRING) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalUddl.g:2208:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:2208:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:2209:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalUnitAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalUnitRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalUnitAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleLogicalUnit"


    // $ANTLR start "entryRuleLogicalConversion"
    // InternalUddl.g:2233:1: entryRuleLogicalConversion returns [EObject current=null] : iv_ruleLogicalConversion= ruleLogicalConversion EOF ;
    public final EObject entryRuleLogicalConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalConversion = null;


        try {
            // InternalUddl.g:2233:58: (iv_ruleLogicalConversion= ruleLogicalConversion EOF )
            // InternalUddl.g:2234:2: iv_ruleLogicalConversion= ruleLogicalConversion EOF
            {
             newCompositeNode(grammarAccess.getLogicalConversionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalConversion=ruleLogicalConversion();

            state._fsp--;

             current =iv_ruleLogicalConversion; 
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
    // $ANTLR end "entryRuleLogicalConversion"


    // $ANTLR start "ruleLogicalConversion"
    // InternalUddl.g:2240:1: ruleLogicalConversion returns [EObject current=null] : ( (otherlv_0= 'conv' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-()>' ( ( ruleQN ) ) otherlv_7= '};' ) | this_LogicalAffineConversion_8= ruleLogicalAffineConversion ) ;
    public final EObject ruleLogicalConversion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_LogicalAffineConversion_8 = null;



        	enterRule();

        try {
            // InternalUddl.g:2246:2: ( ( (otherlv_0= 'conv' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-()>' ( ( ruleQN ) ) otherlv_7= '};' ) | this_LogicalAffineConversion_8= ruleLogicalAffineConversion ) )
            // InternalUddl.g:2247:2: ( (otherlv_0= 'conv' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-()>' ( ( ruleQN ) ) otherlv_7= '};' ) | this_LogicalAffineConversion_8= ruleLogicalAffineConversion )
            {
            // InternalUddl.g:2247:2: ( (otherlv_0= 'conv' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-()>' ( ( ruleQN ) ) otherlv_7= '};' ) | this_LogicalAffineConversion_8= ruleLogicalAffineConversion )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==42) ) {
                alt50=1;
            }
            else if ( (LA50_0==44) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalUddl.g:2248:3: (otherlv_0= 'conv' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-()>' ( ( ruleQN ) ) otherlv_7= '};' )
                    {
                    // InternalUddl.g:2248:3: (otherlv_0= 'conv' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-()>' ( ( ruleQN ) ) otherlv_7= '};' )
                    // InternalUddl.g:2249:4: otherlv_0= 'conv' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-()>' ( ( ruleQN ) ) otherlv_7= '};'
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getLogicalConversionAccess().getConvKeyword_0_0());
                    			
                    // InternalUddl.g:2253:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalUddl.g:2254:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUddl.g:2254:5: (lv_name_1_0= RULE_ID )
                    // InternalUddl.g:2255:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getLogicalConversionAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalConversionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalUddl.g:2271:4: ( (lv_description_2_0= RULE_STRING ) )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==RULE_STRING) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalUddl.g:2272:5: (lv_description_2_0= RULE_STRING )
                            {
                            // InternalUddl.g:2272:5: (lv_description_2_0= RULE_STRING )
                            // InternalUddl.g:2273:6: lv_description_2_0= RULE_STRING
                            {
                            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                            						newLeafNode(lv_description_2_0, grammarAccess.getLogicalConversionAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getLogicalConversionRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"description",
                            							lv_description_2_0,
                            							"org.eclipse.xtext.common.Terminals.STRING");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getLogicalConversionAccess().getLeftCurlyBracketKeyword_0_3());
                    			
                    // InternalUddl.g:2293:4: ( ( ruleQN ) )
                    // InternalUddl.g:2294:5: ( ruleQN )
                    {
                    // InternalUddl.g:2294:5: ( ruleQN )
                    // InternalUddl.g:2295:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalConversionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLogicalConversionAccess().getSourceLogicalAssociationCrossReference_0_4_0());
                    					
                    pushFollow(FOLLOW_40);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getLogicalConversionAccess().getHyphenMinusLeftParenthesisRightParenthesisGreaterThanSignKeyword_0_5());
                    			
                    // InternalUddl.g:2313:4: ( ( ruleQN ) )
                    // InternalUddl.g:2314:5: ( ruleQN )
                    {
                    // InternalUddl.g:2314:5: ( ruleQN )
                    // InternalUddl.g:2315:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalConversionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLogicalConversionAccess().getDestinationLogicalAssociationCrossReference_0_6_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getLogicalConversionAccess().getRightCurlyBracketSemicolonKeyword_0_7());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUddl.g:2335:3: this_LogicalAffineConversion_8= ruleLogicalAffineConversion
                    {

                    			newCompositeNode(grammarAccess.getLogicalConversionAccess().getLogicalAffineConversionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalAffineConversion_8=ruleLogicalAffineConversion();

                    state._fsp--;


                    			current = this_LogicalAffineConversion_8;
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
    // $ANTLR end "ruleLogicalConversion"


    // $ANTLR start "entryRuleLogicalAffineConversion"
    // InternalUddl.g:2347:1: entryRuleLogicalAffineConversion returns [EObject current=null] : iv_ruleLogicalAffineConversion= ruleLogicalAffineConversion EOF ;
    public final EObject entryRuleLogicalAffineConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAffineConversion = null;


        try {
            // InternalUddl.g:2347:64: (iv_ruleLogicalAffineConversion= ruleLogicalAffineConversion EOF )
            // InternalUddl.g:2348:2: iv_ruleLogicalAffineConversion= ruleLogicalAffineConversion EOF
            {
             newCompositeNode(grammarAccess.getLogicalAffineConversionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalAffineConversion=ruleLogicalAffineConversion();

            state._fsp--;

             current =iv_ruleLogicalAffineConversion; 
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
    // $ANTLR end "entryRuleLogicalAffineConversion"


    // $ANTLR start "ruleLogicalAffineConversion"
    // InternalUddl.g:2354:1: ruleLogicalAffineConversion returns [EObject current=null] : (otherlv_0= 'aconv' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' otherlv_6= 'm:' ( (lv_conversionFactor_7_0= RULE_FLOAT ) ) otherlv_8= 'b:' ( (lv_offset_9_0= RULE_FLOAT ) ) otherlv_10= ')->' ( ( ruleQN ) ) otherlv_12= '};' ) ;
    public final EObject ruleLogicalAffineConversion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_conversionFactor_7_0=null;
        Token otherlv_8=null;
        Token lv_offset_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalUddl.g:2360:2: ( (otherlv_0= 'aconv' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' otherlv_6= 'm:' ( (lv_conversionFactor_7_0= RULE_FLOAT ) ) otherlv_8= 'b:' ( (lv_offset_9_0= RULE_FLOAT ) ) otherlv_10= ')->' ( ( ruleQN ) ) otherlv_12= '};' ) )
            // InternalUddl.g:2361:2: (otherlv_0= 'aconv' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' otherlv_6= 'm:' ( (lv_conversionFactor_7_0= RULE_FLOAT ) ) otherlv_8= 'b:' ( (lv_offset_9_0= RULE_FLOAT ) ) otherlv_10= ')->' ( ( ruleQN ) ) otherlv_12= '};' )
            {
            // InternalUddl.g:2361:2: (otherlv_0= 'aconv' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' otherlv_6= 'm:' ( (lv_conversionFactor_7_0= RULE_FLOAT ) ) otherlv_8= 'b:' ( (lv_offset_9_0= RULE_FLOAT ) ) otherlv_10= ')->' ( ( ruleQN ) ) otherlv_12= '};' )
            // InternalUddl.g:2362:3: otherlv_0= 'aconv' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' otherlv_6= 'm:' ( (lv_conversionFactor_7_0= RULE_FLOAT ) ) otherlv_8= 'b:' ( (lv_offset_9_0= RULE_FLOAT ) ) otherlv_10= ')->' ( ( ruleQN ) ) otherlv_12= '};'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalAffineConversionAccess().getAconvKeyword_0());
            		
            // InternalUddl.g:2366:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:2367:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:2367:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:2368:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalAffineConversionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalAffineConversionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:2384:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_STRING) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalUddl.g:2385:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:2385:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:2386:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalAffineConversionAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalAffineConversionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalAffineConversionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUddl.g:2406:3: ( ( ruleQN ) )
            // InternalUddl.g:2407:4: ( ruleQN )
            {
            // InternalUddl.g:2407:4: ( ruleQN )
            // InternalUddl.g:2408:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalAffineConversionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalAffineConversionAccess().getSourceLogicalAssociationCrossReference_4_0());
            				
            pushFollow(FOLLOW_41);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,45,FOLLOW_42); 

            			newLeafNode(otherlv_5, grammarAccess.getLogicalAffineConversionAccess().getHyphenMinusLeftParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,46,FOLLOW_43); 

            			newLeafNode(otherlv_6, grammarAccess.getLogicalAffineConversionAccess().getMKeyword_6());
            		
            // InternalUddl.g:2430:3: ( (lv_conversionFactor_7_0= RULE_FLOAT ) )
            // InternalUddl.g:2431:4: (lv_conversionFactor_7_0= RULE_FLOAT )
            {
            // InternalUddl.g:2431:4: (lv_conversionFactor_7_0= RULE_FLOAT )
            // InternalUddl.g:2432:5: lv_conversionFactor_7_0= RULE_FLOAT
            {
            lv_conversionFactor_7_0=(Token)match(input,RULE_FLOAT,FOLLOW_44); 

            					newLeafNode(lv_conversionFactor_7_0, grammarAccess.getLogicalAffineConversionAccess().getConversionFactorFLOATTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalAffineConversionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"conversionFactor",
            						lv_conversionFactor_7_0,
            						"com.epistimis.uddl.Uddl.FLOAT");
            				

            }


            }

            otherlv_8=(Token)match(input,47,FOLLOW_43); 

            			newLeafNode(otherlv_8, grammarAccess.getLogicalAffineConversionAccess().getBKeyword_8());
            		
            // InternalUddl.g:2452:3: ( (lv_offset_9_0= RULE_FLOAT ) )
            // InternalUddl.g:2453:4: (lv_offset_9_0= RULE_FLOAT )
            {
            // InternalUddl.g:2453:4: (lv_offset_9_0= RULE_FLOAT )
            // InternalUddl.g:2454:5: lv_offset_9_0= RULE_FLOAT
            {
            lv_offset_9_0=(Token)match(input,RULE_FLOAT,FOLLOW_45); 

            					newLeafNode(lv_offset_9_0, grammarAccess.getLogicalAffineConversionAccess().getOffsetFLOATTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalAffineConversionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"offset",
            						lv_offset_9_0,
            						"com.epistimis.uddl.Uddl.FLOAT");
            				

            }


            }

            otherlv_10=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getLogicalAffineConversionAccess().getRightParenthesisHyphenMinusGreaterThanSignKeyword_10());
            		
            // InternalUddl.g:2474:3: ( ( ruleQN ) )
            // InternalUddl.g:2475:4: ( ruleQN )
            {
            // InternalUddl.g:2475:4: ( ruleQN )
            // InternalUddl.g:2476:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalAffineConversionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalAffineConversionAccess().getDestinationLogicalAssociationCrossReference_11_0());
            				
            pushFollow(FOLLOW_19);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getLogicalAffineConversionAccess().getRightCurlyBracketSemicolonKeyword_12());
            		

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
    // $ANTLR end "ruleLogicalAffineConversion"


    // $ANTLR start "entryRuleLogicalValueType"
    // InternalUddl.g:2498:1: entryRuleLogicalValueType returns [EObject current=null] : iv_ruleLogicalValueType= ruleLogicalValueType EOF ;
    public final EObject entryRuleLogicalValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalValueType = null;


        try {
            // InternalUddl.g:2498:57: (iv_ruleLogicalValueType= ruleLogicalValueType EOF )
            // InternalUddl.g:2499:2: iv_ruleLogicalValueType= ruleLogicalValueType EOF
            {
             newCompositeNode(grammarAccess.getLogicalValueTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalValueType=ruleLogicalValueType();

            state._fsp--;

             current =iv_ruleLogicalValueType; 
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
    // $ANTLR end "entryRuleLogicalValueType"


    // $ANTLR start "ruleLogicalValueType"
    // InternalUddl.g:2505:1: ruleLogicalValueType returns [EObject current=null] : (this_LogicalBoolean_0= ruleLogicalBoolean | this_LogicalNumeric_1= ruleLogicalNumeric | this_LogicalCharacter_2= ruleLogicalCharacter | this_LogicalString_3= ruleLogicalString | this_LogicalEnumeratedBase_4= ruleLogicalEnumeratedBase ) ;
    public final EObject ruleLogicalValueType() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalBoolean_0 = null;

        EObject this_LogicalNumeric_1 = null;

        EObject this_LogicalCharacter_2 = null;

        EObject this_LogicalString_3 = null;

        EObject this_LogicalEnumeratedBase_4 = null;



        	enterRule();

        try {
            // InternalUddl.g:2511:2: ( (this_LogicalBoolean_0= ruleLogicalBoolean | this_LogicalNumeric_1= ruleLogicalNumeric | this_LogicalCharacter_2= ruleLogicalCharacter | this_LogicalString_3= ruleLogicalString | this_LogicalEnumeratedBase_4= ruleLogicalEnumeratedBase ) )
            // InternalUddl.g:2512:2: (this_LogicalBoolean_0= ruleLogicalBoolean | this_LogicalNumeric_1= ruleLogicalNumeric | this_LogicalCharacter_2= ruleLogicalCharacter | this_LogicalString_3= ruleLogicalString | this_LogicalEnumeratedBase_4= ruleLogicalEnumeratedBase )
            {
            // InternalUddl.g:2512:2: (this_LogicalBoolean_0= ruleLogicalBoolean | this_LogicalNumeric_1= ruleLogicalNumeric | this_LogicalCharacter_2= ruleLogicalCharacter | this_LogicalString_3= ruleLogicalString | this_LogicalEnumeratedBase_4= ruleLogicalEnumeratedBase )
            int alt52=5;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt52=1;
                }
                break;
            case 52:
            case 53:
            case 54:
            case 55:
                {
                alt52=2;
                }
                break;
            case 50:
                {
                alt52=3;
                }
                break;
            case 49:
                {
                alt52=4;
                }
                break;
            case RULE_ID:
            case 56:
            case 59:
                {
                alt52=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalUddl.g:2513:3: this_LogicalBoolean_0= ruleLogicalBoolean
                    {

                    			newCompositeNode(grammarAccess.getLogicalValueTypeAccess().getLogicalBooleanParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalBoolean_0=ruleLogicalBoolean();

                    state._fsp--;


                    			current = this_LogicalBoolean_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:2522:3: this_LogicalNumeric_1= ruleLogicalNumeric
                    {

                    			newCompositeNode(grammarAccess.getLogicalValueTypeAccess().getLogicalNumericParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalNumeric_1=ruleLogicalNumeric();

                    state._fsp--;


                    			current = this_LogicalNumeric_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUddl.g:2531:3: this_LogicalCharacter_2= ruleLogicalCharacter
                    {

                    			newCompositeNode(grammarAccess.getLogicalValueTypeAccess().getLogicalCharacterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalCharacter_2=ruleLogicalCharacter();

                    state._fsp--;


                    			current = this_LogicalCharacter_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUddl.g:2540:3: this_LogicalString_3= ruleLogicalString
                    {

                    			newCompositeNode(grammarAccess.getLogicalValueTypeAccess().getLogicalStringParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalString_3=ruleLogicalString();

                    state._fsp--;


                    			current = this_LogicalString_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalUddl.g:2549:3: this_LogicalEnumeratedBase_4= ruleLogicalEnumeratedBase
                    {

                    			newCompositeNode(grammarAccess.getLogicalValueTypeAccess().getLogicalEnumeratedBaseParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalEnumeratedBase_4=ruleLogicalEnumeratedBase();

                    state._fsp--;


                    			current = this_LogicalEnumeratedBase_4;
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
    // $ANTLR end "ruleLogicalValueType"


    // $ANTLR start "entryRuleLogicalString"
    // InternalUddl.g:2561:1: entryRuleLogicalString returns [EObject current=null] : iv_ruleLogicalString= ruleLogicalString EOF ;
    public final EObject entryRuleLogicalString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalString = null;


        try {
            // InternalUddl.g:2561:54: (iv_ruleLogicalString= ruleLogicalString EOF )
            // InternalUddl.g:2562:2: iv_ruleLogicalString= ruleLogicalString EOF
            {
             newCompositeNode(grammarAccess.getLogicalStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalString=ruleLogicalString();

            state._fsp--;

             current =iv_ruleLogicalString; 
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
    // $ANTLR end "entryRuleLogicalString"


    // $ANTLR start "ruleLogicalString"
    // InternalUddl.g:2568:1: ruleLogicalString returns [EObject current=null] : (otherlv_0= 'str' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleLogicalString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUddl.g:2574:2: ( (otherlv_0= 'str' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalUddl.g:2575:2: (otherlv_0= 'str' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalUddl.g:2575:2: (otherlv_0= 'str' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalUddl.g:2576:3: otherlv_0= 'str' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalStringAccess().getStrKeyword_0());
            		
            // InternalUddl.g:2580:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:2581:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:2581:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:2582:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalStringAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalStringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:2598:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_STRING) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalUddl.g:2599:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:2599:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:2600:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalStringAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalStringRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalStringAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleLogicalString"


    // $ANTLR start "entryRuleLogicalCharacter"
    // InternalUddl.g:2624:1: entryRuleLogicalCharacter returns [EObject current=null] : iv_ruleLogicalCharacter= ruleLogicalCharacter EOF ;
    public final EObject entryRuleLogicalCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalCharacter = null;


        try {
            // InternalUddl.g:2624:57: (iv_ruleLogicalCharacter= ruleLogicalCharacter EOF )
            // InternalUddl.g:2625:2: iv_ruleLogicalCharacter= ruleLogicalCharacter EOF
            {
             newCompositeNode(grammarAccess.getLogicalCharacterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalCharacter=ruleLogicalCharacter();

            state._fsp--;

             current =iv_ruleLogicalCharacter; 
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
    // $ANTLR end "entryRuleLogicalCharacter"


    // $ANTLR start "ruleLogicalCharacter"
    // InternalUddl.g:2631:1: ruleLogicalCharacter returns [EObject current=null] : (otherlv_0= 'ch' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleLogicalCharacter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUddl.g:2637:2: ( (otherlv_0= 'ch' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalUddl.g:2638:2: (otherlv_0= 'ch' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalUddl.g:2638:2: (otherlv_0= 'ch' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalUddl.g:2639:3: otherlv_0= 'ch' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalCharacterAccess().getChKeyword_0());
            		
            // InternalUddl.g:2643:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:2644:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:2644:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:2645:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalCharacterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalCharacterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:2661:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_STRING) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalUddl.g:2662:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:2662:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:2663:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalCharacterAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalCharacterRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalCharacterAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleLogicalCharacter"


    // $ANTLR start "entryRuleLogicalBoolean"
    // InternalUddl.g:2687:1: entryRuleLogicalBoolean returns [EObject current=null] : iv_ruleLogicalBoolean= ruleLogicalBoolean EOF ;
    public final EObject entryRuleLogicalBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalBoolean = null;


        try {
            // InternalUddl.g:2687:55: (iv_ruleLogicalBoolean= ruleLogicalBoolean EOF )
            // InternalUddl.g:2688:2: iv_ruleLogicalBoolean= ruleLogicalBoolean EOF
            {
             newCompositeNode(grammarAccess.getLogicalBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalBoolean=ruleLogicalBoolean();

            state._fsp--;

             current =iv_ruleLogicalBoolean; 
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
    // $ANTLR end "entryRuleLogicalBoolean"


    // $ANTLR start "ruleLogicalBoolean"
    // InternalUddl.g:2694:1: ruleLogicalBoolean returns [EObject current=null] : (otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleLogicalBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUddl.g:2700:2: ( (otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalUddl.g:2701:2: (otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalUddl.g:2701:2: (otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalUddl.g:2702:3: otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalBooleanAccess().getBoolKeyword_0());
            		
            // InternalUddl.g:2706:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:2707:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:2707:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:2708:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalBooleanAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalBooleanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:2724:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_STRING) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalUddl.g:2725:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:2725:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:2726:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalBooleanAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalBooleanRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalBooleanAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleLogicalBoolean"


    // $ANTLR start "entryRuleLogicalNumeric"
    // InternalUddl.g:2750:1: entryRuleLogicalNumeric returns [EObject current=null] : iv_ruleLogicalNumeric= ruleLogicalNumeric EOF ;
    public final EObject entryRuleLogicalNumeric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNumeric = null;


        try {
            // InternalUddl.g:2750:55: (iv_ruleLogicalNumeric= ruleLogicalNumeric EOF )
            // InternalUddl.g:2751:2: iv_ruleLogicalNumeric= ruleLogicalNumeric EOF
            {
             newCompositeNode(grammarAccess.getLogicalNumericRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalNumeric=ruleLogicalNumeric();

            state._fsp--;

             current =iv_ruleLogicalNumeric; 
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
    // $ANTLR end "entryRuleLogicalNumeric"


    // $ANTLR start "ruleLogicalNumeric"
    // InternalUddl.g:2757:1: ruleLogicalNumeric returns [EObject current=null] : (this_LogicalInteger_0= ruleLogicalInteger | this_LogicalNatural_1= ruleLogicalNatural | this_LogicalReal_2= ruleLogicalReal | this_LogicalNonNegativeReal_3= ruleLogicalNonNegativeReal ) ;
    public final EObject ruleLogicalNumeric() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalInteger_0 = null;

        EObject this_LogicalNatural_1 = null;

        EObject this_LogicalReal_2 = null;

        EObject this_LogicalNonNegativeReal_3 = null;



        	enterRule();

        try {
            // InternalUddl.g:2763:2: ( (this_LogicalInteger_0= ruleLogicalInteger | this_LogicalNatural_1= ruleLogicalNatural | this_LogicalReal_2= ruleLogicalReal | this_LogicalNonNegativeReal_3= ruleLogicalNonNegativeReal ) )
            // InternalUddl.g:2764:2: (this_LogicalInteger_0= ruleLogicalInteger | this_LogicalNatural_1= ruleLogicalNatural | this_LogicalReal_2= ruleLogicalReal | this_LogicalNonNegativeReal_3= ruleLogicalNonNegativeReal )
            {
            // InternalUddl.g:2764:2: (this_LogicalInteger_0= ruleLogicalInteger | this_LogicalNatural_1= ruleLogicalNatural | this_LogicalReal_2= ruleLogicalReal | this_LogicalNonNegativeReal_3= ruleLogicalNonNegativeReal )
            int alt56=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt56=1;
                }
                break;
            case 53:
                {
                alt56=2;
                }
                break;
            case 54:
                {
                alt56=3;
                }
                break;
            case 55:
                {
                alt56=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalUddl.g:2765:3: this_LogicalInteger_0= ruleLogicalInteger
                    {

                    			newCompositeNode(grammarAccess.getLogicalNumericAccess().getLogicalIntegerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalInteger_0=ruleLogicalInteger();

                    state._fsp--;


                    			current = this_LogicalInteger_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:2774:3: this_LogicalNatural_1= ruleLogicalNatural
                    {

                    			newCompositeNode(grammarAccess.getLogicalNumericAccess().getLogicalNaturalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalNatural_1=ruleLogicalNatural();

                    state._fsp--;


                    			current = this_LogicalNatural_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUddl.g:2783:3: this_LogicalReal_2= ruleLogicalReal
                    {

                    			newCompositeNode(grammarAccess.getLogicalNumericAccess().getLogicalRealParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalReal_2=ruleLogicalReal();

                    state._fsp--;


                    			current = this_LogicalReal_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUddl.g:2792:3: this_LogicalNonNegativeReal_3= ruleLogicalNonNegativeReal
                    {

                    			newCompositeNode(grammarAccess.getLogicalNumericAccess().getLogicalNonNegativeRealParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalNonNegativeReal_3=ruleLogicalNonNegativeReal();

                    state._fsp--;


                    			current = this_LogicalNonNegativeReal_3;
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
    // $ANTLR end "ruleLogicalNumeric"


    // $ANTLR start "entryRuleLogicalInteger"
    // InternalUddl.g:2804:1: entryRuleLogicalInteger returns [EObject current=null] : iv_ruleLogicalInteger= ruleLogicalInteger EOF ;
    public final EObject entryRuleLogicalInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalInteger = null;


        try {
            // InternalUddl.g:2804:55: (iv_ruleLogicalInteger= ruleLogicalInteger EOF )
            // InternalUddl.g:2805:2: iv_ruleLogicalInteger= ruleLogicalInteger EOF
            {
             newCompositeNode(grammarAccess.getLogicalIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalInteger=ruleLogicalInteger();

            state._fsp--;

             current =iv_ruleLogicalInteger; 
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
    // $ANTLR end "entryRuleLogicalInteger"


    // $ANTLR start "ruleLogicalInteger"
    // InternalUddl.g:2811:1: ruleLogicalInteger returns [EObject current=null] : (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleLogicalInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUddl.g:2817:2: ( (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalUddl.g:2818:2: (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalUddl.g:2818:2: (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalUddl.g:2819:3: otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalIntegerAccess().getIntKeyword_0());
            		
            // InternalUddl.g:2823:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:2824:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:2824:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:2825:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalIntegerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalIntegerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:2841:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_STRING) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalUddl.g:2842:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:2842:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:2843:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalIntegerAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalIntegerRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalIntegerAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleLogicalInteger"


    // $ANTLR start "entryRuleLogicalNatural"
    // InternalUddl.g:2867:1: entryRuleLogicalNatural returns [EObject current=null] : iv_ruleLogicalNatural= ruleLogicalNatural EOF ;
    public final EObject entryRuleLogicalNatural() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNatural = null;


        try {
            // InternalUddl.g:2867:55: (iv_ruleLogicalNatural= ruleLogicalNatural EOF )
            // InternalUddl.g:2868:2: iv_ruleLogicalNatural= ruleLogicalNatural EOF
            {
             newCompositeNode(grammarAccess.getLogicalNaturalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalNatural=ruleLogicalNatural();

            state._fsp--;

             current =iv_ruleLogicalNatural; 
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
    // $ANTLR end "entryRuleLogicalNatural"


    // $ANTLR start "ruleLogicalNatural"
    // InternalUddl.g:2874:1: ruleLogicalNatural returns [EObject current=null] : (otherlv_0= 'nat' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleLogicalNatural() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUddl.g:2880:2: ( (otherlv_0= 'nat' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalUddl.g:2881:2: (otherlv_0= 'nat' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalUddl.g:2881:2: (otherlv_0= 'nat' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalUddl.g:2882:3: otherlv_0= 'nat' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalNaturalAccess().getNatKeyword_0());
            		
            // InternalUddl.g:2886:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:2887:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:2887:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:2888:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalNaturalAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalNaturalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:2904:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_STRING) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalUddl.g:2905:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:2905:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:2906:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalNaturalAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalNaturalRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalNaturalAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleLogicalNatural"


    // $ANTLR start "entryRuleLogicalReal"
    // InternalUddl.g:2930:1: entryRuleLogicalReal returns [EObject current=null] : iv_ruleLogicalReal= ruleLogicalReal EOF ;
    public final EObject entryRuleLogicalReal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalReal = null;


        try {
            // InternalUddl.g:2930:52: (iv_ruleLogicalReal= ruleLogicalReal EOF )
            // InternalUddl.g:2931:2: iv_ruleLogicalReal= ruleLogicalReal EOF
            {
             newCompositeNode(grammarAccess.getLogicalRealRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalReal=ruleLogicalReal();

            state._fsp--;

             current =iv_ruleLogicalReal; 
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
    // $ANTLR end "entryRuleLogicalReal"


    // $ANTLR start "ruleLogicalReal"
    // InternalUddl.g:2937:1: ruleLogicalReal returns [EObject current=null] : (otherlv_0= 'real' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleLogicalReal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUddl.g:2943:2: ( (otherlv_0= 'real' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalUddl.g:2944:2: (otherlv_0= 'real' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalUddl.g:2944:2: (otherlv_0= 'real' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalUddl.g:2945:3: otherlv_0= 'real' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalRealAccess().getRealKeyword_0());
            		
            // InternalUddl.g:2949:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:2950:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:2950:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:2951:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalRealAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalRealRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:2967:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_STRING) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalUddl.g:2968:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:2968:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:2969:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalRealAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalRealRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalRealAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleLogicalReal"


    // $ANTLR start "entryRuleLogicalNonNegativeReal"
    // InternalUddl.g:2993:1: entryRuleLogicalNonNegativeReal returns [EObject current=null] : iv_ruleLogicalNonNegativeReal= ruleLogicalNonNegativeReal EOF ;
    public final EObject entryRuleLogicalNonNegativeReal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNonNegativeReal = null;


        try {
            // InternalUddl.g:2993:63: (iv_ruleLogicalNonNegativeReal= ruleLogicalNonNegativeReal EOF )
            // InternalUddl.g:2994:2: iv_ruleLogicalNonNegativeReal= ruleLogicalNonNegativeReal EOF
            {
             newCompositeNode(grammarAccess.getLogicalNonNegativeRealRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalNonNegativeReal=ruleLogicalNonNegativeReal();

            state._fsp--;

             current =iv_ruleLogicalNonNegativeReal; 
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
    // $ANTLR end "entryRuleLogicalNonNegativeReal"


    // $ANTLR start "ruleLogicalNonNegativeReal"
    // InternalUddl.g:3000:1: ruleLogicalNonNegativeReal returns [EObject current=null] : (otherlv_0= 'real+' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleLogicalNonNegativeReal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUddl.g:3006:2: ( (otherlv_0= 'real+' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalUddl.g:3007:2: (otherlv_0= 'real+' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalUddl.g:3007:2: (otherlv_0= 'real+' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalUddl.g:3008:3: otherlv_0= 'real+' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalNonNegativeRealAccess().getRealKeyword_0());
            		
            // InternalUddl.g:3012:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:3013:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:3013:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:3014:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalNonNegativeRealAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalNonNegativeRealRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:3030:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_STRING) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalUddl.g:3031:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:3031:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:3032:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalNonNegativeRealAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalNonNegativeRealRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalNonNegativeRealAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleLogicalNonNegativeReal"


    // $ANTLR start "entryRuleLogicalEnumerated"
    // InternalUddl.g:3056:1: entryRuleLogicalEnumerated returns [EObject current=null] : iv_ruleLogicalEnumerated= ruleLogicalEnumerated EOF ;
    public final EObject entryRuleLogicalEnumerated() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalEnumerated = null;


        try {
            // InternalUddl.g:3056:58: (iv_ruleLogicalEnumerated= ruleLogicalEnumerated EOF )
            // InternalUddl.g:3057:2: iv_ruleLogicalEnumerated= ruleLogicalEnumerated EOF
            {
             newCompositeNode(grammarAccess.getLogicalEnumeratedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalEnumerated=ruleLogicalEnumerated();

            state._fsp--;

             current =iv_ruleLogicalEnumerated; 
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
    // $ANTLR end "entryRuleLogicalEnumerated"


    // $ANTLR start "ruleLogicalEnumerated"
    // InternalUddl.g:3063:1: ruleLogicalEnumerated returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'stdRef:' ( (lv_standardReference_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_7= ',' )? ( ( ( (lv_label_8_1= ruleLogicalEnumerationLabel | lv_label_8_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_9= ',' )? )* otherlv_10= ']' otherlv_11= ';' ) ;
    public final EObject ruleLogicalEnumerated() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token lv_standardReference_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_label_6_1 = null;

        EObject lv_label_6_2 = null;

        EObject lv_label_8_1 = null;

        EObject lv_label_8_2 = null;



        	enterRule();

        try {
            // InternalUddl.g:3069:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'stdRef:' ( (lv_standardReference_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_7= ',' )? ( ( ( (lv_label_8_1= ruleLogicalEnumerationLabel | lv_label_8_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_9= ',' )? )* otherlv_10= ']' otherlv_11= ';' ) )
            // InternalUddl.g:3070:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'stdRef:' ( (lv_standardReference_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_7= ',' )? ( ( ( (lv_label_8_1= ruleLogicalEnumerationLabel | lv_label_8_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_9= ',' )? )* otherlv_10= ']' otherlv_11= ';' )
            {
            // InternalUddl.g:3070:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'stdRef:' ( (lv_standardReference_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_7= ',' )? ( ( ( (lv_label_8_1= ruleLogicalEnumerationLabel | lv_label_8_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_9= ',' )? )* otherlv_10= ']' otherlv_11= ';' )
            // InternalUddl.g:3071:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'stdRef:' ( (lv_standardReference_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_7= ',' )? ( ( ( (lv_label_8_1= ruleLogicalEnumerationLabel | lv_label_8_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_9= ',' )? )* otherlv_10= ']' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalEnumeratedAccess().getEnumKeyword_0());
            		
            // InternalUddl.g:3075:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:3076:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:3076:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:3077:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_46); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalEnumeratedAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalEnumeratedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:3093:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_STRING) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalUddl.g:3094:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:3094:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:3095:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_47); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalEnumeratedAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalEnumeratedRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:3111:3: (otherlv_3= 'stdRef:' ( (lv_standardReference_4_0= RULE_STRING ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==57) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalUddl.g:3112:4: otherlv_3= 'stdRef:' ( (lv_standardReference_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,57,FOLLOW_37); 

                    				newLeafNode(otherlv_3, grammarAccess.getLogicalEnumeratedAccess().getStdRefKeyword_3_0());
                    			
                    // InternalUddl.g:3116:4: ( (lv_standardReference_4_0= RULE_STRING ) )
                    // InternalUddl.g:3117:5: (lv_standardReference_4_0= RULE_STRING )
                    {
                    // InternalUddl.g:3117:5: (lv_standardReference_4_0= RULE_STRING )
                    // InternalUddl.g:3118:6: lv_standardReference_4_0= RULE_STRING
                    {
                    lv_standardReference_4_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_standardReference_4_0, grammarAccess.getLogicalEnumeratedAccess().getStandardReferenceSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalEnumeratedRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"standardReference",
                    							lv_standardReference_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,28,FOLLOW_48); 

            			newLeafNode(otherlv_5, grammarAccess.getLogicalEnumeratedAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalUddl.g:3139:3: ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) )
            // InternalUddl.g:3140:4: ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) )
            {
            // InternalUddl.g:3140:4: ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) )
            // InternalUddl.g:3141:5: (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet )
            {
            // InternalUddl.g:3141:5: (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID) ) {
                alt63=1;
            }
            else if ( (LA63_0==59) ) {
                int LA63_2 = input.LA(2);

                if ( (LA63_2==RULE_ID) ) {
                    int LA63_3 = input.LA(3);

                    if ( (LA63_3==RULE_STRING) ) {
                        int LA63_4 = input.LA(4);

                        if ( (LA63_4==60) ) {
                            alt63=1;
                        }
                        else if ( (LA63_4==28) ) {
                            alt63=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 63, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA63_3==28) ) {
                        alt63=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalUddl.g:3142:6: lv_label_6_1= ruleLogicalEnumerationLabel
                    {

                    						newCompositeNode(grammarAccess.getLogicalEnumeratedAccess().getLabelLogicalEnumerationLabelParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_label_6_1=ruleLogicalEnumerationLabel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogicalEnumeratedRule());
                    						}
                    						add(
                    							current,
                    							"label",
                    							lv_label_6_1,
                    							"com.epistimis.uddl.Uddl.LogicalEnumerationLabel");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalUddl.g:3158:6: lv_label_6_2= ruleLogicalEnumeratedSet
                    {

                    						newCompositeNode(grammarAccess.getLogicalEnumeratedAccess().getLabelLogicalEnumeratedSetParserRuleCall_5_0_1());
                    					
                    pushFollow(FOLLOW_49);
                    lv_label_6_2=ruleLogicalEnumeratedSet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogicalEnumeratedRule());
                    						}
                    						add(
                    							current,
                    							"label",
                    							lv_label_6_2,
                    							"com.epistimis.uddl.Uddl.LogicalEnumeratedSet");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalUddl.g:3176:3: (otherlv_7= ',' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==58) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalUddl.g:3177:4: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,58,FOLLOW_50); 

                    				newLeafNode(otherlv_7, grammarAccess.getLogicalEnumeratedAccess().getCommaKeyword_6());
                    			

                    }
                    break;

            }

            // InternalUddl.g:3182:3: ( ( ( (lv_label_8_1= ruleLogicalEnumerationLabel | lv_label_8_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_9= ',' )? )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==RULE_ID||LA67_0==59) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalUddl.g:3183:4: ( ( (lv_label_8_1= ruleLogicalEnumerationLabel | lv_label_8_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_9= ',' )?
            	    {
            	    // InternalUddl.g:3183:4: ( ( (lv_label_8_1= ruleLogicalEnumerationLabel | lv_label_8_2= ruleLogicalEnumeratedSet ) ) )
            	    // InternalUddl.g:3184:5: ( (lv_label_8_1= ruleLogicalEnumerationLabel | lv_label_8_2= ruleLogicalEnumeratedSet ) )
            	    {
            	    // InternalUddl.g:3184:5: ( (lv_label_8_1= ruleLogicalEnumerationLabel | lv_label_8_2= ruleLogicalEnumeratedSet ) )
            	    // InternalUddl.g:3185:6: (lv_label_8_1= ruleLogicalEnumerationLabel | lv_label_8_2= ruleLogicalEnumeratedSet )
            	    {
            	    // InternalUddl.g:3185:6: (lv_label_8_1= ruleLogicalEnumerationLabel | lv_label_8_2= ruleLogicalEnumeratedSet )
            	    int alt65=2;
            	    int LA65_0 = input.LA(1);

            	    if ( (LA65_0==RULE_ID) ) {
            	        alt65=1;
            	    }
            	    else if ( (LA65_0==59) ) {
            	        int LA65_2 = input.LA(2);

            	        if ( (LA65_2==RULE_ID) ) {
            	            int LA65_3 = input.LA(3);

            	            if ( (LA65_3==RULE_STRING) ) {
            	                int LA65_4 = input.LA(4);

            	                if ( (LA65_4==28) ) {
            	                    alt65=2;
            	                }
            	                else if ( (LA65_4==60) ) {
            	                    alt65=1;
            	                }
            	                else {
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("", 65, 4, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( (LA65_3==28) ) {
            	                alt65=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 65, 3, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 65, 2, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 65, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt65) {
            	        case 1 :
            	            // InternalUddl.g:3186:7: lv_label_8_1= ruleLogicalEnumerationLabel
            	            {

            	            							newCompositeNode(grammarAccess.getLogicalEnumeratedAccess().getLabelLogicalEnumerationLabelParserRuleCall_7_0_0_0());
            	            						
            	            pushFollow(FOLLOW_49);
            	            lv_label_8_1=ruleLogicalEnumerationLabel();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getLogicalEnumeratedRule());
            	            							}
            	            							add(
            	            								current,
            	            								"label",
            	            								lv_label_8_1,
            	            								"com.epistimis.uddl.Uddl.LogicalEnumerationLabel");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalUddl.g:3202:7: lv_label_8_2= ruleLogicalEnumeratedSet
            	            {

            	            							newCompositeNode(grammarAccess.getLogicalEnumeratedAccess().getLabelLogicalEnumeratedSetParserRuleCall_7_0_0_1());
            	            						
            	            pushFollow(FOLLOW_49);
            	            lv_label_8_2=ruleLogicalEnumeratedSet();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getLogicalEnumeratedRule());
            	            							}
            	            							add(
            	            								current,
            	            								"label",
            	            								lv_label_8_2,
            	            								"com.epistimis.uddl.Uddl.LogicalEnumeratedSet");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalUddl.g:3220:4: (otherlv_9= ',' )?
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==58) ) {
            	        alt66=1;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // InternalUddl.g:3221:5: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,58,FOLLOW_50); 

            	            					newLeafNode(otherlv_9, grammarAccess.getLogicalEnumeratedAccess().getCommaKeyword_7_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            otherlv_10=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getLogicalEnumeratedAccess().getRightSquareBracketKeyword_8());
            		
            otherlv_11=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getLogicalEnumeratedAccess().getSemicolonKeyword_9());
            		

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
    // $ANTLR end "ruleLogicalEnumerated"


    // $ANTLR start "entryRuleLogicalEnumeratedBase"
    // InternalUddl.g:3239:1: entryRuleLogicalEnumeratedBase returns [EObject current=null] : iv_ruleLogicalEnumeratedBase= ruleLogicalEnumeratedBase EOF ;
    public final EObject entryRuleLogicalEnumeratedBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalEnumeratedBase = null;


        try {
            // InternalUddl.g:3239:62: (iv_ruleLogicalEnumeratedBase= ruleLogicalEnumeratedBase EOF )
            // InternalUddl.g:3240:2: iv_ruleLogicalEnumeratedBase= ruleLogicalEnumeratedBase EOF
            {
             newCompositeNode(grammarAccess.getLogicalEnumeratedBaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalEnumeratedBase=ruleLogicalEnumeratedBase();

            state._fsp--;

             current =iv_ruleLogicalEnumeratedBase; 
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
    // $ANTLR end "entryRuleLogicalEnumeratedBase"


    // $ANTLR start "ruleLogicalEnumeratedBase"
    // InternalUddl.g:3246:1: ruleLogicalEnumeratedBase returns [EObject current=null] : (this_LogicalEnumeratedSet_0= ruleLogicalEnumeratedSet | this_LogicalEnumerationLabel_1= ruleLogicalEnumerationLabel | this_LogicalEnumerated_2= ruleLogicalEnumerated ) ;
    public final EObject ruleLogicalEnumeratedBase() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalEnumeratedSet_0 = null;

        EObject this_LogicalEnumerationLabel_1 = null;

        EObject this_LogicalEnumerated_2 = null;



        	enterRule();

        try {
            // InternalUddl.g:3252:2: ( (this_LogicalEnumeratedSet_0= ruleLogicalEnumeratedSet | this_LogicalEnumerationLabel_1= ruleLogicalEnumerationLabel | this_LogicalEnumerated_2= ruleLogicalEnumerated ) )
            // InternalUddl.g:3253:2: (this_LogicalEnumeratedSet_0= ruleLogicalEnumeratedSet | this_LogicalEnumerationLabel_1= ruleLogicalEnumerationLabel | this_LogicalEnumerated_2= ruleLogicalEnumerated )
            {
            // InternalUddl.g:3253:2: (this_LogicalEnumeratedSet_0= ruleLogicalEnumeratedSet | this_LogicalEnumerationLabel_1= ruleLogicalEnumerationLabel | this_LogicalEnumerated_2= ruleLogicalEnumerated )
            int alt68=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                int LA68_1 = input.LA(2);

                if ( (LA68_1==RULE_ID) ) {
                    int LA68_4 = input.LA(3);

                    if ( (LA68_4==RULE_STRING) ) {
                        int LA68_5 = input.LA(4);

                        if ( (LA68_5==60) ) {
                            alt68=2;
                        }
                        else if ( (LA68_5==28) ) {
                            alt68=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 68, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA68_4==28) ) {
                        alt68=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt68=2;
                }
                break;
            case 56:
                {
                alt68=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // InternalUddl.g:3254:3: this_LogicalEnumeratedSet_0= ruleLogicalEnumeratedSet
                    {

                    			newCompositeNode(grammarAccess.getLogicalEnumeratedBaseAccess().getLogicalEnumeratedSetParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalEnumeratedSet_0=ruleLogicalEnumeratedSet();

                    state._fsp--;


                    			current = this_LogicalEnumeratedSet_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:3263:3: this_LogicalEnumerationLabel_1= ruleLogicalEnumerationLabel
                    {

                    			newCompositeNode(grammarAccess.getLogicalEnumeratedBaseAccess().getLogicalEnumerationLabelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalEnumerationLabel_1=ruleLogicalEnumerationLabel();

                    state._fsp--;


                    			current = this_LogicalEnumerationLabel_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUddl.g:3272:3: this_LogicalEnumerated_2= ruleLogicalEnumerated
                    {

                    			newCompositeNode(grammarAccess.getLogicalEnumeratedBaseAccess().getLogicalEnumeratedParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalEnumerated_2=ruleLogicalEnumerated();

                    state._fsp--;


                    			current = this_LogicalEnumerated_2;
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
    // $ANTLR end "ruleLogicalEnumeratedBase"


    // $ANTLR start "entryRuleLogicalEnumeratedSet"
    // InternalUddl.g:3284:1: entryRuleLogicalEnumeratedSet returns [EObject current=null] : iv_ruleLogicalEnumeratedSet= ruleLogicalEnumeratedSet EOF ;
    public final EObject entryRuleLogicalEnumeratedSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalEnumeratedSet = null;


        try {
            // InternalUddl.g:3284:61: (iv_ruleLogicalEnumeratedSet= ruleLogicalEnumeratedSet EOF )
            // InternalUddl.g:3285:2: iv_ruleLogicalEnumeratedSet= ruleLogicalEnumeratedSet EOF
            {
             newCompositeNode(grammarAccess.getLogicalEnumeratedSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalEnumeratedSet=ruleLogicalEnumeratedSet();

            state._fsp--;

             current =iv_ruleLogicalEnumeratedSet; 
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
    // $ANTLR end "entryRuleLogicalEnumeratedSet"


    // $ANTLR start "ruleLogicalEnumeratedSet"
    // InternalUddl.g:3291:1: ruleLogicalEnumeratedSet returns [EObject current=null] : (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '[' ( ( (lv_label_4_1= ruleLogicalEnumerationLabel | lv_label_4_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_5= ',' )? ( ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_7= ',' )? )* otherlv_8= ']' otherlv_9= ')' ) ;
    public final EObject ruleLogicalEnumeratedSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_label_4_1 = null;

        EObject lv_label_4_2 = null;

        EObject lv_label_6_1 = null;

        EObject lv_label_6_2 = null;



        	enterRule();

        try {
            // InternalUddl.g:3297:2: ( (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '[' ( ( (lv_label_4_1= ruleLogicalEnumerationLabel | lv_label_4_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_5= ',' )? ( ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_7= ',' )? )* otherlv_8= ']' otherlv_9= ')' ) )
            // InternalUddl.g:3298:2: (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '[' ( ( (lv_label_4_1= ruleLogicalEnumerationLabel | lv_label_4_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_5= ',' )? ( ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_7= ',' )? )* otherlv_8= ']' otherlv_9= ')' )
            {
            // InternalUddl.g:3298:2: (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '[' ( ( (lv_label_4_1= ruleLogicalEnumerationLabel | lv_label_4_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_5= ',' )? ( ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_7= ',' )? )* otherlv_8= ']' otherlv_9= ')' )
            // InternalUddl.g:3299:3: otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '[' ( ( (lv_label_4_1= ruleLogicalEnumerationLabel | lv_label_4_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_5= ',' )? ( ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_7= ',' )? )* otherlv_8= ']' otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalEnumeratedSetAccess().getLeftParenthesisKeyword_0());
            		
            // InternalUddl.g:3303:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:3304:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:3304:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:3305:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_51); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalEnumeratedSetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalEnumeratedSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:3321:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_STRING) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalUddl.g:3322:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:3322:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:3323:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalEnumeratedSetAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalEnumeratedSetRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,28,FOLLOW_48); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalEnumeratedSetAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalUddl.g:3343:3: ( ( (lv_label_4_1= ruleLogicalEnumerationLabel | lv_label_4_2= ruleLogicalEnumeratedSet ) ) )
            // InternalUddl.g:3344:4: ( (lv_label_4_1= ruleLogicalEnumerationLabel | lv_label_4_2= ruleLogicalEnumeratedSet ) )
            {
            // InternalUddl.g:3344:4: ( (lv_label_4_1= ruleLogicalEnumerationLabel | lv_label_4_2= ruleLogicalEnumeratedSet ) )
            // InternalUddl.g:3345:5: (lv_label_4_1= ruleLogicalEnumerationLabel | lv_label_4_2= ruleLogicalEnumeratedSet )
            {
            // InternalUddl.g:3345:5: (lv_label_4_1= ruleLogicalEnumerationLabel | lv_label_4_2= ruleLogicalEnumeratedSet )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_ID) ) {
                alt70=1;
            }
            else if ( (LA70_0==59) ) {
                int LA70_2 = input.LA(2);

                if ( (LA70_2==RULE_ID) ) {
                    int LA70_3 = input.LA(3);

                    if ( (LA70_3==RULE_STRING) ) {
                        int LA70_4 = input.LA(4);

                        if ( (LA70_4==28) ) {
                            alt70=2;
                        }
                        else if ( (LA70_4==60) ) {
                            alt70=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 70, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA70_3==28) ) {
                        alt70=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalUddl.g:3346:6: lv_label_4_1= ruleLogicalEnumerationLabel
                    {

                    						newCompositeNode(grammarAccess.getLogicalEnumeratedSetAccess().getLabelLogicalEnumerationLabelParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_label_4_1=ruleLogicalEnumerationLabel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogicalEnumeratedSetRule());
                    						}
                    						add(
                    							current,
                    							"label",
                    							lv_label_4_1,
                    							"com.epistimis.uddl.Uddl.LogicalEnumerationLabel");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalUddl.g:3362:6: lv_label_4_2= ruleLogicalEnumeratedSet
                    {

                    						newCompositeNode(grammarAccess.getLogicalEnumeratedSetAccess().getLabelLogicalEnumeratedSetParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_49);
                    lv_label_4_2=ruleLogicalEnumeratedSet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogicalEnumeratedSetRule());
                    						}
                    						add(
                    							current,
                    							"label",
                    							lv_label_4_2,
                    							"com.epistimis.uddl.Uddl.LogicalEnumeratedSet");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalUddl.g:3380:3: (otherlv_5= ',' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==58) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalUddl.g:3381:4: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,58,FOLLOW_50); 

                    				newLeafNode(otherlv_5, grammarAccess.getLogicalEnumeratedSetAccess().getCommaKeyword_5());
                    			

                    }
                    break;

            }

            // InternalUddl.g:3386:3: ( ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_7= ',' )? )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==RULE_ID||LA74_0==59) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalUddl.g:3387:4: ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_7= ',' )?
            	    {
            	    // InternalUddl.g:3387:4: ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) )
            	    // InternalUddl.g:3388:5: ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) )
            	    {
            	    // InternalUddl.g:3388:5: ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) )
            	    // InternalUddl.g:3389:6: (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet )
            	    {
            	    // InternalUddl.g:3389:6: (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet )
            	    int alt72=2;
            	    int LA72_0 = input.LA(1);

            	    if ( (LA72_0==RULE_ID) ) {
            	        alt72=1;
            	    }
            	    else if ( (LA72_0==59) ) {
            	        int LA72_2 = input.LA(2);

            	        if ( (LA72_2==RULE_ID) ) {
            	            int LA72_3 = input.LA(3);

            	            if ( (LA72_3==RULE_STRING) ) {
            	                int LA72_4 = input.LA(4);

            	                if ( (LA72_4==60) ) {
            	                    alt72=1;
            	                }
            	                else if ( (LA72_4==28) ) {
            	                    alt72=2;
            	                }
            	                else {
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("", 72, 4, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( (LA72_3==28) ) {
            	                alt72=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 72, 3, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 72, 2, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 72, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt72) {
            	        case 1 :
            	            // InternalUddl.g:3390:7: lv_label_6_1= ruleLogicalEnumerationLabel
            	            {

            	            							newCompositeNode(grammarAccess.getLogicalEnumeratedSetAccess().getLabelLogicalEnumerationLabelParserRuleCall_6_0_0_0());
            	            						
            	            pushFollow(FOLLOW_49);
            	            lv_label_6_1=ruleLogicalEnumerationLabel();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getLogicalEnumeratedSetRule());
            	            							}
            	            							add(
            	            								current,
            	            								"label",
            	            								lv_label_6_1,
            	            								"com.epistimis.uddl.Uddl.LogicalEnumerationLabel");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalUddl.g:3406:7: lv_label_6_2= ruleLogicalEnumeratedSet
            	            {

            	            							newCompositeNode(grammarAccess.getLogicalEnumeratedSetAccess().getLabelLogicalEnumeratedSetParserRuleCall_6_0_0_1());
            	            						
            	            pushFollow(FOLLOW_49);
            	            lv_label_6_2=ruleLogicalEnumeratedSet();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getLogicalEnumeratedSetRule());
            	            							}
            	            							add(
            	            								current,
            	            								"label",
            	            								lv_label_6_2,
            	            								"com.epistimis.uddl.Uddl.LogicalEnumeratedSet");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalUddl.g:3424:4: (otherlv_7= ',' )?
            	    int alt73=2;
            	    int LA73_0 = input.LA(1);

            	    if ( (LA73_0==58) ) {
            	        alt73=1;
            	    }
            	    switch (alt73) {
            	        case 1 :
            	            // InternalUddl.g:3425:5: otherlv_7= ','
            	            {
            	            otherlv_7=(Token)match(input,58,FOLLOW_50); 

            	            					newLeafNode(otherlv_7, grammarAccess.getLogicalEnumeratedSetAccess().getCommaKeyword_6_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            otherlv_8=(Token)match(input,29,FOLLOW_52); 

            			newLeafNode(otherlv_8, grammarAccess.getLogicalEnumeratedSetAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,60,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLogicalEnumeratedSetAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleLogicalEnumeratedSet"


    // $ANTLR start "entryRuleLogicalEnumerationLabel"
    // InternalUddl.g:3443:1: entryRuleLogicalEnumerationLabel returns [EObject current=null] : iv_ruleLogicalEnumerationLabel= ruleLogicalEnumerationLabel EOF ;
    public final EObject entryRuleLogicalEnumerationLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalEnumerationLabel = null;


        try {
            // InternalUddl.g:3443:64: (iv_ruleLogicalEnumerationLabel= ruleLogicalEnumerationLabel EOF )
            // InternalUddl.g:3444:2: iv_ruleLogicalEnumerationLabel= ruleLogicalEnumerationLabel EOF
            {
             newCompositeNode(grammarAccess.getLogicalEnumerationLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalEnumerationLabel=ruleLogicalEnumerationLabel();

            state._fsp--;

             current =iv_ruleLogicalEnumerationLabel; 
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
    // $ANTLR end "entryRuleLogicalEnumerationLabel"


    // $ANTLR start "ruleLogicalEnumerationLabel"
    // InternalUddl.g:3450:1: ruleLogicalEnumerationLabel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' ) ) ;
    public final EObject ruleLogicalEnumerationLabel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalUddl.g:3456:2: ( ( ( (lv_name_0_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' ) ) )
            // InternalUddl.g:3457:2: ( ( (lv_name_0_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            {
            // InternalUddl.g:3457:2: ( ( (lv_name_0_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ID) ) {
                alt75=1;
            }
            else if ( (LA75_0==59) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalUddl.g:3458:3: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // InternalUddl.g:3458:3: ( (lv_name_0_0= RULE_ID ) )
                    // InternalUddl.g:3459:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalUddl.g:3459:4: (lv_name_0_0= RULE_ID )
                    // InternalUddl.g:3460:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getLogicalEnumerationLabelAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalEnumerationLabelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUddl.g:3477:3: (otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' )
                    {
                    // InternalUddl.g:3477:3: (otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' )
                    // InternalUddl.g:3478:4: otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,59,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getLogicalEnumerationLabelAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalUddl.g:3482:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalUddl.g:3483:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalUddl.g:3483:5: (lv_name_2_0= RULE_ID )
                    // InternalUddl.g:3484:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_37); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getLogicalEnumerationLabelAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalEnumerationLabelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalUddl.g:3500:4: ( (lv_description_3_0= RULE_STRING ) )
                    // InternalUddl.g:3501:5: (lv_description_3_0= RULE_STRING )
                    {
                    // InternalUddl.g:3501:5: (lv_description_3_0= RULE_STRING )
                    // InternalUddl.g:3502:6: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_52); 

                    						newLeafNode(lv_description_3_0, grammarAccess.getLogicalEnumerationLabelAccess().getDescriptionSTRINGTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalEnumerationLabelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,60,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getLogicalEnumerationLabelAccess().getRightParenthesisKeyword_1_3());
                    			

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
    // $ANTLR end "ruleLogicalEnumerationLabel"


    // $ANTLR start "entryRuleLogicalCoordinateSystem"
    // InternalUddl.g:3527:1: entryRuleLogicalCoordinateSystem returns [EObject current=null] : iv_ruleLogicalCoordinateSystem= ruleLogicalCoordinateSystem EOF ;
    public final EObject entryRuleLogicalCoordinateSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalCoordinateSystem = null;


        try {
            // InternalUddl.g:3527:64: (iv_ruleLogicalCoordinateSystem= ruleLogicalCoordinateSystem EOF )
            // InternalUddl.g:3528:2: iv_ruleLogicalCoordinateSystem= ruleLogicalCoordinateSystem EOF
            {
             newCompositeNode(grammarAccess.getLogicalCoordinateSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalCoordinateSystem=ruleLogicalCoordinateSystem();

            state._fsp--;

             current =iv_ruleLogicalCoordinateSystem; 
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
    // $ANTLR end "entryRuleLogicalCoordinateSystem"


    // $ANTLR start "ruleLogicalCoordinateSystem"
    // InternalUddl.g:3534:1: ruleLogicalCoordinateSystem returns [EObject current=null] : (otherlv_0= 'coord' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' (otherlv_4= 'axis:' ( (lv_axisRelationshipDescription_5_0= RULE_STRING ) ) )? (otherlv_6= 'angleEq:' ( (lv_angleEquation_7_0= RULE_STRING ) ) )? (otherlv_8= 'distanceEq:' ( (lv_distanceEquation_9_0= RULE_STRING ) ) )? otherlv_10= '[' ( ( ruleQN ) )+ otherlv_12= ']' otherlv_13= '};' ) ;
    public final EObject ruleLogicalCoordinateSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_axisRelationshipDescription_5_0=null;
        Token otherlv_6=null;
        Token lv_angleEquation_7_0=null;
        Token otherlv_8=null;
        Token lv_distanceEquation_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalUddl.g:3540:2: ( (otherlv_0= 'coord' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' (otherlv_4= 'axis:' ( (lv_axisRelationshipDescription_5_0= RULE_STRING ) ) )? (otherlv_6= 'angleEq:' ( (lv_angleEquation_7_0= RULE_STRING ) ) )? (otherlv_8= 'distanceEq:' ( (lv_distanceEquation_9_0= RULE_STRING ) ) )? otherlv_10= '[' ( ( ruleQN ) )+ otherlv_12= ']' otherlv_13= '};' ) )
            // InternalUddl.g:3541:2: (otherlv_0= 'coord' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' (otherlv_4= 'axis:' ( (lv_axisRelationshipDescription_5_0= RULE_STRING ) ) )? (otherlv_6= 'angleEq:' ( (lv_angleEquation_7_0= RULE_STRING ) ) )? (otherlv_8= 'distanceEq:' ( (lv_distanceEquation_9_0= RULE_STRING ) ) )? otherlv_10= '[' ( ( ruleQN ) )+ otherlv_12= ']' otherlv_13= '};' )
            {
            // InternalUddl.g:3541:2: (otherlv_0= 'coord' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' (otherlv_4= 'axis:' ( (lv_axisRelationshipDescription_5_0= RULE_STRING ) ) )? (otherlv_6= 'angleEq:' ( (lv_angleEquation_7_0= RULE_STRING ) ) )? (otherlv_8= 'distanceEq:' ( (lv_distanceEquation_9_0= RULE_STRING ) ) )? otherlv_10= '[' ( ( ruleQN ) )+ otherlv_12= ']' otherlv_13= '};' )
            // InternalUddl.g:3542:3: otherlv_0= 'coord' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' (otherlv_4= 'axis:' ( (lv_axisRelationshipDescription_5_0= RULE_STRING ) ) )? (otherlv_6= 'angleEq:' ( (lv_angleEquation_7_0= RULE_STRING ) ) )? (otherlv_8= 'distanceEq:' ( (lv_distanceEquation_9_0= RULE_STRING ) ) )? otherlv_10= '[' ( ( ruleQN ) )+ otherlv_12= ']' otherlv_13= '};'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalCoordinateSystemAccess().getCoordKeyword_0());
            		
            // InternalUddl.g:3546:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:3547:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:3547:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:3548:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalCoordinateSystemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalCoordinateSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:3564:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_STRING) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalUddl.g:3565:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:3565:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:3566:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalCoordinateSystemAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalCoordinateSystemRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_53); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalCoordinateSystemAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUddl.g:3586:3: (otherlv_4= 'axis:' ( (lv_axisRelationshipDescription_5_0= RULE_STRING ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==62) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalUddl.g:3587:4: otherlv_4= 'axis:' ( (lv_axisRelationshipDescription_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,62,FOLLOW_37); 

                    				newLeafNode(otherlv_4, grammarAccess.getLogicalCoordinateSystemAccess().getAxisKeyword_4_0());
                    			
                    // InternalUddl.g:3591:4: ( (lv_axisRelationshipDescription_5_0= RULE_STRING ) )
                    // InternalUddl.g:3592:5: (lv_axisRelationshipDescription_5_0= RULE_STRING )
                    {
                    // InternalUddl.g:3592:5: (lv_axisRelationshipDescription_5_0= RULE_STRING )
                    // InternalUddl.g:3593:6: lv_axisRelationshipDescription_5_0= RULE_STRING
                    {
                    lv_axisRelationshipDescription_5_0=(Token)match(input,RULE_STRING,FOLLOW_54); 

                    						newLeafNode(lv_axisRelationshipDescription_5_0, grammarAccess.getLogicalCoordinateSystemAccess().getAxisRelationshipDescriptionSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalCoordinateSystemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"axisRelationshipDescription",
                    							lv_axisRelationshipDescription_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUddl.g:3610:3: (otherlv_6= 'angleEq:' ( (lv_angleEquation_7_0= RULE_STRING ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==63) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalUddl.g:3611:4: otherlv_6= 'angleEq:' ( (lv_angleEquation_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,63,FOLLOW_37); 

                    				newLeafNode(otherlv_6, grammarAccess.getLogicalCoordinateSystemAccess().getAngleEqKeyword_5_0());
                    			
                    // InternalUddl.g:3615:4: ( (lv_angleEquation_7_0= RULE_STRING ) )
                    // InternalUddl.g:3616:5: (lv_angleEquation_7_0= RULE_STRING )
                    {
                    // InternalUddl.g:3616:5: (lv_angleEquation_7_0= RULE_STRING )
                    // InternalUddl.g:3617:6: lv_angleEquation_7_0= RULE_STRING
                    {
                    lv_angleEquation_7_0=(Token)match(input,RULE_STRING,FOLLOW_55); 

                    						newLeafNode(lv_angleEquation_7_0, grammarAccess.getLogicalCoordinateSystemAccess().getAngleEquationSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalCoordinateSystemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"angleEquation",
                    							lv_angleEquation_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUddl.g:3634:3: (otherlv_8= 'distanceEq:' ( (lv_distanceEquation_9_0= RULE_STRING ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==64) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalUddl.g:3635:4: otherlv_8= 'distanceEq:' ( (lv_distanceEquation_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,64,FOLLOW_37); 

                    				newLeafNode(otherlv_8, grammarAccess.getLogicalCoordinateSystemAccess().getDistanceEqKeyword_6_0());
                    			
                    // InternalUddl.g:3639:4: ( (lv_distanceEquation_9_0= RULE_STRING ) )
                    // InternalUddl.g:3640:5: (lv_distanceEquation_9_0= RULE_STRING )
                    {
                    // InternalUddl.g:3640:5: (lv_distanceEquation_9_0= RULE_STRING )
                    // InternalUddl.g:3641:6: lv_distanceEquation_9_0= RULE_STRING
                    {
                    lv_distanceEquation_9_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_distanceEquation_9_0, grammarAccess.getLogicalCoordinateSystemAccess().getDistanceEquationSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalCoordinateSystemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"distanceEquation",
                    							lv_distanceEquation_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getLogicalCoordinateSystemAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalUddl.g:3662:3: ( ( ruleQN ) )+
            int cnt80=0;
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==RULE_ID) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalUddl.g:3663:4: ( ruleQN )
            	    {
            	    // InternalUddl.g:3663:4: ( ruleQN )
            	    // InternalUddl.g:3664:5: ruleQN
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLogicalCoordinateSystemRule());
            	    					}
            	    				

            	    					newCompositeNode(grammarAccess.getLogicalCoordinateSystemAccess().getAxisLogicalCoordinateSystemAxisCrossReference_8_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    ruleQN();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt80 >= 1 ) break loop80;
                        EarlyExitException eee =
                            new EarlyExitException(80, input);
                        throw eee;
                }
                cnt80++;
            } while (true);

            otherlv_12=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_12, grammarAccess.getLogicalCoordinateSystemAccess().getRightSquareBracketKeyword_9());
            		
            otherlv_13=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getLogicalCoordinateSystemAccess().getRightCurlyBracketSemicolonKeyword_10());
            		

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
    // $ANTLR end "ruleLogicalCoordinateSystem"


    // $ANTLR start "entryRuleLogicalCoordinateSystemAxis"
    // InternalUddl.g:3690:1: entryRuleLogicalCoordinateSystemAxis returns [EObject current=null] : iv_ruleLogicalCoordinateSystemAxis= ruleLogicalCoordinateSystemAxis EOF ;
    public final EObject entryRuleLogicalCoordinateSystemAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalCoordinateSystemAxis = null;


        try {
            // InternalUddl.g:3690:68: (iv_ruleLogicalCoordinateSystemAxis= ruleLogicalCoordinateSystemAxis EOF )
            // InternalUddl.g:3691:2: iv_ruleLogicalCoordinateSystemAxis= ruleLogicalCoordinateSystemAxis EOF
            {
             newCompositeNode(grammarAccess.getLogicalCoordinateSystemAxisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalCoordinateSystemAxis=ruleLogicalCoordinateSystemAxis();

            state._fsp--;

             current =iv_ruleLogicalCoordinateSystemAxis; 
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
    // $ANTLR end "entryRuleLogicalCoordinateSystemAxis"


    // $ANTLR start "ruleLogicalCoordinateSystemAxis"
    // InternalUddl.g:3697:1: ruleLogicalCoordinateSystemAxis returns [EObject current=null] : (otherlv_0= 'csa' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleLogicalCoordinateSystemAxis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUddl.g:3703:2: ( (otherlv_0= 'csa' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalUddl.g:3704:2: (otherlv_0= 'csa' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalUddl.g:3704:2: (otherlv_0= 'csa' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalUddl.g:3705:3: otherlv_0= 'csa' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalCoordinateSystemAxisAccess().getCsaKeyword_0());
            		
            // InternalUddl.g:3709:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:3710:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:3710:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:3711:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalCoordinateSystemAxisAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalCoordinateSystemAxisRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:3727:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_STRING) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalUddl.g:3728:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:3728:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:3729:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalCoordinateSystemAxisAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalCoordinateSystemAxisRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalCoordinateSystemAxisAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleLogicalCoordinateSystemAxis"


    // $ANTLR start "entryRuleLogicalAbstractMeasurementSystem"
    // InternalUddl.g:3753:1: entryRuleLogicalAbstractMeasurementSystem returns [EObject current=null] : iv_ruleLogicalAbstractMeasurementSystem= ruleLogicalAbstractMeasurementSystem EOF ;
    public final EObject entryRuleLogicalAbstractMeasurementSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAbstractMeasurementSystem = null;


        try {
            // InternalUddl.g:3753:73: (iv_ruleLogicalAbstractMeasurementSystem= ruleLogicalAbstractMeasurementSystem EOF )
            // InternalUddl.g:3754:2: iv_ruleLogicalAbstractMeasurementSystem= ruleLogicalAbstractMeasurementSystem EOF
            {
             newCompositeNode(grammarAccess.getLogicalAbstractMeasurementSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalAbstractMeasurementSystem=ruleLogicalAbstractMeasurementSystem();

            state._fsp--;

             current =iv_ruleLogicalAbstractMeasurementSystem; 
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
    // $ANTLR end "entryRuleLogicalAbstractMeasurementSystem"


    // $ANTLR start "ruleLogicalAbstractMeasurementSystem"
    // InternalUddl.g:3760:1: ruleLogicalAbstractMeasurementSystem returns [EObject current=null] : (this_LogicalStandardMeasurementSystem_0= ruleLogicalStandardMeasurementSystem | this_LogicalMeasurementSystem_1= ruleLogicalMeasurementSystem ) ;
    public final EObject ruleLogicalAbstractMeasurementSystem() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalStandardMeasurementSystem_0 = null;

        EObject this_LogicalMeasurementSystem_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:3766:2: ( (this_LogicalStandardMeasurementSystem_0= ruleLogicalStandardMeasurementSystem | this_LogicalMeasurementSystem_1= ruleLogicalMeasurementSystem ) )
            // InternalUddl.g:3767:2: (this_LogicalStandardMeasurementSystem_0= ruleLogicalStandardMeasurementSystem | this_LogicalMeasurementSystem_1= ruleLogicalMeasurementSystem )
            {
            // InternalUddl.g:3767:2: (this_LogicalStandardMeasurementSystem_0= ruleLogicalStandardMeasurementSystem | this_LogicalMeasurementSystem_1= ruleLogicalMeasurementSystem )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==66) ) {
                alt82=1;
            }
            else if ( (LA82_0==69) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalUddl.g:3768:3: this_LogicalStandardMeasurementSystem_0= ruleLogicalStandardMeasurementSystem
                    {

                    			newCompositeNode(grammarAccess.getLogicalAbstractMeasurementSystemAccess().getLogicalStandardMeasurementSystemParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalStandardMeasurementSystem_0=ruleLogicalStandardMeasurementSystem();

                    state._fsp--;


                    			current = this_LogicalStandardMeasurementSystem_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:3777:3: this_LogicalMeasurementSystem_1= ruleLogicalMeasurementSystem
                    {

                    			newCompositeNode(grammarAccess.getLogicalAbstractMeasurementSystemAccess().getLogicalMeasurementSystemParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalMeasurementSystem_1=ruleLogicalMeasurementSystem();

                    state._fsp--;


                    			current = this_LogicalMeasurementSystem_1;
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
    // $ANTLR end "ruleLogicalAbstractMeasurementSystem"


    // $ANTLR start "entryRuleLogicalStandardMeasurementSystem"
    // InternalUddl.g:3789:1: entryRuleLogicalStandardMeasurementSystem returns [EObject current=null] : iv_ruleLogicalStandardMeasurementSystem= ruleLogicalStandardMeasurementSystem EOF ;
    public final EObject entryRuleLogicalStandardMeasurementSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalStandardMeasurementSystem = null;


        try {
            // InternalUddl.g:3789:73: (iv_ruleLogicalStandardMeasurementSystem= ruleLogicalStandardMeasurementSystem EOF )
            // InternalUddl.g:3790:2: iv_ruleLogicalStandardMeasurementSystem= ruleLogicalStandardMeasurementSystem EOF
            {
             newCompositeNode(grammarAccess.getLogicalStandardMeasurementSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalStandardMeasurementSystem=ruleLogicalStandardMeasurementSystem();

            state._fsp--;

             current =iv_ruleLogicalStandardMeasurementSystem; 
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
    // $ANTLR end "entryRuleLogicalStandardMeasurementSystem"


    // $ANTLR start "ruleLogicalStandardMeasurementSystem"
    // InternalUddl.g:3796:1: ruleLogicalStandardMeasurementSystem returns [EObject current=null] : (otherlv_0= 'smsys' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'refStd:' ( (lv_referenceStandard_5_0= RULE_STRING ) ) otherlv_6= '};' ) ;
    public final EObject ruleLogicalStandardMeasurementSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_referenceStandard_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalUddl.g:3802:2: ( (otherlv_0= 'smsys' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'refStd:' ( (lv_referenceStandard_5_0= RULE_STRING ) ) otherlv_6= '};' ) )
            // InternalUddl.g:3803:2: (otherlv_0= 'smsys' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'refStd:' ( (lv_referenceStandard_5_0= RULE_STRING ) ) otherlv_6= '};' )
            {
            // InternalUddl.g:3803:2: (otherlv_0= 'smsys' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'refStd:' ( (lv_referenceStandard_5_0= RULE_STRING ) ) otherlv_6= '};' )
            // InternalUddl.g:3804:3: otherlv_0= 'smsys' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'refStd:' ( (lv_referenceStandard_5_0= RULE_STRING ) ) otherlv_6= '};'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalStandardMeasurementSystemAccess().getSmsysKeyword_0());
            		
            // InternalUddl.g:3808:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:3809:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:3809:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:3810:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalStandardMeasurementSystemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalStandardMeasurementSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:3826:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_STRING) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalUddl.g:3827:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:3827:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:3828:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalStandardMeasurementSystemAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalStandardMeasurementSystemRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_56); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalStandardMeasurementSystemAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,67,FOLLOW_37); 

            			newLeafNode(otherlv_4, grammarAccess.getLogicalStandardMeasurementSystemAccess().getRefStdKeyword_4());
            		
            // InternalUddl.g:3852:3: ( (lv_referenceStandard_5_0= RULE_STRING ) )
            // InternalUddl.g:3853:4: (lv_referenceStandard_5_0= RULE_STRING )
            {
            // InternalUddl.g:3853:4: (lv_referenceStandard_5_0= RULE_STRING )
            // InternalUddl.g:3854:5: lv_referenceStandard_5_0= RULE_STRING
            {
            lv_referenceStandard_5_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_referenceStandard_5_0, grammarAccess.getLogicalStandardMeasurementSystemAccess().getReferenceStandardSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalStandardMeasurementSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"referenceStandard",
            						lv_referenceStandard_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLogicalStandardMeasurementSystemAccess().getRightCurlyBracketSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleLogicalStandardMeasurementSystem"


    // $ANTLR start "entryRuleLogicalLandmark"
    // InternalUddl.g:3878:1: entryRuleLogicalLandmark returns [EObject current=null] : iv_ruleLogicalLandmark= ruleLogicalLandmark EOF ;
    public final EObject entryRuleLogicalLandmark() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalLandmark = null;


        try {
            // InternalUddl.g:3878:56: (iv_ruleLogicalLandmark= ruleLogicalLandmark EOF )
            // InternalUddl.g:3879:2: iv_ruleLogicalLandmark= ruleLogicalLandmark EOF
            {
             newCompositeNode(grammarAccess.getLogicalLandmarkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalLandmark=ruleLogicalLandmark();

            state._fsp--;

             current =iv_ruleLogicalLandmark; 
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
    // $ANTLR end "entryRuleLogicalLandmark"


    // $ANTLR start "ruleLogicalLandmark"
    // InternalUddl.g:3885:1: ruleLogicalLandmark returns [EObject current=null] : (otherlv_0= 'landmark' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleLogicalLandmark() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUddl.g:3891:2: ( (otherlv_0= 'landmark' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalUddl.g:3892:2: (otherlv_0= 'landmark' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalUddl.g:3892:2: (otherlv_0= 'landmark' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalUddl.g:3893:3: otherlv_0= 'landmark' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalLandmarkAccess().getLandmarkKeyword_0());
            		
            // InternalUddl.g:3897:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:3898:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:3898:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:3899:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalLandmarkAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalLandmarkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:3915:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_STRING) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalUddl.g:3916:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:3916:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:3917:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalLandmarkAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalLandmarkRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalLandmarkAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleLogicalLandmark"


    // $ANTLR start "entryRuleLogicalMeasurementSystem"
    // InternalUddl.g:3941:1: entryRuleLogicalMeasurementSystem returns [EObject current=null] : iv_ruleLogicalMeasurementSystem= ruleLogicalMeasurementSystem EOF ;
    public final EObject entryRuleLogicalMeasurementSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalMeasurementSystem = null;


        try {
            // InternalUddl.g:3941:65: (iv_ruleLogicalMeasurementSystem= ruleLogicalMeasurementSystem EOF )
            // InternalUddl.g:3942:2: iv_ruleLogicalMeasurementSystem= ruleLogicalMeasurementSystem EOF
            {
             newCompositeNode(grammarAccess.getLogicalMeasurementSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalMeasurementSystem=ruleLogicalMeasurementSystem();

            state._fsp--;

             current =iv_ruleLogicalMeasurementSystem; 
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
    // $ANTLR end "entryRuleLogicalMeasurementSystem"


    // $ANTLR start "ruleLogicalMeasurementSystem"
    // InternalUddl.g:3948:1: ruleLogicalMeasurementSystem returns [EObject current=null] : (otherlv_0= 'msys' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'maxis:' otherlv_5= '[' ( ( ruleQN ) )+ otherlv_7= ']' otherlv_8= 'coord:' ( ( ruleQN ) ) (otherlv_10= 'extRefStd:' ( (lv_externalStandardReference_11_0= RULE_STRING ) ) )? (otherlv_12= 'orient:' ( (lv_orientation_13_0= RULE_STRING ) ) )? (otherlv_14= 'refPt:' otherlv_15= '[' ( (lv_referencePoint_16_0= ruleLogicalReferencePoint ) )+ otherlv_17= ']' )? (otherlv_18= '![' ( (lv_constraint_19_0= ruleLogicalMeasurementConstraint ) )+ otherlv_20= ']' )? otherlv_21= '};' ) ;
    public final EObject ruleLogicalMeasurementSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_externalStandardReference_11_0=null;
        Token otherlv_12=null;
        Token lv_orientation_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_referencePoint_16_0 = null;

        EObject lv_constraint_19_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:3954:2: ( (otherlv_0= 'msys' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'maxis:' otherlv_5= '[' ( ( ruleQN ) )+ otherlv_7= ']' otherlv_8= 'coord:' ( ( ruleQN ) ) (otherlv_10= 'extRefStd:' ( (lv_externalStandardReference_11_0= RULE_STRING ) ) )? (otherlv_12= 'orient:' ( (lv_orientation_13_0= RULE_STRING ) ) )? (otherlv_14= 'refPt:' otherlv_15= '[' ( (lv_referencePoint_16_0= ruleLogicalReferencePoint ) )+ otherlv_17= ']' )? (otherlv_18= '![' ( (lv_constraint_19_0= ruleLogicalMeasurementConstraint ) )+ otherlv_20= ']' )? otherlv_21= '};' ) )
            // InternalUddl.g:3955:2: (otherlv_0= 'msys' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'maxis:' otherlv_5= '[' ( ( ruleQN ) )+ otherlv_7= ']' otherlv_8= 'coord:' ( ( ruleQN ) ) (otherlv_10= 'extRefStd:' ( (lv_externalStandardReference_11_0= RULE_STRING ) ) )? (otherlv_12= 'orient:' ( (lv_orientation_13_0= RULE_STRING ) ) )? (otherlv_14= 'refPt:' otherlv_15= '[' ( (lv_referencePoint_16_0= ruleLogicalReferencePoint ) )+ otherlv_17= ']' )? (otherlv_18= '![' ( (lv_constraint_19_0= ruleLogicalMeasurementConstraint ) )+ otherlv_20= ']' )? otherlv_21= '};' )
            {
            // InternalUddl.g:3955:2: (otherlv_0= 'msys' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'maxis:' otherlv_5= '[' ( ( ruleQN ) )+ otherlv_7= ']' otherlv_8= 'coord:' ( ( ruleQN ) ) (otherlv_10= 'extRefStd:' ( (lv_externalStandardReference_11_0= RULE_STRING ) ) )? (otherlv_12= 'orient:' ( (lv_orientation_13_0= RULE_STRING ) ) )? (otherlv_14= 'refPt:' otherlv_15= '[' ( (lv_referencePoint_16_0= ruleLogicalReferencePoint ) )+ otherlv_17= ']' )? (otherlv_18= '![' ( (lv_constraint_19_0= ruleLogicalMeasurementConstraint ) )+ otherlv_20= ']' )? otherlv_21= '};' )
            // InternalUddl.g:3956:3: otherlv_0= 'msys' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'maxis:' otherlv_5= '[' ( ( ruleQN ) )+ otherlv_7= ']' otherlv_8= 'coord:' ( ( ruleQN ) ) (otherlv_10= 'extRefStd:' ( (lv_externalStandardReference_11_0= RULE_STRING ) ) )? (otherlv_12= 'orient:' ( (lv_orientation_13_0= RULE_STRING ) ) )? (otherlv_14= 'refPt:' otherlv_15= '[' ( (lv_referencePoint_16_0= ruleLogicalReferencePoint ) )+ otherlv_17= ']' )? (otherlv_18= '![' ( (lv_constraint_19_0= ruleLogicalMeasurementConstraint ) )+ otherlv_20= ']' )? otherlv_21= '};'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalMeasurementSystemAccess().getMsysKeyword_0());
            		
            // InternalUddl.g:3960:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:3961:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:3961:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:3962:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalMeasurementSystemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:3978:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_STRING) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalUddl.g:3979:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:3979:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:3980:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalMeasurementSystemAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalMeasurementSystemRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_57); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalMeasurementSystemAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,70,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getLogicalMeasurementSystemAccess().getMaxisKeyword_4());
            		
            otherlv_5=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getLogicalMeasurementSystemAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalUddl.g:4008:3: ( ( ruleQN ) )+
            int cnt86=0;
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==RULE_ID) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalUddl.g:4009:4: ( ruleQN )
            	    {
            	    // InternalUddl.g:4009:4: ( ruleQN )
            	    // InternalUddl.g:4010:5: ruleQN
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLogicalMeasurementSystemRule());
            	    					}
            	    				

            	    					newCompositeNode(grammarAccess.getLogicalMeasurementSystemAccess().getMeasurementSystemAxisLogicalMeasurementSystemAxisCrossReference_6_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    ruleQN();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt86 >= 1 ) break loop86;
                        EarlyExitException eee =
                            new EarlyExitException(86, input);
                        throw eee;
                }
                cnt86++;
            } while (true);

            otherlv_7=(Token)match(input,29,FOLLOW_58); 

            			newLeafNode(otherlv_7, grammarAccess.getLogicalMeasurementSystemAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,71,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getLogicalMeasurementSystemAccess().getCoordKeyword_8());
            		
            // InternalUddl.g:4032:3: ( ( ruleQN ) )
            // InternalUddl.g:4033:4: ( ruleQN )
            {
            // InternalUddl.g:4033:4: ( ruleQN )
            // InternalUddl.g:4034:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementSystemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalMeasurementSystemAccess().getCoordinateSystemLogicalCoordinateSystemCrossReference_9_0());
            				
            pushFollow(FOLLOW_59);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:4048:3: (otherlv_10= 'extRefStd:' ( (lv_externalStandardReference_11_0= RULE_STRING ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==72) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalUddl.g:4049:4: otherlv_10= 'extRefStd:' ( (lv_externalStandardReference_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,72,FOLLOW_37); 

                    				newLeafNode(otherlv_10, grammarAccess.getLogicalMeasurementSystemAccess().getExtRefStdKeyword_10_0());
                    			
                    // InternalUddl.g:4053:4: ( (lv_externalStandardReference_11_0= RULE_STRING ) )
                    // InternalUddl.g:4054:5: (lv_externalStandardReference_11_0= RULE_STRING )
                    {
                    // InternalUddl.g:4054:5: (lv_externalStandardReference_11_0= RULE_STRING )
                    // InternalUddl.g:4055:6: lv_externalStandardReference_11_0= RULE_STRING
                    {
                    lv_externalStandardReference_11_0=(Token)match(input,RULE_STRING,FOLLOW_60); 

                    						newLeafNode(lv_externalStandardReference_11_0, grammarAccess.getLogicalMeasurementSystemAccess().getExternalStandardReferenceSTRINGTerminalRuleCall_10_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalMeasurementSystemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"externalStandardReference",
                    							lv_externalStandardReference_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUddl.g:4072:3: (otherlv_12= 'orient:' ( (lv_orientation_13_0= RULE_STRING ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==73) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalUddl.g:4073:4: otherlv_12= 'orient:' ( (lv_orientation_13_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,73,FOLLOW_37); 

                    				newLeafNode(otherlv_12, grammarAccess.getLogicalMeasurementSystemAccess().getOrientKeyword_11_0());
                    			
                    // InternalUddl.g:4077:4: ( (lv_orientation_13_0= RULE_STRING ) )
                    // InternalUddl.g:4078:5: (lv_orientation_13_0= RULE_STRING )
                    {
                    // InternalUddl.g:4078:5: (lv_orientation_13_0= RULE_STRING )
                    // InternalUddl.g:4079:6: lv_orientation_13_0= RULE_STRING
                    {
                    lv_orientation_13_0=(Token)match(input,RULE_STRING,FOLLOW_61); 

                    						newLeafNode(lv_orientation_13_0, grammarAccess.getLogicalMeasurementSystemAccess().getOrientationSTRINGTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalMeasurementSystemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"orientation",
                    							lv_orientation_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUddl.g:4096:3: (otherlv_14= 'refPt:' otherlv_15= '[' ( (lv_referencePoint_16_0= ruleLogicalReferencePoint ) )+ otherlv_17= ']' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==74) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalUddl.g:4097:4: otherlv_14= 'refPt:' otherlv_15= '[' ( (lv_referencePoint_16_0= ruleLogicalReferencePoint ) )+ otherlv_17= ']'
                    {
                    otherlv_14=(Token)match(input,74,FOLLOW_17); 

                    				newLeafNode(otherlv_14, grammarAccess.getLogicalMeasurementSystemAccess().getRefPtKeyword_12_0());
                    			
                    otherlv_15=(Token)match(input,28,FOLLOW_62); 

                    				newLeafNode(otherlv_15, grammarAccess.getLogicalMeasurementSystemAccess().getLeftSquareBracketKeyword_12_1());
                    			
                    // InternalUddl.g:4105:4: ( (lv_referencePoint_16_0= ruleLogicalReferencePoint ) )+
                    int cnt89=0;
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==59) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalUddl.g:4106:5: (lv_referencePoint_16_0= ruleLogicalReferencePoint )
                    	    {
                    	    // InternalUddl.g:4106:5: (lv_referencePoint_16_0= ruleLogicalReferencePoint )
                    	    // InternalUddl.g:4107:6: lv_referencePoint_16_0= ruleLogicalReferencePoint
                    	    {

                    	    						newCompositeNode(grammarAccess.getLogicalMeasurementSystemAccess().getReferencePointLogicalReferencePointParserRuleCall_12_2_0());
                    	    					
                    	    pushFollow(FOLLOW_63);
                    	    lv_referencePoint_16_0=ruleLogicalReferencePoint();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLogicalMeasurementSystemRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"referencePoint",
                    	    							lv_referencePoint_16_0,
                    	    							"com.epistimis.uddl.Uddl.LogicalReferencePoint");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt89 >= 1 ) break loop89;
                                EarlyExitException eee =
                                    new EarlyExitException(89, input);
                                throw eee;
                        }
                        cnt89++;
                    } while (true);

                    otherlv_17=(Token)match(input,29,FOLLOW_64); 

                    				newLeafNode(otherlv_17, grammarAccess.getLogicalMeasurementSystemAccess().getRightSquareBracketKeyword_12_3());
                    			

                    }
                    break;

            }

            // InternalUddl.g:4129:3: (otherlv_18= '![' ( (lv_constraint_19_0= ruleLogicalMeasurementConstraint ) )+ otherlv_20= ']' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==75) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalUddl.g:4130:4: otherlv_18= '![' ( (lv_constraint_19_0= ruleLogicalMeasurementConstraint ) )+ otherlv_20= ']'
                    {
                    otherlv_18=(Token)match(input,75,FOLLOW_37); 

                    				newLeafNode(otherlv_18, grammarAccess.getLogicalMeasurementSystemAccess().getExclamationMarkLeftSquareBracketKeyword_13_0());
                    			
                    // InternalUddl.g:4134:4: ( (lv_constraint_19_0= ruleLogicalMeasurementConstraint ) )+
                    int cnt91=0;
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==RULE_STRING) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // InternalUddl.g:4135:5: (lv_constraint_19_0= ruleLogicalMeasurementConstraint )
                    	    {
                    	    // InternalUddl.g:4135:5: (lv_constraint_19_0= ruleLogicalMeasurementConstraint )
                    	    // InternalUddl.g:4136:6: lv_constraint_19_0= ruleLogicalMeasurementConstraint
                    	    {

                    	    						newCompositeNode(grammarAccess.getLogicalMeasurementSystemAccess().getConstraintLogicalMeasurementConstraintParserRuleCall_13_1_0());
                    	    					
                    	    pushFollow(FOLLOW_65);
                    	    lv_constraint_19_0=ruleLogicalMeasurementConstraint();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLogicalMeasurementSystemRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"constraint",
                    	    							lv_constraint_19_0,
                    	    							"com.epistimis.uddl.Uddl.LogicalMeasurementConstraint");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt91 >= 1 ) break loop91;
                                EarlyExitException eee =
                                    new EarlyExitException(91, input);
                                throw eee;
                        }
                        cnt91++;
                    } while (true);

                    otherlv_20=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_20, grammarAccess.getLogicalMeasurementSystemAccess().getRightSquareBracketKeyword_13_2());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getLogicalMeasurementSystemAccess().getRightCurlyBracketSemicolonKeyword_14());
            		

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
    // $ANTLR end "ruleLogicalMeasurementSystem"


    // $ANTLR start "entryRuleLogicalMeasurementSystemAxis"
    // InternalUddl.g:4166:1: entryRuleLogicalMeasurementSystemAxis returns [EObject current=null] : iv_ruleLogicalMeasurementSystemAxis= ruleLogicalMeasurementSystemAxis EOF ;
    public final EObject entryRuleLogicalMeasurementSystemAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalMeasurementSystemAxis = null;


        try {
            // InternalUddl.g:4166:69: (iv_ruleLogicalMeasurementSystemAxis= ruleLogicalMeasurementSystemAxis EOF )
            // InternalUddl.g:4167:2: iv_ruleLogicalMeasurementSystemAxis= ruleLogicalMeasurementSystemAxis EOF
            {
             newCompositeNode(grammarAccess.getLogicalMeasurementSystemAxisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalMeasurementSystemAxis=ruleLogicalMeasurementSystemAxis();

            state._fsp--;

             current =iv_ruleLogicalMeasurementSystemAxis; 
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
    // $ANTLR end "entryRuleLogicalMeasurementSystemAxis"


    // $ANTLR start "ruleLogicalMeasurementSystemAxis"
    // InternalUddl.g:4173:1: ruleLogicalMeasurementSystemAxis returns [EObject current=null] : (otherlv_0= 'msa' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'axis:' ( ( ruleQN ) ) otherlv_6= 'vtu:' otherlv_7= '[' ( ( ruleQN ) )+ otherlv_9= ']' (otherlv_10= '![' ( (lv_constraint_11_0= ruleLogicalMeasurementConstraint ) )+ otherlv_12= ']' )? otherlv_13= '};' ) ;
    public final EObject ruleLogicalMeasurementSystemAxis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_constraint_11_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:4179:2: ( (otherlv_0= 'msa' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'axis:' ( ( ruleQN ) ) otherlv_6= 'vtu:' otherlv_7= '[' ( ( ruleQN ) )+ otherlv_9= ']' (otherlv_10= '![' ( (lv_constraint_11_0= ruleLogicalMeasurementConstraint ) )+ otherlv_12= ']' )? otherlv_13= '};' ) )
            // InternalUddl.g:4180:2: (otherlv_0= 'msa' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'axis:' ( ( ruleQN ) ) otherlv_6= 'vtu:' otherlv_7= '[' ( ( ruleQN ) )+ otherlv_9= ']' (otherlv_10= '![' ( (lv_constraint_11_0= ruleLogicalMeasurementConstraint ) )+ otherlv_12= ']' )? otherlv_13= '};' )
            {
            // InternalUddl.g:4180:2: (otherlv_0= 'msa' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'axis:' ( ( ruleQN ) ) otherlv_6= 'vtu:' otherlv_7= '[' ( ( ruleQN ) )+ otherlv_9= ']' (otherlv_10= '![' ( (lv_constraint_11_0= ruleLogicalMeasurementConstraint ) )+ otherlv_12= ']' )? otherlv_13= '};' )
            // InternalUddl.g:4181:3: otherlv_0= 'msa' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'axis:' ( ( ruleQN ) ) otherlv_6= 'vtu:' otherlv_7= '[' ( ( ruleQN ) )+ otherlv_9= ']' (otherlv_10= '![' ( (lv_constraint_11_0= ruleLogicalMeasurementConstraint ) )+ otherlv_12= ']' )? otherlv_13= '};'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalMeasurementSystemAxisAccess().getMsaKeyword_0());
            		
            // InternalUddl.g:4185:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:4186:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:4186:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:4187:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalMeasurementSystemAxisAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementSystemAxisRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:4203:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_STRING) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalUddl.g:4204:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:4204:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:4205:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalMeasurementSystemAxisAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalMeasurementSystemAxisRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_66); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalMeasurementSystemAxisAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getLogicalMeasurementSystemAxisAccess().getAxisKeyword_4());
            		
            // InternalUddl.g:4229:3: ( ( ruleQN ) )
            // InternalUddl.g:4230:4: ( ruleQN )
            {
            // InternalUddl.g:4230:4: ( ruleQN )
            // InternalUddl.g:4231:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementSystemAxisRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalMeasurementSystemAxisAccess().getAxisLogicalCoordinateSystemAxisCrossReference_5_0());
            				
            pushFollow(FOLLOW_67);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,77,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getLogicalMeasurementSystemAxisAccess().getVtuKeyword_6());
            		
            otherlv_7=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getLogicalMeasurementSystemAxisAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalUddl.g:4253:3: ( ( ruleQN ) )+
            int cnt94=0;
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==RULE_ID) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalUddl.g:4254:4: ( ruleQN )
            	    {
            	    // InternalUddl.g:4254:4: ( ruleQN )
            	    // InternalUddl.g:4255:5: ruleQN
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLogicalMeasurementSystemAxisRule());
            	    					}
            	    				

            	    					newCompositeNode(grammarAccess.getLogicalMeasurementSystemAxisAccess().getDefaultValueTypeUnitLogicalValueTypeUnitCrossReference_8_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    ruleQN();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt94 >= 1 ) break loop94;
                        EarlyExitException eee =
                            new EarlyExitException(94, input);
                        throw eee;
                }
                cnt94++;
            } while (true);

            otherlv_9=(Token)match(input,29,FOLLOW_64); 

            			newLeafNode(otherlv_9, grammarAccess.getLogicalMeasurementSystemAxisAccess().getRightSquareBracketKeyword_9());
            		
            // InternalUddl.g:4273:3: (otherlv_10= '![' ( (lv_constraint_11_0= ruleLogicalMeasurementConstraint ) )+ otherlv_12= ']' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==75) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalUddl.g:4274:4: otherlv_10= '![' ( (lv_constraint_11_0= ruleLogicalMeasurementConstraint ) )+ otherlv_12= ']'
                    {
                    otherlv_10=(Token)match(input,75,FOLLOW_37); 

                    				newLeafNode(otherlv_10, grammarAccess.getLogicalMeasurementSystemAxisAccess().getExclamationMarkLeftSquareBracketKeyword_10_0());
                    			
                    // InternalUddl.g:4278:4: ( (lv_constraint_11_0= ruleLogicalMeasurementConstraint ) )+
                    int cnt95=0;
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==RULE_STRING) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalUddl.g:4279:5: (lv_constraint_11_0= ruleLogicalMeasurementConstraint )
                    	    {
                    	    // InternalUddl.g:4279:5: (lv_constraint_11_0= ruleLogicalMeasurementConstraint )
                    	    // InternalUddl.g:4280:6: lv_constraint_11_0= ruleLogicalMeasurementConstraint
                    	    {

                    	    						newCompositeNode(grammarAccess.getLogicalMeasurementSystemAxisAccess().getConstraintLogicalMeasurementConstraintParserRuleCall_10_1_0());
                    	    					
                    	    pushFollow(FOLLOW_65);
                    	    lv_constraint_11_0=ruleLogicalMeasurementConstraint();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLogicalMeasurementSystemAxisRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"constraint",
                    	    							lv_constraint_11_0,
                    	    							"com.epistimis.uddl.Uddl.LogicalMeasurementConstraint");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt95 >= 1 ) break loop95;
                                EarlyExitException eee =
                                    new EarlyExitException(95, input);
                                throw eee;
                        }
                        cnt95++;
                    } while (true);

                    otherlv_12=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getLogicalMeasurementSystemAxisAccess().getRightSquareBracketKeyword_10_2());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getLogicalMeasurementSystemAxisAccess().getRightCurlyBracketSemicolonKeyword_11());
            		

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
    // $ANTLR end "ruleLogicalMeasurementSystemAxis"


    // $ANTLR start "entryRuleLogicalReferencePoint"
    // InternalUddl.g:4310:1: entryRuleLogicalReferencePoint returns [EObject current=null] : iv_ruleLogicalReferencePoint= ruleLogicalReferencePoint EOF ;
    public final EObject entryRuleLogicalReferencePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalReferencePoint = null;


        try {
            // InternalUddl.g:4310:62: (iv_ruleLogicalReferencePoint= ruleLogicalReferencePoint EOF )
            // InternalUddl.g:4311:2: iv_ruleLogicalReferencePoint= ruleLogicalReferencePoint EOF
            {
             newCompositeNode(grammarAccess.getLogicalReferencePointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalReferencePoint=ruleLogicalReferencePoint();

            state._fsp--;

             current =iv_ruleLogicalReferencePoint; 
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
    // $ANTLR end "entryRuleLogicalReferencePoint"


    // $ANTLR start "ruleLogicalReferencePoint"
    // InternalUddl.g:4317:1: ruleLogicalReferencePoint returns [EObject current=null] : (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= 'landmark:' ( ( ruleQN ) ) otherlv_5= '[' ( (lv_referencePointPart_6_0= ruleLogicalReferencePointPart ) )+ otherlv_7= ']' otherlv_8= ')' ) ;
    public final EObject ruleLogicalReferencePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_referencePointPart_6_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:4323:2: ( (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= 'landmark:' ( ( ruleQN ) ) otherlv_5= '[' ( (lv_referencePointPart_6_0= ruleLogicalReferencePointPart ) )+ otherlv_7= ']' otherlv_8= ')' ) )
            // InternalUddl.g:4324:2: (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= 'landmark:' ( ( ruleQN ) ) otherlv_5= '[' ( (lv_referencePointPart_6_0= ruleLogicalReferencePointPart ) )+ otherlv_7= ']' otherlv_8= ')' )
            {
            // InternalUddl.g:4324:2: (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= 'landmark:' ( ( ruleQN ) ) otherlv_5= '[' ( (lv_referencePointPart_6_0= ruleLogicalReferencePointPart ) )+ otherlv_7= ']' otherlv_8= ')' )
            // InternalUddl.g:4325:3: otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= 'landmark:' ( ( ruleQN ) ) otherlv_5= '[' ( (lv_referencePointPart_6_0= ruleLogicalReferencePointPart ) )+ otherlv_7= ']' otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalReferencePointAccess().getLeftParenthesisKeyword_0());
            		
            // InternalUddl.g:4329:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:4330:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:4330:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:4331:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_68); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalReferencePointAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalReferencePointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:4347:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_STRING) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalUddl.g:4348:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:4348:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:4349:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_69); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalReferencePointAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalReferencePointRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,78,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalReferencePointAccess().getLandmarkKeyword_3());
            		
            // InternalUddl.g:4369:3: ( ( ruleQN ) )
            // InternalUddl.g:4370:4: ( ruleQN )
            {
            // InternalUddl.g:4370:4: ( ruleQN )
            // InternalUddl.g:4371:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalReferencePointRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalReferencePointAccess().getLandmarkLogicalLandmarkCrossReference_4_0());
            				
            pushFollow(FOLLOW_17);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_62); 

            			newLeafNode(otherlv_5, grammarAccess.getLogicalReferencePointAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalUddl.g:4389:3: ( (lv_referencePointPart_6_0= ruleLogicalReferencePointPart ) )+
            int cnt98=0;
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==59) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // InternalUddl.g:4390:4: (lv_referencePointPart_6_0= ruleLogicalReferencePointPart )
            	    {
            	    // InternalUddl.g:4390:4: (lv_referencePointPart_6_0= ruleLogicalReferencePointPart )
            	    // InternalUddl.g:4391:5: lv_referencePointPart_6_0= ruleLogicalReferencePointPart
            	    {

            	    					newCompositeNode(grammarAccess.getLogicalReferencePointAccess().getReferencePointPartLogicalReferencePointPartParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_63);
            	    lv_referencePointPart_6_0=ruleLogicalReferencePointPart();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLogicalReferencePointRule());
            	    					}
            	    					add(
            	    						current,
            	    						"referencePointPart",
            	    						lv_referencePointPart_6_0,
            	    						"com.epistimis.uddl.Uddl.LogicalReferencePointPart");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt98 >= 1 ) break loop98;
                        EarlyExitException eee =
                            new EarlyExitException(98, input);
                        throw eee;
                }
                cnt98++;
            } while (true);

            otherlv_7=(Token)match(input,29,FOLLOW_52); 

            			newLeafNode(otherlv_7, grammarAccess.getLogicalReferencePointAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,60,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLogicalReferencePointAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleLogicalReferencePoint"


    // $ANTLR start "entryRuleLogicalReferencePointPart"
    // InternalUddl.g:4420:1: entryRuleLogicalReferencePointPart returns [EObject current=null] : iv_ruleLogicalReferencePointPart= ruleLogicalReferencePointPart EOF ;
    public final EObject entryRuleLogicalReferencePointPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalReferencePointPart = null;


        try {
            // InternalUddl.g:4420:66: (iv_ruleLogicalReferencePointPart= ruleLogicalReferencePointPart EOF )
            // InternalUddl.g:4421:2: iv_ruleLogicalReferencePointPart= ruleLogicalReferencePointPart EOF
            {
             newCompositeNode(grammarAccess.getLogicalReferencePointPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalReferencePointPart=ruleLogicalReferencePointPart();

            state._fsp--;

             current =iv_ruleLogicalReferencePointPart; 
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
    // $ANTLR end "entryRuleLogicalReferencePointPart"


    // $ANTLR start "ruleLogicalReferencePointPart"
    // InternalUddl.g:4427:1: ruleLogicalReferencePointPart returns [EObject current=null] : (otherlv_0= '(' ( ( ruleQN ) )? ( (lv_value_2_0= RULE_STRING ) ) ( ( ruleQN ) )? otherlv_4= ')' ) ;
    public final EObject ruleLogicalReferencePointPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalUddl.g:4433:2: ( (otherlv_0= '(' ( ( ruleQN ) )? ( (lv_value_2_0= RULE_STRING ) ) ( ( ruleQN ) )? otherlv_4= ')' ) )
            // InternalUddl.g:4434:2: (otherlv_0= '(' ( ( ruleQN ) )? ( (lv_value_2_0= RULE_STRING ) ) ( ( ruleQN ) )? otherlv_4= ')' )
            {
            // InternalUddl.g:4434:2: (otherlv_0= '(' ( ( ruleQN ) )? ( (lv_value_2_0= RULE_STRING ) ) ( ( ruleQN ) )? otherlv_4= ')' )
            // InternalUddl.g:4435:3: otherlv_0= '(' ( ( ruleQN ) )? ( (lv_value_2_0= RULE_STRING ) ) ( ( ruleQN ) )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_70); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalReferencePointPartAccess().getLeftParenthesisKeyword_0());
            		
            // InternalUddl.g:4439:3: ( ( ruleQN ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==RULE_ID) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalUddl.g:4440:4: ( ruleQN )
                    {
                    // InternalUddl.g:4440:4: ( ruleQN )
                    // InternalUddl.g:4441:5: ruleQN
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalReferencePointPartRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getLogicalReferencePointPartAccess().getAxisLogicalMeasurementSystemAxisCrossReference_1_0());
                    				
                    pushFollow(FOLLOW_37);
                    ruleQN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:4455:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalUddl.g:4456:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalUddl.g:4456:4: (lv_value_2_0= RULE_STRING )
            // InternalUddl.g:4457:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_71); 

            					newLeafNode(lv_value_2_0, grammarAccess.getLogicalReferencePointPartAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalReferencePointPartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalUddl.g:4473:3: ( ( ruleQN ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==RULE_ID) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalUddl.g:4474:4: ( ruleQN )
                    {
                    // InternalUddl.g:4474:4: ( ruleQN )
                    // InternalUddl.g:4475:5: ruleQN
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalReferencePointPartRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getLogicalReferencePointPartAccess().getValueTypeUnitLogicalValueTypeUnitCrossReference_3_0());
                    				
                    pushFollow(FOLLOW_52);
                    ruleQN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,60,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLogicalReferencePointPartAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleLogicalReferencePointPart"


    // $ANTLR start "entryRuleLogicalValueTypeUnit"
    // InternalUddl.g:4497:1: entryRuleLogicalValueTypeUnit returns [EObject current=null] : iv_ruleLogicalValueTypeUnit= ruleLogicalValueTypeUnit EOF ;
    public final EObject entryRuleLogicalValueTypeUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalValueTypeUnit = null;


        try {
            // InternalUddl.g:4497:61: (iv_ruleLogicalValueTypeUnit= ruleLogicalValueTypeUnit EOF )
            // InternalUddl.g:4498:2: iv_ruleLogicalValueTypeUnit= ruleLogicalValueTypeUnit EOF
            {
             newCompositeNode(grammarAccess.getLogicalValueTypeUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalValueTypeUnit=ruleLogicalValueTypeUnit();

            state._fsp--;

             current =iv_ruleLogicalValueTypeUnit; 
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
    // $ANTLR end "entryRuleLogicalValueTypeUnit"


    // $ANTLR start "ruleLogicalValueTypeUnit"
    // InternalUddl.g:4504:1: ruleLogicalValueTypeUnit returns [EObject current=null] : (otherlv_0= 'vtu' ( ( ruleQN ) ) ( ( ruleQN ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? (otherlv_5= '{' otherlv_6= '!' ( (lv_constraint_7_0= ruleLogicalConstraint ) ) otherlv_8= '}' )? otherlv_9= ';' ) ;
    public final EObject ruleLogicalValueTypeUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_3_0=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_constraint_7_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:4510:2: ( (otherlv_0= 'vtu' ( ( ruleQN ) ) ( ( ruleQN ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? (otherlv_5= '{' otherlv_6= '!' ( (lv_constraint_7_0= ruleLogicalConstraint ) ) otherlv_8= '}' )? otherlv_9= ';' ) )
            // InternalUddl.g:4511:2: (otherlv_0= 'vtu' ( ( ruleQN ) ) ( ( ruleQN ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? (otherlv_5= '{' otherlv_6= '!' ( (lv_constraint_7_0= ruleLogicalConstraint ) ) otherlv_8= '}' )? otherlv_9= ';' )
            {
            // InternalUddl.g:4511:2: (otherlv_0= 'vtu' ( ( ruleQN ) ) ( ( ruleQN ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? (otherlv_5= '{' otherlv_6= '!' ( (lv_constraint_7_0= ruleLogicalConstraint ) ) otherlv_8= '}' )? otherlv_9= ';' )
            // InternalUddl.g:4512:3: otherlv_0= 'vtu' ( ( ruleQN ) ) ( ( ruleQN ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? (otherlv_5= '{' otherlv_6= '!' ( (lv_constraint_7_0= ruleLogicalConstraint ) ) otherlv_8= '}' )? otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalValueTypeUnitAccess().getVtuKeyword_0());
            		
            // InternalUddl.g:4516:3: ( ( ruleQN ) )
            // InternalUddl.g:4517:4: ( ruleQN )
            {
            // InternalUddl.g:4517:4: ( ruleQN )
            // InternalUddl.g:4518:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalValueTypeUnitRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalValueTypeUnitAccess().getValueTypeLogicalValueTypeCrossReference_1_0());
            				
            pushFollow(FOLLOW_3);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:4532:3: ( ( ruleQN ) )
            // InternalUddl.g:4533:4: ( ruleQN )
            {
            // InternalUddl.g:4533:4: ( ruleQN )
            // InternalUddl.g:4534:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalValueTypeUnitRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalValueTypeUnitAccess().getUnitLogicalUnitCrossReference_2_0());
            				
            pushFollow(FOLLOW_3);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:4548:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalUddl.g:4549:4: (lv_name_3_0= RULE_ID )
            {
            // InternalUddl.g:4549:4: (lv_name_3_0= RULE_ID )
            // InternalUddl.g:4550:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_72); 

            					newLeafNode(lv_name_3_0, grammarAccess.getLogicalValueTypeUnitAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalValueTypeUnitRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:4566:3: ( (lv_description_4_0= RULE_STRING ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==RULE_STRING) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalUddl.g:4567:4: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalUddl.g:4567:4: (lv_description_4_0= RULE_STRING )
                    // InternalUddl.g:4568:5: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_73); 

                    					newLeafNode(lv_description_4_0, grammarAccess.getLogicalValueTypeUnitAccess().getDescriptionSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalValueTypeUnitRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_4_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:4584:3: (otherlv_5= '{' otherlv_6= '!' ( (lv_constraint_7_0= ruleLogicalConstraint ) ) otherlv_8= '}' )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==14) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalUddl.g:4585:4: otherlv_5= '{' otherlv_6= '!' ( (lv_constraint_7_0= ruleLogicalConstraint ) ) otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_74); 

                    				newLeafNode(otherlv_5, grammarAccess.getLogicalValueTypeUnitAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,80,FOLLOW_75); 

                    				newLeafNode(otherlv_6, grammarAccess.getLogicalValueTypeUnitAccess().getExclamationMarkKeyword_5_1());
                    			
                    // InternalUddl.g:4593:4: ( (lv_constraint_7_0= ruleLogicalConstraint ) )
                    // InternalUddl.g:4594:5: (lv_constraint_7_0= ruleLogicalConstraint )
                    {
                    // InternalUddl.g:4594:5: (lv_constraint_7_0= ruleLogicalConstraint )
                    // InternalUddl.g:4595:6: lv_constraint_7_0= ruleLogicalConstraint
                    {

                    						newCompositeNode(grammarAccess.getLogicalValueTypeUnitAccess().getConstraintLogicalConstraintParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_constraint_7_0=ruleLogicalConstraint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogicalValueTypeUnitRule());
                    						}
                    						set(
                    							current,
                    							"constraint",
                    							lv_constraint_7_0,
                    							"com.epistimis.uddl.Uddl.LogicalConstraint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getLogicalValueTypeUnitAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLogicalValueTypeUnitAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleLogicalValueTypeUnit"


    // $ANTLR start "entryRuleLogicalConstraint"
    // InternalUddl.g:4625:1: entryRuleLogicalConstraint returns [EObject current=null] : iv_ruleLogicalConstraint= ruleLogicalConstraint EOF ;
    public final EObject entryRuleLogicalConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalConstraint = null;


        try {
            // InternalUddl.g:4625:58: (iv_ruleLogicalConstraint= ruleLogicalConstraint EOF )
            // InternalUddl.g:4626:2: iv_ruleLogicalConstraint= ruleLogicalConstraint EOF
            {
             newCompositeNode(grammarAccess.getLogicalConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalConstraint=ruleLogicalConstraint();

            state._fsp--;

             current =iv_ruleLogicalConstraint; 
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
    // $ANTLR end "entryRuleLogicalConstraint"


    // $ANTLR start "ruleLogicalConstraint"
    // InternalUddl.g:4632:1: ruleLogicalConstraint returns [EObject current=null] : (this_LogicalStringConstraint_0= ruleLogicalStringConstraint | this_LogicalRealRangeConstraint_1= ruleLogicalRealRangeConstraint | this_LogicalIntegerRangeConstraint_2= ruleLogicalIntegerRangeConstraint | this_LogicalEnumerationConstraint_3= ruleLogicalEnumerationConstraint ) ;
    public final EObject ruleLogicalConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalStringConstraint_0 = null;

        EObject this_LogicalRealRangeConstraint_1 = null;

        EObject this_LogicalIntegerRangeConstraint_2 = null;

        EObject this_LogicalEnumerationConstraint_3 = null;



        	enterRule();

        try {
            // InternalUddl.g:4638:2: ( (this_LogicalStringConstraint_0= ruleLogicalStringConstraint | this_LogicalRealRangeConstraint_1= ruleLogicalRealRangeConstraint | this_LogicalIntegerRangeConstraint_2= ruleLogicalIntegerRangeConstraint | this_LogicalEnumerationConstraint_3= ruleLogicalEnumerationConstraint ) )
            // InternalUddl.g:4639:2: (this_LogicalStringConstraint_0= ruleLogicalStringConstraint | this_LogicalRealRangeConstraint_1= ruleLogicalRealRangeConstraint | this_LogicalIntegerRangeConstraint_2= ruleLogicalIntegerRangeConstraint | this_LogicalEnumerationConstraint_3= ruleLogicalEnumerationConstraint )
            {
            // InternalUddl.g:4639:2: (this_LogicalStringConstraint_0= ruleLogicalStringConstraint | this_LogicalRealRangeConstraint_1= ruleLogicalRealRangeConstraint | this_LogicalIntegerRangeConstraint_2= ruleLogicalIntegerRangeConstraint | this_LogicalEnumerationConstraint_3= ruleLogicalEnumerationConstraint )
            int alt103=4;
            switch ( input.LA(1) ) {
            case 83:
            case 84:
                {
                alt103=1;
                }
                break;
            case 82:
                {
                alt103=2;
                }
                break;
            case 81:
                {
                alt103=3;
                }
                break;
            case 85:
                {
                alt103=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // InternalUddl.g:4640:3: this_LogicalStringConstraint_0= ruleLogicalStringConstraint
                    {

                    			newCompositeNode(grammarAccess.getLogicalConstraintAccess().getLogicalStringConstraintParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalStringConstraint_0=ruleLogicalStringConstraint();

                    state._fsp--;


                    			current = this_LogicalStringConstraint_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:4649:3: this_LogicalRealRangeConstraint_1= ruleLogicalRealRangeConstraint
                    {

                    			newCompositeNode(grammarAccess.getLogicalConstraintAccess().getLogicalRealRangeConstraintParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalRealRangeConstraint_1=ruleLogicalRealRangeConstraint();

                    state._fsp--;


                    			current = this_LogicalRealRangeConstraint_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUddl.g:4658:3: this_LogicalIntegerRangeConstraint_2= ruleLogicalIntegerRangeConstraint
                    {

                    			newCompositeNode(grammarAccess.getLogicalConstraintAccess().getLogicalIntegerRangeConstraintParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalIntegerRangeConstraint_2=ruleLogicalIntegerRangeConstraint();

                    state._fsp--;


                    			current = this_LogicalIntegerRangeConstraint_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUddl.g:4667:3: this_LogicalEnumerationConstraint_3= ruleLogicalEnumerationConstraint
                    {

                    			newCompositeNode(grammarAccess.getLogicalConstraintAccess().getLogicalEnumerationConstraintParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalEnumerationConstraint_3=ruleLogicalEnumerationConstraint();

                    state._fsp--;


                    			current = this_LogicalEnumerationConstraint_3;
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
    // $ANTLR end "ruleLogicalConstraint"


    // $ANTLR start "entryRuleLogicalIntegerRangeConstraint"
    // InternalUddl.g:4679:1: entryRuleLogicalIntegerRangeConstraint returns [EObject current=null] : iv_ruleLogicalIntegerRangeConstraint= ruleLogicalIntegerRangeConstraint EOF ;
    public final EObject entryRuleLogicalIntegerRangeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalIntegerRangeConstraint = null;


        try {
            // InternalUddl.g:4679:70: (iv_ruleLogicalIntegerRangeConstraint= ruleLogicalIntegerRangeConstraint EOF )
            // InternalUddl.g:4680:2: iv_ruleLogicalIntegerRangeConstraint= ruleLogicalIntegerRangeConstraint EOF
            {
             newCompositeNode(grammarAccess.getLogicalIntegerRangeConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalIntegerRangeConstraint=ruleLogicalIntegerRangeConstraint();

            state._fsp--;

             current =iv_ruleLogicalIntegerRangeConstraint; 
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
    // $ANTLR end "entryRuleLogicalIntegerRangeConstraint"


    // $ANTLR start "ruleLogicalIntegerRangeConstraint"
    // InternalUddl.g:4686:1: ruleLogicalIntegerRangeConstraint returns [EObject current=null] : (otherlv_0= 'irc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= ';' ) ;
    public final EObject ruleLogicalIntegerRangeConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_lowerBound_3_0=null;
        Token otherlv_4=null;
        Token lv_upperBound_5_0=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalUddl.g:4692:2: ( (otherlv_0= 'irc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= ';' ) )
            // InternalUddl.g:4693:2: (otherlv_0= 'irc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= ';' )
            {
            // InternalUddl.g:4693:2: (otherlv_0= 'irc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= ';' )
            // InternalUddl.g:4694:3: otherlv_0= 'irc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalIntegerRangeConstraintAccess().getIrcKeyword_0());
            		
            // InternalUddl.g:4698:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:4699:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:4699:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:4700:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalIntegerRangeConstraintAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalIntegerRangeConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getLogicalIntegerRangeConstraintAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalUddl.g:4720:3: ( (lv_lowerBound_3_0= RULE_INT ) )
            // InternalUddl.g:4721:4: (lv_lowerBound_3_0= RULE_INT )
            {
            // InternalUddl.g:4721:4: (lv_lowerBound_3_0= RULE_INT )
            // InternalUddl.g:4722:5: lv_lowerBound_3_0= RULE_INT
            {
            lv_lowerBound_3_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_lowerBound_3_0, grammarAccess.getLogicalIntegerRangeConstraintAccess().getLowerBoundINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalIntegerRangeConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lowerBound",
            						lv_lowerBound_3_0,
            						"com.epistimis.uddl.Uddl.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_31); 

            			newLeafNode(otherlv_4, grammarAccess.getLogicalIntegerRangeConstraintAccess().getColonKeyword_4());
            		
            // InternalUddl.g:4742:3: ( (lv_upperBound_5_0= RULE_INT ) )
            // InternalUddl.g:4743:4: (lv_upperBound_5_0= RULE_INT )
            {
            // InternalUddl.g:4743:4: (lv_upperBound_5_0= RULE_INT )
            // InternalUddl.g:4744:5: lv_upperBound_5_0= RULE_INT
            {
            lv_upperBound_5_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_upperBound_5_0, grammarAccess.getLogicalIntegerRangeConstraintAccess().getUpperBoundINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalIntegerRangeConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"upperBound",
            						lv_upperBound_5_0,
            						"com.epistimis.uddl.Uddl.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getLogicalIntegerRangeConstraintAccess().getRightSquareBracketKeyword_6());
            		
            // InternalUddl.g:4764:3: ( (lv_description_7_0= RULE_STRING ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==RULE_STRING) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalUddl.g:4765:4: (lv_description_7_0= RULE_STRING )
                    {
                    // InternalUddl.g:4765:4: (lv_description_7_0= RULE_STRING )
                    // InternalUddl.g:4766:5: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    					newLeafNode(lv_description_7_0, grammarAccess.getLogicalIntegerRangeConstraintAccess().getDescriptionSTRINGTerminalRuleCall_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalIntegerRangeConstraintRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_7_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLogicalIntegerRangeConstraintAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleLogicalIntegerRangeConstraint"


    // $ANTLR start "entryRuleLogicalRealRangeConstraint"
    // InternalUddl.g:4790:1: entryRuleLogicalRealRangeConstraint returns [EObject current=null] : iv_ruleLogicalRealRangeConstraint= ruleLogicalRealRangeConstraint EOF ;
    public final EObject entryRuleLogicalRealRangeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRealRangeConstraint = null;


        try {
            // InternalUddl.g:4790:67: (iv_ruleLogicalRealRangeConstraint= ruleLogicalRealRangeConstraint EOF )
            // InternalUddl.g:4791:2: iv_ruleLogicalRealRangeConstraint= ruleLogicalRealRangeConstraint EOF
            {
             newCompositeNode(grammarAccess.getLogicalRealRangeConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalRealRangeConstraint=ruleLogicalRealRangeConstraint();

            state._fsp--;

             current =iv_ruleLogicalRealRangeConstraint; 
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
    // $ANTLR end "entryRuleLogicalRealRangeConstraint"


    // $ANTLR start "ruleLogicalRealRangeConstraint"
    // InternalUddl.g:4797:1: ruleLogicalRealRangeConstraint returns [EObject current=null] : (otherlv_0= 'rrc' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' | ( (lv_lowerBoundInclusive_3_0= '[' ) ) ) ( (lv_lowerBound_4_0= RULE_FLOAT ) ) otherlv_5= ':' ( (lv_upperBound_6_0= RULE_FLOAT ) ) (otherlv_7= ')' | ( (lv_upperBoundInclusive_8_0= ']' ) ) ) ( (lv_description_9_0= RULE_STRING ) )? otherlv_10= ';' ) ;
    public final EObject ruleLogicalRealRangeConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_lowerBoundInclusive_3_0=null;
        Token lv_lowerBound_4_0=null;
        Token otherlv_5=null;
        Token lv_upperBound_6_0=null;
        Token otherlv_7=null;
        Token lv_upperBoundInclusive_8_0=null;
        Token lv_description_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalUddl.g:4803:2: ( (otherlv_0= 'rrc' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' | ( (lv_lowerBoundInclusive_3_0= '[' ) ) ) ( (lv_lowerBound_4_0= RULE_FLOAT ) ) otherlv_5= ':' ( (lv_upperBound_6_0= RULE_FLOAT ) ) (otherlv_7= ')' | ( (lv_upperBoundInclusive_8_0= ']' ) ) ) ( (lv_description_9_0= RULE_STRING ) )? otherlv_10= ';' ) )
            // InternalUddl.g:4804:2: (otherlv_0= 'rrc' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' | ( (lv_lowerBoundInclusive_3_0= '[' ) ) ) ( (lv_lowerBound_4_0= RULE_FLOAT ) ) otherlv_5= ':' ( (lv_upperBound_6_0= RULE_FLOAT ) ) (otherlv_7= ')' | ( (lv_upperBoundInclusive_8_0= ']' ) ) ) ( (lv_description_9_0= RULE_STRING ) )? otherlv_10= ';' )
            {
            // InternalUddl.g:4804:2: (otherlv_0= 'rrc' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' | ( (lv_lowerBoundInclusive_3_0= '[' ) ) ) ( (lv_lowerBound_4_0= RULE_FLOAT ) ) otherlv_5= ':' ( (lv_upperBound_6_0= RULE_FLOAT ) ) (otherlv_7= ')' | ( (lv_upperBoundInclusive_8_0= ']' ) ) ) ( (lv_description_9_0= RULE_STRING ) )? otherlv_10= ';' )
            // InternalUddl.g:4805:3: otherlv_0= 'rrc' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' | ( (lv_lowerBoundInclusive_3_0= '[' ) ) ) ( (lv_lowerBound_4_0= RULE_FLOAT ) ) otherlv_5= ':' ( (lv_upperBound_6_0= RULE_FLOAT ) ) (otherlv_7= ')' | ( (lv_upperBoundInclusive_8_0= ']' ) ) ) ( (lv_description_9_0= RULE_STRING ) )? otherlv_10= ';'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalRealRangeConstraintAccess().getRrcKeyword_0());
            		
            // InternalUddl.g:4809:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:4810:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:4810:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:4811:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_76); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalRealRangeConstraintAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalRealRangeConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:4827:3: (otherlv_2= '(' | ( (lv_lowerBoundInclusive_3_0= '[' ) ) )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==59) ) {
                alt105=1;
            }
            else if ( (LA105_0==28) ) {
                alt105=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // InternalUddl.g:4828:4: otherlv_2= '('
                    {
                    otherlv_2=(Token)match(input,59,FOLLOW_43); 

                    				newLeafNode(otherlv_2, grammarAccess.getLogicalRealRangeConstraintAccess().getLeftParenthesisKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUddl.g:4833:4: ( (lv_lowerBoundInclusive_3_0= '[' ) )
                    {
                    // InternalUddl.g:4833:4: ( (lv_lowerBoundInclusive_3_0= '[' ) )
                    // InternalUddl.g:4834:5: (lv_lowerBoundInclusive_3_0= '[' )
                    {
                    // InternalUddl.g:4834:5: (lv_lowerBoundInclusive_3_0= '[' )
                    // InternalUddl.g:4835:6: lv_lowerBoundInclusive_3_0= '['
                    {
                    lv_lowerBoundInclusive_3_0=(Token)match(input,28,FOLLOW_43); 

                    						newLeafNode(lv_lowerBoundInclusive_3_0, grammarAccess.getLogicalRealRangeConstraintAccess().getLowerBoundInclusiveLeftSquareBracketKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalRealRangeConstraintRule());
                    						}
                    						setWithLastConsumed(current, "lowerBoundInclusive", lv_lowerBoundInclusive_3_0 != null, "[");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUddl.g:4848:3: ( (lv_lowerBound_4_0= RULE_FLOAT ) )
            // InternalUddl.g:4849:4: (lv_lowerBound_4_0= RULE_FLOAT )
            {
            // InternalUddl.g:4849:4: (lv_lowerBound_4_0= RULE_FLOAT )
            // InternalUddl.g:4850:5: lv_lowerBound_4_0= RULE_FLOAT
            {
            lv_lowerBound_4_0=(Token)match(input,RULE_FLOAT,FOLLOW_22); 

            					newLeafNode(lv_lowerBound_4_0, grammarAccess.getLogicalRealRangeConstraintAccess().getLowerBoundFLOATTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalRealRangeConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lowerBound",
            						lv_lowerBound_4_0,
            						"com.epistimis.uddl.Uddl.FLOAT");
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_43); 

            			newLeafNode(otherlv_5, grammarAccess.getLogicalRealRangeConstraintAccess().getColonKeyword_4());
            		
            // InternalUddl.g:4870:3: ( (lv_upperBound_6_0= RULE_FLOAT ) )
            // InternalUddl.g:4871:4: (lv_upperBound_6_0= RULE_FLOAT )
            {
            // InternalUddl.g:4871:4: (lv_upperBound_6_0= RULE_FLOAT )
            // InternalUddl.g:4872:5: lv_upperBound_6_0= RULE_FLOAT
            {
            lv_upperBound_6_0=(Token)match(input,RULE_FLOAT,FOLLOW_77); 

            					newLeafNode(lv_upperBound_6_0, grammarAccess.getLogicalRealRangeConstraintAccess().getUpperBoundFLOATTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalRealRangeConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"upperBound",
            						lv_upperBound_6_0,
            						"com.epistimis.uddl.Uddl.FLOAT");
            				

            }


            }

            // InternalUddl.g:4888:3: (otherlv_7= ')' | ( (lv_upperBoundInclusive_8_0= ']' ) ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==60) ) {
                alt106=1;
            }
            else if ( (LA106_0==29) ) {
                alt106=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // InternalUddl.g:4889:4: otherlv_7= ')'
                    {
                    otherlv_7=(Token)match(input,60,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getLogicalRealRangeConstraintAccess().getRightParenthesisKeyword_6_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUddl.g:4894:4: ( (lv_upperBoundInclusive_8_0= ']' ) )
                    {
                    // InternalUddl.g:4894:4: ( (lv_upperBoundInclusive_8_0= ']' ) )
                    // InternalUddl.g:4895:5: (lv_upperBoundInclusive_8_0= ']' )
                    {
                    // InternalUddl.g:4895:5: (lv_upperBoundInclusive_8_0= ']' )
                    // InternalUddl.g:4896:6: lv_upperBoundInclusive_8_0= ']'
                    {
                    lv_upperBoundInclusive_8_0=(Token)match(input,29,FOLLOW_12); 

                    						newLeafNode(lv_upperBoundInclusive_8_0, grammarAccess.getLogicalRealRangeConstraintAccess().getUpperBoundInclusiveRightSquareBracketKeyword_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalRealRangeConstraintRule());
                    						}
                    						setWithLastConsumed(current, "upperBoundInclusive", lv_upperBoundInclusive_8_0 != null, "]");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUddl.g:4909:3: ( (lv_description_9_0= RULE_STRING ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==RULE_STRING) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalUddl.g:4910:4: (lv_description_9_0= RULE_STRING )
                    {
                    // InternalUddl.g:4910:4: (lv_description_9_0= RULE_STRING )
                    // InternalUddl.g:4911:5: lv_description_9_0= RULE_STRING
                    {
                    lv_description_9_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    					newLeafNode(lv_description_9_0, grammarAccess.getLogicalRealRangeConstraintAccess().getDescriptionSTRINGTerminalRuleCall_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalRealRangeConstraintRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_9_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLogicalRealRangeConstraintAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleLogicalRealRangeConstraint"


    // $ANTLR start "entryRuleLogicalStringConstraint"
    // InternalUddl.g:4935:1: entryRuleLogicalStringConstraint returns [EObject current=null] : iv_ruleLogicalStringConstraint= ruleLogicalStringConstraint EOF ;
    public final EObject entryRuleLogicalStringConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalStringConstraint = null;


        try {
            // InternalUddl.g:4935:64: (iv_ruleLogicalStringConstraint= ruleLogicalStringConstraint EOF )
            // InternalUddl.g:4936:2: iv_ruleLogicalStringConstraint= ruleLogicalStringConstraint EOF
            {
             newCompositeNode(grammarAccess.getLogicalStringConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalStringConstraint=ruleLogicalStringConstraint();

            state._fsp--;

             current =iv_ruleLogicalStringConstraint; 
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
    // $ANTLR end "entryRuleLogicalStringConstraint"


    // $ANTLR start "ruleLogicalStringConstraint"
    // InternalUddl.g:4942:1: ruleLogicalStringConstraint returns [EObject current=null] : (this_LogicalRegularExpressionConstraint_0= ruleLogicalRegularExpressionConstraint | this_LogicalFixedLengthStringConstraint_1= ruleLogicalFixedLengthStringConstraint ) ;
    public final EObject ruleLogicalStringConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalRegularExpressionConstraint_0 = null;

        EObject this_LogicalFixedLengthStringConstraint_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:4948:2: ( (this_LogicalRegularExpressionConstraint_0= ruleLogicalRegularExpressionConstraint | this_LogicalFixedLengthStringConstraint_1= ruleLogicalFixedLengthStringConstraint ) )
            // InternalUddl.g:4949:2: (this_LogicalRegularExpressionConstraint_0= ruleLogicalRegularExpressionConstraint | this_LogicalFixedLengthStringConstraint_1= ruleLogicalFixedLengthStringConstraint )
            {
            // InternalUddl.g:4949:2: (this_LogicalRegularExpressionConstraint_0= ruleLogicalRegularExpressionConstraint | this_LogicalFixedLengthStringConstraint_1= ruleLogicalFixedLengthStringConstraint )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==83) ) {
                alt108=1;
            }
            else if ( (LA108_0==84) ) {
                alt108=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // InternalUddl.g:4950:3: this_LogicalRegularExpressionConstraint_0= ruleLogicalRegularExpressionConstraint
                    {

                    			newCompositeNode(grammarAccess.getLogicalStringConstraintAccess().getLogicalRegularExpressionConstraintParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalRegularExpressionConstraint_0=ruleLogicalRegularExpressionConstraint();

                    state._fsp--;


                    			current = this_LogicalRegularExpressionConstraint_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:4959:3: this_LogicalFixedLengthStringConstraint_1= ruleLogicalFixedLengthStringConstraint
                    {

                    			newCompositeNode(grammarAccess.getLogicalStringConstraintAccess().getLogicalFixedLengthStringConstraintParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalFixedLengthStringConstraint_1=ruleLogicalFixedLengthStringConstraint();

                    state._fsp--;


                    			current = this_LogicalFixedLengthStringConstraint_1;
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
    // $ANTLR end "ruleLogicalStringConstraint"


    // $ANTLR start "entryRuleLogicalRegularExpressionConstraint"
    // InternalUddl.g:4971:1: entryRuleLogicalRegularExpressionConstraint returns [EObject current=null] : iv_ruleLogicalRegularExpressionConstraint= ruleLogicalRegularExpressionConstraint EOF ;
    public final EObject entryRuleLogicalRegularExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRegularExpressionConstraint = null;


        try {
            // InternalUddl.g:4971:75: (iv_ruleLogicalRegularExpressionConstraint= ruleLogicalRegularExpressionConstraint EOF )
            // InternalUddl.g:4972:2: iv_ruleLogicalRegularExpressionConstraint= ruleLogicalRegularExpressionConstraint EOF
            {
             newCompositeNode(grammarAccess.getLogicalRegularExpressionConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalRegularExpressionConstraint=ruleLogicalRegularExpressionConstraint();

            state._fsp--;

             current =iv_ruleLogicalRegularExpressionConstraint; 
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
    // $ANTLR end "entryRuleLogicalRegularExpressionConstraint"


    // $ANTLR start "ruleLogicalRegularExpressionConstraint"
    // InternalUddl.g:4978:1: ruleLogicalRegularExpressionConstraint returns [EObject current=null] : (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_expression_3_0= RULE_STRING ) ) otherlv_4= ']' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';' ) ;
    public final EObject ruleLogicalRegularExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_expression_3_0=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalUddl.g:4984:2: ( (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_expression_3_0= RULE_STRING ) ) otherlv_4= ']' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';' ) )
            // InternalUddl.g:4985:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_expression_3_0= RULE_STRING ) ) otherlv_4= ']' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';' )
            {
            // InternalUddl.g:4985:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_expression_3_0= RULE_STRING ) ) otherlv_4= ']' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';' )
            // InternalUddl.g:4986:3: otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_expression_3_0= RULE_STRING ) ) otherlv_4= ']' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,83,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalRegularExpressionConstraintAccess().getRecKeyword_0());
            		
            // InternalUddl.g:4990:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:4991:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:4991:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:4992:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalRegularExpressionConstraintAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalRegularExpressionConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getLogicalRegularExpressionConstraintAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalUddl.g:5012:3: ( (lv_expression_3_0= RULE_STRING ) )
            // InternalUddl.g:5013:4: (lv_expression_3_0= RULE_STRING )
            {
            // InternalUddl.g:5013:4: (lv_expression_3_0= RULE_STRING )
            // InternalUddl.g:5014:5: lv_expression_3_0= RULE_STRING
            {
            lv_expression_3_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_expression_3_0, grammarAccess.getLogicalRegularExpressionConstraintAccess().getExpressionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalRegularExpressionConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getLogicalRegularExpressionConstraintAccess().getRightSquareBracketKeyword_4());
            		
            // InternalUddl.g:5034:3: ( (lv_description_5_0= RULE_STRING ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==RULE_STRING) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalUddl.g:5035:4: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalUddl.g:5035:4: (lv_description_5_0= RULE_STRING )
                    // InternalUddl.g:5036:5: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    					newLeafNode(lv_description_5_0, grammarAccess.getLogicalRegularExpressionConstraintAccess().getDescriptionSTRINGTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalRegularExpressionConstraintRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_5_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLogicalRegularExpressionConstraintAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleLogicalRegularExpressionConstraint"


    // $ANTLR start "entryRuleLogicalFixedLengthStringConstraint"
    // InternalUddl.g:5060:1: entryRuleLogicalFixedLengthStringConstraint returns [EObject current=null] : iv_ruleLogicalFixedLengthStringConstraint= ruleLogicalFixedLengthStringConstraint EOF ;
    public final EObject entryRuleLogicalFixedLengthStringConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalFixedLengthStringConstraint = null;


        try {
            // InternalUddl.g:5060:75: (iv_ruleLogicalFixedLengthStringConstraint= ruleLogicalFixedLengthStringConstraint EOF )
            // InternalUddl.g:5061:2: iv_ruleLogicalFixedLengthStringConstraint= ruleLogicalFixedLengthStringConstraint EOF
            {
             newCompositeNode(grammarAccess.getLogicalFixedLengthStringConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalFixedLengthStringConstraint=ruleLogicalFixedLengthStringConstraint();

            state._fsp--;

             current =iv_ruleLogicalFixedLengthStringConstraint; 
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
    // $ANTLR end "entryRuleLogicalFixedLengthStringConstraint"


    // $ANTLR start "ruleLogicalFixedLengthStringConstraint"
    // InternalUddl.g:5067:1: ruleLogicalFixedLengthStringConstraint returns [EObject current=null] : (otherlv_0= 'flsc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_length_3_0= RULE_INT ) ) otherlv_4= ']' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';' ) ;
    public final EObject ruleLogicalFixedLengthStringConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_length_3_0=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalUddl.g:5073:2: ( (otherlv_0= 'flsc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_length_3_0= RULE_INT ) ) otherlv_4= ']' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';' ) )
            // InternalUddl.g:5074:2: (otherlv_0= 'flsc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_length_3_0= RULE_INT ) ) otherlv_4= ']' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';' )
            {
            // InternalUddl.g:5074:2: (otherlv_0= 'flsc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_length_3_0= RULE_INT ) ) otherlv_4= ']' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';' )
            // InternalUddl.g:5075:3: otherlv_0= 'flsc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_length_3_0= RULE_INT ) ) otherlv_4= ']' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalFixedLengthStringConstraintAccess().getFlscKeyword_0());
            		
            // InternalUddl.g:5079:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:5080:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:5080:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:5081:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalFixedLengthStringConstraintAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalFixedLengthStringConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getLogicalFixedLengthStringConstraintAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalUddl.g:5101:3: ( (lv_length_3_0= RULE_INT ) )
            // InternalUddl.g:5102:4: (lv_length_3_0= RULE_INT )
            {
            // InternalUddl.g:5102:4: (lv_length_3_0= RULE_INT )
            // InternalUddl.g:5103:5: lv_length_3_0= RULE_INT
            {
            lv_length_3_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_length_3_0, grammarAccess.getLogicalFixedLengthStringConstraintAccess().getLengthINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalFixedLengthStringConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"length",
            						lv_length_3_0,
            						"com.epistimis.uddl.Uddl.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getLogicalFixedLengthStringConstraintAccess().getRightSquareBracketKeyword_4());
            		
            // InternalUddl.g:5123:3: ( (lv_description_5_0= RULE_STRING ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==RULE_STRING) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalUddl.g:5124:4: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalUddl.g:5124:4: (lv_description_5_0= RULE_STRING )
                    // InternalUddl.g:5125:5: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    					newLeafNode(lv_description_5_0, grammarAccess.getLogicalFixedLengthStringConstraintAccess().getDescriptionSTRINGTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalFixedLengthStringConstraintRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_5_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLogicalFixedLengthStringConstraintAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleLogicalFixedLengthStringConstraint"


    // $ANTLR start "entryRuleLogicalEnumerationConstraint"
    // InternalUddl.g:5149:1: entryRuleLogicalEnumerationConstraint returns [EObject current=null] : iv_ruleLogicalEnumerationConstraint= ruleLogicalEnumerationConstraint EOF ;
    public final EObject entryRuleLogicalEnumerationConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalEnumerationConstraint = null;


        try {
            // InternalUddl.g:5149:69: (iv_ruleLogicalEnumerationConstraint= ruleLogicalEnumerationConstraint EOF )
            // InternalUddl.g:5150:2: iv_ruleLogicalEnumerationConstraint= ruleLogicalEnumerationConstraint EOF
            {
             newCompositeNode(grammarAccess.getLogicalEnumerationConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalEnumerationConstraint=ruleLogicalEnumerationConstraint();

            state._fsp--;

             current =iv_ruleLogicalEnumerationConstraint; 
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
    // $ANTLR end "entryRuleLogicalEnumerationConstraint"


    // $ANTLR start "ruleLogicalEnumerationConstraint"
    // InternalUddl.g:5156:1: ruleLogicalEnumerationConstraint returns [EObject current=null] : ( () otherlv_1= 'ec' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= '[' ( ( ruleQN ) )+ otherlv_6= ']' )? ) ;
    public final EObject ruleLogicalEnumerationConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalUddl.g:5162:2: ( ( () otherlv_1= 'ec' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= '[' ( ( ruleQN ) )+ otherlv_6= ']' )? ) )
            // InternalUddl.g:5163:2: ( () otherlv_1= 'ec' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= '[' ( ( ruleQN ) )+ otherlv_6= ']' )? )
            {
            // InternalUddl.g:5163:2: ( () otherlv_1= 'ec' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= '[' ( ( ruleQN ) )+ otherlv_6= ']' )? )
            // InternalUddl.g:5164:3: () otherlv_1= 'ec' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= '[' ( ( ruleQN ) )+ otherlv_6= ']' )?
            {
            // InternalUddl.g:5164:3: ()
            // InternalUddl.g:5165:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLogicalEnumerationConstraintAccess().getLogicalEnumerationConstraintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,85,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLogicalEnumerationConstraintAccess().getEcKeyword_1());
            		
            // InternalUddl.g:5175:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUddl.g:5176:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUddl.g:5176:4: (lv_name_2_0= RULE_ID )
            // InternalUddl.g:5177:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_78); 

            					newLeafNode(lv_name_2_0, grammarAccess.getLogicalEnumerationConstraintAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalEnumerationConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:5193:3: ( (lv_description_3_0= RULE_STRING ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==RULE_STRING) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalUddl.g:5194:4: (lv_description_3_0= RULE_STRING )
                    {
                    // InternalUddl.g:5194:4: (lv_description_3_0= RULE_STRING )
                    // InternalUddl.g:5195:5: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_79); 

                    					newLeafNode(lv_description_3_0, grammarAccess.getLogicalEnumerationConstraintAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalEnumerationConstraintRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_3_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:5211:3: (otherlv_4= '[' ( ( ruleQN ) )+ otherlv_6= ']' )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==28) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalUddl.g:5212:4: otherlv_4= '[' ( ( ruleQN ) )+ otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getLogicalEnumerationConstraintAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalUddl.g:5216:4: ( ( ruleQN ) )+
                    int cnt112=0;
                    loop112:
                    do {
                        int alt112=2;
                        int LA112_0 = input.LA(1);

                        if ( (LA112_0==RULE_ID) ) {
                            alt112=1;
                        }


                        switch (alt112) {
                    	case 1 :
                    	    // InternalUddl.g:5217:5: ( ruleQN )
                    	    {
                    	    // InternalUddl.g:5217:5: ( ruleQN )
                    	    // InternalUddl.g:5218:6: ruleQN
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getLogicalEnumerationConstraintRule());
                    	    						}
                    	    					

                    	    						newCompositeNode(grammarAccess.getLogicalEnumerationConstraintAccess().getAllowedValueLogicalEnumerationLabelCrossReference_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    ruleQN();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt112 >= 1 ) break loop112;
                                EarlyExitException eee =
                                    new EarlyExitException(112, input);
                                throw eee;
                        }
                        cnt112++;
                    } while (true);

                    otherlv_6=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getLogicalEnumerationConstraintAccess().getRightSquareBracketKeyword_4_2());
                    			

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
    // $ANTLR end "ruleLogicalEnumerationConstraint"


    // $ANTLR start "entryRuleLogicalMeasurementConstraint"
    // InternalUddl.g:5241:1: entryRuleLogicalMeasurementConstraint returns [EObject current=null] : iv_ruleLogicalMeasurementConstraint= ruleLogicalMeasurementConstraint EOF ;
    public final EObject entryRuleLogicalMeasurementConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalMeasurementConstraint = null;


        try {
            // InternalUddl.g:5241:69: (iv_ruleLogicalMeasurementConstraint= ruleLogicalMeasurementConstraint EOF )
            // InternalUddl.g:5242:2: iv_ruleLogicalMeasurementConstraint= ruleLogicalMeasurementConstraint EOF
            {
             newCompositeNode(grammarAccess.getLogicalMeasurementConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalMeasurementConstraint=ruleLogicalMeasurementConstraint();

            state._fsp--;

             current =iv_ruleLogicalMeasurementConstraint; 
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
    // $ANTLR end "entryRuleLogicalMeasurementConstraint"


    // $ANTLR start "ruleLogicalMeasurementConstraint"
    // InternalUddl.g:5248:1: ruleLogicalMeasurementConstraint returns [EObject current=null] : ( (lv_constraintText_0_0= RULE_STRING ) ) ;
    public final EObject ruleLogicalMeasurementConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_constraintText_0_0=null;


        	enterRule();

        try {
            // InternalUddl.g:5254:2: ( ( (lv_constraintText_0_0= RULE_STRING ) ) )
            // InternalUddl.g:5255:2: ( (lv_constraintText_0_0= RULE_STRING ) )
            {
            // InternalUddl.g:5255:2: ( (lv_constraintText_0_0= RULE_STRING ) )
            // InternalUddl.g:5256:3: (lv_constraintText_0_0= RULE_STRING )
            {
            // InternalUddl.g:5256:3: (lv_constraintText_0_0= RULE_STRING )
            // InternalUddl.g:5257:4: lv_constraintText_0_0= RULE_STRING
            {
            lv_constraintText_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_constraintText_0_0, grammarAccess.getLogicalMeasurementConstraintAccess().getConstraintTextSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLogicalMeasurementConstraintRule());
            				}
            				setWithLastConsumed(
            					current,
            					"constraintText",
            					lv_constraintText_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleLogicalMeasurementConstraint"


    // $ANTLR start "entryRuleLogicalMeasurementSystemConversion"
    // InternalUddl.g:5276:1: entryRuleLogicalMeasurementSystemConversion returns [EObject current=null] : iv_ruleLogicalMeasurementSystemConversion= ruleLogicalMeasurementSystemConversion EOF ;
    public final EObject entryRuleLogicalMeasurementSystemConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalMeasurementSystemConversion = null;


        try {
            // InternalUddl.g:5276:75: (iv_ruleLogicalMeasurementSystemConversion= ruleLogicalMeasurementSystemConversion EOF )
            // InternalUddl.g:5277:2: iv_ruleLogicalMeasurementSystemConversion= ruleLogicalMeasurementSystemConversion EOF
            {
             newCompositeNode(grammarAccess.getLogicalMeasurementSystemConversionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalMeasurementSystemConversion=ruleLogicalMeasurementSystemConversion();

            state._fsp--;

             current =iv_ruleLogicalMeasurementSystemConversion; 
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
    // $ANTLR end "entryRuleLogicalMeasurementSystemConversion"


    // $ANTLR start "ruleLogicalMeasurementSystemConversion"
    // InternalUddl.g:5283:1: ruleLogicalMeasurementSystemConversion returns [EObject current=null] : (otherlv_0= 'msc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' ( (lv_equation_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) ) )? otherlv_9= ')>' ( ( ruleQN ) ) otherlv_11= 'loss:' ( (lv_conversionLossDescription_12_0= RULE_STRING ) ) otherlv_13= '};' ) ;
    public final EObject ruleLogicalMeasurementSystemConversion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_equation_6_0=null;
        Token otherlv_7=null;
        Token lv_equation_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_conversionLossDescription_12_0=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalUddl.g:5289:2: ( (otherlv_0= 'msc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' ( (lv_equation_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) ) )? otherlv_9= ')>' ( ( ruleQN ) ) otherlv_11= 'loss:' ( (lv_conversionLossDescription_12_0= RULE_STRING ) ) otherlv_13= '};' ) )
            // InternalUddl.g:5290:2: (otherlv_0= 'msc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' ( (lv_equation_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) ) )? otherlv_9= ')>' ( ( ruleQN ) ) otherlv_11= 'loss:' ( (lv_conversionLossDescription_12_0= RULE_STRING ) ) otherlv_13= '};' )
            {
            // InternalUddl.g:5290:2: (otherlv_0= 'msc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' ( (lv_equation_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) ) )? otherlv_9= ')>' ( ( ruleQN ) ) otherlv_11= 'loss:' ( (lv_conversionLossDescription_12_0= RULE_STRING ) ) otherlv_13= '};' )
            // InternalUddl.g:5291:3: otherlv_0= 'msc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' ( (lv_equation_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) ) )? otherlv_9= ')>' ( ( ruleQN ) ) otherlv_11= 'loss:' ( (lv_conversionLossDescription_12_0= RULE_STRING ) ) otherlv_13= '};'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalMeasurementSystemConversionAccess().getMscKeyword_0());
            		
            // InternalUddl.g:5295:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:5296:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:5296:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:5297:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalMeasurementSystemConversionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementSystemConversionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:5313:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==RULE_STRING) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalUddl.g:5314:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:5314:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:5315:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalMeasurementSystemConversionAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalMeasurementSystemConversionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalMeasurementSystemConversionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUddl.g:5335:3: ( ( ruleQN ) )
            // InternalUddl.g:5336:4: ( ruleQN )
            {
            // InternalUddl.g:5336:4: ( ruleQN )
            // InternalUddl.g:5337:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementSystemConversionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalMeasurementSystemConversionAccess().getSourceLogicalMeasurementSystemCrossReference_4_0());
            				
            pushFollow(FOLLOW_41);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,45,FOLLOW_37); 

            			newLeafNode(otherlv_5, grammarAccess.getLogicalMeasurementSystemConversionAccess().getHyphenMinusLeftParenthesisKeyword_5());
            		
            // InternalUddl.g:5355:3: ( (lv_equation_6_0= RULE_STRING ) )
            // InternalUddl.g:5356:4: (lv_equation_6_0= RULE_STRING )
            {
            // InternalUddl.g:5356:4: (lv_equation_6_0= RULE_STRING )
            // InternalUddl.g:5357:5: lv_equation_6_0= RULE_STRING
            {
            lv_equation_6_0=(Token)match(input,RULE_STRING,FOLLOW_80); 

            					newLeafNode(lv_equation_6_0, grammarAccess.getLogicalMeasurementSystemConversionAccess().getEquationSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementSystemConversionRule());
            					}
            					addWithLastConsumed(
            						current,
            						"equation",
            						lv_equation_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalUddl.g:5373:3: (otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==58) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalUddl.g:5374:4: otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,58,FOLLOW_37); 

                    				newLeafNode(otherlv_7, grammarAccess.getLogicalMeasurementSystemConversionAccess().getCommaKeyword_7_0());
                    			
                    // InternalUddl.g:5378:4: ( (lv_equation_8_0= RULE_STRING ) )
                    // InternalUddl.g:5379:5: (lv_equation_8_0= RULE_STRING )
                    {
                    // InternalUddl.g:5379:5: (lv_equation_8_0= RULE_STRING )
                    // InternalUddl.g:5380:6: lv_equation_8_0= RULE_STRING
                    {
                    lv_equation_8_0=(Token)match(input,RULE_STRING,FOLLOW_81); 

                    						newLeafNode(lv_equation_8_0, grammarAccess.getLogicalMeasurementSystemConversionAccess().getEquationSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalMeasurementSystemConversionRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"equation",
                    							lv_equation_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,87,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getLogicalMeasurementSystemConversionAccess().getRightParenthesisGreaterThanSignKeyword_8());
            		
            // InternalUddl.g:5401:3: ( ( ruleQN ) )
            // InternalUddl.g:5402:4: ( ruleQN )
            {
            // InternalUddl.g:5402:4: ( ruleQN )
            // InternalUddl.g:5403:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementSystemConversionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalMeasurementSystemConversionAccess().getDestinationLogicalMeasurementSystemCrossReference_9_0());
            				
            pushFollow(FOLLOW_82);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,88,FOLLOW_37); 

            			newLeafNode(otherlv_11, grammarAccess.getLogicalMeasurementSystemConversionAccess().getLossKeyword_10());
            		
            // InternalUddl.g:5421:3: ( (lv_conversionLossDescription_12_0= RULE_STRING ) )
            // InternalUddl.g:5422:4: (lv_conversionLossDescription_12_0= RULE_STRING )
            {
            // InternalUddl.g:5422:4: (lv_conversionLossDescription_12_0= RULE_STRING )
            // InternalUddl.g:5423:5: lv_conversionLossDescription_12_0= RULE_STRING
            {
            lv_conversionLossDescription_12_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_conversionLossDescription_12_0, grammarAccess.getLogicalMeasurementSystemConversionAccess().getConversionLossDescriptionSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementSystemConversionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"conversionLossDescription",
            						lv_conversionLossDescription_12_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_13=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getLogicalMeasurementSystemConversionAccess().getRightCurlyBracketSemicolonKeyword_12());
            		

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
    // $ANTLR end "ruleLogicalMeasurementSystemConversion"


    // $ANTLR start "entryRuleLogicalMeasurement"
    // InternalUddl.g:5447:1: entryRuleLogicalMeasurement returns [EObject current=null] : iv_ruleLogicalMeasurement= ruleLogicalMeasurement EOF ;
    public final EObject entryRuleLogicalMeasurement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalMeasurement = null;


        try {
            // InternalUddl.g:5447:59: (iv_ruleLogicalMeasurement= ruleLogicalMeasurement EOF )
            // InternalUddl.g:5448:2: iv_ruleLogicalMeasurement= ruleLogicalMeasurement EOF
            {
             newCompositeNode(grammarAccess.getLogicalMeasurementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalMeasurement=ruleLogicalMeasurement();

            state._fsp--;

             current =iv_ruleLogicalMeasurement; 
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
    // $ANTLR end "entryRuleLogicalMeasurement"


    // $ANTLR start "ruleLogicalMeasurement"
    // InternalUddl.g:5454:1: ruleLogicalMeasurement returns [EObject current=null] : (otherlv_0= 'meas' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= '{' ( (lv_attribute_6_0= ruleLogicalMeasurementAttribute ) )* (otherlv_7= 'axis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']' )? otherlv_11= 'sys:' ( ( ruleQN ) ) (otherlv_13= '![' ( (lv_constraint_14_0= ruleLogicalMeasurementConstraint ) ) otherlv_15= ']' )? otherlv_16= '};' ) ;
    public final EObject ruleLogicalMeasurement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_attribute_6_0 = null;

        EObject lv_constraint_14_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:5460:2: ( (otherlv_0= 'meas' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= '{' ( (lv_attribute_6_0= ruleLogicalMeasurementAttribute ) )* (otherlv_7= 'axis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']' )? otherlv_11= 'sys:' ( ( ruleQN ) ) (otherlv_13= '![' ( (lv_constraint_14_0= ruleLogicalMeasurementConstraint ) ) otherlv_15= ']' )? otherlv_16= '};' ) )
            // InternalUddl.g:5461:2: (otherlv_0= 'meas' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= '{' ( (lv_attribute_6_0= ruleLogicalMeasurementAttribute ) )* (otherlv_7= 'axis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']' )? otherlv_11= 'sys:' ( ( ruleQN ) ) (otherlv_13= '![' ( (lv_constraint_14_0= ruleLogicalMeasurementConstraint ) ) otherlv_15= ']' )? otherlv_16= '};' )
            {
            // InternalUddl.g:5461:2: (otherlv_0= 'meas' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= '{' ( (lv_attribute_6_0= ruleLogicalMeasurementAttribute ) )* (otherlv_7= 'axis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']' )? otherlv_11= 'sys:' ( ( ruleQN ) ) (otherlv_13= '![' ( (lv_constraint_14_0= ruleLogicalMeasurementConstraint ) ) otherlv_15= ']' )? otherlv_16= '};' )
            // InternalUddl.g:5462:3: otherlv_0= 'meas' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= '{' ( (lv_attribute_6_0= ruleLogicalMeasurementAttribute ) )* (otherlv_7= 'axis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']' )? otherlv_11= 'sys:' ( ( ruleQN ) ) (otherlv_13= '![' ( (lv_constraint_14_0= ruleLogicalMeasurementConstraint ) ) otherlv_15= ']' )? otherlv_16= '};'
            {
            otherlv_0=(Token)match(input,89,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalMeasurementAccess().getMeasKeyword_0());
            		
            // InternalUddl.g:5466:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:5467:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:5467:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:5468:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_83); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalMeasurementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:5484:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==RULE_STRING) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalUddl.g:5485:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:5485:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:5486:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalMeasurementAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalMeasurementRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalMeasurementAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:5506:3: ( ( ruleQN ) )
            // InternalUddl.g:5507:4: ( ruleQN )
            {
            // InternalUddl.g:5507:4: ( ruleQN )
            // InternalUddl.g:5508:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalMeasurementAccess().getRealizesConceptualObservableCrossReference_4_0());
            				
            pushFollow(FOLLOW_5);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_85); 

            			newLeafNode(otherlv_5, grammarAccess.getLogicalMeasurementAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalUddl.g:5526:3: ( (lv_attribute_6_0= ruleLogicalMeasurementAttribute ) )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==RULE_ID) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // InternalUddl.g:5527:4: (lv_attribute_6_0= ruleLogicalMeasurementAttribute )
            	    {
            	    // InternalUddl.g:5527:4: (lv_attribute_6_0= ruleLogicalMeasurementAttribute )
            	    // InternalUddl.g:5528:5: lv_attribute_6_0= ruleLogicalMeasurementAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getLogicalMeasurementAccess().getAttributeLogicalMeasurementAttributeParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_85);
            	    lv_attribute_6_0=ruleLogicalMeasurementAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLogicalMeasurementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attribute",
            	    						lv_attribute_6_0,
            	    						"com.epistimis.uddl.Uddl.LogicalMeasurementAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);

            // InternalUddl.g:5545:3: (otherlv_7= 'axis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']' )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==62) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalUddl.g:5546:4: otherlv_7= 'axis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']'
                    {
                    otherlv_7=(Token)match(input,62,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getLogicalMeasurementAccess().getAxisKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getLogicalMeasurementAccess().getLeftSquareBracketKeyword_7_1());
                    			
                    // InternalUddl.g:5554:4: ( ( ruleQN ) )+
                    int cnt118=0;
                    loop118:
                    do {
                        int alt118=2;
                        int LA118_0 = input.LA(1);

                        if ( (LA118_0==RULE_ID) ) {
                            alt118=1;
                        }


                        switch (alt118) {
                    	case 1 :
                    	    // InternalUddl.g:5555:5: ( ruleQN )
                    	    {
                    	    // InternalUddl.g:5555:5: ( ruleQN )
                    	    // InternalUddl.g:5556:6: ruleQN
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getLogicalMeasurementRule());
                    	    						}
                    	    					

                    	    						newCompositeNode(grammarAccess.getLogicalMeasurementAccess().getMeasurementAxisLogicalMeasurementAxisCrossReference_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    ruleQN();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt118 >= 1 ) break loop118;
                                EarlyExitException eee =
                                    new EarlyExitException(118, input);
                                throw eee;
                        }
                        cnt118++;
                    } while (true);

                    otherlv_10=(Token)match(input,29,FOLLOW_86); 

                    				newLeafNode(otherlv_10, grammarAccess.getLogicalMeasurementAccess().getRightSquareBracketKeyword_7_3());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,91,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getLogicalMeasurementAccess().getSysKeyword_8());
            		
            // InternalUddl.g:5579:3: ( ( ruleQN ) )
            // InternalUddl.g:5580:4: ( ruleQN )
            {
            // InternalUddl.g:5580:4: ( ruleQN )
            // InternalUddl.g:5581:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalMeasurementAccess().getMeasurementSystemLogicalAbstractMeasurementSystemCrossReference_9_0());
            				
            pushFollow(FOLLOW_64);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:5595:3: (otherlv_13= '![' ( (lv_constraint_14_0= ruleLogicalMeasurementConstraint ) ) otherlv_15= ']' )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==75) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalUddl.g:5596:4: otherlv_13= '![' ( (lv_constraint_14_0= ruleLogicalMeasurementConstraint ) ) otherlv_15= ']'
                    {
                    otherlv_13=(Token)match(input,75,FOLLOW_37); 

                    				newLeafNode(otherlv_13, grammarAccess.getLogicalMeasurementAccess().getExclamationMarkLeftSquareBracketKeyword_10_0());
                    			
                    // InternalUddl.g:5600:4: ( (lv_constraint_14_0= ruleLogicalMeasurementConstraint ) )
                    // InternalUddl.g:5601:5: (lv_constraint_14_0= ruleLogicalMeasurementConstraint )
                    {
                    // InternalUddl.g:5601:5: (lv_constraint_14_0= ruleLogicalMeasurementConstraint )
                    // InternalUddl.g:5602:6: lv_constraint_14_0= ruleLogicalMeasurementConstraint
                    {

                    						newCompositeNode(grammarAccess.getLogicalMeasurementAccess().getConstraintLogicalMeasurementConstraintParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_constraint_14_0=ruleLogicalMeasurementConstraint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogicalMeasurementRule());
                    						}
                    						add(
                    							current,
                    							"constraint",
                    							lv_constraint_14_0,
                    							"com.epistimis.uddl.Uddl.LogicalMeasurementConstraint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_15, grammarAccess.getLogicalMeasurementAccess().getRightSquareBracketKeyword_10_2());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getLogicalMeasurementAccess().getRightCurlyBracketSemicolonKeyword_11());
            		

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
    // $ANTLR end "ruleLogicalMeasurement"


    // $ANTLR start "entryRuleLogicalMeasurementAxis"
    // InternalUddl.g:5632:1: entryRuleLogicalMeasurementAxis returns [EObject current=null] : iv_ruleLogicalMeasurementAxis= ruleLogicalMeasurementAxis EOF ;
    public final EObject entryRuleLogicalMeasurementAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalMeasurementAxis = null;


        try {
            // InternalUddl.g:5632:63: (iv_ruleLogicalMeasurementAxis= ruleLogicalMeasurementAxis EOF )
            // InternalUddl.g:5633:2: iv_ruleLogicalMeasurementAxis= ruleLogicalMeasurementAxis EOF
            {
             newCompositeNode(grammarAccess.getLogicalMeasurementAxisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalMeasurementAxis=ruleLogicalMeasurementAxis();

            state._fsp--;

             current =iv_ruleLogicalMeasurementAxis; 
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
    // $ANTLR end "entryRuleLogicalMeasurementAxis"


    // $ANTLR start "ruleLogicalMeasurementAxis"
    // InternalUddl.g:5639:1: ruleLogicalMeasurementAxis returns [EObject current=null] : (otherlv_0= 'maxis' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' (otherlv_6= 'vtu:' otherlv_7= '[' ( ( ruleQN ) )+ otherlv_9= ']' )? otherlv_10= 'msaxis:' ( ( ruleQN ) ) (otherlv_12= '![' ( (lv_constraint_13_0= ruleLogicalMeasurementConstraint ) )+ otherlv_14= ']' )? otherlv_15= '};' ) ;
    public final EObject ruleLogicalMeasurementAxis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_constraint_13_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:5645:2: ( (otherlv_0= 'maxis' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' (otherlv_6= 'vtu:' otherlv_7= '[' ( ( ruleQN ) )+ otherlv_9= ']' )? otherlv_10= 'msaxis:' ( ( ruleQN ) ) (otherlv_12= '![' ( (lv_constraint_13_0= ruleLogicalMeasurementConstraint ) )+ otherlv_14= ']' )? otherlv_15= '};' ) )
            // InternalUddl.g:5646:2: (otherlv_0= 'maxis' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' (otherlv_6= 'vtu:' otherlv_7= '[' ( ( ruleQN ) )+ otherlv_9= ']' )? otherlv_10= 'msaxis:' ( ( ruleQN ) ) (otherlv_12= '![' ( (lv_constraint_13_0= ruleLogicalMeasurementConstraint ) )+ otherlv_14= ']' )? otherlv_15= '};' )
            {
            // InternalUddl.g:5646:2: (otherlv_0= 'maxis' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' (otherlv_6= 'vtu:' otherlv_7= '[' ( ( ruleQN ) )+ otherlv_9= ']' )? otherlv_10= 'msaxis:' ( ( ruleQN ) ) (otherlv_12= '![' ( (lv_constraint_13_0= ruleLogicalMeasurementConstraint ) )+ otherlv_14= ']' )? otherlv_15= '};' )
            // InternalUddl.g:5647:3: otherlv_0= 'maxis' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' (otherlv_6= 'vtu:' otherlv_7= '[' ( ( ruleQN ) )+ otherlv_9= ']' )? otherlv_10= 'msaxis:' ( ( ruleQN ) ) (otherlv_12= '![' ( (lv_constraint_13_0= ruleLogicalMeasurementConstraint ) )+ otherlv_14= ']' )? otherlv_15= '};'
            {
            otherlv_0=(Token)match(input,92,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalMeasurementAxisAccess().getMaxisKeyword_0());
            		
            // InternalUddl.g:5651:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:5652:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:5652:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:5653:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalMeasurementAxisAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementAxisRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:5669:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==RULE_STRING) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalUddl.g:5670:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:5670:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:5671:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalMeasurementAxisAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalMeasurementAxisRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:5687:3: (otherlv_3= '->' ( ( ruleQN ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==90) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalUddl.g:5688:4: otherlv_3= '->' ( ( ruleQN ) )
                    {
                    otherlv_3=(Token)match(input,90,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getLogicalMeasurementAxisAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                    			
                    // InternalUddl.g:5692:4: ( ( ruleQN ) )
                    // InternalUddl.g:5693:5: ( ruleQN )
                    {
                    // InternalUddl.g:5693:5: ( ruleQN )
                    // InternalUddl.g:5694:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalMeasurementAxisRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLogicalMeasurementAxisAccess().getRealizesConceptualObservableCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_89); 

            			newLeafNode(otherlv_5, grammarAccess.getLogicalMeasurementAxisAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalUddl.g:5713:3: (otherlv_6= 'vtu:' otherlv_7= '[' ( ( ruleQN ) )+ otherlv_9= ']' )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==77) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalUddl.g:5714:4: otherlv_6= 'vtu:' otherlv_7= '[' ( ( ruleQN ) )+ otherlv_9= ']'
                    {
                    otherlv_6=(Token)match(input,77,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getLogicalMeasurementAxisAccess().getVtuKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getLogicalMeasurementAxisAccess().getLeftSquareBracketKeyword_5_1());
                    			
                    // InternalUddl.g:5722:4: ( ( ruleQN ) )+
                    int cnt123=0;
                    loop123:
                    do {
                        int alt123=2;
                        int LA123_0 = input.LA(1);

                        if ( (LA123_0==RULE_ID) ) {
                            alt123=1;
                        }


                        switch (alt123) {
                    	case 1 :
                    	    // InternalUddl.g:5723:5: ( ruleQN )
                    	    {
                    	    // InternalUddl.g:5723:5: ( ruleQN )
                    	    // InternalUddl.g:5724:6: ruleQN
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getLogicalMeasurementAxisRule());
                    	    						}
                    	    					

                    	    						newCompositeNode(grammarAccess.getLogicalMeasurementAxisAccess().getValueTypeUnitLogicalValueTypeUnitCrossReference_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    ruleQN();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt123 >= 1 ) break loop123;
                                EarlyExitException eee =
                                    new EarlyExitException(123, input);
                                throw eee;
                        }
                        cnt123++;
                    } while (true);

                    otherlv_9=(Token)match(input,29,FOLLOW_90); 

                    				newLeafNode(otherlv_9, grammarAccess.getLogicalMeasurementAxisAccess().getRightSquareBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,93,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getLogicalMeasurementAxisAccess().getMsaxisKeyword_6());
            		
            // InternalUddl.g:5747:3: ( ( ruleQN ) )
            // InternalUddl.g:5748:4: ( ruleQN )
            {
            // InternalUddl.g:5748:4: ( ruleQN )
            // InternalUddl.g:5749:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementAxisRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalMeasurementAxisAccess().getMeasurementSystemAxisLogicalMeasurementSystemAxisCrossReference_7_0());
            				
            pushFollow(FOLLOW_64);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:5763:3: (otherlv_12= '![' ( (lv_constraint_13_0= ruleLogicalMeasurementConstraint ) )+ otherlv_14= ']' )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==75) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalUddl.g:5764:4: otherlv_12= '![' ( (lv_constraint_13_0= ruleLogicalMeasurementConstraint ) )+ otherlv_14= ']'
                    {
                    otherlv_12=(Token)match(input,75,FOLLOW_37); 

                    				newLeafNode(otherlv_12, grammarAccess.getLogicalMeasurementAxisAccess().getExclamationMarkLeftSquareBracketKeyword_8_0());
                    			
                    // InternalUddl.g:5768:4: ( (lv_constraint_13_0= ruleLogicalMeasurementConstraint ) )+
                    int cnt125=0;
                    loop125:
                    do {
                        int alt125=2;
                        int LA125_0 = input.LA(1);

                        if ( (LA125_0==RULE_STRING) ) {
                            alt125=1;
                        }


                        switch (alt125) {
                    	case 1 :
                    	    // InternalUddl.g:5769:5: (lv_constraint_13_0= ruleLogicalMeasurementConstraint )
                    	    {
                    	    // InternalUddl.g:5769:5: (lv_constraint_13_0= ruleLogicalMeasurementConstraint )
                    	    // InternalUddl.g:5770:6: lv_constraint_13_0= ruleLogicalMeasurementConstraint
                    	    {

                    	    						newCompositeNode(grammarAccess.getLogicalMeasurementAxisAccess().getConstraintLogicalMeasurementConstraintParserRuleCall_8_1_0());
                    	    					
                    	    pushFollow(FOLLOW_65);
                    	    lv_constraint_13_0=ruleLogicalMeasurementConstraint();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLogicalMeasurementAxisRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"constraint",
                    	    							lv_constraint_13_0,
                    	    							"com.epistimis.uddl.Uddl.LogicalMeasurementConstraint");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt125 >= 1 ) break loop125;
                                EarlyExitException eee =
                                    new EarlyExitException(125, input);
                                throw eee;
                        }
                        cnt125++;
                    } while (true);

                    otherlv_14=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_14, grammarAccess.getLogicalMeasurementAxisAccess().getRightSquareBracketKeyword_8_2());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getLogicalMeasurementAxisAccess().getRightCurlyBracketSemicolonKeyword_9());
            		

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
    // $ANTLR end "ruleLogicalMeasurementAxis"


    // $ANTLR start "entryRuleLogicalMeasurementAttribute"
    // InternalUddl.g:5800:1: entryRuleLogicalMeasurementAttribute returns [EObject current=null] : iv_ruleLogicalMeasurementAttribute= ruleLogicalMeasurementAttribute EOF ;
    public final EObject entryRuleLogicalMeasurementAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalMeasurementAttribute = null;


        try {
            // InternalUddl.g:5800:68: (iv_ruleLogicalMeasurementAttribute= ruleLogicalMeasurementAttribute EOF )
            // InternalUddl.g:5801:2: iv_ruleLogicalMeasurementAttribute= ruleLogicalMeasurementAttribute EOF
            {
             newCompositeNode(grammarAccess.getLogicalMeasurementAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalMeasurementAttribute=ruleLogicalMeasurementAttribute();

            state._fsp--;

             current =iv_ruleLogicalMeasurementAttribute; 
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
    // $ANTLR end "entryRuleLogicalMeasurementAttribute"


    // $ANTLR start "ruleLogicalMeasurementAttribute"
    // InternalUddl.g:5807:1: ruleLogicalMeasurementAttribute returns [EObject current=null] : ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleLogicalMeasurementAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_rolename_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalUddl.g:5813:2: ( ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalUddl.g:5814:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalUddl.g:5814:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalUddl.g:5815:3: ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // InternalUddl.g:5815:3: ( ( ruleQN ) )
            // InternalUddl.g:5816:4: ( ruleQN )
            {
            // InternalUddl.g:5816:4: ( ruleQN )
            // InternalUddl.g:5817:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalMeasurementAttributeAccess().getTypeLogicalMeasurementCrossReference_0_0());
            				
            pushFollow(FOLLOW_3);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:5831:3: ( (lv_rolename_1_0= RULE_ID ) )
            // InternalUddl.g:5832:4: (lv_rolename_1_0= RULE_ID )
            {
            // InternalUddl.g:5832:4: (lv_rolename_1_0= RULE_ID )
            // InternalUddl.g:5833:5: lv_rolename_1_0= RULE_ID
            {
            lv_rolename_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_rolename_1_0, grammarAccess.getLogicalMeasurementAttributeAccess().getRolenameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rolename",
            						lv_rolename_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getLogicalMeasurementAttributeAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleLogicalMeasurementAttribute"


    // $ANTLR start "entryRuleLogicalMeasurementConversion"
    // InternalUddl.g:5857:1: entryRuleLogicalMeasurementConversion returns [EObject current=null] : iv_ruleLogicalMeasurementConversion= ruleLogicalMeasurementConversion EOF ;
    public final EObject entryRuleLogicalMeasurementConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalMeasurementConversion = null;


        try {
            // InternalUddl.g:5857:69: (iv_ruleLogicalMeasurementConversion= ruleLogicalMeasurementConversion EOF )
            // InternalUddl.g:5858:2: iv_ruleLogicalMeasurementConversion= ruleLogicalMeasurementConversion EOF
            {
             newCompositeNode(grammarAccess.getLogicalMeasurementConversionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalMeasurementConversion=ruleLogicalMeasurementConversion();

            state._fsp--;

             current =iv_ruleLogicalMeasurementConversion; 
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
    // $ANTLR end "entryRuleLogicalMeasurementConversion"


    // $ANTLR start "ruleLogicalMeasurementConversion"
    // InternalUddl.g:5864:1: ruleLogicalMeasurementConversion returns [EObject current=null] : (otherlv_0= 'mc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' ( (lv_equation_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) ) )? otherlv_9= ')>' ( ( ruleQN ) ) otherlv_11= 'loss:' ( (lv_conversionLossDescription_12_0= RULE_STRING ) ) otherlv_13= '};' ) ;
    public final EObject ruleLogicalMeasurementConversion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_equation_6_0=null;
        Token otherlv_7=null;
        Token lv_equation_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_conversionLossDescription_12_0=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalUddl.g:5870:2: ( (otherlv_0= 'mc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' ( (lv_equation_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) ) )? otherlv_9= ')>' ( ( ruleQN ) ) otherlv_11= 'loss:' ( (lv_conversionLossDescription_12_0= RULE_STRING ) ) otherlv_13= '};' ) )
            // InternalUddl.g:5871:2: (otherlv_0= 'mc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' ( (lv_equation_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) ) )? otherlv_9= ')>' ( ( ruleQN ) ) otherlv_11= 'loss:' ( (lv_conversionLossDescription_12_0= RULE_STRING ) ) otherlv_13= '};' )
            {
            // InternalUddl.g:5871:2: (otherlv_0= 'mc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' ( (lv_equation_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) ) )? otherlv_9= ')>' ( ( ruleQN ) ) otherlv_11= 'loss:' ( (lv_conversionLossDescription_12_0= RULE_STRING ) ) otherlv_13= '};' )
            // InternalUddl.g:5872:3: otherlv_0= 'mc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' ( (lv_equation_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) ) )? otherlv_9= ')>' ( ( ruleQN ) ) otherlv_11= 'loss:' ( (lv_conversionLossDescription_12_0= RULE_STRING ) ) otherlv_13= '};'
            {
            otherlv_0=(Token)match(input,94,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalMeasurementConversionAccess().getMcKeyword_0());
            		
            // InternalUddl.g:5876:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:5877:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:5877:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:5878:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalMeasurementConversionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementConversionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:5894:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==RULE_STRING) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalUddl.g:5895:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:5895:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:5896:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalMeasurementConversionAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalMeasurementConversionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalMeasurementConversionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUddl.g:5916:3: ( ( ruleQN ) )
            // InternalUddl.g:5917:4: ( ruleQN )
            {
            // InternalUddl.g:5917:4: ( ruleQN )
            // InternalUddl.g:5918:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementConversionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalMeasurementConversionAccess().getSourceLogicalMeasurementSystemCrossReference_4_0());
            				
            pushFollow(FOLLOW_41);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,45,FOLLOW_37); 

            			newLeafNode(otherlv_5, grammarAccess.getLogicalMeasurementConversionAccess().getHyphenMinusLeftParenthesisKeyword_5());
            		
            // InternalUddl.g:5936:3: ( (lv_equation_6_0= RULE_STRING ) )
            // InternalUddl.g:5937:4: (lv_equation_6_0= RULE_STRING )
            {
            // InternalUddl.g:5937:4: (lv_equation_6_0= RULE_STRING )
            // InternalUddl.g:5938:5: lv_equation_6_0= RULE_STRING
            {
            lv_equation_6_0=(Token)match(input,RULE_STRING,FOLLOW_80); 

            					newLeafNode(lv_equation_6_0, grammarAccess.getLogicalMeasurementConversionAccess().getEquationSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementConversionRule());
            					}
            					addWithLastConsumed(
            						current,
            						"equation",
            						lv_equation_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalUddl.g:5954:3: (otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) ) )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==58) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalUddl.g:5955:4: otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,58,FOLLOW_37); 

                    				newLeafNode(otherlv_7, grammarAccess.getLogicalMeasurementConversionAccess().getCommaKeyword_7_0());
                    			
                    // InternalUddl.g:5959:4: ( (lv_equation_8_0= RULE_STRING ) )
                    // InternalUddl.g:5960:5: (lv_equation_8_0= RULE_STRING )
                    {
                    // InternalUddl.g:5960:5: (lv_equation_8_0= RULE_STRING )
                    // InternalUddl.g:5961:6: lv_equation_8_0= RULE_STRING
                    {
                    lv_equation_8_0=(Token)match(input,RULE_STRING,FOLLOW_81); 

                    						newLeafNode(lv_equation_8_0, grammarAccess.getLogicalMeasurementConversionAccess().getEquationSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalMeasurementConversionRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"equation",
                    							lv_equation_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,87,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getLogicalMeasurementConversionAccess().getRightParenthesisGreaterThanSignKeyword_8());
            		
            // InternalUddl.g:5982:3: ( ( ruleQN ) )
            // InternalUddl.g:5983:4: ( ruleQN )
            {
            // InternalUddl.g:5983:4: ( ruleQN )
            // InternalUddl.g:5984:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementConversionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalMeasurementConversionAccess().getDestinationLogicalMeasurementSystemCrossReference_9_0());
            				
            pushFollow(FOLLOW_82);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,88,FOLLOW_37); 

            			newLeafNode(otherlv_11, grammarAccess.getLogicalMeasurementConversionAccess().getLossKeyword_10());
            		
            // InternalUddl.g:6002:3: ( (lv_conversionLossDescription_12_0= RULE_STRING ) )
            // InternalUddl.g:6003:4: (lv_conversionLossDescription_12_0= RULE_STRING )
            {
            // InternalUddl.g:6003:4: (lv_conversionLossDescription_12_0= RULE_STRING )
            // InternalUddl.g:6004:5: lv_conversionLossDescription_12_0= RULE_STRING
            {
            lv_conversionLossDescription_12_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_conversionLossDescription_12_0, grammarAccess.getLogicalMeasurementConversionAccess().getConversionLossDescriptionSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementConversionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"conversionLossDescription",
            						lv_conversionLossDescription_12_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_13=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getLogicalMeasurementConversionAccess().getRightCurlyBracketSemicolonKeyword_12());
            		

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
    // $ANTLR end "ruleLogicalMeasurementConversion"


    // $ANTLR start "entryRuleLogicalComposableElement"
    // InternalUddl.g:6028:1: entryRuleLogicalComposableElement returns [EObject current=null] : iv_ruleLogicalComposableElement= ruleLogicalComposableElement EOF ;
    public final EObject entryRuleLogicalComposableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalComposableElement = null;


        try {
            // InternalUddl.g:6028:65: (iv_ruleLogicalComposableElement= ruleLogicalComposableElement EOF )
            // InternalUddl.g:6029:2: iv_ruleLogicalComposableElement= ruleLogicalComposableElement EOF
            {
             newCompositeNode(grammarAccess.getLogicalComposableElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalComposableElement=ruleLogicalComposableElement();

            state._fsp--;

             current =iv_ruleLogicalComposableElement; 
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
    // $ANTLR end "entryRuleLogicalComposableElement"


    // $ANTLR start "ruleLogicalComposableElement"
    // InternalUddl.g:6035:1: ruleLogicalComposableElement returns [EObject current=null] : (this_LogicalEntity_0= ruleLogicalEntity | this_LogicalMeasurement_1= ruleLogicalMeasurement ) ;
    public final EObject ruleLogicalComposableElement() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalEntity_0 = null;

        EObject this_LogicalMeasurement_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:6041:2: ( (this_LogicalEntity_0= ruleLogicalEntity | this_LogicalMeasurement_1= ruleLogicalMeasurement ) )
            // InternalUddl.g:6042:2: (this_LogicalEntity_0= ruleLogicalEntity | this_LogicalMeasurement_1= ruleLogicalMeasurement )
            {
            // InternalUddl.g:6042:2: (this_LogicalEntity_0= ruleLogicalEntity | this_LogicalMeasurement_1= ruleLogicalMeasurement )
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( ((LA129_0>=95 && LA129_0<=96)) ) {
                alt129=1;
            }
            else if ( (LA129_0==89) ) {
                alt129=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }
            switch (alt129) {
                case 1 :
                    // InternalUddl.g:6043:3: this_LogicalEntity_0= ruleLogicalEntity
                    {

                    			newCompositeNode(grammarAccess.getLogicalComposableElementAccess().getLogicalEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalEntity_0=ruleLogicalEntity();

                    state._fsp--;


                    			current = this_LogicalEntity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:6052:3: this_LogicalMeasurement_1= ruleLogicalMeasurement
                    {

                    			newCompositeNode(grammarAccess.getLogicalComposableElementAccess().getLogicalMeasurementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalMeasurement_1=ruleLogicalMeasurement();

                    state._fsp--;


                    			current = this_LogicalMeasurement_1;
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
    // $ANTLR end "ruleLogicalComposableElement"


    // $ANTLR start "entryRuleLogicalEntity"
    // InternalUddl.g:6064:1: entryRuleLogicalEntity returns [EObject current=null] : iv_ruleLogicalEntity= ruleLogicalEntity EOF ;
    public final EObject entryRuleLogicalEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalEntity = null;


        try {
            // InternalUddl.g:6064:54: (iv_ruleLogicalEntity= ruleLogicalEntity EOF )
            // InternalUddl.g:6065:2: iv_ruleLogicalEntity= ruleLogicalEntity EOF
            {
             newCompositeNode(grammarAccess.getLogicalEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalEntity=ruleLogicalEntity();

            state._fsp--;

             current =iv_ruleLogicalEntity; 
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
    // $ANTLR end "entryRuleLogicalEntity"


    // $ANTLR start "ruleLogicalEntity"
    // InternalUddl.g:6071:1: ruleLogicalEntity returns [EObject current=null] : ( (otherlv_0= 'lentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= ruleLogicalComposition ) )* otherlv_9= '};' ) | this_LogicalAssociation_10= ruleLogicalAssociation ) ;
    public final EObject ruleLogicalEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_composition_8_0 = null;

        EObject this_LogicalAssociation_10 = null;



        	enterRule();

        try {
            // InternalUddl.g:6077:2: ( ( (otherlv_0= 'lentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= ruleLogicalComposition ) )* otherlv_9= '};' ) | this_LogicalAssociation_10= ruleLogicalAssociation ) )
            // InternalUddl.g:6078:2: ( (otherlv_0= 'lentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= ruleLogicalComposition ) )* otherlv_9= '};' ) | this_LogicalAssociation_10= ruleLogicalAssociation )
            {
            // InternalUddl.g:6078:2: ( (otherlv_0= 'lentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= ruleLogicalComposition ) )* otherlv_9= '};' ) | this_LogicalAssociation_10= ruleLogicalAssociation )
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==95) ) {
                alt133=1;
            }
            else if ( (LA133_0==96) ) {
                alt133=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;
            }
            switch (alt133) {
                case 1 :
                    // InternalUddl.g:6079:3: (otherlv_0= 'lentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= ruleLogicalComposition ) )* otherlv_9= '};' )
                    {
                    // InternalUddl.g:6079:3: (otherlv_0= 'lentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= ruleLogicalComposition ) )* otherlv_9= '};' )
                    // InternalUddl.g:6080:4: otherlv_0= 'lentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= ruleLogicalComposition ) )* otherlv_9= '};'
                    {
                    otherlv_0=(Token)match(input,95,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getLogicalEntityAccess().getLentityKeyword_0_0());
                    			
                    // InternalUddl.g:6084:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalUddl.g:6085:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUddl.g:6085:5: (lv_name_1_0= RULE_ID )
                    // InternalUddl.g:6086:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_91); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getLogicalEntityAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalEntityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalUddl.g:6102:4: ( (lv_description_2_0= RULE_STRING ) )?
                    int alt130=2;
                    int LA130_0 = input.LA(1);

                    if ( (LA130_0==RULE_STRING) ) {
                        alt130=1;
                    }
                    switch (alt130) {
                        case 1 :
                            // InternalUddl.g:6103:5: (lv_description_2_0= RULE_STRING )
                            {
                            // InternalUddl.g:6103:5: (lv_description_2_0= RULE_STRING )
                            // InternalUddl.g:6104:6: lv_description_2_0= RULE_STRING
                            {
                            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_92); 

                            						newLeafNode(lv_description_2_0, grammarAccess.getLogicalEntityAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getLogicalEntityRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"description",
                            							lv_description_2_0,
                            							"org.eclipse.xtext.common.Terminals.STRING");
                            					

                            }


                            }
                            break;

                    }

                    // InternalUddl.g:6120:4: (otherlv_3= ':' ( ( ruleQN ) ) )?
                    int alt131=2;
                    int LA131_0 = input.LA(1);

                    if ( (LA131_0==26) ) {
                        alt131=1;
                    }
                    switch (alt131) {
                        case 1 :
                            // InternalUddl.g:6121:5: otherlv_3= ':' ( ( ruleQN ) )
                            {
                            otherlv_3=(Token)match(input,26,FOLLOW_3); 

                            					newLeafNode(otherlv_3, grammarAccess.getLogicalEntityAccess().getColonKeyword_0_3_0());
                            				
                            // InternalUddl.g:6125:5: ( ( ruleQN ) )
                            // InternalUddl.g:6126:6: ( ruleQN )
                            {
                            // InternalUddl.g:6126:6: ( ruleQN )
                            // InternalUddl.g:6127:7: ruleQN
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLogicalEntityRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getLogicalEntityAccess().getSpecializesLogicalEntityCrossReference_0_3_1_0());
                            						
                            pushFollow(FOLLOW_84);
                            ruleQN();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,90,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getLogicalEntityAccess().getHyphenMinusGreaterThanSignKeyword_0_4());
                    			
                    // InternalUddl.g:6146:4: ( ( ruleQN ) )
                    // InternalUddl.g:6147:5: ( ruleQN )
                    {
                    // InternalUddl.g:6147:5: ( ruleQN )
                    // InternalUddl.g:6148:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalEntityRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLogicalEntityAccess().getRealizesConceptualEntityCrossReference_0_5_0());
                    					
                    pushFollow(FOLLOW_5);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,14,FOLLOW_39); 

                    				newLeafNode(otherlv_7, grammarAccess.getLogicalEntityAccess().getLeftCurlyBracketKeyword_0_6());
                    			
                    // InternalUddl.g:6166:4: ( (lv_composition_8_0= ruleLogicalComposition ) )*
                    loop132:
                    do {
                        int alt132=2;
                        int LA132_0 = input.LA(1);

                        if ( (LA132_0==RULE_ID) ) {
                            alt132=1;
                        }


                        switch (alt132) {
                    	case 1 :
                    	    // InternalUddl.g:6167:5: (lv_composition_8_0= ruleLogicalComposition )
                    	    {
                    	    // InternalUddl.g:6167:5: (lv_composition_8_0= ruleLogicalComposition )
                    	    // InternalUddl.g:6168:6: lv_composition_8_0= ruleLogicalComposition
                    	    {

                    	    						newCompositeNode(grammarAccess.getLogicalEntityAccess().getCompositionLogicalCompositionParserRuleCall_0_7_0());
                    	    					
                    	    pushFollow(FOLLOW_39);
                    	    lv_composition_8_0=ruleLogicalComposition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLogicalEntityRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"composition",
                    	    							lv_composition_8_0,
                    	    							"com.epistimis.uddl.Uddl.LogicalComposition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop132;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getLogicalEntityAccess().getRightCurlyBracketSemicolonKeyword_0_8());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUddl.g:6191:3: this_LogicalAssociation_10= ruleLogicalAssociation
                    {

                    			newCompositeNode(grammarAccess.getLogicalEntityAccess().getLogicalAssociationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalAssociation_10=ruleLogicalAssociation();

                    state._fsp--;


                    			current = this_LogicalAssociation_10;
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
    // $ANTLR end "ruleLogicalEntity"


    // $ANTLR start "entryRuleLogicalComposition"
    // InternalUddl.g:6203:1: entryRuleLogicalComposition returns [EObject current=null] : iv_ruleLogicalComposition= ruleLogicalComposition EOF ;
    public final EObject entryRuleLogicalComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalComposition = null;


        try {
            // InternalUddl.g:6203:59: (iv_ruleLogicalComposition= ruleLogicalComposition EOF )
            // InternalUddl.g:6204:2: iv_ruleLogicalComposition= ruleLogicalComposition EOF
            {
             newCompositeNode(grammarAccess.getLogicalCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalComposition=ruleLogicalComposition();

            state._fsp--;

             current =iv_ruleLogicalComposition; 
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
    // $ANTLR end "entryRuleLogicalComposition"


    // $ANTLR start "ruleLogicalComposition"
    // InternalUddl.g:6210:1: ruleLogicalComposition returns [EObject current=null] : ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= ';' ) ;
    public final EObject ruleLogicalComposition() throws RecognitionException {
        EObject current = null;

        Token lv_rolename_1_0=null;
        Token otherlv_2=null;
        Token lv_lowerBound_3_0=null;
        Token otherlv_4=null;
        Token lv_upperBound_5_0=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalUddl.g:6216:2: ( ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= ';' ) )
            // InternalUddl.g:6217:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= ';' )
            {
            // InternalUddl.g:6217:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= ';' )
            // InternalUddl.g:6218:3: ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= ';'
            {
            // InternalUddl.g:6218:3: ( ( ruleQN ) )
            // InternalUddl.g:6219:4: ( ruleQN )
            {
            // InternalUddl.g:6219:4: ( ruleQN )
            // InternalUddl.g:6220:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalCompositionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalCompositionAccess().getTypeLogicalComposableElementCrossReference_0_0());
            				
            pushFollow(FOLLOW_3);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:6234:3: ( (lv_rolename_1_0= RULE_ID ) )
            // InternalUddl.g:6235:4: (lv_rolename_1_0= RULE_ID )
            {
            // InternalUddl.g:6235:4: (lv_rolename_1_0= RULE_ID )
            // InternalUddl.g:6236:5: lv_rolename_1_0= RULE_ID
            {
            lv_rolename_1_0=(Token)match(input,RULE_ID,FOLLOW_93); 

            					newLeafNode(lv_rolename_1_0, grammarAccess.getLogicalCompositionAccess().getRolenameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalCompositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rolename",
            						lv_rolename_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:6252:3: (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==28) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalUddl.g:6253:4: otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_31); 

                    				newLeafNode(otherlv_2, grammarAccess.getLogicalCompositionAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalUddl.g:6257:4: ( (lv_lowerBound_3_0= RULE_INT ) )
                    // InternalUddl.g:6258:5: (lv_lowerBound_3_0= RULE_INT )
                    {
                    // InternalUddl.g:6258:5: (lv_lowerBound_3_0= RULE_INT )
                    // InternalUddl.g:6259:6: lv_lowerBound_3_0= RULE_INT
                    {
                    lv_lowerBound_3_0=(Token)match(input,RULE_INT,FOLLOW_22); 

                    						newLeafNode(lv_lowerBound_3_0, grammarAccess.getLogicalCompositionAccess().getLowerBoundINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalCompositionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_3_0,
                    							"com.epistimis.uddl.Uddl.INT");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,26,FOLLOW_31); 

                    				newLeafNode(otherlv_4, grammarAccess.getLogicalCompositionAccess().getColonKeyword_2_2());
                    			
                    // InternalUddl.g:6279:4: ( (lv_upperBound_5_0= RULE_INT ) )
                    // InternalUddl.g:6280:5: (lv_upperBound_5_0= RULE_INT )
                    {
                    // InternalUddl.g:6280:5: (lv_upperBound_5_0= RULE_INT )
                    // InternalUddl.g:6281:6: lv_upperBound_5_0= RULE_INT
                    {
                    lv_upperBound_5_0=(Token)match(input,RULE_INT,FOLLOW_24); 

                    						newLeafNode(lv_upperBound_5_0, grammarAccess.getLogicalCompositionAccess().getUpperBoundINTTerminalRuleCall_2_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalCompositionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"upperBound",
                    							lv_upperBound_5_0,
                    							"com.epistimis.uddl.Uddl.INT");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,29,FOLLOW_91); 

                    				newLeafNode(otherlv_6, grammarAccess.getLogicalCompositionAccess().getRightSquareBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalUddl.g:6302:3: ( (lv_description_7_0= RULE_STRING ) )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==RULE_STRING) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalUddl.g:6303:4: (lv_description_7_0= RULE_STRING )
                    {
                    // InternalUddl.g:6303:4: (lv_description_7_0= RULE_STRING )
                    // InternalUddl.g:6304:5: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_92); 

                    					newLeafNode(lv_description_7_0, grammarAccess.getLogicalCompositionAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalCompositionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_7_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:6320:3: (otherlv_8= ':' ( ( ruleQN ) ) )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==26) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalUddl.g:6321:4: otherlv_8= ':' ( ( ruleQN ) )
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getLogicalCompositionAccess().getColonKeyword_4_0());
                    			
                    // InternalUddl.g:6325:4: ( ( ruleQN ) )
                    // InternalUddl.g:6326:5: ( ruleQN )
                    {
                    // InternalUddl.g:6326:5: ( ruleQN )
                    // InternalUddl.g:6327:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalCompositionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLogicalCompositionAccess().getSpecializesLogicalCharacteristicCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_84);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getLogicalCompositionAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            // InternalUddl.g:6346:3: ( ( ruleQN ) )
            // InternalUddl.g:6347:4: ( ruleQN )
            {
            // InternalUddl.g:6347:4: ( ruleQN )
            // InternalUddl.g:6348:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalCompositionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalCompositionAccess().getRealizesConceptualCompositionCrossReference_6_0());
            				
            pushFollow(FOLLOW_13);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getLogicalCompositionAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleLogicalComposition"


    // $ANTLR start "entryRuleLogicalAssociation"
    // InternalUddl.g:6370:1: entryRuleLogicalAssociation returns [EObject current=null] : iv_ruleLogicalAssociation= ruleLogicalAssociation EOF ;
    public final EObject entryRuleLogicalAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAssociation = null;


        try {
            // InternalUddl.g:6370:59: (iv_ruleLogicalAssociation= ruleLogicalAssociation EOF )
            // InternalUddl.g:6371:2: iv_ruleLogicalAssociation= ruleLogicalAssociation EOF
            {
             newCompositeNode(grammarAccess.getLogicalAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalAssociation=ruleLogicalAssociation();

            state._fsp--;

             current =iv_ruleLogicalAssociation; 
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
    // $ANTLR end "entryRuleLogicalAssociation"


    // $ANTLR start "ruleLogicalAssociation"
    // InternalUddl.g:6377:1: ruleLogicalAssociation returns [EObject current=null] : (otherlv_0= 'lassoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= ruleLogicalComposition ) )* (otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= ruleLogicalParticipant ) )+ otherlv_12= ']' )? otherlv_13= '};' ) ;
    public final EObject ruleLogicalAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_composition_8_0 = null;

        EObject lv_participant_11_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:6383:2: ( (otherlv_0= 'lassoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= ruleLogicalComposition ) )* (otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= ruleLogicalParticipant ) )+ otherlv_12= ']' )? otherlv_13= '};' ) )
            // InternalUddl.g:6384:2: (otherlv_0= 'lassoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= ruleLogicalComposition ) )* (otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= ruleLogicalParticipant ) )+ otherlv_12= ']' )? otherlv_13= '};' )
            {
            // InternalUddl.g:6384:2: (otherlv_0= 'lassoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= ruleLogicalComposition ) )* (otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= ruleLogicalParticipant ) )+ otherlv_12= ']' )? otherlv_13= '};' )
            // InternalUddl.g:6385:3: otherlv_0= 'lassoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= ruleLogicalComposition ) )* (otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= ruleLogicalParticipant ) )+ otherlv_12= ']' )? otherlv_13= '};'
            {
            otherlv_0=(Token)match(input,96,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalAssociationAccess().getLassocKeyword_0());
            		
            // InternalUddl.g:6389:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:6390:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:6390:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:6391:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_91); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalAssociationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalAssociationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:6407:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==RULE_STRING) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // InternalUddl.g:6408:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:6408:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:6409:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_92); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalAssociationAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalAssociationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:6425:3: (otherlv_3= ':' ( ( ruleQN ) ) )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==26) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalUddl.g:6426:4: otherlv_3= ':' ( ( ruleQN ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getLogicalAssociationAccess().getColonKeyword_3_0());
                    			
                    // InternalUddl.g:6430:4: ( ( ruleQN ) )
                    // InternalUddl.g:6431:5: ( ruleQN )
                    {
                    // InternalUddl.g:6431:5: ( ruleQN )
                    // InternalUddl.g:6432:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalAssociationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLogicalAssociationAccess().getSpecializesLogicalEntityCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_84);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getLogicalAssociationAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalUddl.g:6451:3: ( ( ruleQN ) )
            // InternalUddl.g:6452:4: ( ruleQN )
            {
            // InternalUddl.g:6452:4: ( ruleQN )
            // InternalUddl.g:6453:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalAssociationAccess().getRealizesConceptualEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_5);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_94); 

            			newLeafNode(otherlv_7, grammarAccess.getLogicalAssociationAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalUddl.g:6471:3: ( (lv_composition_8_0= ruleLogicalComposition ) )*
            loop139:
            do {
                int alt139=2;
                int LA139_0 = input.LA(1);

                if ( (LA139_0==RULE_ID) ) {
                    alt139=1;
                }


                switch (alt139) {
            	case 1 :
            	    // InternalUddl.g:6472:4: (lv_composition_8_0= ruleLogicalComposition )
            	    {
            	    // InternalUddl.g:6472:4: (lv_composition_8_0= ruleLogicalComposition )
            	    // InternalUddl.g:6473:5: lv_composition_8_0= ruleLogicalComposition
            	    {

            	    					newCompositeNode(grammarAccess.getLogicalAssociationAccess().getCompositionLogicalCompositionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_94);
            	    lv_composition_8_0=ruleLogicalComposition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLogicalAssociationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"composition",
            	    						lv_composition_8_0,
            	    						"com.epistimis.uddl.Uddl.LogicalComposition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop139;
                }
            } while (true);

            // InternalUddl.g:6490:3: (otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= ruleLogicalParticipant ) )+ otherlv_12= ']' )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==32) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // InternalUddl.g:6491:4: otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= ruleLogicalParticipant ) )+ otherlv_12= ']'
                    {
                    otherlv_9=(Token)match(input,32,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getLogicalAssociationAccess().getParticipantsKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getLogicalAssociationAccess().getLeftSquareBracketKeyword_8_1());
                    			
                    // InternalUddl.g:6499:4: ( (lv_participant_11_0= ruleLogicalParticipant ) )+
                    int cnt140=0;
                    loop140:
                    do {
                        int alt140=2;
                        int LA140_0 = input.LA(1);

                        if ( (LA140_0==RULE_ID) ) {
                            alt140=1;
                        }


                        switch (alt140) {
                    	case 1 :
                    	    // InternalUddl.g:6500:5: (lv_participant_11_0= ruleLogicalParticipant )
                    	    {
                    	    // InternalUddl.g:6500:5: (lv_participant_11_0= ruleLogicalParticipant )
                    	    // InternalUddl.g:6501:6: lv_participant_11_0= ruleLogicalParticipant
                    	    {

                    	    						newCompositeNode(grammarAccess.getLogicalAssociationAccess().getParticipantLogicalParticipantParserRuleCall_8_2_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    lv_participant_11_0=ruleLogicalParticipant();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLogicalAssociationRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"participant",
                    	    							lv_participant_11_0,
                    	    							"com.epistimis.uddl.Uddl.LogicalParticipant");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt140 >= 1 ) break loop140;
                                EarlyExitException eee =
                                    new EarlyExitException(140, input);
                                throw eee;
                        }
                        cnt140++;
                    } while (true);

                    otherlv_12=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getLogicalAssociationAccess().getRightSquareBracketKeyword_8_3());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getLogicalAssociationAccess().getRightCurlyBracketSemicolonKeyword_9());
            		

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
    // $ANTLR end "ruleLogicalAssociation"


    // $ANTLR start "entryRuleLogicalParticipant"
    // InternalUddl.g:6531:1: entryRuleLogicalParticipant returns [EObject current=null] : iv_ruleLogicalParticipant= ruleLogicalParticipant EOF ;
    public final EObject entryRuleLogicalParticipant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalParticipant = null;


        try {
            // InternalUddl.g:6531:59: (iv_ruleLogicalParticipant= ruleLogicalParticipant EOF )
            // InternalUddl.g:6532:2: iv_ruleLogicalParticipant= ruleLogicalParticipant EOF
            {
             newCompositeNode(grammarAccess.getLogicalParticipantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalParticipant=ruleLogicalParticipant();

            state._fsp--;

             current =iv_ruleLogicalParticipant; 
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
    // $ANTLR end "entryRuleLogicalParticipant"


    // $ANTLR start "ruleLogicalParticipant"
    // InternalUddl.g:6538:1: ruleLogicalParticipant returns [EObject current=null] : ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= '{' otherlv_13= 'source:' otherlv_14= '[' ( (lv_sourceLowerBound_15_0= RULE_INT ) ) otherlv_16= ':' ( (lv_sourceUpperBound_17_0= RULE_INT ) ) otherlv_18= ']' (otherlv_19= 'path:' ( (lv_path_20_0= ruleLogicalPathNode ) ) )? otherlv_21= '};' ) ;
    public final EObject ruleLogicalParticipant() throws RecognitionException {
        EObject current = null;

        Token lv_rolename_1_0=null;
        Token otherlv_2=null;
        Token lv_lowerBound_3_0=null;
        Token otherlv_4=null;
        Token lv_upperBound_5_0=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_sourceLowerBound_15_0=null;
        Token otherlv_16=null;
        Token lv_sourceUpperBound_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject lv_path_20_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:6544:2: ( ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= '{' otherlv_13= 'source:' otherlv_14= '[' ( (lv_sourceLowerBound_15_0= RULE_INT ) ) otherlv_16= ':' ( (lv_sourceUpperBound_17_0= RULE_INT ) ) otherlv_18= ']' (otherlv_19= 'path:' ( (lv_path_20_0= ruleLogicalPathNode ) ) )? otherlv_21= '};' ) )
            // InternalUddl.g:6545:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= '{' otherlv_13= 'source:' otherlv_14= '[' ( (lv_sourceLowerBound_15_0= RULE_INT ) ) otherlv_16= ':' ( (lv_sourceUpperBound_17_0= RULE_INT ) ) otherlv_18= ']' (otherlv_19= 'path:' ( (lv_path_20_0= ruleLogicalPathNode ) ) )? otherlv_21= '};' )
            {
            // InternalUddl.g:6545:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= '{' otherlv_13= 'source:' otherlv_14= '[' ( (lv_sourceLowerBound_15_0= RULE_INT ) ) otherlv_16= ':' ( (lv_sourceUpperBound_17_0= RULE_INT ) ) otherlv_18= ']' (otherlv_19= 'path:' ( (lv_path_20_0= ruleLogicalPathNode ) ) )? otherlv_21= '};' )
            // InternalUddl.g:6546:3: ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= '{' otherlv_13= 'source:' otherlv_14= '[' ( (lv_sourceLowerBound_15_0= RULE_INT ) ) otherlv_16= ':' ( (lv_sourceUpperBound_17_0= RULE_INT ) ) otherlv_18= ']' (otherlv_19= 'path:' ( (lv_path_20_0= ruleLogicalPathNode ) ) )? otherlv_21= '};'
            {
            // InternalUddl.g:6546:3: ( ( ruleQN ) )
            // InternalUddl.g:6547:4: ( ruleQN )
            {
            // InternalUddl.g:6547:4: ( ruleQN )
            // InternalUddl.g:6548:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalParticipantRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalParticipantAccess().getTypeLogicalEntityCrossReference_0_0());
            				
            pushFollow(FOLLOW_3);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:6562:3: ( (lv_rolename_1_0= RULE_ID ) )
            // InternalUddl.g:6563:4: (lv_rolename_1_0= RULE_ID )
            {
            // InternalUddl.g:6563:4: (lv_rolename_1_0= RULE_ID )
            // InternalUddl.g:6564:5: lv_rolename_1_0= RULE_ID
            {
            lv_rolename_1_0=(Token)match(input,RULE_ID,FOLLOW_93); 

            					newLeafNode(lv_rolename_1_0, grammarAccess.getLogicalParticipantAccess().getRolenameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalParticipantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rolename",
            						lv_rolename_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:6580:3: (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==28) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalUddl.g:6581:4: otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_31); 

                    				newLeafNode(otherlv_2, grammarAccess.getLogicalParticipantAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalUddl.g:6585:4: ( (lv_lowerBound_3_0= RULE_INT ) )
                    // InternalUddl.g:6586:5: (lv_lowerBound_3_0= RULE_INT )
                    {
                    // InternalUddl.g:6586:5: (lv_lowerBound_3_0= RULE_INT )
                    // InternalUddl.g:6587:6: lv_lowerBound_3_0= RULE_INT
                    {
                    lv_lowerBound_3_0=(Token)match(input,RULE_INT,FOLLOW_22); 

                    						newLeafNode(lv_lowerBound_3_0, grammarAccess.getLogicalParticipantAccess().getLowerBoundINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalParticipantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_3_0,
                    							"com.epistimis.uddl.Uddl.INT");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,26,FOLLOW_31); 

                    				newLeafNode(otherlv_4, grammarAccess.getLogicalParticipantAccess().getColonKeyword_2_2());
                    			
                    // InternalUddl.g:6607:4: ( (lv_upperBound_5_0= RULE_INT ) )
                    // InternalUddl.g:6608:5: (lv_upperBound_5_0= RULE_INT )
                    {
                    // InternalUddl.g:6608:5: (lv_upperBound_5_0= RULE_INT )
                    // InternalUddl.g:6609:6: lv_upperBound_5_0= RULE_INT
                    {
                    lv_upperBound_5_0=(Token)match(input,RULE_INT,FOLLOW_24); 

                    						newLeafNode(lv_upperBound_5_0, grammarAccess.getLogicalParticipantAccess().getUpperBoundINTTerminalRuleCall_2_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalParticipantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"upperBound",
                    							lv_upperBound_5_0,
                    							"com.epistimis.uddl.Uddl.INT");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,29,FOLLOW_91); 

                    				newLeafNode(otherlv_6, grammarAccess.getLogicalParticipantAccess().getRightSquareBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalUddl.g:6630:3: ( (lv_description_7_0= RULE_STRING ) )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==RULE_STRING) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalUddl.g:6631:4: (lv_description_7_0= RULE_STRING )
                    {
                    // InternalUddl.g:6631:4: (lv_description_7_0= RULE_STRING )
                    // InternalUddl.g:6632:5: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_92); 

                    					newLeafNode(lv_description_7_0, grammarAccess.getLogicalParticipantAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalParticipantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_7_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:6648:3: (otherlv_8= ':' ( ( ruleQN ) ) )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==26) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalUddl.g:6649:4: otherlv_8= ':' ( ( ruleQN ) )
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getLogicalParticipantAccess().getColonKeyword_4_0());
                    			
                    // InternalUddl.g:6653:4: ( ( ruleQN ) )
                    // InternalUddl.g:6654:5: ( ruleQN )
                    {
                    // InternalUddl.g:6654:5: ( ruleQN )
                    // InternalUddl.g:6655:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalParticipantRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLogicalParticipantAccess().getSpecializesLogicalCharacteristicCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_84);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getLogicalParticipantAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            // InternalUddl.g:6674:3: ( ( ruleQN ) )
            // InternalUddl.g:6675:4: ( ruleQN )
            {
            // InternalUddl.g:6675:4: ( ruleQN )
            // InternalUddl.g:6676:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalParticipantRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalParticipantAccess().getRealizesConceptualParticipantCrossReference_6_0());
            				
            pushFollow(FOLLOW_5);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,14,FOLLOW_95); 

            			newLeafNode(otherlv_12, grammarAccess.getLogicalParticipantAccess().getLeftCurlyBracketKeyword_7());
            		
            otherlv_13=(Token)match(input,97,FOLLOW_17); 

            			newLeafNode(otherlv_13, grammarAccess.getLogicalParticipantAccess().getSourceKeyword_8());
            		
            otherlv_14=(Token)match(input,28,FOLLOW_31); 

            			newLeafNode(otherlv_14, grammarAccess.getLogicalParticipantAccess().getLeftSquareBracketKeyword_9());
            		
            // InternalUddl.g:6702:3: ( (lv_sourceLowerBound_15_0= RULE_INT ) )
            // InternalUddl.g:6703:4: (lv_sourceLowerBound_15_0= RULE_INT )
            {
            // InternalUddl.g:6703:4: (lv_sourceLowerBound_15_0= RULE_INT )
            // InternalUddl.g:6704:5: lv_sourceLowerBound_15_0= RULE_INT
            {
            lv_sourceLowerBound_15_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_sourceLowerBound_15_0, grammarAccess.getLogicalParticipantAccess().getSourceLowerBoundINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalParticipantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sourceLowerBound",
            						lv_sourceLowerBound_15_0,
            						"com.epistimis.uddl.Uddl.INT");
            				

            }


            }

            otherlv_16=(Token)match(input,26,FOLLOW_31); 

            			newLeafNode(otherlv_16, grammarAccess.getLogicalParticipantAccess().getColonKeyword_11());
            		
            // InternalUddl.g:6724:3: ( (lv_sourceUpperBound_17_0= RULE_INT ) )
            // InternalUddl.g:6725:4: (lv_sourceUpperBound_17_0= RULE_INT )
            {
            // InternalUddl.g:6725:4: (lv_sourceUpperBound_17_0= RULE_INT )
            // InternalUddl.g:6726:5: lv_sourceUpperBound_17_0= RULE_INT
            {
            lv_sourceUpperBound_17_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_sourceUpperBound_17_0, grammarAccess.getLogicalParticipantAccess().getSourceUpperBoundINTTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalParticipantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sourceUpperBound",
            						lv_sourceUpperBound_17_0,
            						"com.epistimis.uddl.Uddl.INT");
            				

            }


            }

            otherlv_18=(Token)match(input,29,FOLLOW_96); 

            			newLeafNode(otherlv_18, grammarAccess.getLogicalParticipantAccess().getRightSquareBracketKeyword_13());
            		
            // InternalUddl.g:6746:3: (otherlv_19= 'path:' ( (lv_path_20_0= ruleLogicalPathNode ) ) )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==34) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalUddl.g:6747:4: otherlv_19= 'path:' ( (lv_path_20_0= ruleLogicalPathNode ) )
                    {
                    otherlv_19=(Token)match(input,34,FOLLOW_33); 

                    				newLeafNode(otherlv_19, grammarAccess.getLogicalParticipantAccess().getPathKeyword_14_0());
                    			
                    // InternalUddl.g:6751:4: ( (lv_path_20_0= ruleLogicalPathNode ) )
                    // InternalUddl.g:6752:5: (lv_path_20_0= ruleLogicalPathNode )
                    {
                    // InternalUddl.g:6752:5: (lv_path_20_0= ruleLogicalPathNode )
                    // InternalUddl.g:6753:6: lv_path_20_0= ruleLogicalPathNode
                    {

                    						newCompositeNode(grammarAccess.getLogicalParticipantAccess().getPathLogicalPathNodeParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_path_20_0=ruleLogicalPathNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogicalParticipantRule());
                    						}
                    						set(
                    							current,
                    							"path",
                    							lv_path_20_0,
                    							"com.epistimis.uddl.Uddl.LogicalPathNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getLogicalParticipantAccess().getRightCurlyBracketSemicolonKeyword_15());
            		

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
    // $ANTLR end "ruleLogicalParticipant"


    // $ANTLR start "entryRuleLogicalPathNode"
    // InternalUddl.g:6779:1: entryRuleLogicalPathNode returns [EObject current=null] : iv_ruleLogicalPathNode= ruleLogicalPathNode EOF ;
    public final EObject entryRuleLogicalPathNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalPathNode = null;


        try {
            // InternalUddl.g:6779:56: (iv_ruleLogicalPathNode= ruleLogicalPathNode EOF )
            // InternalUddl.g:6780:2: iv_ruleLogicalPathNode= ruleLogicalPathNode EOF
            {
             newCompositeNode(grammarAccess.getLogicalPathNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalPathNode=ruleLogicalPathNode();

            state._fsp--;

             current =iv_ruleLogicalPathNode; 
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
    // $ANTLR end "entryRuleLogicalPathNode"


    // $ANTLR start "ruleLogicalPathNode"
    // InternalUddl.g:6786:1: ruleLogicalPathNode returns [EObject current=null] : (this_LogicalParticipantPathNode_0= ruleLogicalParticipantPathNode | this_LogicalCharacteristicPathNode_1= ruleLogicalCharacteristicPathNode ) ;
    public final EObject ruleLogicalPathNode() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalParticipantPathNode_0 = null;

        EObject this_LogicalCharacteristicPathNode_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:6792:2: ( (this_LogicalParticipantPathNode_0= ruleLogicalParticipantPathNode | this_LogicalCharacteristicPathNode_1= ruleLogicalCharacteristicPathNode ) )
            // InternalUddl.g:6793:2: (this_LogicalParticipantPathNode_0= ruleLogicalParticipantPathNode | this_LogicalCharacteristicPathNode_1= ruleLogicalCharacteristicPathNode )
            {
            // InternalUddl.g:6793:2: (this_LogicalParticipantPathNode_0= ruleLogicalParticipantPathNode | this_LogicalCharacteristicPathNode_1= ruleLogicalCharacteristicPathNode )
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==35) ) {
                alt146=1;
            }
            else if ( (LA146_0==36) ) {
                alt146=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 146, 0, input);

                throw nvae;
            }
            switch (alt146) {
                case 1 :
                    // InternalUddl.g:6794:3: this_LogicalParticipantPathNode_0= ruleLogicalParticipantPathNode
                    {

                    			newCompositeNode(grammarAccess.getLogicalPathNodeAccess().getLogicalParticipantPathNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalParticipantPathNode_0=ruleLogicalParticipantPathNode();

                    state._fsp--;


                    			current = this_LogicalParticipantPathNode_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:6803:3: this_LogicalCharacteristicPathNode_1= ruleLogicalCharacteristicPathNode
                    {

                    			newCompositeNode(grammarAccess.getLogicalPathNodeAccess().getLogicalCharacteristicPathNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalCharacteristicPathNode_1=ruleLogicalCharacteristicPathNode();

                    state._fsp--;


                    			current = this_LogicalCharacteristicPathNode_1;
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
    // $ANTLR end "ruleLogicalPathNode"


    // $ANTLR start "entryRuleLogicalParticipantPathNode"
    // InternalUddl.g:6815:1: entryRuleLogicalParticipantPathNode returns [EObject current=null] : iv_ruleLogicalParticipantPathNode= ruleLogicalParticipantPathNode EOF ;
    public final EObject entryRuleLogicalParticipantPathNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalParticipantPathNode = null;


        try {
            // InternalUddl.g:6815:67: (iv_ruleLogicalParticipantPathNode= ruleLogicalParticipantPathNode EOF )
            // InternalUddl.g:6816:2: iv_ruleLogicalParticipantPathNode= ruleLogicalParticipantPathNode EOF
            {
             newCompositeNode(grammarAccess.getLogicalParticipantPathNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalParticipantPathNode=ruleLogicalParticipantPathNode();

            state._fsp--;

             current =iv_ruleLogicalParticipantPathNode; 
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
    // $ANTLR end "entryRuleLogicalParticipantPathNode"


    // $ANTLR start "ruleLogicalParticipantPathNode"
    // InternalUddl.g:6822:1: ruleLogicalParticipantPathNode returns [EObject current=null] : (otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= ruleLogicalPathNode ) ) ) ;
    public final EObject ruleLogicalParticipantPathNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_node_2_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:6828:2: ( (otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= ruleLogicalPathNode ) ) ) )
            // InternalUddl.g:6829:2: (otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= ruleLogicalPathNode ) ) )
            {
            // InternalUddl.g:6829:2: (otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= ruleLogicalPathNode ) ) )
            // InternalUddl.g:6830:3: otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= ruleLogicalPathNode ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalParticipantPathNodeAccess().getSolidusKeyword_0());
            		
            // InternalUddl.g:6834:3: ( ( ruleQN ) )
            // InternalUddl.g:6835:4: ( ruleQN )
            {
            // InternalUddl.g:6835:4: ( ruleQN )
            // InternalUddl.g:6836:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalParticipantPathNodeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalParticipantPathNodeAccess().getProjectedParticipantLogicalParticipantCrossReference_1_0());
            				
            pushFollow(FOLLOW_33);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:6850:3: ( (lv_node_2_0= ruleLogicalPathNode ) )
            // InternalUddl.g:6851:4: (lv_node_2_0= ruleLogicalPathNode )
            {
            // InternalUddl.g:6851:4: (lv_node_2_0= ruleLogicalPathNode )
            // InternalUddl.g:6852:5: lv_node_2_0= ruleLogicalPathNode
            {

            					newCompositeNode(grammarAccess.getLogicalParticipantPathNodeAccess().getNodeLogicalPathNodeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_node_2_0=ruleLogicalPathNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicalParticipantPathNodeRule());
            					}
            					set(
            						current,
            						"node",
            						lv_node_2_0,
            						"com.epistimis.uddl.Uddl.LogicalPathNode");
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
    // $ANTLR end "ruleLogicalParticipantPathNode"


    // $ANTLR start "entryRuleLogicalCharacteristicPathNode"
    // InternalUddl.g:6873:1: entryRuleLogicalCharacteristicPathNode returns [EObject current=null] : iv_ruleLogicalCharacteristicPathNode= ruleLogicalCharacteristicPathNode EOF ;
    public final EObject entryRuleLogicalCharacteristicPathNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalCharacteristicPathNode = null;


        try {
            // InternalUddl.g:6873:70: (iv_ruleLogicalCharacteristicPathNode= ruleLogicalCharacteristicPathNode EOF )
            // InternalUddl.g:6874:2: iv_ruleLogicalCharacteristicPathNode= ruleLogicalCharacteristicPathNode EOF
            {
             newCompositeNode(grammarAccess.getLogicalCharacteristicPathNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalCharacteristicPathNode=ruleLogicalCharacteristicPathNode();

            state._fsp--;

             current =iv_ruleLogicalCharacteristicPathNode; 
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
    // $ANTLR end "entryRuleLogicalCharacteristicPathNode"


    // $ANTLR start "ruleLogicalCharacteristicPathNode"
    // InternalUddl.g:6880:1: ruleLogicalCharacteristicPathNode returns [EObject current=null] : (otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= ruleLogicalPathNode ) ) ) ;
    public final EObject ruleLogicalCharacteristicPathNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_node_2_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:6886:2: ( (otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= ruleLogicalPathNode ) ) ) )
            // InternalUddl.g:6887:2: (otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= ruleLogicalPathNode ) ) )
            {
            // InternalUddl.g:6887:2: (otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= ruleLogicalPathNode ) ) )
            // InternalUddl.g:6888:3: otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= ruleLogicalPathNode ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalCharacteristicPathNodeAccess().getNumberSignKeyword_0());
            		
            // InternalUddl.g:6892:3: ( ( ruleQN ) )
            // InternalUddl.g:6893:4: ( ruleQN )
            {
            // InternalUddl.g:6893:4: ( ruleQN )
            // InternalUddl.g:6894:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalCharacteristicPathNodeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalCharacteristicPathNodeAccess().getProjectedCharacteristicLogicalCharacteristicCrossReference_1_0());
            				
            pushFollow(FOLLOW_33);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:6908:3: ( (lv_node_2_0= ruleLogicalPathNode ) )
            // InternalUddl.g:6909:4: (lv_node_2_0= ruleLogicalPathNode )
            {
            // InternalUddl.g:6909:4: (lv_node_2_0= ruleLogicalPathNode )
            // InternalUddl.g:6910:5: lv_node_2_0= ruleLogicalPathNode
            {

            					newCompositeNode(grammarAccess.getLogicalCharacteristicPathNodeAccess().getNodeLogicalPathNodeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_node_2_0=ruleLogicalPathNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicalCharacteristicPathNodeRule());
            					}
            					set(
            						current,
            						"node",
            						lv_node_2_0,
            						"com.epistimis.uddl.Uddl.LogicalPathNode");
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
    // $ANTLR end "ruleLogicalCharacteristicPathNode"


    // $ANTLR start "entryRuleLogicalView"
    // InternalUddl.g:6931:1: entryRuleLogicalView returns [EObject current=null] : iv_ruleLogicalView= ruleLogicalView EOF ;
    public final EObject entryRuleLogicalView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalView = null;


        try {
            // InternalUddl.g:6931:52: (iv_ruleLogicalView= ruleLogicalView EOF )
            // InternalUddl.g:6932:2: iv_ruleLogicalView= ruleLogicalView EOF
            {
             newCompositeNode(grammarAccess.getLogicalViewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalView=ruleLogicalView();

            state._fsp--;

             current =iv_ruleLogicalView; 
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
    // $ANTLR end "entryRuleLogicalView"


    // $ANTLR start "ruleLogicalView"
    // InternalUddl.g:6938:1: ruleLogicalView returns [EObject current=null] : (this_LogicalQuery_0= ruleLogicalQuery | this_LogicalCompositeQuery_1= ruleLogicalCompositeQuery ) ;
    public final EObject ruleLogicalView() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalQuery_0 = null;

        EObject this_LogicalCompositeQuery_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:6944:2: ( (this_LogicalQuery_0= ruleLogicalQuery | this_LogicalCompositeQuery_1= ruleLogicalCompositeQuery ) )
            // InternalUddl.g:6945:2: (this_LogicalQuery_0= ruleLogicalQuery | this_LogicalCompositeQuery_1= ruleLogicalCompositeQuery )
            {
            // InternalUddl.g:6945:2: (this_LogicalQuery_0= ruleLogicalQuery | this_LogicalCompositeQuery_1= ruleLogicalCompositeQuery )
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==98) ) {
                alt147=1;
            }
            else if ( (LA147_0==99) ) {
                alt147=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 147, 0, input);

                throw nvae;
            }
            switch (alt147) {
                case 1 :
                    // InternalUddl.g:6946:3: this_LogicalQuery_0= ruleLogicalQuery
                    {

                    			newCompositeNode(grammarAccess.getLogicalViewAccess().getLogicalQueryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalQuery_0=ruleLogicalQuery();

                    state._fsp--;


                    			current = this_LogicalQuery_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:6955:3: this_LogicalCompositeQuery_1= ruleLogicalCompositeQuery
                    {

                    			newCompositeNode(grammarAccess.getLogicalViewAccess().getLogicalCompositeQueryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalCompositeQuery_1=ruleLogicalCompositeQuery();

                    state._fsp--;


                    			current = this_LogicalCompositeQuery_1;
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
    // $ANTLR end "ruleLogicalView"


    // $ANTLR start "entryRuleLogicalQuery"
    // InternalUddl.g:6967:1: entryRuleLogicalQuery returns [EObject current=null] : iv_ruleLogicalQuery= ruleLogicalQuery EOF ;
    public final EObject entryRuleLogicalQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalQuery = null;


        try {
            // InternalUddl.g:6967:53: (iv_ruleLogicalQuery= ruleLogicalQuery EOF )
            // InternalUddl.g:6968:2: iv_ruleLogicalQuery= ruleLogicalQuery EOF
            {
             newCompositeNode(grammarAccess.getLogicalQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalQuery=ruleLogicalQuery();

            state._fsp--;

             current =iv_ruleLogicalQuery; 
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
    // $ANTLR end "entryRuleLogicalQuery"


    // $ANTLR start "ruleLogicalQuery"
    // InternalUddl.g:6974:1: ruleLogicalQuery returns [EObject current=null] : (otherlv_0= 'lquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' otherlv_6= 'spec:' ( (lv_specification_7_0= RULE_STRING ) ) otherlv_8= '};' ) ;
    public final EObject ruleLogicalQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_specification_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalUddl.g:6980:2: ( (otherlv_0= 'lquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' otherlv_6= 'spec:' ( (lv_specification_7_0= RULE_STRING ) ) otherlv_8= '};' ) )
            // InternalUddl.g:6981:2: (otherlv_0= 'lquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' otherlv_6= 'spec:' ( (lv_specification_7_0= RULE_STRING ) ) otherlv_8= '};' )
            {
            // InternalUddl.g:6981:2: (otherlv_0= 'lquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' otherlv_6= 'spec:' ( (lv_specification_7_0= RULE_STRING ) ) otherlv_8= '};' )
            // InternalUddl.g:6982:3: otherlv_0= 'lquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' otherlv_6= 'spec:' ( (lv_specification_7_0= RULE_STRING ) ) otherlv_8= '};'
            {
            otherlv_0=(Token)match(input,98,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalQueryAccess().getLqueryKeyword_0());
            		
            // InternalUddl.g:6986:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:6987:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:6987:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:6988:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalQueryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:7004:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==RULE_STRING) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalUddl.g:7005:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:7005:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:7006:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalQueryAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalQueryRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:7022:3: (otherlv_3= '->' ( ( ruleQN ) ) )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==90) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // InternalUddl.g:7023:4: otherlv_3= '->' ( ( ruleQN ) )
                    {
                    otherlv_3=(Token)match(input,90,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getLogicalQueryAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                    			
                    // InternalUddl.g:7027:4: ( ( ruleQN ) )
                    // InternalUddl.g:7028:5: ( ruleQN )
                    {
                    // InternalUddl.g:7028:5: ( ruleQN )
                    // InternalUddl.g:7029:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalQueryRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLogicalQueryAccess().getRealizesConceptualQueryCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getLogicalQueryAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_6=(Token)match(input,38,FOLLOW_37); 

            			newLeafNode(otherlv_6, grammarAccess.getLogicalQueryAccess().getSpecKeyword_5());
            		
            // InternalUddl.g:7052:3: ( (lv_specification_7_0= RULE_STRING ) )
            // InternalUddl.g:7053:4: (lv_specification_7_0= RULE_STRING )
            {
            // InternalUddl.g:7053:4: (lv_specification_7_0= RULE_STRING )
            // InternalUddl.g:7054:5: lv_specification_7_0= RULE_STRING
            {
            lv_specification_7_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_specification_7_0, grammarAccess.getLogicalQueryAccess().getSpecificationSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"specification",
            						lv_specification_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLogicalQueryAccess().getRightCurlyBracketSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleLogicalQuery"


    // $ANTLR start "entryRuleLogicalCompositeQuery"
    // InternalUddl.g:7078:1: entryRuleLogicalCompositeQuery returns [EObject current=null] : iv_ruleLogicalCompositeQuery= ruleLogicalCompositeQuery EOF ;
    public final EObject entryRuleLogicalCompositeQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalCompositeQuery = null;


        try {
            // InternalUddl.g:7078:62: (iv_ruleLogicalCompositeQuery= ruleLogicalCompositeQuery EOF )
            // InternalUddl.g:7079:2: iv_ruleLogicalCompositeQuery= ruleLogicalCompositeQuery EOF
            {
             newCompositeNode(grammarAccess.getLogicalCompositeQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalCompositeQuery=ruleLogicalCompositeQuery();

            state._fsp--;

             current =iv_ruleLogicalCompositeQuery; 
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
    // $ANTLR end "entryRuleLogicalCompositeQuery"


    // $ANTLR start "ruleLogicalCompositeQuery"
    // InternalUddl.g:7085:1: ruleLogicalCompositeQuery returns [EObject current=null] : (otherlv_0= 'lcquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_isUnion_6_0= 'isUnion' ) ) ( (lv_composition_7_0= ruleLogicalQueryComposition ) ) otherlv_8= '};' ) ;
    public final EObject ruleLogicalCompositeQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_isUnion_6_0=null;
        Token otherlv_8=null;
        EObject lv_composition_7_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:7091:2: ( (otherlv_0= 'lcquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_isUnion_6_0= 'isUnion' ) ) ( (lv_composition_7_0= ruleLogicalQueryComposition ) ) otherlv_8= '};' ) )
            // InternalUddl.g:7092:2: (otherlv_0= 'lcquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_isUnion_6_0= 'isUnion' ) ) ( (lv_composition_7_0= ruleLogicalQueryComposition ) ) otherlv_8= '};' )
            {
            // InternalUddl.g:7092:2: (otherlv_0= 'lcquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_isUnion_6_0= 'isUnion' ) ) ( (lv_composition_7_0= ruleLogicalQueryComposition ) ) otherlv_8= '};' )
            // InternalUddl.g:7093:3: otherlv_0= 'lcquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_isUnion_6_0= 'isUnion' ) ) ( (lv_composition_7_0= ruleLogicalQueryComposition ) ) otherlv_8= '};'
            {
            otherlv_0=(Token)match(input,99,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalCompositeQueryAccess().getLcqueryKeyword_0());
            		
            // InternalUddl.g:7097:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:7098:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:7098:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:7099:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalCompositeQueryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalCompositeQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:7115:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==RULE_STRING) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalUddl.g:7116:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:7116:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:7117:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalCompositeQueryAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalCompositeQueryRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:7133:3: (otherlv_3= '->' ( ( ruleQN ) ) )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==90) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // InternalUddl.g:7134:4: otherlv_3= '->' ( ( ruleQN ) )
                    {
                    otherlv_3=(Token)match(input,90,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getLogicalCompositeQueryAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                    			
                    // InternalUddl.g:7138:4: ( ( ruleQN ) )
                    // InternalUddl.g:7139:5: ( ruleQN )
                    {
                    // InternalUddl.g:7139:5: ( ruleQN )
                    // InternalUddl.g:7140:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalCompositeQueryRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLogicalCompositeQueryAccess().getRealizesConceptualCompositeQueryCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_38); 

            			newLeafNode(otherlv_5, grammarAccess.getLogicalCompositeQueryAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalUddl.g:7159:3: ( (lv_isUnion_6_0= 'isUnion' ) )
            // InternalUddl.g:7160:4: (lv_isUnion_6_0= 'isUnion' )
            {
            // InternalUddl.g:7160:4: (lv_isUnion_6_0= 'isUnion' )
            // InternalUddl.g:7161:5: lv_isUnion_6_0= 'isUnion'
            {
            lv_isUnion_6_0=(Token)match(input,40,FOLLOW_3); 

            					newLeafNode(lv_isUnion_6_0, grammarAccess.getLogicalCompositeQueryAccess().getIsUnionIsUnionKeyword_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalCompositeQueryRule());
            					}
            					setWithLastConsumed(current, "isUnion", lv_isUnion_6_0 != null, "isUnion");
            				

            }


            }

            // InternalUddl.g:7173:3: ( (lv_composition_7_0= ruleLogicalQueryComposition ) )
            // InternalUddl.g:7174:4: (lv_composition_7_0= ruleLogicalQueryComposition )
            {
            // InternalUddl.g:7174:4: (lv_composition_7_0= ruleLogicalQueryComposition )
            // InternalUddl.g:7175:5: lv_composition_7_0= ruleLogicalQueryComposition
            {

            					newCompositeNode(grammarAccess.getLogicalCompositeQueryAccess().getCompositionLogicalQueryCompositionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_19);
            lv_composition_7_0=ruleLogicalQueryComposition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicalCompositeQueryRule());
            					}
            					add(
            						current,
            						"composition",
            						lv_composition_7_0,
            						"com.epistimis.uddl.Uddl.LogicalQueryComposition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLogicalCompositeQueryAccess().getRightCurlyBracketSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleLogicalCompositeQuery"


    // $ANTLR start "entryRuleLogicalQueryComposition"
    // InternalUddl.g:7200:1: entryRuleLogicalQueryComposition returns [EObject current=null] : iv_ruleLogicalQueryComposition= ruleLogicalQueryComposition EOF ;
    public final EObject entryRuleLogicalQueryComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalQueryComposition = null;


        try {
            // InternalUddl.g:7200:64: (iv_ruleLogicalQueryComposition= ruleLogicalQueryComposition EOF )
            // InternalUddl.g:7201:2: iv_ruleLogicalQueryComposition= ruleLogicalQueryComposition EOF
            {
             newCompositeNode(grammarAccess.getLogicalQueryCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalQueryComposition=ruleLogicalQueryComposition();

            state._fsp--;

             current =iv_ruleLogicalQueryComposition; 
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
    // $ANTLR end "entryRuleLogicalQueryComposition"


    // $ANTLR start "ruleLogicalQueryComposition"
    // InternalUddl.g:7207:1: ruleLogicalQueryComposition returns [EObject current=null] : ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '->' ( ( ruleQN ) ) )? ) ;
    public final EObject ruleLogicalQueryComposition() throws RecognitionException {
        EObject current = null;

        Token lv_rolename_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalUddl.g:7213:2: ( ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '->' ( ( ruleQN ) ) )? ) )
            // InternalUddl.g:7214:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '->' ( ( ruleQN ) ) )? )
            {
            // InternalUddl.g:7214:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '->' ( ( ruleQN ) ) )? )
            // InternalUddl.g:7215:3: ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '->' ( ( ruleQN ) ) )?
            {
            // InternalUddl.g:7215:3: ( ( ruleQN ) )
            // InternalUddl.g:7216:4: ( ruleQN )
            {
            // InternalUddl.g:7216:4: ( ruleQN )
            // InternalUddl.g:7217:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalQueryCompositionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalQueryCompositionAccess().getTypeLogicalViewCrossReference_0_0());
            				
            pushFollow(FOLLOW_3);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:7231:3: ( (lv_rolename_1_0= RULE_ID ) )
            // InternalUddl.g:7232:4: (lv_rolename_1_0= RULE_ID )
            {
            // InternalUddl.g:7232:4: (lv_rolename_1_0= RULE_ID )
            // InternalUddl.g:7233:5: lv_rolename_1_0= RULE_ID
            {
            lv_rolename_1_0=(Token)match(input,RULE_ID,FOLLOW_97); 

            					newLeafNode(lv_rolename_1_0, grammarAccess.getLogicalQueryCompositionAccess().getRolenameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalQueryCompositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rolename",
            						lv_rolename_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:7249:3: (otherlv_2= '->' ( ( ruleQN ) ) )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==90) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // InternalUddl.g:7250:4: otherlv_2= '->' ( ( ruleQN ) )
                    {
                    otherlv_2=(Token)match(input,90,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getLogicalQueryCompositionAccess().getHyphenMinusGreaterThanSignKeyword_2_0());
                    			
                    // InternalUddl.g:7254:4: ( ( ruleQN ) )
                    // InternalUddl.g:7255:5: ( ruleQN )
                    {
                    // InternalUddl.g:7255:5: ( ruleQN )
                    // InternalUddl.g:7256:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalQueryCompositionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLogicalQueryCompositionAccess().getRealizesConceptualQueryCompositionCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleQN();

                    state._fsp--;


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
    // $ANTLR end "ruleLogicalQueryComposition"


    // $ANTLR start "entryRulePlatformElement"
    // InternalUddl.g:7275:1: entryRulePlatformElement returns [EObject current=null] : iv_rulePlatformElement= rulePlatformElement EOF ;
    public final EObject entryRulePlatformElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformElement = null;


        try {
            // InternalUddl.g:7275:56: (iv_rulePlatformElement= rulePlatformElement EOF )
            // InternalUddl.g:7276:2: iv_rulePlatformElement= rulePlatformElement EOF
            {
             newCompositeNode(grammarAccess.getPlatformElementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformElement=rulePlatformElement();

            state._fsp--;

             current =iv_rulePlatformElement; 
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
    // $ANTLR end "entryRulePlatformElement"


    // $ANTLR start "rulePlatformElement"
    // InternalUddl.g:7282:1: rulePlatformElement returns [EObject current=null] : (this_PlatformComposableElement_0= rulePlatformComposableElement | this_PlatformView_1= rulePlatformView ) ;
    public final EObject rulePlatformElement() throws RecognitionException {
        EObject current = null;

        EObject this_PlatformComposableElement_0 = null;

        EObject this_PlatformView_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:7288:2: ( (this_PlatformComposableElement_0= rulePlatformComposableElement | this_PlatformView_1= rulePlatformView ) )
            // InternalUddl.g:7289:2: (this_PlatformComposableElement_0= rulePlatformComposableElement | this_PlatformView_1= rulePlatformView )
            {
            // InternalUddl.g:7289:2: (this_PlatformComposableElement_0= rulePlatformComposableElement | this_PlatformView_1= rulePlatformView )
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==51||LA153_0==56||(LA153_0>=100 && LA153_0<=118)||LA153_0==120) ) {
                alt153=1;
            }
            else if ( ((LA153_0>=121 && LA153_0<=122)) ) {
                alt153=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 153, 0, input);

                throw nvae;
            }
            switch (alt153) {
                case 1 :
                    // InternalUddl.g:7290:3: this_PlatformComposableElement_0= rulePlatformComposableElement
                    {

                    			newCompositeNode(grammarAccess.getPlatformElementAccess().getPlatformComposableElementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformComposableElement_0=rulePlatformComposableElement();

                    state._fsp--;


                    			current = this_PlatformComposableElement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:7299:3: this_PlatformView_1= rulePlatformView
                    {

                    			newCompositeNode(grammarAccess.getPlatformElementAccess().getPlatformViewParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformView_1=rulePlatformView();

                    state._fsp--;


                    			current = this_PlatformView_1;
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
    // $ANTLR end "rulePlatformElement"


    // $ANTLR start "entryRulePlatformComposableElement"
    // InternalUddl.g:7311:1: entryRulePlatformComposableElement returns [EObject current=null] : iv_rulePlatformComposableElement= rulePlatformComposableElement EOF ;
    public final EObject entryRulePlatformComposableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformComposableElement = null;


        try {
            // InternalUddl.g:7311:66: (iv_rulePlatformComposableElement= rulePlatformComposableElement EOF )
            // InternalUddl.g:7312:2: iv_rulePlatformComposableElement= rulePlatformComposableElement EOF
            {
             newCompositeNode(grammarAccess.getPlatformComposableElementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformComposableElement=rulePlatformComposableElement();

            state._fsp--;

             current =iv_rulePlatformComposableElement; 
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
    // $ANTLR end "entryRulePlatformComposableElement"


    // $ANTLR start "rulePlatformComposableElement"
    // InternalUddl.g:7318:1: rulePlatformComposableElement returns [EObject current=null] : (this_PlatformEntity_0= rulePlatformEntity | this_PlatformDataType_1= rulePlatformDataType ) ;
    public final EObject rulePlatformComposableElement() throws RecognitionException {
        EObject current = null;

        EObject this_PlatformEntity_0 = null;

        EObject this_PlatformDataType_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:7324:2: ( (this_PlatformEntity_0= rulePlatformEntity | this_PlatformDataType_1= rulePlatformDataType ) )
            // InternalUddl.g:7325:2: (this_PlatformEntity_0= rulePlatformEntity | this_PlatformDataType_1= rulePlatformDataType )
            {
            // InternalUddl.g:7325:2: (this_PlatformEntity_0= rulePlatformEntity | this_PlatformDataType_1= rulePlatformDataType )
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==118||LA154_0==120) ) {
                alt154=1;
            }
            else if ( (LA154_0==51||LA154_0==56||(LA154_0>=100 && LA154_0<=117)) ) {
                alt154=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 154, 0, input);

                throw nvae;
            }
            switch (alt154) {
                case 1 :
                    // InternalUddl.g:7326:3: this_PlatformEntity_0= rulePlatformEntity
                    {

                    			newCompositeNode(grammarAccess.getPlatformComposableElementAccess().getPlatformEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformEntity_0=rulePlatformEntity();

                    state._fsp--;


                    			current = this_PlatformEntity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:7335:3: this_PlatformDataType_1= rulePlatformDataType
                    {

                    			newCompositeNode(grammarAccess.getPlatformComposableElementAccess().getPlatformDataTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformDataType_1=rulePlatformDataType();

                    state._fsp--;


                    			current = this_PlatformDataType_1;
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
    // $ANTLR end "rulePlatformComposableElement"


    // $ANTLR start "entryRulePlatformDataType"
    // InternalUddl.g:7347:1: entryRulePlatformDataType returns [EObject current=null] : iv_rulePlatformDataType= rulePlatformDataType EOF ;
    public final EObject entryRulePlatformDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformDataType = null;


        try {
            // InternalUddl.g:7347:57: (iv_rulePlatformDataType= rulePlatformDataType EOF )
            // InternalUddl.g:7348:2: iv_rulePlatformDataType= rulePlatformDataType EOF
            {
             newCompositeNode(grammarAccess.getPlatformDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformDataType=rulePlatformDataType();

            state._fsp--;

             current =iv_rulePlatformDataType; 
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
    // $ANTLR end "entryRulePlatformDataType"


    // $ANTLR start "rulePlatformDataType"
    // InternalUddl.g:7354:1: rulePlatformDataType returns [EObject current=null] : (this_PlatformPrimitive_0= rulePlatformPrimitive | this_PlatformStruct_1= rulePlatformStruct ) ;
    public final EObject rulePlatformDataType() throws RecognitionException {
        EObject current = null;

        EObject this_PlatformPrimitive_0 = null;

        EObject this_PlatformStruct_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:7360:2: ( (this_PlatformPrimitive_0= rulePlatformPrimitive | this_PlatformStruct_1= rulePlatformStruct ) )
            // InternalUddl.g:7361:2: (this_PlatformPrimitive_0= rulePlatformPrimitive | this_PlatformStruct_1= rulePlatformStruct )
            {
            // InternalUddl.g:7361:2: (this_PlatformPrimitive_0= rulePlatformPrimitive | this_PlatformStruct_1= rulePlatformStruct )
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==51||LA155_0==56||(LA155_0>=100 && LA155_0<=116)) ) {
                alt155=1;
            }
            else if ( (LA155_0==117) ) {
                alt155=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 155, 0, input);

                throw nvae;
            }
            switch (alt155) {
                case 1 :
                    // InternalUddl.g:7362:3: this_PlatformPrimitive_0= rulePlatformPrimitive
                    {

                    			newCompositeNode(grammarAccess.getPlatformDataTypeAccess().getPlatformPrimitiveParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformPrimitive_0=rulePlatformPrimitive();

                    state._fsp--;


                    			current = this_PlatformPrimitive_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:7371:3: this_PlatformStruct_1= rulePlatformStruct
                    {

                    			newCompositeNode(grammarAccess.getPlatformDataTypeAccess().getPlatformStructParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformStruct_1=rulePlatformStruct();

                    state._fsp--;


                    			current = this_PlatformStruct_1;
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
    // $ANTLR end "rulePlatformDataType"


    // $ANTLR start "entryRulePlatformPrimitive"
    // InternalUddl.g:7383:1: entryRulePlatformPrimitive returns [EObject current=null] : iv_rulePlatformPrimitive= rulePlatformPrimitive EOF ;
    public final EObject entryRulePlatformPrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformPrimitive = null;


        try {
            // InternalUddl.g:7383:58: (iv_rulePlatformPrimitive= rulePlatformPrimitive EOF )
            // InternalUddl.g:7384:2: iv_rulePlatformPrimitive= rulePlatformPrimitive EOF
            {
             newCompositeNode(grammarAccess.getPlatformPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformPrimitive=rulePlatformPrimitive();

            state._fsp--;

             current =iv_rulePlatformPrimitive; 
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
    // $ANTLR end "entryRulePlatformPrimitive"


    // $ANTLR start "rulePlatformPrimitive"
    // InternalUddl.g:7390:1: rulePlatformPrimitive returns [EObject current=null] : (this_PlatformSequence_0= rulePlatformSequence | this_PlatformBoolean_1= rulePlatformBoolean | this_PlatformChar_2= rulePlatformChar | this_PlatformNumber_3= rulePlatformNumber | this_PlatformOctet_4= rulePlatformOctet | this_PlatformEnumeration_5= rulePlatformEnumeration | this_PlatformStringType_6= rulePlatformStringType | this_PlatformArray_7= rulePlatformArray ) ;
    public final EObject rulePlatformPrimitive() throws RecognitionException {
        EObject current = null;

        EObject this_PlatformSequence_0 = null;

        EObject this_PlatformBoolean_1 = null;

        EObject this_PlatformChar_2 = null;

        EObject this_PlatformNumber_3 = null;

        EObject this_PlatformOctet_4 = null;

        EObject this_PlatformEnumeration_5 = null;

        EObject this_PlatformStringType_6 = null;

        EObject this_PlatformArray_7 = null;



        	enterRule();

        try {
            // InternalUddl.g:7396:2: ( (this_PlatformSequence_0= rulePlatformSequence | this_PlatformBoolean_1= rulePlatformBoolean | this_PlatformChar_2= rulePlatformChar | this_PlatformNumber_3= rulePlatformNumber | this_PlatformOctet_4= rulePlatformOctet | this_PlatformEnumeration_5= rulePlatformEnumeration | this_PlatformStringType_6= rulePlatformStringType | this_PlatformArray_7= rulePlatformArray ) )
            // InternalUddl.g:7397:2: (this_PlatformSequence_0= rulePlatformSequence | this_PlatformBoolean_1= rulePlatformBoolean | this_PlatformChar_2= rulePlatformChar | this_PlatformNumber_3= rulePlatformNumber | this_PlatformOctet_4= rulePlatformOctet | this_PlatformEnumeration_5= rulePlatformEnumeration | this_PlatformStringType_6= rulePlatformStringType | this_PlatformArray_7= rulePlatformArray )
            {
            // InternalUddl.g:7397:2: (this_PlatformSequence_0= rulePlatformSequence | this_PlatformBoolean_1= rulePlatformBoolean | this_PlatformChar_2= rulePlatformChar | this_PlatformNumber_3= rulePlatformNumber | this_PlatformOctet_4= rulePlatformOctet | this_PlatformEnumeration_5= rulePlatformEnumeration | this_PlatformStringType_6= rulePlatformStringType | this_PlatformArray_7= rulePlatformArray )
            int alt156=8;
            switch ( input.LA(1) ) {
            case 115:
                {
                alt156=1;
                }
                break;
            case 51:
                {
                alt156=2;
                }
                break;
            case 101:
                {
                alt156=3;
                }
                break;
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
                {
                alt156=4;
                }
                break;
            case 100:
                {
                alt156=5;
                }
                break;
            case 56:
                {
                alt156=6;
                }
                break;
            case 102:
            case 103:
            case 104:
                {
                alt156=7;
                }
                break;
            case 116:
                {
                alt156=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 156, 0, input);

                throw nvae;
            }

            switch (alt156) {
                case 1 :
                    // InternalUddl.g:7398:3: this_PlatformSequence_0= rulePlatformSequence
                    {

                    			newCompositeNode(grammarAccess.getPlatformPrimitiveAccess().getPlatformSequenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformSequence_0=rulePlatformSequence();

                    state._fsp--;


                    			current = this_PlatformSequence_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:7407:3: this_PlatformBoolean_1= rulePlatformBoolean
                    {

                    			newCompositeNode(grammarAccess.getPlatformPrimitiveAccess().getPlatformBooleanParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformBoolean_1=rulePlatformBoolean();

                    state._fsp--;


                    			current = this_PlatformBoolean_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUddl.g:7416:3: this_PlatformChar_2= rulePlatformChar
                    {

                    			newCompositeNode(grammarAccess.getPlatformPrimitiveAccess().getPlatformCharParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformChar_2=rulePlatformChar();

                    state._fsp--;


                    			current = this_PlatformChar_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUddl.g:7425:3: this_PlatformNumber_3= rulePlatformNumber
                    {

                    			newCompositeNode(grammarAccess.getPlatformPrimitiveAccess().getPlatformNumberParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformNumber_3=rulePlatformNumber();

                    state._fsp--;


                    			current = this_PlatformNumber_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalUddl.g:7434:3: this_PlatformOctet_4= rulePlatformOctet
                    {

                    			newCompositeNode(grammarAccess.getPlatformPrimitiveAccess().getPlatformOctetParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformOctet_4=rulePlatformOctet();

                    state._fsp--;


                    			current = this_PlatformOctet_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalUddl.g:7443:3: this_PlatformEnumeration_5= rulePlatformEnumeration
                    {

                    			newCompositeNode(grammarAccess.getPlatformPrimitiveAccess().getPlatformEnumerationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformEnumeration_5=rulePlatformEnumeration();

                    state._fsp--;


                    			current = this_PlatformEnumeration_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalUddl.g:7452:3: this_PlatformStringType_6= rulePlatformStringType
                    {

                    			newCompositeNode(grammarAccess.getPlatformPrimitiveAccess().getPlatformStringTypeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformStringType_6=rulePlatformStringType();

                    state._fsp--;


                    			current = this_PlatformStringType_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalUddl.g:7461:3: this_PlatformArray_7= rulePlatformArray
                    {

                    			newCompositeNode(grammarAccess.getPlatformPrimitiveAccess().getPlatformArrayParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformArray_7=rulePlatformArray();

                    state._fsp--;


                    			current = this_PlatformArray_7;
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
    // $ANTLR end "rulePlatformPrimitive"


    // $ANTLR start "entryRulePlatformBoolean"
    // InternalUddl.g:7473:1: entryRulePlatformBoolean returns [EObject current=null] : iv_rulePlatformBoolean= rulePlatformBoolean EOF ;
    public final EObject entryRulePlatformBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformBoolean = null;


        try {
            // InternalUddl.g:7473:56: (iv_rulePlatformBoolean= rulePlatformBoolean EOF )
            // InternalUddl.g:7474:2: iv_rulePlatformBoolean= rulePlatformBoolean EOF
            {
             newCompositeNode(grammarAccess.getPlatformBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformBoolean=rulePlatformBoolean();

            state._fsp--;

             current =iv_rulePlatformBoolean; 
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
    // $ANTLR end "entryRulePlatformBoolean"


    // $ANTLR start "rulePlatformBoolean"
    // InternalUddl.g:7480:1: rulePlatformBoolean returns [EObject current=null] : (otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:7486:2: ( (otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:7487:2: (otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:7487:2: (otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:7488:3: otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformBooleanAccess().getBoolKeyword_0());
            		
            // InternalUddl.g:7492:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:7493:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:7493:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:7494:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_83); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformBooleanAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformBooleanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:7510:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==RULE_STRING) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // InternalUddl.g:7511:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:7511:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:7512:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformBooleanAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformBooleanRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformBooleanAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:7532:3: ( ( ruleQN ) )
            // InternalUddl.g:7533:4: ( ruleQN )
            {
            // InternalUddl.g:7533:4: ( ruleQN )
            // InternalUddl.g:7534:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformBooleanRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformBooleanAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformBooleanAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformBoolean"


    // $ANTLR start "entryRulePlatformOctet"
    // InternalUddl.g:7556:1: entryRulePlatformOctet returns [EObject current=null] : iv_rulePlatformOctet= rulePlatformOctet EOF ;
    public final EObject entryRulePlatformOctet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformOctet = null;


        try {
            // InternalUddl.g:7556:54: (iv_rulePlatformOctet= rulePlatformOctet EOF )
            // InternalUddl.g:7557:2: iv_rulePlatformOctet= rulePlatformOctet EOF
            {
             newCompositeNode(grammarAccess.getPlatformOctetRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformOctet=rulePlatformOctet();

            state._fsp--;

             current =iv_rulePlatformOctet; 
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
    // $ANTLR end "entryRulePlatformOctet"


    // $ANTLR start "rulePlatformOctet"
    // InternalUddl.g:7563:1: rulePlatformOctet returns [EObject current=null] : (otherlv_0= 'octet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformOctet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:7569:2: ( (otherlv_0= 'octet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:7570:2: (otherlv_0= 'octet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:7570:2: (otherlv_0= 'octet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:7571:3: otherlv_0= 'octet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,100,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformOctetAccess().getOctetKeyword_0());
            		
            // InternalUddl.g:7575:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:7576:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:7576:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:7577:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_83); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformOctetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformOctetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:7593:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==RULE_STRING) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // InternalUddl.g:7594:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:7594:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:7595:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformOctetAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformOctetRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformOctetAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:7615:3: ( ( ruleQN ) )
            // InternalUddl.g:7616:4: ( ruleQN )
            {
            // InternalUddl.g:7616:4: ( ruleQN )
            // InternalUddl.g:7617:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformOctetRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformOctetAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformOctetAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformOctet"


    // $ANTLR start "entryRulePlatformChar"
    // InternalUddl.g:7639:1: entryRulePlatformChar returns [EObject current=null] : iv_rulePlatformChar= rulePlatformChar EOF ;
    public final EObject entryRulePlatformChar() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformChar = null;


        try {
            // InternalUddl.g:7639:53: (iv_rulePlatformChar= rulePlatformChar EOF )
            // InternalUddl.g:7640:2: iv_rulePlatformChar= rulePlatformChar EOF
            {
             newCompositeNode(grammarAccess.getPlatformCharRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformChar=rulePlatformChar();

            state._fsp--;

             current =iv_rulePlatformChar; 
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
    // $ANTLR end "entryRulePlatformChar"


    // $ANTLR start "rulePlatformChar"
    // InternalUddl.g:7646:1: rulePlatformChar returns [EObject current=null] : (otherlv_0= 'char' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformChar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:7652:2: ( (otherlv_0= 'char' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:7653:2: (otherlv_0= 'char' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:7653:2: (otherlv_0= 'char' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:7654:3: otherlv_0= 'char' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,101,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformCharAccess().getCharKeyword_0());
            		
            // InternalUddl.g:7658:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:7659:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:7659:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:7660:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_83); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformCharAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformCharRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:7676:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==RULE_STRING) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // InternalUddl.g:7677:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:7677:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:7678:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformCharAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformCharRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformCharAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:7698:3: ( ( ruleQN ) )
            // InternalUddl.g:7699:4: ( ruleQN )
            {
            // InternalUddl.g:7699:4: ( ruleQN )
            // InternalUddl.g:7700:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformCharRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformCharAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformCharAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformChar"


    // $ANTLR start "entryRulePlatformStringType"
    // InternalUddl.g:7722:1: entryRulePlatformStringType returns [EObject current=null] : iv_rulePlatformStringType= rulePlatformStringType EOF ;
    public final EObject entryRulePlatformStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformStringType = null;


        try {
            // InternalUddl.g:7722:59: (iv_rulePlatformStringType= rulePlatformStringType EOF )
            // InternalUddl.g:7723:2: iv_rulePlatformStringType= rulePlatformStringType EOF
            {
             newCompositeNode(grammarAccess.getPlatformStringTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformStringType=rulePlatformStringType();

            state._fsp--;

             current =iv_rulePlatformStringType; 
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
    // $ANTLR end "entryRulePlatformStringType"


    // $ANTLR start "rulePlatformStringType"
    // InternalUddl.g:7729:1: rulePlatformStringType returns [EObject current=null] : (this_PlatformString_0= rulePlatformString | this_PlatformBoundedString_1= rulePlatformBoundedString | this_PlatformCharArray_2= rulePlatformCharArray ) ;
    public final EObject rulePlatformStringType() throws RecognitionException {
        EObject current = null;

        EObject this_PlatformString_0 = null;

        EObject this_PlatformBoundedString_1 = null;

        EObject this_PlatformCharArray_2 = null;



        	enterRule();

        try {
            // InternalUddl.g:7735:2: ( (this_PlatformString_0= rulePlatformString | this_PlatformBoundedString_1= rulePlatformBoundedString | this_PlatformCharArray_2= rulePlatformCharArray ) )
            // InternalUddl.g:7736:2: (this_PlatformString_0= rulePlatformString | this_PlatformBoundedString_1= rulePlatformBoundedString | this_PlatformCharArray_2= rulePlatformCharArray )
            {
            // InternalUddl.g:7736:2: (this_PlatformString_0= rulePlatformString | this_PlatformBoundedString_1= rulePlatformBoundedString | this_PlatformCharArray_2= rulePlatformCharArray )
            int alt160=3;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt160=1;
                }
                break;
            case 103:
                {
                alt160=2;
                }
                break;
            case 104:
                {
                alt160=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 160, 0, input);

                throw nvae;
            }

            switch (alt160) {
                case 1 :
                    // InternalUddl.g:7737:3: this_PlatformString_0= rulePlatformString
                    {

                    			newCompositeNode(grammarAccess.getPlatformStringTypeAccess().getPlatformStringParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformString_0=rulePlatformString();

                    state._fsp--;


                    			current = this_PlatformString_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:7746:3: this_PlatformBoundedString_1= rulePlatformBoundedString
                    {

                    			newCompositeNode(grammarAccess.getPlatformStringTypeAccess().getPlatformBoundedStringParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformBoundedString_1=rulePlatformBoundedString();

                    state._fsp--;


                    			current = this_PlatformBoundedString_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUddl.g:7755:3: this_PlatformCharArray_2= rulePlatformCharArray
                    {

                    			newCompositeNode(grammarAccess.getPlatformStringTypeAccess().getPlatformCharArrayParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformCharArray_2=rulePlatformCharArray();

                    state._fsp--;


                    			current = this_PlatformCharArray_2;
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
    // $ANTLR end "rulePlatformStringType"


    // $ANTLR start "entryRulePlatformString"
    // InternalUddl.g:7767:1: entryRulePlatformString returns [EObject current=null] : iv_rulePlatformString= rulePlatformString EOF ;
    public final EObject entryRulePlatformString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformString = null;


        try {
            // InternalUddl.g:7767:55: (iv_rulePlatformString= rulePlatformString EOF )
            // InternalUddl.g:7768:2: iv_rulePlatformString= rulePlatformString EOF
            {
             newCompositeNode(grammarAccess.getPlatformStringRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformString=rulePlatformString();

            state._fsp--;

             current =iv_rulePlatformString; 
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
    // $ANTLR end "entryRulePlatformString"


    // $ANTLR start "rulePlatformString"
    // InternalUddl.g:7774:1: rulePlatformString returns [EObject current=null] : (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:7780:2: ( (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:7781:2: (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:7781:2: (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:7782:3: otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,102,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformStringAccess().getStringKeyword_0());
            		
            // InternalUddl.g:7786:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:7787:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:7787:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:7788:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_83); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformStringAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformStringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:7804:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==RULE_STRING) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // InternalUddl.g:7805:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:7805:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:7806:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformStringAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformStringRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformStringAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:7826:3: ( ( ruleQN ) )
            // InternalUddl.g:7827:4: ( ruleQN )
            {
            // InternalUddl.g:7827:4: ( ruleQN )
            // InternalUddl.g:7828:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformStringRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformStringAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformStringAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformString"


    // $ANTLR start "entryRulePlatformBoundedString"
    // InternalUddl.g:7850:1: entryRulePlatformBoundedString returns [EObject current=null] : iv_rulePlatformBoundedString= rulePlatformBoundedString EOF ;
    public final EObject entryRulePlatformBoundedString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformBoundedString = null;


        try {
            // InternalUddl.g:7850:62: (iv_rulePlatformBoundedString= rulePlatformBoundedString EOF )
            // InternalUddl.g:7851:2: iv_rulePlatformBoundedString= rulePlatformBoundedString EOF
            {
             newCompositeNode(grammarAccess.getPlatformBoundedStringRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformBoundedString=rulePlatformBoundedString();

            state._fsp--;

             current =iv_rulePlatformBoundedString; 
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
    // $ANTLR end "entryRulePlatformBoundedString"


    // $ANTLR start "rulePlatformBoundedString"
    // InternalUddl.g:7857:1: rulePlatformBoundedString returns [EObject current=null] : (otherlv_0= 'string[' ( (lv_maxLength_1_0= RULE_INT ) ) otherlv_2= ']' ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';' ) ;
    public final EObject rulePlatformBoundedString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_maxLength_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalUddl.g:7863:2: ( (otherlv_0= 'string[' ( (lv_maxLength_1_0= RULE_INT ) ) otherlv_2= ']' ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';' ) )
            // InternalUddl.g:7864:2: (otherlv_0= 'string[' ( (lv_maxLength_1_0= RULE_INT ) ) otherlv_2= ']' ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';' )
            {
            // InternalUddl.g:7864:2: (otherlv_0= 'string[' ( (lv_maxLength_1_0= RULE_INT ) ) otherlv_2= ']' ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';' )
            // InternalUddl.g:7865:3: otherlv_0= 'string[' ( (lv_maxLength_1_0= RULE_INT ) ) otherlv_2= ']' ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,103,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformBoundedStringAccess().getStringKeyword_0());
            		
            // InternalUddl.g:7869:3: ( (lv_maxLength_1_0= RULE_INT ) )
            // InternalUddl.g:7870:4: (lv_maxLength_1_0= RULE_INT )
            {
            // InternalUddl.g:7870:4: (lv_maxLength_1_0= RULE_INT )
            // InternalUddl.g:7871:5: lv_maxLength_1_0= RULE_INT
            {
            lv_maxLength_1_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_maxLength_1_0, grammarAccess.getPlatformBoundedStringAccess().getMaxLengthINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformBoundedStringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"maxLength",
            						lv_maxLength_1_0,
            						"com.epistimis.uddl.Uddl.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPlatformBoundedStringAccess().getRightSquareBracketKeyword_2());
            		
            // InternalUddl.g:7891:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalUddl.g:7892:4: (lv_name_3_0= RULE_ID )
            {
            // InternalUddl.g:7892:4: (lv_name_3_0= RULE_ID )
            // InternalUddl.g:7893:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_83); 

            					newLeafNode(lv_name_3_0, grammarAccess.getPlatformBoundedStringAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformBoundedStringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:7909:3: ( (lv_description_4_0= RULE_STRING ) )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==RULE_STRING) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // InternalUddl.g:7910:4: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalUddl.g:7910:4: (lv_description_4_0= RULE_STRING )
                    // InternalUddl.g:7911:5: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

                    					newLeafNode(lv_description_4_0, grammarAccess.getPlatformBoundedStringAccess().getDescriptionSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformBoundedStringRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_4_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformBoundedStringAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            // InternalUddl.g:7931:3: ( ( ruleQN ) )
            // InternalUddl.g:7932:4: ( ruleQN )
            {
            // InternalUddl.g:7932:4: ( ruleQN )
            // InternalUddl.g:7933:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformBoundedStringRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformBoundedStringAccess().getRealizesLogicalElementCrossReference_6_0());
            				
            pushFollow(FOLLOW_13);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPlatformBoundedStringAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "rulePlatformBoundedString"


    // $ANTLR start "entryRulePlatformCharArray"
    // InternalUddl.g:7955:1: entryRulePlatformCharArray returns [EObject current=null] : iv_rulePlatformCharArray= rulePlatformCharArray EOF ;
    public final EObject entryRulePlatformCharArray() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformCharArray = null;


        try {
            // InternalUddl.g:7955:58: (iv_rulePlatformCharArray= rulePlatformCharArray EOF )
            // InternalUddl.g:7956:2: iv_rulePlatformCharArray= rulePlatformCharArray EOF
            {
             newCompositeNode(grammarAccess.getPlatformCharArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformCharArray=rulePlatformCharArray();

            state._fsp--;

             current =iv_rulePlatformCharArray; 
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
    // $ANTLR end "entryRulePlatformCharArray"


    // $ANTLR start "rulePlatformCharArray"
    // InternalUddl.g:7962:1: rulePlatformCharArray returns [EObject current=null] : (otherlv_0= 'char[' ( (lv_length_1_0= RULE_INT ) ) otherlv_2= ']' ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';' ) ;
    public final EObject rulePlatformCharArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_length_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalUddl.g:7968:2: ( (otherlv_0= 'char[' ( (lv_length_1_0= RULE_INT ) ) otherlv_2= ']' ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';' ) )
            // InternalUddl.g:7969:2: (otherlv_0= 'char[' ( (lv_length_1_0= RULE_INT ) ) otherlv_2= ']' ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';' )
            {
            // InternalUddl.g:7969:2: (otherlv_0= 'char[' ( (lv_length_1_0= RULE_INT ) ) otherlv_2= ']' ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';' )
            // InternalUddl.g:7970:3: otherlv_0= 'char[' ( (lv_length_1_0= RULE_INT ) ) otherlv_2= ']' ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,104,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformCharArrayAccess().getCharKeyword_0());
            		
            // InternalUddl.g:7974:3: ( (lv_length_1_0= RULE_INT ) )
            // InternalUddl.g:7975:4: (lv_length_1_0= RULE_INT )
            {
            // InternalUddl.g:7975:4: (lv_length_1_0= RULE_INT )
            // InternalUddl.g:7976:5: lv_length_1_0= RULE_INT
            {
            lv_length_1_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_length_1_0, grammarAccess.getPlatformCharArrayAccess().getLengthINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformCharArrayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"length",
            						lv_length_1_0,
            						"com.epistimis.uddl.Uddl.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPlatformCharArrayAccess().getRightSquareBracketKeyword_2());
            		
            // InternalUddl.g:7996:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalUddl.g:7997:4: (lv_name_3_0= RULE_ID )
            {
            // InternalUddl.g:7997:4: (lv_name_3_0= RULE_ID )
            // InternalUddl.g:7998:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_83); 

            					newLeafNode(lv_name_3_0, grammarAccess.getPlatformCharArrayAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformCharArrayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:8014:3: ( (lv_description_4_0= RULE_STRING ) )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==RULE_STRING) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // InternalUddl.g:8015:4: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalUddl.g:8015:4: (lv_description_4_0= RULE_STRING )
                    // InternalUddl.g:8016:5: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

                    					newLeafNode(lv_description_4_0, grammarAccess.getPlatformCharArrayAccess().getDescriptionSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformCharArrayRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_4_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformCharArrayAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            // InternalUddl.g:8036:3: ( ( ruleQN ) )
            // InternalUddl.g:8037:4: ( ruleQN )
            {
            // InternalUddl.g:8037:4: ( ruleQN )
            // InternalUddl.g:8038:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformCharArrayRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformCharArrayAccess().getRealizesLogicalElementCrossReference_6_0());
            				
            pushFollow(FOLLOW_13);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPlatformCharArrayAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "rulePlatformCharArray"


    // $ANTLR start "entryRulePlatformEnumeration"
    // InternalUddl.g:8060:1: entryRulePlatformEnumeration returns [EObject current=null] : iv_rulePlatformEnumeration= rulePlatformEnumeration EOF ;
    public final EObject entryRulePlatformEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformEnumeration = null;


        try {
            // InternalUddl.g:8060:60: (iv_rulePlatformEnumeration= rulePlatformEnumeration EOF )
            // InternalUddl.g:8061:2: iv_rulePlatformEnumeration= rulePlatformEnumeration EOF
            {
             newCompositeNode(grammarAccess.getPlatformEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformEnumeration=rulePlatformEnumeration();

            state._fsp--;

             current =iv_rulePlatformEnumeration; 
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
    // $ANTLR end "entryRulePlatformEnumeration"


    // $ANTLR start "rulePlatformEnumeration"
    // InternalUddl.g:8067:1: rulePlatformEnumeration returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:8073:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:8074:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:8074:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:8075:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformEnumerationAccess().getEnumKeyword_0());
            		
            // InternalUddl.g:8079:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:8080:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:8080:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:8081:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_83); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformEnumerationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformEnumerationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:8097:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==RULE_STRING) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // InternalUddl.g:8098:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:8098:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:8099:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformEnumerationAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformEnumerationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformEnumerationAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:8119:3: ( ( ruleQN ) )
            // InternalUddl.g:8120:4: ( ruleQN )
            {
            // InternalUddl.g:8120:4: ( ruleQN )
            // InternalUddl.g:8121:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformEnumerationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformEnumerationAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformEnumerationAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformEnumeration"


    // $ANTLR start "entryRulePlatformNumber"
    // InternalUddl.g:8143:1: entryRulePlatformNumber returns [EObject current=null] : iv_rulePlatformNumber= rulePlatformNumber EOF ;
    public final EObject entryRulePlatformNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformNumber = null;


        try {
            // InternalUddl.g:8143:55: (iv_rulePlatformNumber= rulePlatformNumber EOF )
            // InternalUddl.g:8144:2: iv_rulePlatformNumber= rulePlatformNumber EOF
            {
             newCompositeNode(grammarAccess.getPlatformNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformNumber=rulePlatformNumber();

            state._fsp--;

             current =iv_rulePlatformNumber; 
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
    // $ANTLR end "entryRulePlatformNumber"


    // $ANTLR start "rulePlatformNumber"
    // InternalUddl.g:8150:1: rulePlatformNumber returns [EObject current=null] : (this_PlatformReal_0= rulePlatformReal | this_PlatformInteger_1= rulePlatformInteger ) ;
    public final EObject rulePlatformNumber() throws RecognitionException {
        EObject current = null;

        EObject this_PlatformReal_0 = null;

        EObject this_PlatformInteger_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:8156:2: ( (this_PlatformReal_0= rulePlatformReal | this_PlatformInteger_1= rulePlatformInteger ) )
            // InternalUddl.g:8157:2: (this_PlatformReal_0= rulePlatformReal | this_PlatformInteger_1= rulePlatformInteger )
            {
            // InternalUddl.g:8157:2: (this_PlatformReal_0= rulePlatformReal | this_PlatformInteger_1= rulePlatformInteger )
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( ((LA165_0>=108 && LA165_0<=111)) ) {
                alt165=1;
            }
            else if ( ((LA165_0>=105 && LA165_0<=107)||(LA165_0>=112 && LA165_0<=114)) ) {
                alt165=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 165, 0, input);

                throw nvae;
            }
            switch (alt165) {
                case 1 :
                    // InternalUddl.g:8158:3: this_PlatformReal_0= rulePlatformReal
                    {

                    			newCompositeNode(grammarAccess.getPlatformNumberAccess().getPlatformRealParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformReal_0=rulePlatformReal();

                    state._fsp--;


                    			current = this_PlatformReal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:8167:3: this_PlatformInteger_1= rulePlatformInteger
                    {

                    			newCompositeNode(grammarAccess.getPlatformNumberAccess().getPlatformIntegerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformInteger_1=rulePlatformInteger();

                    state._fsp--;


                    			current = this_PlatformInteger_1;
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
    // $ANTLR end "rulePlatformNumber"


    // $ANTLR start "entryRulePlatformInteger"
    // InternalUddl.g:8179:1: entryRulePlatformInteger returns [EObject current=null] : iv_rulePlatformInteger= rulePlatformInteger EOF ;
    public final EObject entryRulePlatformInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformInteger = null;


        try {
            // InternalUddl.g:8179:56: (iv_rulePlatformInteger= rulePlatformInteger EOF )
            // InternalUddl.g:8180:2: iv_rulePlatformInteger= rulePlatformInteger EOF
            {
             newCompositeNode(grammarAccess.getPlatformIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformInteger=rulePlatformInteger();

            state._fsp--;

             current =iv_rulePlatformInteger; 
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
    // $ANTLR end "entryRulePlatformInteger"


    // $ANTLR start "rulePlatformInteger"
    // InternalUddl.g:8186:1: rulePlatformInteger returns [EObject current=null] : (this_PlatformLong_0= rulePlatformLong | this_PlatformShort_1= rulePlatformShort | this_PlatformUnsignedInteger_2= rulePlatformUnsignedInteger | this_PlatformLongLong_3= rulePlatformLongLong ) ;
    public final EObject rulePlatformInteger() throws RecognitionException {
        EObject current = null;

        EObject this_PlatformLong_0 = null;

        EObject this_PlatformShort_1 = null;

        EObject this_PlatformUnsignedInteger_2 = null;

        EObject this_PlatformLongLong_3 = null;



        	enterRule();

        try {
            // InternalUddl.g:8192:2: ( (this_PlatformLong_0= rulePlatformLong | this_PlatformShort_1= rulePlatformShort | this_PlatformUnsignedInteger_2= rulePlatformUnsignedInteger | this_PlatformLongLong_3= rulePlatformLongLong ) )
            // InternalUddl.g:8193:2: (this_PlatformLong_0= rulePlatformLong | this_PlatformShort_1= rulePlatformShort | this_PlatformUnsignedInteger_2= rulePlatformUnsignedInteger | this_PlatformLongLong_3= rulePlatformLongLong )
            {
            // InternalUddl.g:8193:2: (this_PlatformLong_0= rulePlatformLong | this_PlatformShort_1= rulePlatformShort | this_PlatformUnsignedInteger_2= rulePlatformUnsignedInteger | this_PlatformLongLong_3= rulePlatformLongLong )
            int alt166=4;
            switch ( input.LA(1) ) {
            case 106:
                {
                alt166=1;
                }
                break;
            case 105:
                {
                alt166=2;
                }
                break;
            case 112:
            case 113:
            case 114:
                {
                alt166=3;
                }
                break;
            case 107:
                {
                alt166=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 166, 0, input);

                throw nvae;
            }

            switch (alt166) {
                case 1 :
                    // InternalUddl.g:8194:3: this_PlatformLong_0= rulePlatformLong
                    {

                    			newCompositeNode(grammarAccess.getPlatformIntegerAccess().getPlatformLongParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformLong_0=rulePlatformLong();

                    state._fsp--;


                    			current = this_PlatformLong_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:8203:3: this_PlatformShort_1= rulePlatformShort
                    {

                    			newCompositeNode(grammarAccess.getPlatformIntegerAccess().getPlatformShortParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformShort_1=rulePlatformShort();

                    state._fsp--;


                    			current = this_PlatformShort_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUddl.g:8212:3: this_PlatformUnsignedInteger_2= rulePlatformUnsignedInteger
                    {

                    			newCompositeNode(grammarAccess.getPlatformIntegerAccess().getPlatformUnsignedIntegerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformUnsignedInteger_2=rulePlatformUnsignedInteger();

                    state._fsp--;


                    			current = this_PlatformUnsignedInteger_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUddl.g:8221:3: this_PlatformLongLong_3= rulePlatformLongLong
                    {

                    			newCompositeNode(grammarAccess.getPlatformIntegerAccess().getPlatformLongLongParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformLongLong_3=rulePlatformLongLong();

                    state._fsp--;


                    			current = this_PlatformLongLong_3;
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
    // $ANTLR end "rulePlatformInteger"


    // $ANTLR start "entryRulePlatformShort"
    // InternalUddl.g:8233:1: entryRulePlatformShort returns [EObject current=null] : iv_rulePlatformShort= rulePlatformShort EOF ;
    public final EObject entryRulePlatformShort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformShort = null;


        try {
            // InternalUddl.g:8233:54: (iv_rulePlatformShort= rulePlatformShort EOF )
            // InternalUddl.g:8234:2: iv_rulePlatformShort= rulePlatformShort EOF
            {
             newCompositeNode(grammarAccess.getPlatformShortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformShort=rulePlatformShort();

            state._fsp--;

             current =iv_rulePlatformShort; 
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
    // $ANTLR end "entryRulePlatformShort"


    // $ANTLR start "rulePlatformShort"
    // InternalUddl.g:8240:1: rulePlatformShort returns [EObject current=null] : (otherlv_0= 'short' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformShort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:8246:2: ( (otherlv_0= 'short' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:8247:2: (otherlv_0= 'short' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:8247:2: (otherlv_0= 'short' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:8248:3: otherlv_0= 'short' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,105,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformShortAccess().getShortKeyword_0());
            		
            // InternalUddl.g:8252:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:8253:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:8253:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:8254:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_83); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformShortAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformShortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:8270:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==RULE_STRING) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // InternalUddl.g:8271:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:8271:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:8272:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformShortAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformShortRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformShortAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:8292:3: ( ( ruleQN ) )
            // InternalUddl.g:8293:4: ( ruleQN )
            {
            // InternalUddl.g:8293:4: ( ruleQN )
            // InternalUddl.g:8294:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformShortRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformShortAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformShortAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformShort"


    // $ANTLR start "entryRulePlatformLong"
    // InternalUddl.g:8316:1: entryRulePlatformLong returns [EObject current=null] : iv_rulePlatformLong= rulePlatformLong EOF ;
    public final EObject entryRulePlatformLong() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformLong = null;


        try {
            // InternalUddl.g:8316:53: (iv_rulePlatformLong= rulePlatformLong EOF )
            // InternalUddl.g:8317:2: iv_rulePlatformLong= rulePlatformLong EOF
            {
             newCompositeNode(grammarAccess.getPlatformLongRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformLong=rulePlatformLong();

            state._fsp--;

             current =iv_rulePlatformLong; 
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
    // $ANTLR end "entryRulePlatformLong"


    // $ANTLR start "rulePlatformLong"
    // InternalUddl.g:8323:1: rulePlatformLong returns [EObject current=null] : (otherlv_0= 'long' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformLong() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:8329:2: ( (otherlv_0= 'long' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:8330:2: (otherlv_0= 'long' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:8330:2: (otherlv_0= 'long' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:8331:3: otherlv_0= 'long' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,106,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformLongAccess().getLongKeyword_0());
            		
            // InternalUddl.g:8335:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:8336:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:8336:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:8337:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_83); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformLongAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformLongRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:8353:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==RULE_STRING) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // InternalUddl.g:8354:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:8354:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:8355:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformLongAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformLongRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformLongAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:8375:3: ( ( ruleQN ) )
            // InternalUddl.g:8376:4: ( ruleQN )
            {
            // InternalUddl.g:8376:4: ( ruleQN )
            // InternalUddl.g:8377:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformLongRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformLongAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformLongAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformLong"


    // $ANTLR start "entryRulePlatformLongLong"
    // InternalUddl.g:8399:1: entryRulePlatformLongLong returns [EObject current=null] : iv_rulePlatformLongLong= rulePlatformLongLong EOF ;
    public final EObject entryRulePlatformLongLong() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformLongLong = null;


        try {
            // InternalUddl.g:8399:57: (iv_rulePlatformLongLong= rulePlatformLongLong EOF )
            // InternalUddl.g:8400:2: iv_rulePlatformLongLong= rulePlatformLongLong EOF
            {
             newCompositeNode(grammarAccess.getPlatformLongLongRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformLongLong=rulePlatformLongLong();

            state._fsp--;

             current =iv_rulePlatformLongLong; 
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
    // $ANTLR end "entryRulePlatformLongLong"


    // $ANTLR start "rulePlatformLongLong"
    // InternalUddl.g:8406:1: rulePlatformLongLong returns [EObject current=null] : (otherlv_0= 'llong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformLongLong() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:8412:2: ( (otherlv_0= 'llong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:8413:2: (otherlv_0= 'llong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:8413:2: (otherlv_0= 'llong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:8414:3: otherlv_0= 'llong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,107,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformLongLongAccess().getLlongKeyword_0());
            		
            // InternalUddl.g:8418:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:8419:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:8419:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:8420:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_83); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformLongLongAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformLongLongRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:8436:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==RULE_STRING) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // InternalUddl.g:8437:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:8437:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:8438:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformLongLongAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformLongLongRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformLongLongAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:8458:3: ( ( ruleQN ) )
            // InternalUddl.g:8459:4: ( ruleQN )
            {
            // InternalUddl.g:8459:4: ( ruleQN )
            // InternalUddl.g:8460:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformLongLongRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformLongLongAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformLongLongAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformLongLong"


    // $ANTLR start "entryRulePlatformReal"
    // InternalUddl.g:8482:1: entryRulePlatformReal returns [EObject current=null] : iv_rulePlatformReal= rulePlatformReal EOF ;
    public final EObject entryRulePlatformReal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformReal = null;


        try {
            // InternalUddl.g:8482:53: (iv_rulePlatformReal= rulePlatformReal EOF )
            // InternalUddl.g:8483:2: iv_rulePlatformReal= rulePlatformReal EOF
            {
             newCompositeNode(grammarAccess.getPlatformRealRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformReal=rulePlatformReal();

            state._fsp--;

             current =iv_rulePlatformReal; 
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
    // $ANTLR end "entryRulePlatformReal"


    // $ANTLR start "rulePlatformReal"
    // InternalUddl.g:8489:1: rulePlatformReal returns [EObject current=null] : (this_PlatformFixed_0= rulePlatformFixed | this_PlatformFloat_1= rulePlatformFloat | this_PlatformDouble_2= rulePlatformDouble | this_PlatformLongDouble_3= rulePlatformLongDouble ) ;
    public final EObject rulePlatformReal() throws RecognitionException {
        EObject current = null;

        EObject this_PlatformFixed_0 = null;

        EObject this_PlatformFloat_1 = null;

        EObject this_PlatformDouble_2 = null;

        EObject this_PlatformLongDouble_3 = null;



        	enterRule();

        try {
            // InternalUddl.g:8495:2: ( (this_PlatformFixed_0= rulePlatformFixed | this_PlatformFloat_1= rulePlatformFloat | this_PlatformDouble_2= rulePlatformDouble | this_PlatformLongDouble_3= rulePlatformLongDouble ) )
            // InternalUddl.g:8496:2: (this_PlatformFixed_0= rulePlatformFixed | this_PlatformFloat_1= rulePlatformFloat | this_PlatformDouble_2= rulePlatformDouble | this_PlatformLongDouble_3= rulePlatformLongDouble )
            {
            // InternalUddl.g:8496:2: (this_PlatformFixed_0= rulePlatformFixed | this_PlatformFloat_1= rulePlatformFloat | this_PlatformDouble_2= rulePlatformDouble | this_PlatformLongDouble_3= rulePlatformLongDouble )
            int alt170=4;
            switch ( input.LA(1) ) {
            case 111:
                {
                alt170=1;
                }
                break;
            case 110:
                {
                alt170=2;
                }
                break;
            case 108:
                {
                alt170=3;
                }
                break;
            case 109:
                {
                alt170=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 170, 0, input);

                throw nvae;
            }

            switch (alt170) {
                case 1 :
                    // InternalUddl.g:8497:3: this_PlatformFixed_0= rulePlatformFixed
                    {

                    			newCompositeNode(grammarAccess.getPlatformRealAccess().getPlatformFixedParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformFixed_0=rulePlatformFixed();

                    state._fsp--;


                    			current = this_PlatformFixed_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:8506:3: this_PlatformFloat_1= rulePlatformFloat
                    {

                    			newCompositeNode(grammarAccess.getPlatformRealAccess().getPlatformFloatParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformFloat_1=rulePlatformFloat();

                    state._fsp--;


                    			current = this_PlatformFloat_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUddl.g:8515:3: this_PlatformDouble_2= rulePlatformDouble
                    {

                    			newCompositeNode(grammarAccess.getPlatformRealAccess().getPlatformDoubleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformDouble_2=rulePlatformDouble();

                    state._fsp--;


                    			current = this_PlatformDouble_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUddl.g:8524:3: this_PlatformLongDouble_3= rulePlatformLongDouble
                    {

                    			newCompositeNode(grammarAccess.getPlatformRealAccess().getPlatformLongDoubleParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformLongDouble_3=rulePlatformLongDouble();

                    state._fsp--;


                    			current = this_PlatformLongDouble_3;
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
    // $ANTLR end "rulePlatformReal"


    // $ANTLR start "entryRulePlatformDouble"
    // InternalUddl.g:8536:1: entryRulePlatformDouble returns [EObject current=null] : iv_rulePlatformDouble= rulePlatformDouble EOF ;
    public final EObject entryRulePlatformDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformDouble = null;


        try {
            // InternalUddl.g:8536:55: (iv_rulePlatformDouble= rulePlatformDouble EOF )
            // InternalUddl.g:8537:2: iv_rulePlatformDouble= rulePlatformDouble EOF
            {
             newCompositeNode(grammarAccess.getPlatformDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformDouble=rulePlatformDouble();

            state._fsp--;

             current =iv_rulePlatformDouble; 
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
    // $ANTLR end "entryRulePlatformDouble"


    // $ANTLR start "rulePlatformDouble"
    // InternalUddl.g:8543:1: rulePlatformDouble returns [EObject current=null] : (otherlv_0= 'double' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformDouble() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:8549:2: ( (otherlv_0= 'double' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:8550:2: (otherlv_0= 'double' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:8550:2: (otherlv_0= 'double' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:8551:3: otherlv_0= 'double' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,108,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformDoubleAccess().getDoubleKeyword_0());
            		
            // InternalUddl.g:8555:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:8556:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:8556:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:8557:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_83); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformDoubleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformDoubleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:8573:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==RULE_STRING) ) {
                alt171=1;
            }
            switch (alt171) {
                case 1 :
                    // InternalUddl.g:8574:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:8574:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:8575:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformDoubleAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformDoubleRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformDoubleAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:8595:3: ( ( ruleQN ) )
            // InternalUddl.g:8596:4: ( ruleQN )
            {
            // InternalUddl.g:8596:4: ( ruleQN )
            // InternalUddl.g:8597:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformDoubleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformDoubleAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformDoubleAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformDouble"


    // $ANTLR start "entryRulePlatformLongDouble"
    // InternalUddl.g:8619:1: entryRulePlatformLongDouble returns [EObject current=null] : iv_rulePlatformLongDouble= rulePlatformLongDouble EOF ;
    public final EObject entryRulePlatformLongDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformLongDouble = null;


        try {
            // InternalUddl.g:8619:59: (iv_rulePlatformLongDouble= rulePlatformLongDouble EOF )
            // InternalUddl.g:8620:2: iv_rulePlatformLongDouble= rulePlatformLongDouble EOF
            {
             newCompositeNode(grammarAccess.getPlatformLongDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformLongDouble=rulePlatformLongDouble();

            state._fsp--;

             current =iv_rulePlatformLongDouble; 
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
    // $ANTLR end "entryRulePlatformLongDouble"


    // $ANTLR start "rulePlatformLongDouble"
    // InternalUddl.g:8626:1: rulePlatformLongDouble returns [EObject current=null] : (otherlv_0= 'ldouble' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformLongDouble() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:8632:2: ( (otherlv_0= 'ldouble' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:8633:2: (otherlv_0= 'ldouble' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:8633:2: (otherlv_0= 'ldouble' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:8634:3: otherlv_0= 'ldouble' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,109,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformLongDoubleAccess().getLdoubleKeyword_0());
            		
            // InternalUddl.g:8638:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:8639:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:8639:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:8640:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_83); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformLongDoubleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformLongDoubleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:8656:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==RULE_STRING) ) {
                alt172=1;
            }
            switch (alt172) {
                case 1 :
                    // InternalUddl.g:8657:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:8657:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:8658:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformLongDoubleAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformLongDoubleRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformLongDoubleAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:8678:3: ( ( ruleQN ) )
            // InternalUddl.g:8679:4: ( ruleQN )
            {
            // InternalUddl.g:8679:4: ( ruleQN )
            // InternalUddl.g:8680:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformLongDoubleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformLongDoubleAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformLongDoubleAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformLongDouble"


    // $ANTLR start "entryRulePlatformFloat"
    // InternalUddl.g:8702:1: entryRulePlatformFloat returns [EObject current=null] : iv_rulePlatformFloat= rulePlatformFloat EOF ;
    public final EObject entryRulePlatformFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformFloat = null;


        try {
            // InternalUddl.g:8702:54: (iv_rulePlatformFloat= rulePlatformFloat EOF )
            // InternalUddl.g:8703:2: iv_rulePlatformFloat= rulePlatformFloat EOF
            {
             newCompositeNode(grammarAccess.getPlatformFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformFloat=rulePlatformFloat();

            state._fsp--;

             current =iv_rulePlatformFloat; 
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
    // $ANTLR end "entryRulePlatformFloat"


    // $ANTLR start "rulePlatformFloat"
    // InternalUddl.g:8709:1: rulePlatformFloat returns [EObject current=null] : (otherlv_0= 'float' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformFloat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:8715:2: ( (otherlv_0= 'float' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:8716:2: (otherlv_0= 'float' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:8716:2: (otherlv_0= 'float' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:8717:3: otherlv_0= 'float' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,110,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformFloatAccess().getFloatKeyword_0());
            		
            // InternalUddl.g:8721:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:8722:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:8722:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:8723:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_83); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformFloatAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformFloatRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:8739:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==RULE_STRING) ) {
                alt173=1;
            }
            switch (alt173) {
                case 1 :
                    // InternalUddl.g:8740:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:8740:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:8741:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformFloatAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformFloatRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformFloatAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:8761:3: ( ( ruleQN ) )
            // InternalUddl.g:8762:4: ( ruleQN )
            {
            // InternalUddl.g:8762:4: ( ruleQN )
            // InternalUddl.g:8763:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformFloatRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformFloatAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformFloatAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformFloat"


    // $ANTLR start "entryRulePlatformFixed"
    // InternalUddl.g:8785:1: entryRulePlatformFixed returns [EObject current=null] : iv_rulePlatformFixed= rulePlatformFixed EOF ;
    public final EObject entryRulePlatformFixed() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformFixed = null;


        try {
            // InternalUddl.g:8785:54: (iv_rulePlatformFixed= rulePlatformFixed EOF )
            // InternalUddl.g:8786:2: iv_rulePlatformFixed= rulePlatformFixed EOF
            {
             newCompositeNode(grammarAccess.getPlatformFixedRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformFixed=rulePlatformFixed();

            state._fsp--;

             current =iv_rulePlatformFixed; 
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
    // $ANTLR end "entryRulePlatformFixed"


    // $ANTLR start "rulePlatformFixed"
    // InternalUddl.g:8792:1: rulePlatformFixed returns [EObject current=null] : (otherlv_0= 'fixed[' ( (lv_digits_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_scale_3_0= RULE_INT ) ) otherlv_4= ']' ( (lv_name_5_0= RULE_ID ) ) ( (lv_description_6_0= RULE_STRING ) )? otherlv_7= '->' ( ( ruleQN ) ) otherlv_9= ';' ) ;
    public final EObject rulePlatformFixed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_digits_1_0=null;
        Token otherlv_2=null;
        Token lv_scale_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalUddl.g:8798:2: ( (otherlv_0= 'fixed[' ( (lv_digits_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_scale_3_0= RULE_INT ) ) otherlv_4= ']' ( (lv_name_5_0= RULE_ID ) ) ( (lv_description_6_0= RULE_STRING ) )? otherlv_7= '->' ( ( ruleQN ) ) otherlv_9= ';' ) )
            // InternalUddl.g:8799:2: (otherlv_0= 'fixed[' ( (lv_digits_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_scale_3_0= RULE_INT ) ) otherlv_4= ']' ( (lv_name_5_0= RULE_ID ) ) ( (lv_description_6_0= RULE_STRING ) )? otherlv_7= '->' ( ( ruleQN ) ) otherlv_9= ';' )
            {
            // InternalUddl.g:8799:2: (otherlv_0= 'fixed[' ( (lv_digits_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_scale_3_0= RULE_INT ) ) otherlv_4= ']' ( (lv_name_5_0= RULE_ID ) ) ( (lv_description_6_0= RULE_STRING ) )? otherlv_7= '->' ( ( ruleQN ) ) otherlv_9= ';' )
            // InternalUddl.g:8800:3: otherlv_0= 'fixed[' ( (lv_digits_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_scale_3_0= RULE_INT ) ) otherlv_4= ']' ( (lv_name_5_0= RULE_ID ) ) ( (lv_description_6_0= RULE_STRING ) )? otherlv_7= '->' ( ( ruleQN ) ) otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,111,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformFixedAccess().getFixedKeyword_0());
            		
            // InternalUddl.g:8804:3: ( (lv_digits_1_0= RULE_INT ) )
            // InternalUddl.g:8805:4: (lv_digits_1_0= RULE_INT )
            {
            // InternalUddl.g:8805:4: (lv_digits_1_0= RULE_INT )
            // InternalUddl.g:8806:5: lv_digits_1_0= RULE_INT
            {
            lv_digits_1_0=(Token)match(input,RULE_INT,FOLLOW_98); 

            					newLeafNode(lv_digits_1_0, grammarAccess.getPlatformFixedAccess().getDigitsINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformFixedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"digits",
            						lv_digits_1_0,
            						"com.epistimis.uddl.Uddl.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getPlatformFixedAccess().getFullStopKeyword_2());
            		
            // InternalUddl.g:8826:3: ( (lv_scale_3_0= RULE_INT ) )
            // InternalUddl.g:8827:4: (lv_scale_3_0= RULE_INT )
            {
            // InternalUddl.g:8827:4: (lv_scale_3_0= RULE_INT )
            // InternalUddl.g:8828:5: lv_scale_3_0= RULE_INT
            {
            lv_scale_3_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_scale_3_0, grammarAccess.getPlatformFixedAccess().getScaleINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformFixedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"scale",
            						lv_scale_3_0,
            						"com.epistimis.uddl.Uddl.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getPlatformFixedAccess().getRightSquareBracketKeyword_4());
            		
            // InternalUddl.g:8848:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalUddl.g:8849:4: (lv_name_5_0= RULE_ID )
            {
            // InternalUddl.g:8849:4: (lv_name_5_0= RULE_ID )
            // InternalUddl.g:8850:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_83); 

            					newLeafNode(lv_name_5_0, grammarAccess.getPlatformFixedAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformFixedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:8866:3: ( (lv_description_6_0= RULE_STRING ) )?
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( (LA174_0==RULE_STRING) ) {
                alt174=1;
            }
            switch (alt174) {
                case 1 :
                    // InternalUddl.g:8867:4: (lv_description_6_0= RULE_STRING )
                    {
                    // InternalUddl.g:8867:4: (lv_description_6_0= RULE_STRING )
                    // InternalUddl.g:8868:5: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

                    					newLeafNode(lv_description_6_0, grammarAccess.getPlatformFixedAccess().getDescriptionSTRINGTerminalRuleCall_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformFixedRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_6_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getPlatformFixedAccess().getHyphenMinusGreaterThanSignKeyword_7());
            		
            // InternalUddl.g:8888:3: ( ( ruleQN ) )
            // InternalUddl.g:8889:4: ( ruleQN )
            {
            // InternalUddl.g:8889:4: ( ruleQN )
            // InternalUddl.g:8890:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformFixedRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformFixedAccess().getRealizesLogicalElementCrossReference_8_0());
            				
            pushFollow(FOLLOW_13);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPlatformFixedAccess().getSemicolonKeyword_9());
            		

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
    // $ANTLR end "rulePlatformFixed"


    // $ANTLR start "entryRulePlatformUnsignedInteger"
    // InternalUddl.g:8912:1: entryRulePlatformUnsignedInteger returns [EObject current=null] : iv_rulePlatformUnsignedInteger= rulePlatformUnsignedInteger EOF ;
    public final EObject entryRulePlatformUnsignedInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformUnsignedInteger = null;


        try {
            // InternalUddl.g:8912:64: (iv_rulePlatformUnsignedInteger= rulePlatformUnsignedInteger EOF )
            // InternalUddl.g:8913:2: iv_rulePlatformUnsignedInteger= rulePlatformUnsignedInteger EOF
            {
             newCompositeNode(grammarAccess.getPlatformUnsignedIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformUnsignedInteger=rulePlatformUnsignedInteger();

            state._fsp--;

             current =iv_rulePlatformUnsignedInteger; 
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
    // $ANTLR end "entryRulePlatformUnsignedInteger"


    // $ANTLR start "rulePlatformUnsignedInteger"
    // InternalUddl.g:8919:1: rulePlatformUnsignedInteger returns [EObject current=null] : (this_PlatformUShort_0= rulePlatformUShort | this_PlatformULong_1= rulePlatformULong | this_PlatformULongLong_2= rulePlatformULongLong ) ;
    public final EObject rulePlatformUnsignedInteger() throws RecognitionException {
        EObject current = null;

        EObject this_PlatformUShort_0 = null;

        EObject this_PlatformULong_1 = null;

        EObject this_PlatformULongLong_2 = null;



        	enterRule();

        try {
            // InternalUddl.g:8925:2: ( (this_PlatformUShort_0= rulePlatformUShort | this_PlatformULong_1= rulePlatformULong | this_PlatformULongLong_2= rulePlatformULongLong ) )
            // InternalUddl.g:8926:2: (this_PlatformUShort_0= rulePlatformUShort | this_PlatformULong_1= rulePlatformULong | this_PlatformULongLong_2= rulePlatformULongLong )
            {
            // InternalUddl.g:8926:2: (this_PlatformUShort_0= rulePlatformUShort | this_PlatformULong_1= rulePlatformULong | this_PlatformULongLong_2= rulePlatformULongLong )
            int alt175=3;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt175=1;
                }
                break;
            case 113:
                {
                alt175=2;
                }
                break;
            case 114:
                {
                alt175=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 175, 0, input);

                throw nvae;
            }

            switch (alt175) {
                case 1 :
                    // InternalUddl.g:8927:3: this_PlatformUShort_0= rulePlatformUShort
                    {

                    			newCompositeNode(grammarAccess.getPlatformUnsignedIntegerAccess().getPlatformUShortParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformUShort_0=rulePlatformUShort();

                    state._fsp--;


                    			current = this_PlatformUShort_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:8936:3: this_PlatformULong_1= rulePlatformULong
                    {

                    			newCompositeNode(grammarAccess.getPlatformUnsignedIntegerAccess().getPlatformULongParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformULong_1=rulePlatformULong();

                    state._fsp--;


                    			current = this_PlatformULong_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUddl.g:8945:3: this_PlatformULongLong_2= rulePlatformULongLong
                    {

                    			newCompositeNode(grammarAccess.getPlatformUnsignedIntegerAccess().getPlatformULongLongParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformULongLong_2=rulePlatformULongLong();

                    state._fsp--;


                    			current = this_PlatformULongLong_2;
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
    // $ANTLR end "rulePlatformUnsignedInteger"


    // $ANTLR start "entryRulePlatformUShort"
    // InternalUddl.g:8957:1: entryRulePlatformUShort returns [EObject current=null] : iv_rulePlatformUShort= rulePlatformUShort EOF ;
    public final EObject entryRulePlatformUShort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformUShort = null;


        try {
            // InternalUddl.g:8957:55: (iv_rulePlatformUShort= rulePlatformUShort EOF )
            // InternalUddl.g:8958:2: iv_rulePlatformUShort= rulePlatformUShort EOF
            {
             newCompositeNode(grammarAccess.getPlatformUShortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformUShort=rulePlatformUShort();

            state._fsp--;

             current =iv_rulePlatformUShort; 
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
    // $ANTLR end "entryRulePlatformUShort"


    // $ANTLR start "rulePlatformUShort"
    // InternalUddl.g:8964:1: rulePlatformUShort returns [EObject current=null] : (otherlv_0= 'ushort' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformUShort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:8970:2: ( (otherlv_0= 'ushort' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:8971:2: (otherlv_0= 'ushort' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:8971:2: (otherlv_0= 'ushort' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:8972:3: otherlv_0= 'ushort' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,112,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformUShortAccess().getUshortKeyword_0());
            		
            // InternalUddl.g:8976:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:8977:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:8977:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:8978:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_83); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformUShortAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformUShortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:8994:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( (LA176_0==RULE_STRING) ) {
                alt176=1;
            }
            switch (alt176) {
                case 1 :
                    // InternalUddl.g:8995:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:8995:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:8996:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformUShortAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformUShortRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformUShortAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:9016:3: ( ( ruleQN ) )
            // InternalUddl.g:9017:4: ( ruleQN )
            {
            // InternalUddl.g:9017:4: ( ruleQN )
            // InternalUddl.g:9018:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformUShortRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformUShortAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformUShortAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformUShort"


    // $ANTLR start "entryRulePlatformULong"
    // InternalUddl.g:9040:1: entryRulePlatformULong returns [EObject current=null] : iv_rulePlatformULong= rulePlatformULong EOF ;
    public final EObject entryRulePlatformULong() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformULong = null;


        try {
            // InternalUddl.g:9040:54: (iv_rulePlatformULong= rulePlatformULong EOF )
            // InternalUddl.g:9041:2: iv_rulePlatformULong= rulePlatformULong EOF
            {
             newCompositeNode(grammarAccess.getPlatformULongRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformULong=rulePlatformULong();

            state._fsp--;

             current =iv_rulePlatformULong; 
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
    // $ANTLR end "entryRulePlatformULong"


    // $ANTLR start "rulePlatformULong"
    // InternalUddl.g:9047:1: rulePlatformULong returns [EObject current=null] : (otherlv_0= 'ulong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformULong() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:9053:2: ( (otherlv_0= 'ulong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:9054:2: (otherlv_0= 'ulong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:9054:2: (otherlv_0= 'ulong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:9055:3: otherlv_0= 'ulong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,113,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformULongAccess().getUlongKeyword_0());
            		
            // InternalUddl.g:9059:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:9060:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:9060:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:9061:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_83); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformULongAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformULongRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:9077:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( (LA177_0==RULE_STRING) ) {
                alt177=1;
            }
            switch (alt177) {
                case 1 :
                    // InternalUddl.g:9078:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:9078:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:9079:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformULongAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformULongRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformULongAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:9099:3: ( ( ruleQN ) )
            // InternalUddl.g:9100:4: ( ruleQN )
            {
            // InternalUddl.g:9100:4: ( ruleQN )
            // InternalUddl.g:9101:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformULongRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformULongAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformULongAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformULong"


    // $ANTLR start "entryRulePlatformULongLong"
    // InternalUddl.g:9123:1: entryRulePlatformULongLong returns [EObject current=null] : iv_rulePlatformULongLong= rulePlatformULongLong EOF ;
    public final EObject entryRulePlatformULongLong() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformULongLong = null;


        try {
            // InternalUddl.g:9123:58: (iv_rulePlatformULongLong= rulePlatformULongLong EOF )
            // InternalUddl.g:9124:2: iv_rulePlatformULongLong= rulePlatformULongLong EOF
            {
             newCompositeNode(grammarAccess.getPlatformULongLongRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformULongLong=rulePlatformULongLong();

            state._fsp--;

             current =iv_rulePlatformULongLong; 
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
    // $ANTLR end "entryRulePlatformULongLong"


    // $ANTLR start "rulePlatformULongLong"
    // InternalUddl.g:9130:1: rulePlatformULongLong returns [EObject current=null] : (otherlv_0= 'ullong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformULongLong() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:9136:2: ( (otherlv_0= 'ullong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:9137:2: (otherlv_0= 'ullong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:9137:2: (otherlv_0= 'ullong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:9138:3: otherlv_0= 'ullong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,114,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformULongLongAccess().getUllongKeyword_0());
            		
            // InternalUddl.g:9142:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:9143:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:9143:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:9144:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_83); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformULongLongAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformULongLongRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:9160:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt178=2;
            int LA178_0 = input.LA(1);

            if ( (LA178_0==RULE_STRING) ) {
                alt178=1;
            }
            switch (alt178) {
                case 1 :
                    // InternalUddl.g:9161:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:9161:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:9162:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformULongLongAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformULongLongRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformULongLongAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:9182:3: ( ( ruleQN ) )
            // InternalUddl.g:9183:4: ( ruleQN )
            {
            // InternalUddl.g:9183:4: ( ruleQN )
            // InternalUddl.g:9184:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformULongLongRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformULongLongAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformULongLongAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformULongLong"


    // $ANTLR start "entryRulePlatformSequence"
    // InternalUddl.g:9206:1: entryRulePlatformSequence returns [EObject current=null] : iv_rulePlatformSequence= rulePlatformSequence EOF ;
    public final EObject entryRulePlatformSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformSequence = null;


        try {
            // InternalUddl.g:9206:57: (iv_rulePlatformSequence= rulePlatformSequence EOF )
            // InternalUddl.g:9207:2: iv_rulePlatformSequence= rulePlatformSequence EOF
            {
             newCompositeNode(grammarAccess.getPlatformSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformSequence=rulePlatformSequence();

            state._fsp--;

             current =iv_rulePlatformSequence; 
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
    // $ANTLR end "entryRulePlatformSequence"


    // $ANTLR start "rulePlatformSequence"
    // InternalUddl.g:9213:1: rulePlatformSequence returns [EObject current=null] : (otherlv_0= 'seq' (otherlv_1= '[' ( (lv_maxSize_2_0= RULE_INT ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '->' ( ( ruleQN ) ) otherlv_8= ';' ) ;
    public final EObject rulePlatformSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_maxSize_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalUddl.g:9219:2: ( (otherlv_0= 'seq' (otherlv_1= '[' ( (lv_maxSize_2_0= RULE_INT ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '->' ( ( ruleQN ) ) otherlv_8= ';' ) )
            // InternalUddl.g:9220:2: (otherlv_0= 'seq' (otherlv_1= '[' ( (lv_maxSize_2_0= RULE_INT ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '->' ( ( ruleQN ) ) otherlv_8= ';' )
            {
            // InternalUddl.g:9220:2: (otherlv_0= 'seq' (otherlv_1= '[' ( (lv_maxSize_2_0= RULE_INT ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '->' ( ( ruleQN ) ) otherlv_8= ';' )
            // InternalUddl.g:9221:3: otherlv_0= 'seq' (otherlv_1= '[' ( (lv_maxSize_2_0= RULE_INT ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '->' ( ( ruleQN ) ) otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,115,FOLLOW_99); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformSequenceAccess().getSeqKeyword_0());
            		
            // InternalUddl.g:9225:3: (otherlv_1= '[' ( (lv_maxSize_2_0= RULE_INT ) ) otherlv_3= ']' )?
            int alt179=2;
            int LA179_0 = input.LA(1);

            if ( (LA179_0==28) ) {
                alt179=1;
            }
            switch (alt179) {
                case 1 :
                    // InternalUddl.g:9226:4: otherlv_1= '[' ( (lv_maxSize_2_0= RULE_INT ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getPlatformSequenceAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalUddl.g:9230:4: ( (lv_maxSize_2_0= RULE_INT ) )
                    // InternalUddl.g:9231:5: (lv_maxSize_2_0= RULE_INT )
                    {
                    // InternalUddl.g:9231:5: (lv_maxSize_2_0= RULE_INT )
                    // InternalUddl.g:9232:6: lv_maxSize_2_0= RULE_INT
                    {
                    lv_maxSize_2_0=(Token)match(input,RULE_INT,FOLLOW_24); 

                    						newLeafNode(lv_maxSize_2_0, grammarAccess.getPlatformSequenceAccess().getMaxSizeINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformSequenceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxSize",
                    							lv_maxSize_2_0,
                    							"com.epistimis.uddl.Uddl.INT");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPlatformSequenceAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalUddl.g:9253:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalUddl.g:9254:4: (lv_name_4_0= RULE_ID )
            {
            // InternalUddl.g:9254:4: (lv_name_4_0= RULE_ID )
            // InternalUddl.g:9255:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_83); 

            					newLeafNode(lv_name_4_0, grammarAccess.getPlatformSequenceAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformSequenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:9271:3: ( (lv_description_5_0= RULE_STRING ) )?
            int alt180=2;
            int LA180_0 = input.LA(1);

            if ( (LA180_0==RULE_STRING) ) {
                alt180=1;
            }
            switch (alt180) {
                case 1 :
                    // InternalUddl.g:9272:4: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalUddl.g:9272:4: (lv_description_5_0= RULE_STRING )
                    // InternalUddl.g:9273:5: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

                    					newLeafNode(lv_description_5_0, grammarAccess.getPlatformSequenceAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformSequenceRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_5_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getPlatformSequenceAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalUddl.g:9293:3: ( ( ruleQN ) )
            // InternalUddl.g:9294:4: ( ruleQN )
            {
            // InternalUddl.g:9294:4: ( ruleQN )
            // InternalUddl.g:9295:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformSequenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformSequenceAccess().getRealizesLogicalElementCrossReference_5_0());
            				
            pushFollow(FOLLOW_13);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPlatformSequenceAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "rulePlatformSequence"


    // $ANTLR start "entryRulePlatformArray"
    // InternalUddl.g:9317:1: entryRulePlatformArray returns [EObject current=null] : iv_rulePlatformArray= rulePlatformArray EOF ;
    public final EObject entryRulePlatformArray() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformArray = null;


        try {
            // InternalUddl.g:9317:54: (iv_rulePlatformArray= rulePlatformArray EOF )
            // InternalUddl.g:9318:2: iv_rulePlatformArray= rulePlatformArray EOF
            {
             newCompositeNode(grammarAccess.getPlatformArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformArray=rulePlatformArray();

            state._fsp--;

             current =iv_rulePlatformArray; 
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
    // $ANTLR end "entryRulePlatformArray"


    // $ANTLR start "rulePlatformArray"
    // InternalUddl.g:9324:1: rulePlatformArray returns [EObject current=null] : (otherlv_0= 'arr' (otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '->' ( ( ruleQN ) ) otherlv_8= ';' ) ;
    public final EObject rulePlatformArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_size_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalUddl.g:9330:2: ( (otherlv_0= 'arr' (otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '->' ( ( ruleQN ) ) otherlv_8= ';' ) )
            // InternalUddl.g:9331:2: (otherlv_0= 'arr' (otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '->' ( ( ruleQN ) ) otherlv_8= ';' )
            {
            // InternalUddl.g:9331:2: (otherlv_0= 'arr' (otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '->' ( ( ruleQN ) ) otherlv_8= ';' )
            // InternalUddl.g:9332:3: otherlv_0= 'arr' (otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '->' ( ( ruleQN ) ) otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,116,FOLLOW_99); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformArrayAccess().getArrKeyword_0());
            		
            // InternalUddl.g:9336:3: (otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= ']' )?
            int alt181=2;
            int LA181_0 = input.LA(1);

            if ( (LA181_0==28) ) {
                alt181=1;
            }
            switch (alt181) {
                case 1 :
                    // InternalUddl.g:9337:4: otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getPlatformArrayAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalUddl.g:9341:4: ( (lv_size_2_0= RULE_INT ) )
                    // InternalUddl.g:9342:5: (lv_size_2_0= RULE_INT )
                    {
                    // InternalUddl.g:9342:5: (lv_size_2_0= RULE_INT )
                    // InternalUddl.g:9343:6: lv_size_2_0= RULE_INT
                    {
                    lv_size_2_0=(Token)match(input,RULE_INT,FOLLOW_24); 

                    						newLeafNode(lv_size_2_0, grammarAccess.getPlatformArrayAccess().getSizeINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformArrayRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"size",
                    							lv_size_2_0,
                    							"com.epistimis.uddl.Uddl.INT");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPlatformArrayAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalUddl.g:9364:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalUddl.g:9365:4: (lv_name_4_0= RULE_ID )
            {
            // InternalUddl.g:9365:4: (lv_name_4_0= RULE_ID )
            // InternalUddl.g:9366:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_83); 

            					newLeafNode(lv_name_4_0, grammarAccess.getPlatformArrayAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformArrayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:9382:3: ( (lv_description_5_0= RULE_STRING ) )?
            int alt182=2;
            int LA182_0 = input.LA(1);

            if ( (LA182_0==RULE_STRING) ) {
                alt182=1;
            }
            switch (alt182) {
                case 1 :
                    // InternalUddl.g:9383:4: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalUddl.g:9383:4: (lv_description_5_0= RULE_STRING )
                    // InternalUddl.g:9384:5: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

                    					newLeafNode(lv_description_5_0, grammarAccess.getPlatformArrayAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformArrayRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_5_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getPlatformArrayAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalUddl.g:9404:3: ( ( ruleQN ) )
            // InternalUddl.g:9405:4: ( ruleQN )
            {
            // InternalUddl.g:9405:4: ( ruleQN )
            // InternalUddl.g:9406:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformArrayRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformArrayAccess().getRealizesLogicalElementCrossReference_5_0());
            				
            pushFollow(FOLLOW_13);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPlatformArrayAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "rulePlatformArray"


    // $ANTLR start "entryRulePlatformStruct"
    // InternalUddl.g:9428:1: entryRulePlatformStruct returns [EObject current=null] : iv_rulePlatformStruct= rulePlatformStruct EOF ;
    public final EObject entryRulePlatformStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformStruct = null;


        try {
            // InternalUddl.g:9428:55: (iv_rulePlatformStruct= rulePlatformStruct EOF )
            // InternalUddl.g:9429:2: iv_rulePlatformStruct= rulePlatformStruct EOF
            {
             newCompositeNode(grammarAccess.getPlatformStructRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformStruct=rulePlatformStruct();

            state._fsp--;

             current =iv_rulePlatformStruct; 
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
    // $ANTLR end "entryRulePlatformStruct"


    // $ANTLR start "rulePlatformStruct"
    // InternalUddl.g:9435:1: rulePlatformStruct returns [EObject current=null] : (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= '{' ( (lv_member_6_0= rulePlatformStructMember ) ) ( (lv_member_7_0= rulePlatformStructMember ) ) ( (lv_member_8_0= rulePlatformStructMember ) )? otherlv_9= '}' ) ;
    public final EObject rulePlatformStruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        EObject lv_member_6_0 = null;

        EObject lv_member_7_0 = null;

        EObject lv_member_8_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:9441:2: ( (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= '{' ( (lv_member_6_0= rulePlatformStructMember ) ) ( (lv_member_7_0= rulePlatformStructMember ) ) ( (lv_member_8_0= rulePlatformStructMember ) )? otherlv_9= '}' ) )
            // InternalUddl.g:9442:2: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= '{' ( (lv_member_6_0= rulePlatformStructMember ) ) ( (lv_member_7_0= rulePlatformStructMember ) ) ( (lv_member_8_0= rulePlatformStructMember ) )? otherlv_9= '}' )
            {
            // InternalUddl.g:9442:2: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= '{' ( (lv_member_6_0= rulePlatformStructMember ) ) ( (lv_member_7_0= rulePlatformStructMember ) ) ( (lv_member_8_0= rulePlatformStructMember ) )? otherlv_9= '}' )
            // InternalUddl.g:9443:3: otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= '{' ( (lv_member_6_0= rulePlatformStructMember ) ) ( (lv_member_7_0= rulePlatformStructMember ) ) ( (lv_member_8_0= rulePlatformStructMember ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,117,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformStructAccess().getStructKeyword_0());
            		
            // InternalUddl.g:9447:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:9448:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:9448:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:9449:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_83); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformStructAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformStructRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:9465:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt183=2;
            int LA183_0 = input.LA(1);

            if ( (LA183_0==RULE_STRING) ) {
                alt183=1;
            }
            switch (alt183) {
                case 1 :
                    // InternalUddl.g:9466:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:9466:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:9467:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformStructAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformStructRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformStructAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:9487:3: ( ( ruleQN ) )
            // InternalUddl.g:9488:4: ( ruleQN )
            {
            // InternalUddl.g:9488:4: ( ruleQN )
            // InternalUddl.g:9489:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformStructRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformStructAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_5);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformStructAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalUddl.g:9507:3: ( (lv_member_6_0= rulePlatformStructMember ) )
            // InternalUddl.g:9508:4: (lv_member_6_0= rulePlatformStructMember )
            {
            // InternalUddl.g:9508:4: (lv_member_6_0= rulePlatformStructMember )
            // InternalUddl.g:9509:5: lv_member_6_0= rulePlatformStructMember
            {

            					newCompositeNode(grammarAccess.getPlatformStructAccess().getMemberPlatformStructMemberParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_3);
            lv_member_6_0=rulePlatformStructMember();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlatformStructRule());
            					}
            					add(
            						current,
            						"member",
            						lv_member_6_0,
            						"com.epistimis.uddl.Uddl.PlatformStructMember");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:9526:3: ( (lv_member_7_0= rulePlatformStructMember ) )
            // InternalUddl.g:9527:4: (lv_member_7_0= rulePlatformStructMember )
            {
            // InternalUddl.g:9527:4: (lv_member_7_0= rulePlatformStructMember )
            // InternalUddl.g:9528:5: lv_member_7_0= rulePlatformStructMember
            {

            					newCompositeNode(grammarAccess.getPlatformStructAccess().getMemberPlatformStructMemberParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_100);
            lv_member_7_0=rulePlatformStructMember();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlatformStructRule());
            					}
            					add(
            						current,
            						"member",
            						lv_member_7_0,
            						"com.epistimis.uddl.Uddl.PlatformStructMember");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:9545:3: ( (lv_member_8_0= rulePlatformStructMember ) )?
            int alt184=2;
            int LA184_0 = input.LA(1);

            if ( (LA184_0==RULE_ID) ) {
                alt184=1;
            }
            switch (alt184) {
                case 1 :
                    // InternalUddl.g:9546:4: (lv_member_8_0= rulePlatformStructMember )
                    {
                    // InternalUddl.g:9546:4: (lv_member_8_0= rulePlatformStructMember )
                    // InternalUddl.g:9547:5: lv_member_8_0= rulePlatformStructMember
                    {

                    					newCompositeNode(grammarAccess.getPlatformStructAccess().getMemberPlatformStructMemberParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_34);
                    lv_member_8_0=rulePlatformStructMember();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPlatformStructRule());
                    					}
                    					add(
                    						current,
                    						"member",
                    						lv_member_8_0,
                    						"com.epistimis.uddl.Uddl.PlatformStructMember");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPlatformStructAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "rulePlatformStruct"


    // $ANTLR start "entryRulePlatformStructMember"
    // InternalUddl.g:9572:1: entryRulePlatformStructMember returns [EObject current=null] : iv_rulePlatformStructMember= rulePlatformStructMember EOF ;
    public final EObject entryRulePlatformStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformStructMember = null;


        try {
            // InternalUddl.g:9572:61: (iv_rulePlatformStructMember= rulePlatformStructMember EOF )
            // InternalUddl.g:9573:2: iv_rulePlatformStructMember= rulePlatformStructMember EOF
            {
             newCompositeNode(grammarAccess.getPlatformStructMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformStructMember=rulePlatformStructMember();

            state._fsp--;

             current =iv_rulePlatformStructMember; 
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
    // $ANTLR end "entryRulePlatformStructMember"


    // $ANTLR start "rulePlatformStructMember"
    // InternalUddl.g:9579:1: rulePlatformStructMember returns [EObject current=null] : ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_precision_3_0= RULE_FLOAT ) ) otherlv_4= ')' (otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';' )? ) ;
    public final EObject rulePlatformStructMember() throws RecognitionException {
        EObject current = null;

        Token lv_rolename_1_0=null;
        Token otherlv_2=null;
        Token lv_precision_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalUddl.g:9585:2: ( ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_precision_3_0= RULE_FLOAT ) ) otherlv_4= ')' (otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';' )? ) )
            // InternalUddl.g:9586:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_precision_3_0= RULE_FLOAT ) ) otherlv_4= ')' (otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';' )? )
            {
            // InternalUddl.g:9586:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_precision_3_0= RULE_FLOAT ) ) otherlv_4= ')' (otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';' )? )
            // InternalUddl.g:9587:3: ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_precision_3_0= RULE_FLOAT ) ) otherlv_4= ')' (otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';' )?
            {
            // InternalUddl.g:9587:3: ( ( ruleQN ) )
            // InternalUddl.g:9588:4: ( ruleQN )
            {
            // InternalUddl.g:9588:4: ( ruleQN )
            // InternalUddl.g:9589:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformStructMemberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformStructMemberAccess().getTypePlatformDataTypeCrossReference_0_0());
            				
            pushFollow(FOLLOW_3);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:9603:3: ( (lv_rolename_1_0= RULE_ID ) )
            // InternalUddl.g:9604:4: (lv_rolename_1_0= RULE_ID )
            {
            // InternalUddl.g:9604:4: (lv_rolename_1_0= RULE_ID )
            // InternalUddl.g:9605:5: lv_rolename_1_0= RULE_ID
            {
            lv_rolename_1_0=(Token)match(input,RULE_ID,FOLLOW_62); 

            					newLeafNode(lv_rolename_1_0, grammarAccess.getPlatformStructMemberAccess().getRolenameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformStructMemberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rolename",
            						lv_rolename_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,59,FOLLOW_43); 

            			newLeafNode(otherlv_2, grammarAccess.getPlatformStructMemberAccess().getLeftParenthesisKeyword_2());
            		
            // InternalUddl.g:9625:3: ( (lv_precision_3_0= RULE_FLOAT ) )
            // InternalUddl.g:9626:4: (lv_precision_3_0= RULE_FLOAT )
            {
            // InternalUddl.g:9626:4: (lv_precision_3_0= RULE_FLOAT )
            // InternalUddl.g:9627:5: lv_precision_3_0= RULE_FLOAT
            {
            lv_precision_3_0=(Token)match(input,RULE_FLOAT,FOLLOW_52); 

            					newLeafNode(lv_precision_3_0, grammarAccess.getPlatformStructMemberAccess().getPrecisionFLOATTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformStructMemberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"precision",
            						lv_precision_3_0,
            						"com.epistimis.uddl.Uddl.FLOAT");
            				

            }


            }

            otherlv_4=(Token)match(input,60,FOLLOW_97); 

            			newLeafNode(otherlv_4, grammarAccess.getPlatformStructMemberAccess().getRightParenthesisKeyword_4());
            		
            // InternalUddl.g:9647:3: (otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';' )?
            int alt185=2;
            int LA185_0 = input.LA(1);

            if ( (LA185_0==90) ) {
                alt185=1;
            }
            switch (alt185) {
                case 1 :
                    // InternalUddl.g:9648:4: otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';'
                    {
                    otherlv_5=(Token)match(input,90,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getPlatformStructMemberAccess().getHyphenMinusGreaterThanSignKeyword_5_0());
                    			
                    // InternalUddl.g:9652:4: ( ( ruleQN ) )
                    // InternalUddl.g:9653:5: ( ruleQN )
                    {
                    // InternalUddl.g:9653:5: ( ruleQN )
                    // InternalUddl.g:9654:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformStructMemberRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPlatformStructMemberAccess().getRealizesLogicalMeasurementAttributeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getPlatformStructMemberAccess().getSemicolonKeyword_5_2());
                    			

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
    // $ANTLR end "rulePlatformStructMember"


    // $ANTLR start "entryRulePlatformEntity"
    // InternalUddl.g:9677:1: entryRulePlatformEntity returns [EObject current=null] : iv_rulePlatformEntity= rulePlatformEntity EOF ;
    public final EObject entryRulePlatformEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformEntity = null;


        try {
            // InternalUddl.g:9677:55: (iv_rulePlatformEntity= rulePlatformEntity EOF )
            // InternalUddl.g:9678:2: iv_rulePlatformEntity= rulePlatformEntity EOF
            {
             newCompositeNode(grammarAccess.getPlatformEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformEntity=rulePlatformEntity();

            state._fsp--;

             current =iv_rulePlatformEntity; 
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
    // $ANTLR end "entryRulePlatformEntity"


    // $ANTLR start "rulePlatformEntity"
    // InternalUddl.g:9684:1: rulePlatformEntity returns [EObject current=null] : ( (otherlv_0= 'pentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= rulePlatformComposition ) )* otherlv_9= '};' ) | this_PlatformAssociation_10= rulePlatformAssociation ) ;
    public final EObject rulePlatformEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_composition_8_0 = null;

        EObject this_PlatformAssociation_10 = null;



        	enterRule();

        try {
            // InternalUddl.g:9690:2: ( ( (otherlv_0= 'pentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= rulePlatformComposition ) )* otherlv_9= '};' ) | this_PlatformAssociation_10= rulePlatformAssociation ) )
            // InternalUddl.g:9691:2: ( (otherlv_0= 'pentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= rulePlatformComposition ) )* otherlv_9= '};' ) | this_PlatformAssociation_10= rulePlatformAssociation )
            {
            // InternalUddl.g:9691:2: ( (otherlv_0= 'pentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= rulePlatformComposition ) )* otherlv_9= '};' ) | this_PlatformAssociation_10= rulePlatformAssociation )
            int alt189=2;
            int LA189_0 = input.LA(1);

            if ( (LA189_0==118) ) {
                alt189=1;
            }
            else if ( (LA189_0==120) ) {
                alt189=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 189, 0, input);

                throw nvae;
            }
            switch (alt189) {
                case 1 :
                    // InternalUddl.g:9692:3: (otherlv_0= 'pentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= rulePlatformComposition ) )* otherlv_9= '};' )
                    {
                    // InternalUddl.g:9692:3: (otherlv_0= 'pentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= rulePlatformComposition ) )* otherlv_9= '};' )
                    // InternalUddl.g:9693:4: otherlv_0= 'pentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= rulePlatformComposition ) )* otherlv_9= '};'
                    {
                    otherlv_0=(Token)match(input,118,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getPlatformEntityAccess().getPentityKeyword_0_0());
                    			
                    // InternalUddl.g:9697:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalUddl.g:9698:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUddl.g:9698:5: (lv_name_1_0= RULE_ID )
                    // InternalUddl.g:9699:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_91); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getPlatformEntityAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformEntityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalUddl.g:9715:4: ( (lv_description_2_0= RULE_STRING ) )?
                    int alt186=2;
                    int LA186_0 = input.LA(1);

                    if ( (LA186_0==RULE_STRING) ) {
                        alt186=1;
                    }
                    switch (alt186) {
                        case 1 :
                            // InternalUddl.g:9716:5: (lv_description_2_0= RULE_STRING )
                            {
                            // InternalUddl.g:9716:5: (lv_description_2_0= RULE_STRING )
                            // InternalUddl.g:9717:6: lv_description_2_0= RULE_STRING
                            {
                            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_92); 

                            						newLeafNode(lv_description_2_0, grammarAccess.getPlatformEntityAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getPlatformEntityRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"description",
                            							lv_description_2_0,
                            							"org.eclipse.xtext.common.Terminals.STRING");
                            					

                            }


                            }
                            break;

                    }

                    // InternalUddl.g:9733:4: (otherlv_3= ':' ( ( ruleQN ) ) )?
                    int alt187=2;
                    int LA187_0 = input.LA(1);

                    if ( (LA187_0==26) ) {
                        alt187=1;
                    }
                    switch (alt187) {
                        case 1 :
                            // InternalUddl.g:9734:5: otherlv_3= ':' ( ( ruleQN ) )
                            {
                            otherlv_3=(Token)match(input,26,FOLLOW_3); 

                            					newLeafNode(otherlv_3, grammarAccess.getPlatformEntityAccess().getColonKeyword_0_3_0());
                            				
                            // InternalUddl.g:9738:5: ( ( ruleQN ) )
                            // InternalUddl.g:9739:6: ( ruleQN )
                            {
                            // InternalUddl.g:9739:6: ( ruleQN )
                            // InternalUddl.g:9740:7: ruleQN
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPlatformEntityRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getPlatformEntityAccess().getSpecializesPlatformEntityCrossReference_0_3_1_0());
                            						
                            pushFollow(FOLLOW_84);
                            ruleQN();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,90,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getPlatformEntityAccess().getHyphenMinusGreaterThanSignKeyword_0_4());
                    			
                    // InternalUddl.g:9759:4: ( ( ruleQN ) )
                    // InternalUddl.g:9760:5: ( ruleQN )
                    {
                    // InternalUddl.g:9760:5: ( ruleQN )
                    // InternalUddl.g:9761:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformEntityRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPlatformEntityAccess().getRealizesLogicalEntityCrossReference_0_5_0());
                    					
                    pushFollow(FOLLOW_5);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,14,FOLLOW_39); 

                    				newLeafNode(otherlv_7, grammarAccess.getPlatformEntityAccess().getLeftCurlyBracketKeyword_0_6());
                    			
                    // InternalUddl.g:9779:4: ( (lv_composition_8_0= rulePlatformComposition ) )*
                    loop188:
                    do {
                        int alt188=2;
                        int LA188_0 = input.LA(1);

                        if ( (LA188_0==RULE_ID) ) {
                            alt188=1;
                        }


                        switch (alt188) {
                    	case 1 :
                    	    // InternalUddl.g:9780:5: (lv_composition_8_0= rulePlatformComposition )
                    	    {
                    	    // InternalUddl.g:9780:5: (lv_composition_8_0= rulePlatformComposition )
                    	    // InternalUddl.g:9781:6: lv_composition_8_0= rulePlatformComposition
                    	    {

                    	    						newCompositeNode(grammarAccess.getPlatformEntityAccess().getCompositionPlatformCompositionParserRuleCall_0_7_0());
                    	    					
                    	    pushFollow(FOLLOW_39);
                    	    lv_composition_8_0=rulePlatformComposition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPlatformEntityRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"composition",
                    	    							lv_composition_8_0,
                    	    							"com.epistimis.uddl.Uddl.PlatformComposition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop188;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getPlatformEntityAccess().getRightCurlyBracketSemicolonKeyword_0_8());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUddl.g:9804:3: this_PlatformAssociation_10= rulePlatformAssociation
                    {

                    			newCompositeNode(grammarAccess.getPlatformEntityAccess().getPlatformAssociationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformAssociation_10=rulePlatformAssociation();

                    state._fsp--;


                    			current = this_PlatformAssociation_10;
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
    // $ANTLR end "rulePlatformEntity"


    // $ANTLR start "entryRulePlatformComposition"
    // InternalUddl.g:9816:1: entryRulePlatformComposition returns [EObject current=null] : iv_rulePlatformComposition= rulePlatformComposition EOF ;
    public final EObject entryRulePlatformComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformComposition = null;


        try {
            // InternalUddl.g:9816:60: (iv_rulePlatformComposition= rulePlatformComposition EOF )
            // InternalUddl.g:9817:2: iv_rulePlatformComposition= rulePlatformComposition EOF
            {
             newCompositeNode(grammarAccess.getPlatformCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformComposition=rulePlatformComposition();

            state._fsp--;

             current =iv_rulePlatformComposition; 
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
    // $ANTLR end "entryRulePlatformComposition"


    // $ANTLR start "rulePlatformComposition"
    // InternalUddl.g:9823:1: rulePlatformComposition returns [EObject current=null] : ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) (otherlv_12= '{' otherlv_13= 'prec:' ( (lv_precision_14_0= RULE_FLOAT ) ) otherlv_15= '}' )? otherlv_16= ';' ) ;
    public final EObject rulePlatformComposition() throws RecognitionException {
        EObject current = null;

        Token lv_rolename_1_0=null;
        Token otherlv_2=null;
        Token lv_lowerBound_3_0=null;
        Token otherlv_4=null;
        Token lv_upperBound_5_0=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_precision_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;


        	enterRule();

        try {
            // InternalUddl.g:9829:2: ( ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) (otherlv_12= '{' otherlv_13= 'prec:' ( (lv_precision_14_0= RULE_FLOAT ) ) otherlv_15= '}' )? otherlv_16= ';' ) )
            // InternalUddl.g:9830:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) (otherlv_12= '{' otherlv_13= 'prec:' ( (lv_precision_14_0= RULE_FLOAT ) ) otherlv_15= '}' )? otherlv_16= ';' )
            {
            // InternalUddl.g:9830:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) (otherlv_12= '{' otherlv_13= 'prec:' ( (lv_precision_14_0= RULE_FLOAT ) ) otherlv_15= '}' )? otherlv_16= ';' )
            // InternalUddl.g:9831:3: ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) (otherlv_12= '{' otherlv_13= 'prec:' ( (lv_precision_14_0= RULE_FLOAT ) ) otherlv_15= '}' )? otherlv_16= ';'
            {
            // InternalUddl.g:9831:3: ( ( ruleQN ) )
            // InternalUddl.g:9832:4: ( ruleQN )
            {
            // InternalUddl.g:9832:4: ( ruleQN )
            // InternalUddl.g:9833:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformCompositionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformCompositionAccess().getTypePlatformComposableElementCrossReference_0_0());
            				
            pushFollow(FOLLOW_3);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:9847:3: ( (lv_rolename_1_0= RULE_ID ) )
            // InternalUddl.g:9848:4: (lv_rolename_1_0= RULE_ID )
            {
            // InternalUddl.g:9848:4: (lv_rolename_1_0= RULE_ID )
            // InternalUddl.g:9849:5: lv_rolename_1_0= RULE_ID
            {
            lv_rolename_1_0=(Token)match(input,RULE_ID,FOLLOW_93); 

            					newLeafNode(lv_rolename_1_0, grammarAccess.getPlatformCompositionAccess().getRolenameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformCompositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rolename",
            						lv_rolename_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:9865:3: (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' )?
            int alt190=2;
            int LA190_0 = input.LA(1);

            if ( (LA190_0==28) ) {
                alt190=1;
            }
            switch (alt190) {
                case 1 :
                    // InternalUddl.g:9866:4: otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_31); 

                    				newLeafNode(otherlv_2, grammarAccess.getPlatformCompositionAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalUddl.g:9870:4: ( (lv_lowerBound_3_0= RULE_INT ) )
                    // InternalUddl.g:9871:5: (lv_lowerBound_3_0= RULE_INT )
                    {
                    // InternalUddl.g:9871:5: (lv_lowerBound_3_0= RULE_INT )
                    // InternalUddl.g:9872:6: lv_lowerBound_3_0= RULE_INT
                    {
                    lv_lowerBound_3_0=(Token)match(input,RULE_INT,FOLLOW_22); 

                    						newLeafNode(lv_lowerBound_3_0, grammarAccess.getPlatformCompositionAccess().getLowerBoundINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformCompositionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_3_0,
                    							"com.epistimis.uddl.Uddl.INT");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,26,FOLLOW_31); 

                    				newLeafNode(otherlv_4, grammarAccess.getPlatformCompositionAccess().getColonKeyword_2_2());
                    			
                    // InternalUddl.g:9892:4: ( (lv_upperBound_5_0= RULE_INT ) )
                    // InternalUddl.g:9893:5: (lv_upperBound_5_0= RULE_INT )
                    {
                    // InternalUddl.g:9893:5: (lv_upperBound_5_0= RULE_INT )
                    // InternalUddl.g:9894:6: lv_upperBound_5_0= RULE_INT
                    {
                    lv_upperBound_5_0=(Token)match(input,RULE_INT,FOLLOW_24); 

                    						newLeafNode(lv_upperBound_5_0, grammarAccess.getPlatformCompositionAccess().getUpperBoundINTTerminalRuleCall_2_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformCompositionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"upperBound",
                    							lv_upperBound_5_0,
                    							"com.epistimis.uddl.Uddl.INT");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,29,FOLLOW_91); 

                    				newLeafNode(otherlv_6, grammarAccess.getPlatformCompositionAccess().getRightSquareBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalUddl.g:9915:3: ( (lv_description_7_0= RULE_STRING ) )?
            int alt191=2;
            int LA191_0 = input.LA(1);

            if ( (LA191_0==RULE_STRING) ) {
                alt191=1;
            }
            switch (alt191) {
                case 1 :
                    // InternalUddl.g:9916:4: (lv_description_7_0= RULE_STRING )
                    {
                    // InternalUddl.g:9916:4: (lv_description_7_0= RULE_STRING )
                    // InternalUddl.g:9917:5: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_92); 

                    					newLeafNode(lv_description_7_0, grammarAccess.getPlatformCompositionAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformCompositionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_7_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:9933:3: (otherlv_8= ':' ( ( ruleQN ) ) )?
            int alt192=2;
            int LA192_0 = input.LA(1);

            if ( (LA192_0==26) ) {
                alt192=1;
            }
            switch (alt192) {
                case 1 :
                    // InternalUddl.g:9934:4: otherlv_8= ':' ( ( ruleQN ) )
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getPlatformCompositionAccess().getColonKeyword_4_0());
                    			
                    // InternalUddl.g:9938:4: ( ( ruleQN ) )
                    // InternalUddl.g:9939:5: ( ruleQN )
                    {
                    // InternalUddl.g:9939:5: ( ruleQN )
                    // InternalUddl.g:9940:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformCompositionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPlatformCompositionAccess().getSpecializesPlatformCharacteristicCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_84);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getPlatformCompositionAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            // InternalUddl.g:9959:3: ( ( ruleQN ) )
            // InternalUddl.g:9960:4: ( ruleQN )
            {
            // InternalUddl.g:9960:4: ( ruleQN )
            // InternalUddl.g:9961:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformCompositionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformCompositionAccess().getRealizesLogicalCompositionCrossReference_6_0());
            				
            pushFollow(FOLLOW_73);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:9975:3: (otherlv_12= '{' otherlv_13= 'prec:' ( (lv_precision_14_0= RULE_FLOAT ) ) otherlv_15= '}' )?
            int alt193=2;
            int LA193_0 = input.LA(1);

            if ( (LA193_0==14) ) {
                alt193=1;
            }
            switch (alt193) {
                case 1 :
                    // InternalUddl.g:9976:4: otherlv_12= '{' otherlv_13= 'prec:' ( (lv_precision_14_0= RULE_FLOAT ) ) otherlv_15= '}'
                    {
                    otherlv_12=(Token)match(input,14,FOLLOW_101); 

                    				newLeafNode(otherlv_12, grammarAccess.getPlatformCompositionAccess().getLeftCurlyBracketKeyword_7_0());
                    			
                    otherlv_13=(Token)match(input,119,FOLLOW_43); 

                    				newLeafNode(otherlv_13, grammarAccess.getPlatformCompositionAccess().getPrecKeyword_7_1());
                    			
                    // InternalUddl.g:9984:4: ( (lv_precision_14_0= RULE_FLOAT ) )
                    // InternalUddl.g:9985:5: (lv_precision_14_0= RULE_FLOAT )
                    {
                    // InternalUddl.g:9985:5: (lv_precision_14_0= RULE_FLOAT )
                    // InternalUddl.g:9986:6: lv_precision_14_0= RULE_FLOAT
                    {
                    lv_precision_14_0=(Token)match(input,RULE_FLOAT,FOLLOW_34); 

                    						newLeafNode(lv_precision_14_0, grammarAccess.getPlatformCompositionAccess().getPrecisionFLOATTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformCompositionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"precision",
                    							lv_precision_14_0,
                    							"com.epistimis.uddl.Uddl.FLOAT");
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getPlatformCompositionAccess().getRightCurlyBracketKeyword_7_3());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getPlatformCompositionAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "rulePlatformComposition"


    // $ANTLR start "entryRulePlatformAssociation"
    // InternalUddl.g:10015:1: entryRulePlatformAssociation returns [EObject current=null] : iv_rulePlatformAssociation= rulePlatformAssociation EOF ;
    public final EObject entryRulePlatformAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformAssociation = null;


        try {
            // InternalUddl.g:10015:60: (iv_rulePlatformAssociation= rulePlatformAssociation EOF )
            // InternalUddl.g:10016:2: iv_rulePlatformAssociation= rulePlatformAssociation EOF
            {
             newCompositeNode(grammarAccess.getPlatformAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformAssociation=rulePlatformAssociation();

            state._fsp--;

             current =iv_rulePlatformAssociation; 
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
    // $ANTLR end "entryRulePlatformAssociation"


    // $ANTLR start "rulePlatformAssociation"
    // InternalUddl.g:10022:1: rulePlatformAssociation returns [EObject current=null] : (otherlv_0= 'passoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= rulePlatformComposition ) )* (otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= rulePlatformParticipant ) )+ otherlv_12= ']' )? otherlv_13= '};' ) ;
    public final EObject rulePlatformAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_composition_8_0 = null;

        EObject lv_participant_11_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:10028:2: ( (otherlv_0= 'passoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= rulePlatformComposition ) )* (otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= rulePlatformParticipant ) )+ otherlv_12= ']' )? otherlv_13= '};' ) )
            // InternalUddl.g:10029:2: (otherlv_0= 'passoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= rulePlatformComposition ) )* (otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= rulePlatformParticipant ) )+ otherlv_12= ']' )? otherlv_13= '};' )
            {
            // InternalUddl.g:10029:2: (otherlv_0= 'passoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= rulePlatformComposition ) )* (otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= rulePlatformParticipant ) )+ otherlv_12= ']' )? otherlv_13= '};' )
            // InternalUddl.g:10030:3: otherlv_0= 'passoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= rulePlatformComposition ) )* (otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= rulePlatformParticipant ) )+ otherlv_12= ']' )? otherlv_13= '};'
            {
            otherlv_0=(Token)match(input,120,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformAssociationAccess().getPassocKeyword_0());
            		
            // InternalUddl.g:10034:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:10035:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:10035:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:10036:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_91); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformAssociationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformAssociationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:10052:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt194=2;
            int LA194_0 = input.LA(1);

            if ( (LA194_0==RULE_STRING) ) {
                alt194=1;
            }
            switch (alt194) {
                case 1 :
                    // InternalUddl.g:10053:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:10053:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:10054:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_92); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformAssociationAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformAssociationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:10070:3: (otherlv_3= ':' ( ( ruleQN ) ) )?
            int alt195=2;
            int LA195_0 = input.LA(1);

            if ( (LA195_0==26) ) {
                alt195=1;
            }
            switch (alt195) {
                case 1 :
                    // InternalUddl.g:10071:4: otherlv_3= ':' ( ( ruleQN ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPlatformAssociationAccess().getColonKeyword_3_0());
                    			
                    // InternalUddl.g:10075:4: ( ( ruleQN ) )
                    // InternalUddl.g:10076:5: ( ruleQN )
                    {
                    // InternalUddl.g:10076:5: ( ruleQN )
                    // InternalUddl.g:10077:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformAssociationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPlatformAssociationAccess().getSpecializesPlatformEntityCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_84);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformAssociationAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalUddl.g:10096:3: ( ( ruleQN ) )
            // InternalUddl.g:10097:4: ( ruleQN )
            {
            // InternalUddl.g:10097:4: ( ruleQN )
            // InternalUddl.g:10098:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformAssociationAccess().getRealizesLogicalEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_5);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_94); 

            			newLeafNode(otherlv_7, grammarAccess.getPlatformAssociationAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalUddl.g:10116:3: ( (lv_composition_8_0= rulePlatformComposition ) )*
            loop196:
            do {
                int alt196=2;
                int LA196_0 = input.LA(1);

                if ( (LA196_0==RULE_ID) ) {
                    alt196=1;
                }


                switch (alt196) {
            	case 1 :
            	    // InternalUddl.g:10117:4: (lv_composition_8_0= rulePlatformComposition )
            	    {
            	    // InternalUddl.g:10117:4: (lv_composition_8_0= rulePlatformComposition )
            	    // InternalUddl.g:10118:5: lv_composition_8_0= rulePlatformComposition
            	    {

            	    					newCompositeNode(grammarAccess.getPlatformAssociationAccess().getCompositionPlatformCompositionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_94);
            	    lv_composition_8_0=rulePlatformComposition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPlatformAssociationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"composition",
            	    						lv_composition_8_0,
            	    						"com.epistimis.uddl.Uddl.PlatformComposition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop196;
                }
            } while (true);

            // InternalUddl.g:10135:3: (otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= rulePlatformParticipant ) )+ otherlv_12= ']' )?
            int alt198=2;
            int LA198_0 = input.LA(1);

            if ( (LA198_0==32) ) {
                alt198=1;
            }
            switch (alt198) {
                case 1 :
                    // InternalUddl.g:10136:4: otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= rulePlatformParticipant ) )+ otherlv_12= ']'
                    {
                    otherlv_9=(Token)match(input,32,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getPlatformAssociationAccess().getParticipantsKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getPlatformAssociationAccess().getLeftSquareBracketKeyword_8_1());
                    			
                    // InternalUddl.g:10144:4: ( (lv_participant_11_0= rulePlatformParticipant ) )+
                    int cnt197=0;
                    loop197:
                    do {
                        int alt197=2;
                        int LA197_0 = input.LA(1);

                        if ( (LA197_0==RULE_ID) ) {
                            alt197=1;
                        }


                        switch (alt197) {
                    	case 1 :
                    	    // InternalUddl.g:10145:5: (lv_participant_11_0= rulePlatformParticipant )
                    	    {
                    	    // InternalUddl.g:10145:5: (lv_participant_11_0= rulePlatformParticipant )
                    	    // InternalUddl.g:10146:6: lv_participant_11_0= rulePlatformParticipant
                    	    {

                    	    						newCompositeNode(grammarAccess.getPlatformAssociationAccess().getParticipantPlatformParticipantParserRuleCall_8_2_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    lv_participant_11_0=rulePlatformParticipant();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPlatformAssociationRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"participant",
                    	    							lv_participant_11_0,
                    	    							"com.epistimis.uddl.Uddl.PlatformParticipant");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt197 >= 1 ) break loop197;
                                EarlyExitException eee =
                                    new EarlyExitException(197, input);
                                throw eee;
                        }
                        cnt197++;
                    } while (true);

                    otherlv_12=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getPlatformAssociationAccess().getRightSquareBracketKeyword_8_3());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getPlatformAssociationAccess().getRightCurlyBracketSemicolonKeyword_9());
            		

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
    // $ANTLR end "rulePlatformAssociation"


    // $ANTLR start "entryRulePlatformParticipant"
    // InternalUddl.g:10176:1: entryRulePlatformParticipant returns [EObject current=null] : iv_rulePlatformParticipant= rulePlatformParticipant EOF ;
    public final EObject entryRulePlatformParticipant() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformParticipant = null;


        try {
            // InternalUddl.g:10176:60: (iv_rulePlatformParticipant= rulePlatformParticipant EOF )
            // InternalUddl.g:10177:2: iv_rulePlatformParticipant= rulePlatformParticipant EOF
            {
             newCompositeNode(grammarAccess.getPlatformParticipantRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformParticipant=rulePlatformParticipant();

            state._fsp--;

             current =iv_rulePlatformParticipant; 
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
    // $ANTLR end "entryRulePlatformParticipant"


    // $ANTLR start "rulePlatformParticipant"
    // InternalUddl.g:10183:1: rulePlatformParticipant returns [EObject current=null] : ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= '{' otherlv_13= 'source:' otherlv_14= '[' ( (lv_sourceLowerBound_15_0= RULE_INT ) ) otherlv_16= ':' ( (lv_sourceUpperBound_17_0= RULE_INT ) ) otherlv_18= ']' (otherlv_19= 'path:' ( (lv_path_20_0= rulePlatformPathNode ) ) )? otherlv_21= '};' ) ;
    public final EObject rulePlatformParticipant() throws RecognitionException {
        EObject current = null;

        Token lv_rolename_1_0=null;
        Token otherlv_2=null;
        Token lv_lowerBound_3_0=null;
        Token otherlv_4=null;
        Token lv_upperBound_5_0=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_sourceLowerBound_15_0=null;
        Token otherlv_16=null;
        Token lv_sourceUpperBound_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject lv_path_20_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:10189:2: ( ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= '{' otherlv_13= 'source:' otherlv_14= '[' ( (lv_sourceLowerBound_15_0= RULE_INT ) ) otherlv_16= ':' ( (lv_sourceUpperBound_17_0= RULE_INT ) ) otherlv_18= ']' (otherlv_19= 'path:' ( (lv_path_20_0= rulePlatformPathNode ) ) )? otherlv_21= '};' ) )
            // InternalUddl.g:10190:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= '{' otherlv_13= 'source:' otherlv_14= '[' ( (lv_sourceLowerBound_15_0= RULE_INT ) ) otherlv_16= ':' ( (lv_sourceUpperBound_17_0= RULE_INT ) ) otherlv_18= ']' (otherlv_19= 'path:' ( (lv_path_20_0= rulePlatformPathNode ) ) )? otherlv_21= '};' )
            {
            // InternalUddl.g:10190:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= '{' otherlv_13= 'source:' otherlv_14= '[' ( (lv_sourceLowerBound_15_0= RULE_INT ) ) otherlv_16= ':' ( (lv_sourceUpperBound_17_0= RULE_INT ) ) otherlv_18= ']' (otherlv_19= 'path:' ( (lv_path_20_0= rulePlatformPathNode ) ) )? otherlv_21= '};' )
            // InternalUddl.g:10191:3: ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= '{' otherlv_13= 'source:' otherlv_14= '[' ( (lv_sourceLowerBound_15_0= RULE_INT ) ) otherlv_16= ':' ( (lv_sourceUpperBound_17_0= RULE_INT ) ) otherlv_18= ']' (otherlv_19= 'path:' ( (lv_path_20_0= rulePlatformPathNode ) ) )? otherlv_21= '};'
            {
            // InternalUddl.g:10191:3: ( ( ruleQN ) )
            // InternalUddl.g:10192:4: ( ruleQN )
            {
            // InternalUddl.g:10192:4: ( ruleQN )
            // InternalUddl.g:10193:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformParticipantRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformParticipantAccess().getTypePlatformEntityCrossReference_0_0());
            				
            pushFollow(FOLLOW_3);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:10207:3: ( (lv_rolename_1_0= RULE_ID ) )
            // InternalUddl.g:10208:4: (lv_rolename_1_0= RULE_ID )
            {
            // InternalUddl.g:10208:4: (lv_rolename_1_0= RULE_ID )
            // InternalUddl.g:10209:5: lv_rolename_1_0= RULE_ID
            {
            lv_rolename_1_0=(Token)match(input,RULE_ID,FOLLOW_93); 

            					newLeafNode(lv_rolename_1_0, grammarAccess.getPlatformParticipantAccess().getRolenameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformParticipantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rolename",
            						lv_rolename_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:10225:3: (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' )?
            int alt199=2;
            int LA199_0 = input.LA(1);

            if ( (LA199_0==28) ) {
                alt199=1;
            }
            switch (alt199) {
                case 1 :
                    // InternalUddl.g:10226:4: otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_31); 

                    				newLeafNode(otherlv_2, grammarAccess.getPlatformParticipantAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalUddl.g:10230:4: ( (lv_lowerBound_3_0= RULE_INT ) )
                    // InternalUddl.g:10231:5: (lv_lowerBound_3_0= RULE_INT )
                    {
                    // InternalUddl.g:10231:5: (lv_lowerBound_3_0= RULE_INT )
                    // InternalUddl.g:10232:6: lv_lowerBound_3_0= RULE_INT
                    {
                    lv_lowerBound_3_0=(Token)match(input,RULE_INT,FOLLOW_22); 

                    						newLeafNode(lv_lowerBound_3_0, grammarAccess.getPlatformParticipantAccess().getLowerBoundINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformParticipantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_3_0,
                    							"com.epistimis.uddl.Uddl.INT");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,26,FOLLOW_31); 

                    				newLeafNode(otherlv_4, grammarAccess.getPlatformParticipantAccess().getColonKeyword_2_2());
                    			
                    // InternalUddl.g:10252:4: ( (lv_upperBound_5_0= RULE_INT ) )
                    // InternalUddl.g:10253:5: (lv_upperBound_5_0= RULE_INT )
                    {
                    // InternalUddl.g:10253:5: (lv_upperBound_5_0= RULE_INT )
                    // InternalUddl.g:10254:6: lv_upperBound_5_0= RULE_INT
                    {
                    lv_upperBound_5_0=(Token)match(input,RULE_INT,FOLLOW_24); 

                    						newLeafNode(lv_upperBound_5_0, grammarAccess.getPlatformParticipantAccess().getUpperBoundINTTerminalRuleCall_2_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformParticipantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"upperBound",
                    							lv_upperBound_5_0,
                    							"com.epistimis.uddl.Uddl.INT");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,29,FOLLOW_91); 

                    				newLeafNode(otherlv_6, grammarAccess.getPlatformParticipantAccess().getRightSquareBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalUddl.g:10275:3: ( (lv_description_7_0= RULE_STRING ) )?
            int alt200=2;
            int LA200_0 = input.LA(1);

            if ( (LA200_0==RULE_STRING) ) {
                alt200=1;
            }
            switch (alt200) {
                case 1 :
                    // InternalUddl.g:10276:4: (lv_description_7_0= RULE_STRING )
                    {
                    // InternalUddl.g:10276:4: (lv_description_7_0= RULE_STRING )
                    // InternalUddl.g:10277:5: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_92); 

                    					newLeafNode(lv_description_7_0, grammarAccess.getPlatformParticipantAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformParticipantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_7_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:10293:3: (otherlv_8= ':' ( ( ruleQN ) ) )?
            int alt201=2;
            int LA201_0 = input.LA(1);

            if ( (LA201_0==26) ) {
                alt201=1;
            }
            switch (alt201) {
                case 1 :
                    // InternalUddl.g:10294:4: otherlv_8= ':' ( ( ruleQN ) )
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getPlatformParticipantAccess().getColonKeyword_4_0());
                    			
                    // InternalUddl.g:10298:4: ( ( ruleQN ) )
                    // InternalUddl.g:10299:5: ( ruleQN )
                    {
                    // InternalUddl.g:10299:5: ( ruleQN )
                    // InternalUddl.g:10300:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformParticipantRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPlatformParticipantAccess().getSpecializesPlatformCharacteristicCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_84);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getPlatformParticipantAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            // InternalUddl.g:10319:3: ( ( ruleQN ) )
            // InternalUddl.g:10320:4: ( ruleQN )
            {
            // InternalUddl.g:10320:4: ( ruleQN )
            // InternalUddl.g:10321:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformParticipantRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformParticipantAccess().getRealizesLogicalParticipantCrossReference_6_0());
            				
            pushFollow(FOLLOW_5);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,14,FOLLOW_95); 

            			newLeafNode(otherlv_12, grammarAccess.getPlatformParticipantAccess().getLeftCurlyBracketKeyword_7());
            		
            otherlv_13=(Token)match(input,97,FOLLOW_17); 

            			newLeafNode(otherlv_13, grammarAccess.getPlatformParticipantAccess().getSourceKeyword_8());
            		
            otherlv_14=(Token)match(input,28,FOLLOW_31); 

            			newLeafNode(otherlv_14, grammarAccess.getPlatformParticipantAccess().getLeftSquareBracketKeyword_9());
            		
            // InternalUddl.g:10347:3: ( (lv_sourceLowerBound_15_0= RULE_INT ) )
            // InternalUddl.g:10348:4: (lv_sourceLowerBound_15_0= RULE_INT )
            {
            // InternalUddl.g:10348:4: (lv_sourceLowerBound_15_0= RULE_INT )
            // InternalUddl.g:10349:5: lv_sourceLowerBound_15_0= RULE_INT
            {
            lv_sourceLowerBound_15_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_sourceLowerBound_15_0, grammarAccess.getPlatformParticipantAccess().getSourceLowerBoundINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformParticipantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sourceLowerBound",
            						lv_sourceLowerBound_15_0,
            						"com.epistimis.uddl.Uddl.INT");
            				

            }


            }

            otherlv_16=(Token)match(input,26,FOLLOW_31); 

            			newLeafNode(otherlv_16, grammarAccess.getPlatformParticipantAccess().getColonKeyword_11());
            		
            // InternalUddl.g:10369:3: ( (lv_sourceUpperBound_17_0= RULE_INT ) )
            // InternalUddl.g:10370:4: (lv_sourceUpperBound_17_0= RULE_INT )
            {
            // InternalUddl.g:10370:4: (lv_sourceUpperBound_17_0= RULE_INT )
            // InternalUddl.g:10371:5: lv_sourceUpperBound_17_0= RULE_INT
            {
            lv_sourceUpperBound_17_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_sourceUpperBound_17_0, grammarAccess.getPlatformParticipantAccess().getSourceUpperBoundINTTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformParticipantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sourceUpperBound",
            						lv_sourceUpperBound_17_0,
            						"com.epistimis.uddl.Uddl.INT");
            				

            }


            }

            otherlv_18=(Token)match(input,29,FOLLOW_96); 

            			newLeafNode(otherlv_18, grammarAccess.getPlatformParticipantAccess().getRightSquareBracketKeyword_13());
            		
            // InternalUddl.g:10391:3: (otherlv_19= 'path:' ( (lv_path_20_0= rulePlatformPathNode ) ) )?
            int alt202=2;
            int LA202_0 = input.LA(1);

            if ( (LA202_0==34) ) {
                alt202=1;
            }
            switch (alt202) {
                case 1 :
                    // InternalUddl.g:10392:4: otherlv_19= 'path:' ( (lv_path_20_0= rulePlatformPathNode ) )
                    {
                    otherlv_19=(Token)match(input,34,FOLLOW_33); 

                    				newLeafNode(otherlv_19, grammarAccess.getPlatformParticipantAccess().getPathKeyword_14_0());
                    			
                    // InternalUddl.g:10396:4: ( (lv_path_20_0= rulePlatformPathNode ) )
                    // InternalUddl.g:10397:5: (lv_path_20_0= rulePlatformPathNode )
                    {
                    // InternalUddl.g:10397:5: (lv_path_20_0= rulePlatformPathNode )
                    // InternalUddl.g:10398:6: lv_path_20_0= rulePlatformPathNode
                    {

                    						newCompositeNode(grammarAccess.getPlatformParticipantAccess().getPathPlatformPathNodeParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_path_20_0=rulePlatformPathNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlatformParticipantRule());
                    						}
                    						set(
                    							current,
                    							"path",
                    							lv_path_20_0,
                    							"com.epistimis.uddl.Uddl.PlatformPathNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getPlatformParticipantAccess().getRightCurlyBracketSemicolonKeyword_15());
            		

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
    // $ANTLR end "rulePlatformParticipant"


    // $ANTLR start "entryRulePlatformPathNode"
    // InternalUddl.g:10424:1: entryRulePlatformPathNode returns [EObject current=null] : iv_rulePlatformPathNode= rulePlatformPathNode EOF ;
    public final EObject entryRulePlatformPathNode() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformPathNode = null;


        try {
            // InternalUddl.g:10424:57: (iv_rulePlatformPathNode= rulePlatformPathNode EOF )
            // InternalUddl.g:10425:2: iv_rulePlatformPathNode= rulePlatformPathNode EOF
            {
             newCompositeNode(grammarAccess.getPlatformPathNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformPathNode=rulePlatformPathNode();

            state._fsp--;

             current =iv_rulePlatformPathNode; 
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
    // $ANTLR end "entryRulePlatformPathNode"


    // $ANTLR start "rulePlatformPathNode"
    // InternalUddl.g:10431:1: rulePlatformPathNode returns [EObject current=null] : (this_PlatformParticipantPathNode_0= rulePlatformParticipantPathNode | this_PlatformCharacteristicPathNode_1= rulePlatformCharacteristicPathNode ) ;
    public final EObject rulePlatformPathNode() throws RecognitionException {
        EObject current = null;

        EObject this_PlatformParticipantPathNode_0 = null;

        EObject this_PlatformCharacteristicPathNode_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:10437:2: ( (this_PlatformParticipantPathNode_0= rulePlatformParticipantPathNode | this_PlatformCharacteristicPathNode_1= rulePlatformCharacteristicPathNode ) )
            // InternalUddl.g:10438:2: (this_PlatformParticipantPathNode_0= rulePlatformParticipantPathNode | this_PlatformCharacteristicPathNode_1= rulePlatformCharacteristicPathNode )
            {
            // InternalUddl.g:10438:2: (this_PlatformParticipantPathNode_0= rulePlatformParticipantPathNode | this_PlatformCharacteristicPathNode_1= rulePlatformCharacteristicPathNode )
            int alt203=2;
            int LA203_0 = input.LA(1);

            if ( (LA203_0==35) ) {
                alt203=1;
            }
            else if ( (LA203_0==36) ) {
                alt203=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 203, 0, input);

                throw nvae;
            }
            switch (alt203) {
                case 1 :
                    // InternalUddl.g:10439:3: this_PlatformParticipantPathNode_0= rulePlatformParticipantPathNode
                    {

                    			newCompositeNode(grammarAccess.getPlatformPathNodeAccess().getPlatformParticipantPathNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformParticipantPathNode_0=rulePlatformParticipantPathNode();

                    state._fsp--;


                    			current = this_PlatformParticipantPathNode_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:10448:3: this_PlatformCharacteristicPathNode_1= rulePlatformCharacteristicPathNode
                    {

                    			newCompositeNode(grammarAccess.getPlatformPathNodeAccess().getPlatformCharacteristicPathNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformCharacteristicPathNode_1=rulePlatformCharacteristicPathNode();

                    state._fsp--;


                    			current = this_PlatformCharacteristicPathNode_1;
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
    // $ANTLR end "rulePlatformPathNode"


    // $ANTLR start "entryRulePlatformParticipantPathNode"
    // InternalUddl.g:10460:1: entryRulePlatformParticipantPathNode returns [EObject current=null] : iv_rulePlatformParticipantPathNode= rulePlatformParticipantPathNode EOF ;
    public final EObject entryRulePlatformParticipantPathNode() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformParticipantPathNode = null;


        try {
            // InternalUddl.g:10460:68: (iv_rulePlatformParticipantPathNode= rulePlatformParticipantPathNode EOF )
            // InternalUddl.g:10461:2: iv_rulePlatformParticipantPathNode= rulePlatformParticipantPathNode EOF
            {
             newCompositeNode(grammarAccess.getPlatformParticipantPathNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformParticipantPathNode=rulePlatformParticipantPathNode();

            state._fsp--;

             current =iv_rulePlatformParticipantPathNode; 
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
    // $ANTLR end "entryRulePlatformParticipantPathNode"


    // $ANTLR start "rulePlatformParticipantPathNode"
    // InternalUddl.g:10467:1: rulePlatformParticipantPathNode returns [EObject current=null] : (otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= rulePlatformPathNode ) ) ) ;
    public final EObject rulePlatformParticipantPathNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_node_2_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:10473:2: ( (otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= rulePlatformPathNode ) ) ) )
            // InternalUddl.g:10474:2: (otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= rulePlatformPathNode ) ) )
            {
            // InternalUddl.g:10474:2: (otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= rulePlatformPathNode ) ) )
            // InternalUddl.g:10475:3: otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= rulePlatformPathNode ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformParticipantPathNodeAccess().getSolidusKeyword_0());
            		
            // InternalUddl.g:10479:3: ( ( ruleQN ) )
            // InternalUddl.g:10480:4: ( ruleQN )
            {
            // InternalUddl.g:10480:4: ( ruleQN )
            // InternalUddl.g:10481:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformParticipantPathNodeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformParticipantPathNodeAccess().getProjectedParticipantPlatformParticipantCrossReference_1_0());
            				
            pushFollow(FOLLOW_33);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:10495:3: ( (lv_node_2_0= rulePlatformPathNode ) )
            // InternalUddl.g:10496:4: (lv_node_2_0= rulePlatformPathNode )
            {
            // InternalUddl.g:10496:4: (lv_node_2_0= rulePlatformPathNode )
            // InternalUddl.g:10497:5: lv_node_2_0= rulePlatformPathNode
            {

            					newCompositeNode(grammarAccess.getPlatformParticipantPathNodeAccess().getNodePlatformPathNodeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_node_2_0=rulePlatformPathNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlatformParticipantPathNodeRule());
            					}
            					set(
            						current,
            						"node",
            						lv_node_2_0,
            						"com.epistimis.uddl.Uddl.PlatformPathNode");
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
    // $ANTLR end "rulePlatformParticipantPathNode"


    // $ANTLR start "entryRulePlatformCharacteristicPathNode"
    // InternalUddl.g:10518:1: entryRulePlatformCharacteristicPathNode returns [EObject current=null] : iv_rulePlatformCharacteristicPathNode= rulePlatformCharacteristicPathNode EOF ;
    public final EObject entryRulePlatformCharacteristicPathNode() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformCharacteristicPathNode = null;


        try {
            // InternalUddl.g:10518:71: (iv_rulePlatformCharacteristicPathNode= rulePlatformCharacteristicPathNode EOF )
            // InternalUddl.g:10519:2: iv_rulePlatformCharacteristicPathNode= rulePlatformCharacteristicPathNode EOF
            {
             newCompositeNode(grammarAccess.getPlatformCharacteristicPathNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformCharacteristicPathNode=rulePlatformCharacteristicPathNode();

            state._fsp--;

             current =iv_rulePlatformCharacteristicPathNode; 
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
    // $ANTLR end "entryRulePlatformCharacteristicPathNode"


    // $ANTLR start "rulePlatformCharacteristicPathNode"
    // InternalUddl.g:10525:1: rulePlatformCharacteristicPathNode returns [EObject current=null] : (otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= rulePlatformPathNode ) ) ) ;
    public final EObject rulePlatformCharacteristicPathNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_node_2_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:10531:2: ( (otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= rulePlatformPathNode ) ) ) )
            // InternalUddl.g:10532:2: (otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= rulePlatformPathNode ) ) )
            {
            // InternalUddl.g:10532:2: (otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= rulePlatformPathNode ) ) )
            // InternalUddl.g:10533:3: otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= rulePlatformPathNode ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformCharacteristicPathNodeAccess().getNumberSignKeyword_0());
            		
            // InternalUddl.g:10537:3: ( ( ruleQN ) )
            // InternalUddl.g:10538:4: ( ruleQN )
            {
            // InternalUddl.g:10538:4: ( ruleQN )
            // InternalUddl.g:10539:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformCharacteristicPathNodeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformCharacteristicPathNodeAccess().getProjectedCharacteristicPlatformCharacteristicCrossReference_1_0());
            				
            pushFollow(FOLLOW_33);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:10553:3: ( (lv_node_2_0= rulePlatformPathNode ) )
            // InternalUddl.g:10554:4: (lv_node_2_0= rulePlatformPathNode )
            {
            // InternalUddl.g:10554:4: (lv_node_2_0= rulePlatformPathNode )
            // InternalUddl.g:10555:5: lv_node_2_0= rulePlatformPathNode
            {

            					newCompositeNode(grammarAccess.getPlatformCharacteristicPathNodeAccess().getNodePlatformPathNodeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_node_2_0=rulePlatformPathNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlatformCharacteristicPathNodeRule());
            					}
            					set(
            						current,
            						"node",
            						lv_node_2_0,
            						"com.epistimis.uddl.Uddl.PlatformPathNode");
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
    // $ANTLR end "rulePlatformCharacteristicPathNode"


    // $ANTLR start "entryRulePlatformView"
    // InternalUddl.g:10576:1: entryRulePlatformView returns [EObject current=null] : iv_rulePlatformView= rulePlatformView EOF ;
    public final EObject entryRulePlatformView() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformView = null;


        try {
            // InternalUddl.g:10576:53: (iv_rulePlatformView= rulePlatformView EOF )
            // InternalUddl.g:10577:2: iv_rulePlatformView= rulePlatformView EOF
            {
             newCompositeNode(grammarAccess.getPlatformViewRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformView=rulePlatformView();

            state._fsp--;

             current =iv_rulePlatformView; 
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
    // $ANTLR end "entryRulePlatformView"


    // $ANTLR start "rulePlatformView"
    // InternalUddl.g:10583:1: rulePlatformView returns [EObject current=null] : (this_PlatformQuery_0= rulePlatformQuery | this_PlatformCompositeQuery_1= rulePlatformCompositeQuery ) ;
    public final EObject rulePlatformView() throws RecognitionException {
        EObject current = null;

        EObject this_PlatformQuery_0 = null;

        EObject this_PlatformCompositeQuery_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:10589:2: ( (this_PlatformQuery_0= rulePlatformQuery | this_PlatformCompositeQuery_1= rulePlatformCompositeQuery ) )
            // InternalUddl.g:10590:2: (this_PlatformQuery_0= rulePlatformQuery | this_PlatformCompositeQuery_1= rulePlatformCompositeQuery )
            {
            // InternalUddl.g:10590:2: (this_PlatformQuery_0= rulePlatformQuery | this_PlatformCompositeQuery_1= rulePlatformCompositeQuery )
            int alt204=2;
            int LA204_0 = input.LA(1);

            if ( (LA204_0==121) ) {
                alt204=1;
            }
            else if ( (LA204_0==122) ) {
                alt204=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 204, 0, input);

                throw nvae;
            }
            switch (alt204) {
                case 1 :
                    // InternalUddl.g:10591:3: this_PlatformQuery_0= rulePlatformQuery
                    {

                    			newCompositeNode(grammarAccess.getPlatformViewAccess().getPlatformQueryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformQuery_0=rulePlatformQuery();

                    state._fsp--;


                    			current = this_PlatformQuery_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:10600:3: this_PlatformCompositeQuery_1= rulePlatformCompositeQuery
                    {

                    			newCompositeNode(grammarAccess.getPlatformViewAccess().getPlatformCompositeQueryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformCompositeQuery_1=rulePlatformCompositeQuery();

                    state._fsp--;


                    			current = this_PlatformCompositeQuery_1;
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
    // $ANTLR end "rulePlatformView"


    // $ANTLR start "entryRulePlatformQuery"
    // InternalUddl.g:10612:1: entryRulePlatformQuery returns [EObject current=null] : iv_rulePlatformQuery= rulePlatformQuery EOF ;
    public final EObject entryRulePlatformQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformQuery = null;


        try {
            // InternalUddl.g:10612:54: (iv_rulePlatformQuery= rulePlatformQuery EOF )
            // InternalUddl.g:10613:2: iv_rulePlatformQuery= rulePlatformQuery EOF
            {
             newCompositeNode(grammarAccess.getPlatformQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformQuery=rulePlatformQuery();

            state._fsp--;

             current =iv_rulePlatformQuery; 
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
    // $ANTLR end "entryRulePlatformQuery"


    // $ANTLR start "rulePlatformQuery"
    // InternalUddl.g:10619:1: rulePlatformQuery returns [EObject current=null] : (otherlv_0= 'pquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' otherlv_6= 'spec:' ( (lv_specification_7_0= RULE_STRING ) ) otherlv_8= '};' ) ;
    public final EObject rulePlatformQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_specification_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalUddl.g:10625:2: ( (otherlv_0= 'pquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' otherlv_6= 'spec:' ( (lv_specification_7_0= RULE_STRING ) ) otherlv_8= '};' ) )
            // InternalUddl.g:10626:2: (otherlv_0= 'pquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' otherlv_6= 'spec:' ( (lv_specification_7_0= RULE_STRING ) ) otherlv_8= '};' )
            {
            // InternalUddl.g:10626:2: (otherlv_0= 'pquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' otherlv_6= 'spec:' ( (lv_specification_7_0= RULE_STRING ) ) otherlv_8= '};' )
            // InternalUddl.g:10627:3: otherlv_0= 'pquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' otherlv_6= 'spec:' ( (lv_specification_7_0= RULE_STRING ) ) otherlv_8= '};'
            {
            otherlv_0=(Token)match(input,121,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformQueryAccess().getPqueryKeyword_0());
            		
            // InternalUddl.g:10631:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:10632:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:10632:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:10633:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformQueryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:10649:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt205=2;
            int LA205_0 = input.LA(1);

            if ( (LA205_0==RULE_STRING) ) {
                alt205=1;
            }
            switch (alt205) {
                case 1 :
                    // InternalUddl.g:10650:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:10650:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:10651:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformQueryAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformQueryRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:10667:3: (otherlv_3= '->' ( ( ruleQN ) ) )?
            int alt206=2;
            int LA206_0 = input.LA(1);

            if ( (LA206_0==90) ) {
                alt206=1;
            }
            switch (alt206) {
                case 1 :
                    // InternalUddl.g:10668:4: otherlv_3= '->' ( ( ruleQN ) )
                    {
                    otherlv_3=(Token)match(input,90,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPlatformQueryAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                    			
                    // InternalUddl.g:10672:4: ( ( ruleQN ) )
                    // InternalUddl.g:10673:5: ( ruleQN )
                    {
                    // InternalUddl.g:10673:5: ( ruleQN )
                    // InternalUddl.g:10674:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformQueryRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPlatformQueryAccess().getRealizesLogicalQueryCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformQueryAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_6=(Token)match(input,38,FOLLOW_37); 

            			newLeafNode(otherlv_6, grammarAccess.getPlatformQueryAccess().getSpecKeyword_5());
            		
            // InternalUddl.g:10697:3: ( (lv_specification_7_0= RULE_STRING ) )
            // InternalUddl.g:10698:4: (lv_specification_7_0= RULE_STRING )
            {
            // InternalUddl.g:10698:4: (lv_specification_7_0= RULE_STRING )
            // InternalUddl.g:10699:5: lv_specification_7_0= RULE_STRING
            {
            lv_specification_7_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_specification_7_0, grammarAccess.getPlatformQueryAccess().getSpecificationSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"specification",
            						lv_specification_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPlatformQueryAccess().getRightCurlyBracketSemicolonKeyword_7());
            		

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
    // $ANTLR end "rulePlatformQuery"


    // $ANTLR start "entryRulePlatformCompositeQuery"
    // InternalUddl.g:10723:1: entryRulePlatformCompositeQuery returns [EObject current=null] : iv_rulePlatformCompositeQuery= rulePlatformCompositeQuery EOF ;
    public final EObject entryRulePlatformCompositeQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformCompositeQuery = null;


        try {
            // InternalUddl.g:10723:63: (iv_rulePlatformCompositeQuery= rulePlatformCompositeQuery EOF )
            // InternalUddl.g:10724:2: iv_rulePlatformCompositeQuery= rulePlatformCompositeQuery EOF
            {
             newCompositeNode(grammarAccess.getPlatformCompositeQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformCompositeQuery=rulePlatformCompositeQuery();

            state._fsp--;

             current =iv_rulePlatformCompositeQuery; 
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
    // $ANTLR end "entryRulePlatformCompositeQuery"


    // $ANTLR start "rulePlatformCompositeQuery"
    // InternalUddl.g:10730:1: rulePlatformCompositeQuery returns [EObject current=null] : (otherlv_0= 'pcquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_isUnion_6_0= 'isUnion' ) ) ( (lv_composition_7_0= rulePlatformQueryComposition ) ) otherlv_8= '};' ) ;
    public final EObject rulePlatformCompositeQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_isUnion_6_0=null;
        Token otherlv_8=null;
        EObject lv_composition_7_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:10736:2: ( (otherlv_0= 'pcquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_isUnion_6_0= 'isUnion' ) ) ( (lv_composition_7_0= rulePlatformQueryComposition ) ) otherlv_8= '};' ) )
            // InternalUddl.g:10737:2: (otherlv_0= 'pcquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_isUnion_6_0= 'isUnion' ) ) ( (lv_composition_7_0= rulePlatformQueryComposition ) ) otherlv_8= '};' )
            {
            // InternalUddl.g:10737:2: (otherlv_0= 'pcquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_isUnion_6_0= 'isUnion' ) ) ( (lv_composition_7_0= rulePlatformQueryComposition ) ) otherlv_8= '};' )
            // InternalUddl.g:10738:3: otherlv_0= 'pcquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_isUnion_6_0= 'isUnion' ) ) ( (lv_composition_7_0= rulePlatformQueryComposition ) ) otherlv_8= '};'
            {
            otherlv_0=(Token)match(input,122,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformCompositeQueryAccess().getPcqueryKeyword_0());
            		
            // InternalUddl.g:10742:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:10743:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:10743:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:10744:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformCompositeQueryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformCompositeQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:10760:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt207=2;
            int LA207_0 = input.LA(1);

            if ( (LA207_0==RULE_STRING) ) {
                alt207=1;
            }
            switch (alt207) {
                case 1 :
                    // InternalUddl.g:10761:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:10761:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:10762:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformCompositeQueryAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformCompositeQueryRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:10778:3: (otherlv_3= '->' ( ( ruleQN ) ) )?
            int alt208=2;
            int LA208_0 = input.LA(1);

            if ( (LA208_0==90) ) {
                alt208=1;
            }
            switch (alt208) {
                case 1 :
                    // InternalUddl.g:10779:4: otherlv_3= '->' ( ( ruleQN ) )
                    {
                    otherlv_3=(Token)match(input,90,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPlatformCompositeQueryAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                    			
                    // InternalUddl.g:10783:4: ( ( ruleQN ) )
                    // InternalUddl.g:10784:5: ( ruleQN )
                    {
                    // InternalUddl.g:10784:5: ( ruleQN )
                    // InternalUddl.g:10785:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformCompositeQueryRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPlatformCompositeQueryAccess().getRealizesLogicalQueryCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_38); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformCompositeQueryAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalUddl.g:10804:3: ( (lv_isUnion_6_0= 'isUnion' ) )
            // InternalUddl.g:10805:4: (lv_isUnion_6_0= 'isUnion' )
            {
            // InternalUddl.g:10805:4: (lv_isUnion_6_0= 'isUnion' )
            // InternalUddl.g:10806:5: lv_isUnion_6_0= 'isUnion'
            {
            lv_isUnion_6_0=(Token)match(input,40,FOLLOW_3); 

            					newLeafNode(lv_isUnion_6_0, grammarAccess.getPlatformCompositeQueryAccess().getIsUnionIsUnionKeyword_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformCompositeQueryRule());
            					}
            					setWithLastConsumed(current, "isUnion", lv_isUnion_6_0 != null, "isUnion");
            				

            }


            }

            // InternalUddl.g:10818:3: ( (lv_composition_7_0= rulePlatformQueryComposition ) )
            // InternalUddl.g:10819:4: (lv_composition_7_0= rulePlatformQueryComposition )
            {
            // InternalUddl.g:10819:4: (lv_composition_7_0= rulePlatformQueryComposition )
            // InternalUddl.g:10820:5: lv_composition_7_0= rulePlatformQueryComposition
            {

            					newCompositeNode(grammarAccess.getPlatformCompositeQueryAccess().getCompositionPlatformQueryCompositionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_19);
            lv_composition_7_0=rulePlatformQueryComposition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlatformCompositeQueryRule());
            					}
            					add(
            						current,
            						"composition",
            						lv_composition_7_0,
            						"com.epistimis.uddl.Uddl.PlatformQueryComposition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPlatformCompositeQueryAccess().getRightCurlyBracketSemicolonKeyword_7());
            		

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
    // $ANTLR end "rulePlatformCompositeQuery"


    // $ANTLR start "entryRulePlatformQueryComposition"
    // InternalUddl.g:10845:1: entryRulePlatformQueryComposition returns [EObject current=null] : iv_rulePlatformQueryComposition= rulePlatformQueryComposition EOF ;
    public final EObject entryRulePlatformQueryComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformQueryComposition = null;


        try {
            // InternalUddl.g:10845:65: (iv_rulePlatformQueryComposition= rulePlatformQueryComposition EOF )
            // InternalUddl.g:10846:2: iv_rulePlatformQueryComposition= rulePlatformQueryComposition EOF
            {
             newCompositeNode(grammarAccess.getPlatformQueryCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformQueryComposition=rulePlatformQueryComposition();

            state._fsp--;

             current =iv_rulePlatformQueryComposition; 
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
    // $ANTLR end "entryRulePlatformQueryComposition"


    // $ANTLR start "rulePlatformQueryComposition"
    // InternalUddl.g:10852:1: rulePlatformQueryComposition returns [EObject current=null] : ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '->' ( ( ruleQN ) ) )? ) ;
    public final EObject rulePlatformQueryComposition() throws RecognitionException {
        EObject current = null;

        Token lv_rolename_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalUddl.g:10858:2: ( ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '->' ( ( ruleQN ) ) )? ) )
            // InternalUddl.g:10859:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '->' ( ( ruleQN ) ) )? )
            {
            // InternalUddl.g:10859:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '->' ( ( ruleQN ) ) )? )
            // InternalUddl.g:10860:3: ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '->' ( ( ruleQN ) ) )?
            {
            // InternalUddl.g:10860:3: ( ( ruleQN ) )
            // InternalUddl.g:10861:4: ( ruleQN )
            {
            // InternalUddl.g:10861:4: ( ruleQN )
            // InternalUddl.g:10862:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformQueryCompositionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformQueryCompositionAccess().getTypePlatformViewCrossReference_0_0());
            				
            pushFollow(FOLLOW_3);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:10876:3: ( (lv_rolename_1_0= RULE_ID ) )
            // InternalUddl.g:10877:4: (lv_rolename_1_0= RULE_ID )
            {
            // InternalUddl.g:10877:4: (lv_rolename_1_0= RULE_ID )
            // InternalUddl.g:10878:5: lv_rolename_1_0= RULE_ID
            {
            lv_rolename_1_0=(Token)match(input,RULE_ID,FOLLOW_97); 

            					newLeafNode(lv_rolename_1_0, grammarAccess.getPlatformQueryCompositionAccess().getRolenameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformQueryCompositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rolename",
            						lv_rolename_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:10894:3: (otherlv_2= '->' ( ( ruleQN ) ) )?
            int alt209=2;
            int LA209_0 = input.LA(1);

            if ( (LA209_0==90) ) {
                alt209=1;
            }
            switch (alt209) {
                case 1 :
                    // InternalUddl.g:10895:4: otherlv_2= '->' ( ( ruleQN ) )
                    {
                    otherlv_2=(Token)match(input,90,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getPlatformQueryCompositionAccess().getHyphenMinusGreaterThanSignKeyword_2_0());
                    			
                    // InternalUddl.g:10899:4: ( ( ruleQN ) )
                    // InternalUddl.g:10900:5: ( ruleQN )
                    {
                    // InternalUddl.g:10900:5: ( ruleQN )
                    // InternalUddl.g:10901:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformQueryCompositionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPlatformQueryCompositionAccess().getRealizesLogicalQueryCompositionCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleQN();

                    state._fsp--;


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
    // $ANTLR end "rulePlatformQueryComposition"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001C8000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000A083A48000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x29FE160000088010L,0x0000000DD2409036L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x01080000001C8000L,0x077FFFF000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004004020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000048000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000014400020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004400020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000148000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000014004020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0200000010000020L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0200000010000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0C00000020000010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0800000020000010L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0xC000000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x8000000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0800000020000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000020L,0x0000000000004000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x1000000000000010L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000404020L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0800000010000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x1000000020000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0400000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000020L,0x0000000004000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x4000000000000010L,0x0000000008000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000004020L,0x0000000004000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000004000L,0x0000000004000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000020002000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000004000020L,0x0000000004000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000004000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000014000020L,0x0000000004000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000140000010L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});

}