 class A{

    public A() {
        super();
        System.out.println("A int without param");
    }

    public A(int a) {
        super();
        System.out.println("In A int with param");
    }

}
class B extends A {

    public B() {
        super();
        System.out.println("B int without param");
    }

    public B(int a) {
        super();   //  OR
         // this();
        System.out.println("In B int with param");
    }

}

public class Construct{
    public static void main(String[] args) {
        B obj = new B();
        B obj1 = new B(10);

    }
}