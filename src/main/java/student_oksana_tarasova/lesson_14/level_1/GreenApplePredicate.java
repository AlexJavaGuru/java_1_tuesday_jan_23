package student_oksana_tarasova.lesson_14.level_1;

public class GreenApplePredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
       return "green".equals(apple.getColor());
    }
}
