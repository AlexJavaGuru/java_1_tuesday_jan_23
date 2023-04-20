package student_anastasiia_bokareva.lesson9.level2;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {
    private DayOfTheWeekDetector dayDetector;

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayDetector) {
        this.dayDetector = dayDetector;
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number - ");
        System.out.print(dayDetector.detectDayName(scanner.nextInt()));
        System.out.println("");
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo demoVersion = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorVersion());
        DayOfTheWeekDetectorDemo demoCase = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorCase());
        DayOfTheWeekDetectorDemo demoMass = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorMass());

        demoVersion.run();
        demoCase.run();
        demoMass.run();

    }

}
