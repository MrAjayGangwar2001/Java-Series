import java.util.Enumeration;
import java.util.Vector;

//  Vector is a Synchronized so it is slow and thread safe
public class Vectors {
  public static void main(String[] args) {

    Vector<String> vc = new Vector<String>();
    vc.add("am");
    vc.add("Ajay");
    vc.add("Gangwar");
    System.out.println(vc);
    vc.add(0, "I");



    
    System.out.println(vc);
  }
}
