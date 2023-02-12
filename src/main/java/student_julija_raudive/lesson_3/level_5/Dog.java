package student_julija_raudive.lesson_3.level_5;



    class Dog {

    private String name;
    int age;
    String color;

    Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;

    }

    void voice(){
        System.out.println("My name is " + name + ". My age is " + age + " and I am " + color + ".");
    }

    void happyBirthday() {
        age++;
        System.out.println("Happy birthday, " + name + "!");

    }

    void changeColor(String newColor) {
        color = newColor;
    }
}
