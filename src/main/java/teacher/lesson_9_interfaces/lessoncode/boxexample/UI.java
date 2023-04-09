package teacher.lesson_9_interfaces.lessoncode.boxexample;

public class UI {

    private WareHouseService service;

    public UI(WareHouseService service) {
        this.service = service;
    }

    public void addPackage(Item item) {
        service.addNewItemIntoTheBox(item);
    }

    public void sort(Box box) {
        service.doSorting(box);
    }
}
