
//  Basicly Finally Block is used for Two Purpose

public class Finnaly1 {
    public static void main(String[] args) {
        

        int x = 23;
        int y = 3;

        try {
            int z = x/y;
            System.out.println(z);
        } 
        catch (Exception e)             // We can ignore this catch block if not needed . it not neccessary to use with try
        {
            System.out.println("Might be This is I/O Exception ");
        } 
        finally {
            System.out.println("Done! and It will Execute either Exception throus or Not");         // This(Finally) will Execute Either Exception Will happen or Not 
        }
    }
}
