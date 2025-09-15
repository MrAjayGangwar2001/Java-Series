// In This Program Code We will se What is Annotation in Java
class PCM {
    public void UGkebaadsakopaisakamanahai() {
        System.out.println("Physics , Chemistry , Math");
    }
}

class ZBC extends PCM {

    @Override                       //  This(Override) is Annotation in Java     
    // This is a type of Annotation to specify the Method types so it can check it during compile time
    public void UGkebaadsakopaisakamanahai() {
        System.out.println("Zology , Botany , Chemistry");
    }
}

public class Annotation {
    public static void main(String[] args) {
        ZBC paisa = new ZBC();
        paisa.UGkebaadsakopaisakamanahai();     // Here the ZBC Method will run becoz PCM method is Override
    }
}
