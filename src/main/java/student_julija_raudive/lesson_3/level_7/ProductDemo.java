package student_julija_raudive.lesson_3.level_7;

 class ProductDemo {

    public static void main(String[] args) {

        Product milk = new Product("Milk");
        milk.printInformation();

        milk.regularPrice = 0.99;
        milk.printInformation();

        milk.discount = 30;
        milk.printInformation();
    }
}
