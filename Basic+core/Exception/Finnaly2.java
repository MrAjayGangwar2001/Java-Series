
import java.io.BufferedReader;
import java.io.IOException;

public class Finnaly2 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        int a = 10;


        /* 

        WAY 1 TO CLOSE RESOURCES


        BufferedReader br = null;
        try
        {
            //InputStreamReader brs = new InputStreamReader(System.in);   // instead of this line below the line
            //InputStreamReader brs =     
           // BufferedReader br = new BufferedReader(brs);    /// instead of this line below the line
            br = new BufferedReader(new InputStreamReader(System.in));

            a = Integer.parseInt(br.readLine());
            System.out.println("a-1");
            System.out.println("It's Done");

        }
        finally
        { 
            br.close();
        }
            */


            //   WAT 2 TO CLOSE ( IT WILL AUTOCLOSE )
            // THIS WAY IS NOT REQUIRED FINALLY BLOCK

            Try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
            {
                a = Integer.parseInt(br.readLine());
                System.out.println(a);
            }
    }
}
