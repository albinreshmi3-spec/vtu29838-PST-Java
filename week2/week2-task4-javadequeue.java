import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements
        deque.addFirst("A");
        deque.addLast("B");
        deque.addFirst("C");

        System.out.println(deque);

        // Accessing elements
        System.out.println("First: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast());

        // Removing elements
        deque.removeFirst();
        deque.removeLast();

        System.out.println(deque);
    }
}
