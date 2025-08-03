package chapter1_fundamentals.c1_3_queues_stack_linkedlist.exercises;

import chapter1_fundamentals.c1_3_queues_stack_linkedlist.datastructures.Queue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_1_3_37_Josephus_Problem {
    //    Josephus problem. In the Josephus problem from antiquity, N people are in dire
//    straits and agree to the following strategy to reduce the population. They arrange them-
//    selves in a circle (at positions numbered from 0 to N–1) and proceed around the circle,
//    eliminating every Mth person until only one person is left. Legend has it that Josephus
//    figured out where to sit to avoid being eliminated. Write a Queue client Josephus that
//    takes N and M from the command line and prints out the order in which people are
//    eliminated (and thus would show Josephus where to sit in the circle)
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Queue<Integer> myQueue = new Queue<>();
        int n, m;

        try {
            System.out.print("Please enter N.");
            n = s.nextInt();
            System.out.print("Please enter M");
            m = s.nextInt();
            for (int i = 0; i < n; i++){
                myQueue.enqueue(i);
            }
            int count = 0;
            int eliminated_chair = 0;
            while(!myQueue.isEmpty()){
                count++;
                if (count < m){
                    int move_to_end = myQueue.dequeue();
                    myQueue.enqueue(move_to_end);
                }
                if (count == m){
                    eliminated_chair = myQueue.dequeue();
                    System.out.print(eliminated_chair);
                    if (!myQueue.isEmpty()){
                        System.out.print(" -> ");
                    }
                    count = 0;
                }
            }
            System.out.println("\nLast person remaining : " + eliminated_chair);

        } catch (InputMismatchException e){
            System.out.println("Please enter valid integers.");
        }



    }
}
