package student_andrejs_cekalins.lesson_3.level_7.task_29;

class Car {
    private String brand;
    private String color;
    String model;
    private boolean isNew;

    Car(String carBrand, String carColor, String carModel, boolean isNew){
        this.brand = carBrand;
        this.color = carColor;
        this.model = carModel;
        this.isNew = isNew;
    }
    Car(String carBrand, String carColor, String carModel){
        this.brand = carBrand;
        this.color = carColor;
        this.model = carModel;}

    String getCarBrand(){
        return this.brand;
    }
    String getCarColor(){
        return this.color;
    }
    String getCarModel() {
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
