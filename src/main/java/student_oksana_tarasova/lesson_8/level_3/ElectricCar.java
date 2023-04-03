package student_oksana_tarasova.lesson_8.level_3;

class ElectricCar extends Car {

    private int batteryCharge;

    ElectricCar(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    @Override
    void accelerate() {
        if (batteryCharge > 0) {
            System.out.println("Let's ride");
        } else {
            System.out.println("Battery low");
        }
    }
}
