package student_oleg_gryazev._lesson_3.level_7.task_29;

import java.util.Random;

public class DemoTrafficLightControlsTheCar {

    public static void main(String[] args) {
        DemoTrafficLightControlsTheCar demo = new DemoTrafficLightControlsTheCar();
        demo.workOfTrafficLight();
    }

    int carPositionAtTrafilight() {
        Random random = new Random();

        return random.nextInt(90);
    }

    int positionOfTrafficLight() {    // for latest development, dependence of car speed.
        Random random = new Random();

        return random.nextInt(90);
    }

    TrafficLightControlsTheCar car = new TrafficLightControlsTheCar();

    void workOfTrafficLight() {
        int mirrorCarPosition = carPositionAtTrafilight();
        if (mirrorCarPosition <= 5 || (mirrorCarPosition >= 54 && mirrorCarPosition <= 60)) {
            System.out.println("Yellow is blinking");
        } else if ((mirrorCarPosition < 24 && mirrorCarPosition > 6) || (mirrorCarPosition >= 60 && mirrorCarPosition <= 75)) {
            System.out.println("Wait");
        } else if (mirrorCarPosition < 30 && mirrorCarPosition > 24) {
            System.out.println("Yellow is blinking");
        }

        if (mirrorCarPosition <= 5) {
            car.trafficLightIsYellowReadyToStop();
            car.carSlowDown();

        } else if (mirrorCarPosition < 24 && mirrorCarPosition > 6) {
            car.trafficLightYellow();

        } else if (mirrorCarPosition < 30 && mirrorCarPosition > 24) {
            car.trafficLightIsYellowReadyToMove();


        } else if (mirrorCarPosition > 30 && mirrorCarPosition < 55) {
            car.trafficLightGreen();
            car.carGo();

        } else if (mirrorCarPosition >= 54 && mirrorCarPosition <= 60) {
            car.trafficLightIsYellowReadyToStop();
            car.carSlowDown();
        } else if (mirrorCarPosition >= 60 && mirrorCarPosition <= 75) {
            car.trafficLightYellow();

        } else if (mirrorCarPosition > 75) {
            car.trafficLightRed();
            car.urgentBrake();
        } else System.out.println("Traffic Light Does not work");
        //return mirrorCarPosition;
    }

}
