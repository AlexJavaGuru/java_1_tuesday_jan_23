package student_vladislav_romanov.lesson_3.level_5;

class Dog {

    String name;
    int age;
    String color;

    Dog(String dogsName) {
        this.name = dogsName;
    }

    Dog(String dogsName, int dogsAge) {
        this.name = dogsName;
        this.age = dogsAge;
    }

    Dog(String dogsName, int dogsAge, String dogsColor) {
        this.name = dogsName;
        this.age = dogsAge;
        this.color = dogsColor;
    }

    void voice() {
        System.out.println(this.name + " " + this.age + " " + this.color);
    }

    void happyBirthday() {
        this.age++;
    }

}
