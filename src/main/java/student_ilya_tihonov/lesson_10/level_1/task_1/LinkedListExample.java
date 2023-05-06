package student_ilya_tihonov.lesson_10.level_1.task_1;

//LinkedList-реализация на основе связанных списков, предназначенная для быстрого добавления и удаления элементов из списка.

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);

        numbers.addFirst(0);
        System.out.println(numbers);

        numbers.addLast(4);
        System.out.println(numbers);

        int firstNumber = numbers.getFirst();
        int lastNumber = numbers.getLast();
        System.out.println(firstNumber);
        System.out.println(lastNumber);

        numbers.removeFirst();
        numbers.removeLast();
        System.out.println(numbers);
    }

}
