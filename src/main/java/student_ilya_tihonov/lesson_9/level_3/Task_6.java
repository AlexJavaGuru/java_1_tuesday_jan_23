package student_ilya_tihonov.lesson_9.level_3;

import java.util.function.Consumer;

public class Task_6 {

    public static void main(String[] args) {


        Consumer<String> printer = (s) -> System.out.println(s);
        printer.accept("Hello World!");

    }
}
//Функциональный интерфейс в Java - это интерфейс, который имеет
//только один абстрактный метод. Такой интерфейс используется для определения
//лямбда-выражений в Java.

