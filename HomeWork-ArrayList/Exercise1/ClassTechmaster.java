import java.util.ArrayList;

public class ClassTechmaster {

    private String nameMonHoc;
    ArrayList<Student>listStudent = new ArrayList<>();
    public ClassTechmaster( String nameMonHoc, ArrayList<Student> listStudent) {
        this.nameMonHoc = nameMonHoc;
        this.listStudent = listStudent;
        
    }
    
    @Override
    public String toString() {
        return "ClassTechmaster [nameMonHoc=" + nameMonHoc + "\nlistStudent=" + listStudent + "]";
    }
    public void addStudent(Student student) { 
        listStudent.add(student);
    }
  

    


    
    

}
