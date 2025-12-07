public class Product {
    private String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return this.name;
    }

    public int getStock() {
        return this.stock;
    }

    public boolean buyOne() {
        if (this.stock > 0) {
            --this.stock;
            return true;
        } else {
            return false;
        }
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println("remain stock " + this.stock);
    }
}
