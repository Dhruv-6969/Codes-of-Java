class Person{
    String name;
    int age;
    
    Person(String name, int age){
        this.age = age;
        this.name = name;
    }
}

class Hero extends Person{
    int power;

    Hero(int power, String name, int age){
        super(name, age);
        this.power = power;
    }
}

public class SuperKey {
    public static void main(String[] args) {
        Hero hero1 = new Hero(99, "Dhruv", 19);
        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);
    }
}