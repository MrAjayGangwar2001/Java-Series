package LeetCode;

// Remove Specific Element from an Array
// Return Array Size After Removing Element
public class RemoveElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6, 3, 7, 8, 3, 9, 3, 10 };

        int size = arr.length;
        System.out.println(size);
        int target = 3;

        for (int i = 0; i < size;) {

            if (arr[i] == target) {
                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];

                }
                arr[size - 1] = 0;
                size--;
            } else {
                i++;
            }

            // System.out.print(i + " ");

        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("Size : " + size);
        // return size;
    }
}
