import java.util.Scanner;

class encapsulation {
    private String personName;
    private int personAge;
    private double personSalary;

    public String getName() {
        return personName;
    }
    public void setName(String name) {
        personName = name;
    }

    public int getAge() {
        return personAge;
    }
    public void setAge(int age) {
        personAge = age;
    }

    public double getSalary() {
        return personSalary;
    }
    public void setSalary(double salary) {
        personSalary = salary;
    }
}

public class Accessvariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        encapsulation person = new encapsulation();

        System.out.print("Enter your name: ");
        person.setName(scanner.nextLine());

        System.out.print("Enter your age: ");
        person.setAge(scanner.nextInt());

        System.out.print("Enter your salary: ");    
        person.setSalary(scanner.nextDouble());

        System.out.println("Name = " + person.getName());
        System.out.println("Age = " + person.getAge());
        System.out.println("Salary = " + person.getSalary());
        System.out.println("yearly Salary = " + person.getSalary() * 12);
    }
}
