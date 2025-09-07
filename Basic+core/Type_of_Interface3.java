

// Functional interface
@FunctionalInterface
interface X {
    void display();
}

public class Type_of_Interface3 {
    public static void main(String[] args) {
        X obj = new X() {
            public void display() {
                System.out.println("This is Functional Interface");
            }
        };
        obj.display();
    };
}