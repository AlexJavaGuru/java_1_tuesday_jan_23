package teacher.lesson_13_junit.lessoncode.multilayer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

class DataBaseImplTest {

    DataBaseImpl dataBase;

    @BeforeEach
    void setUp() {
        List<Integer> emptyDb = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        dataBase = new DataBaseImpl(emptyDb);
    }

    @Test
    void testSave() {
        int sizeBefore = dataBase.getAllItems().size();
        dataBase.save(10);
        dataBase.save(120);
        List<Integer> allItemsAfter = dataBase.getAllItems();
        assertThat(allItemsAfter).hasSize(sizeBefore + 2);
        assertThat(allItemsAfter).contains(10);
        assertThat(allItemsAfter).contains(120);
    }

    @Test
    void testReadItemFound() {
        dataBase.save(100);
        Optional<Integer> read = dataBase.read(100);
        assertThat(read).isPresent();
    }

    @Test
    void testReadItemNotFound() {
        Optional<Integer> read = dataBase.read(10000000);
        assertThat(read).isNotPresent();
    }
}