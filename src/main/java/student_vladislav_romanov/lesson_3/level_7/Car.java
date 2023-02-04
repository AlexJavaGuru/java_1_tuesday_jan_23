package student_vladislav_romanov.lesson_3.level_7;

class Car {

    private String model;
    private String type;
    private String color;
    private int year;
    private int mileage;
    private int speed;



    Car(String model, String color, int year, int mileage, int speed) {
        this.model = model;
        this.type = "Sedan";
        this.color = color;
        this.year = year;
        this.mileage = mileage;
        this.speed = speed;
    }

    Car(String model, String type, String color, int year, int mileage, int speed) {
        this.model = model;
        this.type = type;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
        this.speed = speed;
    }


    void printInformation() {
        System.out.println(this.getColor() + " " + this.getType() + " " + this.getModel() + " " + this.getYear());
    }

    void drive() {
        System.out.println(this.getCarModel() + " is driving with top speed " + this.getSpeed() + "km/h");
    }

    void repaint(String color) {
        this.setColor(color);
    }

    void twistMileage(int percent) {
        int oldMileage = this.getMileage();
        double newMileage = oldMileage - (oldMileage * ( (double) percent / 100));
        this.setMileage((int) newMileage);
    }

    boolean isConvertible() {
        return this.getType().equals("Cabrio");
    }



    String getModel() {
        return model;
    }

    String getType() {
        return type;
    }

    String getColor() {
        return color;
    }

    int getYear() {
        return year;
    }

    int getSpeed() {
        return speed;
    }

    int getMileage() {
        return mileage;
    }

    String getCarModel() {
        return this.type + " " + this.model;
    }


    void setColor(String color) {
        this.color = color;
    }

    void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
