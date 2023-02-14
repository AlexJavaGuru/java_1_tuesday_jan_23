package student_ilya_tihonov.lesson_3.level_5.Task_20;

public class Dog {

    int age;

    int year = 1;

    Dog(int dogAge){
        this.age = dogAge;}

    void voice(){
        System.out.println("Woof woof");}

    void happyBirthDay(){
        System.out.println(age + year);
    }

}
