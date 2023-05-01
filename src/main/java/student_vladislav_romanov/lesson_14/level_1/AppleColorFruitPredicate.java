package student_vladislav_romanov.lesson_14.level_1;

public class AppleColorFruitPredicate implements FruitPredicate {

    private final Color color;

    AppleColorFruitPredicate(Color color) {
        this.color = color;
    }

    @Override
    public boolean test(Apple apple) {
        return color.equals(apple.getColor());
    }

}
