interface In1{
    final int a = 10;
    void display();
}

class Example1 implements In1 {
    public void display() {
        System.out.println("prince");
    }
    public static void main(String[] args) {
        Example1 t = new Example1();
        t.display();
        System.out.println(a);
    }
}

