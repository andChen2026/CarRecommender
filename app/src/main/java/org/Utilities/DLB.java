package org.Utilities;

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

    public V get(String key) { // Return value
        return null;
    }

    public V get(Node<V> s, String key, int idx)
    {
        if (s.isTerminator()) return s.getValue();

        int cmp = key.charAt(idx) - s.getLet();
        if (cmp == 0) return get(s.getDown(), key, idx+1);
        else if (cmp > 0) return get(s.getRight(), key, idx);

        return null;
    }
    
    public void put(String key, V value) { // Map Key -> Value
        root = put(root, key, value, 0);
    }

    public Node<V> put(Node<V> s, String key, V value, int idx)
    {
        if (idx == key.length() - 1 && s != null) {return null;}
        if (s == null && idx == key.length() - 1) {c++; return new Node<V>(key.charAt(idx), value);}
        if (s == null) {s = new Node<V>(key.charAt(idx)); s.setDown(put(s.getDown(), key, value, idx+1)); return s;}

        int cmp = key.charAt(idx) - s.getLet();
        if (cmp == 0) return put(s, key, value, idx+1);
        else if (cmp > 0) s.setRight(put(s.getRight(), key, value, idx));
        else {Node<V> r = new Node<V>(key.charAt(idx)); r.setRight(s); s = r;}

        return s; // give back the current boy
    }
    

    public void remove(String key) { 
        
    }
   
    public void clear() { 
       root = null;
       c = 0;
    }

    /*
     @author Andrew C
     A private inner Node class specific to the DLB class
     */
    @SuppressWarnings("hiding")
    private class Node<V> 
    {
        private char let;
        private V value;
        private boolean term;
        private Node<V> right;
        private Node<V> down;

        public Node(char let) {this.let = let;}
        public Node(V value) {this.value = value;}
        public Node(char let, V value) {this.let = let; this.value = value;}

        public V getValue() {return value;}
        public char getLet() {return let;}
        public Node<V> getRight() {return right;}
        public Node<V> getDown() {return down;}
        public boolean isTerminator() {return term;} 

        public void setRight(Node<V> right) {this.right = right;}
        public void setDown(Node<V> down) {this.down = down;}
    }

    public static void main(String[] args) { // For testing
        DLB<Integer> test = new DLB<>();
        test.put("one", 1);
        test.put("two", 2);
        test.put("three", 3);
        test.put("four", 4);


    }
}
