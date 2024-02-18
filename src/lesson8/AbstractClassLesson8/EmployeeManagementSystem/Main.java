package lesson8.AbstractClassLesson8.EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Faris", 1);
        Developer developer = new Developer("Syafiq", 2);
        Intern intern = new Intern("Firdaus", 3);
        
        manager.calculateSalary();
        manager.displayDetails();
        developer.calculateSalary();
        developer.displayDetails();
        intern.calculateSalary();
        intern.displayDetails();
    }
    
}
