 

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
