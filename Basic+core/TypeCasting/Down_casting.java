
class Aa {
    public void show1() {
        System.out.println("show in A");
    }
}

class Bb extends Aa {
    public void show2() {
        System.out.println("show in b");
    }
}

public class Down_casting {
    public static void main(String[] args) {
        Aa obj = new Bb();
        obj.show1();


        Bb obj1 = (Bb) obj;    /// Down_Casting .....It goes Parent to Child object
        obj1.show2();
    }
}
