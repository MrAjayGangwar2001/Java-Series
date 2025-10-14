import java.util.ArrayDeque;
import java.util.Deque;



public class ArrayDeQue {
    public static void main(String[] args) {
        
        Deque<Integer> dq = new ArrayDeque<>();           // No Order, Have Duplicate

        dq.offer(5);
        dq.offer(10);
        dq.offer(15);
        dq.offer(20);
        

        System.out.println("Deque elements are :- " +dq);
    }
}
