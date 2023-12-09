import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> studentName = new ArrayList<>();
        studentName.add(5); // add value in array list
        studentName.add(10); // add value in array list
        studentName.add(20); // add value in array list
        System.out.println(studentName);

        studentName.add(30);
        System.out.println("Add element in array list = " + studentName);

        // studentName.add(1 , "raj"); // index number uper element set karva mate 2 argument pass thay
        // System.out.println("Set element using index number = " + studentName);

        // ArrayList<String> newList = new ArrayList<>();
        // studentName.add("dhruvil");
        // studentName.add("dhruvil");
        // studentName.add("dhruvil");

        // newList.addAll(newList); // new list create karine old list ma add karva mate
        // System.out.println("add new list in old arraylist = " + studentName);

        // System.out.println("Get a value = "+studentName.get(1));

// remove =========================
        // studentName.remove(1); // remove element in array list using index number
        // System.out.println("Remove element from array list = " + studentName);

        // studentName.remove(Integer.valueOf(2)); // remove element using element name
        // System.out.println("Remove element from array list = " + studentName);

        // studentName.clear();
        // System.out.println("clear full array list = " + studentName);

// set new value ======================

        // studentName.set(2, 50);
        // System.out.println(studentName);

        // studentName.contains("hiren");
        // System.out.println(studentName.contains("hiren"));

// using for loop 
        // for(int i = 0 ; i < studentName.size() ; i++) {
        //     System.out.println("Using For loop = " + studentName.get(i));
        // }

// using foreach
        // for (Integer element : studentName) {
        //     System.out.println("Forech Loop = " + element);
        // }

// using iterator 
        // Iterator<Integer> it = studentName.iterator();
        // while (it.hasNext()) {
        //     System.out.println("Iterator = " + it.next());
        // }


        // Java program to remove elements 
// in a LinkedList 

		LinkedList<String> ll = new LinkedList<>(); 

		ll.add("Geeks"); 
		ll.add("Geeks"); 
		ll.add(1, "For"); 

		System.out.println("Initial LinkedList " + ll); 

		// Function call 
		ll.remove(1); 

		System.out.println("After the Index Removal " + ll); 

		ll.remove("Geeks"); 

		System.out.println("After the Object Removal " + ll);


    }
}
