//Lamda expression part 3


@FunctionalInterface
interface Aj{
    int add(int x,int y);
}

public class Lamda_Expression3 {
    public static void main(String[] args) {
        /// BASIC AND OLD METHOD 🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️
        
        // Aj obj = new Aj()
        // {
        //     public int add(int x, int y)
        //     {
        //         return x+y;
        //     }
        // };
        // int sum = obj.add(6,9);
        // System.out.println(sum);

        // BY Lambda Expression METHOD 😎😎😎😎👍👍👍👍
        Aj obj = (x,y) ->        // if we return Something then return will write within the bracket otherwise we can write without brackets or one line
        {
            return x+y;
        };
        int sum = obj.add(6,9);
        System.out.println(sum);
    }
}
