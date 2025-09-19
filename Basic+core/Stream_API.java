// Stream API(Interface) 

// Streams Provides Lot of Methods Like filter , map, reduce, sorted, find, findIndex, forEach, some, every, etc.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_API {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(4, 5, 7, 10, 23, 50, 67);

        

        //👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇👇
        int result = num.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * 2)
            .reduce(0, (c, e) -> c + e);
            System.out.println(result);

         
    }
}
