public class Car{
    String make;
    String Model;
    int year;

    public Car(String make, String Model, int year){
        this.make = make;
        this.Model = Model;
        this.year = year;
    }

    public void displayCarInfo(){
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + Model);
        System.out.println("Car Year: " + year);
    }

    public static void main(String[] args) {
        Car mycar = new Car("BMW", "Limited Edition", 2024);
        mycar.displayCarInfo();
    }
}