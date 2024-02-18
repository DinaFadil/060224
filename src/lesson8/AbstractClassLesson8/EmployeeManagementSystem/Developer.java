package lesson8.AbstractClassLesson8.EmployeeManagementSystem;

public class Developer extends Employee {

    public Developer(String name, int id) {
        super(name, id);
    }

    @Override
    void calculateSalary() {
        this.salary = 3000;
    }
    
}
