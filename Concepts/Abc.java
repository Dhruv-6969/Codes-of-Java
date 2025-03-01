// class NestedClass {

//     protected static class hey{
//         private String name;
//         private int age;
//     }
// }

// public class Abc{
//     public static void main(String[] args) {
//         NestedClass.hey hehe = new NestedClass.hey();

//     }
// }

class NestedClass {

    protected class hey{
        private String name;
        private int age;
    }
}

public class Abc{
    public static void main(String[] args) {
        NestedClass hihi = new NestedClass();
        NestedClass.hey hehe = hihi.new hey();
    }
}