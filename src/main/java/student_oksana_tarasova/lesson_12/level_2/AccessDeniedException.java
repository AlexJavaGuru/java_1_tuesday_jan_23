package student_oksana_tarasova.lesson_12.level_2;


class AccessDeniedException extends Exception {

    Role role;

    public AccessDeniedException(String message) {
        super(message);

    }


}
