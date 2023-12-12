import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0.0;

        while (true) {
            System.out.println("Scientific Calculator");
            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Square Root (√)");
            System.out.println("6. Exponentiation (^)");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter first number:");
                    double addend1 = scanner.nextDouble();
                    System.out.println("Enter second number:");
                    double addend2 = scanner.nextDouble();
                    result = addend1 + addend2;
                    break;
                case 2:
                    System.out.println("Enter first number:");
                    double minuend = scanner.nextDouble();
                    System.out.println("Enter second number:");
                    double subtrahend = scanner.nextDouble();
                    result = minuend - subtrahend;
                    break;
                case 3:
                    System.out.println("Enter first number:");
                    double factor1 = scanner.nextDouble();
                    System.out.println("Enter second number:");
                    double factor2 = scanner.nextDouble();
                    result = factor1 * factor2;
                    break;
                case 4:
                    System.out.println("Enter dividend:");
                    double dividend = scanner.nextDouble();
                    System.out.println("Enter divisor:");
                    double divisor = scanner.nextDouble();
                    if (divisor != 0) {
                        result = dividend / divisor;
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;
                case 5:
                    System.out.println("Enter a number to find its square root:");
                    double number = scanner.nextDouble();
                    if (number >= 0) {
                        result = Math.sqrt(number);
                    } else {
                        System.out.println("Cannot find square root of a negative number!");
                    }
                    break;
                case 6:
                    System.out.println("Enter base:");
                    double base = scanner.nextDouble();
                    System.out.println("Enter exponent:");
                    double exponent = scanner.nextDouble();
                    result = Math.pow(base, exponent);
                    break;
                case 7:
                    System.out.println("Exiting Calculator. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid operation.");
                    break;
            }

            System.out.println("Result: " + result);
        }
    }
}

