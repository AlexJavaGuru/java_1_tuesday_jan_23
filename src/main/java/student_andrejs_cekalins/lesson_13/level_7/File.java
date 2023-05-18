package student_andrejs_cekalins.lesson_13.level_7;


import java.util.Objects;

public class File extends Resource {

    private String extension;

    File(String name, String extension, int size) {
        super(name, size);
        this.extension = extension;
    }


    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getExtension() {
        return this.extension;
    }


    @Override
    public String toString() {
        return "File{" +
                ", extension='" + extension + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return extension.equals(file.extension);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extension);
    }
}
