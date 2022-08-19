
public class TechMaster {
  Operator teacher;
  Operator manager;
  ClassTechmaster class13;
  TechMaster techMaster;

  public TechMaster(Operator teacher, Operator manager, ClassTechmaster class13) {
    this.teacher = teacher;
    this.manager = manager;
    this.class13 = class13 ;
}

@Override
public String toString() {
    return "TechMaster [\nclass13=" + class13 + "\nmanager=" + manager + "\nteacher=" + teacher + "\n]";
}
  
    public TechMaster addStudent(Student student){
        class13.addStudent(student);
        return this.techMaster;
    }

    
  
}
