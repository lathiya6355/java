class Employee {
    int salary = 10000;
}

class engineer extends Employee {
    int benefits = 2000;
}

public class Inheritance2 {
    public static void main(String args[]) {
        engineer e1 = new engineer();
        System.err.println("Salary is " + e1.salary + " Benifits is " + e1.benefits);
    }
    
}
