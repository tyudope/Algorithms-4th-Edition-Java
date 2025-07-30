package chapter1_fundamentals.c1_3_queues_stack_linkedlist.Examples;
import chapter1_fundamentals.c1_3_queues_stack_linkedlist.datastructures.Queue;

public class ExampleQueueClient {
    public static void main(String[] args) {
        Queue<String> names = new Queue<String>();

        names.enqueue("Bloodborne"); // first in, first out.
        names.enqueue("Dark Souls 3");
        names.enqueue("Sekiro");
        names.enqueue("Elden ring");

        System.out.println(names);
        //
        System.out.println(names.dequeue()); // returns 'Bloodborne' -> first in , first out
        System.out.println(names.dequeue()); // returns 'Dark Souls 3'
        System.out.println(names.dequeue()); // returns ' Sekiro '
        System.out.println(names.dequeue()); // returns ' Elden ring '
        // System.out.println(names.dequeue()); throws an error.
    }
}
