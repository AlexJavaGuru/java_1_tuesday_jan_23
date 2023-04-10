package student_anastasiia_bokareva.lesson9.level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        //  функциональный интерфейс Predicate для фильтрации четных чисел
        Predicate<Integer> evenPredicate = number -> number % 2 == 0;

        // фильтруем числа
        List<Integer> evenNumbers = filter(numbers, evenPredicate);

        System.out.println("Even numbers: " + evenNumbers);
    }

    // работа фильтра
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T element : list) {
            if (predicate.test(element)) {
                result.add(element);
            }
        }
        return result;
    }
}