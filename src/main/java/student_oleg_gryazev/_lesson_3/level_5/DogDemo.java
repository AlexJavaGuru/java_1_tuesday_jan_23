package student_oleg_gryazev._lesson_3.level_5;

class DogDemo {
    public static void main(String[] args) {

        Dog dog = new Dog("Jack", 3);
        System.out.println("Hello! my name is " + dog.dogName + " and I am " + dog.age + " years old.\n");

        dog.voice(3, "Reks");
        dog.age(2);

        dog.voice(2, "Jack");
        dog.happyBirthday(1);
        dog.changeColor(3);

    }
}
