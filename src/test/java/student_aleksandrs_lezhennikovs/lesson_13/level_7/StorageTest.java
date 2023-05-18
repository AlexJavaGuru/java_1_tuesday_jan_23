package student_aleksandrs_lezhennikovs.lesson_13.level_7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StorageTest {
    private Storage storage;
    private Directory root;

    @BeforeEach
    void setUp() {
        root = new Directory("/", 0);
        storage = new Storage(root);
    }

    @Test
    void testRoot() {
        root.addResources(new Directory("MyDocs", 0));
        Directory expect = new Directory("MyDocs", 0);
        assertTrue(root.getResources().contains(expect));
    }

    @Test
    void testFile() {
        root.addResources(new File("song", 10, "mp3"));
        File expect = new File("song", 10, "mp3");
        assertTrue(root.getResources().contains(expect));
    }

    @Test
    void testTotalSize() {
        Directory documents = new Directory("MyDocs", 0);
        Directory video = new Directory("MyMovies", 0);
        File videoFile = new File("Spiderman", 1000, "avi");
        File audioFile = new File("song", 50, "mp3");
        root.addResources(documents);
        root.addResources(video);
        root.addResources(videoFile);
        root.addResources(audioFile);
        int expect = 1050;
        int calculate = storage.totalSize();
        assertThat(expect).isEqualTo(calculate);
    }

    @Test
    void testCountMP3() {
        Directory documents = new Directory("MyDocs", 0);
        Directory video = new Directory("MyMovies", 0);
        File audioFile1 = new File("song1", 50, "mp3");
        File videoFile = new File("Spiderman", 1000, "avi");
        File audioFile2 = new File("song2", 55, "mp3");
        root.addResources(documents);
        root.addResources(video);
        root.addResources(videoFile);
        root.addResources(audioFile1);
        root.addResources(audioFile2);
        int calculate = storage.totalMP3();
        assertThat(2).isEqualTo(calculate);
    }

    @Test
    void testSubDirectorySize() {
        Directory documents = new Directory("MyDocs", 0);
        Directory video = new Directory("MyMovies", 0);
        Directory subDirActions = new Directory("Actions", 0);
        File audioFile1 = new File("song1", 50, "mp3");
        File videoFile1 = new File("Spiderman", 1000, "avi");
        File videoFile2 = new File("Leon killer", 500, "avi");
        File audioFile2 = new File("song2", 55, "mp3");
        root.addResources(documents);
        root.addResources(video);
        root.addResources(videoFile1);
        root.addResources(audioFile1);
        root.addResources(audioFile2);
        subDirActions.addResources(videoFile2);
        root.addResources(subDirActions);
        int calculate = storage.totalSize();
        assertThat(1605).isEqualTo(calculate);
    }
}