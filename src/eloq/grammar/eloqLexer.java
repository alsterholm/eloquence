// Generated from /Users/andreas/code/sys/eloquence/src/eloq/grammar/eloq.g4 by ANTLR 4.5.1
package eloq.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class eloqLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, ID=13, INT=14, WS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "ID", "INT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'var'", "'='", "'print'", "'+'", "'*'", "'for'", "'through'", "'as'", 
		"'{'", "'}'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "ID", "INT", "WS"
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


	public eloqLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "eloq.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21Y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\6\16J\n\16\r\16\16\16K\3\17\6\17O\n\17\r\17\16\17P\3\20\6\20T\n\20"+
		"\r\20\16\20U\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21\3\2\3\6\2\13\f\17\17\"\"==[\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5%\3\2\2\2\7\'"+
		"\3\2\2\2\t-\3\2\2\2\13/\3\2\2\2\r\61\3\2\2\2\17\65\3\2\2\2\21=\3\2\2\2"+
		"\23@\3\2\2\2\25B\3\2\2\2\27D\3\2\2\2\31F\3\2\2\2\33I\3\2\2\2\35N\3\2\2"+
		"\2\37S\3\2\2\2!\"\7x\2\2\"#\7c\2\2#$\7t\2\2$\4\3\2\2\2%&\7?\2\2&\6\3\2"+
		"\2\2\'(\7r\2\2()\7t\2\2)*\7k\2\2*+\7p\2\2+,\7v\2\2,\b\3\2\2\2-.\7-\2\2"+
		".\n\3\2\2\2/\60\7,\2\2\60\f\3\2\2\2\61\62\7h\2\2\62\63\7q\2\2\63\64\7"+
		"t\2\2\64\16\3\2\2\2\65\66\7v\2\2\66\67\7j\2\2\678\7t\2\289\7q\2\29:\7"+
		"w\2\2:;\7i\2\2;<\7j\2\2<\20\3\2\2\2=>\7c\2\2>?\7u\2\2?\22\3\2\2\2@A\7"+
		"}\2\2A\24\3\2\2\2BC\7\177\2\2C\26\3\2\2\2DE\7*\2\2E\30\3\2\2\2FG\7+\2"+
		"\2G\32\3\2\2\2HJ\4c|\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\34\3\2"+
		"\2\2MO\4\62;\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\36\3\2\2\2RT\t"+
		"\2\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\b\20\2\2X "+
		"\3\2\2\2\6\2KPU\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}