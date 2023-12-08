class Rectangle{
    private int length;
    private int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void getArea() {
        int area = length * breadth;
        System.out.println("Area = " + area);
    }
}

public class Area {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,16);
        rectangle.getArea();
    }
}
