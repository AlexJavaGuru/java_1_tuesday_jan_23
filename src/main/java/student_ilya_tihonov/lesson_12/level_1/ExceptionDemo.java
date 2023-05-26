package student_ilya_tihonov.lesson_12.level_1;

public class ExceptionDemo {

    public static void main(String[] args) {

        try {
            Exception exception1 = new Exception();
            throw exception1;
        } catch (
                Exception e) {
        }

        try {
            Exception exception2 = new Exception("Wrong username or password");
            throw exception2;
        } catch (
                Exception e) {
            System.out.println("Error: " + e);
        }


        try {
            RuntimeException runtimeException1 = new RuntimeException();
            throw runtimeException1;
        } catch (
                RuntimeException e) {
        }

        try {
            RuntimeException runtimeException2 = new RuntimeException("Division by zero");
            throw runtimeException2;
        } catch (
                RuntimeException e) {
            System.out.println("Error: " + e);
        }

    }
}
