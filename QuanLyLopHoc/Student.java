package QuanLyLopHoc;

import java.time.LocalDate;
// Viết class Student kế thừa từ class User, có các thuộc tính riêng sau:

// isOnline ( học trực tuyến hay ko)
// background (String) ( ví dụ: đang đi làm, đang đi học)
// Viết hàm khởi tạo cho class Teacher và Student trong đó gọi constructor của class User.

public class Student extends User {

    public Student(String id, String name, GENDER gender, String birtday, String email, String phoneNumber) {
        super(id, name, gender, birtday, email, phoneNumber);
        // TODO Auto-generated constructor stub
    }

    public boolean isOnline;
    public String background;

    public Student(String id, String name, GENDER gender, String birtday, String email, String phoneNumber,
            boolean isOnline, String background) {
        super(id, name, gender, birtday, email, phoneNumber);
        this.isOnline = isOnline;
        this.background = background;
    }

    @Override
    public
    void printInfor() {
        // TODO Auto-generated method stub
        super.printInfor();
        System.out.print("learnOnline:  " + isOnline);
        System.out.println("Background: " + background);
    }

}
