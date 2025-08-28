//   Method Overloading means having multiple methods with the same name in the same class,
//  but with different parameter lists (different number of parameters OR different types of parameters OR different order of parameters)

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

    // This Method is Not Including Method Overloading
    public double addition(double a, int b) {  // this is different method with diff. name with same param
        return a + b;
    }
}

public class Method_overloading {

    public static void main(String[] args) {
        Overloading over = new Overloading();
        int add = over.parameter(5, 7);
        // int add1 = over.parameter(5, 7, 4); // With different parameters
        // double add2 = over.parameter(5.56, 7); // With different parameters
        // double add3 = over.addition(6.6, 5);
        System.out.println("overloading with parameter:- " + add);
        
    }
}
