package student_vlad_behman.Lesson_3.level_5;

public class DogDemo {

    public static void main(String[] args) {

        Dog chaki = new Dog("Chaki","braun", 5);

        System.out.print("My name is: ");
        chaki.voice();

        System.out.println("My age is: " + chaki.age);
        System.out.println("My color is: " + chaki.color);

        System.out.print("Happy BD to me, my age is: ");
        chaki.happyBirthDay();

        System.out.print("My name is: ");
        chaki.voice();

        System.out.print("My age is: ");
        chaki.happyBirthDay();

        System.out.print("My color is: ");
        chaki.setColor();
    }

}
