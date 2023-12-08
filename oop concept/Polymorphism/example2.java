class helper2 {
    static int multiply(int a, int b) {
        return a * b;
    }
    static double multiply(double a, double b, double c) {
        return a * b * c;
    }
}

public class example2 {
    public static void main(String[] args) {
        System.out.println(helper2.multiply(2,3));
        System.out.println(helper2.multiply(2.1,3.3,4.5));
    }
}
