package student_aleksandrs_lezhennikovs.lesson_3.level_7;

class Shop {
    String shopName;
    String shopAddress;
    boolean shopOpenStatus;
    double gpsLatitude;
    double gpsLongitude;

    Shop(String name,
         String address,
         boolean status,
         double latitude,
         double longitude) {

        this.shopName = name;
        this.shopAddress = address;
        this.shopOpenStatus = status;
        this.gpsLatitude = latitude;
        this.gpsLongitude = longitude;
    }

    void messageShopStatus(){
        if (shopOpenStatus == true) {
            System.out.println("Shop is open! You are welcome to " + shopName + " !!!");
            addressMessage();
            System.out.println("");
            System.out.println("");
        } else {
            System.out.println("Sorry, shop " + shopName + " is closed.");
        }
    }

    void addressMessage(){
        System.out.println("Our address is: " + shopAddress);
    }

    boolean getShopOpenStatus() {
        return shopOpenStatus;
    }

    void setShopOpenStatus(boolean status) {
        this.shopOpenStatus = status;
    }

}
