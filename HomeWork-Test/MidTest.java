import java.text.BreakIterator;
import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class MidTest {
    // khai bao biến nhập từ bàn phím
    static Scanner initScanner() {
        Scanner sc = new Scanner(System.in);
        return sc;
    }

    // đóng scanner
    static void closeScanner(Scanner sc) {
        sc.close();
    }

    // bai tap 1:
    static void Bai1(Scanner sc) {
        // Viết chương trình thực hiện: In ra màn hình hình vuông *
        int longs, width; // chieu dai, chieu rong - nhap tu ban phim
        System.out.println("Nhap vao chieu dai :");
        longs = sc.nextInt();
        System.out.println("Nhap vao chieu rong");
        width = sc.nextInt();
        System.out.println("Running");

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < longs; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        // In ra màn hình hình tam giác *
        int hight; // chieu cao - nhap tu ban phim
        System.out.println("Nhap vao chieu cao cua hinh tam giac");
        hight = sc.nextInt();
        System.out.println("Running:");
        // tam giac can

        for (int i = 1; i <= hight; ++i) {
            for (int j = hight; j >= i; --j) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; ++j) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("---------------");
        // tam giac vuong

        for (int a = 1; a <= hight; ++a) {
            for (int b = 1; b <= a; b++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

    // bai tap 2:
    static void Bai2() {
        // Cho chuỗi sau: You only live once, but if you do it right, once is enough
        // Thực hiện:
        // * Đếm số từ trong chuỗi
        String textsString = "You only live once, but if you do it right, once is enough";
        String[] array = textsString.split(" ");
        int count = 0;
        int word = array.length;

        for (count = 0; count <= word;) {
            System.out.println("So tu co trong chuoi la : " + word);
            break;
        }
        System.out.println();
        // Đếm và in ra index của các ký tự o:
        for (int c = 0; c <= textsString.length(); c++) {
            if (textsString.charAt(c) == 'o') {
                count++;
                System.out.println(count + " :");
                System.out.println(" vi tri chu \"o\" " + c);

            }
        }
    }

    // Kiem tra so Nguyen To:
    static boolean isNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    // Bai tap 3
    static void Bai3() {
        // Viết chương trình sinh ra số ngẫu nhiên, kiểm tra số đó có là số nguyên tố
        // không.
        Random rd = new Random();
        int randomNumber = rd.nextInt();
        System.out.println(randomNumber);
        if (randomNumber < 2) {
            System.out.println(randomNumber + " -> la so nguyen am");
        }
        while (randomNumber >= 2)
            if (isNguyenTo(randomNumber)) {
                System.out.println(randomNumber + " la so nguyen to");
                break;

            } else {
                System.out.println(randomNumber + " khong phai la so nguyen to");
                break;
            }

    }

    // bai tap 4
    static void Bai4(Scanner sc) {

        // Viết chương trình thực hiện:
        // Liệt kê 10 số nguyên tố đầu tiên

        System.out.println("So nguyen to X ban can: ");
        int num = sc.nextInt();
        System.out.println("Liet ke: ");
        int i = 2;
        int count = 0;
        while (count < num) {
            if (isNguyenTo(i)) {
                System.out.println(" " + i);
                count++;

            }
            i++;
        }

        // Liệt kê sô nguyên tố nhỏ hơn 10

        System.out.println(" So nguyen to nho hon X ban vua nhap:");
        for (int j = 1; j <= num; j++) {
            if (isNguyenTo(j)) {
                System.out.print(j + " ");
            }
        }
    }

    // bai tap 5
    static void Bai5(Scanner sc){
        /*Tạo mảng 2 chiều với số dòng và cột nhập vào từ bàn phím. Thực hiện:

        Nhập các phần tử mảng

        In thông tin mảng ra màn hình

        Liệt kê các phần tử nằm trên đường chéo chính

        Tạo thêm 1 mảng hai chiều có cùng số dòng và số cột thực hiện cộng hai mảng với nhau
         */
        int m= 0,n = 0;
        System.out.print("Nhap so hang: m = ");
        m = sc.nextInt();
        System.out.print("Nhap so cot : n = ");
        n = sc.nextInt();
        // khai bao va khoi tao mang 2 chieu
        int array[][] = new int [m][n];
        System.out.println("Nhap gia tri cho tung phan tu trong mang: \n");
        for (int i = 0; i < m; i++ )
            for(int j = 0; j < n; j++){
                System.out.print("array ["+i+"] ["+j+"]= ");
                array[i][j] = sc.nextInt();
            }
            //hien thi mang, truy xuat cac phan tu
            System.out.println("Mang 2 chieu vua nhap la:");
            for(int c  = 0; c < m; c++){
                for(int d =0; d < n; d++){ 
                    System.out.print(array[c][d] + "  ");
                }
                System.out.print("\n");
            }
        

    }

    public static void main(String[] args) {
        Scanner sc = initScanner();
        Bai1(sc);
        Bai2();
        Bai3();
        Bai4(sc);
        Bai5(sc);
        closeScanner(sc);
    }
}
