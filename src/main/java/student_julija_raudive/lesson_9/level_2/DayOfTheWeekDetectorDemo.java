package student_julija_raudive.lesson_9.level_2;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

     DayOfTheWeekDetector day;

     public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector day) {
        this.day = day;
     }

     void run(){
        String result = day.detectDayName(dayNumber());
        printResult(result);

     }

     void printResult(String result){
         System.out.println(result);
     }

     private int dayNumber() {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Input number from 1 to 7:");
         return scanner.nextInt();

     }

     public static void main(String[] args) {

         DayOfTheWeekDetectorDemo dayOfTheWeekIfVersion = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
         dayOfTheWeekIfVersion.run();

         DayOfTheWeekDetectorDemo dayOfTheWeekSwitchVersion = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
         dayOfTheWeekSwitchVersion.run();

     }
 }
