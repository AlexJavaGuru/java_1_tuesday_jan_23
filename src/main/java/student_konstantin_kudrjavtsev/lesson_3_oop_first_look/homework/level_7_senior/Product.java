package student_konstantin_kudrjavtsev.lesson_3_oop_first_look.homework.level_7_senior;

class Product {
    String name;
    double regularPrice;
    double discount;

    Product(String name) {
        this.name = name;
    }
    double setPrice(double regularPrice) {
        return this.regularPrice;
    }
    double setDiscount(double discount) {
        return this.discount;
    }

    void printInformation() {
        System.out.println("Product name: " + name + " \n" + "Regular price: " + regularPrice + "\n" + "Discount: " + discount + "\n" + "Total price: " + actualPrice(regularPrice, discount));
    }
        double actualPrice(double regularPrice, double discount) {
            double result = regularPrice * (1 - discount);
            return result;
    }
}







