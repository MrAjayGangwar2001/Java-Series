import java.util.Map;
import java.util.HashMap;
import java.util.Hashtable;

public class MAP {
    public static void main(String[] args) {
        //  Here We can Use Both Methods HashMap And Hashtable Both are same but
        //  HashMap is Non Synchronized and Thread Safe and Hashtable is Synchronized 
        Map<String , Integer> Students = new HashMap<>();        // It is Normal Method
      //  Map<String , Integer> Students = new Hashtable<>();      // Also It is Same but It is a Synchronized .
        Students.put("Ajay" , 87);
        Students.put("Manoj" , 45);
        Students.put("Sanjay" , 68);
        Students.put("Aditya" , 97);
        Students.put("Ravi" , 85);
        Students.put("Vijay" , 23);
        Students.put("Rohit" , 78);

        System.out.println(Students);
        System.out.println(Students.get("Manoj"));
        System.out.println(Students.get("Aditya"));
        
        System.out.println(Students.keySet());
        System.out.println(Students.values());
        System.out.println(Students.getClass());
        System.out.println(Students.containsKey("Ajay"));
        System.out.println(Students.isEmpty());
        System.out.println(Students.remove("Rohit"));
        System.out.println(Students);

        // for(String Key : Students.keySet()){
        //     System.out.println(Key+ ":"+Students.get(Key));
        // }

    }
}
