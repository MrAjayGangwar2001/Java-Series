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
        tmap.put(8, "Brussels Sprouts");
        tmap.put(6, "Broccoli");
        tmap.put(1, "Tomato");
        tmap.put(3, "Carrot");
        tmap.put(4, "Beetroot");
        tmap.put(9, "Kale");
        tmap.put(5, "Spinach");
        tmap.put(10, "Cucumber");
        tmap.put(11, "Curd");

        
        System.out.println("Is Contain Key " + 6 + " : " + tmap.containsKey(6));
        System.out.println("Is Contain Value " + "Milk" + " : " +tmap.containsValue("Milk"));
        System.out.println("Is Empty : " + tmap.isEmpty());
        System.out.println("List of TreeMap Elements are : " + tmap);
    }
}
