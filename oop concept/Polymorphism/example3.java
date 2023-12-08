class helper3 {
    void print() {
        System.out.println("Parent Class");
    }
}
class subClass1 extends helper3 {
    void print() {
        System.out.println("Sub Class 1");
    }
}

class subClass2 extends helper3{
    void print() {
        System.out.println("Sub Class 2");
    }
}

public class example3 {
    public static void main(String[] args) {
        helper3 a;
        a = new subClass1();
        a.print();

        a = new subClass2();
        a.print();
    }
}
