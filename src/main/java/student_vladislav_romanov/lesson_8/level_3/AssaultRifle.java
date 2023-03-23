package student_vladislav_romanov.lesson_8.level_3;

class AssaultRifle extends Weapon {

    boolean grenadeLauncher;

    public AssaultRifle(String model, String producer, int magazine, boolean grenadeLauncher) {
        super(model, producer, magazine);
        this.grenadeLauncher = grenadeLauncher;
    }

    public void singleShoot() {
        System.out.println("Bah. Bah. Bah.");
    }

    @Override
    public void shoot() {
        System.out.println("Bah-bah-bah. Bah-bah-bah. Bah-bah-bah.");
    }

}
