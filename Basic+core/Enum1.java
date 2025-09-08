

// Enum is a method which used as Constant to provide the status of the process
 


enum Status{
    Running , Failed , Pending , Success
}

public class Enum1 {
    public static void main(String[] args) {
        Status s = Status.Success;
        System.out.println(s);
        // Other Way to use it
        Status[] ss = Status.values();
        System.out.println(ss[1]);
        //--------OR -----------
        // --------by Using Foreach loop------
         for(Status sss : ss)
        {
            System.out.println(sss+ " : " +sss.ordinal());
        }
        
        
       
    }
}
