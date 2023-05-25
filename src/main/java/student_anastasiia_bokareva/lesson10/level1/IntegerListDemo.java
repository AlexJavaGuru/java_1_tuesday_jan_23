package student_anastasiia_bokareva.lesson10.level1;

import java.util.ArrayList;

public class IntegerListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(13);
        integerList.add(27);
        integerList.add(134);
        integerList.add(123);
        int size = integerList.size();
        integerList.remove(1);
        boolean isEmptyList = integerList.isEmpty();
        System.out.println(integerList);
    }
}

