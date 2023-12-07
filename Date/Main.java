import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main {
    // public static void main(String[] args) {
    //     LocalDate myObj = LocalDate.now();
    //     System.out.println(myObj); // current date
    // }

    // public static void main(String[] args) {
    //     LocalDateTime myObj = LocalDateTime.now();
    //     System.out.println(myObj); // local date and time
    // }

    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); // ofPattern() using for formate date & time

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }

}
