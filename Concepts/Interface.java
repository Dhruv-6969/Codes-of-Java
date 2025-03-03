interface Printable{
    void print();
}

interface Drawable{
    void draw();
}

class image implements Printable, Drawable{
    public void print(){
        System.out.println("Printing Image");
    }

    public void draw(){
        System.out.println("Drawing Image");
    }
}

public class Interface {
    public static void main(String[] args) {
        image img = new image();
        img.print();
        img.draw();
    }
}
