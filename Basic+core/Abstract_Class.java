//   ----------------------ABSTRACT CLASS----------------------
//  Abstract class must have an Abstract Method
//  if we applying abstract method it required to make abstract method
//  we can not create abstract class object.......
//  we have to use all the abstract method 
// It is not Neccessary abstract class have abstract method.......
//  ❌ We cannot create an object of an abstract class
//  "Use abstract methods when you know what must be done, but not how — and leave that decision to subclasses."
//  Abstract Method = "Declare now, define later in child class"


abstract class Car {
    public abstract  void drive();            // Abstract method
    public abstract void ferrari();           // Abstract method

    public void playmusic() {
        System.out.println("It is musicplaying");
    }
}

abstract class BrandedCar extends Car {
    public void drive() {
        System.out.println("It is a BMW car");
    }
    public void mercedeceBenz() {
        System.out.println("It is a Mercedece car");
    }
}
class worldTopCar extends BrandedCar {
    public void ferrari()
    {
        System.out.println("It is Rare Car");
    }
    public void royalsroys()
    {
        System.out.println("It is Royalsroys Car");
    }
}


public class Abstract_Class {
    public static void main(String[] args) {
        Car obj = new worldTopCar();
        obj.drive();
        obj.ferrari();
        obj.playmusic();

    }

}