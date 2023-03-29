package student_oksana_tarasova.lesson_10.level_1;

import java.util.ArrayList;
import java.util.List;

public class Array {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        System.out.println(list.size());
// можно сразу задать значение длины ArrayList:
        List<String> list1 = new ArrayList<>(1);
        list.add("more");
        list.add("more");
        //может содержать дубликаты. Ответ на Task_4
        System.out.println(list.toString());

    }
}
/*
ArrayList — реализует интерфейс List.
В основе ArrayList лежит массив, который может менять свой размер во время исполнения программы,
при этом не обязательно указывать размерность при создании объекта.
Элементы ArrayList могут быть абсолютно любых типов в том числе и null.
Особенность работы:
- Быстрый доступ к элементам по индексу;
- Доступ к элементам по значению;
— Медленный, когда вставляются и удаляются элементы из «середины» списка,
принцип этой работы построен на создании нового массива и
 перекопирования данных из предыдущего массива в новый.

 */