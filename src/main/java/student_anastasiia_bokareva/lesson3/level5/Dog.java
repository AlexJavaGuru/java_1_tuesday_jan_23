package student_anastasiia_bokareva.lesson3.level5;

public class Dog {
    String name;
    int age;
    Dog (String dogName) {

        this.name = dogName;
    }

    Dog (int dogAge) {

        this.age = dogAge;
    }
   public void voice(){
       System.out.println(name+name+name);
   }
    void happyBirthday() {
        int newAge=age+1;
        System.out.println(newAge);
    }

}
