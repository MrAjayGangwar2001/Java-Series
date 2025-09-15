
class PCM {
    public void UGkebaadsakopaisakamanahai() {
        System.out.println("Physics , Chemistry , Math");
    }
}

class ZBC extends PCM {

    @Override                                //  This(Override) is Annotation in Java
    public void UGkebaadsakopaisakamanahai() {
        System.out.println("Zology , Botany , Chemistry");
    }
}

public class Annotation {
    public static void main(String[] args) {
        ZBC paisa = new ZBC();
        paisa.UGkebaadsakopaisakamanahai();
    }
}
