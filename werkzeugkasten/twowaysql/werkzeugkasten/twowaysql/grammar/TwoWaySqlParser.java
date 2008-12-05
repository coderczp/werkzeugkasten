// $ANTLR 3.1.1 D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g 2008-12-05 18:03:24

package werkzeugkasten.twowaysql.grammar;

import java.util.LinkedList;
import werkzeugkasten.twowaysql.tree.*;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class TwoWaySqlParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "SYMBOLS", "QUOTED", "SYM_BIND", "SYM_C", "SYM_LP", "SYM_RP", "C_ST", "C_ED", "C_LN_ST", "C_LN_ED", "IF", "ELSEIF", "ELSE", "BEGIN", "END", "IN", "SYM_Q", "LN_R", "LN_N", "CHAR", "WS", "LT", "WHITE_SPACES"
    };
    public static final int LT=26;
    public static final int C_ST=11;
    public static final int QUOTED=6;
    public static final int SYM_RP=10;
    public static final int ELSE=17;
    public static final int SYM_LP=9;
    public static final int CHAR=24;
    public static final int C_LN_ST=13;
    public static final int EOF=-1;
    public static final int C_ED=12;
    public static final int IF=15;
    public static final int WHITE_SPACES=27;
    public static final int ELSEIF=16;
    public static final int WS=25;
    public static final int SYM_Q=21;
    public static final int IN=20;
    public static final int BEGIN=18;
    public static final int IDENT=4;
    public static final int SYMBOLS=5;
    public static final int SYM_C=8;
    public static final int SYM_BIND=7;
    public static final int END=19;
    public static final int C_LN_ED=14;
    public static final int LN_N=23;
    public static final int LN_R=22;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "endcomment", "comment", "elseifnode", "nodelist", 
        "txt", "charactors", "inbindchars", "expression", "inbind", "elsecomment", 
        "begincomment", "blockcomment", "elseiflinecomment", "linecomment", 
        "elsenode", "bindcomment", "twowaySQL", "elseifcomment", "elseifblockcomment", 
        "ifcomment"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public TwoWaySqlParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public TwoWaySqlParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public TwoWaySqlParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return TwoWaySqlParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g"; }




    public static class twowaySQL_return extends ParserRuleReturnScope {
        public TwoWayQuery query;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "twowaySQL"
    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:29:1: twowaySQL returns [TwoWayQuery query] : nodelist EOF ;
    public final TwoWaySqlParser.twowaySQL_return twowaySQL() throws RecognitionException {
        TwoWaySqlParser.twowaySQL_return retval = new TwoWaySqlParser.twowaySQL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF2=null;
        TwoWaySqlParser.nodelist_return nodelist1 = null;


        CommonTree EOF2_tree=null;


        		retval.query = new TwoWayQuery();
        	
        try { dbg.enterRule(getGrammarFileName(), "twowaySQL");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(29, 1);

        try {
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:36:2: ( nodelist EOF )
            dbg.enterAlt(1);

            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:36:4: nodelist EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(36,4);
            pushFollow(FOLLOW_nodelist_in_twowaySQL79);
            nodelist1=nodelist();

            state._fsp--;

            adaptor.addChild(root_0, nodelist1.getTree());
            dbg.location(36,13);
            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_twowaySQL81); 
            EOF2_tree = (CommonTree)adaptor.create(EOF2);
            adaptor.addChild(root_0, EOF2_tree);

            dbg.location(36,17);

            		retval.query.setChildren((nodelist1!=null?nodelist1.list:null));
            		retval.query.update((nodelist1!=null?((CommonTree)nodelist1.tree):null));
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            		retval.query.freeze();
            	
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(40, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "twowaySQL");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "twowaySQL"

    public static class nodelist_return extends ParserRuleReturnScope {
        public LinkedList<QueryNode> list;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nodelist"
    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:42:1: nodelist returns [LinkedList<QueryNode> list] : ( comment | inbind | txt )+ ;
    public final TwoWaySqlParser.nodelist_return nodelist() throws RecognitionException {
        TwoWaySqlParser.nodelist_return retval = new TwoWaySqlParser.nodelist_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        TwoWaySqlParser.comment_return comment3 = null;

        TwoWaySqlParser.inbind_return inbind4 = null;

        TwoWaySqlParser.txt_return txt5 = null;




        		retval.list = new LinkedList<QueryNode>();
        	
        try { dbg.enterRule(getGrammarFileName(), "nodelist");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(42, 1);

        try {
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:46:2: ( ( comment | inbind | txt )+ )
            dbg.enterAlt(1);

            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:47:2: ( comment | inbind | txt )+
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(47,2);
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:47:2: ( comment | inbind | txt )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=4;
                try { dbg.enterDecision(1);

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
                case SYMBOLS:
                case QUOTED:
                case SYM_BIND:
                case SYM_C:
                case SYM_LP:
                case SYM_RP:
                    {
                    alt1=3;
                    }
                    break;

                }

                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:47:3: comment
            	    {
            	    dbg.location(47,3);
            	    pushFollow(FOLLOW_comment_in_nodelist103);
            	    comment3=comment();

            	    state._fsp--;

            	    adaptor.addChild(root_0, comment3.getTree());
            	    dbg.location(47,11);
            	    retval.list.add((comment3!=null?comment3.node:null));

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:48:4: inbind
            	    {
            	    dbg.location(48,4);
            	    pushFollow(FOLLOW_inbind_in_nodelist110);
            	    inbind4=inbind();

            	    state._fsp--;

            	    adaptor.addChild(root_0, inbind4.getTree());
            	    dbg.location(48,11);
            	    retval.list.add((inbind4!=null?inbind4.node:null));

            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:49:4: txt
            	    {
            	    dbg.location(49,4);
            	    pushFollow(FOLLOW_txt_in_nodelist117);
            	    txt5=txt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, txt5.getTree());
            	    dbg.location(49,8);
            	    retval.list.add((txt5!=null?txt5.node:null));

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(51, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nodelist");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nodelist"

    public static class charactors_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "charactors"
    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:53:1: charactors : ( IDENT | SYMBOLS | QUOTED | SYM_BIND | SYM_C | SYM_LP | SYM_RP )+ ;
    public final TwoWaySqlParser.charactors_return charactors() throws RecognitionException {
        TwoWaySqlParser.charactors_return retval = new TwoWaySqlParser.charactors_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set6=null;

        CommonTree set6_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "charactors");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(53, 1);

        try {
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:53:12: ( ( IDENT | SYMBOLS | QUOTED | SYM_BIND | SYM_C | SYM_LP | SYM_RP )+ )
            dbg.enterAlt(1);

            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:54:2: ( IDENT | SYMBOLS | QUOTED | SYM_BIND | SYM_C | SYM_LP | SYM_RP )+
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(54,2);
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:54:2: ( IDENT | SYMBOLS | QUOTED | SYM_BIND | SYM_C | SYM_LP | SYM_RP )+
            int cnt2=0;
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2);

                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=IDENT && LA2_0<=SYM_RP)) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:
            	    {
            	    dbg.location(54,2);
            	    set6=(Token)input.LT(1);
            	    if ( (input.LA(1)>=IDENT && input.LA(1)<=SYM_RP) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (CommonTree)adaptor.create(set6));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt2++;
            } while (true);
            } finally {dbg.exitSubRule(2);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(55, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "charactors");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:57:1: txt returns [TxtNode node] : charactors ;
    public final TwoWaySqlParser.txt_return txt() throws RecognitionException {
        TwoWaySqlParser.txt_return retval = new TwoWaySqlParser.txt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        TwoWaySqlParser.charactors_return charactors7 = null;




        		retval.node = new TxtNode();
        	
        try { dbg.enterRule(getGrammarFileName(), "txt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(57, 1);

        try {
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:64:2: ( charactors )
            dbg.enterAlt(1);

            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:65:2: charactors
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(65,2);
            pushFollow(FOLLOW_charactors_in_txt186);
            charactors7=charactors();

            state._fsp--;

            adaptor.addChild(root_0, charactors7.getTree());
            dbg.location(65,13);
             retval.node.update((charactors7!=null?((CommonTree)charactors7.tree):null)); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            		retval.node.freeze();
            	
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(66, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "txt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:70:1: comment returns [QueryNode node] : ( begincomment | ifcomment | bindcomment | blockcomment | linecomment );
    public final TwoWaySqlParser.comment_return comment() throws RecognitionException {
        TwoWaySqlParser.comment_return retval = new TwoWaySqlParser.comment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        TwoWaySqlParser.begincomment_return begincomment8 = null;

        TwoWaySqlParser.ifcomment_return ifcomment9 = null;

        TwoWaySqlParser.bindcomment_return bindcomment10 = null;

        TwoWaySqlParser.blockcomment_return blockcomment11 = null;

        TwoWaySqlParser.linecomment_return linecomment12 = null;



        try { dbg.enterRule(getGrammarFileName(), "comment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(70, 1);

        try {
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:70:32: ( begincomment | ifcomment | bindcomment | blockcomment | linecomment )
            int alt3=5;
            try { dbg.enterDecision(3);

            try {
                isCyclicDecision = true;
                alt3 = dfa3.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:71:2: begincomment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(71,2);
                    pushFollow(FOLLOW_begincomment_in_comment202);
                    begincomment8=begincomment();

                    state._fsp--;

                    adaptor.addChild(root_0, begincomment8.getTree());
                    dbg.location(71,15);
                    retval.node = (begincomment8!=null?begincomment8.node:null);

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:72:4: ifcomment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(72,4);
                    pushFollow(FOLLOW_ifcomment_in_comment209);
                    ifcomment9=ifcomment();

                    state._fsp--;

                    adaptor.addChild(root_0, ifcomment9.getTree());
                    dbg.location(72,14);
                    retval.node = (ifcomment9!=null?ifcomment9.node:null);

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:73:4: bindcomment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(73,4);
                    pushFollow(FOLLOW_bindcomment_in_comment216);
                    bindcomment10=bindcomment();

                    state._fsp--;

                    adaptor.addChild(root_0, bindcomment10.getTree());
                    dbg.location(73,16);
                    retval.node = (bindcomment10!=null?bindcomment10.node:null);

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:74:4: blockcomment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(74,4);
                    pushFollow(FOLLOW_blockcomment_in_comment223);
                    blockcomment11=blockcomment();

                    state._fsp--;

                    adaptor.addChild(root_0, blockcomment11.getTree());
                    dbg.location(74,17);
                    retval.node = (blockcomment11!=null?blockcomment11.node:null);

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:75:4: linecomment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(75,4);
                    pushFollow(FOLLOW_linecomment_in_comment230);
                    linecomment12=linecomment();

                    state._fsp--;

                    adaptor.addChild(root_0, linecomment12.getTree());
                    dbg.location(75,16);
                    retval.node = (linecomment12!=null?linecomment12.node:null);

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(76, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "comment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:78:1: blockcomment returns [TxtNode node] : C_ST charactors C_ED ;
    public final TwoWaySqlParser.blockcomment_return blockcomment() throws RecognitionException {
        TwoWaySqlParser.blockcomment_return retval = new TwoWaySqlParser.blockcomment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token C_ST13=null;
        Token C_ED15=null;
        TwoWaySqlParser.charactors_return charactors14 = null;


        CommonTree C_ST13_tree=null;
        CommonTree C_ED15_tree=null;


        		retval.node = new TxtNode();
        	
        try { dbg.enterRule(getGrammarFileName(), "blockcomment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(78, 1);

        try {
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:85:2: ( C_ST charactors C_ED )
            dbg.enterAlt(1);

            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:86:2: C_ST charactors C_ED
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(86,2);
            C_ST13=(Token)match(input,C_ST,FOLLOW_C_ST_in_blockcomment259); 
            C_ST13_tree = (CommonTree)adaptor.create(C_ST13);
            adaptor.addChild(root_0, C_ST13_tree);

            dbg.location(86,7);
            pushFollow(FOLLOW_charactors_in_blockcomment261);
            charactors14=charactors();

            state._fsp--;

            adaptor.addChild(root_0, charactors14.getTree());
            dbg.location(86,18);
            C_ED15=(Token)match(input,C_ED,FOLLOW_C_ED_in_blockcomment263); 
            C_ED15_tree = (CommonTree)adaptor.create(C_ED15);
            adaptor.addChild(root_0, C_ED15_tree);

            dbg.location(86,23);
             retval.node.update(C_ST13);retval.node.update(C_ED15); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            		retval.node.freeze();
            	
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(87, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "blockcomment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:89:1: linecomment returns [TxtNode node] : C_LN_ST charactors C_LN_ED ;
    public final TwoWaySqlParser.linecomment_return linecomment() throws RecognitionException {
        TwoWaySqlParser.linecomment_return retval = new TwoWaySqlParser.linecomment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token C_LN_ST16=null;
        Token C_LN_ED18=null;
        TwoWaySqlParser.charactors_return charactors17 = null;


        CommonTree C_LN_ST16_tree=null;
        CommonTree C_LN_ED18_tree=null;


        		retval.node = new TxtNode();
        	
        try { dbg.enterRule(getGrammarFileName(), "linecomment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 1);

        try {
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:96:2: ( C_LN_ST charactors C_LN_ED )
            dbg.enterAlt(1);

            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:97:2: C_LN_ST charactors C_LN_ED
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(97,2);
            C_LN_ST16=(Token)match(input,C_LN_ST,FOLLOW_C_LN_ST_in_linecomment292); 
            C_LN_ST16_tree = (CommonTree)adaptor.create(C_LN_ST16);
            adaptor.addChild(root_0, C_LN_ST16_tree);

            dbg.location(97,10);
            pushFollow(FOLLOW_charactors_in_linecomment294);
            charactors17=charactors();

            state._fsp--;

            adaptor.addChild(root_0, charactors17.getTree());
            dbg.location(97,21);
            C_LN_ED18=(Token)match(input,C_LN_ED,FOLLOW_C_LN_ED_in_linecomment296); 
            C_LN_ED18_tree = (CommonTree)adaptor.create(C_LN_ED18);
            adaptor.addChild(root_0, C_LN_ED18_tree);

            dbg.location(97,29);
             retval.node.update(C_LN_ST16);retval.node.update(C_LN_ED18); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            		retval.node.freeze();
            	
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(98, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "linecomment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:100:1: ifcomment returns [IfNode node] : ( C_ST IF expression C_ED nodelist ( elseifnode )* ( elsenode )? endcomment ) ;
    public final TwoWaySqlParser.ifcomment_return ifcomment() throws RecognitionException {
        TwoWaySqlParser.ifcomment_return retval = new TwoWaySqlParser.ifcomment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token C_ST19=null;
        Token IF20=null;
        Token C_ED22=null;
        TwoWaySqlParser.expression_return expression21 = null;

        TwoWaySqlParser.nodelist_return nodelist23 = null;

        TwoWaySqlParser.elseifnode_return elseifnode24 = null;

        TwoWaySqlParser.elsenode_return elsenode25 = null;

        TwoWaySqlParser.endcomment_return endcomment26 = null;


        CommonTree C_ST19_tree=null;
        CommonTree IF20_tree=null;
        CommonTree C_ED22_tree=null;


        		retval.node = new IfNode();
        	
        try { dbg.enterRule(getGrammarFileName(), "ifcomment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(100, 1);

        try {
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:107:2: ( ( C_ST IF expression C_ED nodelist ( elseifnode )* ( elsenode )? endcomment ) )
            dbg.enterAlt(1);

            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:108:2: ( C_ST IF expression C_ED nodelist ( elseifnode )* ( elsenode )? endcomment )
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(108,2);
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:108:2: ( C_ST IF expression C_ED nodelist ( elseifnode )* ( elsenode )? endcomment )
            dbg.enterAlt(1);

            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:108:3: C_ST IF expression C_ED nodelist ( elseifnode )* ( elsenode )? endcomment
            {
            dbg.location(108,3);
            C_ST19=(Token)match(input,C_ST,FOLLOW_C_ST_in_ifcomment326); 
            C_ST19_tree = (CommonTree)adaptor.create(C_ST19);
            adaptor.addChild(root_0, C_ST19_tree);

            dbg.location(108,8);
            IF20=(Token)match(input,IF,FOLLOW_IF_in_ifcomment328); 
            IF20_tree = (CommonTree)adaptor.create(IF20);
            adaptor.addChild(root_0, IF20_tree);

            dbg.location(108,11);
            pushFollow(FOLLOW_expression_in_ifcomment330);
            expression21=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression21.getTree());
            dbg.location(108,22);
            C_ED22=(Token)match(input,C_ED,FOLLOW_C_ED_in_ifcomment332); 
            C_ED22_tree = (CommonTree)adaptor.create(C_ED22);
            adaptor.addChild(root_0, C_ED22_tree);

            dbg.location(108,27);
             retval.node.setExpression((expression21!=null?expression21.node:null)); 
            dbg.location(109,3);
            pushFollow(FOLLOW_nodelist_in_ifcomment338);
            nodelist23=nodelist();

            state._fsp--;

            adaptor.addChild(root_0, nodelist23.getTree());
            dbg.location(109,12);
             retval.node.setChildren((nodelist23!=null?nodelist23.list:null));
            dbg.location(110,3);
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:110:3: ( elseifnode )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==C_ST) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==ELSEIF) ) {
                        alt4=1;
                    }


                }
                else if ( (LA4_0==C_LN_ST) ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2==ELSEIF) ) {
                        alt4=1;
                    }


                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:110:4: elseifnode
            	    {
            	    dbg.location(110,4);
            	    pushFollow(FOLLOW_elseifnode_in_ifcomment345);
            	    elseifnode24=elseifnode();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseifnode24.getTree());
            	    dbg.location(110,15);
            	     retval.node.addElseIf((elseifnode24!=null?elseifnode24.node:null)); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);
            } finally {dbg.exitSubRule(4);}

            dbg.location(111,3);
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:111:3: ( elsenode )?
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==C_ST) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==ELSE) ) {
                    alt5=1;
                }
            }
            else if ( (LA5_0==C_LN_ST) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==ELSE) ) {
                    alt5=1;
                }
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:111:4: elsenode
                    {
                    dbg.location(111,4);
                    pushFollow(FOLLOW_elsenode_in_ifcomment355);
                    elsenode25=elsenode();

                    state._fsp--;

                    adaptor.addChild(root_0, elsenode25.getTree());
                    dbg.location(111,13);
                     retval.node.setElse((elsenode25!=null?elsenode25.list:null)); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}

            dbg.location(112,3);
            pushFollow(FOLLOW_endcomment_in_ifcomment363);
            endcomment26=endcomment();

            state._fsp--;

            adaptor.addChild(root_0, endcomment26.getTree());

            }

            dbg.location(114,2);

            		retval.node.update(C_ST19);
            		retval.node.update((endcomment26!=null?((CommonTree)endcomment26.tree):null));
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            		retval.node.freeze();
            	
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(118, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ifcomment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:120:1: elseifnode returns [IfNode node] : elseifcomment nodelist ;
    public final TwoWaySqlParser.elseifnode_return elseifnode() throws RecognitionException {
        TwoWaySqlParser.elseifnode_return retval = new TwoWaySqlParser.elseifnode_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        TwoWaySqlParser.elseifcomment_return elseifcomment27 = null;

        TwoWaySqlParser.nodelist_return nodelist28 = null;




        		retval.node = new IfNode();
        	
        try { dbg.enterRule(getGrammarFileName(), "elseifnode");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(120, 1);

        try {
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:127:2: ( elseifcomment nodelist )
            dbg.enterAlt(1);

            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:128:2: elseifcomment nodelist
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(128,2);
            pushFollow(FOLLOW_elseifcomment_in_elseifnode397);
            elseifcomment27=elseifcomment();

            state._fsp--;

            adaptor.addChild(root_0, elseifcomment27.getTree());
            dbg.location(128,16);
            pushFollow(FOLLOW_nodelist_in_elseifnode399);
            nodelist28=nodelist();

            state._fsp--;

            adaptor.addChild(root_0, nodelist28.getTree());
            dbg.location(129,2);

            		retval.node.update((elseifcomment27!=null?((CommonTree)elseifcomment27.tree):null));
            		retval.node.setExpression((elseifcomment27!=null?elseifcomment27.node:null));
            		retval.node.setChildren((nodelist28!=null?nodelist28.list:null));
            		retval.node.update((nodelist28!=null?((CommonTree)nodelist28.tree):null));
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            		retval.node.freeze();
            	
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(135, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "elseifnode");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:137:1: elseifcomment returns [ExpressionNode node] : ( elseifblockcomment | elseiflinecomment ) ;
    public final TwoWaySqlParser.elseifcomment_return elseifcomment() throws RecognitionException {
        TwoWaySqlParser.elseifcomment_return retval = new TwoWaySqlParser.elseifcomment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        TwoWaySqlParser.elseifblockcomment_return elseifblockcomment29 = null;

        TwoWaySqlParser.elseiflinecomment_return elseiflinecomment30 = null;



        try { dbg.enterRule(getGrammarFileName(), "elseifcomment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(137, 1);

        try {
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:138:2: ( ( elseifblockcomment | elseiflinecomment ) )
            dbg.enterAlt(1);

            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:139:2: ( elseifblockcomment | elseiflinecomment )
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(139,2);
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:139:2: ( elseifblockcomment | elseiflinecomment )
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==C_ST) ) {
                alt6=1;
            }
            else if ( (LA6_0==C_LN_ST) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:139:3: elseifblockcomment
                    {
                    dbg.location(139,3);
                    pushFollow(FOLLOW_elseifblockcomment_in_elseifcomment418);
                    elseifblockcomment29=elseifblockcomment();

                    state._fsp--;

                    adaptor.addChild(root_0, elseifblockcomment29.getTree());
                    dbg.location(139,22);
                    retval.node = (elseifblockcomment29!=null?elseifblockcomment29.node:null);

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:140:5: elseiflinecomment
                    {
                    dbg.location(140,5);
                    pushFollow(FOLLOW_elseiflinecomment_in_elseifcomment426);
                    elseiflinecomment30=elseiflinecomment();

                    state._fsp--;

                    adaptor.addChild(root_0, elseiflinecomment30.getTree());
                    dbg.location(140,23);
                    retval.node = (elseiflinecomment30!=null?elseiflinecomment30.node:null);

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(142, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "elseifcomment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:144:1: elseifblockcomment returns [ExpressionNode node] : C_ST ELSEIF expression C_ED ;
    public final TwoWaySqlParser.elseifblockcomment_return elseifblockcomment() throws RecognitionException {
        TwoWaySqlParser.elseifblockcomment_return retval = new TwoWaySqlParser.elseifblockcomment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token C_ST31=null;
        Token ELSEIF32=null;
        Token C_ED34=null;
        TwoWaySqlParser.expression_return expression33 = null;


        CommonTree C_ST31_tree=null;
        CommonTree ELSEIF32_tree=null;
        CommonTree C_ED34_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "elseifblockcomment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(144, 1);

        try {
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:145:2: ( C_ST ELSEIF expression C_ED )
            dbg.enterAlt(1);

            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:145:4: C_ST ELSEIF expression C_ED
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(145,4);
            C_ST31=(Token)match(input,C_ST,FOLLOW_C_ST_in_elseifblockcomment444); 
            C_ST31_tree = (CommonTree)adaptor.create(C_ST31);
            adaptor.addChild(root_0, C_ST31_tree);

            dbg.location(145,9);
            ELSEIF32=(Token)match(input,ELSEIF,FOLLOW_ELSEIF_in_elseifblockcomment446); 
            ELSEIF32_tree = (CommonTree)adaptor.create(ELSEIF32);
            adaptor.addChild(root_0, ELSEIF32_tree);

            dbg.location(145,16);
            pushFollow(FOLLOW_expression_in_elseifblockcomment448);
            expression33=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression33.getTree());
            dbg.location(145,27);
            C_ED34=(Token)match(input,C_ED,FOLLOW_C_ED_in_elseifblockcomment450); 
            C_ED34_tree = (CommonTree)adaptor.create(C_ED34);
            adaptor.addChild(root_0, C_ED34_tree);

            dbg.location(145,32);
             retval.node = (expression33!=null?expression33.node:null); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(146, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "elseifblockcomment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:148:1: elseiflinecomment returns [ExpressionNode node] : C_LN_ST ELSEIF expression C_LN_ED ;
    public final TwoWaySqlParser.elseiflinecomment_return elseiflinecomment() throws RecognitionException {
        TwoWaySqlParser.elseiflinecomment_return retval = new TwoWaySqlParser.elseiflinecomment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token C_LN_ST35=null;
        Token ELSEIF36=null;
        Token C_LN_ED38=null;
        TwoWaySqlParser.expression_return expression37 = null;


        CommonTree C_LN_ST35_tree=null;
        CommonTree ELSEIF36_tree=null;
        CommonTree C_LN_ED38_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "elseiflinecomment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(148, 1);

        try {
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:149:2: ( C_LN_ST ELSEIF expression C_LN_ED )
            dbg.enterAlt(1);

            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:149:4: C_LN_ST ELSEIF expression C_LN_ED
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(149,4);
            C_LN_ST35=(Token)match(input,C_LN_ST,FOLLOW_C_LN_ST_in_elseiflinecomment465); 
            C_LN_ST35_tree = (CommonTree)adaptor.create(C_LN_ST35);
            adaptor.addChild(root_0, C_LN_ST35_tree);

            dbg.location(149,12);
            ELSEIF36=(Token)match(input,ELSEIF,FOLLOW_ELSEIF_in_elseiflinecomment467); 
            ELSEIF36_tree = (CommonTree)adaptor.create(ELSEIF36);
            adaptor.addChild(root_0, ELSEIF36_tree);

            dbg.location(149,19);
            pushFollow(FOLLOW_expression_in_elseiflinecomment469);
            expression37=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression37.getTree());
            dbg.location(149,30);
            C_LN_ED38=(Token)match(input,C_LN_ED,FOLLOW_C_LN_ED_in_elseiflinecomment471); 
            C_LN_ED38_tree = (CommonTree)adaptor.create(C_LN_ED38);
            adaptor.addChild(root_0, C_LN_ED38_tree);

            dbg.location(149,38);
             retval.node = (expression37!=null?expression37.node:null); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(150, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "elseiflinecomment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "elseiflinecomment"

    public static class elsenode_return extends ParserRuleReturnScope {
        public LinkedList<QueryNode> list;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elsenode"
    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:152:1: elsenode returns [LinkedList<QueryNode> list] : elsecomment nodelist ;
    public final TwoWaySqlParser.elsenode_return elsenode() throws RecognitionException {
        TwoWaySqlParser.elsenode_return retval = new TwoWaySqlParser.elsenode_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        TwoWaySqlParser.elsecomment_return elsecomment39 = null;

        TwoWaySqlParser.nodelist_return nodelist40 = null;



        try { dbg.enterRule(getGrammarFileName(), "elsenode");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(152, 1);

        try {
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:153:2: ( elsecomment nodelist )
            dbg.enterAlt(1);

            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:154:2: elsecomment nodelist
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(154,2);
            pushFollow(FOLLOW_elsecomment_in_elsenode487);
            elsecomment39=elsecomment();

            state._fsp--;

            adaptor.addChild(root_0, elsecomment39.getTree());
            dbg.location(154,14);
            pushFollow(FOLLOW_nodelist_in_elsenode489);
            nodelist40=nodelist();

            state._fsp--;

            adaptor.addChild(root_0, nodelist40.getTree());
            dbg.location(154,23);
             retval.list = (nodelist40!=null?nodelist40.list:null); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(155, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "elsenode");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "elsenode"

    public static class elsecomment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elsecomment"
    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:157:1: elsecomment : ( C_ST ELSE C_ED | C_LN_ST ELSE C_LN_ED ) ;
    public final TwoWaySqlParser.elsecomment_return elsecomment() throws RecognitionException {
        TwoWaySqlParser.elsecomment_return retval = new TwoWaySqlParser.elsecomment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token C_ST41=null;
        Token ELSE42=null;
        Token C_ED43=null;
        Token C_LN_ST44=null;
        Token ELSE45=null;
        Token C_LN_ED46=null;

        CommonTree C_ST41_tree=null;
        CommonTree ELSE42_tree=null;
        CommonTree C_ED43_tree=null;
        CommonTree C_LN_ST44_tree=null;
        CommonTree ELSE45_tree=null;
        CommonTree C_LN_ED46_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "elsecomment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(157, 1);

        try {
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:157:13: ( ( C_ST ELSE C_ED | C_LN_ST ELSE C_LN_ED ) )
            dbg.enterAlt(1);

            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:158:2: ( C_ST ELSE C_ED | C_LN_ST ELSE C_LN_ED )
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(158,2);
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:158:2: ( C_ST ELSE C_ED | C_LN_ST ELSE C_LN_ED )
            int alt7=2;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:158:3: C_ST ELSE C_ED
                    {
                    dbg.location(158,3);
                    C_ST41=(Token)match(input,C_ST,FOLLOW_C_ST_in_elsecomment502); 
                    C_ST41_tree = (CommonTree)adaptor.create(C_ST41);
                    adaptor.addChild(root_0, C_ST41_tree);

                    dbg.location(158,8);
                    ELSE42=(Token)match(input,ELSE,FOLLOW_ELSE_in_elsecomment504); 
                    ELSE42_tree = (CommonTree)adaptor.create(ELSE42);
                    adaptor.addChild(root_0, ELSE42_tree);

                    dbg.location(158,13);
                    C_ED43=(Token)match(input,C_ED,FOLLOW_C_ED_in_elsecomment506); 
                    C_ED43_tree = (CommonTree)adaptor.create(C_ED43);
                    adaptor.addChild(root_0, C_ED43_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:158:20: C_LN_ST ELSE C_LN_ED
                    {
                    dbg.location(158,20);
                    C_LN_ST44=(Token)match(input,C_LN_ST,FOLLOW_C_LN_ST_in_elsecomment510); 
                    C_LN_ST44_tree = (CommonTree)adaptor.create(C_LN_ST44);
                    adaptor.addChild(root_0, C_LN_ST44_tree);

                    dbg.location(158,28);
                    ELSE45=(Token)match(input,ELSE,FOLLOW_ELSE_in_elsecomment512); 
                    ELSE45_tree = (CommonTree)adaptor.create(ELSE45);
                    adaptor.addChild(root_0, ELSE45_tree);

                    dbg.location(158,33);
                    C_LN_ED46=(Token)match(input,C_LN_ED,FOLLOW_C_LN_ED_in_elsecomment514); 
                    C_LN_ED46_tree = (CommonTree)adaptor.create(C_LN_ED46);
                    adaptor.addChild(root_0, C_LN_ED46_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(158, 42);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "elsecomment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:160:1: expression returns [ExpressionNode node] : charactors ;
    public final TwoWaySqlParser.expression_return expression() throws RecognitionException {
        TwoWaySqlParser.expression_return retval = new TwoWaySqlParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        TwoWaySqlParser.charactors_return charactors47 = null;




        		retval.node = new ExpressionNode();
        	
        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(160, 1);

        try {
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:167:2: ( charactors )
            dbg.enterAlt(1);

            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:168:2: charactors
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(168,2);
            pushFollow(FOLLOW_charactors_in_expression541);
            charactors47=charactors();

            state._fsp--;

            adaptor.addChild(root_0, charactors47.getTree());
            dbg.location(168,13);
            retval.node.update((charactors47!=null?((CommonTree)charactors47.tree):null));

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            		retval.node.freeze();
            	
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(169, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:171:1: begincomment returns [BeginNode node] : ( ( C_ST BEGIN C_ED | C_LN_ST BEGIN C_LN_ED ) nodelist endcomment ) ;
    public final TwoWaySqlParser.begincomment_return begincomment() throws RecognitionException {
        TwoWaySqlParser.begincomment_return retval = new TwoWaySqlParser.begincomment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token C_ST48=null;
        Token BEGIN49=null;
        Token C_ED50=null;
        Token C_LN_ST51=null;
        Token BEGIN52=null;
        Token C_LN_ED53=null;
        TwoWaySqlParser.nodelist_return nodelist54 = null;

        TwoWaySqlParser.endcomment_return endcomment55 = null;


        CommonTree C_ST48_tree=null;
        CommonTree BEGIN49_tree=null;
        CommonTree C_ED50_tree=null;
        CommonTree C_LN_ST51_tree=null;
        CommonTree BEGIN52_tree=null;
        CommonTree C_LN_ED53_tree=null;


        		retval.node = new BeginNode();
        	
        try { dbg.enterRule(getGrammarFileName(), "begincomment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(171, 1);

        try {
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:178:2: ( ( ( C_ST BEGIN C_ED | C_LN_ST BEGIN C_LN_ED ) nodelist endcomment ) )
            dbg.enterAlt(1);

            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:179:2: ( ( C_ST BEGIN C_ED | C_LN_ST BEGIN C_LN_ED ) nodelist endcomment )
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(179,2);
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:179:2: ( ( C_ST BEGIN C_ED | C_LN_ST BEGIN C_LN_ED ) nodelist endcomment )
            dbg.enterAlt(1);

            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:180:3: ( C_ST BEGIN C_ED | C_LN_ST BEGIN C_LN_ED ) nodelist endcomment
            {
            dbg.location(180,3);
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:180:3: ( C_ST BEGIN C_ED | C_LN_ST BEGIN C_LN_ED )
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:180:4: C_ST BEGIN C_ED
                    {
                    dbg.location(180,4);
                    C_ST48=(Token)match(input,C_ST,FOLLOW_C_ST_in_begincomment575); 
                    C_ST48_tree = (CommonTree)adaptor.create(C_ST48);
                    adaptor.addChild(root_0, C_ST48_tree);

                    dbg.location(180,9);
                    BEGIN49=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_begincomment577); 
                    BEGIN49_tree = (CommonTree)adaptor.create(BEGIN49);
                    adaptor.addChild(root_0, BEGIN49_tree);

                    dbg.location(180,15);
                    C_ED50=(Token)match(input,C_ED,FOLLOW_C_ED_in_begincomment579); 
                    C_ED50_tree = (CommonTree)adaptor.create(C_ED50);
                    adaptor.addChild(root_0, C_ED50_tree);

                    dbg.location(180,20);
                    retval.node.update(C_ST48);

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:181:6: C_LN_ST BEGIN C_LN_ED
                    {
                    dbg.location(181,6);
                    C_LN_ST51=(Token)match(input,C_LN_ST,FOLLOW_C_LN_ST_in_begincomment588); 
                    C_LN_ST51_tree = (CommonTree)adaptor.create(C_LN_ST51);
                    adaptor.addChild(root_0, C_LN_ST51_tree);

                    dbg.location(181,14);
                    BEGIN52=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_begincomment590); 
                    BEGIN52_tree = (CommonTree)adaptor.create(BEGIN52);
                    adaptor.addChild(root_0, BEGIN52_tree);

                    dbg.location(181,20);
                    C_LN_ED53=(Token)match(input,C_LN_ED,FOLLOW_C_LN_ED_in_begincomment592); 
                    C_LN_ED53_tree = (CommonTree)adaptor.create(C_LN_ED53);
                    adaptor.addChild(root_0, C_LN_ED53_tree);

                    dbg.location(181,29);
                    retval.node.update(C_LN_ST51);

                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}

            dbg.location(182,5);
            pushFollow(FOLLOW_nodelist_in_begincomment601);
            nodelist54=nodelist();

            state._fsp--;

            adaptor.addChild(root_0, nodelist54.getTree());
            dbg.location(182,14);
            pushFollow(FOLLOW_endcomment_in_begincomment603);
            endcomment55=endcomment();

            state._fsp--;

            adaptor.addChild(root_0, endcomment55.getTree());

            }

            dbg.location(184,2);

            		retval.node.setChildren((nodelist54!=null?nodelist54.list:null));
            		retval.node.update((endcomment55!=null?((CommonTree)endcomment55.tree):null));
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            		retval.node.freeze();
            	
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(188, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "begincomment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "begincomment"

    public static class endcomment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "endcomment"
    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:190:1: endcomment : ( C_ST END C_ED | C_LN_ST END C_LN_ED );
    public final TwoWaySqlParser.endcomment_return endcomment() throws RecognitionException {
        TwoWaySqlParser.endcomment_return retval = new TwoWaySqlParser.endcomment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token C_ST56=null;
        Token END57=null;
        Token C_ED58=null;
        Token C_LN_ST59=null;
        Token END60=null;
        Token C_LN_ED61=null;

        CommonTree C_ST56_tree=null;
        CommonTree END57_tree=null;
        CommonTree C_ED58_tree=null;
        CommonTree C_LN_ST59_tree=null;
        CommonTree END60_tree=null;
        CommonTree C_LN_ED61_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "endcomment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(190, 1);

        try {
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:190:12: ( C_ST END C_ED | C_LN_ST END C_LN_ED )
            int alt9=2;
            try { dbg.enterDecision(9);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:191:2: C_ST END C_ED
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(191,2);
                    C_ST56=(Token)match(input,C_ST,FOLLOW_C_ST_in_endcomment619); 
                    C_ST56_tree = (CommonTree)adaptor.create(C_ST56);
                    adaptor.addChild(root_0, C_ST56_tree);

                    dbg.location(191,7);
                    END57=(Token)match(input,END,FOLLOW_END_in_endcomment621); 
                    END57_tree = (CommonTree)adaptor.create(END57);
                    adaptor.addChild(root_0, END57_tree);

                    dbg.location(191,11);
                    C_ED58=(Token)match(input,C_ED,FOLLOW_C_ED_in_endcomment623); 
                    C_ED58_tree = (CommonTree)adaptor.create(C_ED58);
                    adaptor.addChild(root_0, C_ED58_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:191:18: C_LN_ST END C_LN_ED
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(191,18);
                    C_LN_ST59=(Token)match(input,C_LN_ST,FOLLOW_C_LN_ST_in_endcomment627); 
                    C_LN_ST59_tree = (CommonTree)adaptor.create(C_LN_ST59);
                    adaptor.addChild(root_0, C_LN_ST59_tree);

                    dbg.location(191,26);
                    END60=(Token)match(input,END,FOLLOW_END_in_endcomment629); 
                    END60_tree = (CommonTree)adaptor.create(END60);
                    adaptor.addChild(root_0, END60_tree);

                    dbg.location(191,30);
                    C_LN_ED61=(Token)match(input,C_LN_ED,FOLLOW_C_LN_ED_in_endcomment631); 
                    C_LN_ED61_tree = (CommonTree)adaptor.create(C_LN_ED61);
                    adaptor.addChild(root_0, C_LN_ED61_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(191, 37);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "endcomment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:193:1: bindcomment returns [BindNode node] : ( C_ST SYM_BIND expression C_ED txt ) ;
    public final TwoWaySqlParser.bindcomment_return bindcomment() throws RecognitionException {
        TwoWaySqlParser.bindcomment_return retval = new TwoWaySqlParser.bindcomment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token C_ST62=null;
        Token SYM_BIND63=null;
        Token C_ED65=null;
        TwoWaySqlParser.expression_return expression64 = null;

        TwoWaySqlParser.txt_return txt66 = null;


        CommonTree C_ST62_tree=null;
        CommonTree SYM_BIND63_tree=null;
        CommonTree C_ED65_tree=null;


        		retval.node = new BindNode();
        	
        try { dbg.enterRule(getGrammarFileName(), "bindcomment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(193, 1);

        try {
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:200:2: ( ( C_ST SYM_BIND expression C_ED txt ) )
            dbg.enterAlt(1);

            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:201:2: ( C_ST SYM_BIND expression C_ED txt )
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(201,2);
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:201:2: ( C_ST SYM_BIND expression C_ED txt )
            dbg.enterAlt(1);

            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:201:3: C_ST SYM_BIND expression C_ED txt
            {
            dbg.location(201,3);
            C_ST62=(Token)match(input,C_ST,FOLLOW_C_ST_in_bindcomment657); 
            C_ST62_tree = (CommonTree)adaptor.create(C_ST62);
            adaptor.addChild(root_0, C_ST62_tree);

            dbg.location(201,8);
            SYM_BIND63=(Token)match(input,SYM_BIND,FOLLOW_SYM_BIND_in_bindcomment659); 
            SYM_BIND63_tree = (CommonTree)adaptor.create(SYM_BIND63);
            adaptor.addChild(root_0, SYM_BIND63_tree);

            dbg.location(201,17);
            pushFollow(FOLLOW_expression_in_bindcomment661);
            expression64=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression64.getTree());
            dbg.location(201,28);
            C_ED65=(Token)match(input,C_ED,FOLLOW_C_ED_in_bindcomment663); 
            C_ED65_tree = (CommonTree)adaptor.create(C_ED65);
            adaptor.addChild(root_0, C_ED65_tree);

            dbg.location(201,33);
            pushFollow(FOLLOW_txt_in_bindcomment665);
            txt66=txt();

            state._fsp--;

            adaptor.addChild(root_0, txt66.getTree());

            }

            dbg.location(202,2);

            		retval.node.update(C_ST62);
            		retval.node.setExpression((expression64!=null?expression64.node:null));
            		retval.node.setSkipped((txt66!=null?txt66.node:null));
            		retval.node.update((txt66!=null?((CommonTree)txt66.tree):null));
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            		retval.node.freeze();
            	
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(208, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "bindcomment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:210:1: inbind returns [InBindNode node] : IN C_ST SYM_BIND expression C_ED SYM_LP inbindchars ( SYM_C inbindchars )* SYM_RP ;
    public final TwoWaySqlParser.inbind_return inbind() throws RecognitionException {
        TwoWaySqlParser.inbind_return retval = new TwoWaySqlParser.inbind_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IN67=null;
        Token C_ST68=null;
        Token SYM_BIND69=null;
        Token C_ED71=null;
        Token SYM_LP72=null;
        Token SYM_C74=null;
        Token SYM_RP76=null;
        TwoWaySqlParser.expression_return expression70 = null;

        TwoWaySqlParser.inbindchars_return inbindchars73 = null;

        TwoWaySqlParser.inbindchars_return inbindchars75 = null;


        CommonTree IN67_tree=null;
        CommonTree C_ST68_tree=null;
        CommonTree SYM_BIND69_tree=null;
        CommonTree C_ED71_tree=null;
        CommonTree SYM_LP72_tree=null;
        CommonTree SYM_C74_tree=null;
        CommonTree SYM_RP76_tree=null;


        		retval.node = new InBindNode();
        		TxtNode skip = new TxtNode();
        	
        try { dbg.enterRule(getGrammarFileName(), "inbind");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(210, 1);

        try {
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:218:2: ( IN C_ST SYM_BIND expression C_ED SYM_LP inbindchars ( SYM_C inbindchars )* SYM_RP )
            dbg.enterAlt(1);

            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:219:2: IN C_ST SYM_BIND expression C_ED SYM_LP inbindchars ( SYM_C inbindchars )* SYM_RP
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(219,2);
            IN67=(Token)match(input,IN,FOLLOW_IN_in_inbind695); 
            IN67_tree = (CommonTree)adaptor.create(IN67);
            adaptor.addChild(root_0, IN67_tree);

            dbg.location(219,5);
            C_ST68=(Token)match(input,C_ST,FOLLOW_C_ST_in_inbind697); 
            C_ST68_tree = (CommonTree)adaptor.create(C_ST68);
            adaptor.addChild(root_0, C_ST68_tree);

            dbg.location(219,10);
            SYM_BIND69=(Token)match(input,SYM_BIND,FOLLOW_SYM_BIND_in_inbind699); 
            SYM_BIND69_tree = (CommonTree)adaptor.create(SYM_BIND69);
            adaptor.addChild(root_0, SYM_BIND69_tree);

            dbg.location(219,19);
            pushFollow(FOLLOW_expression_in_inbind701);
            expression70=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression70.getTree());
            dbg.location(219,30);
            C_ED71=(Token)match(input,C_ED,FOLLOW_C_ED_in_inbind703); 
            C_ED71_tree = (CommonTree)adaptor.create(C_ED71);
            adaptor.addChild(root_0, C_ED71_tree);

            dbg.location(219,35);
            SYM_LP72=(Token)match(input,SYM_LP,FOLLOW_SYM_LP_in_inbind705); 
            SYM_LP72_tree = (CommonTree)adaptor.create(SYM_LP72);
            adaptor.addChild(root_0, SYM_LP72_tree);

            dbg.location(219,42);
            pushFollow(FOLLOW_inbindchars_in_inbind707);
            inbindchars73=inbindchars();

            state._fsp--;

            adaptor.addChild(root_0, inbindchars73.getTree());
            dbg.location(219,54);
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:219:54: ( SYM_C inbindchars )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==SYM_C) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:219:55: SYM_C inbindchars
            	    {
            	    dbg.location(219,55);
            	    SYM_C74=(Token)match(input,SYM_C,FOLLOW_SYM_C_in_inbind710); 
            	    SYM_C74_tree = (CommonTree)adaptor.create(SYM_C74);
            	    adaptor.addChild(root_0, SYM_C74_tree);

            	    dbg.location(219,61);
            	    pushFollow(FOLLOW_inbindchars_in_inbind712);
            	    inbindchars75=inbindchars();

            	    state._fsp--;

            	    adaptor.addChild(root_0, inbindchars75.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}

            dbg.location(219,75);
            SYM_RP76=(Token)match(input,SYM_RP,FOLLOW_SYM_RP_in_inbind716); 
            SYM_RP76_tree = (CommonTree)adaptor.create(SYM_RP76);
            adaptor.addChild(root_0, SYM_RP76_tree);

            dbg.location(220,2);

            		retval.node.update(IN67);
            		retval.node.setExpression((expression70!=null?expression70.node:null));
            		skip.update(SYM_LP72);
            		skip.update(SYM_RP76);
            		retval.node.setSkipped(skip);
            		retval.node.update(SYM_RP76);
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            		retval.node.freeze();
            	
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(228, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inbind");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "inbind"

    public static class inbindchars_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inbindchars"
    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:230:1: inbindchars : ( IDENT | SYMBOLS | SYM_C | QUOTED )+ ;
    public final TwoWaySqlParser.inbindchars_return inbindchars() throws RecognitionException {
        TwoWaySqlParser.inbindchars_return retval = new TwoWaySqlParser.inbindchars_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set77=null;

        CommonTree set77_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inbindchars");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(230, 1);

        try {
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:230:13: ( ( IDENT | SYMBOLS | SYM_C | QUOTED )+ )
            dbg.enterAlt(1);

            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:230:15: ( IDENT | SYMBOLS | SYM_C | QUOTED )+
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(230,15);
            // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:230:15: ( IDENT | SYMBOLS | SYM_C | QUOTED )+
            int cnt11=0;
            try { dbg.enterSubRule(11);

            loop11:
            do {
                int alt11=2;
                try { dbg.enterDecision(11);

                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=IDENT && LA11_0<=QUOTED)||LA11_0==SYM_C) ) {
                    alt11=1;
                }


                } finally {dbg.exitDecision(11);}

                switch (alt11) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\development\\java\\workspace-3.4\\werkzeugkasten\\twowaysql\\werkzeugkasten\\twowaysql\\grammar\\TwoWaySql.g:
            	    {
            	    dbg.location(230,15);
            	    set77=(Token)input.LT(1);
            	    if ( (input.LA(1)>=IDENT && input.LA(1)<=QUOTED)||input.LA(1)==SYM_C ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (CommonTree)adaptor.create(set77));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt11++;
            } while (true);
            } finally {dbg.exitSubRule(11);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(230, 49);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inbindchars");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
        "\1\15\2\22\2\uffff\1\14\2\uffff\1\14\1\24\1\uffff";
    static final String DFA3_acceptS =
        "\3\uffff\1\1\1\2\1\uffff\1\4\1\5\2\uffff\1\3";
    static final String DFA3_specialS =
        "\13\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\1\uffff\1\2",
            "\3\6\1\5\3\6\4\uffff\1\4\2\uffff\1\3",
            "\7\7\7\uffff\1\3",
            "",
            "",
            "\7\10\1\uffff\1\6",
            "",
            "",
            "\7\10\1\uffff\1\11",
            "\7\12\1\6\1\uffff\1\6\6\uffff\1\6",
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
            return "70:1: comment returns [QueryNode node] : ( begincomment | ifcomment | bindcomment | blockcomment | linecomment );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_nodelist_in_twowaySQL79 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_twowaySQL81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_nodelist103 = new BitSet(new long[]{0x0000000000102FF2L});
    public static final BitSet FOLLOW_inbind_in_nodelist110 = new BitSet(new long[]{0x0000000000102FF2L});
    public static final BitSet FOLLOW_txt_in_nodelist117 = new BitSet(new long[]{0x0000000000102FF2L});
    public static final BitSet FOLLOW_set_in_charactors133 = new BitSet(new long[]{0x00000000000007F2L});
    public static final BitSet FOLLOW_charactors_in_txt186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begincomment_in_comment202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifcomment_in_comment209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bindcomment_in_comment216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockcomment_in_comment223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_linecomment_in_comment230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_C_ST_in_blockcomment259 = new BitSet(new long[]{0x0000000000103FF0L});
    public static final BitSet FOLLOW_charactors_in_blockcomment261 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_C_ED_in_blockcomment263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_C_LN_ST_in_linecomment292 = new BitSet(new long[]{0x0000000000106FF0L});
    public static final BitSet FOLLOW_charactors_in_linecomment294 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_C_LN_ED_in_linecomment296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_C_ST_in_ifcomment326 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IF_in_ifcomment328 = new BitSet(new long[]{0x0000000000102FF0L});
    public static final BitSet FOLLOW_expression_in_ifcomment330 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_C_ED_in_ifcomment332 = new BitSet(new long[]{0x0000000000102FF0L});
    public static final BitSet FOLLOW_nodelist_in_ifcomment338 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_elseifnode_in_ifcomment345 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_elsenode_in_ifcomment355 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_endcomment_in_ifcomment363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elseifcomment_in_elseifnode397 = new BitSet(new long[]{0x0000000000102FF0L});
    public static final BitSet FOLLOW_nodelist_in_elseifnode399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elseifblockcomment_in_elseifcomment418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elseiflinecomment_in_elseifcomment426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_C_ST_in_elseifblockcomment444 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ELSEIF_in_elseifblockcomment446 = new BitSet(new long[]{0x0000000000102FF0L});
    public static final BitSet FOLLOW_expression_in_elseifblockcomment448 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_C_ED_in_elseifblockcomment450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_C_LN_ST_in_elseiflinecomment465 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ELSEIF_in_elseiflinecomment467 = new BitSet(new long[]{0x0000000000102FF0L});
    public static final BitSet FOLLOW_expression_in_elseiflinecomment469 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_C_LN_ED_in_elseiflinecomment471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elsecomment_in_elsenode487 = new BitSet(new long[]{0x0000000000102FF0L});
    public static final BitSet FOLLOW_nodelist_in_elsenode489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_C_ST_in_elsecomment502 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ELSE_in_elsecomment504 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_C_ED_in_elsecomment506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_C_LN_ST_in_elsecomment510 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ELSE_in_elsecomment512 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_C_LN_ED_in_elsecomment514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_charactors_in_expression541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_C_ST_in_begincomment575 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_BEGIN_in_begincomment577 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_C_ED_in_begincomment579 = new BitSet(new long[]{0x0000000000102FF0L});
    public static final BitSet FOLLOW_C_LN_ST_in_begincomment588 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_BEGIN_in_begincomment590 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_C_LN_ED_in_begincomment592 = new BitSet(new long[]{0x0000000000102FF0L});
    public static final BitSet FOLLOW_nodelist_in_begincomment601 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_endcomment_in_begincomment603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_C_ST_in_endcomment619 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_END_in_endcomment621 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_C_ED_in_endcomment623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_C_LN_ST_in_endcomment627 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_END_in_endcomment629 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_C_LN_ED_in_endcomment631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_C_ST_in_bindcomment657 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_SYM_BIND_in_bindcomment659 = new BitSet(new long[]{0x0000000000102FF0L});
    public static final BitSet FOLLOW_expression_in_bindcomment661 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_C_ED_in_bindcomment663 = new BitSet(new long[]{0x0000000000102FF0L});
    public static final BitSet FOLLOW_txt_in_bindcomment665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_inbind695 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_C_ST_in_inbind697 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_SYM_BIND_in_inbind699 = new BitSet(new long[]{0x0000000000102FF0L});
    public static final BitSet FOLLOW_expression_in_inbind701 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_C_ED_in_inbind703 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SYM_LP_in_inbind705 = new BitSet(new long[]{0x0000000000000170L});
    public static final BitSet FOLLOW_inbindchars_in_inbind707 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_SYM_C_in_inbind710 = new BitSet(new long[]{0x0000000000000170L});
    public static final BitSet FOLLOW_inbindchars_in_inbind712 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_SYM_RP_in_inbind716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_inbindchars728 = new BitSet(new long[]{0x0000000000000172L});

}