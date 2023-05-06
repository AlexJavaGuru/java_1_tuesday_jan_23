package student_andrejs_cekalins.lesson_12.level_3.Task_18;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String name = null;
        if (name.equals("Andrej")) {
            System.out.println("");
        }
        Long Id = null;
        System.out.println(Id.toString());
    }
}

// The NullPointerException occurs due to a situation in application code where an uninitialized object
// is attempted to be accessed or modified.
// Essentially, this means the object reference does not point anywhere and has a null value.