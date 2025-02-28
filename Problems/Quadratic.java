
public class Quadratic {

    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        int dis = (b * b) - 4 * a * c;
        double r1, r2;
        if (dis > 0) {
            System.out.println("Real & Distinct Roots");
            r1 = (-b + Math.sqrt(dis)) / 2;
            r2 = (-b - Math.sqrt(dis)) / 2;
        } else if (dis == 0) {
            System.out.println("Real & Equal Roots");
            r1 = (-b + Math.sqrt(dis)) / 2;
            r2 = (-b - Math.sqrt(dis)) / 2;
        } else {
            System.out.println("Imaginary Roots");
            int v = -dis;
            r1 = (-b + Math.sqrt(v)) / 2;
            r2 = (-b - Math.sqrt(v)) / 2;
        }
        System.out.println(r1 + "i");
        System.out.println(r2 + "i");
    }
}
