package methodoverriding;

//  Method Overriding means redefining a method of the parent class in the child class with the same name,
//  return type, and parameters.
// Method Overriding is a run time inheritance
class Demo {
    public void show() {
        System.out.println("It is Show Method in parent class");
    }

    public void hidden()
    {
        System.out.println("Hidden method in parent class");
    }
}

class Demo2 extends Demo {
    public void show() 
    {
        System.out.println("This is class Demo2 method show2");
    }
}

public class Method_overriding1 {
    public static void main(String[] args) {
        Demo2 dm = new Demo2();
        dm.show();
        dm.hidden();
    }
}
