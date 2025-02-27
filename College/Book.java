public class Book {
        String title;
        String author;
        double price;

        public Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public void displayDetails() {
            System.out.println("Book Title: " + title);
            System.out.println("Book Author: " + author);
            System.out.println("Book Price: " + price);
        }

    public static void main(String[] args) {
        Book myBook = new Book("Atomic Habits", "XYZ", 69);
        myBook.displayDetails();
    }
}