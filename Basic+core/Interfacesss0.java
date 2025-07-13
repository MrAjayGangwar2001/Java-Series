
//    Interface just like a class and it's Method by default public abstract------
/// NOTE:👉   MAIN DIFFERENCE BETWEEN ABSTRACT AND INTERFACE IS ------ 
//       👉 WE CAN ABSTRACT ONLY ONE CLASS                                       👉 WE CAN IMPLEMENTS MULTIPLE INTERFACES IN ONE CLASS 


//  Class -- Class 👉 -->  Extends
//  Class -- Interface 👉 --> Implements
//  Interface -- Interface 👉 --> Extends

// abstract class Computer {                    //  we replace ABSTRACT CLASS to interface to make it INTERFACE-------
//     public abstract  void code();           //  No need add public abstract in 👉Interface-----------
//     public abstract void mode();

// }
interface Computer {
    void code();

}

class Laptop implements Computer {                 // we replace EXTENDS to IMPLEMENTS in INTERFACE---------
    public void code() {
        System.out.println("Write code , compile and execute");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Write code in Desktop with faster than Laptop");
    }
}

class Devapps {
    public void devlop_code(Computer lap) {
        lap.code();
    }
}

public class Interfacesss0 {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Devapps ajay = new Devapps();
        ajay.devlop_code(desk);
        ajay.devlop_code(lap);
    }
}
