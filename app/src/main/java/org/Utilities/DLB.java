package org.Utilities;
import java.util.*;

/*
 @author Andrew C.
 A S.T used to Map String Keys to Generic Values
 */
public class DLB<V> {

    private int c;

    public int size() {
        return c;
    }
    
    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean contains(String key)
    {
        return get(key) != null;
    }

    public V get(String key) {
        return null;
    }
    
    public V put(String key, V value) {
        return null;
    }

    public V remove(Object key) {
        return null;
    }
   
    public void clear() {
       
    }

    public Set<String> keySet() {
        return null;
    }
}
