import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class BaiTapBuoi1 {
    public static void main(String[] args) {
        // Bài Tập 1
        int i = 10;
        System.out.println("i = "+ i);

        int n = i++ % 5;
        System.out.println("n = "+ n);

        int iInt = ++i;
        System.out.println("++i = " + iInt);

        int nInt = iInt % 5;
        System.out.println("So du :" + nInt);

        
        // Bài Tập 2
        double soDoC;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so do C can doi: ");
        soDoC = sc.nextDouble();
        double soDoF = (double) 9 / 5 * soDoC + 32;
        System.out.println(soDoC + " doC = " + soDoF + " doF");

        // bài tập 3
        double d = 9 / 5;
        System.out.println("d = " + d);
        double dDouble = (double) 9 / 5;
        System.out.println("9 / 5 = " + dDouble);


        //Bài tập 4
         
        int x = 1221;
        int y = 3;
        System.out.println("y = " + y);
        System.out.println("x = " + x);


        boolean check; 
        
        if(x>0){
            check = true;
        }else check = false;
        System.out.println("Dk1: " + check) ;

        if(x % y == 0){
            check = true;
        }else check = false;
        System.out.println("Dk2: " + check );

        if( 2 <= x && x <=15){
            check = true;
        }else check =false;
        System.out.println("Dk3: " + check);

        if ( x - y < 5){
            check = true;
        }else check = false;
        System.out.println("Dk4: " + check);

        if ( x > 30 || x < 10){
            check = true;
        }else check = false;
        System.out.println("Dk5: " + check);

        if ( x / 1000 >= 1){
            check = true;
        }else check = false;
        System.out.println("Dk6: " + check);

        if ( x >=100000  && x <= 999999 ){
            check = true;
        }else check = false;
        System.out.println("Dk7:" + check);

        }
    }

