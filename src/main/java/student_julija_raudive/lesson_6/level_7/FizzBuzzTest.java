package student_julija_raudive.lesson_6.level_7;



class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

     public static void main(String[] args) {
         FizzBuzzTest test = new FizzBuzzTest();
         test.fizzTest();
         test.buzzTest();
         test.fizzBuzzTest();
         test.otherTest();

     }

     public void fizzTest(){
         String result = fizzBuzz.detect(6);
         checkResults(result.equals("Fizz"), "FizzTest");
     }

     public void buzzTest(){
         String result = fizzBuzz.detect(35);
         checkResults(result.equals("Buzz"), "BuzzTest");

     }

     public void fizzBuzzTest(){
         String result = fizzBuzz.detect(15);
         checkResults(result.equals("FizzBuzz"), "FizzBuzzTest");

     }

     public void otherTest(){
         String result = fizzBuzz.detect(19);
         checkResults(result.equals("19"), "OtherTest");
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
