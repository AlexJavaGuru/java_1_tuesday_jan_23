package student_oksana_tarasova.lesson_6.level_5;

import java.util.Scanner;

class Move {
    private int x;
    private int y;

    Move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    int getX() {
        return this.x;
    }

    int getY() {
        return this.y;
    }



}
    /* и конструктором, который принимает два целых числа
- координаты клетки в которую хочет походить игрок
и get методами для этих свойств.

В классе TicTacToe создайте метод:

    public Move getNextMove() {
         // запросите у пользователя с консоли две координаты
         // клетки куда хочет походить игрок
         // создайте экземпляр класса Move и передайте ему
         // в конструктор введённые пользователем координаты
         // верните созданный объект Move из метода.
*/