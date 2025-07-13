
// we have Two option to use multiple thread class 
//  1 .👉 By extends Thread
//  2 . 👉 By implements Runnable

/// THIS IS THE EXAME OF EXTEND THREAD-------

class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Ajay");

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("It's Done! ");
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Gangwar");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("It's Done! ");
            }
        }
    }
}

public class Thread1 {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.start();
        obj2.start();
        System.out.println(obj1.getName());
         
        // System.out.println(obj2.getThreadGroup());
        // System.out.println("Threade is Alive or not :- " + obj1.isAlive());
        // System.out.println("Is Daemon or not :- " + obj1.isDaemon());
        // System.out.println("Priority :- " + obj2.getPriority());

    }
}