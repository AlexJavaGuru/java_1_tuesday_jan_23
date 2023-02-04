package student_aleksandrs_lezhennikovs.lesson_3.level_7;

class Shop {
    String name;
    String address;
    boolean isOpen;
    double latitude;
    double longitude;

    Shop(String name,
         String address,
         boolean isOpen,
         double latitude,
         double longitude) {

        this.name = name;
        this.address = address;
        this.isOpen = isOpen;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    void messageShopStatus(){
        if (isOpen) {
            System.out.println("Shop is open! You are welcome to " + name + " !!!");
            addressMessage();
        } else {
            System.out.println("Sorry, shop " + name + " is closed.");
        }
    }

    void addressMessage(){
        System.out.println("Our address is: " + address);
    }

    boolean getOpen() {
        return isOpen;
    }

    void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

}
