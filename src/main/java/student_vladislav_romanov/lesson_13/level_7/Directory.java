package student_vladislav_romanov.lesson_13.level_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Directory extends Resource {

    private List<Resource> content;

    Directory(String name) {
        super(name);
        this.content = new ArrayList<>();
    }

    public List<Resource> getContent() {
        return content;
    }

    void addContent(Resource content) {
        this.content.add(content);
    }

    void removeContent(Resource content) {
        this.content.remove(content);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directory directory = (Directory) o;
        return Objects.equals(content, directory.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }

    @Override
    public String toString() {
        return "Directory " + this.getName() + " {" +
                "content=" + content +
                "}";
    }
}
