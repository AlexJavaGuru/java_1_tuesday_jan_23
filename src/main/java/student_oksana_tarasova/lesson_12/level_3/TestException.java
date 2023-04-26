package student_oksana_tarasova.lesson_12.level_3;

public class TestException extends Exception {

    //  class Main {
        public static void main(String args[]) {
            try {
                throw new TestException();
            } catch (TestException t) {
                System.out.println("Got the Test Exception");
            } finally {
                System.out.println("Inside finally block ");
            }
        }
  //  }
}
/*

Если не убрать класс Main, то код не компелируется.
иначе:
Got the Test Exception
Inside finally block
 */
