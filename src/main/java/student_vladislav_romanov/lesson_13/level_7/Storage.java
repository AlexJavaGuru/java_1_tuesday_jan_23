package student_vladislav_romanov.lesson_13.level_7;

import java.util.List;

class Storage {

    private Directory root;

    Storage() {
        root = new Directory("/");
    }

    public Directory rootDirectory() {
        return root;
    }

    public int totalSize() {
        return calculateDirectorySize(root);
    }

    public int totalMP3() {
        return countMP3Files(root);
    }

    private int calculateDirectorySize(Directory directory) {
        int size = 0;

        List<Resource> content = directory.getContent();

        for (Resource resource : content) {
            if (resource instanceof File file) {
                size += file.getSize();
            } else if (resource instanceof Directory folder) {
                size += calculateDirectorySize(folder);
            }
        }

        return size;
    }

    private int countMP3Files(Directory directory) {
        int counter = 0;

        List<Resource> content = directory.getContent();

        for (Resource resource : content) {
            if (resource instanceof File file) {
                if (file.getExtension().equals("mp3")) {
                    counter++;
                }
            } else if (resource instanceof Directory folder) {
                counter += countMP3Files(folder);
            }
        }

        return counter;
    }

}
