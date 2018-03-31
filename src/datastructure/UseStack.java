package datastructure;

import java.util.List;
import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.peek());
        System.out.println(stack.pop());

    }
}
