package student_ilya_tihonov.lesson_12.level_2;

public class AccessDeniedException extends Exception {

    Role role;

    public AccessDeniedException(String message) {
        super(message);

    }
}
