package RelativeSortArray;

import java.util.Arrays;

public class _1122 {
    public static void main(String[] args) {
        int arr1[] = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int arr2[] = {2, 1, 4, 3, 9, 6};
        int arr[] = relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(arr));
    }

//        public static int[] relativeSortArray(int[] arr1, int[] arr2) {
//        int x = 0;
//         for(int i = 0; i < arr1.length; i++){
//             for (int j = 0; j < arr2.length; j++){
//                 if(arr1[i]==arr2[j]){
//                     int temp = arr1[i];
//                     arr1[i]= arr2[j];
//                     arr2[j] = temp;
//                     x++;
//                 }
//             }
//         }
//        sort(arr1, x , arr1.length-1);
//        return arr1;
//    }
//    public static void sort(int[]arr,int low, int high){
//        int x = low;
//        int y = high;
//        if(x >= y){
//            return;
//        }
//        int m =(x-y) / 2 + x;
//        int pivot = arr[m];
//        while (x <= y){
//            while (arr[x] < pivot){
//                x++;
//            }
//            while (arr[y] > pivot){
//                y--;
//            }
//            if(x<=y){
//                int temp = arr[x];
//                arr[x] = arr[y];
//                arr[y] = temp;
//                x++;
//                y--;
//            }
//        }
//        sort(arr, low, y);
//        sort(arr, x, high);
//    }
    public static int [] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for (int n : arr1){
            count[n]++;
        }
        int i = 0;
        for (int n : arr2) {
            while (count[n]-- > 0) {
                arr1[i++] = n;
            }
        }
        for (int n = 0; n < count.length; n++) {
            while (count[n]-- > 0) {
                arr1[i++] = n;
            }
        }
        return arr1;
    }
}
