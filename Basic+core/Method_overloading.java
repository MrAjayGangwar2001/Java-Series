//   Method Overloading means having multiple methods with the same name in a class,
//   but with different number or types of parameters or can be different name with same param.

class Overloading {

    public int parameter(int a, int b) {
        return a + b;
    }

    public int parameter(int a, int b, int c) {
        return a + b + c;
    }

    public double parameter(double a, int b) {
        return a + b;
    }

    public double addition(double a, int b) {  // this is different method with diff. name with same param
        return a + b;
    }
}

public class Method_overloading {

    public static void main(String[] args) {
        Overloading over = new Overloading();
        int add = over.parameter(5, 7);
        int add1 = over.parameter(5, 7, 4); // With different parameters
        double add2 = over.parameter(5.56, 7); // With different parameters
        double add3 = over.addition(6.6, 5);
        System.out.println("overloading with parameter:- " + add);
        System.out.println("overloading Same name with different parameter:- " + add1);
        System.out.println("overloading Same name with different parameter Type:- " + add2);
        System.out.println("This is Another Method not overloading with different name with same parameter:- " + add3);
    }
}
