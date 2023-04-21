package student_oksana_tarasova.lesson_14.level_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FruitStorageTest {

    FruitStorage fruitStorage;


    public List<Apple> setUp() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));

        return apples;
    }

    @Test
    public void testGetGreenApples() {
        List<Apple> expected = List.of(
                new Apple("green", 200),
                new Apple("green", 90),
                new Apple("green", 50)
        );
        List<Apple> actual = fruitStorage.getAllApples();
        assertThat(expected).isEqualTo(actual);
    }

}