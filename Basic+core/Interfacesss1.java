
//  we can not create object of Interface
// Under the interface variable are by default Final and Static
// we can not only define variable we have to initilize the variale value.
// we can directly use valiable in main class-------

//  Class -- Class 👉 -->  Extends
//  Class -- Interface 👉 --> Implements
//  Interface -- Interface 👉 --> Extends



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
