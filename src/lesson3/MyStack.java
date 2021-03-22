package lesson3;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack<T> {
    private T[] list;
    private int size;
    private int capacity;
    private final int DEFAULT_CAPACITY = 10;

    public MyStack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity " + capacity);
        }
        this.capacity = capacity;
        list = (T[]) new Object[capacity];
    }

    public MyStack() {
        this.capacity = DEFAULT_CAPACITY;
        list = (T[]) new Object[capacity];
    }

    public void push(T item) {
        if (isFull()) {
            reCapacity(list.length * 2 + 1);
        }
        list[size] = item;
        size++;
    }

    public T pop() {
        T temp = peek();
        size --;
        list[size] = null;
        return temp;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[size - 1];
    }

    public boolean isFull() {
        return size == list.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void reCapacity(int newCapacity) {
        T[] list2 = (T[]) new Object[newCapacity];
        System.arraycopy(list, 0, list2, 0, size);
        list = list2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = size -1;
        while (i >= 0) {
            sb.append(list[i]).append(", ");
            i--;
        }
        if (size > 0) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }
}
