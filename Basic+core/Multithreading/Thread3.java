
// In this video we will learn mutation variable that is using two threads at a time
// Mutable Variable  = We can Change Value anywhere in the program
// UnMutable Variable  = We can not( fixed like constant ) Change Value anywhere in the program

// In this program we using mutable variable that is count that default value is 0


///  NOTE :- 👉👉👉  To Fix of all these issues we will use Synchronized keyword in class method--------👍👍 

class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}

public class Thread3 {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();


        Runnable obj1 = () -> { // Runnable also a functional Interface that's why we can use Lamda Interface
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }

        };
        Runnable obj2 = () -> { // Runnable also a functional Interface that's why we can use Lamda Interface
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }

        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();     // This .join() method is used for WAIT to print final output once thread one(t1) completion 
        t2.join();
        System.out.println(c.count);
    }
}
