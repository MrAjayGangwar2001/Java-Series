
/// THIS IS THE EXAMEOLE OF IMPLEMENTS RUNNABLE----TO EXTENDS---

class A implements Runnable {
    // public void run() {
    // for (int i = 0; i < 10; i++) {
    // System.out.println("Ajay");

    // try {
    // Thread.sleep(1);
    // } catch (InterruptedException e) {
    // System.out.println("It's Done! ");
    // }
    // }
    // }
}

class B implements Runnable {
    public void run() {
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("Gangwar");
        //     try {
        //         Thread.sleep(1);
        //     } catch (InterruptedException e) {
        //         System.out.println("It's Done! ");
        //     }
        // }
    }
}

public class Thread2 {
    public static void main(String args[]) {

        // Runnable obj1 = new Runnable(); or
        Runnable obj1 = () -> {                              // Runnable also a functional Interface that's why we can use Lamda Interface
            for (int i = 0; i < 10; i++) {
                System.out.println("Ajay");

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    System.out.println("It's Done! ");
                }
            }
            
        };

        Runnable obj2 = () -> 
        {                              // Runnable also a functional Interface that's why we can use Lamda Interface
            for (int i = 0; i < 10; i++) {
                System.out.println("Gangwar");

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    System.out.println("It's Done! ");
                }
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
