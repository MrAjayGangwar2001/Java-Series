import java.util.*;

public class LinkList {
    public static void main(String[] args) {

        List<Integer> ls = new LinkedList<Integer>();

        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(3, 35);
        ls.add(50);
        ls.add(45);
        ls.add(45);

        boolean bl = ls.isEmpty();
        System.out.println("Is list empty " + bl);

        System.out.println("List Of The Elements " + ls);

    }
}
