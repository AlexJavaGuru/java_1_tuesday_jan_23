package student_romualds_leitans.lesson_8.level_3;

abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    abstract void makeSound();

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

}
class Cat extends Animal{
    public Cat (String name, int age){
        super(name,age);
    }
    void makeSound(){
        System.out.println("Мяу");
    }
}
class  Dog extends Animal{
    public Dog (String name,int age){
        super(name,age);
    }
    void makeSound(){
        System.out.println("GAF");
    }
}
class Bird extends Animal{
    public Bird(String name,int age){
        super(name,age);
    }
    void makeSound(){
        System.out.println("Chik chirik");
}
}
class Main {
    public static void main(String[] args) {
        Animal cat  = new Cat("Maik",7);
        Animal dog  = new Dog("Lui",7);
        Animal bird  = new Bird("Tosa",7);

        cat.makeSound();
        dog.makeSound();
        bird.makeSound();
    }

}