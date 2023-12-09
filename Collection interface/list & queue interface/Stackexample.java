import java.util.Stack;

public class Stackexample {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("tiger");
        animals.push("lion");
        animals.push("elephant");
        System.out.println("Add Item in Stack = " + animals); // add item in stack

        System.out.println("Find Last Element = " + animals.peek());

        animals.pop();
        System.out.println("Remove Item from Stack = " + animals); // remove first item from stack
        System.out.println("Find Last Element = " + animals.peek());
    }
    
}
