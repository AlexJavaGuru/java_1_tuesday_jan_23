package student_oleg_gryazev._lesson_3;

import java.util.Random;

public class TrafficLightControlsTheCar {
    static int mirrorCarPosition;

    void carGo() {
        System.out.println("Go");
    }

    void carSlowDown() {
        System.out.println("Cars slowing down");
    }

    void urgentBrake() {
        System.out.println("Push the brake urgently !");
    }

    void trafficLightGreen() {
        System.out.println("Traffic light is green, drive is available.");
    }

    void trafficLightIsYellowReadyToStop() {
        System.out.println("Attention! Be ready to stop ");
    }

    void trafficLightIsYellowReadyToMove() {
        System.out.println("Attention! Be ready to move");
    }

    void trafficLightYellow() {
        System.out.println("Traffic light is yellow, don't move");
    }

    void trafficLightRed() {
        System.out.println("Traffic light is red, moving is restricted!");
    }

    void carPosition() {
        TrafficLightControlsTheCar traffic = new TrafficLightControlsTheCar();

        Random random = new Random();

        int i = random.nextInt(90);
        traffic.mirrorCarPosition = i;

        System.out.println(mirrorCarPosition);

    }

    void positionOfTrafficLight() {

        if (mirrorCarPosition <= 5) {
            trafficLightIsYellowReadyToStop();
            carSlowDown();

        } else if (mirrorCarPosition < 24 && mirrorCarPosition > 6) {
            trafficLightYellow();

        } else if (mirrorCarPosition < 30 && mirrorCarPosition > 24) {
            trafficLightIsYellowReadyToMove();


        } else if (mirrorCarPosition > 30 && mirrorCarPosition < 55) {
            trafficLightGreen();
            carGo();

        } else if (mirrorCarPosition >= 54 && mirrorCarPosition <= 60) {
            trafficLightIsYellowReadyToStop();
            carSlowDown();
        } else if (mirrorCarPosition >= 60 && mirrorCarPosition <= 75) {
            trafficLightYellow();

        } else if (mirrorCarPosition > 75) {
            trafficLightRed();
            urgentBrake();
        } else System.out.println("TrafficLight Does not work");
    }
}





