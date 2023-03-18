package student_oksana_tarasova.Lesson_9.level_3;

public class InMemoryDatabaseTest {
    public static void main(String[] args) {
        InMemoryDatabaseTest test = new InMemoryDatabaseTest();
        test.findByTitleTest();
        test.findByTitleTest1();
    }
/*
    public void saveTest() {
        Product product = new Product("Roshen");
        Product[] products = {new Product("Kalev")};
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase(products);
        Product[] expected = {new Product("Kalev"), new Product("Roshen")};
        Product[] real = inMemoryDatabase.save(product);

    }


 */

    public void findByTitleTest() {
        Product[] products = {
                new Product("Kalev"),
                new Product("Roshen"),
                new Product("Dark night")
        };
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase(products);
        Product real = inMemoryDatabase.findByTitle("Roshen");
        Product expected = products[1];
        check(real.equals(expected), "Find by title");
    }
    public void findByTitleTest1() {
        Product[] products = {
                new Product("Kalev"),
                new Product("Roshen"),
                new Product("Dark night")
        };
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase(products);
        Product real = inMemoryDatabase.findByTitle("Rainbow");
        for (int i = 0; i < products.length; i++) {
           if (products[i].getTitle() == null) {
               System.out.println("product not find");
           }
        }
    }

    public void check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = ok");
        } else {
            System.out.println(nameTest + " = fail");
        }
    }

}
