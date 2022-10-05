import java.util.Arrays;

public class _283 {
    public static int[] moveZeroes(int[] nums) {

        int[] arr = new int [nums.length];
        int a = 0 ;
        for(int i : nums){
            if(i != 0){
                arr[a] = i;
                a++;
            }
        }
        for(int j = 0 ; j < arr.length ; j++){
            nums[j] = arr[j];
        }
        return nums;
    }

    public static void main(String[] args) {
        int []nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
}
