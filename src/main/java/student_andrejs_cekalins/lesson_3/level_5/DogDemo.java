package student_andrejs_cekalins.lesson_3.level_5;

class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("REX",10,"Red");

        String dogName = dog.getDogName();
        System.out.println("Dog name is: " +dogName);

        int dogAge = dog.getDogAge();
        System.out.print("Dog is: " +dogAge);
        System.out.println(" old");

        String dogColor = dog.getDogColor();
        System.out.println("Dog color is: " +dogColor);

        System.out.println();

// Task_20
        dog.voice();
        dog.happyBirthday();


        System.out.println();

// Task_22

        dog.voice();
        dog.changeColor("Green");
        System.out.println(dog.color);


    }

}
