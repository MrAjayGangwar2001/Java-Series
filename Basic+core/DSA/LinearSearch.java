public class LinearSearch {

    public static void main(String[] args) {

        int arr[] = { 1, 5, 8, 11, 14, 17, 23};
        int target = 17;
        int result = linearSearch(arr, target);

        if (result != -1) {
            System.out.println("We Found an Element at Index : " + result);
        } else {
            System.out.println("We Could not Found the Element !");
        }

    }

    public static int linearSearch(int[] arr, int target) {
        int steps = 0; // To check the number of steps taken by the algorithm
        for (int i = 0; i < arr.length; i++) {

            steps++;
            if (arr[i] == target) {
                System.out.println("Steps are Taken By Algorithm : " +steps);
                return i;
            }
        }
        System.out.println("Steps are Taken By Algorithm : " +steps);
        return -1;
    }

}