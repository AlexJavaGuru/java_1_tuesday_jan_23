package student_ilya_tihonov.lesson_12.level_3;

public class TestException extends Exception {

    class Main {
        public static void main(String args[]) {
            try {
                throw new TestException();
            } catch (TestException t) {
                System.out.println("Got the Test Exception");
            } finally {
                System.out.println("Inside finally block ");
            }
        }
    }

}
//При выполнении данного кода, результат будет следующим:
//Got the Test Exception
//Inside finally block

