package student_konstantin_kudrjavtsev.lesson_3_oop_first_look.homework.level_7_senior;

public class ProductDemo {
    public static void main(String[] args) {
        Product macBook = new Product("MacBook Pro");
        macBook.regularPrice = 1999;
        macBook.discount = 0.20;

        macBook.printInformation();
    }
}