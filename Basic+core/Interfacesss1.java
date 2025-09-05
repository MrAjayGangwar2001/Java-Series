




interface first{
    int age = 23;                         // variable Final and Static means we can not Change the value                      
    String location = "Ghaziabad";        // variable Final and Static means we can not Change the value-------
    void show();
    void show2();
}

class second implements first{
    public void show()
    {
        System.out.println("It is Show Method of interface");
    }
    public void show2(){
        System.out.println("It is show2 Method of interface");
    }
}
public class Interfacesss1 {
    public static void main (String args[]){
        first obj;
        obj = new second();
        obj.show();
        obj.show2();

        System.out.println(first.age);
        System.out.println(first.location);
    }
}
