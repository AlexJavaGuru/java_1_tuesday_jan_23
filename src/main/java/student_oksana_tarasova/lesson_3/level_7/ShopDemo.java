package student_oksana_tarasova.lesson_3.level_7;

class ShopDemo {
    public static void main(String[] args) {
        Shop shopping = new Shop("coat");
        shopping.buy(3.4, 5.6);
        shopping.choose("white");
        shopping.luck(false);
        shopping.buy(4.5, 3.2);
        shopping.choose("blue");
        shopping.luck(true);
    }
}
