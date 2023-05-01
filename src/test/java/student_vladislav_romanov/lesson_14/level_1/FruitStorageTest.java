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
    void getGreenApples() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(Color.GREEN, 200));
        expected.add(new Apple(Color.GREEN, 90));
        expected.add(new Apple(Color.GREEN, 50));
        List<Apple> actual = fruitStorage.getGreenApples();
        assertEquals(expected, actual);
    }

    @Test
    void getRedApples() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(Color.RED, 100));
        expected.add(new Apple(Color.RED, 160));
        expected.add(new Apple(Color.RED, 200));
        List<Apple> actual = fruitStorage.getRedApples();
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