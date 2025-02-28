
import java.util.Scanner;

public class Arrayy{

    public static void main(String[] args) {
        // String[] student = {"John", "James", "Harry"};
        // System.out.println(student[2]);

        int[] number = new int[5];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter five integers:- ");

        for(int i = 0; i<number.length; i++){
            number[i] = sc.nextInt();
        }

        System.out.println("The integers are:-");

        for(int i = 0; i<number.length; i++){
            System.out.println(number[i]);
        }
    }
}