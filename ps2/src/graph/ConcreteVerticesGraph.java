/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * An implementation of Graph.
 * 
 * <p>PS2 instructions: you MUST use the provided rep.
 * @param <L>
 */
public class ConcreteVerticesGraph<L> implements Graph<L> {
    
    private final List<Vertex<L>> vertices = new ArrayList<>();
    

    // Abstraction function:
    //   A directed graph containing vertices, connected by edges of given weight
    // Representation invariant:
    //   edges have a vaule greter than 0, vertex cannot be null, no repeated vertices in List
    // Safety from rep exposure:
    //   fields are private, immutable or if mutable , make defensive copies
    
    // constructor
    public ConcreteVerticesGraph() {
        checkRep();
    }
    
    private void checkRep() {
        vertices.forEach(vertex-> {
            assert vertex != null; 
        });
        Set<Vertex<L>> verticesSet = new HashSet<>(vertices);
        assert vertices.size() == verticesSet.size();
    }
    
    @Override public boolean add(L vertex) {
        checkRep();
        if (!(vertices.contains(findVertex(vertex)))) {
            vertices.add(new Vertex <L> (vertex));
            return true;
        }         
        return false;
    
    }
    
    @Override public int set(L source, L target, int weight) {
        Vertex<L> sourceVertex = findVertex(source);
        Vertex<L> targetVertex = findVertex(target);
        vertices.add(sourceVertex);
        vertices.add(targetVertex);
        if (!sourceVertex.getEdgesOut().containsKey(targetVertex)) {
            sourceVertex.addEdgeOut(targetVertex, weight);
            targetVertex.addEdgeIn(sourceVertex, weight);
            return 0;
        } else {
            int oldWeight = sourceVertex.getWeight(targetVertex);
            sourceVertex.removeEdgeOut(targetVertex);
            targetVertex.removeEdgeIn(sourceVertex);
            if (weight>0) {
                sourceVertex.addEdgeOut(targetVertex, weight);
                targetVertex.addEdgeIn(sourceVertex, weight);
            }
            return oldWeight;
        }
    }
    
    @Override public boolean remove(L vertex) {
        Vertex<L> vertexToDelete = findVertex(vertex);
        if (vertices.contains(vertexToDelete)) {
            vertices.forEach(val -> {
                if (val.getEdgesIn().containsKey(vertexToDelete)) val.removeEdgeIn(vertexToDelete);
                if (val.getEdgesOut().containsKey(vertexToDelete)) val.removeEdgeOut(vertexToDelete);
            });
            vertices.remove(vertexToDelete);
            return true;
        }
        return false;
    }
    
    @Override public Set<L> vertices() {
        Set<L> verticesSet = new HashSet<>();
        vertices.forEach(v -> verticesSet.add(v.getName()));
        return verticesSet;
    }
    
    @Override public Map<L, Integer> sources(L target) {
        Map<L, Integer> sourcesMap = new HashMap<>();
        findVertex(target).getEdgesIn().forEach((v,w) -> sourcesMap.put(v.getName(), w));
        return sourcesMap;
    }
    
    @Override public Map<L, Integer> targets(L source) {
        Map<L, Integer> targetsMap = new HashMap<>();
        findVertex(source).getEdgesOut().forEach((v,w) -> targetsMap.put(v.getName(), w));
        return targetsMap;
    }
    
    private Vertex<L> findVertex (L vertex){
        for (Vertex <L> v:vertices) {
            if (v.getName().equals(vertex)) return v; 
        }
        return new Vertex <L> (vertex);

    }
    
    @Override
    public String toString() {
        StringBuilder stringify = new StringBuilder();

        vertices.forEach(source -> {
            source.getEdgesOut().forEach((target, weight) -> {
                stringify.append(source.toString() + "->" + target.toString() + "," + weight + "\n");
            });
        });
        return stringify.toString().trim();
    }
    
}

/**
 * TODO specification
 * Mutable.
 * This class is internal to the rep of ConcreteVerticesGraph.
 * 
 * <p>PS2 instructions: the specification and implementation of this class is
 * up to you.
 */
class Vertex <L> {
    
    private final L name;
    private final HashMap <Vertex<L>, Integer> edgesIn = new HashMap<>();
    private final HashMap <Vertex<L>, Integer> edgesOut = new HashMap<>();
    
    // Abstraction function:
    //   AF: Vertex is a node, with edges of weight greater than 0 going in and out of it
    // Representation invariant:
    //   RI: Vertex cannot be an empty string, all edges must have weight > 0
    // Safety from rep exposure:
    //   all fields are private final, defensive copies made for getter
    
    // TODO constructor
    public Vertex (L name) {
        this.name = name;
        checkRep();        
    }
    
    // TODO checkRep
    private void checkRep() {
        assert name!=null;
        assert edgesIn.entrySet().stream().filter(key -> (key.getValue() <=0)).collect(Collectors.toList()).isEmpty();
        assert edgesOut.entrySet().stream().filter(key -> (key.getValue() <=0)).collect(Collectors.toList()).isEmpty();
        
    }
    
    // TODO methods
    public L getName() {
        return name;
    }
    
    public HashMap<Vertex<L>, Integer> getEdgesIn() {
        return new HashMap<Vertex<L>,Integer>(edgesIn);
    }
    
    public HashMap<Vertex<L>, Integer> getEdgesOut() {
        return new HashMap<Vertex<L>,Integer>(edgesOut);
    }
    
    public Integer getWeight(Vertex<L> vertex) {
        return edgesOut.get(vertex);
    } 
    
    public void addEdgeOut(Vertex<L> vertex, int weight) {
        edgesOut.put(vertex, weight);
        checkRep();
    }
    
    public void addEdgeIn(Vertex<L> vertex, int weight) {
        edgesIn.put(vertex, weight);
        checkRep();
    }
    
    public void removeEdgeOut(Vertex<L> vertex) {
        edgesOut.remove(vertex);
        checkRep();
    }
    
    public void removeEdgeIn(Vertex<L> vertex) {
        edgesIn.remove(vertex);
        checkRep();
    }
    
    @Override
    public String toString() {
        return (String) name;
    }
    
}
