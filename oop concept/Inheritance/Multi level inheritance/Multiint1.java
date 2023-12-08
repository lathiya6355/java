import java.io.*;
import java.lang.*;
import java.util.*;

class One {
    public void print_hello() {
        System.out.println("Hello");
    }
}

class Two extends One {
    public void print_for() {
        System.out.println("For");
    }
}
class Three extends Two {
    public void print_world() {
        System.out.println("World");
    }
}

public class Multiint1 {
    public static void main(String[] args) {
        Three t = new Three();
        t.print_hello();
        t.print_for();
        t.print_world();
    }
}
