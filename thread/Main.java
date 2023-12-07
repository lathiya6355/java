    // running thead ======================
//extend ex
    // public class Main extends Thread {
    //     public static void main(String[] args) {
    //         Main thread = new Main();
    //         thread.start();
    //         System.out.println("This code is outside of the thread");
    //     }
    //     public void run() {
    //         System.out.println("This code is running in a thread");
    //     }
    // }

// implement ex
// public class Main implements Runnable {
//     public static void main(String[] args) {
//         Main obj = new Main();
//         Thread thread = new Thread(obj);
//         thread.start();
//         System.out.println("This code is outside of the thread");
//     }
//     public void run() {
//         System.out.println("This code is running in a thread");
//     }
// } 

//Use isAlive() to prevent concurrency problems:

public class Main extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        // Wait for the thread to finish
        while(thread.isAlive()) {
        System.out.println("Waiting...");
    }
    // Update amount and print its value
    System.out.println("Main: " + amount);
    amount++;
    System.out.println("Main: " + amount);
    }
    public void run() {
        amount++;
    }
}