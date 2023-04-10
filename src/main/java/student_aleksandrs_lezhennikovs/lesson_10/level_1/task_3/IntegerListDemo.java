package student_aleksandrs_lezhennikovs.lesson_10.level_1.task_3;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        boolean isEmptyList = integerList.isEmpty();
        printToConsole((ArrayList<Integer>) integerList);
        integerList.add(0, 777);
        printToConsole((ArrayList<Integer>) integerList);
        integerList.remove(1);
        printToConsole((ArrayList<Integer>) integerList);
        integerList.remove(Integer.valueOf(777));
        printToConsole((ArrayList<Integer>) integerList);
    }

    private static void printToConsole(ArrayList<Integer> arrayList) {
        System.out.println();
        System.out.println("List size is: " + arrayList.size());
        System.out.println("List is Empty: " + arrayList.isEmpty());
        System.out.println("Lists elements");
        for (Integer element : arrayList) {
            System.out.println(element);
        }
        System.out.println("-------------------------------");
    }
}
