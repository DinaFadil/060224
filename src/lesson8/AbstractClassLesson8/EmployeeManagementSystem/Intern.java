package lesson8.AbstractClassLesson8.EmployeeManagementSystem;

public class Intern extends Employee {

    public Intern(String name, int id) {
        super(name, id);
    }

    @Override
    void calculateSalary() {
        this.salary = 500;
    }
    
}
