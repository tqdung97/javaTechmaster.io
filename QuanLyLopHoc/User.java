package QuanLyLopHoc;
// Viết class User có các thuộc tính sau:

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// id (String)
// name (String)
// gender (enum)
// birthday (LocalDate)
// email (String)
// phoneNumber (String)
enum GENDER {
    MALE,
    FEMALE;
}

public class User {
    private String id;
    private String name;
    private GENDER gender;
    private LocalDate birtday;
    private String email;
    private String phoneNumber;

    public User(String id, String name, GENDER gender, String birtday, String email, String phoneNumber) {
        
        this.id = id;
        this.name = name;
        this.gender = gender;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.birtday = LocalDate.parse(birtday, formatter);
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birtday;
    }

    public void setBirtday(LocalDate birtday) {
        this.birtday = birtday;
    }

    // Viết hàm printInfo để in thông tin cho lớp User, sau đó override lại trong
    // các lớp Student và Teacher.
    public void printInfor() {
        System.out.println("ID " + id);
        System.out.println("Name " + name);
        System.out.println("Gender " + gender);
        System.out.println("Birth " + birtday);
        System.out.println("Email " + email);
        System.out.println("Sdt " + phoneNumber);

    }
}
