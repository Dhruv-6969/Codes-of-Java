import java.util.Arrays;

public class Array{

    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 92;
        marks[1] = 77;
        marks[2] = 100;

        System.out.println(marks[2]);

        //length
        System.out.println(marks.length);

        //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
    }
}