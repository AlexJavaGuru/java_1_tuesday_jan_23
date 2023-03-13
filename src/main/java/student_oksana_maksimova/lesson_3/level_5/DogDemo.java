package student_oksana_maksimova.lesson_3.level_5;

class DogDemo {

    public static void main(String[] args) {

        Dog rex = new Dog ("Rex",1, "White");
        rex.voice();

        Dog jack = new Dog ("Jack",3, "Brown");
        jack.name();
        jack.age();
        jack.voice();

        Dog rembo = new Dog ("Rembo",1,"Black");
        rembo.name();
        rembo.age();
        rembo.voice();
        rembo.happyBirthday();
        rembo.voice();

        Dog ralph = new Dog("Ralph",4,"Grey");
        ralph.name();
        ralph.voice();
        ralph.changeColor("Silver");
        ralph.voice();

    }
}
