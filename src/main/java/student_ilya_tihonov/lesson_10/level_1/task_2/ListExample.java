package student_ilya_tihonov.lesson_10.level_1.task_2;

//java.util.List может хранить только ссылки на объекты, но не примитивные типы данных напрямую.

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);

        int firstNumber = numbers.get(0);
        System.out.println(firstNumber);

        numbers.set(0, 8);

        System.out.println(numbers);

    }

}
