package student_vladislav_romanov.lesson_8.level_3;

class Rifle extends Weapon {

    public Rifle(String model, String producer, int magazine) {
        super(model, producer, magazine);
    }

    @Override
    public void shoot() {
        System.out.println("Bah. Bah. Bah.");
    }
}
