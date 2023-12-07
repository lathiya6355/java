import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda"); // add item in hash set
        // cars.remove("Volvo"); // remove item in hash set
        // cars.clear(); // remove all item from hashset
        // System.out.println(cars);
        // System.out.println(cars.contains("Mazda")); // check if an item are exist in hashset

        //loop through hash set
        for (String i : cars) {
            System.out.println(i);
          }
      }
}
