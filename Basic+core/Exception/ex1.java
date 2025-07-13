public class ex1 {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;
        String str = null;

        int arr[] = new int[6];
        try
        {
            int z = y / x;
            System.out.println(str.length());
            System.out.println(arr[2]);
            System.out.println(arr[7]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Can not divide by zero");
        }
        catch (NullPointerException e)
        {
            System.out.println("can not get length of Null String");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Be in your limit");
        }
        catch(Exception e)
        {
            System.out.println("something went wrong" +e);
        }
        System.out.println(y);
        System.out.println("GM");
    }
}
