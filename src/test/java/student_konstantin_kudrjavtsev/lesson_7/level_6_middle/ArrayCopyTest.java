package student_konstantin_kudrjavtsev.lesson_7.level_6_middle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayCopyTest {
    private ArrayCopy arrayCopy;

    @BeforeEach
    void setUp() {
        arrayCopy = new ArrayCopy();
    }

    @Test
    void testCopyInRange() {
        int[] in = {1, 2, 3, 4, 5};
        int[] expected = {2, 3, 4};
        int[] actual = arrayCopy.copyInRange(in, 2,4);
        assertArrayEquals(expected, actual);
    }

    
}