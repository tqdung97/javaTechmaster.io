import java.util.Arrays;

public class _88 {


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        int length = (m + n) - 1;

        while (m - 1 >= 0 && n - 1 >= 0) {

            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[length--] = nums1[m - 1];
                m--;
            } else {
                nums1[length--] = nums2[n - 1];
                n--;
            }
        }
        while (m - 1 >= 0) {
            nums1[length--] = nums1[m - 1];
            m--;
        }

        while (n - 1 >= 0) {
            nums1[length--] = nums2[n - 1];
            n--;
        }
        System.out.println(Arrays.toString(nums1));

    }
}
