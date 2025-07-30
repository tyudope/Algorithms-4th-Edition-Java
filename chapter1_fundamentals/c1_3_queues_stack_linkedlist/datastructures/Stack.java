package chapter1_fundamentals.c1_3_queues_stack_linkedlist.datastructures;

public class Stack<Item>  {
    private Node first;
    private int size;
    // inner node class.
    class Node{
        Item item;
        Node next;
    }

    public boolean isEmpty(){ return first == null; }
    public int size() {return size; }

    // add a new node on the top of stack.
    public void push(Item item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        size++;
    }
    // remove a node on the top of stack.
    public Item pop(){
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow");
        }
        Node curr = first;
        first = first.next;
        size--;
        return  curr.item;
    }

    // peek
    public Item peek(){
        if (isEmpty()){
            throw new RuntimeException("Stack underflow");
        }
        return first.item;
    }

    @Override
    public String toString() {
        String str = "";
        Node curr = first;
        while(curr != null){
            str += (String) curr.item;
            if (curr.next != null) str += " - ";
            curr = curr.next;
        }
        return str;
    }
}
