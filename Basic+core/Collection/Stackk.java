import java.util.Stack;

public class Stackk {
    public static void main(String[] args) {

        Stack<Integer> sk = new Stack<>();

        sk.add(101); {
        sk.add(102); // These Methods are deprecated OR
        sk.add(103); // It is Valid Because
        sk.add(104); // Vector Extends Stack So
        sk.add(106); // It have All VEctor Properties
        sk.add(107); // But Recommendation is uSe push and pop }
        sk.add(108);
        sk.add(4, 105); // To add element at specific position

        sk.push(11);
        sk.push(12);
        sk.push(13);
        
        System.out.println(sk);
    }
}
