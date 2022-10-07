import java.util.*;

public class Student {
    public String fullName;
    public int age;
    public int GPA;

    public Student() {
    }

    public Student(String fullName, int age, int GPA) {
        this.fullName = fullName;
        this.age = age;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' + "\t" +
                ", age=" + age + "\t" +
                ", GPA=" + GPA +
                '}' + "\n";
    }


    List<Student> students = new ArrayList<>();

    public void addStudent() {
        Student student = new Student("Hoàng Hoa Thám", 14, 30);
        Student student1 = new Student("Nguyễn Văn Công", 35, 25);
        Student student2 = new Student("Lê Văn Lương", 37, 21);
        Student student3 = new Student("Hoàng Hoa Thám", 22, 45);
        Student student4 = new Student("Hoàng Hoa Thám", 14, 70);
        Student student5 = new Student("Trần Văn Bình", 41, 65);


        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
    }

    public void sortFullNameException() {

        // #1. Sắp xếp học sinh theo fullName, nếu giống fullName thì ai nhiều tuổi hơn thì đứng trước.
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.fullName.equals(o2.fullName)) {   // ? name = name
                    return o2.age - o1.age;             // age giảm dần
                }
                return o1.fullName.compareTo(o2.fullName);
            }
        });
        System.out.println(students.toString());

    }

    //#2. Sắp xếp học sinh theo tuổi tăng dần, nếu bằng tuổi thì xếp theo GPA giảm dần
    public void sortAgeException() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.fullName.equals(o2.fullName) && o1.age == o2.age) {  // name = name và age = age
                    return o2.GPA - o1.GPA;  //sort GPA giảm dần.
                }
                return o1.age - o2.age;
            }
        });
        System.out.println(students.toString());
    }

    // #3. Sắp xếp theo tên. (Ví dụ là Hoàng Văn A, thì chỉ xét A thôi)
    public  void sortFirstName(){
        TreeMap<String,Student> mapStudent = new TreeMap<>();
        for(int j = 0; j < students.size();j++){  // Duyệt qua List
            StringBuilder str = new StringBuilder(String.valueOf(students.get(j).fullName)); // Lấy ra fullName
            str.reverse();     // Đảo ngược chuỗi fullName
            for(int i = 0; i< str.toString().toCharArray().length; i ++){

                if(str.toString().charAt(i) == ' '){
                    //kiểm tra Key đã tồn tại chưa nếu tồn tại thực hiện thêm Key đã đc chỉ định vào Map.
                    if(mapStudent.containsKey(String.valueOf(str.toString().charAt(i-1)))){
                        mapStudent.put(String.valueOf(str.toString().charAt(i-1)).concat(String.valueOf(j)),students.get(j));
                        //thêm Key mới vào Map
                    }else {
                        mapStudent.put(String.valueOf(str.toString().charAt(i-1)),students.get(j));
                    }
                    break;

                }
            }
        }
        //Sắp xếp tên từ A - Z
        for(Map.Entry<String, Student> entry: mapStudent.entrySet()){
            System.out.println(entry.getValue().toString());
        }

    }
    public static void main(String[] args) {
                Student student = new Student();
                student.addStudent();
                System.out.println("#1. Sắp xếp học sinh theo fullName, nếu giống fullName thì ai nhiều tuổi hơn thì đứng trước.");
                student.sortFullNameException();
                System.out.println("");
                System.out.println("#2. Sắp xếp học sinh theo tuổi tăng dần, nếu bằng tuổi thì xếp theo GPA giảm dần");
                student.sortAgeException();
                System.out.println("");
                System.out.println("#3. Sắp xếp theo tên. (Ví dụ là Hoàng Văn A, thì chỉ xét A thôi)");
                student.sortFirstName();

            }
        }

