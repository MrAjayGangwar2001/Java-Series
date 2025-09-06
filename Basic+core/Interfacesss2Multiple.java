
//  Class -- Class 👉 -->  Extends
//  Class -- Interface 👉 --> Implements
//  Interface -- Interface 👉 --> Extends

//  Now we can extends interface to interface by using keyword extends like class-----

interface P {
    void start();

    void stop();
}

interface Q {
    void morning();

    void evening();
}

interface R extends Q {
    void accept();

    void reject();
}

interface S {
    void come();

    void go();
}

class Jaghera implements P, S, R {
    public void start() {
        System.out.println("It has been Started");
    }

    public void stop() {
        System.out.println("It has been Stoped");
    }

    public void morning()
    {
    System.out.println("Good Morning");
    }
    public void evening()
    {
    System.out.println("Good Evening");
    }
    public void accept() {
        System.out.println("You Have been Accepted");
    }
    public void reject()
    {
    System.out.println("You Have been Rejected");
    }
    public void come()
    {
    System.out.println("Please come inside of Interface");
    }
    public void go()
    {
    System.out.println("Please go outside of Interface");
    }
}

public class Interfacesss2Multiple {
    public static void main(String[] args) {
        P obj = new Jaghera();
        S obj1 = new Jaghera();
        obj.start();
        obj.stop();
        obj1.come();
        obj1.go();

         R obj2 = new Jaghera();
         obj2.morning();
         obj2.evening();
         obj2.accept();
         obj2.reject();


    }
}
