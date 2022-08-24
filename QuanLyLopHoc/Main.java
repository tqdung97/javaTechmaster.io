package QuanLyLopHoc;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    private static final String Input = null;

    public static void main(String[] args) {

        // Tạo 2 giáo viên
        // teacher khai báo thêm 2 attribute là yearOfexperiences và speciality of class
        // teacher
        Teacher[] listTeachers = new Teacher[2];
        listTeachers[0] = new Teacher("GV1", "Tao Thuy Quynh", GENDER.FEMALE, "12/12/1997",
                "thaothuyquynh@gmail.com", "0374858566", 3, "fontEnd");
        listTeachers[1] = new Teacher("GV2", "Nguyen Xuan Nam", GENDER.MALE, "15/10/1988",
                "nguyenxuannam@gmail.com", "0397774251", 11, "java");
        // Tạo 6 học sinh
        // new Studen khai báo têm 2 attribute là isOnline và background of class
        // student
        Student[] listStudent = new Student[6];
        listStudent[0] = new Student("HS1", "Trinh Quang Dung", GENDER.MALE, "23/01/1997",
                "tqdung2301197@gmail.com", "0135465493", false, "Student");
        listStudent[1] = new Student("HS2", "Le Van Luong", GENDER.MALE, "22/02/1995",
                "levanluong@gmail.com", "0364149113", true, "Working");
        listStudent[2] = new Student("HS3", "Nguyen Dang Thanh", GENDER.MALE, "12/11/1997",
                "nguyendangthanh@gmail.com", "0312451548", true, "Working");
        listStudent[3] = new Student("HS4", "Le Thi Hang", GENDER.FEMALE, "17/04/1997",
                "hangnga97@gmail.com", "0346759844", false, "Working");
        listStudent[4] = new Student("HS5", "Nguyen Thi Hanh", GENDER.FEMALE, "15/04/1999",
                "thihanh99@gmail.com", "0364144585", true, "Working");
        listStudent[5] = new Student("HS6", "Nguyen Van Vuong", GENDER.MALE, "15/07/1993",
                "vanvuong93@gmail.com", "1245753254", true, "Student");

        // Chỉ dùng 1 mảng để lưu các đối tượng trên
        User[] listUsers = new User[8];
         listUsers [0] = listStudent[0];
         listUsers [1] = listStudent[1];
         listUsers [2] = listStudent[2];
         listUsers [3] = listStudent[3];
         listUsers [4] = listStudent[4];
         listUsers [5] = listStudent[5];
         listUsers [6] = listTeachers [0];
         listUsers [7] = listTeachers [1];
        //Duyệt mảng và in ra thông tin học sinh, bao giáo viên ( sử dụng printInfo ở trên)
         for( User us : listUsers){
            us.printInfor();
         }
    }
}
