package student_oksana_tarasova.lesson_2.level_senior;

public class SuperTask {

    public static void main(String[] args) {


// Создадим три набора слов для выбора
        String[] wordListOne = {"круглосуточный", "динамичный", "взаимный", "гармоничный"};
        String[] wordListTwo = {"сетевой", "фирменный", "ориентированный", "ускоренный"};
        String[] wordListThree = {"подход", "образец", "период времени", "фронтенд"};

        //Вычисляем сколько слов в каждом списке
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        /*
         Генерируем три случайных числа,
        чтобы число было целочисленное, используем приведение типов

         */

        int rand1 = (int) (Math.random()*oneLength);
        int rand2 = (int) (Math.random()*twoLength);
        int rand3 = (int) (Math.random()*threeLength);

        // теперь строим фразу
        String phrase = (wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3]);

        //Выводим фразу на экран
        System.out.println("Все, что нам нужно - это " + phrase);
    }
}
