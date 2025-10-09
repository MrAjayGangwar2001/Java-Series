import java.util.HashSet;
import java.util.Set;

/
public class SetHashSet {
    public static void main(String[] args) {
        

       Set<Integer> st = new HashSet<Integer>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(5);
        st.add(4);
        st.add(0);
        st.add(56);
        st.add(7);

       System.out.println(st);
    }
}
