package student_natalja_semitseva.lesson_3_oop;

public class Robot {

    private String name;
    private int age;
    private boolean isHungry;

    public Robot(String robotName, int age, boolean isHungry){

        this.name = robotName;
        this.age = age;
        this.isHungry = isHungry;

    }
    public void robotName(){
        System.out.println("Peter");


    }

    public void sayHello(){
        System.out.println("Hello!");

    }
    public void sayYourName() {
        System.out.println("My name is Peter");



    }
    public void bark(){


    }

public void eat(){
        isHungry = false;
    System.out.println();

}
public void sleep(){
    System.out.println();

}

      public String getName() {
        return name;



      }

    }


