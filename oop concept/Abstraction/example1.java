abstract class shape {
    String color;

    abstract double area(); // abstract method
    public abstract String toString(); // abstract method

    public shape(String color) {
        System.out.println("Shape Constructor Called...!");
        this.color = color;
    }

    public String getColor() {
        return color;
    }
} // abstract class

class Circle extends shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        System.out.println("Circle Constructor Called...!");
        this.radius = radius;
    }

    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return "Circle color is " + super.getColor() + " and area is: " + area();
    }
}

class rectangle extends shape {
    double length;
    double width;

    public rectangle(String color, double length, double width) {
        super(color);
        System.out.println("Rectangle Constructor Called...!");
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    public String toString() {
        return "Rectangle color is " + super.getColor() + " and area is: " + area();
    }
}

public class example1 {
    public static void main(String[] args) {
        shape s1 = new Circle("Red", 2.2);
        shape s2 = new rectangle("Yellow", 10, 20);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
