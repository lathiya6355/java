public class Count {
    public static void main(String[] args) {
        String word = "hello world sdfsdf!";
        int countWord = word.split("\\s").length;
        System.out.println(countWord);
    }
    
}
