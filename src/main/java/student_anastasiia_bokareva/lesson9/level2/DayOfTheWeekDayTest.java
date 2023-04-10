package student_anastasiia_bokareva.lesson9.level2;

public class DayOfTheWeekDayTest {
    public static void main(String[] args) {
        DayOfTheWeekDayTest test = new DayOfTheWeekDayTest();

        test.space();

        test.checkMondayFromVersion();
        test.checkTuesdayFromVersion();
        test.checkWednesdayFromVersion();
        test.checkThursdayFromVersion();
        test.checkFridayFromVersion();
        test.checkSaturdayFromVersion();
        test.checkSundayFromVersion();
        test.checkNotDayFromVersion();

        test.space();

        test.checkMondayFromMass();
        test.checkTuesdayFromMass();
        test.checkWednesdayFromMass();
        test.checkThursdayFromMass();
        test.checkFridayFromMass();
        test.checkSaturdayFromMass();
        test.checkSundayFromMass();
        test.checkNotDayFromMass();

        test.space();

        test.checkMondayFromCase();
        test.checkTuesdayFromCase();
        test.checkWednesdayFromCase();
        test.checkThursdayFromCase();
        test.checkFridayFromCase();
        test.checkSaturdayFromCase();
        test.checkSundayFromCase();
        test.checkNotDayFromCase();


    }

    public void checkMondayFromVersion (){
        DayOfTheWeekDetectorVersion version = new DayOfTheWeekDetectorVersion();
        String realResult = version.detectDayName(1);
        String expectedResult = "Monday";
        check(realResult,expectedResult,"Monday","Version");

    }

    public void checkTuesdayFromVersion (){
        DayOfTheWeekDetectorVersion version = new DayOfTheWeekDetectorVersion();
        String realResult = version.detectDayName(2);
        String expectedResult = "Tuesday";
        check(realResult,expectedResult,"Tuesday","Version");

    }

    public void checkWednesdayFromVersion (){
        DayOfTheWeekDetectorVersion version = new DayOfTheWeekDetectorVersion();
        String realResult = version.detectDayName(3);
        String expectedResult = "Wednesday";
        check(realResult,expectedResult,"Wednesday","Version");

    }

    public void checkThursdayFromVersion (){
        DayOfTheWeekDetectorVersion version = new DayOfTheWeekDetectorVersion();
        String realResult = version.detectDayName(4);
        String expectedResult = "Thursday";
        check(realResult,expectedResult,"Thursday","Version");

    }

    public void checkFridayFromVersion (){
        DayOfTheWeekDetectorVersion version = new DayOfTheWeekDetectorVersion();
        String realResult = version.detectDayName(5);
        String expectedResult = "Friday";
        check(realResult,expectedResult,"Friday","Version");

    }

    public void checkSaturdayFromVersion (){
        DayOfTheWeekDetectorVersion version = new DayOfTheWeekDetectorVersion();
        String realResult = version.detectDayName(6);
        String expectedResult = "Saturday";
        check(realResult,expectedResult,"Saturday","Version");

    }

    public void checkSundayFromVersion () {
        DayOfTheWeekDetectorVersion version = new DayOfTheWeekDetectorVersion();
        String realResult = version.detectDayName(7);
        String expectedResult = "Sunday";
        check(realResult, expectedResult, "Sunday","Version");
    }

    public void checkNotDayFromVersion (){
        DayOfTheWeekDetectorVersion version = new DayOfTheWeekDetectorVersion();
        String realResult = version.detectDayName(8);
        String expectedResult = "Please input a valid number between 1 and 7";
        check(realResult,expectedResult,"Please input a valid number between 1 and 7","Version");

    }

    public void space(){
        System.out.println("");
    }

    void check (String expectedResult, String realResult, String testName,String version){
        if (expectedResult==realResult){
            System.out.println("Test "+ testName+" from "+ version +  " is ok!");
        } else {
            System.out.println("Test "+testName+ " is fail!");
        }
    }

    public void checkMondayFromMass (){
        DayOfTheWeekDetectorMass version = new DayOfTheWeekDetectorMass();
        String realResult = version.detectDayName(1);
        String expectedResult = "Monday";
        check(realResult,expectedResult,"Monday","Array");

    }

    public void checkTuesdayFromMass (){
        DayOfTheWeekDetectorMass version = new DayOfTheWeekDetectorMass();
        String realResult = version.detectDayName(2);
        String expectedResult = "Tuesday";
        check(realResult,expectedResult,"Tuesday","Array");

    }

    public void checkWednesdayFromMass (){
        DayOfTheWeekDetectorMass version = new DayOfTheWeekDetectorMass();
        String realResult = version.detectDayName(3);
        String expectedResult = "Wednesday";
        check(realResult,expectedResult,"Wednesday","Array");

    }

    public void checkThursdayFromMass (){
        DayOfTheWeekDetectorMass version = new DayOfTheWeekDetectorMass();
        String realResult = version.detectDayName(4);
        String expectedResult = "Thursday";
        check(realResult,expectedResult,"Thursday","Array");

    }

    public void checkFridayFromMass (){
        DayOfTheWeekDetectorMass version = new DayOfTheWeekDetectorMass();
        String realResult = version.detectDayName(5);
        String expectedResult = "Friday";
        check(realResult,expectedResult,"Friday","Array");

    }

    public void checkSaturdayFromMass (){
        DayOfTheWeekDetectorMass version = new DayOfTheWeekDetectorMass();
        String realResult = version.detectDayName(6);
        String expectedResult = "Saturday";
        check(realResult,expectedResult,"Saturday","Array");

    }

    public void checkSundayFromMass () {
        DayOfTheWeekDetectorMass version = new DayOfTheWeekDetectorMass();
        String realResult = version.detectDayName(7);
        String expectedResult = "Sunday";
        check(realResult, expectedResult, "Sunday","Array");
    }

    public void checkNotDayFromMass (){
        DayOfTheWeekDetectorMass version = new DayOfTheWeekDetectorMass();
        String realResult = version.detectDayName(8);
        String expectedResult = "Please input a valid number between 1 and 7";
        check(realResult,expectedResult,"Please input a valid number between 1 and 7","Array");

    }

    public void checkMondayFromCase (){
        DayOfTheWeekDetectorCase version = new DayOfTheWeekDetectorCase();
        String realResult = version.detectDayName(1);
        String expectedResult = "Monday";
        check(realResult,expectedResult,"Monday","Case");

    }

    public void checkTuesdayFromCase (){
        DayOfTheWeekDetectorCase version = new DayOfTheWeekDetectorCase();
        String realResult = version.detectDayName(2);
        String expectedResult = "Tuesday";
        check(realResult,expectedResult,"Tuesday","Case");

    }

    public void checkWednesdayFromCase (){
        DayOfTheWeekDetectorCase version = new DayOfTheWeekDetectorCase();
        String realResult = version.detectDayName(3);
        String expectedResult = "Wednesday";
        check(realResult,expectedResult,"Wednesday","Case");

    }

    public void checkThursdayFromCase (){
        DayOfTheWeekDetectorCase version = new DayOfTheWeekDetectorCase();
        String realResult = version.detectDayName(4);
        String expectedResult = "Thursday";
        check(realResult,expectedResult,"Thursday","Case");

    }

    public void checkFridayFromCase (){
        DayOfTheWeekDetectorCase version = new DayOfTheWeekDetectorCase();
        String realResult = version.detectDayName(5);
        String expectedResult = "Friday";
        check(realResult,expectedResult,"Friday","Case");

    }

    public void checkSaturdayFromCase (){
        DayOfTheWeekDetectorCase version = new DayOfTheWeekDetectorCase();
        String realResult = version.detectDayName(6);
        String expectedResult = "Saturday";
        check(realResult,expectedResult,"Saturday","Case");

    }

    public void checkSundayFromCase () {
        DayOfTheWeekDetectorCase version = new DayOfTheWeekDetectorCase();
        String realResult = version.detectDayName(7);
        String expectedResult = "Sunday";
        check(realResult, expectedResult, "Sunday","Case");
    }

    public void checkNotDayFromCase (){
        DayOfTheWeekDetectorCase version = new DayOfTheWeekDetectorCase();
        String realResult = version.detectDayName(8);
        String expectedResult = "Please input a valid number between 1 and 7";
        check(realResult,expectedResult,"Please input a valid number between 1 and 7","Case");

    }
}
