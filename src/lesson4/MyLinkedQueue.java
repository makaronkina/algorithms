package lesson4;

import java.util.Iterator;

public class MyLinkedQueue<T> {
    private MyLinkedList<T> list = new MyLinkedList<>();

    public void insert(T item) {
        list.insertLast(item);
    }

    public T peek() {
        return list.getFirst();
    }

    public T remove() {
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    @Override
    public String toString() {
        Iterator<T> it = list.iterator();
        StringBuilder sb = new StringBuilder("[");
        while (it.hasNext()) {
            sb.append(it.next()).append(", ");
        }
        if (size() > 0) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }
}
