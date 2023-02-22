package student_julija_raudive.lesson_4.level_7;

 class LeapYearTest {

     private LeapYear year = new LeapYear();

     public static void main(String[] args) {
         LeapYearTest test = new LeapYearTest();
         test.divByFour();
         test.divByHundred();
         test.divByFourHundred();
         test.other();


     }


     public void divByFour(){
         boolean result = year.isLeapYear(1050);
         checkResults(!result, "Div by 4 test");
     }

     public void divByHundred(){
         boolean result = year.isLeapYear(2036);
         checkResults(result, "Div by 100 test");
     }

     public void divByFourHundred(){
         boolean result = year.isLeapYear(2000);
         checkResults(result, "Div by 400 test");
     }

     public void other(){
         boolean result = year.isLeapYear(1400);
         checkResults(!result, "Other test");
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
