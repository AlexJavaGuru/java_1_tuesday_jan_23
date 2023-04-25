package student_andrejs_cekalins.lesson_13.level_7;


import java.util.*;

public class DirectoryImpl implements Directory {
    private String directoryName;
    Set<File> filesDirectory = new HashSet<>();

    DirectoryImpl(String directoryName) {
        this.directoryName = directoryName;

    }

    public void setName(String directoryName) {
        this.directoryName = directoryName;
    }

    public String getName() {
        return directoryName;
    }


    @Override
    public boolean save(File file) {
        return filesDirectory.add(file);
    }

    @Override
    public boolean delete(File file) {
        Optional<File> findFile = findFile(file);
        if (findFile.isPresent()) {
            filesDirectory.remove(file);
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "DirectoryImpl{" +
                ", directoryName=" + directoryName +
                ", filesDirectory=" + filesDirectory +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DirectoryImpl that = (DirectoryImpl) o;
        return directoryName.equals(that.directoryName) && filesDirectory.equals(that.filesDirectory);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(filesDirectory);
    }

    private Optional<File> findFile(File file) {
        for (File files : filesDirectory) {
            Optional<File> findFile = Optional.ofNullable(files);
            if (findFile.isPresent()) {
                if (files.equals(file)) {
                    return findFile;
                }
            }
        }
        return Optional.empty();
    }
}
