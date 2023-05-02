package student_andrejs_cekalins.lesson_13.level_7;

import java.util.ArrayList;
import java.util.List;


public class Directory extends Resource {
    private List<Resource> resourceList;

    Directory(String name, int size) {
        super(name, size);
        this.resourceList = new ArrayList<>();
    }

    public List<Resource> getResourceList() {
        return resourceList;
    }

    public void saveResource(Resource resource) {
        resourceList.add(resource);
    }

    public void deleteResource(Resource resource) {
        resourceList.remove(resource);
    }

}
