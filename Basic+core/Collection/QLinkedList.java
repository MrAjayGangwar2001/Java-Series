import java.util.LinkedList;
import java.util.Queue;



public class QLinkedList {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();             // Insertion Order , Have Duplicate

        q.add(11); // ⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️  why? see in comment
        q.offer(41);
        q.offer(51);
        q.add(21); // ⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️  why? see in comment
        q.offer(31);
        q.offer(41);
        q.offer(51);

        
        q.poll();
        System.out.println("After removing (poll) Element from Queue is : " + q);
    }
}
