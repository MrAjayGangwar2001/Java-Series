
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

import java.util.Collection;


public class Collection {

    public static void main(String[] args) {

        List<Integer> num = new ArrayList<Integer>();    //  list Support Repeated Value
        
        num.add(36);
        num.add(50);
        num.add(18);
        num.add(12);
        num.add(45);
        num.add(50);
        num.add(78);
        num.add("90");                              // To add this in Array we Used List also List support Index Value

        System.out.println(num.indexOf(12));
        System.out.println(num.get(5));
        System.out.println(num);
        
       
    }
}
