public class Rectangle{
    int length;
    int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public void Area(){
        System.out.println("Area = " + (length*width));
    }

    public static void main(String[] args) {
        Rectangle area = new Rectangle(45, 67);
        area.Area();
    }
}