import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class BaiTapBuoi2 {

    public static void main(String[] args) {
        int numBer;

        Scanner sc = new Scanner(System.in);
        System.out.println("Number: ");
        numBer = sc.nextInt();

       
        int randomNumber;
        Random rd = new Random();
        randomNumber = rd.nextInt(100)+1;
        System.out.println("RandomNumber: " + randomNumber );
        // toan tử ngôi ba ngôi

        String soSanh1 = ( numBer > randomNumber) ? "numBer > randomNumber" : "numBer < randomNumber"  ;
        String soSanh2 = (numBer == randomNumber) ? " numBer = randomNumber" :"numBer != randomNumber";
        System.out.println( "so sanh 1:" + soSanh1);
        System.out.println("so sanh 2: "+soSanh2);
        // so sánh c2
        System.out.println( numBer + " > " + randomNumber + " : " + ( numBer > randomNumber));
        System.out.println( numBer + " < " + randomNumber + " : " + ( numBer < randomNumber));
        System.out.println( numBer + " >= " + randomNumber + " : " + ( numBer >= randomNumber));
        System.out.println( numBer + " <= " + randomNumber + " : " + ( numBer <= randomNumber));
        System.out.println( numBer + " == " + randomNumber + " : " + ( numBer == randomNumber));
        System.out.println( numBer + " != " + randomNumber + " : " + ( numBer != randomNumber));
        System.out.println( " Ca 2 so la so chan :" + (numBer%2==0 && randomNumber%2==0));
        System.out.println( "Co it nhat 1 so chan :" + ( numBer%2==0 ||randomNumber%2==0));
        System.out.println( " Ca 2 so la so le :" + ( numBer%2>0 && randomNumber%2>0));
        System.out.println("------------");



    

    }

}