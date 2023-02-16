package student_romualds_leitans.lesson_3.level_5;

public class Dog {
    String name;
    int age;
    String color;

    public Dog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;

    }
    public void voice(){
        for (int i = 0; i < 3; i++) {
            System.out.print(name + ",");
        }
    }
    public void happyBirthday(){
        System.out.print( "Happy Birthday:" + ( age + 1) + " age,");
    }
    public void changeColor(String newColor){
        this.color = newColor;
        System.out.print(" New calor:Red");
    }
}

