import java.util.Enumeration;
import java.util.Vector;

//  Vector is a Synchronized so it is slow and thread safe
public class Vectors {
  public static void main(String[] args) {

    // Vector<String> vc = new Vector<String>();
    // vc.add("am");
    // vc.add("Ajay");
    // vc.add("Gangwar");
    // System.out.println(vc);
    // vc.add(0, "I");

     Vector<Integer> vc = new Vector<Integer>();
        vc.add(11);
        vc.add(21);
        vc.add(31);
        vc.add(41);
        vc.add(51);
        vc.add(51);



    System.out.println(vc);
  }
}
