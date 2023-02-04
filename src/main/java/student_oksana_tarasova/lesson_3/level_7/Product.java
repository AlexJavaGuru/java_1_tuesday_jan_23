package student_oksana_tarasova.lesson_3.level_7;

class Product {
    String name;
    double regularPrice;
    double discount;
     public Product(String name, double regularPrice, double discount){
         this.name = name;
         this.regularPrice = regularPrice;
         this.discount = discount;

     }

    void printInformation() {

        double count = (regularPrice*discount)/100;
        double actualPrice = regularPrice - count;
         System.out.println(name + ": " + regularPrice + " euro");
         System.out.println("discount: " + count + " euro");
         System.out.println(name + ": " + actualPrice + " euro");

    }
}
