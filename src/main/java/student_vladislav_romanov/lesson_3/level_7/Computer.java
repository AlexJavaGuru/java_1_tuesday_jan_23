package student_vladislav_romanov.lesson_3.level_7;

class Computer {

    private String manufacturer;
    private String model;

    Computer(String manufacturer, String model) {
        this.setManufacturer(manufacturer);
        this.setModel(model);
    }

    void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    void setModel(String model) {
        this.model = model;
    }

    String getManufacturer() {
        return this.manufacturer;
    }

    String getModel() {
        return this.model;
    }

}
