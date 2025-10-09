import java.util.HashSet;
import java.util.Set;

// HashSet Provide the set of all possible values of the given expression.
// HashSet Provide The Unique(No Duplicate) value But Not Sorted value of the given expression.
// HashSet Provide The Fastest way to check the existence of a value in the set.
// It can Store Negative Value also.

public class SetHashSet {
    public static void main(String[] args) {
        

      //  Set<Integer> st = new HashSet<Integer>();

      
      //   st.add(5);
      //   st.add(1);
      //   st.add(2);
      //   st.add(3);
      //   st.add(5);
      //   st.add(4);
      //   st.add(0);
      //   st.add(56);
      //   st.add(7);
      //   st.add(28);
      //   st.add(9);
      //   st.add(30);
      
      //   st.add(-10);
      
      
      //  System.out.println(st);


      Set<String> Shop = new HashSet<>();


        Shop.add("Car");
        Shop.add("bike");
        Shop.add("Car");
        Shop.add("bike");
        Shop.add("Car");

        Shop.add("bike");
        Shop.add("Car");
        Shop.add("bike");
        Shop.add("super Man");

        System.out.println(Shop);

    }
}
