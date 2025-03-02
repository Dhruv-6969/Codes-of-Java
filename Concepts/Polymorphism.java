class Bank{
    public void RateofInterest(){
        System.out.println("5%");
    }
}

class SBI extends Bank{
    @Override
    public void RateofInterest(){
        System.out.println("6%");
    }
}

class BOB extends Bank{
    @Override
    public void RateofInterest(){
        System.out.println("7%");
    }
}

public class Polymorphism{
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        SBI bank2 = new SBI();
        BOB bank3 = new BOB();
        bank1.RateofInterest();
        bank2.RateofInterest();
        bank3.RateofInterest();
    }
}