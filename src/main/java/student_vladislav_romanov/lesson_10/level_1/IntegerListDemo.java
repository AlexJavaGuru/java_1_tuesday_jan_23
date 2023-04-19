package student_vladislav_romanov.lesson_10.level_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class IntegerListDemo {

    List<Integer> integerList = new ArrayList<>();

    public static void main(String[] args) {
        IntegerListDemo integerListDemo = new IntegerListDemo();
        integerListDemo.integerList.add(7);
        integerListDemo.integerList.add(11);
        integerListDemo.integerList.add(0, 3);
        System.out.println(integerListDemo.integerList);

        System.out.println("List length is " + integerListDemo.listLength());

        integerListDemo.integerList.add(2, 5);
        Integer twentyTwo = 22;
        integerListDemo.integerList.add(22);
        integerListDemo.integerList.remove(twentyTwo);
        integerListDemo.integerList.remove(2);
        System.out.println(integerListDemo.integerList);

        System.out.println("List is empty? " + integerListDemo.integerList.isEmpty());

        for (Integer integer : integerListDemo.integerList) {
            System.out.println(integer);
        }
    }

    int listLength() {
        int length = 0;
        for (Integer integer : integerList) {
            length++;
        }
        return length;
    }

    @Override
    public String toString() {
        return "IntegerListDemo{" +
                "integerList=" + integerList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerListDemo that = (IntegerListDemo) o;
        return Objects.equals(integerList, that.integerList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integerList);
    }
}
