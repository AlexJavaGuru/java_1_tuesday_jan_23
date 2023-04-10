package student_vladislav_romanov.lesson_9.level_2;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    private DayOfTheWeekDetector detector;

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorIfDemo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorSwitchDemo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorStringArrayDemo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorStringArrayVersion());

        dayOfTheWeekDetectorIfDemo.run();
        dayOfTheWeekDetectorSwitchDemo.run();
        dayOfTheWeekDetectorStringArrayDemo.run();
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of the day: ");
        System.out.println(detector.detectDayName(scanner.nextInt()));
    }

}
