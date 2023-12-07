import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    // create a file=============================
    // public static void main(String[] args) {
    //     try{
    //         File myObj = new File("prince.txt");
    //         // File myObj = new File("C:\\Users\\MyName\\filename.txt"); // set a path to create file this place
    //         if (myObj.createNewFile()) {
    //             System.out.println("File created: " + myObj.getName());
    //         } else {
    //             System.out.println("File already exists.");
    //         }
    //     } catch (Exception e) {
    //         System.out.println("An error occurred.");
    //         e.printStackTrace();
    //     }
    // } 

    // write a file ===============================

    // public static void main(String[] args) {
    //     try {
    //         FileWriter myWriter = new FileWriter("prince.txt");
    //         myWriter.write("Files in Java might be tricky, but it is fun enough!");
    //         myWriter.close();
    //         System.out.println("Successfully wrote to the file.");
    //     } catch (IOException e) {
    //         System.out.println("An error occurred.");
    //         e.printStackTrace();
    //     }
    //     }

    //  read file

    // public static void main(String[] args) {
    //     try{
    //         File myObj = new File("prince.txt");
    //         Scanner myRead = new Scanner(myObj);
    //         while (myRead.hasNextLine()) {
    //             String data = myRead.nextLine();
    //             System.out.println(data);
    //         }
    //         myRead.close();
    //     } catch(Exception e) {
    //         System.out.println("An error occurred.");
    //         e.printStackTrace();
    //     }
    // }

    // delete file ===================================

    // public static void main(String[] args) {
    //     File myObj = new File("prince.txt");
    //     if (myObj.delete()) {
    //         System.out.println("File deleted: " + myObj.getName());
    //     } else {
    //         System.out.println("File does not exist.");
    //     }
    // }
}

