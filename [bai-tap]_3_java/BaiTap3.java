import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        System.out.println("------------------------Bai 1-----------------------------");

        // Bai 1 : Sửa biến letter
        String letter = "Duoi day la cau noi noi tieng, \n \t \"A journey of a thousand miles begins with a single step\" \nNo co nghia la \n \t \"Hanh trinh ngan dam bat dau tu mot buoc chan\" \nChuc cac ban thanh cong !!! ";
        System.out.println(letter);

        // Bai 2 :
        System.out.println("------------------------------Bai 2-------------------------");

        double distant = 0.0;
        String startTimeStr = "";
        String finishTimeStr = "";
        Scanner scanner = new Scanner(System.in);
        // nhập khoảng cách từ bàn phím, gán vào biến distant
        System.out.print("Nhap vao khoang cach: ");
        distant = scanner.nextDouble();
        scanner.nextLine();

        // nhập thời gian bắt đầu, gán vào biên startTimeStr
        System.out.print("Nhap vao thoi gian bat dau: ");
        startTimeStr = scanner.nextLine();

        // nhập thời gian kết thúc, gán vào biến finishTimeStr
        System.out.print("Nhap vao thoi gian ket thuc: ");
        finishTimeStr = scanner.nextLine();

        scanner.close();

        // chuyển startTimeStr và finishTimeStr sang kiểu LocalDateTime

        LocalDateTime startTime = LocalDateTime.parse(startTimeStr);
        LocalDateTime finishTime = LocalDateTime.parse(finishTimeStr);

        Duration duration = Duration.between(startTime,finishTime);
        // Tính và in ra thời gian chạy của bạn
        System.out.printf("Thoi gian chay %s phut\n", duration.toMinutes());
        // Tính và in ra vận tốc trung bình của bạn (km/h)
        System.out.printf("Van toc trung binh %s km/h\n", distant / ((double)duration.toMinutes()/60));
    }
}
