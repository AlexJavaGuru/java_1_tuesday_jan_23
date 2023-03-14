package student_anastasiia_bokareva.lesson6.level2;
import java.util.Scanner;

public class DayOfTheWeekDetector {

    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber) {
        String dayOfWeek;
        switch (dayNumber){
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek="Wednesday";
                break;
            case 4:
                dayOfWeek="Thursday";
                break;
            case 5:
                dayOfWeek="Friday";
                break;
            case 6:
                dayOfWeek="Saturday";
                break;
            case 7:
                dayOfWeek="Sunday";
                break;
            default:
               dayOfWeek="Not correct day number";
         }
         return dayOfWeek;
    }
}
