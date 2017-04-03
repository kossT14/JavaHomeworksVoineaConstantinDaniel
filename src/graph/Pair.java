/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.Iterator;
import java.util.TreeMap;

/**
 *
 * @author kossT
 * @param <Key> generic type of keys (vertices)
 * @param <Value> generic type of values (adjacent vertices)
 */
public class Pair<Key, Value> implements Iterable<Key>{
    
    private TreeMap<Key, Value> pair;
    
    // initialize an empty Pair object
    public Pair(){
    pair = new TreeMap<>();
    }

    // method for getting the value for a specified key
    public Value getValue(Key key){
        if (key == null){
            throw new IllegalArgumentException("Method getValue()"
                                    + "called with null key!");
        }
        return pair.get(key);
    }     
    
    /**
     * This method inserts a new pair(key,value)
     * if provided value is null, specified key is removed
     * if specified key already exists, value will be updated
     * @param key specified key
     * @param value associated value to this key
    */
    public void putPair(Key key, Value value){
        if (key == null){
            throw new IllegalArgumentException("Method putPair()"
                                        + "called with null key!");
        }
        if (value == null){
            pair.remove(key);
        }else{
            pair.put(key, value);
        }
    }
    
    // removes specified key (and value associated)
    public void removePair(Key key){
       if (key == null){
            throw new IllegalArgumentException("Method removePair() "
                                        + "called with null key!");
        }
        pair.remove(key);
    }
    
    // returns true if specified key already exists
    public boolean containsKey(Key key){
        if (key == null){
            throw new IllegalArgumentException("Method containsKey()"
                                        + "called with null key!");
        }
        return pair.containsKey(key);
    }
    // returns the number of key-value pairs
    public int size() {
        return pair.size();
    }
    
    // returns all keys 
    public Iterable<Key> keys() {
        return pair.keySet();
    }

    @Override
    public Iterator<Key> iterator() {
        return pair.keySet().iterator();
    }
    
    
}
