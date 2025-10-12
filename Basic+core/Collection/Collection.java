
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

import java.util.Collection;

// -------------   Array List
// We use type <Integer> and it's provide us type of the list and also compile time error
//  we can not add numbers in string type  like ("67") for this we have to add List instead of Collection

public class Collection {

    public static void main(String[] args) {

        // List<Integer> num = new ArrayList<Integer>(); // list Support Repeated Value

        Set<Integer> num = new HashSet<Integer>();    //  list Extends Set And Set Does not Support Repeated Value
        // but Set not Provide Sorted Values and also not Provide Index


        num.add(36);
        num.add(50);
        num.add(18);
        num.add(12);
        num.add(45);
        num.add(50);
        num.add(78);
        num.add("90"); // To add this in Array we Used List also List support Index Value

        System.out.println(num.indexOf(12));
        System.out.println(num.get(5));
        System.out.println(num);

        for (Object n : num) {
            int nums = (Integer) n;
            System.out.println(nums);
        }
    }
}
