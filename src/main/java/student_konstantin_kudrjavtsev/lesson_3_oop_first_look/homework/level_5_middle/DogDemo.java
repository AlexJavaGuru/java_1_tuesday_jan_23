package student_konstantin_kudrjavtsev.lesson_3_oop_first_look.homework.level_5_middle;

import javax.swing.*;

class DogDemo {
    public static void main(String[] args) {
        Dog rex = new Dog("Rex", "black" ,5);
        String rexName = rex.getName();
        String rexColor = rex.getColor();
        int rexAge = rex.getAge();
        rex.voice();
        System.out.println("Rex name: " + rexName + rexName + rexName);
        System.out.println("Rex age: " + rexAge);
        System.out.println("Rex color: " + rexColor );
        rex.happyBirthday();
        rex.voice();
        rex.age = rex.age + 1;
        System.out.println("Rex age: " + rex.age);
        rex.changeColor("red");
    }
}