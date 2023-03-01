package student_anastasiia_bokareva.lesson3.level5;

public class Dog {
    String name;
    int age;
    String colour;

    Dog (String dogName, int dogAge, String colour) {

        this.name = dogName;
        this.age = dogAge;
        this.colour = colour;
    }
   public void voice(){
       System.out.println(name+name+name);
   }
    int age () {
        age++;
        return age;
    }
    public void newVoice(){
        System.out.println(name+" " + age+ " "+colour);
    }

}
