package org.Utilities;
import java.util.*;

/*
 @author Andrew C.
 A S.T used to Map String Keys to Generic Values
 */
public class DLB<V extends Comparable<V>> {

    private int c;
    private Node<V> root; // root of the DLB

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
       root = null;
    }

    /*
     @author Andrew C
     A private inner Node class specific to the DLB class
     */
    @SuppressWarnings("hiding")
    private class Node<V> 
    {
        private V value;
        private Node<V> right;
        private Node<V> down;

        public Node(V value, Node<V> right, Node<V> down)
        {
            this.value = value;
            this.right = right;
            this.down = down;
        }

        public void setRight(Node<V> right) {this.right = right;}
        public void setDown(Node<V> down) {this.down = down;}
    }
}
