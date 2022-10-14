package src;
/*
* Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.
*
* Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
* */
public class _1512_NumberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int k = 0;

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length;j++){
                if (nums[i] == nums[j] && i<j){
                    k++;
                }
            }
        } return k;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
}