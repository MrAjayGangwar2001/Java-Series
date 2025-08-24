import java.util.ArrayList;
import java.util.List;

public class Multi_dimen {
    public static void main(String[] args) {
        /*
         * int arr[][] = new int [3][4];
         * 
         * for (int i = 0; i <3; i++) {
         * for (int j = 0; j <4; j++) {
         * arr[i][j] = (int)(Math.random()*10);
         * }
         * }
         * for (int i = 0; i <3; i++) {
         * for (int j = 0; j <4; j++) {
         * System.out.print(arr[i][j] +" ");
         * }
         * System.out.println();
         * }
         * 
         * // Now we will try enhanced for loop that work like upper for loop
         * for(int a[] : arr)
         * {
         * for(int b : a){
         * System.out.print(b +" ");
         * }
         * System.out.println();
         * }
         */

        // int jagarr[][] = new int[3][]; // jagged Array(custom nested Array Size)
        // jagarr[0] = new int[4];
        // jagarr[1] = new int[3];
        // jagarr[2] = new int[5];

        // for (int i = 0; i < jagarr.length; i++) {
        //     for (int j = 0; j < jagarr[i].length; j++) {
        //         jagarr[i][j] = (int) (Math.random() * 10);
        //     }
        // }

        // for (int a[] : jagarr) {
        //     for (int b : a) {
        //         System.out.print(b + " ");
        //     }
        //     System.out.println();
        // }

        System.out.println("We will try Another custom Array :- ");

        int csarr[][] = new int[4][];

        // Now we will assign size to each row------>  Initializes each row with different lengths:
        csarr[0] = new int[2];
        csarr[1] = new int[3];
        csarr[2] = new int[5];
        csarr[3] = new int[6];
        // output😂😎😂😎😂😎😂😎😎😎😎
       // 9 5  
      //  1 1 4
      //  4 7 9 1 1
      //  0 1 6 3 4 1

        for(int i=0; i<csarr.length; i++)
        {
            for(int j=0; j< csarr[i].length; j++)
            {

                csarr[i][j] = (int) (Math.random() * 10);
            }
            
        }

        // Enhanced for loop
        for(int a[] : csarr)
        {
            for(int b : a)
            {
                System.out.print(b+ " ");
            }
            System.out.println();
        }
        System.out.println("2D Array by using collection framwork -- List and ArrayList");
        List<int[]> csarr1 = new ArrayList<>();             // by using collection Framwork
        csarr1.add(new int[4]);
        csarr1.add(new int[4]);
        csarr1.add(new int[4]);
        csarr1.add(new int[5]);

        for (int i = 0; i < csarr1.size(); i++) {
            for (int j = 0; j < csarr1.get(i).length; j++) {
                
                csarr1.get(i)[j] = (int)(Math.random()*10);
            }
        }
        for (int[] a : csarr1) {
            for(int b : a)
            {
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}