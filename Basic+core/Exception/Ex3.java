
class A {
    public void show() throws ClassNotFoundException
    {
       // try {
            Class.forName("Ex3");
        // } catch (ClassNotFoundException e) {
        //     System.out.println("There is no class i can found");
        // }
    }
}

public class Ex3 {

    static{
    System.out.println("Here is something Found");
    }
    public static void main(String[] args) {
        A obj = new A();
        //obj.show();
       try{
        obj.show();
       }
       catch(ClassNotFoundException e)
       {
        System.out.println("Here it is working");
       }
    }
}
