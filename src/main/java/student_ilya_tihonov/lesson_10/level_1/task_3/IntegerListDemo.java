package student_ilya_tihonov.lesson_10.level_1.task_3;

import java.util.LinkedList;


public class IntegerListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);

        System.out.println(numbers);

        numbers.offerLast(12);
        numbers.offerFirst(6);

        System.out.println(numbers);

        int length = numbers.size();
        System.out.println("list length: " + length);

        numbers.removeLast();
        System.out.println(numbers);

        if (numbers.isEmpty()){
            System.out.println("The list is empty");
        } else{
            System.out.println("List is not empty");
        }

        int i = 0;
        while (i < numbers.size()){
            System.out.println(numbers.get(i));
            i++;
        }
    }

}
