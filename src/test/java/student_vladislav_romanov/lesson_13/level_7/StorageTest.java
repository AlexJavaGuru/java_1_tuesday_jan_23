package student_vladislav_romanov.lesson_13.level_7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StorageTest {

    private Storage storage;

    @BeforeEach
    void setUp() {
        storage = new Storage();
    }

    @Test
    void rootDirectory() {
        Directory expected = new Directory("/");
        Directory actual = storage.rootDirectory();
        assertEquals(expected, actual);
    }

    @Test
    void totalSize() {
        Directory video = new Directory("Video");
        Directory music = new Directory("Music");
        Directory ericJohnson = new Directory("Eric Johnson");

        File ringtone = new File("ringtone", 20, "mp3");
        File manhattan = new File("05 Eric Johnson - Manhattan", 5060, "mp3");
        File desertRose = new File("Eric Johnson - 03 Desert rose", 4757, "mp3");

        storage.rootDirectory().addContent(video);
        storage.rootDirectory().addContent(music);
        music.addContent(ericJohnson);
        music.addContent(ringtone);
        ericJohnson.addContent(manhattan);
        ericJohnson.addContent(desertRose);

        int expected = 9837;
        int actual = storage.totalSize();
        assertEquals(expected, actual);
    }

    @Test
    void totalMP3() {
        Directory video = new Directory("Video");
        Directory music = new Directory("Music");
        Directory ericJohnson = new Directory("Eric Johnson");
        Directory myDocuments = new Directory("My Documents");

        File ringtone = new File("ringtone", 20, "mp3");
        File battery = new File("Metallica - Battery", 1650, "mp3");
        File masterOfPuppets = new File("Metallica - Master of puppets", 2300, "mp3");
        File manhattan = new File("05 Eric Johnson - Manhattan", 5060, "mp3");
        File desertRose = new File("Eric Johnson - 03 Desert rose", 4757, "mp3");
        File theBalkanLine = new File("Балканский рубеж", 5760859, "m4v");
        File platoon = new File("Platoon", 3460512, "avi");
        File ohMyGod = new File("О мой Бог", 3845456, "mkv");

        storage.rootDirectory().addContent(video);
        storage.rootDirectory().addContent(music);
        storage.rootDirectory().addContent(myDocuments);
        video.addContent(theBalkanLine);
        video.addContent(platoon);
        video.addContent(ohMyGod);
        music.addContent(ericJohnson);
        music.addContent(ringtone);
        music.addContent(battery);
        music.addContent(masterOfPuppets);
        ericJohnson.addContent(manhattan);
        ericJohnson.addContent(desertRose);
        music.removeContent(ringtone);

        int expected = 4;
        int actual = storage.totalMP3();
        assertEquals(expected, actual);
    }

}