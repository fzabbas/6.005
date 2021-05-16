/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package expressivo;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Tests for the Expression abstract data type.
 */
public class ExpressionTest {

    // Testing strategy
    //   TODO
    
    
    
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    Number num1 = new Number((double) 1);
    Number num2 = new Number((double)1);
    Number num3 = new Number((double)2);
    Variable var1 = new Variable ("x");
    Variable var2 = new Variable ("x");
    Variable var3 = new Variable ("y");
    Plus sum1 = new Plus(new Number((double)3), new Number((double)4));
    Plus sum2 = new Plus(new Number((double)3), new Number((double) 4));
    Plus sum3 = new Plus(new Number((double)4), new Number((double)3));
    Multiply prod1 = new Multiply(new Number((double)3), new Number((double)4));
    Multiply prod2 = new Multiply(new Number((double)3), new Number((double)4));
    Multiply prod3 = new Multiply(new Number((double)4), new Number((double)3));
    Multiply prod4 = new Multiply(new Variable("x"), new Number((double)3));


    
    @Test
    public  void testToString() {
        
        assertEquals("Expected string:", "1.0", num1.toString());
        assertEquals("Expected string:", "x", var1.toString());
        assertEquals("Expected string:", "(3.0)+(4.0)", sum1.toString());
        assertEquals("Expected string:", "(x)*(3.0)", prod4.toString());
    }
    
    @Test
    public  void testEquals() {
        assertTrue("Expected 1 and 1 to be equal", num1.equals(num2));
        assertFalse("Expected 1 and 2 not to be equal", num1.equals(num3));
        assertTrue("Expected x and x to be equal", var1.equals(var2));
        assertFalse("Expected x and y not to be equal", var1.equals(var3));
        assertTrue("Expected 3+4 and 3+ 4 to be equal", sum1.equals(sum2));
        assertFalse("Expected 3+4 and 4+3 not to be equal", sum1.equals(sum3));
        assertTrue("Expected 3x4 and 3x 4 to be equal", prod1.equals(prod2));
        assertFalse("Expected 3x4 and 4x3 not to be equal", prod1.equals(prod3));

    }
    
    @Test
    public  void testHashCode() {
        assertTrue("Expected 1 and 1 to be equal", num1.hashCode()==(num2).hashCode());
        assertTrue("Expected x and x to be equal", var1.hashCode() == (var2).hashCode());
        assertTrue("Expected 3+4 and 3+ 4 to be equal", sum1.hashCode() == (sum2).hashCode());
        assertTrue("Expected 3x4 and 3x 4 to be equal", prod1.hashCode() == (prod2).hashCode());

    }

    @Test
    public void testParse() {
        Expression expectedResult = new Plus(new Number((double)2), new Variable("y"));
        assertEquals("Expected Expresion Plus (2+y) ", expectedResult.toString(), Expression.parse("2+y ").toString() );
        Expression expectedResult2 = new Plus(new Number((double)2), new Variable("y "));
        assertEquals("Expected Expresion Space Insensitive ", expectedResult2.toString(), Expression.parse("2+y ").toString() );
        Expression expectedResult3 = new Multiply(new Number((double)2), new Variable("y "));
        assertEquals("Expected Expresion Product", expectedResult3.toString(), Expression.parse("2*y").toString() );
    }
    
    @Test
    public void testDerive() {
        Expression f = new Variable(("u")) ;
        Expression n = new Number(1.2);
        Expression mult = new Multiply(new Variable("x"), new Variable("x"));
        Expression multResult = new Multiply(new Number(2.0), new Variable("x"));
        Expression plus = new Plus(new Variable("x"), new Variable("x"));
        Expression plusResult = new Plus(new Number(1.0), new Number(1.0));
        Expression mult2 = new Multiply(new Variable("x"), new Number(2.0));

        assertEquals("Expected reuslt 1", "1.0", f.derive("u").toString());
        assertEquals("Expected reuslt 0 for constant", "0.0", n.derive("u").toString());
        assertEquals("Expected reuslt 2x for constant", multResult, mult.derive("x"));
        assertEquals("Expected reuslt 2x for constant", plusResult, plus.derive("x"));
        assertEquals("Expected reuslt 2x for constant", new Number(2.0), mult2.derive("x"));

    }
    
    @Test
    public void testSimplify() {
        Expression var = new Variable ("u");
        Expression n = new Number(1.2);
        Expression mult = new Multiply(new Variable("u"), new Variable("u"));
        Expression sum = new Plus(new Variable("u"), new Variable("u"));

        Map<String, Double> map = new HashMap<String, Double>();
        map.put("u", 3.0);
        assertEquals("Expected u to be substitutes to 2", new Number(3.0), var.simplify(map));
        assertEquals("Expected no change", n, n.simplify(map));
        assertEquals("Expected expr to simplify to 9", new Number(9.0), mult.simplify(map));
        assertEquals("Expected expr to simplify to 6", new Number(6.0), sum.simplify(map));

    }


}
