package student_andrejs_cekalins.lesson_14.level_1_2;

public class AppleGreenColorHeavyWeightPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor()) &&
                apple.getWeight() > 150;
    }
}
