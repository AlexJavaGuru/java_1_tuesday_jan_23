package student_oleg_gryazev._lesson_3.level_7;

class Computer {

    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }


    public void setManufacturer(String manufacturer) {

    }
}

class ComputerDemo {

    public static void main(String[] args) {
        Computer dell = new Computer("Dell", "XXX-1");
        String manufacturer = dell.getManufacturer();
        String model = dell.getModel();
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);
    }

}

