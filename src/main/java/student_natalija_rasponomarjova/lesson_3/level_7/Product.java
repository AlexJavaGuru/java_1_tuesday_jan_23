package student_natalija_rasponomarjova.lesson_3.level_7;

class Product {

    String name;
    double regularPrice;
    double discount;

    Product (String name) {
       this.name = name;
    }
    public double setRegularPrice(){
        return regularPrice;
    }

    public double setDiscount() {
      return (regularPrice * (discount/100));

    }
    public double getActualPrice() {
        return regularPrice - setDiscount();

    }
    void printInformation() {

         System.out.println("Product title:" + " " + name + " | " + "Regular price: " + " " + regularPrice + " "
                 + "Euro"+ " | " + "Discount: " + " " + discount + " " + " % " + " | "  + "Actual price: " + " "
                 +  getActualPrice() + " " + "Euro");

     }
}
