// Binary Search Takes less Step as Linear Search and  O(log n) time
// Binary Search is used when the data is sorted
// Binary Search is used in many applications like Google, Facebook, etc.
// Binary Search Big O notation===> O(log n)

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 11, 14, 17, 23};
        int target = 17;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("We Found an Element at Index : " + result);
        }else{
            System.out.println("Element Not Found");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int steps = 0; // To check the number of steps taken by the algorithm

        while (left <= right) {
            steps++;
            // int mid = left + (right - left) / 2;
            int mid = (left + right) / 2; // This is the correct way to calculate mid

            if (arr[mid] == target) {
                return mid;
            } 
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
            System.out.println("Steps are Taken By Algorithm : " +steps);
        }
        System.out.println("Steps are Taken By Algorithm : " +steps);
        return -1; // Element not found
    }
}
