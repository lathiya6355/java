class Bicycle {
    public int price;
    public int geer;
    // public String color;
    public int speed;

    public Bicycle (int geer, int speed, int startHeight) {
        this.price = price;
        this.geer = geer;
        // this.color = color;
        this.speed = speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }
    public void speedUp(int increment) {
        speed += increment;
    }

    public String toString() {
        return ("No of geer are " + geer + "\n" + " and speed of bicycle is" + speed);
    }
}

class Mountainbike extends Bicycle {
    public int seatHeight;

    public Mountainbike(int geer, int speed,
                        int startHeight)
    {
        super(geer, speed, startHeight);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}

public class Inheritance1 {
    public static void main(String args[])
    {
        Mountainbike mb = new Mountainbike(3, 100, 25);
        System.out.println(mb.toString());
    }
}
