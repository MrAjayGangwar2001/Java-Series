// Stream API(Interface) 

// Streams Provides Lot of Methods Like filter , map, reduce, sorted, find, findIndex, forEach, some, every, etc.
// Once we print the stream it will be executed and it will be closed.again we can't Re-print the same value by the same stream.
// Streams Comes from Interface
//  In the Stream API Methods we Used Many Methods to Print List. We will See below :-
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_API {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(4, 5, 7, 10, 23, 50, 67);

        // Instead of these five(5) lines of code we can write or short code using Stream API that is below👇
        // Stream<Integer> st1 = num.stream();
        // Stream<Integer> st2 = st1.filter(n -> n%2==0);
        // Stream<Integer> st3 = st2.map(n -> n*2);
        // int  st4 = st3.reduce(0 ,(c,e) -> c+e);
        // System.out.println(st4);

        //👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇
        int result = num.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * 2)
            .reduce(0, (c, e) -> c + e);
            System.out.println(result);

            // we used sorted method and there are many method in Stream APIs
        // Stream<Integer> sorted = num.stream()
        //         //.filter(n -> n % 2 == 0)
        //         .map(n -> n*2)
        //         .sorted();
        // sorted.forEach(n -> System.out.println(n));
        

        //st3.forEach(n ->System.out.println(n));
        // st1.forEach(n ->System.out.println(n));     /// This will not print any value because stream is closed after first print.
        // num.forEach(n ->System.out.println(n));       // This is the for each method to print the list
        // for (int i = 0; i < num.size(); i++) {           //// Tis Is normal for Loop to print the list
        //     System.out.println(num.get(i));
        // }
        // System.out.println("------------------------------------------------");
        // 📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌
        // for (int n : num){               // This Is Enhanced For Loop to print the list
        //     System.out.println(n);
        // }
        //  📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌📌
        // int sum = 0;
        // for (int n : num) {
        //     if (n % 2 == 0) {
        //         n = n * 2;
        //         sum += n;
        //     }
        //     //System.out.println(n);
        // }
        // System.out.println(sum);
    }
}
