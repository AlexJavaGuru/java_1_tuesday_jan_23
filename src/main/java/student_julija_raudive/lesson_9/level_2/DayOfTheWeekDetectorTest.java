package student_julija_raudive.lesson_9.level_2;

 class DayOfTheWeekDetectorTest {

     DayOfTheWeekDetectorIfVersion ifVersion =  new DayOfTheWeekDetectorIfVersion();
     DayOfTheWeekDetectorSwitchVersion switchVersion = new DayOfTheWeekDetectorSwitchVersion();

     public static void main(String[] args) {
         DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
         test.tuesdayIfVersionTest();
         test.fridayIfVersionTest();
         test.ElseIfVersionTest();
         test.tuesdaySwitchVersionTest();
         test.WednesdaySwitchVersionTest();
         test.defaultSwitchVersionTest();

     }

     public void tuesdayIfVersionTest(){
         String expectedResult = "Tuesday";
         String result =  ifVersion.detectDayName(2);
         checkResults(expectedResult==result, "Tuesday (if version) test");

     }

     public void fridayIfVersionTest(){
         String expectedResult = "Friday";
         String result =  ifVersion.detectDayName(5);
         checkResults(expectedResult==result, "Friday (if version) test");

     }

     public void ElseIfVersionTest(){
         String expectedResult = "Please input a valid number between 1 and 7";
         String result =  ifVersion.detectDayName(8);
         checkResults(expectedResult==result, "Else number (if version) test");

     }

     public void tuesdaySwitchVersionTest(){
         String expectedResult = "Tuesday";
         String result =  switchVersion.detectDayName(2);
         checkResults(expectedResult==result, "Tuesday (switch version) test");
     }

     public void WednesdaySwitchVersionTest(){
         String expectedResult = "Wednesday";
         String result =  switchVersion.detectDayName(3);
         checkResults(expectedResult==result, "Wednesday (switch version) test");
     }

     public void defaultSwitchVersionTest(){
         String expectedResult = "Please input a valid number between 1 and 7";
         String result =  switchVersion.detectDayName(8);
         checkResults(expectedResult==result, "Else number (switch version) test");

     }

     private void checkResults(boolean condition, String testName) {
         if (condition) {
             System.out.println(testName + " = OK");
         }
         else {
             System.out.println(testName + " = FAIL");
         }
     }
}
