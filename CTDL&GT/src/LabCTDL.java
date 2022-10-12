import java.util.Arrays;

public class LabCTDL {
    // Thuật Toán Bubble Sort (nổi bọt)
//    public static int [] BubbleSort(int arr[])
//    {
//
//        int n = arr.length;
//        for (int i = 0; i < n ; i++)
//        {
//            for (int j = 0; j < n - i - 1; j++)
//            {
//                if(arr[j] > arr[j+1])
//                {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                }
//            }
//            System.out.println("lần lặp " + (i +1));
//            System.out.println(Arrays.toString(arr));
//        }
//        return arr;
//    }
//    public  static  int[] sortArray( int [] arr){
//        boolean sorted = false;
//        while (!sorted){
//            sorted = true;
//            for (int i = 0; i < arr.length -1; i++) {
//                if(arr[i] > arr[i+1]){
//                    int temp = arr [i];
//                    arr [i] = arr [i +1];
//                    arr [i+1] = temp;
//                    sorted = false;
//                }
//            }
//        }
//        return arr;
//    }
    // thuật toán InsertionSort (thuật toán chèn)
//    public static int [] insertionSort(int[] arr){
//        int n = arr.length;
//        for (int i = 1; i < n; i++) {
//            int key = arr[i];
//            int j = i -1;
//            while (j >= 0 && arr[j] > key){
//                arr[j+1] = arr [i];
//                j--;
//            }
//            arr[j+1] = key;
//        }
//        return arr;
//    }
    // thuật toán Selection Sort ( sắp xếp chọn)
    public static int[] selectionSort(int[]arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            // tìm index của phần tử nhỏ nhât
            for (int j = i +1; j < n; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            // đổi vị trí
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
        return arr;
    }
//    796 trong leadcode
    public  boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;

        int firstCharIndexInGoal = -1;

        for(int i=0;i<goal.length();i++){
            if(s.charAt(0)==goal.charAt(i)){
                firstCharIndexInGoal = i;
                char ch[] = goal.toCharArray();
                if(isFeasible(ch,s,goal,firstCharIndexInGoal)){
                    return true;
                }
            }
        }

        if(firstCharIndexInGoal==-1) return false;

        return false;
    }

    public boolean isFeasible(char ch[],String s,String goal,int firstCharIndexInGoal){
        reverse(ch,0,firstCharIndexInGoal-1);
        reverse(ch,firstCharIndexInGoal,goal.length()-1);
        reverse(ch,0,goal.length()-1);

        String newString = new String(ch);
        return s.equals(newString);
    }


    public void reverse(char ch[],int i,int j){
        while(i<j){
            char c = ch[i];
            ch[i] = ch[j];
            ch[j] = c;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1,5,8,7,6,4};
//        System.out.println(Arrays.toString(BubbleSort(arr)));
//        System.out.println(Arrays.toString(sortArray(arr)));
//        System.out.println(Arrays.toString(insertionSort(arr)));
//        System.out.println(Arrays.toString(selectionSort(arr)));

    }
}

