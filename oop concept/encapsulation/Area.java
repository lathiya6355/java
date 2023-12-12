class Rectangle{
    private int length;
    private int breadth;
    public int width;
    public int x;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void getArea() {
        int area = length * breadth;
        System.out.println("Area = " + area);
    }

    public boolean intersects(Rectangle brickRect) {
        return false;
    }
}

public class Area {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,16);
        rectangle.getArea();
    }
}
