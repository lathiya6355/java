import java.util.Set;
import java.util.HashSet;


public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(23);
        set.add(12);
        set.add(45);
        set.add(26);
        System.out.println("Add Elements in Hashset = " + set); // add elements in hashset

        set.remove(23);
        System.out.println("Remove Element from hashset = " +set ); // remove elements

        System.out.println("Contain Element from hashset = "  + set.contains(450)); // contains elements

        System.out.println("Check hashset is empty or not = " +set.isEmpty()); // empty chek ny te check karva mate

        System.out.println("check hashset size = " + set.size()); // check hashset size

        set.clear(); // clear hashset

        System.out.println(set);



    }
    
}
