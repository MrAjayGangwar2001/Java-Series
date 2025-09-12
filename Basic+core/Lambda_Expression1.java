
interface X {

    void display();
}

public class Lambda_Expression1 {

    public static void main(String[] args) {
        // X obj = new X() {                   // No need to Write These line
        // public void display() {
        // System.out.println("This is Functional Interface");
        // }
        // };
        X obj = () -> System.out.println("This is Printed By Lamda Expression");
        obj.display();
    }
;
}
