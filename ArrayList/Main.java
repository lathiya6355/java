import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        // ArrayList<String> cars = new ArrayList<String>();
        // cars.add("Volvo");
        // cars.add("BMW");
        // cars.add("Ford"); // add data in array list
        // cars.add("Mazda");
        // // System.out.println(cars); // store data in array formate

        // System.out.println(cars.get(0)); // get item using index number

        // ArrayList<String> cars = new ArrayList<String>();
        // cars.add("Volvo");
        // cars.add("BMW");
        // cars.add("Ford");
        // cars.add("Mazda");
        // cars.set(0, "Opel"); // set a data from index number using set
        // // cars.remove(3); // remove item in arraylist

        // cars.clear(); // clear arraylist all data
        // System.out.println(cars);

        // loop through array list =========================================

        // ArrayList<String> cars = new ArrayList<String>();
        // cars.add("Volvo");
        // cars.add("BMW");
        // cars.add("Ford");
        // cars.add("Mazda");
        // for (int i = 0; i < cars.size(); i++) {
        //     System.out.println(cars.get(i));
        // }

        // sorting array list =========================================

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars);  // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
