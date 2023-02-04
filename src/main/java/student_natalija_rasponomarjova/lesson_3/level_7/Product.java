package student_natalija_rasponomarjova.lesson_3.level_7;
class Product {

    private String name;
    private double regularPrice;
    private double discount;
    private double actualPrice;

    Product (String name) {
       this.name = name;
    }
    public double getActualPrice(double regularPrice, double discount) {
      double actualPrice =  regularPrice - discount;
      this.regularPrice = regularPrice;
      this.discount = discount;
      this.actualPrice = actualPrice;
      return actualPrice;

    }
     void printInformation() {
         System.out.println("Product title:" + " " + name + " | " + "Regular price: " + " " + regularPrice + " "
                 + "Euro"+ " | " + "Discount: " + " " + discount + " " + "Euro" + " | "  + "Actual price: " + " "
                 +  actualPrice + " " + "Euro");

     }
}
