/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package expressivo;

import java.util.Map;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import expressivo.parser.ExpressionLexer;
import expressivo.parser.ExpressionParser;
import expressivo.parser.MakeExpression2;
//import expressivo.parser.MakeExpression;

/**
 * An immutable data type representing a polynomial expression of:
 *   + and *
 *   nonnegative integers and floating-point numbers
 *   variables (case-sensitive nonempty strings of letters)
 * 
 * <p>PS3 instructions: this is a required ADT interface.
 * You MUST NOT change its name or package or the names or type signatures of existing methods.
 * You may, however, add additional methods, or strengthen the specs of existing methods.
 * Declare concrete variants of Expression in their own Java source files.
 */
public interface Expression {
    
    // Datatype definition
    //   TODO
    
    /**
     * Parse an expression.
     * @param input expression to parse, as defined in the PS3 handout.
     * @return expression AST for the input
     * @throws IllegalArgumentException if the expression is invalid
     */
    public static Expression parse(String input) {
        CharStream stream = new ANTLRInputStream(input);
        ExpressionParser parser = makeParser(stream);
        
        ParseTree tree = parser.root();
        System.err.println(tree.toStringTree(parser));
        Trees.inspect(tree, parser);
//        new ParseTreeWalker().walk(new PrintEverything(), tree);
        
        MakeExpression2 exprMaker = new MakeExpression2();
        new ParseTreeWalker().walk((ParseTreeListener) exprMaker, tree);
        return exprMaker.getExpression();
//        throw new RuntimeException("unimplemented");
    }
    

    public static ExpressionParser makeParser(CharStream input) {
//        CharStream stream = new ANTLRInputStream(input);
        ExpressionLexer lexer = new ExpressionLexer(input);
        TokenStream tokens = new CommonTokenStream(lexer);
        ExpressionParser parser = new ExpressionParser(tokens);
        parser.reportErrorsAsExceptions();
        
        return parser;
//        ParseTree tree = parser.root();
//        System.err.println(tree.toStringTree(parser));
//        Trees.inspect(tree, parser);
//        
//        throw new RuntimeException("unimplemented");
    }
    
    
    /**
     * @return a parsable representation of this expression, such that
     * for all e:Expression, e.equals(Expression.parse(e.toString())).
     */
    @Override 
    public String toString();

    /**
     * @param thatObject any object
     * @return true if and only if this and thatObject are structurally-equal
     * Expressions, as defined in the PS3 handout.
     */
    @Override
    public boolean equals(Object thatObject);
    
    /**
     * Differentiate an expression with respect to a variable.
     * @param String the derive with, a case-sensitive nonempty string of letters
     * @return a new expression derived by var 
     */
    
    public Expression derive(String var);

    
    /**
     * @return hash code value consistent with the equals() definition of structural
     * equality, such that for all e1,e2:Expression,
     *     e1.equals(e2) implies e1.hashCode() == e2.hashCode()
     */
    @Override
    public int hashCode();
    
    public Double value();

    public Expression simplify(Map<String, Double> val);
    
    public boolean isNum();
    
    
    // TODO more instance methods
    
}
