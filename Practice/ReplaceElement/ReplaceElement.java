import java.util.ArrayList;
import java.util.List;

public class ReplaceElement {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Original List: " + fruits);

        // Replacing the element at index 2 with "Grapes"
        fruits.set(2, "Grapes");

        System.out.println("List after replacing element at index 2: " + fruits);
    }
}
