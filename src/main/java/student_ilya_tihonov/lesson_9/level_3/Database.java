package student_ilya_tihonov.lesson_9.level_3;

import java.util.Optional;

public class Database {

    public static void main(String[] args) {
        ProductDatabase database = new InMemoryDatabase();

        Product apple = new Product("Apple");
        Product banana = new Product("Banana");
        Product pear = new Product("Pear");

        database.save(apple);
        database.save(banana);
        database.save(pear);

        String title = "Banana";
        Optional<Product> foundProduct = database.findByTitle(title);
        if (foundProduct != null) {
            System.out.println("Found a product with the name " + title + ": " + foundProduct.get().getTitle());
        } else {
            System.out.println("Product named:" + title + " not found");
        }
    }

}
