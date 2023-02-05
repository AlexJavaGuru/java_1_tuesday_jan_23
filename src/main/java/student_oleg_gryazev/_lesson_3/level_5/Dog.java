package student_oleg_gryazev._lesson_3.level_5;

class Dog {
    String dogName;

    int age;

    Dog(String name, int age) {
        this.dogName = name;
        this.age = age;
    }

    void voice(int n) {
        if (n > 0) {
            System.out.println("My name is,- " + dogName + ". " + "I'am " + age + " years old. And I'm " + color[0]);
            voice(n - 1);
        }
    }

    void bark() {
        System.out.println("Gav gav gav My name is " + dogName + ".");
    }

    void happyBirthday(int todayAge) {
        todayAge += age;
        System.out.println("Happy birthday to me! My name is " + dogName + ", and I'm " + todayAge + " years old!");

    }

    String[] color = {"Red", "Black", "Orange"};

    String[] changeColor(int i) {
        System.out.println("I'am " + color[i] + " now .");
        return color.clone();
    }
}


