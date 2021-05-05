/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package poet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//import graph.Edge;
import graph.Graph;

/**
 * A graph-based poetry generator.
 * 
 * <p>GraphPoet is initialized with a corpus of text, which it uses to derive a
 * word affinity graph.
 * Vertices in the graph are words. Words are defined as non-empty
 * case-insensitive strings of non-space non-newline characters. They are
 * delimited in the corpus by spaces, newlines, or the ends of the file.
 * Edges in the graph count adjacencies: the number of times "w1" is followed by
 * "w2" in the corpus is the weight of the edge from w1 to w2.
 * 
 * <p>For example, given this corpus:
 * <pre>    Hello, HELLO, hello, goodbye!    </pre>
 * <p>the graph would contain two edges:
 * <ul><li> ("hello,") -> ("hello,")   with weight 2
 *     <li> ("hello,") -> ("goodbye!") with weight 1 </ul>
 * <p>where the vertices represent case-insensitive {@code "hello,"} and
 * {@code "goodbye!"}.
 * 
 * <p>Given an input string, GraphPoet generates a poem by attempting to
 * insert a bridge word between every adjacent pair of words in the input.
 * The bridge word between input words "w1" and "w2" will be some "b" such that
 * w1 -> b -> w2 is a two-edge-long path with maximum-weight weight among all
 * the two-edge-long paths from w1 to w2 in the affinity graph.
 * If there are no such paths, no bridge word is inserted.
 * In the output poem, input words retain their original case, while bridge
 * words are lower case. The whitespace between every word in the poem is a
 * single space.
 * 
 * <p>For example, given this corpus:
 * <pre>    This is a test of the Mugar Omni Theater sound system.    </pre>
 * <p>on this input:
 * <pre>    Test the system.    </pre>
 * <p>the output poem would be:
 * <pre>    Test of the system.    </pre>
 * 
 * <p>PS2 instructions: this is a required ADT class, and you MUST NOT weaken
 * the required specifications. However, you MAY strengthen the specifications
 * and you MAY add additional methods.
 * You MUST use Graph in your rep, but otherwise the implementation of this
 * class is up to you.
 */
public class GraphPoet {
    
    private final Graph<String> graph = Graph.empty();
    
    // Abstraction function:
    //   AF : A graph based poem generated from weighted graph, inserts word in between two words
    // Representation invariant:
    //   RI : graph is not empty
    // Safety from rep exposure:
    //   TODO
    
    /**
     * Create a new poet with the graph from corpus (as described above).
     * 
     * @param corpus text file from which to derive the poet's affinity graph
     * @throws IOException if the corpus file cannot be found or read
     */
    public GraphPoet(File corpus) throws IOException {
        List<String> wordList = new ArrayList<>();
        Scanner s = new Scanner(new BufferedReader(new FileReader(corpus)));
        while (s.hasNext()) {
          wordList.add(s.next());
        }
        s.close();
        
        wordList.forEach(word -> graph.add(word.toLowerCase()));
        for (int i = 0; i < wordList.size() -1 ; i++) {
            Map<String, Integer> source = graph.targets(wordList.get(i));
            String target = wordList.get(i+1);
            if (source.containsKey(target)){
                graph.set(wordList.get(i).toLowerCase(), target.toLowerCase(), source.get(target)+1);
            } else {
                graph.set(wordList.get(i).toLowerCase(), target.toLowerCase(), 1);
            }
        }
        checkRep();
    }
    
    public void checkRep() {
        assert graph.vertices()!=null;
    }
    
    /**
     * Generate a poem.
     * 
     * @param input string from which to create the poem
     * @return poem (as described above)
     */
    public String poem(String input) {
        List<String> inputList = Arrays.asList(input.trim().split("\\s+"));
        StringBuilder output = new StringBuilder();

        for (int i=0; i < inputList.size()-1; i++ ) {
            output.append(inputList.get(i)+" ");
            
            Map <String, Integer> bridgeWords = new HashMap <>();
            int j = i+1;
            graph.targets(inputList.get(i).toLowerCase()).forEach((k, v) -> {
                if (graph.sources(inputList.get(j).toLowerCase()).containsKey(k.toLowerCase())) {
                    bridgeWords.put(k,v);
                };
            });
            if (!bridgeWords.isEmpty()) {
                output.append(Collections.max(bridgeWords.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey() + " ");
            }            
        }
        output.append(inputList.get((inputList.size() -1)));
        return output.toString();
    }
    
    @Override public String toString() {
        return graph.toString();
    }
    
}
