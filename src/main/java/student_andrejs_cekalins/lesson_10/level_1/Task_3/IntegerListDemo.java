package student_andrejs_cekalins.lesson_10.level_1.Task_3;

import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(0,1);
        integers.add(5);
        integers.size();
        System.out.println(integers.size());
        integers.remove(1);
        System.out.println(integers);

        Integer objectToBeDeleted =5;
        for (Integer integer : integers) {
            if(integer.equals(5)) {
                objectToBeDeleted =integer;
            }
        }
        integers.remove(objectToBeDeleted);
        System.out.println(integers);

        integers.isEmpty();
        System.out.println(integers.isEmpty());

        integers.forEach(System.out::println);
    }
}
