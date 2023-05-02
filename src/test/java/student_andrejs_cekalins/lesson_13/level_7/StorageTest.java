package student_andrejs_cekalins.lesson_13.level_7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StorageTest {
    private Storage storage;
    private Directory root;

    @BeforeEach
    void setUp() {
        root = new Directory("/", 0);
        storage = new Storage(root);
    }

    @Test
    void saveResource() {
        File picture = new File("Nature", "jpg", 15);
        root.saveResource(picture);
        File expected = new File("Nature", "jpg", 15);
        assertTrue(root.getResourceList().contains(expected));
    }

    @Test
    void deleteResource() {
        root = new Directory("Project", 10);
        root.deleteResource(new Directory("Project", 10));
        assertTrue(root.getResourceList().isEmpty());
    }

    @Test
    void totalSize() {
        Directory myDocuments = new Directory("My documents", 0);
        Directory myMusic = new Directory("My music", 0);
        File music = new File(" Hits", "mp3", 255);
        File picture = new File("Nature", "jpg", 15);
        root.saveResource(myDocuments);
        root.saveResource(myMusic);
        root.saveResource(music);
        root.saveResource(picture);
        int expected = 270;
        int actual = storage.totalSize();
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    void totalMP3Files() {
        Directory myDocuments = new Directory("My documents", 0);
        Directory myMusic = new Directory("My music", 0);
        File music1 = new File("Hits", "mp3", 255);
        File music2 = new File("New Hits", "mp3", 175);
        File picture = new File("Nature", "jpg", 15);
        root.saveResource(myDocuments);
        root.saveResource(myMusic);
        root.saveResource(music1);
        root.saveResource(music2);
        root.saveResource(picture);
        int expected = 2;
        int actual = storage.totalMP3();
        assertThat(expected).isEqualTo(actual);
    }
}
