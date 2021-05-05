/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package graph;

import static org.junit.Assert.*;

import java.util.Collections;

import org.junit.Test;

/**
 * Tests for instance methods of Graph.
 * 
 * <p>PS2 instructions: you MUST NOT add constructors, fields, or non-@Test
 * methods to this class, or change the spec of {@link #emptyInstance()}.
 * Your tests MUST only obtain Graph instances by calling emptyInstance().
 * Your tests MUST NOT refer to specific concrete implementations.
 */
public abstract class GraphInstanceTest {
    
    // Testing strategy
    // Methods to test: 
    // .add() --> add vertex to empty grpah, add existing vertex
    // .remove() --> (i) vertex did not exist
    //               (ii) Vertex removes, edges containing vertex removed
    // .set() --> add new edge (i)vertices already exists, (ii)vertices does not exist
    //            (iii) modify edge
    //            (iv) remove edge , no. of vertices remain same
    // .sources() --> return a map with key set of target, returns empty set if no target, value correspong to weight
    // .target() --> return a map with key set of source, returns empty set if no source, value correspons to weight
    // .vertices() --> return no. of vertices, is empty if no vertices
    
    /**
     * Overridden by implementation-specific test classes.
     * 
     * @return a new empty graph of the particular implementation being tested
     */
    public abstract Graph<String> emptyInstance();
    
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    @Test
    public void testInitialVerticesEmpty() {
        // TODO you may use, change, or remove this test
        assertEquals("expected new graph to have no vertices",
                Collections.emptySet(), emptyInstance().vertices());
    }
    
    @Test
    public void testAddVertexNotInGraph() {
        assertTrue("expected vertex to be added", emptyInstance().add("A"));
    }
    
    @Test
    public void testAddVertexInGraph() {
        Graph<String> graph = emptyInstance();
        graph.add("A");
        assertFalse("expected vertex not to be added", graph.add("A"));
    }
    
    @Test
    public void testSetAddNewEdge() {
        Graph<String> graph = emptyInstance();
        assertTrue("Edge added, where none existed",graph.set("A", "B", 10)==0);
        assertTrue("expected 2 vertex to be added", graph.vertices().size()==2);
    }
    
    @Test
    public void testSetAddNewEdgeWithExistingVertex() {
        Graph<String> graph = emptyInstance();
        graph.set("A", "B", 10);
        assertTrue("Edge added, where none existed",graph.set("A", "C", 5)==0);
        assertTrue("expected 1 vertex to be added", graph.vertices().size()==3);
    }
    
    @Test
    public void testSetModifyEdge() {
        Graph<String> graph = emptyInstance();
        graph.set("A", "B", 10);
        assertTrue("Edge updated",graph.set("A", "B", 5)==10);
    }
    
    @Test
    public void testSetRemoveEdge() {
        Graph<String> graph = emptyInstance();
        graph.set("A", "B", 10);
        graph.set("A", "B", 0);
        assertFalse("Edge should be removed",graph.sources("B").containsKey("A"));
        assertTrue("expected vertex to remain", graph.vertices().size()==2);
    }
    
    @Test
    public void testRemoveVertexNotInGrpah() {
        Graph<String> graph = emptyInstance();
        graph.set("A", "B", 10);
        assertFalse("Graph should not expected to change",graph.remove("C"));
    }
    
    @Test
    public void testRemoveVertex() {
        Graph<String> graph = emptyInstance();
        graph.add("A");
        assertTrue("Graph should not expected to change",graph.remove("A"));
        assertFalse("Vertices should be empty",graph.vertices().contains("A"));
    }
    
    @Test
    public void testRemoveVertexAndAssociatedEdges() {
        Graph<String> graph = emptyInstance();
        graph.set("A", "B", 5);
        graph.set("C", "A", 10);
        assertTrue("Graph should not expected to change",graph.remove("A"));
        assertFalse("Sources of B should not contain A",graph.sources("B").containsKey("A"));
        assertFalse("Target of C should not contain A",graph.targets("C").containsKey("A"));
    }
    
    @Test
    public void testSources() {
        Graph<String> graph = emptyInstance();
        graph.set("A", "B", 5);
        graph.set("A", "C", 10);
        assertTrue("Edge weight is the value of key",graph.sources("B").get("A")==5);
        assertTrue("B contaisn 1 source",graph.sources("B").size()==1);
        assertFalse("Sources of B should not contain C",graph.sources("B").containsKey("C"));
    }
    
    @Test
    public void testTargets() {
        Graph<String> graph = emptyInstance();
        graph.set("A", "B", 5);
        graph.set("A", "C", 10);
//        System.out.println("target os A"+ graph.targets("A"));
        assertTrue("Edge weight is the value of key",graph.targets("A").get("B")==5);
        assertEquals("A contains 2 targets", 2, graph.targets("A").size());
        assertFalse("Targets of B should not contain C",graph.targets("B").containsKey("C"));
    }
    
    @Test
    public void testVerticesEmpty() {
        assertEquals("expected new graph to have no vertices",
                Collections.emptySet(), emptyInstance().vertices());
    }
    
    @Test
    public void testVertices() {
        Graph<String> graph = emptyInstance();
        graph.add("A");
        assertEquals("expected 1 vertex", 1, graph.vertices().size());
    }
}
