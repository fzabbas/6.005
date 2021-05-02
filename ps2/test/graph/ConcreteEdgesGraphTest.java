/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package graph;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests for ConcreteEdgesGraph.
 * 
 * This class runs the GraphInstanceTest tests against ConcreteEdgesGraph, as
 * well as tests for that particular implementation.
 * 
 * Tests against the Graph spec should be in GraphInstanceTest.
 */
public class ConcreteEdgesGraphTest extends GraphInstanceTest {
    
    /*
     * Provide a ConcreteEdgesGraph for tests in GraphInstanceTest.
     */
    @Override public Graph<String> emptyInstance() {
        return new ConcreteEdgesGraph();
    }
    
    /*
     * Testing ConcreteEdgesGraph...
     */
    
    // Testing strategy for ConcreteEdgesGraph.toString()
    //   
    
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
    
    /*
     * Testing Edge...
     */
    
    // Testing strategy for Edge
    //   test getter functions and test toString
    
    @Test
    public void testGetter() {
        Edge<String> edge = new Edge<String>("A", "B", 10);
        assertEquals("Source of edge is A", edge.getSource(), "A");
        assertEquals("Target of Edge in B", edge.getTarget(), "B");
        assertEquals ("Weight of the edge is 10", edge.getWeigth(), 10);
    }
    
    @Test
    public void testToString() {
        Edge<String> edge = new Edge<String>("A", "B", 10);
        assertEquals("Expected A->B,10", edge.toString(), "A->B,10");
    }
    
    @Test
    public void testContainsVertex() {
        Edge<String> edge = new Edge<String>("A", "B", 10);
        assertTrue ("Expected to cnatin A", edge.containsVertex("A"));
    }
    
    @Test
    public void testDoesntContainsVertex() {
        Edge<String> edge = new Edge<String>("A", "B", 10);
        assertFalse ("Expected to cnatin A", edge.containsVertex("C"));
    }
    
}
