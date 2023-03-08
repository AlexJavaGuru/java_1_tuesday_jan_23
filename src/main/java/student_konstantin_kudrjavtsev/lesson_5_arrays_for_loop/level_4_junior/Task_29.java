package student_konstantin_kudrjavtsev.lesson_5_arrays_for_loop.level_4_junior;

//Напишите программу, в которой:
  //      - создайте массив произвольной длины
    //    - заполните массив случайными числами
      //  - распечатайте на консоль все элементы массива
        //- найдите все чётные числа в массиве и выведети их на консоль.

import java.util.Random;

class Task_29 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arbitraryLength = new int[random.nextInt(15)];

        for (int i = 0; i < arbitraryLength.length; i++) {
            System.out.println("Arrays cell: " + i);
        }



    }
}