// Generated from Music.g4 by ANTLR 4.5.1

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
public class MusicParser extends Parser {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    BARLINE=10, OCTAVE=11, ACCIDENTAL=12, BASENOTE=13, TEXT=14, DIGIT=15, 
    NEWLINE=16, WHITESPACE=17;
  public static final int
    RULE_root = 0, RULE_music = 1, RULE_element = 2, RULE_noteelement = 3, 
    RULE_note = 4, RULE_pitch = 5, RULE_rest = 6, RULE_notelength = 7, RULE_multinote = 8, 
    RULE_tupletelement = 9, RULE_tupletspec = 10, RULE_nthrepeat = 11, RULE_voice = 12, 
    RULE_comment = 13, RULE_endline = 14;
  public static final String[] ruleNames = {
    "root", "music", "element", "noteelement", "note", "pitch", "rest", 
    "notelength", "multinote", "tupletelement", "tupletspec", "nthrepeat", 
    "voice", "comment", "endline"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'z'", "'/'", "'['", "']'", "'('", "'[1'", "'[2'", "'V:'", "'%'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, "BARLINE", 
    "OCTAVE", "ACCIDENTAL", "BASENOTE", "TEXT", "DIGIT", "NEWLINE", "WHITESPACE"
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
  public String getGrammarFileName() { return "Music.g4"; }

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

  public MusicParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }
  public static class RootContext extends ParserRuleContext {
    public MusicContext music() {
      return getRuleContext(MusicContext.class,0);
    }
    public TerminalNode EOF() { return getToken(MusicParser.EOF, 0); }
    public RootContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_root; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterRoot(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitRoot(this);
    }
  }

  public final RootContext root() throws RecognitionException {
    RootContext _localctx = new RootContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_root);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(30);
      music();
      setState(31);
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

  public static class MusicContext extends ParserRuleContext {
    public TerminalNode NEWLINE() { return getToken(MusicParser.NEWLINE, 0); }
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
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterMusic(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitMusic(this);
    }
  }

  public final MusicContext music() throws RecognitionException {
    MusicContext _localctx = new MusicContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_music);
    int _la;
    try {
      setState(42);
      switch (_input.LA(1)) {
      case T__0:
      case T__2:
      case T__4:
      case T__5:
      case T__6:
      case BARLINE:
      case ACCIDENTAL:
      case BASENOTE:
      case NEWLINE:
      case WHITESPACE:
        enterOuterAlt(_localctx, 1);
        {
        setState(36);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << BARLINE) | (1L << ACCIDENTAL) | (1L << BASENOTE) | (1L << WHITESPACE))) != 0)) {
          {
          {
          setState(33);
          element();
          }
          }
          setState(38);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(39);
        match(NEWLINE);
        }
        break;
      case T__7:
        enterOuterAlt(_localctx, 2);
        {
        setState(40);
        voice();
        }
        break;
      case T__8:
        enterOuterAlt(_localctx, 3);
        {
        setState(41);
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
    public TerminalNode BARLINE() { return getToken(MusicParser.BARLINE, 0); }
    public TupletelementContext tupletelement() {
      return getRuleContext(TupletelementContext.class,0);
    }
    public NthrepeatContext nthrepeat() {
      return getRuleContext(NthrepeatContext.class,0);
    }
    public TerminalNode WHITESPACE() { return getToken(MusicParser.WHITESPACE, 0); }
    public ElementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_element; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterElement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitElement(this);
    }
  }

  public final ElementContext element() throws RecognitionException {
    ElementContext _localctx = new ElementContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_element);
    try {
      setState(49);
      switch (_input.LA(1)) {
      case T__0:
      case T__2:
      case ACCIDENTAL:
      case BASENOTE:
        enterOuterAlt(_localctx, 1);
        {
        setState(44);
        noteelement();
        }
        break;
      case BARLINE:
        enterOuterAlt(_localctx, 2);
        {
        setState(45);
        match(BARLINE);
        }
        break;
      case T__4:
        enterOuterAlt(_localctx, 3);
        {
        setState(46);
        tupletelement();
        }
        break;
      case T__5:
      case T__6:
        enterOuterAlt(_localctx, 4);
        {
        setState(47);
        nthrepeat();
        }
        break;
      case WHITESPACE:
        enterOuterAlt(_localctx, 5);
        {
        setState(48);
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
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterNoteelement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitNoteelement(this);
    }
  }

  public final NoteelementContext noteelement() throws RecognitionException {
    NoteelementContext _localctx = new NoteelementContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_noteelement);
    try {
      setState(53);
      switch (_input.LA(1)) {
      case T__0:
      case ACCIDENTAL:
      case BASENOTE:
        enterOuterAlt(_localctx, 1);
        {
        setState(51);
        note();
        }
        break;
      case T__2:
        enterOuterAlt(_localctx, 2);
        {
        setState(52);
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
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterNote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitNote(this);
    }
  }

  public final NoteContext note() throws RecognitionException {
    NoteContext _localctx = new NoteContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_note);
    try {
      setState(57);
      switch (_input.LA(1)) {
      case ACCIDENTAL:
      case BASENOTE:
        enterOuterAlt(_localctx, 1);
        {
        setState(55);
        pitch();
        }
        break;
      case T__0:
        enterOuterAlt(_localctx, 2);
        {
        setState(56);
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
    public TerminalNode BASENOTE() { return getToken(MusicParser.BASENOTE, 0); }
    public TerminalNode ACCIDENTAL() { return getToken(MusicParser.ACCIDENTAL, 0); }
    public TerminalNode OCTAVE() { return getToken(MusicParser.OCTAVE, 0); }
    public NotelengthContext notelength() {
      return getRuleContext(NotelengthContext.class,0);
    }
    public PitchContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_pitch; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterPitch(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitPitch(this);
    }
  }

  public final PitchContext pitch() throws RecognitionException {
    PitchContext _localctx = new PitchContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_pitch);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(60);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(59);
        match(ACCIDENTAL);
        }
      }

      setState(62);
      match(BASENOTE);
      setState(64);
      _la = _input.LA(1);
      if (_la==OCTAVE) {
        {
        setState(63);
        match(OCTAVE);
        }
      }

      setState(67);
      _la = _input.LA(1);
      if (_la==T__1 || _la==DIGIT) {
        {
        setState(66);
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
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterRest(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitRest(this);
    }
  }

  public final RestContext rest() throws RecognitionException {
    RestContext _localctx = new RestContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_rest);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(69);
      match(T__0);
      setState(71);
      _la = _input.LA(1);
      if (_la==T__1 || _la==DIGIT) {
        {
        setState(70);
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
    public List<TerminalNode> DIGIT() { return getTokens(MusicParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(MusicParser.DIGIT, i);
    }
    public NotelengthContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_notelength; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterNotelength(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitNotelength(this);
    }
  }

  public final NotelengthContext notelength() throws RecognitionException {
    NotelengthContext _localctx = new NotelengthContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_notelength);
    int _la;
    try {
      setState(89);
      switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        {
        setState(78);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
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
          }
        }

        setState(80);
        match(T__1);
        setState(82);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
          setState(81);
          match(DIGIT);
          }
        }

        }
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        setState(85); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(84);
          match(DIGIT);
          }
          }
          setState(87); 
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
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterMultinote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitMultinote(this);
    }
  }

  public final MultinoteContext multinote() throws RecognitionException {
    MultinoteContext _localctx = new MultinoteContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_multinote);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(91);
      match(T__2);
      setState(93); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(92);
        note();
        }
        }
        setState(95); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ACCIDENTAL) | (1L << BASENOTE))) != 0) );
      setState(97);
      match(T__3);
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
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterTupletelement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitTupletelement(this);
    }
  }

  public final TupletelementContext tupletelement() throws RecognitionException {
    TupletelementContext _localctx = new TupletelementContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_tupletelement);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(99);
      tupletspec();
      setState(101); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(100);
          noteelement();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(103); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
    public TerminalNode DIGIT() { return getToken(MusicParser.DIGIT, 0); }
    public TupletspecContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tupletspec; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterTupletspec(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitTupletspec(this);
    }
  }

  public final TupletspecContext tupletspec() throws RecognitionException {
    TupletspecContext _localctx = new TupletspecContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_tupletspec);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(105);
      match(T__4);
      setState(106);
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
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterNthrepeat(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitNthrepeat(this);
    }
  }

  public final NthrepeatContext nthrepeat() throws RecognitionException {
    NthrepeatContext _localctx = new NthrepeatContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_nthrepeat);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(108);
      _la = _input.LA(1);
      if ( !(_la==T__5 || _la==T__6) ) {
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
    public List<TerminalNode> TEXT() { return getTokens(MusicParser.TEXT); }
    public TerminalNode TEXT(int i) {
      return getToken(MusicParser.TEXT, i);
    }
    public VoiceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_voice; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterVoice(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitVoice(this);
    }
  }

  public final VoiceContext voice() throws RecognitionException {
    VoiceContext _localctx = new VoiceContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_voice);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(110);
      match(T__7);
      setState(112); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(111);
        match(TEXT);
        }
        }
        setState(114); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==TEXT );
      setState(116);
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
    public TerminalNode TEXT() { return getToken(MusicParser.TEXT, 0); }
    public TerminalNode NEWLINE() { return getToken(MusicParser.NEWLINE, 0); }
    public CommentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_comment; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterComment(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitComment(this);
    }
  }

  public final CommentContext comment() throws RecognitionException {
    CommentContext _localctx = new CommentContext(_ctx, getState());
    enterRule(_localctx, 26, RULE_comment);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(118);
      match(T__8);
      setState(119);
      match(TEXT);
      setState(120);
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
    public TerminalNode NEWLINE() { return getToken(MusicParser.NEWLINE, 0); }
    public EndlineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_endline; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).enterEndline(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof MusicListener ) ((MusicListener)listener).exitEndline(this);
    }
  }

  public final EndlineContext endline() throws RecognitionException {
    EndlineContext _localctx = new EndlineContext(_ctx, getState());
    enterRule(_localctx, 28, RULE_endline);
    int _la;
    try {
      setState(126);
      switch (_input.LA(1)) {
      case EOF:
      case T__8:
        enterOuterAlt(_localctx, 1);
        {
        setState(123);
        _la = _input.LA(1);
        if (_la==T__8) {
          {
          setState(122);
          comment();
          }
        }

        }
        break;
      case NEWLINE:
        enterOuterAlt(_localctx, 2);
        {
        setState(125);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23\u0083\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3"+
      "\2\3\3\7\3%\n\3\f\3\16\3(\13\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\3"+
      "\4\3\4\5\4\64\n\4\3\5\3\5\5\58\n\5\3\6\3\6\5\6<\n\6\3\7\5\7?\n\7\3"+
      "\7\3\7\5\7C\n\7\3\7\5\7F\n\7\3\b\3\b\5\bJ\n\b\3\t\6\tM\n\t\r\t\16"+
      "\tN\5\tQ\n\t\3\t\3\t\5\tU\n\t\3\t\6\tX\n\t\r\t\16\tY\5\t\\\n\t\3\n"+
      "\3\n\6\n`\n\n\r\n\16\na\3\n\3\n\3\13\3\13\6\13h\n\13\r\13\16\13i\3"+
      "\f\3\f\3\f\3\r\3\r\3\16\3\16\6\16s\n\16\r\16\16\16t\3\16\3\16\3\17"+
      "\3\17\3\17\3\17\3\20\5\20~\n\20\3\20\5\20\u0081\n\20\3\20\2\2\21\2"+
      "\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\3\3\2\b\t\u008a\2 \3\2\2\2"+
      "\4,\3\2\2\2\6\63\3\2\2\2\b\67\3\2\2\2\n;\3\2\2\2\f>\3\2\2\2\16G\3"+
      "\2\2\2\20[\3\2\2\2\22]\3\2\2\2\24e\3\2\2\2\26k\3\2\2\2\30n\3\2\2\2"+
      "\32p\3\2\2\2\34x\3\2\2\2\36\u0080\3\2\2\2 !\5\4\3\2!\"\7\2\2\3\"\3"+
      "\3\2\2\2#%\5\6\4\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2"+
      "\2\2(&\3\2\2\2)-\7\22\2\2*-\5\32\16\2+-\5\34\17\2,&\3\2\2\2,*\3\2"+
      "\2\2,+\3\2\2\2-\5\3\2\2\2.\64\5\b\5\2/\64\7\f\2\2\60\64\5\24\13\2"+
      "\61\64\5\30\r\2\62\64\7\23\2\2\63.\3\2\2\2\63/\3\2\2\2\63\60\3\2\2"+
      "\2\63\61\3\2\2\2\63\62\3\2\2\2\64\7\3\2\2\2\658\5\n\6\2\668\5\22\n"+
      "\2\67\65\3\2\2\2\67\66\3\2\2\28\t\3\2\2\29<\5\f\7\2:<\5\16\b\2;9\3"+
      "\2\2\2;:\3\2\2\2<\13\3\2\2\2=?\7\16\2\2>=\3\2\2\2>?\3\2\2\2?@\3\2"+
      "\2\2@B\7\17\2\2AC\7\r\2\2BA\3\2\2\2BC\3\2\2\2CE\3\2\2\2DF\5\20\t\2"+
      "ED\3\2\2\2EF\3\2\2\2F\r\3\2\2\2GI\7\3\2\2HJ\5\20\t\2IH\3\2\2\2IJ\3"+
      "\2\2\2J\17\3\2\2\2KM\7\21\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2"+
      "\2\2OQ\3\2\2\2PL\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RT\7\4\2\2SU\7\21\2\2"+
      "TS\3\2\2\2TU\3\2\2\2U\\\3\2\2\2VX\7\21\2\2WV\3\2\2\2XY\3\2\2\2YW\3"+
      "\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[P\3\2\2\2[W\3\2\2\2\\\21\3\2\2\2]_\7\5"+
      "\2\2^`\5\n\6\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2c"+
      "d\7\6\2\2d\23\3\2\2\2eg\5\26\f\2fh\5\b\5\2gf\3\2\2\2hi\3\2\2\2ig\3"+
      "\2\2\2ij\3\2\2\2j\25\3\2\2\2kl\7\7\2\2lm\7\21\2\2m\27\3\2\2\2no\t"+
      "\2\2\2o\31\3\2\2\2pr\7\n\2\2qs\7\20\2\2rq\3\2\2\2st\3\2\2\2tr\3\2"+
      "\2\2tu\3\2\2\2uv\3\2\2\2vw\5\36\20\2w\33\3\2\2\2xy\7\13\2\2yz\7\20"+
      "\2\2z{\7\22\2\2{\35\3\2\2\2|~\5\34\17\2}|\3\2\2\2}~\3\2\2\2~\u0081"+
      "\3\2\2\2\177\u0081\7\22\2\2\u0080}\3\2\2\2\u0080\177\3\2\2\2\u0081"+
      "\37\3\2\2\2\25&,\63\67;>BEINPTY[ait}\u0080";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}