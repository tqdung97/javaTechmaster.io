import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 8, 2, 4, 6, 4, 6, 9};
        int[] a = sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public static int[] sort(int[] arr, int iL, int iR) {
//        Điều kiện dừng

        if (iL == iR) {
            int[] singelElement = {arr[iL]};
            return singelElement;
        }
        // chia mảng
        int iM = (iL + iR) / 2;
        int[] arr1 = sort(arr, iL, iM);
        int[] arr2 = sort(arr, iM + 1, iR);

        //Gộp mảng
        int[] result = merge(arr1, arr2);
        return result;
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length + arr2.length;
        int[] result = new int[n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (k < n) {
            if (i < arr1.length && j < arr2.length) { //arr1 và arr2 k rỗng
                if (arr1[i] <= arr2[j]) {
                    result[k] = arr1[i];
                    i++;
                    k++;
                } else {
                    //arr2[j] < arr1[i]
                    result[k] = arr2[j];
                    j++;
                    k++;
                }
            } else {
                // arr1 hoặc arr2 rỗng
                if (i < arr1.length) {//arr1 ko rỗng, arr2 rỗng
                    result[k] = arr1[i];
                    i++;
                    k++;

                } else { // arr1 rỗng, arr2 k rỗng
                    result[k] = arr2[j];
                    i++;
                    k++;

                }
            }
        }
        return result;
    }
}