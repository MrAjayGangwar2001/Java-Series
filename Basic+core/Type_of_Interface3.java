// Ther Are Three Types of Interface
// 1. Normal Interface :-
//                           if we have 2 or more Method that is Normal interface 
// //  Functional/SAM Interface :- 
//                                 if We have one Method Interface that's called SAM(Single Abstract Method);;
// //  Marker Interface :-
//                        if we have only one Method that is empty(No Method) interface(Blank Interface)

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