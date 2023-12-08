class a {
    public void print_a() {
        System.out.println("A");
    }
}

class b extends a {
    public void print_b() {
        System.out.println("B");
    }
}

class c extends a {
    public void print_c() {
        System.out.println("C");
    }
}

class d extends a {
    public void print_d() {
        System.out.println("D");
    }
}

public class Multiint2 {
    public static void main(String[] args) {
        b obj_b = new b();
        obj_b.print_a();
        obj_b.print_b();

        c obj_c = new c();
        obj_c.print_a();
        obj_c.print_c();

        d obj_d = new d();
        obj_d.print_a();
        obj_d.print_d();
    }
    
}
