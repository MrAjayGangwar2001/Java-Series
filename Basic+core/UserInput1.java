import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput1 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        System.out.println("Enter Any Number :- ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf= new BufferedReader(isr);

        int n = Integer.parseInt(bf.readLine());
        System.out.println(n);
        bf.close();                // to close the Resources------------it will run in background
    }
}
