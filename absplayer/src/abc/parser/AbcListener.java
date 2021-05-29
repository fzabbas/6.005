// Generated from Abc.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AbcParser}.
 */
public interface AbcListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link AbcParser#root}.
   * @param ctx the parse tree
   */
  void enterRoot(AbcParser.RootContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#root}.
   * @param ctx the parse tree
   */
  void exitRoot(AbcParser.RootContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#header}.
   * @param ctx the parse tree
   */
  void enterHeader(AbcParser.HeaderContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#header}.
   * @param ctx the parse tree
   */
  void exitHeader(AbcParser.HeaderContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#index}.
   * @param ctx the parse tree
   */
  void enterIndex(AbcParser.IndexContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#index}.
   * @param ctx the parse tree
   */
  void exitIndex(AbcParser.IndexContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#title}.
   * @param ctx the parse tree
   */
  void enterTitle(AbcParser.TitleContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#title}.
   * @param ctx the parse tree
   */
  void exitTitle(AbcParser.TitleContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#otherfields}.
   * @param ctx the parse tree
   */
  void enterOtherfields(AbcParser.OtherfieldsContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#otherfields}.
   * @param ctx the parse tree
   */
  void exitOtherfields(AbcParser.OtherfieldsContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#composer}.
   * @param ctx the parse tree
   */
  void enterComposer(AbcParser.ComposerContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#composer}.
   * @param ctx the parse tree
   */
  void exitComposer(AbcParser.ComposerContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#length}.
   * @param ctx the parse tree
   */
  void enterLength(AbcParser.LengthContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#length}.
   * @param ctx the parse tree
   */
  void exitLength(AbcParser.LengthContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#meter}.
   * @param ctx the parse tree
   */
  void enterMeter(AbcParser.MeterContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#meter}.
   * @param ctx the parse tree
   */
  void exitMeter(AbcParser.MeterContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#tempo}.
   * @param ctx the parse tree
   */
  void enterTempo(AbcParser.TempoContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#tempo}.
   * @param ctx the parse tree
   */
  void exitTempo(AbcParser.TempoContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#key}.
   * @param ctx the parse tree
   */
  void enterKey(AbcParser.KeyContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#key}.
   * @param ctx the parse tree
   */
  void exitKey(AbcParser.KeyContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#accidental}.
   * @param ctx the parse tree
   */
  void enterAccidental(AbcParser.AccidentalContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#accidental}.
   * @param ctx the parse tree
   */
  void exitAccidental(AbcParser.AccidentalContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#music}.
   * @param ctx the parse tree
   */
  void enterMusic(AbcParser.MusicContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#music}.
   * @param ctx the parse tree
   */
  void exitMusic(AbcParser.MusicContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#element}.
   * @param ctx the parse tree
   */
  void enterElement(AbcParser.ElementContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#element}.
   * @param ctx the parse tree
   */
  void exitElement(AbcParser.ElementContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#noteelement}.
   * @param ctx the parse tree
   */
  void enterNoteelement(AbcParser.NoteelementContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#noteelement}.
   * @param ctx the parse tree
   */
  void exitNoteelement(AbcParser.NoteelementContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#note}.
   * @param ctx the parse tree
   */
  void enterNote(AbcParser.NoteContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#note}.
   * @param ctx the parse tree
   */
  void exitNote(AbcParser.NoteContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#pitch}.
   * @param ctx the parse tree
   */
  void enterPitch(AbcParser.PitchContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#pitch}.
   * @param ctx the parse tree
   */
  void exitPitch(AbcParser.PitchContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#rest}.
   * @param ctx the parse tree
   */
  void enterRest(AbcParser.RestContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#rest}.
   * @param ctx the parse tree
   */
  void exitRest(AbcParser.RestContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#notelength}.
   * @param ctx the parse tree
   */
  void enterNotelength(AbcParser.NotelengthContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#notelength}.
   * @param ctx the parse tree
   */
  void exitNotelength(AbcParser.NotelengthContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#multinote}.
   * @param ctx the parse tree
   */
  void enterMultinote(AbcParser.MultinoteContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#multinote}.
   * @param ctx the parse tree
   */
  void exitMultinote(AbcParser.MultinoteContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#tupletelement}.
   * @param ctx the parse tree
   */
  void enterTupletelement(AbcParser.TupletelementContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#tupletelement}.
   * @param ctx the parse tree
   */
  void exitTupletelement(AbcParser.TupletelementContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#tupletspec}.
   * @param ctx the parse tree
   */
  void enterTupletspec(AbcParser.TupletspecContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#tupletspec}.
   * @param ctx the parse tree
   */
  void exitTupletspec(AbcParser.TupletspecContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#nthrepeat}.
   * @param ctx the parse tree
   */
  void enterNthrepeat(AbcParser.NthrepeatContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#nthrepeat}.
   * @param ctx the parse tree
   */
  void exitNthrepeat(AbcParser.NthrepeatContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#voice}.
   * @param ctx the parse tree
   */
  void enterVoice(AbcParser.VoiceContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#voice}.
   * @param ctx the parse tree
   */
  void exitVoice(AbcParser.VoiceContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#comment}.
   * @param ctx the parse tree
   */
  void enterComment(AbcParser.CommentContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#comment}.
   * @param ctx the parse tree
   */
  void exitComment(AbcParser.CommentContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#endline}.
   * @param ctx the parse tree
   */
  void enterEndline(AbcParser.EndlineContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#endline}.
   * @param ctx the parse tree
   */
  void exitEndline(AbcParser.EndlineContext ctx);
}