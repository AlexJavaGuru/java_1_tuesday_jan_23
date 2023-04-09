package student_aleksandrs_lezhennikovs.lesson_9.level_3.task_6;

//Функциональный интерфейс — это интерфейс, который содержит только один абстрактный метод,
// то есть описание метода без тела.
//А если мы создаём новый функциональный интерфейс, то важно не забыть аннотацию @FunctionalInterface.

@FunctionalInterface
interface SomeFunctionalInterface {
        void printSomeThing();
    }

