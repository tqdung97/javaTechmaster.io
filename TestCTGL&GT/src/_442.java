import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class _442 {

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) {
                list.add(nums[i]);
                ++i;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(nums));
    }
}
