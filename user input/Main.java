import java.util.Scanner;
public class Main {
    public static void main( String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.println("Enter name, age and salary:");

        // string inputs
        String name = myInput.nextLine();

        //number inputs
        int age = myInput.nextInt();
        double salary = myInput.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
