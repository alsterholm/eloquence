// Generated from /Users/andreas/code/sys/eloquence/src/eloq/grammar/eloq.g4 by ANTLR 4.5.1
package eloq.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class eloqParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, ID=13, INT=14, WS=15;
	public static final int
		RULE_file = 0, RULE_code = 1, RULE_statement = 2, RULE_block = 3, RULE_decl = 4, 
		RULE_assign = 5, RULE_print = 6, RULE_expr = 7, RULE_addExpr = 8, RULE_mulExpr = 9, 
		RULE_intervalLoop = 10, RULE_atomExpr = 11;
	public static final String[] ruleNames = {
		"file", "code", "statement", "block", "decl", "assign", "print", "expr", 
		"addExpr", "mulExpr", "intervalLoop", "atomExpr"
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

	@Override
	public String getGrammarFileName() { return "eloq.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public eloqParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eloqListener ) ((eloqListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eloqListener ) ((eloqListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			code();
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

	public static class CodeContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(eloqParser.EOF, 0); }
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eloqListener ) ((eloqListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eloqListener ) ((eloqListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code);
		try {
			setState(30);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case T__5:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				statement();
				setState(27);
				code();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StatementContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public IntervalLoopContext intervalLoop() {
			return getRuleContext(IntervalLoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eloqListener ) ((eloqListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eloqListener ) ((eloqListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(36);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				decl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				assign();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				print();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				intervalLoop();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eloqListener ) ((eloqListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eloqListener ) ((eloqListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__5) | (1L << ID))) != 0)) {
				{
				{
				setState(38);
				statement();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class DeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(eloqParser.ID, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eloqListener ) ((eloqListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eloqListener ) ((eloqListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__0);
			setState(45);
			match(ID);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(eloqParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eloqListener ) ((eloqListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eloqListener ) ((eloqListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(ID);
			setState(48);
			match(T__1);
			setState(49);
			expr();
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

	public static class PrintContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eloqListener ) ((eloqListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eloqListener ) ((eloqListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__2);
			setState(52);
			expr();
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
		public AtomExprContext atomExpr() {
			return getRuleContext(AtomExprContext.class,0);
		}
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public MulExprContext mulExpr() {
			return getRuleContext(MulExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eloqListener ) ((eloqListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eloqListener ) ((eloqListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		try {
			setState(57);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				atomExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				addExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				mulExpr();
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

	public static class AddExprContext extends ParserRuleContext {
		public AtomExprContext atomExpr() {
			return getRuleContext(AtomExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eloqListener ) ((eloqListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eloqListener ) ((eloqListener)listener).exitAddExpr(this);
		}
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_addExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			atomExpr();
			setState(60);
			match(T__3);
			setState(61);
			expr();
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

	public static class MulExprContext extends ParserRuleContext {
		public AtomExprContext atomExpr() {
			return getRuleContext(AtomExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MulExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eloqListener ) ((eloqListener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eloqListener ) ((eloqListener)listener).exitMulExpr(this);
		}
	}

	public final MulExprContext mulExpr() throws RecognitionException {
		MulExprContext _localctx = new MulExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mulExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			atomExpr();
			setState(64);
			match(T__4);
			setState(65);
			expr();
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

	public static class IntervalLoopContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(eloqParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IntervalLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eloqListener ) ((eloqListener)listener).enterIntervalLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eloqListener ) ((eloqListener)listener).exitIntervalLoop(this);
		}
	}

	public final IntervalLoopContext intervalLoop() throws RecognitionException {
		IntervalLoopContext _localctx = new IntervalLoopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_intervalLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__5);
			setState(68);
			expr();
			setState(69);
			match(T__6);
			setState(70);
			expr();
			setState(71);
			match(T__7);
			setState(72);
			match(ID);
			setState(73);
			match(T__8);
			setState(74);
			block();
			setState(75);
			match(T__9);
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

	public static class AtomExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(eloqParser.ID, 0); }
		public TerminalNode INT() { return getToken(eloqParser.INT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtomExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eloqListener ) ((eloqListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eloqListener ) ((eloqListener)listener).exitAtomExpr(this);
		}
	}

	public final AtomExprContext atomExpr() throws RecognitionException {
		AtomExprContext _localctx = new AtomExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atomExpr);
		try {
			setState(83);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(ID);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(INT);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				match(T__10);
				setState(80);
				expr();
				setState(81);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21X\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\3\3\5\3!\n\3\3\4\3\4\3\4\3\4\5\4\'"+
		"\n\4\3\5\7\5*\n\5\f\5\16\5-\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\5\t<\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\rV\n\r\3\r\2"+
		"\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2T\2\32\3\2\2\2\4 \3\2\2\2\6&\3"+
		"\2\2\2\b+\3\2\2\2\n.\3\2\2\2\f\61\3\2\2\2\16\65\3\2\2\2\20;\3\2\2\2\22"+
		"=\3\2\2\2\24A\3\2\2\2\26E\3\2\2\2\30U\3\2\2\2\32\33\5\4\3\2\33\3\3\2\2"+
		"\2\34\35\5\6\4\2\35\36\5\4\3\2\36!\3\2\2\2\37!\7\2\2\3 \34\3\2\2\2 \37"+
		"\3\2\2\2!\5\3\2\2\2\"\'\5\n\6\2#\'\5\f\7\2$\'\5\16\b\2%\'\5\26\f\2&\""+
		"\3\2\2\2&#\3\2\2\2&$\3\2\2\2&%\3\2\2\2\'\7\3\2\2\2(*\5\6\4\2)(\3\2\2\2"+
		"*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\t\3\2\2\2-+\3\2\2\2./\7\3\2\2/\60\7\17"+
		"\2\2\60\13\3\2\2\2\61\62\7\17\2\2\62\63\7\4\2\2\63\64\5\20\t\2\64\r\3"+
		"\2\2\2\65\66\7\5\2\2\66\67\5\20\t\2\67\17\3\2\2\28<\5\30\r\29<\5\22\n"+
		"\2:<\5\24\13\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<\21\3\2\2\2=>\5\30\r\2>?"+
		"\7\6\2\2?@\5\20\t\2@\23\3\2\2\2AB\5\30\r\2BC\7\7\2\2CD\5\20\t\2D\25\3"+
		"\2\2\2EF\7\b\2\2FG\5\20\t\2GH\7\t\2\2HI\5\20\t\2IJ\7\n\2\2JK\7\17\2\2"+
		"KL\7\13\2\2LM\5\b\5\2MN\7\f\2\2N\27\3\2\2\2OV\7\17\2\2PV\7\20\2\2QR\7"+
		"\r\2\2RS\5\20\t\2ST\7\16\2\2TV\3\2\2\2UO\3\2\2\2UP\3\2\2\2UQ\3\2\2\2V"+
		"\31\3\2\2\2\7 &+;U";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}