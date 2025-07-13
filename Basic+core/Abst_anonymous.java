//   we are using Abastract and Anonymous class together...
/// We know we can not create object of Abastract class but by Anonymous class it is possible......let's see----
/// // we create anonymous inner class---
/// 

abstract class Magic {
    public abstract void CS1();

    public abstract void CS2();
}

public class Abst_anonymous{
    public static void main(String[] args) {
        Magic obj = new Magic() {
            public void CS1() 
            {
                System.out.println("This is Anonymous Class Method");
            }

            public void CS2() 
            {
                System.out.println("This is Anonymous Class Method second");
            }
        };
        obj.CS1();
        obj.CS2();
    }
}
