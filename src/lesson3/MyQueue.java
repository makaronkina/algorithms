package lesson3;

import java.util.NoSuchElementException;

public class MyQueue<T> {
    private T[] list;
    private int size;
    private int capacity;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    public MyQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity " + capacity);
        }
        this.capacity = capacity;
        list = (T[]) new Object[capacity];
    }

    public MyQueue() {
        this.capacity = DEFAULT_CAPACITY;
        list = (T[]) new Object[capacity];
    }

    public void insert(T item) {
        if (isFull()) {
            capacity = list.length * 2 + 1;
            reCapacity(capacity);
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[begin];
    }

    public T remove() {
        T temp = peekFront();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
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

    public int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    public void reCapacity(int newCapacity) {
        T[] list2 = (T[]) new Object[newCapacity];
        if (begin < end) {
            System.arraycopy(list, begin, list2, 0, size);
            begin = 0;
            end = size;
        }
        else {
            System.arraycopy(list, begin, list2, 0, list.length - begin);
            System.arraycopy(list, 0, list2, list.length - begin, end);
            begin = 0;
            end = size;
        }
        list = list2;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = begin;
        while (i != end) {
            sb.append(list[i]).append(", ");
            i = nextIndex(i);
        }
        if (size > 0) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }
}
