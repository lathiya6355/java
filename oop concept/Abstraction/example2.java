abstract class animal {
    private String name;

    public animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }
}

class Dog extends animal {
    public Dog(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println(getName() + " barks");
    }
}

class Cat extends animal {
    public Cat(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println(getName() + " meows");
    }
}

public class example2 {
    public static void main(String[] args) {
        animal myDog = new Dog("luma");
        animal myCat = new Cat("buddy");
        myDog.makeSound();
        myCat.makeSound();
    }
}
