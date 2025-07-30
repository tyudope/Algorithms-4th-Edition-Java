package chapter1_fundamentals.c1_3_queues_stack_linkedlist.Examples;

import chapter1_fundamentals.c1_3_queues_stack_linkedlist.datastructures.Stack;

public class ExampleStackClient {
    public static void main(String[] args) {
        Stack<String> console_stack = new Stack<>();
        console_stack.push("Playstation 1");
        console_stack.push("Playstation 2");
        console_stack.push("Playstation 3");
        console_stack.push("Playstation 4");
        console_stack.push("Playstation 5"); // very top of the stack

        System.out.println(console_stack.pop()); // remove the last pushed value from the stack
        // in this case this is ps5.
    }
}
