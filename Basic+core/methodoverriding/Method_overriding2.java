// This is Another Example of METHOD OVERRIDING
// In Overriding , it have same class , same method ...Everythig is same But Behaviour is Different
package methodoverriding;

//import Calc;

class Calc{
    public int add(int a , int b)
    {
        return a+b;
    }

}
class AdvCalc extends Calc{
    public int add(int a , int b)
    {
        return a+b+2;
    }
}



public class Method_overriding2 {
    public static void main(String[] args) {
        AdvCalc ac = new AdvCalc();
        int result = ac.add(5,8);
        System.out.println(result);
    }
}
