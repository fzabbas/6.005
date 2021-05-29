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
    T__16=17, T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, BARLINE=23, 
    OCTAVE=24, ACCIDENTAL=25, BASENOTE=26, WHITESPACE=27, TEXT=28, DIGIT=29, 
    NEWLINE=30, SPACES=31;
  public static final int
    RULE_root = 0, RULE_header = 1, RULE_index = 2, RULE_title = 3, RULE_otherfields = 4, 
    RULE_composer = 5, RULE_length = 6, RULE_meter = 7, RULE_tempo = 8, 
    RULE_key = 9, RULE_accidental = 10, RULE_music = 11, RULE_element = 12, 
    RULE_noteelement = 13, RULE_note = 14, RULE_pitch = 15, RULE_rest = 16, 
    RULE_notelength = 17, RULE_multinote = 18, RULE_tupletelement = 19, 
    RULE_tupletspec = 20, RULE_nthrepeat = 21, RULE_voice = 22, RULE_comment = 23, 
    RULE_endline = 24;
  public static final String[] ruleNames = {
    "root", "header", "index", "title", "otherfields", "composer", "length", 
    "meter", "tempo", "key", "accidental", "music", "element", "noteelement", 
    "note", "pitch", "rest", "notelength", "multinote", "tupletelement", 
    "tupletspec", "nthrepeat", "voice", "comment", "endline"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'X:'", "'T:'", "'C:'", "'L:'", "'/'", "'M:'", "'C'", "'C|'", 
    "'Q:'", "'='", "'K:'", "'m'", "'#'", "'b'", "'z'", "'['", "']'", "'('", 
    "'[1'", "'[2'", "'V:'", "'%'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, null, null, null, null, null, null, null, null, "BARLINE", 
    "OCTAVE", "ACCIDENTAL", "BASENOTE", "WHITESPACE", "TEXT", "DIGIT", "NEWLINE", 
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
      setState(50);
      header();
      setState(51);
      music();
      setState(52);
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
    public List<OtherfieldsContext> otherfields() {
      return getRuleContexts(OtherfieldsContext.class);
    }
    public OtherfieldsContext otherfields(int i) {
      return getRuleContext(OtherfieldsContext.class,i);
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
      setState(54);
      index();
      setState(58);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__21) {
        {
        {
        setState(55);
        comment();
        }
        }
        setState(60);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(61);
      title();
      setState(65);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__20) | (1L << DIGIT))) != 0)) {
        {
        {
        setState(62);
        otherfields();
        }
        }
        setState(67);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(68);
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
      setState(70);
      match(T__0);
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
      setState(76);
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
    public List<TerminalNode> TEXT() { return getTokens(AbcParser.TEXT); }
    public TerminalNode TEXT(int i) {
      return getToken(AbcParser.TEXT, i);
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
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(78);
      match(T__1);
      setState(80); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(79);
        match(TEXT);
        }
        }
        setState(82); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==TEXT );
      setState(84);
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
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterOtherfields(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitOtherfields(this);
    }
  }

  public final OtherfieldsContext otherfields() throws RecognitionException {
    OtherfieldsContext _localctx = new OtherfieldsContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_otherfields);
    try {
      int _alt;
      setState(95);
      switch (_input.LA(1)) {
      case T__2:
        enterOuterAlt(_localctx, 1);
        {
        setState(86);
        composer();
        }
        break;
      case T__3:
        enterOuterAlt(_localctx, 2);
        {
        setState(87);
        length();
        }
        break;
      case T__5:
      case T__7:
      case DIGIT:
        enterOuterAlt(_localctx, 3);
        {
        setState(88);
        meter();
        }
        break;
      case T__8:
        enterOuterAlt(_localctx, 4);
        {
        setState(89);
        tempo();
        }
        break;
      case T__20:
        enterOuterAlt(_localctx, 5);
        {
        setState(91); 
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
          case 1:
            {
            {
            setState(90);
            voice();
            }
            }
            break;
          default:
            throw new NoViableAltException(this);
          }
          setState(93); 
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,4,_ctx);
        } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
    public TerminalNode TEXT() { return getToken(AbcParser.TEXT, 0); }
    public EndlineContext endline() {
      return getRuleContext(EndlineContext.class,0);
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
      enterOuterAlt(_localctx, 1);
      {
      setState(97);
      match(T__2);
      setState(98);
      match(TEXT);
      setState(99);
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
    public List<TerminalNode> DIGIT() { return getTokens(AbcParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(AbcParser.DIGIT, i);
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
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(101);
      match(T__3);
      setState(103); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(102);
        match(DIGIT);
        }
        }
        setState(105); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(107);
      match(T__4);
      setState(113);
      switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
      case 1:
        {
        setState(109); 
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
          case 1:
            {
            {
            setState(108);
            match(DIGIT);
            }
            }
            break;
          default:
            throw new NoViableAltException(this);
          }
          setState(111); 
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,7,_ctx);
        } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
        }
        break;
      }
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

  public static class MeterContext extends ParserRuleContext {
    public EndlineContext endline() {
      return getRuleContext(EndlineContext.class,0);
    }
    public List<TerminalNode> DIGIT() { return getTokens(AbcParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(AbcParser.DIGIT, i);
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
    int _la;
    try {
      int _alt;
      setState(132);
      switch (_input.LA(1)) {
      case T__5:
        enterOuterAlt(_localctx, 1);
        {
        setState(117);
        match(T__5);
        setState(118);
        match(T__6);
        }
        break;
      case T__7:
        enterOuterAlt(_localctx, 2);
        {
        setState(119);
        match(T__7);
        }
        break;
      case DIGIT:
        enterOuterAlt(_localctx, 3);
        {
        setState(121); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(120);
          match(DIGIT);
          }
          }
          setState(123); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==DIGIT );
        setState(125);
        match(T__4);
        setState(127); 
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
          case 1:
            {
            {
            setState(126);
            match(DIGIT);
            }
            }
            break;
          default:
            throw new NoViableAltException(this);
          }
          setState(129); 
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,10,_ctx);
        } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
        setState(131);
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
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(134);
      match(T__8);
      setState(136); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(135);
        match(DIGIT);
        }
        }
        setState(138); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(140);
      match(T__4);
      setState(142); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(141);
        match(DIGIT);
        }
        }
        setState(144); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(146);
      match(T__9);
      setState(148); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(147);
          match(DIGIT);
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(150); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,14,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      setState(152);
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
    public AccidentalContext accidental() {
      return getRuleContext(AccidentalContext.class,0);
    }
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
    enterRule(_localctx, 18, RULE_key);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(154);
      match(T__10);
      setState(155);
      match(BASENOTE);
      setState(157);
      _la = _input.LA(1);
      if (_la==T__12 || _la==T__13) {
        {
        setState(156);
        accidental();
        }
      }

      setState(160);
      _la = _input.LA(1);
      if (_la==T__11) {
        {
        setState(159);
        match(T__11);
        }
      }

      setState(162);
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
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterAccidental(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitAccidental(this);
    }
  }

  public final AccidentalContext accidental() throws RecognitionException {
    AccidentalContext _localctx = new AccidentalContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_accidental);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(164);
      _la = _input.LA(1);
      if ( !(_la==T__12 || _la==T__13) ) {
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

  public static class MusicContext extends ParserRuleContext {
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
      setState(175);
      switch (_input.LA(1)) {
      case T__14:
      case T__15:
      case T__17:
      case T__18:
      case T__19:
      case BARLINE:
      case ACCIDENTAL:
      case BASENOTE:
      case WHITESPACE:
      case NEWLINE:
        enterOuterAlt(_localctx, 1);
        {
        setState(169);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << BARLINE) | (1L << ACCIDENTAL) | (1L << BASENOTE) | (1L << WHITESPACE))) != 0)) {
          {
          {
          setState(166);
          element();
          }
          }
          setState(171);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(172);
        match(NEWLINE);
        }
        break;
      case T__20:
        enterOuterAlt(_localctx, 2);
        {
        setState(173);
        voice();
        }
        break;
      case T__21:
        enterOuterAlt(_localctx, 3);
        {
        setState(174);
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
    public TerminalNode BARLINE() { return getToken(AbcParser.BARLINE, 0); }
    public TupletelementContext tupletelement() {
      return getRuleContext(TupletelementContext.class,0);
    }
    public NthrepeatContext nthrepeat() {
      return getRuleContext(NthrepeatContext.class,0);
    }
    public TerminalNode WHITESPACE() { return getToken(AbcParser.WHITESPACE, 0); }
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
    enterRule(_localctx, 24, RULE_element);
    try {
      setState(182);
      switch (_input.LA(1)) {
      case T__14:
      case T__15:
      case ACCIDENTAL:
      case BASENOTE:
        enterOuterAlt(_localctx, 1);
        {
        setState(177);
        noteelement();
        }
        break;
      case BARLINE:
        enterOuterAlt(_localctx, 2);
        {
        setState(178);
        match(BARLINE);
        }
        break;
      case T__17:
        enterOuterAlt(_localctx, 3);
        {
        setState(179);
        tupletelement();
        }
        break;
      case T__18:
      case T__19:
        enterOuterAlt(_localctx, 4);
        {
        setState(180);
        nthrepeat();
        }
        break;
      case WHITESPACE:
        enterOuterAlt(_localctx, 5);
        {
        setState(181);
        match(WHITESPACE);
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
    enterRule(_localctx, 26, RULE_noteelement);
    try {
      setState(186);
      switch (_input.LA(1)) {
      case T__14:
      case ACCIDENTAL:
      case BASENOTE:
        enterOuterAlt(_localctx, 1);
        {
        setState(184);
        note();
        }
        break;
      case T__15:
        enterOuterAlt(_localctx, 2);
        {
        setState(185);
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
    enterRule(_localctx, 28, RULE_note);
    try {
      setState(190);
      switch (_input.LA(1)) {
      case ACCIDENTAL:
      case BASENOTE:
        enterOuterAlt(_localctx, 1);
        {
        setState(188);
        pitch();
        }
        break;
      case T__14:
        enterOuterAlt(_localctx, 2);
        {
        setState(189);
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
    enterRule(_localctx, 30, RULE_pitch);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(193);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(192);
        match(ACCIDENTAL);
        }
      }

      setState(195);
      match(BASENOTE);
      setState(197);
      _la = _input.LA(1);
      if (_la==OCTAVE) {
        {
        setState(196);
        match(OCTAVE);
        }
      }

      setState(200);
      _la = _input.LA(1);
      if (_la==T__4 || _la==DIGIT) {
        {
        setState(199);
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
      setState(202);
      match(T__14);
      setState(204);
      _la = _input.LA(1);
      if (_la==T__4 || _la==DIGIT) {
        {
        setState(203);
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
    enterRule(_localctx, 34, RULE_notelength);
    int _la;
    try {
      setState(222);
      switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        {
        setState(211);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
          setState(207); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(206);
            match(DIGIT);
            }
            }
            setState(209); 
            _errHandler.sync(this);
            _la = _input.LA(1);
          } while ( _la==DIGIT );
          }
        }

        setState(213);
        match(T__4);
        setState(215);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
          setState(214);
          match(DIGIT);
          }
        }

        }
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        setState(218); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(217);
          match(DIGIT);
          }
          }
          setState(220); 
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
    enterRule(_localctx, 36, RULE_multinote);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(224);
      match(T__15);
      setState(226); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(225);
        note();
        }
        }
        setState(228); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << ACCIDENTAL) | (1L << BASENOTE))) != 0) );
      setState(230);
      match(T__16);
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
      setState(232);
      tupletspec();
      setState(234); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(233);
          noteelement();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(236); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
      setState(238);
      match(T__17);
      setState(239);
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

  public static class NthrepeatContext extends ParserRuleContext {
    public NthrepeatContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_nthrepeat; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNthrepeat(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNthrepeat(this);
    }
  }

  public final NthrepeatContext nthrepeat() throws RecognitionException {
    NthrepeatContext _localctx = new NthrepeatContext(_ctx, getState());
    enterRule(_localctx, 42, RULE_nthrepeat);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(241);
      _la = _input.LA(1);
      if ( !(_la==T__18 || _la==T__19) ) {
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

  public static class VoiceContext extends ParserRuleContext {
    public EndlineContext endline() {
      return getRuleContext(EndlineContext.class,0);
    }
    public List<TerminalNode> TEXT() { return getTokens(AbcParser.TEXT); }
    public TerminalNode TEXT(int i) {
      return getToken(AbcParser.TEXT, i);
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
    enterRule(_localctx, 44, RULE_voice);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(243);
      match(T__20);
      setState(245); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(244);
        match(TEXT);
        }
        }
        setState(247); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==TEXT );
      setState(249);
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

  public static class CommentContext extends ParserRuleContext {
    public TerminalNode TEXT() { return getToken(AbcParser.TEXT, 0); }
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
    enterRule(_localctx, 46, RULE_comment);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(251);
      match(T__21);
      setState(252);
      match(TEXT);
      setState(253);
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
    enterRule(_localctx, 48, RULE_endline);
    try {
      setState(259);
      switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        setState(256);
        switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
        case 1:
          {
          setState(255);
          comment();
          }
          break;
        }
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        setState(258);
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

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u0108\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
      "\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t"+
      "\30\4\31\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\3\3\3\7\3;\n\3\f\3\16\3"+
      ">\13\3\3\3\3\3\7\3B\n\3\f\3\16\3E\13\3\3\3\3\3\3\4\3\4\6\4K\n\4\r"+
      "\4\16\4L\3\4\3\4\3\5\3\5\6\5S\n\5\r\5\16\5T\3\5\3\5\3\6\3\6\3\6\3"+
      "\6\3\6\6\6^\n\6\r\6\16\6_\5\6b\n\6\3\7\3\7\3\7\3\7\3\b\3\b\6\bj\n"+
      "\b\r\b\16\bk\3\b\3\b\6\bp\n\b\r\b\16\bq\5\bt\n\b\3\b\3\b\3\t\3\t\3"+
      "\t\3\t\6\t|\n\t\r\t\16\t}\3\t\3\t\6\t\u0082\n\t\r\t\16\t\u0083\3\t"+
      "\5\t\u0087\n\t\3\n\3\n\6\n\u008b\n\n\r\n\16\n\u008c\3\n\3\n\6\n\u0091"+
      "\n\n\r\n\16\n\u0092\3\n\3\n\6\n\u0097\n\n\r\n\16\n\u0098\3\n\3\n\3"+
      "\13\3\13\3\13\5\13\u00a0\n\13\3\13\5\13\u00a3\n\13\3\13\3\13\3\f\3"+
      "\f\3\r\7\r\u00aa\n\r\f\r\16\r\u00ad\13\r\3\r\3\r\3\r\5\r\u00b2\n\r"+
      "\3\16\3\16\3\16\3\16\3\16\5\16\u00b9\n\16\3\17\3\17\5\17\u00bd\n\17"+
      "\3\20\3\20\5\20\u00c1\n\20\3\21\5\21\u00c4\n\21\3\21\3\21\5\21\u00c8"+
      "\n\21\3\21\5\21\u00cb\n\21\3\22\3\22\5\22\u00cf\n\22\3\23\6\23\u00d2"+
      "\n\23\r\23\16\23\u00d3\5\23\u00d6\n\23\3\23\3\23\5\23\u00da\n\23\3"+
      "\23\6\23\u00dd\n\23\r\23\16\23\u00de\5\23\u00e1\n\23\3\24\3\24\6\24"+
      "\u00e5\n\24\r\24\16\24\u00e6\3\24\3\24\3\25\3\25\6\25\u00ed\n\25\r"+
      "\25\16\25\u00ee\3\26\3\26\3\26\3\27\3\27\3\30\3\30\6\30\u00f8\n\30"+
      "\r\30\16\30\u00f9\3\30\3\30\3\31\3\31\3\31\3\31\3\32\5\32\u0103\n"+
      "\32\3\32\5\32\u0106\n\32\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30"+
      "\32\34\36 \"$&(*,.\60\62\2\4\3\2\17\20\3\2\25\26\u011a\2\64\3\2\2"+
      "\2\48\3\2\2\2\6H\3\2\2\2\bP\3\2\2\2\na\3\2\2\2\fc\3\2\2\2\16g\3\2"+
      "\2\2\20\u0086\3\2\2\2\22\u0088\3\2\2\2\24\u009c\3\2\2\2\26\u00a6\3"+
      "\2\2\2\30\u00b1\3\2\2\2\32\u00b8\3\2\2\2\34\u00bc\3\2\2\2\36\u00c0"+
      "\3\2\2\2 \u00c3\3\2\2\2\"\u00cc\3\2\2\2$\u00e0\3\2\2\2&\u00e2\3\2"+
      "\2\2(\u00ea\3\2\2\2*\u00f0\3\2\2\2,\u00f3\3\2\2\2.\u00f5\3\2\2\2\60"+
      "\u00fd\3\2\2\2\62\u0105\3\2\2\2\64\65\5\4\3\2\65\66\5\30\r\2\66\67"+
      "\7\2\2\3\67\3\3\2\2\28<\5\6\4\29;\5\60\31\2:9\3\2\2\2;>\3\2\2\2<:"+
      "\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?C\5\b\5\2@B\5\n\6\2A@\3\2\2"+
      "\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\5\24\13\2G"+
      "\5\3\2\2\2HJ\7\3\2\2IK\7\37\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3"+
      "\2\2\2MN\3\2\2\2NO\5\62\32\2O\7\3\2\2\2PR\7\4\2\2QS\7\36\2\2RQ\3\2"+
      "\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\5\62\32\2W\t\3\2\2"+
      "\2Xb\5\f\7\2Yb\5\16\b\2Zb\5\20\t\2[b\5\22\n\2\\^\5.\30\2]\\\3\2\2"+
      "\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2aX\3\2\2\2aY\3\2\2\2aZ\3"+
      "\2\2\2a[\3\2\2\2a]\3\2\2\2b\13\3\2\2\2cd\7\5\2\2de\7\36\2\2ef\5\62"+
      "\32\2f\r\3\2\2\2gi\7\6\2\2hj\7\37\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2"+
      "\2kl\3\2\2\2lm\3\2\2\2ms\7\7\2\2np\7\37\2\2on\3\2\2\2pq\3\2\2\2qo"+
      "\3\2\2\2qr\3\2\2\2rt\3\2\2\2so\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\5\62"+
      "\32\2v\17\3\2\2\2wx\7\b\2\2x\u0087\7\t\2\2y\u0087\7\n\2\2z|\7\37\2"+
      "\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0081"+
      "\7\7\2\2\u0080\u0082\7\37\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2"+
      "\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
      "\u0087\5\62\32\2\u0086w\3\2\2\2\u0086y\3\2\2\2\u0086{\3\2\2\2\u0087"+
      "\21\3\2\2\2\u0088\u008a\7\13\2\2\u0089\u008b\7\37\2\2\u008a\u0089"+
      "\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2"+
      "\2\u008d\u008e\3\2\2\2\u008e\u0090\7\7\2\2\u008f\u0091\7\37\2\2\u0090"+
      "\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093"+
      "\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\7\f\2\2\u0095\u0097\7\37"+
      "\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
      "\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\5\62\32\2\u009b\23"+
      "\3\2\2\2\u009c\u009d\7\r\2\2\u009d\u009f\7\34\2\2\u009e\u00a0\5\26"+
      "\f\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
      "\u00a3\7\16\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4"+
      "\3\2\2\2\u00a4\u00a5\5\62\32\2\u00a5\25\3\2\2\2\u00a6\u00a7\t\2\2"+
      "\2\u00a7\27\3\2\2\2\u00a8\u00aa\5\32\16\2\u00a9\u00a8\3\2\2\2\u00aa"+
      "\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae"+
      "\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b2\7 \2\2\u00af\u00b2\5.\30"+
      "\2\u00b0\u00b2\5\60\31\2\u00b1\u00ab\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1"+
      "\u00b0\3\2\2\2\u00b2\31\3\2\2\2\u00b3\u00b9\5\34\17\2\u00b4\u00b9"+
      "\7\31\2\2\u00b5\u00b9\5(\25\2\u00b6\u00b9\5,\27\2\u00b7\u00b9\7\35"+
      "\2\2\u00b8\u00b3\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b8"+
      "\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\33\3\2\2\2\u00ba\u00bd\5"+
      "\36\20\2\u00bb\u00bd\5&\24\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2"+
      "\2\u00bd\35\3\2\2\2\u00be\u00c1\5 \21\2\u00bf\u00c1\5\"\22\2\u00c0"+
      "\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\37\3\2\2\2\u00c2\u00c4\7"+
      "\33\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2"+
      "\2\u00c5\u00c7\7\34\2\2\u00c6\u00c8\7\32\2\2\u00c7\u00c6\3\2\2\2\u00c7"+
      "\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00cb\5$\23\2\u00ca\u00c9"+
      "\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb!\3\2\2\2\u00cc\u00ce\7\21\2\2\u00cd"+
      "\u00cf\5$\23\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf#\3\2"+
      "\2\2\u00d0\u00d2\7\37\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2"+
      "\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5"+
      "\u00d1\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9"+
      "\7\7\2\2\u00d8\u00da\7\37\2\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2"+
      "\2\2\u00da\u00e1\3\2\2\2\u00db\u00dd\7\37\2\2\u00dc\u00db\3\2\2\2"+
      "\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
      "\u00e1\3\2\2\2\u00e0\u00d5\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e1%\3\2"+
      "\2\2\u00e2\u00e4\7\22\2\2\u00e3\u00e5\5\36\20\2\u00e4\u00e3\3\2\2"+
      "\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
      "\u00e8\3\2\2\2\u00e8\u00e9\7\23\2\2\u00e9\'\3\2\2\2\u00ea\u00ec\5"+
      "*\26\2\u00eb\u00ed\5\34\17\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2"+
      "\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef)\3\2\2\2\u00f0\u00f1"+
      "\7\24\2\2\u00f1\u00f2\7\37\2\2\u00f2+\3\2\2\2\u00f3\u00f4\t\3\2\2"+
      "\u00f4-\3\2\2\2\u00f5\u00f7\7\27\2\2\u00f6\u00f8\7\36\2\2\u00f7\u00f6"+
      "\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2"+
      "\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\5\62\32\2\u00fc/\3\2\2\2\u00fd"+
      "\u00fe\7\30\2\2\u00fe\u00ff\7\36\2\2\u00ff\u0100\7 \2\2\u0100\61\3"+
      "\2\2\2\u0101\u0103\5\60\31\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2"+
      "\2\u0103\u0106\3\2\2\2\u0104\u0106\7 \2\2\u0105\u0102\3\2\2\2\u0105"+
      "\u0104\3\2\2\2\u0106\63\3\2\2\2&<CLT_akqs}\u0083\u0086\u008c\u0092"+
      "\u0098\u009f\u00a2\u00ab\u00b1\u00b8\u00bc\u00c0\u00c3\u00c7\u00ca"+
      "\u00ce\u00d3\u00d5\u00d9\u00de\u00e0\u00e6\u00ee\u00f9\u0102\u0105";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}