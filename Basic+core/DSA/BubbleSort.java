
public class BubbleSort {
    public static void main(String[] args) {

        int nums[] = { 4, 8, 34, 46, 67, 7, 96 };
        int temp = 0;

        System.out.println("Before Sorting : ");

        for (int num : nums) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < nums.length; i++) {
            // for (int j = 0; j < (nums.length)-1; j++) { // it is not optimised version
            for (int j = 0; j < (nums.length - i) - 1; j++) { // it is optimized version of bubble sort
                if (nums[j] > nums[j + 1]) {

                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            System.out.println();
            // System.out.println("Sorting Started : ");
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }

        System.out.println();
        System.out.println("After Sorting : ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
