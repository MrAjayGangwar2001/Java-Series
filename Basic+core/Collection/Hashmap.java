import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();          // No Duplicate Keys & No Order and containe null at once

        map.put(20, "Dog");
        map.put(1, "Cat");
        map.put(3, "Bird");
        map.put(8, "Fish");
       
        System.out.println("HashMap Contains Key 20 : " + map.containsKey(20));
        System.out.println("HashMap Contains Value Cat : " + map.containsValue("Cat"));
    }
}
