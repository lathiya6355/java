import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // Comparator.reverseOrder() using for remove max element remove first
        // convet minheap to max heap 
        pq.offer(20);
        pq.offer(10);
        pq.offer(40);
        pq.offer(50);
        pq.offer(30);

        System.out.println("add element in priority Queue = " + pq); // add element

        pq.poll();
        System.out.println("remove element in priority Queue = " + pq); // remove element

        System.out.println("Find which element is next remove = " + pq.peek());

    }
    
}
