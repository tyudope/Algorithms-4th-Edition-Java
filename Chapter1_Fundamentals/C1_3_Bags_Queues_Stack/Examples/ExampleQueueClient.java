package Chapter1_Fundamentals.C1_3_Bags_Queues_Stack.Examples;
import Chapter1_Fundamentals.C1_3_Bags_Queues_Stack.Queue;

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
