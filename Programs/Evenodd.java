import java.util.Scanner;
public class Evenodd {
    // public static void main(String[] args) {
    //     int i = 10;
    //     if(i % 2 == 0) {
    //         System.out.println("Even");
    //     } else {
    //         System.out.println("Odd");
    //     }
    // }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number (x): ");
        int x = scanner.nextInt();

        System.out.print("Enter the ending number (y): ");
        int y = scanner.nextInt();

        System.out.println("Even numbers between " + x + " and " + y + ":");
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Odd numbers between " + x + " and " + y + ":");
        for (int i = x; i <= y; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
