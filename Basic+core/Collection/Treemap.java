import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;


public class Treemap {

    public static void main(String[] args) {


        Map<Integer, String> tmap = new TreeMap<>(); // Sorted Ascending Order
                                                     // No Duplicate keys

        tmap.put(6, "Milk");
        tmap.put(2, "Potato");
        tmap.put(5, "Cabbage");
        tmap.put(1, "Tomato");
        tmap.put(3, "Carrot");
        tmap.put(7, "Cauliflower");
        
        System.out.println("List of TreeMap Elements are : " + tmap);
    }
}
