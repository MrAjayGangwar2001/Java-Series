// 😊😊😊😊😊😊😊😊😊😊😊😊FINAL 😊😊😊😊😊😊😊😊😊😊
// Final Keyword can be use as a ------------👉👉👉👉👉👉👉    variable , Method And Class
// 1 . We can use final keyword as a variable to Fix or ---Constant Value----- In java Instead of Const.......
// 2 . We used final keyword in the class to -------prevent class extends----- or use.........We can not extends/inherit final keyword class---
// 3 . We used final keyword in the Method to -------prevent Overridding(same class)----- or use.........We can not Override class with final keyword class---
//  . 

// final class uses_as_class{    // This final keyword not allow to extends/inherit this class-------
class uses_as_class {
    // final public void show() {
    //     System.out.println("Hello");      // this final keyword befor Method not allowing to Override class-----
    // }   

    public void show() {
        System.out.println("final use in the class");
    }

    public void show(int a, int b) {
        System.out.println("final use in the class--addition of a and b :- " + (a + b));
    }
}

class usecases extends uses_as_class {
    public void show() {
        System.out.println("asdfghj");
    }
}

public class Final_Keyword {
    public static void main(String[] args) {
        // final int num = 8; /// final used as CONST...
        // //num = 9;
        // System.out.println(num);

        usecases obj = new usecases();
        obj.show();
        obj.show(5, 7);

    }
}
