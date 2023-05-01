package student_vladislav_romanov.lesson_14.level_1;

public class AppleFruitPredicate implements FruitPredicate {

    Color color;

    AppleFruitPredicate(Color color) {
        this.color = color;
    }

    @Override
    public boolean test(Apple apple) {
        return color.equals(apple.getColor());
    }

}
