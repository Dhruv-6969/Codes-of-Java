public class Student {

    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No.: " + rollNo);
    }

    public static void main(String[] args) {
        Student stud = new Student("Dhruv", 32);
        stud.displayStudentInfo();
    }
}