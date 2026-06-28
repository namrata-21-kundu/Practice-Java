import java.util.*;
public class BasicStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Welcome");
        stack.push("Namrata");
        System.out.println("Initial Stack: " + stack);
        System.out.println("element popped: " +stack.pop());
        System.out.println("Top: " + stack.peek());
        System.out.println(stack.search("Welcome"));
        System.out.println(stack.empty());

        //ArrayDeque as stack
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.push(1);
        deque.push(5);
        System.out.println(deque);
        System.out.println(deque.peek());
    }
}
