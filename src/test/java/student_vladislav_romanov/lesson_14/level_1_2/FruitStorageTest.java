package student_vladislav_romanov.lesson_14.level_1_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static student_vladislav_romanov.lesson_14.level_1_2.Color.*;
import static student_vladislav_romanov.lesson_14.level_1_2.Operation.*;

class FruitStorageTest {

    FruitStorage fruitStorage;

    @BeforeEach
    void setUp() {
        fruitStorage = new FruitStorage();
    }

    @Test
    void getApplesByCriteriaRedApples() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(RED, 100));
        expected.add(new Apple(RED, 160));
        expected.add(new Apple(RED, 200));
        List<Apple> actual = fruitStorage.getApplesByCriteria(RED);
        assertEquals(expected, actual);
    }

    @Test
    void getApplesByCriteriaYellowApples() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(YELLOW, 50));
        expected.add(new Apple(YELLOW, 170));
        List<Apple> actual = fruitStorage.getApplesByCriteria(YELLOW);
        assertEquals(expected, actual);
    }

    @Test
    void getApplesByCriteriaWeightMoreOrEquals150() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(RED, 160));
        expected.add(new Apple(RED, 200));
        expected.add(new Apple(GREEN, 200));
        expected.add(new Apple(YELLOW, 170));
        List<Apple> actual = fruitStorage.getApplesByCriteria(150, MOREOREQUALS);
        assertEquals(expected, actual);
    }

    @Test
    void getApplesByCriteriaWeightLessThan90() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(GREEN, 50));
        expected.add(new Apple(YELLOW, 50));
        List<Apple> actual = fruitStorage.getApplesByCriteria(90, LESS);
        assertEquals(expected, actual);
    }

    @Test
    void getApplesByCriteriaWeightEquals200() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(RED, 200));
        expected.add(new Apple(GREEN, 200));
        List<Apple> actual = fruitStorage.getApplesByCriteria(200, EQUALS);
        assertEquals(expected, actual);
    }

    @Test
    void getApplesByCriteriaGreenApplesWithWeightMoreOrEquals150() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(GREEN, 200));
        List<Apple> actual = fruitStorage.getApplesByCriteria(GREEN, 150, MOREOREQUALS);
        assertEquals(expected, actual);
    }

    @Test
    void getAllApples() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(RED, 100));
        expected.add(new Apple(RED, 160));
        expected.add(new Apple(RED, 200));
        expected.add(new Apple(GREEN, 200));
        expected.add(new Apple(GREEN, 90));
        expected.add(new Apple(GREEN, 50));
        expected.add(new Apple(YELLOW, 50));
        expected.add(new Apple(YELLOW, 170));
        List<Apple> actual = fruitStorage.getAllApples();
        assertEquals(expected, actual);
    }
}