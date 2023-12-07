class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog makes a sound");
    }
}

class Cat extends Animal {
    public void animalSound() {
        System.out.println("The cat makes a sound");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();  

        myAnimal.animalSound();
        myDog.animalSound();
        myCat.animalSound();
    }
}