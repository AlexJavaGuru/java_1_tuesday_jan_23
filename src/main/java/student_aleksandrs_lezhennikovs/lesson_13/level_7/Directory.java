package student_aleksandrs_lezhennikovs.lesson_13.level_7;

import java.util.ArrayList;
import java.util.List;

class Directory extends Resource {
    private List<Resource> resourcesList;

    public Directory(String name, int size) {
        super(name, size);
        this.resourcesList = new ArrayList<>();
    }

    public List<Resource> getResources() {
        return resourcesList;
    }

    public void addResources(Resource resource) {
        resourcesList.add(resource);
    }

    public void deleteResources(Resource resource) {
        resourcesList.remove(resource);
    }
}
