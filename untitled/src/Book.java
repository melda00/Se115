
public class Book {
    public String title;
    public int pages;

    public Book(String name, int numberofpages) {
        this.title = name;
        this.pages = numberofpages;
    }

    public int addPages(int pages) {
        this.pages += pages;
        return this.pages;
    }

    public void printBook() {
        System.out.println("Book title " + this.title);
        System.out.println("Book pages " + this.pages);
    }
}

