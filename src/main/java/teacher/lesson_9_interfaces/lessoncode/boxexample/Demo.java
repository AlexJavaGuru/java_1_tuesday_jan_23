package teacher.lesson_9_interfaces.lessoncode.boxexample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        WareHouseService wareHouseService = new WareHouseServiceImpl();
        UI userInterface = new UI(wareHouseService);
        userInterface.addPackage(new Item());
        userInterface.sort(new Box());
    }

}
