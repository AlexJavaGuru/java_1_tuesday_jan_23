package student_julija_raudive.lesson_3.level_7;

 class Product {

     String name;
     double regularPrice;
     double discount;

     Product(String name){
         this.name = name;
     }


     double actualPrice(){
         double price = regularPrice * ((100 - discount) / 100);
         return price;
     }

     void printInformation(){

         System.out.println("Milk" + "\nRegular price: " + regularPrice + "\nDiscount: " + discount + " %"+ "\nPrice with discount: " + this.actualPrice());

     }

}
