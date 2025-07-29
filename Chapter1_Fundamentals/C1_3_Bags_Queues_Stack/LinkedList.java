package Chapter1_Fundamentals.C1_3_Bags_Queues_Stack;

import java.util.Optional;

public class LinkedList <Item> {

    private Node head;

    private class Node{
        Item item;
        Node next;
        Node(Item item){
            this.item = item;
        }
    }
    // UTILITY FUNCTION, RETURNS LINKED LIST EMPTY OR NOT.
    public boolean isEmpty(){
        return head == null;
    }
    // ADD A NEW NODE AT THE BEGINNING OF THE LIST.
    public void insert(Item item){
        Node new_node = new Node(item);
        new_node.next = head;  // works even if head is null
        head = new_node;
    }

    // ADD A NEW NODE AT THE END OF THE LIST.
    public void append(Item item){
        Node new_node = new Node(item);
        if (isEmpty()){
            head = new_node;
        }else{
            Node curr = head;
            while (curr.next != null){
                curr = curr.next;
            }
            // After the loop is finished, curr pointer is point to the last node in the linked list.
            // we just moved the last node's pointer to the new node
            curr.next = new_node;
        }
    }
    // DELETE IT FROM THE BEGINNING
    public void removeFirst(){
        if(isEmpty()){
            throw new RuntimeException("Cannot remove from an empty list.");
        }
        head = head.next;
    }
    // SEARCH SPECIFIC ITEM AMONG THE NODES. RETURN FIRST OCCURRENCE.
    public Item searchItem(Item item){
        Node curr = head;
        while (curr != null){
            if ((item == null && curr.item == null) || (item != null && item.equals(curr.item))) {
                return curr.item;
            }
            curr = curr.next;
        }
        return null;
    }

    @Override
//     Minor (Optional) Suggestions for toString() method.
//            1.	Efficiency:
//            •	result += curr.item inside a loop creates a new string object each time (since String is immutable).
//            •	If the list gets long, it could be slow or memory-heavy.
// Recommended improvement (for large lists):
    public String toString() {
        String result = "";
        Node curr = head;
        while(curr != null){
            result +=  curr.item;
            if (curr.next != null){
                result += " -> ";
            }
            curr = curr.next;
        }
        return result;
    }
}
