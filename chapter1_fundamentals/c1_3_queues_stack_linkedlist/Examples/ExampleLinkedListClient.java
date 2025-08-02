package chapter1_fundamentals.c1_3_queues_stack_linkedlist.Examples;

import chapter1_fundamentals.c1_3_queues_stack_linkedlist.datastructures.LinkedList;

public class ExampleLinkedListClient {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.append("Alpha");
        list.append("Beta");
        list.append("Gamma");
        list.append("Omega");
        list.append("Sigma");

        System.out.println("Current List: " + list);
        list.reverseList();
        System.out.println("Reversed list : " + list );

        list.removeFirst();
        System.out.println("After removeFirst: " + list);

        String searchResult = list.searchItem("Gamma");
        System.out.println("Search for 'Gamma': " + (searchResult != null ? "Found" : "Not Found"));

        searchResult = list.searchItem("Alpha");
        System.out.println("Search for 'Alpha': " + (searchResult != null ? "Found" : "Not Found"));

        System.out.println("Current list : " + list);
        System.out.println("After removing last element.");
        list.removeLast();
        System.out.println("Current list: " + list);
        list.deleteKth(2);
        System.out.println("After removing " + 2 + " th element");
        System.out.println("Current List : " + list);

    }
}
