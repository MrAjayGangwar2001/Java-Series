// Inheritance to inherit property from parent to child and it have many forms.
// 1. create main file and make ref. object and give reference
// 2. make it Calc.java file .This file refrence give in main file
// 3. make it another third file and gave it refrence from Calc.java file by using extends keywords
///👉👉👉👉👉👉👉For Inheritance Required a .class file👉👉👉👉👉👉👉👉
/// After compilation if we delete any file afterthat it will work
/// These are the MULTI LEVEL INHERITANCE
///👉👉👉😍😍😍👉👉Inheritance means a child class can use the properties and methods of a parent class.

//  ****** Like this we can use another file and make it chain like child ******//

public class Main {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(5 , 7);
        int r2 = obj.sub(15 , 7);
        int r3 = obj.mul(5 , 7);
        int r4 = obj.div(15 , 3);
        double r5 = obj.pow(2 , 5);
        System.out.println(r1+ " : " +r2+ " : " +r3+ " : " +r4+ ": "+r5);
    }
}
