package student_andrejs_cekalins.lesson_3.level_7.task_29;

class Car {
    private String brand;
    private String color;
    String model;
    private boolean isNew;

    Car(String brand, String color, String model, boolean isNew) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.isNew = isNew;
    }
    Car(String brand, String color, String model) {
        this.brand = brand;
        this.color = color;
        this.model = model;
    }
    String getBrand(){
        return this.brand;
    }
    String getColor(){
        return this.color;
    }
    String getModel() {
        return this.model;
    }
    boolean isNew() {
        return this.isNew;
    }
    void changeModel(String carModel) {
        this.model = carModel;
    }
    void carEngine(){
        System.out.println( "Car engine is started");
    }
}
