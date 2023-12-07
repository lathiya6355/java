import java.util.LinkedList;
public class Main {
     public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // cars.addFirst("Mazda"); // add new item in first place
    // cars.addLast("Mazda"); // add new item in last place

    // cars.removeFirst(); // remove first place item
    // cars.removeLast(); // remove last place item

    System.out.println(cars.getFirst()); // get only first item
    System.out.println(cars.getLast()); // get only last item
    // System.out.println(cars);  // linked list data store in container
  }
}
