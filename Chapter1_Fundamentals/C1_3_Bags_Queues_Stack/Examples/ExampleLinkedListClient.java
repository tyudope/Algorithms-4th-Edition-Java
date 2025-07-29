package Chapter1_Fundamentals.C1_3_Bags_Queues_Stack.Examples;

import Chapter1_Fundamentals.C1_3_Bags_Queues_Stack.LinkedList;

public class ExampleLinkedListClient {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.append("Alpha");
        list.append("Beta");
        list.append("Gamma");

        System.out.println("Current List: " + list);

        list.removeFirst();
        System.out.println("After removeFirst: " + list);

        String searchResult = list.searchItem("Gamma");
        System.out.println("Search for 'Gamma': " + (searchResult != null ? "Found" : "Not Found"));

        searchResult = list.searchItem("Alpha");
        System.out.println("Search for 'Alpha': " + (searchResult != null ? "Found" : "Not Found"));
    }
}
