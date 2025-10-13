import java.util.TreeSet;
import java.util.Comparator;
import java.util.Set;

// It Provides Sorted value in the set



public class Treeset {
    public static void main(String[] args) {

        // Value Align in Assending Order

        Set<Integer> ts = new TreeSet<>(new Comparator<>(){             // Using Comparator  ==> Ascending Order
            public int compare(Integer a, Integer b){
                return a-b;
            }
        });

        

        ts.add(10);
        ts.add(20);
        ts.add(50);
        ts.add(30);
        ts.add(40);
        ts.add(40);         // Duplicate value
        ts.add(100);
        ts.add(5);
        ts.add(5);         // Duplicate value

        ts.add(25);
        ts.add(15);       // Duplicate value
        ts.add(15);       // Duplicate value
        ts.add(15);


        System.out.println(ts);
    }
}
