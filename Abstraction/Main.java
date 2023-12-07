abstract class Animal {
    public abstract void animalSound(); // not have a body provide a body by subclass
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog makes a sound");
    } // subclass of abstract class anomal sound
}


public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // crate object
        myDog.animalSound();
        myDog.sleep();
    }
}

// abstract class Animal {
//   public abstract void animalSound();
//   public void sleep() {
//     System.out.println("Zzz");
//   }
// }
// public class Main {
//     public static void main(String[] args) {
//         Animal myObj = new Animal(); // animal class is abstract class not create a object
//     } // throw error :- Animal is abstract; cannot be instantiated
// }