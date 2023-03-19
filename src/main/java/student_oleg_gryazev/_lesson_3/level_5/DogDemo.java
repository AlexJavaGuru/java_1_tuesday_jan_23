package student_oleg_gryazev._lesson_3.level_5;

import java.util.Arrays;

class DogDemo {
    public static void main(String[] args) {
        DogDemo dogDemo = new  DogDemo();

        Dog dog = new Dog("Jack", 3);
        System.out.println("Hello! my name is " + dog.dogName + " and I am " + dog.age + " years old.\n");

        dog.voice(3, "Reks");
        dog.age(2);

        dog.voice(2, "Jack");
        dog.happyBirthday();
        dogDemo.color();
    }
    Dog  dog = new Dog();

    void color() {
        String[] color = {"Red", "Black", "Orange", "Green"};

        int i;
        for (i = 0; i < color.length-1; i++)
            dog.changeColor(color[i]);
        System.out.println("And I'm " + color[i] + " now");
    }
}
