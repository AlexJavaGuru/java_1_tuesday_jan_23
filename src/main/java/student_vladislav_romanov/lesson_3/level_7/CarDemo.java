package student_vladislav_romanov.lesson_3.level_7;

class CarDemo {

    public static void main(String[] args) {
        int currentYear = 2023;

        Car car1 = new Car("BMW 528", "Blue", 2015, 86000, 238);
        Car car2 = new Car("AUDI A6", "Touring", "White", 2010, 130000, 220);
        Car car3 = new Car("MB SLK230", "Cabrio","Red", 2007, 230000, 210);

        // Print car information
        System.out.println(car1.getColor() + " " + car1.getType() + " " + car1.getModel() + " " + car1.getYear());
        System.out.println(car2.getColor() + " " + car2.getType() + " " + car2.getModel() + " " + car2.getYear());
        System.out.println(car3.getColor() + " " + car3.getType() + " " + car3.getModel() + " " + car3.getYear());
        System.out.println("---------------------------");

        System.out.println(car1.getCarModel() + " drives " + (car1.getMileage() / (currentYear - car1.getYear())) + " km per year in average." );

        System.out.println("Is " + car2.getCarModel() + " cabrio? " + car2.isConvertible());

        car3.repaint("Yellow");
        System.out.println(car3.getCarModel() + " now is " + car3.getColor());

        car2.twistMileage(30);
        System.out.println("Mileage for " + car2.getCarModel() + " was twisted and is " + car2.getMileage() + " km now");

        car1.drive();

    }

}
