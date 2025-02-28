public class Strings{

    public static void main(String[] args) {
        String name = "Aman";
        System.out.println(name);
        String name2 = "Atul";
        String name3 = name + " and " + name2;
        System.out.println(name3);
        System.out.println(name3.length());
        System.out.println(name3.charAt(0));
        String name4 = name.replace("m", "sa");
        System.out.println(name4);
        System.out.println(name.substring(0, 4));
    }
}