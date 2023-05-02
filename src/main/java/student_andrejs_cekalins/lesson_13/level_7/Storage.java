package student_andrejs_cekalins.lesson_13.level_7;

import java.util.List;

public class Storage {
    private Directory root;

    Storage(Directory root) {
        this.root = root;
    }

    Directory rootDirectory() {
        return new Directory("/", totalSize());
    }

    int totalSize() {
        return calculateDirectorySize(root);
    }

    int totalMP3() {
        return calculateMPFiles(root);
    }

    private int calculateDirectorySize(Directory directory) {
        int size = 0;
        for (Resource resource : directory.getResourceList()) {
            if (resource instanceof File) {
                size += resource.getSize();
            } else if (resource instanceof Directory) {
                size += calculateDirectorySize((Directory) resource);
            }
        }
        return size;
    }

    private int calculateMPFiles(Directory directory) {
        int count = 0;
        for (Resource resource : directory.getResourceList()) {
            if (resource instanceof File) {
                if (((File) resource).getExtension().equals("mp3")) {
                    count++;
                }
            } else if (resource instanceof Directory) {
                count += calculateMPFiles((Directory) resource);
            }
        }
        return count;
    }
}

