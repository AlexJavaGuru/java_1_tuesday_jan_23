package student_oleg_gryazev._lesson_3.level_5;

class Dog {
    String dogName;

    int age;

    Dog(String name, int age) {
        this.dogName = name;
        this.age = age;
    }

    public Dog() {

    }

    void voice(int n,String dogName) {

        if (n > 0) {
            System.out.println("My name is,- " + dogName );
            voice(n - 1,dogName);
        }
    }
    void age(int age){
        System.out.println("I am " + age + " years old. \n");
    }


    void happyBirthday(int newAge) {
        newAge = age + 1;
        System.out.println("Happy birthday to me! My name is " + dogName + ", and I'm " + newAge + " years old!\n");

    }

    String[] color = {"Red", "Black", "Orange","Green"};

    String[] changeColor(int i) {
        System.out.println("And I'am " + color[i] + " now.");
        return color.clone();
    }
}


