package student_konstantin_kudrjavtsev.lesson_7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordServiceTest {

    private WordService wordService;

    @BeforeEach
    void setUp() {
        wordService = new WordService();
    }

    @Test
    void testfindMostFrequentWord() {
    String expected = "java";
    String actual = wordService.findMostFrequentWord("java java java konstantin");
    assertEquals(expected, actual);

    }
}