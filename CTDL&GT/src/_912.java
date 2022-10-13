import java.util.Arrays;
import java.util.PriorityQueue;

public class _912 {
    public static int[] sortArray(int[] nums) {

        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    static void merge(int[] arr, int l, int m, int r) {
        int n1 = m + 1 - l;
        int n2 = r - m;
        int[] left = new int[n1];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        int[] right = new int[n2];
        for (int i = 0; i < n2; i++) {
            right[i] = arr[m + 1 + i];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 || j < n2) {
            if (j == n2 || i < n1 && left[i] < right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }
    }

    static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int middle = (high - low) / 2 + low;
            mergeSort(arr, low, middle);
            mergeSort(arr, middle + 1, high);
            merge(arr, low, middle, high);
        }
    }






    public static int[] sortArrayaaa(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);

        }
//        System.out.println("pq : " + pq);
        System.out.println(pq);
        for(int i=0;i<nums.length;i++){
            ans[i]=pq.poll();
//            System.out.println( pq);

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0,8,5,4,2,1,3,4};
        System.out.println(Arrays.toString(sortArray(nums)));
        System.out.println(Arrays.toString(sortArrayaaa(nums)));
    }
}