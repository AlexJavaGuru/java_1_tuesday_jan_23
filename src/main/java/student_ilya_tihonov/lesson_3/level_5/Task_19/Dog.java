package student_ilya_tihonov.lesson_3.level_5.Task_19;

public class Dog {

    String name;

    int age;

    Dog(String dogName , int dogAge){
        this.name = dogName;
        this.age = dogAge;
    }

    void voice(){
        System.out.println(name + age);
    }

}
