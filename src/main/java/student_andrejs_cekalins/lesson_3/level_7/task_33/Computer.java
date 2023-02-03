package student_andrejs_cekalins.lesson_3.level_7.task_33;

class Computer {
    private String manufacturer;
    private String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }
    String getManufacturer(){return this.manufacturer;}

    String getModel(){return this.model;}

}
