package student_natalija_rasponomarjova.lesson_3.level_7;

class Product {

    String name;
    double regularPrice;
    double discount10percent;

    Product (String name) {
       this.name = name;
    }
    public double setRegularPrice(){
        return regularPrice;
    }

    public double setDiscount10percent() {
      double discount = (regularPrice / 1.1) * 0.1;
        return discount;
    }
    public double getActualPrice() {
        return regularPrice - setDiscount10percent();

    }
    void printInformation() {

         System.out.println("Product title:" + " " + name + " | " + "Regular price: " + " " + regularPrice + " "
                 + "Euro"+ " | " + "Discount: " + " " + discount10percent + " " + " % " + " | "  + "Actual price: " + " "
                 +  getActualPrice() + " " + "Euro");

     }
}
