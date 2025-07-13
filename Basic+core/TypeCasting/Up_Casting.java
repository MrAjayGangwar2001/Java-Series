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

public class Up_Casting {
    public static void main(String[] args) {
        Aa obj = (Aa) new Bb();   // UPCasting .....It goes Child object to Parent
        obj.show1();
    }
}
