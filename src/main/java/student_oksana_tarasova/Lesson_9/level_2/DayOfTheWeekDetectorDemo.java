package student_oksana_tarasova.Lesson_9.level_2;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {
    DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    void run() {

        System.out.println(dayOfTheWeekDetector.detectDayName(getDayNumberFromUser()));
    }

    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        dayOfTheWeekDetectorDemo.run();
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo1 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekSwitch());
        dayOfTheWeekDetectorDemo.run();
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo2 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekArray());
        dayOfTheWeekDetectorDemo.run();
    }
}
