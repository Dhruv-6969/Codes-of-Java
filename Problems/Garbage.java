public class Garbage{

    public static void main(String[] args) {
        Garbage garb = new Garbage();
        garb = null;
        System.gc();
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("product destroyed");
    }
}