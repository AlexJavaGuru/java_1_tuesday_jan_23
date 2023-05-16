package student_natalja_semitseva.Lesson_9_Task_6_9;

public class InMemoryDataBase implements ProductDatabase {


    private Product product;

    Product[] productsDataBase = new Product[1];

    @Override

    public void save(Product product) {
        this.product = product;
        Product[] dataBase = new Product[productsDataBase.length + 1];
        for (int i = 0; i < productsDataBase.length; i++) {
            dataBase[i] = productsDataBase[i];
        }
        productsDataBase = dataBase;
        //(Product element : productsDataBase)
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (int i = 0; i < productsDataBase.length; i++)//(Product product : productsDataBase) {
            if (product.getTitle().equals(productTitle)) {
                return product;
            }

        return null;
    }

}
