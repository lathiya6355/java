import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList of strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");
        linkedList.add("Mango");
        linkedList.add("Orange");

        System.out.println("Elements in the LinkedList:");

        // Using enhanced for loop
        for (String element : linkedList) {
            System.out.println(element);
        }

        // Using get() method and index
        System.out.println("\nRetrieving elements using get() method:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}
