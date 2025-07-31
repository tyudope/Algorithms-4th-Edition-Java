package chapter1_fundamentals.c1_3_queues_stack_linkedlist.exercises;

import chapter1_fundamentals.c1_3_queues_stack_linkedlist.datastructures.Stack;

// 1.3.9.
//Write a program that takes from standard input an expression without left pa-
//rentheses and prints the equivalent infix expression with the parentheses inserted. For
//example, given the input:
//        1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )
//your program should print
//        ( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) )
public class Exercise_1_3_9_Dijkstra_Without_Left {
    public static void main(String[] args) {
        String input = "1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )";
        String[] tokens = input.split(" ");
        Stack<String> my_stack = new Stack<>();

        for(String i : tokens){
            if (i.equalsIgnoreCase(")")){
                String right = my_stack.pop();
                String operator = my_stack.pop();
                String left = my_stack.pop();
                String subExpression = "( " + left + " " + operator + " " + right + " )";
                my_stack.push(subExpression);
            }
            else{
                my_stack.push(i);
            }
        }
        System.out.println(my_stack.pop());
    }
}
