//😊😊😊😊😊😊😊😊😊👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉--------POLYMORPHISM-----😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊

//  Polymorphism means the ability of one thing to behave in different ways depending on the situation.
// Polymorphism is Two Types
//  1. Run Time Polymorphism
//  2. Compile Time Polymorphism

// 👉 One person, many forms = Polymorphism

/// This Is Example of Run Time Polymorphism
class AA {
    public void show() {
        System.out.println("Class A in Show Method");
    }

}
class BB extends AA{
    public void show()
    {
        System.out.println("Class B in show Method");
    }
}
class CC extends AA{
    public void show()
    {
        System.out.println("Class C in show Method");
    }
}

public class Polimorphismmm {
    public static void main(String[] args) {
        AA obj = new AA();
        obj.show();

        obj = new BB();
        obj.show();
        obj = new CC();
        obj.show();
    }
}
