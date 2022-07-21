import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class BaiTapBuoi1 {
    public static void main(String[] args) {
        // Bài Tập 1
        int i = 10;
        System.out.println(i);

        int n = i++ % 5;
        System.out.println(n);

        int iInt = ++i;
        System.out.println(iInt);
        int nInt = iInt % 5;
        System.out.println(nInt);

        
        // Bài Tập 2
        double soDoC;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so do C can doi: ");
        soDoC = sc.nextDouble();
        double soDoF = (double) 9 / 5 * soDoC + 32;
        System.out.println(soDoC + " doC = " + soDoF + " doF");

        // bài tập 3
        double d = 9 / 5;
        System.out.println(d);
        double dDouble = (double) 9 / 5;
        System.out.println(dDouble);


        //Bài tập 4
         
        int x = 1221;
        boolean check = true;
        System.out.println(x);
        if(x>0){
            check = true;
        }else check = false;
        int y = 3;
        System.out.println(y);

        System.out.println("Dk1:" + check) ;
        if(x % y == 0){
            check = true;
        }else check = false;
        System.out.println("Dk2:" + check );
        if( 2 <= x && x <=15){
            check = true;
        }else check =false;
        System.out.println("Dk3:" + check);
        if ( x - y < 5){
            check = true;
        }else check = false;
        System.out.println("Dk4:" + check);
        if ( x > 30 && x < 10){
            check = true;
        }else check = false;
        System.out.println("Dk5:" + check);
        if ( x / 1000 >= 1){
            check = true;
        }else check = false;
        System.out.println("Dk6:" + check);
        if ( x / 100000 > 1  && x / 100000 < 9){
            check = true;
        }else check = false;
        System.out.println("Dk6:" + check);

        }
    }

