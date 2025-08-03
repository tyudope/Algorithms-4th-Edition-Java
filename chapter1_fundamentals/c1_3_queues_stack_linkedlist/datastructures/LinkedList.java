package chapter1_fundamentals.c1_3_queues_stack_linkedlist.datastructures;

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
    // DELETE IT FROM THE END. (EXERCISE, 1.3.19)
    public void removeLast(){
        if (isEmpty()){
            throw new RuntimeException("Cannot remove from an empty list");
        }
        if (head.next == null){ // only one  node in the list.
            head = null;
        }
        else{
            Node curr = head;
            while(curr.next.next != null){
                curr = curr.next;
            }
            curr.next = null;
        }
    }
    // Write a method delete() that takes an int argument k and deletes the kth element in a linked list,
    // if it exists.
    // EXERCISE 1.3.20
    public void deleteKth(int k){
        if (isEmpty()){
            throw new RuntimeException("List is already empty.");
        }
        if (k < 0){
            throw new RuntimeException("Index cannot be zero.");
        }
        if (k == 0){
            removeFirst();
        }
        else{
            Node curr = head;
            Node prev = null;
            int i = 0;
            while (i != k && curr != null){
                prev = curr;
                curr = curr.next;
                i++;
            }
            if (curr == null){
                throw new RuntimeException("Index " + k + " is out of bounds.");
            }
            prev.next = curr.next;
        }
    }

//    Exercise 1.3.24 — removeAfter()
//   Write a method removeAfter() that takes a linked-list Node as argument and removes the node
//    following the given one(and does nothing if the argument or the next field in the argument node is
//    null).
    public void removeAfter(Node given_node){
        if (isEmpty()) { throw new RuntimeException("List is already empty."); }
        if (given_node == null || given_node.next == null){
            return;
        }
        given_node.next = given_node.next.next;
    }
// EXERCISE 1.3.25 - insertAfter()
    //Write a method insertAfter() that takes a two linked-list Node arguments and inserts the second
    // after the first on its list. (and does nothing if either argument is null).
    public void insertAfter(Node first , Node second){
        if (first == null || second == null){
            return;
        }
        second.next = first.next;
        first.next = second;
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
    // EXERCISE 1.3.40 Helper method
    // Remove the duplicate.
    public void remove(Item item) {
        if (isEmpty()) throw new RuntimeException("Linked list is already empty.");
        if (item.equals(head.item)) {
            head = head.next; // Remove first node
            return;
        }
        Node curr = head.next;
        Node prev = head;
        while (curr != null) {
            if (item.equals(curr.item)) {
                prev.next = curr.next; // Bypass the node to be removed
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
    // EXERCISE 1.3.40 Helper method.
    // Find duplicate.
    public boolean contains(Item item) {
        if (isEmpty()) return false;
        Node curr = head;
        while (curr != null) {
            if ((item == null && curr.item == null) || (item != null && item.equals(curr.item))) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
    // EXERCISE 1.3.26
    //Write a method remove() that takes a linked list and a string key as arguments
    //and removes all of the nodes in the list that have key as its item field.
    public void remove(String key) {
        if (isEmpty()) {
            throw new RuntimeException("Linked list is already empty.");
        }
        while (head != null && head.item.equals(key)){
            head = head.next;
        }
        Node curr = head;
        while(curr != null && curr.next != null){
            if (curr.next.item.equals(key)){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
    }
    // exercise 1.3.27
    // Write a method max() that takes a reference to the first node in a linked list as a argument.
    // and returns the value of the maximum key in the list. Assume all the keys are positive integers
    // and returns 0 if the list empty
    public int max(){
        if (isEmpty()) return 0;
        Node curr = head;
        int max = (int) curr.item; // start with the first item as max.
        while(curr != null){
            int value = (int) curr.item;
            if (value > max) max = value;
            curr = curr.next;
        }
        return max;
    }

    // EXERCISE 1.3.30
    // Write a method reverses the list.
    public void reverseList(){
        if (isEmpty()) throw new RuntimeException("List is empty.");
        // you have to track previous , current and next nodes.
        Node curr = head;
        Node prev = null;
        Node next = null;
        while(curr != null){
            next = curr.next; // store the next variable before the breaking link to avoid of lossing.
            curr.next = prev;  // break the link between curr and curr.next.
            prev = curr; // reverse the link.
            curr = next;
        }
        // new head will be in the prev.
        head = prev;
    }

    @Override
//     Minor (Optional) Suggestions for toString() method.
//          1.	Efficiency:
//     •result += curr.item inside a loop creates a new string object each time (since String is immutable).
//           •	If the list gets long, it could be slow or memory-heavy.
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
