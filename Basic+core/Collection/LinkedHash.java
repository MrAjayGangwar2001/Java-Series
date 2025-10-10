import java.util.LinkedHashSet;

// It Eliminate the duplicate value from the set


public class LinkedHash {
    public static void main(String[] args) {
        

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(10);
        lhs.add(20);
        lhs.add(50);
        lhs.add(20);
        lhs.add(100);
        lhs.add(500);
        lhs.add(80);

        System.out.println(lhs);

    }
}
