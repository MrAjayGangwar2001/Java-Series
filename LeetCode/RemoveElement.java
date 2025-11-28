package LeetCode;

// Remove Specific Element from an Array
// Return Array Size After Removing Element
public class RemoveElement{
    public static int main(int[] args) {
        int arr[] = {1,2,3,5,6,3,7,8,3,9,3,10};

        int size = arr.length;
        int target = 3;

        for (int i = 0; i <=size;) {
            // for (int j = i + 1; j <=size; j++) {
                
                if (arr[i] == target) {
                    arr[i] = arr[i + 1];
                    arr[size -1] = 0;
                    size--;
                }else{
                    i++;
                }
            // }
        }



        return size;
    }
}
