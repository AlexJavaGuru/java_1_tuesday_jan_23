package student_oksana_tarasova.lesson_10.level_1;

import java.util.*;

class Linked {

    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        System.out.println(list.size());
        list.add("pen");
        list.add("pencil");
        list.add("book");
        System.out.println(list.size());
        System.out.println(list.toString());
        List<Integer> listInt = new LinkedList<>();
        listInt.add(5);
        listInt.add(7);
        listInt.add(10);
        listInt.add(10);//допустимы дублирующие значения. Ответ на Task_4
        System.out.println(listInt.size());
        System.out.println(listInt.toString());
        List<Box> list2 = new LinkedList<>();
        list2.add(0, new Box("Lada"));
        list2.add(1, new Box("Kiwi"));
        list2.add(2, new Box("Kiwi"));
        System.out.println(list2.size());
        System.out.println(list2.toString());

    }

    @Override
    public String toString() {
        return "Linked{}";
    }
}

/*
LinkedList — реализует интерфейс List. Является представителем двунаправленного списка,
 где каждый элемент структуры содержит указатели на предыдущий и следующий элементы.
 Итератор поддерживает обход в обе стороны. Реализует методы получения, удаления и
  вставки в начало, середину и конец списка. Приимтивные типы данных хранятся в классах-обертках.
  Позволяет добавлять любые элементы в том числе и null.
Только что созданный объект list, содержит свойства header и size.
header — псевдо-элемент списка.
Его значение всегда равно null, a свойства next и prev всегда указывают
на первый и последний элемент списка соответственно.
Tак как на данный момент список еще пуст, свойства next
и prev указывают сами на себя (т.е. на элемент header).
Размер списка size равен 0.

 */