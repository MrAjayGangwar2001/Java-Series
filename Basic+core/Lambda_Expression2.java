// Lambda Expression
// Here we are using with Parameter

@FunctionalInterface
interface X{
    void display(int a);
}


public class Lambda_Expression2 {
    public static void main(String[] args) {
        X obj = a -> System.out.println("This is example of Lambda Expression with Parameters : " + a);
        obj.display(7);
    }
}
