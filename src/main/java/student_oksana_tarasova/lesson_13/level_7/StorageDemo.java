package student_oksana_tarasova.lesson_13.level_7;

import java.util.ArrayList;
import java.util.List;

public class StorageDemo {

    public static void main(String[] args) {
        File file = new File("FFFF.mp3", 5);
        File file1 = new File("RRRR.mp3", 1);
        File file2 = new File("HHH.mp3", 1);
        File file3 = new File("UJR.mp3", 1);
        File file4 = new File("KLLRR.mp3", 2);
        File file5 = new File("MMMR.mp3", 2);
        File file6 = new File("RdffR.mp3", 5);
        File file7 = new File("RtyyR.mp3", 5);
        File file8 = new File("RRtt", 5);
        File file9 = new File("RRfd", 2);
        File file10 = new File("TTTTR", 5);
        List<File> fileList = new ArrayList<>();
        List<File> fileList1 = new ArrayList<>();
        Directory directory = new Directory("Collection of files", fileList);
        directory.addFile(file1);
        directory.addFile(file2);
        directory.addFile(file3);
        System.out.println(directory.getTotalMP3());
        Directory directory1 = new Directory("Collection of files2", fileList1);
        directory1.addFile(file4);
        directory1.addFile(file5);
        directory1.addFile(file9);
        System.out.println(directory1.getTotalMP3());
        Resources resources = new Resources(file);
        Resources resources6 = new Resources(file6);
        Resources resources1 = new Resources(file8);
        Resources resources2 = new Resources(file7);
        Resources resources3 = new Resources(file10);
        Resources resources4 = new Resources(directory);
        Resources resources5 = new Resources(directory1);
        List<Resources> resourcesList = new ArrayList<>();
        Storage storage = new Storage(resourcesList);
        storage.addNewResources(resources);
        storage.addNewResources(resources6);
        storage.addNewResources(resources1);
        storage.addNewResources(resources2);
        storage.addNewResources(resources3);
        storage.addNewResources(resources4);
        storage.addNewResources(resources5);
        System.out.println(storage.toString());
        System.out.println(storage.rootDirectory());
        System.out.println(storage.totalSize());
        System.out.println(storage.totalMP3());
    }
}
