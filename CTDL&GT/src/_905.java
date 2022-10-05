import java.util.Arrays;

public class _905 {
    public static int[] sortArrayByParity(int[] nums) {
        int[]arr = new int[nums.length];
        int k =0;
        for(int i : nums){
            if( i % 2 == 0){
                arr[k] = i;
                k++;
            }
        }
        for(int i : nums){
            if( i % 2 == 1){
                arr[k] = i;
                k++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
       int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
}
