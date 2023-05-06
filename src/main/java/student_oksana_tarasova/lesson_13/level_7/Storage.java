package student_oksana_tarasova.lesson_13.level_7;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private List<Resources> resourcesList;

    public Storage(List<Resources> resourcesList) {
        this.resourcesList = resourcesList;
    }

    public List<Resources> addNewResources(Resources resources) {
        resourcesList.add(resources);
        return resourcesList;
    }

    public List<Directory> rootDirectory() {
        List<Directory> directories = new ArrayList<>();
        for (Resources resources1 : resourcesList) {
            if (resources1.directory != null) {
                directories.add(resources1.directory);
            }
        }
        return directories;
    }

    public int totalSize() {
        int countSizeFiles = 0;
        int countSizeDirectories = 0;

        for (Resources resourcesList1 : resourcesList) {
            if (resourcesList1.file != null) {
                countSizeFiles += resourcesList1.file.getSize();
            }
            if (resourcesList1.directory != null) {
                countSizeDirectories += resourcesList1.directory.getSize();
            }
        }
        return countSizeFiles + countSizeDirectories;
    }

    public int totalMP3() {
        int countMP3File = 0;
        int countMP3Directory = 0;
        for (Resources resources1 : resourcesList) {
            if (resources1.file != null && resources1.file.getTitle().contains(".mp3")) {
                countMP3File++;
            } else if (resources1.directory != null) {
                countMP3Directory += resources1.directory.getTotalMP3();
            }
        }
        return countMP3File + countMP3Directory;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "resourcesList=" + resourcesList +
                '}';
    }
}
