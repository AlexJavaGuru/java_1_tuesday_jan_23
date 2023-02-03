package student_vladislav_romanov.lesson_3.level_7;

class ProductDemo {

    public static void main(String[] args) {

        Product product1 = new Product("Desktop PC");
        Product product2 = new Product("Laptop PC");
        Product product3 = new Product("Pocket PC");

        product1.setRegularPrice(799.99);
        product1.setDiscount(15);

        product2.setRegularPrice(1299.99);
        product2.setDiscount(20);

        product3.setRegularPrice(399.99);
        product3.setDiscount(10);

        product1.printInformation();
        System.out.println("Actual price for " + product1.getName() + " is " + product1.actualPrice() + "$");

        product2.printInformation();
        System.out.println("Actual price for " + product2.getName() + " is " + product2.actualPrice() + "$");

        product3.printInformation();
        System.out.println("Actual price for " + product3.getName() + " is " + product3.actualPrice() + "$");

    }

}
