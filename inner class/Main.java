// class OuterClass {
//     int x = 10;
//     class InnerClass {
//         int y = 20;
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         OuterClass outer = new OuterClass();
//         OuterClass.InnerClass inner = outer.new InnerClass();
//         System.out.println(outer.x + inner.y);
//     }
// }

//  Private inner class =================================

// class OuterClass {
//     int x = 10;
//     private class InnerClass {
//         int y = 20;
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         OuterClass outer = new OuterClass();
//         OuterClass.InnerClass inner = outer.new InnerClass();
//         System.out.println(outer.x + inner.y);
//     }
// } // trow error OuterClass.InnerClass has private access in OuterClass

//  Static inner class ==================================
// class OuterClass {
//     int x = 10;
//     static class InnerClass {
//         int y = 20;
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         OuterClass outer = new OuterClass();
//         OuterClass.InnerClass inner = new OuterClass.InnerClass();
//         System.out.println(outer.x + inner.y);
//     }
// }

// access outer class from inner class
class OuterClass {
    int x = 10;
    class InnerClass {
        public int myInnerMethod() {
            return x;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        System.out.println(inner.myInnerMethod());
    }
}
