package student_aleksandrs_lezhennikovs.lesson_13.level_7;

class Storage {
    private Directory root;

    public Storage(Directory root) {
        this.root = root;
    }

    public Directory rootDirectory() {
        return new Directory("/", totalSize());
    }

    int totalSize() {
        return calculateDirectorySize(root);
    }

    int totalMP3() {
        return countMP3InDirectory(root);
    }

    private int calculateDirectorySize(Directory directory) {
        int size = 0;
        for (Resource resource : directory.getResources()) {
            if (resource instanceof File) {
                size += resource.getSize();
            } else if (resource instanceof Directory) {
                size += calculateDirectorySize((Directory) resource);
            }
        }
        return size;
    }

    private int countMP3InDirectory(Directory directory) {
        int count = 0;
        for (Resource resource : directory.getResources()) {
            if (resource instanceof File) {
                if (((File) resource).getExtension().equals("mp3")) {
                    count++;
                }
            } else if (resource instanceof Directory) {
                count += countMP3InDirectory((Directory) resource);
            }
        }
        return count;
    }
}
