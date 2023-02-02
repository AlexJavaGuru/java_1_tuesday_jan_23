package student_vladislav_romanov.lesson_3.level_5;

class Dog {

    String name;
    int age;

    Dog(String dogsName) {
        this.name = dogsName;
    }

    Dog(String dogsName, int dogsAge) {
        this.name = dogsName;
        this.age = dogsAge;
    }

    void voice() {
        System.out.println(this.name + " " + this.age);
    }

}
