package lesson8.AbstractClassLesson8.EmployeeManagementSystem;

public abstract class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name,int id){
        this.name = name;
        this.id = id;
    }

    abstract void calculateSalary();

    void displayDetails(){
        System.out.printf("id: %d, name: %s, salary: RM%.2f\n",this.id,this.name,this.salary);
    }
}
