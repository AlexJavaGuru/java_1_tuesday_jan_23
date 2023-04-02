package student_natalja_semitseva.Lesson_9_Task_10;


import java.util.Optional;
class InMemoryDataBaseTest {
    private Product books;
    private java.util.Optional<Product> Optional;

    public static void main(String[] args) {
        InMemoryDataBaseTest test = new InMemoryDataBaseTest();
      test.testFindByTitle();

    }


    void testFindByTitle() {
      ProductDatabase productDatabase;
        productDatabase = new ProductDatabase() {
            @Override
            public void save(Product product) {

            }

            @Override
            public java.util.Optional<Product> findByTitle(String productTitle) {
                Product product = null;
                return Optional.of(product);
            }
        };
InMemoryDataBase inMemoryDataBase =new InMemoryDataBase();
      inMemoryDataBase.save(books);





    }

    private void checkResults(Optional optionalProduct, String testName) {

        if (Optional==optionalProduct){
                System.out.println(testName + " = FAIL");
        } else {
            System.out.println(testName + " = OK");
        }
    }
}