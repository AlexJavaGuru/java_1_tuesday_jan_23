package student_vladislav_romanov.lesson_3.level_7;

class Product {

    private String name;
    private double regularPrice;
    private double discount;


    Product (String name) {
        this.setName(name);
    }


    void printInformation() {
        System.out.println("Product: " + this.getName() + ", price: " + this.getRegularPrice() + "$, discount: " + this.getDiscount() + "%");
    }

    double actualPrice() {
        return this.getRegularPrice() - (Math.round(this.getRegularPrice() * this.getDiscount()) / (double) 100); // Округляем до сотых
    }


    String getName() {
        return this.name;
    }

    double getRegularPrice() {
        return this.regularPrice;
    }

    double getDiscount() {
        return this.discount;
    }


    void setName(String name) {
        this.name = name;
    }

    void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    void setDiscount(double discount) {
        this.discount = discount;
    }

}
