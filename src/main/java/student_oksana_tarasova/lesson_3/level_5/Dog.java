package student_oksana_tarasova.lesson_3.level_5;

 class Dog {

    String name;
    int age;
    String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;

    }

     void voice() {

        System.out.println(name + "..." + name + "..." + name);
    }

     void age() {
        System.out.println("Age: " + this.age);

    }

    void happyBirthday() {

        System.out.println( "My happy birthday: " + (age+1) + " years!");
    }

    void color() {

        System.out.println(color + " wool color");
    }
     public void recoloring(String recolor){
         this.color = recolor;
         System.out.print(color + " wool");

     }


}
