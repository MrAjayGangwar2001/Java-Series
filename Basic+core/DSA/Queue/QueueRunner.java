package Queue;

public class QueueRunner {
    public static void main(String[] args) {
        
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(3);
        q.enqueue(7);
        q.enqueue(13);
        q.enqueue(17);
        
        q.dequeue();

        q.enqueue(19);
        q.enqueue(23);
        
        q.dequeue();
        
        q.enqueue(25);
        q.enqueue(28);

        System.out.println("is Queue Empty : " + q.isEmpty());
        System.out.println("Queue Size : " + q.getSize());
        System.out.println("is Queue full : " + q.isFull());

        q.show();
    }
}
