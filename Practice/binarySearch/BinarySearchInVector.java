import java.util.Vector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BinarySearchInVector {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter Total number: ");
        // int n = scanner.nextInt();
        // scanner.nextLine();

        // System.out.println("Enter number: ");
        // for (int i = 0; i < n; i++) {
        //     numbers.add(scanner.nextInt());
        //     scanner.nextLine();
        //     numbers.addAll(numbers);
        // }

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int target = 50;
        // System.out.println("Enter search number: ");
        // int target = scanner.nextInt();
        // scanner.nextLine();

        int index = Collections.binarySearch(numbers, target);

        if (index >= 0) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found");
        }
    }
}

