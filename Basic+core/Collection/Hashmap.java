import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();          // No Duplicate Keys & No Order and containe null at once

        map.put(20, "Dog");
        map.put(1, "Cat");
        map.put(3, "Bird");
        map.put(8, "Fish");
        map.put(66, "Elephant");
        map.put(7, "Monkey");
        map.put(4, "Lion");
        map.put(5, "Tiger");
        map.put(null, "Null");

        System.out.println("HashMap Elements Are : " + map);

        System.out.println("HashMap Size : " + map.size());
        System.out.println("All Keys are : " + map.keySet());
        System.out.println("All Values are : " + map.values());
        System.out.println("All Entries are : " + map.entrySet());
        System.out.println("HashMap Contains Key 20 : " + map.containsKey(20));
        System.out.println("HashMap Contains Value Cat : " + map.containsValue("Cat"));
    }
}
