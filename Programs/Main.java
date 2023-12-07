import java.util.Scanner;

public class Main {
    // public static void main(String[] args) {
    //     int x = 5;
    //     int y = 10;
    //     System.out.println(x + y);
    // }

    // using user input
    public static void main(String[] args) {
        int x,y,sum;
        Scanner input = new Scanner(System.in);
        System.out.println("enter x value = ");
        x = input.nextInt();

        System.out.println("enter y value = ");
        y = input.nextInt();

        sum = x + y;
        System.out.println("sum is = " + sum);
    }

}
