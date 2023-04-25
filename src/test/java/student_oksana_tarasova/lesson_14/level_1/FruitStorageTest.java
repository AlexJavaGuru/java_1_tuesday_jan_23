package student_oksana_tarasova.lesson_14.level_1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FruitStorageTest {
    FruitStorage fruitStorage;

    @BeforeEach
    void setUp() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        fruitStorage = new FruitStorage(apples);
    }

    @Test
    void testAddNewFruit() {
       fruitStorage.addNewFruit(new Apple("red", 150));
       List<Apple> actual = fruitStorage.getAllApples();
        assertThat(actual).contains(new Apple("red", 150));
    }

    @Test
    void testGetApplesByApples() {
        List<Apple> actual = fruitStorage.getApplesByApples("green");
        assertThat(actual).hasSize(3);
        assertThat(actual).contains(new Apple("green", 200));
        assertThat(actual).contains(new Apple("green", 90));
        assertThat(actual).contains(new Apple("green", 50));
    }

    @Test
    void testGetApplesByWeight() {
        List<Apple> actual = fruitStorage.getApplesByWeight(150);
        assertThat(actual).hasSize(4);
        assertThat(actual).contains(new Apple("red", 200));
        assertThat(actual).contains(new Apple("red", 160));
        assertThat(actual).contains(new Apple("green", 200));
        assertThat(actual).contains(new Apple("yellow", 170));
    }

    @Test
    void testFindApplesGreen() {
        List<Apple> actual = fruitStorage.findApples(new GreenApplePredicate());
        assertThat(actual).hasSize(3);
        assertThat(actual).contains(new Apple("green", 200));
        assertThat(actual).contains(new Apple("green", 90));
        assertThat(actual).contains(new Apple("green", 50));
    }

    @Test
    void testFindApplesRed() {
        List<Apple> actual = fruitStorage.findApples(new AppleRedColorPredicate());
        assertThat(actual).hasSize(3);
        assertThat(actual).contains(new Apple("red", 100));
        assertThat(actual).contains(new Apple("red", 160));
        assertThat(actual).contains(new Apple("red", 200));
    }

    @Test
    void testFindApplesHeavyWeight() {
        List<Apple> actual = fruitStorage.findApples(new AppleHeavyWeightPredicate());
        assertThat(actual).hasSize(4);
        assertThat(actual).contains(new Apple("red", 200));
        assertThat(actual).contains(new Apple("red", 160));
        assertThat(actual).contains(new Apple("green", 200));
        assertThat(actual).contains(new Apple("yellow", 170));
    }

    @Test
    void testFindApplesLightWeight() {
        List<Apple> actual = fruitStorage.findApples(new AppleLightWeightPredicate());
        assertThat(actual).hasSize(4);
        assertThat(actual).contains(new Apple("green", 90));
        assertThat(actual).contains(new Apple("green", 50));
        assertThat(actual).contains(new Apple("yellow", 50));
        assertThat(actual).contains(new Apple("red", 100));
    }

    @Test
    void testFindApplesGreenAndHeavyWeight() {
        List<Apple> actual = fruitStorage.findApples(new SearchCriteriaPredicate(new GreenApplePredicate(), new AppleHeavyWeightPredicate()));
        assertThat(actual).hasSize(1);
        assertThat(actual).contains(new Apple("green", 200));

    }

    @Test
    void testFindApplesGreenAndLightWeight() {
        ApplePredicate applePredicate = new SearchCriteriaPredicate(new GreenApplePredicate(), new AppleLightWeightPredicate());
        List<Apple> actual = fruitStorage.findApples(applePredicate);
        assertThat(actual).hasSize(2);
        assertThat(actual).contains(new Apple("green", 90));
        assertThat(actual).contains(new Apple("green", 50));

    }

    @Test
    void testFindApplesGreen1() {
        List<Apple> actual = fruitStorage.findApples(new GreenApplePredicate() {
            public boolean test(Apple apple) {
                return "green".equals(apple.getColor());
            }
        });
        assertThat(actual).hasSize(3);
        assertThat(actual).contains(new Apple("green", 200));
        assertThat(actual).contains(new Apple("green", 90));
        assertThat(actual).contains(new Apple("green", 50));

    }

    @Test
    void testFindApplesRed1() {
        List<Apple> actual = fruitStorage.findApples(new AppleRedColorPredicate() {
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        });
        assertThat(actual).hasSize(3);
        assertThat(actual).contains(new Apple("red", 100));
        assertThat(actual).contains(new Apple("red", 160));
        assertThat(actual).contains(new Apple("red", 200));

    }

    @Test
    void testFindApplesHeavyWeight1() {
        List<Apple> actual = fruitStorage.findApples(new AppleHeavyWeightPredicate() {
            public boolean test(Apple apple) {
                return apple.getWeight() > 150;
            }
        });
        assertThat(actual).hasSize(4);
        assertThat(actual).contains(new Apple("red", 200));
        assertThat(actual).contains(new Apple("red", 160));
        assertThat(actual).contains(new Apple("green", 200));
        assertThat(actual).contains(new Apple("yellow", 170));
    }

    @Test
    void testFindApplesLightWeight1() {
        List<Apple> actual = fruitStorage.findApples(new AppleLightWeightPredicate() {
            public boolean test(Apple apple) {
                return apple.getWeight() < 150;
            }
        });
        assertThat(actual).hasSize(4);
        assertThat(actual).contains(new Apple("green", 90));
        assertThat(actual).contains(new Apple("green", 50));
        assertThat(actual).contains(new Apple("yellow", 50));
        assertThat(actual).contains(new Apple("red", 100));
    }

    @Test
    void testFindApplesGreenLambda() {
        List<Apple> actual = fruitStorage.findApples(
                (Apple apple) -> "green".equals(apple.getColor()));
        assertThat(actual).hasSize(3);
        assertThat(actual).contains(new Apple("green", 200));
        assertThat(actual).contains(new Apple("green", 90));
        assertThat(actual).contains(new Apple("green", 50));

    }

    @Test
    void testFindApplesRedLambda() {
        List<Apple> actual = fruitStorage.findApples(
          (Apple apple) -> "red".equals(apple.getColor()));
        assertThat(actual).hasSize(3);
        assertThat(actual).contains(new Apple("red", 100));
        assertThat(actual).contains(new Apple("red", 160));
        assertThat(actual).contains(new Apple("red", 200));

    }

    @Test
    void testFindApplesLightWeightLambda() {
        List<Apple> actual = fruitStorage.findApples(
                (Apple apple) -> apple.getWeight() < 150);
        assertThat(actual).hasSize(4);
        assertThat(actual).contains(new Apple("green", 90));
        assertThat(actual).contains(new Apple("green", 50));
        assertThat(actual).contains(new Apple("yellow", 50));
        assertThat(actual).contains(new Apple("red", 100));
    }

    @Test
    void testFindApplesHeavyWeightLambda() {
        List<Apple> actual = fruitStorage.findApples(
               (Apple apple) -> apple.getWeight() > 150);
        assertThat(actual).hasSize(4);
        assertThat(actual).contains(new Apple("red", 200));
        assertThat(actual).contains(new Apple("red", 160));
        assertThat(actual).contains(new Apple("green", 200));
        assertThat(actual).contains(new Apple("yellow", 170));
    }

    @Test
    void testFindApplesGreenAndHeavyWeightLambda() {
        List<Apple> actual = fruitStorage.findApples(
                (Apple apple) -> apple.getWeight() > 150 &&
                "green".equals(apple.getColor()));
        assertThat(actual).hasSize(1);
        assertThat(actual).contains(new Apple("green", 200));

    }


    @AfterEach
    void cleanStorage() {
        fruitStorage = new FruitStorage(new ArrayList<>());
    }

}
/*

 */