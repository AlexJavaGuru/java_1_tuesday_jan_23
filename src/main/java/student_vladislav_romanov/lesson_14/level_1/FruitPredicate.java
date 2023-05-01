package student_vladislav_romanov.lesson_14.level_1;

import java.util.function.Predicate;

public interface FruitPredicate extends Predicate<Apple> {

    @Override
    boolean test(Apple apple);

}
