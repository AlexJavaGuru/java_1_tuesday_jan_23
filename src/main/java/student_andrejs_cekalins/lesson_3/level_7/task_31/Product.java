package student_andrejs_cekalins.lesson_3.level_7.task_31;

class Product {
    String name;
    double regularPrice;
    double discount;
    Product(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }
    void regularPrice() {System.out.println("Regular price: "+regularPrice);}
    void discount() {System.out.println("Lamp discount: "+discount);}
    void printInformation() {System.out.print(name);
        System.out.println(" lamp actual price after discount is: " +(regularPrice - regularPrice/discount));}
}
