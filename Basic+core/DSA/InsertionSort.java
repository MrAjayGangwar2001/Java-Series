// we use Shifting Method not swapping🚫 to sort an array
//  We start from second element and we assume first element is already sorted
// We compare second value from first(previous) element and swap them by storing them(second ele.) in a temporary variable
public class InsertionSort {
    public static void main(String[] args) {
        
        int arr[] = {45, 2, 56, 4, 8, 67,7};
        int size = arr.length;

        System.out.println("Before Sorting : ");
        for (int num : arr) {
            System.out.print(num+ " ");
        }

        for (int i = 0; i < size; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        System.out.println();
        System.out.println("After Sorting : ");
        for (int num : arr) {
            System.out.print(num+ " ");
        }

    }
}
