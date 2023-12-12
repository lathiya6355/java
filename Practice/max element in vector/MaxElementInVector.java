import java.util.Vector;
import java.util.Collections;

public class MaxElementInVector {
    public static void main(String[] args) {
        // Creating a Vector of integers
        Vector<Integer> numbers = new Vector<>();

        // Adding elements to the Vector
        numbers.add(15);
        numbers.add(25);
        numbers.add(10);
        numbers.add(35);
        numbers.add(20);

        // Finding the maximum element in the Vector
        int max = Collections.max(numbers);

        // Displaying the maximum element
        System.out.println("The maximum element in the Vector is: " + max);
    }
}

