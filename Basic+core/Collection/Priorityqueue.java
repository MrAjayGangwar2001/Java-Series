import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


public class Priorityqueue {

    public static void main(String[] args) {
        
        // No Order, has Duplicate
        Queue<Integer> min = new PriorityQueue<>();                   // Default is MinHeap

        min.offer(2);
        min.add(6);
        min.add(7);
        min.add(8);
       
        
        System.out.println("Priority Queue Max Elements are " +max);        //   [7, 4, 5, 1, 3]
        
    }
}