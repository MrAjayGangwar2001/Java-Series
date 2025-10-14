import java.util.ArrayDeque;
import java.util.Deque;



public class ArrayDeQue {
    public static void main(String[] args) {
        
        Deque<Integer> dq = new ArrayDeque<>();           // No Order, Have Duplicate

        dq.offer(5);
        dq.offer(10);
        dq.offer(15);
        dq.offer(20);
        dq.offerFirst(25);
        dq.offer(15);
        dq.offer(20);
        dq.offerLast(30);
        dq.addFirst(35);
        dq.addLast(40);

        System.out.println("First Element (by getfirst()) of Deque is : " +dq.getFirst());
        System.out.println("Last Element (by getlast()) of Deque is : " +dq.getLast());
        System.out.println("First Element (by peekfirst()) of Deque is : " +dq.peekFirst());
        System.out.println("Last Element (by peeklast()) of Deque is : " +dq.peekLast());

        dq.pollFirst();                 // Removes the first element from the deque.
        dq.pollLast();                  // Removes the last element from the deque.
        dq.removeFirst();                // Removes the first element from the deque.


        System.out.println("Deque elements are :- " +dq);
    }
}
