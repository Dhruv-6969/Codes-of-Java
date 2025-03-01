public class Employee{
    String name;
    int employeeId;
    double salary;

    //constucter
    public Employee(String name, int employeeId, double salary){
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Dhruv", 77, 2000000);
        emp.display();
    }
}