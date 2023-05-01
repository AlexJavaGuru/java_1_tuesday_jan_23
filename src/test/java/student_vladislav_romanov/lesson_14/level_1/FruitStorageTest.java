package student_vladislav_romanov.lesson_14.level_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FruitStorageTest {

    FruitStorage fruitStorage;

    @BeforeEach
    void setUp() {
        fruitStorage = new FruitStorage();
    }

    @Test
    void getApplesByCriteriaRedApples() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(Color.RED, 100));
        expected.add(new Apple(Color.RED, 160));
        expected.add(new Apple(Color.RED, 200));
        List<Apple> actual = fruitStorage.getApplesByCriteria(Color.RED);
        assertEquals(expected, actual);
    }

    @Test
    void getApplesByCriteriaYellowApples() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(Color.YELLOW, 50));
        expected.add(new Apple(Color.YELLOW, 170));
        List<Apple> actual = fruitStorage.getApplesByCriteria(Color.YELLOW);
        assertEquals(expected, actual);
    }

    @Test
    void getApplesByCriteriaWeightMoreOrEquals150() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(Color.RED, 160));
        expected.add(new Apple(Color.RED, 200));
        expected.add(new Apple(Color.GREEN, 200));
        expected.add(new Apple(Color.YELLOW, 170));
        List<Apple> actual = fruitStorage.getApplesByCriteria(150, Operation.MOREOREQUALS);
        assertEquals(expected, actual);
    }

    @Test
    void getApplesByCriteriaWeightLessThan90() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(Color.GREEN, 50));
        expected.add(new Apple(Color.YELLOW, 50));
        List<Apple> actual = fruitStorage.getApplesByCriteria(90, Operation.LESS);
        assertEquals(expected, actual);
    }

    @Test
    void getApplesByCriteriaWeightEquals200() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(Color.RED, 200));
        expected.add(new Apple(Color.GREEN, 200));
        List<Apple> actual = fruitStorage.getApplesByCriteria(200, Operation.EQUALS);
        assertEquals(expected, actual);
    }

    @Test
    void getApplesByCriteriaGreenApplesWithWeightMoreOrEquals150() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(Color.GREEN, 200));
        List<Apple> actual = fruitStorage.getApplesByCriteria(Color.GREEN, 150, Operation.MOREOREQUALS);
        assertEquals(expected, actual);
    }

    @Test
    void getAllApples() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(Color.RED, 100));
        expected.add(new Apple(Color.RED, 160));
        expected.add(new Apple(Color.RED, 200));
        expected.add(new Apple(Color.GREEN, 200));
        expected.add(new Apple(Color.GREEN, 90));
        expected.add(new Apple(Color.GREEN, 50));
        expected.add(new Apple(Color.YELLOW, 50));
        expected.add(new Apple(Color.YELLOW, 170));
        List<Apple> actual = fruitStorage.getAllApples();
        assertEquals(expected, actual);
    }
}