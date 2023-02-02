package student_dmitry_kupcus.lesson_3.level_7;

class House {
    static String address;
    static int sizeInside;
    static int sizeOutside;

    House(String houseAddress, int houseSizeInside, int houseSizeOutside) {
        address = houseAddress;
        sizeInside = houseSizeInside;
        sizeOutside = houseSizeOutside;
    }
}
        class DemoHouse {
            public static void main(String[] args) {
                House myHouse = new House("Lomonosova street", 250, 1000);
                System.out.println("My house address is: " + myHouse.address);
                System.out.println("My house size inside is: " + myHouse.sizeInside + " square meter");
                System.out.println("My house size outside is: " + myHouse.sizeOutside + " square meter");
            }
        }
