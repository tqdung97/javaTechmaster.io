import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import javax.print.attribute.standard.NumberUp;
import javax.xml.transform.Templates;

import javafx.scene.control.CheckBox;

public class HomeWork3 {

    
    /**
     * @param args
     */
    public static void main(String[] args) {


        // Bài 1
        System.out.println("----Bai 1-----");

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot so bat ky :");
        int Number = sc.nextInt();
        if (Number > 0) {
        System.out.println(Number + " la so nguyen duong");
        System.out.println("Tinh Tong 1 => Number: " + (Number * ++Number) / 2);
        } else {
        System.out.println(Number + " khong phai so nguyen duong");
        }
        // // Bai tap 2
        System.out.println("----Bai 2-----");

        int Cout = 0;
        int Total = 0;
        int num = 2;
        while (Cout <= 100) {

        if (num == 2) {
        Total = 2;
        }
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
        int temp = num % i;
        if (temp == 0) {
        isPrime = false;
        break;
        }
        }
        if (isPrime == true) {
        Total = Total + num;
        Cout++;
        }
        num++;
        }
        System.out.println(" Tong 100 so nguyen to dau tien la: " + Total);

        //  // Bai 3
         System.out.println("----Bai 3-----");

        int positiveNumber = 0;
        int difitSum = 0;
        System.out.println("Nhap 1 so bat ky : ");
        positiveNumber = sc.nextInt();
        while(positiveNumber > 0){
        int lastDigit = positiveNumber % 10;
        positiveNumber = positiveNumber / 10;
        difitSum = difitSum + lastDigit;
        }
        System.out.println( "Tong so nguyen vua nhap la : " + difitSum);

        // // Bai 4
        System.out.println("----Bai 4-----");

        for(int i = 2; i <= 9; i++){
        for(int a = 1; a <= 10; a++){
        System.out.println( i + "x" + a + "=" + (i*a));
        }
        System.out.println("------");
        }

        // Bai 5
        System.out.println("----Bai 5-----");
        
        System.out.println( "Enter Text 1 :");
        String text = sc.nextLine();        
        int textReverse = text.length();
        while(textReverse > 0){
            System.out.print(text.charAt(textReverse -1));
            textReverse--;
        }
        System.out.println();

        // Bai 6
        System.out.println("----Bai 6-----");

        System.out.println("Input Text :");
        boolean Check = true;
        String say = sc.nextLine();
        for(int i = 0; i < say.length(); i++){
            if(Check){
                System.out.print(say.toUpperCase().charAt(i));
            }else
            {System.out.print(say.charAt(i));}
            Check = false;
           if(say.charAt(i) == ' '){
            Check = true; 
           }
        }
        // Bai 7
        System.out.println("----Bai 7-----");
        int Second, Minute, Hours;
        System.out.println(" Enter the number Second:");
        int n = sc.nextInt();
        if(n>0){
            Hours = n / 3600;
            Minute = n % 3600 / 60;
            Second = n % 3600 % 60;
            System.out.printf("Sau khi doi tu %d giay: %d:%d:%d",n,Hours,Minute,Second);

        }else{
            System.out.println(false);
        }        

    }

}