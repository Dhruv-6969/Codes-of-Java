// public class Object{

//     int x = 5;
//     public static void main(String[] args) {
//         Object myObj1 = new Object();
//         Object myObj2 = new Object();
//         System.out.println(myObj1.x);
//         System.out.println(myObj2.x);
//     }
// }

public class MyObject{
    int x = 5;
}

class Second{

    public static void main(String[] args) {
        MyObject myObj = new MyObject();
        System.out.println(myObj.x);
    }
}