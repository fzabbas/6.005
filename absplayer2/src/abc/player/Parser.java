package abc.player;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import abc.parser.AbcLexer;
import abc.parser.AbcParser;

public class Parser {
    public static Abc parseAbc(File input) throws IOException {
        FileInputStream fis = new FileInputStream(input);
        CharStream stream = new ANTLRInputStream(fis);
        AbcParser parser = makeAbcParser(stream);
        ParseTree tree = parser.root();
        System.err.println(tree.toStringTree(parser));
        Trees.inspect(tree, parser);
//        new ParseTreeWalker().walk(new PrintEverything(), tree);
        MakeAbc abcMaker = new MakeAbc();
        new ParseTreeWalker().walk((ParseTreeListener) abcMaker, tree);
        return abcMaker.getAbc();
    }
    
    public static AbcParser makeAbcParser(CharStream input) {
        AbcLexer lexer = new AbcLexer(input);
        TokenStream tokens = new CommonTokenStream(lexer);
        AbcParser parser = new AbcParser(tokens);
        parser.reportErrorsAsExceptions();
        
        return parser;
    }

}
