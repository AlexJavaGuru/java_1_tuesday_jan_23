package student_ilya_tihonov.lesson_9.level_2;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {

    private DayOfTheWeekDetector detector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    void run(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7: ");
        int number = scanner.nextInt();
        String dayName = detector.detectDayName(number);
        System.out.println(dayName);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        dayOfTheWeekDetectorIfVersion.run();

    }

}