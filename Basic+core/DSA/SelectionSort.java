// We use Swapping Technique to Sort the array
// Selection Sort Time Complexity is =  O(n^2)
// Selection Sort sort nums in ascending order
// In this Sort it suppose the first element is the largest and then we find the largest element in the rest of the array and swap it with the first element and then again find the largest then swap...

public class SelectionSort {
    public static void main(String[] args) {
        
        int nums[] = {10, 4, 16, 7, 19, 23, 17, 36, 13};
        int temp = 0;
        int minIdx = 0;

        System.out.println("Before Sorting : ");
        for (int num : nums) {
            System.out.print(num+ " ");
        }

        for (int i = 0; i < nums.length; i++) {
            minIdx = i;
            for (int j = i+1; j < (nums.length); j++) {

                if (nums[minIdx] > nums[j]) {
                    minIdx = j;
                }

            }
            temp = nums[minIdx];
            nums[minIdx] = nums[i];
            nums[i] = temp;


            System.out.println();
        for (int num : nums) {
            System.out.print(num+ " ");
        }

        }



        System.out.println();
        System.out.println("After Sorting : ");
        for (int num : nums) {
            System.out.print(num+ " ");
        }

    }
}
