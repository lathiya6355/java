class Vehicle {
    protected String brand = "audi";
    public void honk() {
        System.out.println("tuut , tuut !");
    }
}

class Car extends Vehicle {  // car class extend vehicle class and use vehicle class properties
    private String modelName = "Mustang";
    public static void main(String[] args) {
        Car myFastCar = new Car();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }
}

//  final class Vehicle {
//     protected String brand = "audi";
//     public void honk() {
//         System.out.println("tuut , tuut !");
//     }
// }

// class Car extends Vehicle {  // car class extend vehicle class but cannto use vehilce clss property because vehicle class is use final keyword.
//     private String modelName = "Mustang";
//     public static void main(String[] args) {
//         Car myFastCar = new Car();
//         myFastCar.honk();
//         System.out.println(myFastCar.brand + " " + myFastCar.modelName);
//     }
// }