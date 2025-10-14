import java.util.ArrayDeque;
import java.util.Deque;

// Deque is a Interface in Java which extends the Queue interface.
// Deque is a double ended queue which means we can add or remove elements from both ends.
// Deque is a part of Java Collections Framework.
// Deque is implemented by ArrayDeque class in Java

// In Deque We have some Methods :- 
// Insert ==> 👉 ==> addFirst(e) | offerFirst(e) | addLast(e) | offerLast(e) | 
// Remove ==> 👉 ==> removeFirst() | pollFirst() | removeLast() | pollLast() |
// Examine ==> 👉 ==> getFirst() | peekFirst() | getLast() | peekLast() |

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
