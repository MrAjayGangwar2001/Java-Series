
//  Basicly Finally Block is used for Two Purpose
// 1 . To Execute the Finally Statement After the Exception 
// 2 . To Close the Resources ex. in BufferReader Method we use to close the method 
//  Second method/Usecase we will se in next part that name is Finnaly2.java

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
