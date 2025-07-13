
class AjayException extends Exception {
    public AjayException(String message) {
        super(message);
    }
}

public class Ex2 {
    public static void main(String[] args) {

        int a = 34;
        int b = 56;
        int c;

        try {
            c = a / b;
            if (c == 0)
                throw new AjayException("Somthing happened wrong");
        } catch (AjayException e) {
            c = a / 1;
            System.out.println("might be you are dividing by zero " + e);
        }
        ;
    }
}
