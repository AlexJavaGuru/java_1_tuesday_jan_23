package student_ilya_tihonov.lesson_10.level_1.task_1;

// CopyOnWriteArrayList-потокобезопасная реализация, которая обеспечивает безопасное чтение данных из списка во время записи.

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {

    public static void main(String[] args) {

        CopyOnWriteArrayList<String> names = new CopyOnWriteArrayList<>();

        names.add("Kirill");
        names.add("Jo");
        names.add("Natasha");

        System.out.println(names);

        new Thread(() -> {
            names.set(0, "Alice");
            names.remove(2);
        }).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(names);

    }

}
