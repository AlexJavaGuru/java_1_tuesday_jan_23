package student_ilya_tihonov.lesson_3.level_5.Task_21;

public class Dog {

    String color;

    String name;

    int age;

    Dog(String dogColor , String dogName, int dogAge){
        this.color = dogColor;
        this.name = dogName;
        this.age = dogAge;
    }
    void voice(){
        System.out.println(color + name + age);}

}
