// Generated from Abc.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AbcLexer extends Lexer {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, 
    T__16=17, OCTAVE=18, ACCIDENTAL=19, BARLINE=20, NTHREPEAT=21, BASENOTE=22, 
    KEYACCIDENTAL=23, MINOR=24, DIGIT=25, LETTERS=26, SYMBOLS=27, NEWLINE=28, 
    SPACE=29;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
    "T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
    "OCTAVE", "ACCIDENTAL", "BARLINE", "NTHREPEAT", "BASENOTE", "KEYACCIDENTAL", 
    "MINOR", "DIGIT", "LETTERS", "SYMBOLS", "NEWLINE", "SPACE"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'C'", "'C|'", "'Q:'", 
    "'='", "'V:'", "'K:'", "'z'", "'/'", "'('", "'['", "']'", "'%'", null, 
    null, null, null, null, null, "'m'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, null, null, null, "OCTAVE", "ACCIDENTAL", "BARLINE", 
    "NTHREPEAT", "BASENOTE", "KEYACCIDENTAL", "MINOR", "DIGIT", "LETTERS", 
    "SYMBOLS", "NEWLINE", "SPACE"
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


      // This method makes the parser stop running if it encounters
      // invalid input and throw a RuntimeException.
      public void reportErrorsAsExceptions() {
          // To prevent any reports to standard error, add this line:
          //removeErrorListeners();
          
          addErrorListener(new BaseErrorListener() {
              public void syntaxError(Recognizer<?, ?> recognizer,
                                      Object offendingSymbol, 
                                      int line, int charPositionInLine,
                                      String msg, RecognitionException e) {
                  throw new ParseCancellationException(msg, e);
              }
          });
      }


  public AbcLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }

  @Override
  public String getGrammarFileName() { return "Abc.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public String[] getModeNames() { return modeNames; }

  @Override
  public ATN getATN() { return _ATN; }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00a9\b\1\4"+
      "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
      "\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
      "\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
      "\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
      "\t\36\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6"+
      "\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3"+
      "\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
      "\6\23j\n\23\r\23\16\23k\3\23\6\23o\n\23\r\23\16\23p\5\23s\n\23\3\24"+
      "\3\24\3\24\3\24\3\24\3\24\3\24\5\24|\n\24\3\25\3\25\3\25\3\25\3\25"+
      "\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0089\n\25\3\26\3\26\3\26\3\26"+
      "\5\26\u008f\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\6\32\u0098\n\32"+
      "\r\32\16\32\u0099\3\33\3\33\3\34\3\34\3\35\5\35\u00a1\n\35\3\35\3"+
      "\35\3\36\6\36\u00a6\n\36\r\36\16\36\u00a7\2\2\37\3\3\5\4\7\5\t\6\13"+
      "\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%"+
      "\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2\b\4\2"+
      "CIci\4\2%%dd\3\2\62;\5\2J\\jnp|\t\2#$&&(\60<>@B]b}\u0080\3\2\"\"\u00b8"+
      "\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
      "\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
      "\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
      "\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-"+
      "\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
      "\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5@\3\2\2\2\7C\3\2\2\2\tF\3"+
      "\2\2\2\13I\3\2\2\2\rL\3\2\2\2\17N\3\2\2\2\21Q\3\2\2\2\23T\3\2\2\2"+
      "\25V\3\2\2\2\27Y\3\2\2\2\31\\\3\2\2\2\33^\3\2\2\2\35`\3\2\2\2\37b"+
      "\3\2\2\2!d\3\2\2\2#f\3\2\2\2%r\3\2\2\2\'{\3\2\2\2)\u0088\3\2\2\2+"+
      "\u008e\3\2\2\2-\u0090\3\2\2\2/\u0092\3\2\2\2\61\u0094\3\2\2\2\63\u0097"+
      "\3\2\2\2\65\u009b\3\2\2\2\67\u009d\3\2\2\29\u00a0\3\2\2\2;\u00a5\3"+
      "\2\2\2=>\7Z\2\2>?\7<\2\2?\4\3\2\2\2@A\7V\2\2AB\7<\2\2B\6\3\2\2\2C"+
      "D\7E\2\2DE\7<\2\2E\b\3\2\2\2FG\7N\2\2GH\7<\2\2H\n\3\2\2\2IJ\7O\2\2"+
      "JK\7<\2\2K\f\3\2\2\2LM\7E\2\2M\16\3\2\2\2NO\7E\2\2OP\7~\2\2P\20\3"+
      "\2\2\2QR\7S\2\2RS\7<\2\2S\22\3\2\2\2TU\7?\2\2U\24\3\2\2\2VW\7X\2\2"+
      "WX\7<\2\2X\26\3\2\2\2YZ\7M\2\2Z[\7<\2\2[\30\3\2\2\2\\]\7|\2\2]\32"+
      "\3\2\2\2^_\7\61\2\2_\34\3\2\2\2`a\7*\2\2a\36\3\2\2\2bc\7]\2\2c \3"+
      "\2\2\2de\7_\2\2e\"\3\2\2\2fg\7\'\2\2g$\3\2\2\2hj\7)\2\2ih\3\2\2\2"+
      "jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2ls\3\2\2\2mo\7.\2\2nm\3\2\2\2op\3\2"+
      "\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2ri\3\2\2\2rn\3\2\2\2s&\3\2\2\2t"+
      "|\7`\2\2uv\7`\2\2v|\7`\2\2w|\7a\2\2xy\7a\2\2y|\7a\2\2z|\7?\2\2{t\3"+
      "\2\2\2{u\3\2\2\2{w\3\2\2\2{x\3\2\2\2{z\3\2\2\2|(\3\2\2\2}\u0089\7"+
      "~\2\2~\177\7~\2\2\177\u0089\7~\2\2\u0080\u0081\7]\2\2\u0081\u0089"+
      "\7~\2\2\u0082\u0083\7~\2\2\u0083\u0089\7_\2\2\u0084\u0085\7<\2\2\u0085"+
      "\u0089\7~\2\2\u0086\u0087\7~\2\2\u0087\u0089\7<\2\2\u0088}\3\2\2\2"+
      "\u0088~\3\2\2\2\u0088\u0080\3\2\2\2\u0088\u0082\3\2\2\2\u0088\u0084"+
      "\3\2\2\2\u0088\u0086\3\2\2\2\u0089*\3\2\2\2\u008a\u008b\7]\2\2\u008b"+
      "\u008f\7\63\2\2\u008c\u008d\7]\2\2\u008d\u008f\7\64\2\2\u008e\u008a"+
      "\3\2\2\2\u008e\u008c\3\2\2\2\u008f,\3\2\2\2\u0090\u0091\t\2\2\2\u0091"+
      ".\3\2\2\2\u0092\u0093\t\3\2\2\u0093\60\3\2\2\2\u0094\u0095\7o\2\2"+
      "\u0095\62\3\2\2\2\u0096\u0098\t\4\2\2\u0097\u0096\3\2\2\2\u0098\u0099"+
      "\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\64\3\2\2\2"+
      "\u009b\u009c\t\5\2\2\u009c\66\3\2\2\2\u009d\u009e\t\6\2\2\u009e8\3"+
      "\2\2\2\u009f\u00a1\7\17\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2"+
      "\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\f\2\2\u00a3:\3\2\2\2\u00a4\u00a6"+
      "\t\7\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2"+
      "\2\u00a7\u00a8\3\2\2\2\u00a8<\3\2\2\2\f\2kpr{\u0088\u008e\u0099\u00a0"+
      "\u00a7\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}