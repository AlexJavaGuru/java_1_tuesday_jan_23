package student_oksana_tarasova.lesson_3.level_7;

class WomanInShop {
    // Task 29. 2 объект - покупки в магазине
    String product;
    String color;
    boolean lucky;

    public WomanInShop(String product, String color, boolean lucky) {
        this.product = product;
        this.color = color;
        this.lucky = lucky;
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
