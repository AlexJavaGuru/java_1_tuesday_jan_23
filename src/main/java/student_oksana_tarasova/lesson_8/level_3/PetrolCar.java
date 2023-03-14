package student_oksana_tarasova.lesson_8.level_3;

class PetrolCar extends Car {

    private double petrolTankCapacity;

    public PetrolCar(double petrolTankCapacity) {
        this.petrolTankCapacity = petrolTankCapacity;
    }

    @Override
    void accelerate() {
        if (petrolTankCapacity > 0) {
            System.out.println("Gooo...");
        } else {
            System.out.println("No gasoline");
        }
    }
}
