import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// ArrayList is Non-Synchronized that's why it is fast and Not Thread Safe than Vector bcos Vector is Synchronized
// Vector is Synchronized that's why it is slow and Thread Safe than ArrayList
//Note ==> 👉  To Make ArrayList Thread Safe we can use Collections.synchronizedList() OR  CopyOnWriteArrayList


public class ListAndArrayList {
    public static void main(String[] args) {

        // List<Integer> ls = Collections.synchronizedList(new ArrayList<>()); // 👉 To
        // Make ArrayList Synchronized and
        // Thread Safe
        // List<Integer> ls = new ArrayList();
        // ArrayList<Integer> ls = new ArrayList<Integer>();

        // ls.add(10);
        // ls.add(20);
        // ls.add(30);
        // ls.add(40);
        // ls.add(3, 35);
        // ls.clear(); // clear() => to remove all elements from the list
        // ls.add(45);
        // ls.add(55);
        // ls.add(50);
        // ls.add(60);
        // System.out.println(ls);

        // int ch = ls.get(1); // to get the element at the specified index
        // ls.add(70);
        // ls.add(70);
        // // ls.add("Ajay");
        // int last = ls.getLast();
        // ls.remove(2); // to remove the element at the specified index
        // int hc = ls.hashCode(); // to get the hash code of the list to evaluating a
        // // formula

        // boolean bl = ls.isEmpty(); // to check if the list is empty or Not
        // ls.remove(3); // to remove the element at the specified index

        // System.out.println("Size of list is " + ls.size());
        // System.out.println("Is list empty " + bl);

        // System.out.println("The Last Element from ArrayList" +last);
        // System.out.println(ch);

        // System.out.println(hc);
        // System.out.println(ls); // [45, 55, 60, 70]

        ArrayList<String> Shop = new ArrayList<>();

        Shop.add("Car");
        Shop.add("bike");
        Shop.add("Car");
        Shop.add("bike");
        Shop.add("Car");
        Shop.add("bike");
        Shop.add("Car");
        Shop.add("bike");
        Shop.add("super Man");

        System.out.println(Shop);

    }
}
