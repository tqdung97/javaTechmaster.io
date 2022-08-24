package QuanLyLopHoc;

import java.time.LocalDate;
// Viết class Teacher kế thừa từ class User, có các thuộc tính sau:

// yearOfExperiences (int)
// speciality (String) (chuyên môn, ví dụ java front-end, design… )
// Viết hàm khởi tạo cho class Teacher và Student trong đó gọi constructor của class User.
public class Teacher extends User {

    public Teacher(String id, String name, GENDER gender, String birtday, String email, String phoneNumber) {
        super(id, name, gender, birtday, email, phoneNumber);
        // TODO Auto-generated constructor stub
    }

    public int yearOfExperiences;
    public String speciality;

    public Teacher(String id, String name, GENDER gender, String birtday, String email, String phoneNumber,
            int yearOfExperiences, String speciality) {
        super(id, name, gender, birtday, email, phoneNumber);
        this.yearOfExperiences = yearOfExperiences;
        this.speciality = speciality;

    }

    @Override
    public
    void printInfor() {
        // TODO Auto-generated method stub
        super.printInfor();
        System.out.println("Kinh nghiem :" + yearOfExperiences + "year");
        System.out.println("Chuyen mon :" + speciality);
    }
}
