package student_aleksandrs_lezhennikovs.lesson_3.level_7;

class ProductDemo {
    public static void main(String[] args) {

        Product firstProduct = new Product("iPhone 14 Pro");
        firstProduct.regularPrice = 2000;
        firstProduct.discount = 0.4;


        firstProduct.printInformation();

    }
}
