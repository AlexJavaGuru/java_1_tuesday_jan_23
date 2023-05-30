package student_dmitry_kupcus.lesson_9.level_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class ProductDatabaseTest {
    private ProductDatabase product;
    private Product product1;

    @BeforeEach
    void setUp() {
        Product product = new Product("test1");

    }

    @Test
    void testSave() {
        List<String> actualResult = Arrays.asList("test", "test2", "test3");
        //List<String> expectedResult = product.save();
        //Assertions.assertIterableEquals(expectedResult, actualResult);
    }

    @Test
    void testFindByTitle() {
        List<String> actualResult = Arrays.asList("test1", "test2");
        Optional<Product> expectedResult = product.findByTitle("test1");
        Assertions.assertArrayEquals(new Optional[]{expectedResult}, new List[]{actualResult});
    }
}