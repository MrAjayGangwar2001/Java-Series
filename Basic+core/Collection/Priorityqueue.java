import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

// PriorityQueue Gives or store minimum/small value at index 0 or at start

public class Priorityqueue {

    public static void main(String[] args) {
        
        // No Order, has Duplicate
        Queue<Integer> min = new PriorityQueue<>();                   // Default is MinHeap

        min.offer(2);
        min.add(6);
        min.add(7);
        min.add(8);
        min.offer(3);
        min.add(9);
        max.add(7);
        max.offer(1);
        max.add(8);
        max.offer(3);
        max.offer(4);
        max.offer(5);

        System.out.println("Priority Queue Elements are " +min);
        System.out.println("Size of Priority Queue is : " +min.size());
        System.out.println("Peek of Queue Element is : " +max.peek());

        min.poll();
        System.out.println("Priority Queue Elements are " +max);
        System.out.println("Size of Priority Queue is : " +max.size());
        System.out.println("Peek of Queue Element is : " +max.peek());
        max.poll();
        
        System.out.println("Priority Queue Max Elements are " +max);        //   [7, 4, 5, 1, 3]
        
    }
}