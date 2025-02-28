import java.util.Scanner;


public class Calculator{

    public static void main(String[] args) {
        float a, b;
        System.err.print("Enter 2 integers:- ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.print("Enter the operator to be used:-");
        char op = sc.next().charAt(0);
        switch(op){
            case '+' -> System.out.println(a+b);
            case '-' -> System.out.println(a-b);
            case '*' -> System.out.println(a*b);
            case '/' -> System.out.println(a/b);
            default -> System.out.println("Wrong Input");
        }
    }
}