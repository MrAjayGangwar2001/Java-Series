//  Encapsulation means wrapping data (variables) and methods (functions) together into a single unit,
//  and hiding internal details from outside access

class Boy{
    // private String Name = "Ajay_Gangwar";
    // private int Age = 24;
    //      OR
    private String Name;
    private int Age;

    public Boy() {
        
    }

    public Boy(int Age, String Name) {
        this.Age = Age;
        this.Name = Name;
    }

    public void setName(String n) {
        Name = n;
    }
    public String getName()
    {
        return Name;
    }
    public void setAge(int a)
    {
        Age = a;
    }
    public int getAge()
    {
        return Age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Boy aj = new Boy();
        Boy aj1 = new Boy(25 , "Ram");
        aj.setName("Ajay_Gangwar");
        aj.setAge(24);
        System.out.println(aj.getName()+ " : " + aj.getAge());
        System.out.println(aj1.getName()+ " : " + aj1.getAge());
    }
}
