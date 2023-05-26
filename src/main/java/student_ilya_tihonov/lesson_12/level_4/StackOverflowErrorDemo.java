package student_ilya_tihonov.lesson_12.level_4;

public class StackOverflowErrorDemo {

    public static void recursiveMethod() {
        recursiveMethod();
    }

    public static void main(String[] args) {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("A StackOverflowError occurred: " + e.getMessage());
        }
    }

}
