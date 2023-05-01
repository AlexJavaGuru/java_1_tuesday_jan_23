package student_oksana_tarasova.lesson_13.level_7;

import java.util.List;
import java.util.Objects;

public class Directory {

    private String title;
    private List<File> files;

    public Directory (String title, List<File> files) {
        this.title = title;
        this.files = files;
    }

    public String getTitle() {
        return title;
    }

    public List<File> getFiles() {
        return files;
    }


    public int getSize() {
        int countSize = 0;
        for (File file : files) {
            countSize += file.getSize();
        }
        return countSize;
    }


    public List<File> addFile(File file) {
        files.add(file);
        return files;
    }

    public List<File> deleteFile(File file) {
        for (File file1 : files) {
            if (file.getTitle().equals(file1.getTitle())) {
                files.remove(file1);
            }
        }
        return files;
    }

    public int getTotalMP3() {
        int countFileMP3 = 0;
        for (File file : files) {
            if (file.getTitle().contains(".mp3")) {
                countFileMP3++;
            }
        }
        return countFileMP3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directory directory = (Directory) o;
        return Objects.equals(title, directory.title) && Objects.equals(files, directory.files);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, files);
    }

    @Override
    public String toString() {
        return "Directory{" +
                "title='" + title + '\'' +
                ", files=" + files +
                '}';
    }
}
