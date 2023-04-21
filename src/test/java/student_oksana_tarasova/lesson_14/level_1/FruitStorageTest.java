package student_oksana_tarasova.lesson_14.level_1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

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
    void testFindApples() {
        List<Apple> actual = fruitStorage.findApples(new GreenApplePredicate());
        assertThat(actual).hasSize(3);
        assertThat(actual).contains(new Apple("green", 200));
        assertThat(actual).contains(new Apple("green", 90));
        assertThat(actual).contains(new Apple("green", 50));
    }

    @Test
    void testFindApples1() {
        List<Apple> actual = fruitStorage.findApples(new AppleRedColorPredicate());
        assertThat(actual).hasSize(3);
        assertThat(actual).contains(new Apple("red", 100));
        assertThat(actual).contains(new Apple("red", 160));
        assertThat(actual).contains(new Apple("red", 200));
    }

    @Test
    void testFindApples2() {
        List<Apple> actual = fruitStorage.findApples(new AppleHeavyWeightPredicate());
        assertThat(actual).hasSize(4);
        assertThat(actual).contains(new Apple("red", 200));
        assertThat(actual).contains(new Apple("red", 160));
        assertThat(actual).contains(new Apple("green", 200));
        assertThat(actual).contains(new Apple("yellow", 170));
    }

    @Test
    void testFindApples3() {
        List<Apple> actual = fruitStorage.findApples(new AppleLightWeightPredicate());
        assertThat(actual).hasSize(4);
        assertThat(actual).contains(new Apple("green", 90));
        assertThat(actual).contains(new Apple("green", 50));
        assertThat(actual).contains(new Apple("yellow", 50));
        assertThat(actual).contains(new Apple("red", 100));
    }

    @AfterEach
    void cleanStorage() {
        fruitStorage = new FruitStorage(new ArrayList<>());
    }

}