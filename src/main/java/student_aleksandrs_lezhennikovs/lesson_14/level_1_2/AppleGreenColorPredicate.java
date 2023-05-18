package student_aleksandrs_lezhennikovs.lesson_14.level_1_2;

class AppleGreenColorPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return "green".equals(apple.getColor());
    }
}
