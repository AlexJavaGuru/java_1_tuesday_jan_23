package student_andrejs_cekalins.lesson_13.level_7;


import java.util.Objects;

public class File {

    private String name;
    private int size;

    File(String name, int size) {
        this.name = name;
        this.size = size;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return "File{" +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return name.equals(file.name) && size == file.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }

}
