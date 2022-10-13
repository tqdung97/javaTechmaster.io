public class QuickSort {


    public static void main(String[] args) {
        int x = 120;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        int rem = 0;
        long rev = 0;
        while(x!=0){
            rem=x%10;
            x=x/10;
            rev=rev*10+rem;

        }

        if (rev > Math.pow(2,31)-1|| rev < -(Math.pow(2, 31))) {
            return 0;
        }
        int check=(int)rev;

        return check;

    }
}
