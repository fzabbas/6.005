package expressivo.parser;
import expressivo.*;
import expressivo.Number;

import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import expressivo.parser.ExpressionParser.PrimitiveContext;
import expressivo.parser.ExpressionParser.ProductContext;
import expressivo.parser.ExpressionParser.RootContext;
import expressivo.parser.ExpressionParser.SumContext;

public class MakeExpression2 implements ExpressionListener {
    private Stack<Expression> stack= new Stack<>();
    
    public Expression getExpression(){
        return stack.get(0);
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
    public void enterSum(SumContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitSum(SumContext ctx) {
        // matched the product ('+' product)* rule
        List<ExpressionParser.ProductContext> addends = ctx.product();
        assert stack.size() >= addends.size();
        
        // the pattern above always has at least 1 child;
        // pop the last child
        assert addends.size() > 0;
        Expression sum = stack.pop();
        
        // pop the older children, one by one, and add them on
        for (int i = 1; i < addends.size(); ++i) {
            sum = new Plus(stack.pop(), sum);
        }
        
        // the result is this subtree's Expression
        stack.push(sum);
        // TODO Auto-generated method stub

    }

    @Override
    public void enterProduct(ProductContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitProduct(ProductContext ctx) {
        List<ExpressionParser.PrimitiveContext> addends = ctx.primitive();
        assert stack.size() >= addends.size();
        
        // the pattern above always has at least 1 child;
        // pop the last child
        assert addends.size() > 0;
        Expression product = stack.pop();
        
        // pop the older children, one by one, and add them on
        for (int i = 1; i < addends.size(); ++i) {
            product = new Multiply(stack.pop(), product);
        }
        
        // the result is this subtree's Expression
        stack.push(product);
        // TODO Auto-generated method stub

    }

    @Override
    public void enterPrimitive(PrimitiveContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitPrimitive(PrimitiveContext ctx) {
        if (ctx.NUMBER() != null) {
            double n = Integer.valueOf(ctx.NUMBER().getText());
            Expression num = new Number(n);
            stack.push(num);
            
        } else if (ctx.VARIABLE() != null){
            String x = String.valueOf(ctx.VARIABLE().getText());
            Expression var = new Variable(x);
            stack.push(var);
        }
        // TODO Auto-generated method stub

    }

}
