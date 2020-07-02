// Generated from /home/ds/Desktop/CPraticasRemade/Ex7/CalculatorRemade.g4 by ANTLR 4.7.1

    import java.util.Map ; 
    import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorRemadeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, INT=8, ID=9, NEWLINE=10, 
		WS=11;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_assignment = 2, RULE_expr = 3;
	public static final String[] ruleNames = {
		"program", "stat", "assignment", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'*'", "'/'", "'+'", "'-'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "INT", "ID", "NEWLINE", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CalculatorRemade.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	 
	    protected Map<String,Double> symbolTable = new HashMap<>();

	public CalculatorRemadeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CalculatorRemadeParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << INT) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(8);
				stat();
				}
				}
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(14);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CalculatorRemadeParser.NEWLINE, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(22);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				((StatContext)_localctx).expr = expr(0);
				setState(17);
				match(NEWLINE);
				System.out.println(((StatContext)_localctx).expr.val);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(21);
				match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(CalculatorRemadeParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CalculatorRemadeParser.NEWLINE, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			((AssignmentContext)_localctx).ID = match(ID);
			setState(25);
			match(T__0);
			setState(26);
			((AssignmentContext)_localctx).expr = expr(0);
			setState(27);
			match(NEWLINE);
			 
			                symbolTable.put((((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getText():null),((AssignmentContext)_localctx).expr.val); //Just add it to the map (overrides if same ID is assigned twice)
			            
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public double val;
		public ExprContext e1;
		public Token INT;
		public Token ID;
		public ExprContext expr;
		public Token op;
		public ExprContext e2;
		public TerminalNode INT() { return getToken(CalculatorRemadeParser.INT, 0); }
		public TerminalNode ID() { return getToken(CalculatorRemadeParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(31);
				((ExprContext)_localctx).INT = match(INT);

				                ((ExprContext)_localctx).val =  Double.parseDouble((((ExprContext)_localctx).INT!=null?((ExprContext)_localctx).INT.getText():null)); //Just like the previous exercise this is probably the most important line..makes the whole return of value recursively idea work
				            
				}
				break;
			case ID:
				{
				setState(33);
				((ExprContext)_localctx).ID = match(ID);

				                if(symbolTable.containsKey((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null))) //Check if that ID has been declared as a variable or not
				                    ((ExprContext)_localctx).val =  symbolTable.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)); //If so, return its associated value :D
				                else{
				                    System.out.println("Error! " + (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null) + " not declared or initialized!");
				                    System.exit(1);
				                }
				            
				}
				break;
			case T__5:
				{
				setState(35);
				match(T__5);
				setState(36);
				((ExprContext)_localctx).expr = expr(0);
				setState(37);
				match(T__6);

				                ((ExprContext)_localctx).val =  ((ExprContext)_localctx).expr.val; //All we gotta do here is return the value...the fact we have an expr inside of it means we'll first calc the val of that expr before returning it so... IT JUST WORKS -Todd Howard
				            
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(52);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(42);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(43);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__1 || _la==T__2) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(44);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(6);

						                          if((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null).equals("*")){  //Check what operator we're using and then compute return value
						                              ((ExprContext)_localctx).val =  ((ExprContext)_localctx).e1.val * ((ExprContext)_localctx).e2.val;
						                          }else{
						                              ((ExprContext)_localctx).val =  ((ExprContext)_localctx).e1.val / ((ExprContext)_localctx).e2.val;
						                          }
						                      
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(47);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(48);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__4) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(49);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(5);

						                          if((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null).equals("+")){   //Check what operator we're using and then compute return value
						                              ((ExprContext)_localctx).val =  ((ExprContext)_localctx).e1.val + ((ExprContext)_localctx).e2.val;
						                          }else{
						                              ((ExprContext)_localctx).val =  ((ExprContext)_localctx).e1.val - ((ExprContext)_localctx).e2.val;
						                          };
						                      
						}
						break;
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r<\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\31\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5+\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\5\67\n\5\f\5\16\5:\13\5\3\5\2\3\b\6\2\4\6\b\2\4\3\2\4\5\3\2\6\7\2>\2"+
		"\r\3\2\2\2\4\30\3\2\2\2\6\32\3\2\2\2\b*\3\2\2\2\n\f\5\4\3\2\13\n\3\2\2"+
		"\2\f\17\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\20\3\2\2\2\17\r\3\2\2\2\20"+
		"\21\7\2\2\3\21\3\3\2\2\2\22\23\5\b\5\2\23\24\7\f\2\2\24\25\b\3\1\2\25"+
		"\31\3\2\2\2\26\31\5\6\4\2\27\31\7\f\2\2\30\22\3\2\2\2\30\26\3\2\2\2\30"+
		"\27\3\2\2\2\31\5\3\2\2\2\32\33\7\13\2\2\33\34\7\3\2\2\34\35\5\b\5\2\35"+
		"\36\7\f\2\2\36\37\b\4\1\2\37\7\3\2\2\2 !\b\5\1\2!\"\7\n\2\2\"+\b\5\1\2"+
		"#$\7\13\2\2$+\b\5\1\2%&\7\b\2\2&\'\5\b\5\2\'(\7\t\2\2()\b\5\1\2)+\3\2"+
		"\2\2* \3\2\2\2*#\3\2\2\2*%\3\2\2\2+8\3\2\2\2,-\f\7\2\2-.\t\2\2\2./\5\b"+
		"\5\b/\60\b\5\1\2\60\67\3\2\2\2\61\62\f\6\2\2\62\63\t\3\2\2\63\64\5\b\5"+
		"\7\64\65\b\5\1\2\65\67\3\2\2\2\66,\3\2\2\2\66\61\3\2\2\2\67:\3\2\2\28"+
		"\66\3\2\2\289\3\2\2\29\t\3\2\2\2:8\3\2\2\2\7\r\30*\668";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}