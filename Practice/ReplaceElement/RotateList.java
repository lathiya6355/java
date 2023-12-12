import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int rotationDistance = 2; // Rotate by 2 positions to the right

        System.out.println("Original List: " + numbers);

        // Using Collections.rotate() to rotate the list
        Collections.rotate(numbers, rotationDistance);

        System.out.println("List after rotating " + rotationDistance + " positions to the right: " + numbers);
    }
}
