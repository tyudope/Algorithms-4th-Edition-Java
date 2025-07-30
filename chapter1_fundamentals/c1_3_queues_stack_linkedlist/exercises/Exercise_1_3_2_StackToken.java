package chapter1_fundamentals.c1_3_queues_stack_linkedlist.exercises;

import chapter1_fundamentals.c1_3_queues_stack_linkedlist.datastructures.Stack;

public class Exercise_1_3_2_StackToken {
    // Chapter 1.3
    // Exercise 1.3.2
//    Stack Rule Reminder:
//            •	A stack is LIFO (Last-In, First-Out).
//            •	push: When a word is encountered, push it onto the stack.
//	•	pop: When a - is encountered, pop from the stack and print the value.
    public static void main(String[] args) {
        String input = "it was - the best - of times - - - it was - the - -";
        String[] tokens = input.split(" ");

        Stack<String> my_stack = new Stack<>();

        for (String i : tokens){
            if (i.equalsIgnoreCase("-")){
                System.out.print(my_stack.pop() + " ");
            }
            else{
                my_stack.push(i);
            }
        }

    }
}
