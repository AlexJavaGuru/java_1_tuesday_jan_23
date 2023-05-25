package student_anastasiia_bokareva.lesson10.level3;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordFinderTest {

    @Test
    void checkUniqueWord(){
        UniqueWordFinder finder = new UniqueWordFinder();
        String text = "I love my cats";
        Set<String> real = finder.find(text);
        Set<String> expect = new HashSet<>();
        expect.add("ilovemycats");
        assertEquals(expect,real);

    }

}