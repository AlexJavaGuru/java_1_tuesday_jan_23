package student_daniels_belejuns.lesson_3.level_5;

public class DogDemo {
    public static void main(String[]args){

        Dog sharik = new Dog("sharik", 2, "White");
        String sharikName = sharik.getName();
        System.out.println("nickname: " + sharikName);
        System.out.println("age: " + sharik.getAge());
        sharik.voice();
        sharik.happyBirthday();
        sharik.voice();
        sharik.setColor("Black");
        sharik.voice();
    }
}
