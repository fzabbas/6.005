package abc.sound;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.HeaderListener;
import abc.parser.HeaderParser.AccidentalContext;
import abc.parser.HeaderParser.CommentContext;
import abc.parser.HeaderParser.ComposerContext;
import abc.parser.HeaderParser.EndlineContext;
import abc.parser.HeaderParser.HeaderContext;
import abc.parser.HeaderParser.IndexContext;
import abc.parser.HeaderParser.KeyContext;
import abc.parser.HeaderParser.LengthContext;
import abc.parser.HeaderParser.MeterContext;
import abc.parser.HeaderParser.OtherfieldsContext;
import abc.parser.HeaderParser.RootContext;
import abc.parser.HeaderParser.TempoContext;
import abc.parser.HeaderParser.TitleContext;
import abc.parser.HeaderParser.VoiceContext;

public class MakeHeader implements HeaderListener {

    @Override
    public void enterEveryRule(ParserRuleContext arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitEveryRule(ParserRuleContext arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visitErrorNode(ErrorNode arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visitTerminal(TerminalNode arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterRoot(RootContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitRoot(RootContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterHeader(HeaderContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitHeader(HeaderContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterIndex(IndexContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitIndex(IndexContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterTitle(TitleContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitTitle(TitleContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterOtherfields(OtherfieldsContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitOtherfields(OtherfieldsContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterComposer(ComposerContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitComposer(ComposerContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterLength(LengthContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitLength(LengthContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterMeter(MeterContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitMeter(MeterContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterTempo(TempoContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitTempo(TempoContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterVoice(VoiceContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitVoice(VoiceContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterKey(KeyContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitKey(KeyContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterAccidental(AccidentalContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitAccidental(AccidentalContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterComment(CommentContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitComment(CommentContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterEndline(EndlineContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitEndline(EndlineContext ctx) {
        // TODO Auto-generated method stub

    }

}
