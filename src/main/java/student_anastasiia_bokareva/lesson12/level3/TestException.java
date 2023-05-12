package student_anastasiia_bokareva.lesson12.level3;

public class TestException extends Throwable {
    //class Main {
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
// Got the Test Exception
//Inside finally block

