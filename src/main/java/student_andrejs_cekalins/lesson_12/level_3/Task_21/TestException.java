package student_andrejs_cekalins.lesson_12.level_3.Task_21;

public class TestException extends Exception{
    public static void main(String[] args) {
        try {
            throw new TestException();
        } catch(TestException t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }
}
// A Finally block is useful for running any code that must execute even if there is an exception.