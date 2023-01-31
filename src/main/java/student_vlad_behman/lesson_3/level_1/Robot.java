/*
Создайте класс робот (Robot).

Научите вашего робота "говорить" привет.

Создайте в классе Robot метод со следующей сигнатурой:

    public void sayHello() {
        // тут напишите команду распечатки на консоли строки "Hello!"
    }

 */

package student_vlad_behman.lesson_3.level_1;

public class Robot {
    public static void main(String[] args) {

        sayHello("ALEX");
    }
    public static void  sayHello (String name) {
        System.out.println(" Hello " + name + " ! ");

    }
}


