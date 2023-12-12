import java.util.ArrayList;
import java.util.List;

public class MinMaxList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(9);
        numbers.add(2);
        numbers.add(7);

        // Initializing min and max with the first element
        Integer min = numbers.get(0);
        Integer max = numbers.get(0);

        // Finding minimum and maximum through iteration
        for (Integer num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Minimum value in the list: " + min);
        System.out.println("Maximum value in the list: " + max);
    }
}
