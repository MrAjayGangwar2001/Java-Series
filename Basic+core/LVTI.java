//  LVTI  ==>  Local Variable Type Inferences

// In java 10 Update a Var keywords was introduced
// var keyword is used to declare a local variable  without specify type of variable



public class LVTI {
    public static void main(String[] args) {
        var name = "Rahul"; // Here var keyword is used to declare a local variable
        System.out.println(name);
        int nums = 38;
        var num = 19;
        var numss = "19";
        var ty = ((Object) num).getClass().getSimpleName();

        System.out.println((ty));
        System.out.println(((Object) nums).getClass().getSimpleName());
        System.out.println(((Object) name).getClass().getSimpleName());
        System.out.println(((Object) numss).getClass().getSimpleName()+" " +numss);

        //  For Array
       // int arr[] = new int[4];
        var arr1 = new int[4];    // also we can use var keyword to declare array
        System.out.println(arr1.length);

        // For Object

       // Stu obj = new Stu();

        var obj1 = new Stu(); // Here var keyword is used to declare an object
    }
}
