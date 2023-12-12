import java.util.LinkedList;

public class LinkedListClear {
    public static void main(String[] args) {
        LinkedList<String> LinkedList = new LinkedList<>();

        LinkedList.add("Mango");
        LinkedList.add("Orange");
        LinkedList.add("Grapes");
        LinkedList.add("Apple");
        LinkedList.add("Banana");
        for(String element : LinkedList) {
            System.out.println(element);
        }

        System.out.println("Before Clearing the List: " + LinkedList);
        LinkedList.clear();
        System.out.println("After Clearing the List: " + LinkedList);
        for(String element : LinkedList) {
            System.out.println(element);
        }
        System.out.println("Linked List Size...  " + LinkedList.size());
    }
}
