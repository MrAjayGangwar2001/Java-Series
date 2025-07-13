
class PCM {
    public void UGkebaadsakopaisakamanahai()
    {
        System.out.println("Physics , Chemistry , Math");
    }
}

class ZBC extends PCM {

    @Override  //Annotation                                        // This is a type of Annotation to specify so it can check it during compile time
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
