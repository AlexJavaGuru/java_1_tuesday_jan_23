package teacher.lesson_12_exceptions.lessoncode;

public class TokenInvalidException extends RuntimeException {

    public TokenInvalidException() {
    }

    public TokenInvalidException(String message) {
        super(message);
    }
}
