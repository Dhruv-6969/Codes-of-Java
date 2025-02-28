public class Method{

    static String myMethod(String Fname, String Lname){
        String fullName = Fname + " " + Lname;
        return fullName;
    }

    static int add(int x, int y){
        int sum = x + y;
        return sum;
    }

    static int age(int x){
        return x;
    }

    public static void main(String[] args) {
        String fullName = myMethod("John", "Cena");
        System.out.println(fullName);
        int sum = add(5, 8);
        System.out.println(sum);
        System.out.println(age(5));
    }
}