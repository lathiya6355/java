// interface Animal {
//     public void animalSound(); // interface method (not have a body)
//     public void sleep(); // interface method (not have a body)
// }
// class Pig implements Animal{ // in the interface not use extend keyword but use implement keyword
//     public void animalSound() {
//     // The body of animalSound() is provided here
//         System.out.println("The pig says: wee wee");
//     }
//     public void sleep() {
//         // The body of sleep() is provided here
//         System.out.println("Zzz");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Pig myPig = new Pig();
//         myPig.animalSound();
//         myPig.sleep();
//     }
// }

// multiple interfaces =====================================

interface First {
    public void myMethod();
}
interface Second {
    public void otherMethod();
}

class Demo implements First,Second{
    public void myMethod() {
        System.out.println("Some text..");
    }
    public void otherMethod() {
        System.out.println("Some other text...");
    }
}
class Main {
    public static void main(String[] args) {
        Demo myDemo = new Demo();
        myDemo.myMethod();
        myDemo.otherMethod();
    }
}