package student_andrejs_cekalins.lesson_12.level_3.Task_20;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {

        } catch (ArithmeticException a) {

        } catch (Exception e) {

        }
    }
}

// The catch block that catches the ArithmeticException should be placed before the catch block catching the Exception.
// Since Exception is the superclass of all the exception classes,
// if you place the catch block that catches it earlier to the catch blocks catching any other exceptions,
// all exceptions are handled in the Exception block itself making the remaining blocks unreachable.