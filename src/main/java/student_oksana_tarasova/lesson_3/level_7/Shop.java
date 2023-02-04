package student_oksana_tarasova.lesson_3.level_7;

class Shop {
    // Task 29. 2 объект - покупки в магазине
    String product;
    double price1;
    double price2;
    String color = "blue";
    boolean lucky = true;

    public Shop(String product) {
        this.product = product;
    }

    void buy(double price1, double price2) {
        this.price1 = price1;
        this.price2 = price2;
        if(price1<price2){
            System.out.println("Buy a " + product + " at a price " + price1 + " euro.");
        }
        else{
            System.out.println("Buy a  " + product + " at a price " + price2 + " euro.");
        }

    }

    void choose(String color) {
        if(this.color == color) {
            System.out.println("I am choose this " + product);
        }
        else{
            System.out.println("i am not choose this " + product);
        }
    }


    void luck(boolean lucky) {
        if(this.lucky == lucky) {
           System.out.println("I am lucky!");
        }
        else{
            System.out.println("I am do not lucky!");
        }
    }
}
