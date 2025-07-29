package Chapter1_Fundamentals.C1_3_Bags_Queues_Stack.Examples;

import Chapter1_Fundamentals.C1_3_Bags_Queues_Stack.Stack;

public class Dijkstras_Evaluation {
    public static void main(String[] args) {

        // Imagine we have expression ( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )
        // try to find value with using stacks.

        // Dijkstra's Two-Stack Algorithm
    //        Use two stacks:
    //		Operator stack: holds symbols like +, *, /, -
    //		Operand stack: holds the numbers (as Double)
        // DIJKSTRA'S ALGORITHM STEPS.
        // Ignore "("
        // push operators to the operator stack ( + , - , * , / )
        // push numbers to the operand stack
        // When you encounter a ")", pop:
        // two operands.
        // one operator.
        // evaluate the result and push it back to the operand stack.

        Stack<String> operators = new Stack<>();
        Stack<Double> operands =  new Stack<>();

        String expression = "( 1 + ( ( 2 + 3 ) * ( 4 * 21 ) ) )";
        String[] tokens = expression.split(" "); // split it by whitespace to get tokens.

        for(String i : tokens){
            if (i.equals("(")) {
                // ignore the left-parenthesis.
                continue;
            }
            else if(i.equals("+")) operators.push(i);
            else if(i.equals("-")) operators.push(i);
            else if(i.equals("/")) operators.push(i);
            else if (i.equals("*")) operators.push(i);
            else if(i.equals(")")){ // when encounter with right parenthesis.
                String operator = operators.pop(); // pop 1 operator
                double value = operands.pop(); // pop first operands
                // pop second operand
                if (operator.equals("+")) value = operands.pop() + value;
                else if(operator.equals("-")) value = operands.pop() - value;
                else if (operator.equals("/")) value = operands.pop() / value;
                else if (operator.equals("*")) value = operands.pop() * value;
                operands.push(value);
            }
            // if the token is neither parenthesis nor operator, that means we have an only numeric value.
            else{
                operands.push(Double.parseDouble(i)); // converts string to double value.
            }
        }
        System.out.println( "Final result : "+ operands.pop());
    }
}
