
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
        

        List<Students> numsList = new ArrayList<>();
        numsList.add(new Students("Rahul", 21));
        numsList.add(new Students("Prahlad", 24));
        numsList.add(new Students("Rohan", 13));
        numsList.add(new Students("Kuldeep", 25));
        numsList.add(new Students("Mohit", 27));

        System.out.println(numsList);

        Collections.sort(numsList, com);

        for (Students stud : numsList) {
            System.out.println(stud);
        }

    }
}
