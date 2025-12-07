
public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book("martin eden", 650);
        Book b2 = new Book(b1.title, b1.addPages(20));
        b1.printBook();
        b2.printBook();
        Book b3 = new Book(b1.title, b1.pages);
        System.out.println(b3);
        System.out.println(b1);
    }
}
