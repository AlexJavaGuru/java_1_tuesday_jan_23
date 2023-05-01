package student_vladislav_romanov.lesson_14.level_1_2;

import java.util.function.Predicate;

@FunctionalInterface
public interface FruitPredicate extends Predicate<Apple> {

    @Override
    boolean test(Apple apple);

}
