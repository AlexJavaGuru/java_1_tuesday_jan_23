package teacher.lesson_9_interfaces.lessoncode.boxexample;

public interface WareHouseService {

    boolean addNewItemIntoTheBox(Item item);

    default boolean addNewItemIntoTheBox(Item item, Box box) {
        System.out.println("Not supported");
        return false;
    }

    default void doSorting(Box box) {
        System.out.println("Not supported");
    }

}
