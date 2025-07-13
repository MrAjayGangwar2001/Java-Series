

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
        System.out.println(ss[1]);   /// OR
        
        for(Status sss : ss)
        {
            System.out.println(sss+ " : " +sss.ordinal());
        }
        /// OR 
        
        // Let's consider this statement-------- Status s = Status.Success;    
        if (s == Status.Failed) {
            System.out.println("Try Again");
        } else if(s == Status.Running) {
            System.out.println("just A movement");
        }
        else if(s == Status.Pending){
            System.out.println("Please Wait , Processing");
        }
        else{
            System.out.println("All Good, Completed");
        }
    }
}
