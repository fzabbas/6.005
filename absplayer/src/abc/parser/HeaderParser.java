// Generated from Header.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HeaderParser extends Parser {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, 
    BASENOTE=17, TEXT=18, DIGIT=19, NEWLINE=20, SPACES=21;
  public static final int
    RULE_root = 0, RULE_header = 1, RULE_index = 2, RULE_title = 3, RULE_otherfields = 4, 
    RULE_composer = 5, RULE_length = 6, RULE_meter = 7, RULE_tempo = 8, 
    RULE_voice = 9, RULE_key = 10, RULE_accidental = 11, RULE_comment = 12, 
    RULE_endline = 13;
  public static final String[] ruleNames = {
    "root", "header", "index", "title", "otherfields", "composer", "length", 
    "meter", "tempo", "voice", "key", "accidental", "comment", "endline"
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

  @Override
  public String getGrammarFileName() { return "Header.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public ATN getATN() { return _ATN; }


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

  public HeaderParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }
  public static class RootContext extends ParserRuleContext {
    public HeaderContext header() {
      return getRuleContext(HeaderContext.class,0);
    }
    public TerminalNode EOF() { return getToken(HeaderParser.EOF, 0); }
    public RootContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_root; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterRoot(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitRoot(this);
    }
  }

  public final RootContext root() throws RecognitionException {
    RootContext _localctx = new RootContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_root);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(28);
      header();
      setState(29);
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

  public static class HeaderContext extends ParserRuleContext {
    public IndexContext index() {
      return getRuleContext(IndexContext.class,0);
    }
    public HeaderContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_header; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterHeader(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitHeader(this);
    }
  }

  public final HeaderContext header() throws RecognitionException {
    HeaderContext _localctx = new HeaderContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_header);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(31);
      index();
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

  public static class IndexContext extends ParserRuleContext {
    public EndlineContext endline() {
      return getRuleContext(EndlineContext.class,0);
    }
    public List<TerminalNode> DIGIT() { return getTokens(HeaderParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(HeaderParser.DIGIT, i);
    }
    public IndexContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_index; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterIndex(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitIndex(this);
    }
  }

  public final IndexContext index() throws RecognitionException {
    IndexContext _localctx = new IndexContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_index);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(33);
      match(T__0);
      setState(35); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(34);
        match(DIGIT);
        }
        }
        setState(37); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(39);
      endline();
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

  public static class TitleContext extends ParserRuleContext {
    public EndlineContext endline() {
      return getRuleContext(EndlineContext.class,0);
    }
    public List<TerminalNode> TEXT() { return getTokens(HeaderParser.TEXT); }
    public TerminalNode TEXT(int i) {
      return getToken(HeaderParser.TEXT, i);
    }
    public TitleContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_title; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterTitle(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitTitle(this);
    }
  }

  public final TitleContext title() throws RecognitionException {
    TitleContext _localctx = new TitleContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_title);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(41);
      match(T__1);
      setState(43); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(42);
        match(TEXT);
        }
        }
        setState(45); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==TEXT );
      setState(47);
      endline();
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

  public static class OtherfieldsContext extends ParserRuleContext {
    public ComposerContext composer() {
      return getRuleContext(ComposerContext.class,0);
    }
    public LengthContext length() {
      return getRuleContext(LengthContext.class,0);
    }
    public MeterContext meter() {
      return getRuleContext(MeterContext.class,0);
    }
    public TempoContext tempo() {
      return getRuleContext(TempoContext.class,0);
    }
    public List<VoiceContext> voice() {
      return getRuleContexts(VoiceContext.class);
    }
    public VoiceContext voice(int i) {
      return getRuleContext(VoiceContext.class,i);
    }
    public OtherfieldsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_otherfields; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterOtherfields(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitOtherfields(this);
    }
  }

  public final OtherfieldsContext otherfields() throws RecognitionException {
    OtherfieldsContext _localctx = new OtherfieldsContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_otherfields);
    int _la;
    try {
      setState(58);
      switch (_input.LA(1)) {
      case T__2:
        enterOuterAlt(_localctx, 1);
        {
        setState(49);
        composer();
        }
        break;
      case T__3:
        enterOuterAlt(_localctx, 2);
        {
        setState(50);
        length();
        }
        break;
      case T__5:
      case T__7:
      case DIGIT:
        enterOuterAlt(_localctx, 3);
        {
        setState(51);
        meter();
        }
        break;
      case T__8:
        enterOuterAlt(_localctx, 4);
        {
        setState(52);
        tempo();
        }
        break;
      case T__10:
        enterOuterAlt(_localctx, 5);
        {
        setState(54); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(53);
          voice();
          }
          }
          setState(56); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__10 );
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

  public static class ComposerContext extends ParserRuleContext {
    public TerminalNode TEXT() { return getToken(HeaderParser.TEXT, 0); }
    public EndlineContext endline() {
      return getRuleContext(EndlineContext.class,0);
    }
    public ComposerContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_composer; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterComposer(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitComposer(this);
    }
  }

  public final ComposerContext composer() throws RecognitionException {
    ComposerContext _localctx = new ComposerContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_composer);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(60);
      match(T__2);
      setState(61);
      match(TEXT);
      setState(62);
      endline();
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

  public static class LengthContext extends ParserRuleContext {
    public EndlineContext endline() {
      return getRuleContext(EndlineContext.class,0);
    }
    public List<TerminalNode> DIGIT() { return getTokens(HeaderParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(HeaderParser.DIGIT, i);
    }
    public LengthContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_length; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterLength(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitLength(this);
    }
  }

  public final LengthContext length() throws RecognitionException {
    LengthContext _localctx = new LengthContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_length);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(64);
      match(T__3);
      setState(66); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(65);
        match(DIGIT);
        }
        }
        setState(68); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(70);
      match(T__4);
      setState(76);
      _la = _input.LA(1);
      if (_la==DIGIT) {
        {
        setState(72); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(71);
          match(DIGIT);
          }
          }
          setState(74); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==DIGIT );
        }
      }

      setState(78);
      endline();
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

  public static class MeterContext extends ParserRuleContext {
    public EndlineContext endline() {
      return getRuleContext(EndlineContext.class,0);
    }
    public List<TerminalNode> DIGIT() { return getTokens(HeaderParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(HeaderParser.DIGIT, i);
    }
    public MeterContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_meter; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterMeter(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitMeter(this);
    }
  }

  public final MeterContext meter() throws RecognitionException {
    MeterContext _localctx = new MeterContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_meter);
    int _la;
    try {
      setState(95);
      switch (_input.LA(1)) {
      case T__5:
        enterOuterAlt(_localctx, 1);
        {
        setState(80);
        match(T__5);
        setState(81);
        match(T__6);
        }
        break;
      case T__7:
        enterOuterAlt(_localctx, 2);
        {
        setState(82);
        match(T__7);
        }
        break;
      case DIGIT:
        enterOuterAlt(_localctx, 3);
        {
        setState(84); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(83);
          match(DIGIT);
          }
          }
          setState(86); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==DIGIT );
        setState(88);
        match(T__4);
        setState(90); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(89);
          match(DIGIT);
          }
          }
          setState(92); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==DIGIT );
        setState(94);
        endline();
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

  public static class TempoContext extends ParserRuleContext {
    public EndlineContext endline() {
      return getRuleContext(EndlineContext.class,0);
    }
    public List<TerminalNode> DIGIT() { return getTokens(HeaderParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(HeaderParser.DIGIT, i);
    }
    public TempoContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tempo; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterTempo(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitTempo(this);
    }
  }

  public final TempoContext tempo() throws RecognitionException {
    TempoContext _localctx = new TempoContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_tempo);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(97);
      match(T__8);
      setState(99); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(98);
        match(DIGIT);
        }
        }
        setState(101); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(103);
      match(T__4);
      setState(105); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(104);
        match(DIGIT);
        }
        }
        setState(107); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(109);
      match(T__9);
      setState(111); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(110);
        match(DIGIT);
        }
        }
        setState(113); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(115);
      endline();
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

  public static class VoiceContext extends ParserRuleContext {
    public EndlineContext endline() {
      return getRuleContext(EndlineContext.class,0);
    }
    public List<TerminalNode> TEXT() { return getTokens(HeaderParser.TEXT); }
    public TerminalNode TEXT(int i) {
      return getToken(HeaderParser.TEXT, i);
    }
    public VoiceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_voice; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterVoice(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitVoice(this);
    }
  }

  public final VoiceContext voice() throws RecognitionException {
    VoiceContext _localctx = new VoiceContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_voice);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(117);
      match(T__10);
      setState(119); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(118);
        match(TEXT);
        }
        }
        setState(121); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==TEXT );
      setState(123);
      endline();
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

  public static class KeyContext extends ParserRuleContext {
    public TerminalNode BASENOTE() { return getToken(HeaderParser.BASENOTE, 0); }
    public EndlineContext endline() {
      return getRuleContext(EndlineContext.class,0);
    }
    public AccidentalContext accidental() {
      return getRuleContext(AccidentalContext.class,0);
    }
    public KeyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_key; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterKey(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitKey(this);
    }
  }

  public final KeyContext key() throws RecognitionException {
    KeyContext _localctx = new KeyContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_key);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(125);
      match(T__11);
      setState(126);
      match(BASENOTE);
      setState(128);
      _la = _input.LA(1);
      if (_la==T__13 || _la==T__14) {
        {
        setState(127);
        accidental();
        }
      }

      setState(131);
      _la = _input.LA(1);
      if (_la==T__12) {
        {
        setState(130);
        match(T__12);
        }
      }

      setState(133);
      endline();
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

  public static class AccidentalContext extends ParserRuleContext {
    public AccidentalContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_accidental; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterAccidental(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitAccidental(this);
    }
  }

  public final AccidentalContext accidental() throws RecognitionException {
    AccidentalContext _localctx = new AccidentalContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_accidental);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(135);
      _la = _input.LA(1);
      if ( !(_la==T__13 || _la==T__14) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
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

  public static class CommentContext extends ParserRuleContext {
    public TerminalNode TEXT() { return getToken(HeaderParser.TEXT, 0); }
    public TerminalNode NEWLINE() { return getToken(HeaderParser.NEWLINE, 0); }
    public CommentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_comment; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterComment(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitComment(this);
    }
  }

  public final CommentContext comment() throws RecognitionException {
    CommentContext _localctx = new CommentContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_comment);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(137);
      match(T__15);
      setState(138);
      match(TEXT);
      setState(139);
      match(NEWLINE);
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

  public static class EndlineContext extends ParserRuleContext {
    public CommentContext comment() {
      return getRuleContext(CommentContext.class,0);
    }
    public TerminalNode NEWLINE() { return getToken(HeaderParser.NEWLINE, 0); }
    public EndlineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_endline; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterEndline(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitEndline(this);
    }
  }

  public final EndlineContext endline() throws RecognitionException {
    EndlineContext _localctx = new EndlineContext(_ctx, getState());
    enterRule(_localctx, 26, RULE_endline);
    int _la;
    try {
      setState(145);
      switch (_input.LA(1)) {
      case EOF:
      case T__10:
      case T__15:
        enterOuterAlt(_localctx, 1);
        {
        setState(142);
        _la = _input.LA(1);
        if (_la==T__15) {
          {
          setState(141);
          comment();
          }
        }

        }
        break;
      case NEWLINE:
        enterOuterAlt(_localctx, 2);
        {
        setState(144);
        match(NEWLINE);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u0096\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\3\3"+
      "\3\4\3\4\6\4&\n\4\r\4\16\4\'\3\4\3\4\3\5\3\5\6\5.\n\5\r\5\16\5/\3"+
      "\5\3\5\3\6\3\6\3\6\3\6\3\6\6\69\n\6\r\6\16\6:\5\6=\n\6\3\7\3\7\3\7"+
      "\3\7\3\b\3\b\6\bE\n\b\r\b\16\bF\3\b\3\b\6\bK\n\b\r\b\16\bL\5\bO\n"+
      "\b\3\b\3\b\3\t\3\t\3\t\3\t\6\tW\n\t\r\t\16\tX\3\t\3\t\6\t]\n\t\r\t"+
      "\16\t^\3\t\5\tb\n\t\3\n\3\n\6\nf\n\n\r\n\16\ng\3\n\3\n\6\nl\n\n\r"+
      "\n\16\nm\3\n\3\n\6\nr\n\n\r\n\16\ns\3\n\3\n\3\13\3\13\6\13z\n\13\r"+
      "\13\16\13{\3\13\3\13\3\f\3\f\3\f\5\f\u0083\n\f\3\f\5\f\u0086\n\f\3"+
      "\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\5\17\u0091\n\17\3\17\5\17"+
      "\u0094\n\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3\3"+
      "\2\20\21\u009d\2\36\3\2\2\2\4!\3\2\2\2\6#\3\2\2\2\b+\3\2\2\2\n<\3"+
      "\2\2\2\f>\3\2\2\2\16B\3\2\2\2\20a\3\2\2\2\22c\3\2\2\2\24w\3\2\2\2"+
      "\26\177\3\2\2\2\30\u0089\3\2\2\2\32\u008b\3\2\2\2\34\u0093\3\2\2\2"+
      "\36\37\5\4\3\2\37 \7\2\2\3 \3\3\2\2\2!\"\5\6\4\2\"\5\3\2\2\2#%\7\3"+
      "\2\2$&\7\25\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2"+
      "\2)*\5\34\17\2*\7\3\2\2\2+-\7\4\2\2,.\7\24\2\2-,\3\2\2\2./\3\2\2\2"+
      "/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\5\34\17\2\62\t\3\2\2\2"+
      "\63=\5\f\7\2\64=\5\16\b\2\65=\5\20\t\2\66=\5\22\n\2\679\5\24\13\2"+
      "8\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<\63\3\2\2\2<"+
      "\64\3\2\2\2<\65\3\2\2\2<\66\3\2\2\2<8\3\2\2\2=\13\3\2\2\2>?\7\5\2"+
      "\2?@\7\24\2\2@A\5\34\17\2A\r\3\2\2\2BD\7\6\2\2CE\7\25\2\2DC\3\2\2"+
      "\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HN\7\7\2\2IK\7\25\2\2JI"+
      "\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NJ\3\2\2\2NO\3\2\2"+
      "\2OP\3\2\2\2PQ\5\34\17\2Q\17\3\2\2\2RS\7\b\2\2Sb\7\t\2\2Tb\7\n\2\2"+
      "UW\7\25\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z\\\7"+
      "\7\2\2[]\7\25\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2"+
      "\2\2`b\5\34\17\2aR\3\2\2\2aT\3\2\2\2aV\3\2\2\2b\21\3\2\2\2ce\7\13"+
      "\2\2df\7\25\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2"+
      "ik\7\7\2\2jl\7\25\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3"+
      "\2\2\2oq\7\f\2\2pr\7\25\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2"+
      "\2tu\3\2\2\2uv\5\34\17\2v\23\3\2\2\2wy\7\r\2\2xz\7\24\2\2yx\3\2\2"+
      "\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\5\34\17\2~\25\3\2\2\2"+
      "\177\u0080\7\16\2\2\u0080\u0082\7\23\2\2\u0081\u0083\5\30\r\2\u0082"+
      "\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0086"+
      "\7\17\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2"+
      "\2\2\u0087\u0088\5\34\17\2\u0088\27\3\2\2\2\u0089\u008a\t\2\2\2\u008a"+
      "\31\3\2\2\2\u008b\u008c\7\22\2\2\u008c\u008d\7\24\2\2\u008d\u008e"+
      "\7\26\2\2\u008e\33\3\2\2\2\u008f\u0091\5\32\16\2\u0090\u008f\3\2\2"+
      "\2\u0090\u0091\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0094\7\26\2\2\u0093"+
      "\u0090\3\2\2\2\u0093\u0092\3\2\2\2\u0094\35\3\2\2\2\24\'/:<FLNX^a"+
      "gms{\u0082\u0085\u0090\u0093";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}