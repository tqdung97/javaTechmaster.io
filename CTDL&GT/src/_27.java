import java.util.Arrays;

public class _27 {
    public int removeElement(int[] nums, int val) {
        int left = 0, right = nums.length-1;
        while(left <= right){
            if(nums[right]==val){
                right--;

            }else if(nums[left]==val){
                int temp = nums[left];
                nums[left]=nums[right];
                nums[right] = temp;
            }else{
                left++;
            }

        }
        return right +1;
    }

    public static void main(String[] args) {

        _27 a = new _27();
       int nums [] = {3,2,2,3};
        System.out.println(a.removeElement(nums,3));
    }
}

