/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package expressivo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests for the static methods of Commands.
 */
public class CommandsTest {

    // Testing strategy
    //   TODO
    
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    @Test
    public void testDifferentiate() {
        assertEquals("Expected reuslt 1", "1.0", Commands.differentiate("u", "u"));
        assertEquals("Expected reuslt 0", "0.0", Commands.differentiate("9", "u"));
        assertEquals("Expected reuslt 1", new Multiply(new Number(2.0), new Variable("u")), Commands.differentiate("u*u", "u"));
        assertEquals("Expected reuslt 1", new Plus(new Number(1.0), new Number(1.0)).toString(), Commands.differentiate("u+u", "u"));


        
    }
    
    
    // TODO tests for Commands.differentiate() and Commands.simplify()
    
}
