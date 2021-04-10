package lesson4;

public class MyLinkedStack<T> {
    private MyLinkedList<T> list = new MyLinkedList<>();

    public void push(T item) {
        list.insertFirst(item);
    }

    public T pop() {
        return list.removeFirst();
    }

    public T peek() {
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (T val : list) {
            sb.append(val).append(", ");
        }
        if (size() > 0) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }

}
