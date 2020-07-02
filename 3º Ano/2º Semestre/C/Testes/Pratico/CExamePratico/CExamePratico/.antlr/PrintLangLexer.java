// Generated from /home/ds/Desktop/CExamePratico/PrintLang.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PrintLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ID=9, 
		STRING=10, LINE_COMMENT=11, COMMENT=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "ID", 
		"LETTER", "DIGIT", "STRING", "ESC", "LINE_COMMENT", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", "'print'", "':'", "'input('", "')'", "'+'", "'('", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "ID", "STRING", 
		"LINE_COMMENT", "COMMENT", "WS"
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


	public PrintLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PrintLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u0082\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\7\n@\n\n\f\n\16\nC\13\n\5\nE\n\n"+
		"\3\13\6\13H\n\13\r\13\16\13I\3\f\6\fM\n\f\r\f\16\fN\3\r\3\r\3\r\7\rT\n"+
		"\r\f\r\16\rW\13\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16_\n\16\3\17\3\17\3\17"+
		"\3\17\7\17e\n\17\f\17\16\17h\13\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\7\20r\n\20\f\20\16\20u\13\20\3\20\3\20\3\20\3\20\3\20\3\21\6\21"+
		"}\n\21\r\21\16\21~\3\21\3\21\5Ufs\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\2\27\2\31\f\33\2\35\r\37\16!\17\3\2\5\5\2C\\aac|\3\2\62;\5"+
		"\2\13\f\17\17\"\"\2\u0089\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\31\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2"+
		"\7+\3\2\2\2\t-\3\2\2\2\13\64\3\2\2\2\r\66\3\2\2\2\178\3\2\2\2\21:\3\2"+
		"\2\2\23D\3\2\2\2\25G\3\2\2\2\27L\3\2\2\2\31P\3\2\2\2\33^\3\2\2\2\35`\3"+
		"\2\2\2\37m\3\2\2\2!|\3\2\2\2#$\7\f\2\2$\4\3\2\2\2%&\7r\2\2&\'\7t\2\2\'"+
		"(\7k\2\2()\7p\2\2)*\7v\2\2*\6\3\2\2\2+,\7<\2\2,\b\3\2\2\2-.\7k\2\2./\7"+
		"p\2\2/\60\7r\2\2\60\61\7w\2\2\61\62\7v\2\2\62\63\7*\2\2\63\n\3\2\2\2\64"+
		"\65\7+\2\2\65\f\3\2\2\2\66\67\7-\2\2\67\16\3\2\2\289\7*\2\29\20\3\2\2"+
		"\2:;\7\61\2\2;\22\3\2\2\2<E\5\25\13\2=@\5\25\13\2>@\5\27\f\2?=\3\2\2\2"+
		"?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BE\3\2\2\2CA\3\2\2\2D<\3\2\2\2"+
		"DA\3\2\2\2E\24\3\2\2\2FH\t\2\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2"+
		"\2J\26\3\2\2\2KM\t\3\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\30\3"+
		"\2\2\2PU\7$\2\2QT\5\33\16\2RT\13\2\2\2SQ\3\2\2\2SR\3\2\2\2TW\3\2\2\2U"+
		"V\3\2\2\2US\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7$\2\2Y\32\3\2\2\2Z[\7^\2\2"+
		"[_\7$\2\2\\]\7^\2\2]_\7^\2\2^Z\3\2\2\2^\\\3\2\2\2_\34\3\2\2\2`a\7\61\2"+
		"\2ab\7\61\2\2bf\3\2\2\2ce\13\2\2\2dc\3\2\2\2eh\3\2\2\2fg\3\2\2\2fd\3\2"+
		"\2\2gi\3\2\2\2hf\3\2\2\2ij\7\f\2\2jk\3\2\2\2kl\b\17\2\2l\36\3\2\2\2mn"+
		"\7\61\2\2no\7,\2\2os\3\2\2\2pr\13\2\2\2qp\3\2\2\2ru\3\2\2\2st\3\2\2\2"+
		"sq\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7,\2\2wx\7\61\2\2xy\3\2\2\2yz\b\20\2"+
		"\2z \3\2\2\2{}\t\4\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0081\b\21\2\2\u0081\"\3\2\2\2\16\2?ADINSU^fs~\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}