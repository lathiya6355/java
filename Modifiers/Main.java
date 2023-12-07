public class Main {
                                  
    //   final ================================
    //   final int x=10;
    // final double y= 3.05;

    // public static void main(String args[]){
    //     Main myObj = new Main();
    //     myObj.x = 20;        // genarate error because use final access modifier
    //     myObj.y = 3.45;      // genarate error because use final access modifier
    //     System.out.println(myObj.x);
    //     System.out.println(myObj.y);
    // }

    // static ================================
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
    public static void main(String args[]){
        myStaticMethod(); // call without creat object

        Main myObj = new Main();
        myObj.myPublicMethod(); // create a object and then call public method
    }

    //  abstract ================================

    // abstract class Main {
    //     public String fname = "prince";
    //     public int age = 20;
    //     public abstract void study(); // abstarct method without body provide body by subclass
    // }

    // class Student extends Main {
    //     public int graduationYear = 2021;
    //     public void study() {  // provide body of abstarct class
    //         System.out.println("Studying all day long");
    //     }
    // }
}