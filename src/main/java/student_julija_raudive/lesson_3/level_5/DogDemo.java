package student_julija_raudive.lesson_3.level_5;

public class DogDemo {

    public static void main(String[] args) {

        Dog rex = new Dog("Rex", 3, "black");
        rex.voice();
        rex.happyBirthday();
        rex.changeColor("brown");
        rex.voice();

        Dog mosjka = new Dog("Mosjka", 5, "white");
        mosjka.voice();
        mosjka.happyBirthday();
        mosjka.changeColor("pink");
        mosjka.voice();



    }
}
