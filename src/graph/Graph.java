/*
 * Class Graph implements a graph using a pair of vertex-adjacent vertices
 * Adjacent vertices are stored inside a set
 */
package graph;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author kossT
 */
public class Graph {
    // pair of vertex-adjacent vertices
    private Pair<String, Set<String>> pair;
    private int noOfEdges;
    
    // initialize an empty graph (no vertices or edges)
    public Graph(){
        pair = new Pair<>();        
    }
    
    // initialize a graph from a specified file
    public Graph(String fileName, String delimiter){
        pair = new Pair<>();
        // This will reference one line at a time
        String line = null;
        FileReader fileReader = null;
        try {
            // FileReader reads text files in the default encoding
            fileReader = new FileReader(fileName);

            // wrap FileReader in BufferedReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null) {
                String[] names = line.split(delimiter);
                for (String name : names) {
                    addEdge(names[0], name);
                }            
            }
            fileReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");                  
        }
    }
    
    
    public boolean hasVertex(String v){
        return pair.containsKey(v);
    }
    
    // throw exception if provided vertex is not a vertex in this graph
    public void checkVertex(String v){
        if ( !(pair.containsKey(v)) ) {
            throw new IllegalArgumentException(v + " is not a valid vertex "
                                                + "in this graph!");
        }        
    }
    
    
    // returns the degree of specified vertex
    public int degree(String v){
        checkVertex(v);
        return pair.getValue(v).size();
    }
    // add specified vertex to graph (if not already exists)
    public void addVertex(String v){
        if (!hasVertex(v)){
            pair.putPair(v, new Set<>());
        }
    }
    // validates specified vertices and returns true if v1-v2 is an edge
    public boolean hasEdge(String v1, String v2){
        checkVertex(v1);
        checkVertex(v2);
        return pair.getValue(v1).containsKey(v2);
    }
    
    // add v1-v2 edge if is not already an edge in this graph 
    public void addEdge(String v1, String v2){
        if (!hasVertex(v1)){
            addVertex(v1);
        }
        if (!hasVertex(v2)){
            addVertex(v2);
        }
        if (!hasEdge(v1, v2)){
            noOfEdges++;
        }
        pair.getValue(v1).addKey(v2);
        pair.getValue(v2).addKey(v1);        
    }
    
    // returns the vertices in this graph     *
    public Iterable<String> vertices() {
        return pair.keys();
    }

    // returns the set of vertices adjacent to v in this graph
    public Iterable<String> adjacentTo(String v) {
        checkVertex(v);
        return pair.getValue(v);
    }
        
    
    
    public static void main(String[] args){
        // create a new graph
        Graph graph = new Graph("filename_1.txt", "/");

        // print out graph again by iterating over vertices and edges
        for (String v : graph.vertices()){
            System.out.println("Vertex " + v + " adjacent to : ");
            for (String w : graph.adjacentTo(v)){
                System.out.println(w + " ; " );
            }
        }  
    }
    



}
