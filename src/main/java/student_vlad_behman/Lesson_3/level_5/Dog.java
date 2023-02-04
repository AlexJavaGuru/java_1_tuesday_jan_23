package student_vlad_behman.Lesson_3.level_5;

public class Dog {

    public String name;
    public String color;
    public int age;

    public Dog (String name, String color, int age) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void voice(){
        System.out.println("CHAK CHAK CHAK");
    }

    public void happyBirthDay(){
        System.out.println(this.age + 1);
    }

    public void setColor(){
        System.out.println("BLACK");

    }
}
