import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("HS1", "Le Van A", 25, "K");
        Student student2 = new Student("HS2", "Nguyen Van B", 20, "K");
        Student student3 = new Student("HS3", "Ho Viet C", 21, "G");
        Student student4 = new Student("HS4", "Trinh Quang Dung", 25, "Y");
        Student student5 = new Student("HS5", "AA", 23, "TB");
        Student student6 = new Student("HS6", "AA", 24, "K");

        ArrayList<Student> listStudent = new ArrayList<>();
        listStudent.add(student);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);
        listStudent.add(student5);
        listStudent.add(student6);

        ClassTechmaster superclass = new ClassTechmaster("Java", listStudent);
        Operator teacher1 = new Operator("thay Cuong", "Hieu Truong");
        Operator manager1 = new Operator("Huong", "Manager");

        TechMaster techMaster = new TechMaster(teacher1, manager1, superclass);
        System.out.println(techMaster.toString());
        // Thực hiện thêm học viên vào lớp hiện tại
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap ten hoc vien can them: ");
        String name = sc.nextLine();
        System.out.println("Nhap ID: ");
        String id = sc.nextLine();
        System.out.println("Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Hoc Luc: ");
        String hocLuc = sc.nextLine();
        Student addstudent = new Student(id, name, age, hocLuc);
        techMaster.addStudent(addstudent);
        System.out.println(techMaster.toString());

        // //tim hoc vien theo id
        System.out.println("Nhap ID san pham (vd: HS1,HS2,HS3,HS...: ");
        String id1 = sc.nextLine();
        for (Student studentId : listStudent) {
            if (studentId.getId().indexOf(id1) >= 0) {

                System.out.println(studentId);
                
                // Xoa hoc vien
                System.out.println("Nhap ID ban can xoa");
                String idDelete = sc.nextLine();
                for (Student DeleteStu : listStudent) {
                    if (DeleteStu.getId().indexOf(idDelete) >= 0) {
                        listStudent.remove(DeleteStu);
                        System.out.println(listStudent.toString());
                    }
                }
                System.out.println(techMaster.toString());

                sc.close();

            }
        }
    }
}
