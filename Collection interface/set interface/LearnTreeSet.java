import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(23);
        set.add(12);
        set.add(45);
        set.add(26);
        System.out.println("Add Elements in Treeset = " + set); // add elements in Treeset

        set.remove(23);
        System.out.println("Remove Element from Treeset = " +set ); // remove elements

        System.out.println("Contain Element from Treeset = "  + set.contains(450)); // contains elements

        System.out.println("Check Treeset is empty or not = " +set.isEmpty()); // empty chek ny te check karva mate

        System.out.println("check Treeset size = " + set.size()); // check Treeset size

        set.clear(); // clear Treeset

        System.out.println(set);



    }
    
}
