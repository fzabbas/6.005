/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package expressivo;

import static org.junit.Assert.*;

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
    
    Number num1 = new Number(1);
    Number num2 = new Number(1);
    Number num3 = new Number(2);
    Variable var1 = new Variable ("x");
    Variable var2 = new Variable ("x");
    Variable var3 = new Variable ("y");
    Plus sum1 = new Plus(new Number(3), new Number(4));
    Plus sum2 = new Plus(new Number(3), new Number( 4));
    Plus sum3 = new Plus(new Number(4), new Number(3));
    Multiply prod1 = new Multiply(new Number(3), new Number(4));
    Multiply prod2 = new Multiply(new Number(3), new Number(4));
    Multiply prod3 = new Multiply(new Number(4), new Number(3));
    Multiply prod4 = new Multiply(new Variable("x"), new Number(3));


    
    @Test
    public  void testToString() {
        
        assertEquals("Expected string:", "1", num1.toString());
        assertEquals("Expected string:", "x", var1.toString());
        assertEquals("Expected string:", "(3)+(4)", sum1.toString());
        assertEquals("Expected string:", "(x)x(3)", prod4.toString());
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
    // TODO tests for Expression
    
}
