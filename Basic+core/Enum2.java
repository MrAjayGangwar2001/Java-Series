
enum Laptop{
    Macbook(90000), HP(70000) , Dell(60000) , Lenovo(50000);

    private int price;

    private Laptop(int price){
        this.price = price;
        
    }
    public int  getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
         
    };
}

public class Enum2 {
    public static void main(String[] args) {
        // Laptop lap = Laptop.Lenovo;
        // System.out.println(lap+ " : " +lap.getPrice());

        for(Laptop lap : Laptop.values())
        {
            System.out.println(lap+ " : " +lap.getPrice());
        }
    }
}
