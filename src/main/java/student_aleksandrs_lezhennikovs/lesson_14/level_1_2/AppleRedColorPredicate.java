package student_aleksandrs_lezhennikovs.lesson_14.level_1_2;

class AppleRedColorPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return "red".equals(apple.getColor());
    }
}
