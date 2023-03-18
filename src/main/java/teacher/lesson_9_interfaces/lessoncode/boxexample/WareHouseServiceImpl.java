package teacher.lesson_9_interfaces.lessoncode.boxexample;

import java.util.Random;

public class WareHouseServiceImpl implements WareHouseService {

    Item[] items = new Item[10];

    @Override
    public boolean addNewItemIntoTheBox(Item item) {
        Box box = new Box(new Item[10]);
        int index = findNextPosition();
        System.out.println("Add item into the box slowly");
        box.putItem(item);
        return true;
    }

    @Override
    public void doSorting(Box box) {
        System.out.println("Sorting box slowly");
    }

    private int findNextPosition() {
        Random random = new Random();
        return random.nextInt(10);
    }
}
