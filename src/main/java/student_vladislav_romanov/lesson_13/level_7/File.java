package student_vladislav_romanov.lesson_13.level_7;

import java.util.Objects;

class File extends Resource {

    private int size;
    private String extension;

    File(String name, int size, String extension) {
        super(name + "." + extension);
        this.size = size;
        this.extension = extension;
    }

    public int getSize() {
        return size;
    }

    public String getExtension() {
        return extension;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return size == file.size && Objects.equals(extension, file.extension);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, extension);
    }

    @Override
    public String toString() {
        return "File{" +
                "name=" + this.getName() +
                ", size=" + size +
                ", extension='" + extension +
                "}";
    }
}
