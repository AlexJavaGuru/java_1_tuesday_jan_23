package student_vladislav_romanov.lesson_8.level_3;

class Machinegun extends Weapon {

    boolean mounting;
    String type;

    public Machinegun(String model, String producer, int magazine, boolean mounting, String type) {
        super(model, producer, magazine);
        this.mounting = mounting;
        this.type = type;
    }

    @Override
    void shoot() {
        System.out.println("Trrrrrrrr. Trrrrrrrr. Trrrrrrrr.");
    }

}
