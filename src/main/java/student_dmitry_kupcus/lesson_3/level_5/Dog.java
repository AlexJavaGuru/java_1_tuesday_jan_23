package student_dmitry_kupcus.lesson_3.level_5;

class Dog {

    private static String name;
    private static int age;
    private static String color;

    Dog(String dogName, int dogAge, String dogColor) {
        name = dogName;
        age = dogAge;
        color = dogColor;
    }

    public static void voice() {
        System.out.println("My name is: " + name + " " + name + " " + name);
        System.out.println("My age is: " + age);
        System.out.println("My color is: " + color);
    }
    public static void age() {
        System.out.println("My age is: " + age);
    }
    public static void happyBirthday() {
        age++;
        System.out.println("Happy birthday, my age now is: " + age);
    }

    public void color() {
        System.out.println("My color is: " + color);
    }
    void changeColor() {
        color = "Black";
    }
}
