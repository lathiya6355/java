import java.util.ArrayDeque;
public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.add(23);
        adq.offerFirst(12); // add element in first place in queue
        adq.offerLast(45); //add element in last place in queue same as offer
        adq.offer(26); // add element in first place in queue

        System.out.println("Add element in queue = " + adq); // add element in queue

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());// element first che te check kare
        System.out.println(adq.peekLast());// element last che te check kare

        System.out.println(adq.poll());
        System.out.println("Poll() = " + adq);

        System.out.println(adq.pollFirst());
        System.out.println("PollFirst() = " + adq);

        System.out.println(adq.pollLast());
        System.out.println("PollLast() = " + adq);



    }
    
}
