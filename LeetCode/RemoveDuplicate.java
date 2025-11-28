package LeetCode;

public class RemoveDuplicate {
    
    public static int main(int[] nums) {
        
        int size = nums.length;

        for(int i = 0; i<size; i++){
            for(int j = i+1; j< size;){
                if(nums[i] == nums[j]){
                    for(int k = j; k< size - 1; k++){
                        nums[k] = nums[k + 1];
                    }

                    nums[size - 1] = 0;
                    size--;
                }else{
                    j++;
                }
            }
        }

        // System.out.print(size+", nums = [");
        // for(int x : nums){
        // System.out.print(x+ ",");

        // }
        // System.out.print("]");
        return size;
    }
}
