package student_oksana_tarasova.lesson_8.level_2;

class Child extends Mother {

    Mother obj1 = new Mother();
    Father obj2 = new Father();

    public Child(Mother obj1, Father obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
}
/*
вносить изменения можно только в объявление класса Child.
Класс Child должен явно наследоваться от одного или двух классов
(Mother и Father). Правильных решений у этой задачи два, выбирайте любое.
 */