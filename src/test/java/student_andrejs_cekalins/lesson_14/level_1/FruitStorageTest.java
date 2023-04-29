package student_andrejs_cekalins.lesson_14.level_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import student_andrejs_cekalins.lesson_14.level_1_2.*;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FruitStorageTest {
    FruitStorage fruitStorage;
    List<Apple> apples;


    @BeforeEach
    void setUp() {
        apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        fruitStorage = new FruitStorage(apples);
    }

    @Test
    void getAllApples() {
        List<Apple> actual = fruitStorage.getAllApples();
        assertThat(actual).hasSize(8);
        assertThat(actual).contains(new Apple("red", 100));
        assertThat(actual).contains(new Apple("yellow", 170));
    }

    @Test
    void getAllGreenApples() {
        List<Apple> actual = fruitStorage.getAnyColourApples("green");
        assertThat(actual).hasSize(3);
        assertThat(actual).contains(
                new Apple("green", 200),
                new Apple("green", 90),
                new Apple("green", 90)
        );
    }

    @Test
    void getAllRedApples() {
        List<Apple> actual = fruitStorage.getAnyColourApples("red");
        assertThat(actual).hasSize(3);
        assertThat(actual).contains(
                new Apple("red", 100),
                new Apple("red", 160),
                new Apple("red", 200)
        );
    }

    @Test
    void getApplesByWeight() {
        List<Apple> actual = fruitStorage.getApplesByWeight(150);
        assertThat(actual).hasSize(4);
        assertThat(actual).contains(
                new Apple("red", 200),
                new Apple("red", 160),
                new Apple("green", 200),
                new Apple("yellow", 170)
        );
    }

    //Predicate function tests:

    @Test
    void findApplesRed() {
        List<Apple> actual = fruitStorage.findApples(new AppleRedColorPredicate());
        assertThat(actual).hasSize(3);
        assertThat(actual).contains(
                new Apple("red", 100),
                new Apple("red", 160),
                new Apple("red", 200)
        );
    }

    @Test
    void findApplesGreen() {
        List<Apple> actual = fruitStorage.findApples(new AppleGreenColorPredicate());
        assertThat(actual).hasSize(3);
        assertThat(actual).contains(
                new Apple("green", 200),
                new Apple("green", 90),
                new Apple("green", 90)
        );
    }

    @Test
    void findHeavyWeightApples() {
        List<Apple> actual = fruitStorage.findApples(new AppleHeavyWeightPredicate());
        assertThat(actual).hasSize(4);
        assertThat(actual).contains(
                new Apple("red", 200),
                new Apple("red", 160),
                new Apple("green", 200),
                new Apple("yellow", 170)
        );
    }

    @Test
    void findLightWeightApples() {
        List<Apple> actual = fruitStorage.findApples(new AppleLightWeightPredicate());
        assertThat(actual).hasSize(4);
        assertThat(actual).contains(
                new Apple("red", 100),
                new Apple("green", 90),
                new Apple("green", 90),
                new Apple("yellow", 50)
        );
    }

    @Test
    void findGreenColorHeavyWeightApples() {
        List<Apple> actual = fruitStorage.findApples(new AppleGreenColorHeavyWeightPredicate());
        assertThat(actual).hasSize(1);
        assertThat(actual).contains(
                new Apple("green", 200)

        );
    }

    // Lambda:

    @Test
    void findApplesRedLambda() {
        List<Apple> actual = fruitStorage.findApples(
                (Apple apple) -> "red".equals(apple.getColor())
        );
        assertThat(actual).hasSize(3);
        assertThat(actual).contains(
                new Apple("red", 100),
                new Apple("red", 160),
                new Apple("red", 200)
        );
    }

    @Test
    void findApplesGreenLambda() {
        List<Apple> actual = fruitStorage.findApples(
                (Apple apple) -> "green".equals(apple.getColor())
        );
        assertThat(actual).hasSize(3);
        assertThat(actual).contains(
                new Apple("green", 200),
                new Apple("green", 90),
                new Apple("green", 90)
        );
    }

    @Test
    void findHeavyWeightApplesLambda() {
        List<Apple> actual = fruitStorage.findApples(
                (Apple apple) -> apple.getWeight() > 150
        );
        assertThat(actual).hasSize(4);
        assertThat(actual).contains(
                new Apple("red", 200),
                new Apple("red", 160),
                new Apple("green", 200),
                new Apple("yellow", 170)
        );
    }

    @Test
    void findLightWeightApplesLambda() {
        List<Apple> actual = fruitStorage.findApples(
                (Apple apple) -> apple.getWeight() < 150
        );
        assertThat(actual).hasSize(4);
        assertThat(actual).contains(
                new Apple("red", 100),
                new Apple("green", 90),
                new Apple("green", 90),
                new Apple("yellow", 50)
        );
    }

    @Test
    void findGreenColorHeavyWeightApplesLambda() {
        List<Apple> actual = fruitStorage.findApples(
                (Apple apple) -> "green".equals(apple.getColor()) &&
                        apple.getWeight() > 150
        );
        assertThat(actual).hasSize(1);
        assertThat(actual).contains(
                new Apple("green", 200)

        );
    }
}