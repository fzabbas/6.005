// Generated from Header.g4 by ANTLR 4.5.1

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
public class HeaderLexer extends Lexer {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, 
    BASENOTE=17, TEXT=18, DIGIT=19, NEWLINE=20, SPACES=21;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
    "T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "BASENOTE", 
    "TEXT", "DIGIT", "NEWLINE", "SPACES"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'X:'", "'T:'", "'C:'", "'L:'", "'/'", "'M:'", "'C'", "'C|'", 
    "'Q:'", "'='", "'V:'", "'K:'", "'m'", "'#'", "'b'", "'%'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, null, null, "BASENOTE", "TEXT", "DIGIT", "NEWLINE", 
    "SPACES"
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


  public HeaderLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }

  @Override
  public String getGrammarFileName() { return "Header.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public String[] getModeNames() { return modeNames; }

  @Override
  public ATN getATN() { return _ATN; }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27k\b\1\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
      "\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\3\3"+
      "\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t"+
      "\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17"+
      "\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\6\23Z\n\23\r\23\16\23[\3"+
      "\24\3\24\3\25\5\25a\n\25\3\25\3\25\3\26\6\26f\n\26\r\26\16\26g\3\26"+
      "\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
      "\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\6\4\2CIci\3\2>"+
      ">\3\2\62;\3\2\"\"m\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
      "\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
      "\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
      "\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
      "\2\2+\3\2\2\2\3-\3\2\2\2\5\60\3\2\2\2\7\63\3\2\2\2\t\66\3\2\2\2\13"+
      "9\3\2\2\2\r;\3\2\2\2\17>\3\2\2\2\21@\3\2\2\2\23C\3\2\2\2\25F\3\2\2"+
      "\2\27H\3\2\2\2\31K\3\2\2\2\33N\3\2\2\2\35P\3\2\2\2\37R\3\2\2\2!T\3"+
      "\2\2\2#V\3\2\2\2%Y\3\2\2\2\']\3\2\2\2)`\3\2\2\2+e\3\2\2\2-.\7Z\2\2"+
      "./\7<\2\2/\4\3\2\2\2\60\61\7V\2\2\61\62\7<\2\2\62\6\3\2\2\2\63\64"+
      "\7E\2\2\64\65\7<\2\2\65\b\3\2\2\2\66\67\7N\2\2\678\7<\2\28\n\3\2\2"+
      "\29:\7\61\2\2:\f\3\2\2\2;<\7O\2\2<=\7<\2\2=\16\3\2\2\2>?\7E\2\2?\20"+
      "\3\2\2\2@A\7E\2\2AB\7~\2\2B\22\3\2\2\2CD\7S\2\2DE\7<\2\2E\24\3\2\2"+
      "\2FG\7?\2\2G\26\3\2\2\2HI\7X\2\2IJ\7<\2\2J\30\3\2\2\2KL\7M\2\2LM\7"+
      "<\2\2M\32\3\2\2\2NO\7o\2\2O\34\3\2\2\2PQ\7%\2\2Q\36\3\2\2\2RS\7d\2"+
      "\2S \3\2\2\2TU\7\'\2\2U\"\3\2\2\2VW\t\2\2\2W$\3\2\2\2XZ\n\3\2\2YX"+
      "\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\&\3\2\2\2]^\t\4\2\2^(\3\2"+
      "\2\2_a\7\17\2\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\f\2\2c*\3\2\2\2"+
      "df\t\5\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\b\26"+
      "\2\2j,\3\2\2\2\6\2[`g\3\b\2\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}