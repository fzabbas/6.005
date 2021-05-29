package abc.sound;

import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.MusicListener;
import abc.parser.MusicParser.CommentContext;
import abc.parser.MusicParser.ElementContext;
import abc.parser.MusicParser.EndlineContext;
import abc.parser.MusicParser.MultinoteContext;
import abc.parser.MusicParser.MusicContext;
import abc.parser.MusicParser.NoteContext;
import abc.parser.MusicParser.NoteelementContext;
import abc.parser.MusicParser.NotelengthContext;
import abc.parser.MusicParser.NthrepeatContext;
import abc.parser.MusicParser.PitchContext;
import abc.parser.MusicParser.RestContext;
import abc.parser.MusicParser.RootContext;
import abc.parser.MusicParser.TupletelementContext;
import abc.parser.MusicParser.TupletspecContext;
import abc.parser.MusicParser.VoiceContext;

public class MakeMusicBody implements MusicListener {
    private Stack<MusicBody> stack= new Stack<>();


    @Override
    public void enterEveryRule(ParserRuleContext arg0) {}
    @Override
    public void exitEveryRule(ParserRuleContext arg0) {}
    @Override
    public void visitErrorNode(ErrorNode arg0) {}
    @Override
    public void visitTerminal(TerminalNode arg0) {}
    @Override
    public void enterRoot(RootContext ctx) {}
    @Override
    public void exitRoot(RootContext ctx) {}
    @Override
    public void enterMusic(MusicContext ctx) {}
    @Override
    public void enterElement(ElementContext ctx) {}
    @Override
    public void enterNoteelement(NoteelementContext ctx) {}
    @Override
    public void enterNote(NoteContext ctx) {}
    @Override
    public void enterPitch(PitchContext ctx) {}
    @Override
    public void enterRest(RestContext ctx) {}
    @Override
    public void enterNotelength(NotelengthContext ctx) {}
    @Override
    public void enterMultinote(MultinoteContext ctx) {}
    @Override
    public void enterTupletelement(TupletelementContext ctx) {}
    @Override
    public void enterTupletspec(TupletspecContext ctx) {}   
    @Override
    public void enterNthrepeat(NthrepeatContext ctx) {}
    @Override
    public void enterVoice(VoiceContext ctx) {}
    @Override
    public void enterComment(CommentContext ctx) {}
    @Override
    public void enterEndline(EndlineContext ctx) {}

    @Override
    public void exitMusic(MusicContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitElement(ElementContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitNoteelement(NoteelementContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitNote(NoteContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitPitch(PitchContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitRest(RestContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitNotelength(NotelengthContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitMultinote(MultinoteContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitTupletelement(TupletelementContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitTupletspec(TupletspecContext ctx) {
        // TODO Auto-generated method stub

    }
  
    @Override
    public void exitNthrepeat(NthrepeatContext ctx) {
        // TODO Auto-generated method stub

    }
  
    @Override
    public void exitVoice(VoiceContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitComment(CommentContext ctx) {
        // TODO Auto-generated method stub

    }


    @Override
    public void exitEndline(EndlineContext ctx) {
        // TODO Auto-generated method stub

    }

    public MusicBody getMusicBody() {
        return null;
    }

}
