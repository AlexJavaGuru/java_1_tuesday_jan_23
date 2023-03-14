package teacher.lesson_9_interfaces.lessoncode.boxexample;

import java.util.Random;

public class WareHouseServiceV2Impl implements WareHouseService {

    Item[] items = new Item[10];

    @Override
    public boolean addNewItemIntoTheBox(Item item) {
        int index = findNextPosition();
        System.out.println("Add item into the box faster");
        items[index] = item;
        return true;
    }

    @Override
    public boolean addNewItemIntoTheBox(Item item, Box box) {
        int index = findNextPosition();
        System.out.println("Add item into the box faster");
        items[index] = item;
        return true;
    }

    @Override
    public void doSorting(Box box) {
        System.out.println("Sorting box fast");
    }

    private int findNextPosition() {
        Random random = new Random();
        return random.nextInt(10);
    }
}
