package student_oksana_maksimova.lesson_3.level_5;

class Dog {

    String name;
    int age;
    String color;

     Dog(String dogName, int dogAge, String dogColor){
        this.name = dogName;
        this.age = dogAge;
        this.color = dogColor;
    }

    void name(){

         System.out.println("Name: " + this.name);
    }
    void voice(){
        System.out.println("Voice!  -  " + this.name + "! " + this.name + "! " + this.name + "! ");
        System.out.println("Color: " + this.color);
    }

    void age(){

         System.out.println("Age: " + this.age);
    }
    void happyBirthday() {
        this.age = this.age+1;
        System.out.println("Age: "+ this.age);
    }
    void changeColor(String newColor) {
        this.color = newColor;
        System.out.println("New color: " + this.color);
    }
}
