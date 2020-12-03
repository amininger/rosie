// Generated from src/edu/umich/rosie/tools/config/Regress.g4 by ANTLR 4.5

package edu.umich.rosie.tools.config;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegressLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, TIME=9, 
		QUOTE=10, SYMBOL=11, WORD=12, NUMBER=13, PAREN=14, TERMINATOR=15, FAILED=16, 
		COMMENT=17, BRACKETS=18, WS=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "TIME", 
		"QUOTE", "SYMBOL", "WORD", "NUMBER", "DIGIT", "PAREN", "TERMINATOR", "FAILED", 
		"COMMENT", "BRACKETS", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'.'", "'('", "'@'", "')'", "'^'", "'<'", "'>'", null, null, 
		null, null, null, null, null, "'#   FAILED!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "TIME", "QUOTE", 
		"SYMBOL", "WORD", "NUMBER", "PAREN", "TERMINATOR", "FAILED", "COMMENT", 
		"BRACKETS", "WS"
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


	public RegressLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Regress.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u0099\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\7\13B\n\13\f"+
		"\13\16\13E\13\13\3\13\3\13\3\f\3\f\6\fK\n\f\r\f\16\fL\3\r\3\r\7\rQ\n\r"+
		"\f\r\16\rT\13\r\3\16\5\16W\n\16\3\16\3\16\6\16[\n\16\r\16\16\16\\\3\16"+
		"\6\16`\n\16\r\16\16\16a\3\16\3\16\7\16f\n\16\f\16\16\16i\13\16\5\16k\n"+
		"\16\5\16m\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\7\23\u0083\n\23\f\23\16"+
		"\23\u0086\13\23\3\24\3\24\7\24\u008a\n\24\f\24\16\24\u008d\13\24\3\24"+
		"\3\24\3\24\3\24\3\25\6\25\u0094\n\25\r\25\16\25\u0095\3\25\3\25\3\u008b"+
		"\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\2\37\20!\21#\22%\23\'\24)\25\3\2\13\3\2$$\4\2C\\c|\3\2\62;\6\2##\62;"+
		"C\\c|\b\2))//\62;C\\aac|\3\2*+\5\2##==AA\4\2\f\f\17\17\5\2\13\f\17\17"+
		"\"\"\u00a3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t"+
		"\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\219\3\2\2\2\23;\3"+
		"\2\2\2\25?\3\2\2\2\27H\3\2\2\2\31N\3\2\2\2\33V\3\2\2\2\35n\3\2\2\2\37"+
		"p\3\2\2\2!r\3\2\2\2#t\3\2\2\2%\u0080\3\2\2\2\'\u0087\3\2\2\2)\u0093\3"+
		"\2\2\2+,\7.\2\2,\4\3\2\2\2-.\7\60\2\2.\6\3\2\2\2/\60\7*\2\2\60\b\3\2\2"+
		"\2\61\62\7B\2\2\62\n\3\2\2\2\63\64\7+\2\2\64\f\3\2\2\2\65\66\7`\2\2\66"+
		"\16\3\2\2\2\678\7>\2\28\20\3\2\2\29:\7@\2\2:\22\3\2\2\2;<\5\33\16\2<="+
		"\7<\2\2=>\5\33\16\2>\24\3\2\2\2?C\7$\2\2@B\n\2\2\2A@\3\2\2\2BE\3\2\2\2"+
		"CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7$\2\2G\26\3\2\2\2HJ\t\3\2"+
		"\2IK\t\4\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\30\3\2\2\2NR\t\5"+
		"\2\2OQ\t\6\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\32\3\2\2\2TR\3"+
		"\2\2\2UW\7/\2\2VU\3\2\2\2VW\3\2\2\2Wl\3\2\2\2XZ\7\60\2\2Y[\5\35\17\2Z"+
		"Y\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]m\3\2\2\2^`\5\35\17\2_^\3\2"+
		"\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bj\3\2\2\2cg\7\60\2\2df\5\35\17\2ed"+
		"\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hk\3\2\2\2ig\3\2\2\2jc\3\2\2\2j"+
		"k\3\2\2\2km\3\2\2\2lX\3\2\2\2l_\3\2\2\2m\34\3\2\2\2no\t\4\2\2o\36\3\2"+
		"\2\2pq\t\7\2\2q \3\2\2\2rs\t\b\2\2s\"\3\2\2\2tu\7%\2\2uv\7\"\2\2vw\7\""+
		"\2\2wx\7\"\2\2xy\7H\2\2yz\7C\2\2z{\7K\2\2{|\7N\2\2|}\7G\2\2}~\7F\2\2~"+
		"\177\7#\2\2\177$\3\2\2\2\u0080\u0084\7%\2\2\u0081\u0083\n\t\2\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085&\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008b\7]\2\2\u0088\u008a"+
		"\13\2\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u008c\3\2\2\2"+
		"\u008b\u0089\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f"+
		"\7_\2\2\u008f\u0090\3\2\2\2\u0090\u0091\b\24\2\2\u0091(\3\2\2\2\u0092"+
		"\u0094\t\n\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\25\2\2\u0098"+
		"*\3\2\2\2\17\2CLRV\\agjl\u0084\u008b\u0095\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}