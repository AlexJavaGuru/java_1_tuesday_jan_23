package student_vladislav_romanov.lesson_3.level_7;

class CarDemo {

    public static void main(String[] args) {
        int currentYear = 2023;

        Car bmw528 = new Car("BMW 528", "Blue", 2015, 86000, 238);
        Car audiA6 = new Car("AUDI A6", "Touring", "White", 2010, 130000, 220);
        Car mbSlk230 = new Car("MB SLK230", "Cabrio","Red", 2007, 230000, 210);

        bmw528.printInformation();
        audiA6.printInformation();
        mbSlk230.printInformation();
        System.out.println("---------------------------");

        System.out.println(bmw528.getCarModel() + " drives " + (bmw528.getMileage() / (currentYear - bmw528.getYear())) + " km per year in average." );

        System.out.println("Is " + audiA6.getCarModel() + " cabrio? " + audiA6.isConvertible());

        mbSlk230.repaint("Yellow");
        System.out.println(mbSlk230.getCarModel() + " now is " + mbSlk230.getColor());

        audiA6.twistMileage(30);
        System.out.println("Mileage for " + audiA6.getCarModel() + " was twisted and is " + audiA6.getMileage() + " km now");

        bmw528.drive();

    }

}
