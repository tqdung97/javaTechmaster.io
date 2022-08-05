package HomeWork5;

import java.time.LocalDate;
enum GENDER {
    MALE,
   FEMALE;
}
public class Employee {
    public String Id;
    public String Name;
    public LocalDate dateOfBirth;
    public Double Salary;

    public GENDER gender;

    public Employee(String Name, String Id, LocalDate dateOfBirth, Double Salary) {
        this.Name = Name;
        this.Id = Id;
        this.dateOfBirth = dateOfBirth;
        this.Salary = Salary;
    }

    public boolean hasKeyword(String idInput) {
        boolean result = this.Id.contains(idInput);
        return result;
    }
}
