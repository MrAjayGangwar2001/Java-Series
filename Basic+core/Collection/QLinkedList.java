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

        // LinkedList or add() Methods are nor Recommended to use in Queue becoz
        // LinkedList Methods can Throw an Exception if can not be handle, code/Program can be Blast
        // But Queue Methods can not Throw an Exception if can not be handle,
        // code/Program will not Blast� or Return Null
        // Ex. if we use remove Method if LinkedList is Empty then it will Throw an
        // Exception but Here Queue Method will Return Null
        System.out.println("Element in Queue Before Operations are : " + q);
        
        q.poll();
        System.out.println("After removing (poll) Element from Queue is : " + q);
    }
}
