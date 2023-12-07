import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        String username;

        System.out.println("Enter UserName");
        username = myObj.nextLine();

        System.out.println("user name is" + username);
    }
}
