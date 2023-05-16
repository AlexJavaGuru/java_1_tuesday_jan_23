package student_natalja_semitseva.Lesson_9_Task_4_5;

import java.util.Scanner;


class DayOfTheWeekDetectorDemo {


    private DayOfTheWeekDetector detector;

    public void DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }


    public DayOfTheWeekDetectorDemo() {

    }

    public static void main(String[] args) {


        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo();
        dayOfTheWeekDetectorDemo.run();
    }

    String run() {
        String detectDayName = detector.detectDayName(input());
        return detectDayName;

    }


    int input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of the day: ");
        return scanner.nextInt();

    }

    void console() {
        System.out.println(run());
    }
}
