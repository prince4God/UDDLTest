package com.epistimis.uddl.query.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQueryLexer extends Lexer {
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

    public InternalQueryLexer() {;} 
    public InternalQueryLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalQueryLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalQueryLexer.g"; }

    // $ANTLR start "Select"
    public final void mSelect() throws RecognitionException {
        try {
            int _type = Select;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:17:8: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // InternalQueryLexer.g:17:10: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Select"

    // $ANTLR start "From"
    public final void mFrom() throws RecognitionException {
        try {
            int _type = From;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:19:6: ( ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' ) )
            // InternalQueryLexer.g:19:8: ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "From"

    // $ANTLR start "Semicolon"
    public final void mSemicolon() throws RecognitionException {
        try {
            int _type = Semicolon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:21:11: ( ';' )
            // InternalQueryLexer.g:21:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Semicolon"

    // $ANTLR start "RULE_ALL_CHARACTERISTICS"
    public final void mRULE_ALL_CHARACTERISTICS() throws RecognitionException {
        try {
            int _type = RULE_ALL_CHARACTERISTICS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:23:26: ( '*' )
            // InternalQueryLexer.g:23:28: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALL_CHARACTERISTICS"

    // $ANTLR start "RULE_KW_ALL"
    public final void mRULE_KW_ALL() throws RecognitionException {
        try {
            int _type = RULE_KW_ALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:25:13: ( ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // InternalQueryLexer.g:25:15: ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_ALL"

    // $ANTLR start "RULE_KW_SOME"
    public final void mRULE_KW_SOME() throws RecognitionException {
        try {
            int _type = RULE_KW_SOME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:27:14: ( ( ( 'S' | 's' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'E' | 'e' ) | ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'Y' | 'y' ) ) )
            // InternalQueryLexer.g:27:16: ( ( 'S' | 's' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'E' | 'e' ) | ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'Y' | 'y' ) )
            {
            // InternalQueryLexer.g:27:16: ( ( 'S' | 's' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'E' | 'e' ) | ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'Y' | 'y' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='S'||LA1_0=='s') ) {
                alt1=1;
            }
            else if ( (LA1_0=='A'||LA1_0=='a') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalQueryLexer.g:27:17: ( 'S' | 's' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'E' | 'e' )
                    {
                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // InternalQueryLexer.g:27:57: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'Y' | 'y' )
                    {
                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_SOME"

    // $ANTLR start "RULE_KW_EXISTS"
    public final void mRULE_KW_EXISTS() throws RecognitionException {
        try {
            int _type = RULE_KW_EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:29:16: ( ( 'EXISTS' | 'exists' ) )
            // InternalQueryLexer.g:29:18: ( 'EXISTS' | 'exists' )
            {
            // InternalQueryLexer.g:29:18: ( 'EXISTS' | 'exists' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='E') ) {
                alt2=1;
            }
            else if ( (LA2_0=='e') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalQueryLexer.g:29:19: 'EXISTS'
                    {
                    match("EXISTS"); 


                    }
                    break;
                case 2 :
                    // InternalQueryLexer.g:29:28: 'exists'
                    {
                    match("exists"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_EXISTS"

    // $ANTLR start "RULE_KW_NOT"
    public final void mRULE_KW_NOT() throws RecognitionException {
        try {
            int _type = RULE_KW_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:31:13: ( ( 'NOT' | 'not' ) )
            // InternalQueryLexer.g:31:15: ( 'NOT' | 'not' )
            {
            // InternalQueryLexer.g:31:15: ( 'NOT' | 'not' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='N') ) {
                alt3=1;
            }
            else if ( (LA3_0=='n') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalQueryLexer.g:31:16: 'NOT'
                    {
                    match("NOT"); 


                    }
                    break;
                case 2 :
                    // InternalQueryLexer.g:31:22: 'not'
                    {
                    match("not"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_NOT"

    // $ANTLR start "RULE_KW_IN"
    public final void mRULE_KW_IN() throws RecognitionException {
        try {
            int _type = RULE_KW_IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:33:12: ( ( 'IN' | 'in' ) )
            // InternalQueryLexer.g:33:14: ( 'IN' | 'in' )
            {
            // InternalQueryLexer.g:33:14: ( 'IN' | 'in' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='I') ) {
                alt4=1;
            }
            else if ( (LA4_0=='i') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalQueryLexer.g:33:15: 'IN'
                    {
                    match("IN"); 


                    }
                    break;
                case 2 :
                    // InternalQueryLexer.g:33:20: 'in'
                    {
                    match("in"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_IN"

    // $ANTLR start "RULE_KW_AND"
    public final void mRULE_KW_AND() throws RecognitionException {
        try {
            int _type = RULE_KW_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:35:13: ( ( 'AND' | 'and' ) )
            // InternalQueryLexer.g:35:15: ( 'AND' | 'and' )
            {
            // InternalQueryLexer.g:35:15: ( 'AND' | 'and' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='A') ) {
                alt5=1;
            }
            else if ( (LA5_0=='a') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalQueryLexer.g:35:16: 'AND'
                    {
                    match("AND"); 


                    }
                    break;
                case 2 :
                    // InternalQueryLexer.g:35:22: 'and'
                    {
                    match("and"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_AND"

    // $ANTLR start "RULE_KW_OR"
    public final void mRULE_KW_OR() throws RecognitionException {
        try {
            int _type = RULE_KW_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:37:12: ( ( 'OR' | 'or' ) )
            // InternalQueryLexer.g:37:14: ( 'OR' | 'or' )
            {
            // InternalQueryLexer.g:37:14: ( 'OR' | 'or' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='O') ) {
                alt6=1;
            }
            else if ( (LA6_0=='o') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalQueryLexer.g:37:15: 'OR'
                    {
                    match("OR"); 


                    }
                    break;
                case 2 :
                    // InternalQueryLexer.g:37:20: 'or'
                    {
                    match("or"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_OR"

    // $ANTLR start "RULE_KW_AS"
    public final void mRULE_KW_AS() throws RecognitionException {
        try {
            int _type = RULE_KW_AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:39:12: ( ( 'AS' | 'as' ) )
            // InternalQueryLexer.g:39:14: ( 'AS' | 'as' )
            {
            // InternalQueryLexer.g:39:14: ( 'AS' | 'as' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='A') ) {
                alt7=1;
            }
            else if ( (LA7_0=='a') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalQueryLexer.g:39:15: 'AS'
                    {
                    match("AS"); 


                    }
                    break;
                case 2 :
                    // InternalQueryLexer.g:39:20: 'as'
                    {
                    match("as"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_AS"

    // $ANTLR start "RULE_KW_DISTINCT"
    public final void mRULE_KW_DISTINCT() throws RecognitionException {
        try {
            int _type = RULE_KW_DISTINCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:41:18: ( ( 'DISTINCT' | 'distinct' ) )
            // InternalQueryLexer.g:41:20: ( 'DISTINCT' | 'distinct' )
            {
            // InternalQueryLexer.g:41:20: ( 'DISTINCT' | 'distinct' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='D') ) {
                alt8=1;
            }
            else if ( (LA8_0=='d') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalQueryLexer.g:41:21: 'DISTINCT'
                    {
                    match("DISTINCT"); 


                    }
                    break;
                case 2 :
                    // InternalQueryLexer.g:41:32: 'distinct'
                    {
                    match("distinct"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_DISTINCT"

    // $ANTLR start "RULE_KW_WHERE"
    public final void mRULE_KW_WHERE() throws RecognitionException {
        try {
            int _type = RULE_KW_WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:43:15: ( ( 'WHERE' | 'where' ) )
            // InternalQueryLexer.g:43:17: ( 'WHERE' | 'where' )
            {
            // InternalQueryLexer.g:43:17: ( 'WHERE' | 'where' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='W') ) {
                alt9=1;
            }
            else if ( (LA9_0=='w') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalQueryLexer.g:43:18: 'WHERE'
                    {
                    match("WHERE"); 


                    }
                    break;
                case 2 :
                    // InternalQueryLexer.g:43:26: 'where'
                    {
                    match("where"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_WHERE"

    // $ANTLR start "RULE_KW_BY"
    public final void mRULE_KW_BY() throws RecognitionException {
        try {
            int _type = RULE_KW_BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:45:12: ( ( 'BY' | 'by' ) )
            // InternalQueryLexer.g:45:14: ( 'BY' | 'by' )
            {
            // InternalQueryLexer.g:45:14: ( 'BY' | 'by' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='B') ) {
                alt10=1;
            }
            else if ( (LA10_0=='b') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalQueryLexer.g:45:15: 'BY'
                    {
                    match("BY"); 


                    }
                    break;
                case 2 :
                    // InternalQueryLexer.g:45:20: 'by'
                    {
                    match("by"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_BY"

    // $ANTLR start "RULE_KW_JOIN"
    public final void mRULE_KW_JOIN() throws RecognitionException {
        try {
            int _type = RULE_KW_JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:47:14: ( ( 'JOIN' | 'join' ) )
            // InternalQueryLexer.g:47:16: ( 'JOIN' | 'join' )
            {
            // InternalQueryLexer.g:47:16: ( 'JOIN' | 'join' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='J') ) {
                alt11=1;
            }
            else if ( (LA11_0=='j') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalQueryLexer.g:47:17: 'JOIN'
                    {
                    match("JOIN"); 


                    }
                    break;
                case 2 :
                    // InternalQueryLexer.g:47:24: 'join'
                    {
                    match("join"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_JOIN"

    // $ANTLR start "RULE_KW_ON"
    public final void mRULE_KW_ON() throws RecognitionException {
        try {
            int _type = RULE_KW_ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:49:12: ( ( 'ON' | 'on' ) )
            // InternalQueryLexer.g:49:14: ( 'ON' | 'on' )
            {
            // InternalQueryLexer.g:49:14: ( 'ON' | 'on' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='O') ) {
                alt12=1;
            }
            else if ( (LA12_0=='o') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalQueryLexer.g:49:15: 'ON'
                    {
                    match("ON"); 


                    }
                    break;
                case 2 :
                    // InternalQueryLexer.g:49:20: 'on'
                    {
                    match("on"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_ON"

    // $ANTLR start "RULE_KW_ORDER"
    public final void mRULE_KW_ORDER() throws RecognitionException {
        try {
            int _type = RULE_KW_ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:51:15: ( ( 'ORDER' | 'order' ) )
            // InternalQueryLexer.g:51:17: ( 'ORDER' | 'order' )
            {
            // InternalQueryLexer.g:51:17: ( 'ORDER' | 'order' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='O') ) {
                alt13=1;
            }
            else if ( (LA13_0=='o') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalQueryLexer.g:51:18: 'ORDER'
                    {
                    match("ORDER"); 


                    }
                    break;
                case 2 :
                    // InternalQueryLexer.g:51:26: 'order'
                    {
                    match("order"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_ORDER"

    // $ANTLR start "RULE_KW_ASC"
    public final void mRULE_KW_ASC() throws RecognitionException {
        try {
            int _type = RULE_KW_ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:53:13: ( ( 'ASC' | 'asc' ) )
            // InternalQueryLexer.g:53:15: ( 'ASC' | 'asc' )
            {
            // InternalQueryLexer.g:53:15: ( 'ASC' | 'asc' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='A') ) {
                alt14=1;
            }
            else if ( (LA14_0=='a') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalQueryLexer.g:53:16: 'ASC'
                    {
                    match("ASC"); 


                    }
                    break;
                case 2 :
                    // InternalQueryLexer.g:53:22: 'asc'
                    {
                    match("asc"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_ASC"

    // $ANTLR start "RULE_KW_DESC"
    public final void mRULE_KW_DESC() throws RecognitionException {
        try {
            int _type = RULE_KW_DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:55:14: ( ( 'DESC' | 'desc' ) )
            // InternalQueryLexer.g:55:16: ( 'DESC' | 'desc' )
            {
            // InternalQueryLexer.g:55:16: ( 'DESC' | 'desc' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='D') ) {
                alt15=1;
            }
            else if ( (LA15_0=='d') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalQueryLexer.g:55:17: 'DESC'
                    {
                    match("DESC"); 


                    }
                    break;
                case 2 :
                    // InternalQueryLexer.g:55:24: 'desc'
                    {
                    match("desc"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_DESC"

    // $ANTLR start "RULE_EQUALS_OPERATOR"
    public final void mRULE_EQUALS_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_EQUALS_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:57:22: ( '=' )
            // InternalQueryLexer.g:57:24: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUALS_OPERATOR"

    // $ANTLR start "RULE_NOT_EQUALS_OPERATOR"
    public final void mRULE_NOT_EQUALS_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_NOT_EQUALS_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:59:26: ( ( '<>' | '!:' ) )
            // InternalQueryLexer.g:59:28: ( '<>' | '!:' )
            {
            // InternalQueryLexer.g:59:28: ( '<>' | '!:' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='<') ) {
                alt16=1;
            }
            else if ( (LA16_0=='!') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalQueryLexer.g:59:29: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 2 :
                    // InternalQueryLexer.g:59:34: '!:'
                    {
                    match("!:"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT_EQUALS_OPERATOR"

    // $ANTLR start "RULE_LESS_THAN_OPERATOR"
    public final void mRULE_LESS_THAN_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_LESS_THAN_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:61:25: ( '<' )
            // InternalQueryLexer.g:61:27: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LESS_THAN_OPERATOR"

    // $ANTLR start "RULE_GREATER_THAN_OPERATOR"
    public final void mRULE_GREATER_THAN_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_GREATER_THAN_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:63:28: ( '>' )
            // InternalQueryLexer.g:63:30: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GREATER_THAN_OPERATOR"

    // $ANTLR start "RULE_GREATER_THAN_OR_EQUALS_OPERATOR"
    public final void mRULE_GREATER_THAN_OR_EQUALS_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_GREATER_THAN_OR_EQUALS_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:65:38: ( '>:' )
            // InternalQueryLexer.g:65:40: '>:'
            {
            match(">:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GREATER_THAN_OR_EQUALS_OPERATOR"

    // $ANTLR start "RULE_LESS_THAN_OR_EQUALS_OPERATOR"
    public final void mRULE_LESS_THAN_OR_EQUALS_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_LESS_THAN_OR_EQUALS_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:67:35: ( '<:' )
            // InternalQueryLexer.g:67:37: '<:'
            {
            match("<:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LESS_THAN_OR_EQUALS_OPERATOR"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:69:12: ( ',' )
            // InternalQueryLexer.g:69:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_LEFT_PAREN"
    public final void mRULE_LEFT_PAREN() throws RecognitionException {
        try {
            int _type = RULE_LEFT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:71:17: ( '(' )
            // InternalQueryLexer.g:71:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_PAREN"

    // $ANTLR start "RULE_RIGHT_PAREN"
    public final void mRULE_RIGHT_PAREN() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:73:18: ( ')' )
            // InternalQueryLexer.g:73:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_PAREN"

    // $ANTLR start "RULE_PERIOD"
    public final void mRULE_PERIOD() throws RecognitionException {
        try {
            int _type = RULE_PERIOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:75:13: ( '.' )
            // InternalQueryLexer.g:75:15: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PERIOD"

    // $ANTLR start "RULE_LEFT_BRACE"
    public final void mRULE_LEFT_BRACE() throws RecognitionException {
        try {
            int _type = RULE_LEFT_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:77:17: ( '{' )
            // InternalQueryLexer.g:77:19: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_BRACE"

    // $ANTLR start "RULE_RIGHT_BRACE"
    public final void mRULE_RIGHT_BRACE() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:79:18: ( '}' )
            // InternalQueryLexer.g:79:20: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_BRACE"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:81:12: ( ':' )
            // InternalQueryLexer.g:81:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:83:17: ( RULE_LETTER ( RULE_LETTER | RULE_DIGITAL_LITERAL )* )
            // InternalQueryLexer.g:83:19: RULE_LETTER ( RULE_LETTER | RULE_DIGITAL_LITERAL )*
            {
            mRULE_LETTER(); 
            // InternalQueryLexer.g:83:31: ( RULE_LETTER | RULE_DIGITAL_LITERAL )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalQueryLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENTIFIER"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // InternalQueryLexer.g:85:22: ( ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' | 'i' | 'j' | 'k' | 'l' | 'm' | 'n' | 'o' | 'p' | 'q' | 'r' | 's' | 't' | 'u' | 'v' | 'w' | 'x' | 'y' | 'z' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'H' | 'I' | 'J' | 'K' | 'L' | 'M' | 'N' | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T' | 'U' | 'V' | 'W' | 'X' | 'Y' | 'Z' | '_' ) )
            // InternalQueryLexer.g:85:24: ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' | 'i' | 'j' | 'k' | 'l' | 'm' | 'n' | 'o' | 'p' | 'q' | 'r' | 's' | 't' | 'u' | 'v' | 'w' | 'x' | 'y' | 'z' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'H' | 'I' | 'J' | 'K' | 'L' | 'M' | 'N' | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T' | 'U' | 'V' | 'W' | 'X' | 'Y' | 'Z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_DIGITAL_LITERAL"
    public final void mRULE_DIGITAL_LITERAL() throws RecognitionException {
        try {
            // InternalQueryLexer.g:87:31: ( ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ) )
            // InternalQueryLexer.g:87:33: ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGITAL_LITERAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:89:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalQueryLexer.g:89:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalQueryLexer.g:89:11: ( '^' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='^') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalQueryLexer.g:89:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalQueryLexer.g:89:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='9')||(LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='z')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalQueryLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:91:10: ( ( '0' .. '9' )+ )
            // InternalQueryLexer.g:91:12: ( '0' .. '9' )+
            {
            // InternalQueryLexer.g:91:12: ( '0' .. '9' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='0' && LA20_0<='9')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalQueryLexer.g:91:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:93:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalQueryLexer.g:93:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalQueryLexer.g:93:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\"') ) {
                alt23=1;
            }
            else if ( (LA23_0=='\'') ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalQueryLexer.g:93:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalQueryLexer.g:93:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop21:
                    do {
                        int alt21=3;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0=='\\') ) {
                            alt21=1;
                        }
                        else if ( ((LA21_0>='\u0000' && LA21_0<='!')||(LA21_0>='#' && LA21_0<='[')||(LA21_0>=']' && LA21_0<='\uFFFF')) ) {
                            alt21=2;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalQueryLexer.g:93:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalQueryLexer.g:93:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalQueryLexer.g:93:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalQueryLexer.g:93:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop22:
                    do {
                        int alt22=3;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0=='\\') ) {
                            alt22=1;
                        }
                        else if ( ((LA22_0>='\u0000' && LA22_0<='&')||(LA22_0>='(' && LA22_0<='[')||(LA22_0>=']' && LA22_0<='\uFFFF')) ) {
                            alt22=2;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalQueryLexer.g:93:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalQueryLexer.g:93:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:95:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalQueryLexer.g:95:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalQueryLexer.g:95:24: ( options {greedy=false; } : . )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0=='*') ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1=='/') ) {
                        alt24=2;
                    }
                    else if ( ((LA24_1>='\u0000' && LA24_1<='.')||(LA24_1>='0' && LA24_1<='\uFFFF')) ) {
                        alt24=1;
                    }


                }
                else if ( ((LA24_0>='\u0000' && LA24_0<=')')||(LA24_0>='+' && LA24_0<='\uFFFF')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalQueryLexer.g:95:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:97:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalQueryLexer.g:97:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalQueryLexer.g:97:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='\u0000' && LA25_0<='\t')||(LA25_0>='\u000B' && LA25_0<='\f')||(LA25_0>='\u000E' && LA25_0<='\uFFFF')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalQueryLexer.g:97:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalQueryLexer.g:97:40: ( ( '\\r' )? '\\n' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='\n'||LA27_0=='\r') ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalQueryLexer.g:97:41: ( '\\r' )? '\\n'
                    {
                    // InternalQueryLexer.g:97:41: ( '\\r' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0=='\r') ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalQueryLexer.g:97:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:99:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalQueryLexer.g:99:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalQueryLexer.g:99:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='\t' && LA28_0<='\n')||LA28_0=='\r'||LA28_0==' ') ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalQueryLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryLexer.g:101:16: ( . )
            // InternalQueryLexer.g:101:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalQueryLexer.g:1:8: ( Select | From | Semicolon | RULE_ALL_CHARACTERISTICS | RULE_KW_ALL | RULE_KW_SOME | RULE_KW_EXISTS | RULE_KW_NOT | RULE_KW_IN | RULE_KW_AND | RULE_KW_OR | RULE_KW_AS | RULE_KW_DISTINCT | RULE_KW_WHERE | RULE_KW_BY | RULE_KW_JOIN | RULE_KW_ON | RULE_KW_ORDER | RULE_KW_ASC | RULE_KW_DESC | RULE_EQUALS_OPERATOR | RULE_NOT_EQUALS_OPERATOR | RULE_LESS_THAN_OPERATOR | RULE_GREATER_THAN_OPERATOR | RULE_GREATER_THAN_OR_EQUALS_OPERATOR | RULE_LESS_THAN_OR_EQUALS_OPERATOR | RULE_COMMA | RULE_LEFT_PAREN | RULE_RIGHT_PAREN | RULE_PERIOD | RULE_LEFT_BRACE | RULE_RIGHT_BRACE | RULE_COLON | RULE_IDENTIFIER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt29=41;
        alt29 = dfa29.predict(input);
        switch (alt29) {
            case 1 :
                // InternalQueryLexer.g:1:10: Select
                {
                mSelect(); 

                }
                break;
            case 2 :
                // InternalQueryLexer.g:1:17: From
                {
                mFrom(); 

                }
                break;
            case 3 :
                // InternalQueryLexer.g:1:22: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 4 :
                // InternalQueryLexer.g:1:32: RULE_ALL_CHARACTERISTICS
                {
                mRULE_ALL_CHARACTERISTICS(); 

                }
                break;
            case 5 :
                // InternalQueryLexer.g:1:57: RULE_KW_ALL
                {
                mRULE_KW_ALL(); 

                }
                break;
            case 6 :
                // InternalQueryLexer.g:1:69: RULE_KW_SOME
                {
                mRULE_KW_SOME(); 

                }
                break;
            case 7 :
                // InternalQueryLexer.g:1:82: RULE_KW_EXISTS
                {
                mRULE_KW_EXISTS(); 

                }
                break;
            case 8 :
                // InternalQueryLexer.g:1:97: RULE_KW_NOT
                {
                mRULE_KW_NOT(); 

                }
                break;
            case 9 :
                // InternalQueryLexer.g:1:109: RULE_KW_IN
                {
                mRULE_KW_IN(); 

                }
                break;
            case 10 :
                // InternalQueryLexer.g:1:120: RULE_KW_AND
                {
                mRULE_KW_AND(); 

                }
                break;
            case 11 :
                // InternalQueryLexer.g:1:132: RULE_KW_OR
                {
                mRULE_KW_OR(); 

                }
                break;
            case 12 :
                // InternalQueryLexer.g:1:143: RULE_KW_AS
                {
                mRULE_KW_AS(); 

                }
                break;
            case 13 :
                // InternalQueryLexer.g:1:154: RULE_KW_DISTINCT
                {
                mRULE_KW_DISTINCT(); 

                }
                break;
            case 14 :
                // InternalQueryLexer.g:1:171: RULE_KW_WHERE
                {
                mRULE_KW_WHERE(); 

                }
                break;
            case 15 :
                // InternalQueryLexer.g:1:185: RULE_KW_BY
                {
                mRULE_KW_BY(); 

                }
                break;
            case 16 :
                // InternalQueryLexer.g:1:196: RULE_KW_JOIN
                {
                mRULE_KW_JOIN(); 

                }
                break;
            case 17 :
                // InternalQueryLexer.g:1:209: RULE_KW_ON
                {
                mRULE_KW_ON(); 

                }
                break;
            case 18 :
                // InternalQueryLexer.g:1:220: RULE_KW_ORDER
                {
                mRULE_KW_ORDER(); 

                }
                break;
            case 19 :
                // InternalQueryLexer.g:1:234: RULE_KW_ASC
                {
                mRULE_KW_ASC(); 

                }
                break;
            case 20 :
                // InternalQueryLexer.g:1:246: RULE_KW_DESC
                {
                mRULE_KW_DESC(); 

                }
                break;
            case 21 :
                // InternalQueryLexer.g:1:259: RULE_EQUALS_OPERATOR
                {
                mRULE_EQUALS_OPERATOR(); 

                }
                break;
            case 22 :
                // InternalQueryLexer.g:1:280: RULE_NOT_EQUALS_OPERATOR
                {
                mRULE_NOT_EQUALS_OPERATOR(); 

                }
                break;
            case 23 :
                // InternalQueryLexer.g:1:305: RULE_LESS_THAN_OPERATOR
                {
                mRULE_LESS_THAN_OPERATOR(); 

                }
                break;
            case 24 :
                // InternalQueryLexer.g:1:329: RULE_GREATER_THAN_OPERATOR
                {
                mRULE_GREATER_THAN_OPERATOR(); 

                }
                break;
            case 25 :
                // InternalQueryLexer.g:1:356: RULE_GREATER_THAN_OR_EQUALS_OPERATOR
                {
                mRULE_GREATER_THAN_OR_EQUALS_OPERATOR(); 

                }
                break;
            case 26 :
                // InternalQueryLexer.g:1:393: RULE_LESS_THAN_OR_EQUALS_OPERATOR
                {
                mRULE_LESS_THAN_OR_EQUALS_OPERATOR(); 

                }
                break;
            case 27 :
                // InternalQueryLexer.g:1:427: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 28 :
                // InternalQueryLexer.g:1:438: RULE_LEFT_PAREN
                {
                mRULE_LEFT_PAREN(); 

                }
                break;
            case 29 :
                // InternalQueryLexer.g:1:454: RULE_RIGHT_PAREN
                {
                mRULE_RIGHT_PAREN(); 

                }
                break;
            case 30 :
                // InternalQueryLexer.g:1:471: RULE_PERIOD
                {
                mRULE_PERIOD(); 

                }
                break;
            case 31 :
                // InternalQueryLexer.g:1:483: RULE_LEFT_BRACE
                {
                mRULE_LEFT_BRACE(); 

                }
                break;
            case 32 :
                // InternalQueryLexer.g:1:499: RULE_RIGHT_BRACE
                {
                mRULE_RIGHT_BRACE(); 

                }
                break;
            case 33 :
                // InternalQueryLexer.g:1:516: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 34 :
                // InternalQueryLexer.g:1:527: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 35 :
                // InternalQueryLexer.g:1:543: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 36 :
                // InternalQueryLexer.g:1:551: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 37 :
                // InternalQueryLexer.g:1:560: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 38 :
                // InternalQueryLexer.g:1:572: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 39 :
                // InternalQueryLexer.g:1:588: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 40 :
                // InternalQueryLexer.g:1:604: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 41 :
                // InternalQueryLexer.g:1:612: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA29_eotS =
        "\1\uffff\2\54\2\uffff\22\54\1\uffff\1\116\1\51\1\120\7\uffff\1\54\1\51\1\uffff\3\51\2\uffff\2\54\1\uffff\2\54\2\uffff\3\54\1\145\4\54\2\152\1\54\1\145\1\156\1\157\1\156\1\157\6\54\2\167\2\54\23\uffff\3\54\1\175\1\176\1\177\1\u0080\1\uffff\2\54\2\u0083\1\uffff\1\177\1\u0080\1\54\2\uffff\7\54\1\uffff\3\54\1\176\1\u008f\4\uffff\2\54\1\uffff\3\54\1\u0095\1\54\1\u0095\2\54\2\u0099\1\54\1\uffff\2\54\2\u009d\1\54\1\uffff\1\54\2\u00a0\1\uffff\1\u00a1\2\u00a2\1\uffff\2\54\3\uffff\2\54\2\u00a7\1\uffff";
    static final String DFA29_eofS =
        "\u00a8\uffff";
    static final String DFA29_minS =
        "\1\0\2\60\2\uffff\22\60\1\uffff\3\72\7\uffff\1\60\1\101\1\uffff\2\0\1\52\2\uffff\2\60\1\uffff\2\60\2\uffff\32\60\23\uffff\7\60\1\uffff\4\60\1\uffff\3\60\2\uffff\7\60\1\uffff\5\60\4\uffff\2\60\1\uffff\13\60\1\uffff\5\60\1\uffff\3\60\1\uffff\3\60\1\uffff\2\60\3\uffff\4\60\1\uffff";
    static final String DFA29_maxS =
        "\1\uffff\2\172\2\uffff\22\172\1\uffff\1\76\2\72\7\uffff\2\172\1\uffff\2\uffff\1\57\2\uffff\2\172\1\uffff\2\172\2\uffff\32\172\23\uffff\7\172\1\uffff\4\172\1\uffff\3\172\2\uffff\7\172\1\uffff\5\172\4\uffff\2\172\1\uffff\13\172\1\uffff\5\172\1\uffff\3\172\1\uffff\3\172\1\uffff\2\172\3\uffff\4\172\1\uffff";
    static final String DFA29_acceptS =
        "\3\uffff\1\3\1\4\22\uffff\1\25\3\uffff\1\33\1\34\1\35\1\36\1\37\1\40\1\41\2\uffff\1\44\3\uffff\1\50\1\51\2\uffff\1\42\2\uffff\1\3\1\4\32\uffff\1\25\1\26\1\32\1\27\1\31\1\30\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\43\1\44\1\45\1\46\1\47\1\50\7\uffff\1\14\4\uffff\1\11\3\uffff\1\13\1\21\7\uffff\1\17\5\uffff\1\5\1\6\1\12\1\23\2\uffff\1\10\13\uffff\1\2\5\uffff\1\24\3\uffff\1\20\3\uffff\1\22\2\uffff\1\16\1\1\1\7\4\uffff\1\15";
    static final String DFA29_specialS =
        "\1\2\44\uffff\1\1\1\0\u0081\uffff}>";
    static final String[] DFA29_transitionS = {
            "\11\51\2\50\2\51\1\50\22\51\1\50\1\31\1\45\4\51\1\46\1\34\1\35\1\4\1\51\1\33\1\51\1\36\1\47\12\44\1\41\1\3\1\30\1\27\1\32\2\51\1\5\1\23\1\42\1\17\1\6\1\2\2\42\1\12\1\25\3\42\1\10\1\15\3\42\1\1\3\42\1\21\3\42\3\51\1\43\1\42\1\51\1\14\1\24\1\42\1\20\1\7\1\2\2\42\1\13\1\26\3\42\1\11\1\16\3\42\1\1\3\42\1\22\3\42\1\37\1\51\1\40\uff82\51",
            "\12\55\7\uffff\4\55\1\52\11\55\1\53\13\55\4\uffff\1\55\1\uffff\4\55\1\52\11\55\1\53\13\55",
            "\12\55\7\uffff\21\55\1\56\10\55\4\uffff\1\55\1\uffff\21\55\1\56\10\55",
            "",
            "",
            "\12\55\7\uffff\13\55\1\61\1\55\1\62\4\55\1\64\7\55\4\uffff\1\55\1\uffff\13\55\1\61\1\55\1\63\14\55",
            "\12\55\7\uffff\27\55\1\65\2\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\27\55\1\66\2\55",
            "\12\55\7\uffff\16\55\1\67\13\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\70\13\55",
            "\12\55\7\uffff\15\55\1\71\14\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\72\14\55",
            "\12\55\7\uffff\13\55\1\61\1\55\1\63\14\55\4\uffff\1\55\1\uffff\13\55\1\61\1\55\1\73\4\55\1\74\7\55",
            "\12\55\7\uffff\15\55\1\76\3\55\1\75\10\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\100\3\55\1\77\10\55",
            "\12\55\7\uffff\4\55\1\102\3\55\1\101\21\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\104\3\55\1\103\21\55",
            "\12\55\7\uffff\7\55\1\105\22\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\7\55\1\106\22\55",
            "\12\55\7\uffff\30\55\1\107\1\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\30\55\1\110\1\55",
            "\12\55\7\uffff\16\55\1\111\13\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\112\13\55",
            "",
            "\1\115\3\uffff\1\114",
            "\1\114",
            "\1\117",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\32\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\0\132",
            "\0\132",
            "\1\133\4\uffff\1\134",
            "",
            "",
            "\12\55\7\uffff\13\55\1\136\16\55\4\uffff\1\55\1\uffff\13\55\1\136\16\55",
            "\12\55\7\uffff\14\55\1\137\15\55\4\uffff\1\55\1\uffff\14\55\1\137\15\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\16\55\1\140\13\55\4\uffff\1\55\1\uffff\16\55\1\140\13\55",
            "",
            "",
            "\12\55\7\uffff\13\55\1\141\16\55\4\uffff\1\55\1\uffff\13\55\1\141\16\55",
            "\12\55\7\uffff\3\55\1\143\24\55\1\142\1\55\4\uffff\1\55\1\uffff\30\55\1\142\1\55",
            "\12\55\7\uffff\30\55\1\142\1\55\4\uffff\1\55\1\uffff\30\55\1\142\1\55",
            "\12\55\7\uffff\2\55\1\144\27\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\10\55\1\146\21\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\147\21\55",
            "\12\55\7\uffff\23\55\1\150\6\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\151\6\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\30\55\1\142\1\55\4\uffff\1\55\1\uffff\3\55\1\153\24\55\1\142\1\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\154\27\55",
            "\12\55\7\uffff\3\55\1\155\26\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\3\55\1\160\26\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\22\55\1\161\7\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\22\55\1\162\7\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\163\7\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\164\7\55",
            "\12\55\7\uffff\4\55\1\165\25\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\166\25\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\10\55\1\170\21\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\171\21\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\55\7\uffff\4\55\1\172\25\55\4\uffff\1\55\1\uffff\4\55\1\172\25\55",
            "\12\55\7\uffff\4\55\1\173\25\55\4\uffff\1\55\1\uffff\4\55\1\173\25\55",
            "\12\55\7\uffff\14\55\1\174\15\55\4\uffff\1\55\1\uffff\14\55\1\174\15\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\22\55\1\u0081\7\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u0082\7\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\4\55\1\u0084\25\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0085\25\55",
            "\12\55\7\uffff\23\55\1\u0086\6\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\2\55\1\u0087\27\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u0088\6\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\u0089\27\55",
            "\12\55\7\uffff\21\55\1\u008a\10\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u008b\10\55",
            "",
            "\12\55\7\uffff\15\55\1\u008c\14\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u008d\14\55",
            "\12\55\7\uffff\2\55\1\u008e\27\55\4\uffff\1\55\1\uffff\2\55\1\u008e\27\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "\12\55\7\uffff\23\55\1\u0090\6\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u0091\6\55",
            "",
            "\12\55\7\uffff\21\55\1\u0092\10\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u0093\10\55",
            "\12\55\7\uffff\10\55\1\u0094\21\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\u0096\21\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\4\55\1\u0097\25\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0098\25\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\23\55\1\u009a\6\55\4\uffff\1\55\1\uffff\23\55\1\u009a\6\55",
            "",
            "\12\55\7\uffff\22\55\1\u009b\7\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u009c\7\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\15\55\1\u009e\14\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u009f\14\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\2\55\1\u00a3\27\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\u00a4\27\55",
            "",
            "",
            "",
            "\12\55\7\uffff\23\55\1\u00a5\6\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u00a6\6\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Select | From | Semicolon | RULE_ALL_CHARACTERISTICS | RULE_KW_ALL | RULE_KW_SOME | RULE_KW_EXISTS | RULE_KW_NOT | RULE_KW_IN | RULE_KW_AND | RULE_KW_OR | RULE_KW_AS | RULE_KW_DISTINCT | RULE_KW_WHERE | RULE_KW_BY | RULE_KW_JOIN | RULE_KW_ON | RULE_KW_ORDER | RULE_KW_ASC | RULE_KW_DESC | RULE_EQUALS_OPERATOR | RULE_NOT_EQUALS_OPERATOR | RULE_LESS_THAN_OPERATOR | RULE_GREATER_THAN_OPERATOR | RULE_GREATER_THAN_OR_EQUALS_OPERATOR | RULE_LESS_THAN_OR_EQUALS_OPERATOR | RULE_COMMA | RULE_LEFT_PAREN | RULE_RIGHT_PAREN | RULE_PERIOD | RULE_LEFT_BRACE | RULE_RIGHT_BRACE | RULE_COLON | RULE_IDENTIFIER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_38 = input.LA(1);

                        s = -1;
                        if ( ((LA29_38>='\u0000' && LA29_38<='\uFFFF')) ) {s = 90;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_37 = input.LA(1);

                        s = -1;
                        if ( ((LA29_37>='\u0000' && LA29_37<='\uFFFF')) ) {s = 90;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_0 = input.LA(1);

                        s = -1;
                        if ( (LA29_0=='S'||LA29_0=='s') ) {s = 1;}

                        else if ( (LA29_0=='F'||LA29_0=='f') ) {s = 2;}

                        else if ( (LA29_0==';') ) {s = 3;}

                        else if ( (LA29_0=='*') ) {s = 4;}

                        else if ( (LA29_0=='A') ) {s = 5;}

                        else if ( (LA29_0=='E') ) {s = 6;}

                        else if ( (LA29_0=='e') ) {s = 7;}

                        else if ( (LA29_0=='N') ) {s = 8;}

                        else if ( (LA29_0=='n') ) {s = 9;}

                        else if ( (LA29_0=='I') ) {s = 10;}

                        else if ( (LA29_0=='i') ) {s = 11;}

                        else if ( (LA29_0=='a') ) {s = 12;}

                        else if ( (LA29_0=='O') ) {s = 13;}

                        else if ( (LA29_0=='o') ) {s = 14;}

                        else if ( (LA29_0=='D') ) {s = 15;}

                        else if ( (LA29_0=='d') ) {s = 16;}

                        else if ( (LA29_0=='W') ) {s = 17;}

                        else if ( (LA29_0=='w') ) {s = 18;}

                        else if ( (LA29_0=='B') ) {s = 19;}

                        else if ( (LA29_0=='b') ) {s = 20;}

                        else if ( (LA29_0=='J') ) {s = 21;}

                        else if ( (LA29_0=='j') ) {s = 22;}

                        else if ( (LA29_0=='=') ) {s = 23;}

                        else if ( (LA29_0=='<') ) {s = 24;}

                        else if ( (LA29_0=='!') ) {s = 25;}

                        else if ( (LA29_0=='>') ) {s = 26;}

                        else if ( (LA29_0==',') ) {s = 27;}

                        else if ( (LA29_0=='(') ) {s = 28;}

                        else if ( (LA29_0==')') ) {s = 29;}

                        else if ( (LA29_0=='.') ) {s = 30;}

                        else if ( (LA29_0=='{') ) {s = 31;}

                        else if ( (LA29_0=='}') ) {s = 32;}

                        else if ( (LA29_0==':') ) {s = 33;}

                        else if ( (LA29_0=='C'||(LA29_0>='G' && LA29_0<='H')||(LA29_0>='K' && LA29_0<='M')||(LA29_0>='P' && LA29_0<='R')||(LA29_0>='T' && LA29_0<='V')||(LA29_0>='X' && LA29_0<='Z')||LA29_0=='_'||LA29_0=='c'||(LA29_0>='g' && LA29_0<='h')||(LA29_0>='k' && LA29_0<='m')||(LA29_0>='p' && LA29_0<='r')||(LA29_0>='t' && LA29_0<='v')||(LA29_0>='x' && LA29_0<='z')) ) {s = 34;}

                        else if ( (LA29_0=='^') ) {s = 35;}

                        else if ( ((LA29_0>='0' && LA29_0<='9')) ) {s = 36;}

                        else if ( (LA29_0=='\"') ) {s = 37;}

                        else if ( (LA29_0=='\'') ) {s = 38;}

                        else if ( (LA29_0=='/') ) {s = 39;}

                        else if ( ((LA29_0>='\t' && LA29_0<='\n')||LA29_0=='\r'||LA29_0==' ') ) {s = 40;}

                        else if ( ((LA29_0>='\u0000' && LA29_0<='\b')||(LA29_0>='\u000B' && LA29_0<='\f')||(LA29_0>='\u000E' && LA29_0<='\u001F')||(LA29_0>='#' && LA29_0<='&')||LA29_0=='+'||LA29_0=='-'||(LA29_0>='?' && LA29_0<='@')||(LA29_0>='[' && LA29_0<=']')||LA29_0=='`'||LA29_0=='|'||(LA29_0>='~' && LA29_0<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}