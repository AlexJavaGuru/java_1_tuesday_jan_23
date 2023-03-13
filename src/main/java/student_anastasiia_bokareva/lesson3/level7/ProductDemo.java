package student_anastasiia_bokareva.lesson3.level7;

import java.util.Scanner;

public class ProductDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Product kefir = new Product("Kefir");
        kefir.setPrice(300);
        kefir.setDiscount(0.5);
        kefir.newPrice();
    }
}
