package chapter1_fundamentals.c1_3_queues_stack_linkedlist.exercises;

import chapter1_fundamentals.c1_3_queues_stack_linkedlist.datastructures.Stack;

//1.3.4 Write a stack client Parentheses that reads in a text stream from standard input
//and uses a stack to determine whether its parentheses are properly balanced. For ex-
//ample, your program should print true for [()]{}{[()()]()} and false for [(]).
public class Exercise_1_3_4_Parentheses_Input {
    public static void main(String[] args) {

        // STEP BY STEP APPROACH.
        // 1. Loop through each character in the input.
        // 2. If it's an opening bracket, push to stack.
        // 3. If it's a closing bracket, check:
        //      - If stack is empty -> return false,
        //      - If top of stack is not matching pairs ( if i ')' , then top of stack must be '(') -> return false,
        //      - If no problem, just popped.
        // 4. After the loop, if stack is not empty -> return false,
        // 5. Otherwhise -> return true.

        String expression_1 = "[()]{}{[()()]()}";
        String expression_2 = "[(])";

        // Every opening bracket [ { ( has a matching closing bracket ] } )
        // They must be closed in correct order
        System.out.println(parentheses_validation(expression_1));
    }
    public static boolean parentheses_validation(String givenString){
        Stack<String> my_stack = new Stack<>();
        String[] token = givenString.split("");
        for(String i : token){
            // if it's an opening bracket.
            if (i.equalsIgnoreCase("[") || i.equalsIgnoreCase("{")
                    || i.equalsIgnoreCase("("))
            {
                my_stack.push(i);
            }
            // if it's a closing bracket.
            else if(i.equalsIgnoreCase("]") || i.equalsIgnoreCase("}") ||
                    i.equalsIgnoreCase(")"))
            {
                if (my_stack.isEmpty()) { return false; }
                String top = my_stack.pop();
                if ((i.equals(")") && !top.equals("(")) ||
                        (i.equals("]") && !top.equals("[")) ||
                        (i.equals("}") && !top.equals("{"))) {
                    return false;
                }
            }
        }
        return my_stack.isEmpty();
    }
}
