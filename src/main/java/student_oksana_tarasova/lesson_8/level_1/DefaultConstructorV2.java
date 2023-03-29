package student_oksana_tarasova.lesson_8.level_1;

class DefaultConstructorV2 {
    int passengers;
    int wheels;
    int maxspeed;

    void printGreeting() {
        System.out.println("Hello! My name is car!");
    }
     void distance(double interval) {
        double value = maxspeed * interval;
        System.out.println("Distance traveled = " + value + " km/h");
     }

}
