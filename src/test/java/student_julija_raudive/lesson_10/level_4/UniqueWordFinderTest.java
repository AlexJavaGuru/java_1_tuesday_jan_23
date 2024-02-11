package student_julija_raudive.lesson_10.level_4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordFinderTest {

    @Test
    void testFind() {
        UniqueWordFinder wordFinder = new UniqueWordFinder();
        String text = "The pessimist sees difficulty in every opportunity. The optimist sees opportunity in every difficulty.";
        Set<String> result = wordFinder.find(text);
        Set<String> expected = new HashSet<>(Arrays.asList("The", "pessimist", "sees", "difficulty", "in", "every", "opportunity", "optimist"));
        assertEquals(expected, result);

    }
}