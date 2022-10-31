public class _35Leadcode {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int hight = nums.length - 1;
        int mid = (low + hight) / 2;

        while (low < hight){
            if(nums[mid] == target){
                return mid;
            }else if (nums[mid] > target){
                hight = mid - 1;
            }else {
                low = mid +1;
            }
        }
        return low;
    }
}
