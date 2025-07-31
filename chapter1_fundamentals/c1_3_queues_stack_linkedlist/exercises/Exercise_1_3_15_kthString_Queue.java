package chapter1_fundamentals.c1_3_queues_stack_linkedlist.exercises;

import chapter1_fundamentals.c1_3_queues_stack_linkedlist.datastructures.Queue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_1_3_15_kthString_Queue {
    public static void main(String[] args) {
        // 1.3.15
//        Write a Queue client that takes an input  k and prints the kth
//        from the last string found on  input (assuming that input has k or
//        more strings)
        Queue<String> wordsQueue = new Queue<>();
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the strings ;");
        String input = s.nextLine();
        System.out.print("Please enter k:");
        try {
            int k = s.nextInt();
            String[] strings = input.split(" ");
            if (k > strings.length){
                throw new RuntimeException("K cannot be greater than strings size");
            }
            else{
                for (String str : strings){
                    wordsQueue.enqueue(str);
                }

                while (wordsQueue.size() > k){
                    wordsQueue.dequeue();

                }
                // first item will be kth from the end.
                System.out.println("kth from the end is " + wordsQueue.dequeue());
            }
        }catch (InputMismatchException e){
            System.out.println("Invalid input. (please enter an integer.)");
        }



    }
}
