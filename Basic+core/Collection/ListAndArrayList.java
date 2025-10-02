import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListAndArrayList {
    public static void main(String[] args) {

       List<Integer> ls = Collections.synchronizedList(new ArrayList<>()); // 👉 To Make ArrayList Synchronized and
                                                                            Thread Safe
        List<Integer> ls = new ArrayList();
        ArrayList<Integer> ls = new ArrayList<Integer>();

        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(3, 35);
        ls.clear(); // clear() => to remove all elements from the list
        ls.add(45);
        ls.add(55);
        ls.add(50);
        ls.add(60);
        System.out.println(ls);
    }
}
