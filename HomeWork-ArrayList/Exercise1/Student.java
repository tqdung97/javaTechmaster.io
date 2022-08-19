public class Student {
    private String id;
    private String name;            //Khai báo thuộc tính cho Student.
    private int age;
    private String hocLuc;
    //tạo constructor
    public Student(String id, String name, int age, String hocLuc) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hocLuc = hocLuc;
    }
    

    // tạo getter and Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHocLuc() {
        return hocLuc;
    }

    public void setHocLuc(String hocLuc) {
        this.hocLuc = hocLuc;
    }
    @Override
    public String toString() {
        return "Student \n[name = " + name + ", id = " + id + ", age = " + age + ", hocLuc = " + hocLuc + "]";
    }
    
}
