// Generated from /home/ds/Desktop/CPraticas3/Ex9/CalcGrammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, WORD=11, NUMBER=12, ID=13, LINE_COMMENT=14, COMMENT=15, WHITESPACE=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "WORD", "LOWER_LETTERS", "NUMBER", "DIGIT", "ID", "UPPER_LETTERS", 
		"LINE_COMMENT", "COMMENT", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", "'='", "'+'", "'&'", "'\\'", "'('", "')'", "'{'", "','", 
		"'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "WORD", 
		"NUMBER", "ID", "LINE_COMMENT", "COMMENT", "WHITESPACE"
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


	public CalcGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CalcGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22t\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\6\f?\n\f\r\f\16\f@\3\r\3\r\3\16\5"+
		"\16F\n\16\3\16\6\16I\n\16\r\16\16\16J\3\17\3\17\3\20\6\20P\n\20\r\20\16"+
		"\20Q\3\21\3\21\3\22\3\22\3\22\3\22\7\22Z\n\22\f\22\16\22]\13\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23g\n\23\f\23\16\23j\13\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\4[h\2\25\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\2\33\16\35\2\37\17!\2#\20%\21\'\22\3\2"+
		"\5\4\2--//\3\2\62;\5\2\13\f\17\17\"\"\2v\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\33\3\2\2\2\2\37\3\2\2\2\2#\3"+
		"\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2"+
		"\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17\65\3\2\2\2\21\67\3\2\2\2\239\3\2\2"+
		"\2\25;\3\2\2\2\27>\3\2\2\2\31B\3\2\2\2\33E\3\2\2\2\35L\3\2\2\2\37O\3\2"+
		"\2\2!S\3\2\2\2#U\3\2\2\2%b\3\2\2\2\'p\3\2\2\2)*\7\f\2\2*\4\3\2\2\2+,\7"+
		"?\2\2,\6\3\2\2\2-.\7-\2\2.\b\3\2\2\2/\60\7(\2\2\60\n\3\2\2\2\61\62\7^"+
		"\2\2\62\f\3\2\2\2\63\64\7*\2\2\64\16\3\2\2\2\65\66\7+\2\2\66\20\3\2\2"+
		"\2\678\7}\2\28\22\3\2\2\29:\7.\2\2:\24\3\2\2\2;<\7\177\2\2<\26\3\2\2\2"+
		"=?\5\31\r\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\30\3\2\2\2BC\4c|"+
		"\2C\32\3\2\2\2DF\t\2\2\2ED\3\2\2\2EF\3\2\2\2FH\3\2\2\2GI\5\35\17\2HG\3"+
		"\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\34\3\2\2\2LM\t\3\2\2M\36\3\2\2\2"+
		"NP\5!\21\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R \3\2\2\2ST\4C\\\2"+
		"T\"\3\2\2\2UV\7/\2\2VW\7/\2\2W[\3\2\2\2XZ\13\2\2\2YX\3\2\2\2Z]\3\2\2\2"+
		"[\\\3\2\2\2[Y\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\f\2\2_`\3\2\2\2`a\b\22"+
		"\2\2a$\3\2\2\2bc\7\61\2\2cd\7,\2\2dh\3\2\2\2eg\13\2\2\2fe\3\2\2\2gj\3"+
		"\2\2\2hi\3\2\2\2hf\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7,\2\2lm\7\61\2\2mn\3"+
		"\2\2\2no\b\23\2\2o&\3\2\2\2pq\t\4\2\2qr\3\2\2\2rs\b\24\2\2s(\3\2\2\2\t"+
		"\2@EJQ[h\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}