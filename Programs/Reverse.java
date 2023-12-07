public class Reverse {
    public static void main(String[] args) {
        String original = "Hello!";
        String reverse = "";

        for(int i = 0; i < original.length(); i++) {
            reverse = original.charAt(i) + reverse;
        }
        System.out.println("reverse String is " + reverse);
    }
}   
