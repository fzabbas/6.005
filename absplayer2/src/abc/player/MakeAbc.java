package abc.player;

import java.util.Arrays;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.AbcListener;
import abc.parser.AbcParser.CommentContext;
import abc.parser.AbcParser.ComposerContext;
import abc.parser.AbcParser.ElementContext;
import abc.parser.AbcParser.EndlineContext;
import abc.parser.AbcParser.FractionContext;
import abc.parser.AbcParser.HeaderContext;
import abc.parser.AbcParser.IndexContext;
import abc.parser.AbcParser.KeyContext;
import abc.parser.AbcParser.LengthContext;
import abc.parser.AbcParser.LineContext;
import abc.parser.AbcParser.MeterContext;
import abc.parser.AbcParser.MultinoteContext;
import abc.parser.AbcParser.MusicContext;
import abc.parser.AbcParser.NoteContext;
import abc.parser.AbcParser.NoteelementContext;
import abc.parser.AbcParser.NotelengthContext;
import abc.parser.AbcParser.OthersContext;
import abc.parser.AbcParser.PitchContext;
import abc.parser.AbcParser.RestContext;
import abc.parser.AbcParser.RootContext;
import abc.parser.AbcParser.TempoContext;
import abc.parser.AbcParser.TextContext;
import abc.parser.AbcParser.TitleContext;
import abc.parser.AbcParser.TupletelementContext;
import abc.parser.AbcParser.TupletspecContext;
import abc.parser.AbcParser.VoiceContext;

public class MakeAbc implements AbcListener {
    private Stack<String> requiredStack = new Stack<>();
    private Stack<String> optionalStack = new Stack<>();
    private Stack<String> bodyStack = new Stack<>();
    
    public Abc getAbc() {
        int index=-1;
        String title="";
        String key="";
        while (!requiredStack.isEmpty()) {
            String context = requiredStack.pop();
            if (context.contains("X:")) {
                Pattern pattern = Pattern.compile("[0-9]+");
                Matcher matcher = pattern.matcher(context);
                if (matcher.find()) {
                    index = Integer.valueOf(matcher.group());
                }
            } else if (context.contains("T:")) {
                title = context.replace("T:", "");
                
            } else if (context.contains("K:")){
                context = context.replace("K:","");
                Pattern pattern = Pattern.compile("[A-G]");
                Matcher matcher = pattern.matcher(context);
                if (matcher.find()) {
                    key += matcher.group();
                }
                if (context.contains("b")) {
                    key += "_FLAT";
                } else if (context.contains("#")) {
                    key+="_SHARP";
                } 
                if (context.contains("m")) {
                    key += "_MINOR";
                } else {
                    key += "_MAJOR";
                }
            }
            
        }
        AbcHeader abcHeader = new AbcHeader(index, title, key);
        
        while (!(optionalStack.isEmpty())) {
            String context = optionalStack.pop();
            if (context.contains("C:")) {
                context=context.replace("C:", "");
                abcHeader.setComposer(context);
            } else if (context.contains("L:")) {
                context=context.replace("L:", "");
                abcHeader.setLength(parseFraction(context));     
            } else if (context.contains("M:")) {
                context=context.replace("M:","");
                if (context.contains("C")) {
                    if (context.contains("|")) {
                        abcHeader.setMeter(new Fraction(2,2));
                    } else {
                        abcHeader.setMeter(new Fraction(4,4));
                    }
                } else {
                    abcHeader.setMeter(parseFraction(context));
                }
            } else if (context.contains("Q:")) {
                context=context.replace("Q:", "");
                Pattern pattern = Pattern.compile("=[0-9]+");
                Matcher matcher = pattern.matcher(context);
                int tempo = 0;
                if (matcher.find()) {
                    tempo = Integer.valueOf((matcher.group().replace("=", "")));
                    context = context.replace(matcher.group(), "");
                    abcHeader.setTempo(parseFraction(context), tempo);                
                } else {
                   System.out.println("Cant parse tempo");
                }
                
            }
        }
        AbcBody abcBody = new AbcBody();
        Abc abc = new Abc(abcHeader, abcBody);
        System.out.println(abcHeader.toString());
//        System.out.println(index + title + key);
        return abc;
    }

    private Fraction parseFraction(String context) {
        String[] nums = context.split("/");
        int num = Integer.valueOf(nums[0]);
        int den = Integer.valueOf(nums[1].strip());
        return new Fraction (num, den);
    }

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
    public void enterEndline(EndlineContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitEndline(EndlineContext ctx) {
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
    public void enterIndex(IndexContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitIndex(IndexContext ctx) {
        requiredStack.push(ctx.getText());

        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterTitle(TitleContext ctx) {
        
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitTitle(TitleContext ctx) {
        requiredStack.push(ctx.getText());

        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterOthers(OthersContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitOthers(OthersContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterComposer(ComposerContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitComposer(ComposerContext ctx) {
        optionalStack.push(ctx.getText());
        
    }

    @Override
    public void enterLength(LengthContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitLength(LengthContext ctx) {
        optionalStack.push(ctx.getText());
        
    }

    @Override
    public void enterMeter(MeterContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitMeter(MeterContext ctx) {
        optionalStack.push(ctx.getText());
        
    }

    @Override
    public void enterTempo(TempoContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitTempo(TempoContext ctx) {
        optionalStack.push(ctx.getText());
        
    }

    @Override
    public void enterVoice(VoiceContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitVoice(VoiceContext ctx) {
        optionalStack.push(ctx.getText());
        
    }

    @Override
    public void enterKey(KeyContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitKey(KeyContext ctx) {
        requiredStack.push(ctx.getText());

        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterFraction(FractionContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitFraction(FractionContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterText(TextContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitText(TextContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterMusic(MusicContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitMusic(MusicContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterLine(LineContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitLine(LineContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterElement(ElementContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitElement(ElementContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterNoteelement(NoteelementContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitNoteelement(NoteelementContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterNote(NoteContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitNote(NoteContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterRest(RestContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitRest(RestContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterPitch(PitchContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitPitch(PitchContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterNotelength(NotelengthContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitNotelength(NotelengthContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterTupletelement(TupletelementContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitTupletelement(TupletelementContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterTupletspec(TupletspecContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitTupletspec(TupletspecContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterMultinote(MultinoteContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitMultinote(MultinoteContext ctx) {
        // TODO Auto-generated method stub
        
    }

}
