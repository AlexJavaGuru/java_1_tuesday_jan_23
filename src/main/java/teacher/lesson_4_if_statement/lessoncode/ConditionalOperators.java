package teacher.lesson_4_if_statement.lessoncode;

import teacher.lesson_3_oop_first_look.lessoncode.Dog;

public class ConditionalOperators {

    public static void main(String[] args) {
        int y = 10;
        if (y > 5 && y < 15) {
            System.out.println("Y = " + y);
            System.out.println("Within bounds!");
        }

        if (y > 5 || y == 5) {
            System.out.println("Y is greater or equal 5");
        }

        Dog dog = new Dog("Tuzik", 10, false);
        //              true
        //     true     &&      true
        if (dog != null && dog.isHungry()) {
            System.out.println("Dog is hungry");
        }

        if (!dog.isHungry()) {
            System.out.println("Feed your dog already!");
        }
    }
}
