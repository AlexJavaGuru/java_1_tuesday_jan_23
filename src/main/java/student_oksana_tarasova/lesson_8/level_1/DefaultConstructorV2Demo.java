package student_oksana_tarasova.lesson_8.level_1;

class DefaultConstructorV2Demo {
    public static void main(String[] args) {
        DefaultConstructorV2 car1 = new DefaultConstructorV2();
        car1.passengers = 2;
        car1.wheels = 4;
        car1.maxspeed = 130;

        car1.printGreeting();
        car1.distance(1.30);

    }

}
