package student_oksana_tarasova.lesson_13.level_7;

import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StorageTest {

    Storage storage;

    @BeforeEach
    public void fillStorage() {
        List<File> fileList = List.of(
                new File("RRRR.mp3", 1),
                new File("HHH.mp3", 1),
                new File("UJR.mp3", 1)
        );
        List<File> fileList1 = List.of(
                new File("KLLRR.mp3", 2),
                new File("MMMR.mp3", 2),
                new File("RRfd", 2)
        );
        Directory directory = new Directory("Collection of files", fileList);
        Directory directory1 = new Directory("Collection of files2", fileList1);
        Resources resources4 = new Resources(directory);
        Resources resources5 = new Resources(directory1);
        Resources resources = new Resources(new File("FFFF.mp3", 5));
        Resources resources6 = new Resources(new File("RdffR.mp3", 5));
        Resources resources1 = new Resources(new File("RRtt", 5));
        Resources resources2 = new Resources(new File("RtyyR.mp3", 5));
        Resources resources3 = new Resources(new File("TTTTR", 5));
        List<Resources> resourcesList = new ArrayList<>();
        storage = new Storage(resourcesList);
        storage.addNewResources(resources);
        storage.addNewResources(resources6);
        storage.addNewResources(resources1);
        storage.addNewResources(resources2);
        storage.addNewResources(resources3);
        storage.addNewResources(resources4);
        storage.addNewResources(resources5);
    }

    @Test
    public void testRootDirectory() {
        List<File> fileList = List.of(
                new File("RRRR.mp3", 1),
                new File("HHH.mp3", 1),
                new File("UJR.mp3", 1)
        );
        List<Directory> actual = storage.rootDirectory();
        assertTrue(actual.contains(new Directory("Collection of files", fileList)), "rootDirectory");
    }

    @Test
    public void testTotalMp3() {
        int actual = storage.totalMP3();
        assertEquals(8, actual, "total mp3");
    }

    @Test
    public void testTotalSize() {
        int actual = storage.totalSize();
        assertEquals(34, actual);
    }
}