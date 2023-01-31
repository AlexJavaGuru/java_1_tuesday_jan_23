package student_aleksandrs_lezhennikovs.lesson_3.level_7;

import java.util.Scanner;

class ShopDemo {
    public static void main(String[] args) {

        Shop orangeShop = new Shop("Apelsins", "Rīgas gatve 5, Ādaži, Ādažu novads, LV-2164", false, 57.07201, 24.32021);
        Scanner input = new Scanner(System.in);

        //orangeShop.addressMessage();
        //orangeShop.messageShopStatus();

        //orangeShop.setShopOpenStatus(true);
        if (orangeShop.getShopOpenStatus()) {
            orangeShop.messageShopStatus();
            orangeShop.addressMessage();
        } else {
            orangeShop.messageShopStatus();
            System.out.println("If you want to open store, please type: Yes");

            String checkStatus = input.nextLine();

            if (checkStatus.toLowerCase().matches("yes")) {
                orangeShop.setShopOpenStatus(true);
                orangeShop.messageShopStatus();
            } else {
                System.out.println("See you later.");
            }
        }
        //orangeShop.messageShopStatus();
/*
        Shop tobagoShop = new Shop("Tobago", "Lielais prospekts 3/5, Ventspils, LV-3601", true, 57.38777, 21.57979
        );

        //tobagoShop.addressMessage();
        tobagoShop.messageShopStatus();

        tobagoShop.setShopOpenStatus(false);

        tobagoShop.messageShopStatus();

 */
    }

}
