package HomeWork5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DataEmployee {
    private static String idInput;

    public static void main(String[] args) {
        Employee[] listEmployees = new Employee[10];
        listEmployees[0] = new Employee(
                "Hoang Dieu",
                "NV01",
                LocalDate.of(1995, 02, 10),
                5.0);
        listEmployees[0].gender = GENDER.MALE;

        listEmployees[1] = new Employee(
                "Phan Dinh Phung",
                "NV02",
                LocalDate.of(1997, 01, 10),
                8.0);
        listEmployees[1].gender = GENDER.MALE;

        listEmployees[2] = new Employee(
                "Tran Phu",
                "NV03",
                LocalDate.of(1992, 05, 20),
                6.0);
        listEmployees[2].gender = GENDER.MALE;

        listEmployees[3] = new Employee(
                "Nguyen Trai",
                "NV04",
                LocalDate.of(1982, 04, 11),
                7.5);
        listEmployees[3].gender = GENDER.MALE;

        listEmployees[4] = new Employee(
                "Hoang Hoai Thuong",
                "NV05",
                LocalDate.of(1989, 07, 25),
                10.6);
        listEmployees[4].gender = GENDER.FEMALE;

        listEmployees[5] = new Employee(
                "Hoang Quoc Viet",
                "NV06",
                LocalDate.of(1995, 10, 10),
                11.0);
        listEmployees[5].gender = GENDER.MALE;

        listEmployees[6] = new Employee(
                "Phan Boi Chau",
                "NV07",
                LocalDate.of(2002, 02, 12),
                8.3);
        listEmployees[6].gender = GENDER.FEMALE;

        listEmployees[7] = new Employee(
                "Tran Duy Hung",
                "NV08",
                LocalDate.of(1995, 8, 10),
                15.0);
        listEmployees[7].gender = GENDER.MALE;

        listEmployees[8] = new Employee(
                "Nguyen Khanh Toan",
                "NV09",
                LocalDate.of(1993, 9, 21),
                7.8);
        listEmployees[8].gender = GENDER.MALE;

        listEmployees[9] = new Employee(
                "Nguyen Xien",
                "NV10",
                LocalDate.of(1994, 06, 10),
                9.2);
        listEmployees[9].gender = GENDER.FEMALE;

        for (Employee name : listEmployees) {
            System.out.println("* " + name.Name);
        }

        // NHAP ID TU BAN PHIM DE LAY THONG TIN :
        Scanner sc = new Scanner(System.in);
        System.out.println("Input ID Employee(bat dau la NV, vd: NV01, NV02,..) :");
        idInput = sc.nextLine();
        for (int index = 0; index < listEmployees.length; index++) {
            Employee employee = listEmployees[index];
            if (employee.hasKeyword(idInput)) {
                System.out.println("Tim thay ID : " + employee.Id);
                System.out.println("Name : " + employee.Name);
                System.out.println("Sinh ngay : " + employee.dateOfBirth);
                System.out.println("Sex : " + employee.gender);
                System.out.println("Luong = " + employee.Salary + " TrVnd");
                break;

            } else {
                System.out.println("Nhap sai ID");
                break;
            }
        }

        // Liet ke danh sach nguoi tren 30 tuoi:
        System.out.println("Nhung nguoi co tuoi tren 30 la :");
        for (int i = 1; i < listEmployees.length; i++) {
            Employee employee = listEmployees[i];
            int Age = Period.between(employee.dateOfBirth, LocalDate.now()).getYears(); // tinh tuoi
            if (Age > 30) {
                System.out.println("- " + listEmployees[i].Name);
            }

        }

        // Kiem tra sinh nhat tu ngay sinh nhap tu ban phim
        System.out.println(" Nhap thang  :");
        int monthInput = sc.nextInt();
        for (int i = 0; i < listEmployees.length; i++) {

            if (listEmployees[i].dateOfBirth.getMonthValue() == (monthInput)) {
                System.out.println("Nhung nguoi sinh nhat trong thang vua nhap :" + listEmployees[i].Name);

            }

        }

        // DEM SO NHAN VIEN NAM NU:
        int j = 0;
        int k = 0;
        for (int i = 0; i < 10; i++) {
            if ((listEmployees[i].gender) == (GENDER.FEMALE)) {
                listEmployees[j] = listEmployees[i];
                j++;
            } else {
                listEmployees[k] = listEmployees[i];
                k++;
            }
        }
        System.out.println("So nhan vien nu la: " + j);
        if (k == 10) {
            System.out.println("Khong co nhan vien nu");
        }
        for (int i = 0; i < 10; i++) {

        }
        System.out.println("So nhan vien nam la: " + k);

        if (j == 10) {
            System.out.println("Khong co nhan vien nam");
        }

        // TOP 3 NGUOI CO MUC LUONG CAO NHAT

        //  Vẫn chưa hiểu lắm nên e đợi thầy giải
    }

}
