import java.util.LinkedList;
import java.util.Queue;

public class LinklistQueue {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        qu.offer(12);
        qu.offer(13);
        qu.offer(14);
        qu.offer(15);
        System.out.println("Add element in queue = " + qu); // add element in queue 

        System.out.println("Remove element From Queue = " + qu.poll()); // remove element from queue

        System.out.println("Check which element is first = " + qu.peek());
    }
    
}