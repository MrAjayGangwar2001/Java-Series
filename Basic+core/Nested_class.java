//  we have to refered of class NA for N_B to specify otherwise we can not create object....
//  if we make inner class static then not required to ref. class A to B (only make static inner class not outer class)

class NA {
    int n;

    public void show() {
        System.out.println("class A in show");

    }

    // static class N_B {
    // // public void Ba() {
    // // System.out.println("Nested Show");
    // // }
    // }
}

public class Nested_class {
    public static void main(String[] args) {
        /*
        NA obj = new NA();
        obj.show();
         

        //NA.N_B obj1 = obj.new N_B();    // we refered class NA to N_B
        NA.N_B obj1 = new NA.N_B();
        obj1.Ba();
         */


         // 👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇--------NEW METHOD TO USE METHOD-----👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇

         NA obj = new NA()
         {
            public void show() {
                 
               System.out.println("This is new method/way to use Method");
           }
         };
         obj.show();
    }
}
