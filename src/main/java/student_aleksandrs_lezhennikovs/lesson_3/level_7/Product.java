package student_aleksandrs_lezhennikovs.lesson_3.level_7;

class Product {
    String name;
    double regularPrice;
    double discount;

    Product(String name) {
        this.name = name;
    }

    double setPrice(double regularPrice) {
        return regularPrice;
    }

    double setDiscount(double discount) {
        return discount;
    }

    void printInformation() {
        System.out.println("Product information: \n"  + "Title: " + name + " \n" + "Regular price: " + regularPrice + " \n" + "Discount: " + discount + " \n" + "Total price: " + actualPrice(regularPrice, discount));
    }

    double actualPrice(double regularPrice, double discount) {
        double result = regularPrice * (1 - discount);
        return result;
    }
}
