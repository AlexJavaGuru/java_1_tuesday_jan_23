package student_vladislav_romanov.lesson_3.level_7;

class Car {

    private String model;
    private String type;
    private String color;
    private int year;
    private int mileage;
    private int speed;



    Car(String model, String color, int year, int mileage, int speed) {
        this.setModel(model);
        this.setType("Sedan");
        this.setColor(color);
        this.setYear(year);
        this.setMileage(mileage);
        this.setSpeed(speed);
    }

    Car(String model, String type, String color, int year, int mileage, int speed) {
        this.setModel(model);
        this.setType(type);
        this.setColor(color);
        this.setYear(year);
        this.setMileage(mileage);
        this.setSpeed(speed);
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
        return this.model;
    }

    String getType() {
        return this.type;
    }

    String getColor() {
        return this.color;
    }

    int getYear() {
        return this.year;
    }

    int getSpeed() {
        return this.speed;
    }

    int getMileage() {
        return this.mileage;
    }

    String getCarModel() {
        return this.type + " " + this.model;
    }



    void setModel(String model) {
        this.model = model;
    }

    void setType(String type) {
        this.type = type;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setYear(int year) {
        this.year = year;
    }

    void setMileage(int mileage) {
        this.mileage = mileage;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }
}
