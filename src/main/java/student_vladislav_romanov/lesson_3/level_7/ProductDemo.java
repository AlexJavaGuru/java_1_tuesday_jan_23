package student_vladislav_romanov.lesson_3.level_7;

class ProductDemo {

    public static void main(String[] args) {

        Product desktop = new Product("Desktop PC");
        Product laptop = new Product("Laptop PC");
        Product pocketPc = new Product("Pocket PC");

        desktop.setRegularPrice(799.99);
        desktop.setDiscount(15);

        laptop.setRegularPrice(1299.99);
        laptop.setDiscount(20);

        pocketPc.setRegularPrice(399.99);
        pocketPc.setDiscount(10);

        desktop.printInformation();
        System.out.println("Actual price for " + desktop.getName() + " is " + desktop.actualPrice() + "$");

        laptop.printInformation();
        System.out.println("Actual price for " + laptop.getName() + " is " + laptop.actualPrice() + "$");

        pocketPc.printInformation();
        System.out.println("Actual price for " + pocketPc.getName() + " is " + pocketPc.actualPrice() + "$");

    }

}
