// final Keyword Prevent any class to Inheritance
// if we use final keyword in any class then that class cannot be inherited by any other class.
// like Final keyword , we have another keyword that is sealed
// sealed Keyword Prevent any class to Inheritance


// sealed class A {           /// This class can not be inherit by sealed KEYWORD

// }
// final  class A {             // This class can not be inherit by final KEYWORD

// }

//   If we want to inheritance sealed or final class then we have to use permits then class name.....
//   and for sub class we have to use extends keyword with final or non-sealed keywords

// AGAIN We can not inherit final class by any class like B and C class can not be inherit by others
// class B extends A { }   // This is not possible because A is final class
// If we want to extend class B then we have to use non-sealed keyword instead of final

sealed class A permits B,C {

}

// final class B extends A{
non-sealed class B extends A{

}

final class C extends A {

}

class D extends B {

}

//  If we want to use in interface then we can do it like this...
//  in interface we have only two keywords that is sealed and non-sealed

// if we have sealed class/interface it must have a extended subclass/interface of sealed class/interface with permits keywords
// if we have non-sealed class/interface then we can extend it by any class/interface
 

sealed interface X permits Y {

}
sealed interface Y extends X {

}
non-sealed interface Z extends Y {

}


public class Final {
    public static void main(String[] args) {
        
    }
}
