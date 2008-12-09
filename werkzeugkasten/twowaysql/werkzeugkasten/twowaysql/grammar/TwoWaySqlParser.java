// $ANTLR 3.1.1 C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g 2008-12-10 03:13:04

package werkzeugkasten.twowaysql.grammar;

import werkzeugkasten.twowaysql.error.*;
import werkzeugkasten.twowaysql.tree.*;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class TwoWaySqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "QUOTED", "SYMBOLS", "SYM_BIND", "SYM_C", "SYM_LP", "SYM_RP", "C_ST", "C_ED", "C_LN_ST", "C_LN_ED", "IF", "MAYBE_SKIP", "ELSEIF", "ELSE", "BEGIN", "END", "IN", "SYM_Q", "LN_R", "LN_N", "AND", "OR", "CHAR", "WS", "LT", "WHITE_SPACES"
    };
    public static final int LT=29;
    public static final int C_ST=11;
    public static final int QUOTED=5;
    public static final int SYM_RP=10;
    public static final int ELSE=18;
    public static final int SYM_LP=9;
    public static final int CHAR=27;
    public static final int C_LN_ST=13;
    public static final int AND=25;
    public static final int EOF=-1;
    public static final int C_ED=12;
    public static final int IF=15;
    public static final int WHITE_SPACES=30;
    public static final int ELSEIF=17;
    public static final int WS=28;
    public static final int SYM_Q=22;
    public static final int IN=21;
    public static final int BEGIN=19;
    public static final int OR=26;
    public static final int IDENT=4;
    public static final int MAYBE_SKIP=16;
    public static final int SYMBOLS=6;
    public static final int SYM_C=8;
    public static final int END=20;
    public static final int SYM_BIND=7;
    public static final int C_LN_ED=14;
    public static final int LN_N=24;
    public static final int LN_R=23;

    // delegates
    // delegators


        public TwoWaySqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TwoWaySqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return TwoWaySqlParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g"; }


    protected ProblemCoordinator coordinator = new ProblemCoordinator();
    public void setProblemCoordinator(ProblemCoordinator pc) {
    	this.coordinator = pc;
    }
    public ProblemCoordinator getProblemCoordinator() {
    	return this.coordinator;
    }
    public void push(ExceptionMapper em) {
    	this.coordinator.push(em);
    }
    public void pop() {
    	this.coordinator.pop();
    }

    public void reportErrorDbg(RecognitionException ex) {
    	this.coordinator.report(ex);
    	ex.printStackTrace();
    	super.reportError(ex);
    }
    public void reportError(RecognitionException ex) {
    	if ( state.errorRecovery ) {
    		return;
    	}
    	state.syntaxErrors++;
    	state.errorRecovery = true;
    	this.coordinator.report(ex);
    }

    protected static final ExceptionMapper EM_TXT = new TxtExceptionMapper();
    protected static final ExceptionMapper EM_EXPRESSION = new ExpressionExceptionMapper();
    protected static final ExceptionMapper EM_BLOCKCOMMENT = new BlockCommentExceptionMapper();
    protected static final ExceptionMapper EM_LINECOMMENT = new LineCommentExceptionMapper();
    protected static final ExceptionMapper EM_BEGINCOMMENT = new BeginCommentExceptionMapper();
    protected static final ExceptionMapper EM_ELSEIFNODE = new ElseIfNodeExceptionMapper();
    protected static final ExceptionMapper EM_ELSEIFBLOCKCOMMENT = new ElseIfBlockCommentExceptionMapper();
    protected static final ExceptionMapper EM_ELSEIFLINECOMMENT = new ElseIfLineCommentExceptionMapper();
    protected static final ExceptionMapper EM_ELSENODE = new ElseNodeExceptionMapper();
    protected static final ExceptionMapper EM_ELSECOMMENT = new ElseCommentExceptionMapper();
    protected static final ExceptionMapper EM_ENDCOMMENT = new EndCommentExceptionMapper();
    protected static final ExceptionMapper EM_BINDCOMMENT = new BindCommentExceptionMapper();
    protected static final ExceptionMapper EM_INBIND = new InBindExceptionMapper();
    protected static final ExceptionMapper EM_INBINDSKIPPED = new InBindSkippedExceptionMapper();



    public static class twowaySQL_return extends ParserRuleReturnScope {
        public TwoWayQuery query;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "twowaySQL"
    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:78:1: twowaySQL returns [TwoWayQuery query] : nodelist EOF ;
    public final TwoWaySqlParser.twowaySQL_return twowaySQL() throws RecognitionException {
        TwoWaySqlParser.twowaySQL_return retval = new TwoWaySqlParser.twowaySQL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF2=null;
        TwoWaySqlParser.nodelist_return nodelist1 = null;


        CommonTree EOF2_tree=null;


        		retval.query = new TwoWayQuery();
        	
        try {
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:86:2: ( nodelist EOF )
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:86:4: nodelist EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_nodelist_in_twowaySQL98);
            nodelist1=nodelist();

            state._fsp--;

            adaptor.addChild(root_0, nodelist1.getTree());
            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_twowaySQL100); 
            EOF2_tree = (CommonTree)adaptor.create(EOF2);
            adaptor.addChild(root_0, EOF2_tree);


            		retval.query.setChildren((nodelist1!=null?nodelist1.list:null));
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            		retval.query.update(retval);
            		retval.query.freeze();
            	
        }

        catch (RecognitionException ex) {
        	reportErrorDbg(ex);
        	recover(input,ex);
        	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), ex);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "twowaySQL"

    public static class nodelist_return extends ParserRuleReturnScope {
        public ArrayList<QueryNode> list;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nodelist"
    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:91:1: nodelist returns [ArrayList<QueryNode> list] : ( comment | inbind | txt )+ ;
    public final TwoWaySqlParser.nodelist_return nodelist() throws RecognitionException {
        TwoWaySqlParser.nodelist_return retval = new TwoWaySqlParser.nodelist_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        TwoWaySqlParser.comment_return comment3 = null;

        TwoWaySqlParser.inbind_return inbind4 = null;

        TwoWaySqlParser.txt_return txt5 = null;




        		retval.list = new ArrayList<QueryNode>();
        	
        try {
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:96:2: ( ( comment | inbind | txt )+ )
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:97:2: ( comment | inbind | txt )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:97:2: ( comment | inbind | txt )+
            int cnt1=0;
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case C_ST:
                    {
                    int LA1_2 = input.LA(2);

                    if ( ((LA1_2>=IDENT && LA1_2<=SYM_RP)||LA1_2==IF||LA1_2==BEGIN) ) {
                        alt1=1;
                    }


                    }
                    break;
                case C_LN_ST:
                    {
                    int LA1_3 = input.LA(2);

                    if ( ((LA1_3>=IDENT && LA1_3<=SYM_RP)||LA1_3==BEGIN) ) {
                        alt1=1;
                    }


                    }
                    break;
                case IN:
                    {
                    alt1=2;
                    }
                    break;
                case IDENT:
                case QUOTED:
                case SYMBOLS:
                case SYM_BIND:
                case SYM_C:
                case SYM_LP:
                case SYM_RP:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:97:3: comment
            	    {
            	    pushFollow(FOLLOW_comment_in_nodelist125);
            	    comment3=comment();

            	    state._fsp--;

            	    adaptor.addChild(root_0, comment3.getTree());
            	    retval.list.add((comment3!=null?comment3.node:null));

            	    }
            	    break;
            	case 2 :
            	    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:98:4: inbind
            	    {
            	    pushFollow(FOLLOW_inbind_in_nodelist132);
            	    inbind4=inbind();

            	    state._fsp--;

            	    adaptor.addChild(root_0, inbind4.getTree());
            	    retval.list.add((inbind4!=null?inbind4.node:null));

            	    }
            	    break;
            	case 3 :
            	    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:99:4: txt
            	    {
            	    pushFollow(FOLLOW_txt_in_nodelist139);
            	    txt5=txt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, txt5.getTree());
            	    retval.list.add((txt5!=null?txt5.node:null));

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException ex) {

            		reportError(ex);
            		recover(input,ex);
            		retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), ex);
            	
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nodelist"

    public static class charactors_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "charactors"
    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:109:1: charactors : ( IDENT | QUOTED | SYMBOLS | SYM_BIND | SYM_C | SYM_LP | SYM_RP )+ ;
    public final TwoWaySqlParser.charactors_return charactors() throws RecognitionException {
        TwoWaySqlParser.charactors_return retval = new TwoWaySqlParser.charactors_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set6=null;

        CommonTree set6_tree=null;

        try {
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:111:2: ( ( IDENT | QUOTED | SYMBOLS | SYM_BIND | SYM_C | SYM_LP | SYM_RP )+ )
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:112:2: ( IDENT | QUOTED | SYMBOLS | SYM_BIND | SYM_C | SYM_LP | SYM_RP )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:112:2: ( IDENT | QUOTED | SYMBOLS | SYM_BIND | SYM_C | SYM_LP | SYM_RP )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=IDENT && LA2_0<=SYM_RP)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:
            	    {
            	    set6=(Token)input.LT(1);
            	    if ( (input.LA(1)>=IDENT && input.LA(1)<=SYM_RP) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (CommonTree)adaptor.create(set6));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException ex) {

            		reportError(ex);
            		recover(input,ex);
            		retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), ex);
            	
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "charactors"

    public static class txt_return extends ParserRuleReturnScope {
        public TxtNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "txt"
    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:120:1: txt returns [TxtNode node] : charactors ;
    public final TwoWaySqlParser.txt_return txt() throws RecognitionException {
        TwoWaySqlParser.txt_return retval = new TwoWaySqlParser.txt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        TwoWaySqlParser.charactors_return charactors7 = null;




        		push(EM_TXT);
        		retval.node = new TxtNode();
        	
        try {
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:129:2: ( charactors )
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:130:2: charactors
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_charactors_in_txt229);
            charactors7=charactors();

            state._fsp--;

            adaptor.addChild(root_0, charactors7.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            		retval.node.update(retval);
            		retval.node.freeze();
            	
        }

        catch (RecognitionException ex) {
        	reportErrorDbg(ex);
        	recover(input,ex);
        	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), ex);
        }
        finally {
             pop(); 
        }
        return retval;
    }
    // $ANTLR end "txt"

    public static class comment_return extends ParserRuleReturnScope {
        public QueryNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comment"
    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:136:1: comment returns [QueryNode node] : ( begincomment | ifcomment | bindcomment | blockcomment | linecomment );
    public final TwoWaySqlParser.comment_return comment() throws RecognitionException {
        TwoWaySqlParser.comment_return retval = new TwoWaySqlParser.comment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        TwoWaySqlParser.begincomment_return begincomment8 = null;

        TwoWaySqlParser.ifcomment_return ifcomment9 = null;

        TwoWaySqlParser.bindcomment_return bindcomment10 = null;

        TwoWaySqlParser.blockcomment_return blockcomment11 = null;

        TwoWaySqlParser.linecomment_return linecomment12 = null;



        try {
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:136:32: ( begincomment | ifcomment | bindcomment | blockcomment | linecomment )
            int alt3=5;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:137:2: begincomment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_begincomment_in_comment249);
                    begincomment8=begincomment();

                    state._fsp--;

                    adaptor.addChild(root_0, begincomment8.getTree());
                    retval.node = (begincomment8!=null?begincomment8.node:null);

                    }
                    break;
                case 2 :
                    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:138:4: ifcomment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ifcomment_in_comment256);
                    ifcomment9=ifcomment();

                    state._fsp--;

                    adaptor.addChild(root_0, ifcomment9.getTree());
                    retval.node = (ifcomment9!=null?ifcomment9.node:null);

                    }
                    break;
                case 3 :
                    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:139:4: bindcomment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_bindcomment_in_comment263);
                    bindcomment10=bindcomment();

                    state._fsp--;

                    adaptor.addChild(root_0, bindcomment10.getTree());
                    retval.node = (bindcomment10!=null?bindcomment10.node:null);

                    }
                    break;
                case 4 :
                    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:140:4: blockcomment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_blockcomment_in_comment270);
                    blockcomment11=blockcomment();

                    state._fsp--;

                    adaptor.addChild(root_0, blockcomment11.getTree());
                    retval.node = (blockcomment11!=null?blockcomment11.node:null);

                    }
                    break;
                case 5 :
                    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:141:4: linecomment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_linecomment_in_comment277);
                    linecomment12=linecomment();

                    state._fsp--;

                    adaptor.addChild(root_0, linecomment12.getTree());
                    retval.node = (linecomment12!=null?linecomment12.node:null);

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException ex) {
        	reportErrorDbg(ex);
        	recover(input,ex);
        	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), ex);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comment"

    public static class blockcomment_return extends ParserRuleReturnScope {
        public TxtNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockcomment"
    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:144:1: blockcomment returns [TxtNode node] : C_ST charactors C_ED ;
    public final TwoWaySqlParser.blockcomment_return blockcomment() throws RecognitionException {
        TwoWaySqlParser.blockcomment_return retval = new TwoWaySqlParser.blockcomment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token C_ST13=null;
        Token C_ED15=null;
        TwoWaySqlParser.charactors_return charactors14 = null;


        CommonTree C_ST13_tree=null;
        CommonTree C_ED15_tree=null;


        		push(EM_BLOCKCOMMENT);
        		retval.node = new TxtNode();
        	
        try {
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:153:2: ( C_ST charactors C_ED )
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:154:2: C_ST charactors C_ED
            {
            root_0 = (CommonTree)adaptor.nil();

            C_ST13=(Token)match(input,C_ST,FOLLOW_C_ST_in_blockcomment306); 
            C_ST13_tree = (CommonTree)adaptor.create(C_ST13);
            adaptor.addChild(root_0, C_ST13_tree);

            pushFollow(FOLLOW_charactors_in_blockcomment308);
            charactors14=charactors();

            state._fsp--;

            adaptor.addChild(root_0, charactors14.getTree());
            C_ED15=(Token)match(input,C_ED,FOLLOW_C_ED_in_blockcomment310); 
            C_ED15_tree = (CommonTree)adaptor.create(C_ED15);
            adaptor.addChild(root_0, C_ED15_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            		retval.node.update(retval);
            		retval.node.freeze();
            	
        }

        catch (RecognitionException ex) {
        	reportErrorDbg(ex);
        	recover(input,ex);
        	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), ex);
        }
        finally {
             pop(); 
        }
        return retval;
    }
    // $ANTLR end "blockcomment"

    public static class linecomment_return extends ParserRuleReturnScope {
        public TxtNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "linecomment"
    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:158:1: linecomment returns [TxtNode node] : C_LN_ST charactors C_LN_ED ;
    public final TwoWaySqlParser.linecomment_return linecomment() throws RecognitionException {
        TwoWaySqlParser.linecomment_return retval = new TwoWaySqlParser.linecomment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token C_LN_ST16=null;
        Token C_LN_ED18=null;
        TwoWaySqlParser.charactors_return charactors17 = null;


        CommonTree C_LN_ST16_tree=null;
        CommonTree C_LN_ED18_tree=null;


        		push(EM_LINECOMMENT);
        		retval.node = new TxtNode();
        	
        try {
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:167:2: ( C_LN_ST charactors C_LN_ED )
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:168:2: C_LN_ST charactors C_LN_ED
            {
            root_0 = (CommonTree)adaptor.nil();

            C_LN_ST16=(Token)match(input,C_LN_ST,FOLLOW_C_LN_ST_in_linecomment342); 
            C_LN_ST16_tree = (CommonTree)adaptor.create(C_LN_ST16);
            adaptor.addChild(root_0, C_LN_ST16_tree);

            pushFollow(FOLLOW_charactors_in_linecomment344);
            charactors17=charactors();

            state._fsp--;

            adaptor.addChild(root_0, charactors17.getTree());
            C_LN_ED18=(Token)match(input,C_LN_ED,FOLLOW_C_LN_ED_in_linecomment346); 
            C_LN_ED18_tree = (CommonTree)adaptor.create(C_LN_ED18);
            adaptor.addChild(root_0, C_LN_ED18_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            		retval.node.update(retval);
            		retval.node.freeze();
            	
        }

        catch (RecognitionException ex) {
        	reportErrorDbg(ex);
        	recover(input,ex);
        	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), ex);
        }
        finally {
             pop(); 
        }
        return retval;
    }
    // $ANTLR end "linecomment"

    public static class ifcomment_return extends ParserRuleReturnScope {
        public IfNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifcomment"
    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:172:1: ifcomment returns [IfNode node] : ( C_ST IF expression C_ED ( MAYBE_SKIP )? nodelist ( elseifnode )* ( elsenode )? endcomment ) ;
    public final TwoWaySqlParser.ifcomment_return ifcomment() throws RecognitionException {
        TwoWaySqlParser.ifcomment_return retval = new TwoWaySqlParser.ifcomment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token C_ST19=null;
        Token IF20=null;
        Token C_ED22=null;
        Token MAYBE_SKIP23=null;
        TwoWaySqlParser.expression_return expression21 = null;

        TwoWaySqlParser.nodelist_return nodelist24 = null;

        TwoWaySqlParser.elseifnode_return elseifnode25 = null;

        TwoWaySqlParser.elsenode_return elsenode26 = null;

        TwoWaySqlParser.endcomment_return endcomment27 = null;


        CommonTree C_ST19_tree=null;
        CommonTree IF20_tree=null;
        CommonTree C_ED22_tree=null;
        CommonTree MAYBE_SKIP23_tree=null;


        		retval.node = new IfNode();
        	
        try {
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:180:2: ( ( C_ST IF expression C_ED ( MAYBE_SKIP )? nodelist ( elseifnode )* ( elsenode )? endcomment ) )
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:181:2: ( C_ST IF expression C_ED ( MAYBE_SKIP )? nodelist ( elseifnode )* ( elsenode )? endcomment )
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:181:2: ( C_ST IF expression C_ED ( MAYBE_SKIP )? nodelist ( elseifnode )* ( elsenode )? endcomment )
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:181:3: C_ST IF expression C_ED ( MAYBE_SKIP )? nodelist ( elseifnode )* ( elsenode )? endcomment
            {
            C_ST19=(Token)match(input,C_ST,FOLLOW_C_ST_in_ifcomment379); 
            C_ST19_tree = (CommonTree)adaptor.create(C_ST19);
            adaptor.addChild(root_0, C_ST19_tree);

            IF20=(Token)match(input,IF,FOLLOW_IF_in_ifcomment381); 
            IF20_tree = (CommonTree)adaptor.create(IF20);
            adaptor.addChild(root_0, IF20_tree);

            pushFollow(FOLLOW_expression_in_ifcomment383);
            expression21=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression21.getTree());
            C_ED22=(Token)match(input,C_ED,FOLLOW_C_ED_in_ifcomment385); 
            C_ED22_tree = (CommonTree)adaptor.create(C_ED22);
            adaptor.addChild(root_0, C_ED22_tree);

             retval.node.setExpression((expression21!=null?expression21.node:null)); 
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:182:3: ( MAYBE_SKIP )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==MAYBE_SKIP) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:182:4: MAYBE_SKIP
                    {
                    MAYBE_SKIP23=(Token)match(input,MAYBE_SKIP,FOLLOW_MAYBE_SKIP_in_ifcomment392); 
                    MAYBE_SKIP23_tree = (CommonTree)adaptor.create(MAYBE_SKIP23);
                    adaptor.addChild(root_0, MAYBE_SKIP23_tree);

                    retval.node.setMaybeSkip(MAYBE_SKIP23.getText());

                    }
                    break;

            }

            pushFollow(FOLLOW_nodelist_in_ifcomment401);
            nodelist24=nodelist();

            state._fsp--;

            adaptor.addChild(root_0, nodelist24.getTree());
             retval.node.setChildren((nodelist24!=null?nodelist24.list:null));
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:184:3: ( elseifnode )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==C_ST) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==ELSEIF) ) {
                        alt5=1;
                    }


                }
                else if ( (LA5_0==C_LN_ST) ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==ELSEIF) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:184:4: elseifnode
            	    {
            	    pushFollow(FOLLOW_elseifnode_in_ifcomment408);
            	    elseifnode25=elseifnode();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseifnode25.getTree());
            	     retval.node.addElseIf((elseifnode25!=null?elseifnode25.node:null)); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:185:3: ( elsenode )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==C_ST) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==ELSE) ) {
                    alt6=1;
                }
            }
            else if ( (LA6_0==C_LN_ST) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==ELSE) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:185:4: elsenode
                    {
                    pushFollow(FOLLOW_elsenode_in_ifcomment418);
                    elsenode26=elsenode();

                    state._fsp--;

                    adaptor.addChild(root_0, elsenode26.getTree());
                     retval.node.setElse((elsenode26!=null?elsenode26.list:null)); 

                    }
                    break;

            }

            pushFollow(FOLLOW_endcomment_in_ifcomment426);
            endcomment27=endcomment();

            state._fsp--;

            adaptor.addChild(root_0, endcomment27.getTree());

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            		retval.node.update(retval);
            		retval.node.freeze();
            	
        }

        catch (RecognitionException ex) {
        	reportErrorDbg(ex);
        	recover(input,ex);
        	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), ex);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ifcomment"

    public static class elseifnode_return extends ParserRuleReturnScope {
        public IfNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseifnode"
    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:190:1: elseifnode returns [IfNode node] : elseifcomment nodelist ;
    public final TwoWaySqlParser.elseifnode_return elseifnode() throws RecognitionException {
        TwoWaySqlParser.elseifnode_return retval = new TwoWaySqlParser.elseifnode_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        TwoWaySqlParser.elseifcomment_return elseifcomment28 = null;

        TwoWaySqlParser.nodelist_return nodelist29 = null;




        		push(EM_ELSEIFNODE);
        		retval.node = new IfNode();
        	
        try {
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:199:2: ( elseifcomment nodelist )
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:200:2: elseifcomment nodelist
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_elseifcomment_in_elseifnode457);
            elseifcomment28=elseifcomment();

            state._fsp--;

            adaptor.addChild(root_0, elseifcomment28.getTree());
            pushFollow(FOLLOW_nodelist_in_elseifnode459);
            nodelist29=nodelist();

            state._fsp--;

            adaptor.addChild(root_0, nodelist29.getTree());

            		retval.node.setExpression((elseifcomment28!=null?elseifcomment28.node:null));
            		retval.node.setChildren((nodelist29!=null?nodelist29.list:null));
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            		retval.node.update(retval);
            		retval.node.freeze();
            	
        }

        catch (RecognitionException ex) {
        	reportErrorDbg(ex);
        	recover(input,ex);
        	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), ex);
        }
        finally {
             pop(); 
        }
        return retval;
    }
    // $ANTLR end "elseifnode"

    public static class elseifcomment_return extends ParserRuleReturnScope {
        public ExpressionNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseifcomment"
    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:208:1: elseifcomment returns [ExpressionNode node] : ( elseifblockcomment | elseiflinecomment ) ;
    public final TwoWaySqlParser.elseifcomment_return elseifcomment() throws RecognitionException {
        TwoWaySqlParser.elseifcomment_return retval = new TwoWaySqlParser.elseifcomment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        TwoWaySqlParser.elseifblockcomment_return elseifblockcomment30 = null;

        TwoWaySqlParser.elseiflinecomment_return elseiflinecomment31 = null;



        try {
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:210:2: ( ( elseifblockcomment | elseiflinecomment ) )
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:211:2: ( elseifblockcomment | elseiflinecomment )
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:211:2: ( elseifblockcomment | elseiflinecomment )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==C_ST) ) {
                alt7=1;
            }
            else if ( (LA7_0==C_LN_ST) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:211:3: elseifblockcomment
                    {
                    pushFollow(FOLLOW_elseifblockcomment_in_elseifcomment486);
                    elseifblockcomment30=elseifblockcomment();

                    state._fsp--;

                    adaptor.addChild(root_0, elseifblockcomment30.getTree());
                    retval.node = (elseifblockcomment30!=null?elseifblockcomment30.node:null);

                    }
                    break;
                case 2 :
                    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:212:5: elseiflinecomment
                    {
                    pushFollow(FOLLOW_elseiflinecomment_in_elseifcomment494);
                    elseiflinecomment31=elseiflinecomment();

                    state._fsp--;

                    adaptor.addChild(root_0, elseiflinecomment31.getTree());
                    retval.node = (elseiflinecomment31!=null?elseiflinecomment31.node:null);

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException ex) {
        	reportErrorDbg(ex);
        	recover(input,ex);
        	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), ex);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "elseifcomment"

    public static class elseifblockcomment_return extends ParserRuleReturnScope {
        public ExpressionNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseifblockcomment"
    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:216:1: elseifblockcomment returns [ExpressionNode node] : C_ST ELSEIF expression C_ED ;
    public final TwoWaySqlParser.elseifblockcomment_return elseifblockcomment() throws RecognitionException {
        TwoWaySqlParser.elseifblockcomment_return retval = new TwoWaySqlParser.elseifblockcomment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token C_ST32=null;
        Token ELSEIF33=null;
        Token C_ED35=null;
        TwoWaySqlParser.expression_return expression34 = null;


        CommonTree C_ST32_tree=null;
        CommonTree ELSEIF33_tree=null;
        CommonTree C_ED35_tree=null;


        		push(EM_ELSEIFBLOCKCOMMENT);
        	
        try {
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:220:2: ( C_ST ELSEIF expression C_ED )
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:220:4: C_ST ELSEIF expression C_ED
            {
            root_0 = (CommonTree)adaptor.nil();

            C_ST32=(Token)match(input,C_ST,FOLLOW_C_ST_in_elseifblockcomment519); 
            C_ST32_tree = (CommonTree)adaptor.create(C_ST32);
            adaptor.addChild(root_0, C_ST32_tree);

            ELSEIF33=(Token)match(input,ELSEIF,FOLLOW_ELSEIF_in_elseifblockcomment521); 
            ELSEIF33_tree = (CommonTree)adaptor.create(ELSEIF33);
            adaptor.addChild(root_0, ELSEIF33_tree);

            pushFollow(FOLLOW_expression_in_elseifblockcomment523);
            expression34=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression34.getTree());
            C_ED35=(Token)match(input,C_ED,FOLLOW_C_ED_in_elseifblockcomment525); 
            C_ED35_tree = (CommonTree)adaptor.create(C_ED35);
            adaptor.addChild(root_0, C_ED35_tree);

             retval.node = (expression34!=null?expression34.node:null); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException ex) {

            		reportError(ex);
            		recover(input,ex);
            		retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), ex);
            	
        }
        finally {
             pop(); 
        }
        return retval;
    }
    // $ANTLR end "elseifblockcomment"

    public static class elseiflinecomment_return extends ParserRuleReturnScope {
        public ExpressionNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseiflinecomment"
    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:229:1: elseiflinecomment returns [ExpressionNode node] : C_LN_ST ELSEIF expression C_LN_ED ;
    public final TwoWaySqlParser.elseiflinecomment_return elseiflinecomment() throws RecognitionException {
        TwoWaySqlParser.elseiflinecomment_return retval = new TwoWaySqlParser.elseiflinecomment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token C_LN_ST36=null;
        Token ELSEIF37=null;
        Token C_LN_ED39=null;
        TwoWaySqlParser.expression_return expression38 = null;


        CommonTree C_LN_ST36_tree=null;
        CommonTree ELSEIF37_tree=null;
        CommonTree C_LN_ED39_tree=null;


        		push(EM_ELSEIFLINECOMMENT);
        	
        try {
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:233:2: ( C_LN_ST ELSEIF expression C_LN_ED )
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:233:4: C_LN_ST ELSEIF expression C_LN_ED
            {
            root_0 = (CommonTree)adaptor.nil();

            C_LN_ST36=(Token)match(input,C_LN_ST,FOLLOW_C_LN_ST_in_elseiflinecomment559); 
            C_LN_ST36_tree = (CommonTree)adaptor.create(C_LN_ST36);
            adaptor.addChild(root_0, C_LN_ST36_tree);

            ELSEIF37=(Token)match(input,ELSEIF,FOLLOW_ELSEIF_in_elseiflinecomment561); 
            ELSEIF37_tree = (CommonTree)adaptor.create(ELSEIF37);
            adaptor.addChild(root_0, ELSEIF37_tree);

            pushFollow(FOLLOW_expression_in_elseiflinecomment563);
            expression38=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression38.getTree());
            C_LN_ED39=(Token)match(input,C_LN_ED,FOLLOW_C_LN_ED_in_elseiflinecomment565); 
            C_LN_ED39_tree = (CommonTree)adaptor.create(C_LN_ED39);
            adaptor.addChild(root_0, C_LN_ED39_tree);

             retval.node = (expression38!=null?expression38.node:null); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException ex) {

            		reportError(ex);
            		recover(input,ex);
            		retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), ex);
            	
        }
        finally {
             pop(); 
        }
        return retval;
    }
    // $ANTLR end "elseiflinecomment"

    public static class elsenode_return extends ParserRuleReturnScope {
        public List<QueryNode> list;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elsenode"
    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:242:1: elsenode returns [List<QueryNode> list] : elsecomment nodelist ;
    public final TwoWaySqlParser.elsenode_return elsenode() throws RecognitionException {
        TwoWaySqlParser.elsenode_return retval = new TwoWaySqlParser.elsenode_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        TwoWaySqlParser.elsecomment_return elsecomment40 = null;

        TwoWaySqlParser.nodelist_return nodelist41 = null;




        		push(EM_ELSENODE);
        	
        try {
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:246:2: ( elsecomment nodelist )
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:247:2: elsecomment nodelist
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_elsecomment_in_elsenode600);
            elsecomment40=elsecomment();

            state._fsp--;

            adaptor.addChild(root_0, elsecomment40.getTree());
            pushFollow(FOLLOW_nodelist_in_elsenode602);
            nodelist41=nodelist();

            state._fsp--;

            adaptor.addChild(root_0, nodelist41.getTree());
             retval.list = (nodelist41!=null?nodelist41.list:null); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException ex) {

            		reportError(ex);
            		recover(input,ex);
            		retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), ex);
            	
        }
        finally {
             pop(); 
        }
        return retval;
    }
    // $ANTLR end "elsenode"

    public static class elsecomment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elsecomment"
    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:256:1: elsecomment : ( C_ST ELSE C_ED | C_LN_ST ELSE C_LN_ED ) ;
    public final TwoWaySqlParser.elsecomment_return elsecomment() throws RecognitionException {
        TwoWaySqlParser.elsecomment_return retval = new TwoWaySqlParser.elsecomment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token C_ST42=null;
        Token ELSE43=null;
        Token C_ED44=null;
        Token C_LN_ST45=null;
        Token ELSE46=null;
        Token C_LN_ED47=null;

        CommonTree C_ST42_tree=null;
        CommonTree ELSE43_tree=null;
        CommonTree C_ED44_tree=null;
        CommonTree C_LN_ST45_tree=null;
        CommonTree ELSE46_tree=null;
        CommonTree C_LN_ED47_tree=null;


        		push(EM_ELSECOMMENT);
        	
        try {
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:260:2: ( ( C_ST ELSE C_ED | C_LN_ST ELSE C_LN_ED ) )
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:261:2: ( C_ST ELSE C_ED | C_LN_ST ELSE C_LN_ED )
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:261:2: ( C_ST ELSE C_ED | C_LN_ST ELSE C_LN_ED )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==C_ST) ) {
                alt8=1;
            }
            else if ( (LA8_0==C_LN_ST) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:261:3: C_ST ELSE C_ED
                    {
                    C_ST42=(Token)match(input,C_ST,FOLLOW_C_ST_in_elsecomment636); 
                    C_ST42_tree = (CommonTree)adaptor.create(C_ST42);
                    adaptor.addChild(root_0, C_ST42_tree);

                    ELSE43=(Token)match(input,ELSE,FOLLOW_ELSE_in_elsecomment638); 
                    ELSE43_tree = (CommonTree)adaptor.create(ELSE43);
                    adaptor.addChild(root_0, ELSE43_tree);

                    C_ED44=(Token)match(input,C_ED,FOLLOW_C_ED_in_elsecomment640); 
                    C_ED44_tree = (CommonTree)adaptor.create(C_ED44);
                    adaptor.addChild(root_0, C_ED44_tree);


                    }
                    break;
                case 2 :
                    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:261:20: C_LN_ST ELSE C_LN_ED
                    {
                    C_LN_ST45=(Token)match(input,C_LN_ST,FOLLOW_C_LN_ST_in_elsecomment644); 
                    C_LN_ST45_tree = (CommonTree)adaptor.create(C_LN_ST45);
                    adaptor.addChild(root_0, C_LN_ST45_tree);

                    ELSE46=(Token)match(input,ELSE,FOLLOW_ELSE_in_elsecomment646); 
                    ELSE46_tree = (CommonTree)adaptor.create(ELSE46);
                    adaptor.addChild(root_0, ELSE46_tree);

                    C_LN_ED47=(Token)match(input,C_LN_ED,FOLLOW_C_LN_ED_in_elsecomment648); 
                    C_LN_ED47_tree = (CommonTree)adaptor.create(C_LN_ED47);
                    adaptor.addChild(root_0, C_LN_ED47_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException ex) {

            		reportError(ex);
            		recover(input,ex);
            		retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), ex);
            	
        }
        finally {
             pop(); 
        }
        return retval;
    }
    // $ANTLR end "elsecomment"

    public static class expression_return extends ParserRuleReturnScope {
        public ExpressionNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:270:1: expression returns [ExpressionNode node] : charactors ;
    public final TwoWaySqlParser.expression_return expression() throws RecognitionException {
        TwoWaySqlParser.expression_return retval = new TwoWaySqlParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        TwoWaySqlParser.charactors_return charactors48 = null;




        		push(EM_EXPRESSION);
        		retval.node = new ExpressionNode();
        	
        try {
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:279:2: ( charactors )
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:280:2: charactors
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_charactors_in_expression688);
            charactors48=charactors();

            state._fsp--;

            adaptor.addChild(root_0, charactors48.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            		retval.node.update(retval);
            		retval.node.freeze();
            	
        }

        catch (RecognitionException ex) {
        	reportErrorDbg(ex);
        	recover(input,ex);
        	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), ex);
        }
        finally {
             pop(); 
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class begincomment_return extends ParserRuleReturnScope {
        public BeginNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "begincomment"
    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:284:1: begincomment returns [BeginNode node] : ( ( C_ST BEGIN C_ED | C_LN_ST BEGIN C_LN_ED ) nodelist endcomment ) ;
    public final TwoWaySqlParser.begincomment_return begincomment() throws RecognitionException {
        TwoWaySqlParser.begincomment_return retval = new TwoWaySqlParser.begincomment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token C_ST49=null;
        Token BEGIN50=null;
        Token C_ED51=null;
        Token C_LN_ST52=null;
        Token BEGIN53=null;
        Token C_LN_ED54=null;
        TwoWaySqlParser.nodelist_return nodelist55 = null;

        TwoWaySqlParser.endcomment_return endcomment56 = null;


        CommonTree C_ST49_tree=null;
        CommonTree BEGIN50_tree=null;
        CommonTree C_ED51_tree=null;
        CommonTree C_LN_ST52_tree=null;
        CommonTree BEGIN53_tree=null;
        CommonTree C_LN_ED54_tree=null;


        		push(EM_BEGINCOMMENT);
        		retval.node = new BeginNode();
        	
        try {
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:293:2: ( ( ( C_ST BEGIN C_ED | C_LN_ST BEGIN C_LN_ED ) nodelist endcomment ) )
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:294:2: ( ( C_ST BEGIN C_ED | C_LN_ST BEGIN C_LN_ED ) nodelist endcomment )
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:294:2: ( ( C_ST BEGIN C_ED | C_LN_ST BEGIN C_LN_ED ) nodelist endcomment )
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:295:3: ( C_ST BEGIN C_ED | C_LN_ST BEGIN C_LN_ED ) nodelist endcomment
            {
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:295:3: ( C_ST BEGIN C_ED | C_LN_ST BEGIN C_LN_ED )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==C_ST) ) {
                alt9=1;
            }
            else if ( (LA9_0==C_LN_ST) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:295:4: C_ST BEGIN C_ED
                    {
                    C_ST49=(Token)match(input,C_ST,FOLLOW_C_ST_in_begincomment726); 
                    C_ST49_tree = (CommonTree)adaptor.create(C_ST49);
                    adaptor.addChild(root_0, C_ST49_tree);

                    BEGIN50=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_begincomment728); 
                    BEGIN50_tree = (CommonTree)adaptor.create(BEGIN50);
                    adaptor.addChild(root_0, BEGIN50_tree);

                    C_ED51=(Token)match(input,C_ED,FOLLOW_C_ED_in_begincomment730); 
                    C_ED51_tree = (CommonTree)adaptor.create(C_ED51);
                    adaptor.addChild(root_0, C_ED51_tree);


                    }
                    break;
                case 2 :
                    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:295:22: C_LN_ST BEGIN C_LN_ED
                    {
                    C_LN_ST52=(Token)match(input,C_LN_ST,FOLLOW_C_LN_ST_in_begincomment734); 
                    C_LN_ST52_tree = (CommonTree)adaptor.create(C_LN_ST52);
                    adaptor.addChild(root_0, C_LN_ST52_tree);

                    BEGIN53=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_begincomment736); 
                    BEGIN53_tree = (CommonTree)adaptor.create(BEGIN53);
                    adaptor.addChild(root_0, BEGIN53_tree);

                    C_LN_ED54=(Token)match(input,C_LN_ED,FOLLOW_C_LN_ED_in_begincomment738); 
                    C_LN_ED54_tree = (CommonTree)adaptor.create(C_LN_ED54);
                    adaptor.addChild(root_0, C_LN_ED54_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_nodelist_in_begincomment741);
            nodelist55=nodelist();

            state._fsp--;

            adaptor.addChild(root_0, nodelist55.getTree());
            pushFollow(FOLLOW_endcomment_in_begincomment743);
            endcomment56=endcomment();

            state._fsp--;

            adaptor.addChild(root_0, endcomment56.getTree());

            }


            		retval.node.setChildren((nodelist55!=null?nodelist55.list:null));
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            		retval.node.update(retval);
            		retval.node.freeze();
            	
        }
        catch (RecognitionException ex) {

            		reportError(ex);
            		recover(input,ex);
            		retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), ex);
            	
        }
        finally {
             pop(); 
        }
        return retval;
    }
    // $ANTLR end "begincomment"

    public static class endcomment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "endcomment"
    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:308:1: endcomment : ( C_ST END C_ED | C_LN_ST END C_LN_ED );
    public final TwoWaySqlParser.endcomment_return endcomment() throws RecognitionException {
        TwoWaySqlParser.endcomment_return retval = new TwoWaySqlParser.endcomment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token C_ST57=null;
        Token END58=null;
        Token C_ED59=null;
        Token C_LN_ST60=null;
        Token END61=null;
        Token C_LN_ED62=null;

        CommonTree C_ST57_tree=null;
        CommonTree END58_tree=null;
        CommonTree C_ED59_tree=null;
        CommonTree C_LN_ST60_tree=null;
        CommonTree END61_tree=null;
        CommonTree C_LN_ED62_tree=null;


        		push(EM_ENDCOMMENT);
        	
        try {
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:312:2: ( C_ST END C_ED | C_LN_ST END C_LN_ED )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==C_ST) ) {
                alt10=1;
            }
            else if ( (LA10_0==C_LN_ST) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:313:2: C_ST END C_ED
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    C_ST57=(Token)match(input,C_ST,FOLLOW_C_ST_in_endcomment779); 
                    C_ST57_tree = (CommonTree)adaptor.create(C_ST57);
                    adaptor.addChild(root_0, C_ST57_tree);

                    END58=(Token)match(input,END,FOLLOW_END_in_endcomment781); 
                    END58_tree = (CommonTree)adaptor.create(END58);
                    adaptor.addChild(root_0, END58_tree);

                    C_ED59=(Token)match(input,C_ED,FOLLOW_C_ED_in_endcomment783); 
                    C_ED59_tree = (CommonTree)adaptor.create(C_ED59);
                    adaptor.addChild(root_0, C_ED59_tree);


                    }
                    break;
                case 2 :
                    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:313:18: C_LN_ST END C_LN_ED
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    C_LN_ST60=(Token)match(input,C_LN_ST,FOLLOW_C_LN_ST_in_endcomment787); 
                    C_LN_ST60_tree = (CommonTree)adaptor.create(C_LN_ST60);
                    adaptor.addChild(root_0, C_LN_ST60_tree);

                    END61=(Token)match(input,END,FOLLOW_END_in_endcomment789); 
                    END61_tree = (CommonTree)adaptor.create(END61);
                    adaptor.addChild(root_0, END61_tree);

                    C_LN_ED62=(Token)match(input,C_LN_ED,FOLLOW_C_LN_ED_in_endcomment791); 
                    C_LN_ED62_tree = (CommonTree)adaptor.create(C_LN_ED62);
                    adaptor.addChild(root_0, C_LN_ED62_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException ex) {

            		reportError(ex);
            		recover(input,ex);
            		retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), ex);
            	
        }
        finally {
             pop(); 
        }
        return retval;
    }
    // $ANTLR end "endcomment"

    public static class bindcomment_return extends ParserRuleReturnScope {
        public BindNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bindcomment"
    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:322:1: bindcomment returns [BindNode node] : ( C_ST SYM_BIND expression C_ED txt ) ;
    public final TwoWaySqlParser.bindcomment_return bindcomment() throws RecognitionException {
        TwoWaySqlParser.bindcomment_return retval = new TwoWaySqlParser.bindcomment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token C_ST63=null;
        Token SYM_BIND64=null;
        Token C_ED66=null;
        TwoWaySqlParser.expression_return expression65 = null;

        TwoWaySqlParser.txt_return txt67 = null;


        CommonTree C_ST63_tree=null;
        CommonTree SYM_BIND64_tree=null;
        CommonTree C_ED66_tree=null;


        		push(EM_BINDCOMMENT);
        		retval.node = new BindNode();
        	
        try {
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:331:2: ( ( C_ST SYM_BIND expression C_ED txt ) )
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:332:2: ( C_ST SYM_BIND expression C_ED txt )
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:332:2: ( C_ST SYM_BIND expression C_ED txt )
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:332:3: C_ST SYM_BIND expression C_ED txt
            {
            C_ST63=(Token)match(input,C_ST,FOLLOW_C_ST_in_bindcomment831); 
            C_ST63_tree = (CommonTree)adaptor.create(C_ST63);
            adaptor.addChild(root_0, C_ST63_tree);

            SYM_BIND64=(Token)match(input,SYM_BIND,FOLLOW_SYM_BIND_in_bindcomment833); 
            SYM_BIND64_tree = (CommonTree)adaptor.create(SYM_BIND64);
            adaptor.addChild(root_0, SYM_BIND64_tree);

            pushFollow(FOLLOW_expression_in_bindcomment835);
            expression65=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression65.getTree());
            C_ED66=(Token)match(input,C_ED,FOLLOW_C_ED_in_bindcomment837); 
            C_ED66_tree = (CommonTree)adaptor.create(C_ED66);
            adaptor.addChild(root_0, C_ED66_tree);

            pushFollow(FOLLOW_txt_in_bindcomment839);
            txt67=txt();

            state._fsp--;

            adaptor.addChild(root_0, txt67.getTree());

            }


            		retval.node.setExpression((expression65!=null?expression65.node:null));
            		retval.node.setSkipped((txt67!=null?txt67.node:null));
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            		retval.node.update(retval);
            		retval.node.freeze();
            	
        }
        catch (RecognitionException ex) {

            		reportError(ex);
            		recover(input,ex);
            		retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), ex);
            	
        }
        finally {
             pop(); 
        }
        return retval;
    }
    // $ANTLR end "bindcomment"

    public static class inbind_return extends ParserRuleReturnScope {
        public InBindNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inbind"
    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:345:1: inbind returns [InBindNode node] : IN C_ST SYM_BIND expression C_ED inbindskipped ;
    public final TwoWaySqlParser.inbind_return inbind() throws RecognitionException {
        TwoWaySqlParser.inbind_return retval = new TwoWaySqlParser.inbind_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IN68=null;
        Token C_ST69=null;
        Token SYM_BIND70=null;
        Token C_ED72=null;
        TwoWaySqlParser.expression_return expression71 = null;

        TwoWaySqlParser.inbindskipped_return inbindskipped73 = null;


        CommonTree IN68_tree=null;
        CommonTree C_ST69_tree=null;
        CommonTree SYM_BIND70_tree=null;
        CommonTree C_ED72_tree=null;


        		push(EM_INBIND);
        		retval.node = new InBindNode();
        	
        try {
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:354:2: ( IN C_ST SYM_BIND expression C_ED inbindskipped )
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:355:2: IN C_ST SYM_BIND expression C_ED inbindskipped
            {
            root_0 = (CommonTree)adaptor.nil();

            IN68=(Token)match(input,IN,FOLLOW_IN_in_inbind882); 
            IN68_tree = (CommonTree)adaptor.create(IN68);
            adaptor.addChild(root_0, IN68_tree);

            C_ST69=(Token)match(input,C_ST,FOLLOW_C_ST_in_inbind884); 
            C_ST69_tree = (CommonTree)adaptor.create(C_ST69);
            adaptor.addChild(root_0, C_ST69_tree);

            SYM_BIND70=(Token)match(input,SYM_BIND,FOLLOW_SYM_BIND_in_inbind886); 
            SYM_BIND70_tree = (CommonTree)adaptor.create(SYM_BIND70);
            adaptor.addChild(root_0, SYM_BIND70_tree);

            pushFollow(FOLLOW_expression_in_inbind888);
            expression71=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression71.getTree());
            C_ED72=(Token)match(input,C_ED,FOLLOW_C_ED_in_inbind890); 
            C_ED72_tree = (CommonTree)adaptor.create(C_ED72);
            adaptor.addChild(root_0, C_ED72_tree);

            pushFollow(FOLLOW_inbindskipped_in_inbind892);
            inbindskipped73=inbindskipped();

            state._fsp--;

            adaptor.addChild(root_0, inbindskipped73.getTree());

            		retval.node.setExpression((expression71!=null?expression71.node:null));
            		retval.node.setSkipped((inbindskipped73!=null?inbindskipped73.node:null));
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            		retval.node.update(retval);
            		retval.node.freeze();
            	
        }

        catch (RecognitionException ex) {
        	reportErrorDbg(ex);
        	recover(input,ex);
        	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), ex);
        }
        finally {
             pop(); 
        }
        return retval;
    }
    // $ANTLR end "inbind"

    public static class inbindskipped_return extends ParserRuleReturnScope {
        public TxtNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inbindskipped"
    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:363:1: inbindskipped returns [TxtNode node] : SYM_LP inbindchars ( SYM_C inbindchars )* SYM_RP ;
    public final TwoWaySqlParser.inbindskipped_return inbindskipped() throws RecognitionException {
        TwoWaySqlParser.inbindskipped_return retval = new TwoWaySqlParser.inbindskipped_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SYM_LP74=null;
        Token SYM_C76=null;
        Token SYM_RP78=null;
        TwoWaySqlParser.inbindchars_return inbindchars75 = null;

        TwoWaySqlParser.inbindchars_return inbindchars77 = null;


        CommonTree SYM_LP74_tree=null;
        CommonTree SYM_C76_tree=null;
        CommonTree SYM_RP78_tree=null;


        		push(EM_INBINDSKIPPED);
        		retval.node = new TxtNode();
        	
        try {
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:372:2: ( SYM_LP inbindchars ( SYM_C inbindchars )* SYM_RP )
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:373:2: SYM_LP inbindchars ( SYM_C inbindchars )* SYM_RP
            {
            root_0 = (CommonTree)adaptor.nil();

            SYM_LP74=(Token)match(input,SYM_LP,FOLLOW_SYM_LP_in_inbindskipped927); 
            SYM_LP74_tree = (CommonTree)adaptor.create(SYM_LP74);
            adaptor.addChild(root_0, SYM_LP74_tree);

            pushFollow(FOLLOW_inbindchars_in_inbindskipped929);
            inbindchars75=inbindchars();

            state._fsp--;

            adaptor.addChild(root_0, inbindchars75.getTree());
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:373:21: ( SYM_C inbindchars )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==SYM_C) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:373:22: SYM_C inbindchars
            	    {
            	    SYM_C76=(Token)match(input,SYM_C,FOLLOW_SYM_C_in_inbindskipped932); 
            	    SYM_C76_tree = (CommonTree)adaptor.create(SYM_C76);
            	    adaptor.addChild(root_0, SYM_C76_tree);

            	    pushFollow(FOLLOW_inbindchars_in_inbindskipped934);
            	    inbindchars77=inbindchars();

            	    state._fsp--;

            	    adaptor.addChild(root_0, inbindchars77.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            SYM_RP78=(Token)match(input,SYM_RP,FOLLOW_SYM_RP_in_inbindskipped938); 
            SYM_RP78_tree = (CommonTree)adaptor.create(SYM_RP78);
            adaptor.addChild(root_0, SYM_RP78_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            		retval.node.update(retval);
            		retval.node.freeze();
            	
        }
        catch (RecognitionException ex) {

            		reportError(ex);
            		recover(input,ex);
            		retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), ex);
            	
        }
        finally {
             pop(); 
        }
        return retval;
    }
    // $ANTLR end "inbindskipped"

    public static class inbindchars_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inbindchars"
    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:382:1: inbindchars : ( IDENT | QUOTED | SYMBOLS | SYM_BIND )+ ;
    public final TwoWaySqlParser.inbindchars_return inbindchars() throws RecognitionException {
        TwoWaySqlParser.inbindchars_return retval = new TwoWaySqlParser.inbindchars_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set79=null;

        CommonTree set79_tree=null;

        try {
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:383:2: ( ( IDENT | QUOTED | SYMBOLS | SYM_BIND )+ )
            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:384:2: ( IDENT | QUOTED | SYMBOLS | SYM_BIND )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:384:2: ( IDENT | QUOTED | SYMBOLS | SYM_BIND )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=IDENT && LA12_0<=SYM_BIND)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\development\\java\\workspace_3.4.1\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:
            	    {
            	    set79=(Token)input.LT(1);
            	    if ( (input.LA(1)>=IDENT && input.LA(1)<=SYM_BIND) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (CommonTree)adaptor.create(set79));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (EarlyExitException ex) {

            		throw ex;
            	
        }
        catch (RecognitionException ex) {

            		reportError(ex);
            		recover(input,ex);
            		retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), ex);
            	
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "inbindchars"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\13\uffff";
    static final String DFA3_eofS =
        "\11\uffff\1\6\1\uffff";
    static final String DFA3_minS =
        "\1\13\2\4\2\uffff\1\4\2\uffff\2\4\1\uffff";
    static final String DFA3_maxS =
        "\1\15\2\23\2\uffff\1\14\2\uffff\1\14\1\25\1\uffff";
    static final String DFA3_acceptS =
        "\3\uffff\1\1\1\2\1\uffff\1\4\1\5\2\uffff\1\3";
    static final String DFA3_specialS =
        "\13\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\1\uffff\1\2",
            "\3\6\1\5\3\6\4\uffff\1\4\3\uffff\1\3",
            "\7\7\10\uffff\1\3",
            "",
            "",
            "\7\10\1\uffff\1\6",
            "",
            "",
            "\7\10\1\uffff\1\11",
            "\7\12\1\6\1\uffff\1\6\7\uffff\1\6",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "136:1: comment returns [QueryNode node] : ( begincomment | ifcomment | bindcomment | blockcomment | linecomment );";
        }
    }
 

    public static final BitSet FOLLOW_nodelist_in_twowaySQL98 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_twowaySQL100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_nodelist125 = new BitSet(new long[]{0x0000000000202FF2L});
    public static final BitSet FOLLOW_inbind_in_nodelist132 = new BitSet(new long[]{0x0000000000202FF2L});
    public static final BitSet FOLLOW_txt_in_nodelist139 = new BitSet(new long[]{0x0000000000202FF2L});
    public static final BitSet FOLLOW_set_in_charactors167 = new BitSet(new long[]{0x00000000000007F2L});
    public static final BitSet FOLLOW_charactors_in_txt229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begincomment_in_comment249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifcomment_in_comment256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bindcomment_in_comment263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockcomment_in_comment270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_linecomment_in_comment277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_C_ST_in_blockcomment306 = new BitSet(new long[]{0x0000000000203FF0L});
    public static final BitSet FOLLOW_charactors_in_blockcomment308 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_C_ED_in_blockcomment310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_C_LN_ST_in_linecomment342 = new BitSet(new long[]{0x0000000000206FF0L});
    public static final BitSet FOLLOW_charactors_in_linecomment344 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_C_LN_ED_in_linecomment346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_C_ST_in_ifcomment379 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IF_in_ifcomment381 = new BitSet(new long[]{0x0000000000202FF0L});
    public static final BitSet FOLLOW_expression_in_ifcomment383 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_C_ED_in_ifcomment385 = new BitSet(new long[]{0x0000000000212FF0L});
    public static final BitSet FOLLOW_MAYBE_SKIP_in_ifcomment392 = new BitSet(new long[]{0x0000000000212FF0L});
    public static final BitSet FOLLOW_nodelist_in_ifcomment401 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_elseifnode_in_ifcomment408 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_elsenode_in_ifcomment418 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_endcomment_in_ifcomment426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elseifcomment_in_elseifnode457 = new BitSet(new long[]{0x0000000000212FF0L});
    public static final BitSet FOLLOW_nodelist_in_elseifnode459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elseifblockcomment_in_elseifcomment486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elseiflinecomment_in_elseifcomment494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_C_ST_in_elseifblockcomment519 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ELSEIF_in_elseifblockcomment521 = new BitSet(new long[]{0x0000000000202FF0L});
    public static final BitSet FOLLOW_expression_in_elseifblockcomment523 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_C_ED_in_elseifblockcomment525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_C_LN_ST_in_elseiflinecomment559 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ELSEIF_in_elseiflinecomment561 = new BitSet(new long[]{0x0000000000202FF0L});
    public static final BitSet FOLLOW_expression_in_elseiflinecomment563 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_C_LN_ED_in_elseiflinecomment565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elsecomment_in_elsenode600 = new BitSet(new long[]{0x0000000000212FF0L});
    public static final BitSet FOLLOW_nodelist_in_elsenode602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_C_ST_in_elsecomment636 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ELSE_in_elsecomment638 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_C_ED_in_elsecomment640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_C_LN_ST_in_elsecomment644 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ELSE_in_elsecomment646 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_C_LN_ED_in_elsecomment648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_charactors_in_expression688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_C_ST_in_begincomment726 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_BEGIN_in_begincomment728 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_C_ED_in_begincomment730 = new BitSet(new long[]{0x0000000000212FF0L});
    public static final BitSet FOLLOW_C_LN_ST_in_begincomment734 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_BEGIN_in_begincomment736 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_C_LN_ED_in_begincomment738 = new BitSet(new long[]{0x0000000000212FF0L});
    public static final BitSet FOLLOW_nodelist_in_begincomment741 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_endcomment_in_begincomment743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_C_ST_in_endcomment779 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_END_in_endcomment781 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_C_ED_in_endcomment783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_C_LN_ST_in_endcomment787 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_END_in_endcomment789 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_C_LN_ED_in_endcomment791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_C_ST_in_bindcomment831 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_SYM_BIND_in_bindcomment833 = new BitSet(new long[]{0x0000000000202FF0L});
    public static final BitSet FOLLOW_expression_in_bindcomment835 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_C_ED_in_bindcomment837 = new BitSet(new long[]{0x0000000000202FF0L});
    public static final BitSet FOLLOW_txt_in_bindcomment839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_inbind882 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_C_ST_in_inbind884 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_SYM_BIND_in_inbind886 = new BitSet(new long[]{0x0000000000202FF0L});
    public static final BitSet FOLLOW_expression_in_inbind888 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_C_ED_in_inbind890 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_inbindskipped_in_inbind892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYM_LP_in_inbindskipped927 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_inbindchars_in_inbindskipped929 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_SYM_C_in_inbindskipped932 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_inbindchars_in_inbindskipped934 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_SYM_RP_in_inbindskipped938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_inbindchars962 = new BitSet(new long[]{0x00000000000000F2L});

}