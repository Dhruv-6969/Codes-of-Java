
import java.util.Scanner;

public class Comparision {

    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter an integer:-");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if (a == b) {
            System.out.println("A is equal to B");
        }
        if (a != b) {
            System.out.println("A is not equal to B");
        }
        if (a < b) {
            System.out.println("A is less than B");
        }
        if (a > b) {
            System.out.println("A is greater than B");
        }
        if (a <= b) {
            System.out.println("A is less than & equal to B");
        }
        if (a >= b) {
            System.out.println("A is greater than & equal to B");
        }
    }
}
