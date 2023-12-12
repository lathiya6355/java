// using for-each loop

// import java.util.ArrayList;
// import java.util.Collection;

// public class PrintCollection {
//     public static void main(String[] args) {
//         // Create a Collection (ArrayList in this case)
//         Collection<String> collection = new ArrayList<>();
//         collection.add("apple");
//         collection.add("banana");
//         collection.add("orange");

//         // Using for-each loop to print elements
//         for (String element : collection) {
//             System.out.println(element);
//         }
//     }
// }

// usign foreach method

// import java.util.ArrayList;
// import java.util.Collection;

// public class PrintCollection {
//     public static void main(String[] args) {
//         // Create a Collection (ArrayList in this case)
//         Collection<String> collection = new ArrayList<>();
//         collection.add("apple");
//         collection.add("banana");
//         collection.add("orange");

//         // Using forEach() method to print elements
//         System.out.println("Using For-each Method");
//         collection.forEach(System.out::println);
//     }
// }

// using toString method

import java.util.ArrayList;
import java.util.Collection;

public class PrintCollection {
    public static void main(String[] args) {
        // Create a Collection (ArrayList in this case)
        Collection<String> collection = new ArrayList<>();
        collection.add("apple");
        collection.add("banana");
        collection.add("orange");

        System.out.println("Using toString Method");
        // Using toString() method to print elements
        System.out.println(collection);
    }
}

