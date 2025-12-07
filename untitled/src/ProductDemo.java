import java.util.Scanner;

public class ProductDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many products does the store have? ");
        int size = sc.nextInt();
        sc.nextLine();
        Product[] products = new Product[size];

        for(int i = 0; i < products.length; ++i) {
            String name = sc.nextLine();
            int stock = sc.nextInt();
            sc.nextLine();
            products[i] = new Product(name, stock);
        }

        while(true) {
            String nameToBuy = sc.nextLine();
            if (nameToBuy.equalsIgnoreCase("Q")) {
                for(Product p : products) {
                    p.printInfo();
                }

                sc.close();
                return;
            }

