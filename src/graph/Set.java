/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author kossT
 * @param <Key>
 */
public class Set<Key> implements Iterable<Key>{
    
    private TreeSet<Key> set;
    // initialize an empty set
    public Set(){
        set = new TreeSet<>();
    }
    // add a new key to set
    public void addKey(Key key){
        if (key == null){
            throw new IllegalArgumentException("Method addKey()"
                                    + "called with null key! ");
        }
        set.add(key);
    }
    // return true if specified key already exists
    public boolean containsKey(Key key){
        if (key == null){
            throw new IllegalArgumentException("Method containsKey()"
                                    + "called with null key! ");
        }
        return set.contains(key);
    }
    // remove specified key
    public void removeKey(Key key){
        if (key == null){
            throw new IllegalArgumentException("Method removeKey()"
                                    + "called with null key! ");
        }
        set.remove(key);
    }
    // return number of keys in this set
    public int size(){
        return set.size();
    }

    @Override
    public Iterator<Key> iterator() {
        return set.iterator();
    }
}
