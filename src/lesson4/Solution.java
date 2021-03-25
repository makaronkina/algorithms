package lesson4;

public class Solution {
    public static void main(String[] args) {

        MyLinkedQueue<String> queue = new MyLinkedQueue<>();

        queue.insert("one");
        queue.insert("two");
        queue.insert("three");
        queue.insert("four");

        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.remove());

        System.out.println(queue);


        MyLinkedStack<String> stack = new MyLinkedStack<>();

        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");

        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack);
    }
}
