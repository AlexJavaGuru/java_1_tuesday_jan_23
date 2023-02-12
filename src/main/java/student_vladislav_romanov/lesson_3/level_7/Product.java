package student_vladislav_romanov.lesson_3.level_7;

class Product {

    private String name;
    private double regularPrice;
    private double discount;


    Product (String name) {
        this.name = name;
    }


    void printInformation() {
        System.out.println("Product: " + this.getName() + ", price: " + this.getRegularPrice() + "$, discount: " + this.getDiscount() + "%");
    }

    double actualPrice() {
        return this.getRegularPrice() - (Math.round(this.getRegularPrice() * this.getDiscount()) / (double) 100); // Округляем до сотых
    }


    String getName() {
        return name;
    }

    double getRegularPrice() {
        return regularPrice;
    }

    double getDiscount() {
        return discount;
    }



    void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    void setDiscount(double discount) {
        this.discount = discount;
    }

}
