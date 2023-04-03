package student_andrejs_cekalins.lesson_8.level_3.Task_13;

abstract class Animal {
    public int legCount;
    public String name;

    public Animal(int legCount, String name) {
        this.legCount =legCount;
        this.name =name;
    }

    public  abstract void makeSound();

    public void run() {

    }
}
class Dog extends Animal {
    Dog(int legCount, String name) {
        super(legCount,name);

    }

    @Override
    public void makeSound() {

    }
    @Override
    public void run(){

    }
}
class Fox extends Animal {
    Fox(int legCount, String name) {
        super(legCount, name);
    }

    @Override
    public void makeSound() {

    }
}
