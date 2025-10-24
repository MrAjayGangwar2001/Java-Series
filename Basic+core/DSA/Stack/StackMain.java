package Stack;

public class StackMain {
    public static void main(String[] args) {
      //  StackRunner nums = new StackRunner();
      DynamicStack nums = new DynamicStack();
        System.out.println("The Array is Empty : " + nums.isEmpty());
        nums.push(3);
        nums.push(7);
        nums.push(15);
        nums.push(23);

        System.out.println(nums.peek());

        nums.push(69);
        
        System.out.println("Size of stack: " + nums.size());
        
        System.out.println(nums.pop());
        
        System.out.println("The Array is Empty : " + nums.isEmpty());
        nums.show();
        nums.push(76);
        nums.show();
        System.out.println();
        nums.push(96);
        nums.push(101);
        nums.push(107);
        nums.push(111);
        nums.push(121);
        nums.push(123);
        nums.push(127);
        System.out.println("New Element with update Stack size is : ");
        nums.show();
    }
}
