package sem1;
import java.util. *;
public class Main {
    public static void main(String[] args) {
        VendingMachine store = new VendingMachine();
        store.addProduct(new Product("Lays" , 50.40))
                .addProduct(new Product("Fanta" , 75.76))
                .addProduct(new Product("Cola" , 76.21))
                .addProduct(new Product("Snickers" , 50.21))
                .addProduct(new Beer("alcoholfree" , 88.14))
                .addProduct(new Beer("notbeer" , 105.85, 5))
                .addProduct(new CursedProducts("milk" , 56.65, 7));

        for (Product product : store.getProducts()) {
            System.out.println(product);
        }
        System.out.println("searching for lays");
        System.out.println(store.findProduct("Lays"));


        System.out.println("buying Lays" );
        store.buy("Lays", 50.40);
        System.out.println(store);

        System.out.println("buying Fanta" );
        store.buy("Fanta", 75.76);
        System.out.println(store);

    }
}
