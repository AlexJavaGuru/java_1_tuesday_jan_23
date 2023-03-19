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

    void voice(int nameInTimes, String dogName) {

        if (nameInTimes > 0) {
            System.out.println("My name is,- " + dogName);
            voice(nameInTimes - 1, dogName);
        }
    }

    void age(int age) {
        System.out.println("I am " + age + " years old. \n");
    }


    void happyBirthday() {
        int newAge = age + 1;
        System.out.println("Happy birthday to me! My name is " + dogName + ", and I'm " + newAge + " years old!\n");

    }

  //  String[] color = new String[4];//{"Red", "Black", "Orange", "Green"};

    String changeColor(String newColor) {
        return newColor;

    }
}


