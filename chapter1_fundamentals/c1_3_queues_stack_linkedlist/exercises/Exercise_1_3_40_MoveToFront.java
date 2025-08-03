package chapter1_fundamentals.c1_3_queues_stack_linkedlist.exercises;

import chapter1_fundamentals.c1_3_queues_stack_linkedlist.datastructures.LinkedList;

import java.util.Scanner;

public class Exercise_1_3_40_MoveToFront {
    public static void main(String[] args) {
//        Move-to-front. Read in a sequence of   characters from standard input and
//        maintain the characters in a linked list with no duplicates. When you read in a
//        previously unseen character, insert it at the front of the list. When you read in a duplicate
//        character, delete it from the list and reinsert it at the beginning. Name your program
//        MoveToFront: it implements the well-known move-to-front strategy, which is useful for
//        caching, data compression, and many other applications where items that have been
//        recently accessed are more likely to be reaccessed.
        Scanner s = new Scanner(System.in);
        String input;
        System.out.println("Please enter sequence of characters.");
        input = s.nextLine();

        LinkedList<Character> move_to_front = new LinkedList<>();
        for(Character c : input.toCharArray()){
            if (!move_to_front.contains(c)){
                move_to_front.insert(c);
            }
            else{
                handleDuplicate(move_to_front , c);
            }
        }
        System.out.println(move_to_front);


    }
// helper method, When any duplicate found remove it from the linked list and (insert)move to the front.
    public static void handleDuplicate(LinkedList<Character> ll , Character duplicate){
        ll.remove(duplicate);
        ll.insert(duplicate);
    }


}
