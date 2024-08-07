package org.Utilities;
import java.util.*;
import java.io.*;

public class DLB<K extends Serializable, V> implements Map<K, V> {

    
    public int size() {
        return -1;
    }
    
    public boolean isEmpty() {
        return false;
    }

    public boolean containsKey(Object key) {
        return false;
    }

    public boolean containsValue(Object value) {
        return false;
    }

    public V get(Object key) {
        return null;
    }
    
    public V put(K key, V value) {
        return null;
    }

    public V remove(Object key) {
        return null;
    }

    public void putAll(Map<? extends K, ? extends V> m) {
        
    }
   
    public void clear() {
       
    }

    public Set<K> keySet() {
        return null;
    }

    
    public Collection<V> values() {
        return null;
    }

    
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
    
}
