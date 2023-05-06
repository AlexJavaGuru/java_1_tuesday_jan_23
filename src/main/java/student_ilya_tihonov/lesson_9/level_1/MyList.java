package student_ilya_tihonov.lesson_9.level_1;

public interface MyList {

    // Получение размера списка
    int size();

    // Проверка списка на пустоту
    boolean isEmpty();

    // Добавление элемента в конец списка
    void add(Object element);

    // Получение элемента по индексу
    Object get(int index);

    // Замена элемента по индексу
    void set(int index, Object element);

    // Удаление элемента по индексу
    void remove(int index);

    // Очистка списка
    void clear();

    // Проверка наличия элемента в списке
    boolean contains(Object element);


}
