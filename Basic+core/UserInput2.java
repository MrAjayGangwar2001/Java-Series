import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


//  Taking User Input By Scanner Class

public class UserInput2 {
    public static void main(String[] args) {


        System.out.println("Enter Any Number :- ");

        // InputStreamReader isr = new InputStreamReader(System.in);
        // BufferedReader bf= new BufferedReader(isr);

        // int n = Integer.parseInt(bf.readLine());
        // System.out.println(n);
        // bf.close();  

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
    }
}
