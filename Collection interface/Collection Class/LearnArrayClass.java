import java.util.Arrays;

public class LearnArrayClass {
    public static void main(String[] args) {
        // int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        // int index = Arrays.binarySearch(numbers, 4);

        // System.out.println("Binary Search in array = " + index); // binary search in array.

// array sort =============================

        Integer[] numbers = {25,46,10,5,89,76,45,36,27};
        Arrays.sort(numbers);

        Arrays.fill(numbers,12);
        for(int i : numbers) {
            System.out.println(" " + i);
        }
        System.out.println(Arrays.toString(numbers));
    }
}
