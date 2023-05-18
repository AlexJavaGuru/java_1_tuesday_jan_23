package student_aleksandrs_lezhennikovs.lesson_14.level_1_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FruitStorageTest {
    private FruitStorage fruitStorage;

    @BeforeEach
    void setUp() {
        fruitStorage = new FruitStorage();
        fruitStorage.getAllApples();
    }

    @Test
    void testGetAllGreenApples() {
        List<Apple> expect = new ArrayList<>(List.of(
                new Apple("green", 200),
                new Apple("green", 90),
                new Apple("green", 50)));
        List<Apple> greenApples = fruitStorage.findGreenApples();
        assertThat(expect).isEqualTo(greenApples);
    }

    @Test
    void testGetAllRedApples() {
        List<Apple> expect = new ArrayList<>(List.of(
                new Apple("red", 100),
                new Apple("red", 160),
                new Apple("red", 200)
        ));
        List<Apple> redApples = fruitStorage.findRedApples();
        assertThat(expect).isEqualTo(redApples);
    }

    @Test
    void testHeavyApples() {
        List<Apple> expect = new ArrayList<>(List.of(
                new Apple("red", 160),
                new Apple("red", 200),
                new Apple("green", 200),
                new Apple("yellow", 170)
        ));
        List<Apple> heavyApples = fruitStorage.findHeavyApples(155);
        assertThat(expect).isEqualTo(heavyApples);
    }

    @Test
    void testLightApples() {
        List<Apple> expect = new ArrayList<>(List.of(
                new Apple("red", 100),
                new Apple("green", 90),
                new Apple("green", 50),
                new Apple("yellow", 50)
        ));
        List<Apple> lightApples = fruitStorage.findLightApples(150);
        assertThat(expect).isEqualTo(lightApples);
    }

    @Test
    void testGetAllGreenApplesPredicate() {
        List<Apple> expect = new ArrayList<>(List.of(
                new Apple("green", 200),
                new Apple("green", 90),
                new Apple("green", 50)));
        List<Apple> greenApples = fruitStorage.findApples(new AppleGreenColorPredicate());
        assertThat(expect).isEqualTo(greenApples);
    }

    @Test
    void testGetAllRedApplesPredicate() {
        List<Apple> expect = new ArrayList<>(List.of(
                new Apple("red", 100),
                new Apple("red", 160),
                new Apple("red", 200)
        ));
        List<Apple> redApples = fruitStorage.findApples(new AppleRedColorPredicate());
        assertThat(expect).isEqualTo(redApples);
    }

    @Test
    void testHeavyApplesPredicate() {
        List<Apple> expect = new ArrayList<>(List.of(
                new Apple("red", 160),
                new Apple("red", 200),
                new Apple("green", 200),
                new Apple("yellow", 170)
        ));
        List<Apple> heavyApples = fruitStorage.findApples(new AppleHeavyWeightPredicate());
        assertThat(expect).isEqualTo(heavyApples);
    }

    @Test
    void testLightApplesPredicate() {
        List<Apple> expect = new ArrayList<>(List.of(
                new Apple("red", 100),
                new Apple("green", 90),
                new Apple("green", 50),
                new Apple("yellow", 50)
        ));
        List<Apple> lightApples = fruitStorage.findApples(new AppleLightWeightPredicate());
        assertThat(expect).isEqualTo(lightApples);
    }

    @Test
    void testGreenHeavyApplesPredicate() {
        List<Apple> expect = new ArrayList<>(List.of(
                new Apple("green", 200)
        ));
        List<Apple> calculate = fruitStorage.findApples(new AppleGreenAndHeavyWeightPredicate());
        assertThat(expect).isEqualTo(calculate);
    }
}