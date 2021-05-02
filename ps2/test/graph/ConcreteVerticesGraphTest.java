/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package graph;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests for ConcreteVerticesGraph.
 * 
 * This class runs the GraphInstanceTest tests against ConcreteVerticesGraph, as
 * well as tests for that particular implementation.
 * 
 * Tests against the Graph spec should be in GraphInstanceTest.
 */
public class ConcreteVerticesGraphTest extends GraphInstanceTest {
    
    /*
     * Provide a ConcreteVerticesGraph for tests in GraphInstanceTest.
     */
    @Override public Graph<String> emptyInstance() {
        return new ConcreteVerticesGraph();
    }
    
    /*
     * Testing ConcreteVerticesGraph...
     */
    
    // Testing strategy for ConcreteVerticesGraph.toString()
    //   TODO
    @Test
    public void testToStringEmptyGraph() {
        Graph<String> graph = emptyInstance();
        assertEquals("Expected empty graph", graph.toString(), "" );
        
    }

    @Test
    public void testToStringVertexNoEdge() {
        Graph<String> graph = emptyInstance();
        graph.add("A");
        assertEquals("Vertex with no Edge return empty string", "", graph.toString());
        
    }
    
    @Test
    public void testToStringEdges() {
        Graph<String> graph = emptyInstance();
        graph.set("A", "B",10);
        graph.set("C", "D", 15);
        graph.add("E");
        assertEquals("Multiple edges", "A->B,10\nC->D,15", graph.toString());
    }
    // TODO tests for ConcreteVerticesGraph.toString()
    
    /*
     * Testing Vertex...
     */
    
    // Testing strategy for Vertex
    //   TODO
    
    // TODO tests for operations of Vertex
    @Test
    public void testToString() {
        Vertex<String> v = new Vertex<String>("A");
        assertEquals("Expected A", v.toString(), "A");
    }
    
}
