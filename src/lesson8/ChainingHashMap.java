package lesson8;

import java.util.*;

public class ChainingHashMap<Key, Value> {
    private int capacity;
    private final int DEFAULT_CAPACITY = 7;
    private int size;
    private LinkedList<Node>[] st;

    public ChainingHashMap(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException();
        }
        this.capacity = capacity;
        st = new LinkedList[capacity];
        for (int i = 0; i < st.length; i++) {
            st[i] = new LinkedList<>();
        }
    }

    public ChainingHashMap() {
        this.capacity = DEFAULT_CAPACITY;
        st = new LinkedList[capacity];
        for (int i = 0; i < st.length; i++) {
            st[i] = new LinkedList<>();
        }
    }

    private class Node {
        Key key;
        Value value;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % capacity;
    }

    private void checkNotNull(Key key) {
        if(key == null) {
            throw new IllegalArgumentException();
        }
    }

    public boolean contains(Key key) {
        return get(key) != null;
    }

    public void put(Key key, Value value) {
        checkNotNull(key);
        int i = hash(key);
        for (Node node : st[i]) {
            if (key.equals(node.key)) {
                node.value = value;
                return;
            }
        }
        st[i].addLast(new Node(key, value));
        size++;
    }

    public Value get(Key key) {
        checkNotNull(key);
        int i = hash(key);
        for (Node node : st[i]) {
            if (key.equals(node.key)) {
                return node.value;
            }
        }
        return null;
    }

    public boolean remove(Key key) {
        checkNotNull(key);
        int i = hash(key);
        boolean removed = false;
        if (st[i].removeIf(k -> contains(key))) {
            removed = true;
        }
        size--;
        return removed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < capacity; i++) {
            for (Node node : st[i]) {
                sb.append(node.key).append(" ").append(node.value);
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
