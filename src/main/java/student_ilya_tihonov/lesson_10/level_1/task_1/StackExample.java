package student_ilya_tihonov.lesson_10.level_1.task_1;

//Stack-Реализация, которая наследует Vector и представляет структуру данных типа стек.

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<String> colors = new Stack<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Pink");

        System.out.println(colors);

        String topColor = colors.peek();
        System.out.println(topColor);

        String removedColor = colors.pop();
        System.out.println(removedColor);

        boolean containsRed = colors.contains("Red");
        System.out.println(containsRed);

    }

}
