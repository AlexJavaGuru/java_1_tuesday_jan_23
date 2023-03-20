package student_oksana_tarasova.Lesson_9.level_3;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.Optional;

public class InMemoryDatabaseTest {
    public static void main(String[] args) {
        InMemoryDatabaseTest test = new InMemoryDatabaseTest();
        test.saveTest();
        test.findByTitleTest();
        test.findByTitleTest1();
        test.findByTitleTest2();
        test.findByTitleTest3();
    }



    public void saveTest() {
        //не заню как тестировать void методы. Это демо
        Product[] products = {
                new Product("Kalev"),
                new Product("Roshen"),
        };
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase(products);
        System.out.println(inMemoryDatabase.toString());
        inMemoryDatabase.save(new Product("Dark night"));
        System.out.println(inMemoryDatabase.toString());
    }

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
        if (real == null) {
            System.out.println("product not find");
        }

    }

    public void findByTitleTest2() {
        Product[] products = {
                new Product("Kalev"),
                new Product("Roshen"),
                new Product("Dark night")
        };
        InMemoryDatabase1 inMemoryDatabase1 = new InMemoryDatabase1(products);
        Optional real = inMemoryDatabase1.findByTitle("Roshen");
        Optional expected = Optional.of(products[1]);
        check(real.equals(expected), "Find by title optional");
    }

    public void findByTitleTest3() {
        Product[] products = {
                new Product("Kalev"),
                new Product("Roshen"),
                new Product("Dark night")
        };
        InMemoryDatabase1 inMemoryDatabase1 = new InMemoryDatabase1(products);
        Optional real = inMemoryDatabase1.findByTitle("Kalinka");
        Optional expected = Optional.empty();
        check(real.equals(expected), " not Find by title optional");
    }

    public void check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = ok");
        } else {
            System.out.println(nameTest + " = fail");
        }
    }

}
