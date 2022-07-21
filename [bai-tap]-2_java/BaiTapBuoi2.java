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

        String soSanh1 = ( numBer > randomNumber) ? "numBer > randomNumber" : "numBer < randomNumber"  ;
        String soSanh2 = (numBer == randomNumber) ? " numBer = randomNumber" :"numBer != randomNumber";
        System.out.println(soSanh1);
        System.out.println(soSanh2);

    }

}