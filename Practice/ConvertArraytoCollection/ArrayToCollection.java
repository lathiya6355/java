import java.util.Arrays;
import java.util.List;

public class ArrayToCollection {
    public static void main(String[] args) {
        // Create an array of integers
        Integer[] array = { 1, 2, 3, 4, 5 };

        // Convert the array to a List (which is a Collection)
        List<Integer> list = Arrays.asList(array);

        // Display the elements in the List (which was originally the array)
        System.out.println("Elements in the List (converted from array):");
        for (Integer element : list) {
            System.out.print(element + " ");
        }
    }
}
