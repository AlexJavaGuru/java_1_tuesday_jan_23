package student_vladislav_romanov.lesson_8.level_3;

abstract class Weapon {

    String model;
    String producer;
    int magazine;

    public Weapon(String model, String producer, int magazine) {
        this.model = model;
        this.producer = producer;
        this.magazine = magazine;
    }

    abstract void shoot();

    void reload() {
        System.out.println("Ammo reloaded. Now you have " + magazine + " rounds loaded.");
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

}
