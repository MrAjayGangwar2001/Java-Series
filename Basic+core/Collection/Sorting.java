
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students {

    String name;
    int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Students Name:- " + name + " and Age:- " + age;
    }

}

public class Sorting {

    public static void main(String[] args) {
        
        // We are sorting numsList values basis on second or last digit like index 1
        Comparator<Integer> com = new Comparator<Integer>()
        {
            public int compare(Integer i , Integer j)
            {
                if (i%10 > j%10) {
                    return 1;             //  return 1 means it swap nums on condition
                }
                else {
                    return -1;            // return -1 means it don't swap nums on condition
                }
            }
        };
        
        List<Integer> numsList = new ArrayList<>();
        numsList.add(51);
        numsList.add(65);
        numsList.add(79);
        numsList.add(93);
        numsList.add(37);
        numsList.add(46);
        numsList.add(52);

        Collections.sort(numsList);
        Collections.sort(numsList, com);

        System.out.println(numsList);  */

        // Now we starts Students class and sorting of students basis on age
        // 
            Comparator<Students> com = new Comparator<Students>()  /// Comaprator is a Functional Interface
          {
                public int compare(Students i , Students j)
                {
                    if (i.age > j.age) {
                        return 1;             //  return 1 means it swap nums on condition
                    }
                    else {
                        return -1;            // return -1 means it don't swap nums on condition
                    }
                }
            }; 
        

    }
}
