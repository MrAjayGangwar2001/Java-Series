// 👉  A lambda expression is a short block of code that takes in parameters and returns a value.
// It’s used to represent a method without writing a full method — mainly for implementing functional interfaces

//  Lamda Expression ( -> )
//  It Reduce the code and automatically get the value
//  Here Below the Use cases
// This is Example without Parameter
//  NOTE :-👉  Lamda Expression will work with only functional Interface  

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
