package student_oksana_tarasova.lesson_3.level_7;

class WomanInShopDemo {
    public static void main(String[] args) {
        WomanInShop shopping = new WomanInShop("coat", "blue", true);
        shopping.choose("white");
        shopping.luck(false);
        shopping.choose("blue");
        shopping.luck(true);
    }
}
