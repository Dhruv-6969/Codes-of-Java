import java.util.Scanner;

public class StudentFaculty{

    public static void main(String[] args) {
        System.out.println("Enter 1 if Student & enter 2 if faculty: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
    }

    public StudentFaculty(int input){
        switch (input) {
            case 1:
                System.out.println("You are a student");
                break;
            case 2:
                System.out.println("You are a faculty");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }

}