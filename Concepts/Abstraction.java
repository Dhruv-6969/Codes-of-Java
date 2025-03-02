abstract class Car{
    abstract void fuelType();

    public void Color(){
        System.out.println("Black");
    }
}

class Bugatti extends Car{
    public void fuelType(){
        System.out.println("Petrol");
    }
}

public class Abstraction{
    public static void main(String[] args) {
        Bugatti car1 = new Bugatti();
        car1.fuelType();
        car1.Color();
    }
}