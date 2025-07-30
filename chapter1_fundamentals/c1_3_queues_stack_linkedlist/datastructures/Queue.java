package chapter1_fundamentals.c1_3_queues_stack_linkedlist.datastructures;


public class Queue <Item>{
    private Node first; // the front of the queue (where we remove from)
    private Node last; // the end of the queue (where we add to)
    private int size; // number of items in the queue

    // INNER NODE CLASS.
    private class Node{
        Item item; // stored data.
        Node next; // pointer to the next node.
    }

    public boolean isEmpty(){return first == null;} // returns true if there is nothing in the queue
    public int size() {return size;} // returns the size.

    // Add item to the end.
    public void enqueue(Item item){
        Node oldLast = last; // store the current last node.
        last = new Node(); //  create a new last node.
        last.item = item; // Sets its value
        last.next = null; // mark its next as null (end of list)
        if(isEmpty()) first = last; // If the queue is empty, first also this node.
        else oldLast.next = last; // Otherwise, link the old last to new node.
        size++; // Increase the queue size by 1.
    }
    // Remove from front.
    public Item dequeue(){
        if(isEmpty()) throw new RuntimeException("Queue underflow"); // if the queue is empty,
        // throw an error. - nothing to remove.
        Item item = first.item; // Save item to return later
        first = first.next; // move first one step forward.
        size--; // Decrease the queue size by 1
        if (isEmpty()) last = null; // if the queue became empty, reset last too.
        return item; // Return the item that was at the front.
    }

    public Item peek(){
        if (isEmpty()) throw new RuntimeException("Queue underflow");
        return first.item;
    }

    @Override
    public String toString() {
        String q = "";
        Node node = this.first;
        while (node != null){
            q += node.item;
            if (node.next != null) q += " - ";
            node = node.next;

        }
        return q;
    }
}
