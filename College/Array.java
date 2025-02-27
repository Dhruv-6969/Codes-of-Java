import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter the size of the Array:-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the integer values:- ");
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum = " + sum);
    }
}