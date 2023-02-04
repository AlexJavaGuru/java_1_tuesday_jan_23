package student_oksana_tarasova.lesson_3.level_5;

 class Dog {

    String name = "Tuzik";
    int age;
    String color;

    public Dog(int age, String color) {
        this.age = age;
        this.color = color;

    }

     void Voice() {

        System.out.println(name + "..." + name + "..." + name);
    }

     void Age() {
        System.out.println("Age: " + this.age);

    }

    void happyBirthday() {

        System.out.println( "My happy birthday: " + (age+1) + " years!");
    }

    void ColorDog() {

        System.out.println(color + " wool color");
    }


}
