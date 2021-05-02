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

/**
 * An implementation of Graph.
 * 
 * <p>PS2 instructions: you MUST use the provided rep.
 */
public class ConcreteEdgesGraph implements Graph<String> {
    
    private final Set<String> vertices = new HashSet<>();
    private final List<Edge> edges = new ArrayList<>();
    
    // Abstraction function:
    //   A directed graph containing vertices, connected by edges of given weight
    // Representation invariant:
    //   edges have a vaule greter than 0
    // Safety from rep exposure:
    //   fields are private, immutable or if mutable , make defensive copies
    
    // constructor
    public ConcreteEdgesGraph() {
        checkRep();
    }
    
    private void checkRep() {
        assert vertices != null;
        for (Edge<String> edge : edges) {
            assert edge.getWeigth() > 0;
        }
    }
    
    @Override public boolean add(String vertex) {
        boolean result = vertices.add(vertex);
        checkRep();
        return result;
    }
    
    @Override public int set(String source, String target, int weight) {
        checkRep();
        for (Edge edge:edges) {
            if (edge.getSource()==source && edge.getTarget()==target) {
                int oldWeight = edge.getWeigth();
                if (weight==0) {
                    edges.remove(edge);
                } else {
                    edges.remove(edge);
                    edges.add(new Edge (source, target,weight));
                }
                return oldWeight;
            }     
        }
         edges.add(new Edge (source, target, weight));
         vertices.add(source);
         vertices.add(target);
         return 0;
    }
    
    @Override public boolean remove(String vertex) {
        checkRep();
        if (vertices.contains(vertex)) {
           vertices.remove(vertex);
           List<Edge> toRemove = new ArrayList<>();
           edges.forEach(edge -> {
               if (edge.getSource()==vertex || edge.getTarget()==vertex) {
                   toRemove.add(edge);
               }
           });
           toRemove.forEach(edge -> edges.remove(edge));
           return true;
        } else {
            return false;
        }
    }
    
    @Override public Set<String> vertices() {
        return new HashSet<>(vertices);
    }
    
    @Override public Map<String, Integer> sources(String target) {
        checkRep();
        Map<String, Integer> sourceMap = new HashMap<>();
        edges.forEach(edge -> {
            if (edge.getTarget()==target) {
                sourceMap.put((String)edge.getSource(), edge.getWeigth());
            }
        });
        return sourceMap;
    }
    
    @Override public Map<String, Integer> targets(String source) {
        checkRep();
        Map<String, Integer> targetMap = new HashMap<>();
        edges.forEach(edge -> {
            if (edge.getSource()==source) {
                targetMap.put((String) edge.getTarget(), edge.getWeigth()); 
            }
        });
        return targetMap;
    }
    
    @Override
    public String toString() {
        StringBuilder stringify = new StringBuilder();
        for (Edge<String> edge: edges) {
            stringify.append(edge.toString() + "\n");
        }
//        vertices.forEach((vertex) -> {
//            if (edges.size()==0) {
//                stringify.append(vertex + "\n");
//            } else {
//                edges.forEach(edge -> {
//                    if (!edge.containsVertex(vertex)) {
//                        stringify.append(vertex + "\n");
//                    }
//                });
//            }
//        });
        return stringify.toString().trim();
    }
    
}

/**
 * AN immutable data type consisting of a source vertex, target vertex connected by ca value greater than 0
 * Immutable.
 * This class is internal to the rep of ConcreteEdgesGraph.
 * 
 * <p>PS2 instructions: the specification and implementation of this class is
 * up to you.
 */
class Edge <L> {
    
    private final L source;
    private final L target;
    private final Integer weight;

    // Abstraction function:
    //   an edge in a directed grapg with a source and a target with a given weight
    // Representation invariant:
    //   weight >= 0 and source and target exists
    // Safety from rep exposure:
    //   all fields are private final
    
    public Edge (L source, L target, int weight) {
        this.source = source;
        this.target = target;
        this.weight = weight;
        checkRep();            
    }
    
    private void checkRep() {
        assert source != null;
        assert target != null;
        assert weight >= 0;
    }
    L getSource() {
        return source;
    }
    
    public L getTarget() {
        return target;
    }
    
    public int getWeigth() {
        return weight;
    }
    
    public boolean containsVertex(L vertex) {
        return this.getSource()==vertex || this.getTarget()==vertex;
    }
    
    @Override
    public String toString() {
        return source + "->" + target + "," + weight;
    }
    
}
