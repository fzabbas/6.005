// Generated from Abc.g4 by ANTLR 4.5.1

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
public class AbcParser extends Parser {
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
  public static final int
    RULE_root = 0, RULE_header = 1, RULE_index = 2, RULE_title = 3, RULE_others = 4, 
    RULE_composer = 5, RULE_length = 6, RULE_meter = 7, RULE_tempo = 8, 
    RULE_voice = 9, RULE_key = 10, RULE_music = 11, RULE_line = 12, RULE_element = 13, 
    RULE_noteelement = 14, RULE_note = 15, RULE_rest = 16, RULE_pitch = 17, 
    RULE_notelength = 18, RULE_tupletelement = 19, RULE_tupletspec = 20, 
    RULE_multinote = 21, RULE_fraction = 22, RULE_endline = 23, RULE_text = 24, 
    RULE_comment = 25;
  public static final String[] ruleNames = {
    "root", "header", "index", "title", "others", "composer", "length", 
    "meter", "tempo", "voice", "key", "music", "line", "element", "noteelement", 
    "note", "rest", "pitch", "notelength", "tupletelement", "tupletspec", 
    "multinote", "fraction", "endline", "text", "comment"
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

  @Override
  public String getGrammarFileName() { return "Abc.g4"; }

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

  public AbcParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }
  public static class RootContext extends ParserRuleContext {
    public HeaderContext header() {
      return getRuleContext(HeaderContext.class,0);
    }
    public MusicContext music() {
      return getRuleContext(MusicContext.class,0);
    }
    public TerminalNode EOF() { return getToken(AbcParser.EOF, 0); }
    public RootContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_root; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterRoot(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitRoot(this);
    }
  }

  public final RootContext root() throws RecognitionException {
    RootContext _localctx = new RootContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_root);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(52);
      header();
      setState(53);
      music();
      setState(54);
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
    public TitleContext title() {
      return getRuleContext(TitleContext.class,0);
    }
    public KeyContext key() {
      return getRuleContext(KeyContext.class,0);
    }
    public List<CommentContext> comment() {
      return getRuleContexts(CommentContext.class);
    }
    public CommentContext comment(int i) {
      return getRuleContext(CommentContext.class,i);
    }
    public List<OthersContext> others() {
      return getRuleContexts(OthersContext.class);
    }
    public OthersContext others(int i) {
      return getRuleContext(OthersContext.class,i);
    }
    public HeaderContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_header; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterHeader(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitHeader(this);
    }
  }

  public final HeaderContext header() throws RecognitionException {
    HeaderContext _localctx = new HeaderContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_header);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(56);
      index();
      setState(60);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__16) {
        {
        {
        setState(57);
        comment();
        }
        }
        setState(62);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(63);
      title();
      setState(67);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__16) | (1L << SPACE))) != 0)) {
        {
        {
        setState(64);
        others();
        }
        }
        setState(69);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(70);
      key();
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
    public List<TerminalNode> DIGIT() { return getTokens(AbcParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(AbcParser.DIGIT, i);
    }
    public IndexContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_index; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterIndex(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitIndex(this);
    }
  }

  public final IndexContext index() throws RecognitionException {
    IndexContext _localctx = new IndexContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_index);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(72);
      match(T__0);
      setState(74); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(73);
        match(DIGIT);
        }
        }
        setState(76); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
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

  public static class TitleContext extends ParserRuleContext {
    public EndlineContext endline() {
      return getRuleContext(EndlineContext.class,0);
    }
    public List<TextContext> text() {
      return getRuleContexts(TextContext.class);
    }
    public TextContext text(int i) {
      return getRuleContext(TextContext.class,i);
    }
    public TitleContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_title; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterTitle(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitTitle(this);
    }
  }

  public final TitleContext title() throws RecognitionException {
    TitleContext _localctx = new TitleContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_title);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(80);
      match(T__1);
      setState(82); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(81);
          text();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(84); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,3,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      setState(86);
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

  public static class OthersContext extends ParserRuleContext {
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
    public CommentContext comment() {
      return getRuleContext(CommentContext.class,0);
    }
    public TerminalNode SPACE() { return getToken(AbcParser.SPACE, 0); }
    public OthersContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_others; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterOthers(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitOthers(this);
    }
  }

  public final OthersContext others() throws RecognitionException {
    OthersContext _localctx = new OthersContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_others);
    try {
      int _alt;
      setState(99);
      switch (_input.LA(1)) {
      case T__2:
        enterOuterAlt(_localctx, 1);
        {
        setState(88);
        composer();
        }
        break;
      case T__3:
        enterOuterAlt(_localctx, 2);
        {
        setState(89);
        length();
        }
        break;
      case T__4:
        enterOuterAlt(_localctx, 3);
        {
        setState(90);
        meter();
        }
        break;
      case T__7:
        enterOuterAlt(_localctx, 4);
        {
        setState(91);
        tempo();
        }
        break;
      case T__9:
        enterOuterAlt(_localctx, 5);
        {
        setState(93); 
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
          case 1:
            {
            {
            setState(92);
            voice();
            }
            }
            break;
          default:
            throw new NoViableAltException(this);
          }
          setState(95); 
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,4,_ctx);
        } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
        }
        break;
      case T__16:
        enterOuterAlt(_localctx, 6);
        {
        setState(97);
        comment();
        }
        break;
      case SPACE:
        enterOuterAlt(_localctx, 7);
        {
        setState(98);
        match(SPACE);
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
    public EndlineContext endline() {
      return getRuleContext(EndlineContext.class,0);
    }
    public List<TextContext> text() {
      return getRuleContexts(TextContext.class);
    }
    public TextContext text(int i) {
      return getRuleContext(TextContext.class,i);
    }
    public ComposerContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_composer; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterComposer(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitComposer(this);
    }
  }

  public final ComposerContext composer() throws RecognitionException {
    ComposerContext _localctx = new ComposerContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_composer);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(101);
      match(T__2);
      setState(103); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(102);
          text();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(105); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,6,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      setState(107);
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
    public FractionContext fraction() {
      return getRuleContext(FractionContext.class,0);
    }
    public EndlineContext endline() {
      return getRuleContext(EndlineContext.class,0);
    }
    public LengthContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_length; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterLength(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitLength(this);
    }
  }

  public final LengthContext length() throws RecognitionException {
    LengthContext _localctx = new LengthContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_length);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(109);
      match(T__3);
      setState(110);
      fraction();
      setState(111);
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
    public FractionContext fraction() {
      return getRuleContext(FractionContext.class,0);
    }
    public MeterContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_meter; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterMeter(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitMeter(this);
    }
  }

  public final MeterContext meter() throws RecognitionException {
    MeterContext _localctx = new MeterContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_meter);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(113);
      match(T__4);
      setState(117);
      switch (_input.LA(1)) {
      case T__5:
        {
        setState(114);
        match(T__5);
        }
        break;
      case T__6:
        {
        setState(115);
        match(T__6);
        }
        break;
      case DIGIT:
        {
        setState(116);
        fraction();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      setState(119);
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

  public static class TempoContext extends ParserRuleContext {
    public FractionContext fraction() {
      return getRuleContext(FractionContext.class,0);
    }
    public EndlineContext endline() {
      return getRuleContext(EndlineContext.class,0);
    }
    public List<TerminalNode> DIGIT() { return getTokens(AbcParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(AbcParser.DIGIT, i);
    }
    public TempoContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tempo; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterTempo(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitTempo(this);
    }
  }

  public final TempoContext tempo() throws RecognitionException {
    TempoContext _localctx = new TempoContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_tempo);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(121);
      match(T__7);
      setState(122);
      fraction();
      setState(123);
      match(T__8);
      setState(125); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(124);
        match(DIGIT);
        }
        }
        setState(127); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(129);
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
    public List<TextContext> text() {
      return getRuleContexts(TextContext.class);
    }
    public TextContext text(int i) {
      return getRuleContext(TextContext.class,i);
    }
    public VoiceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_voice; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterVoice(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitVoice(this);
    }
  }

  public final VoiceContext voice() throws RecognitionException {
    VoiceContext _localctx = new VoiceContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_voice);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(131);
      match(T__9);
      setState(133); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(132);
          text();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(135); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,9,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      setState(137);
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
    public TerminalNode BASENOTE() { return getToken(AbcParser.BASENOTE, 0); }
    public EndlineContext endline() {
      return getRuleContext(EndlineContext.class,0);
    }
    public TerminalNode KEYACCIDENTAL() { return getToken(AbcParser.KEYACCIDENTAL, 0); }
    public TerminalNode MINOR() { return getToken(AbcParser.MINOR, 0); }
    public KeyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_key; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterKey(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitKey(this);
    }
  }

  public final KeyContext key() throws RecognitionException {
    KeyContext _localctx = new KeyContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_key);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(139);
      match(T__10);
      setState(140);
      match(BASENOTE);
      setState(142);
      _la = _input.LA(1);
      if (_la==KEYACCIDENTAL) {
        {
        setState(141);
        match(KEYACCIDENTAL);
        }
      }

      setState(145);
      _la = _input.LA(1);
      if (_la==MINOR) {
        {
        setState(144);
        match(MINOR);
        }
      }

      setState(147);
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

  public static class MusicContext extends ParserRuleContext {
    public List<LineContext> line() {
      return getRuleContexts(LineContext.class);
    }
    public LineContext line(int i) {
      return getRuleContext(LineContext.class,i);
    }
    public MusicContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_music; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterMusic(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitMusic(this);
    }
  }

  public final MusicContext music() throws RecognitionException {
    MusicContext _localctx = new MusicContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_music);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(150); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(149);
        line();
        }
        }
        setState(152); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << ACCIDENTAL) | (1L << BARLINE) | (1L << NTHREPEAT) | (1L << BASENOTE) | (1L << NEWLINE) | (1L << SPACE))) != 0) );
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

  public static class LineContext extends ParserRuleContext {
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public List<ElementContext> element() {
      return getRuleContexts(ElementContext.class);
    }
    public ElementContext element(int i) {
      return getRuleContext(ElementContext.class,i);
    }
    public VoiceContext voice() {
      return getRuleContext(VoiceContext.class,0);
    }
    public CommentContext comment() {
      return getRuleContext(CommentContext.class,0);
    }
    public LineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_line; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterLine(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitLine(this);
    }
  }

  public final LineContext line() throws RecognitionException {
    LineContext _localctx = new LineContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_line);
    int _la;
    try {
      setState(163);
      switch (_input.LA(1)) {
      case T__11:
      case T__13:
      case T__14:
      case ACCIDENTAL:
      case BARLINE:
      case NTHREPEAT:
      case BASENOTE:
      case NEWLINE:
      case SPACE:
        enterOuterAlt(_localctx, 1);
        {
        setState(157);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << ACCIDENTAL) | (1L << BARLINE) | (1L << NTHREPEAT) | (1L << BASENOTE) | (1L << SPACE))) != 0)) {
          {
          {
          setState(154);
          element();
          }
          }
          setState(159);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(160);
        match(NEWLINE);
        }
        break;
      case T__9:
        enterOuterAlt(_localctx, 2);
        {
        setState(161);
        voice();
        }
        break;
      case T__16:
        enterOuterAlt(_localctx, 3);
        {
        setState(162);
        comment();
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

  public static class ElementContext extends ParserRuleContext {
    public NoteelementContext noteelement() {
      return getRuleContext(NoteelementContext.class,0);
    }
    public TupletelementContext tupletelement() {
      return getRuleContext(TupletelementContext.class,0);
    }
    public TerminalNode BARLINE() { return getToken(AbcParser.BARLINE, 0); }
    public TerminalNode NTHREPEAT() { return getToken(AbcParser.NTHREPEAT, 0); }
    public TerminalNode SPACE() { return getToken(AbcParser.SPACE, 0); }
    public ElementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_element; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterElement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitElement(this);
    }
  }

  public final ElementContext element() throws RecognitionException {
    ElementContext _localctx = new ElementContext(_ctx, getState());
    enterRule(_localctx, 26, RULE_element);
    try {
      setState(170);
      switch (_input.LA(1)) {
      case T__11:
      case T__14:
      case ACCIDENTAL:
      case BASENOTE:
        enterOuterAlt(_localctx, 1);
        {
        setState(165);
        noteelement();
        }
        break;
      case T__13:
        enterOuterAlt(_localctx, 2);
        {
        setState(166);
        tupletelement();
        }
        break;
      case BARLINE:
        enterOuterAlt(_localctx, 3);
        {
        setState(167);
        match(BARLINE);
        }
        break;
      case NTHREPEAT:
        enterOuterAlt(_localctx, 4);
        {
        setState(168);
        match(NTHREPEAT);
        }
        break;
      case SPACE:
        enterOuterAlt(_localctx, 5);
        {
        setState(169);
        match(SPACE);
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

  public static class NoteelementContext extends ParserRuleContext {
    public NoteContext note() {
      return getRuleContext(NoteContext.class,0);
    }
    public MultinoteContext multinote() {
      return getRuleContext(MultinoteContext.class,0);
    }
    public NoteelementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_noteelement; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNoteelement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNoteelement(this);
    }
  }

  public final NoteelementContext noteelement() throws RecognitionException {
    NoteelementContext _localctx = new NoteelementContext(_ctx, getState());
    enterRule(_localctx, 28, RULE_noteelement);
    try {
      setState(174);
      switch (_input.LA(1)) {
      case T__11:
      case ACCIDENTAL:
      case BASENOTE:
        enterOuterAlt(_localctx, 1);
        {
        setState(172);
        note();
        }
        break;
      case T__14:
        enterOuterAlt(_localctx, 2);
        {
        setState(173);
        multinote();
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

  public static class NoteContext extends ParserRuleContext {
    public PitchContext pitch() {
      return getRuleContext(PitchContext.class,0);
    }
    public RestContext rest() {
      return getRuleContext(RestContext.class,0);
    }
    public NoteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_note; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNote(this);
    }
  }

  public final NoteContext note() throws RecognitionException {
    NoteContext _localctx = new NoteContext(_ctx, getState());
    enterRule(_localctx, 30, RULE_note);
    try {
      setState(178);
      switch (_input.LA(1)) {
      case ACCIDENTAL:
      case BASENOTE:
        enterOuterAlt(_localctx, 1);
        {
        setState(176);
        pitch();
        }
        break;
      case T__11:
        enterOuterAlt(_localctx, 2);
        {
        setState(177);
        rest();
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

  public static class RestContext extends ParserRuleContext {
    public NotelengthContext notelength() {
      return getRuleContext(NotelengthContext.class,0);
    }
    public RestContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_rest; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterRest(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitRest(this);
    }
  }

  public final RestContext rest() throws RecognitionException {
    RestContext _localctx = new RestContext(_ctx, getState());
    enterRule(_localctx, 32, RULE_rest);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(180);
      match(T__11);
      setState(182);
      _la = _input.LA(1);
      if (_la==T__12 || _la==DIGIT) {
        {
        setState(181);
        notelength();
        }
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

  public static class PitchContext extends ParserRuleContext {
    public TerminalNode BASENOTE() { return getToken(AbcParser.BASENOTE, 0); }
    public TerminalNode ACCIDENTAL() { return getToken(AbcParser.ACCIDENTAL, 0); }
    public TerminalNode OCTAVE() { return getToken(AbcParser.OCTAVE, 0); }
    public NotelengthContext notelength() {
      return getRuleContext(NotelengthContext.class,0);
    }
    public PitchContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_pitch; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterPitch(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitPitch(this);
    }
  }

  public final PitchContext pitch() throws RecognitionException {
    PitchContext _localctx = new PitchContext(_ctx, getState());
    enterRule(_localctx, 34, RULE_pitch);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(185);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(184);
        match(ACCIDENTAL);
        }
      }

      setState(187);
      match(BASENOTE);
      setState(189);
      _la = _input.LA(1);
      if (_la==OCTAVE) {
        {
        setState(188);
        match(OCTAVE);
        }
      }

      setState(192);
      _la = _input.LA(1);
      if (_la==T__12 || _la==DIGIT) {
        {
        setState(191);
        notelength();
        }
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

  public static class NotelengthContext extends ParserRuleContext {
    public List<TerminalNode> DIGIT() { return getTokens(AbcParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(AbcParser.DIGIT, i);
    }
    public NotelengthContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_notelength; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNotelength(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNotelength(this);
    }
  }

  public final NotelengthContext notelength() throws RecognitionException {
    NotelengthContext _localctx = new NotelengthContext(_ctx, getState());
    enterRule(_localctx, 36, RULE_notelength);
    int _la;
    try {
      setState(214);
      switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        setState(199);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
          setState(195); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(194);
            match(DIGIT);
            }
            }
            setState(197); 
            _errHandler.sync(this);
            _la = _input.LA(1);
          } while ( _la==DIGIT );
          }
        }

        setState(201);
        match(T__12);
        setState(207);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
          setState(203); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(202);
            match(DIGIT);
            }
            }
            setState(205); 
            _errHandler.sync(this);
            _la = _input.LA(1);
          } while ( _la==DIGIT );
          }
        }

        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        setState(210); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(209);
          match(DIGIT);
          }
          }
          setState(212); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==DIGIT );
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

  public static class TupletelementContext extends ParserRuleContext {
    public TupletspecContext tupletspec() {
      return getRuleContext(TupletspecContext.class,0);
    }
    public List<NoteelementContext> noteelement() {
      return getRuleContexts(NoteelementContext.class);
    }
    public NoteelementContext noteelement(int i) {
      return getRuleContext(NoteelementContext.class,i);
    }
    public TupletelementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tupletelement; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterTupletelement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitTupletelement(this);
    }
  }

  public final TupletelementContext tupletelement() throws RecognitionException {
    TupletelementContext _localctx = new TupletelementContext(_ctx, getState());
    enterRule(_localctx, 38, RULE_tupletelement);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(216);
      tupletspec();
      setState(218); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(217);
          noteelement();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(220); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,28,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

  public static class TupletspecContext extends ParserRuleContext {
    public TerminalNode DIGIT() { return getToken(AbcParser.DIGIT, 0); }
    public TupletspecContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tupletspec; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterTupletspec(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitTupletspec(this);
    }
  }

  public final TupletspecContext tupletspec() throws RecognitionException {
    TupletspecContext _localctx = new TupletspecContext(_ctx, getState());
    enterRule(_localctx, 40, RULE_tupletspec);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(222);
      match(T__13);
      setState(223);
      match(DIGIT);
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

  public static class MultinoteContext extends ParserRuleContext {
    public List<NoteContext> note() {
      return getRuleContexts(NoteContext.class);
    }
    public NoteContext note(int i) {
      return getRuleContext(NoteContext.class,i);
    }
    public MultinoteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_multinote; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterMultinote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitMultinote(this);
    }
  }

  public final MultinoteContext multinote() throws RecognitionException {
    MultinoteContext _localctx = new MultinoteContext(_ctx, getState());
    enterRule(_localctx, 42, RULE_multinote);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(225);
      match(T__14);
      setState(227); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(226);
        note();
        }
        }
        setState(229); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << ACCIDENTAL) | (1L << BASENOTE))) != 0) );
      setState(231);
      match(T__15);
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

  public static class FractionContext extends ParserRuleContext {
    public List<TerminalNode> DIGIT() { return getTokens(AbcParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(AbcParser.DIGIT, i);
    }
    public FractionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_fraction; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterFraction(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitFraction(this);
    }
  }

  public final FractionContext fraction() throws RecognitionException {
    FractionContext _localctx = new FractionContext(_ctx, getState());
    enterRule(_localctx, 44, RULE_fraction);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(234); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(233);
        match(DIGIT);
        }
        }
        setState(236); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(238);
      match(T__12);
      setState(240); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(239);
        match(DIGIT);
        }
        }
        setState(242); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
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
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public EndlineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_endline; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterEndline(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitEndline(this);
    }
  }

  public final EndlineContext endline() throws RecognitionException {
    EndlineContext _localctx = new EndlineContext(_ctx, getState());
    enterRule(_localctx, 46, RULE_endline);
    try {
      setState(248);
      switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        setState(245);
        switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
        case 1:
          {
          setState(244);
          comment();
          }
          break;
        }
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        setState(247);
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

  public static class TextContext extends ParserRuleContext {
    public TerminalNode DIGIT() { return getToken(AbcParser.DIGIT, 0); }
    public TerminalNode BASENOTE() { return getToken(AbcParser.BASENOTE, 0); }
    public TerminalNode LETTERS() { return getToken(AbcParser.LETTERS, 0); }
    public TerminalNode MINOR() { return getToken(AbcParser.MINOR, 0); }
    public TerminalNode KEYACCIDENTAL() { return getToken(AbcParser.KEYACCIDENTAL, 0); }
    public TerminalNode SYMBOLS() { return getToken(AbcParser.SYMBOLS, 0); }
    public TerminalNode SPACE() { return getToken(AbcParser.SPACE, 0); }
    public TextContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_text; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterText(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitText(this);
    }
  }

  public final TextContext text() throws RecognitionException {
    TextContext _localctx = new TextContext(_ctx, getState());
    enterRule(_localctx, 48, RULE_text);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(250);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASENOTE) | (1L << KEYACCIDENTAL) | (1L << MINOR) | (1L << DIGIT) | (1L << LETTERS) | (1L << SYMBOLS) | (1L << SPACE))) != 0)) ) {
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
    public TextContext text() {
      return getRuleContext(TextContext.class,0);
    }
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public CommentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_comment; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterComment(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitComment(this);
    }
  }

  public final CommentContext comment() throws RecognitionException {
    CommentContext _localctx = new CommentContext(_ctx, getState());
    enterRule(_localctx, 50, RULE_comment);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(252);
      match(T__16);
      setState(253);
      text();
      setState(254);
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

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u0103\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
      "\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
      "\t\30\4\31\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\3\3\3\7\3=\n"+
      "\3\f\3\16\3@\13\3\3\3\3\3\7\3D\n\3\f\3\16\3G\13\3\3\3\3\3\3\4\3\4"+
      "\6\4M\n\4\r\4\16\4N\3\4\3\4\3\5\3\5\6\5U\n\5\r\5\16\5V\3\5\3\5\3\6"+
      "\3\6\3\6\3\6\3\6\6\6`\n\6\r\6\16\6a\3\6\3\6\5\6f\n\6\3\7\3\7\6\7j"+
      "\n\7\r\7\16\7k\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tx\n\t\3"+
      "\t\3\t\3\n\3\n\3\n\3\n\6\n\u0080\n\n\r\n\16\n\u0081\3\n\3\n\3\13\3"+
      "\13\6\13\u0088\n\13\r\13\16\13\u0089\3\13\3\13\3\f\3\f\3\f\5\f\u0091"+
      "\n\f\3\f\5\f\u0094\n\f\3\f\3\f\3\r\6\r\u0099\n\r\r\r\16\r\u009a\3"+
      "\16\7\16\u009e\n\16\f\16\16\16\u00a1\13\16\3\16\3\16\3\16\5\16\u00a6"+
      "\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u00ad\n\17\3\20\3\20\5\20\u00b1"+
      "\n\20\3\21\3\21\5\21\u00b5\n\21\3\22\3\22\5\22\u00b9\n\22\3\23\5\23"+
      "\u00bc\n\23\3\23\3\23\5\23\u00c0\n\23\3\23\5\23\u00c3\n\23\3\24\6"+
      "\24\u00c6\n\24\r\24\16\24\u00c7\5\24\u00ca\n\24\3\24\3\24\6\24\u00ce"+
      "\n\24\r\24\16\24\u00cf\5\24\u00d2\n\24\3\24\6\24\u00d5\n\24\r\24\16"+
      "\24\u00d6\5\24\u00d9\n\24\3\25\3\25\6\25\u00dd\n\25\r\25\16\25\u00de"+
      "\3\26\3\26\3\26\3\27\3\27\6\27\u00e6\n\27\r\27\16\27\u00e7\3\27\3"+
      "\27\3\30\6\30\u00ed\n\30\r\30\16\30\u00ee\3\30\3\30\6\30\u00f3\n\30"+
      "\r\30\16\30\u00f4\3\31\5\31\u00f8\n\31\3\31\5\31\u00fb\n\31\3\32\3"+
      "\32\3\33\3\33\3\33\3\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30"+
      "\32\34\36 \"$&(*,.\60\62\64\2\3\4\2\30\35\37\37\u0114\2\66\3\2\2\2"+
      "\4:\3\2\2\2\6J\3\2\2\2\bR\3\2\2\2\ne\3\2\2\2\fg\3\2\2\2\16o\3\2\2"+
      "\2\20s\3\2\2\2\22{\3\2\2\2\24\u0085\3\2\2\2\26\u008d\3\2\2\2\30\u0098"+
      "\3\2\2\2\32\u00a5\3\2\2\2\34\u00ac\3\2\2\2\36\u00b0\3\2\2\2 \u00b4"+
      "\3\2\2\2\"\u00b6\3\2\2\2$\u00bb\3\2\2\2&\u00d8\3\2\2\2(\u00da\3\2"+
      "\2\2*\u00e0\3\2\2\2,\u00e3\3\2\2\2.\u00ec\3\2\2\2\60\u00fa\3\2\2\2"+
      "\62\u00fc\3\2\2\2\64\u00fe\3\2\2\2\66\67\5\4\3\2\678\5\30\r\289\7"+
      "\2\2\39\3\3\2\2\2:>\5\6\4\2;=\5\64\33\2<;\3\2\2\2=@\3\2\2\2><\3\2"+
      "\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AE\5\b\5\2BD\5\n\6\2CB\3\2\2\2D"+
      "G\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\5\26\f\2I\5\3"+
      "\2\2\2JL\7\3\2\2KM\7\33\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2"+
      "\2OP\3\2\2\2PQ\5\60\31\2Q\7\3\2\2\2RT\7\4\2\2SU\5\62\32\2TS\3\2\2"+
      "\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\5\60\31\2Y\t\3\2\2\2"+
      "Zf\5\f\7\2[f\5\16\b\2\\f\5\20\t\2]f\5\22\n\2^`\5\24\13\2_^\3\2\2\2"+
      "`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bf\3\2\2\2cf\5\64\33\2df\7\37\2\2eZ"+
      "\3\2\2\2e[\3\2\2\2e\\\3\2\2\2e]\3\2\2\2e_\3\2\2\2ec\3\2\2\2ed\3\2"+
      "\2\2f\13\3\2\2\2gi\7\5\2\2hj\5\62\32\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2"+
      "\2kl\3\2\2\2lm\3\2\2\2mn\5\60\31\2n\r\3\2\2\2op\7\6\2\2pq\5.\30\2"+
      "qr\5\60\31\2r\17\3\2\2\2sw\7\7\2\2tx\7\b\2\2ux\7\t\2\2vx\5.\30\2w"+
      "t\3\2\2\2wu\3\2\2\2wv\3\2\2\2xy\3\2\2\2yz\5\60\31\2z\21\3\2\2\2{|"+
      "\7\n\2\2|}\5.\30\2}\177\7\13\2\2~\u0080\7\33\2\2\177~\3\2\2\2\u0080"+
      "\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3"+
      "\2\2\2\u0083\u0084\5\60\31\2\u0084\23\3\2\2\2\u0085\u0087\7\f\2\2"+
      "\u0086\u0088\5\62\32\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
      "\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c"+
      "\5\60\31\2\u008c\25\3\2\2\2\u008d\u008e\7\r\2\2\u008e\u0090\7\30\2"+
      "\2\u008f\u0091\7\31\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
      "\u0093\3\2\2\2\u0092\u0094\7\32\2\2\u0093\u0092\3\2\2\2\u0093\u0094"+
      "\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\5\60\31\2\u0096\27\3\2\2"+
      "\2\u0097\u0099\5\32\16\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
      "\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\31\3\2\2\2\u009c\u009e\5"+
      "\34\17\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2"+
      "\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
      "\u00a6\7\36\2\2\u00a3\u00a6\5\24\13\2\u00a4\u00a6\5\64\33\2\u00a5"+
      "\u009f\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\33\3"+
      "\2\2\2\u00a7\u00ad\5\36\20\2\u00a8\u00ad\5(\25\2\u00a9\u00ad\7\26"+
      "\2\2\u00aa\u00ad\7\27\2\2\u00ab\u00ad\7\37\2\2\u00ac\u00a7\3\2\2\2"+
      "\u00ac\u00a8\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
      "\u00ab\3\2\2\2\u00ad\35\3\2\2\2\u00ae\u00b1\5 \21\2\u00af\u00b1\5"+
      ",\27\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\37\3\2\2\2\u00b2"+
      "\u00b5\5$\23\2\u00b3\u00b5\5\"\22\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3"+
      "\3\2\2\2\u00b5!\3\2\2\2\u00b6\u00b8\7\16\2\2\u00b7\u00b9\5&\24\2\u00b8"+
      "\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9#\3\2\2\2\u00ba\u00bc\7\25"+
      "\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
      "\u00bf\7\30\2\2\u00be\u00c0\7\24\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0"+
      "\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00c3\5&\24\2\u00c2\u00c1\3\2\2"+
      "\2\u00c2\u00c3\3\2\2\2\u00c3%\3\2\2\2\u00c4\u00c6\7\33\2\2\u00c5\u00c4"+
      "\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2"+
      "\2\u00c8\u00ca\3\2\2\2\u00c9\u00c5\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
      "\u00cb\3\2\2\2\u00cb\u00d1\7\17\2\2\u00cc\u00ce\7\33\2\2\u00cd\u00cc"+
      "\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2"+
      "\2\u00d0\u00d2\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
      "\u00d9\3\2\2\2\u00d3\u00d5\7\33\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6"+
      "\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2"+
      "\2\u00d8\u00c9\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d9\'\3\2\2\2\u00da\u00dc"+
      "\5*\26\2\u00db\u00dd\5\36\20\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2"+
      "\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df)\3\2\2\2\u00e0"+
      "\u00e1\7\20\2\2\u00e1\u00e2\7\33\2\2\u00e2+\3\2\2\2\u00e3\u00e5\7"+
      "\21\2\2\u00e4\u00e6\5 \21\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2"+
      "\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
      "\u00ea\7\22\2\2\u00ea-\3\2\2\2\u00eb\u00ed\7\33\2\2\u00ec\u00eb\3"+
      "\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2"+
      "\u00ef\u00f0\3\2\2\2\u00f0\u00f2\7\17\2\2\u00f1\u00f3\7\33\2\2\u00f2"+
      "\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5"+
      "\3\2\2\2\u00f5/\3\2\2\2\u00f6\u00f8\5\64\33\2\u00f7\u00f6\3\2\2\2"+
      "\u00f7\u00f8\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00fb\7\36\2\2\u00fa"+
      "\u00f7\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\61\3\2\2\2\u00fc\u00fd\t"+
      "\2\2\2\u00fd\63\3\2\2\2\u00fe\u00ff\7\23\2\2\u00ff\u0100\5\62\32\2"+
      "\u0100\u0101\7\36\2\2\u0101\65\3\2\2\2$>ENVaekw\u0081\u0089\u0090"+
      "\u0093\u009a\u009f\u00a5\u00ac\u00b0\u00b4\u00b8\u00bb\u00bf\u00c2"+
      "\u00c7\u00c9\u00cf\u00d1\u00d6\u00d8\u00de\u00e7\u00ee\u00f4\u00f7"+
      "\u00fa";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}