package teacher.lesson_9_interfaces.lessoncode.boxexample;

public class Box {

    private Item[] items;

    public Box(Item[] items) {
        this.items = items;
    }

    public Box() {
    }

    public Item getItem(int id) {
        return items[id];
    }

    public void putItem(Item item) {

    }
}
