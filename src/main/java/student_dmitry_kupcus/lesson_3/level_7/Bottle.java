package student_dmitry_kupcus.lesson_3.level_7;

class Bottle {
    static String manufacturer;
    static int volume;
    static String color;

    Bottle(String newManufacturer, int newVolume, String newColor) {
        manufacturer = newManufacturer;
        volume = newVolume;
        color = newColor;
    }
}

    class DemoBottle {
        public static void main(String[] args) {

            Bottle cola = new Bottle("Cola", 1000, "black");
            System.out.println("Do you want to drink " + Bottle.manufacturer + "?");
            System.out.println("I have " + Bottle.volume + "ml");
            System.out.println("This drink is " + Bottle.color + " color");

        }
    }

