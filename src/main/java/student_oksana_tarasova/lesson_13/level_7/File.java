package student_oksana_tarasova.lesson_13.level_7;

import java.util.Objects;

public class File {

    private String title;
    private int size;

    public File(String title, int size) {
        this.title = title;
        this.size = size;
    }

    public String getTitle() {
        return title;
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return size == file.size && Objects.equals(title, file.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, size);
    }

    @Override
    public String toString() {
        return "File{" +
                "title='" + title + '\'' +
                ", size=" + size +
                '}';
    }
}
