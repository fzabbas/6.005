package abc.sound;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import abc.parser.HeaderLexer;
import abc.parser.HeaderParser;
import abc.parser.MakeHeader;
import abc.parser.MusicLexer;
import abc.parser.MusicParser;

public class Parser {
    public static Header parseHeader(File input) throws IOException {
        FileInputStream fis = new FileInputStream(input);

        CharStream stream = new ANTLRInputStream(fis);
        HeaderParser parser = makeHeaderParser(stream);
        ParseTree tree = parser.root();
        System.err.println(tree.toStringTree(parser));
        Trees.inspect(tree, parser);
//        new ParseTreeWalker().walk(new PrintEverything(), tree);
        
        MakeHeader headerMaker = new MakeHeader();
        new ParseTreeWalker().walk((ParseTreeListener) headerMaker, tree);
        return headerMaker.getHeader();
    }
    
//    public static MusicBody parseMusic(String input) {
//        CharStream stream = new ANTLRInputStream(input);
    public static MusicBody parseMusic(File input) throws IOException {
        FileInputStream fis = new FileInputStream(input);

        CharStream stream = new ANTLRInputStream(fis);
            
        MusicParser parser = makeMusicParser(stream);
        ParseTree tree = parser.root();
        System.err.println(tree.toStringTree(parser));
        Trees.inspect(tree, parser);
//        new ParseTreeWalker().walk(new PrintEverything(), tree);
        
        MakeMusicBody musicMaker = new MakeMusicBody();
        new ParseTreeWalker().walk((ParseTreeListener) musicMaker, tree);
        return musicMaker.getMusicBody();
    }
    
    private static MusicParser makeMusicParser(CharStream input) {
        MusicLexer lexer = new MusicLexer(input);
        TokenStream tokens = new CommonTokenStream(lexer);
        MusicParser parser = new MusicParser(tokens);
        parser.reportErrorsAsExceptions();
        
        return parser;
    }

    public static HeaderParser makeHeaderParser(CharStream input) {
      HeaderLexer lexer = new HeaderLexer(input);
      TokenStream tokens = new CommonTokenStream(lexer);
      HeaderParser parser = new HeaderParser(tokens);
      parser.reportErrorsAsExceptions();
      
      return parser;
  }

}
