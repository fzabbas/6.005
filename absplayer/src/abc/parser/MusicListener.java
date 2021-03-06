// Generated from Music.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MusicParser}.
 */
public interface MusicListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link MusicParser#root}.
   * @param ctx the parse tree
   */
  void enterRoot(MusicParser.RootContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#root}.
   * @param ctx the parse tree
   */
  void exitRoot(MusicParser.RootContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#music}.
   * @param ctx the parse tree
   */
  void enterMusic(MusicParser.MusicContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#music}.
   * @param ctx the parse tree
   */
  void exitMusic(MusicParser.MusicContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#element}.
   * @param ctx the parse tree
   */
  void enterElement(MusicParser.ElementContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#element}.
   * @param ctx the parse tree
   */
  void exitElement(MusicParser.ElementContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#noteelement}.
   * @param ctx the parse tree
   */
  void enterNoteelement(MusicParser.NoteelementContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#noteelement}.
   * @param ctx the parse tree
   */
  void exitNoteelement(MusicParser.NoteelementContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#note}.
   * @param ctx the parse tree
   */
  void enterNote(MusicParser.NoteContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#note}.
   * @param ctx the parse tree
   */
  void exitNote(MusicParser.NoteContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#pitch}.
   * @param ctx the parse tree
   */
  void enterPitch(MusicParser.PitchContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#pitch}.
   * @param ctx the parse tree
   */
  void exitPitch(MusicParser.PitchContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#rest}.
   * @param ctx the parse tree
   */
  void enterRest(MusicParser.RestContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#rest}.
   * @param ctx the parse tree
   */
  void exitRest(MusicParser.RestContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#notelength}.
   * @param ctx the parse tree
   */
  void enterNotelength(MusicParser.NotelengthContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#notelength}.
   * @param ctx the parse tree
   */
  void exitNotelength(MusicParser.NotelengthContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#multinote}.
   * @param ctx the parse tree
   */
  void enterMultinote(MusicParser.MultinoteContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#multinote}.
   * @param ctx the parse tree
   */
  void exitMultinote(MusicParser.MultinoteContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#tupletelement}.
   * @param ctx the parse tree
   */
  void enterTupletelement(MusicParser.TupletelementContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#tupletelement}.
   * @param ctx the parse tree
   */
  void exitTupletelement(MusicParser.TupletelementContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#tupletspec}.
   * @param ctx the parse tree
   */
  void enterTupletspec(MusicParser.TupletspecContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#tupletspec}.
   * @param ctx the parse tree
   */
  void exitTupletspec(MusicParser.TupletspecContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#nthrepeat}.
   * @param ctx the parse tree
   */
  void enterNthrepeat(MusicParser.NthrepeatContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#nthrepeat}.
   * @param ctx the parse tree
   */
  void exitNthrepeat(MusicParser.NthrepeatContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#voice}.
   * @param ctx the parse tree
   */
  void enterVoice(MusicParser.VoiceContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#voice}.
   * @param ctx the parse tree
   */
  void exitVoice(MusicParser.VoiceContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#comment}.
   * @param ctx the parse tree
   */
  void enterComment(MusicParser.CommentContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#comment}.
   * @param ctx the parse tree
   */
  void exitComment(MusicParser.CommentContext ctx);
  /**
   * Enter a parse tree produced by {@link MusicParser#endline}.
   * @param ctx the parse tree
   */
  void enterEndline(MusicParser.EndlineContext ctx);
  /**
   * Exit a parse tree produced by {@link MusicParser#endline}.
   * @param ctx the parse tree
   */
  void exitEndline(MusicParser.EndlineContext ctx);
}